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
import com.togai.client.models.PricePlanDetails;
import com.togai.client.models.PricePlanInfo;
import com.togai.client.models.PricingRule;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * PricingScheduleWithPricePlanId
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class PricingScheduleWithPricePlanId implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  public static final String SERIALIZED_NAME_PRICE_PLAN_DETAILS = "pricePlanDetails";
  @SerializedName(SERIALIZED_NAME_PRICE_PLAN_DETAILS)
  @javax.annotation.Nullable
  private PricePlanDetails pricePlanDetails;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  @javax.annotation.Nonnull
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  @javax.annotation.Nonnull
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  @javax.annotation.Nonnull
  private Integer version;

  public static final String SERIALIZED_NAME_PRICING_RULES = "pricingRules";
  @SerializedName(SERIALIZED_NAME_PRICING_RULES)
  @javax.annotation.Nullable
  private List<PricingRule> pricingRules = new ArrayList<>();

  public static final String SERIALIZED_NAME_IS_OVERRIDEN = "isOverriden";
  @SerializedName(SERIALIZED_NAME_IS_OVERRIDEN)
  @javax.annotation.Nonnull
  private Boolean isOverriden;

  public static final String SERIALIZED_NAME_PRICE_PLAN_ID = "pricePlanId";
  @SerializedName(SERIALIZED_NAME_PRICE_PLAN_ID)
  @javax.annotation.Nonnull
  private String pricePlanId;

  public static final String SERIALIZED_NAME_PRICE_PLAN_NAME = "pricePlanName";
  @SerializedName(SERIALIZED_NAME_PRICE_PLAN_NAME)
  @javax.annotation.Nullable
  private String pricePlanName;

  public static final String SERIALIZED_NAME_PRICE_PLAN_INFO = "pricePlanInfo";
  @SerializedName(SERIALIZED_NAME_PRICE_PLAN_INFO)
  @javax.annotation.Nullable
  private PricePlanInfo pricePlanInfo;

  public PricingScheduleWithPricePlanId() {
  }

  public PricingScheduleWithPricePlanId id(@javax.annotation.Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }


  public PricingScheduleWithPricePlanId pricePlanDetails(@javax.annotation.Nullable PricePlanDetails pricePlanDetails) {
    this.pricePlanDetails = pricePlanDetails;
    return this;
  }

  /**
   * Get pricePlanDetails
   * @return pricePlanDetails
   */
  @javax.annotation.Nullable
  public PricePlanDetails getPricePlanDetails() {
    return pricePlanDetails;
  }

  public void setPricePlanDetails(@javax.annotation.Nullable PricePlanDetails pricePlanDetails) {
    this.pricePlanDetails = pricePlanDetails;
  }


  public PricingScheduleWithPricePlanId startDate(@javax.annotation.Nonnull OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(@javax.annotation.Nonnull OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public PricingScheduleWithPricePlanId endDate(@javax.annotation.Nonnull OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(@javax.annotation.Nonnull OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public PricingScheduleWithPricePlanId version(@javax.annotation.Nonnull Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * minimum: 1
   * @return version
   */
  @javax.annotation.Nonnull
  public Integer getVersion() {
    return version;
  }

  public void setVersion(@javax.annotation.Nonnull Integer version) {
    this.version = version;
  }


  public PricingScheduleWithPricePlanId pricingRules(@javax.annotation.Nullable List<PricingRule> pricingRules) {
    this.pricingRules = pricingRules;
    return this;
  }

  public PricingScheduleWithPricePlanId addPricingRulesItem(PricingRule pricingRulesItem) {
    if (this.pricingRules == null) {
      this.pricingRules = new ArrayList<>();
    }
    this.pricingRules.add(pricingRulesItem);
    return this;
  }

  /**
   * Get pricingRules
   * @return pricingRules
   */
  @javax.annotation.Nullable
  public List<PricingRule> getPricingRules() {
    return pricingRules;
  }

  public void setPricingRules(@javax.annotation.Nullable List<PricingRule> pricingRules) {
    this.pricingRules = pricingRules;
  }


  public PricingScheduleWithPricePlanId isOverriden(@javax.annotation.Nonnull Boolean isOverriden) {
    this.isOverriden = isOverriden;
    return this;
  }

  /**
   * Get isOverriden
   * @return isOverriden
   */
  @javax.annotation.Nonnull
  public Boolean getIsOverriden() {
    return isOverriden;
  }

  public void setIsOverriden(@javax.annotation.Nonnull Boolean isOverriden) {
    this.isOverriden = isOverriden;
  }


  public PricingScheduleWithPricePlanId pricePlanId(@javax.annotation.Nonnull String pricePlanId) {
    this.pricePlanId = pricePlanId;
    return this;
  }

  /**
   * Get pricePlanId
   * @return pricePlanId
   */
  @javax.annotation.Nonnull
  public String getPricePlanId() {
    return pricePlanId;
  }

  public void setPricePlanId(@javax.annotation.Nonnull String pricePlanId) {
    this.pricePlanId = pricePlanId;
  }


  public PricingScheduleWithPricePlanId pricePlanName(@javax.annotation.Nullable String pricePlanName) {
    this.pricePlanName = pricePlanName;
    return this;
  }

  /**
   * Get pricePlanName
   * @return pricePlanName
   */
  @javax.annotation.Nullable
  public String getPricePlanName() {
    return pricePlanName;
  }

  public void setPricePlanName(@javax.annotation.Nullable String pricePlanName) {
    this.pricePlanName = pricePlanName;
  }


  public PricingScheduleWithPricePlanId pricePlanInfo(@javax.annotation.Nullable PricePlanInfo pricePlanInfo) {
    this.pricePlanInfo = pricePlanInfo;
    return this;
  }

  /**
   * Get pricePlanInfo
   * @return pricePlanInfo
   */
  @javax.annotation.Nullable
  public PricePlanInfo getPricePlanInfo() {
    return pricePlanInfo;
  }

  public void setPricePlanInfo(@javax.annotation.Nullable PricePlanInfo pricePlanInfo) {
    this.pricePlanInfo = pricePlanInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricingScheduleWithPricePlanId pricingScheduleWithPricePlanId = (PricingScheduleWithPricePlanId) o;
    return Objects.equals(this.id, pricingScheduleWithPricePlanId.id) &&
        Objects.equals(this.pricePlanDetails, pricingScheduleWithPricePlanId.pricePlanDetails) &&
        Objects.equals(this.startDate, pricingScheduleWithPricePlanId.startDate) &&
        Objects.equals(this.endDate, pricingScheduleWithPricePlanId.endDate) &&
        Objects.equals(this.version, pricingScheduleWithPricePlanId.version) &&
        Objects.equals(this.pricingRules, pricingScheduleWithPricePlanId.pricingRules) &&
        Objects.equals(this.isOverriden, pricingScheduleWithPricePlanId.isOverriden) &&
        Objects.equals(this.pricePlanId, pricingScheduleWithPricePlanId.pricePlanId) &&
        Objects.equals(this.pricePlanName, pricingScheduleWithPricePlanId.pricePlanName) &&
        Objects.equals(this.pricePlanInfo, pricingScheduleWithPricePlanId.pricePlanInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pricePlanDetails, startDate, endDate, version, pricingRules, isOverriden, pricePlanId, pricePlanName, pricePlanInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricingScheduleWithPricePlanId {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pricePlanDetails: ").append(toIndentedString(pricePlanDetails)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    pricingRules: ").append(toIndentedString(pricingRules)).append("\n");
    sb.append("    isOverriden: ").append(toIndentedString(isOverriden)).append("\n");
    sb.append("    pricePlanId: ").append(toIndentedString(pricePlanId)).append("\n");
    sb.append("    pricePlanName: ").append(toIndentedString(pricePlanName)).append("\n");
    sb.append("    pricePlanInfo: ").append(toIndentedString(pricePlanInfo)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("pricePlanDetails");
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("version");
    openapiFields.add("pricingRules");
    openapiFields.add("isOverriden");
    openapiFields.add("pricePlanId");
    openapiFields.add("pricePlanName");
    openapiFields.add("pricePlanInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("startDate");
    openapiRequiredFields.add("endDate");
    openapiRequiredFields.add("version");
    openapiRequiredFields.add("isOverriden");
    openapiRequiredFields.add("pricePlanId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PricingScheduleWithPricePlanId
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PricingScheduleWithPricePlanId.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PricingScheduleWithPricePlanId is not found in the empty JSON string", PricingScheduleWithPricePlanId.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PricingScheduleWithPricePlanId.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PricingScheduleWithPricePlanId` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PricingScheduleWithPricePlanId.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `pricePlanDetails`
      if (jsonObj.get("pricePlanDetails") != null && !jsonObj.get("pricePlanDetails").isJsonNull()) {
        PricePlanDetails.validateJsonElement(jsonObj.get("pricePlanDetails"));
      }
      if (jsonObj.get("pricingRules") != null && !jsonObj.get("pricingRules").isJsonNull()) {
        JsonArray jsonArraypricingRules = jsonObj.getAsJsonArray("pricingRules");
        if (jsonArraypricingRules != null) {
          // ensure the json data is an array
          if (!jsonObj.get("pricingRules").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `pricingRules` to be an array in the JSON string but got `%s`", jsonObj.get("pricingRules").toString()));
          }

          // validate the optional field `pricingRules` (array)
          for (int i = 0; i < jsonArraypricingRules.size(); i++) {
            PricingRule.validateJsonElement(jsonArraypricingRules.get(i));
          };
        }
      }
      if (!jsonObj.get("pricePlanId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pricePlanId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pricePlanId").toString()));
      }
      if ((jsonObj.get("pricePlanName") != null && !jsonObj.get("pricePlanName").isJsonNull()) && !jsonObj.get("pricePlanName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pricePlanName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pricePlanName").toString()));
      }
      // validate the optional field `pricePlanInfo`
      if (jsonObj.get("pricePlanInfo") != null && !jsonObj.get("pricePlanInfo").isJsonNull()) {
        PricePlanInfo.validateJsonElement(jsonObj.get("pricePlanInfo"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PricingScheduleWithPricePlanId.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PricingScheduleWithPricePlanId' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PricingScheduleWithPricePlanId> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PricingScheduleWithPricePlanId.class));

       return (TypeAdapter<T>) new TypeAdapter<PricingScheduleWithPricePlanId>() {
           @Override
           public void write(JsonWriter out, PricingScheduleWithPricePlanId value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PricingScheduleWithPricePlanId read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PricingScheduleWithPricePlanId given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PricingScheduleWithPricePlanId
   * @throws IOException if the JSON string is invalid with respect to PricingScheduleWithPricePlanId
   */
  public static PricingScheduleWithPricePlanId fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PricingScheduleWithPricePlanId.class);
  }

  /**
   * Convert an instance of PricingScheduleWithPricePlanId to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

