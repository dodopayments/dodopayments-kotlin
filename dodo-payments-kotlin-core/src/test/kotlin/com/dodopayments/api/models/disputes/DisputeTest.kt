// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.disputes

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DisputeTest {

    @Test
    fun createDispute() {
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
        assertThat(dispute).isNotNull
        assertThat(dispute.amount()).isEqualTo("amount")
        assertThat(dispute.businessId()).isEqualTo("business_id")
        assertThat(dispute.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dispute.currency()).isEqualTo("currency")
        assertThat(dispute.disputeId()).isEqualTo("dispute_id")
        assertThat(dispute.disputeStage()).isEqualTo(DisputeStage.PRE_DISPUTE)
        assertThat(dispute.disputeStatus()).isEqualTo(DisputeStatus.DISPUTE_OPENED)
        assertThat(dispute.paymentId()).isEqualTo("payment_id")
    }
}
