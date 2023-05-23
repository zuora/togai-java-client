

# UpdatePricePlanRequest

Request to update a price plan

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description of price plan |  [optional] |
|**pricePlanDetails** | [**CreatePricePlanDetailsOverride**](CreatePricePlanDetailsOverride.md) |  |  [optional] |
|**migrationMode** | [**MigrationModeEnum**](#MigrationModeEnum) |  |  [optional] |
|**versionsToMigrate** | [**VersionsToMigrateEnum**](#VersionsToMigrateEnum) |  |  [optional] |



## Enum: MigrationModeEnum

| Name | Value |
|---- | -----|
| IMMEDIATE | &quot;IMMEDIATE&quot; |
| IMMEDIATE_IGNORE_OVERRIDE | &quot;IMMEDIATE_IGNORE_OVERRIDE&quot; |
| NEXT_CYCLE | &quot;NEXT_CYCLE&quot; |
| NEXT_CYCLE_IGNORE_OVERRIDE | &quot;NEXT_CYCLE_IGNORE_OVERRIDE&quot; |
| NONE | &quot;NONE&quot; |



## Enum: VersionsToMigrateEnum

| Name | Value |
|---- | -----|
| LATEST_VERSION | &quot;LATEST_VERSION&quot; |
| ALL_VERSION | &quot;ALL_VERSION&quot; |


## Implemented Interfaces

* Serializable


