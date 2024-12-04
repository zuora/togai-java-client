# LicensesApi

All URIs are relative to *https://api.togai.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addLicenseUpdateEntry**](LicensesApi.md#addLicenseUpdateEntry) | **POST** /license_updates | Update a license entry |
| [**getLicenseUpdates**](LicensesApi.md#getLicenseUpdates) | **GET** /license_updates | Get a list of licenses updates |
| [**getNamedLicenseUpdates**](LicensesApi.md#getNamedLicenseUpdates) | **GET** /named_license_updates | Get a list of named licenses updates |
| [**updateLicenseEntryDetails**](LicensesApi.md#updateLicenseEntryDetails) | **PATCH** /license_updates/{license_id} | Update a license entry details |


<a id="addLicenseUpdateEntry"></a>
# **addLicenseUpdateEntry**
> LicenseUpdateResponse addLicenseUpdateEntry(licenseUpdateRequest)

Update a license entry

This API let’s you to add a license entry

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.LicensesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LicensesApi apiInstance = new LicensesApi(defaultClient);
    LicenseUpdateRequest licenseUpdateRequest = new LicenseUpdateRequest(); // LicenseUpdateRequest | 
    try {
      LicenseUpdateResponse result = apiInstance.addLicenseUpdateEntry(licenseUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LicensesApi#addLicenseUpdateEntry");
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
| **licenseUpdateRequest** | [**LicenseUpdateRequest**](LicenseUpdateRequest.md)|  | [optional] |

### Return type

[**LicenseUpdateResponse**](LicenseUpdateResponse.md)

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
| **422** | Unable to process the query parameters provided. Please check our docs for the api limits - https://togai.io/docs/limits. |  -  |
| **429** | Request throttled. Please check the response message on the failure details. |  -  |
| **0** | Error response |  -  |

<a id="getLicenseUpdates"></a>
# **getLicenseUpdates**
> GetLicenseUpdatesResponse getLicenseUpdates(nextToken, accountId, pageSize, licenseId, effectiveFrom)

Get a list of licenses updates

This API let’s you to fetch a list of licenses updates with multiple query parameters

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.LicensesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LicensesApi apiInstance = new LicensesApi(defaultClient);
    String nextToken = "eyJsYXN0SXRlbUlkIjogInN0cmluZyIsICJwYWdlU2l6ZSI6IDEyMywgInNvcnRPcmRlciI6ICJhc2MifQ=="; // String | Pagination token used as a marker to get records from next page.
    String accountId = "1234"; // String | Filter option to filter based on account id.
    Integer pageSize = 10; // Integer | Maximum page size expected by client to return the record list.    NOTE: Max page size cannot be more than 50. Also 50 is the default page size if no value is provided.
    String licenseId = "addon.1zYnCiM9Bpg.1zYn"; // String | License Id to filter
    OffsetDateTime effectiveFrom = OffsetDateTime.parse("2021-03-04T14:25:10Z"); // OffsetDateTime | effectiveFrom to filter
    try {
      GetLicenseUpdatesResponse result = apiInstance.getLicenseUpdates(nextToken, accountId, pageSize, licenseId, effectiveFrom);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LicensesApi#getLicenseUpdates");
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
| **accountId** | **String**| Filter option to filter based on account id. | [optional] |
| **pageSize** | **Integer**| Maximum page size expected by client to return the record list.    NOTE: Max page size cannot be more than 50. Also 50 is the default page size if no value is provided. | [optional] |
| **licenseId** | **String**| License Id to filter | [optional] |
| **effectiveFrom** | **OffsetDateTime**| effectiveFrom to filter | [optional] |

### Return type

[**GetLicenseUpdatesResponse**](GetLicenseUpdatesResponse.md)

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
| **403** | Credential does not have access to list licenses updates. |  -  |
| **422** | Unable to process the query parameters provided. Please check our docs for the api limits - https://togai.io/docs/limits. |  -  |
| **429** | Request throttled. Please check the response message on the failure details. |  -  |
| **0** | Error response |  -  |

<a id="getNamedLicenseUpdates"></a>
# **getNamedLicenseUpdates**
> NamedLicenseUpdatesPaginatedResponse getNamedLicenseUpdates()

Get a list of named licenses updates

This API let’s you to fetch a list of named licenses updates with multiple query parameters

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.LicensesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LicensesApi apiInstance = new LicensesApi(defaultClient);
    try {
      NamedLicenseUpdatesPaginatedResponse result = apiInstance.getNamedLicenseUpdates();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LicensesApi#getNamedLicenseUpdates");
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

[**NamedLicenseUpdatesPaginatedResponse**](NamedLicenseUpdatesPaginatedResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success response |  -  |
| **0** | Error response |  -  |

<a id="updateLicenseEntryDetails"></a>
# **updateLicenseEntryDetails**
> LicenseUpdateResponse updateLicenseEntryDetails(licenseId, licenseEntryDetailsUpdateRequest)

Update a license entry details

This API let’s you to update metadata of a license entry

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.LicensesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LicensesApi apiInstance = new LicensesApi(defaultClient);
    String licenseId = "addon.1zYnCiM9Bpg.1zYn"; // String | License Id to filter
    LicenseEntryDetailsUpdateRequest licenseEntryDetailsUpdateRequest = new LicenseEntryDetailsUpdateRequest(); // LicenseEntryDetailsUpdateRequest | 
    try {
      LicenseUpdateResponse result = apiInstance.updateLicenseEntryDetails(licenseId, licenseEntryDetailsUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LicensesApi#updateLicenseEntryDetails");
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
| **licenseId** | **String**| License Id to filter | [optional] |
| **licenseEntryDetailsUpdateRequest** | [**LicenseEntryDetailsUpdateRequest**](LicenseEntryDetailsUpdateRequest.md)|  | [optional] |

### Return type

[**LicenseUpdateResponse**](LicenseUpdateResponse.md)

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
| **403** | Credential does not have access to update a license entry. |  -  |
| **429** | Request throttled. Please check the response message on the failure details. |  -  |
| **0** | Error response |  -  |

