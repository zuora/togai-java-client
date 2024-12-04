

# CreditGrantRateCard

Credit grant rate card

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**displayName** | **String** |  |  [optional] |
|**name** | **String** | Unique identifier for the rate card in a price plan. If left null it is auto-generated. |  [optional] |
|**tag** | **String** | A tag string to group creditGrantRateCard |  [optional] |
|**grantDetails** | [**GrantDetails**](GrantDetails.md) |  |  |
|**rateDetails** | [**CreditRateDetails**](CreditRateDetails.md) |  |  |
|**invoiceTiming** | **InvoiceTiming** |  |  [optional] |
|**type** | **CreditGrantType** |  |  [optional] |
|**recurrenceConfig** | [**RecurrenceConfig**](RecurrenceConfig.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


