// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductUpdateFilesResponseTest {

    @Test
    fun create() {
        val productUpdateFilesResponse =
            ProductUpdateFilesResponse.builder()
                .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .url("url")
                .build()

        assertThat(productUpdateFilesResponse.fileId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(productUpdateFilesResponse.url()).isEqualTo("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val productUpdateFilesResponse =
            ProductUpdateFilesResponse.builder()
                .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .url("url")
                .build()

        val roundtrippedProductUpdateFilesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(productUpdateFilesResponse),
                jacksonTypeRef<ProductUpdateFilesResponse>(),
            )

        assertThat(roundtrippedProductUpdateFilesResponse).isEqualTo(productUpdateFilesResponse)
    }
}
