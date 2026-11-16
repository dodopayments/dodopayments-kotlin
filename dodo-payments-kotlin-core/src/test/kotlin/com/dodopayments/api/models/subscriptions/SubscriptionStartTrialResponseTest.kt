// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionStartTrialResponseTest {

    @Test
    fun create() {
        val subscriptionStartTrialResponse =
            SubscriptionStartTrialResponse.builder()
                .invoiceId("invoice_id")
                .subscriptionId("subscription_id")
                .trialEndsAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(subscriptionStartTrialResponse.invoiceId()).isEqualTo("invoice_id")
        assertThat(subscriptionStartTrialResponse.subscriptionId()).isEqualTo("subscription_id")
        assertThat(subscriptionStartTrialResponse.trialEndsAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionStartTrialResponse =
            SubscriptionStartTrialResponse.builder()
                .invoiceId("invoice_id")
                .subscriptionId("subscription_id")
                .trialEndsAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedSubscriptionStartTrialResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionStartTrialResponse),
                jacksonTypeRef<SubscriptionStartTrialResponse>(),
            )

        assertThat(roundtrippedSubscriptionStartTrialResponse)
            .isEqualTo(subscriptionStartTrialResponse)
    }
}
