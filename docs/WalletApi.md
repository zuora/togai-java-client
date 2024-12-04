# WalletApi

All URIs are relative to *https://api.togai.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**topUpWalletForAccount**](WalletApi.md#topUpWalletForAccount) | **POST** /accounts/{account_id}/wallet_topup | Top-up wallet for an account |
| [**updateWalletForAccount**](WalletApi.md#updateWalletForAccount) | **PATCH** /accounts/{account_id}/wallet | Update wallet details for an account |
| [**walletBalanceForAccount**](WalletApi.md#walletBalanceForAccount) | **GET** /accounts/{account_id}/wallet | Wallet balance for Account |
| [**walletEntriesForAccount**](WalletApi.md#walletEntriesForAccount) | **GET** /accounts/{account_id}/wallet/entries | Wallet entries for Account |


<a id="topUpWalletForAccount"></a>
# **topUpWalletForAccount**
> WalletBalanceResponse topUpWalletForAccount(accountId, topupWalletRequest)

Top-up wallet for an account

Top-up wallet for an account

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.WalletApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    WalletApi apiInstance = new WalletApi(defaultClient);
    String accountId = "ACC00001"; // String | account_id corresponding to an account
    TopupWalletRequest topupWalletRequest = new TopupWalletRequest(); // TopupWalletRequest | Payload to topup wallet of an account
    try {
      WalletBalanceResponse result = apiInstance.topUpWalletForAccount(accountId, topupWalletRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletApi#topUpWalletForAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **String**| account_id corresponding to an account | |
| **topupWalletRequest** | [**TopupWalletRequest**](TopupWalletRequest.md)| Payload to topup wallet of an account | [optional] |

### Return type

[**WalletBalanceResponse**](WalletBalanceResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for Credit Balance Request |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a id="updateWalletForAccount"></a>
# **updateWalletForAccount**
> WalletBalanceResponse updateWalletForAccount(accountId, updateWalletRequest)

Update wallet details for an account

Update wallet details for an account

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.WalletApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    WalletApi apiInstance = new WalletApi(defaultClient);
    String accountId = "ACC00001"; // String | account_id corresponding to an account
    UpdateWalletRequest updateWalletRequest = new UpdateWalletRequest(); // UpdateWalletRequest | Payload to update wallet of an account
    try {
      WalletBalanceResponse result = apiInstance.updateWalletForAccount(accountId, updateWalletRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletApi#updateWalletForAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **String**| account_id corresponding to an account | |
| **updateWalletRequest** | [**UpdateWalletRequest**](UpdateWalletRequest.md)| Payload to update wallet of an account | [optional] |

### Return type

[**WalletBalanceResponse**](WalletBalanceResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for Credit Balance Request |  -  |
| **0** | Error response |  -  |

<a id="walletBalanceForAccount"></a>
# **walletBalanceForAccount**
> WalletBalanceResponse walletBalanceForAccount(accountId)

Wallet balance for Account

Wallet balance for Account

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.WalletApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    WalletApi apiInstance = new WalletApi(defaultClient);
    String accountId = "ACC00001"; // String | account_id corresponding to an account
    try {
      WalletBalanceResponse result = apiInstance.walletBalanceForAccount(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletApi#walletBalanceForAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **String**| account_id corresponding to an account | |

### Return type

[**WalletBalanceResponse**](WalletBalanceResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for Credit Balance Request |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a id="walletEntriesForAccount"></a>
# **walletEntriesForAccount**
> WalletEntriesPaginatedResponse walletEntriesForAccount(accountId, nextToken, pageSize)

Wallet entries for Account

Wallet entries for Account

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.WalletApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    WalletApi apiInstance = new WalletApi(defaultClient);
    String accountId = "ACC00001"; // String | account_id corresponding to an account
    String nextToken = "eyJsYXN0SXRlbUlkIjogInN0cmluZyIsICJwYWdlU2l6ZSI6IDEyMywgInNvcnRPcmRlciI6ICJhc2MifQ=="; // String | Pagination token used as a marker to get records from next page.
    Integer pageSize = 10; // Integer | Maximum page size expected by client to return the record list.    NOTE: Max page size cannot be more than 50. Also 50 is the default page size if no value is provided.
    try {
      WalletEntriesPaginatedResponse result = apiInstance.walletEntriesForAccount(accountId, nextToken, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletApi#walletEntriesForAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **String**| account_id corresponding to an account | |
| **nextToken** | **String**| Pagination token used as a marker to get records from next page. | [optional] |
| **pageSize** | **Integer**| Maximum page size expected by client to return the record list.    NOTE: Max page size cannot be more than 50. Also 50 is the default page size if no value is provided. | [optional] |

### Return type

[**WalletEntriesPaginatedResponse**](WalletEntriesPaginatedResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for Credit Balance Request |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

