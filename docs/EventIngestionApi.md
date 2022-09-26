# EventIngestionApi

All URIs are relative to *https://sandbox-api.togai.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ingest**](EventIngestionApi.md#ingest) | **POST** ingest | Ingest events to Togai |
| [**ingestBatch**](EventIngestionApi.md#ingestBatch) | **POST** ingestBatch | Ingest events to Togai in batch |



## ingest

> ingest(ingestEventRequest)

Ingest events to Togai

API to ingest your application event to Togai for billing and usage analytics. To know the limits on the ingestion api, check our docs - https://togai.com/docs/limits.

### Example

```java
// Import classes:
import com.togai.core.service.client.ApiClient;
import com.togai.core.service.client.ApiException;
import com.togai.core.service.client.Configuration;
import com.togai.core.service.client.auth.*;
import com.togai.core.service.client.models.*;
import com.togai.core.service.client.EventIngestionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox-api.togai.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        EventIngestionApi apiInstance = new EventIngestionApi(defaultClient);
        IngestEventRequest ingestEventRequest = new IngestEventRequest(); // IngestEventRequest | Request body to ingest events to Togai usage and billing management service.
        try {
            apiInstance.ingest(ingestEventRequest);
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

null (empty response body)

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


## ingestBatch

> IngestBatchEventResponse ingestBatch(ingestBatchEventRequest)

Ingest events to Togai in batch

API to ingest your application event in batch to Togai for billing and usage analytics. To know the limits on the ingestion api, check our docs - https://togai.com/docs/limits.

### Example

```java
// Import classes:
import com.togai.core.service.client.ApiClient;
import com.togai.core.service.client.ApiException;
import com.togai.core.service.client.Configuration;
import com.togai.core.service.client.auth.*;
import com.togai.core.service.client.models.*;
import com.togai.core.service.client.EventIngestionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox-api.togai.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        EventIngestionApi apiInstance = new EventIngestionApi(defaultClient);
        IngestBatchEventRequest ingestBatchEventRequest = new IngestBatchEventRequest(); // IngestBatchEventRequest | Request body to ingest events in batch to Togai usage and billing management service.
        try {
            IngestBatchEventResponse result = apiInstance.ingestBatch(ingestBatchEventRequest);
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

[**IngestBatchEventResponse**](IngestBatchEventResponse.md)

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

