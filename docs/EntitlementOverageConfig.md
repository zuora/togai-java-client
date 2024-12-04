

# EntitlementOverageConfig

Configuration for getting the entitlement overages

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mode** | [**ModeEnum**](#ModeEnum) | Mode to get the entitlement overages for the entitlement overage rate cards - CUSTOM: Use the entitlement overages provided in the request - LOOKUP_CYCLE: Use the entitlement overages of a given account for the specified cycle  |  |
|**custom** | [**List&lt;EntitlementOverageEntry&gt;**](EntitlementOverageEntry.md) | Quantity of entitlement overages, this will be considered if mode is CUSTOM |  [optional] |
|**lookupCycle** | [**EntitlementOverageConfigLookupCycle**](EntitlementOverageConfigLookupCycle.md) |  |  [optional] |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| CUSTOM | &quot;CUSTOM&quot; |
| LOOKUP_CYCLE | &quot;LOOKUP_CYCLE&quot; |


## Implemented Interfaces

* Serializable


