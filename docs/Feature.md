

# Feature

Represents a Feature

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**name** | **String** |  |  |
|**billableName** | **String** |  |  [optional] |
|**displayName** | **String** | Display name of feature. This is an auto-generated field which contains billableName of feature. If billableName is not provided, name will be used as display name.  |  |
|**schemaAssociations** | [**Set&lt;EventSchemasForFeature&gt;**](EventSchemasForFeature.md) | Association of a feature with event_schemas |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |


## Implemented Interfaces

* Serializable


