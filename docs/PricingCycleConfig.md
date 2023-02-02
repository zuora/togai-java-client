

# PricingCycleConfig

Represents configurations related to pricing cycle

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**interval** | [**IntervalEnum**](#IntervalEnum) | Interval field allow you to define the billing interval you would like to set |  |
|**startOffset** | [**PricingCycleConfigStartOffset**](PricingCycleConfigStartOffset.md) |  |  |
|**gracePeriod** | **Integer** | Togai allows you to ingest past dated events that will be processed by a pricing cycle till the end grace period.  For example: Pricing cycle is Monthly from 1st to 30th and gracePeriod is 5 days which next month 1 to 5th date, you can ingest past dated events during this grace period.  |  |



## Enum: IntervalEnum

| Name | Value |
|---- | -----|
| MONTHLY | &quot;MONTHLY&quot; |
| QUARTERLY | &quot;QUARTERLY&quot; |
| HALF_YEARLY | &quot;HALF_YEARLY&quot; |
| ANNUALLY | &quot;ANNUALLY&quot; |


## Implemented Interfaces

* Serializable


