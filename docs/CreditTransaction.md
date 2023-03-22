

# CreditTransaction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Identifier of credit transactions |  |
|**creditId** | **String** |  |  |
|**transactionType** | [**TransactionTypeEnum**](#TransactionTypeEnum) |  |  |
|**invoiceId** | **String** |  |  [optional] |
|**amount** | **BigDecimal** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |



## Enum: TransactionTypeEnum

| Name | Value |
|---- | -----|
| CREDITED | &quot;CREDITED&quot; |
| DEBITED | &quot;DEBITED&quot; |
| EXPIRED | &quot;EXPIRED&quot; |
| VOIDED | &quot;VOIDED&quot; |


## Implemented Interfaces

* Serializable


