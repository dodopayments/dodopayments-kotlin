// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Currency
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnDemandSubscriptionTest {

    @Test
    fun create() {
        val onDemandSubscription =
            OnDemandSubscription.builder()
                .mandateOnly(true)
                .adaptiveCurrencyFeesInclusive(true)
                .productCurrency(Currency.AED)
                .productDescription("product_description")
                .productPrice(0)
                .build()

        assertThat(onDemandSubscription.mandateOnly()).isEqualTo(true)
        assertThat(onDemandSubscription.adaptiveCurrencyFeesInclusive()).isEqualTo(true)
        assertThat(onDemandSubscription.productCurrency()).isEqualTo(Currency.AED)
        assertThat(onDemandSubscription.productDescription()).isEqualTo("product_description")
        assertThat(onDemandSubscription.productPrice()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val onDemandSubscription =
            OnDemandSubscription.builder()
                .mandateOnly(true)
                .adaptiveCurrencyFeesInclusive(true)
                .productCurrency(Currency.AED)
                .productDescription("product_description")
                .productPrice(0)
                .build()

        val roundtrippedOnDemandSubscription =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(onDemandSubscription),
                jacksonTypeRef<OnDemandSubscription>(),
            )

        assertThat(roundtrippedOnDemandSubscription).isEqualTo(onDemandSubscription)
    }
}
