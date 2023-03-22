

# MetricQueryFilterEntry

 | Metric Name | FilterEntry Name |    Allowed groupBy fields                 |      Default Values      |                 Allowed Values                  | |-------------|------------------|-------------------------------------------|--------------------------|-------------------------------------------------| | EVENTS      | ACCOUNT_ID       | ACCOUNT_ID, EVENT_STATUS, SCHEMA_NAME,    | None                     | *\\<one or more valid account IDs>               |                                    CUSTOMER_ID                                                                                                            | | EVENTS      | CUSTOMER_ID      | ACCOUNT_ID, EVENT_STATUS, SCHEMA_NAME,    | None                     | *\\<one or more valid customer IDs>              |                                    CUSTOMER_ID                                                                                                            | | EVENTS      | SCHEMA_NAME      | ACCOUNT_ID, EVENT_STATUS, SCHEMA_NAME,    | None                     | *\\<at most one valid schema names>              |                                    CUSTOMER_ID                                                                                                            | | EVENTS      | EVENT_STATUS     | ACCOUNT_ID, EVENT_STATUS, SCHEMA_NAME,    | [PROCESSED, UNPROCESSED] | oneOrMoreOf PROCESSED, UNPROCESSED, IN_PROGRESS |                                    CUSTOMER_ID                                                                                                            | | USAGE       | ACCOUNT_ID       | ACCOUNT_ID, USAGE_METER_ID, CUSTOMER_ID   | None                     | *\\<one or more valid account IDs>               | | USAGE       | CUSTOMER_ID      | ACCOUNT_ID, USAGE_METER_ID, CUSTOMER_ID   | None                     | *\\<one or more valid customer IDs>              | | USAGE       | USAGE_METER_ID   | ACCOUNT_ID, USAGE_METER_ID, CUSTOMER_ID   | None                     | *\\<one or more valid usage meter name>          | | REVENUE     | ACCOUNT_ID       | ACCOUNT_ID, USAGE_METER_ID, CUSTOMER_ID   | None                     | *\\<one or more valid account IDs>               | | REVENUE     | CUSTOMER_ID      | ACCOUNT_ID, USAGE_METER_ID, CUSTOMER_ID   | None                     | *\\<one or more valid customer IDs>              | | REVENUE     | USAGE_METER_ID   | ACCOUNT_ID, USAGE_METER_ID, CUSTOMER_ID   | None                     | *\\<one or more valid usage meter name>          | | EVENTS      | ORGANIZATION_ID  | ACCOUNT_ID, USAGE_METER_ID, CUSTOMER_ID   | <From auth token>        |                                                 | | USAGE       | ORGANIZATION_ID  | ACCOUNT_ID, USAGE_METER_ID, CUSTOMER_ID   | <From auth token>        |                                                 | | REVENUE     | ORGANIZATION_ID  | ACCOUNT_ID, USAGE_METER_ID, CUSTOMER_ID   | <From auth token>        |                                                 | 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fieldName** | **String** |  |  |
|**fieldValues** | **List&lt;String&gt;** |  |  |


## Implemented Interfaces

* Serializable


