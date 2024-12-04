

# LicenseUpdateRequest

License update request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**licenseId** | **String** | The license id for which the update is requested |  |
|**accountId** | **String** | The account id for which the license is being updated |  |
|**updateType** | [**UpdateTypeEnum**](#UpdateTypeEnum) | The type of update to be performed |  |
|**quantity** | **BigDecimal** | The quantity to be updated |  |
|**effectiveFrom** | **OffsetDateTime** | The effective from date for the update |  [optional] |
|**idempotencyKey** | **String** | The idempotency key for uniqueness of the license update request |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** |  |  [optional] |



## Enum: UpdateTypeEnum

| Name | Value |
|---- | -----|
| RELATIVE | &quot;RELATIVE&quot; |
| ABSOLUTE | &quot;ABSOLUTE&quot; |


## Implemented Interfaces

* Serializable


