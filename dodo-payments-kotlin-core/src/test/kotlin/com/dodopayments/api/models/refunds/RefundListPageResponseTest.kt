// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.refunds

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Currency
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RefundListPageResponseTest {

    @Test
    fun create() {
        val refundListPageResponse =
            RefundListPageResponse.builder()
                .addItem(
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
                )
                .build()

        assertThat(refundListPageResponse.items())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val refundListPageResponse =
            RefundListPageResponse.builder()
                .addItem(
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
                )
                .build()

        val roundtrippedRefundListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(refundListPageResponse),
                jacksonTypeRef<RefundListPageResponse>(),
            )

        assertThat(roundtrippedRefundListPageResponse).isEqualTo(refundListPageResponse)
    }
}
