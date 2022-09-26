

# CreateEventSchemaRequest

Request to create event schema

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the event. Must be unique for an organization. |  |
|**description** | **String** | Description of the event |  [optional] |
|**attributes** | [**List&lt;EventAttributeSchema&gt;**](EventAttributeSchema.md) |  |  |
|**dimensions** | [**List&lt;DimensionsSchema&gt;**](DimensionsSchema.md) |  |  |


## Implemented Interfaces

* Serializable


