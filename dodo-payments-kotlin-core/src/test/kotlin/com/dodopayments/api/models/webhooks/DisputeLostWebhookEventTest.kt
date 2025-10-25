// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.disputes.DisputeStage
import com.dodopayments.api.models.disputes.DisputeStatus
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DisputeLostWebhookEventTest {

    @Test
    fun create() {
        val disputeLostWebhookEvent =
            DisputeLostWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    DisputeLostWebhookEvent.Data.builder()
                        .amount("amount")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .disputeId("dispute_id")
                        .disputeStage(DisputeStage.PRE_DISPUTE)
                        .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                        .paymentId("payment_id")
                        .remarks("remarks")
                        .payloadType(DisputeLostWebhookEvent.Data.PayloadType.DISPUTE)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(DisputeLostWebhookEvent.Type.DISPUTE_LOST)
                .build()

        assertThat(disputeLostWebhookEvent.businessId()).isEqualTo("business_id")
        assertThat(disputeLostWebhookEvent.data())
            .isEqualTo(
                DisputeLostWebhookEvent.Data.builder()
                    .amount("amount")
                    .businessId("business_id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency("currency")
                    .disputeId("dispute_id")
                    .disputeStage(DisputeStage.PRE_DISPUTE)
                    .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                    .paymentId("payment_id")
                    .remarks("remarks")
                    .payloadType(DisputeLostWebhookEvent.Data.PayloadType.DISPUTE)
                    .build()
            )
        assertThat(disputeLostWebhookEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeLostWebhookEvent.type())
            .isEqualTo(DisputeLostWebhookEvent.Type.DISPUTE_LOST)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val disputeLostWebhookEvent =
            DisputeLostWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    DisputeLostWebhookEvent.Data.builder()
                        .amount("amount")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .disputeId("dispute_id")
                        .disputeStage(DisputeStage.PRE_DISPUTE)
                        .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                        .paymentId("payment_id")
                        .remarks("remarks")
                        .payloadType(DisputeLostWebhookEvent.Data.PayloadType.DISPUTE)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(DisputeLostWebhookEvent.Type.DISPUTE_LOST)
                .build()

        val roundtrippedDisputeLostWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(disputeLostWebhookEvent),
                jacksonTypeRef<DisputeLostWebhookEvent>(),
            )

        assertThat(roundtrippedDisputeLostWebhookEvent).isEqualTo(disputeLostWebhookEvent)
    }
}
