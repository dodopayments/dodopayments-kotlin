// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionChangePlanResponseTest {

    @Test
    fun create() {
        val subscriptionChangePlanResponse =
            SubscriptionChangePlanResponse.builder()
                .clientSecret("client_secret")
                .expiresOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .paymentId("payment_id")
                .paymentLink("payment_link")
                .build()

        assertThat(subscriptionChangePlanResponse.clientSecret()).isEqualTo("client_secret")
        assertThat(subscriptionChangePlanResponse.expiresOn())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionChangePlanResponse.paymentId()).isEqualTo("payment_id")
        assertThat(subscriptionChangePlanResponse.paymentLink()).isEqualTo("payment_link")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionChangePlanResponse =
            SubscriptionChangePlanResponse.builder()
                .clientSecret("client_secret")
                .expiresOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .paymentId("payment_id")
                .paymentLink("payment_link")
                .build()

        val roundtrippedSubscriptionChangePlanResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionChangePlanResponse),
                jacksonTypeRef<SubscriptionChangePlanResponse>(),
            )

        assertThat(roundtrippedSubscriptionChangePlanResponse)
            .isEqualTo(subscriptionChangePlanResponse)
    }
}
