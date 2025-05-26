// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.refunds

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RefundCreateParamsTest {

    @Test
    fun create() {
        RefundCreateParams.builder()
            .paymentId("payment_id")
            .addItem(
                RefundCreateParams.Item.builder()
                    .itemId("item_id")
                    .amount(0)
                    .taxInclusive(true)
                    .build()
            )
            .reason("reason")
            .build()
    }

    @Test
    fun body() {
        val params =
            RefundCreateParams.builder()
                .paymentId("payment_id")
                .addItem(
                    RefundCreateParams.Item.builder()
                        .itemId("item_id")
                        .amount(0)
                        .taxInclusive(true)
                        .build()
                )
                .reason("reason")
                .build()

        val body = params._body()

        assertThat(body.paymentId()).isEqualTo("payment_id")
        assertThat(body.items())
            .containsExactly(
                RefundCreateParams.Item.builder()
                    .itemId("item_id")
                    .amount(0)
                    .taxInclusive(true)
                    .build()
            )
        assertThat(body.reason()).isEqualTo("reason")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = RefundCreateParams.builder().paymentId("payment_id").build()

        val body = params._body()

        assertThat(body.paymentId()).isEqualTo("payment_id")
    }
}
