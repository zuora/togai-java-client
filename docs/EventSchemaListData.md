

# EventSchemaListData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the event. Must be unique for an organization. |  |
|**description** | **String** | Description of the event |  [optional] |
|**version** | **Integer** | Version of event schema |  |
|**status** | [**StatusEnum**](#StatusEnum) | Status of event schema * DRAFT - Schema is in draft state  * ACTIVE - Schema is currently active  * INACTIVE - Schema is currently inactive * ARCHIVED - Older version of event schema  |  [optional] |
|**attributes** | [**Set&lt;EventAttributeSchema&gt;**](EventAttributeSchema.md) |  |  [optional] |
|**dimensions** | [**Set&lt;DimensionsSchema&gt;**](DimensionsSchema.md) |  |  [optional] |
|**filterFields** | **Set&lt;String&gt;** |  |  [optional] |
|**featureDetails** | [**FeatureDetails**](FeatureDetails.md) |  |  [optional] |
|**enrichments** | [**Enrichments**](Enrichments.md) |  |  [optional] |
|**eventIdTemplate** | **String** | Template used to generate event id based on event payload |  [optional] |
|**eventLevelRevenue** | **Boolean** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**usageMetersCount** | **Integer** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;DRAFT&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |
| ARCHIVED | &quot;ARCHIVED&quot; |


## Implemented Interfaces

* Serializable


