

# UpdateAccountScheduleV2Request

Request to dis/associate one or more schedules to an account

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mode** | [**ModeEnum**](#ModeEnum) | Mode of request to create dis/association |  [optional] |
|**effectiveFrom** | **LocalDate** | Date of effectiveness of the association. The date is expected in YYYY-MM-DD format - Editing of a BILLING plan with deferredRevenue can be achieved with    effectiveFrom as start date of current cycle or using &#x60;retainStartOffset&#x60; option.  |  |
|**effectiveUntil** | **LocalDate** | Date until which the association must be effective. The date is expected in YYYY-MM-DD format  |  |
|**associationConfig** | [**AssociationConfig**](AssociationConfig.md) |  |  [optional] |
|**mergeSchedules** | **Boolean** | If this flag is true, the schedules will be merged with the existing schedules of the account if possible. If this flag is false, the existing schedules will be replaced with the new schedules. Default value is false  |  [optional] |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| ASSOCIATE | &quot;ASSOCIATE&quot; |
| DISASSOCIATE | &quot;DISASSOCIATE&quot; |


## Implemented Interfaces

* Serializable


