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
import com.togai.client.models.Event;
import com.togai.client.models.EventPipelineInfo;
import com.togai.client.models.EventSource;
import com.togai.client.models.IngestionStatus;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * EventWithStatusAndEventPipelineInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class EventWithStatusAndEventPipelineInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "referenceId";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  @javax.annotation.Nonnull
  private String referenceId;

  public static final String SERIALIZED_NAME_EVENT_PAYLOAD = "eventPayload";
  @SerializedName(SERIALIZED_NAME_EVENT_PAYLOAD)
  @javax.annotation.Nonnull
  private Event eventPayload;

  public static final String SERIALIZED_NAME_INGESTION_STATUS = "ingestionStatus";
  @SerializedName(SERIALIZED_NAME_INGESTION_STATUS)
  @javax.annotation.Nonnull
  private IngestionStatus ingestionStatus;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customerId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  @javax.annotation.Nullable
  private String customerId;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  @javax.annotation.Nullable
  private EventSource source;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_EVENT_PIPELINE_INFO = "eventPipelineInfo";
  @SerializedName(SERIALIZED_NAME_EVENT_PIPELINE_INFO)
  @javax.annotation.Nonnull
  private EventPipelineInfo eventPipelineInfo;

  public EventWithStatusAndEventPipelineInfo() {
  }

  public EventWithStatusAndEventPipelineInfo referenceId(@javax.annotation.Nonnull String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

  /**
   * Unique id generated by Togai to identify an event uniquely
   * @return referenceId
   */
  @javax.annotation.Nonnull
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(@javax.annotation.Nonnull String referenceId) {
    this.referenceId = referenceId;
  }


  public EventWithStatusAndEventPipelineInfo eventPayload(@javax.annotation.Nonnull Event eventPayload) {
    this.eventPayload = eventPayload;
    return this;
  }

  /**
   * Get eventPayload
   * @return eventPayload
   */
  @javax.annotation.Nonnull
  public Event getEventPayload() {
    return eventPayload;
  }

  public void setEventPayload(@javax.annotation.Nonnull Event eventPayload) {
    this.eventPayload = eventPayload;
  }


  public EventWithStatusAndEventPipelineInfo ingestionStatus(@javax.annotation.Nonnull IngestionStatus ingestionStatus) {
    this.ingestionStatus = ingestionStatus;
    return this;
  }

  /**
   * Get ingestionStatus
   * @return ingestionStatus
   */
  @javax.annotation.Nonnull
  public IngestionStatus getIngestionStatus() {
    return ingestionStatus;
  }

  public void setIngestionStatus(@javax.annotation.Nonnull IngestionStatus ingestionStatus) {
    this.ingestionStatus = ingestionStatus;
  }


  public EventWithStatusAndEventPipelineInfo customerId(@javax.annotation.Nullable String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * The associated account belongs to this customer
   * @return customerId
   */
  @javax.annotation.Nullable
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(@javax.annotation.Nullable String customerId) {
    this.customerId = customerId;
  }


  public EventWithStatusAndEventPipelineInfo source(@javax.annotation.Nullable EventSource source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
   */
  @javax.annotation.Nullable
  public EventSource getSource() {
    return source;
  }

  public void setSource(@javax.annotation.Nullable EventSource source) {
    this.source = source;
  }


  public EventWithStatusAndEventPipelineInfo createdAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Created time stamp of the event. This timestamp must be in ISO 8601 format.
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public EventWithStatusAndEventPipelineInfo eventPipelineInfo(@javax.annotation.Nonnull EventPipelineInfo eventPipelineInfo) {
    this.eventPipelineInfo = eventPipelineInfo;
    return this;
  }

  /**
   * Get eventPipelineInfo
   * @return eventPipelineInfo
   */
  @javax.annotation.Nonnull
  public EventPipelineInfo getEventPipelineInfo() {
    return eventPipelineInfo;
  }

  public void setEventPipelineInfo(@javax.annotation.Nonnull EventPipelineInfo eventPipelineInfo) {
    this.eventPipelineInfo = eventPipelineInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventWithStatusAndEventPipelineInfo eventWithStatusAndEventPipelineInfo = (EventWithStatusAndEventPipelineInfo) o;
    return Objects.equals(this.referenceId, eventWithStatusAndEventPipelineInfo.referenceId) &&
        Objects.equals(this.eventPayload, eventWithStatusAndEventPipelineInfo.eventPayload) &&
        Objects.equals(this.ingestionStatus, eventWithStatusAndEventPipelineInfo.ingestionStatus) &&
        Objects.equals(this.customerId, eventWithStatusAndEventPipelineInfo.customerId) &&
        Objects.equals(this.source, eventWithStatusAndEventPipelineInfo.source) &&
        Objects.equals(this.createdAt, eventWithStatusAndEventPipelineInfo.createdAt) &&
        Objects.equals(this.eventPipelineInfo, eventWithStatusAndEventPipelineInfo.eventPipelineInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceId, eventPayload, ingestionStatus, customerId, source, createdAt, eventPipelineInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventWithStatusAndEventPipelineInfo {\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    eventPayload: ").append(toIndentedString(eventPayload)).append("\n");
    sb.append("    ingestionStatus: ").append(toIndentedString(ingestionStatus)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    eventPipelineInfo: ").append(toIndentedString(eventPipelineInfo)).append("\n");
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
    openapiFields.add("referenceId");
    openapiFields.add("eventPayload");
    openapiFields.add("ingestionStatus");
    openapiFields.add("customerId");
    openapiFields.add("source");
    openapiFields.add("createdAt");
    openapiFields.add("eventPipelineInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("referenceId");
    openapiRequiredFields.add("eventPayload");
    openapiRequiredFields.add("ingestionStatus");
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("eventPipelineInfo");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EventWithStatusAndEventPipelineInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EventWithStatusAndEventPipelineInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventWithStatusAndEventPipelineInfo is not found in the empty JSON string", EventWithStatusAndEventPipelineInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EventWithStatusAndEventPipelineInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventWithStatusAndEventPipelineInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EventWithStatusAndEventPipelineInfo.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("referenceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referenceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referenceId").toString()));
      }
      // validate the required field `eventPayload`
      Event.validateJsonElement(jsonObj.get("eventPayload"));
      // validate the required field `ingestionStatus`
      IngestionStatus.validateJsonElement(jsonObj.get("ingestionStatus"));
      if ((jsonObj.get("customerId") != null && !jsonObj.get("customerId").isJsonNull()) && !jsonObj.get("customerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerId").toString()));
      }
      // validate the optional field `source`
      if (jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) {
        EventSource.validateJsonElement(jsonObj.get("source"));
      }
      // validate the required field `eventPipelineInfo`
      EventPipelineInfo.validateJsonElement(jsonObj.get("eventPipelineInfo"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventWithStatusAndEventPipelineInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventWithStatusAndEventPipelineInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventWithStatusAndEventPipelineInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventWithStatusAndEventPipelineInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<EventWithStatusAndEventPipelineInfo>() {
           @Override
           public void write(JsonWriter out, EventWithStatusAndEventPipelineInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventWithStatusAndEventPipelineInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EventWithStatusAndEventPipelineInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EventWithStatusAndEventPipelineInfo
   * @throws IOException if the JSON string is invalid with respect to EventWithStatusAndEventPipelineInfo
   */
  public static EventWithStatusAndEventPipelineInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventWithStatusAndEventPipelineInfo.class);
  }

  /**
   * Convert an instance of EventWithStatusAndEventPipelineInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

