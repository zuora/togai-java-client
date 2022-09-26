package com.togai.core.service.client;

import com.togai.core.service.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.togai.core.service.client.model.ErrorResponse;
import com.togai.core.service.client.model.GetEventResponse;
import com.togai.core.service.client.model.GetEventsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface EventManagementApi {
  /**
   * Get usage events from Togai
   * API to get usage events ingested to Togai.
   * @param nextToken Pagination token used as a marker to get records from next page. (optional)
   * @param status Filter option to filter the events by processed/unprocessed status. (optional)
   * @param accountId Filter option to filter the events based on account id. (optional)
   * @param pageSize Maximum page size expected by client to return the record list.    NOTE: Max page size cannot be more than 50. Also 50 is the default page size if no value is provided. (optional)
   * @param startTime Start time filter in epoch milli seconds (optional)
   * @param endTime End time filter in epoch milli seconds (optional)
   * @return Call&lt;GetEventsResponse&gt;
   */
  @GET("events")
  Call<GetEventsResponse> getEvents(
    @retrofit2.http.Query("nextToken") String nextToken, @retrofit2.http.Query("status") String status, @retrofit2.http.Query("account_id") String accountId, @retrofit2.http.Query("pageSize") Integer pageSize, @retrofit2.http.Query("start_time") Long startTime, @retrofit2.http.Query("end_time") Long endTime
  );

  /**
   * Get the usage event given event id.
   * API to get the event given the event id.
   * @param eventId  (required)
   * @return Call&lt;GetEventResponse&gt;
   */
  @GET("events/{event_id}")
  Call<GetEventResponse> getSingleEvent(
    @retrofit2.http.Path("event_id") String eventId
  );

}
