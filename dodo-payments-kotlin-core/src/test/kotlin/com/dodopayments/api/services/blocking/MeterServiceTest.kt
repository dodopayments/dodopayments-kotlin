// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.models.meters.Conjunction
import com.dodopayments.api.models.meters.FilterOperator
import com.dodopayments.api.models.meters.MeterAggregation
import com.dodopayments.api.models.meters.MeterCreateParams
import com.dodopayments.api.models.meters.MeterFilter
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MeterServiceTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val meterService = client.meters()

        val meter =
            meterService.create(
                MeterCreateParams.builder()
                    .aggregation(
                        MeterAggregation.builder()
                            .type(MeterAggregation.Type.COUNT)
                            .key("key")
                            .build()
                    )
                    .eventName("event_name")
                    .measurementUnit("measurement_unit")
                    .name("name")
                    .description("description")
                    .filter(
                        MeterFilter.builder()
                            .clausesOfDirectFilterConditions(
                                listOf(
                                    MeterFilter.Clauses.MeterFilterCondition.builder()
                                        .key("user_id")
                                        .operator(FilterOperator.EQUALS)
                                        .value("user123")
                                        .build(),
                                    MeterFilter.Clauses.MeterFilterCondition.builder()
                                        .key("amount")
                                        .operator(FilterOperator.GREATER_THAN)
                                        .value(100.0)
                                        .build(),
                                )
                            )
                            .conjunction(Conjunction.AND)
                            .build()
                    )
                    .build()
            )

        meter.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val meterService = client.meters()

        val meter = meterService.retrieve("id")

        meter.validate()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val meterService = client.meters()

        val page = meterService.list()

        page.response().validate()
    }

    @Test
    fun archive() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val meterService = client.meters()

        meterService.archive("id")
    }

    @Test
    fun unarchive() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val meterService = client.meters()

        meterService.unarchive("id")
    }
}
