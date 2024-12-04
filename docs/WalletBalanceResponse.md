

# WalletBalanceResponse

Wallet Balance response

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**accountId** | **String** |  |  |
|**customerId** | **String** |  |  |
|**balance** | **BigDecimal** | This amount is the difference of total credited amount and sum of consumed, hold amount. ie. credit amount - (consumed amount + hold amount)  |  |
|**creditUnit** | **String** |  |  |
|**externalId** | **String** |  |  [optional] |
|**status** | **WalletStatus** |  |  |
|**holdAmount** | **BigDecimal** |  |  [optional] |
|**effectiveFrom** | **OffsetDateTime** |  |  |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**metadata** | **Map&lt;String, Object&gt;** |  |  [optional] |


## Implemented Interfaces

* Serializable


