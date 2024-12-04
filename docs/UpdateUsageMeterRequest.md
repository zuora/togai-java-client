

# UpdateUsageMeterRequest

Request to update usage meter

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of usage meter. |  [optional] |
|**billableName** | **String** | Billable name of usage meter. Billable name takes precedence over name to display in invoice. |  [optional] |
|**description** | **String** | Description of the usage meter |  [optional] |
|**eventSchemaName** | **String** | Event Schema Identifier |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of usage meter * COUNTER - Count usage  |  [optional] |
|**aggregation** | **UsageMeterAggregation** |  |  [optional] |
|**computations** | [**List&lt;Computation&gt;**](Computation.md) |  |  [optional] |
|**filters** | [**List&lt;UsageMeterFilterEntry&gt;**](UsageMeterFilterEntry.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| COUNTER | &quot;COUNTER&quot; |


## Implemented Interfaces

* Serializable


