

# CreateAccountRequest

Payload to create account

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Identifier of the account |  |
|**name** | **String** | Name of the Account |  |
|**invoiceCurrency** | **String** | Use [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code in which the account must be invoiced.   For example: AED is the currency code for United Arab Emirates dirham.  |  [optional] |
|**aliases** | **List&lt;String&gt;** | Aliases are tags that are associated with an account. Multiple aliases are allowed for a single account. |  [optional] |
|**settings** | [**List&lt;CreateEntitySetting&gt;**](CreateEntitySetting.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


