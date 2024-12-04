

# Alert


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Alert ID |  |
|**version** | **Integer** | Alert Version |  |
|**description** | **String** | Alert Description |  [optional] |
|**status** | **AlertStatus** |  |  |
|**validity** | **Integer** | Validity of the alert in minutes, if null then alert will be valid forever |  [optional] |
|**alertTemplateId** | **String** | Alert Template Id |  |
|**interval** | **Integer** | Interval |  |
|**entityDetails** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**ownerDetails** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**parameters** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**createdAt** | **OffsetDateTime** | Created At |  |
|**updatedAt** | **OffsetDateTime** | Updated At |  [optional] |


## Implemented Interfaces

* Serializable


