// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products.shortlinks

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ShortLinkCreateResponseTest {

    @Test
    fun create() {
        val shortLinkCreateResponse =
            ShortLinkCreateResponse.builder().fullUrl("full_url").shortUrl("short_url").build()

        assertThat(shortLinkCreateResponse.fullUrl()).isEqualTo("full_url")
        assertThat(shortLinkCreateResponse.shortUrl()).isEqualTo("short_url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val shortLinkCreateResponse =
            ShortLinkCreateResponse.builder().fullUrl("full_url").shortUrl("short_url").build()

        val roundtrippedShortLinkCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(shortLinkCreateResponse),
                jacksonTypeRef<ShortLinkCreateResponse>(),
            )

        assertThat(roundtrippedShortLinkCreateResponse).isEqualTo(shortLinkCreateResponse)
    }
}
