

# Payment

Payment object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**notes** | **String** |  |  [optional] |
|**accountId** | **String** |  |  |
|**externalPaymentReferences** | [**ExternalPaymentReference**](ExternalPaymentReference.md) |  |  |
|**lineItemRecords** | [**List&lt;PaymentLineItemRecord&gt;**](PaymentLineItemRecord.md) |  |  |
|**totalAmount** | **BigDecimal** |  |  |
|**currency** | **String** |  |  |
|**version** | **BigDecimal** |  |  |
|**createdBy** | **String** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |


## Implemented Interfaces

* Serializable


