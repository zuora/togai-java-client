

# LicenseRateCard


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique Identifier of the attached AddOn |  |
|**type** | **AddOnType** |  |  [optional] |
|**displayName** | **String** | Name of the attached AddOn |  [optional] |
|**name** | **String** | Unique identifier for the rate card in a price plan. If left null it is auto-generated. |  [optional] |
|**tag** | **String** | A tag string to group licenseRateCards |  [optional] |
|**invoiceTiming** | **InvoiceTiming** |  |  [optional] |
|**usageCycle** | **UsageCycleInterval** |  |  [optional] |
|**enableProration** | **Boolean** |  |  |
|**config** | [**LicenseRateCardConfig**](LicenseRateCardConfig.md) |  |  [optional] |
|**ratePlan** | [**RatePlan**](RatePlan.md) |  |  |
|**rateValues** | [**List&lt;RateValue&gt;**](RateValue.md) |  |  |
|**proratedRefundMode** | **ProratedRefundMode** |  |  [optional] |


## Implemented Interfaces

* Serializable


