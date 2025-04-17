// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OneTimeProductCartItemTest {

    @Test
    fun createOneTimeProductCartItem() {
        val oneTimeProductCartItem =
            OneTimeProductCartItem.builder().productId("product_id").quantity(0L).amount(0L).build()
        assertThat(oneTimeProductCartItem).isNotNull
        assertThat(oneTimeProductCartItem.productId()).isEqualTo("product_id")
        assertThat(oneTimeProductCartItem.quantity()).isEqualTo(0L)
        assertThat(oneTimeProductCartItem.amount()).isEqualTo(0L)
    }
}
