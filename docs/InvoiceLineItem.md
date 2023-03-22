

# InvoiceLineItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  |
|**type** | **String** | Type of the line item - TOTAL_USAGE: List of all the usage meter usages - USAGE_METER_USAGE: A single usage meter usage - NET_REVENUE: Net revenue of the invoice ( Gross revenue - Discounts ) - GROSS_REVENUE: Gross revenue of the invoice  - USAGE_RATE_CARD_REVENUE: Revenue generated from usage rate card - USAGE_RATE_CARD_SLAB_REVENUE: Revenue generated from usage rate card slab  |  |
|**valuePerQuantity** | **BigDecimal** |  |  [optional] |
|**quantity** | **BigDecimal** |  |  [optional] |
|**units** | **String** |  |  [optional] |
|**value** | **BigDecimal** |  |  [optional] |
|**metadata** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**lineItems** | [**List&lt;InvoiceLineItem&gt;**](InvoiceLineItem.md) |  |  |


## Implemented Interfaces

* Serializable


