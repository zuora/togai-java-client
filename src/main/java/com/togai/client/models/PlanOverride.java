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
import com.togai.client.models.PricePlanDetailsOverride;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * Represents effectiveness period and config of a price plan. i.e, price plan bound by time.
 */
@ApiModel(description = "Represents effectiveness period and config of a price plan. i.e, price plan bound by time.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PlanOverride implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PRICE_PLAN_NAME = "pricePlanName";
  @SerializedName(SERIALIZED_NAME_PRICE_PLAN_NAME)
  private String pricePlanName;

  public static final String SERIALIZED_NAME_PRICE_PLAN_DETAILS_OVERRIDE = "pricePlanDetailsOverride";
  @SerializedName(SERIALIZED_NAME_PRICE_PLAN_DETAILS_OVERRIDE)
  private PricePlanDetailsOverride pricePlanDetailsOverride;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public PlanOverride() {
  }

  public PlanOverride pricePlanName(String pricePlanName) {
    
    this.pricePlanName = pricePlanName;
    return this;
  }

   /**
   * Get pricePlanName
   * @return pricePlanName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPricePlanName() {
    return pricePlanName;
  }


  public void setPricePlanName(String pricePlanName) {
    this.pricePlanName = pricePlanName;
  }


  public PlanOverride pricePlanDetailsOverride(PricePlanDetailsOverride pricePlanDetailsOverride) {
    
    this.pricePlanDetailsOverride = pricePlanDetailsOverride;
    return this;
  }

   /**
   * Get pricePlanDetailsOverride
   * @return pricePlanDetailsOverride
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PricePlanDetailsOverride getPricePlanDetailsOverride() {
    return pricePlanDetailsOverride;
  }


  public void setPricePlanDetailsOverride(PricePlanDetailsOverride pricePlanDetailsOverride) {
    this.pricePlanDetailsOverride = pricePlanDetailsOverride;
  }


  public PlanOverride startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public PlanOverride endDate(OffsetDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanOverride planOverride = (PlanOverride) o;
    return Objects.equals(this.pricePlanName, planOverride.pricePlanName) &&
        Objects.equals(this.pricePlanDetailsOverride, planOverride.pricePlanDetailsOverride) &&
        Objects.equals(this.startDate, planOverride.startDate) &&
        Objects.equals(this.endDate, planOverride.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pricePlanName, pricePlanDetailsOverride, startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanOverride {\n");
    sb.append("    pricePlanName: ").append(toIndentedString(pricePlanName)).append("\n");
    sb.append("    pricePlanDetailsOverride: ").append(toIndentedString(pricePlanDetailsOverride)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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
    openapiFields.add("pricePlanName");
    openapiFields.add("pricePlanDetailsOverride");
    openapiFields.add("startDate");
    openapiFields.add("endDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pricePlanName");
    openapiRequiredFields.add("startDate");
    openapiRequiredFields.add("endDate");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PlanOverride
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PlanOverride.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PlanOverride is not found in the empty JSON string", PlanOverride.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PlanOverride.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PlanOverride` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PlanOverride.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("pricePlanName") != null && !jsonObj.get("pricePlanName").isJsonNull()) && !jsonObj.get("pricePlanName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pricePlanName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pricePlanName").toString()));
      }
      // validate the optional field `pricePlanDetailsOverride`
      if (jsonObj.get("pricePlanDetailsOverride") != null && !jsonObj.get("pricePlanDetailsOverride").isJsonNull()) {
        PricePlanDetailsOverride.validateJsonObject(jsonObj.getAsJsonObject("pricePlanDetailsOverride"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PlanOverride.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PlanOverride' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PlanOverride> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PlanOverride.class));

       return (TypeAdapter<T>) new TypeAdapter<PlanOverride>() {
           @Override
           public void write(JsonWriter out, PlanOverride value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PlanOverride read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PlanOverride given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PlanOverride
  * @throws IOException if the JSON string is invalid with respect to PlanOverride
  */
  public static PlanOverride fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PlanOverride.class);
  }

 /**
  * Convert an instance of PlanOverride to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

