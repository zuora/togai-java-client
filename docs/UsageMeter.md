

# UsageMeter

Structure of usage meter

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Identifier of the usage meter |  |
|**name** | **String** | Name of the usage meter |  |
|**billableName** | **String** | Billable name of addon. Billable name takes precedence over name to display in invoice. |  [optional] |
|**displayName** | **String** | Display name of usage meter. This is an auto-generated field which contains billableName of usage meter. If billableName is not provided, name will be used as display name.  |  |
|**description** | **String** |  |  [optional] |
|**filters** | [**List&lt;UsageMeterFilterEntry&gt;**](UsageMeterFilterEntry.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of usage meter |  |
|**status** | [**StatusEnum**](#StatusEnum) | Status of usage meter |  [optional] |
|**aggregation** | **UsageMeterAggregation** |  |  |
|**computations** | [**List&lt;Computation&gt;**](Computation.md) |  |  [optional] |
|**eventSchema** | [**EventSchema**](EventSchema.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**lastActivatedAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| COUNTER | &quot;COUNTER&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;DRAFT&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |
| ARCHIVED | &quot;ARCHIVED&quot; |


## Implemented Interfaces

* Serializable


