# SettingsApi

All URIs are relative to *https://api.togai.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSetting**](SettingsApi.md#getSetting) | **GET** /settings/{setting_id_str} | Get a setting |
| [**insertSetting**](SettingsApi.md#insertSetting) | **POST** /settings | Create a setting |
| [**listSetting**](SettingsApi.md#listSetting) | **GET** /settings | Lists settings |
| [**updateSetting**](SettingsApi.md#updateSetting) | **PATCH** /settings/{setting_id_str} | Update a setting |


<a name="getSetting"></a>
# **getSetting**
> Setting getSetting(settingIdStr)

Get a setting

Get a setting

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.SettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SettingsApi apiInstance = new SettingsApi(defaultClient);
    String settingIdStr = "setting.USER.success_threshold.ACCOUNT.G234DZZKBKACATFFGVGEMERFI"; // String | 
    try {
      Setting result = apiInstance.getSetting(settingIdStr);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SettingsApi#getSetting");
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
| **settingIdStr** | **String**|  | |

### Return type

[**Setting**](Setting.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for insert and update settings request |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a name="insertSetting"></a>
# **insertSetting**
> Setting insertSetting(setting)

Create a setting

Create a setting

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.SettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SettingsApi apiInstance = new SettingsApi(defaultClient);
    Setting setting = new Setting(); // Setting | Payload to insert setting
    try {
      Setting result = apiInstance.insertSetting(setting);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SettingsApi#insertSetting");
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
| **setting** | [**Setting**](Setting.md)| Payload to insert setting | |

### Return type

[**Setting**](Setting.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response for insert and update settings request |  -  |
| **204** | Response for insert and update settings request |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a name="listSetting"></a>
# **listSetting**
> SettingPaginatedResponse listSetting(entityType, entityId, settingId, namespace)

Lists settings

List settings

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.SettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SettingsApi apiInstance = new SettingsApi(defaultClient);
    String entityType = "ACCOUNT"; // String | 
    String entityId = "acc_X1Df3sRf3"; // String | 
    String settingId = "settingId_example"; // String | 
    String namespace = "USER"; // String | 
    try {
      SettingPaginatedResponse result = apiInstance.listSetting(entityType, entityId, settingId, namespace);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SettingsApi#listSetting");
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
| **entityType** | **String**|  | [optional] |
| **entityId** | **String**|  | [optional] |
| **settingId** | **String**|  | [optional] |
| **namespace** | **String**|  | [optional] |

### Return type

[**SettingPaginatedResponse**](SettingPaginatedResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for list setting request |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

<a name="updateSetting"></a>
# **updateSetting**
> Setting updateSetting(settingIdStr, updateSettingRequest)

Update a setting

Update a setting

### Example
```java
// Import classes:
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.Configuration;
import com.togai.client.auth.*;
import com.togai.client.models.*;
import com.togai.client.api.SettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.togai.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SettingsApi apiInstance = new SettingsApi(defaultClient);
    String settingIdStr = "setting.USER.success_threshold.ACCOUNT.G234DZZKBKACATFFGVGEMERFI"; // String | 
    UpdateSettingRequest updateSettingRequest = new UpdateSettingRequest(); // UpdateSettingRequest | Payload to update setting
    try {
      Setting result = apiInstance.updateSetting(settingIdStr, updateSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SettingsApi#updateSetting");
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
| **settingIdStr** | **String**|  | |
| **updateSettingRequest** | [**UpdateSettingRequest**](UpdateSettingRequest.md)| Payload to update setting | |

### Return type

[**Setting**](Setting.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Response for insert and update settings request |  -  |
| **204** | Response for insert and update settings request |  -  |
| **400** | Error response |  -  |
| **401** | Error response |  -  |
| **403** | Error response |  -  |
| **404** | Error response |  -  |
| **429** | Error response |  -  |
| **0** | Error response |  -  |

