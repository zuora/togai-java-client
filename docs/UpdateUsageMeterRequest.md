

# UpdateUsageMeterRequest

Request to update usage meter

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description of the event |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of usage meter * COUNTER - Count usage  * GAUGE - Not supported at the moment * TIMER - Not supported at the moment  |  |
|**aggregation** | [**AggregationEnum**](#AggregationEnum) | Aggregation to be applied on usage meter result * COUNT - Counts number of events matching the usage meter * SUM - Sums up results of computation of all events matching usage meter  |  |
|**computations** | [**List&lt;Computation&gt;**](Computation.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| COUNTER | &quot;COUNTER&quot; |
| GAUGE | &quot;GAUGE&quot; |
| TIMER | &quot;TIMER&quot; |



## Enum: AggregationEnum

| Name | Value |
|---- | -----|
| COUNT | &quot;COUNT&quot; |
| SUM | &quot;SUM&quot; |


## Implemented Interfaces

* Serializable


