// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionServicePeriodTest {

    @Test
    fun create() {
        val subscriptionServicePeriod =
            SubscriptionServicePeriod.builder()
                .endsAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .prorationFactor("1")
                .startsAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .subscriptionId("subscription_id")
                .build()

        assertThat(subscriptionServicePeriod.endsAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionServicePeriod.prorationFactor()).isEqualTo("1")
        assertThat(subscriptionServicePeriod.startsAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionServicePeriod.subscriptionId()).isEqualTo("subscription_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionServicePeriod =
            SubscriptionServicePeriod.builder()
                .endsAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .prorationFactor("1")
                .startsAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .subscriptionId("subscription_id")
                .build()

        val roundtrippedSubscriptionServicePeriod =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionServicePeriod),
                jacksonTypeRef<SubscriptionServicePeriod>(),
            )

        assertThat(roundtrippedSubscriptionServicePeriod).isEqualTo(subscriptionServicePeriod)
    }
}
