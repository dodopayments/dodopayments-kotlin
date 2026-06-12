// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DunningRecoveredWebhookEventTest {

    @Test
    fun create() {
        val dunningRecoveredWebhookEvent =
            DunningRecoveredWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    DunningRecoveredWebhookEvent.Data.builder()
                        .brandId("brand_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customer_id")
                        .status(DunningRecoveredWebhookEvent.Data.Status.RECOVERING)
                        .subscriptionId("subscription_id")
                        .triggerState(DunningRecoveredWebhookEvent.Data.TriggerState.ON_HOLD)
                        .paymentId("payment_id")
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(dunningRecoveredWebhookEvent.businessId()).isEqualTo("business_id")
        assertThat(dunningRecoveredWebhookEvent.data())
            .isEqualTo(
                DunningRecoveredWebhookEvent.Data.builder()
                    .brandId("brand_id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerId("customer_id")
                    .status(DunningRecoveredWebhookEvent.Data.Status.RECOVERING)
                    .subscriptionId("subscription_id")
                    .triggerState(DunningRecoveredWebhookEvent.Data.TriggerState.ON_HOLD)
                    .paymentId("payment_id")
                    .build()
            )
        assertThat(dunningRecoveredWebhookEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dunningRecoveredWebhookEvent =
            DunningRecoveredWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    DunningRecoveredWebhookEvent.Data.builder()
                        .brandId("brand_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customer_id")
                        .status(DunningRecoveredWebhookEvent.Data.Status.RECOVERING)
                        .subscriptionId("subscription_id")
                        .triggerState(DunningRecoveredWebhookEvent.Data.TriggerState.ON_HOLD)
                        .paymentId("payment_id")
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedDunningRecoveredWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dunningRecoveredWebhookEvent),
                jacksonTypeRef<DunningRecoveredWebhookEvent>(),
            )

        assertThat(roundtrippedDunningRecoveredWebhookEvent).isEqualTo(dunningRecoveredWebhookEvent)
    }
}
