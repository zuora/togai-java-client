

# GetCustomerPortalDelegateTokenRequest

Request to get delegate token for customer portal

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerId** | **String** | Identifier of the customer |  |
|**accountIds** | **List&lt;String&gt;** | Identifier of the accounts under the customer for which access is requested. Maximum of 5 account ids can be provided  |  [optional] |
|**allAccountsAccess** | **Boolean** | Flag to specify if access for every account under the customer is required |  [optional] |
|**expiry** | **Long** | Expiry in seconds from the time of generation.  If not provided, generated token will have the expiry of the token used for requesting.  |  [optional] |


## Implemented Interfaces

* Serializable


