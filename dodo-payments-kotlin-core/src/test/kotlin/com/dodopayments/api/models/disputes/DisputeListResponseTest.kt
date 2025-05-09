// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.disputes

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DisputeListResponseTest {

    @Test
    fun create() {
        val disputeListResponse =
            DisputeListResponse.builder()
                .amount("amount")
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .disputeId("dispute_id")
                .disputeStage(DisputeStage.PRE_DISPUTE)
                .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                .paymentId("payment_id")
                .build()

        assertThat(disputeListResponse.amount()).isEqualTo("amount")
        assertThat(disputeListResponse.businessId()).isEqualTo("business_id")
        assertThat(disputeListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeListResponse.currency()).isEqualTo("currency")
        assertThat(disputeListResponse.disputeId()).isEqualTo("dispute_id")
        assertThat(disputeListResponse.disputeStage()).isEqualTo(DisputeStage.PRE_DISPUTE)
        assertThat(disputeListResponse.disputeStatus()).isEqualTo(DisputeStatus.DISPUTE_OPENED)
        assertThat(disputeListResponse.paymentId()).isEqualTo("payment_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val disputeListResponse =
            DisputeListResponse.builder()
                .amount("amount")
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .disputeId("dispute_id")
                .disputeStage(DisputeStage.PRE_DISPUTE)
                .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                .paymentId("payment_id")
                .build()

        val roundtrippedDisputeListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(disputeListResponse),
                jacksonTypeRef<DisputeListResponse>(),
            )

        assertThat(roundtrippedDisputeListResponse).isEqualTo(disputeListResponse)
    }
}
