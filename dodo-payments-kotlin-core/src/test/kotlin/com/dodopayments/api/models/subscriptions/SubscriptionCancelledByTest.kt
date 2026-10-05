// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionCancelledByTest {

    @Test
    fun create() {
        val subscriptionCancelledBy =
            SubscriptionCancelledBy.builder()
                .actorType(SubscriptionCancelledBy.ActorType.CUSTOMER)
                .email("email")
                .name("name")
                .build()

        assertThat(subscriptionCancelledBy.actorType())
            .isEqualTo(SubscriptionCancelledBy.ActorType.CUSTOMER)
        assertThat(subscriptionCancelledBy.email()).isEqualTo("email")
        assertThat(subscriptionCancelledBy.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionCancelledBy =
            SubscriptionCancelledBy.builder()
                .actorType(SubscriptionCancelledBy.ActorType.CUSTOMER)
                .email("email")
                .name("name")
                .build()

        val roundtrippedSubscriptionCancelledBy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionCancelledBy),
                jacksonTypeRef<SubscriptionCancelledBy>(),
            )

        assertThat(roundtrippedSubscriptionCancelledBy).isEqualTo(subscriptionCancelledBy)
    }
}
