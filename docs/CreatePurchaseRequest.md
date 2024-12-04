

# CreatePurchaseRequest

Create a purchase for an account

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pricePlanId** | **String** | Id of the price plan, Required for ENTITLEMENT_GRANT, ASSOCIATION purchase |  [optional] |
|**quantity** | **Integer** |  |  [optional] |
|**rateCardQuantities** | **Map&lt;String, BigDecimal&gt;** |  |  [optional] |
|**idempotencyKey** | **String** |  |  [optional] |
|**purchasePlanOverride** | [**PurchasePlanOverride**](PurchasePlanOverride.md) |  |  [optional] |
|**associationOverride** | [**CreatePricePlanDetailsOverride**](CreatePricePlanDetailsOverride.md) |  |  [optional] |
|**walletTopupDetails** | [**WalletTopupDetails**](WalletTopupDetails.md) |  |  [optional] |
|**effectiveFrom** | **LocalDate** |  |  [optional] |
|**effectiveUntil** | **LocalDate** |  |  [optional] |
|**expiryDate** | **OffsetDateTime** |  |  [optional] |
|**type** | **PurchaseType** |  |  [optional] |


## Implemented Interfaces

* Serializable


