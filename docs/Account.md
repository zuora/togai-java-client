

# Account

Structure of an account

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Identifier of the account |  |
|**name** | **String** | Name of the Account |  |
|**invoiceCurrency** | **String** | [ISO_4217](https://en.wikipedia.org/wiki/ISO_4217) code of the currency in which the account must be invoiced Defaults to Base currency.  |  |
|**aliases** | [**List&lt;AccountAliases&gt;**](AccountAliases.md) | list of aliases of the account |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the account |  |
|**settings** | [**List&lt;CreateEntitySetting&gt;**](CreateEntitySetting.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| ARCHIVED | &quot;ARCHIVED&quot; |


## Implemented Interfaces

* Serializable


