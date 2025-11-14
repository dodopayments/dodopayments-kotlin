// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Currency
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentListPageResponseTest {

    @Test
    fun create() {
        val paymentListPageResponse =
            PaymentListPageResponse.builder()
                .addItem(
                    PaymentListResponse.builder()
                        .brandId("brand_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
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
                        .digitalProductsDelivered(true)
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
                )
                .build()

        assertThat(paymentListPageResponse.items())
            .containsExactly(
                PaymentListResponse.builder()
                    .brandId("brand_id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency(Currency.AED)
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
                    .digitalProductsDelivered(true)
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paymentListPageResponse =
            PaymentListPageResponse.builder()
                .addItem(
                    PaymentListResponse.builder()
                        .brandId("brand_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
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
                        .digitalProductsDelivered(true)
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
                )
                .build()

        val roundtrippedPaymentListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paymentListPageResponse),
                jacksonTypeRef<PaymentListPageResponse>(),
            )

        assertThat(roundtrippedPaymentListPageResponse).isEqualTo(paymentListPageResponse)
    }
}
