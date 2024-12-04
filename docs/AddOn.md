

# AddOn


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of addon |  |
|**type** | **AddOnType** |  |  |
|**billableName** | **String** | Billable name of addon. Billable name takes precedence over name to display in invoice. |  [optional] |
|**id** | **String** | Id of addon |  |
|**createdAt** | **OffsetDateTime** | Created Time of addon |  |
|**status** | [**StatusEnum**](#StatusEnum) | status of addon |  |
|**displayName** | **String** | Display name of addon. This is an auto-generated field which contains billableName of addon. If billableName is not provided, name will be used as display name.  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| ARCHIVED | &quot;ARCHIVED&quot; |


## Implemented Interfaces

* Serializable


