

# MetricQuery

Object representing a single metrics query

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Mandatory  for all request.  User defined ID for identifying the request for your internal reference  |  |
|**name** | **MetricName** |  |  |
|**aggregationPeriod** | [**AggregationPeriodEnum**](#AggregationPeriodEnum) | Set the aggregation period. Allowed periods are DAY, WEEK, MONTH |  |
|**groupBy** | **String** | Group your metric with a groupBy field.  Allowed fields are  ACCOUNT_ID EVENT_STATUS  SCHEMA_NAME  USAGE_METER_ID  Please refer the table above for the list of combinations allowed in the groupBy  |  [optional] |
|**configs** | **Map&lt;String, String&gt;** | Configurations. | Metric Name       | Config Key | Allowed Values  | Default value |              Description          | |-------------------|------------|-----------------|---------------|-----------------------------------| | REVENUE           | CURRENCY   | BASE or INVOICE | BASE          | currency to return the revenue in | | REVENUE_FOR_CYCLE | CURRENCY   | BASE or INVOICE | BASE          | currency to return the revenue in |  |  [optional] |
|**filters** | [**List&lt;MetricQueryFilterEntry&gt;**](MetricQueryFilterEntry.md) | Filter on specific fields.  Refer possible fieldNames and fieldValues from the table above.  |  [optional] |



## Enum: AggregationPeriodEnum

| Name | Value |
|---- | -----|
| DAY | &quot;DAY&quot; |
| WEEK | &quot;WEEK&quot; |
| MONTH | &quot;MONTH&quot; |


## Implemented Interfaces

* Serializable


