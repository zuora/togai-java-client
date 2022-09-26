

# AssociatePricePlanRequest

Request to associate a price plan to an account

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pricePlanName** | **String** | Name of the price plan |  |
|**effectiveFrom** | **LocalDate** | Date of effectiveness of the association. - Expected only if the account already has a price plan associated with it. - Date can only be startDate of any billing cycle of the currently associated price plan.  |  [optional] |
|**rateCardOverride** | [**RateCard**](RateCard.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


