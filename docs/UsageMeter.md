

# UsageMeter

Structure of usage meter

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the usage meter |  |
|**description** | **String** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of usage meter |  |
|**status** | [**StatusEnum**](#StatusEnum) | Status of usage meter |  [optional] |
|**aggregation** | [**AggregationEnum**](#AggregationEnum) | Aggregation to be applied on usage meter result |  |
|**computations** | [**List&lt;Computation&gt;**](Computation.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**lastActivatedAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| COUNTER | &quot;COUNTER&quot; |
| GAUGE | &quot;GAUGE&quot; |
| TIMER | &quot;TIMER&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;DRAFT&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |
| ARCHIVED | &quot;ARCHIVED&quot; |



## Enum: AggregationEnum

| Name | Value |
|---- | -----|
| COUNT | &quot;COUNT&quot; |
| SUM | &quot;SUM&quot; |


## Implemented Interfaces

* Serializable


