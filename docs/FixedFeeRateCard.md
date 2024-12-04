

# FixedFeeRateCard


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique Identifier of the attached AddOn |  |
|**displayName** | **String** | Name of the attached AddOn |  [optional] |
|**name** | **String** | Unique identifier for the rate card in a price plan. If left null it is auto-generated. |  [optional] |
|**tag** | **String** | A tag string to group fixedFeeRateCards |  [optional] |
|**invoiceTiming** | **InvoiceTiming** |  |  [optional] |
|**type** | **FixedFeeType** |  |  [optional] |
|**rateValues** | [**List&lt;CurrencyRateValue&gt;**](CurrencyRateValue.md) |  |  |
|**enableProration** | **Boolean** |  |  |
|**recurrenceConfig** | [**RecurrenceConfig**](RecurrenceConfig.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


