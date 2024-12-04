

# CreateCustomerRequest

Payload to create customer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Customer identifier |  |
|**name** | **String** | Name of the Customer |  |
|**primaryEmail** | **String** | Primary email of the customer |  |
|**address** | [**Address**](Address.md) |  |  |
|**settings** | [**List&lt;CreateEntitySetting&gt;**](CreateEntitySetting.md) |  |  [optional] |
|**account** | [**CreateAccountRequestWithoutCustomerId**](CreateAccountRequestWithoutCustomerId.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


