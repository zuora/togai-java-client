

# UpdatePricingScheduleRequest

Request to dis/associate a price plan to an account

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mode** | [**ModeEnum**](#ModeEnum) | Mode of request to create dis/association |  [optional] |
|**pricePlanId** | **String** | Id of the price plan if association request |  [optional] |
|**effectiveFrom** | **LocalDate** | Date of effectiveness of the association. - Expected only if the account already has a price plan associated with it.  |  |
|**effectiveUntil** | **LocalDate** | Date until which the association must be effective. - Expected only if effectiveFrom is present.  |  |
|**pricePlanDetailsOverride** | [**CreatePricePlanDetailsOverride**](CreatePricePlanDetailsOverride.md) |  |  [optional] |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| ASSOCIATE | &quot;ASSOCIATE&quot; |
| DISASSOCIATE | &quot;DISASSOCIATE&quot; |


## Implemented Interfaces

* Serializable


