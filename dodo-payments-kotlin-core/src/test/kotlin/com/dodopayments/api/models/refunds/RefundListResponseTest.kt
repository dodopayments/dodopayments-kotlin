// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.refunds

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Currency
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RefundListResponseTest {

    @Test
    fun create() {
        val refundListResponse =
            RefundListResponse.builder()
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .isPartial(true)
                .paymentId("payment_id")
                .refundId("refund_id")
                .status(RefundStatus.SUCCEEDED)
                .amount(0)
                .currency(Currency.AED)
                .reason("reason")
                .build()

        assertThat(refundListResponse.businessId()).isEqualTo("business_id")
        assertThat(refundListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(refundListResponse.isPartial()).isEqualTo(true)
        assertThat(refundListResponse.paymentId()).isEqualTo("payment_id")
        assertThat(refundListResponse.refundId()).isEqualTo("refund_id")
        assertThat(refundListResponse.status()).isEqualTo(RefundStatus.SUCCEEDED)
        assertThat(refundListResponse.amount()).isEqualTo(0)
        assertThat(refundListResponse.currency()).isEqualTo(Currency.AED)
        assertThat(refundListResponse.reason()).isEqualTo("reason")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val refundListResponse =
            RefundListResponse.builder()
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .isPartial(true)
                .paymentId("payment_id")
                .refundId("refund_id")
                .status(RefundStatus.SUCCEEDED)
                .amount(0)
                .currency(Currency.AED)
                .reason("reason")
                .build()

        val roundtrippedRefundListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(refundListResponse),
                jacksonTypeRef<RefundListResponse>(),
            )

        assertThat(roundtrippedRefundListResponse).isEqualTo(refundListResponse)
    }
}
