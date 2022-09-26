

# MetricQuery

Object representing a single metrics query

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**name** | **MetricName** |  |  |
|**aggregationPeriod** | [**AggregationPeriodEnum**](#AggregationPeriodEnum) |  |  |
|**groupBy** | **String** |  |  [optional] |
|**filters** | [**List&lt;MetricQueryFilterEntry&gt;**](MetricQueryFilterEntry.md) |  |  [optional] |



## Enum: AggregationPeriodEnum

| Name | Value |
|---- | -----|
| DAY | &quot;DAY&quot; |
| WEEK | &quot;WEEK&quot; |
| MONTH | &quot;MONTH&quot; |


## Implemented Interfaces

* Serializable


