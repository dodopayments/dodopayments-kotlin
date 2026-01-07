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

internal class DisputeOpenedWebhookEventTest {

    @Test
    fun create() {
        val disputeOpenedWebhookEvent =
            DisputeOpenedWebhookEvent.builder()
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
                .type(DisputeOpenedWebhookEvent.Type.DISPUTE_OPENED)
                .build()

        assertThat(disputeOpenedWebhookEvent.businessId()).isEqualTo("business_id")
        assertThat(disputeOpenedWebhookEvent.data())
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
        assertThat(disputeOpenedWebhookEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeOpenedWebhookEvent.type())
            .isEqualTo(DisputeOpenedWebhookEvent.Type.DISPUTE_OPENED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val disputeOpenedWebhookEvent =
            DisputeOpenedWebhookEvent.builder()
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
                .type(DisputeOpenedWebhookEvent.Type.DISPUTE_OPENED)
                .build()

        val roundtrippedDisputeOpenedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(disputeOpenedWebhookEvent),
                jacksonTypeRef<DisputeOpenedWebhookEvent>(),
            )

        assertThat(roundtrippedDisputeOpenedWebhookEvent).isEqualTo(disputeOpenedWebhookEvent)
    }
}
