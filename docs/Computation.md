

# Computation


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Optional identifier describing the matcher and computation pair |  [optional] |
|**matcher** | **String** | Condition to be applied on event. Upon matching it the corresponding computation will be considered for usage_meter unit calculation. The result of the matcher needs to be [truthy](https://jsonlogic.com/truthy.html) in order to be considered as a match.  |  [optional] |
|**computation** | **String** | Computation to be applied on an event if it matches the matcher. In case of a COUNT aggregation type, computation should be passed as &#39;1&#39;  |  |
|**order** | **Integer** | The order in which multiple matched computations will get evaluated |  |


## Implemented Interfaces

* Serializable


