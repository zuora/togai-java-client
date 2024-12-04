

# UpdateInvoiceRequest

Payload to update an invoice

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startDate** | **OffsetDateTime** |  |  [optional] |
|**endDate** | **OffsetDateTime** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of invoice |  [optional] |
|**lineItems** | [**List&lt;CustomInvoiceLineItem&gt;**](CustomInvoiceLineItem.md) |  |  [optional] |
|**autoAdvance** | **Boolean** | This property defines the behaviour of status updates of invoices like: Enabling this property to true auto updates the status of invoice to DUE or PAID accordingly But disabling this property of left null does not auto update the custom status  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DUE | &quot;DUE&quot; |
| PAID | &quot;PAID&quot; |
| VOID | &quot;VOID&quot; |
| UN_COLLECTIBLE | &quot;UN_COLLECTIBLE&quot; |
| REFUND_INITIATED | &quot;REFUND_INITIATED&quot; |


## Implemented Interfaces

* Serializable


