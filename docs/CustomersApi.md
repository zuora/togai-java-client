# CustomersApi

All URIs are relative to *https://sandbox-api.togai.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCustomer**](CustomersApi.md#createCustomer) | **POST** customers | Create a customer |
| [**deleteCustomer**](CustomersApi.md#deleteCustomer) | **DELETE** customers/{customer_id} | Delete a customer |
| [**getCustomer**](CustomersApi.md#getCustomer) | **GET** customers/{customer_id} | Get a customer |
| [**getCustomers**](CustomersApi.md#getCustomers) | **GET** customers | List customers |
| [**updateCustomer**](CustomersApi.md#updateCustomer) | **PATCH** customers/{customer_id} | Update a customer |



## createCustomer

> CreateCustomerResponse createCustomer(createCustomerRequest)

Create a customer

Create a customer and a default account corresponding to it

### Example

```java
// Import classes:
import com.togai.core.service.client.ApiClient;
import com.togai.core.service.client.ApiException;
import com.togai.core.service.client.Configuration;
import com.togai.core.service.client.auth.*;
import com.togai.core.service.client.models.*;
import com.togai.core.service.client.CustomersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox-api.togai.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CustomersApi apiInstance = new CustomersApi(defaultClient);
        CreateCustomerRequest createCustomerRequest = new CreateCustomerRequest(); // CreateCustomerRequest | Payload to create customer
        try {
            CreateCustomerResponse result = apiInstance.createCustomer(createCustomerRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomersApi#createCustomer");
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
| **createCustomerRequest** | [**CreateCustomerRequest**](CreateCustomerRequest.md)| Payload to create customer | |

### Return type

[**CreateCustomerResponse**](CreateCustomerResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response for Create customer request |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |


## deleteCustomer

> BaseSuccessResponse deleteCustomer(customerId)

Delete a customer

Delete a customer by id

### Example

```java
// Import classes:
import com.togai.core.service.client.ApiClient;
import com.togai.core.service.client.ApiException;
import com.togai.core.service.client.Configuration;
import com.togai.core.service.client.auth.*;
import com.togai.core.service.client.models.*;
import com.togai.core.service.client.CustomersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox-api.togai.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CustomersApi apiInstance = new CustomersApi(defaultClient);
        String customerId = "customerId_example"; // String | 
        try {
            BaseSuccessResponse result = apiInstance.deleteCustomer(customerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomersApi#deleteCustomer");
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
| **customerId** | **String**|  | |

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


## getCustomer

> Customer getCustomer(customerId)

Get a customer

Get a customer by id

### Example

```java
// Import classes:
import com.togai.core.service.client.ApiClient;
import com.togai.core.service.client.ApiException;
import com.togai.core.service.client.Configuration;
import com.togai.core.service.client.auth.*;
import com.togai.core.service.client.models.*;
import com.togai.core.service.client.CustomersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox-api.togai.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CustomersApi apiInstance = new CustomersApi(defaultClient);
        String customerId = "customerId_example"; // String | 
        try {
            Customer result = apiInstance.getCustomer(customerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomersApi#getCustomer");
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
| **customerId** | **String**|  | |

### Return type

[**Customer**](Customer.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for Get customer requests |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |


## getCustomers

> CustomerPaginatedResponse getCustomers(nextToken, pageSize)

List customers

List customers with pagination and sort

### Example

```java
// Import classes:
import com.togai.core.service.client.ApiClient;
import com.togai.core.service.client.ApiException;
import com.togai.core.service.client.Configuration;
import com.togai.core.service.client.auth.*;
import com.togai.core.service.client.models.*;
import com.togai.core.service.client.CustomersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox-api.togai.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CustomersApi apiInstance = new CustomersApi(defaultClient);
        String nextToken = "eyJsYXN0SXRlbUlkIjogInN0cmluZyIsICJwYWdlU2l6ZSI6IDEyMywgInNvcnRPcmRlciI6ICJhc2MifQ=="; // String | 
        String pageSize = "10"; // String | 
        try {
            CustomerPaginatedResponse result = apiInstance.getCustomers(nextToken, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomersApi#getCustomers");
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
| **pageSize** | **String**|  | [optional] |

### Return type

[**CustomerPaginatedResponse**](CustomerPaginatedResponse.md)

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


## updateCustomer

> Customer updateCustomer(customerId, updateCustomerRequest)

Update a customer

Update a customer by id

### Example

```java
// Import classes:
import com.togai.core.service.client.ApiClient;
import com.togai.core.service.client.ApiException;
import com.togai.core.service.client.Configuration;
import com.togai.core.service.client.auth.*;
import com.togai.core.service.client.models.*;
import com.togai.core.service.client.CustomersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox-api.togai.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CustomersApi apiInstance = new CustomersApi(defaultClient);
        String customerId = "customerId_example"; // String | 
        UpdateCustomerRequest updateCustomerRequest = new UpdateCustomerRequest(); // UpdateCustomerRequest | Payload to update customer
        try {
            Customer result = apiInstance.updateCustomer(customerId, updateCustomerRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomersApi#updateCustomer");
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
| **customerId** | **String**|  | |
| **updateCustomerRequest** | [**UpdateCustomerRequest**](UpdateCustomerRequest.md)| Payload to update customer | |

### Return type

[**Customer**](Customer.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for Get customer requests |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

