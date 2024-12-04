

# UpdateEventSchemaRequest

Request to update event schema

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description of the event |  [optional] |
|**attributes** | [**List&lt;EventAttributeSchema&gt;**](EventAttributeSchema.md) |  |  [optional] |
|**dimensions** | [**List&lt;DimensionsSchema&gt;**](DimensionsSchema.md) |  |  [optional] |
|**enrichments** | [**Enrichments**](Enrichments.md) |  |  [optional] |
|**filterFields** | **Set&lt;String&gt;** | List of fields that can be used for filtering in usage meter |  [optional] |
|**eventIdTemplate** | **String** | Template used to generate event id based on event payload |  [optional] |


## Implemented Interfaces

* Serializable


