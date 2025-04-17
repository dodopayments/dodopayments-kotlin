// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentCreateResponseTest {

    @Test
    fun createPaymentCreateResponse() {
        val paymentCreateResponse =
            PaymentCreateResponse.builder()
                .clientSecret("client_secret")
                .customer(
                    CustomerLimitedDetails.builder()
                        .customerId("customer_id")
                        .email("email")
                        .name("name")
                        .build()
                )
                .metadata(
                    PaymentCreateResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .paymentId("payment_id")
                .totalAmount(0L)
                .discountId("discount_id")
                .paymentLink("payment_link")
                .addProductCart(
                    OneTimeProductCartItem.builder()
                        .productId("product_id")
                        .quantity(0L)
                        .amount(0L)
                        .build()
                )
                .build()
        assertThat(paymentCreateResponse).isNotNull
        assertThat(paymentCreateResponse.clientSecret()).isEqualTo("client_secret")
        assertThat(paymentCreateResponse.customer())
            .isEqualTo(
                CustomerLimitedDetails.builder()
                    .customerId("customer_id")
                    .email("email")
                    .name("name")
                    .build()
            )
        assertThat(paymentCreateResponse.metadata())
            .isEqualTo(
                PaymentCreateResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(paymentCreateResponse.paymentId()).isEqualTo("payment_id")
        assertThat(paymentCreateResponse.totalAmount()).isEqualTo(0L)
        assertThat(paymentCreateResponse.discountId()).isEqualTo("discount_id")
        assertThat(paymentCreateResponse.paymentLink()).isEqualTo("payment_link")
        assertThat(paymentCreateResponse.productCart())
            .containsExactly(
                OneTimeProductCartItem.builder()
                    .productId("product_id")
                    .quantity(0L)
                    .amount(0L)
                    .build()
            )
    }
}
