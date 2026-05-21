// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.productcollections.groups

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductCollectionGroupDetailsTest {

    @Test
    fun create() {
        val productCollectionGroupDetails =
            ProductCollectionGroupDetails.builder()
                .addProduct(GroupProduct.builder().productId("product_id").status(true).build())
                .groupName("group_name")
                .status(true)
                .build()

        assertThat(productCollectionGroupDetails.products())
            .containsExactly(GroupProduct.builder().productId("product_id").status(true).build())
        assertThat(productCollectionGroupDetails.groupName()).isEqualTo("group_name")
        assertThat(productCollectionGroupDetails.status()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val productCollectionGroupDetails =
            ProductCollectionGroupDetails.builder()
                .addProduct(GroupProduct.builder().productId("product_id").status(true).build())
                .groupName("group_name")
                .status(true)
                .build()

        val roundtrippedProductCollectionGroupDetails =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(productCollectionGroupDetails),
                jacksonTypeRef<ProductCollectionGroupDetails>(),
            )

        assertThat(roundtrippedProductCollectionGroupDetails)
            .isEqualTo(productCollectionGroupDetails)
    }
}
