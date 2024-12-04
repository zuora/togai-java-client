# FeatureApi

All URIs are relative to *https://api.togai.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFeature**](FeatureApi.md#createFeature) | **POST** /features | Create a Feature and optionally associate with one or more event_schemas |
| [**getFeature**](FeatureApi.md#getFeature) | **GET** /features/{feature_id} | Get a Feature |
| [**getFeatures**](FeatureApi.md#getFeatures) | **GET** /features | List Feature |
| [**updateFeature**](FeatureApi.md#updateFeature) | **PATCH** /features/{feature_id} | Update a Feature |


<a id="createFeature"></a>
# **createFeature**
> Feature createFeature(createFeatureRequest)

Create a Feature and optionally associate with one or more event_schemas

Create a Feature optionally associate with one or more event_schemas

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.FeatureApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    FeatureApi apiInstance = new FeatureApi(defaultClient);
    CreateFeatureRequest createFeatureRequest = new CreateFeatureRequest(); // CreateFeatureRequest | Payload to create a Feature along the association with event_schemas
    try {
      Feature result = apiInstance.createFeature(createFeatureRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureApi#createFeature");
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
| **createFeatureRequest** | [**CreateFeatureRequest**](CreateFeatureRequest.md)| Payload to create a Feature along the association with event_schemas | |

### Return type

[**Feature**](Feature.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for Create and Get Feature requests |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a id="getFeature"></a>
# **getFeature**
> Feature getFeature(featureId)

Get a Feature

Get details of a Feature

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.FeatureApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    FeatureApi apiInstance = new FeatureApi(defaultClient);
    String featureId = "feat.fdjskl.sdkjl"; // String | feature_id corresponding to a feature
    try {
      Feature result = apiInstance.getFeature(featureId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureApi#getFeature");
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
| **featureId** | **String**| feature_id corresponding to a feature | |

### Return type

[**Feature**](Feature.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for Create and Get Feature requests |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a id="getFeatures"></a>
# **getFeatures**
> FeaturePaginatedListData getFeatures(nextToken, pageSize)

List Feature

Get a list of features along with its associations

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.FeatureApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    FeatureApi apiInstance = new FeatureApi(defaultClient);
    String nextToken = "eyJsYXN0SXRlbUlkIjogInN0cmluZyIsICJwYWdlU2l6ZSI6IDEwMCwgInNvcnRPcmRlciI6ICJhc2MifQ=="; // String | 
    BigDecimal pageSize = new BigDecimal("10"); // BigDecimal | 
    try {
      FeaturePaginatedListData result = apiInstance.getFeatures(nextToken, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureApi#getFeatures");
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

[**FeaturePaginatedListData**](FeaturePaginatedListData.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for list Feature request |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a id="updateFeature"></a>
# **updateFeature**
> Feature updateFeature(featureId, updateFeatureRequest)

Update a Feature

Update an existing feature and its eventSchema associations 

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.FeatureApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    FeatureApi apiInstance = new FeatureApi(defaultClient);
    String featureId = "feat.fdjskl.sdkjl"; // String | feature_id corresponding to a feature
    UpdateFeatureRequest updateFeatureRequest = new UpdateFeatureRequest(); // UpdateFeatureRequest | Payload to update a Feature along the associations with event_schemas
    try {
      Feature result = apiInstance.updateFeature(featureId, updateFeatureRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureApi#updateFeature");
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
| **featureId** | **String**| feature_id corresponding to a feature | |
| **updateFeatureRequest** | [**UpdateFeatureRequest**](UpdateFeatureRequest.md)| Payload to update a Feature along the associations with event_schemas | |

### Return type

[**Feature**](Feature.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for Create and Get Feature requests |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

