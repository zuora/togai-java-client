# PricePlansApi

All URIs are relative to *https://api.togai.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activatePricePlan**](PricePlansApi.md#activatePricePlan) | **POST** /price_plans/{price_plan_id}/activate | Activate a price plan |
| [**addCurrencyToPricePlan**](PricePlansApi.md#addCurrencyToPricePlan) | **POST** /price_plans/{price_plan_id}/currencies | Add currencies to a price plan |
| [**createPricePlan**](PricePlansApi.md#createPricePlan) | **POST** /price_plans | Create a price plan |
| [**getPricePlan**](PricePlansApi.md#getPricePlan) | **GET** /price_plans/{price_plan_id} | Get a price plan |
| [**getPricePlans**](PricePlansApi.md#getPricePlans) | **GET** /price_plans | List price plans |
| [**removeCurrencyFromPricePlan**](PricePlansApi.md#removeCurrencyFromPricePlan) | **DELETE** /price_plans/{price_plan_id}/currencies/{currency_id} | Remove a draft currency from a price plan |
| [**updatePricePlan**](PricePlansApi.md#updatePricePlan) | **PATCH** /price_plans/{price_plan_id} | Update a price plan |


<a name="activatePricePlan"></a>
# **activatePricePlan**
> PricePlan activatePricePlan(pricePlanId, activatePricePlanRequest)

Activate a price plan

Activate a price plan details using price plan id

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
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PricePlansApi apiInstance = new PricePlansApi(defaultClient);
    String pricePlanId = "pricePlanId_example"; // String | 
    ActivatePricePlanRequest activatePricePlanRequest = new ActivatePricePlanRequest(); // ActivatePricePlanRequest | Payload to activate price plan
    try {
      PricePlan result = apiInstance.activatePricePlan(pricePlanId, activatePricePlanRequest);
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
| **pricePlanId** | **String**|  | |
| **activatePricePlanRequest** | [**ActivatePricePlanRequest**](ActivatePricePlanRequest.md)| Payload to activate price plan | |

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

<a name="addCurrencyToPricePlan"></a>
# **addCurrencyToPricePlan**
> PricePlan addCurrencyToPricePlan(pricePlanId, addCurrencyToPricePlanRequest)

Add currencies to a price plan

Add currencies to a price plan

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
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PricePlansApi apiInstance = new PricePlansApi(defaultClient);
    String pricePlanId = "pricePlanId_example"; // String | 
    AddCurrencyToPricePlanRequest addCurrencyToPricePlanRequest = new AddCurrencyToPricePlanRequest(); // AddCurrencyToPricePlanRequest | Payload to add currency to price plan
    try {
      PricePlan result = apiInstance.addCurrencyToPricePlan(pricePlanId, addCurrencyToPricePlanRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricePlansApi#addCurrencyToPricePlan");
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
| **pricePlanId** | **String**|  | |
| **addCurrencyToPricePlanRequest** | [**AddCurrencyToPricePlanRequest**](AddCurrencyToPricePlanRequest.md)| Payload to add currency to price plan | |

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

<a name="createPricePlan"></a>
# **createPricePlan**
> PricePlan createPricePlan(createPricePlanRequest)

Create a price plan

This API let&#39;s you create and price plan Learn more about [Price Plans](https://docs.togai.com/docs/priceplan) 

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
    defaultClient.setBasePath("https://api.togai.com");
    
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
> PricePlan getPricePlan(pricePlanId)

Get a price plan

Get a price plan details using price plan id

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
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PricePlansApi apiInstance = new PricePlansApi(defaultClient);
    String pricePlanId = "pricePlanId_example"; // String | 
    try {
      PricePlan result = apiInstance.getPricePlan(pricePlanId);
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
| **pricePlanId** | **String**|  | |

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

Get a list of price plans

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
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PricePlansApi apiInstance = new PricePlansApi(defaultClient);
    String nextToken = "eyJsYXN0SXRlbUlkIjogInN0cmluZyIsICJwYWdlU2l6ZSI6IDEwMCwgInNvcnRPcmRlciI6ICJhc2MifQ=="; // String | 
    BigDecimal pageSize = new BigDecimal("10"); // BigDecimal | 
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
| **pageSize** | **BigDecimal**|  | [optional] |

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

<a name="removeCurrencyFromPricePlan"></a>
# **removeCurrencyFromPricePlan**
> PricePlan removeCurrencyFromPricePlan(pricePlanId, currencyId)

Remove a draft currency from a price plan

Remove a draft currency from a price plan

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
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PricePlansApi apiInstance = new PricePlansApi(defaultClient);
    String pricePlanId = "pricePlanId_example"; // String | 
    String currencyId = "currencyId_example"; // String | 
    try {
      PricePlan result = apiInstance.removeCurrencyFromPricePlan(pricePlanId, currencyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricePlansApi#removeCurrencyFromPricePlan");
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
| **pricePlanId** | **String**|  | |
| **currencyId** | **String**|  | |

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

<a name="updatePricePlan"></a>
# **updatePricePlan**
> PricePlan updatePricePlan(pricePlanId, updatePricePlanRequest)

Update a price plan

Update an existing price plan Price Plans with status as DRAFT alone can be updated . Learn more about [Price plans](https://docs.togai.com/docs/priceplan) from our Guides 

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
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PricePlansApi apiInstance = new PricePlansApi(defaultClient);
    String pricePlanId = "pricePlanId_example"; // String | 
    UpdatePricePlanRequest updatePricePlanRequest = new UpdatePricePlanRequest(); // UpdatePricePlanRequest | Payload to update price plan
    try {
      PricePlan result = apiInstance.updatePricePlan(pricePlanId, updatePricePlanRequest);
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
| **pricePlanId** | **String**|  | |
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

