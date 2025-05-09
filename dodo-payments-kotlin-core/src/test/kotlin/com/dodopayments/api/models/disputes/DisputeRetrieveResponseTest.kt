// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.disputes

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.payments.CustomerLimitedDetails
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DisputeRetrieveResponseTest {

    @Test
    fun create() {
        val disputeRetrieveResponse =
            DisputeRetrieveResponse.builder()
                .amount("amount")
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .customer(
                    CustomerLimitedDetails.builder()
                        .customerId("customer_id")
                        .email("email")
                        .name("name")
                        .build()
                )
                .disputeId("dispute_id")
                .disputeStage(DisputeStage.PRE_DISPUTE)
                .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                .paymentId("payment_id")
                .reason("reason")
                .remarks("remarks")
                .build()

        assertThat(disputeRetrieveResponse.amount()).isEqualTo("amount")
        assertThat(disputeRetrieveResponse.businessId()).isEqualTo("business_id")
        assertThat(disputeRetrieveResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(disputeRetrieveResponse.currency()).isEqualTo("currency")
        assertThat(disputeRetrieveResponse.customer())
            .isEqualTo(
                CustomerLimitedDetails.builder()
                    .customerId("customer_id")
                    .email("email")
                    .name("name")
                    .build()
            )
        assertThat(disputeRetrieveResponse.disputeId()).isEqualTo("dispute_id")
        assertThat(disputeRetrieveResponse.disputeStage()).isEqualTo(DisputeStage.PRE_DISPUTE)
        assertThat(disputeRetrieveResponse.disputeStatus()).isEqualTo(DisputeStatus.DISPUTE_OPENED)
        assertThat(disputeRetrieveResponse.paymentId()).isEqualTo("payment_id")
        assertThat(disputeRetrieveResponse.reason()).isEqualTo("reason")
        assertThat(disputeRetrieveResponse.remarks()).isEqualTo("remarks")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val disputeRetrieveResponse =
            DisputeRetrieveResponse.builder()
                .amount("amount")
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .customer(
                    CustomerLimitedDetails.builder()
                        .customerId("customer_id")
                        .email("email")
                        .name("name")
                        .build()
                )
                .disputeId("dispute_id")
                .disputeStage(DisputeStage.PRE_DISPUTE)
                .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                .paymentId("payment_id")
                .reason("reason")
                .remarks("remarks")
                .build()

        val roundtrippedDisputeRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(disputeRetrieveResponse),
                jacksonTypeRef<DisputeRetrieveResponse>(),
            )

        assertThat(roundtrippedDisputeRetrieveResponse).isEqualTo(disputeRetrieveResponse)
    }
}
