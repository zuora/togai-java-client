# InvoicesApi

All URIs are relative to *https://api.togai.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCustomInvoice**](InvoicesApi.md#createCustomInvoice) | **POST** /invoices | Create a custom invoice for an account |
| [**createInvoiceBillRun**](InvoicesApi.md#createInvoiceBillRun) | **POST** /invoices/bill_runs | Create a bill run job request |
| [**deleteCustomInvoice**](InvoicesApi.md#deleteCustomInvoice) | **DELETE** /invoices/{invoice_id} | Delete a custom invoice in DRAFT state |
| [**getInvoice**](InvoicesApi.md#getInvoice) | **GET** /invoices/{invoice_id} | Get an invoice |
| [**listInvoices**](InvoicesApi.md#listInvoices) | **GET** /invoices | List invoices |
| [**listInvoicesForBillRun**](InvoicesApi.md#listInvoicesForBillRun) | **GET** /invoices/bill_runs | List invoices eligible for bill run |
| [**listPricingRuleLogs**](InvoicesApi.md#listPricingRuleLogs) | **GET** /invoice/{invoice_id}/pricing_rules_logs | List pricing rule logs |
| [**manageMiscellaneousChargesInAccount**](InvoicesApi.md#manageMiscellaneousChargesInAccount) | **PUT** /accounts/{account_id}/miscellaneous_charges | Add or update miscellaneous charges in upcoming Invoice for a account |
| [**manageMiscellaneousChargesInInvoice**](InvoicesApi.md#manageMiscellaneousChargesInInvoice) | **PUT** /invoices/{invoice_id}/miscellaneous_charges | Add or update miscellaneous charges in Invoice |
| [**updateInvoice**](InvoicesApi.md#updateInvoice) | **PATCH** /invoices/{invoice_id} | Update an invoice |


<a id="createCustomInvoice"></a>
# **createCustomInvoice**
> Invoice createCustomInvoice(createCustomInvoiceRequest)

Create a custom invoice for an account

Create a custom invoice for an account.

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
    CreateCustomInvoiceRequest createCustomInvoiceRequest = new CreateCustomInvoiceRequest(); // CreateCustomInvoiceRequest | Payload to create invoice
    try {
      Invoice result = apiInstance.createCustomInvoice(createCustomInvoiceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#createCustomInvoice");
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
| **createCustomInvoiceRequest** | [**CreateCustomInvoiceRequest**](CreateCustomInvoiceRequest.md)| Payload to create invoice | [optional] |

### Return type

[**Invoice**](Invoice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response for Get invoice requests |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a id="createInvoiceBillRun"></a>
# **createInvoiceBillRun**
> BaseSuccessResponse createInvoiceBillRun(requireConfirmation)

Create a bill run job request

Create a bill run job request

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
    Boolean requireConfirmation = false; // Boolean | Specifies whether to start a migration only after a confirmation
    try {
      BaseSuccessResponse result = apiInstance.createInvoiceBillRun(requireConfirmation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#createInvoiceBillRun");
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
| **requireConfirmation** | **Boolean**| Specifies whether to start a migration only after a confirmation | [optional] |

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

<a id="deleteCustomInvoice"></a>
# **deleteCustomInvoice**
> BaseSuccessResponse deleteCustomInvoice(invoiceId)

Delete a custom invoice in DRAFT state

Delete a custom invoice in DRAFT state.

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
    String invoiceId = "ACC001"; // String | 
    try {
      BaseSuccessResponse result = apiInstance.deleteCustomInvoice(invoiceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#deleteCustomInvoice");
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
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a id="getInvoice"></a>
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
    String invoiceId = "ACC001"; // String | 
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

<a id="listInvoices"></a>
# **listInvoices**
> ListInvoicesResponse listInvoices(nextToken, status, ownerId, customerId, pageSize, startTime, endTime)

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
    String ownerId = "ACC001"; // String | Filter option to filter based on owner id.
    String customerId = "1234"; // String | Filter option to filter based on customer id.
    Integer pageSize = 10; // Integer | Maximum page size expected by client to return the record list.    NOTE: Max page size cannot be more than 50. Also 50 is the default page size if no value is provided.
    Long startTime = 1650110402000L; // Long | Start time filter in epoch milli seconds
    Long endTime = 1650110402000L; // Long | End time filter in epoch milli seconds
    try {
      ListInvoicesResponse result = apiInstance.listInvoices(nextToken, status, ownerId, customerId, pageSize, startTime, endTime);
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
| **ownerId** | **String**| Filter option to filter based on owner id. | [optional] |
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

<a id="listInvoicesForBillRun"></a>
# **listInvoicesForBillRun**
> ListInvoicesResponse listInvoicesForBillRun(nextToken, status, ownerId, customerId, pageSize, startTime, endTime)

List invoices eligible for bill run

List invoices eligible for bill run

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
    String ownerId = "ACC001"; // String | Filter option to filter based on owner id.
    String customerId = "1234"; // String | Filter option to filter based on customer id.
    Integer pageSize = 10; // Integer | Maximum page size expected by client to return the record list.    NOTE: Max page size cannot be more than 50. Also 50 is the default page size if no value is provided.
    Long startTime = 1650110402000L; // Long | Start time filter in epoch milli seconds
    Long endTime = 1650110402000L; // Long | End time filter in epoch milli seconds
    try {
      ListInvoicesResponse result = apiInstance.listInvoicesForBillRun(nextToken, status, ownerId, customerId, pageSize, startTime, endTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#listInvoicesForBillRun");
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
| **ownerId** | **String**| Filter option to filter based on owner id. | [optional] |
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
| **200** | Response for Get invoice requests |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a id="listPricingRuleLogs"></a>
# **listPricingRuleLogs**
> PricingRulesLogsPaginatedResponse listPricingRuleLogs(invoiceId)

List pricing rule logs

List pricing rule logs

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
    String invoiceId = "ACC001"; // String | 
    try {
      PricingRulesLogsPaginatedResponse result = apiInstance.listPricingRuleLogs(invoiceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#listPricingRuleLogs");
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

[**PricingRulesLogsPaginatedResponse**](PricingRulesLogsPaginatedResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for list Invoice Pricing Rules Logs Request |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a id="manageMiscellaneousChargesInAccount"></a>
# **manageMiscellaneousChargesInAccount**
> MiscellaneousChargesResponse manageMiscellaneousChargesInAccount(accountId, manageMiscellaneousChargesRequest)

Add or update miscellaneous charges in upcoming Invoice for a account

Add or update miscellaneous charges in upcoming Invoice for a account

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
    String accountId = "ACC00001"; // String | account_id corresponding to an account
    ManageMiscellaneousChargesRequest manageMiscellaneousChargesRequest = new ManageMiscellaneousChargesRequest(); // ManageMiscellaneousChargesRequest | Payload to update custom line items
    try {
      MiscellaneousChargesResponse result = apiInstance.manageMiscellaneousChargesInAccount(accountId, manageMiscellaneousChargesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#manageMiscellaneousChargesInAccount");
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
| **manageMiscellaneousChargesRequest** | [**ManageMiscellaneousChargesRequest**](ManageMiscellaneousChargesRequest.md)| Payload to update custom line items | [optional] |

### Return type

[**MiscellaneousChargesResponse**](MiscellaneousChargesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for Miscellaneous Charges Request |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a id="manageMiscellaneousChargesInInvoice"></a>
# **manageMiscellaneousChargesInInvoice**
> MiscellaneousChargesResponse manageMiscellaneousChargesInInvoice(invoiceId, manageMiscellaneousChargesRequest)

Add or update miscellaneous charges in Invoice

Add or update miscellaneous charges in Invoice

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
    String invoiceId = "ACC001"; // String | 
    ManageMiscellaneousChargesRequest manageMiscellaneousChargesRequest = new ManageMiscellaneousChargesRequest(); // ManageMiscellaneousChargesRequest | Payload to update custom line items
    try {
      MiscellaneousChargesResponse result = apiInstance.manageMiscellaneousChargesInInvoice(invoiceId, manageMiscellaneousChargesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#manageMiscellaneousChargesInInvoice");
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
| **manageMiscellaneousChargesRequest** | [**ManageMiscellaneousChargesRequest**](ManageMiscellaneousChargesRequest.md)| Payload to update custom line items | [optional] |

### Return type

[**MiscellaneousChargesResponse**](MiscellaneousChargesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for Miscellaneous Charges Request |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a id="updateInvoice"></a>
# **updateInvoice**
> Invoice updateInvoice(invoiceId, updateInvoiceRequest)

Update an invoice

Update an invoice[Only CUSTOM invoices in DRAFT state support updating of all fields]. Updating status can be done for all invoice.

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
    String invoiceId = "ACC001"; // String | 
    UpdateInvoiceRequest updateInvoiceRequest = new UpdateInvoiceRequest(); // UpdateInvoiceRequest | Payload to update an invoice
    try {
      Invoice result = apiInstance.updateInvoice(invoiceId, updateInvoiceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#updateInvoice");
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
| **updateInvoiceRequest** | [**UpdateInvoiceRequest**](UpdateInvoiceRequest.md)| Payload to update an invoice | [optional] |

### Return type

[**Invoice**](Invoice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
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

