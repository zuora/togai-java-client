

# ProposalsListResponse

Represents a Proposal for List Response

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**pricePlanId** | **String** |  |  [optional] |
|**pricePlanName** | **String** |  |  [optional] |
|**pricePlanVersion** | **Integer** |  |  [optional] |
|**status** | **PurchaseStatus** |  |  |
|**walletTopupDetails** | [**WalletTopupDetails**](WalletTopupDetails.md) |  |  [optional] |
|**idempotencyKey** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**expiryDate** | **OffsetDateTime** |  |  [optional] |
|**paymentMode** | [**PaymentModeEnum**](#PaymentModeEnum) |  |  |
|**type** | **PurchaseType** |  |  |



## Enum: PaymentModeEnum

| Name | Value |
|---- | -----|
| PREPAID | &quot;PREPAID&quot; |
| POSTPAID | &quot;POSTPAID&quot; |


## Implemented Interfaces

* Serializable


