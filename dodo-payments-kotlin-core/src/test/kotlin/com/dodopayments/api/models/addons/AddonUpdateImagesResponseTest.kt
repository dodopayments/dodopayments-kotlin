// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.addons

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddonUpdateImagesResponseTest {

    @Test
    fun create() {
        val addonUpdateImagesResponse =
            AddonUpdateImagesResponse.builder()
                .imageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .url("url")
                .build()

        assertThat(addonUpdateImagesResponse.imageId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(addonUpdateImagesResponse.url()).isEqualTo("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val addonUpdateImagesResponse =
            AddonUpdateImagesResponse.builder()
                .imageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .url("url")
                .build()

        val roundtrippedAddonUpdateImagesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(addonUpdateImagesResponse),
                jacksonTypeRef<AddonUpdateImagesResponse>(),
            )

        assertThat(roundtrippedAddonUpdateImagesResponse).isEqualTo(addonUpdateImagesResponse)
    }
}
