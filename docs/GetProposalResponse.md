

# GetProposalResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**accountId** | **String** |  |  |
|**pricePlanId** | **String** | Id of the price plan, Required for ENTITLEMENT_GRANT, ASSOCIATION purchase |  [optional] |
|**quantity** | **Integer** |  |  [optional] |
|**rateCardQuantities** | **Map&lt;String, BigDecimal&gt;** |  |  [optional] |
|**idempotencyKey** | **String** |  |  [optional] |
|**pricePlanVersion** | **Integer** |  |  [optional] |
|**purchasePlanOverride** | [**PricePlanDetailsOverride**](PricePlanDetailsOverride.md) |  |  [optional] |
|**associationOverride** | [**CreatePricePlanDetailsOverride**](CreatePricePlanDetailsOverride.md) |  |  [optional] |
|**walletTopupDetails** | [**WalletTopupDetails**](WalletTopupDetails.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**effectiveFrom** | **LocalDate** |  |  [optional] |
|**effectiveUntil** | **LocalDate** |  |  [optional] |
|**expiryDate** | **OffsetDateTime** |  |  [optional] |
|**price** | **BigDecimal** |  |  [optional] |
|**invoiceId** | **String** |  |  [optional] |
|**invoiceCurrency** | **String** |  |  [optional] |
|**status** | **PurchaseStatus** |  |  |
|**type** | **PurchaseType** |  |  |
|**comment** | **String** |  |  [optional] |
|**paymentMode** | [**PaymentModeEnum**](#PaymentModeEnum) |  |  |
|**proposalResponseDate** | **OffsetDateTime** |  |  [optional] |



## Enum: PaymentModeEnum

| Name | Value |
|---- | -----|
| PREPAID | &quot;PREPAID&quot; |
| POSTPAID | &quot;POSTPAID&quot; |


## Implemented Interfaces

* Serializable


