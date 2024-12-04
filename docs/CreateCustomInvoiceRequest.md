

# CreateCustomInvoiceRequest

Payload to create invoice

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** |  |  |
|**ownerType** | [**OwnerTypeEnum**](#OwnerTypeEnum) |  |  [optional] |
|**startDate** | **OffsetDateTime** |  |  |
|**endDate** | **OffsetDateTime** |  |  |
|**idempotencyKey** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status to create an invoice in. |  |
|**lineItems** | [**List&lt;CustomInvoiceLineItem&gt;**](CustomInvoiceLineItem.md) |  |  |
|**autoAdvance** | **Boolean** | This property defines the behaviour of status transition of the invoice. If true, invoice auto transitions from &#x60;DRAFT&#x60; to &#x60;DUE&#x60; or &#x60;PAID&#x60; at the end of pricing cycle. If false, the invoice’s state doesn’t automatically advance without an explicit action. Default: false  |  [optional] |
|**applyCredits** | **Boolean** | This property defines the behaviour of whether or not to use credits to net off with the invoice amount. Default: true  |  [optional] |
|**applyWalletBalance** | **Boolean** | This property defines the behaviour of whether or not to use wallet amount to net off with the invoice amount. Default: true  |  [optional] |



## Enum: OwnerTypeEnum

| Name | Value |
|---- | -----|
| ACCOUNT | &quot;ACCOUNT&quot; |
| INVOICE_GROUP | &quot;INVOICE_GROUP&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;DRAFT&quot; |
| DUE | &quot;DUE&quot; |
| PAID | &quot;PAID&quot; |


## Implemented Interfaces

* Serializable


