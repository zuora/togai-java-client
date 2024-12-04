# EventManagementApi

All URIs are relative to *https://api.togai.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**eventCorrection**](EventManagementApi.md#eventCorrection) | **POST** /events/correction | Correct an ingested event |
| [**getEvents**](EventManagementApi.md#getEvents) | **GET** /events | Get a list of usage events with multiple query options |
| [**getSingleEvent**](EventManagementApi.md#getSingleEvent) | **GET** /events/{event_id} | Get an event using event id |


<a id="eventCorrection"></a>
# **eventCorrection**
> EventsCorrectionResponse eventCorrection(action, requireConfirmation, eventCorrectionRequest)

Correct an ingested event

#### This API lets you to correct events. Available in both synchronous and asynchronous mode - **Usages**: Reduction of all usages associated with this event - **Revenue**: Reduction of all revenues associated with this event - **Entitlements**: Entitlements(Feature Credits) consumed by this event are granted back to the account.  ### Possible Actions: - UNDO: Undo all usages, revenue and entitlements associated with an event - REDO: Performs UNDO and re-ingests the same event - REDO_EVENT: Performs UNDO and re-ingests the correction payload of the event 

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.EventManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EventManagementApi apiInstance = new EventManagementApi(defaultClient);
    String action = "UNDO"; // String | Action to perform in event correction
    Boolean requireConfirmation = false; // Boolean | Specifies whether to start a migration only after a confirmation
    EventCorrectionRequest eventCorrectionRequest = new EventCorrectionRequest(); // EventCorrectionRequest | 
    try {
      EventsCorrectionResponse result = apiInstance.eventCorrection(action, requireConfirmation, eventCorrectionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventManagementApi#eventCorrection");
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
| **action** | **String**| Action to perform in event correction | [enum: UNDO, REDO, REDO_EVENT] |
| **requireConfirmation** | **Boolean**| Specifies whether to start a migration only after a confirmation | [optional] |
| **eventCorrectionRequest** | [**EventCorrectionRequest**](EventCorrectionRequest.md)|  | [optional] |

### Return type

[**EventsCorrectionResponse**](EventsCorrectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success response |  -  |
| **400** | Bad request. Please check the response message for failure details. |  -  |
| **401** | Credential is not valid. Please check the response message for failure details. |  -  |
| **403** | Credential does not have access to get events. |  -  |
| **429** | Request throttled. Please check the response message on the failure details. |  -  |
| **0** | Error response |  -  |

<a id="getEvents"></a>
# **getEvents**
> GetEventsResponse getEvents(nextToken, status, accountId, schemaName, pageSize)

Get a list of usage events with multiple query options

This API let’s you to fetch a list of events with multiple query parameters

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.EventManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EventManagementApi apiInstance = new EventManagementApi(defaultClient);
    String nextToken = "eyJsYXN0SXRlbUlkIjogInN0cmluZyIsICJwYWdlU2l6ZSI6IDEyMywgInNvcnRPcmRlciI6ICJhc2MifQ=="; // String | Pagination token used as a marker to get records from next page.
    String status = "PROCESSED"; // String | Filter option to filter by status.
    String accountId = "1234"; // String | Filter option to filter based on account id.
    String schemaName = "Rides"; // String | Filter option to filter the events based on schema name.
    Integer pageSize = 10; // Integer | Maximum page size expected by client to return the record list.    NOTE: Max page size cannot be more than 50. Also 50 is the default page size if no value is provided.
    try {
      GetEventsResponse result = apiInstance.getEvents(nextToken, status, accountId, schemaName, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventManagementApi#getEvents");
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
| **nextToken** | **String**| Pagination token used as a marker to get records from next page. | [optional] |
| **status** | **String**| Filter option to filter by status. | [optional] |
| **accountId** | **String**| Filter option to filter based on account id. | [optional] |
| **schemaName** | **String**| Filter option to filter the events based on schema name. | [optional] |
| **pageSize** | **Integer**| Maximum page size expected by client to return the record list.    NOTE: Max page size cannot be more than 50. Also 50 is the default page size if no value is provided. | [optional] |

### Return type

[**GetEventsResponse**](GetEventsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success response |  -  |
| **400** | Bad request. Please check the response message for failure details. |  -  |
| **401** | Credential is not valid. Please check the response message for failure details. |  -  |
| **403** | Credential does not have access to list events. |  -  |
| **422** | Unable to process the query parameters provided. Please check our docs for the api limits - https://togai.io/docs/limits. |  -  |
| **429** | Request throttled. Please check the response message on the failure details. |  -  |
| **0** | Error response |  -  |

<a id="getSingleEvent"></a>
# **getSingleEvent**
> GetEventResponse getSingleEvent(eventId)

Get an event using event id

Fetch details of a particular event using the event ID.

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.EventManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EventManagementApi apiInstance = new EventManagementApi(defaultClient);
    String eventId = "f4a52f2d-b798-4e08-8b24-db0a5a468ba3"; // String | 
    try {
      GetEventResponse result = apiInstance.getSingleEvent(eventId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventManagementApi#getSingleEvent");
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
| **eventId** | **String**|  | |

### Return type

[**GetEventResponse**](GetEventResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success response |  -  |
| **400** | Bad request. Please check the response message for failure details. |  -  |
| **401** | Credential is not valid. Please check the response message for failure details. |  -  |
| **403** | Credential does not have access to get events. |  -  |
| **429** | Request throttled. Please check the response message on the failure details. |  -  |
| **0** | Error response |  -  |

