# UsageMetersApi

All URIs are relative to *https://api.togai.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateUsageMeter**](UsageMetersApi.md#activateUsageMeter) | **POST** /event_schema/{event_schema_name}/usage_meters/{usage_meter_id}/activate | Activate usage meter |
| [**createUsageMeter**](UsageMetersApi.md#createUsageMeter) | **POST** /event_schema/{event_schema_name}/usage_meters | Create an usage meter |
| [**deactivateUsageMeter**](UsageMetersApi.md#deactivateUsageMeter) | **POST** /event_schema/{event_schema_name}/usage_meters/{usage_meter_id}/deactivate | Deactivate usage meter |
| [**getUsageMeter**](UsageMetersApi.md#getUsageMeter) | **GET** /event_schema/{event_schema_name}/usage_meters/{usage_meter_id} | Get usage meter |
| [**getUsageMetersForEventSchema**](UsageMetersApi.md#getUsageMetersForEventSchema) | **GET** /event_schema/{event_schema_name}/usage_meters | List usage meters for event schema |
| [**updateUsageMeter**](UsageMetersApi.md#updateUsageMeter) | **PATCH** /event_schema/{event_schema_name}/usage_meters/{usage_meter_id} | Update an usage meter |


<a name="activateUsageMeter"></a>
# **activateUsageMeter**
> UsageMeter activateUsageMeter(eventSchemaName, usageMeterId)

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
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    UsageMetersApi apiInstance = new UsageMetersApi(defaultClient);
    String eventSchemaName = "eventSchemaName_example"; // String | 
    String usageMeterId = "usageMeterId_example"; // String | 
    try {
      UsageMeter result = apiInstance.activateUsageMeter(eventSchemaName, usageMeterId);
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
| **usageMeterId** | **String**|  | |

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

Create an usage meter and associate with an event schema

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
    defaultClient.setBasePath("https://api.togai.com");
    
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
> UsageMeter deactivateUsageMeter(eventSchemaName, usageMeterId)

Deactivate usage meter

Make an existing active usage meter to be inactive Active Usage Meters with active Pricing Plan attached can also be deactivated. 

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
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    UsageMetersApi apiInstance = new UsageMetersApi(defaultClient);
    String eventSchemaName = "eventSchemaName_example"; // String | 
    String usageMeterId = "usageMeterId_example"; // String | 
    try {
      UsageMeter result = apiInstance.deactivateUsageMeter(eventSchemaName, usageMeterId);
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
| **usageMeterId** | **String**|  | |

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

<a name="getUsageMeter"></a>
# **getUsageMeter**
> UsageMeter getUsageMeter(eventSchemaName, usageMeterId)

Get usage meter

Get an usage meter using event schema name and usage meter id.

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
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    UsageMetersApi apiInstance = new UsageMetersApi(defaultClient);
    String eventSchemaName = "eventSchemaName_example"; // String | 
    String usageMeterId = "usageMeterId_example"; // String | 
    try {
      UsageMeter result = apiInstance.getUsageMeter(eventSchemaName, usageMeterId);
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
| **usageMeterId** | **String**|  | |

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
> UsageMeterPaginatedResponse getUsageMetersForEventSchema(eventSchemaName, status, aggregations, nextToken, pageSize)

List usage meters for event schema

Get a list of usage meters associated with an event schema

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
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    UsageMetersApi apiInstance = new UsageMetersApi(defaultClient);
    String eventSchemaName = "eventSchemaName_example"; // String | 
    String status = "ACTIVE"; // String | Filter by status 
    String aggregations = "COUNT"; // String | Filter by aggregations 
    String nextToken = "eyJsYXN0SXRlbUlkIjogInN0cmluZyIsICJwYWdlU2l6ZSI6IDEwMCwgInNvcnRPcmRlciI6ICJhc2MifQ=="; // String | 
    BigDecimal pageSize = new BigDecimal("10"); // BigDecimal | 
    try {
      UsageMeterPaginatedResponse result = apiInstance.getUsageMetersForEventSchema(eventSchemaName, status, aggregations, nextToken, pageSize);
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
| **status** | **String**| Filter by status  | [optional] [enum: ACTIVE, INACTIVE] |
| **aggregations** | **String**| Filter by aggregations  | [optional] [enum: COUNT, SUM] |
| **nextToken** | **String**|  | [optional] |
| **pageSize** | **BigDecimal**|  | [optional] |

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
> UsageMeter updateUsageMeter(eventSchemaName, usageMeterId, updateUsageMeterRequest)

Update an usage meter

This API lets you update an existing usage meter.

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
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    UsageMetersApi apiInstance = new UsageMetersApi(defaultClient);
    String eventSchemaName = "eventSchemaName_example"; // String | 
    String usageMeterId = "usageMeterId_example"; // String | 
    UpdateUsageMeterRequest updateUsageMeterRequest = new UpdateUsageMeterRequest(); // UpdateUsageMeterRequest | Payload to create usage meter
    try {
      UsageMeter result = apiInstance.updateUsageMeter(eventSchemaName, usageMeterId, updateUsageMeterRequest);
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
| **usageMeterId** | **String**|  | |
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

