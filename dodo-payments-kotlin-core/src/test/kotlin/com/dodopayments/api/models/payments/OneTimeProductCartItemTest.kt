// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OneTimeProductCartItemTest {

    @Test
    fun create() {
        val oneTimeProductCartItem =
            OneTimeProductCartItem.builder().productId("product_id").quantity(0).build()

        assertThat(oneTimeProductCartItem.productId()).isEqualTo("product_id")
        assertThat(oneTimeProductCartItem.quantity()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val oneTimeProductCartItem =
            OneTimeProductCartItem.builder().productId("product_id").quantity(0).build()

        val roundtrippedOneTimeProductCartItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(oneTimeProductCartItem),
                jacksonTypeRef<OneTimeProductCartItem>(),
            )

        assertThat(roundtrippedOneTimeProductCartItem).isEqualTo(oneTimeProductCartItem)
    }
}
