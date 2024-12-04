

# NamedLicenseEntriesConfig

Configuration for getting the named license entries

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mode** | [**ModeEnum**](#ModeEnum) | Mode to get the named license entries for the license rate cards - CUSTOM: Use the named license entries provided in the request - LOOKUP_RANGE: Use the named license entries of a given account for the specified range - LOOKUP_CYCLE: Use the named license entries of a given account for the specified cycle  |  |
|**custom** | [**List&lt;NamedLicenseEntry&gt;**](NamedLicenseEntry.md) | List of named license entries, this will be considered if mode is CUSTOM |  [optional] |
|**lookupRange** | [**NamedLicenseEntriesConfigLookupRange**](NamedLicenseEntriesConfigLookupRange.md) |  |  [optional] |
|**lookupCycle** | [**NamedLicenseEntriesConfigLookupCycle**](NamedLicenseEntriesConfigLookupCycle.md) |  |  [optional] |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| CUSTOM | &quot;CUSTOM&quot; |
| LOOKUP_RANGE | &quot;LOOKUP_RANGE&quot; |
| LOOKUP_CYCLE | &quot;LOOKUP_CYCLE&quot; |


## Implemented Interfaces

* Serializable


