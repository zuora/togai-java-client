# AccountsApi

All URIs are relative to *https://sandbox-api.togai.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addAliases**](AccountsApi.md#addAliases) | **POST** /customers/{customer_id}/accounts/{account_id}/add_aliases | Add Aliases to account |
| [**associatePricePlan**](AccountsApi.md#associatePricePlan) | **POST** /customers/{customer_id}/accounts/{account_id}/price_plans | Associate a plan to an account |
| [**createAccount**](AccountsApi.md#createAccount) | **POST** /customers/{customer_id}/accounts | Create an account |
| [**deleteAccount**](AccountsApi.md#deleteAccount) | **DELETE** /customers/{customer_id}/accounts/{account_id} | Delete an account |
| [**getAccount**](AccountsApi.md#getAccount) | **GET** /customers/{customer_id}/accounts/{account_id} | Get an account |
| [**getAccounts**](AccountsApi.md#getAccounts) | **GET** /customers/{customer_id}/accounts | List accounts of customer |
| [**removeAliases**](AccountsApi.md#removeAliases) | **POST** /customers/{customer_id}/accounts/{account_id}/remove_aliases | Remove Aliases to account |
| [**updateAccount**](AccountsApi.md#updateAccount) | **PATCH** /customers/{customer_id}/accounts/{account_id} | Update an account |


<a name="addAliases"></a>
# **addAliases**
> Account addAliases(customerId, accountId, addAccountAliasesRequest)

Add Aliases to account

Add Aliases to an account by id

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox-api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    String customerId = "customerId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    AddAccountAliasesRequest addAccountAliasesRequest = new AddAccountAliasesRequest(); // AddAccountAliasesRequest | Payload to add aliases to account
    try {
      Account result = apiInstance.addAliases(customerId, accountId, addAccountAliasesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#addAliases");
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
| **customerId** | **String**|  | |
| **accountId** | **String**|  | |
| **addAccountAliasesRequest** | [**AddAccountAliasesRequest**](AddAccountAliasesRequest.md)| Payload to add aliases to account | |

### Return type

[**Account**](Account.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for Create and Get account requests |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a name="associatePricePlan"></a>
# **associatePricePlan**
> AssociatePricePlanResponse associatePricePlan(customerId, accountId, associatePricePlanRequest)

Associate a plan to an account

Associate a plan to an account

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox-api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    String customerId = "customerId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    AssociatePricePlanRequest associatePricePlanRequest = new AssociatePricePlanRequest(); // AssociatePricePlanRequest | Payload to associate a price plan to an account
    try {
      AssociatePricePlanResponse result = apiInstance.associatePricePlan(customerId, accountId, associatePricePlanRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#associatePricePlan");
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
| **customerId** | **String**|  | |
| **accountId** | **String**|  | |
| **associatePricePlanRequest** | [**AssociatePricePlanRequest**](AssociatePricePlanRequest.md)| Payload to associate a price plan to an account | |

### Return type

[**AssociatePricePlanResponse**](AssociatePricePlanResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for associate price plan request |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a name="createAccount"></a>
# **createAccount**
> Account createAccount(customerId, createAccountRequest)

Create an account

Create an account

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox-api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    String customerId = "customerId_example"; // String | 
    CreateAccountRequest createAccountRequest = new CreateAccountRequest(); // CreateAccountRequest | Payload to create account
    try {
      Account result = apiInstance.createAccount(customerId, createAccountRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#createAccount");
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
| **customerId** | **String**|  | |
| **createAccountRequest** | [**CreateAccountRequest**](CreateAccountRequest.md)| Payload to create account | |

### Return type

[**Account**](Account.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response for Create and Get account requests |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a name="deleteAccount"></a>
# **deleteAccount**
> BaseSuccessResponse deleteAccount(customerId, accountId)

Delete an account

Delete an account by id

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox-api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    String customerId = "customerId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      BaseSuccessResponse result = apiInstance.deleteAccount(customerId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#deleteAccount");
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
| **customerId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**BaseSuccessResponse**](BaseSuccessResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a name="getAccount"></a>
# **getAccount**
> Account getAccount(customerId, accountId)

Get an account

Get an account

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox-api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    String customerId = "customerId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    try {
      Account result = apiInstance.getAccount(customerId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getAccount");
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
| **customerId** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**Account**](Account.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for Create and Get account requests |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a name="getAccounts"></a>
# **getAccounts**
> AccountPaginatedResponse getAccounts(customerId, nextToken, pageSize)

List accounts of customer

List accounts with pagination and sort

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox-api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    String customerId = "customerId_example"; // String | 
    String nextToken = "eyJsYXN0SXRlbUlkIjogInN0cmluZyIsICJwYWdlU2l6ZSI6IDEyMywgInNvcnRPcmRlciI6ICJhc2MifQ=="; // String | 
    String pageSize = "10"; // String | 
    try {
      AccountPaginatedResponse result = apiInstance.getAccounts(customerId, nextToken, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getAccounts");
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
| **customerId** | **String**|  | |
| **nextToken** | **String**|  | [optional] |
| **pageSize** | **String**|  | [optional] |

### Return type

[**AccountPaginatedResponse**](AccountPaginatedResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for list customers request |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a name="removeAliases"></a>
# **removeAliases**
> Account removeAliases(customerId, accountId, removeAccountAliasesRequest)

Remove Aliases to account

Remove Aliases to an account by id

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox-api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    String customerId = "customerId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    RemoveAccountAliasesRequest removeAccountAliasesRequest = new RemoveAccountAliasesRequest(); // RemoveAccountAliasesRequest | Payload to remove aliases from account
    try {
      Account result = apiInstance.removeAliases(customerId, accountId, removeAccountAliasesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#removeAliases");
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
| **customerId** | **String**|  | |
| **accountId** | **String**|  | |
| **removeAccountAliasesRequest** | [**RemoveAccountAliasesRequest**](RemoveAccountAliasesRequest.md)| Payload to remove aliases from account | |

### Return type

[**Account**](Account.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for Create and Get account requests |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a name="updateAccount"></a>
# **updateAccount**
> Account updateAccount(customerId, accountId, updateAccountRequest)

Update an account

Update an account by id

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox-api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    String customerId = "customerId_example"; // String | 
    String accountId = "accountId_example"; // String | 
    UpdateAccountRequest updateAccountRequest = new UpdateAccountRequest(); // UpdateAccountRequest | Payload to update account
    try {
      Account result = apiInstance.updateAccount(customerId, accountId, updateAccountRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#updateAccount");
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
| **customerId** | **String**|  | |
| **accountId** | **String**|  | |
| **updateAccountRequest** | [**UpdateAccountRequest**](UpdateAccountRequest.md)| Payload to update account | |

### Return type

[**Account**](Account.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for Create and Get account requests |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

