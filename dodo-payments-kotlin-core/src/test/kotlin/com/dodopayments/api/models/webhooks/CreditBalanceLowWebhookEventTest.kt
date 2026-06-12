// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditBalanceLowWebhookEventTest {

    @Test
    fun create() {
        val creditBalanceLowWebhookEvent =
            CreditBalanceLowWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    CreditBalanceLowWebhookEvent.Data.builder()
                        .availableBalance("available_balance")
                        .brandId("brand_id")
                        .creditEntitlementId("credit_entitlement_id")
                        .creditEntitlementName("credit_entitlement_name")
                        .customerId("customer_id")
                        .subscriptionCreditsAmount("subscription_credits_amount")
                        .subscriptionId("subscription_id")
                        .thresholdAmount("threshold_amount")
                        .thresholdPercent(0)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(creditBalanceLowWebhookEvent.businessId()).isEqualTo("business_id")
        assertThat(creditBalanceLowWebhookEvent.data())
            .isEqualTo(
                CreditBalanceLowWebhookEvent.Data.builder()
                    .availableBalance("available_balance")
                    .brandId("brand_id")
                    .creditEntitlementId("credit_entitlement_id")
                    .creditEntitlementName("credit_entitlement_name")
                    .customerId("customer_id")
                    .subscriptionCreditsAmount("subscription_credits_amount")
                    .subscriptionId("subscription_id")
                    .thresholdAmount("threshold_amount")
                    .thresholdPercent(0)
                    .build()
            )
        assertThat(creditBalanceLowWebhookEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val creditBalanceLowWebhookEvent =
            CreditBalanceLowWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    CreditBalanceLowWebhookEvent.Data.builder()
                        .availableBalance("available_balance")
                        .brandId("brand_id")
                        .creditEntitlementId("credit_entitlement_id")
                        .creditEntitlementName("credit_entitlement_name")
                        .customerId("customer_id")
                        .subscriptionCreditsAmount("subscription_credits_amount")
                        .subscriptionId("subscription_id")
                        .thresholdAmount("threshold_amount")
                        .thresholdPercent(0)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedCreditBalanceLowWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(creditBalanceLowWebhookEvent),
                jacksonTypeRef<CreditBalanceLowWebhookEvent>(),
            )

        assertThat(roundtrippedCreditBalanceLowWebhookEvent).isEqualTo(creditBalanceLowWebhookEvent)
    }
}
