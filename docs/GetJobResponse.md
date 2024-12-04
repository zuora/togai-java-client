

# GetJobResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**settledAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**totalJobEntries** | **Integer** |  |  |
|**pendingJobEntries** | **Integer** |  |  |
|**failedJobEntries** | **Integer** |  |  |
|**completedJobEntries** | **Integer** |  |  |
|**metadata** | **Map&lt;String, String&gt;** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PRICE_PLAN | &quot;PRICE_PLAN&quot; |
| EVENT_CORRECTIONS | &quot;EVENT_CORRECTIONS&quot; |
| BILL_RUN | &quot;BILL_RUN&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SCHEDULED | &quot;SCHEDULED&quot; |
| PENDING | &quot;PENDING&quot; |
| INITIALIZED | &quot;INITIALIZED&quot; |
| WAITING_FOR_CONFIRMATION | &quot;WAITING_FOR_CONFIRMATION&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |
| CANCELLED | &quot;CANCELLED&quot; |


## Implemented Interfaces

* Serializable


