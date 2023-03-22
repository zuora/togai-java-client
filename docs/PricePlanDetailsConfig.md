

# PricePlanDetailsConfig

Configuration for getting the usage rate card

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mode** | [**ModeEnum**](#ModeEnum) | Mode to get the usage rate card - CUSTOM: Use the price plan details provided in the request - PRICE_PLAN: Use the usage rate cards of the given price plan - ACCOUNT: Use the usage rate cards of a associated price plan of the given account  |  |
|**pricePlanDetails** | [**CreatePricePlanDetails**](CreatePricePlanDetails.md) |  |  [optional] |
|**pricePlanId** | **String** | Id of the price plan, this will be considered if mode is PRICE_PLAN |  [optional] |
|**accountId** | **String** | Id of the account, this will be considered if mode is ACCOUNT |  [optional] |
|**effectiveOn** | **OffsetDateTime** | Will be used for getting the usage rate card, only used if mode is ACCOUNT or PRICE_PLAN |  [optional] |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| CUSTOM | &quot;CUSTOM&quot; |
| PRICE_PLAN | &quot;PRICE_PLAN&quot; |
| ACCOUNT | &quot;ACCOUNT&quot; |


## Implemented Interfaces

* Serializable


