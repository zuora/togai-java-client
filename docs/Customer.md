

# Customer

Structure of customer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Identifier of customer |  |
|**togaiCustomerId** | **String** | Unique identifier of customer |  |
|**name** | **String** | Name of the Customer |  |
|**primaryEmail** | **String** | Primary email of the customer |  |
|**billingAddress** | **String** | billing address of the customer |  |
|**address** | [**Address**](Address.md) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the customer |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| ARCHIVED | &quot;ARCHIVED&quot; |


## Implemented Interfaces

* Serializable


