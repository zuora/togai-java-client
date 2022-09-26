package com.togai.core.service.client;

import com.togai.core.service.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.togai.core.service.client.model.CreatePricePlanRequest;
import com.togai.core.service.client.model.ErrorResponse;
import com.togai.core.service.client.model.PricePlan;
import com.togai.core.service.client.model.PricePlanPaginatedResponse;
import com.togai.core.service.client.model.UpdatePricePlanRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PricePlansApi {
  /**
   * Activate a price plan
   * Activate a price plan
   * @param pricePlanName  (required)
   * @return Call&lt;PricePlan&gt;
   */
  @POST("price_plans/{price_plan_name}/activate")
  Call<PricePlan> activatePricePlan(
    @retrofit2.http.Path("price_plan_name") String pricePlanName
  );

  /**
   * Create a price plan
   * Create a price plan
   * @param createPricePlanRequest Payload to create price plan (required)
   * @return Call&lt;PricePlan&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("price_plans")
  Call<PricePlan> createPricePlan(
    @retrofit2.http.Body CreatePricePlanRequest createPricePlanRequest
  );

  /**
   * Get a price plan
   * Get a price plan
   * @param pricePlanName  (required)
   * @return Call&lt;PricePlan&gt;
   */
  @GET("price_plans/{price_plan_name}")
  Call<PricePlan> getPricePlan(
    @retrofit2.http.Path("price_plan_name") String pricePlanName
  );

  /**
   * List price plans
   * List price plans with pagination and sort
   * @param nextToken  (optional)
   * @param pageSize  (optional)
   * @return Call&lt;PricePlanPaginatedResponse&gt;
   */
  @GET("price_plans")
  Call<PricePlanPaginatedResponse> getPricePlans(
    @retrofit2.http.Query("nextToken") String nextToken, @retrofit2.http.Query("pageSize") String pageSize
  );

  /**
   * Update a price plan
   * Update a price plan
   * @param pricePlanName  (required)
   * @param updatePricePlanRequest Payload to update price plan (required)
   * @return Call&lt;PricePlan&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("price_plans/{price_plan_name}")
  Call<PricePlan> updatePricePlan(
    @retrofit2.http.Path("price_plan_name") String pricePlanName, @retrofit2.http.Body UpdatePricePlanRequest updatePricePlanRequest
  );

}
