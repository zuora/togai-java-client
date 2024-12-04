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


import com.togai.client.models.ErrorResponse;
import com.togai.client.models.TopupWalletRequest;
import com.togai.client.models.UpdateWalletRequest;
import com.togai.client.models.WalletBalanceResponse;
import com.togai.client.models.WalletEntriesPaginatedResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WalletApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public WalletApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WalletApi(ApiClient apiClient) {
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
     * Build call for topUpWalletForAccount
     * @param accountId account_id corresponding to an account (required)
     * @param topupWalletRequest Payload to topup wallet of an account (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response for Credit Balance Request </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call topUpWalletForAccountCall(String accountId, TopupWalletRequest topupWalletRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = topupWalletRequest;

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/wallet_topup"
            .replace("{" + "account_id" + "}", localVarApiClient.escapeString(accountId.toString()));

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
    private okhttp3.Call topUpWalletForAccountValidateBeforeCall(String accountId, TopupWalletRequest topupWalletRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling topUpWalletForAccount(Async)");
        }

        return topUpWalletForAccountCall(accountId, topupWalletRequest, _callback);

    }

    /**
     * Top-up wallet for an account
     * Top-up wallet for an account
     * @param accountId account_id corresponding to an account (required)
     * @param topupWalletRequest Payload to topup wallet of an account (optional)
     * @return WalletBalanceResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response for Credit Balance Request </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public WalletBalanceResponse topUpWalletForAccount(String accountId, TopupWalletRequest topupWalletRequest) throws ApiException {
        ApiResponse<WalletBalanceResponse> localVarResp = topUpWalletForAccountWithHttpInfo(accountId, topupWalletRequest);
        return localVarResp.getData();
    }

    /**
     * Top-up wallet for an account
     * Top-up wallet for an account
     * @param accountId account_id corresponding to an account (required)
     * @param topupWalletRequest Payload to topup wallet of an account (optional)
     * @return ApiResponse&lt;WalletBalanceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response for Credit Balance Request </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WalletBalanceResponse> topUpWalletForAccountWithHttpInfo(String accountId, TopupWalletRequest topupWalletRequest) throws ApiException {
        okhttp3.Call localVarCall = topUpWalletForAccountValidateBeforeCall(accountId, topupWalletRequest, null);
        Type localVarReturnType = new TypeToken<WalletBalanceResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Top-up wallet for an account (asynchronously)
     * Top-up wallet for an account
     * @param accountId account_id corresponding to an account (required)
     * @param topupWalletRequest Payload to topup wallet of an account (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response for Credit Balance Request </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call topUpWalletForAccountAsync(String accountId, TopupWalletRequest topupWalletRequest, final ApiCallback<WalletBalanceResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = topUpWalletForAccountValidateBeforeCall(accountId, topupWalletRequest, _callback);
        Type localVarReturnType = new TypeToken<WalletBalanceResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateWalletForAccount
     * @param accountId account_id corresponding to an account (required)
     * @param updateWalletRequest Payload to update wallet of an account (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response for Credit Balance Request </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateWalletForAccountCall(String accountId, UpdateWalletRequest updateWalletRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = updateWalletRequest;

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/wallet"
            .replace("{" + "account_id" + "}", localVarApiClient.escapeString(accountId.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateWalletForAccountValidateBeforeCall(String accountId, UpdateWalletRequest updateWalletRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling updateWalletForAccount(Async)");
        }

        return updateWalletForAccountCall(accountId, updateWalletRequest, _callback);

    }

    /**
     * Update wallet details for an account
     * Update wallet details for an account
     * @param accountId account_id corresponding to an account (required)
     * @param updateWalletRequest Payload to update wallet of an account (optional)
     * @return WalletBalanceResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response for Credit Balance Request </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public WalletBalanceResponse updateWalletForAccount(String accountId, UpdateWalletRequest updateWalletRequest) throws ApiException {
        ApiResponse<WalletBalanceResponse> localVarResp = updateWalletForAccountWithHttpInfo(accountId, updateWalletRequest);
        return localVarResp.getData();
    }

    /**
     * Update wallet details for an account
     * Update wallet details for an account
     * @param accountId account_id corresponding to an account (required)
     * @param updateWalletRequest Payload to update wallet of an account (optional)
     * @return ApiResponse&lt;WalletBalanceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response for Credit Balance Request </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WalletBalanceResponse> updateWalletForAccountWithHttpInfo(String accountId, UpdateWalletRequest updateWalletRequest) throws ApiException {
        okhttp3.Call localVarCall = updateWalletForAccountValidateBeforeCall(accountId, updateWalletRequest, null);
        Type localVarReturnType = new TypeToken<WalletBalanceResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update wallet details for an account (asynchronously)
     * Update wallet details for an account
     * @param accountId account_id corresponding to an account (required)
     * @param updateWalletRequest Payload to update wallet of an account (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response for Credit Balance Request </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateWalletForAccountAsync(String accountId, UpdateWalletRequest updateWalletRequest, final ApiCallback<WalletBalanceResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateWalletForAccountValidateBeforeCall(accountId, updateWalletRequest, _callback);
        Type localVarReturnType = new TypeToken<WalletBalanceResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for walletBalanceForAccount
     * @param accountId account_id corresponding to an account (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response for Credit Balance Request </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call walletBalanceForAccountCall(String accountId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/wallet"
            .replace("{" + "account_id" + "}", localVarApiClient.escapeString(accountId.toString()));

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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call walletBalanceForAccountValidateBeforeCall(String accountId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling walletBalanceForAccount(Async)");
        }

        return walletBalanceForAccountCall(accountId, _callback);

    }

    /**
     * Wallet balance for Account
     * Wallet balance for Account
     * @param accountId account_id corresponding to an account (required)
     * @return WalletBalanceResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response for Credit Balance Request </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public WalletBalanceResponse walletBalanceForAccount(String accountId) throws ApiException {
        ApiResponse<WalletBalanceResponse> localVarResp = walletBalanceForAccountWithHttpInfo(accountId);
        return localVarResp.getData();
    }

    /**
     * Wallet balance for Account
     * Wallet balance for Account
     * @param accountId account_id corresponding to an account (required)
     * @return ApiResponse&lt;WalletBalanceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response for Credit Balance Request </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WalletBalanceResponse> walletBalanceForAccountWithHttpInfo(String accountId) throws ApiException {
        okhttp3.Call localVarCall = walletBalanceForAccountValidateBeforeCall(accountId, null);
        Type localVarReturnType = new TypeToken<WalletBalanceResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Wallet balance for Account (asynchronously)
     * Wallet balance for Account
     * @param accountId account_id corresponding to an account (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response for Credit Balance Request </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call walletBalanceForAccountAsync(String accountId, final ApiCallback<WalletBalanceResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = walletBalanceForAccountValidateBeforeCall(accountId, _callback);
        Type localVarReturnType = new TypeToken<WalletBalanceResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for walletEntriesForAccount
     * @param accountId account_id corresponding to an account (required)
     * @param nextToken Pagination token used as a marker to get records from next page. (optional)
     * @param pageSize Maximum page size expected by client to return the record list.    NOTE: Max page size cannot be more than 50. Also 50 is the default page size if no value is provided. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response for Credit Balance Request </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call walletEntriesForAccountCall(String accountId, String nextToken, Integer pageSize, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/accounts/{account_id}/wallet/entries"
            .replace("{" + "account_id" + "}", localVarApiClient.escapeString(accountId.toString()));

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
    private okhttp3.Call walletEntriesForAccountValidateBeforeCall(String accountId, String nextToken, Integer pageSize, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling walletEntriesForAccount(Async)");
        }

        return walletEntriesForAccountCall(accountId, nextToken, pageSize, _callback);

    }

    /**
     * Wallet entries for Account
     * Wallet entries for Account
     * @param accountId account_id corresponding to an account (required)
     * @param nextToken Pagination token used as a marker to get records from next page. (optional)
     * @param pageSize Maximum page size expected by client to return the record list.    NOTE: Max page size cannot be more than 50. Also 50 is the default page size if no value is provided. (optional)
     * @return WalletEntriesPaginatedResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response for Credit Balance Request </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public WalletEntriesPaginatedResponse walletEntriesForAccount(String accountId, String nextToken, Integer pageSize) throws ApiException {
        ApiResponse<WalletEntriesPaginatedResponse> localVarResp = walletEntriesForAccountWithHttpInfo(accountId, nextToken, pageSize);
        return localVarResp.getData();
    }

    /**
     * Wallet entries for Account
     * Wallet entries for Account
     * @param accountId account_id corresponding to an account (required)
     * @param nextToken Pagination token used as a marker to get records from next page. (optional)
     * @param pageSize Maximum page size expected by client to return the record list.    NOTE: Max page size cannot be more than 50. Also 50 is the default page size if no value is provided. (optional)
     * @return ApiResponse&lt;WalletEntriesPaginatedResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response for Credit Balance Request </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WalletEntriesPaginatedResponse> walletEntriesForAccountWithHttpInfo(String accountId, String nextToken, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = walletEntriesForAccountValidateBeforeCall(accountId, nextToken, pageSize, null);
        Type localVarReturnType = new TypeToken<WalletEntriesPaginatedResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Wallet entries for Account (asynchronously)
     * Wallet entries for Account
     * @param accountId account_id corresponding to an account (required)
     * @param nextToken Pagination token used as a marker to get records from next page. (optional)
     * @param pageSize Maximum page size expected by client to return the record list.    NOTE: Max page size cannot be more than 50. Also 50 is the default page size if no value is provided. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response for Credit Balance Request </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Error response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call walletEntriesForAccountAsync(String accountId, String nextToken, Integer pageSize, final ApiCallback<WalletEntriesPaginatedResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = walletEntriesForAccountValidateBeforeCall(accountId, nextToken, pageSize, _callback);
        Type localVarReturnType = new TypeToken<WalletEntriesPaginatedResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
