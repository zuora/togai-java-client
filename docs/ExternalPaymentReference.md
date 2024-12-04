

# ExternalPaymentReference

external payment reference object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sourceName** | **String** |  |  |
|**sourceType** | [**SourceTypeEnum**](#SourceTypeEnum) |  |  |
|**transactionNumber** | **String** | Check number or Card transaction number |  |
|**description** | **String** |  |  [optional] |
|**metadata** | **Map&lt;String, Object&gt;** |  |  [optional] |



## Enum: SourceTypeEnum

| Name | Value |
|---- | -----|
| GATEWAY | &quot;GATEWAY&quot; |
| CASH | &quot;CASH&quot; |
| CHEQUE | &quot;CHEQUE&quot; |
| BANK_TRANSFER | &quot;BANK_TRANSFER&quot; |
| CARD | &quot;CARD&quot; |


## Implemented Interfaces

* Serializable


