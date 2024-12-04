# PriceExperimentationApi

All URIs are relative to *https://api.togai.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**calculateRevenue**](PriceExperimentationApi.md#calculateRevenue) | **POST** /revenue_calculator | (DEPRECATED) Calculate and return the revenue for a existing or new price plan |
| [**calculateRevenueV2**](PriceExperimentationApi.md#calculateRevenueV2) | **POST** /v2/revenue_calculator | Calculate and return the revenue for a existing or new price plan v2 |


<a id="calculateRevenue"></a>
# **calculateRevenue**
> CalculateRevenueResponse calculateRevenue(calculateRevenueRequest)

(DEPRECATED) Calculate and return the revenue for a existing or new price plan

Calculate and return the revenue for a existing or new price plan

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.PriceExperimentationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PriceExperimentationApi apiInstance = new PriceExperimentationApi(defaultClient);
    CalculateRevenueRequest calculateRevenueRequest = new CalculateRevenueRequest(); // CalculateRevenueRequest | Request payload for calculateRevenueAPI
    try {
      CalculateRevenueResponse result = apiInstance.calculateRevenue(calculateRevenueRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceExperimentationApi#calculateRevenue");
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
| **calculateRevenueRequest** | [**CalculateRevenueRequest**](CalculateRevenueRequest.md)| Request payload for calculateRevenueAPI | |

### Return type

[**CalculateRevenueResponse**](CalculateRevenueResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response payload for calculateRevenueAPI |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a id="calculateRevenueV2"></a>
# **calculateRevenueV2**
> CalculateRevenueResponseV2 calculateRevenueV2(calculateRevenueRequest)

Calculate and return the revenue for a existing or new price plan v2

Calculate and return the revenue for a existing or new price plan v2

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.PriceExperimentationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PriceExperimentationApi apiInstance = new PriceExperimentationApi(defaultClient);
    CalculateRevenueRequest calculateRevenueRequest = new CalculateRevenueRequest(); // CalculateRevenueRequest | Request payload for calculateRevenueAPI
    try {
      CalculateRevenueResponseV2 result = apiInstance.calculateRevenueV2(calculateRevenueRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceExperimentationApi#calculateRevenueV2");
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
| **calculateRevenueRequest** | [**CalculateRevenueRequest**](CalculateRevenueRequest.md)| Request payload for calculateRevenueAPI | |

### Return type

[**CalculateRevenueResponseV2**](CalculateRevenueResponseV2.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response payload for calculateRevenueAPI |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

