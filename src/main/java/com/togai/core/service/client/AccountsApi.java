package com.togai.core.service.client;

import com.togai.core.service.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.togai.core.service.client.model.Account;
import com.togai.core.service.client.model.AccountPaginatedResponse;
import com.togai.core.service.client.model.AddAccountAliasesRequest;
import com.togai.core.service.client.model.AssociatePricePlanRequest;
import com.togai.core.service.client.model.AssociatePricePlanResponse;
import com.togai.core.service.client.model.BaseSuccessResponse;
import com.togai.core.service.client.model.CreateAccountRequest;
import com.togai.core.service.client.model.ErrorResponse;
import com.togai.core.service.client.model.RemoveAccountAliasesRequest;
import com.togai.core.service.client.model.UpdateAccountRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AccountsApi {
  /**
   * Add Aliases to account
   * Add Aliases to an account by id
   * @param customerId  (required)
   * @param accountId  (required)
   * @param addAccountAliasesRequest Payload to add aliases to account (required)
   * @return Call&lt;Account&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("customers/{customer_id}/accounts/{account_id}/add_aliases")
  Call<Account> addAliases(
    @retrofit2.http.Path("customer_id") String customerId, @retrofit2.http.Path("account_id") String accountId, @retrofit2.http.Body AddAccountAliasesRequest addAccountAliasesRequest
  );

  /**
   * Associate a plan to an account
   * Associate a plan to an account
   * @param customerId  (required)
   * @param accountId  (required)
   * @param associatePricePlanRequest Payload to associate a price plan to an account (required)
   * @return Call&lt;AssociatePricePlanResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("customers/{customer_id}/accounts/{account_id}/price_plans")
  Call<AssociatePricePlanResponse> associatePricePlan(
    @retrofit2.http.Path("customer_id") String customerId, @retrofit2.http.Path("account_id") String accountId, @retrofit2.http.Body AssociatePricePlanRequest associatePricePlanRequest
  );

  /**
   * Create an account
   * Create an account
   * @param customerId  (required)
   * @param createAccountRequest Payload to create account (required)
   * @return Call&lt;Account&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("customers/{customer_id}/accounts")
  Call<Account> createAccount(
    @retrofit2.http.Path("customer_id") String customerId, @retrofit2.http.Body CreateAccountRequest createAccountRequest
  );

  /**
   * Delete an account
   * Delete an account by id
   * @param customerId  (required)
   * @param accountId  (required)
   * @return Call&lt;BaseSuccessResponse&gt;
   */
  @DELETE("customers/{customer_id}/accounts/{account_id}")
  Call<BaseSuccessResponse> deleteAccount(
    @retrofit2.http.Path("customer_id") String customerId, @retrofit2.http.Path("account_id") String accountId
  );

  /**
   * Get an account
   * Get an account
   * @param customerId  (required)
   * @param accountId  (required)
   * @return Call&lt;Account&gt;
   */
  @GET("customers/{customer_id}/accounts/{account_id}")
  Call<Account> getAccount(
    @retrofit2.http.Path("customer_id") String customerId, @retrofit2.http.Path("account_id") String accountId
  );

  /**
   * List accounts of customer
   * List accounts with pagination and sort
   * @param customerId  (required)
   * @param nextToken  (optional)
   * @param pageSize  (optional)
   * @return Call&lt;AccountPaginatedResponse&gt;
   */
  @GET("customers/{customer_id}/accounts")
  Call<AccountPaginatedResponse> getAccounts(
    @retrofit2.http.Path("customer_id") String customerId, @retrofit2.http.Query("nextToken") String nextToken, @retrofit2.http.Query("pageSize") String pageSize
  );

  /**
   * Remove Aliases to account
   * Remove Aliases to an account by id
   * @param customerId  (required)
   * @param accountId  (required)
   * @param removeAccountAliasesRequest Payload to remove aliases from account (required)
   * @return Call&lt;Account&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("customers/{customer_id}/accounts/{account_id}/remove_aliases")
  Call<Account> removeAliases(
    @retrofit2.http.Path("customer_id") String customerId, @retrofit2.http.Path("account_id") String accountId, @retrofit2.http.Body RemoveAccountAliasesRequest removeAccountAliasesRequest
  );

  /**
   * Update an account
   * Update an account by id
   * @param customerId  (required)
   * @param accountId  (required)
   * @param updateAccountRequest Payload to update account (required)
   * @return Call&lt;Account&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("customers/{customer_id}/accounts/{account_id}")
  Call<Account> updateAccount(
    @retrofit2.http.Path("customer_id") String customerId, @retrofit2.http.Path("account_id") String accountId, @retrofit2.http.Body UpdateAccountRequest updateAccountRequest
  );

}
