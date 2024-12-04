# PricePlansApi

All URIs are relative to *https://api.togai.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activatePricePlan**](PricePlansApi.md#activatePricePlan) | **POST** /price_plans/{price_plan_id}/activate | (DEPRECATED) Activate a price plan |
| [**archivePricePlan**](PricePlansApi.md#archivePricePlan) | **DELETE** /price_plans/{price_plan_id} | (DEPRECATED) Archive a price plan |
| [**createPricePlan**](PricePlansApi.md#createPricePlan) | **POST** /price_plans | (DEPRECATED) Create a price plan |
| [**getPricePlan**](PricePlansApi.md#getPricePlan) | **GET** /price_plans/{price_plan_id} | (DEPRECATED) Get a price plan |
| [**getPricePlans**](PricePlansApi.md#getPricePlans) | **GET** /price_plans | (DEPRECATED) List price plans |
| [**pricePlanMigration**](PricePlansApi.md#pricePlanMigration) | **POST** /price_plans/migration | (DEPRECATED) Create a price plan migration |
| [**updatePricePlan**](PricePlansApi.md#updatePricePlan) | **PATCH** /price_plans/{price_plan_id} | (DEPRECATED) Update a price plan |


<a id="activatePricePlan"></a>
# **activatePricePlan**
> PricePlan activatePricePlan(pricePlanId, activatePricePlanRequest)

(DEPRECATED) Activate a price plan

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
    String pricePlanId = "pp.1zYnCiM9Bpg.lv25y"; // String | 
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

<a id="archivePricePlan"></a>
# **archivePricePlan**
> BaseSuccessResponse archivePricePlan(pricePlanId)

(DEPRECATED) Archive a price plan

Archive a price plan

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
    String pricePlanId = "pp.1zYnCiM9Bpg.lv25y"; // String | 
    try {
      BaseSuccessResponse result = apiInstance.archivePricePlan(pricePlanId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricePlansApi#archivePricePlan");
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

[**BaseSuccessResponse**](BaseSuccessResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
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

<a id="createPricePlan"></a>
# **createPricePlan**
> PricePlan createPricePlan(createPricePlanRequest, dryRun)

(DEPRECATED) Create a price plan

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
    Boolean dryRun = false; // Boolean | 
    try {
      PricePlan result = apiInstance.createPricePlan(createPricePlanRequest, dryRun);
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
| **dryRun** | **Boolean**|  | [optional] |

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

<a id="getPricePlan"></a>
# **getPricePlan**
> PricePlan getPricePlan(pricePlanId, version)

(DEPRECATED) Get a price plan

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
    String pricePlanId = "pp.1zYnCiM9Bpg.lv25y"; // String | 
    Integer version = 2; // Integer | Optional version to get a specific version. Gets latest version if it is not provided.
    try {
      PricePlan result = apiInstance.getPricePlan(pricePlanId, version);
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
| **version** | **Integer**| Optional version to get a specific version. Gets latest version if it is not provided. | [optional] |

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

<a id="getPricePlans"></a>
# **getPricePlans**
> PricePlanPaginatedResponse getPricePlans(nextToken, pageSize)

(DEPRECATED) List price plans

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

<a id="pricePlanMigration"></a>
# **pricePlanMigration**
> BaseSuccessResponse pricePlanMigration(createPricePlanMigrationRequest)

(DEPRECATED) Create a price plan migration

Migrates accounts across price plans. This is an asynchronous process functioning on top of Togai&#39;s Jobs  framework. Status of the created migrations can be obtained using the [Jobs APIs](https://docs.togai.com/api-reference/jobs/get-the-status-of-a-job) 

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
    CreatePricePlanMigrationRequest createPricePlanMigrationRequest = new CreatePricePlanMigrationRequest(); // CreatePricePlanMigrationRequest | Payload to create price plan migration request
    try {
      BaseSuccessResponse result = apiInstance.pricePlanMigration(createPricePlanMigrationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricePlansApi#pricePlanMigration");
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
| **createPricePlanMigrationRequest** | [**CreatePricePlanMigrationRequest**](CreatePricePlanMigrationRequest.md)| Payload to create price plan migration request | |

### Return type

[**BaseSuccessResponse**](BaseSuccessResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | OK |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a id="updatePricePlan"></a>
# **updatePricePlan**
> PricePlan updatePricePlan(pricePlanId, updatePricePlanRequest)

(DEPRECATED) Update a price plan

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
    String pricePlanId = "pp.1zYnCiM9Bpg.lv25y"; // String | 
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

