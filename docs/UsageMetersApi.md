# UsageMetersApi

All URIs are relative to *https://sandbox-api.togai.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateUsageMeter**](UsageMetersApi.md#activateUsageMeter) | **POST** /event_schema/{event_schema_name}/usage_meters/{usage_meter_name}/activate | Activate usage meter |
| [**createUsageMeter**](UsageMetersApi.md#createUsageMeter) | **POST** /event_schema/{event_schema_name}/usage_meters | Create an usage meter |
| [**deactivateUsageMeter**](UsageMetersApi.md#deactivateUsageMeter) | **POST** /event_schema/{event_schema_name}/usage_meters/{usage_meter_name}/deactivate | Deactivate usage meter |
| [**deleteUsageMeter**](UsageMetersApi.md#deleteUsageMeter) | **DELETE** /usage_meter/{usage_meter_name} | Delete an Usage Meter |
| [**getUsageMeter**](UsageMetersApi.md#getUsageMeter) | **GET** /event_schema/{event_schema_name}/usage_meters/{usage_meter_name} | Get usage meter |
| [**getUsageMetersForEventSchema**](UsageMetersApi.md#getUsageMetersForEventSchema) | **GET** /event_schema/{event_schema_name}/usage_meters | List usage meters for event schema |
| [**updateUsageMeter**](UsageMetersApi.md#updateUsageMeter) | **PATCH** /event_schema/{event_schema_name}/usage_meters/{usage_meter_name} | Update an usage meter |


<a name="activateUsageMeter"></a>
# **activateUsageMeter**
> UsageMeter activateUsageMeter(eventSchemaName, usageMeterName)

Activate usage meter

Activate usage meter

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.UsageMetersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox-api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    UsageMetersApi apiInstance = new UsageMetersApi(defaultClient);
    String eventSchemaName = "eventSchemaName_example"; // String | 
    String usageMeterName = "usageMeterName_example"; // String | 
    try {
      UsageMeter result = apiInstance.activateUsageMeter(eventSchemaName, usageMeterName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageMetersApi#activateUsageMeter");
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
| **eventSchemaName** | **String**|  | |
| **usageMeterName** | **String**|  | |

### Return type

[**UsageMeter**](UsageMeter.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for Create and Get usage event requests |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a name="createUsageMeter"></a>
# **createUsageMeter**
> UsageMeter createUsageMeter(eventSchemaName, createUsageMeterRequest)

Create an usage meter

Create an usage meter

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.UsageMetersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox-api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    UsageMetersApi apiInstance = new UsageMetersApi(defaultClient);
    String eventSchemaName = "eventSchemaName_example"; // String | 
    CreateUsageMeterRequest createUsageMeterRequest = new CreateUsageMeterRequest(); // CreateUsageMeterRequest | Payload to create usage meter
    try {
      UsageMeter result = apiInstance.createUsageMeter(eventSchemaName, createUsageMeterRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageMetersApi#createUsageMeter");
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
| **eventSchemaName** | **String**|  | |
| **createUsageMeterRequest** | [**CreateUsageMeterRequest**](CreateUsageMeterRequest.md)| Payload to create usage meter | |

### Return type

[**UsageMeter**](UsageMeter.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response for Create and Get usage event requests |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a name="deactivateUsageMeter"></a>
# **deactivateUsageMeter**
> UsageMeter deactivateUsageMeter(eventSchemaName, usageMeterName)

Deactivate usage meter

Deactivate usage meter

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.UsageMetersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox-api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    UsageMetersApi apiInstance = new UsageMetersApi(defaultClient);
    String eventSchemaName = "eventSchemaName_example"; // String | 
    String usageMeterName = "usageMeterName_example"; // String | 
    try {
      UsageMeter result = apiInstance.deactivateUsageMeter(eventSchemaName, usageMeterName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageMetersApi#deactivateUsageMeter");
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
| **eventSchemaName** | **String**|  | |
| **usageMeterName** | **String**|  | |

### Return type

[**UsageMeter**](UsageMeter.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for Create and Get usage event requests |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a name="deleteUsageMeter"></a>
# **deleteUsageMeter**
> BaseSuccessResponse deleteUsageMeter(usageMeterName)

Delete an Usage Meter

Delete an Usage Meter

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.UsageMetersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox-api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    UsageMetersApi apiInstance = new UsageMetersApi(defaultClient);
    String usageMeterName = "usageMeterName_example"; // String | 
    try {
      BaseSuccessResponse result = apiInstance.deleteUsageMeter(usageMeterName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageMetersApi#deleteUsageMeter");
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
| **usageMeterName** | **String**|  | |

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

<a name="getUsageMeter"></a>
# **getUsageMeter**
> UsageMeter getUsageMeter(eventSchemaName, usageMeterName)

Get usage meter

Get usage meter

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.UsageMetersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox-api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    UsageMetersApi apiInstance = new UsageMetersApi(defaultClient);
    String eventSchemaName = "eventSchemaName_example"; // String | 
    String usageMeterName = "usageMeterName_example"; // String | 
    try {
      UsageMeter result = apiInstance.getUsageMeter(eventSchemaName, usageMeterName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageMetersApi#getUsageMeter");
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
| **eventSchemaName** | **String**|  | |
| **usageMeterName** | **String**|  | |

### Return type

[**UsageMeter**](UsageMeter.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for Create and Get usage event requests |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a name="getUsageMetersForEventSchema"></a>
# **getUsageMetersForEventSchema**
> UsageMeterPaginatedResponse getUsageMetersForEventSchema(eventSchemaName, statuses, aggregations, nextToken, pageSize, sortOrder)

List usage meters for event schema

List usage meters for event schema with pagination and sort

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.UsageMetersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox-api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    UsageMetersApi apiInstance = new UsageMetersApi(defaultClient);
    String eventSchemaName = "eventSchemaName_example"; // String | 
    String statuses = "statuses_example"; // String | Filter by provided statuses
    String aggregations = "aggregations_example"; // String | Filter by provided aggregations
    String nextToken = "eyJsYXN0SXRlbUlkIjogInN0cmluZyIsICJwYWdlU2l6ZSI6IDEyMywgInNvcnRPcmRlciI6ICJhc2MifQ=="; // String | 
    String pageSize = "10"; // String | 
    String sortOrder = "ASC"; // String | 
    try {
      UsageMeterPaginatedResponse result = apiInstance.getUsageMetersForEventSchema(eventSchemaName, statuses, aggregations, nextToken, pageSize, sortOrder);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageMetersApi#getUsageMetersForEventSchema");
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
| **eventSchemaName** | **String**|  | |
| **statuses** | **String**| Filter by provided statuses | [optional] |
| **aggregations** | **String**| Filter by provided aggregations | [optional] |
| **nextToken** | **String**|  | [optional] |
| **pageSize** | **String**|  | [optional] |
| **sortOrder** | **String**|  | [optional] [enum: ASC, DESC] |

### Return type

[**UsageMeterPaginatedResponse**](UsageMeterPaginatedResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for list usage_meters request |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a name="updateUsageMeter"></a>
# **updateUsageMeter**
> UsageMeter updateUsageMeter(eventSchemaName, usageMeterName, updateUsageMeterRequest)

Update an usage meter

Update an usage meter

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.UsageMetersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox-api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    UsageMetersApi apiInstance = new UsageMetersApi(defaultClient);
    String eventSchemaName = "eventSchemaName_example"; // String | 
    String usageMeterName = "usageMeterName_example"; // String | 
    UpdateUsageMeterRequest updateUsageMeterRequest = new UpdateUsageMeterRequest(); // UpdateUsageMeterRequest | Payload to create usage meter
    try {
      UsageMeter result = apiInstance.updateUsageMeter(eventSchemaName, usageMeterName, updateUsageMeterRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageMetersApi#updateUsageMeter");
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
| **eventSchemaName** | **String**|  | |
| **usageMeterName** | **String**|  | |
| **updateUsageMeterRequest** | [**UpdateUsageMeterRequest**](UpdateUsageMeterRequest.md)| Payload to create usage meter | |

### Return type

[**UsageMeter**](UsageMeter.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for Create and Get usage event requests |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

