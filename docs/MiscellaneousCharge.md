

# MiscellaneousCharge

Miscellaneous charges are the charges that can be added to the invoice. A charge must either have rate and quantity or value. In case of rate and quantity, the value must not be provided as it is automatically calculated as (rate * quantity).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the miscellaneous charge |  |
|**rate** | **BigDecimal** | Rate of the charge |  [optional] |
|**quantity** | **BigDecimal** | Quantity of the charge |  [optional] |
|**value** | **String** | Value of the charge Possible values: 1. Fixed number [Example: 10] 2. Json Logic [Example: {\&quot;*\&quot;: [{\&quot;var\&quot;: \&quot;um.lineitem.id\&quot;}, 0.1]}]    You can use all line item ids as variables in the json logic  |  [optional] |
|**considerForRevenue** | **Boolean** | Specifies whether to consider this miscellaneous charge for revenue or not |  [optional] |


## Implemented Interfaces

* Serializable


