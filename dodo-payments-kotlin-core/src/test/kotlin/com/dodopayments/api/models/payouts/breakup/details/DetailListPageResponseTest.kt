// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payouts.breakup.details

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DetailListPageResponseTest {

    @Test
    fun create() {
        val detailListPageResponse =
            DetailListPageResponse.builder()
                .addItem(
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
                )
                .build()

        assertThat(detailListPageResponse.items())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val detailListPageResponse =
            DetailListPageResponse.builder()
                .addItem(
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
                )
                .build()

        val roundtrippedDetailListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(detailListPageResponse),
                jacksonTypeRef<DetailListPageResponse>(),
            )

        assertThat(roundtrippedDetailListPageResponse).isEqualTo(detailListPageResponse)
    }
}
