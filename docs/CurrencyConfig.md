

# CurrencyConfig

Configuration for getting the currency

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mode** | [**ModeEnum**](#ModeEnum) | Mode to get the currency - CUSTOM: Use the currency provided in the request - ACCOUNT_INVOICE: Use the invoice currency of the given account  |  |
|**currency** | **String** | Currency to be used, this will be considered if mode is CUSTOM |  [optional] |
|**accountId** | **String** | Id of the account of which invoice currency will be used, this will be considered if mode is ACCOUNT_INVOICE |  [optional] |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| CUSTOM | &quot;CUSTOM&quot; |
| ACCOUNT_INVOICE | &quot;ACCOUNT_INVOICE&quot; |


## Implemented Interfaces

* Serializable


