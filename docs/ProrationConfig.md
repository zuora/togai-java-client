

# ProrationConfig

Configuration for getting the proration, if not provided no proration will be applied

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mode** | [**ModeEnum**](#ModeEnum) | Mode to get the proration - CUSTOM: Use the proration provided in the request - LOOKUP_CYCLE: Use the proration of a given account for the specified cycle  |  |
|**customConfig** | [**ProrationConfigCustomConfig**](ProrationConfigCustomConfig.md) |  |  [optional] |
|**lookupCycleConfig** | [**ProrationConfigLookupCycleConfig**](ProrationConfigLookupCycleConfig.md) |  |  [optional] |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| CUSTOM | &quot;CUSTOM&quot; |
| LOOKUP_CYCLE | &quot;LOOKUP_CYCLE&quot; |


## Implemented Interfaces

* Serializable


