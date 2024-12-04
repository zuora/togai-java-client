

# PricePlanDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**supportedCurrencies** | **Set&lt;String&gt;** |  |  |
|**activeCurrencies** | **Set&lt;String&gt;** |  |  [readonly] |
|**pricingCycleConfig** | [**PricingCycleConfig**](PricingCycleConfig.md) |  |  [optional] |
|**usageRateCards** | [**List&lt;UsageRateCard&gt;**](UsageRateCard.md) |  |  [optional] |
|**fixedFeeRateCards** | [**List&lt;FixedFeeRateCard&gt;**](FixedFeeRateCard.md) |  |  [optional] |
|**licenseRateCards** | [**List&lt;LicenseRateCard&gt;**](LicenseRateCard.md) |  |  [optional] |
|**billingEntitlementRateCards** | [**List&lt;BillingEntitlementRateCard&gt;**](BillingEntitlementRateCard.md) |  |  [optional] |
|**entitlementOverageRateCards** | [**List&lt;EntitlementOverageRateCard&gt;**](EntitlementOverageRateCard.md) |  |  [optional] |
|**minimumCommitment** | [**MinimumCommitment**](MinimumCommitment.md) |  |  [optional] |
|**creditGrantRateCards** | [**List&lt;CreditGrantRateCard&gt;**](CreditGrantRateCard.md) |  |  [optional] |
|**type** | **PricePlanType** |  |  [optional] |
|**deferredRevenue** | **Boolean** |  |  [optional] |
|**allowOngoingCycleUpdates** | **Object** | Allow changes to price plan from the beginning of the ongoing cycle. type: boolean  |  [optional] |


## Implemented Interfaces

* Serializable


