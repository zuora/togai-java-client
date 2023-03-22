

# Invoice

Structure of invoice

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Identifier of customer |  |
|**customerId** | **String** |  |  |
|**accountId** | **String** |  |  |
|**pricePlanId** | **String** |  |  |
|**usageInfo** | [**List&lt;InvoiceLineItem&gt;**](InvoiceLineItem.md) |  |  [optional] |
|**revenueInfo** | [**InvoiceLineItem**](InvoiceLineItem.md) |  |  [optional] |
|**invoiceDetails** | [**InvoiceDetails**](InvoiceDetails.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the invoice |  |
|**startDate** | **OffsetDateTime** | Start date of the invoice |  |
|**endDate** | **OffsetDateTime** | End date of the invoice |  |
|**invoiceDate** | **OffsetDateTime** | Invoice date of the invoice |  |
|**generatedAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ONGOING | &quot;ONGOING&quot; |
| GRACE_PERIOD | &quot;GRACE_PERIOD&quot; |
| GENERATED | &quot;GENERATED&quot; |
| PUBLISHED | &quot;PUBLISHED&quot; |


## Implemented Interfaces

* Serializable


