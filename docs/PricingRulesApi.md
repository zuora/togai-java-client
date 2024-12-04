# PricingRulesApi

All URIs are relative to *https://api.togai.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listPricingRulesByScheduleId**](PricingRulesApi.md#listPricingRulesByScheduleId) | **GET** /price_plans/{price_plan_id}/pricing_schedules/{pricing_schedule_id}/pricing_rules | (DEPRECATED) List pricing rules by price plan id and pricing schedule id |


<a id="listPricingRulesByScheduleId"></a>
# **listPricingRulesByScheduleId**
> PricingRulesPaginatedResponse listPricingRulesByScheduleId(pricePlanId, pricingScheduleId, invoiceTiming)

(DEPRECATED) List pricing rules by price plan id and pricing schedule id

Get a list of pricing rules using price plan id and pricing schedule id

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.PricingRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PricingRulesApi apiInstance = new PricingRulesApi(defaultClient);
    String pricePlanId = "pp.1zYnCiM9Bpg.lv25y"; // String | 
    String pricingScheduleId = "sch.1zYnCiM9Bpg.lv25y"; // String | 
    String invoiceTiming = "IN_ADVANCE"; // String | Optional field to filter pricing rules based on invoice timing
    try {
      PricingRulesPaginatedResponse result = apiInstance.listPricingRulesByScheduleId(pricePlanId, pricingScheduleId, invoiceTiming);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricingRulesApi#listPricingRulesByScheduleId");
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
| **pricingScheduleId** | **String**|  | |
| **invoiceTiming** | **String**| Optional field to filter pricing rules based on invoice timing | [optional] [enum: IN_ADVANCE, IN_ARREARS] |

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
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

