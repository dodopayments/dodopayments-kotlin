// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products.shortlinks

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ShortLinkListResponseTest {

    @Test
    fun create() {
        val shortLinkListResponse =
            ShortLinkListResponse.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .fullUrl("full_url")
                .productId("product_id")
                .shortUrl("short_url")
                .build()

        assertThat(shortLinkListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(shortLinkListResponse.fullUrl()).isEqualTo("full_url")
        assertThat(shortLinkListResponse.productId()).isEqualTo("product_id")
        assertThat(shortLinkListResponse.shortUrl()).isEqualTo("short_url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val shortLinkListResponse =
            ShortLinkListResponse.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .fullUrl("full_url")
                .productId("product_id")
                .shortUrl("short_url")
                .build()

        val roundtrippedShortLinkListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(shortLinkListResponse),
                jacksonTypeRef<ShortLinkListResponse>(),
            )

        assertThat(roundtrippedShortLinkListResponse).isEqualTo(shortLinkListResponse)
    }
}
