// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AbandonedCheckoutDetectedWebhookEventTest {

    @Test
    fun create() {
        val abandonedCheckoutDetectedWebhookEvent =
            AbandonedCheckoutDetectedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    AbandonedCheckoutDetectedWebhookEvent.Data.builder()
                        .abandonedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .abandonmentReason(
                            AbandonedCheckoutDetectedWebhookEvent.Data.AbandonmentReason
                                .PAYMENT_FAILED
                        )
                        .customerId("customer_id")
                        .paymentId("payment_id")
                        .status(AbandonedCheckoutDetectedWebhookEvent.Data.Status.ABANDONED)
                        .recoveredPaymentId("recovered_payment_id")
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(abandonedCheckoutDetectedWebhookEvent.businessId()).isEqualTo("business_id")
        assertThat(abandonedCheckoutDetectedWebhookEvent.data())
            .isEqualTo(
                AbandonedCheckoutDetectedWebhookEvent.Data.builder()
                    .abandonedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .abandonmentReason(
                        AbandonedCheckoutDetectedWebhookEvent.Data.AbandonmentReason.PAYMENT_FAILED
                    )
                    .customerId("customer_id")
                    .paymentId("payment_id")
                    .status(AbandonedCheckoutDetectedWebhookEvent.Data.Status.ABANDONED)
                    .recoveredPaymentId("recovered_payment_id")
                    .build()
            )
        assertThat(abandonedCheckoutDetectedWebhookEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val abandonedCheckoutDetectedWebhookEvent =
            AbandonedCheckoutDetectedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    AbandonedCheckoutDetectedWebhookEvent.Data.builder()
                        .abandonedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .abandonmentReason(
                            AbandonedCheckoutDetectedWebhookEvent.Data.AbandonmentReason
                                .PAYMENT_FAILED
                        )
                        .customerId("customer_id")
                        .paymentId("payment_id")
                        .status(AbandonedCheckoutDetectedWebhookEvent.Data.Status.ABANDONED)
                        .recoveredPaymentId("recovered_payment_id")
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedAbandonedCheckoutDetectedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(abandonedCheckoutDetectedWebhookEvent),
                jacksonTypeRef<AbandonedCheckoutDetectedWebhookEvent>(),
            )

        assertThat(roundtrippedAbandonedCheckoutDetectedWebhookEvent)
            .isEqualTo(abandonedCheckoutDetectedWebhookEvent)
    }
}
