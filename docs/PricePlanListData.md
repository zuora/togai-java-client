

# PricePlanListData

Data of price plan list

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Identifier of price plan |  |
|**name** | **String** | Name of the price plan |  |
|**version** | **Integer** | Version of the price plan |  |
|**description** | **String** | Description of price plan |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of Price plan |  |
|**usageMeters** | **List&lt;String&gt;** | Usage meters id linked to the price plan |  |
|**pricePlanDetails** | [**PricePlanDetails**](PricePlanDetails.md) |  |  |
|**pricingRules** | [**List&lt;PricingRule&gt;**](PricingRule.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**type** | **PricePlanType** |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;DRAFT&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| ARCHIVED | &quot;ARCHIVED&quot; |


## Implemented Interfaces

* Serializable


