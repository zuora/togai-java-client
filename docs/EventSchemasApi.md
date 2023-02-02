# EventSchemasApi

All URIs are relative to *https://api.togai.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateEventSchema**](EventSchemasApi.md#activateEventSchema) | **POST** /event_schema/{event_schema_name}/activate | Activate an event schema |
| [**createEventSchema**](EventSchemasApi.md#createEventSchema) | **POST** /event_schema | Create an event schema |
| [**deactivateEventSchema**](EventSchemasApi.md#deactivateEventSchema) | **POST** /event_schema/{event_schema_name}/deactivate | Deactivate an event schema |
| [**deleteEventSchema**](EventSchemasApi.md#deleteEventSchema) | **DELETE** /event_schema/{event_schema_name} | Delete an event schema |
| [**eventSchemaEventSchemaNamePatch**](EventSchemasApi.md#eventSchemaEventSchemaNamePatch) | **PATCH** /event_schema/{event_schema_name} | Update an event schema |
| [**getEventSchema**](EventSchemasApi.md#getEventSchema) | **GET** /event_schema/{event_schema_name} | Get an event schema |
| [**listEventSchemaVersions**](EventSchemasApi.md#listEventSchemaVersions) | **GET** /event_schema/{event_schema_name}/versions | List all event schema versions |
| [**listEventSchemas**](EventSchemasApi.md#listEventSchemas) | **GET** /event_schema | List event schemas |


<a name="activateEventSchema"></a>
# **activateEventSchema**
> EventSchema activateEventSchema(eventSchemaName)

Activate an event schema

Activate an event schema

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.EventSchemasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EventSchemasApi apiInstance = new EventSchemasApi(defaultClient);
    String eventSchemaName = "eventSchemaName_example"; // String | 
    try {
      EventSchema result = apiInstance.activateEventSchema(eventSchemaName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventSchemasApi#activateEventSchema");
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

### Return type

[**EventSchema**](EventSchema.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for Create and Get event schema requests |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a name="createEventSchema"></a>
# **createEventSchema**
> EventSchema createEventSchema(createEventSchemaRequest)

Create an event schema

Create an event schema with attributes and dimensions to process events.

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.EventSchemasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EventSchemasApi apiInstance = new EventSchemasApi(defaultClient);
    CreateEventSchemaRequest createEventSchemaRequest = new CreateEventSchemaRequest(); // CreateEventSchemaRequest | Payload to create event schema
    try {
      EventSchema result = apiInstance.createEventSchema(createEventSchemaRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventSchemasApi#createEventSchema");
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
| **createEventSchemaRequest** | [**CreateEventSchemaRequest**](CreateEventSchemaRequest.md)| Payload to create event schema | |

### Return type

[**EventSchema**](EventSchema.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response for Create and Get event schema requests |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a name="deactivateEventSchema"></a>
# **deactivateEventSchema**
> EventSchema deactivateEventSchema(eventSchemaName)

Deactivate an event schema

You can deactivate an event schema using this API. In case you have an activate usage meter associated with the event schema, you will need to deactivate it first and then try deactivating the event schema. 

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.EventSchemasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EventSchemasApi apiInstance = new EventSchemasApi(defaultClient);
    String eventSchemaName = "eventSchemaName_example"; // String | 
    try {
      EventSchema result = apiInstance.deactivateEventSchema(eventSchemaName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventSchemasApi#deactivateEventSchema");
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

### Return type

[**EventSchema**](EventSchema.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for Create and Get event schema requests |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a name="deleteEventSchema"></a>
# **deleteEventSchema**
> BaseSuccessResponse deleteEventSchema(eventSchemaName)

Delete an event schema

To delete(archive) an event schema, you’re required to archive associated active usage meters if any.

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.EventSchemasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EventSchemasApi apiInstance = new EventSchemasApi(defaultClient);
    String eventSchemaName = "eventSchemaName_example"; // String | 
    try {
      BaseSuccessResponse result = apiInstance.deleteEventSchema(eventSchemaName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventSchemasApi#deleteEventSchema");
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

<a name="eventSchemaEventSchemaNamePatch"></a>
# **eventSchemaEventSchemaNamePatch**
> EventSchema eventSchemaEventSchemaNamePatch(eventSchemaName, updateEventSchemaRequest)

Update an event schema

Update an event schema and add new attributes and dimensions  Once an event schema is activated, you cannot update or delete existing attributes and dimensions however you can add new attributes and dimensions and update event schema description.     operationId: updateEventSchema 

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.EventSchemasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EventSchemasApi apiInstance = new EventSchemasApi(defaultClient);
    String eventSchemaName = "eventSchemaName_example"; // String | 
    UpdateEventSchemaRequest updateEventSchemaRequest = new UpdateEventSchemaRequest(); // UpdateEventSchemaRequest | Payload to update event schema
    try {
      EventSchema result = apiInstance.eventSchemaEventSchemaNamePatch(eventSchemaName, updateEventSchemaRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventSchemasApi#eventSchemaEventSchemaNamePatch");
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
| **updateEventSchemaRequest** | [**UpdateEventSchemaRequest**](UpdateEventSchemaRequest.md)| Payload to update event schema | |

### Return type

[**EventSchema**](EventSchema.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for Create and Get event schema requests |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a name="getEventSchema"></a>
# **getEventSchema**
> EventSchema getEventSchema(eventSchemaName, version)

Get an event schema

Get an event schema

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.EventSchemasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EventSchemasApi apiInstance = new EventSchemasApi(defaultClient);
    String eventSchemaName = "eventSchemaName_example"; // String | 
    Integer version = 56; // Integer | Optional version to get a specific version. Gets latest version if it is not provided.
    try {
      EventSchema result = apiInstance.getEventSchema(eventSchemaName, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventSchemasApi#getEventSchema");
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
| **version** | **Integer**| Optional version to get a specific version. Gets latest version if it is not provided. | [optional] |

### Return type

[**EventSchema**](EventSchema.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for Create and Get event schema requests |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a name="listEventSchemaVersions"></a>
# **listEventSchemaVersions**
> EventSchemaVersionsResponse listEventSchemaVersions(eventSchemaName)

List all event schema versions

Get a list of all the versions of an event schema

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.EventSchemasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EventSchemasApi apiInstance = new EventSchemasApi(defaultClient);
    String eventSchemaName = "eventSchemaName_example"; // String | 
    try {
      EventSchemaVersionsResponse result = apiInstance.listEventSchemaVersions(eventSchemaName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventSchemasApi#listEventSchemaVersions");
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

### Return type

[**EventSchemaVersionsResponse**](EventSchemaVersionsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for list event schema versions request |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a name="listEventSchemas"></a>
# **listEventSchemas**
> EventSchemaListPaginatedResponse listEventSchemas(statuses, nextToken, pageSize, sortOrder)

List event schemas

Returns a list of event schema with pagination and sort.

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.EventSchemasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EventSchemasApi apiInstance = new EventSchemasApi(defaultClient);
    String statuses = "statuses_example"; // String | Filter by provided statuses
    String nextToken = "eyJsYXN0SXRlbUlkIjogInN0cmluZyIsICJwYWdlU2l6ZSI6IDEwMCwgInNvcnRPcmRlciI6ICJhc2MifQ=="; // String | 
    BigDecimal pageSize = new BigDecimal("10"); // BigDecimal | 
    String sortOrder = "ASC"; // String | 
    try {
      EventSchemaListPaginatedResponse result = apiInstance.listEventSchemas(statuses, nextToken, pageSize, sortOrder);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventSchemasApi#listEventSchemas");
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
| **statuses** | **String**| Filter by provided statuses | [optional] |
| **nextToken** | **String**|  | [optional] |
| **pageSize** | **BigDecimal**|  | [optional] |
| **sortOrder** | **String**|  | [optional] [enum: ASC, DESC] |

### Return type

[**EventSchemaListPaginatedResponse**](EventSchemaListPaginatedResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for list events request |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

