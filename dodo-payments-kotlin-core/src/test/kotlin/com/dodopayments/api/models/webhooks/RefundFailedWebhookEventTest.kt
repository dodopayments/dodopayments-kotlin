// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.payments.CustomerLimitedDetails
import com.dodopayments.api.models.refunds.RefundStatus
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RefundFailedWebhookEventTest {

    @Test
    fun create() {
        val refundFailedWebhookEvent =
            RefundFailedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    RefundFailedWebhookEvent.Data.builder()
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customer(
                            CustomerLimitedDetails.builder()
                                .customerId("customer_id")
                                .email("email")
                                .name("name")
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .isPartial(true)
                        .paymentId("payment_id")
                        .refundId("refund_id")
                        .status(RefundStatus.SUCCEEDED)
                        .amount(0)
                        .currency(Currency.AED)
                        .reason("reason")
                        .payloadType(RefundFailedWebhookEvent.Data.PayloadType.REFUND)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(RefundFailedWebhookEvent.Type.REFUND_FAILED)
                .build()

        assertThat(refundFailedWebhookEvent.businessId()).isEqualTo("business_id")
        assertThat(refundFailedWebhookEvent.data())
            .isEqualTo(
                RefundFailedWebhookEvent.Data.builder()
                    .businessId("business_id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customer(
                        CustomerLimitedDetails.builder()
                            .customerId("customer_id")
                            .email("email")
                            .name("name")
                            .phoneNumber("phone_number")
                            .build()
                    )
                    .isPartial(true)
                    .paymentId("payment_id")
                    .refundId("refund_id")
                    .status(RefundStatus.SUCCEEDED)
                    .amount(0)
                    .currency(Currency.AED)
                    .reason("reason")
                    .payloadType(RefundFailedWebhookEvent.Data.PayloadType.REFUND)
                    .build()
            )
        assertThat(refundFailedWebhookEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(refundFailedWebhookEvent.type())
            .isEqualTo(RefundFailedWebhookEvent.Type.REFUND_FAILED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val refundFailedWebhookEvent =
            RefundFailedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    RefundFailedWebhookEvent.Data.builder()
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customer(
                            CustomerLimitedDetails.builder()
                                .customerId("customer_id")
                                .email("email")
                                .name("name")
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .isPartial(true)
                        .paymentId("payment_id")
                        .refundId("refund_id")
                        .status(RefundStatus.SUCCEEDED)
                        .amount(0)
                        .currency(Currency.AED)
                        .reason("reason")
                        .payloadType(RefundFailedWebhookEvent.Data.PayloadType.REFUND)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(RefundFailedWebhookEvent.Type.REFUND_FAILED)
                .build()

        val roundtrippedRefundFailedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(refundFailedWebhookEvent),
                jacksonTypeRef<RefundFailedWebhookEvent>(),
            )

        assertThat(roundtrippedRefundFailedWebhookEvent).isEqualTo(refundFailedWebhookEvent)
    }
}
