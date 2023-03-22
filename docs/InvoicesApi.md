# InvoicesApi

All URIs are relative to *https://api.togai.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getInvoice**](InvoicesApi.md#getInvoice) | **GET** /invoices/{invoice_id} | Get an invoice |
| [**listInvoices**](InvoicesApi.md#listInvoices) | **GET** /invoices | List invoices |


<a name="getInvoice"></a>
# **getInvoice**
> Invoice getInvoice(invoiceId)

Get an invoice

Get invoice

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    String invoiceId = "invoiceId_example"; // String | 
    try {
      Invoice result = apiInstance.getInvoice(invoiceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getInvoice");
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
| **invoiceId** | **String**|  | |

### Return type

[**Invoice**](Invoice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for Get invoice requests |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a name="listInvoices"></a>
# **listInvoices**
> ListInvoicesResponse listInvoices(nextToken, status, accountId, customerId, pageSize, startTime, endTime)

List invoices

List invoices

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    String nextToken = "eyJsYXN0SXRlbUlkIjogInN0cmluZyIsICJwYWdlU2l6ZSI6IDEyMywgInNvcnRPcmRlciI6ICJhc2MifQ=="; // String | Pagination token used as a marker to get records from next page.
    String status = "PROCESSED"; // String | Filter option to filter by status.
    String accountId = "1234"; // String | Filter option to filter based on account id.
    String customerId = "1234"; // String | Filter option to filter based on customer id.
    Integer pageSize = 10; // Integer | Maximum page size expected by client to return the record list.    NOTE: Max page size cannot be more than 50. Also 50 is the default page size if no value is provided.
    Long startTime = 1650110402000L; // Long | Start time filter in epoch milli seconds
    Long endTime = 1650110402000L; // Long | End time filter in epoch milli seconds
    try {
      ListInvoicesResponse result = apiInstance.listInvoices(nextToken, status, accountId, customerId, pageSize, startTime, endTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#listInvoices");
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
| **nextToken** | **String**| Pagination token used as a marker to get records from next page. | [optional] |
| **status** | **String**| Filter option to filter by status. | [optional] |
| **accountId** | **String**| Filter option to filter based on account id. | [optional] |
| **customerId** | **String**| Filter option to filter based on customer id. | [optional] |
| **pageSize** | **Integer**| Maximum page size expected by client to return the record list.    NOTE: Max page size cannot be more than 50. Also 50 is the default page size if no value is provided. | [optional] |
| **startTime** | **Long**| Start time filter in epoch milli seconds | [optional] |
| **endTime** | **Long**| End time filter in epoch milli seconds | [optional] |

### Return type

[**ListInvoicesResponse**](ListInvoicesResponse.md)

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
| **403** | Credential does not have access to this operation. |  -  |
| **422** | Unable to process the query parameters provided. Please check our docs for the api limits - https://togai.io/docs/limits. |  -  |
| **429** | Request throttled. Please check the response message on the failure details. |  -  |
| **0** | Error response |  -  |

