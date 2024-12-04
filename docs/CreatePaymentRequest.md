

# CreatePaymentRequest

payload to create payment

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A brief description of the payment |  [optional] |
|**notes** | **String** | A detailed note about the payment |  [optional] |
|**accountId** | **String** |  |  |
|**externalPaymentReference** | [**ExternalPaymentReference**](ExternalPaymentReference.md) |  |  |
|**lineItemRecords** | [**List&lt;PaymentLineItemRecord&gt;**](PaymentLineItemRecord.md) |  |  |
|**currency** | **String** |  |  |
|**totalAmount** | **BigDecimal** |  |  |


## Implemented Interfaces

* Serializable


