

# FeatureCreditEntry

Get feature credits response

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**source** | [**SourceEnum**](#SourceEnum) | Source of the feature credit |  |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the feature credit entry |  |
|**effectiveFrom** | **OffsetDateTime** |  |  |
|**effectiveUntil** | **OffsetDateTime** |  |  |
|**granted** | **BigDecimal** |  |  [optional] |
|**balance** | **BigDecimal** |  |  [optional] |
|**used** | **BigDecimal** |  |  |



## Enum: SourceEnum

| Name | Value |
|---- | -----|
| ENTITLEMENT | &quot;ENTITLEMENT&quot; |
| PRICE_PLAN | &quot;PRICE_PLAN&quot; |
| OVERAGE | &quot;OVERAGE&quot; |
| REFUND | &quot;REFUND&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| EXPIRED | &quot;EXPIRED&quot; |
| VOIDED | &quot;VOIDED&quot; |


## Implemented Interfaces

* Serializable


