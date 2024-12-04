

# PricingRule

Represents pricing rules of a price plan. i.e, price plan bound by time.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**name** | **String** |  |  |
|**version** | **Integer** |  |  |
|**invoiceTiming** | **PricingRuleTiming** |  |  [optional] |
|**order** | **Integer** |  |  |
|**condition** | **String** | JSON logic condition deciding whether to compute this pricing rule or not |  [optional] |
|**computation** | **String** | JSON logic to be computed |  |
|**action** | [**PricingRuleAction**](PricingRuleAction.md) |  |  |


## Implemented Interfaces

* Serializable


