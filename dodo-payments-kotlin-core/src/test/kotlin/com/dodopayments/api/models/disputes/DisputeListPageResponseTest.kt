// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.disputes

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DisputeListPageResponseTest {

    @Test
    fun create() {
        val disputeListPageResponse =
            DisputeListPageResponse.builder()
                .addItem(
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
                )
                .build()

        assertThat(disputeListPageResponse.items())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val disputeListPageResponse =
            DisputeListPageResponse.builder()
                .addItem(
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
                )
                .build()

        val roundtrippedDisputeListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(disputeListPageResponse),
                jacksonTypeRef<DisputeListPageResponse>(),
            )

        assertThat(roundtrippedDisputeListPageResponse).isEqualTo(disputeListPageResponse)
    }
}
