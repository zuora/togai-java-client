# AliasesApi

All URIs are relative to *https://api.togai.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAlias**](AliasesApi.md#createAlias) | **POST** /aliases | Create an alias |
| [**deleteAlias**](AliasesApi.md#deleteAlias) | **DELETE** /aliases/{alias} | Delete an alias |
| [**getAlias**](AliasesApi.md#getAlias) | **GET** /aliases/{alias} | Get an alias |
| [**listAliases**](AliasesApi.md#listAliases) | **GET** /aliases | List all aliases |


<a id="createAlias"></a>
# **createAlias**
> AliasPaginatedResponse createAlias(createBulkAliasRequest)

Create an alias

This API let’s you to create an alias

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.AliasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AliasesApi apiInstance = new AliasesApi(defaultClient);
    CreateBulkAliasRequest createBulkAliasRequest = new CreateBulkAliasRequest(); // CreateBulkAliasRequest | Payload to create bulk aliases
    try {
      AliasPaginatedResponse result = apiInstance.createAlias(createBulkAliasRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AliasesApi#createAlias");
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
| **createBulkAliasRequest** | [**CreateBulkAliasRequest**](CreateBulkAliasRequest.md)| Payload to create bulk aliases | |

### Return type

[**AliasPaginatedResponse**](AliasPaginatedResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response for list aliases request |  -  |
| **0** | Error response |  -  |

<a id="deleteAlias"></a>
# **deleteAlias**
> BaseSuccessResponse deleteAlias(alias)

Delete an alias

This API let’s you to delete an alias using alias.

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.AliasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AliasesApi apiInstance = new AliasesApi(defaultClient);
    String alias = "custom_value"; // String | 
    try {
      BaseSuccessResponse result = apiInstance.deleteAlias(alias);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AliasesApi#deleteAlias");
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
| **alias** | **String**|  | |

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
| **0** | Error response |  -  |

<a id="getAlias"></a>
# **getAlias**
> Alias getAlias(alias)

Get an alias

Get alias information using alias.

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.AliasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AliasesApi apiInstance = new AliasesApi(defaultClient);
    String alias = "custom_value"; // String | 
    try {
      Alias result = apiInstance.getAlias(alias);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AliasesApi#getAlias");
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
| **alias** | **String**|  | |

### Return type

[**Alias**](Alias.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for adding or removing aliases |  -  |
| **0** | Error response |  -  |

<a id="listAliases"></a>
# **listAliases**
> AliasPaginatedResponse listAliases(nextToken, pageSize)

List all aliases

Returns a list of aliases with pagination and sort.

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.AliasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AliasesApi apiInstance = new AliasesApi(defaultClient);
    String nextToken = "eyJsYXN0SXRlbUlkIjogInN0cmluZyIsICJwYWdlU2l6ZSI6IDEwMCwgInNvcnRPcmRlciI6ICJhc2MifQ=="; // String | 
    BigDecimal pageSize = new BigDecimal("10"); // BigDecimal | 
    try {
      AliasPaginatedResponse result = apiInstance.listAliases(nextToken, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AliasesApi#listAliases");
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
| **nextToken** | **String**|  | [optional] |
| **pageSize** | **BigDecimal**|  | [optional] |

### Return type

[**AliasPaginatedResponse**](AliasPaginatedResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for list aliases request |  -  |
| **0** | Error response |  -  |

