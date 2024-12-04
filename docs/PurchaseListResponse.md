

# PurchaseListResponse

Represents a Purchase for List Response

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**pricePlanId** | **String** |  |  [optional] |
|**pricePlanName** | **String** |  |  [optional] |
|**quantity** | **Integer** |  |  [optional] |
|**rateCardQuantities** | **Map&lt;String, BigDecimal&gt;** |  |  [optional] |
|**pricePlanVersion** | **Integer** |  |  [optional] |
|**status** | **PurchaseStatus** |  |  |
|**idempotencyKey** | **String** |  |  [optional] |
|**purchasePlan** | [**PricePlanDetails**](PricePlanDetails.md) |  |  [optional] |
|**walletTopupDetails** | [**WalletTopupDetails**](WalletTopupDetails.md) |  |  [optional] |
|**price** | **BigDecimal** |  |  [optional] |
|**invoiceCurrency** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**type** | **PurchaseType** |  |  |


## Implemented Interfaces

* Serializable


