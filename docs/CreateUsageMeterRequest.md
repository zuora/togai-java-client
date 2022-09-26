

# CreateUsageMeterRequest

Request to create usage meter

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the event. Must be unique for an organization. |  |
|**description** | **String** | Description of the event |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of usage meter |  |
|**aggregation** | [**AggregationEnum**](#AggregationEnum) | Aggregation to be applied on usage meter result |  |
|**filters** | **String** | Filters to be applied on event before matching to usage meter in JSONLogic format (https://jsonlogic.com/)  |  [optional] |
|**computation** | **String** | Computation. Has no effect if aggregation is &#39;count&#39; |  [optional] |



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


