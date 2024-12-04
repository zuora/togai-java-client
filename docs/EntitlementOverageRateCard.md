

# EntitlementOverageRateCard


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**featureId** | **String** | Unique Identifier of the attached Feature |  |
|**displayName** | **String** | Name to be displayed during invoice |  [optional] |
|**name** | **String** | Unique identifier for the rate card in a price plan. If left null it is auto-generated. |  [optional] |
|**tag** | **String** | A tag string to group rate cards |  [optional] |
|**maxQuantity** | **BigDecimal** | Maximum quantity allowed for the feature, if not specified, unlimited quantity is allowed |  [optional] |
|**ratePlan** | [**RatePlan**](RatePlan.md) |  |  |
|**rateValues** | [**List&lt;RateValue&gt;**](RateValue.md) |  |  |
|**billingConfig** | [**BillingConfig**](BillingConfig.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


