

# CreateFeatureRequest

Create a Feature stand-alone or associate it with schemas

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the feature |  |
|**billableName** | **String** | Billable name of feature. Billable name takes precedence over name to display in invoice. |  [optional] |
|**schemaAssociations** | [**Set&lt;EventSchemasForFeature&gt;**](EventSchemasForFeature.md) | Association of a feature with event_schemas |  |


## Implemented Interfaces

* Serializable


