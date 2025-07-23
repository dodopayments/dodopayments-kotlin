// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.disputes

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.payments.CustomerLimitedDetails
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GetDisputeTest {

    @Test
    fun create() {
        val getDispute =
            GetDispute.builder()
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

        assertThat(getDispute.amount()).isEqualTo("amount")
        assertThat(getDispute.businessId()).isEqualTo("business_id")
        assertThat(getDispute.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(getDispute.currency()).isEqualTo("currency")
        assertThat(getDispute.customer())
            .isEqualTo(
                CustomerLimitedDetails.builder()
                    .customerId("customer_id")
                    .email("email")
                    .name("name")
                    .build()
            )
        assertThat(getDispute.disputeId()).isEqualTo("dispute_id")
        assertThat(getDispute.disputeStage()).isEqualTo(DisputeStage.PRE_DISPUTE)
        assertThat(getDispute.disputeStatus()).isEqualTo(DisputeStatus.DISPUTE_OPENED)
        assertThat(getDispute.paymentId()).isEqualTo("payment_id")
        assertThat(getDispute.reason()).isEqualTo("reason")
        assertThat(getDispute.remarks()).isEqualTo("remarks")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val getDispute =
            GetDispute.builder()
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

        val roundtrippedGetDispute =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(getDispute),
                jacksonTypeRef<GetDispute>(),
            )

        assertThat(roundtrippedGetDispute).isEqualTo(getDispute)
    }
}
