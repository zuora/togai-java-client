

# BillingEntitlementRateCard

Billing Entitlement rate card

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**featureId** | **String** |  |  |
|**featureConfigs** | [**List&lt;FeatureConfig&gt;**](FeatureConfig.md) |  |  |
|**tag** | **String** | A tag string to group rate cards |  [optional] |
|**invoiceTiming** | **InvoiceTiming** |  |  |
|**displayName** | **String** | Name your rate card, this will be used in invoice |  [optional] |
|**name** | **String** | Unique identifier for the rate card in a price plan. If left null it is auto-generated. |  [optional] |
|**ratePlan** | [**RatePlan**](RatePlan.md) |  |  |
|**rateValues** | [**List&lt;RateValue&gt;**](RateValue.md) |  |  |
|**recurrenceConfig** | [**RecurrenceConfig**](RecurrenceConfig.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


