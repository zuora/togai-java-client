

# CreateAccountAliasRequest

An alternative account identifier for event ingestion with a defined effective duration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**value** | **String** |  |  |
|**effectiveFrom** | **OffsetDateTime** | Effective from date, if not provided, it will be set to -infinity |  [optional] |
|**effectiveUntil** | **OffsetDateTime** | Effective until date, if not provided, it will be set to +infinity |  [optional] |


## Implemented Interfaces

* Serializable


