

# Account

Structure of an account

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Identifier of the account |  |
|**togaiAccountId** | **String** | Unique identifier of the account |  |
|**togaiCustomerId** | **String** | Unique identifier of the customer |  |
|**name** | **String** | Name of the Account |  |
|**customerId** | **String** | Identifier of the customer |  |
|**invoiceCurrency** | **String** | [ISO_4217](https://en.wikipedia.org/wiki/ISO_4217) code of the currency in which the account must be invoiced Defaults to Base currency.  |  [optional] |
|**aliases** | [**List&lt;AccountAliases&gt;**](AccountAliases.md) | list of aliases of the account |  [optional] |
|**netTermDays** | **Integer** |  |  [optional] |
|**address** | [**Address**](Address.md) |  |  [optional] |
|**primaryEmail** | **String** | Primary email of the customer |  [optional] |
|**billingInformation** | [**AccountsBillingInformation**](AccountsBillingInformation.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the account |  |
|**settings** | [**List&lt;CreateEntitySetting&gt;**](CreateEntitySetting.md) |  |  [optional] |
|**invoiceGroupDetails** | [**InvoiceGroupDetails**](InvoiceGroupDetails.md) |  |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** | Additional information associated with the account. Example: GSTN, VATN  |  [optional] |
|**tags** | **Set&lt;String&gt;** | Tag for accounts are stored in lowercase |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| DRAFT | &quot;DRAFT&quot; |
| ARCHIVED | &quot;ARCHIVED&quot; |


## Implemented Interfaces

* Serializable


