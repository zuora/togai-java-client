# AddOnsApi

All URIs are relative to *https://api.togai.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAddOn**](AddOnsApi.md#createAddOn) | **POST** /addons | Create an AddOn |
| [**deleteAddOn**](AddOnsApi.md#deleteAddOn) | **DELETE** /addons/{addon_id} | Delete an addon |
| [**getAddOn**](AddOnsApi.md#getAddOn) | **GET** /addons/{addon_id} | Get an addon |
| [**getAddOns**](AddOnsApi.md#getAddOns) | **GET** /addons | List addOns |
| [**updateAddOn**](AddOnsApi.md#updateAddOn) | **PATCH** /addons/{addon_id} | Update an addon |


<a name="createAddOn"></a>
# **createAddOn**
> AddOn createAddOn(createAddOnRequest)

Create an AddOn

Create an AddOn

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.AddOnsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AddOnsApi apiInstance = new AddOnsApi(defaultClient);
    CreateAddOnRequest createAddOnRequest = new CreateAddOnRequest(); // CreateAddOnRequest | Payload to create addon
    try {
      AddOn result = apiInstance.createAddOn(createAddOnRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddOnsApi#createAddOn");
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
| **createAddOnRequest** | [**CreateAddOnRequest**](CreateAddOnRequest.md)| Payload to create addon | |

### Return type

[**AddOn**](AddOn.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for Create and Get addons requests |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a name="deleteAddOn"></a>
# **deleteAddOn**
> BaseSuccessResponse deleteAddOn(addonId)

Delete an addon

Archive an addOn

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.AddOnsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AddOnsApi apiInstance = new AddOnsApi(defaultClient);
    String addonId = "addonId_example"; // String | 
    try {
      BaseSuccessResponse result = apiInstance.deleteAddOn(addonId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddOnsApi#deleteAddOn");
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
| **addonId** | **String**|  | |

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

<a name="getAddOn"></a>
# **getAddOn**
> AddOn getAddOn(addonId)

Get an addon

Get details of an addon

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.AddOnsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AddOnsApi apiInstance = new AddOnsApi(defaultClient);
    String addonId = "addonId_example"; // String | 
    try {
      AddOn result = apiInstance.getAddOn(addonId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddOnsApi#getAddOn");
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
| **addonId** | **String**|  | |

### Return type

[**AddOn**](AddOn.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for Create and Get addons requests |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a name="getAddOns"></a>
# **getAddOns**
> AddOnPaginatedResponse getAddOns(status, nextToken, pageSize)

List addOns

Get a list of add-ons

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.AddOnsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AddOnsApi apiInstance = new AddOnsApi(defaultClient);
    String status = "ACTIVE"; // String | Filter by status 
    String nextToken = "eyJsYXN0SXRlbUlkIjogInN0cmluZyIsICJwYWdlU2l6ZSI6IDEwMCwgInNvcnRPcmRlciI6ICJhc2MifQ=="; // String | 
    BigDecimal pageSize = new BigDecimal("10"); // BigDecimal | 
    try {
      AddOnPaginatedResponse result = apiInstance.getAddOns(status, nextToken, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddOnsApi#getAddOns");
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
| **status** | **String**| Filter by status  | [optional] [enum: ACTIVE, ARCHIVED] |
| **nextToken** | **String**|  | [optional] |
| **pageSize** | **BigDecimal**|  | [optional] |

### Return type

[**AddOnPaginatedResponse**](AddOnPaginatedResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for List addons requests |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a name="updateAddOn"></a>
# **updateAddOn**
> AddOn updateAddOn(addonId, updateAddOnRequest)

Update an addon

Update an existing addon 

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.AddOnsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AddOnsApi apiInstance = new AddOnsApi(defaultClient);
    String addonId = "addonId_example"; // String | 
    UpdateAddOnRequest updateAddOnRequest = new UpdateAddOnRequest(); // UpdateAddOnRequest | Payload to update addon
    try {
      AddOn result = apiInstance.updateAddOn(addonId, updateAddOnRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddOnsApi#updateAddOn");
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
| **addonId** | **String**|  | |
| **updateAddOnRequest** | [**UpdateAddOnRequest**](UpdateAddOnRequest.md)| Payload to update addon | |

### Return type

[**AddOn**](AddOn.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for Create and Get addons requests |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

