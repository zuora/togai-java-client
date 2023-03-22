# MiscellaneousApi

All URIs are relative to *https://api.togai.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**calculateRevenue**](MiscellaneousApi.md#calculateRevenue) | **POST** /revenue_calculator | Calculate and return the revenue for a existing or new price plan |


<a name="calculateRevenue"></a>
# **calculateRevenue**
> CalculateRevenueResponse calculateRevenue(calculateRevenueRequest)

Calculate and return the revenue for a existing or new price plan

Calculate and return the revenue for a existing or new price plan

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.MiscellaneousApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    MiscellaneousApi apiInstance = new MiscellaneousApi(defaultClient);
    CalculateRevenueRequest calculateRevenueRequest = new CalculateRevenueRequest(); // CalculateRevenueRequest | Request payload for calculateRevenueAPI
    try {
      CalculateRevenueResponse result = apiInstance.calculateRevenue(calculateRevenueRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiscellaneousApi#calculateRevenue");
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

