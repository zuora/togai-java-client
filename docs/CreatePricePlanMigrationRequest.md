

# CreatePricePlanMigrationRequest

Request to create price plan migration request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sourceId** | **String** | Id of source price plan |  |
|**sourceVersion** | **Integer** | Version of the source price plan |  |
|**targetId** | **String** | Id of target price plan |  [optional] |
|**targetVersion** | **Integer** | Version of the target price plan |  [optional] |
|**migrationMode** | [**MigrationModeEnum**](#MigrationModeEnum) |  |  |
|**retainStartOffsets** | **Boolean** | If this flag is true, current pricing cycle of the account on the date of association will continue rather  than the configurations of the newly associated price plan. Pricing cycle overrides specified  using  &#x60;pricePlanDetailsOverride&#x60; will take precedence over the pricing cycle configurations of  the new price plan that the account needs to migrate to. PricingCycleInterval of the existing plan and  the new plan must be same for this to work. We&#39;ll return a &#x60;400 BadRequest&#x60; otherwise. Examples:   - Ongoing plan (1st Oct to 30th Oct) - {dayOffset: 1, monthOffset: NIL}     New association (15th Oct to 15th Nov) of different price plan with retainStartOffsets option true      will use the same pricing cycle configuration {dayOffset: 1, monthOffset: NIL} rather than using the     pricing cycle configuration of the new price plan that the account needs to migrate to.   - Ongoing plan (1st Oct to 30th Oct) - {dayOffset: 1, monthOffset: NIL}     New association (1st Nov to 30th Nov) of different price plan with retainStartOffsets option true will     throw a &#x60;400 BadRequest&#x60; as no existing price plan configuration found on date of association  |  [optional] |
|**isPricePlanV2Migration** | **Boolean** | If this flag is true, the migration will be done for price plan v2. Default value is false  |  [optional] |
|**requireConfirmation** | **Boolean** | This field specifies whether to process job or to wait till the job is confirmed. Default value: false  |  [optional] |



## Enum: MigrationModeEnum

| Name | Value |
|---- | -----|
| IMMEDIATE | &quot;IMMEDIATE&quot; |
| IMMEDIATE_IGNORE_OVERRIDE | &quot;IMMEDIATE_IGNORE_OVERRIDE&quot; |
| NEXT_CYCLE | &quot;NEXT_CYCLE&quot; |
| NEXT_CYCLE_IGNORE_OVERRIDE | &quot;NEXT_CYCLE_IGNORE_OVERRIDE&quot; |
| START_OF_CURRENT_CYCLE | &quot;START_OF_CURRENT_CYCLE&quot; |


## Implemented Interfaces

* Serializable


