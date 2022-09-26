package com.togai.core.service.client;

import com.togai.core.service.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.togai.core.service.client.model.BaseSuccessResponse;
import com.togai.core.service.client.model.CreateUsageMeterRequest;
import com.togai.core.service.client.model.ErrorResponse;
import com.togai.core.service.client.model.UpdateUsageMeterRequest;
import com.togai.core.service.client.model.UsageMeter;
import com.togai.core.service.client.model.UsageMeterPaginatedResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UsageMetersApi {
  /**
   * Activate usage meter
   * Activate usage meter
   * @param eventSchemaName  (required)
   * @param usageMeterName  (required)
   * @return Call&lt;UsageMeter&gt;
   */
  @POST("event_schema/{event_schema_name}/usage_meters/{usage_meter_name}/activate")
  Call<UsageMeter> activateUsageMeter(
    @retrofit2.http.Path("event_schema_name") String eventSchemaName, @retrofit2.http.Path("usage_meter_name") String usageMeterName
  );

  /**
   * Create an usage meter
   * Create an usage meter
   * @param eventSchemaName  (required)
   * @param createUsageMeterRequest Payload to create usage meter (required)
   * @return Call&lt;UsageMeter&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("event_schema/{event_schema_name}/usage_meters")
  Call<UsageMeter> createUsageMeter(
    @retrofit2.http.Path("event_schema_name") String eventSchemaName, @retrofit2.http.Body CreateUsageMeterRequest createUsageMeterRequest
  );

  /**
   * Deactivate usage meter
   * Deactivate usage meter
   * @param eventSchemaName  (required)
   * @param usageMeterName  (required)
   * @return Call&lt;UsageMeter&gt;
   */
  @POST("event_schema/{event_schema_name}/usage_meters/{usage_meter_name}/deactivate")
  Call<UsageMeter> deactivateUsageMeter(
    @retrofit2.http.Path("event_schema_name") String eventSchemaName, @retrofit2.http.Path("usage_meter_name") String usageMeterName
  );

  /**
   * Delete an Usage Meter
   * Delete an Usage Meter
   * @param usageMeterName  (required)
   * @return Call&lt;BaseSuccessResponse&gt;
   */
  @DELETE("usage_meter/{usage_meter_name}")
  Call<BaseSuccessResponse> deleteUsageMeter(
    @retrofit2.http.Path("usage_meter_name") String usageMeterName
  );

  /**
   * Get usage meter
   * Get usage meter
   * @param eventSchemaName  (required)
   * @param usageMeterName  (required)
   * @return Call&lt;UsageMeter&gt;
   */
  @GET("event_schema/{event_schema_name}/usage_meters/{usage_meter_name}")
  Call<UsageMeter> getUsageMeter(
    @retrofit2.http.Path("event_schema_name") String eventSchemaName, @retrofit2.http.Path("usage_meter_name") String usageMeterName
  );

  /**
   * List usage meters for event schema
   * List usage meters for event schema with pagination and sort
   * @param eventSchemaName  (required)
   * @param statuses Filter by provided statuses (optional)
   * @param aggregations Filter by provided aggregations (optional)
   * @param nextToken  (optional)
   * @param pageSize  (optional)
   * @param sortOrder  (optional)
   * @return Call&lt;UsageMeterPaginatedResponse&gt;
   */
  @GET("event_schema/{event_schema_name}/usage_meters")
  Call<UsageMeterPaginatedResponse> getUsageMetersForEventSchema(
    @retrofit2.http.Path("event_schema_name") String eventSchemaName, @retrofit2.http.Query("statuses") String statuses, @retrofit2.http.Query("aggregations") String aggregations, @retrofit2.http.Query("nextToken") String nextToken, @retrofit2.http.Query("pageSize") String pageSize, @retrofit2.http.Query("sortOrder") String sortOrder
  );

  /**
   * Update an usage meter
   * Update an usage meter
   * @param eventSchemaName  (required)
   * @param usageMeterName  (required)
   * @param updateUsageMeterRequest Payload to create usage meter (required)
   * @return Call&lt;UsageMeter&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("event_schema/{event_schema_name}/usage_meters/{usage_meter_name}")
  Call<UsageMeter> updateUsageMeter(
    @retrofit2.http.Path("event_schema_name") String eventSchemaName, @retrofit2.http.Path("usage_meter_name") String usageMeterName, @retrofit2.http.Body UpdateUsageMeterRequest updateUsageMeterRequest
  );

}
