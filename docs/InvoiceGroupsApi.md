# InvoiceGroupsApi

All URIs are relative to *https://api.togai.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addInvoiceGroupAccounts**](InvoiceGroupsApi.md#addInvoiceGroupAccounts) | **POST** /invoice_groups/{invoice_group_id}/add_accounts | Add accounts to an invoice group |
| [**createInvoiceGroup**](InvoiceGroupsApi.md#createInvoiceGroup) | **POST** /invoice_groups | Create an invoice group |
| [**getInvoiceGroup**](InvoiceGroupsApi.md#getInvoiceGroup) | **GET** /invoice_groups/{invoice_group_id} | Get information of an invoice group |
| [**listInvoiceGroups**](InvoiceGroupsApi.md#listInvoiceGroups) | **GET** /invoice_groups | List Invoice Groups |
| [**removeInvoiceGroupAccounts**](InvoiceGroupsApi.md#removeInvoiceGroupAccounts) | **POST** /invoice_groups/{invoice_group_id}/remove_accounts | Remove accounts from an invoice group. Removing all accounts will also delete the invoice group |


<a id="addInvoiceGroupAccounts"></a>
# **addInvoiceGroupAccounts**
> InvoiceGroups addInvoiceGroupAccounts(invoiceGroupId, updateInvoiceGroupAccounts)

Add accounts to an invoice group

This API let’s you to add accounts to an invoice group

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.InvoiceGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    InvoiceGroupsApi apiInstance = new InvoiceGroupsApi(defaultClient);
    String invoiceGroupId = "inv_grp.20rqjgFJf2O.ejl25"; // String | 
    UpdateInvoiceGroupAccounts updateInvoiceGroupAccounts = new UpdateInvoiceGroupAccounts(); // UpdateInvoiceGroupAccounts | Payload to add or remove accounts to/from an invoice group
    try {
      InvoiceGroups result = apiInstance.addInvoiceGroupAccounts(invoiceGroupId, updateInvoiceGroupAccounts);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceGroupsApi#addInvoiceGroupAccounts");
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
| **invoiceGroupId** | **String**|  | |
| **updateInvoiceGroupAccounts** | [**UpdateInvoiceGroupAccounts**](UpdateInvoiceGroupAccounts.md)| Payload to add or remove accounts to/from an invoice group | |

### Return type

[**InvoiceGroups**](InvoiceGroups.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response to create invoice group request |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a id="createInvoiceGroup"></a>
# **createInvoiceGroup**
> InvoiceGroups createInvoiceGroup(createInvoiceGroupRequest)

Create an invoice group

This API let’s you to create an invoice group

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.InvoiceGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    InvoiceGroupsApi apiInstance = new InvoiceGroupsApi(defaultClient);
    CreateInvoiceGroupRequest createInvoiceGroupRequest = new CreateInvoiceGroupRequest(); // CreateInvoiceGroupRequest | Payload to approve or decline a proposal
    try {
      InvoiceGroups result = apiInstance.createInvoiceGroup(createInvoiceGroupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceGroupsApi#createInvoiceGroup");
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
| **createInvoiceGroupRequest** | [**CreateInvoiceGroupRequest**](CreateInvoiceGroupRequest.md)| Payload to approve or decline a proposal | |

### Return type

[**InvoiceGroups**](InvoiceGroups.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response to create invoice group request |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a id="getInvoiceGroup"></a>
# **getInvoiceGroup**
> InvoiceGroupAccountsPaginatedResponse getInvoiceGroup(invoiceGroupId)

Get information of an invoice group

This API let’s you to get information of an invoice group

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.InvoiceGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    InvoiceGroupsApi apiInstance = new InvoiceGroupsApi(defaultClient);
    String invoiceGroupId = "inv_grp.20rqjgFJf2O.ejl25"; // String | 
    try {
      InvoiceGroupAccountsPaginatedResponse result = apiInstance.getInvoiceGroup(invoiceGroupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceGroupsApi#getInvoiceGroup");
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
| **invoiceGroupId** | **String**|  | |

### Return type

[**InvoiceGroupAccountsPaginatedResponse**](InvoiceGroupAccountsPaginatedResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response to get invoice group request |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a id="listInvoiceGroups"></a>
# **listInvoiceGroups**
> InvoiceGroupPaginatedResponse listInvoiceGroups()

List Invoice Groups

This API let’s you to list invoice groups

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.InvoiceGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    InvoiceGroupsApi apiInstance = new InvoiceGroupsApi(defaultClient);
    try {
      InvoiceGroupPaginatedResponse result = apiInstance.listInvoiceGroups();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceGroupsApi#listInvoiceGroups");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InvoiceGroupPaginatedResponse**](InvoiceGroupPaginatedResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response to get invoice group request |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a id="removeInvoiceGroupAccounts"></a>
# **removeInvoiceGroupAccounts**
> BaseSuccessResponse removeInvoiceGroupAccounts(invoiceGroupId, updateInvoiceGroupAccounts)

Remove accounts from an invoice group. Removing all accounts will also delete the invoice group

This API let’s you to remove accounts from an invoice group. Removing all accounts will also delete the invoice group

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.InvoiceGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    InvoiceGroupsApi apiInstance = new InvoiceGroupsApi(defaultClient);
    String invoiceGroupId = "inv_grp.20rqjgFJf2O.ejl25"; // String | 
    UpdateInvoiceGroupAccounts updateInvoiceGroupAccounts = new UpdateInvoiceGroupAccounts(); // UpdateInvoiceGroupAccounts | Payload to add or remove accounts to/from an invoice group
    try {
      BaseSuccessResponse result = apiInstance.removeInvoiceGroupAccounts(invoiceGroupId, updateInvoiceGroupAccounts);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoiceGroupsApi#removeInvoiceGroupAccounts");
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
| **invoiceGroupId** | **String**|  | |
| **updateInvoiceGroupAccounts** | [**UpdateInvoiceGroupAccounts**](UpdateInvoiceGroupAccounts.md)| Payload to add or remove accounts to/from an invoice group | |

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
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

