// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.disputes

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DisputeTest {

    @Test
    fun create() {
        val dispute =
            Dispute.builder()
                .amount("amount")
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .disputeId("dispute_id")
                .disputeStage(DisputeStage.PRE_DISPUTE)
                .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                .paymentId("payment_id")
                .build()

        assertThat(dispute.amount()).isEqualTo("amount")
        assertThat(dispute.businessId()).isEqualTo("business_id")
        assertThat(dispute.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dispute.currency()).isEqualTo("currency")
        assertThat(dispute.disputeId()).isEqualTo("dispute_id")
        assertThat(dispute.disputeStage()).isEqualTo(DisputeStage.PRE_DISPUTE)
        assertThat(dispute.disputeStatus()).isEqualTo(DisputeStatus.DISPUTE_OPENED)
        assertThat(dispute.paymentId()).isEqualTo("payment_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dispute =
            Dispute.builder()
                .amount("amount")
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .disputeId("dispute_id")
                .disputeStage(DisputeStage.PRE_DISPUTE)
                .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                .paymentId("payment_id")
                .build()

        val roundtrippedDispute =
            jsonMapper.readValue(jsonMapper.writeValueAsString(dispute), jacksonTypeRef<Dispute>())

        assertThat(roundtrippedDispute).isEqualTo(dispute)
    }
}
