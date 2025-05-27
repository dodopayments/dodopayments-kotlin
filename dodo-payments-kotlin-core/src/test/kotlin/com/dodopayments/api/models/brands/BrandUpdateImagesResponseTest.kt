// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.brands

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandUpdateImagesResponseTest {

    @Test
    fun create() {
        val brandUpdateImagesResponse =
            BrandUpdateImagesResponse.builder()
                .imageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .url("url")
                .build()

        assertThat(brandUpdateImagesResponse.imageId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(brandUpdateImagesResponse.url()).isEqualTo("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandUpdateImagesResponse =
            BrandUpdateImagesResponse.builder()
                .imageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .url("url")
                .build()

        val roundtrippedBrandUpdateImagesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandUpdateImagesResponse),
                jacksonTypeRef<BrandUpdateImagesResponse>(),
            )

        assertThat(roundtrippedBrandUpdateImagesResponse).isEqualTo(brandUpdateImagesResponse)
    }
}
