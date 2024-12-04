

# CreateUsageMeterRequest

Request to create usage meter

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the usage meter. Must be unique for an organization. |  |
|**billableName** | **String** | Billable name of usage meter. Billable name takes precedence over name to display in invoice. |  [optional] |
|**description** | **String** | Description of the usage meter |  [optional] |
|**filters** | [**List&lt;UsageMeterFilterEntry&gt;**](UsageMeterFilterEntry.md) | The usage meter&#39;s applicability will be determined by comparing the filter condition agianst the events. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of usage meter |  |
|**aggregation** | **UsageMeterAggregation** |  |  |
|**computations** | [**List&lt;Computation&gt;**](Computation.md) |  |  [optional] |
|**eventSchemaName** | **String** | Event Schema Identifier |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| COUNTER | &quot;COUNTER&quot; |


## Implemented Interfaces

* Serializable


