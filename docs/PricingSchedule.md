

# PricingSchedule

Represents effectiveness period and config of a price plan. i.e, price plan bound by time.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**pricePlanDetails** | [**PricePlanDetails**](PricePlanDetails.md) |  |  [optional] |
|**startDate** | **OffsetDateTime** |  |  |
|**endDate** | **OffsetDateTime** |  |  |
|**version** | **Integer** |  |  |
|**pricingRules** | [**List&lt;PricingRule&gt;**](PricingRule.md) |  |  [optional] |
|**isOverriden** | **Boolean** |  |  |


## Implemented Interfaces

* Serializable


