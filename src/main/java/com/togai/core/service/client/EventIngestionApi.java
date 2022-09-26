package com.togai.core.service.client;

import com.togai.core.service.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.togai.core.service.client.model.ErrorResponse;
import com.togai.core.service.client.model.IngestBatchEventRequest;
import com.togai.core.service.client.model.IngestBatchEventResponse;
import com.togai.core.service.client.model.IngestEventRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface EventIngestionApi {
  /**
   * Ingest events to Togai
   * API to ingest your application event to Togai for billing and usage analytics. To know the limits on the ingestion api, check our docs - https://togai.com/docs/limits.
   * @param ingestEventRequest Request body to ingest events to Togai usage and billing management service. (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("ingest")
  Call<Void> ingest(
    @retrofit2.http.Body IngestEventRequest ingestEventRequest
  );

  /**
   * Ingest events to Togai in batch
   * API to ingest your application event in batch to Togai for billing and usage analytics. To know the limits on the ingestion api, check our docs - https://togai.com/docs/limits.
   * @param ingestBatchEventRequest Request body to ingest events in batch to Togai usage and billing management service. (required)
   * @return Call&lt;IngestBatchEventResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("ingestBatch")
  Call<IngestBatchEventResponse> ingestBatch(
    @retrofit2.http.Body IngestBatchEventRequest ingestBatchEventRequest
  );

}
