// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Currency
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionRetrieveUsageHistoryPageResponseTest {

    @Test
    fun create() {
        val subscriptionRetrieveUsageHistoryPageResponse =
            SubscriptionRetrieveUsageHistoryPageResponse.builder()
                .addItem(
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
                )
                .build()

        assertThat(subscriptionRetrieveUsageHistoryPageResponse.items())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionRetrieveUsageHistoryPageResponse =
            SubscriptionRetrieveUsageHistoryPageResponse.builder()
                .addItem(
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
                )
                .build()

        val roundtrippedSubscriptionRetrieveUsageHistoryPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionRetrieveUsageHistoryPageResponse),
                jacksonTypeRef<SubscriptionRetrieveUsageHistoryPageResponse>(),
            )

        assertThat(roundtrippedSubscriptionRetrieveUsageHistoryPageResponse)
            .isEqualTo(subscriptionRetrieveUsageHistoryPageResponse)
    }
}
