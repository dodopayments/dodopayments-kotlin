// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionRetrieveCreditUsageResponseTest {

    @Test
    fun create() {
        val subscriptionRetrieveCreditUsageResponse =
            SubscriptionRetrieveCreditUsageResponse.builder()
                .addItem(
                    SubscriptionRetrieveCreditUsageResponse.Item.builder()
                        .balance("250.00")
                        .creditEntitlementId("credit_entitlement_id")
                        .creditEntitlementName("credit_entitlement_name")
                        .limitReached(true)
                        .overage("15.50")
                        .overageEnabled(true)
                        .unit("unit")
                        .overageLimit("100.00")
                        .remainingHeadroom("84.50")
                        .build()
                )
                .subscriptionId("subscription_id")
                .build()

        assertThat(subscriptionRetrieveCreditUsageResponse.items())
            .containsExactly(
                SubscriptionRetrieveCreditUsageResponse.Item.builder()
                    .balance("250.00")
                    .creditEntitlementId("credit_entitlement_id")
                    .creditEntitlementName("credit_entitlement_name")
                    .limitReached(true)
                    .overage("15.50")
                    .overageEnabled(true)
                    .unit("unit")
                    .overageLimit("100.00")
                    .remainingHeadroom("84.50")
                    .build()
            )
        assertThat(subscriptionRetrieveCreditUsageResponse.subscriptionId())
            .isEqualTo("subscription_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionRetrieveCreditUsageResponse =
            SubscriptionRetrieveCreditUsageResponse.builder()
                .addItem(
                    SubscriptionRetrieveCreditUsageResponse.Item.builder()
                        .balance("250.00")
                        .creditEntitlementId("credit_entitlement_id")
                        .creditEntitlementName("credit_entitlement_name")
                        .limitReached(true)
                        .overage("15.50")
                        .overageEnabled(true)
                        .unit("unit")
                        .overageLimit("100.00")
                        .remainingHeadroom("84.50")
                        .build()
                )
                .subscriptionId("subscription_id")
                .build()

        val roundtrippedSubscriptionRetrieveCreditUsageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionRetrieveCreditUsageResponse),
                jacksonTypeRef<SubscriptionRetrieveCreditUsageResponse>(),
            )

        assertThat(roundtrippedSubscriptionRetrieveCreditUsageResponse)
            .isEqualTo(subscriptionRetrieveCreditUsageResponse)
    }
}
