// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.productcollections

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductCollectionUpdateImagesResponseTest {

    @Test
    fun create() {
        val productCollectionUpdateImagesResponse =
            ProductCollectionUpdateImagesResponse.builder()
                .url("url")
                .imageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(productCollectionUpdateImagesResponse.url()).isEqualTo("url")
        assertThat(productCollectionUpdateImagesResponse.imageId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val productCollectionUpdateImagesResponse =
            ProductCollectionUpdateImagesResponse.builder()
                .url("url")
                .imageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedProductCollectionUpdateImagesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(productCollectionUpdateImagesResponse),
                jacksonTypeRef<ProductCollectionUpdateImagesResponse>(),
            )

        assertThat(roundtrippedProductCollectionUpdateImagesResponse)
            .isEqualTo(productCollectionUpdateImagesResponse)
    }
}
