# CustomerPortalApi

All URIs are relative to *https://api.togai.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCustomerPortalDelegateToken**](CustomerPortalApi.md#getCustomerPortalDelegateToken) | **POST** /portal/token | Get delegate token for customer portal |


<a id="getCustomerPortalDelegateToken"></a>
# **getCustomerPortalDelegateToken**
> TokenResponse getCustomerPortalDelegateToken(getCustomerPortalDelegateTokenRequest)

Get delegate token for customer portal

Get delegate token for customer portal

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.CustomerPortalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CustomerPortalApi apiInstance = new CustomerPortalApi(defaultClient);
    GetCustomerPortalDelegateTokenRequest getCustomerPortalDelegateTokenRequest = new GetCustomerPortalDelegateTokenRequest(); // GetCustomerPortalDelegateTokenRequest | Payload to get delegate token for customer portal
    try {
      TokenResponse result = apiInstance.getCustomerPortalDelegateToken(getCustomerPortalDelegateTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerPortalApi#getCustomerPortalDelegateToken");
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
| **getCustomerPortalDelegateTokenRequest** | [**GetCustomerPortalDelegateTokenRequest**](GetCustomerPortalDelegateTokenRequest.md)| Payload to get delegate token for customer portal | |

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
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

