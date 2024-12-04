

# PricingRulesLog

Pricing Rules Logs

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**order** | **Integer** |  |  |
|**changes** | [**PricingRuleChangesLog**](PricingRuleChangesLog.md) |  |  |
|**rule** | [**PricingRuleInfo**](PricingRuleInfo.md) |  |  [optional] |
|**variablesValue** | [**Map&lt;String, PricingRulesValues&gt;**](PricingRulesValues.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CONDITION_TRUE | &quot;CONDITION_TRUE&quot; |
| CONDITION_FALSE | &quot;CONDITION_FALSE&quot; |
| CONDITION_ERROR | &quot;CONDITION_ERROR&quot; |
| COMPUTATION_ERROR | &quot;COMPUTATION_ERROR&quot; |


## Implemented Interfaces

* Serializable


