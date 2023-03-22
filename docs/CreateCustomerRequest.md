

# CreateCustomerRequest

Payload to create customer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Customer identifier |  |
|**name** | **String** | Name of the Customer |  |
|**primaryEmail** | **String** | Primary email of the customer |  |
|**billingAddress** | **String** | billing address of the customer |  |
|**settings** | [**List&lt;CreateEntitySetting&gt;**](CreateEntitySetting.md) |  |  [optional] |
|**account** | [**CreateAccountRequest**](CreateAccountRequest.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


