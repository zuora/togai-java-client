

# InvoiceSummary

Structure of invoice response

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Identifier of invoice |  |
|**customerId** | **String** |  |  [optional] |
|**ownerId** | **String** |  |  [optional] |
|**pricePlanId** | **String** |  |  [optional] |
|**status** | **InvoicesStatus** |  |  |
|**finalizingStatus** | [**FinalizingStatusEnum**](#FinalizingStatusEnum) |  |  [optional] |
|**invoiceClass** | **InvoicesClass** |  |  |
|**invoiceType** | **InvoicesType** |  |  |
|**startDate** | **OffsetDateTime** | Start date of the invoice |  [optional] |
|**endDate** | **OffsetDateTime** | End date of the invoice |  [optional] |
|**endDateInclusive** | **OffsetDateTime** | Inclusive end date of the invoice |  [optional] |
|**invoiceDate** | **OffsetDateTime** | Invoice date of the invoice |  |
|**dueDate** | **OffsetDateTime** | Due date of the invoice |  [optional] |
|**generatedAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  |
|**sequenceId** | **String** | Sequence id of the invoice |  [optional] |
|**pdfUrl** | **String** | Download URL of the pdf file corresponding to the invoice |  [optional] |
|**totalAmount** | **BigDecimal** |  |  |
|**paidAmount** | **BigDecimal** |  |  |
|**invoiceDetails** | [**InvoiceDetails**](InvoiceDetails.md) |  |  [optional] |
|**netTermDays** | **Integer** | Number of days from the invoice date after which an invoice is considered overdue. |  |



## Enum: FinalizingStatusEnum

| Name | Value |
|---- | -----|
| FINALIZING | &quot;FINALIZING&quot; |
| FINALIZED | &quot;FINALIZED&quot; |


## Implemented Interfaces

* Serializable


