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
import com.togai.client.models.FixedFeeRateCard;
import com.togai.client.models.MinimumCommitment;
import com.togai.client.models.PricingCycleConfig;
import com.togai.client.models.UsageRateCard;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
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
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.togai.client.JSON;

/**
 * PricePlanDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PricePlanDetails implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_SUPPORTED_CURRENCIES = "supportedCurrencies";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_CURRENCIES)
  private Set<String> supportedCurrencies = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_ACTIVE_CURRENCIES = "activeCurrencies";
  @SerializedName(SERIALIZED_NAME_ACTIVE_CURRENCIES)
  private Set<String> activeCurrencies = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_PRICING_CYCLE_CONFIG = "pricingCycleConfig";
  @SerializedName(SERIALIZED_NAME_PRICING_CYCLE_CONFIG)
  private PricingCycleConfig pricingCycleConfig;

  public static final String SERIALIZED_NAME_USAGE_RATE_CARDS = "usageRateCards";
  @SerializedName(SERIALIZED_NAME_USAGE_RATE_CARDS)
  private List<UsageRateCard> usageRateCards = new ArrayList<>();

  public static final String SERIALIZED_NAME_FIXED_FEE_RATE_CARDS = "fixedFeeRateCards";
  @SerializedName(SERIALIZED_NAME_FIXED_FEE_RATE_CARDS)
  private List<FixedFeeRateCard> fixedFeeRateCards = new ArrayList<>();

  public static final String SERIALIZED_NAME_MINIMUM_COMMITMENT = "minimumCommitment";
  @SerializedName(SERIALIZED_NAME_MINIMUM_COMMITMENT)
  private MinimumCommitment minimumCommitment;

  public PricePlanDetails() {
  }

  
  public PricePlanDetails(
     Set<String> activeCurrencies
  ) {
    this();
    this.activeCurrencies = activeCurrencies;
  }

  public PricePlanDetails supportedCurrencies(Set<String> supportedCurrencies) {
    
    this.supportedCurrencies = supportedCurrencies;
    return this;
  }

  public PricePlanDetails addSupportedCurrenciesItem(String supportedCurrenciesItem) {
    this.supportedCurrencies.add(supportedCurrenciesItem);
    return this;
  }

   /**
   * Get supportedCurrencies
   * @return supportedCurrencies
  **/
  @javax.annotation.Nonnull

  public Set<String> getSupportedCurrencies() {
    return supportedCurrencies;
  }


  public void setSupportedCurrencies(Set<String> supportedCurrencies) {
    this.supportedCurrencies = supportedCurrencies;
  }


   /**
   * Get activeCurrencies
   * @return activeCurrencies
  **/
  @javax.annotation.Nonnull

  public Set<String> getActiveCurrencies() {
    return activeCurrencies;
  }




  public PricePlanDetails pricingCycleConfig(PricingCycleConfig pricingCycleConfig) {
    
    this.pricingCycleConfig = pricingCycleConfig;
    return this;
  }

   /**
   * Get pricingCycleConfig
   * @return pricingCycleConfig
  **/
  @javax.annotation.Nonnull

  public PricingCycleConfig getPricingCycleConfig() {
    return pricingCycleConfig;
  }


  public void setPricingCycleConfig(PricingCycleConfig pricingCycleConfig) {
    this.pricingCycleConfig = pricingCycleConfig;
  }


  public PricePlanDetails usageRateCards(List<UsageRateCard> usageRateCards) {
    
    this.usageRateCards = usageRateCards;
    return this;
  }

  public PricePlanDetails addUsageRateCardsItem(UsageRateCard usageRateCardsItem) {
    if (this.usageRateCards == null) {
      this.usageRateCards = new ArrayList<>();
    }
    this.usageRateCards.add(usageRateCardsItem);
    return this;
  }

   /**
   * Get usageRateCards
   * @return usageRateCards
  **/
  @javax.annotation.Nullable

  public List<UsageRateCard> getUsageRateCards() {
    return usageRateCards;
  }


  public void setUsageRateCards(List<UsageRateCard> usageRateCards) {
    this.usageRateCards = usageRateCards;
  }


  public PricePlanDetails fixedFeeRateCards(List<FixedFeeRateCard> fixedFeeRateCards) {
    
    this.fixedFeeRateCards = fixedFeeRateCards;
    return this;
  }

  public PricePlanDetails addFixedFeeRateCardsItem(FixedFeeRateCard fixedFeeRateCardsItem) {
    if (this.fixedFeeRateCards == null) {
      this.fixedFeeRateCards = new ArrayList<>();
    }
    this.fixedFeeRateCards.add(fixedFeeRateCardsItem);
    return this;
  }

   /**
   * Get fixedFeeRateCards
   * @return fixedFeeRateCards
  **/
  @javax.annotation.Nullable

  public List<FixedFeeRateCard> getFixedFeeRateCards() {
    return fixedFeeRateCards;
  }


  public void setFixedFeeRateCards(List<FixedFeeRateCard> fixedFeeRateCards) {
    this.fixedFeeRateCards = fixedFeeRateCards;
  }


  public PricePlanDetails minimumCommitment(MinimumCommitment minimumCommitment) {
    
    this.minimumCommitment = minimumCommitment;
    return this;
  }

   /**
   * Get minimumCommitment
   * @return minimumCommitment
  **/
  @javax.annotation.Nullable

  public MinimumCommitment getMinimumCommitment() {
    return minimumCommitment;
  }


  public void setMinimumCommitment(MinimumCommitment minimumCommitment) {
    this.minimumCommitment = minimumCommitment;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricePlanDetails pricePlanDetails = (PricePlanDetails) o;
    return Objects.equals(this.supportedCurrencies, pricePlanDetails.supportedCurrencies) &&
        Objects.equals(this.activeCurrencies, pricePlanDetails.activeCurrencies) &&
        Objects.equals(this.pricingCycleConfig, pricePlanDetails.pricingCycleConfig) &&
        Objects.equals(this.usageRateCards, pricePlanDetails.usageRateCards) &&
        Objects.equals(this.fixedFeeRateCards, pricePlanDetails.fixedFeeRateCards) &&
        Objects.equals(this.minimumCommitment, pricePlanDetails.minimumCommitment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportedCurrencies, activeCurrencies, pricingCycleConfig, usageRateCards, fixedFeeRateCards, minimumCommitment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricePlanDetails {\n");
    sb.append("    supportedCurrencies: ").append(toIndentedString(supportedCurrencies)).append("\n");
    sb.append("    activeCurrencies: ").append(toIndentedString(activeCurrencies)).append("\n");
    sb.append("    pricingCycleConfig: ").append(toIndentedString(pricingCycleConfig)).append("\n");
    sb.append("    usageRateCards: ").append(toIndentedString(usageRateCards)).append("\n");
    sb.append("    fixedFeeRateCards: ").append(toIndentedString(fixedFeeRateCards)).append("\n");
    sb.append("    minimumCommitment: ").append(toIndentedString(minimumCommitment)).append("\n");
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
    openapiFields.add("supportedCurrencies");
    openapiFields.add("activeCurrencies");
    openapiFields.add("pricingCycleConfig");
    openapiFields.add("usageRateCards");
    openapiFields.add("fixedFeeRateCards");
    openapiFields.add("minimumCommitment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("supportedCurrencies");
    openapiRequiredFields.add("activeCurrencies");
    openapiRequiredFields.add("pricingCycleConfig");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PricePlanDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PricePlanDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PricePlanDetails is not found in the empty JSON string", PricePlanDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PricePlanDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PricePlanDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PricePlanDetails.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("supportedCurrencies") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("supportedCurrencies").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `supportedCurrencies` to be an array in the JSON string but got `%s`", jsonObj.get("supportedCurrencies").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("activeCurrencies") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("activeCurrencies").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `activeCurrencies` to be an array in the JSON string but got `%s`", jsonObj.get("activeCurrencies").toString()));
      }
      // validate the required field `pricingCycleConfig`
      PricingCycleConfig.validateJsonObject(jsonObj.getAsJsonObject("pricingCycleConfig"));
      if (jsonObj.get("usageRateCards") != null && !jsonObj.get("usageRateCards").isJsonNull()) {
        JsonArray jsonArrayusageRateCards = jsonObj.getAsJsonArray("usageRateCards");
        if (jsonArrayusageRateCards != null) {
          // ensure the json data is an array
          if (!jsonObj.get("usageRateCards").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `usageRateCards` to be an array in the JSON string but got `%s`", jsonObj.get("usageRateCards").toString()));
          }

          // validate the optional field `usageRateCards` (array)
          for (int i = 0; i < jsonArrayusageRateCards.size(); i++) {
            UsageRateCard.validateJsonObject(jsonArrayusageRateCards.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("fixedFeeRateCards") != null && !jsonObj.get("fixedFeeRateCards").isJsonNull()) {
        JsonArray jsonArrayfixedFeeRateCards = jsonObj.getAsJsonArray("fixedFeeRateCards");
        if (jsonArrayfixedFeeRateCards != null) {
          // ensure the json data is an array
          if (!jsonObj.get("fixedFeeRateCards").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `fixedFeeRateCards` to be an array in the JSON string but got `%s`", jsonObj.get("fixedFeeRateCards").toString()));
          }

          // validate the optional field `fixedFeeRateCards` (array)
          for (int i = 0; i < jsonArrayfixedFeeRateCards.size(); i++) {
            FixedFeeRateCard.validateJsonObject(jsonArrayfixedFeeRateCards.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `minimumCommitment`
      if (jsonObj.get("minimumCommitment") != null && !jsonObj.get("minimumCommitment").isJsonNull()) {
        MinimumCommitment.validateJsonObject(jsonObj.getAsJsonObject("minimumCommitment"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PricePlanDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PricePlanDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PricePlanDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PricePlanDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<PricePlanDetails>() {
           @Override
           public void write(JsonWriter out, PricePlanDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PricePlanDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PricePlanDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PricePlanDetails
  * @throws IOException if the JSON string is invalid with respect to PricePlanDetails
  */
  public static PricePlanDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PricePlanDetails.class);
  }

 /**
  * Convert an instance of PricePlanDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

