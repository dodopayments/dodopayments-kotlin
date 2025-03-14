// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.payouts

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PayoutListResponseTest {

    @Test
    fun createPayoutListResponse() {
        val payoutListResponse =
            PayoutListResponse.builder()
                .amount(0L)
                .businessId("business_id")
                .chargebacks(0L)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(PayoutListResponse.Currency.AED)
                .fee(0L)
                .paymentMethod("payment_method")
                .payoutId("payout_id")
                .refunds(0L)
                .status(PayoutListResponse.Status.IN_PROGRESS)
                .tax(0L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .payoutDocumentUrl("payout_document_url")
                .remarks("remarks")
                .build()
        assertThat(payoutListResponse).isNotNull
        assertThat(payoutListResponse.amount()).isEqualTo(0L)
        assertThat(payoutListResponse.businessId()).isEqualTo("business_id")
        assertThat(payoutListResponse.chargebacks()).isEqualTo(0L)
        assertThat(payoutListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(payoutListResponse.currency()).isEqualTo(PayoutListResponse.Currency.AED)
        assertThat(payoutListResponse.fee()).isEqualTo(0L)
        assertThat(payoutListResponse.paymentMethod()).isEqualTo("payment_method")
        assertThat(payoutListResponse.payoutId()).isEqualTo("payout_id")
        assertThat(payoutListResponse.refunds()).isEqualTo(0L)
        assertThat(payoutListResponse.status()).isEqualTo(PayoutListResponse.Status.IN_PROGRESS)
        assertThat(payoutListResponse.tax()).isEqualTo(0L)
        assertThat(payoutListResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(payoutListResponse.name()).isEqualTo("name")
        assertThat(payoutListResponse.payoutDocumentUrl()).isEqualTo("payout_document_url")
        assertThat(payoutListResponse.remarks()).isEqualTo("remarks")
    }
}
