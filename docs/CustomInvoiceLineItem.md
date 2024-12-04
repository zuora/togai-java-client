

# CustomInvoiceLineItem

Custom line item. Either `value` or `quantity` + `valuePerQuantity` is required. In case `quantity` and `valuePerQuantity` are provided, `value` is computed as (`quantity` X `valuePerQuantity`) 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**valuePerQuantity** | **BigDecimal** |  |  [optional] |
|**quantity** | **BigDecimal** |  |  [optional] |
|**value** | **BigDecimal** |  |  [optional] |
|**billableId** | **String** |  |  [optional] |


## Implemented Interfaces

* Serializable


