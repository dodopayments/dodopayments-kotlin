// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentListResponseTest {

    @Test
    fun createPaymentListResponse() {
        val paymentListResponse =
            PaymentListResponse.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(PaymentListResponse.Currency.AED)
                .customer(
                    CustomerLimitedDetails.builder()
                        .customerId("customer_id")
                        .email("email")
                        .name("name")
                        .build()
                )
                .metadata(
                    PaymentListResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .paymentId("payment_id")
                .totalAmount(0L)
                .paymentMethod("payment_method")
                .paymentMethodType("payment_method_type")
                .status(IntentStatus.SUCCEEDED)
                .subscriptionId("subscription_id")
                .build()
        assertThat(paymentListResponse).isNotNull
        assertThat(paymentListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentListResponse.currency()).isEqualTo(PaymentListResponse.Currency.AED)
        assertThat(paymentListResponse.customer())
            .isEqualTo(
                CustomerLimitedDetails.builder()
                    .customerId("customer_id")
                    .email("email")
                    .name("name")
                    .build()
            )
        assertThat(paymentListResponse.metadata())
            .isEqualTo(
                PaymentListResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(paymentListResponse.paymentId()).isEqualTo("payment_id")
        assertThat(paymentListResponse.totalAmount()).isEqualTo(0L)
        assertThat(paymentListResponse.paymentMethod()).isEqualTo("payment_method")
        assertThat(paymentListResponse.paymentMethodType()).isEqualTo("payment_method_type")
        assertThat(paymentListResponse.status()).isEqualTo(IntentStatus.SUCCEEDED)
        assertThat(paymentListResponse.subscriptionId()).isEqualTo("subscription_id")
    }
}
