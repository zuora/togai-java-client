package com.togai.core.service.client;

import com.togai.core.service.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.togai.core.service.client.model.BaseSuccessResponse;
import com.togai.core.service.client.model.CreateEventSchemaRequest;
import com.togai.core.service.client.model.ErrorResponse;
import com.togai.core.service.client.model.EventSchema;
import com.togai.core.service.client.model.EventSchemaListPaginatedResponse;
import com.togai.core.service.client.model.EventSchemaVersionsResponse;
import com.togai.core.service.client.model.UpdateEventSchemaRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface EventsApi {
  /**
   * Activate an event schema
   * Activate an event schema
   * @param eventSchemaName  (required)
   * @return Call&lt;EventSchema&gt;
   */
  @POST("event_schema/{event_schema_name}/activate")
  Call<EventSchema> activateEventSchema(
    @retrofit2.http.Path("event_schema_name") String eventSchemaName
  );

  /**
   * Create an event schema
   * Create an event schema
   * @param createEventSchemaRequest Payload to create event schema (required)
   * @return Call&lt;EventSchema&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("event_schema")
  Call<EventSchema> createEventSchema(
    @retrofit2.http.Body CreateEventSchemaRequest createEventSchemaRequest
  );

  /**
   * Deactivate an event schema
   * Deactivate an event schema
   * @param eventSchemaName  (required)
   * @return Call&lt;EventSchema&gt;
   */
  @POST("event_schema/{event_schema_name}/deactivate")
  Call<EventSchema> deactivateEventSchema(
    @retrofit2.http.Path("event_schema_name") String eventSchemaName
  );

  /**
   * Delete an event schema
   * Delete an event schema
   * @param eventSchemaName  (required)
   * @return Call&lt;BaseSuccessResponse&gt;
   */
  @DELETE("event_schema/{event_schema_name}")
  Call<BaseSuccessResponse> deleteEventSchema(
    @retrofit2.http.Path("event_schema_name") String eventSchemaName
  );

  /**
   * Get an event schema
   * Get an event schema
   * @param eventSchemaName  (required)
   * @param version Optional version to get a specific version. Gets latest version if it is not provided. (optional)
   * @return Call&lt;EventSchema&gt;
   */
  @GET("event_schema/{event_schema_name}")
  Call<EventSchema> getEventSchema(
    @retrofit2.http.Path("event_schema_name") String eventSchemaName, @retrofit2.http.Query("version") Integer version
  );

  /**
   * List all event schema versions
   * List all event schema versions
   * @param eventSchemaName  (required)
   * @return Call&lt;EventSchemaVersionsResponse&gt;
   */
  @GET("event_schema/{event_schema_name}/versions")
  Call<EventSchemaVersionsResponse> listEventSchemaVersions(
    @retrofit2.http.Path("event_schema_name") String eventSchemaName
  );

  /**
   * List event schemas
   * List event schemas with pagination and sort
   * @param statuses Filter by provided statuses (optional)
   * @param nextToken  (optional)
   * @param pageSize  (optional)
   * @param sortOrder  (optional)
   * @return Call&lt;EventSchemaListPaginatedResponse&gt;
   */
  @GET("event_schema")
  Call<EventSchemaListPaginatedResponse> listEventSchemas(
    @retrofit2.http.Query("statuses") String statuses, @retrofit2.http.Query("nextToken") String nextToken, @retrofit2.http.Query("pageSize") String pageSize, @retrofit2.http.Query("sortOrder") String sortOrder
  );

  /**
   * Update an event schema
   * Update an event schema
   * @param eventSchemaName  (required)
   * @param updateEventSchemaRequest Payload to update event schema (required)
   * @return Call&lt;EventSchema&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("event_schema/{event_schema_name}")
  Call<EventSchema> updateEventSchema(
    @retrofit2.http.Path("event_schema_name") String eventSchemaName, @retrofit2.http.Body UpdateEventSchemaRequest updateEventSchemaRequest
  );

}
