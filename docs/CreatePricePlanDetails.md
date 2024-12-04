

# CreatePricePlanDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pricingCycleConfig** | [**PricingCycleConfig**](PricingCycleConfig.md) |  |  [optional] |
|**supportedCurrencies** | **Set&lt;String&gt;** | List of currencies supported by the price plan |  |
|**usageRateCards** | [**List&lt;UsageRateCard&gt;**](UsageRateCard.md) | List of usage rate cards |  [optional] |
|**fixedFeeRateCards** | [**List&lt;FixedFeeRateCard&gt;**](FixedFeeRateCard.md) |  |  [optional] |
|**licenseRateCards** | [**List&lt;LicenseRateCard&gt;**](LicenseRateCard.md) |  |  [optional] |
|**billingEntitlementRateCards** | [**List&lt;BillingEntitlementRateCard&gt;**](BillingEntitlementRateCard.md) |  |  [optional] |
|**minimumCommitment** | [**MinimumCommitment**](MinimumCommitment.md) |  |  [optional] |
|**creditGrantRateCards** | [**List&lt;CreditGrantRateCard&gt;**](CreditGrantRateCard.md) |  |  [optional] |
|**entitlementOverageRateCards** | [**List&lt;EntitlementOverageRateCard&gt;**](EntitlementOverageRateCard.md) |  |  [optional] |
|**deferredRevenue** | **Boolean** | This option can be enabled while creating a price plan to opt for deferred revenue finalization. i.e, Togai will assume that the price plan may change any time during the pricing cycle and  thereby does not compute the revenue in near-real time.  This gives the flexibility of editing rate cards in price plan from beginning of the pricing cycle. Enabling this mode comes with the following limitations. 1. Following rate cards are not supported under a &#x60;deferredRevenue&#x60; plan     * creditGrantRateCards,     * billingEntitlementRateCards,     * entitlementOverageRateCards,     * IN_ADVANCE fixedFeeRateCards,     * IN_ADVANCE licenseRateCards 2. Metrics API return revenue metrics only after the grace period of the account&#39;s pricing cycle  (i.e, only once the invoice becomes DUE)  |  [optional] |
|**allowOngoingCycleUpdates** | **Boolean** | Allow changes to price plan from the beginning of the ongoing cycle.  |  [optional] |


## Implemented Interfaces

* Serializable


