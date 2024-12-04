# AccountsApi

All URIs are relative to *https://api.togai.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addAliases**](AccountsApi.md#addAliases) | **POST** /accounts/{account_id}/add_aliases | Add Aliases to account |
| [**createAccount**](AccountsApi.md#createAccount) | **POST** /accounts | Create an account |
| [**createProposal**](AccountsApi.md#createProposal) | **POST** /accounts/{account_id}/purchase_proposals | (DEPRECATED) Propose a purchase of a plan |
| [**deleteAccount**](AccountsApi.md#deleteAccount) | **DELETE** /accounts/{account_id} | Delete an account |
| [**getAccount**](AccountsApi.md#getAccount) | **GET** /accounts/{account_id} | Get an account |
| [**getAccounts**](AccountsApi.md#getAccounts) | **GET** /accounts | List accounts of customer |
| [**getPricingSchedules**](AccountsApi.md#getPricingSchedules) | **GET** /accounts/{account_id}/pricing_schedules | (DEPRECATED) List pricing schedules of an account |
| [**getProposal**](AccountsApi.md#getProposal) | **GET** /purchase_proposals/{purchase_proposal_id} | (DEPRECATED) Get proposal information |
| [**getPurchase**](AccountsApi.md#getPurchase) | **GET** /purchases/{purchase_id} | (DEPRECATED) Get a specific purchase of an account |
| [**initiateOneTimeEntitlementPlan**](AccountsApi.md#initiateOneTimeEntitlementPlan) | **POST** /accounts/{account_id}/purchases | (DEPRECATED) Initiate a purchase |
| [**listAccountAliases**](AccountsApi.md#listAccountAliases) | **GET** /accounts/{account_id}/account_aliases | Get all aliases of an account |
| [**listAccountProposals**](AccountsApi.md#listAccountProposals) | **GET** /accounts/{account_id}/purchase_proposals | (DEPRECATED) List all proposals of an account |
| [**listAccountPurchases**](AccountsApi.md#listAccountPurchases) | **GET** /accounts/{account_id}/purchases | (DEPRECATED) Get all purchases for an account |
| [**removeAliases**](AccountsApi.md#removeAliases) | **POST** /accounts/{account_id}/remove_aliases | Remove Aliases to account |
| [**updateAccount**](AccountsApi.md#updateAccount) | **PATCH** /accounts/{account_id} | Update an account |
| [**updatePricingSchedule**](AccountsApi.md#updatePricingSchedule) | **POST** /accounts/{account_id}/price_plans | (DEPRECATED) Dissociate or associate a price plan with an account |
| [**updatePricingScheduleBatch**](AccountsApi.md#updatePricingScheduleBatch) | **POST** /accounts/{account_id}/edit_schedules | (DEPRECATED) Edit schedules of an account. |
| [**updateProposalStatus**](AccountsApi.md#updateProposalStatus) | **POST** /purchase_proposals/{purchase_proposal_id}/update_status | (DEPRECATED) Approve or decline a purchase of a billing plan |


<a id="addAliases"></a>
# **addAliases**
> Account addAliases(accountId, addAccountAliasesRequest)

Add Aliases to account

Add aliases to an account using customer_id and account_id.

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    String accountId = "ACC00001"; // String | account_id corresponding to an account
    AddAccountAliasesRequest addAccountAliasesRequest = new AddAccountAliasesRequest(); // AddAccountAliasesRequest | Payload to add aliases to account
    try {
      Account result = apiInstance.addAliases(accountId, addAccountAliasesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#addAliases");
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
| **addAccountAliasesRequest** | [**AddAccountAliasesRequest**](AddAccountAliasesRequest.md)| Payload to add aliases to account | |

### Return type

[**Account**](Account.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for Create and Get account requests |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a id="createAccount"></a>
# **createAccount**
> Account createAccount(createAccountRequest)

Create an account

This API let’s you to create an account for a customer using customer_id.

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    CreateAccountRequest createAccountRequest = new CreateAccountRequest(); // CreateAccountRequest | Payload to create account
    try {
      Account result = apiInstance.createAccount(createAccountRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#createAccount");
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
| **createAccountRequest** | [**CreateAccountRequest**](CreateAccountRequest.md)| Payload to create account | |

### Return type

[**Account**](Account.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response for Create and Get account requests |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a id="createProposal"></a>
# **createProposal**
> Proposal createProposal(accountId, createProposalRequest)

(DEPRECATED) Propose a purchase of a plan

This API let’s you to create a proposal of a billing/entitlement plan for an account

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    String accountId = "ACC00001"; // String | account_id corresponding to an account
    CreateProposalRequest createProposalRequest = new CreateProposalRequest(); // CreateProposalRequest | Payload to initiate a proposal
    try {
      Proposal result = apiInstance.createProposal(accountId, createProposalRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#createProposal");
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
| **createProposalRequest** | [**CreateProposalRequest**](CreateProposalRequest.md)| Payload to initiate a proposal | |

### Return type

[**Proposal**](Proposal.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response to create proposal request |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a id="deleteAccount"></a>
# **deleteAccount**
> BaseSuccessResponse deleteAccount(accountId)

Delete an account

This API let’s you to delete a customer using customer_id and account_id.

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    String accountId = "ACC00001"; // String | account_id corresponding to an account
    try {
      BaseSuccessResponse result = apiInstance.deleteAccount(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#deleteAccount");
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
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a id="getAccount"></a>
# **getAccount**
> Account getAccount(accountId, effectiveOn, includeGroupDetails)

Get an account

Get account information using customer_id and account_id.

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    String accountId = "ACC00001"; // String | account_id corresponding to an account
    OffsetDateTime effectiveOn = OffsetDateTime.now(); // OffsetDateTime | 
    Boolean includeGroupDetails = true; // Boolean | 
    try {
      Account result = apiInstance.getAccount(accountId, effectiveOn, includeGroupDetails);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getAccount");
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
| **effectiveOn** | **OffsetDateTime**|  | [optional] |
| **includeGroupDetails** | **Boolean**|  | [optional] |

### Return type

[**Account**](Account.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for Create and Get account requests |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a id="getAccounts"></a>
# **getAccounts**
> AccountPaginatedResponse getAccounts(nextToken, pageSize)

List accounts of customer

Returns a list of accounts of a customer with pagination and sort.

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    String nextToken = "eyJsYXN0SXRlbUlkIjogInN0cmluZyIsICJwYWdlU2l6ZSI6IDEwMCwgInNvcnRPcmRlciI6ICJhc2MifQ=="; // String | 
    BigDecimal pageSize = new BigDecimal("10"); // BigDecimal | 
    try {
      AccountPaginatedResponse result = apiInstance.getAccounts(nextToken, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getAccounts");
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

[**AccountPaginatedResponse**](AccountPaginatedResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for list customers request |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a id="getPricingSchedules"></a>
# **getPricingSchedules**
> PricingSchedulePaginatedResponse getPricingSchedules(accountId, nextToken, pageSize, startDate, endDate, includePricePlanInfo, compact)

(DEPRECATED) List pricing schedules of an account

Returns a list of pricing schedules of an account with pagination and sort.

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    String accountId = "ACC00001"; // String | account_id corresponding to an account
    String nextToken = "eyJsYXN0SXRlbUlkIjogInN0cmluZyIsICJwYWdlU2l6ZSI6IDEwMCwgInNvcnRPcmRlciI6ICJhc2MifQ=="; // String | 
    BigDecimal pageSize = new BigDecimal("10"); // BigDecimal | 
    String startDate = "2023-03-30T10:41:10.088499"; // String | 
    String endDate = "2099-03-30T10:41:10.088499"; // String | 
    Boolean includePricePlanInfo = true; // Boolean | 
    Boolean compact = false; // Boolean | 
    try {
      PricingSchedulePaginatedResponse result = apiInstance.getPricingSchedules(accountId, nextToken, pageSize, startDate, endDate, includePricePlanInfo, compact);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getPricingSchedules");
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
| **nextToken** | **String**|  | [optional] |
| **pageSize** | **BigDecimal**|  | [optional] |
| **startDate** | **String**|  | [optional] |
| **endDate** | **String**|  | [optional] |
| **includePricePlanInfo** | **Boolean**|  | [optional] |
| **compact** | **Boolean**|  | [optional] |

### Return type

[**PricingSchedulePaginatedResponse**](PricingSchedulePaginatedResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for list pricing schedules request |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a id="getProposal"></a>
# **getProposal**
> GetProposalResponse getProposal(purchaseProposalId)

(DEPRECATED) Get proposal information

Get proposal information

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    String purchaseProposalId = "purchase.20rqjgFJf2O.ejl25"; // String | 
    try {
      GetProposalResponse result = apiInstance.getProposal(purchaseProposalId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getProposal");
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
| **purchaseProposalId** | **String**|  | |

### Return type

[**GetProposalResponse**](GetProposalResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for getting a specific proposal |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a id="getPurchase"></a>
# **getPurchase**
> GetPurchaseResponse getPurchase(purchaseId)

(DEPRECATED) Get a specific purchase of an account

Get purchase information of an account for a specific plan using account_id and price_plan_id

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    String purchaseId = "purchase.1zYnCiM9Bpg.lv25y"; // String | 
    try {
      GetPurchaseResponse result = apiInstance.getPurchase(purchaseId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getPurchase");
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
| **purchaseId** | **String**|  | |

### Return type

[**GetPurchaseResponse**](GetPurchaseResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for getting a specific purchase detail of an account |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a id="initiateOneTimeEntitlementPlan"></a>
# **initiateOneTimeEntitlementPlan**
> Purchase initiateOneTimeEntitlementPlan(accountId, createPurchaseRequest)

(DEPRECATED) Initiate a purchase

This API let’s you to initiate a purchase for an account

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    String accountId = "ACC00001"; // String | account_id corresponding to an account
    CreatePurchaseRequest createPurchaseRequest = new CreatePurchaseRequest(); // CreatePurchaseRequest | Payload to initiate a purchase
    try {
      Purchase result = apiInstance.initiateOneTimeEntitlementPlan(accountId, createPurchaseRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#initiateOneTimeEntitlementPlan");
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
| **createPurchaseRequest** | [**CreatePurchaseRequest**](CreatePurchaseRequest.md)| Payload to initiate a purchase | |

### Return type

[**Purchase**](Purchase.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for initiation of a purchase of entitlement plan for an account |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a id="listAccountAliases"></a>
# **listAccountAliases**
> AccountAliasesPaginatedResponse listAccountAliases(accountId)

Get all aliases of an account

Get all aliases of an account using account_id

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    String accountId = "ACC00001"; // String | account_id corresponding to an account
    try {
      AccountAliasesPaginatedResponse result = apiInstance.listAccountAliases(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#listAccountAliases");
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

[**AccountAliasesPaginatedResponse**](AccountAliasesPaginatedResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for list account aliases request |  -  |
| **0** | Error response |  -  |

<a id="listAccountProposals"></a>
# **listAccountProposals**
> ProposalsPaginatedResponse listAccountProposals(accountId)

(DEPRECATED) List all proposals of an account

List all proposals of an account

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    String accountId = "ACC00001"; // String | account_id corresponding to an account
    try {
      ProposalsPaginatedResponse result = apiInstance.listAccountProposals(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#listAccountProposals");
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

[**ProposalsPaginatedResponse**](ProposalsPaginatedResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for list proposals of an account request |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a id="listAccountPurchases"></a>
# **listAccountPurchases**
> PurchasePaginatedListData listAccountPurchases(accountId)

(DEPRECATED) Get all purchases for an account

Get Purchase information for an account using account_id and price_plan_id

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    String accountId = "ACC00001"; // String | account_id corresponding to an account
    try {
      PurchasePaginatedListData result = apiInstance.listAccountPurchases(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#listAccountPurchases");
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

[**PurchasePaginatedListData**](PurchasePaginatedListData.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for list Purchase for an account request |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a id="removeAliases"></a>
# **removeAliases**
> Account removeAliases(accountId, removeAccountAliasesRequest)

Remove Aliases to account

Remove existing aliases tagged to an account using this API

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    String accountId = "ACC00001"; // String | account_id corresponding to an account
    RemoveAccountAliasesRequest removeAccountAliasesRequest = new RemoveAccountAliasesRequest(); // RemoveAccountAliasesRequest | Payload to remove aliases from account
    try {
      Account result = apiInstance.removeAliases(accountId, removeAccountAliasesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#removeAliases");
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
| **removeAccountAliasesRequest** | [**RemoveAccountAliasesRequest**](RemoveAccountAliasesRequest.md)| Payload to remove aliases from account | |

### Return type

[**Account**](Account.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for Create and Get account requests |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a id="updateAccount"></a>
# **updateAccount**
> Account updateAccount(accountId, updateAccountRequest)

Update an account

This API let’s you to update an account’s information using customer_id and account_id.

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    String accountId = "ACC00001"; // String | account_id corresponding to an account
    UpdateAccountRequest updateAccountRequest = new UpdateAccountRequest(); // UpdateAccountRequest | Payload to update account
    try {
      Account result = apiInstance.updateAccount(accountId, updateAccountRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#updateAccount");
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
| **updateAccountRequest** | [**UpdateAccountRequest**](UpdateAccountRequest.md)| Payload to update account | |

### Return type

[**Account**](Account.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for Create and Get account requests |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a id="updatePricingSchedule"></a>
# **updatePricingSchedule**
> UpdatePricingScheduleResponse updatePricingSchedule(accountId, updatePricingScheduleRequestWithActions)

(DEPRECATED) Dissociate or associate a price plan with an account

This API let’s you to detach or attach a price plan with an existing account

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    String accountId = "ACC00001"; // String | account_id corresponding to an account
    UpdatePricingScheduleRequestWithActions updatePricingScheduleRequestWithActions = new UpdatePricingScheduleRequestWithActions(); // UpdatePricingScheduleRequestWithActions | Payload to associate or dissociate a price plan to an account with actions
    try {
      UpdatePricingScheduleResponse result = apiInstance.updatePricingSchedule(accountId, updatePricingScheduleRequestWithActions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#updatePricingSchedule");
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
| **updatePricingScheduleRequestWithActions** | [**UpdatePricingScheduleRequestWithActions**](UpdatePricingScheduleRequestWithActions.md)| Payload to associate or dissociate a price plan to an account with actions | |

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
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a id="updatePricingScheduleBatch"></a>
# **updatePricingScheduleBatch**
> UpdatePricingScheduleResponse updatePricingScheduleBatch(accountId, editPricingScheduleRequest, dryRun)

(DEPRECATED) Edit schedules of an account.

This API let’s you to detach/attach one or more price plans from/to an existing account

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    String accountId = "ACC00001"; // String | account_id corresponding to an account
    EditPricingScheduleRequest editPricingScheduleRequest = new EditPricingScheduleRequest(); // EditPricingScheduleRequest | Payload to dis/associate one or more price plans to an account
    Boolean dryRun = false; // Boolean | 
    try {
      UpdatePricingScheduleResponse result = apiInstance.updatePricingScheduleBatch(accountId, editPricingScheduleRequest, dryRun);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#updatePricingScheduleBatch");
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
| **editPricingScheduleRequest** | [**EditPricingScheduleRequest**](EditPricingScheduleRequest.md)| Payload to dis/associate one or more price plans to an account | |
| **dryRun** | **Boolean**|  | [optional] |

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
| **200** | Response for edit pricing schedule request |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a id="updateProposalStatus"></a>
# **updateProposalStatus**
> Proposal updateProposalStatus(purchaseProposalId, updateProposalStatus)

(DEPRECATED) Approve or decline a purchase of a billing plan

This API let’s you to approve or decline a proposal of a billing plan for an account

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    String purchaseProposalId = "purchase.20rqjgFJf2O.ejl25"; // String | 
    UpdateProposalStatus updateProposalStatus = new UpdateProposalStatus(); // UpdateProposalStatus | Payload to approve or decline a proposal
    try {
      Proposal result = apiInstance.updateProposalStatus(purchaseProposalId, updateProposalStatus);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#updateProposalStatus");
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
| **purchaseProposalId** | **String**|  | |
| **updateProposalStatus** | [**UpdateProposalStatus**](UpdateProposalStatus.md)| Payload to approve or decline a proposal | |

### Return type

[**Proposal**](Proposal.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response to update proposal status request |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

