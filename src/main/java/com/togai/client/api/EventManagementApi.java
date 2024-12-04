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
import com.togai.client.models.EventCorrectionRequest;
import com.togai.client.models.EventsCorrectionResponse;
import com.togai.client.models.GetEventResponse;
import com.togai.client.models.GetEventsResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManagementApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public EventManagementApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EventManagementApi(ApiClient apiClient) {
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
     * Build call for eventCorrection
     * @param action Action to perform in event correction (required)
     * @param requireConfirmation Specifies whether to start a migration only after a confirmation (optional)
     * @param eventCorrectionRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Credential is not valid. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Credential does not have access to get events. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Request throttled. Please check the response message on the failure details. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call eventCorrectionCall(String action, Boolean requireConfirmation, EventCorrectionRequest eventCorrectionRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = eventCorrectionRequest;

        // create path and map variables
        String localVarPath = "/events/correction";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (action != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("action", action));
        }

        if (requireConfirmation != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("require_confirmation", requireConfirmation));
        }

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
    private okhttp3.Call eventCorrectionValidateBeforeCall(String action, Boolean requireConfirmation, EventCorrectionRequest eventCorrectionRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'action' is set
        if (action == null) {
            throw new ApiException("Missing the required parameter 'action' when calling eventCorrection(Async)");
        }

        return eventCorrectionCall(action, requireConfirmation, eventCorrectionRequest, _callback);

    }

    /**
     * Correct an ingested event
     * #### This API lets you to correct events. Available in both synchronous and asynchronous mode - **Usages**: Reduction of all usages associated with this event - **Revenue**: Reduction of all revenues associated with this event - **Entitlements**: Entitlements(Feature Credits) consumed by this event are granted back to the account.  ### Possible Actions: - UNDO: Undo all usages, revenue and entitlements associated with an event - REDO: Performs UNDO and re-ingests the same event - REDO_EVENT: Performs UNDO and re-ingests the correction payload of the event 
     * @param action Action to perform in event correction (required)
     * @param requireConfirmation Specifies whether to start a migration only after a confirmation (optional)
     * @param eventCorrectionRequest  (optional)
     * @return EventsCorrectionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Credential is not valid. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Credential does not have access to get events. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Request throttled. Please check the response message on the failure details. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public EventsCorrectionResponse eventCorrection(String action, Boolean requireConfirmation, EventCorrectionRequest eventCorrectionRequest) throws ApiException {
        ApiResponse<EventsCorrectionResponse> localVarResp = eventCorrectionWithHttpInfo(action, requireConfirmation, eventCorrectionRequest);
        return localVarResp.getData();
    }

    /**
     * Correct an ingested event
     * #### This API lets you to correct events. Available in both synchronous and asynchronous mode - **Usages**: Reduction of all usages associated with this event - **Revenue**: Reduction of all revenues associated with this event - **Entitlements**: Entitlements(Feature Credits) consumed by this event are granted back to the account.  ### Possible Actions: - UNDO: Undo all usages, revenue and entitlements associated with an event - REDO: Performs UNDO and re-ingests the same event - REDO_EVENT: Performs UNDO and re-ingests the correction payload of the event 
     * @param action Action to perform in event correction (required)
     * @param requireConfirmation Specifies whether to start a migration only after a confirmation (optional)
     * @param eventCorrectionRequest  (optional)
     * @return ApiResponse&lt;EventsCorrectionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Credential is not valid. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Credential does not have access to get events. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Request throttled. Please check the response message on the failure details. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EventsCorrectionResponse> eventCorrectionWithHttpInfo(String action, Boolean requireConfirmation, EventCorrectionRequest eventCorrectionRequest) throws ApiException {
        okhttp3.Call localVarCall = eventCorrectionValidateBeforeCall(action, requireConfirmation, eventCorrectionRequest, null);
        Type localVarReturnType = new TypeToken<EventsCorrectionResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Correct an ingested event (asynchronously)
     * #### This API lets you to correct events. Available in both synchronous and asynchronous mode - **Usages**: Reduction of all usages associated with this event - **Revenue**: Reduction of all revenues associated with this event - **Entitlements**: Entitlements(Feature Credits) consumed by this event are granted back to the account.  ### Possible Actions: - UNDO: Undo all usages, revenue and entitlements associated with an event - REDO: Performs UNDO and re-ingests the same event - REDO_EVENT: Performs UNDO and re-ingests the correction payload of the event 
     * @param action Action to perform in event correction (required)
     * @param requireConfirmation Specifies whether to start a migration only after a confirmation (optional)
     * @param eventCorrectionRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Credential is not valid. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Credential does not have access to get events. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Request throttled. Please check the response message on the failure details. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call eventCorrectionAsync(String action, Boolean requireConfirmation, EventCorrectionRequest eventCorrectionRequest, final ApiCallback<EventsCorrectionResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = eventCorrectionValidateBeforeCall(action, requireConfirmation, eventCorrectionRequest, _callback);
        Type localVarReturnType = new TypeToken<EventsCorrectionResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getEvents
     * @param nextToken Pagination token used as a marker to get records from next page. (optional)
     * @param status Filter option to filter by status. (optional)
     * @param accountId Filter option to filter based on account id. (optional)
     * @param schemaName Filter option to filter the events based on schema name. (optional)
     * @param pageSize Maximum page size expected by client to return the record list.    NOTE: Max page size cannot be more than 50. Also 50 is the default page size if no value is provided. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Credential is not valid. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Credential does not have access to list events. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unable to process the query parameters provided. Please check our docs for the api limits - https://togai.io/docs/limits. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Request throttled. Please check the response message on the failure details. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getEventsCall(String nextToken, String status, String accountId, String schemaName, Integer pageSize, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/events";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (nextToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("nextToken", nextToken));
        }

        if (status != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("status", status));
        }

        if (accountId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_id", accountId));
        }

        if (schemaName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("schema_name", schemaName));
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
    private okhttp3.Call getEventsValidateBeforeCall(String nextToken, String status, String accountId, String schemaName, Integer pageSize, final ApiCallback _callback) throws ApiException {
        return getEventsCall(nextToken, status, accountId, schemaName, pageSize, _callback);

    }

    /**
     * Get a list of usage events with multiple query options
     * This API let’s you to fetch a list of events with multiple query parameters
     * @param nextToken Pagination token used as a marker to get records from next page. (optional)
     * @param status Filter option to filter by status. (optional)
     * @param accountId Filter option to filter based on account id. (optional)
     * @param schemaName Filter option to filter the events based on schema name. (optional)
     * @param pageSize Maximum page size expected by client to return the record list.    NOTE: Max page size cannot be more than 50. Also 50 is the default page size if no value is provided. (optional)
     * @return GetEventsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Credential is not valid. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Credential does not have access to list events. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unable to process the query parameters provided. Please check our docs for the api limits - https://togai.io/docs/limits. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Request throttled. Please check the response message on the failure details. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public GetEventsResponse getEvents(String nextToken, String status, String accountId, String schemaName, Integer pageSize) throws ApiException {
        ApiResponse<GetEventsResponse> localVarResp = getEventsWithHttpInfo(nextToken, status, accountId, schemaName, pageSize);
        return localVarResp.getData();
    }

    /**
     * Get a list of usage events with multiple query options
     * This API let’s you to fetch a list of events with multiple query parameters
     * @param nextToken Pagination token used as a marker to get records from next page. (optional)
     * @param status Filter option to filter by status. (optional)
     * @param accountId Filter option to filter based on account id. (optional)
     * @param schemaName Filter option to filter the events based on schema name. (optional)
     * @param pageSize Maximum page size expected by client to return the record list.    NOTE: Max page size cannot be more than 50. Also 50 is the default page size if no value is provided. (optional)
     * @return ApiResponse&lt;GetEventsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Credential is not valid. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Credential does not have access to list events. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unable to process the query parameters provided. Please check our docs for the api limits - https://togai.io/docs/limits. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Request throttled. Please check the response message on the failure details. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetEventsResponse> getEventsWithHttpInfo(String nextToken, String status, String accountId, String schemaName, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = getEventsValidateBeforeCall(nextToken, status, accountId, schemaName, pageSize, null);
        Type localVarReturnType = new TypeToken<GetEventsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a list of usage events with multiple query options (asynchronously)
     * This API let’s you to fetch a list of events with multiple query parameters
     * @param nextToken Pagination token used as a marker to get records from next page. (optional)
     * @param status Filter option to filter by status. (optional)
     * @param accountId Filter option to filter based on account id. (optional)
     * @param schemaName Filter option to filter the events based on schema name. (optional)
     * @param pageSize Maximum page size expected by client to return the record list.    NOTE: Max page size cannot be more than 50. Also 50 is the default page size if no value is provided. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Credential is not valid. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Credential does not have access to list events. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unable to process the query parameters provided. Please check our docs for the api limits - https://togai.io/docs/limits. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Request throttled. Please check the response message on the failure details. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getEventsAsync(String nextToken, String status, String accountId, String schemaName, Integer pageSize, final ApiCallback<GetEventsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getEventsValidateBeforeCall(nextToken, status, accountId, schemaName, pageSize, _callback);
        Type localVarReturnType = new TypeToken<GetEventsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSingleEvent
     * @param eventId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Credential is not valid. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Credential does not have access to get events. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Request throttled. Please check the response message on the failure details. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSingleEventCall(String eventId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/events/{event_id}"
            .replace("{" + "event_id" + "}", localVarApiClient.escapeString(eventId.toString()));

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
    private okhttp3.Call getSingleEventValidateBeforeCall(String eventId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'eventId' is set
        if (eventId == null) {
            throw new ApiException("Missing the required parameter 'eventId' when calling getSingleEvent(Async)");
        }

        return getSingleEventCall(eventId, _callback);

    }

    /**
     * Get an event using event id
     * Fetch details of a particular event using the event ID.
     * @param eventId  (required)
     * @return GetEventResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Credential is not valid. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Credential does not have access to get events. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Request throttled. Please check the response message on the failure details. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public GetEventResponse getSingleEvent(String eventId) throws ApiException {
        ApiResponse<GetEventResponse> localVarResp = getSingleEventWithHttpInfo(eventId);
        return localVarResp.getData();
    }

    /**
     * Get an event using event id
     * Fetch details of a particular event using the event ID.
     * @param eventId  (required)
     * @return ApiResponse&lt;GetEventResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Credential is not valid. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Credential does not have access to get events. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Request throttled. Please check the response message on the failure details. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetEventResponse> getSingleEventWithHttpInfo(String eventId) throws ApiException {
        okhttp3.Call localVarCall = getSingleEventValidateBeforeCall(eventId, null);
        Type localVarReturnType = new TypeToken<GetEventResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get an event using event id (asynchronously)
     * Fetch details of a particular event using the event ID.
     * @param eventId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Credential is not valid. Please check the response message for failure details. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Credential does not have access to get events. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Request throttled. Please check the response message on the failure details. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSingleEventAsync(String eventId, final ApiCallback<GetEventResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSingleEventValidateBeforeCall(eventId, _callback);
        Type localVarReturnType = new TypeToken<GetEventResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
