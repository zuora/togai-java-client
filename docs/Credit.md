

# Credit


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** |  |  |
|**purpose** | **String** |  |  |
|**effectiveFrom** | **LocalDate** |  |  |
|**effectiveUntil** | **LocalDate** |  |  [optional] |
|**creditAmount** | **BigDecimal** |  |  |
|**priority** | **Integer** |  |  |
|**id** | **String** | Identifier of credits |  |
|**customerId** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**creditUnit** | **String** |  |  [optional] |
|**holdAmount** | **BigDecimal** |  |  [optional] |
|**consumedAmount** | **BigDecimal** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| CONSUMED | &quot;CONSUMED&quot; |
| EXPIRED | &quot;EXPIRED&quot; |
| VOIDED | &quot;VOIDED&quot; |


## Implemented Interfaces

* Serializable


