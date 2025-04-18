// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payouts

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PayoutListPageResponseTest {

    @Test
    fun create() {
        val payoutListPageResponse =
            PayoutListPageResponse.builder()
                .addItem(
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
                        .status(PayoutListResponse.Status.NOT_INITIATED)
                        .tax(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .payoutDocumentUrl("payout_document_url")
                        .remarks("remarks")
                        .build()
                )
                .build()

        assertThat(payoutListPageResponse.items())
            .containsExactly(
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
                    .status(PayoutListResponse.Status.NOT_INITIATED)
                    .tax(0L)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .payoutDocumentUrl("payout_document_url")
                    .remarks("remarks")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val payoutListPageResponse =
            PayoutListPageResponse.builder()
                .addItem(
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
                        .status(PayoutListResponse.Status.NOT_INITIATED)
                        .tax(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .payoutDocumentUrl("payout_document_url")
                        .remarks("remarks")
                        .build()
                )
                .build()

        val roundtrippedPayoutListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(payoutListPageResponse),
                jacksonTypeRef<PayoutListPageResponse>(),
            )

        assertThat(roundtrippedPayoutListPageResponse).isEqualTo(payoutListPageResponse)
    }
}
