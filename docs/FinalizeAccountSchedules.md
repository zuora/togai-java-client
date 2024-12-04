

# FinalizeAccountSchedules

Request to finalize account schedules

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mergeSchedules** | **Boolean** | If this flag is true, the schedules will be merged with the existing schedules of the account if possible. If this flag is false, the existing schedules will be replaced with the new schedules. Default value is false  |  [optional] |
|**preActions** | [**List&lt;PreAction&gt;**](PreAction.md) | Pre actions to be performed before association or disassociation |  [optional] |


## Implemented Interfaces

* Serializable


