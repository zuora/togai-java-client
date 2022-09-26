# EventsApi

All URIs are relative to *https://sandbox-api.togai.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateEventSchema**](EventsApi.md#activateEventSchema) | **POST** event_schema/{event_schema_name}/activate | Activate an event schema |
| [**createEventSchema**](EventsApi.md#createEventSchema) | **POST** event_schema | Create an event schema |
| [**deactivateEventSchema**](EventsApi.md#deactivateEventSchema) | **POST** event_schema/{event_schema_name}/deactivate | Deactivate an event schema |
| [**deleteEventSchema**](EventsApi.md#deleteEventSchema) | **DELETE** event_schema/{event_schema_name} | Delete an event schema |
| [**getEventSchema**](EventsApi.md#getEventSchema) | **GET** event_schema/{event_schema_name} | Get an event schema |
| [**listEventSchemaVersions**](EventsApi.md#listEventSchemaVersions) | **GET** event_schema/{event_schema_name}/versions | List all event schema versions |
| [**listEventSchemas**](EventsApi.md#listEventSchemas) | **GET** event_schema | List event schemas |
| [**updateEventSchema**](EventsApi.md#updateEventSchema) | **PATCH** event_schema/{event_schema_name} | Update an event schema |



## activateEventSchema

> EventSchema activateEventSchema(eventSchemaName)

Activate an event schema

Activate an event schema

### Example

```java
// Import classes:
import com.togai.core.service.client.ApiClient;
import com.togai.core.service.client.ApiException;
import com.togai.core.service.client.Configuration;
import com.togai.core.service.client.auth.*;
import com.togai.core.service.client.models.*;
import com.togai.core.service.client.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox-api.togai.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        EventsApi apiInstance = new EventsApi(defaultClient);
        String eventSchemaName = "eventSchemaName_example"; // String | 
        try {
            EventSchema result = apiInstance.activateEventSchema(eventSchemaName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#activateEventSchema");
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


## createEventSchema

> EventSchema createEventSchema(createEventSchemaRequest)

Create an event schema

Create an event schema

### Example

```java
// Import classes:
import com.togai.core.service.client.ApiClient;
import com.togai.core.service.client.ApiException;
import com.togai.core.service.client.Configuration;
import com.togai.core.service.client.auth.*;
import com.togai.core.service.client.models.*;
import com.togai.core.service.client.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox-api.togai.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        EventsApi apiInstance = new EventsApi(defaultClient);
        CreateEventSchemaRequest createEventSchemaRequest = new CreateEventSchemaRequest(); // CreateEventSchemaRequest | Payload to create event schema
        try {
            EventSchema result = apiInstance.createEventSchema(createEventSchemaRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#createEventSchema");
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


## deactivateEventSchema

> EventSchema deactivateEventSchema(eventSchemaName)

Deactivate an event schema

Deactivate an event schema

### Example

```java
// Import classes:
import com.togai.core.service.client.ApiClient;
import com.togai.core.service.client.ApiException;
import com.togai.core.service.client.Configuration;
import com.togai.core.service.client.auth.*;
import com.togai.core.service.client.models.*;
import com.togai.core.service.client.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox-api.togai.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        EventsApi apiInstance = new EventsApi(defaultClient);
        String eventSchemaName = "eventSchemaName_example"; // String | 
        try {
            EventSchema result = apiInstance.deactivateEventSchema(eventSchemaName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#deactivateEventSchema");
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


## deleteEventSchema

> BaseSuccessResponse deleteEventSchema(eventSchemaName)

Delete an event schema

Delete an event schema

### Example

```java
// Import classes:
import com.togai.core.service.client.ApiClient;
import com.togai.core.service.client.ApiException;
import com.togai.core.service.client.Configuration;
import com.togai.core.service.client.auth.*;
import com.togai.core.service.client.models.*;
import com.togai.core.service.client.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox-api.togai.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        EventsApi apiInstance = new EventsApi(defaultClient);
        String eventSchemaName = "eventSchemaName_example"; // String | 
        try {
            BaseSuccessResponse result = apiInstance.deleteEventSchema(eventSchemaName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#deleteEventSchema");
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


## getEventSchema

> EventSchema getEventSchema(eventSchemaName, version)

Get an event schema

Get an event schema

### Example

```java
// Import classes:
import com.togai.core.service.client.ApiClient;
import com.togai.core.service.client.ApiException;
import com.togai.core.service.client.Configuration;
import com.togai.core.service.client.auth.*;
import com.togai.core.service.client.models.*;
import com.togai.core.service.client.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox-api.togai.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        EventsApi apiInstance = new EventsApi(defaultClient);
        String eventSchemaName = "eventSchemaName_example"; // String | 
        Integer version = 56; // Integer | Optional version to get a specific version. Gets latest version if it is not provided.
        try {
            EventSchema result = apiInstance.getEventSchema(eventSchemaName, version);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#getEventSchema");
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


## listEventSchemaVersions

> EventSchemaVersionsResponse listEventSchemaVersions(eventSchemaName)

List all event schema versions

List all event schema versions

### Example

```java
// Import classes:
import com.togai.core.service.client.ApiClient;
import com.togai.core.service.client.ApiException;
import com.togai.core.service.client.Configuration;
import com.togai.core.service.client.auth.*;
import com.togai.core.service.client.models.*;
import com.togai.core.service.client.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox-api.togai.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        EventsApi apiInstance = new EventsApi(defaultClient);
        String eventSchemaName = "eventSchemaName_example"; // String | 
        try {
            EventSchemaVersionsResponse result = apiInstance.listEventSchemaVersions(eventSchemaName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#listEventSchemaVersions");
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


## listEventSchemas

> EventSchemaListPaginatedResponse listEventSchemas(statuses, nextToken, pageSize, sortOrder)

List event schemas

List event schemas with pagination and sort

### Example

```java
// Import classes:
import com.togai.core.service.client.ApiClient;
import com.togai.core.service.client.ApiException;
import com.togai.core.service.client.Configuration;
import com.togai.core.service.client.auth.*;
import com.togai.core.service.client.models.*;
import com.togai.core.service.client.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox-api.togai.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        EventsApi apiInstance = new EventsApi(defaultClient);
        String statuses = "statuses_example"; // String | Filter by provided statuses
        String nextToken = "eyJsYXN0SXRlbUlkIjogInN0cmluZyIsICJwYWdlU2l6ZSI6IDEyMywgInNvcnRPcmRlciI6ICJhc2MifQ=="; // String | 
        String pageSize = "10"; // String | 
        String sortOrder = "ASC"; // String | 
        try {
            EventSchemaListPaginatedResponse result = apiInstance.listEventSchemas(statuses, nextToken, pageSize, sortOrder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#listEventSchemas");
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
| **pageSize** | **String**|  | [optional] |
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


## updateEventSchema

> EventSchema updateEventSchema(eventSchemaName, updateEventSchemaRequest)

Update an event schema

Update an event schema

### Example

```java
// Import classes:
import com.togai.core.service.client.ApiClient;
import com.togai.core.service.client.ApiException;
import com.togai.core.service.client.Configuration;
import com.togai.core.service.client.auth.*;
import com.togai.core.service.client.models.*;
import com.togai.core.service.client.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox-api.togai.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        EventsApi apiInstance = new EventsApi(defaultClient);
        String eventSchemaName = "eventSchemaName_example"; // String | 
        UpdateEventSchemaRequest updateEventSchemaRequest = new UpdateEventSchemaRequest(); // UpdateEventSchemaRequest | Payload to update event schema
        try {
            EventSchema result = apiInstance.updateEventSchema(eventSchemaName, updateEventSchemaRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#updateEventSchema");
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

