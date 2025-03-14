// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubscriptionListParamsTest {

    @Test
    fun create() {
        SubscriptionListParams.builder()
            .createdAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .customerId("customer_id")
            .pageNumber(0L)
            .pageSize(0L)
            .status(SubscriptionStatus.PENDING)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SubscriptionListParams.builder()
                .createdAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerId("customer_id")
                .pageNumber(0L)
                .pageSize(0L)
                .status(SubscriptionStatus.PENDING)
                .build()
        val expected = QueryParams.builder()
        expected.put("created_at_gte", "2019-12-27T18:11:19.117Z")
        expected.put("created_at_lte", "2019-12-27T18:11:19.117Z")
        expected.put("customer_id", "customer_id")
        expected.put("page_number", "0")
        expected.put("page_size", "0")
        expected.put("status", SubscriptionStatus.PENDING.toString())
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SubscriptionListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
