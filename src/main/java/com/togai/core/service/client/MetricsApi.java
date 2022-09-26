package com.togai.core.service.client;

import com.togai.core.service.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.togai.core.service.client.model.ErrorResponse;
import com.togai.core.service.client.model.GetMetricsRequest;
import com.togai.core.service.client.model.GetMetricsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface MetricsApi {
  /**
   * Get togai metrics.
   * To get the metrics, you make a POST request to the /metrics resource. You can query up to five metrics in a single request. Single response dataset can contain a maximum of 100 data points.
   * @param getMetricsRequest  (optional)
   * @return Call&lt;GetMetricsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("metrics")
  Call<GetMetricsResponse> getMetrics(
    @retrofit2.http.Body GetMetricsRequest getMetricsRequest
  );

}
