// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Currency
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionRetrieveUsageHistoryResponseTest {

    @Test
    fun create() {
        val subscriptionRetrieveUsageHistoryResponse =
            SubscriptionRetrieveUsageHistoryResponse.builder()
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addMeter(
                    SubscriptionRetrieveUsageHistoryResponse.Meter.builder()
                        .id("id")
                        .chargeableUnits("chargeable_units")
                        .consumedUnits("consumed_units")
                        .currency(Currency.AED)
                        .freeThreshold(0L)
                        .name("name")
                        .pricePerUnit("price_per_unit")
                        .totalPrice(0)
                        .build()
                )
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(subscriptionRetrieveUsageHistoryResponse.endDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionRetrieveUsageHistoryResponse.meters())
            .containsExactly(
                SubscriptionRetrieveUsageHistoryResponse.Meter.builder()
                    .id("id")
                    .chargeableUnits("chargeable_units")
                    .consumedUnits("consumed_units")
                    .currency(Currency.AED)
                    .freeThreshold(0L)
                    .name("name")
                    .pricePerUnit("price_per_unit")
                    .totalPrice(0)
                    .build()
            )
        assertThat(subscriptionRetrieveUsageHistoryResponse.startDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionRetrieveUsageHistoryResponse =
            SubscriptionRetrieveUsageHistoryResponse.builder()
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addMeter(
                    SubscriptionRetrieveUsageHistoryResponse.Meter.builder()
                        .id("id")
                        .chargeableUnits("chargeable_units")
                        .consumedUnits("consumed_units")
                        .currency(Currency.AED)
                        .freeThreshold(0L)
                        .name("name")
                        .pricePerUnit("price_per_unit")
                        .totalPrice(0)
                        .build()
                )
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedSubscriptionRetrieveUsageHistoryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionRetrieveUsageHistoryResponse),
                jacksonTypeRef<SubscriptionRetrieveUsageHistoryResponse>(),
            )

        assertThat(roundtrippedSubscriptionRetrieveUsageHistoryResponse)
            .isEqualTo(subscriptionRetrieveUsageHistoryResponse)
    }
}
