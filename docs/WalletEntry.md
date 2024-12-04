

# WalletEntry


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Identifier of credit transactions |  |
|**description** | **String** | description of the entry |  [optional] |
|**walletId** | **String** |  |  |
|**transactionType** | [**TransactionTypeEnum**](#TransactionTypeEnum) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**entityId** | **String** |  |  [optional] |
|**amount** | **BigDecimal** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**closingBalance** | **BigDecimal** |  |  |



## Enum: TransactionTypeEnum

| Name | Value |
|---- | -----|
| CREDITED | &quot;CREDITED&quot; |
| DEBITED | &quot;DEBITED&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| COMPLETED | &quot;COMPLETED&quot; |
| ON_HOLD | &quot;ON_HOLD&quot; |


## Implemented Interfaces

* Serializable


