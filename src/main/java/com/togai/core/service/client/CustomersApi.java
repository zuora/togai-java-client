package com.togai.core.service.client;

import com.togai.core.service.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.togai.core.service.client.model.BaseSuccessResponse;
import com.togai.core.service.client.model.CreateCustomerRequest;
import com.togai.core.service.client.model.CreateCustomerResponse;
import com.togai.core.service.client.model.Customer;
import com.togai.core.service.client.model.CustomerPaginatedResponse;
import com.togai.core.service.client.model.ErrorResponse;
import com.togai.core.service.client.model.UpdateCustomerRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CustomersApi {
  /**
   * Create a customer
   * Create a customer and a default account corresponding to it
   * @param createCustomerRequest Payload to create customer (required)
   * @return Call&lt;CreateCustomerResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("customers")
  Call<CreateCustomerResponse> createCustomer(
    @retrofit2.http.Body CreateCustomerRequest createCustomerRequest
  );

  /**
   * Delete a customer
   * Delete a customer by id
   * @param customerId  (required)
   * @return Call&lt;BaseSuccessResponse&gt;
   */
  @DELETE("customers/{customer_id}")
  Call<BaseSuccessResponse> deleteCustomer(
    @retrofit2.http.Path("customer_id") String customerId
  );

  /**
   * Get a customer
   * Get a customer by id
   * @param customerId  (required)
   * @return Call&lt;Customer&gt;
   */
  @GET("customers/{customer_id}")
  Call<Customer> getCustomer(
    @retrofit2.http.Path("customer_id") String customerId
  );

  /**
   * List customers
   * List customers with pagination and sort
   * @param nextToken  (optional)
   * @param pageSize  (optional)
   * @return Call&lt;CustomerPaginatedResponse&gt;
   */
  @GET("customers")
  Call<CustomerPaginatedResponse> getCustomers(
    @retrofit2.http.Query("nextToken") String nextToken, @retrofit2.http.Query("pageSize") String pageSize
  );

  /**
   * Update a customer
   * Update a customer by id
   * @param customerId  (required)
   * @param updateCustomerRequest Payload to update customer (required)
   * @return Call&lt;Customer&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("customers/{customer_id}")
  Call<Customer> updateCustomer(
    @retrofit2.http.Path("customer_id") String customerId, @retrofit2.http.Body UpdateCustomerRequest updateCustomerRequest
  );

}
