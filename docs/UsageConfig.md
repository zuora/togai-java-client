

# UsageConfig

Configuration for getting the usage

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mode** | [**ModeEnum**](#ModeEnum) | Mode to get the usage for the usage meters - CUSTOM: Use the usages provided in the request - LOOKUP_RANGE: Use the usage of a given account for the specified range - LOOKUP_CYCLE: Use the usage of a given account for the specified cycle  |  |
|**usageMap** | **Map&lt;String, BigDecimal&gt;** | Map of usage meter id and usage, this will be considered if mode is CUSTOM |  [optional] |
|**lookupRange** | [**UsageConfigLookupRange**](UsageConfigLookupRange.md) |  |  [optional] |
|**lookupCycle** | [**UsageConfigLookupCycle**](UsageConfigLookupCycle.md) |  |  [optional] |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| CUSTOM | &quot;CUSTOM&quot; |
| LOOKUP_RANGE | &quot;LOOKUP_RANGE&quot; |
| LOOKUP_CYCLE | &quot;LOOKUP_CYCLE&quot; |


## Implemented Interfaces

* Serializable


