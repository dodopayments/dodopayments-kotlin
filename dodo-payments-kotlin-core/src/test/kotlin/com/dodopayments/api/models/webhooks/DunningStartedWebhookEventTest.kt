// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DunningStartedWebhookEventTest {

    @Test
    fun create() {
        val dunningStartedWebhookEvent =
            DunningStartedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    DunningStartedWebhookEvent.Data.builder()
                        .brandId("brand_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customer_id")
                        .status(DunningStartedWebhookEvent.Data.Status.RECOVERING)
                        .subscriptionId("subscription_id")
                        .triggerState(DunningStartedWebhookEvent.Data.TriggerState.ON_HOLD)
                        .paymentId("payment_id")
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(dunningStartedWebhookEvent.businessId()).isEqualTo("business_id")
        assertThat(dunningStartedWebhookEvent.data())
            .isEqualTo(
                DunningStartedWebhookEvent.Data.builder()
                    .brandId("brand_id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerId("customer_id")
                    .status(DunningStartedWebhookEvent.Data.Status.RECOVERING)
                    .subscriptionId("subscription_id")
                    .triggerState(DunningStartedWebhookEvent.Data.TriggerState.ON_HOLD)
                    .paymentId("payment_id")
                    .build()
            )
        assertThat(dunningStartedWebhookEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dunningStartedWebhookEvent =
            DunningStartedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    DunningStartedWebhookEvent.Data.builder()
                        .brandId("brand_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customer_id")
                        .status(DunningStartedWebhookEvent.Data.Status.RECOVERING)
                        .subscriptionId("subscription_id")
                        .triggerState(DunningStartedWebhookEvent.Data.TriggerState.ON_HOLD)
                        .paymentId("payment_id")
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedDunningStartedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dunningStartedWebhookEvent),
                jacksonTypeRef<DunningStartedWebhookEvent>(),
            )

        assertThat(roundtrippedDunningStartedWebhookEvent).isEqualTo(dunningStartedWebhookEvent)
    }
}
