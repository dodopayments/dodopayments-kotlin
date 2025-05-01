// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.subscriptions.TimeInterval
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class PriceTest {

    @Test
    fun ofOneTime() {
        val oneTime =
            Price.OneTimePrice.builder()
                .currency(Currency.AED)
                .discount(0.0)
                .price(0L)
                .purchasingPowerParity(true)
                .type(Price.OneTimePrice.Type.ONE_TIME_PRICE)
                .payWhatYouWant(true)
                .suggestedPrice(0L)
                .taxInclusive(true)
                .build()

        val price = Price.ofOneTime(oneTime)

        assertThat(price.oneTime()).isEqualTo(oneTime)
        assertThat(price.recurring()).isNull()
    }

    @Test
    fun ofOneTimeRoundtrip() {
        val jsonMapper = jsonMapper()
        val price =
            Price.ofOneTime(
                Price.OneTimePrice.builder()
                    .currency(Currency.AED)
                    .discount(0.0)
                    .price(0L)
                    .purchasingPowerParity(true)
                    .type(Price.OneTimePrice.Type.ONE_TIME_PRICE)
                    .payWhatYouWant(true)
                    .suggestedPrice(0L)
                    .taxInclusive(true)
                    .build()
            )

        val roundtrippedPrice =
            jsonMapper.readValue(jsonMapper.writeValueAsString(price), jacksonTypeRef<Price>())

        assertThat(roundtrippedPrice).isEqualTo(price)
    }

    @Test
    fun ofRecurring() {
        val recurring =
            Price.RecurringPrice.builder()
                .currency(Currency.AED)
                .discount(0.0)
                .paymentFrequencyCount(0L)
                .paymentFrequencyInterval(TimeInterval.DAY)
                .price(0L)
                .purchasingPowerParity(true)
                .subscriptionPeriodCount(0L)
                .subscriptionPeriodInterval(TimeInterval.DAY)
                .type(Price.RecurringPrice.Type.RECURRING_PRICE)
                .taxInclusive(true)
                .trialPeriodDays(0L)
                .build()

        val price = Price.ofRecurring(recurring)

        assertThat(price.oneTime()).isNull()
        assertThat(price.recurring()).isEqualTo(recurring)
    }

    @Test
    fun ofRecurringRoundtrip() {
        val jsonMapper = jsonMapper()
        val price =
            Price.ofRecurring(
                Price.RecurringPrice.builder()
                    .currency(Currency.AED)
                    .discount(0.0)
                    .paymentFrequencyCount(0L)
                    .paymentFrequencyInterval(TimeInterval.DAY)
                    .price(0L)
                    .purchasingPowerParity(true)
                    .subscriptionPeriodCount(0L)
                    .subscriptionPeriodInterval(TimeInterval.DAY)
                    .type(Price.RecurringPrice.Type.RECURRING_PRICE)
                    .taxInclusive(true)
                    .trialPeriodDays(0L)
                    .build()
            )

        val roundtrippedPrice =
            jsonMapper.readValue(jsonMapper.writeValueAsString(price), jacksonTypeRef<Price>())

        assertThat(roundtrippedPrice).isEqualTo(price)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val price = jsonMapper().convertValue(testCase.value, jacksonTypeRef<Price>())

        val e = assertThrows<DodoPaymentsInvalidDataException> { price.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
