

# AccountSchedule


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**accountId** | **String** |  |  |
|**pricePlanId** | **String** |  |  |
|**version** | **Integer** |  |  |
|**deferredRevenue** | **Boolean** |  |  |
|**pricePlanInfo** | [**PricePlanInfo**](PricePlanInfo.md) |  |  |
|**accountScheduleInfo** | [**ScheduleInfo**](ScheduleInfo.md) |  |  |
|**isOverridden** | **Boolean** | Indicates whether the schedule is overridden. Note: A null value for this field does not imply that the schedule is not overridden.  |  [optional] |
|**startDate** | **OffsetDateTime** |  |  |
|**endDate** | **OffsetDateTime** |  |  |
|**allowOngoingCycleUpdates** | **Boolean** |  |  |


## Implemented Interfaces

* Serializable


