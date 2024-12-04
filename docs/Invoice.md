

# Invoice

Structure of invoice

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Identifier of invoice |  |
|**customerId** | **String** |  |  [optional] |
|**ownerId** | **String** |  |  [optional] |
|**pricePlanId** | **String** |  |  [optional] |
|**usageInfo** | [**List&lt;InvoiceLineItem&gt;**](InvoiceLineItem.md) |  |  [optional] |
|**revenueInfo** | [**InvoiceLineItem**](InvoiceLineItem.md) |  |  [optional] |
|**invoiceDetails** | [**InvoiceDetails**](InvoiceDetails.md) |  |  [optional] |
|**status** | **InvoicesStatus** |  |  |
|**finalizingStatus** | [**FinalizingStatusEnum**](#FinalizingStatusEnum) |  |  [optional] |
|**invoiceClass** | **InvoicesClass** |  |  |
|**invoiceType** | **InvoicesType** |  |  |
|**autoAdvance** | **Boolean** |  |  [optional] |
|**startDate** | **OffsetDateTime** | Start date of the invoice |  [optional] |
|**endDate** | **OffsetDateTime** | End date of the invoice |  [optional] |
|**endDateInclusive** | **OffsetDateTime** | Inclusive end date of the invoice |  [optional] |
|**invoiceDate** | **OffsetDateTime** | Invoice date of the invoice |  |
|**dueDate** | **OffsetDateTime** | Due date of the invoice |  [optional] |
|**generatedAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  |
|**metadata** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**info** | [**List&lt;InvoiceInfoInner&gt;**](InvoiceInfoInner.md) |  |  [optional] |
|**sequenceId** | **String** | Sequence id of the invoice |  [optional] |
|**pdfUrl** | **String** | Download URL of the pdf file corresponding to the invoice |  [optional] |
|**totalAmount** | **BigDecimal** |  |  |
|**paidAmount** | **BigDecimal** |  |  |
|**netTermDays** | **Integer** | Number of days from the invoice date after which an invoice is considered overdue. |  |



## Enum: FinalizingStatusEnum

| Name | Value |
|---- | -----|
| FINALIZING | &quot;FINALIZING&quot; |
| FINALIZED | &quot;FINALIZED&quot; |


## Implemented Interfaces

* Serializable


