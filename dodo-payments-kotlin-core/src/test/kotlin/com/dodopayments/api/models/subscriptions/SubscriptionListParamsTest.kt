// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionListParamsTest {

    @Test
    fun create() {
        SubscriptionListParams.builder()
            .brandId("brand_id")
            .createdAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .customerId("customer_id")
            .pageNumber(0)
            .pageSize(0)
            .status(SubscriptionListParams.Status.PENDING)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SubscriptionListParams.builder()
                .brandId("brand_id")
                .createdAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerId("customer_id")
                .pageNumber(0)
                .pageSize(0)
                .status(SubscriptionListParams.Status.PENDING)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("brand_id", "brand_id")
                    .put("created_at_gte", "2019-12-27T18:11:19.117Z")
                    .put("created_at_lte", "2019-12-27T18:11:19.117Z")
                    .put("customer_id", "customer_id")
                    .put("page_number", "0")
                    .put("page_size", "0")
                    .put("status", "pending")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SubscriptionListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
