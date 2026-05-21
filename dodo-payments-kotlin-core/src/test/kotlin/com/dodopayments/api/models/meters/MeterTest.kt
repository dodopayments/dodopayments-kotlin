// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.meters

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeterTest {

    @Test
    fun create() {
        val meter =
            Meter.builder()
                .id("id")
                .aggregation(
                    MeterAggregation.builder().type(MeterAggregation.Type.COUNT).key("key").build()
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
                        .clausesOfMeterFilterConditionList(
                            listOf(
                                FilterType.MeterFilterCondition.builder()
                                    .key("user_id")
                                    .operator(FilterOperator.EQUALS)
                                    .value("user123")
                                    .build(),
                                FilterType.MeterFilterCondition.builder()
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

        assertThat(meter.id()).isEqualTo("id")
        assertThat(meter.aggregation())
            .isEqualTo(
                MeterAggregation.builder().type(MeterAggregation.Type.COUNT).key("key").build()
            )
        assertThat(meter.businessId()).isEqualTo("business_id")
        assertThat(meter.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(meter.eventName()).isEqualTo("event_name")
        assertThat(meter.measurementUnit()).isEqualTo("measurement_unit")
        assertThat(meter.name()).isEqualTo("name")
        assertThat(meter.updatedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(meter.description()).isEqualTo("description")
        assertThat(meter.filter())
            .isEqualTo(
                MeterFilter.builder()
                    .clausesOfMeterFilterConditionList(
                        listOf(
                            FilterType.MeterFilterCondition.builder()
                                .key("user_id")
                                .operator(FilterOperator.EQUALS)
                                .value("user123")
                                .build(),
                            FilterType.MeterFilterCondition.builder()
                                .key("amount")
                                .operator(FilterOperator.GREATER_THAN)
                                .value(100.0)
                                .build(),
                        )
                    )
                    .conjunction(Conjunction.AND)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val meter =
            Meter.builder()
                .id("id")
                .aggregation(
                    MeterAggregation.builder().type(MeterAggregation.Type.COUNT).key("key").build()
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
                        .clausesOfMeterFilterConditionList(
                            listOf(
                                FilterType.MeterFilterCondition.builder()
                                    .key("user_id")
                                    .operator(FilterOperator.EQUALS)
                                    .value("user123")
                                    .build(),
                                FilterType.MeterFilterCondition.builder()
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

        val roundtrippedMeter =
            jsonMapper.readValue(jsonMapper.writeValueAsString(meter), jacksonTypeRef<Meter>())

        assertThat(roundtrippedMeter).isEqualTo(meter)
    }
}
