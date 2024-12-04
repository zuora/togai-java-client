# PricePlanV2Api

All URIs are relative to *https://api.togai.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bulkPricePlanRateCardOperations**](PricePlanV2Api.md#bulkPricePlanRateCardOperations) | **POST** /v2/price_plans/{price_plan_id}/rate_cards | Bulk rate card operations of a price plan |
| [**createPricePlanV2**](PricePlanV2Api.md#createPricePlanV2) | **POST** /v2/price_plans | Create a price plan |
| [**discardPricePlan**](PricePlanV2Api.md#discardPricePlan) | **DELETE** /v2/price_plans/{price_plan_id}/discard | Discard a price plan |
| [**finalizePricePlan**](PricePlanV2Api.md#finalizePricePlan) | **POST** /v2/price_plans/{price_plan_id}/finalize | Finalize a price plan |
| [**getPricePlanV2**](PricePlanV2Api.md#getPricePlanV2) | **GET** /v2/price_plans/{price_plan_id} | Get a price plan |
| [**listPricePlanErrors**](PricePlanV2Api.md#listPricePlanErrors) | **GET** /v2/price_plans/{price_plan_id}/errors | Get list of errors of a price plan |
| [**listPricePlanPricingRules**](PricePlanV2Api.md#listPricePlanPricingRules) | **GET** /v2/price_plans/{price_plan_id}/pricing_rules | List pricing rules of a price plan |
| [**listPricePlanRateCards**](PricePlanV2Api.md#listPricePlanRateCards) | **GET** /v2/price_plans/{price_plan_id}/rate_cards | List rate cards of a price plan |
| [**listPricePlanVersions**](PricePlanV2Api.md#listPricePlanVersions) | **GET** /v2/price_plans/{price_plan_id}/versions | List price plan versions |
| [**listPricePlansV2**](PricePlanV2Api.md#listPricePlansV2) | **GET** /v2/price_plans | List price plans |
| [**pricePlanMigrationV2**](PricePlanV2Api.md#pricePlanMigrationV2) | **POST** /v2/price_plans/migration | Create a price plan v2 migration |
| [**updatePricePlanPricingRules**](PricePlanV2Api.md#updatePricePlanPricingRules) | **PUT** /v2/price_plans/{price_plan_id}/pricing_rules | Update pricing rules of a price plan |
| [**updatePricePlanV2**](PricePlanV2Api.md#updatePricePlanV2) | **PATCH** /v2/price_plans/{price_plan_id} | Update a price plan |


<a id="bulkPricePlanRateCardOperations"></a>
# **bulkPricePlanRateCardOperations**
> BulkRateCardOperationsResponse bulkPricePlanRateCardOperations(pricePlanId, bulkRateCardOperationsRequest)

Bulk rate card operations of a price plan

Bulk rate card operations of a price plan

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.PricePlanV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PricePlanV2Api apiInstance = new PricePlanV2Api(defaultClient);
    String pricePlanId = "pp.1zYnCiM9Bpg.lv25y"; // String | 
    BulkRateCardOperationsRequest bulkRateCardOperationsRequest = new BulkRateCardOperationsRequest(); // BulkRateCardOperationsRequest | Payload to bulk rate card operations
    try {
      BulkRateCardOperationsResponse result = apiInstance.bulkPricePlanRateCardOperations(pricePlanId, bulkRateCardOperationsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricePlanV2Api#bulkPricePlanRateCardOperations");
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
| **bulkRateCardOperationsRequest** | [**BulkRateCardOperationsRequest**](BulkRateCardOperationsRequest.md)| Payload to bulk rate card operations | |

### Return type

[**BulkRateCardOperationsResponse**](BulkRateCardOperationsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for bulk rate card operations of a price plan |  -  |
| **0** | Error response |  -  |

<a id="createPricePlanV2"></a>
# **createPricePlanV2**
> PricePlanV2 createPricePlanV2(createPricePlanV2Request)

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
import com.togai.client.api.PricePlanV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PricePlanV2Api apiInstance = new PricePlanV2Api(defaultClient);
    CreatePricePlanV2Request createPricePlanV2Request = new CreatePricePlanV2Request(); // CreatePricePlanV2Request | Payload to create price plan
    try {
      PricePlanV2 result = apiInstance.createPricePlanV2(createPricePlanV2Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricePlanV2Api#createPricePlanV2");
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
| **createPricePlanV2Request** | [**CreatePricePlanV2Request**](CreatePricePlanV2Request.md)| Payload to create price plan | |

### Return type

[**PricePlanV2**](PricePlanV2.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for Create and Get price plan requests |  -  |
| **0** | Error response |  -  |

<a id="discardPricePlan"></a>
# **discardPricePlan**
> BaseSuccessResponse discardPricePlan(pricePlanId)

Discard a price plan

Discard a price plan

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.PricePlanV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PricePlanV2Api apiInstance = new PricePlanV2Api(defaultClient);
    String pricePlanId = "pp.1zYnCiM9Bpg.lv25y"; // String | 
    try {
      BaseSuccessResponse result = apiInstance.discardPricePlan(pricePlanId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricePlanV2Api#discardPricePlan");
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
| **0** | Error response |  -  |

<a id="finalizePricePlan"></a>
# **finalizePricePlan**
> BaseSuccessResponse finalizePricePlan(pricePlanId, finalizePricePlanRequest)

Finalize a price plan

Finalize a price plan

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.PricePlanV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PricePlanV2Api apiInstance = new PricePlanV2Api(defaultClient);
    String pricePlanId = "pp.1zYnCiM9Bpg.lv25y"; // String | 
    FinalizePricePlanRequest finalizePricePlanRequest = new FinalizePricePlanRequest(); // FinalizePricePlanRequest | Payload to finalize price plan
    try {
      BaseSuccessResponse result = apiInstance.finalizePricePlan(pricePlanId, finalizePricePlanRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricePlanV2Api#finalizePricePlan");
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
| **finalizePricePlanRequest** | [**FinalizePricePlanRequest**](FinalizePricePlanRequest.md)| Payload to finalize price plan | |

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
| **200** | OK |  -  |
| **0** | Error response |  -  |

<a id="getPricePlanV2"></a>
# **getPricePlanV2**
> PricePlanV2 getPricePlanV2(pricePlanId, version)

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
import com.togai.client.api.PricePlanV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PricePlanV2Api apiInstance = new PricePlanV2Api(defaultClient);
    String pricePlanId = "pp.1zYnCiM9Bpg.lv25y"; // String | 
    String version = "version_example"; // String | Optional version to get a specific version. Gets latest version if it is not provided. Possible values: 1. LATEST - Get the latest version of the price plan, can be draft 2. ACTIVE - Get the latest active version of the price plan 3. NUMBER - Get the specific version of the price plans 
    try {
      PricePlanV2 result = apiInstance.getPricePlanV2(pricePlanId, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricePlanV2Api#getPricePlanV2");
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
| **version** | **String**| Optional version to get a specific version. Gets latest version if it is not provided. Possible values: 1. LATEST - Get the latest version of the price plan, can be draft 2. ACTIVE - Get the latest active version of the price plan 3. NUMBER - Get the specific version of the price plans  | [optional] |

### Return type

[**PricePlanV2**](PricePlanV2.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for Create and Get price plan requests |  -  |
| **0** | Error response |  -  |

<a id="listPricePlanErrors"></a>
# **listPricePlanErrors**
> ValidatedEntityErrorsPaginatedResponse listPricePlanErrors(pricePlanId)

Get list of errors of a price plan

Get list of errors of a price plan

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.PricePlanV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PricePlanV2Api apiInstance = new PricePlanV2Api(defaultClient);
    String pricePlanId = "pp.1zYnCiM9Bpg.lv25y"; // String | 
    try {
      ValidatedEntityErrorsPaginatedResponse result = apiInstance.listPricePlanErrors(pricePlanId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricePlanV2Api#listPricePlanErrors");
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

[**ValidatedEntityErrorsPaginatedResponse**](ValidatedEntityErrorsPaginatedResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Paginated response for draft entities validations |  -  |
| **0** | Error response |  -  |

<a id="listPricePlanPricingRules"></a>
# **listPricePlanPricingRules**
> PricingRulesPaginatedResponse listPricePlanPricingRules(pricePlanId, version)

List pricing rules of a price plan

List pricing rules of a price plan

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.PricePlanV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PricePlanV2Api apiInstance = new PricePlanV2Api(defaultClient);
    String pricePlanId = "pp.1zYnCiM9Bpg.lv25y"; // String | 
    String version = "version_example"; // String | Optional version to get a specific version. Gets latest version if it is not provided. Possible values: 1. LATEST - Get the latest version of the price plan, can be draft 2. ACTIVE - Get the latest active version of the price plan 3. NUMBER - Get the specific version of the price plans 
    try {
      PricingRulesPaginatedResponse result = apiInstance.listPricePlanPricingRules(pricePlanId, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricePlanV2Api#listPricePlanPricingRules");
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
| **version** | **String**| Optional version to get a specific version. Gets latest version if it is not provided. Possible values: 1. LATEST - Get the latest version of the price plan, can be draft 2. ACTIVE - Get the latest active version of the price plan 3. NUMBER - Get the specific version of the price plans  | [optional] |

### Return type

[**PricingRulesPaginatedResponse**](PricingRulesPaginatedResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for create/list pricing rules request |  -  |
| **0** | Error response |  -  |

<a id="listPricePlanRateCards"></a>
# **listPricePlanRateCards**
> RateCardPaginatedResponse listPricePlanRateCards(pricePlanId, nextToken, pageSize)

List rate cards of a price plan

List rate cards of a price plan

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.PricePlanV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PricePlanV2Api apiInstance = new PricePlanV2Api(defaultClient);
    String pricePlanId = "pp.1zYnCiM9Bpg.lv25y"; // String | 
    String nextToken = "eyJsYXN0SXRlbUlkIjogInN0cmluZyIsICJwYWdlU2l6ZSI6IDEwMCwgInNvcnRPcmRlciI6ICJhc2MifQ=="; // String | 
    BigDecimal pageSize = new BigDecimal("10"); // BigDecimal | 
    try {
      RateCardPaginatedResponse result = apiInstance.listPricePlanRateCards(pricePlanId, nextToken, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricePlanV2Api#listPricePlanRateCards");
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
| **nextToken** | **String**|  | [optional] |
| **pageSize** | **BigDecimal**|  | [optional] |

### Return type

[**RateCardPaginatedResponse**](RateCardPaginatedResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for list rate cards request |  -  |
| **0** | Error response |  -  |

<a id="listPricePlanVersions"></a>
# **listPricePlanVersions**
> PricePlanV2PaginatedResponse listPricePlanVersions(pricePlanId, nextToken, pageSize)

List price plan versions

List price plan versions

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.PricePlanV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PricePlanV2Api apiInstance = new PricePlanV2Api(defaultClient);
    String pricePlanId = "pp.1zYnCiM9Bpg.lv25y"; // String | 
    String nextToken = "eyJsYXN0SXRlbUlkIjogInN0cmluZyIsICJwYWdlU2l6ZSI6IDEwMCwgInNvcnRPcmRlciI6ICJhc2MifQ=="; // String | 
    BigDecimal pageSize = new BigDecimal("10"); // BigDecimal | 
    try {
      PricePlanV2PaginatedResponse result = apiInstance.listPricePlanVersions(pricePlanId, nextToken, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricePlanV2Api#listPricePlanVersions");
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
| **nextToken** | **String**|  | [optional] |
| **pageSize** | **BigDecimal**|  | [optional] |

### Return type

[**PricePlanV2PaginatedResponse**](PricePlanV2PaginatedResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for list price plans request |  -  |
| **0** | Error response |  -  |

<a id="listPricePlansV2"></a>
# **listPricePlansV2**
> PricePlanV2PaginatedResponse listPricePlansV2(nextToken, pageSize)

List price plans

List price plans

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.PricePlanV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PricePlanV2Api apiInstance = new PricePlanV2Api(defaultClient);
    String nextToken = "eyJsYXN0SXRlbUlkIjogInN0cmluZyIsICJwYWdlU2l6ZSI6IDEwMCwgInNvcnRPcmRlciI6ICJhc2MifQ=="; // String | 
    BigDecimal pageSize = new BigDecimal("10"); // BigDecimal | 
    try {
      PricePlanV2PaginatedResponse result = apiInstance.listPricePlansV2(nextToken, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricePlanV2Api#listPricePlansV2");
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

[**PricePlanV2PaginatedResponse**](PricePlanV2PaginatedResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for list price plans request |  -  |
| **0** | Error response |  -  |

<a id="pricePlanMigrationV2"></a>
# **pricePlanMigrationV2**
> BaseSuccessResponse pricePlanMigrationV2(createPricePlanMigrationRequest)

Create a price plan v2 migration

Migrates accounts across price plans. This is an asynchronous process functioning on top of Togai&#39;s Jobs  framework. Status of the created migrations can be obtained using the [Jobs APIs](https://docs.togai.com/api-reference/jobs/get-the-status-of-a-job) 

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.PricePlanV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PricePlanV2Api apiInstance = new PricePlanV2Api(defaultClient);
    CreatePricePlanMigrationRequest createPricePlanMigrationRequest = new CreatePricePlanMigrationRequest(); // CreatePricePlanMigrationRequest | Payload to create price plan migration request
    try {
      BaseSuccessResponse result = apiInstance.pricePlanMigrationV2(createPricePlanMigrationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricePlanV2Api#pricePlanMigrationV2");
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

<a id="updatePricePlanPricingRules"></a>
# **updatePricePlanPricingRules**
> PricingRulesPaginatedResponse updatePricePlanPricingRules(pricePlanId, updatePricingRulesRequest)

Update pricing rules of a price plan

Update pricing rules of a price plan

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.PricePlanV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PricePlanV2Api apiInstance = new PricePlanV2Api(defaultClient);
    String pricePlanId = "pp.1zYnCiM9Bpg.lv25y"; // String | 
    UpdatePricingRulesRequest updatePricingRulesRequest = new UpdatePricingRulesRequest(); // UpdatePricingRulesRequest | Payload to update pricing rules
    try {
      PricingRulesPaginatedResponse result = apiInstance.updatePricePlanPricingRules(pricePlanId, updatePricingRulesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricePlanV2Api#updatePricePlanPricingRules");
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
| **updatePricingRulesRequest** | [**UpdatePricingRulesRequest**](UpdatePricingRulesRequest.md)| Payload to update pricing rules | |

### Return type

[**PricingRulesPaginatedResponse**](PricingRulesPaginatedResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for create/list pricing rules request |  -  |
| **0** | Error response |  -  |

<a id="updatePricePlanV2"></a>
# **updatePricePlanV2**
> PricePlanV2 updatePricePlanV2(pricePlanId, updatePricePlanV2Request)

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
import com.togai.client.api.PricePlanV2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PricePlanV2Api apiInstance = new PricePlanV2Api(defaultClient);
    String pricePlanId = "pp.1zYnCiM9Bpg.lv25y"; // String | 
    UpdatePricePlanV2Request updatePricePlanV2Request = new UpdatePricePlanV2Request(); // UpdatePricePlanV2Request | Payload to update price plan
    try {
      PricePlanV2 result = apiInstance.updatePricePlanV2(pricePlanId, updatePricePlanV2Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricePlanV2Api#updatePricePlanV2");
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
| **updatePricePlanV2Request** | [**UpdatePricePlanV2Request**](UpdatePricePlanV2Request.md)| Payload to update price plan | |

### Return type

[**PricePlanV2**](PricePlanV2.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for Create and Get price plan requests |  -  |
| **0** | Error response |  -  |

