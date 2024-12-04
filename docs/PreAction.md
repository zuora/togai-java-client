

# PreAction

Pre action to be performed before association or disassociation

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Type of pre action to be performed |  |
|**config** | **Map&lt;String, String&gt;** | Configuration required for performing pre action - &#x60;GRANT_LICENSE&#x60;: grant one time licenses to an account before association   - &#x60;licenseId&#x60; [Required]: Id of the license to be granted   - &#x60;updateType&#x60; [Required]: Type of update to be performed on the license (RELATIVE or ABSOLUTE)   - &#x60;quantity&#x60; [Required]: Quantity of license to be granted   - &#x60;effectiveFrom&#x60; [Optional]: Effective date from which the license will be granted  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| GRANT_LICENSE | &quot;GRANT_LICENSE&quot; |


## Implemented Interfaces

* Serializable


