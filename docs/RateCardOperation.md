

# RateCardOperation

Rate card operation

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actionType** | [**ActionTypeEnum**](#ActionTypeEnum) | Operation type |  |
|**rateCardName** | **String** | Required for UPDATE and DELETE operations |  |
|**rateCard** | [**RateCardData**](RateCardData.md) |  |  [optional] |



## Enum: ActionTypeEnum

| Name | Value |
|---- | -----|
| CREATE | &quot;CREATE&quot; |
| UPDATE | &quot;UPDATE&quot; |
| DELETE | &quot;DELETE&quot; |


## Implemented Interfaces

* Serializable


