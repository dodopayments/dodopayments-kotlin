// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AbandonedCheckoutRecoveredWebhookEventTest {

    @Test
    fun create() {
        val abandonedCheckoutRecoveredWebhookEvent =
            AbandonedCheckoutRecoveredWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    AbandonedCheckoutRecoveredWebhookEvent.Data.builder()
                        .abandonedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .abandonmentReason(
                            AbandonedCheckoutRecoveredWebhookEvent.Data.AbandonmentReason
                                .PAYMENT_FAILED
                        )
                        .customerId("customer_id")
                        .paymentId("payment_id")
                        .status(AbandonedCheckoutRecoveredWebhookEvent.Data.Status.ABANDONED)
                        .recoveredPaymentId("recovered_payment_id")
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(AbandonedCheckoutRecoveredWebhookEvent.Type.ABANDONED_CHECKOUT_RECOVERED)
                .build()

        assertThat(abandonedCheckoutRecoveredWebhookEvent.businessId()).isEqualTo("business_id")
        assertThat(abandonedCheckoutRecoveredWebhookEvent.data())
            .isEqualTo(
                AbandonedCheckoutRecoveredWebhookEvent.Data.builder()
                    .abandonedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .abandonmentReason(
                        AbandonedCheckoutRecoveredWebhookEvent.Data.AbandonmentReason.PAYMENT_FAILED
                    )
                    .customerId("customer_id")
                    .paymentId("payment_id")
                    .status(AbandonedCheckoutRecoveredWebhookEvent.Data.Status.ABANDONED)
                    .recoveredPaymentId("recovered_payment_id")
                    .build()
            )
        assertThat(abandonedCheckoutRecoveredWebhookEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(abandonedCheckoutRecoveredWebhookEvent.type())
            .isEqualTo(AbandonedCheckoutRecoveredWebhookEvent.Type.ABANDONED_CHECKOUT_RECOVERED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val abandonedCheckoutRecoveredWebhookEvent =
            AbandonedCheckoutRecoveredWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    AbandonedCheckoutRecoveredWebhookEvent.Data.builder()
                        .abandonedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .abandonmentReason(
                            AbandonedCheckoutRecoveredWebhookEvent.Data.AbandonmentReason
                                .PAYMENT_FAILED
                        )
                        .customerId("customer_id")
                        .paymentId("payment_id")
                        .status(AbandonedCheckoutRecoveredWebhookEvent.Data.Status.ABANDONED)
                        .recoveredPaymentId("recovered_payment_id")
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(AbandonedCheckoutRecoveredWebhookEvent.Type.ABANDONED_CHECKOUT_RECOVERED)
                .build()

        val roundtrippedAbandonedCheckoutRecoveredWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(abandonedCheckoutRecoveredWebhookEvent),
                jacksonTypeRef<AbandonedCheckoutRecoveredWebhookEvent>(),
            )

        assertThat(roundtrippedAbandonedCheckoutRecoveredWebhookEvent)
            .isEqualTo(abandonedCheckoutRecoveredWebhookEvent)
    }
}
