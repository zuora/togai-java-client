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


package com.togai.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.togai.client.models.CurrencyConfig;
import com.togai.client.models.EntitlementOverageConfig;
import com.togai.client.models.LicenseEntriesConfig;
import com.togai.client.models.NamedLicenseEntriesConfig;
import com.togai.client.models.PricePlanDetailsConfig;
import com.togai.client.models.ProrationConfig;
import com.togai.client.models.UsageConfig;
import java.io.IOException;
import java.util.Arrays;
import java.io.Serializable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.togai.client.JSON;

/**
 * Request to get revenue details
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class CalculateRevenueRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CURRENCY_CONFIG = "currencyConfig";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CONFIG)
  @javax.annotation.Nonnull
  private CurrencyConfig currencyConfig;

  public static final String SERIALIZED_NAME_PRICE_PLAN_DETAILS_CONFIG = "pricePlanDetailsConfig";
  @SerializedName(SERIALIZED_NAME_PRICE_PLAN_DETAILS_CONFIG)
  @javax.annotation.Nonnull
  private PricePlanDetailsConfig pricePlanDetailsConfig;

  public static final String SERIALIZED_NAME_USAGE_CONFIG = "usageConfig";
  @SerializedName(SERIALIZED_NAME_USAGE_CONFIG)
  @javax.annotation.Nonnull
  private UsageConfig usageConfig;

  public static final String SERIALIZED_NAME_LICENSE_ENTRIES_CONFIG = "licenseEntriesConfig";
  @SerializedName(SERIALIZED_NAME_LICENSE_ENTRIES_CONFIG)
  @javax.annotation.Nonnull
  private LicenseEntriesConfig licenseEntriesConfig;

  public static final String SERIALIZED_NAME_NAMED_LICENSE_ENTRIES_CONFIG = "namedLicenseEntriesConfig";
  @SerializedName(SERIALIZED_NAME_NAMED_LICENSE_ENTRIES_CONFIG)
  @javax.annotation.Nullable
  private NamedLicenseEntriesConfig namedLicenseEntriesConfig;

  public static final String SERIALIZED_NAME_PRORATION_CONFIG = "prorationConfig";
  @SerializedName(SERIALIZED_NAME_PRORATION_CONFIG)
  @javax.annotation.Nullable
  private ProrationConfig prorationConfig;

  public static final String SERIALIZED_NAME_ENTITLEMENT_OVERAGE_CONFIG = "entitlementOverageConfig";
  @SerializedName(SERIALIZED_NAME_ENTITLEMENT_OVERAGE_CONFIG)
  @javax.annotation.Nullable
  private EntitlementOverageConfig entitlementOverageConfig;

  public CalculateRevenueRequest() {
  }

  public CalculateRevenueRequest currencyConfig(@javax.annotation.Nonnull CurrencyConfig currencyConfig) {
    this.currencyConfig = currencyConfig;
    return this;
  }

  /**
   * Get currencyConfig
   * @return currencyConfig
   */
  @javax.annotation.Nonnull
  public CurrencyConfig getCurrencyConfig() {
    return currencyConfig;
  }

  public void setCurrencyConfig(@javax.annotation.Nonnull CurrencyConfig currencyConfig) {
    this.currencyConfig = currencyConfig;
  }


  public CalculateRevenueRequest pricePlanDetailsConfig(@javax.annotation.Nonnull PricePlanDetailsConfig pricePlanDetailsConfig) {
    this.pricePlanDetailsConfig = pricePlanDetailsConfig;
    return this;
  }

  /**
   * Get pricePlanDetailsConfig
   * @return pricePlanDetailsConfig
   */
  @javax.annotation.Nonnull
  public PricePlanDetailsConfig getPricePlanDetailsConfig() {
    return pricePlanDetailsConfig;
  }

  public void setPricePlanDetailsConfig(@javax.annotation.Nonnull PricePlanDetailsConfig pricePlanDetailsConfig) {
    this.pricePlanDetailsConfig = pricePlanDetailsConfig;
  }


  public CalculateRevenueRequest usageConfig(@javax.annotation.Nonnull UsageConfig usageConfig) {
    this.usageConfig = usageConfig;
    return this;
  }

  /**
   * Get usageConfig
   * @return usageConfig
   */
  @javax.annotation.Nonnull
  public UsageConfig getUsageConfig() {
    return usageConfig;
  }

  public void setUsageConfig(@javax.annotation.Nonnull UsageConfig usageConfig) {
    this.usageConfig = usageConfig;
  }


  public CalculateRevenueRequest licenseEntriesConfig(@javax.annotation.Nonnull LicenseEntriesConfig licenseEntriesConfig) {
    this.licenseEntriesConfig = licenseEntriesConfig;
    return this;
  }

  /**
   * Get licenseEntriesConfig
   * @return licenseEntriesConfig
   */
  @javax.annotation.Nonnull
  public LicenseEntriesConfig getLicenseEntriesConfig() {
    return licenseEntriesConfig;
  }

  public void setLicenseEntriesConfig(@javax.annotation.Nonnull LicenseEntriesConfig licenseEntriesConfig) {
    this.licenseEntriesConfig = licenseEntriesConfig;
  }


  public CalculateRevenueRequest namedLicenseEntriesConfig(@javax.annotation.Nullable NamedLicenseEntriesConfig namedLicenseEntriesConfig) {
    this.namedLicenseEntriesConfig = namedLicenseEntriesConfig;
    return this;
  }

  /**
   * Get namedLicenseEntriesConfig
   * @return namedLicenseEntriesConfig
   */
  @javax.annotation.Nullable
  public NamedLicenseEntriesConfig getNamedLicenseEntriesConfig() {
    return namedLicenseEntriesConfig;
  }

  public void setNamedLicenseEntriesConfig(@javax.annotation.Nullable NamedLicenseEntriesConfig namedLicenseEntriesConfig) {
    this.namedLicenseEntriesConfig = namedLicenseEntriesConfig;
  }


  public CalculateRevenueRequest prorationConfig(@javax.annotation.Nullable ProrationConfig prorationConfig) {
    this.prorationConfig = prorationConfig;
    return this;
  }

  /**
   * Get prorationConfig
   * @return prorationConfig
   */
  @javax.annotation.Nullable
  public ProrationConfig getProrationConfig() {
    return prorationConfig;
  }

  public void setProrationConfig(@javax.annotation.Nullable ProrationConfig prorationConfig) {
    this.prorationConfig = prorationConfig;
  }


  public CalculateRevenueRequest entitlementOverageConfig(@javax.annotation.Nullable EntitlementOverageConfig entitlementOverageConfig) {
    this.entitlementOverageConfig = entitlementOverageConfig;
    return this;
  }

  /**
   * Get entitlementOverageConfig
   * @return entitlementOverageConfig
   */
  @javax.annotation.Nullable
  public EntitlementOverageConfig getEntitlementOverageConfig() {
    return entitlementOverageConfig;
  }

  public void setEntitlementOverageConfig(@javax.annotation.Nullable EntitlementOverageConfig entitlementOverageConfig) {
    this.entitlementOverageConfig = entitlementOverageConfig;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalculateRevenueRequest calculateRevenueRequest = (CalculateRevenueRequest) o;
    return Objects.equals(this.currencyConfig, calculateRevenueRequest.currencyConfig) &&
        Objects.equals(this.pricePlanDetailsConfig, calculateRevenueRequest.pricePlanDetailsConfig) &&
        Objects.equals(this.usageConfig, calculateRevenueRequest.usageConfig) &&
        Objects.equals(this.licenseEntriesConfig, calculateRevenueRequest.licenseEntriesConfig) &&
        Objects.equals(this.namedLicenseEntriesConfig, calculateRevenueRequest.namedLicenseEntriesConfig) &&
        Objects.equals(this.prorationConfig, calculateRevenueRequest.prorationConfig) &&
        Objects.equals(this.entitlementOverageConfig, calculateRevenueRequest.entitlementOverageConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyConfig, pricePlanDetailsConfig, usageConfig, licenseEntriesConfig, namedLicenseEntriesConfig, prorationConfig, entitlementOverageConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculateRevenueRequest {\n");
    sb.append("    currencyConfig: ").append(toIndentedString(currencyConfig)).append("\n");
    sb.append("    pricePlanDetailsConfig: ").append(toIndentedString(pricePlanDetailsConfig)).append("\n");
    sb.append("    usageConfig: ").append(toIndentedString(usageConfig)).append("\n");
    sb.append("    licenseEntriesConfig: ").append(toIndentedString(licenseEntriesConfig)).append("\n");
    sb.append("    namedLicenseEntriesConfig: ").append(toIndentedString(namedLicenseEntriesConfig)).append("\n");
    sb.append("    prorationConfig: ").append(toIndentedString(prorationConfig)).append("\n");
    sb.append("    entitlementOverageConfig: ").append(toIndentedString(entitlementOverageConfig)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("currencyConfig");
    openapiFields.add("pricePlanDetailsConfig");
    openapiFields.add("usageConfig");
    openapiFields.add("licenseEntriesConfig");
    openapiFields.add("namedLicenseEntriesConfig");
    openapiFields.add("prorationConfig");
    openapiFields.add("entitlementOverageConfig");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("currencyConfig");
    openapiRequiredFields.add("pricePlanDetailsConfig");
    openapiRequiredFields.add("usageConfig");
    openapiRequiredFields.add("licenseEntriesConfig");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CalculateRevenueRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CalculateRevenueRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CalculateRevenueRequest is not found in the empty JSON string", CalculateRevenueRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CalculateRevenueRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CalculateRevenueRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CalculateRevenueRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `currencyConfig`
      CurrencyConfig.validateJsonElement(jsonObj.get("currencyConfig"));
      // validate the required field `pricePlanDetailsConfig`
      PricePlanDetailsConfig.validateJsonElement(jsonObj.get("pricePlanDetailsConfig"));
      // validate the required field `usageConfig`
      UsageConfig.validateJsonElement(jsonObj.get("usageConfig"));
      // validate the required field `licenseEntriesConfig`
      LicenseEntriesConfig.validateJsonElement(jsonObj.get("licenseEntriesConfig"));
      // validate the optional field `namedLicenseEntriesConfig`
      if (jsonObj.get("namedLicenseEntriesConfig") != null && !jsonObj.get("namedLicenseEntriesConfig").isJsonNull()) {
        NamedLicenseEntriesConfig.validateJsonElement(jsonObj.get("namedLicenseEntriesConfig"));
      }
      // validate the optional field `prorationConfig`
      if (jsonObj.get("prorationConfig") != null && !jsonObj.get("prorationConfig").isJsonNull()) {
        ProrationConfig.validateJsonElement(jsonObj.get("prorationConfig"));
      }
      // validate the optional field `entitlementOverageConfig`
      if (jsonObj.get("entitlementOverageConfig") != null && !jsonObj.get("entitlementOverageConfig").isJsonNull()) {
        EntitlementOverageConfig.validateJsonElement(jsonObj.get("entitlementOverageConfig"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CalculateRevenueRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CalculateRevenueRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CalculateRevenueRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CalculateRevenueRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CalculateRevenueRequest>() {
           @Override
           public void write(JsonWriter out, CalculateRevenueRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CalculateRevenueRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CalculateRevenueRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CalculateRevenueRequest
   * @throws IOException if the JSON string is invalid with respect to CalculateRevenueRequest
   */
  public static CalculateRevenueRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CalculateRevenueRequest.class);
  }

  /**
   * Convert an instance of CalculateRevenueRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

