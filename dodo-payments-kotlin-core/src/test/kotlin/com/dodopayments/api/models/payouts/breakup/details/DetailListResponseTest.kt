// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payouts.breakup.details

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DetailListResponseTest {

    @Test
    fun create() {
        val detailListResponse =
            DetailListResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventType("event_type")
                .originalAmount(0L)
                .originalCurrency("original_currency")
                .payoutCurrencyAmount(0L)
                .usdEquivalentAmount(0L)
                .description("description")
                .referenceObjectId("reference_object_id")
                .build()

        assertThat(detailListResponse.id()).isEqualTo("id")
        assertThat(detailListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(detailListResponse.eventType()).isEqualTo("event_type")
        assertThat(detailListResponse.originalAmount()).isEqualTo(0L)
        assertThat(detailListResponse.originalCurrency()).isEqualTo("original_currency")
        assertThat(detailListResponse.payoutCurrencyAmount()).isEqualTo(0L)
        assertThat(detailListResponse.usdEquivalentAmount()).isEqualTo(0L)
        assertThat(detailListResponse.description()).isEqualTo("description")
        assertThat(detailListResponse.referenceObjectId()).isEqualTo("reference_object_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val detailListResponse =
            DetailListResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventType("event_type")
                .originalAmount(0L)
                .originalCurrency("original_currency")
                .payoutCurrencyAmount(0L)
                .usdEquivalentAmount(0L)
                .description("description")
                .referenceObjectId("reference_object_id")
                .build()

        val roundtrippedDetailListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(detailListResponse),
                jacksonTypeRef<DetailListResponse>(),
            )

        assertThat(roundtrippedDetailListResponse).isEqualTo(detailListResponse)
    }
}
