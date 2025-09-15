// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.meters.MeterAggregation
import com.dodopayments.api.models.meters.MeterCreateParams
import com.dodopayments.api.models.meters.MeterFilter
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MeterServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val meterServiceAsync = client.meters()

        val meter =
            meterServiceAsync.create(
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
                                        .operator(
                                            MeterFilter.Clauses.MeterFilterCondition.Operator.EQUALS
                                        )
                                        .value("user123")
                                        .build(),
                                    MeterFilter.Clauses.MeterFilterCondition.builder()
                                        .key("amount")
                                        .operator(
                                            MeterFilter.Clauses.MeterFilterCondition.Operator
                                                .GREATER_THAN
                                        )
                                        .value(100.0)
                                        .build(),
                                )
                            )
                            .conjunction(MeterFilter.Conjunction.AND)
                            .build()
                    )
                    .build()
            )

        meter.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val meterServiceAsync = client.meters()

        val meter = meterServiceAsync.retrieve("id")

        meter.validate()
    }

    @Test
    suspend fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val meterServiceAsync = client.meters()

        val page = meterServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun archive() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val meterServiceAsync = client.meters()

        meterServiceAsync.archive("id")
    }

    @Test
    suspend fun unarchive() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val meterServiceAsync = client.meters()

        meterServiceAsync.unarchive("id")
    }
}
