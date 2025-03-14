// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.refunds

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RefundTest {

    @Test
    fun createRefund() {
        val refund =
            Refund.builder()
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .paymentId("payment_id")
                .refundId("refund_id")
                .status(Refund.Status.SUCCEEDED)
                .amount(0L)
                .currency(Refund.Currency.AED)
                .reason("reason")
                .build()
        assertThat(refund).isNotNull
        assertThat(refund.businessId()).isEqualTo("business_id")
        assertThat(refund.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(refund.paymentId()).isEqualTo("payment_id")
        assertThat(refund.refundId()).isEqualTo("refund_id")
        assertThat(refund.status()).isEqualTo(Refund.Status.SUCCEEDED)
        assertThat(refund.amount()).isEqualTo(0L)
        assertThat(refund.currency()).isEqualTo(Refund.Currency.AED)
        assertThat(refund.reason()).isEqualTo("reason")
    }
}
