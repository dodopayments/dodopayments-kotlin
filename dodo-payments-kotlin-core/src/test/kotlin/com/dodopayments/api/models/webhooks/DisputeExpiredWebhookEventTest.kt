// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.disputes.Dispute
import com.dodopayments.api.models.disputes.DisputeStage
import com.dodopayments.api.models.disputes.DisputeStatus
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DisputeExpiredWebhookEventTest {

    @Test
    fun create() {
        val disputeExpiredWebhookEvent =
            DisputeExpiredWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    Dispute.builder()
                        .amount("amount")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .disputeId("dispute_id")
                        .disputeStage(DisputeStage.PRE_DISPUTE)
                        .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                        .paymentId("payment_id")
                        .remarks("remarks")
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(DisputeExpiredWebhookEvent.Type.DISPUTE_EXPIRED)
                .build()

        assertThat(disputeExpiredWebhookEvent.businessId()).isEqualTo("business_id")
        assertThat(disputeExpiredWebhookEvent.data())
            .isEqualTo(
                Dispute.builder()
                    .amount("amount")
                    .businessId("business_id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency("currency")
                    .disputeId("dispute_id")
                    .disputeStage(DisputeStage.PRE_DISPUTE)
                    .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                    .paymentId("payment_id")
                    .remarks("remarks")
                    .build()
            )
        assertThat(disputeExpiredWebhookEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeExpiredWebhookEvent.type())
            .isEqualTo(DisputeExpiredWebhookEvent.Type.DISPUTE_EXPIRED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val disputeExpiredWebhookEvent =
            DisputeExpiredWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    Dispute.builder()
                        .amount("amount")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .disputeId("dispute_id")
                        .disputeStage(DisputeStage.PRE_DISPUTE)
                        .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                        .paymentId("payment_id")
                        .remarks("remarks")
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(DisputeExpiredWebhookEvent.Type.DISPUTE_EXPIRED)
                .build()

        val roundtrippedDisputeExpiredWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(disputeExpiredWebhookEvent),
                jacksonTypeRef<DisputeExpiredWebhookEvent>(),
            )

        assertThat(roundtrippedDisputeExpiredWebhookEvent).isEqualTo(disputeExpiredWebhookEvent)
    }
}
