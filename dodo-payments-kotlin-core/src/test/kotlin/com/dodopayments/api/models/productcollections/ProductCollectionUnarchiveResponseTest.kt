// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.productcollections

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductCollectionUnarchiveResponseTest {

    @Test
    fun create() {
        val productCollectionUnarchiveResponse =
            ProductCollectionUnarchiveResponse.builder()
                .collectionId("collection_id")
                .addExcludedProductId("string")
                .message("message")
                .build()

        assertThat(productCollectionUnarchiveResponse.collectionId()).isEqualTo("collection_id")
        assertThat(productCollectionUnarchiveResponse.excludedProductIds())
            .containsExactly("string")
        assertThat(productCollectionUnarchiveResponse.message()).isEqualTo("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val productCollectionUnarchiveResponse =
            ProductCollectionUnarchiveResponse.builder()
                .collectionId("collection_id")
                .addExcludedProductId("string")
                .message("message")
                .build()

        val roundtrippedProductCollectionUnarchiveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(productCollectionUnarchiveResponse),
                jacksonTypeRef<ProductCollectionUnarchiveResponse>(),
            )

        assertThat(roundtrippedProductCollectionUnarchiveResponse)
            .isEqualTo(productCollectionUnarchiveResponse)
    }
}
