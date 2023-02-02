import com.togai.client.ApiClient;
import com.togai.client.Configuration;
import com.togai.client.ApiException;
import com.togai.client.models.*;
import com.togai.client.api.*;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.*;
import java.math.BigDecimal;


public class Example {
    public static void main(String[] args){
        try{
            final String API_TOKEN = "<YOUR_API_TOKEN>";
            final String BASE_PATH = "https://sandbox-api.togai.com";
            Random random = new Random();
            int seed = random.nextInt();

            ApiClient apiClient = Configuration.getDefaultApiClient();
            apiClient.setBasePath(BASE_PATH);
            apiClient.setBearerToken(API_TOKEN);


        // Following example simulates the pricing of an API based SMS service which charges their customers based on region and size of the message.
        // Follow the steps below to create the required entities in Togai, and then ingest an event.

        // Step 1: Create an Event Schema to define the event structure, attributes (can be usage value) and dimensions (can be used filters in usage meters i.e country in this case)

            final EventSchemasApi eventSchemasApi = new EventSchemasApi(apiClient);
            final CreateEventSchemaRequest createEventSchemaRequest = new CreateEventSchemaRequest()
                .name("sms-events"+seed)
                .description("SMS Event")
                .attributes(Arrays.asList(
                    new EventAttributeSchema().name("sms_id").defaultUnit("kms")
                ))
                .dimensions(Arrays.asList(
                    new DimensionsSchema()
                        .name("country")
                ));
            final EventSchema eventSchema = eventSchemasApi.createEventSchema(createEventSchemaRequest);
            System.out.println(eventSchema);

            // Step 2: Activate the event schema
            eventSchemasApi.activateEventSchema(eventSchema.getName());

            // Step 3: Create a Usage Meter to meter the usage with aggregation methods
            final UsageMetersApi usageMetersApi = new UsageMetersApi(apiClient);
            final CreateUsageMeterRequest createUsageMeterRequest = new CreateUsageMeterRequest()
                .name("message_count"+seed)
                .type(CreateUsageMeterRequest.TypeEnum.COUNTER)
                .aggregation(CreateUsageMeterRequest.AggregationEnum.COUNT)
                .computations(Arrays.asList(
                    new Computation()
                        .matcher("{'==': [{'var': 'dimensions.country'}, 'US']}")
                        .computation("1")
                ));
            System.out.println(eventSchema.getName());
            final UsageMeter usageMeter = usageMetersApi.createUsageMeter(eventSchema.getName(), createUsageMeterRequest);
            System.out.println(usageMeter);

            // Step 4: Activate a usage meter
            usageMetersApi.activateUsageMeter(eventSchema.getName(), usageMeter.getId());

            // Step 5: Create a Price plan to convert the usage into a billable price
            final PricePlansApi pricePlansApi = new PricePlansApi(apiClient);
            List<SlabRate> exampleSlabRate = new ArrayList<>();
            exampleSlabRate.add(new SlabRate()
                    .order(1)
                    .rate(BigDecimal.valueOf(10))
                    .slabRateConfig(new HashMap<>()));
            List<RateValue> exampleRateValue = new ArrayList<>();
            exampleRateValue.add(new RateValue()
                    .currency("USD")
                    .slabRates(exampleSlabRate));
            List<Slab> exampleSlab = new ArrayList<>();
            exampleSlab.add(new Slab().priceType(PriceType.PER_UNIT).startAfter(BigDecimal.valueOf(0)).order(1));
            List<UsageRateCard> exampleUsageRateCard = new ArrayList<>();
            exampleUsageRateCard.add(new UsageRateCard().usageMeterId(usageMeter.getId())
                    .displayName("AfterShip Shipments1"+seed)
                    .ratePlan(new RatePlan()
                            .pricingModel(PricingModel.TIERED)
                            .slabs(exampleSlab))
                    .rateValues(exampleRateValue));
            final CreatePricePlanRequest createPricePlanRequest = new CreatePricePlanRequest()
                .name("price-plan"+seed).pricePlanDetails(new CreatePricePlanDetails()
                .pricingCycleConfig(new PricingCycleConfig()
                    .interval(PricingCycleConfig.IntervalEnum.MONTHLY)
                    .startOffset(new PricingCycleConfigStartOffset()
                        .dayOffset("1")
                        .monthOffset("NIL")
                    )
                    .gracePeriod(1)
                ).usageRateCards(exampleUsageRateCard));
            final PricePlan pricePlan = pricePlansApi.createPricePlan(createPricePlanRequest);
            System.out.println(pricePlan);

            // Step 6: Activate the Price Plan
            pricePlansApi.activatePricePlan(pricePlan.getId(),new ActivatePricePlanRequest().addCurrenciesItem("USD"));

            // Step 7: Create customers to associate price plans
            final CustomersApi customersApi = new CustomersApi(apiClient);
            final CreateCustomerRequest createCustomerRequest = new CreateCustomerRequest()
                .name("customer1"+seed)
                .id("1"+seed)
                .primaryEmail("email@togai.com")
                .billingAddress("221B Baker Street, Marylebone, London NW1 6XE, United Kingdom");
            final CreateCustomerResponse customer = customersApi.createCustomer(createCustomerRequest);
            System.out.println(customer);

            // Step 8: Associate the customer/account to the price plan
            final AccountsApi accountsApi = new AccountsApi(apiClient);
            final AssociatePricePlanRequest associatePricePlanRequest = new AssociatePricePlanRequest()
                .pricePlanId(pricePlan.getId())
                    .effectiveFrom(LocalDate.now()).effectiveUntil(LocalDate.parse("9999-01-01"));
            final AssociatePricePlanResponse account = accountsApi.associatePricePlan(customer.getId(), customer.getAccount().getId(), associatePricePlanRequest);
            System.out.println(account);

            // Step 9: Ingest events
            final EventIngestionApi eventIngestionApi = new EventIngestionApi(apiClient);
            final IngestEventRequest ingestEventRequest = new IngestEventRequest()
                .event(new Event()
                    .id("random-string" + Math.random())
                    .schemaName(eventSchema.getName())
                    .timestamp(OffsetDateTime.now())
                    .accountId(customer.getId())
                    .attributes(Arrays.asList(
                        new Attribute()
                            .name("sms_id"+seed)
                            .value("random-string" + Math.random())
                    ))
                    .dimensions(Collections.singletonMap("country", "US"))
                );
            eventIngestionApi.ingest(ingestEventRequest);

            // Step 10: Get the usage metrics
            OffsetDateTime now = OffsetDateTime.now();
            OffsetDateTime yesterday = now.minusDays(1);
            final MetricsApi metricsApi = new MetricsApi(apiClient);
            final GetMetricsRequest usageMetricsRequest = new GetMetricsRequest()
                .startTime(yesterday)
                .endTime(now)
                .metricQueries(Collections.singleton(
                    new MetricQuery()
                        .id("usage-metrics")
                        .name(MetricName.USAGE)
                        .aggregationPeriod(MetricQuery.AggregationPeriodEnum.DAY)
                ));
            final GetMetricsResponse usageMetrics = metricsApi.getMetrics(usageMetricsRequest);
            System.out.println(usageMetrics);

            // Step 11: Get the revenue metrics
            // Revenue metrics might take a bit of time to be reflected in the system
            // You can check the docs on the amount of time it takes for events to get processed for revenue.
            final GetMetricsRequest revenueMetricsRequest = new GetMetricsRequest()
                .startTime(yesterday)
                .endTime(now)
                .metricQueries(Collections.singleton(
                    new MetricQuery()
                        .id("revenue-metrics")
                        .name(MetricName.REVENUE)
                        .aggregationPeriod(MetricQuery.AggregationPeriodEnum.DAY)
                ));
            final GetMetricsResponse revenueMetrics = metricsApi.getMetrics(revenueMetricsRequest);
            System.out.println(revenueMetrics);

            // Revenue metrics for a specific customer
            final GetMetricsRequest customerRevenueMetricsRequest = new GetMetricsRequest()
                .startTime(yesterday)
                .endTime(now)
                .metricQueries(Collections.singleton(
                    new MetricQuery()
                        .id("customer-revenue-metrics")
                        .name(MetricName.REVENUE)
                        .aggregationPeriod(MetricQuery.AggregationPeriodEnum.DAY)
                        .filters(Collections.singletonList(
                            new MetricQueryFilterEntry()
                                .fieldName("CUSTOMER_ID")
                                .fieldValues(Collections.singletonList(customer.getId()))
                        ))
                ));
            final GetMetricsResponse customerRevenueMetrics = metricsApi.getMetrics(customerRevenueMetricsRequest);
            System.out.println(customerRevenueMetrics);
        } catch (ApiException e) {
            System.err.println("Exception when calling apis");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
