# MetricsApi

All URIs are relative to *https://api.togai.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMetrics**](MetricsApi.md#getMetrics) | **POST** /metrics | Get Togai Metrics |


<a id="getMetrics"></a>
# **getMetrics**
> GetMetricsResponse getMetrics(getMetricsRequest)

Get Togai Metrics

Togai Metrics API allows you to fetch different metrics from Events, Usage Meters and PricePlans with multiple queryable options. A single request can query up to five metrics.  Single response can contain a maximum of 300 data points. 

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.MetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
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

