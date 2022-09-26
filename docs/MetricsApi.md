# MetricsApi

All URIs are relative to *https://sandbox-api.togai.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMetrics**](MetricsApi.md#getMetrics) | **POST** metrics | Get togai metrics. |



## getMetrics

> GetMetricsResponse getMetrics(getMetricsRequest)

Get togai metrics.

To get the metrics, you make a POST request to the /metrics resource. You can query up to five metrics in a single request. Single response dataset can contain a maximum of 100 data points.

### Example

```java
// Import classes:
import com.togai.core.service.client.ApiClient;
import com.togai.core.service.client.ApiException;
import com.togai.core.service.client.Configuration;
import com.togai.core.service.client.auth.*;
import com.togai.core.service.client.models.*;
import com.togai.core.service.client.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox-api.togai.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        GetMetricsRequest getMetricsRequest = new GetMetricsRequest(); // GetMetricsRequest | 
        try {
            GetMetricsResponse result = apiInstance.getMetrics(getMetricsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#getMetrics");
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
| **getMetricsRequest** | [**GetMetricsRequest**](GetMetricsRequest.md)|  | [optional] |

### Return type

[**GetMetricsResponse**](GetMetricsResponse.md)

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
| **403** | Credential does not have access to get metrics. |  -  |
| **429** | Request throttled. Please check the response message on the failure details. |  -  |
| **0** | Error response |  -  |

