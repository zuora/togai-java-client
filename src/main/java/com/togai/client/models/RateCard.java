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
import com.togai.client.models.PricingModel;
import com.togai.client.models.RateConfigUsage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * RateCard
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RateCard implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_PRICING_MODEL = "pricingModel";
  @SerializedName(SERIALIZED_NAME_PRICING_MODEL)
  private PricingModel pricingModel;

  public static final String SERIALIZED_NAME_RATE_CONFIG = "rateConfig";
  @SerializedName(SERIALIZED_NAME_RATE_CONFIG)
  private RateConfigUsage rateConfig;

  public RateCard() {
  }

  public RateCard displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public RateCard pricingModel(PricingModel pricingModel) {
    
    this.pricingModel = pricingModel;
    return this;
  }

   /**
   * Get pricingModel
   * @return pricingModel
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PricingModel getPricingModel() {
    return pricingModel;
  }


  public void setPricingModel(PricingModel pricingModel) {
    this.pricingModel = pricingModel;
  }


  public RateCard rateConfig(RateConfigUsage rateConfig) {
    
    this.rateConfig = rateConfig;
    return this;
  }

   /**
   * Get rateConfig
   * @return rateConfig
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public RateConfigUsage getRateConfig() {
    return rateConfig;
  }


  public void setRateConfig(RateConfigUsage rateConfig) {
    this.rateConfig = rateConfig;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateCard rateCard = (RateCard) o;
    return Objects.equals(this.displayName, rateCard.displayName) &&
        Objects.equals(this.pricingModel, rateCard.pricingModel) &&
        Objects.equals(this.rateConfig, rateCard.rateConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, pricingModel, rateConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateCard {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    pricingModel: ").append(toIndentedString(pricingModel)).append("\n");
    sb.append("    rateConfig: ").append(toIndentedString(rateConfig)).append("\n");
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
    openapiFields.add("displayName");
    openapiFields.add("pricingModel");
    openapiFields.add("rateConfig");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("displayName");
    openapiRequiredFields.add("pricingModel");
    openapiRequiredFields.add("rateConfig");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RateCard
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RateCard.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RateCard is not found in the empty JSON string", RateCard.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RateCard.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RateCard` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RateCard.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      // validate the optional field `rateConfig`
      if (jsonObj.get("rateConfig") != null && !jsonObj.get("rateConfig").isJsonNull()) {
        RateConfigUsage.validateJsonObject(jsonObj.getAsJsonObject("rateConfig"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RateCard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RateCard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RateCard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RateCard.class));

       return (TypeAdapter<T>) new TypeAdapter<RateCard>() {
           @Override
           public void write(JsonWriter out, RateCard value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RateCard read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RateCard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RateCard
  * @throws IOException if the JSON string is invalid with respect to RateCard
  */
  public static RateCard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RateCard.class);
  }

 /**
  * Convert an instance of RateCard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

