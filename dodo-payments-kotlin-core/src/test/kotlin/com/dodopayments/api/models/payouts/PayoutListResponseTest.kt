// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payouts

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Currency
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PayoutListResponseTest {

    @Test
    fun create() {
        val payoutListResponse =
            PayoutListResponse.builder()
                .amount(0L)
                .businessId("business_id")
                .chargebacks(0L)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.AED)
                .fee(0L)
                .paymentMethod("payment_method")
                .payoutId("payout_id")
                .refunds(0L)
                .status(PayoutListResponse.Status.NOT_INITIATED)
                .tax(0L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .payoutDocumentUrl("payout_document_url")
                .remarks("remarks")
                .build()

        assertThat(payoutListResponse.amount()).isEqualTo(0L)
        assertThat(payoutListResponse.businessId()).isEqualTo("business_id")
        assertThat(payoutListResponse.chargebacks()).isEqualTo(0L)
        assertThat(payoutListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(payoutListResponse.currency()).isEqualTo(Currency.AED)
        assertThat(payoutListResponse.fee()).isEqualTo(0L)
        assertThat(payoutListResponse.paymentMethod()).isEqualTo("payment_method")
        assertThat(payoutListResponse.payoutId()).isEqualTo("payout_id")
        assertThat(payoutListResponse.refunds()).isEqualTo(0L)
        assertThat(payoutListResponse.status()).isEqualTo(PayoutListResponse.Status.NOT_INITIATED)
        assertThat(payoutListResponse.tax()).isEqualTo(0L)
        assertThat(payoutListResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(payoutListResponse.name()).isEqualTo("name")
        assertThat(payoutListResponse.payoutDocumentUrl()).isEqualTo("payout_document_url")
        assertThat(payoutListResponse.remarks()).isEqualTo("remarks")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val payoutListResponse =
            PayoutListResponse.builder()
                .amount(0L)
                .businessId("business_id")
                .chargebacks(0L)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.AED)
                .fee(0L)
                .paymentMethod("payment_method")
                .payoutId("payout_id")
                .refunds(0L)
                .status(PayoutListResponse.Status.NOT_INITIATED)
                .tax(0L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .payoutDocumentUrl("payout_document_url")
                .remarks("remarks")
                .build()

        val roundtrippedPayoutListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(payoutListResponse),
                jacksonTypeRef<PayoutListResponse>(),
            )

        assertThat(roundtrippedPayoutListResponse).isEqualTo(payoutListResponse)
    }
}
