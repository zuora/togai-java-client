# EntitlementsApi

All URIs are relative to *https://api.togai.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getEntitlementValue**](EntitlementsApi.md#getEntitlementValue) | **GET** /accounts/{account_id}/entitlements/{feature_id} | Get entitlement value for a account |
| [**getEntitlements**](EntitlementsApi.md#getEntitlements) | **GET** /accounts/{account_id}/entitlements | Get entitlements for a account |
| [**getFeatureCredits**](EntitlementsApi.md#getFeatureCredits) | **GET** /accounts/{account_id}/features/{feature_id} | Get Feature credits balance |
| [**ingestEntitledEvent**](EntitlementsApi.md#ingestEntitledEvent) | **POST** /entitled | Ingest event if a user is entitled to a feature |
| [**listFeatureCreditEntries**](EntitlementsApi.md#listFeatureCreditEntries) | **GET** /accounts/{account_id}/features/{feature_id}/entries | List feature credits entries of a feature for an account |
| [**updateFeatureCreditEntry**](EntitlementsApi.md#updateFeatureCreditEntry) | **PATCH** /accounts/{account_id}/features/{feature_id}/entries/{entry_id} | Update a feature credits entry |
| [**validateEntitlementValue**](EntitlementsApi.md#validateEntitlementValue) | **POST** /accounts/{account_id}/entitlements/{feature_id} | Check entitlement value for a account |
| [**voidFeatureCreditEntry**](EntitlementsApi.md#voidFeatureCreditEntry) | **POST** /accounts/{account_id}/features/{feature_id}/entries/{entry_id}/void | Void a feature credits entry of a feature for an account |


<a id="getEntitlementValue"></a>
# **getEntitlementValue**
> GetEntitlementValuesResponse getEntitlementValue(accountId, featureId)

Get entitlement value for a account

This API let’s you to get the entitlement value for a account

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.EntitlementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EntitlementsApi apiInstance = new EntitlementsApi(defaultClient);
    String accountId = "ACC00001"; // String | account_id corresponding to an account
    String featureId = "feat.fdjskl.sdkjl"; // String | feature_id corresponding to a feature
    try {
      GetEntitlementValuesResponse result = apiInstance.getEntitlementValue(accountId, featureId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitlementsApi#getEntitlementValue");
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
| **accountId** | **String**| account_id corresponding to an account | |
| **featureId** | **String**| feature_id corresponding to a feature | |

### Return type

[**GetEntitlementValuesResponse**](GetEntitlementValuesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success response |  -  |

<a id="getEntitlements"></a>
# **getEntitlements**
> GetEntitlementValuesResponse getEntitlements(accountId)

Get entitlements for a account

This API let’s you to get the entitlements for a account

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.EntitlementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EntitlementsApi apiInstance = new EntitlementsApi(defaultClient);
    String accountId = "ACC00001"; // String | account_id corresponding to an account
    try {
      GetEntitlementValuesResponse result = apiInstance.getEntitlements(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitlementsApi#getEntitlements");
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
| **accountId** | **String**| account_id corresponding to an account | |

### Return type

[**GetEntitlementValuesResponse**](GetEntitlementValuesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success response |  -  |

<a id="getFeatureCredits"></a>
# **getFeatureCredits**
> GetFeatureCreditsResponse getFeatureCredits(accountId, featureId)

Get Feature credits balance

This API let’s you to get the feature credits balance

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.EntitlementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EntitlementsApi apiInstance = new EntitlementsApi(defaultClient);
    String accountId = "ACC00001"; // String | account_id corresponding to an account
    String featureId = "feat.fdjskl.sdkjl"; // String | feature_id corresponding to a feature
    try {
      GetFeatureCreditsResponse result = apiInstance.getFeatureCredits(accountId, featureId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitlementsApi#getFeatureCredits");
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
| **accountId** | **String**| account_id corresponding to an account | |
| **featureId** | **String**| feature_id corresponding to a feature | |

### Return type

[**GetFeatureCreditsResponse**](GetFeatureCreditsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success response |  -  |
| **400** | Bad request. Please check the response message for failure details. |  -  |
| **401** | Credential is not valid. Please check the response message for failure details. |  -  |
| **403** | Credential does not have access to add a license entry. |  -  |
| **422** | Unable to process the query parameters provided. Please check our docs for the api limits - https://togai.io/docs/limits. |  -  |
| **429** | Request throttled. Please check the response message on the failure details. |  -  |
| **0** | Error response |  -  |

<a id="ingestEntitledEvent"></a>
# **ingestEntitledEvent**
> BaseSuccessResponse ingestEntitledEvent(ingestEventRequest)

Ingest event if a user is entitled to a feature

This API let’s you to ingest an event if a user is entitled to a feature

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.EntitlementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EntitlementsApi apiInstance = new EntitlementsApi(defaultClient);
    IngestEventRequest ingestEventRequest = new IngestEventRequest(); // IngestEventRequest | 
    try {
      BaseSuccessResponse result = apiInstance.ingestEntitledEvent(ingestEventRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitlementsApi#ingestEntitledEvent");
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
| **ingestEventRequest** | [**IngestEventRequest**](IngestEventRequest.md)|  | [optional] |

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
| **200** | Success response |  -  |
| **400** | Bad request. Please check the response message for failure details. |  -  |
| **401** | Credential is not valid. Please check the response message for failure details. |  -  |
| **403** | Credential does not have access to add a license entry. |  -  |
| **409** | Duplicate Id |  -  |
| **422** | Unable to process the query parameters provided. Please check our docs for the api limits - https://togai.io/docs/limits. |  -  |
| **429** | Request throttled. Please check the response message on the failure details. |  -  |
| **0** | Error response |  -  |

<a id="listFeatureCreditEntries"></a>
# **listFeatureCreditEntries**
> GetFeatureCreditEntriesPaginatedResponse listFeatureCreditEntries(accountId, featureId, pageSize, nextToken)

List feature credits entries of a feature for an account

This API let’s you to list the feature credits entries of a feature for an account

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.EntitlementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EntitlementsApi apiInstance = new EntitlementsApi(defaultClient);
    String accountId = "ACC00001"; // String | account_id corresponding to an account
    String featureId = "feat.fdjskl.sdkjl"; // String | feature_id corresponding to a feature
    Integer pageSize = 10; // Integer | Maximum page size expected by client to return the record list.    NOTE: Max page size cannot be more than 50. Also 50 is the default page size if no value is provided.
    String nextToken = "eyJsYXN0SXRlbUlkIjogInN0cmluZyIsICJwYWdlU2l6ZSI6IDEyMywgInNvcnRPcmRlciI6ICJhc2MifQ=="; // String | Pagination token used as a marker to get records from next page.
    try {
      GetFeatureCreditEntriesPaginatedResponse result = apiInstance.listFeatureCreditEntries(accountId, featureId, pageSize, nextToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitlementsApi#listFeatureCreditEntries");
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
| **accountId** | **String**| account_id corresponding to an account | |
| **featureId** | **String**| feature_id corresponding to a feature | |
| **pageSize** | **Integer**| Maximum page size expected by client to return the record list.    NOTE: Max page size cannot be more than 50. Also 50 is the default page size if no value is provided. | [optional] |
| **nextToken** | **String**| Pagination token used as a marker to get records from next page. | [optional] |

### Return type

[**GetFeatureCreditEntriesPaginatedResponse**](GetFeatureCreditEntriesPaginatedResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success response |  -  |
| **400** | Bad request. Please check the response message for failure details. |  -  |
| **401** | Credential is not valid. Please check the response message for failure details. |  -  |
| **403** | Credential does not have access to add a license entry. |  -  |
| **422** | Unable to process the query parameters provided. Please check our docs for the api limits - https://togai.io/docs/limits. |  -  |
| **429** | Request throttled. Please check the response message on the failure details. |  -  |
| **0** | Error response |  -  |

<a id="updateFeatureCreditEntry"></a>
# **updateFeatureCreditEntry**
> FeatureCreditEntry updateFeatureCreditEntry(accountId, featureId, entryId, updateFeatureCreditsRequest)

Update a feature credits entry

#### This API let&#39;s you to update the following attributes: &#x60;effectiveUntil&#x60; and &#x60;granted&#x60;  - **effectiveUntil**: must be in future - **granted**: must be greater than the existing usage (previous granted - current balance) 

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.EntitlementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EntitlementsApi apiInstance = new EntitlementsApi(defaultClient);
    String accountId = "ACC00001"; // String | account_id corresponding to an account
    String featureId = "feat.fdjskl.sdkjl"; // String | feature_id corresponding to a feature
    String entryId = "purchase.21HbazIT3JQ.D90jC#1$PURCHASE"; // String | `entryId` corresponding to a particular entitlement/overage grant entry  Formats: 1. If source of entry is an entitlement grant rate card in price plan: `schedule_id#pricing_cycle_start_date$PRICE_PLAN` 2. If source of entry is an entitlement overage rate card in price plan: `schedule_id#pricing_cycle_start_date$OVERAGE` 3. If source of entry is a purchase: `purchase_id#int_index$PURCHASE` 
    UpdateFeatureCreditsRequest updateFeatureCreditsRequest = new UpdateFeatureCreditsRequest(); // UpdateFeatureCreditsRequest | 
    try {
      FeatureCreditEntry result = apiInstance.updateFeatureCreditEntry(accountId, featureId, entryId, updateFeatureCreditsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitlementsApi#updateFeatureCreditEntry");
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
| **accountId** | **String**| account_id corresponding to an account | |
| **featureId** | **String**| feature_id corresponding to a feature | |
| **entryId** | **String**| &#x60;entryId&#x60; corresponding to a particular entitlement/overage grant entry  Formats: 1. If source of entry is an entitlement grant rate card in price plan: &#x60;schedule_id#pricing_cycle_start_date$PRICE_PLAN&#x60; 2. If source of entry is an entitlement overage rate card in price plan: &#x60;schedule_id#pricing_cycle_start_date$OVERAGE&#x60; 3. If source of entry is a purchase: &#x60;purchase_id#int_index$PURCHASE&#x60;  | |
| **updateFeatureCreditsRequest** | [**UpdateFeatureCreditsRequest**](UpdateFeatureCreditsRequest.md)|  | [optional] |

### Return type

[**FeatureCreditEntry**](FeatureCreditEntry.md)

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
| **403** | Credential does not have access to update a feature credit entry. |  -  |
| **404** | Entry not found. Please check the response message for failure details. |  -  |
| **429** | Request throttled. Please check the response message on the failure details. |  -  |
| **0** | Error response |  -  |

<a id="validateEntitlementValue"></a>
# **validateEntitlementValue**
> BaseSuccessResponse validateEntitlementValue(accountId, featureId, validateEntitlementValueRequest)

Check entitlement value for a account

This API let’s you to validate the entitlement value for a account

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.EntitlementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EntitlementsApi apiInstance = new EntitlementsApi(defaultClient);
    String accountId = "ACC00001"; // String | account_id corresponding to an account
    String featureId = "feat.fdjskl.sdkjl"; // String | feature_id corresponding to a feature
    ValidateEntitlementValueRequest validateEntitlementValueRequest = new ValidateEntitlementValueRequest(); // ValidateEntitlementValueRequest | 
    try {
      BaseSuccessResponse result = apiInstance.validateEntitlementValue(accountId, featureId, validateEntitlementValueRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitlementsApi#validateEntitlementValue");
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
| **accountId** | **String**| account_id corresponding to an account | |
| **featureId** | **String**| feature_id corresponding to a feature | |
| **validateEntitlementValueRequest** | [**ValidateEntitlementValueRequest**](ValidateEntitlementValueRequest.md)|  | [optional] |

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
| **200** | Success response |  -  |

<a id="voidFeatureCreditEntry"></a>
# **voidFeatureCreditEntry**
> BaseSuccessResponse voidFeatureCreditEntry(accountId, featureId, entryId)

Void a feature credits entry of a feature for an account

This API let’s you to void the feature credits entries of a feature for an account

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.EntitlementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EntitlementsApi apiInstance = new EntitlementsApi(defaultClient);
    String accountId = "ACC00001"; // String | account_id corresponding to an account
    String featureId = "feat.fdjskl.sdkjl"; // String | feature_id corresponding to a feature
    String entryId = "purchase.21HbazIT3JQ.D90jC#1$PURCHASE"; // String | `entryId` corresponding to a particular entitlement/overage grant entry  Formats: 1. If source of entry is an entitlement grant rate card in price plan: `schedule_id#pricing_cycle_start_date$PRICE_PLAN` 2. If source of entry is an entitlement overage rate card in price plan: `schedule_id#pricing_cycle_start_date$OVERAGE` 3. If source of entry is a purchase: `purchase_id#int_index$PURCHASE` 
    try {
      BaseSuccessResponse result = apiInstance.voidFeatureCreditEntry(accountId, featureId, entryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitlementsApi#voidFeatureCreditEntry");
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
| **accountId** | **String**| account_id corresponding to an account | |
| **featureId** | **String**| feature_id corresponding to a feature | |
| **entryId** | **String**| &#x60;entryId&#x60; corresponding to a particular entitlement/overage grant entry  Formats: 1. If source of entry is an entitlement grant rate card in price plan: &#x60;schedule_id#pricing_cycle_start_date$PRICE_PLAN&#x60; 2. If source of entry is an entitlement overage rate card in price plan: &#x60;schedule_id#pricing_cycle_start_date$OVERAGE&#x60; 3. If source of entry is a purchase: &#x60;purchase_id#int_index$PURCHASE&#x60;  | |

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
| **200** | Success response |  -  |
| **400** | Bad request. Please check the response message for failure details. |  -  |
| **401** | Credential is not valid. Please check the response message for failure details. |  -  |
| **403** | Credential does not have access to void a feature credit entry. |  -  |
| **404** | Entry not found. Please check the response message for failure details. |  -  |
| **429** | Request throttled. Please check the response message on the failure details. |  -  |
| **0** | Error response |  -  |

