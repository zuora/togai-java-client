# PricePlansApi

All URIs are relative to *https://sandbox-api.togai.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activatePricePlan**](PricePlansApi.md#activatePricePlan) | **POST** /price_plans/{price_plan_name}/activate | Activate a price plan |
| [**createPricePlan**](PricePlansApi.md#createPricePlan) | **POST** /price_plans | Create a price plan |
| [**getPricePlan**](PricePlansApi.md#getPricePlan) | **GET** /price_plans/{price_plan_name} | Get a price plan |
| [**getPricePlans**](PricePlansApi.md#getPricePlans) | **GET** /price_plans | List price plans |
| [**updatePricePlan**](PricePlansApi.md#updatePricePlan) | **PATCH** /price_plans/{price_plan_name} | Update a price plan |


<a name="activatePricePlan"></a>
# **activatePricePlan**
> PricePlan activatePricePlan(pricePlanName)

Activate a price plan

Activate a price plan

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.PricePlansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox-api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PricePlansApi apiInstance = new PricePlansApi(defaultClient);
    String pricePlanName = "pricePlanName_example"; // String | 
    try {
      PricePlan result = apiInstance.activatePricePlan(pricePlanName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricePlansApi#activatePricePlan");
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
| **pricePlanName** | **String**|  | |

### Return type

[**PricePlan**](PricePlan.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for Create and Get price plan requests |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a name="createPricePlan"></a>
# **createPricePlan**
> PricePlan createPricePlan(createPricePlanRequest)

Create a price plan

Create a price plan

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.PricePlansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox-api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PricePlansApi apiInstance = new PricePlansApi(defaultClient);
    CreatePricePlanRequest createPricePlanRequest = new CreatePricePlanRequest(); // CreatePricePlanRequest | Payload to create price plan
    try {
      PricePlan result = apiInstance.createPricePlan(createPricePlanRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricePlansApi#createPricePlan");
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
| **createPricePlanRequest** | [**CreatePricePlanRequest**](CreatePricePlanRequest.md)| Payload to create price plan | |

### Return type

[**PricePlan**](PricePlan.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for Create and Get price plan requests |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a name="getPricePlan"></a>
# **getPricePlan**
> PricePlan getPricePlan(pricePlanName)

Get a price plan

Get a price plan

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.PricePlansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox-api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PricePlansApi apiInstance = new PricePlansApi(defaultClient);
    String pricePlanName = "pricePlanName_example"; // String | 
    try {
      PricePlan result = apiInstance.getPricePlan(pricePlanName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricePlansApi#getPricePlan");
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
| **pricePlanName** | **String**|  | |

### Return type

[**PricePlan**](PricePlan.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for Create and Get price plan requests |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a name="getPricePlans"></a>
# **getPricePlans**
> PricePlanPaginatedResponse getPricePlans(nextToken, pageSize)

List price plans

List price plans with pagination and sort

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.PricePlansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox-api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PricePlansApi apiInstance = new PricePlansApi(defaultClient);
    String nextToken = "eyJsYXN0SXRlbUlkIjogInN0cmluZyIsICJwYWdlU2l6ZSI6IDEyMywgInNvcnRPcmRlciI6ICJhc2MifQ=="; // String | 
    String pageSize = "10"; // String | 
    try {
      PricePlanPaginatedResponse result = apiInstance.getPricePlans(nextToken, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricePlansApi#getPricePlans");
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
| **nextToken** | **String**|  | [optional] |
| **pageSize** | **String**|  | [optional] |

### Return type

[**PricePlanPaginatedResponse**](PricePlanPaginatedResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for list price plans request |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a name="updatePricePlan"></a>
# **updatePricePlan**
> PricePlan updatePricePlan(pricePlanName, updatePricePlanRequest)

Update a price plan

Update a price plan

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.PricePlansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox-api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PricePlansApi apiInstance = new PricePlansApi(defaultClient);
    String pricePlanName = "pricePlanName_example"; // String | 
    UpdatePricePlanRequest updatePricePlanRequest = new UpdatePricePlanRequest(); // UpdatePricePlanRequest | Payload to update price plan
    try {
      PricePlan result = apiInstance.updatePricePlan(pricePlanName, updatePricePlanRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricePlansApi#updatePricePlan");
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
| **pricePlanName** | **String**|  | |
| **updatePricePlanRequest** | [**UpdatePricePlanRequest**](UpdatePricePlanRequest.md)| Payload to update price plan | |

### Return type

[**PricePlan**](PricePlan.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for Create and Get price plan requests |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

