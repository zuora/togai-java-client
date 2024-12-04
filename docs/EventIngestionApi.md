# EventIngestionApi

All URIs are relative to *https://api.togai.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ingest**](EventIngestionApi.md#ingest) | **POST** /ingest | Ingest events to Togai |
| [**ingestBatch**](EventIngestionApi.md#ingestBatch) | **POST** /ingestBatch | Ingest events to Togai in batch |


<a id="ingest"></a>
# **ingest**
> IngestEventResponse ingest(ingestEventRequest)

Ingest events to Togai

This API let’s you to ingest events to your Togai account. Events ingested using this API will be processed via associated usage meters and further via associated price plans to generate final billable value to invoice the customer Read more about [Event Ingestion](https://docs.togai.com/docs/event-ingestion) 

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.EventIngestionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EventIngestionApi apiInstance = new EventIngestionApi(defaultClient);
    IngestEventRequest ingestEventRequest = new IngestEventRequest(); // IngestEventRequest | Request body to ingest events to Togai usage and billing management service.
    try {
      IngestEventResponse result = apiInstance.ingest(ingestEventRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventIngestionApi#ingest");
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
| **ingestEventRequest** | [**IngestEventRequest**](IngestEventRequest.md)| Request body to ingest events to Togai usage and billing management service. | |

### Return type

[**IngestEventResponse**](IngestEventResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successfully accepted to process all the events from payload. |  -  |
| **400** | Bad request. Please check the response message for failure details. |  -  |
| **401** | Credential \&quot;x-api-key\&quot; is not valid. Please check the response message for failure details. |  -  |
| **422** | Unable to process the events as the size of the event payload is above the supported limit. Please check our docs for the api limits - https://togai.com/docs/limits. |  -  |
| **429** | Request throttled. Please check the response message on the failure details. |  -  |
| **503** | Service is currently unavailable to process the request. |  -  |
| **0** | Error response |  -  |

<a id="ingestBatch"></a>
# **ingestBatch**
> IngestEventResponse ingestBatch(ingestBatchEventRequest)

Ingest events to Togai in batch

This API let’s you to ingest events in batch upto 500 events. Ingest large amounts of events up to 500 in batches in an array using this API.

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.EventIngestionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EventIngestionApi apiInstance = new EventIngestionApi(defaultClient);
    IngestBatchEventRequest ingestBatchEventRequest = new IngestBatchEventRequest(); // IngestBatchEventRequest | Request body to ingest events in batch to Togai usage and billing management service.
    try {
      IngestEventResponse result = apiInstance.ingestBatch(ingestBatchEventRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventIngestionApi#ingestBatch");
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
| **ingestBatchEventRequest** | [**IngestBatchEventRequest**](IngestBatchEventRequest.md)| Request body to ingest events in batch to Togai usage and billing management service. | |

### Return type

[**IngestEventResponse**](IngestEventResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successfully accepted to process all the events from payload. |  -  |
| **207** | Partial failure. Few events from request were not accepted |  -  |
| **400** | Bad request. Please check the response message for failure details. |  -  |
| **401** | Credential \&quot;x-api-key\&quot; is not valid. Please check the response message for failure details. |  -  |
| **422** | Unable to process the events as the size of the event payload is above the supported limit. Please check our docs for the api limits - https://togai.com/docs/limits. |  -  |
| **429** | Request throttled. Please check the response message on the failure details. |  -  |
| **503** | Service is currently unavailable to process the request. |  -  |
| **0** | Error response |  -  |

