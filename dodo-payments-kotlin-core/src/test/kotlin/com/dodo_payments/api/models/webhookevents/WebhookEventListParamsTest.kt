// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.webhookevents

import com.dodo_payments.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WebhookEventListParamsTest {

    @Test
    fun create() {
        WebhookEventListParams.builder()
            .createdAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .limit(0L)
            .objectId("object_id")
            .pageNumber(0L)
            .pageSize(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            WebhookEventListParams.builder()
                .createdAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .limit(0L)
                .objectId("object_id")
                .pageNumber(0L)
                .pageSize(0L)
                .build()
        val expected = QueryParams.builder()
        expected.put("created_at_gte", "2019-12-27T18:11:19.117Z")
        expected.put("created_at_lte", "2019-12-27T18:11:19.117Z")
        expected.put("limit", "0")
        expected.put("object_id", "object_id")
        expected.put("page_number", "0")
        expected.put("page_size", "0")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = WebhookEventListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
