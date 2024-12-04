

# CreateAccountRequest

Payload to create account

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Identifier of the account |  |
|**name** | **String** | Name of the Account |  |
|**invoiceCurrency** | **String** | Use [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code in which the account must be invoiced.   For example: AED is the currency code for United Arab Emirates dirham.  |  [optional] |
|**aliases** | **List&lt;String&gt;** | Aliases are tags that are associated with an account. Multiple aliases are allowed for a single account. |  [optional] |
|**accountAliases** | [**List&lt;CreateAccountAliasRequest&gt;**](CreateAccountAliasRequest.md) | Aliases which effective range |  [optional] |
|**address** | [**Address**](Address.md) |  |  [optional] |
|**primaryEmail** | **String** | Primary email of the account |  [optional] |
|**billingInformation** | [**AccountsBillingInformation**](AccountsBillingInformation.md) |  |  [optional] |
|**settings** | [**List&lt;CreateEntitySetting&gt;**](CreateEntitySetting.md) |  |  [optional] |
|**netTermDays** | **Integer** | Net term for the invoices of the account |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** | Additional information associated with the account. Example: GSTN, VATN  |  [optional] |
|**tags** | **Set&lt;String&gt;** | Tag for accounts are stored in lowercase |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the created account defaults to ACTIVE |  [optional] |
|**customerId** | **String** | Customer Identifier for whom the account is being created |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| DRAFT | &quot;DRAFT&quot; |


## Implemented Interfaces

* Serializable


