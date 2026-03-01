// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentCreateResponseTest {

    @Test
    fun create() {
        val paymentCreateResponse =
            PaymentCreateResponse.builder()
                .clientSecret("client_secret")
                .customer(
                    CustomerLimitedDetails.builder()
                        .customerId("customer_id")
                        .email("email")
                        .name("name")
                        .metadata(
                            CustomerLimitedDetails.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .phoneNumber("phone_number")
                        .build()
                )
                .metadata(
                    PaymentCreateResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .paymentId("payment_id")
                .totalAmount(0)
                .discountId("discount_id")
                .expiresOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .paymentLink("payment_link")
                .addProductCart(
                    PaymentCreateResponse.ProductCart.builder()
                        .productId("product_id")
                        .quantity(0)
                        .amount(0)
                        .build()
                )
                .build()

        assertThat(paymentCreateResponse.clientSecret()).isEqualTo("client_secret")
        assertThat(paymentCreateResponse.customer())
            .isEqualTo(
                CustomerLimitedDetails.builder()
                    .customerId("customer_id")
                    .email("email")
                    .name("name")
                    .metadata(
                        CustomerLimitedDetails.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .phoneNumber("phone_number")
                    .build()
            )
        assertThat(paymentCreateResponse.metadata())
            .isEqualTo(
                PaymentCreateResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(paymentCreateResponse.paymentId()).isEqualTo("payment_id")
        assertThat(paymentCreateResponse.totalAmount()).isEqualTo(0)
        assertThat(paymentCreateResponse.discountId()).isEqualTo("discount_id")
        assertThat(paymentCreateResponse.expiresOn())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentCreateResponse.paymentLink()).isEqualTo("payment_link")
        assertThat(paymentCreateResponse.productCart())
            .containsExactly(
                PaymentCreateResponse.ProductCart.builder()
                    .productId("product_id")
                    .quantity(0)
                    .amount(0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paymentCreateResponse =
            PaymentCreateResponse.builder()
                .clientSecret("client_secret")
                .customer(
                    CustomerLimitedDetails.builder()
                        .customerId("customer_id")
                        .email("email")
                        .name("name")
                        .metadata(
                            CustomerLimitedDetails.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .phoneNumber("phone_number")
                        .build()
                )
                .metadata(
                    PaymentCreateResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .paymentId("payment_id")
                .totalAmount(0)
                .discountId("discount_id")
                .expiresOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .paymentLink("payment_link")
                .addProductCart(
                    PaymentCreateResponse.ProductCart.builder()
                        .productId("product_id")
                        .quantity(0)
                        .amount(0)
                        .build()
                )
                .build()

        val roundtrippedPaymentCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paymentCreateResponse),
                jacksonTypeRef<PaymentCreateResponse>(),
            )

        assertThat(roundtrippedPaymentCreateResponse).isEqualTo(paymentCreateResponse)
    }
}
