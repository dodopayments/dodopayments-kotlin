// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Currency
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PayoutCreatedWebhookEventTest {

    @Test
    fun create() {
        val payoutCreatedWebhookEvent =
            PayoutCreatedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    PayoutCreatedWebhookEvent.Data.builder()
                        .amount(0L)
                        .businessId("business_id")
                        .chargebacks(0L)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .fee(0L)
                        .paymentMethod("payment_method")
                        .payoutId("payout_id")
                        .refunds(0L)
                        .status(PayoutCreatedWebhookEvent.Data.Status.NOT_INITIATED)
                        .tax(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .payoutDocumentUrl("payout_document_url")
                        .remarks("remarks")
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(payoutCreatedWebhookEvent.businessId()).isEqualTo("business_id")
        assertThat(payoutCreatedWebhookEvent.data())
            .isEqualTo(
                PayoutCreatedWebhookEvent.Data.builder()
                    .amount(0L)
                    .businessId("business_id")
                    .chargebacks(0L)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency(Currency.AED)
                    .fee(0L)
                    .paymentMethod("payment_method")
                    .payoutId("payout_id")
                    .refunds(0L)
                    .status(PayoutCreatedWebhookEvent.Data.Status.NOT_INITIATED)
                    .tax(0L)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .payoutDocumentUrl("payout_document_url")
                    .remarks("remarks")
                    .build()
            )
        assertThat(payoutCreatedWebhookEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val payoutCreatedWebhookEvent =
            PayoutCreatedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    PayoutCreatedWebhookEvent.Data.builder()
                        .amount(0L)
                        .businessId("business_id")
                        .chargebacks(0L)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .fee(0L)
                        .paymentMethod("payment_method")
                        .payoutId("payout_id")
                        .refunds(0L)
                        .status(PayoutCreatedWebhookEvent.Data.Status.NOT_INITIATED)
                        .tax(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .payoutDocumentUrl("payout_document_url")
                        .remarks("remarks")
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedPayoutCreatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(payoutCreatedWebhookEvent),
                jacksonTypeRef<PayoutCreatedWebhookEvent>(),
            )

        assertThat(roundtrippedPayoutCreatedWebhookEvent).isEqualTo(payoutCreatedWebhookEvent)
    }
}
