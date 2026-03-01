// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.refunds.RefundStatus
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RefundListItemTest {

    @Test
    fun create() {
        val refundListItem =
            RefundListItem.builder()
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

        assertThat(refundListItem.businessId()).isEqualTo("business_id")
        assertThat(refundListItem.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(refundListItem.isPartial()).isEqualTo(true)
        assertThat(refundListItem.paymentId()).isEqualTo("payment_id")
        assertThat(refundListItem.refundId()).isEqualTo("refund_id")
        assertThat(refundListItem.status()).isEqualTo(RefundStatus.SUCCEEDED)
        assertThat(refundListItem.amount()).isEqualTo(0)
        assertThat(refundListItem.currency()).isEqualTo(Currency.AED)
        assertThat(refundListItem.reason()).isEqualTo("reason")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val refundListItem =
            RefundListItem.builder()
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

        val roundtrippedRefundListItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(refundListItem),
                jacksonTypeRef<RefundListItem>(),
            )

        assertThat(roundtrippedRefundListItem).isEqualTo(refundListItem)
    }
}
