// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.refunds

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Currency
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RefundTest {

    @Test
    fun create() {
        val refund =
            Refund.builder()
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

        assertThat(refund.businessId()).isEqualTo("business_id")
        assertThat(refund.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(refund.isPartial()).isEqualTo(true)
        assertThat(refund.paymentId()).isEqualTo("payment_id")
        assertThat(refund.refundId()).isEqualTo("refund_id")
        assertThat(refund.status()).isEqualTo(RefundStatus.SUCCEEDED)
        assertThat(refund.amount()).isEqualTo(0)
        assertThat(refund.currency()).isEqualTo(Currency.AED)
        assertThat(refund.reason()).isEqualTo("reason")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val refund =
            Refund.builder()
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

        val roundtrippedRefund =
            jsonMapper.readValue(jsonMapper.writeValueAsString(refund), jacksonTypeRef<Refund>())

        assertThat(roundtrippedRefund).isEqualTo(refund)
    }
}
