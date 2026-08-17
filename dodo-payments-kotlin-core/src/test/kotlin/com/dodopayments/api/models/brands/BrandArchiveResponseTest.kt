// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.brands

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandArchiveResponseTest {

    @Test
    fun create() {
        val brandArchiveResponse =
            BrandArchiveResponse.builder()
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .brandId("brand_id")
                .collectionsMoved(0L)
                .productsMoved(0L)
                .subscriptionsMoved(0L)
                .movedToBrandId("moved_to_brand_id")
                .build()

        assertThat(brandArchiveResponse.archivedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(brandArchiveResponse.brandId()).isEqualTo("brand_id")
        assertThat(brandArchiveResponse.collectionsMoved()).isEqualTo(0L)
        assertThat(brandArchiveResponse.productsMoved()).isEqualTo(0L)
        assertThat(brandArchiveResponse.subscriptionsMoved()).isEqualTo(0L)
        assertThat(brandArchiveResponse.movedToBrandId()).isEqualTo("moved_to_brand_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandArchiveResponse =
            BrandArchiveResponse.builder()
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .brandId("brand_id")
                .collectionsMoved(0L)
                .productsMoved(0L)
                .subscriptionsMoved(0L)
                .movedToBrandId("moved_to_brand_id")
                .build()

        val roundtrippedBrandArchiveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandArchiveResponse),
                jacksonTypeRef<BrandArchiveResponse>(),
            )

        assertThat(roundtrippedBrandArchiveResponse).isEqualTo(brandArchiveResponse)
    }
}
