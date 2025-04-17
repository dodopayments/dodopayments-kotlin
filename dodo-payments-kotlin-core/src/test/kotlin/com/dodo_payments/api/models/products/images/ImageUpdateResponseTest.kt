// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.products.images

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ImageUpdateResponseTest {

    @Test
    fun createImageUpdateResponse() {
        val imageUpdateResponse =
            ImageUpdateResponse.builder()
                .url("url")
                .imageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(imageUpdateResponse).isNotNull
        assertThat(imageUpdateResponse.url()).isEqualTo("url")
        assertThat(imageUpdateResponse.imageId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
