// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Currency
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentRetrieveLineItemsResponseTest {

    @Test
    fun create() {
        val paymentRetrieveLineItemsResponse =
            PaymentRetrieveLineItemsResponse.builder()
                .currency(Currency.AED)
                .addItem(
                    PaymentRetrieveLineItemsResponse.Item.builder()
                        .amount(0)
                        .itemsId("items_id")
                        .tax(0)
                        .description("description")
                        .name("name")
                        .build()
                )
                .build()

        assertThat(paymentRetrieveLineItemsResponse.currency()).isEqualTo(Currency.AED)
        assertThat(paymentRetrieveLineItemsResponse.items())
            .containsExactly(
                PaymentRetrieveLineItemsResponse.Item.builder()
                    .amount(0)
                    .itemsId("items_id")
                    .tax(0)
                    .description("description")
                    .name("name")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paymentRetrieveLineItemsResponse =
            PaymentRetrieveLineItemsResponse.builder()
                .currency(Currency.AED)
                .addItem(
                    PaymentRetrieveLineItemsResponse.Item.builder()
                        .amount(0)
                        .itemsId("items_id")
                        .tax(0)
                        .description("description")
                        .name("name")
                        .build()
                )
                .build()

        val roundtrippedPaymentRetrieveLineItemsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paymentRetrieveLineItemsResponse),
                jacksonTypeRef<PaymentRetrieveLineItemsResponse>(),
            )

        assertThat(roundtrippedPaymentRetrieveLineItemsResponse)
            .isEqualTo(paymentRetrieveLineItemsResponse)
    }
}
