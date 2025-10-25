// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.disputes.DisputeStage
import com.dodopayments.api.models.disputes.DisputeStatus
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DisputeChallengedWebhookEventTest {

    @Test
    fun create() {
        val disputeChallengedWebhookEvent =
            DisputeChallengedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    DisputeChallengedWebhookEvent.Data.builder()
                        .amount("amount")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .disputeId("dispute_id")
                        .disputeStage(DisputeStage.PRE_DISPUTE)
                        .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                        .paymentId("payment_id")
                        .remarks("remarks")
                        .payloadType(DisputeChallengedWebhookEvent.Data.PayloadType.DISPUTE)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(DisputeChallengedWebhookEvent.Type.DISPUTE_CHALLENGED)
                .build()

        assertThat(disputeChallengedWebhookEvent.businessId()).isEqualTo("business_id")
        assertThat(disputeChallengedWebhookEvent.data())
            .isEqualTo(
                DisputeChallengedWebhookEvent.Data.builder()
                    .amount("amount")
                    .businessId("business_id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency("currency")
                    .disputeId("dispute_id")
                    .disputeStage(DisputeStage.PRE_DISPUTE)
                    .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                    .paymentId("payment_id")
                    .remarks("remarks")
                    .payloadType(DisputeChallengedWebhookEvent.Data.PayloadType.DISPUTE)
                    .build()
            )
        assertThat(disputeChallengedWebhookEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeChallengedWebhookEvent.type())
            .isEqualTo(DisputeChallengedWebhookEvent.Type.DISPUTE_CHALLENGED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val disputeChallengedWebhookEvent =
            DisputeChallengedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    DisputeChallengedWebhookEvent.Data.builder()
                        .amount("amount")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .disputeId("dispute_id")
                        .disputeStage(DisputeStage.PRE_DISPUTE)
                        .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                        .paymentId("payment_id")
                        .remarks("remarks")
                        .payloadType(DisputeChallengedWebhookEvent.Data.PayloadType.DISPUTE)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(DisputeChallengedWebhookEvent.Type.DISPUTE_CHALLENGED)
                .build()

        val roundtrippedDisputeChallengedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(disputeChallengedWebhookEvent),
                jacksonTypeRef<DisputeChallengedWebhookEvent>(),
            )

        assertThat(roundtrippedDisputeChallengedWebhookEvent)
            .isEqualTo(disputeChallengedWebhookEvent)
    }
}
