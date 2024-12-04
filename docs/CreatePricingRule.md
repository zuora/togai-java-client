

# CreatePricingRule


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the pricing rule |  |
|**order** | **Integer** | Order of the pricing rule |  |
|**invoiceTiming** | **PricingRuleTiming** |  |  [optional] |
|**condition** | **String** | JSON logic condition deciding whether to compute this pricing rule or not |  [optional] |
|**computation** | **String** | JSON logic to be computed |  |
|**action** | [**PricingRuleAction**](PricingRuleAction.md) |  |  |


## Implemented Interfaces

* Serializable


