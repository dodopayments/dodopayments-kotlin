// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.disputes.DisputeStage
import com.dodopayments.api.models.disputes.DisputeStatus
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DisputeAcceptedWebhookEventTest {

    @Test
    fun create() {
        val disputeAcceptedWebhookEvent =
            DisputeAcceptedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    DisputeAcceptedWebhookEvent.Data.builder()
                        .amount("amount")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .disputeId("dispute_id")
                        .disputeStage(DisputeStage.PRE_DISPUTE)
                        .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                        .paymentId("payment_id")
                        .remarks("remarks")
                        .payloadType(DisputeAcceptedWebhookEvent.Data.PayloadType.DISPUTE)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(DisputeAcceptedWebhookEvent.Type.DISPUTE_ACCEPTED)
                .build()

        assertThat(disputeAcceptedWebhookEvent.businessId()).isEqualTo("business_id")
        assertThat(disputeAcceptedWebhookEvent.data())
            .isEqualTo(
                DisputeAcceptedWebhookEvent.Data.builder()
                    .amount("amount")
                    .businessId("business_id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency("currency")
                    .disputeId("dispute_id")
                    .disputeStage(DisputeStage.PRE_DISPUTE)
                    .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                    .paymentId("payment_id")
                    .remarks("remarks")
                    .payloadType(DisputeAcceptedWebhookEvent.Data.PayloadType.DISPUTE)
                    .build()
            )
        assertThat(disputeAcceptedWebhookEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeAcceptedWebhookEvent.type())
            .isEqualTo(DisputeAcceptedWebhookEvent.Type.DISPUTE_ACCEPTED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val disputeAcceptedWebhookEvent =
            DisputeAcceptedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    DisputeAcceptedWebhookEvent.Data.builder()
                        .amount("amount")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .disputeId("dispute_id")
                        .disputeStage(DisputeStage.PRE_DISPUTE)
                        .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                        .paymentId("payment_id")
                        .remarks("remarks")
                        .payloadType(DisputeAcceptedWebhookEvent.Data.PayloadType.DISPUTE)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(DisputeAcceptedWebhookEvent.Type.DISPUTE_ACCEPTED)
                .build()

        val roundtrippedDisputeAcceptedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(disputeAcceptedWebhookEvent),
                jacksonTypeRef<DisputeAcceptedWebhookEvent>(),
            )

        assertThat(roundtrippedDisputeAcceptedWebhookEvent).isEqualTo(disputeAcceptedWebhookEvent)
    }
}
