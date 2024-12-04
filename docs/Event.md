

# Event

Contents of the event

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemaName** | **String** | Name of the Event Schema.  Know more about [event schema](https://docs.togai.com/docs/event-schemas)  |  |
|**id** | **String** | Togai restricts users to ingest events with same id within a period of *45 days*. This restriction is common for [/entitled API](/api-reference/entitlements/ingest-event-if-a-user-is-entitled-to-a-feature), [/ingest API](/api-reference/event-ingestion/ingest-events-to-togai) and [/ingestBatch API](/api-reference/event-ingestion/ingest-events-to-togai-in-batch). i.e, an id used on /ingest API will not be allowed on /ingestBatch or /entitled APIs |  [optional] |
|**timestamp** | **OffsetDateTime** | Source time stamp of the event. This timestamp must be in ISO 8601 format. |  |
|**accountId** | **String** | The event will be associated with the provided account |  |
|**attributes** | [**List&lt;Attribute&gt;**](Attribute.md) | Attributes are numeric values. It can be usage metric which you push to Togai |  |
|**dimensions** | **Map&lt;String, String&gt;** | Dimensions are tags/labels associated with the events. |  |


## Implemented Interfaces

* Serializable


