/*
 * Togai Apis
 * APIs for Togai App
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: engg@togai.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.togai.core.service.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.togai.core.service.client.model.PlanOverride;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * AssociatePricePlanResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AssociatePricePlanResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ACCOUNT_NAME = "accountName";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NAME)
  private String accountName;

  public static final String SERIALIZED_NAME_PRICING_SCHEDULES = "pricingSchedules";
  @SerializedName(SERIALIZED_NAME_PRICING_SCHEDULES)
  private List<PlanOverride> pricingSchedules = new ArrayList<>();

  public AssociatePricePlanResponse() {
  }

  public AssociatePricePlanResponse accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Identifier of the account
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Identifier of the account")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AssociatePricePlanResponse accountName(String accountName) {
    
    this.accountName = accountName;
    return this;
  }

   /**
   * Name of the customer
   * @return accountName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the customer")

  public String getAccountName() {
    return accountName;
  }


  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }


  public AssociatePricePlanResponse pricingSchedules(List<PlanOverride> pricingSchedules) {
    
    this.pricingSchedules = pricingSchedules;
    return this;
  }

  public AssociatePricePlanResponse addPricingSchedulesItem(PlanOverride pricingSchedulesItem) {
    this.pricingSchedules.add(pricingSchedulesItem);
    return this;
  }

   /**
   * Get pricingSchedules
   * @return pricingSchedules
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<PlanOverride> getPricingSchedules() {
    return pricingSchedules;
  }


  public void setPricingSchedules(List<PlanOverride> pricingSchedules) {
    this.pricingSchedules = pricingSchedules;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssociatePricePlanResponse associatePricePlanResponse = (AssociatePricePlanResponse) o;
    return Objects.equals(this.accountId, associatePricePlanResponse.accountId) &&
        Objects.equals(this.accountName, associatePricePlanResponse.accountName) &&
        Objects.equals(this.pricingSchedules, associatePricePlanResponse.pricingSchedules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountName, pricingSchedules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssociatePricePlanResponse {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    pricingSchedules: ").append(toIndentedString(pricingSchedules)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

