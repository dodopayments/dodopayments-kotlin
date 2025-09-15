// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.meters

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeterListPageResponseTest {

    @Test
    fun create() {
        val meterListPageResponse =
            MeterListPageResponse.builder()
                .addItem(
                    Meter.builder()
                        .id("id")
                        .aggregation(
                            MeterAggregation.builder()
                                .type(MeterAggregation.Type.COUNT)
                                .key("key")
                                .build()
                        )
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .eventName("event_name")
                        .measurementUnit("measurement_unit")
                        .name("name")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .filter(
                            MeterFilter.builder()
                                .clausesOfDirectFilterConditions(
                                    listOf(
                                        MeterFilter.Clauses.MeterFilterCondition.builder()
                                            .key("user_id")
                                            .operator(
                                                MeterFilter.Clauses.MeterFilterCondition.Operator
                                                    .EQUALS
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
                .build()

        assertThat(meterListPageResponse.items())
            .containsExactly(
                Meter.builder()
                    .id("id")
                    .aggregation(
                        MeterAggregation.builder()
                            .type(MeterAggregation.Type.COUNT)
                            .key("key")
                            .build()
                    )
                    .businessId("business_id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .eventName("event_name")
                    .measurementUnit("measurement_unit")
                    .name("name")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val meterListPageResponse =
            MeterListPageResponse.builder()
                .addItem(
                    Meter.builder()
                        .id("id")
                        .aggregation(
                            MeterAggregation.builder()
                                .type(MeterAggregation.Type.COUNT)
                                .key("key")
                                .build()
                        )
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .eventName("event_name")
                        .measurementUnit("measurement_unit")
                        .name("name")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .filter(
                            MeterFilter.builder()
                                .clausesOfDirectFilterConditions(
                                    listOf(
                                        MeterFilter.Clauses.MeterFilterCondition.builder()
                                            .key("user_id")
                                            .operator(
                                                MeterFilter.Clauses.MeterFilterCondition.Operator
                                                    .EQUALS
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
                .build()

        val roundtrippedMeterListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(meterListPageResponse),
                jacksonTypeRef<MeterListPageResponse>(),
            )

        assertThat(roundtrippedMeterListPageResponse).isEqualTo(meterListPageResponse)
    }
}
