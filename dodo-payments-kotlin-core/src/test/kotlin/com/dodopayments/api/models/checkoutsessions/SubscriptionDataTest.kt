// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.checkoutsessions

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.subscriptions.OnDemandSubscription
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionDataTest {

    @Test
    fun create() {
        val subscriptionData =
            SubscriptionData.builder()
                .onDemand(
                    OnDemandSubscription.builder()
                        .mandateOnly(true)
                        .adaptiveCurrencyFeesInclusive(true)
                        .productCurrency(Currency.AED)
                        .productDescription("product_description")
                        .productPrice(0)
                        .build()
                )
                .trialPeriodDays(0)
                .build()

        assertThat(subscriptionData.onDemand())
            .isEqualTo(
                OnDemandSubscription.builder()
                    .mandateOnly(true)
                    .adaptiveCurrencyFeesInclusive(true)
                    .productCurrency(Currency.AED)
                    .productDescription("product_description")
                    .productPrice(0)
                    .build()
            )
        assertThat(subscriptionData.trialPeriodDays()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionData =
            SubscriptionData.builder()
                .onDemand(
                    OnDemandSubscription.builder()
                        .mandateOnly(true)
                        .adaptiveCurrencyFeesInclusive(true)
                        .productCurrency(Currency.AED)
                        .productDescription("product_description")
                        .productPrice(0)
                        .build()
                )
                .trialPeriodDays(0)
                .build()

        val roundtrippedSubscriptionData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionData),
                jacksonTypeRef<SubscriptionData>(),
            )

        assertThat(roundtrippedSubscriptionData).isEqualTo(subscriptionData)
    }
}
