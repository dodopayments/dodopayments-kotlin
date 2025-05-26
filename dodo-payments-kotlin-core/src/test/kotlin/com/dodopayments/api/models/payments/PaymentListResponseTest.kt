// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Currency
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentListResponseTest {

    @Test
    fun create() {
        val paymentListResponse =
            PaymentListResponse.builder()
                .brandId("brand_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.AED)
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
                .totalAmount(0)
                .paymentMethod("payment_method")
                .paymentMethodType("payment_method_type")
                .status(IntentStatus.SUCCEEDED)
                .subscriptionId("subscription_id")
                .build()

        assertThat(paymentListResponse.brandId()).isEqualTo("brand_id")
        assertThat(paymentListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentListResponse.currency()).isEqualTo(Currency.AED)
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
        assertThat(paymentListResponse.totalAmount()).isEqualTo(0)
        assertThat(paymentListResponse.paymentMethod()).isEqualTo("payment_method")
        assertThat(paymentListResponse.paymentMethodType()).isEqualTo("payment_method_type")
        assertThat(paymentListResponse.status()).isEqualTo(IntentStatus.SUCCEEDED)
        assertThat(paymentListResponse.subscriptionId()).isEqualTo("subscription_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paymentListResponse =
            PaymentListResponse.builder()
                .brandId("brand_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.AED)
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
                .totalAmount(0)
                .paymentMethod("payment_method")
                .paymentMethodType("payment_method_type")
                .status(IntentStatus.SUCCEEDED)
                .subscriptionId("subscription_id")
                .build()

        val roundtrippedPaymentListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paymentListResponse),
                jacksonTypeRef<PaymentListResponse>(),
            )

        assertThat(roundtrippedPaymentListResponse).isEqualTo(paymentListResponse)
    }
}
