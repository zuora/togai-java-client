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
import com.togai.client.models.AccountAliases;
import com.togai.client.models.AccountsBillingInformation;
import com.togai.client.models.Address;
import com.togai.client.models.CreateEntitySetting;
import com.togai.client.models.InvoiceGroupDetails;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
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
 * Structure of an account
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class Account implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  public static final String SERIALIZED_NAME_TOGAI_ACCOUNT_ID = "togaiAccountId";
  @SerializedName(SERIALIZED_NAME_TOGAI_ACCOUNT_ID)
  @javax.annotation.Nonnull
  private String togaiAccountId;

  public static final String SERIALIZED_NAME_TOGAI_CUSTOMER_ID = "togaiCustomerId";
  @SerializedName(SERIALIZED_NAME_TOGAI_CUSTOMER_ID)
  @javax.annotation.Nonnull
  private String togaiCustomerId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customerId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  @javax.annotation.Nonnull
  private String customerId;

  public static final String SERIALIZED_NAME_INVOICE_CURRENCY = "invoiceCurrency";
  @SerializedName(SERIALIZED_NAME_INVOICE_CURRENCY)
  @javax.annotation.Nullable
  private String invoiceCurrency;

  public static final String SERIALIZED_NAME_ALIASES = "aliases";
  @SerializedName(SERIALIZED_NAME_ALIASES)
  @javax.annotation.Nullable
  private List<AccountAliases> aliases = new ArrayList<>();

  public static final String SERIALIZED_NAME_NET_TERM_DAYS = "netTermDays";
  @SerializedName(SERIALIZED_NAME_NET_TERM_DAYS)
  @javax.annotation.Nullable
  private Integer netTermDays;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  @javax.annotation.Nullable
  private Address address;

  public static final String SERIALIZED_NAME_PRIMARY_EMAIL = "primaryEmail";
  @SerializedName(SERIALIZED_NAME_PRIMARY_EMAIL)
  @javax.annotation.Nullable
  private String primaryEmail;

  public static final String SERIALIZED_NAME_BILLING_INFORMATION = "billingInformation";
  @SerializedName(SERIALIZED_NAME_BILLING_INFORMATION)
  @javax.annotation.Nullable
  private AccountsBillingInformation billingInformation;

  /**
   * Status of the account
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    DRAFT("DRAFT"),
    
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

  public static final String SERIALIZED_NAME_SETTINGS = "settings";
  @SerializedName(SERIALIZED_NAME_SETTINGS)
  @javax.annotation.Nullable
  private List<CreateEntitySetting> settings = new ArrayList<>();

  public static final String SERIALIZED_NAME_INVOICE_GROUP_DETAILS = "invoiceGroupDetails";
  @SerializedName(SERIALIZED_NAME_INVOICE_GROUP_DETAILS)
  @javax.annotation.Nullable
  private InvoiceGroupDetails invoiceGroupDetails;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  @javax.annotation.Nullable
  private Map<String, String> metadata = new HashMap<>();

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  @javax.annotation.Nullable
  private Set<String> tags = new LinkedHashSet<>();

  public Account() {
  }

  public Account id(@javax.annotation.Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of the account
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }


  public Account togaiAccountId(@javax.annotation.Nonnull String togaiAccountId) {
    this.togaiAccountId = togaiAccountId;
    return this;
  }

  /**
   * Unique identifier of the account
   * @return togaiAccountId
   */
  @javax.annotation.Nonnull
  public String getTogaiAccountId() {
    return togaiAccountId;
  }

  public void setTogaiAccountId(@javax.annotation.Nonnull String togaiAccountId) {
    this.togaiAccountId = togaiAccountId;
  }


  public Account togaiCustomerId(@javax.annotation.Nonnull String togaiCustomerId) {
    this.togaiCustomerId = togaiCustomerId;
    return this;
  }

  /**
   * Unique identifier of the customer
   * @return togaiCustomerId
   */
  @javax.annotation.Nonnull
  public String getTogaiCustomerId() {
    return togaiCustomerId;
  }

  public void setTogaiCustomerId(@javax.annotation.Nonnull String togaiCustomerId) {
    this.togaiCustomerId = togaiCustomerId;
  }


  public Account name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the Account
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public Account customerId(@javax.annotation.Nonnull String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Identifier of the customer
   * @return customerId
   */
  @javax.annotation.Nonnull
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(@javax.annotation.Nonnull String customerId) {
    this.customerId = customerId;
  }


  public Account invoiceCurrency(@javax.annotation.Nullable String invoiceCurrency) {
    this.invoiceCurrency = invoiceCurrency;
    return this;
  }

  /**
   * [ISO_4217](https://en.wikipedia.org/wiki/ISO_4217) code of the currency in which the account must be invoiced Defaults to Base currency. 
   * @return invoiceCurrency
   */
  @javax.annotation.Nullable
  public String getInvoiceCurrency() {
    return invoiceCurrency;
  }

  public void setInvoiceCurrency(@javax.annotation.Nullable String invoiceCurrency) {
    this.invoiceCurrency = invoiceCurrency;
  }


  public Account aliases(@javax.annotation.Nullable List<AccountAliases> aliases) {
    this.aliases = aliases;
    return this;
  }

  public Account addAliasesItem(AccountAliases aliasesItem) {
    if (this.aliases == null) {
      this.aliases = new ArrayList<>();
    }
    this.aliases.add(aliasesItem);
    return this;
  }

  /**
   * list of aliases of the account
   * @return aliases
   */
  @javax.annotation.Nullable
  public List<AccountAliases> getAliases() {
    return aliases;
  }

  public void setAliases(@javax.annotation.Nullable List<AccountAliases> aliases) {
    this.aliases = aliases;
  }


  public Account netTermDays(@javax.annotation.Nullable Integer netTermDays) {
    this.netTermDays = netTermDays;
    return this;
  }

  /**
   * Get netTermDays
   * @return netTermDays
   */
  @javax.annotation.Nullable
  public Integer getNetTermDays() {
    return netTermDays;
  }

  public void setNetTermDays(@javax.annotation.Nullable Integer netTermDays) {
    this.netTermDays = netTermDays;
  }


  public Account address(@javax.annotation.Nullable Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @javax.annotation.Nullable
  public Address getAddress() {
    return address;
  }

  public void setAddress(@javax.annotation.Nullable Address address) {
    this.address = address;
  }


  public Account primaryEmail(@javax.annotation.Nullable String primaryEmail) {
    this.primaryEmail = primaryEmail;
    return this;
  }

  /**
   * Primary email of the customer
   * @return primaryEmail
   */
  @javax.annotation.Nullable
  public String getPrimaryEmail() {
    return primaryEmail;
  }

  public void setPrimaryEmail(@javax.annotation.Nullable String primaryEmail) {
    this.primaryEmail = primaryEmail;
  }


  public Account billingInformation(@javax.annotation.Nullable AccountsBillingInformation billingInformation) {
    this.billingInformation = billingInformation;
    return this;
  }

  /**
   * Get billingInformation
   * @return billingInformation
   */
  @javax.annotation.Nullable
  public AccountsBillingInformation getBillingInformation() {
    return billingInformation;
  }

  public void setBillingInformation(@javax.annotation.Nullable AccountsBillingInformation billingInformation) {
    this.billingInformation = billingInformation;
  }


  public Account status(@javax.annotation.Nonnull StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the account
   * @return status
   */
  @javax.annotation.Nonnull
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nonnull StatusEnum status) {
    this.status = status;
  }


  public Account settings(@javax.annotation.Nullable List<CreateEntitySetting> settings) {
    this.settings = settings;
    return this;
  }

  public Account addSettingsItem(CreateEntitySetting settingsItem) {
    if (this.settings == null) {
      this.settings = new ArrayList<>();
    }
    this.settings.add(settingsItem);
    return this;
  }

  /**
   * Get settings
   * @return settings
   */
  @javax.annotation.Nullable
  public List<CreateEntitySetting> getSettings() {
    return settings;
  }

  public void setSettings(@javax.annotation.Nullable List<CreateEntitySetting> settings) {
    this.settings = settings;
  }


  public Account invoiceGroupDetails(@javax.annotation.Nullable InvoiceGroupDetails invoiceGroupDetails) {
    this.invoiceGroupDetails = invoiceGroupDetails;
    return this;
  }

  /**
   * Get invoiceGroupDetails
   * @return invoiceGroupDetails
   */
  @javax.annotation.Nullable
  public InvoiceGroupDetails getInvoiceGroupDetails() {
    return invoiceGroupDetails;
  }

  public void setInvoiceGroupDetails(@javax.annotation.Nullable InvoiceGroupDetails invoiceGroupDetails) {
    this.invoiceGroupDetails = invoiceGroupDetails;
  }


  public Account metadata(@javax.annotation.Nullable Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public Account putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

  /**
   * Additional information associated with the account. Example: GSTN, VATN 
   * @return metadata
   */
  @javax.annotation.Nullable
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(@javax.annotation.Nullable Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public Account tags(@javax.annotation.Nullable Set<String> tags) {
    this.tags = tags;
    return this;
  }

  public Account addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new LinkedHashSet<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tag for accounts are stored in lowercase
   * @return tags
   */
  @javax.annotation.Nullable
  public Set<String> getTags() {
    return tags;
  }

  public void setTags(@javax.annotation.Nullable Set<String> tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.id, account.id) &&
        Objects.equals(this.togaiAccountId, account.togaiAccountId) &&
        Objects.equals(this.togaiCustomerId, account.togaiCustomerId) &&
        Objects.equals(this.name, account.name) &&
        Objects.equals(this.customerId, account.customerId) &&
        Objects.equals(this.invoiceCurrency, account.invoiceCurrency) &&
        Objects.equals(this.aliases, account.aliases) &&
        Objects.equals(this.netTermDays, account.netTermDays) &&
        Objects.equals(this.address, account.address) &&
        Objects.equals(this.primaryEmail, account.primaryEmail) &&
        Objects.equals(this.billingInformation, account.billingInformation) &&
        Objects.equals(this.status, account.status) &&
        Objects.equals(this.settings, account.settings) &&
        Objects.equals(this.invoiceGroupDetails, account.invoiceGroupDetails) &&
        Objects.equals(this.metadata, account.metadata) &&
        Objects.equals(this.tags, account.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, togaiAccountId, togaiCustomerId, name, customerId, invoiceCurrency, aliases, netTermDays, address, primaryEmail, billingInformation, status, settings, invoiceGroupDetails, metadata, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    togaiAccountId: ").append(toIndentedString(togaiAccountId)).append("\n");
    sb.append("    togaiCustomerId: ").append(toIndentedString(togaiCustomerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    invoiceCurrency: ").append(toIndentedString(invoiceCurrency)).append("\n");
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
    sb.append("    netTermDays: ").append(toIndentedString(netTermDays)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    primaryEmail: ").append(toIndentedString(primaryEmail)).append("\n");
    sb.append("    billingInformation: ").append(toIndentedString(billingInformation)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    invoiceGroupDetails: ").append(toIndentedString(invoiceGroupDetails)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("togaiAccountId");
    openapiFields.add("togaiCustomerId");
    openapiFields.add("name");
    openapiFields.add("customerId");
    openapiFields.add("invoiceCurrency");
    openapiFields.add("aliases");
    openapiFields.add("netTermDays");
    openapiFields.add("address");
    openapiFields.add("primaryEmail");
    openapiFields.add("billingInformation");
    openapiFields.add("status");
    openapiFields.add("settings");
    openapiFields.add("invoiceGroupDetails");
    openapiFields.add("metadata");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("togaiAccountId");
    openapiRequiredFields.add("togaiCustomerId");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("customerId");
    openapiRequiredFields.add("status");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Account
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Account.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Account is not found in the empty JSON string", Account.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Account.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Account` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Account.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("togaiAccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `togaiAccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("togaiAccountId").toString()));
      }
      if (!jsonObj.get("togaiCustomerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `togaiCustomerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("togaiCustomerId").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("customerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerId").toString()));
      }
      if ((jsonObj.get("invoiceCurrency") != null && !jsonObj.get("invoiceCurrency").isJsonNull()) && !jsonObj.get("invoiceCurrency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoiceCurrency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoiceCurrency").toString()));
      }
      if (jsonObj.get("aliases") != null && !jsonObj.get("aliases").isJsonNull()) {
        JsonArray jsonArrayaliases = jsonObj.getAsJsonArray("aliases");
        if (jsonArrayaliases != null) {
          // ensure the json data is an array
          if (!jsonObj.get("aliases").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `aliases` to be an array in the JSON string but got `%s`", jsonObj.get("aliases").toString()));
          }

          // validate the optional field `aliases` (array)
          for (int i = 0; i < jsonArrayaliases.size(); i++) {
            AccountAliases.validateJsonElement(jsonArrayaliases.get(i));
          };
        }
      }
      // validate the optional field `address`
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) {
        Address.validateJsonElement(jsonObj.get("address"));
      }
      if ((jsonObj.get("primaryEmail") != null && !jsonObj.get("primaryEmail").isJsonNull()) && !jsonObj.get("primaryEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primaryEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primaryEmail").toString()));
      }
      // validate the optional field `billingInformation`
      if (jsonObj.get("billingInformation") != null && !jsonObj.get("billingInformation").isJsonNull()) {
        AccountsBillingInformation.validateJsonElement(jsonObj.get("billingInformation"));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the required field `status`
      StatusEnum.validateJsonElement(jsonObj.get("status"));
      if (jsonObj.get("settings") != null && !jsonObj.get("settings").isJsonNull()) {
        JsonArray jsonArraysettings = jsonObj.getAsJsonArray("settings");
        if (jsonArraysettings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("settings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `settings` to be an array in the JSON string but got `%s`", jsonObj.get("settings").toString()));
          }

          // validate the optional field `settings` (array)
          for (int i = 0; i < jsonArraysettings.size(); i++) {
            CreateEntitySetting.validateJsonElement(jsonArraysettings.get(i));
          };
        }
      }
      // validate the optional field `invoiceGroupDetails`
      if (jsonObj.get("invoiceGroupDetails") != null && !jsonObj.get("invoiceGroupDetails").isJsonNull()) {
        InvoiceGroupDetails.validateJsonElement(jsonObj.get("invoiceGroupDetails"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Account.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Account' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Account> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Account.class));

       return (TypeAdapter<T>) new TypeAdapter<Account>() {
           @Override
           public void write(JsonWriter out, Account value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Account read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Account given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Account
   * @throws IOException if the JSON string is invalid with respect to Account
   */
  public static Account fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Account.class);
  }

  /**
   * Convert an instance of Account to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

