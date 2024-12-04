

# LicenseEntriesConfig

Configuration for getting the license entries

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mode** | [**ModeEnum**](#ModeEnum) | Mode to get the license entries for the license rate cards - CUSTOM: Use the license entries provided in the request - LOOKUP_RANGE: Use the license entries of a given account for the specified range - LOOKUP_CYCLE: Use the license entries of a given account for the specified cycle  |  |
|**custom** | [**List&lt;LicenseEntry&gt;**](LicenseEntry.md) | List of license entries, this will be considered if mode is CUSTOM |  [optional] |
|**lookupRange** | [**LicenseEntriesConfigLookupRange**](LicenseEntriesConfigLookupRange.md) |  |  [optional] |
|**lookupCycle** | [**LicenseEntriesConfigLookupCycle**](LicenseEntriesConfigLookupCycle.md) |  |  [optional] |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| CUSTOM | &quot;CUSTOM&quot; |
| LOOKUP_RANGE | &quot;LOOKUP_RANGE&quot; |
| LOOKUP_CYCLE | &quot;LOOKUP_CYCLE&quot; |


## Implemented Interfaces

* Serializable


