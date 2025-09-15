// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.meters

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeterFilterTest {

    @Test
    fun create() {
        val meterFilter =
            MeterFilter.builder()
                .clausesOfDirectFilterConditions(
                    listOf(
                        MeterFilter.Clauses.MeterFilterCondition.builder()
                            .key("user_id")
                            .operator(MeterFilter.Clauses.MeterFilterCondition.Operator.EQUALS)
                            .value("user123")
                            .build(),
                        MeterFilter.Clauses.MeterFilterCondition.builder()
                            .key("amount")
                            .operator(
                                MeterFilter.Clauses.MeterFilterCondition.Operator.GREATER_THAN
                            )
                            .value(100.0)
                            .build(),
                    )
                )
                .conjunction(MeterFilter.Conjunction.AND)
                .build()

        assertThat(meterFilter.clauses())
            .isEqualTo(
                MeterFilter.Clauses.ofDirectFilterConditions(
                    listOf(
                        MeterFilter.Clauses.MeterFilterCondition.builder()
                            .key("user_id")
                            .operator(MeterFilter.Clauses.MeterFilterCondition.Operator.EQUALS)
                            .value("user123")
                            .build(),
                        MeterFilter.Clauses.MeterFilterCondition.builder()
                            .key("amount")
                            .operator(
                                MeterFilter.Clauses.MeterFilterCondition.Operator.GREATER_THAN
                            )
                            .value(100.0)
                            .build(),
                    )
                )
            )
        assertThat(meterFilter.conjunction()).isEqualTo(MeterFilter.Conjunction.AND)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val meterFilter =
            MeterFilter.builder()
                .clausesOfDirectFilterConditions(
                    listOf(
                        MeterFilter.Clauses.MeterFilterCondition.builder()
                            .key("user_id")
                            .operator(MeterFilter.Clauses.MeterFilterCondition.Operator.EQUALS)
                            .value("user123")
                            .build(),
                        MeterFilter.Clauses.MeterFilterCondition.builder()
                            .key("amount")
                            .operator(
                                MeterFilter.Clauses.MeterFilterCondition.Operator.GREATER_THAN
                            )
                            .value(100.0)
                            .build(),
                    )
                )
                .conjunction(MeterFilter.Conjunction.AND)
                .build()

        val roundtrippedMeterFilter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(meterFilter),
                jacksonTypeRef<MeterFilter>(),
            )

        assertThat(roundtrippedMeterFilter).isEqualTo(meterFilter)
    }
}
