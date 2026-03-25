// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.productcollections

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductCollectionListPageResponseTest {

    @Test
    fun create() {
        val productCollectionListPageResponse =
            ProductCollectionListPageResponse.builder()
                .addItem(
                    ProductCollectionListResponse.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .productsCount(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .image("image")
                        .build()
                )
                .build()

        assertThat(productCollectionListPageResponse.items())
            .containsExactly(
                ProductCollectionListResponse.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .productsCount(0L)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .image("image")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val productCollectionListPageResponse =
            ProductCollectionListPageResponse.builder()
                .addItem(
                    ProductCollectionListResponse.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .productsCount(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .image("image")
                        .build()
                )
                .build()

        val roundtrippedProductCollectionListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(productCollectionListPageResponse),
                jacksonTypeRef<ProductCollectionListPageResponse>(),
            )

        assertThat(roundtrippedProductCollectionListPageResponse)
            .isEqualTo(productCollectionListPageResponse)
    }
}
