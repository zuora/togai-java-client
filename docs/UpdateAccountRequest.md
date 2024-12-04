

# UpdateAccountRequest

Payload to update account

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the Account |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**invoiceCurrency** | **String** | [ISO_4217](https://en.wikipedia.org/wiki/ISO_4217) code of the currency in which the account must be invoiced Defaults to Base currency.  |  [optional] |
|**netTermDays** | **Integer** |  |  [optional] |
|**primaryEmail** | **String** | Primary email of the account |  [optional] |
|**billingInformation** | [**AccountsBillingInformation**](AccountsBillingInformation.md) |  |  [optional] |
|**address** | [**Address**](Address.md) |  |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** | Additional information associated with the account. Example: GSTN, VATN NOTE: This replaces the existing metadata if the metadata in the request is not null.  To remove all existing metadata, use empty object  |  [optional] |
|**tags** | **Set&lt;String&gt;** | Tag for accounts are stored in lowercase |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| DRAFT | &quot;DRAFT&quot; |


## Implemented Interfaces

* Serializable


