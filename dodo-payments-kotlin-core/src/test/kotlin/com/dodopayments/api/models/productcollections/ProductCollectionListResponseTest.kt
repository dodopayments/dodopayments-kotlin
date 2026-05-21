// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.productcollections

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductCollectionListResponseTest {

    @Test
    fun create() {
        val productCollectionListResponse =
            ProductCollectionListResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .productsCount(0L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .image("image")
                .build()

        assertThat(productCollectionListResponse.id()).isEqualTo("id")
        assertThat(productCollectionListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(productCollectionListResponse.name()).isEqualTo("name")
        assertThat(productCollectionListResponse.productsCount()).isEqualTo(0L)
        assertThat(productCollectionListResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(productCollectionListResponse.description()).isEqualTo("description")
        assertThat(productCollectionListResponse.image()).isEqualTo("image")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val productCollectionListResponse =
            ProductCollectionListResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .productsCount(0L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .image("image")
                .build()

        val roundtrippedProductCollectionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(productCollectionListResponse),
                jacksonTypeRef<ProductCollectionListResponse>(),
            )

        assertThat(roundtrippedProductCollectionListResponse)
            .isEqualTo(productCollectionListResponse)
    }
}
