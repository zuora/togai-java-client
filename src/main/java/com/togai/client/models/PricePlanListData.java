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
import com.togai.client.models.PricePlanType;
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
 * Data of price plan list
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class PricePlanListData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  @javax.annotation.Nonnull
  private Integer version;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  /**
   * Status of Price plan
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    DRAFT("DRAFT"),
    
    ACTIVE("ACTIVE"),
    
    ARCHIVED("ARCHIVED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nonnull
  private StatusEnum status;

  public static final String SERIALIZED_NAME_USAGE_METERS = "usageMeters";
  @SerializedName(SERIALIZED_NAME_USAGE_METERS)
  @javax.annotation.Nonnull
  private List<String> usageMeters = new ArrayList<>();

  public static final String SERIALIZED_NAME_PRICE_PLAN_DETAILS = "pricePlanDetails";
  @SerializedName(SERIALIZED_NAME_PRICE_PLAN_DETAILS)
  @javax.annotation.Nonnull
  private PricePlanDetails pricePlanDetails;

  public static final String SERIALIZED_NAME_PRICING_RULES = "pricingRules";
  @SerializedName(SERIALIZED_NAME_PRICING_RULES)
  @javax.annotation.Nullable
  private List<PricingRule> pricingRules = new ArrayList<>();

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  private PricePlanType type;

  public PricePlanListData() {
  }

  public PricePlanListData id(@javax.annotation.Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of price plan
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }


  public PricePlanListData name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the price plan
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public PricePlanListData version(@javax.annotation.Nonnull Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Version of the price plan
   * @return version
   */
  @javax.annotation.Nonnull
  public Integer getVersion() {
    return version;
  }

  public void setVersion(@javax.annotation.Nonnull Integer version) {
    this.version = version;
  }


  public PricePlanListData description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of price plan
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public PricePlanListData status(@javax.annotation.Nonnull StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of Price plan
   * @return status
   */
  @javax.annotation.Nonnull
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nonnull StatusEnum status) {
    this.status = status;
  }


  public PricePlanListData usageMeters(@javax.annotation.Nonnull List<String> usageMeters) {
    this.usageMeters = usageMeters;
    return this;
  }

  public PricePlanListData addUsageMetersItem(String usageMetersItem) {
    if (this.usageMeters == null) {
      this.usageMeters = new ArrayList<>();
    }
    this.usageMeters.add(usageMetersItem);
    return this;
  }

  /**
   * Usage meters id linked to the price plan
   * @return usageMeters
   */
  @javax.annotation.Nonnull
  public List<String> getUsageMeters() {
    return usageMeters;
  }

  public void setUsageMeters(@javax.annotation.Nonnull List<String> usageMeters) {
    this.usageMeters = usageMeters;
  }


  public PricePlanListData pricePlanDetails(@javax.annotation.Nonnull PricePlanDetails pricePlanDetails) {
    this.pricePlanDetails = pricePlanDetails;
    return this;
  }

  /**
   * Get pricePlanDetails
   * @return pricePlanDetails
   */
  @javax.annotation.Nonnull
  public PricePlanDetails getPricePlanDetails() {
    return pricePlanDetails;
  }

  public void setPricePlanDetails(@javax.annotation.Nonnull PricePlanDetails pricePlanDetails) {
    this.pricePlanDetails = pricePlanDetails;
  }


  public PricePlanListData pricingRules(@javax.annotation.Nullable List<PricingRule> pricingRules) {
    this.pricingRules = pricingRules;
    return this;
  }

  public PricePlanListData addPricingRulesItem(PricingRule pricingRulesItem) {
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


  public PricePlanListData createdAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public PricePlanListData updatedAt(@javax.annotation.Nonnull OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(@javax.annotation.Nonnull OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public PricePlanListData type(@javax.annotation.Nonnull PricePlanType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  public PricePlanType getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull PricePlanType type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricePlanListData pricePlanListData = (PricePlanListData) o;
    return Objects.equals(this.id, pricePlanListData.id) &&
        Objects.equals(this.name, pricePlanListData.name) &&
        Objects.equals(this.version, pricePlanListData.version) &&
        Objects.equals(this.description, pricePlanListData.description) &&
        Objects.equals(this.status, pricePlanListData.status) &&
        Objects.equals(this.usageMeters, pricePlanListData.usageMeters) &&
        Objects.equals(this.pricePlanDetails, pricePlanListData.pricePlanDetails) &&
        Objects.equals(this.pricingRules, pricePlanListData.pricingRules) &&
        Objects.equals(this.createdAt, pricePlanListData.createdAt) &&
        Objects.equals(this.updatedAt, pricePlanListData.updatedAt) &&
        Objects.equals(this.type, pricePlanListData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, version, description, status, usageMeters, pricePlanDetails, pricingRules, createdAt, updatedAt, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricePlanListData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    usageMeters: ").append(toIndentedString(usageMeters)).append("\n");
    sb.append("    pricePlanDetails: ").append(toIndentedString(pricePlanDetails)).append("\n");
    sb.append("    pricingRules: ").append(toIndentedString(pricingRules)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("version");
    openapiFields.add("description");
    openapiFields.add("status");
    openapiFields.add("usageMeters");
    openapiFields.add("pricePlanDetails");
    openapiFields.add("pricingRules");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("version");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("usageMeters");
    openapiRequiredFields.add("pricePlanDetails");
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("updatedAt");
    openapiRequiredFields.add("type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PricePlanListData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PricePlanListData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PricePlanListData is not found in the empty JSON string", PricePlanListData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PricePlanListData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PricePlanListData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PricePlanListData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the required field `status`
      StatusEnum.validateJsonElement(jsonObj.get("status"));
      // ensure the required json array is present
      if (jsonObj.get("usageMeters") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("usageMeters").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `usageMeters` to be an array in the JSON string but got `%s`", jsonObj.get("usageMeters").toString()));
      }
      // validate the required field `pricePlanDetails`
      PricePlanDetails.validateJsonElement(jsonObj.get("pricePlanDetails"));
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
      // validate the required field `type`
      PricePlanType.validateJsonElement(jsonObj.get("type"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PricePlanListData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PricePlanListData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PricePlanListData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PricePlanListData.class));

       return (TypeAdapter<T>) new TypeAdapter<PricePlanListData>() {
           @Override
           public void write(JsonWriter out, PricePlanListData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PricePlanListData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PricePlanListData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PricePlanListData
   * @throws IOException if the JSON string is invalid with respect to PricePlanListData
   */
  public static PricePlanListData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PricePlanListData.class);
  }

  /**
   * Convert an instance of PricePlanListData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

