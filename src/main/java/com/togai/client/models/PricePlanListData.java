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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.togai.client.models.PricePlanDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.togai.client.JSON;

/**
 * Data of price plan list
 */
@ApiModel(description = "Data of price plan list")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PricePlanListData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
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
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_USAGE_METERS = "usageMeters";
  @SerializedName(SERIALIZED_NAME_USAGE_METERS)
  private List<String> usageMeters = new ArrayList<>();

  public static final String SERIALIZED_NAME_PRICE_PLAN_DETAILS = "pricePlanDetails";
  @SerializedName(SERIALIZED_NAME_PRICE_PLAN_DETAILS)
  private PricePlanDetails pricePlanDetails;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public PricePlanListData() {
  }

  public PricePlanListData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the price plan
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the price plan")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PricePlanListData description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of price plan
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of price plan")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public PricePlanListData status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status of Price plan
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Status of Price plan")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public PricePlanListData usageMeters(List<String> usageMeters) {
    
    this.usageMeters = usageMeters;
    return this;
  }

  public PricePlanListData addUsageMetersItem(String usageMetersItem) {
    this.usageMeters.add(usageMetersItem);
    return this;
  }

   /**
   * Usage meters name linked to the price plan
   * @return usageMeters
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Usage meters name linked to the price plan")

  public List<String> getUsageMeters() {
    return usageMeters;
  }


  public void setUsageMeters(List<String> usageMeters) {
    this.usageMeters = usageMeters;
  }


  public PricePlanListData pricePlanDetails(PricePlanDetails pricePlanDetails) {
    
    this.pricePlanDetails = pricePlanDetails;
    return this;
  }

   /**
   * Get pricePlanDetails
   * @return pricePlanDetails
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PricePlanDetails getPricePlanDetails() {
    return pricePlanDetails;
  }


  public void setPricePlanDetails(PricePlanDetails pricePlanDetails) {
    this.pricePlanDetails = pricePlanDetails;
  }


  public PricePlanListData createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public PricePlanListData updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
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
    return Objects.equals(this.name, pricePlanListData.name) &&
        Objects.equals(this.description, pricePlanListData.description) &&
        Objects.equals(this.status, pricePlanListData.status) &&
        Objects.equals(this.usageMeters, pricePlanListData.usageMeters) &&
        Objects.equals(this.pricePlanDetails, pricePlanListData.pricePlanDetails) &&
        Objects.equals(this.createdAt, pricePlanListData.createdAt) &&
        Objects.equals(this.updatedAt, pricePlanListData.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, status, usageMeters, pricePlanDetails, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricePlanListData {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    usageMeters: ").append(toIndentedString(usageMeters)).append("\n");
    sb.append("    pricePlanDetails: ").append(toIndentedString(pricePlanDetails)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("status");
    openapiFields.add("usageMeters");
    openapiFields.add("pricePlanDetails");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("usageMeters");
    openapiRequiredFields.add("pricePlanDetails");
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("updatedAt");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PricePlanListData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PricePlanListData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PricePlanListData is not found in the empty JSON string", PricePlanListData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PricePlanListData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PricePlanListData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PricePlanListData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("usageMeters") != null && !jsonObj.get("usageMeters").isJsonNull()) && !jsonObj.get("usageMeters").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `usageMeters` to be an array in the JSON string but got `%s`", jsonObj.get("usageMeters").toString()));
      }
      // validate the optional field `pricePlanDetails`
      if (jsonObj.get("pricePlanDetails") != null && !jsonObj.get("pricePlanDetails").isJsonNull()) {
        PricePlanDetails.validateJsonObject(jsonObj.getAsJsonObject("pricePlanDetails"));
      }
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
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
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

