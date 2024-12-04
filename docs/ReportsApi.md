# ReportsApi

All URIs are relative to *https://api.togai.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listReports**](ReportsApi.md#listReports) | **GET** /reports | List reports |


<a id="listReports"></a>
# **listReports**
> ReportsPaginatedResponse listReports(nextToken, pageSize, fetchFor)

List reports

List reports

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.ReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String nextToken = "eyJsYXN0SXRlbUlkIjogInN0cmluZyIsICJwYWdlU2l6ZSI6IDEwMCwgInNvcnRPcmRlciI6ICJhc2MifQ=="; // String | 
    BigDecimal pageSize = new BigDecimal("10"); // BigDecimal | 
    String fetchFor = "ALL"; // String | Fetch for flag used to get the reports from: 1. ALL: Both the organization and accounts 2. ORGANIZATION: Only the organization 3. ACCOUNTS: Only accounts, works with account_id filter only. 
    try {
      ReportsPaginatedResponse result = apiInstance.listReports(nextToken, pageSize, fetchFor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#listReports");
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
| **fetchFor** | **String**| Fetch for flag used to get the reports from: 1. ALL: Both the organization and accounts 2. ORGANIZATION: Only the organization 3. ACCOUNTS: Only accounts, works with account_id filter only.  | [optional] [default to ORGANIZATION] [enum: ALL, ORGANIZATION, ACCOUNTS] |

### Return type

[**ReportsPaginatedResponse**](ReportsPaginatedResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for List Report requests |  -  |
| **0** | Error response |  -  |

