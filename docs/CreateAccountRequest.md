

# CreateAccountRequest

Payload to create account

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Identifier of the account |  |
|**name** | **String** | Name of the customer |  |
|**invoiceCurrency** | **String** | [ISO_4217](https://en.wikipedia.org/wiki/ISO_4217) code of the currency in which the account must be invoiced Defaults to Base currency.  |  [optional] |
|**aliases** | **List&lt;String&gt;** | Aliases are tags that are associated with an account. Multiple aliases are allowed for a single account. |  [optional] |


## Implemented Interfaces

* Serializable


