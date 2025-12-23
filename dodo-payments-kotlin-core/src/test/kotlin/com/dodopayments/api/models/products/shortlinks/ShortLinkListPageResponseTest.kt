// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products.shortlinks

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ShortLinkListPageResponseTest {

    @Test
    fun create() {
        val shortLinkListPageResponse =
            ShortLinkListPageResponse.builder()
                .addItem(
                    ShortLinkListResponse.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .fullUrl("full_url")
                        .productId("product_id")
                        .shortUrl("short_url")
                        .build()
                )
                .build()

        assertThat(shortLinkListPageResponse.items())
            .containsExactly(
                ShortLinkListResponse.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .fullUrl("full_url")
                    .productId("product_id")
                    .shortUrl("short_url")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val shortLinkListPageResponse =
            ShortLinkListPageResponse.builder()
                .addItem(
                    ShortLinkListResponse.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .fullUrl("full_url")
                        .productId("product_id")
                        .shortUrl("short_url")
                        .build()
                )
                .build()

        val roundtrippedShortLinkListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(shortLinkListPageResponse),
                jacksonTypeRef<ShortLinkListPageResponse>(),
            )

        assertThat(roundtrippedShortLinkListPageResponse).isEqualTo(shortLinkListPageResponse)
    }
}
