

# RateCardUsageValue

Represents rate card of a price plan of usage type

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**rateStrategy** | [**RateStrategyEnum**](#RateStrategyEnum) |  |  |
|**slabStrategy** | [**SlabStrategyEnum**](#SlabStrategyEnum) |  |  |
|**slabs** | [**List&lt;UsageStrategy&gt;**](UsageStrategy.md) |  |  |



## Enum: RateStrategyEnum

| Name | Value |
|---- | -----|
| FLAT | &quot;FLAT&quot; |
| PER_UNIT | &quot;PER_UNIT&quot; |



## Enum: SlabStrategyEnum

| Name | Value |
|---- | -----|
| TIER | &quot;TIER&quot; |


## Implemented Interfaces

* Serializable


