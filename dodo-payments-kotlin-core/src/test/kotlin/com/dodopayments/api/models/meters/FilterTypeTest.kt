// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.meters

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class FilterTypeTest {

    @Test
    fun ofMeterFilterConditionList() {
        val meterFilterConditionList =
            listOf(
                FilterType.MeterFilterCondition.builder()
                    .key("x")
                    .operator(FilterOperator.EQUALS)
                    .value("string")
                    .build()
            )

        val filterType = FilterType.ofMeterFilterConditionList(meterFilterConditionList)

        assertThat(filterType.meterFilterConditionList()).isEqualTo(meterFilterConditionList)
        assertThat(filterType.nestedMeterFilterList()).isNull()
    }

    @Test
    fun ofMeterFilterConditionListRoundtrip() {
        val jsonMapper = jsonMapper()
        val filterType =
            FilterType.ofMeterFilterConditionList(
                listOf(
                    FilterType.MeterFilterCondition.builder()
                        .key("x")
                        .operator(FilterOperator.EQUALS)
                        .value("string")
                        .build()
                )
            )

        val roundtrippedFilterType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(filterType),
                jacksonTypeRef<FilterType>(),
            )

        assertThat(roundtrippedFilterType).isEqualTo(filterType)
    }

    @Test
    fun ofNestedMeterFilterList() {
        val nestedMeterFilterList =
            listOf(
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

        val filterType = FilterType.ofNestedMeterFilterList(nestedMeterFilterList)

        assertThat(filterType.meterFilterConditionList()).isNull()
        assertThat(filterType.nestedMeterFilterList()).isEqualTo(nestedMeterFilterList)
    }

    @Test
    fun ofNestedMeterFilterListRoundtrip() {
        val jsonMapper = jsonMapper()
        val filterType =
            FilterType.ofNestedMeterFilterList(
                listOf(
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
            )

        val roundtrippedFilterType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(filterType),
                jacksonTypeRef<FilterType>(),
            )

        assertThat(roundtrippedFilterType).isEqualTo(filterType)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        OBJECT(JsonValue.from(mapOf("invalid" to "object"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val filterType = jsonMapper().convertValue(testCase.value, jacksonTypeRef<FilterType>())

        val e = assertThrows<DodoPaymentsInvalidDataException> { filterType.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
