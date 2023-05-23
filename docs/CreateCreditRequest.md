

# CreateCreditRequest

Payload to grant Credits

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** |  |  |
|**purpose** | **String** |  |  |
|**applicableEntityIds** | **Set&lt;String&gt;** | List of entity ids for which the credit is applicable. If null or empty, the credit is applicable to all ids. This list can accept special values like: - ALL_USAGE_METER_RATE_CARDS: To apply the credit to all usage meter rate cards - ALL_FIXED_FEE_RATE_CARDS: To apply the credit to all fixed fee rate cards  |  [optional] |
|**effectiveFrom** | **LocalDate** |  |  |
|**effectiveUntil** | **LocalDate** |  |  [optional] |
|**creditAmount** | **BigDecimal** |  |  |
|**priority** | **Integer** |  |  |


## Implemented Interfaces

* Serializable


