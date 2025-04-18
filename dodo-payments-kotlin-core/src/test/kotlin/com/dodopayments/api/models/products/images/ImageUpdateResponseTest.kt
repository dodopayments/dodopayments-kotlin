// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products.images

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ImageUpdateResponseTest {

    @Test
    fun create() {
        val imageUpdateResponse =
            ImageUpdateResponse.builder()
                .url("url")
                .imageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(imageUpdateResponse.url()).isEqualTo("url")
        assertThat(imageUpdateResponse.imageId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val imageUpdateResponse =
            ImageUpdateResponse.builder()
                .url("url")
                .imageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedImageUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(imageUpdateResponse),
                jacksonTypeRef<ImageUpdateResponse>(),
            )

        assertThat(roundtrippedImageUpdateResponse).isEqualTo(imageUpdateResponse)
    }
}
