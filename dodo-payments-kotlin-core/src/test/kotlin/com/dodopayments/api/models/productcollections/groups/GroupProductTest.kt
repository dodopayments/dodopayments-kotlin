// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.productcollections.groups

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupProductTest {

    @Test
    fun create() {
        val groupProduct = GroupProduct.builder().productId("product_id").status(true).build()

        assertThat(groupProduct.productId()).isEqualTo("product_id")
        assertThat(groupProduct.status()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val groupProduct = GroupProduct.builder().productId("product_id").status(true).build()

        val roundtrippedGroupProduct =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(groupProduct),
                jacksonTypeRef<GroupProduct>(),
            )

        assertThat(roundtrippedGroupProduct).isEqualTo(groupProduct)
    }
}
