# SchedulesApi

All URIs are relative to *https://api.togai.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bulkEditSchedules**](SchedulesApi.md#bulkEditSchedules) | **POST** /v2/accounts/{account_id}/edit_schedules | Bulk edit schedules of an account |
| [**bulkRateCardOperationsOnSchedule**](SchedulesApi.md#bulkRateCardOperationsOnSchedule) | **POST** /v2/schedules/{schedule_id}/rate_cards | Bulk rate card operations on a schedule |
| [**discardAccountSchedules**](SchedulesApi.md#discardAccountSchedules) | **DELETE** /v2/accounts/{account_id}/discard_schedules | Discard schedules of an account |
| [**finalizeAccountSchedules**](SchedulesApi.md#finalizeAccountSchedules) | **POST** /v2/accounts/{account_id}/finalize_schedules | Finalize schedules of an account |
| [**listPricingRules**](SchedulesApi.md#listPricingRules) | **GET** /v2/schedules/{schedule_id}/pricing_rules | List pricing rules of a account schedule |
| [**listScheduleErrors**](SchedulesApi.md#listScheduleErrors) | **GET** /v2/schedules/{schedule_id}/errors | Get list of errors of a acc schedule |
| [**listScheduleRateCards**](SchedulesApi.md#listScheduleRateCards) | **GET** /v2/schedules/{schedule_id}/rate_cards | List rate cards |
| [**listaccountSchedules**](SchedulesApi.md#listaccountSchedules) | **GET** /v2/accounts/{account_id}/schedules | List pricing schedules of an account |
| [**updatePricingRules**](SchedulesApi.md#updatePricingRules) | **PUT** /v2/schedules/{schedule_id}/pricing_rules | Update pricing rules of a account schedule |


<a id="bulkEditSchedules"></a>
# **bulkEditSchedules**
> UpdatePricingScheduleResponse bulkEditSchedules(accountId, editAccountScheduleRequest, discard)

Bulk edit schedules of an account

Bulk edit schedules of an account

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.SchedulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SchedulesApi apiInstance = new SchedulesApi(defaultClient);
    String accountId = "ACC00001"; // String | account_id corresponding to an account
    EditAccountScheduleRequest editAccountScheduleRequest = new EditAccountScheduleRequest(); // EditAccountScheduleRequest | Payload to edit schedules of an account
    Boolean discard = false; // Boolean | 
    try {
      UpdatePricingScheduleResponse result = apiInstance.bulkEditSchedules(accountId, editAccountScheduleRequest, discard);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchedulesApi#bulkEditSchedules");
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
| **editAccountScheduleRequest** | [**EditAccountScheduleRequest**](EditAccountScheduleRequest.md)| Payload to edit schedules of an account | |
| **discard** | **Boolean**|  | [optional] |

### Return type

[**UpdatePricingScheduleResponse**](UpdatePricingScheduleResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for dis/associate price plan request |  -  |
| **0** | Error response |  -  |

<a id="bulkRateCardOperationsOnSchedule"></a>
# **bulkRateCardOperationsOnSchedule**
> BulkRateCardOperationsResponse bulkRateCardOperationsOnSchedule(scheduleId, bulkRateCardOperationsRequest)

Bulk rate card operations on a schedule

Bulk rate card operations on a schedule

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.SchedulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SchedulesApi apiInstance = new SchedulesApi(defaultClient);
    String scheduleId = "sch.20aUyEZSuYq.SoGbS"; // String | 
    BulkRateCardOperationsRequest bulkRateCardOperationsRequest = new BulkRateCardOperationsRequest(); // BulkRateCardOperationsRequest | Payload to bulk rate card operations
    try {
      BulkRateCardOperationsResponse result = apiInstance.bulkRateCardOperationsOnSchedule(scheduleId, bulkRateCardOperationsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchedulesApi#bulkRateCardOperationsOnSchedule");
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
| **scheduleId** | **String**|  | |
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

<a id="discardAccountSchedules"></a>
# **discardAccountSchedules**
> BaseSuccessResponse discardAccountSchedules(accountId)

Discard schedules of an account

Discard schedules of an account

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.SchedulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SchedulesApi apiInstance = new SchedulesApi(defaultClient);
    String accountId = "ACC00001"; // String | account_id corresponding to an account
    try {
      BaseSuccessResponse result = apiInstance.discardAccountSchedules(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchedulesApi#discardAccountSchedules");
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

<a id="finalizeAccountSchedules"></a>
# **finalizeAccountSchedules**
> SchedulesPaginatedResponse finalizeAccountSchedules(accountId, finalizeAccountSchedules)

Finalize schedules of an account

Finalize schedules of an account

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.SchedulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SchedulesApi apiInstance = new SchedulesApi(defaultClient);
    String accountId = "ACC00001"; // String | account_id corresponding to an account
    FinalizeAccountSchedules finalizeAccountSchedules = new FinalizeAccountSchedules(); // FinalizeAccountSchedules | Payload to finalize account schedules
    try {
      SchedulesPaginatedResponse result = apiInstance.finalizeAccountSchedules(accountId, finalizeAccountSchedules);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchedulesApi#finalizeAccountSchedules");
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
| **finalizeAccountSchedules** | [**FinalizeAccountSchedules**](FinalizeAccountSchedules.md)| Payload to finalize account schedules | |

### Return type

[**SchedulesPaginatedResponse**](SchedulesPaginatedResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Paginated response for pricing schedules |  -  |

<a id="listPricingRules"></a>
# **listPricingRules**
> PricingRulesPaginatedResponse listPricingRules(scheduleId, mode)

List pricing rules of a account schedule

List pricing rules of a account schedule

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.SchedulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SchedulesApi apiInstance = new SchedulesApi(defaultClient);
    String scheduleId = "sch.20aUyEZSuYq.SoGbS"; // String | 
    String mode = "mode_example"; // String | Possible values: 1. ACTIVE - Get the active rate card 2. DRAFT - Get the draft rate card 
    try {
      PricingRulesPaginatedResponse result = apiInstance.listPricingRules(scheduleId, mode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchedulesApi#listPricingRules");
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
| **scheduleId** | **String**|  | |
| **mode** | **String**| Possible values: 1. ACTIVE - Get the active rate card 2. DRAFT - Get the draft rate card  | |

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

<a id="listScheduleErrors"></a>
# **listScheduleErrors**
> ValidatedEntityErrorsPaginatedResponse listScheduleErrors(scheduleId)

Get list of errors of a acc schedule

Get list of errors of a acc schedule

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.SchedulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SchedulesApi apiInstance = new SchedulesApi(defaultClient);
    String scheduleId = "sch.20aUyEZSuYq.SoGbS"; // String | 
    try {
      ValidatedEntityErrorsPaginatedResponse result = apiInstance.listScheduleErrors(scheduleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchedulesApi#listScheduleErrors");
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
| **scheduleId** | **String**|  | |

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

<a id="listScheduleRateCards"></a>
# **listScheduleRateCards**
> RateCardPaginatedResponse listScheduleRateCards(scheduleId, mode, nextToken, pageSize)

List rate cards

List rate cards

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.SchedulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SchedulesApi apiInstance = new SchedulesApi(defaultClient);
    String scheduleId = "sch.20aUyEZSuYq.SoGbS"; // String | 
    String mode = "mode_example"; // String | Possible values: 1. ACTIVE - Get the active rate card 2. DRAFT - Get the draft rate card 
    String nextToken = "eyJsYXN0SXRlbUlkIjogInN0cmluZyIsICJwYWdlU2l6ZSI6IDEwMCwgInNvcnRPcmRlciI6ICJhc2MifQ=="; // String | 
    BigDecimal pageSize = new BigDecimal("10"); // BigDecimal | 
    try {
      RateCardPaginatedResponse result = apiInstance.listScheduleRateCards(scheduleId, mode, nextToken, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchedulesApi#listScheduleRateCards");
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
| **scheduleId** | **String**|  | |
| **mode** | **String**| Possible values: 1. ACTIVE - Get the active rate card 2. DRAFT - Get the draft rate card  | |
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

<a id="listaccountSchedules"></a>
# **listaccountSchedules**
> SchedulesPaginatedResponse listaccountSchedules(accountId, mode, nextToken, pageSize)

List pricing schedules of an account

List pricing schedules of an account

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.SchedulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SchedulesApi apiInstance = new SchedulesApi(defaultClient);
    String accountId = "ACC00001"; // String | account_id corresponding to an account
    String mode = "mode_example"; // String | Possible values: 1. ACTIVE - Get the active rate card 2. DRAFT - Get the draft rate card 
    String nextToken = "eyJsYXN0SXRlbUlkIjogInN0cmluZyIsICJwYWdlU2l6ZSI6IDEwMCwgInNvcnRPcmRlciI6ICJhc2MifQ=="; // String | 
    BigDecimal pageSize = new BigDecimal("10"); // BigDecimal | 
    try {
      SchedulesPaginatedResponse result = apiInstance.listaccountSchedules(accountId, mode, nextToken, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchedulesApi#listaccountSchedules");
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
| **mode** | **String**| Possible values: 1. ACTIVE - Get the active rate card 2. DRAFT - Get the draft rate card  | |
| **nextToken** | **String**|  | [optional] |
| **pageSize** | **BigDecimal**|  | [optional] |

### Return type

[**SchedulesPaginatedResponse**](SchedulesPaginatedResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Paginated response for pricing schedules |  -  |
| **0** | Error response |  -  |

<a id="updatePricingRules"></a>
# **updatePricingRules**
> PricingRulesPaginatedResponse updatePricingRules(scheduleId, updatePricingRulesRequest)

Update pricing rules of a account schedule

Update pricing rules of a account schedule

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.SchedulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SchedulesApi apiInstance = new SchedulesApi(defaultClient);
    String scheduleId = "sch.20aUyEZSuYq.SoGbS"; // String | 
    UpdatePricingRulesRequest updatePricingRulesRequest = new UpdatePricingRulesRequest(); // UpdatePricingRulesRequest | Payload to update pricing rules
    try {
      PricingRulesPaginatedResponse result = apiInstance.updatePricingRules(scheduleId, updatePricingRulesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchedulesApi#updatePricingRules");
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
| **scheduleId** | **String**|  | |
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

