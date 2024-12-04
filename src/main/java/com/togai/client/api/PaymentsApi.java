/*
 * Togai Apis
 * APIs for Togai App
 *
 * The version of the OpenAPI document: 1.0
 * Contact: engg@togai.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.togai.client.api;

import com.togai.client.ApiCallback;
import com.togai.client.ApiClient;
import com.togai.client.ApiException;
import com.togai.client.ApiResponse;
import com.togai.client.Configuration;
import com.togai.client.Pair;
import com.togai.client.ProgressRequestBody;
import com.togai.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.togai.client.models.CreatePaymentRequest;
import com.togai.client.models.ErrorResponse;
import com.togai.client.models.ListPaymentResponse;
import com.togai.client.models.Payment;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PaymentsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PaymentsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for createPayments
     * @param createPaymentRequest Payload to create a payment (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Response for POST payments requests </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createPaymentsCall(CreatePaymentRequest createPaymentRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = createPaymentRequest;

        // create path and map variables
        String localVarPath = "/payments";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createPaymentsValidateBeforeCall(CreatePaymentRequest createPaymentRequest, final ApiCallback _callback) throws ApiException {
        return createPaymentsCall(createPaymentRequest, _callback);

    }

    /**
     * create payments
     * create payments
     * @param createPaymentRequest Payload to create a payment (optional)
     * @return Payment
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Response for POST payments requests </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public Payment createPayments(CreatePaymentRequest createPaymentRequest) throws ApiException {
        ApiResponse<Payment> localVarResp = createPaymentsWithHttpInfo(createPaymentRequest);
        return localVarResp.getData();
    }

    /**
     * create payments
     * create payments
     * @param createPaymentRequest Payload to create a payment (optional)
     * @return ApiResponse&lt;Payment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Response for POST payments requests </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Payment> createPaymentsWithHttpInfo(CreatePaymentRequest createPaymentRequest) throws ApiException {
        okhttp3.Call localVarCall = createPaymentsValidateBeforeCall(createPaymentRequest, null);
        Type localVarReturnType = new TypeToken<Payment>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * create payments (asynchronously)
     * create payments
     * @param createPaymentRequest Payload to create a payment (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Response for POST payments requests </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createPaymentsAsync(CreatePaymentRequest createPaymentRequest, final ApiCallback<Payment> _callback) throws ApiException {

        okhttp3.Call localVarCall = createPaymentsValidateBeforeCall(createPaymentRequest, _callback);
        Type localVarReturnType = new TypeToken<Payment>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPayment
     * @param paymentId  (required)
     * @param version Optional version to get a specific version. Gets latest version if it is not provided. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response for POST payments requests </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPaymentCall(String paymentId, Integer version, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/payments/{payment_id}"
            .replace("{" + "payment_id" + "}", localVarApiClient.escapeString(paymentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (version != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("version", version));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPaymentValidateBeforeCall(String paymentId, Integer version, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'paymentId' is set
        if (paymentId == null) {
            throw new ApiException("Missing the required parameter 'paymentId' when calling getPayment(Async)");
        }

        return getPaymentCall(paymentId, version, _callback);

    }

    /**
     * Get a payment
     * Get payment
     * @param paymentId  (required)
     * @param version Optional version to get a specific version. Gets latest version if it is not provided. (optional)
     * @return Payment
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response for POST payments requests </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public Payment getPayment(String paymentId, Integer version) throws ApiException {
        ApiResponse<Payment> localVarResp = getPaymentWithHttpInfo(paymentId, version);
        return localVarResp.getData();
    }

    /**
     * Get a payment
     * Get payment
     * @param paymentId  (required)
     * @param version Optional version to get a specific version. Gets latest version if it is not provided. (optional)
     * @return ApiResponse&lt;Payment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response for POST payments requests </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Payment> getPaymentWithHttpInfo(String paymentId, Integer version) throws ApiException {
        okhttp3.Call localVarCall = getPaymentValidateBeforeCall(paymentId, version, null);
        Type localVarReturnType = new TypeToken<Payment>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a payment (asynchronously)
     * Get payment
     * @param paymentId  (required)
     * @param version Optional version to get a specific version. Gets latest version if it is not provided. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response for POST payments requests </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPaymentAsync(String paymentId, Integer version, final ApiCallback<Payment> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPaymentValidateBeforeCall(paymentId, version, _callback);
        Type localVarReturnType = new TypeToken<Payment>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listPayments
     * @param nextToken Pagination token used as a marker to get records from next page. (optional)
     * @param pageSize Maximum page size expected by client to return the record list.    NOTE: Max page size cannot be more than 50. Also 50 is the default page size if no value is provided. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response for GET payments requests </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listPaymentsCall(String nextToken, Integer pageSize, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/payments";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (nextToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("nextToken", nextToken));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pageSize", pageSize));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listPaymentsValidateBeforeCall(String nextToken, Integer pageSize, final ApiCallback _callback) throws ApiException {
        return listPaymentsCall(nextToken, pageSize, _callback);

    }

    /**
     * List all payments
     * List all payments
     * @param nextToken Pagination token used as a marker to get records from next page. (optional)
     * @param pageSize Maximum page size expected by client to return the record list.    NOTE: Max page size cannot be more than 50. Also 50 is the default page size if no value is provided. (optional)
     * @return ListPaymentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response for GET payments requests </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ListPaymentResponse listPayments(String nextToken, Integer pageSize) throws ApiException {
        ApiResponse<ListPaymentResponse> localVarResp = listPaymentsWithHttpInfo(nextToken, pageSize);
        return localVarResp.getData();
    }

    /**
     * List all payments
     * List all payments
     * @param nextToken Pagination token used as a marker to get records from next page. (optional)
     * @param pageSize Maximum page size expected by client to return the record list.    NOTE: Max page size cannot be more than 50. Also 50 is the default page size if no value is provided. (optional)
     * @return ApiResponse&lt;ListPaymentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response for GET payments requests </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ListPaymentResponse> listPaymentsWithHttpInfo(String nextToken, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = listPaymentsValidateBeforeCall(nextToken, pageSize, null);
        Type localVarReturnType = new TypeToken<ListPaymentResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List all payments (asynchronously)
     * List all payments
     * @param nextToken Pagination token used as a marker to get records from next page. (optional)
     * @param pageSize Maximum page size expected by client to return the record list.    NOTE: Max page size cannot be more than 50. Also 50 is the default page size if no value is provided. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response for GET payments requests </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listPaymentsAsync(String nextToken, Integer pageSize, final ApiCallback<ListPaymentResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listPaymentsValidateBeforeCall(nextToken, pageSize, _callback);
        Type localVarReturnType = new TypeToken<ListPaymentResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
