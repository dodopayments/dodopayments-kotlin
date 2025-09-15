// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionRetrieveUsageHistoryParamsTest {

    @Test
    fun create() {
        SubscriptionRetrieveUsageHistoryParams.builder()
            .subscriptionId("subscription_id")
            .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .meterId("meter_id")
            .pageNumber(0)
            .pageSize(0)
            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SubscriptionRetrieveUsageHistoryParams.builder()
                .subscriptionId("subscription_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("subscription_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            SubscriptionRetrieveUsageHistoryParams.builder()
                .subscriptionId("subscription_id")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .meterId("meter_id")
                .pageNumber(0)
                .pageSize(0)
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("end_date", "2019-12-27T18:11:19.117Z")
                    .put("meter_id", "meter_id")
                    .put("page_number", "0")
                    .put("page_size", "0")
                    .put("start_date", "2019-12-27T18:11:19.117Z")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            SubscriptionRetrieveUsageHistoryParams.builder()
                .subscriptionId("subscription_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
