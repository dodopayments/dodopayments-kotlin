// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.usageevents

import com.dodopayments.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageEventListParamsTest {

    @Test
    fun create() {
        UsageEventListParams.builder()
            .customerId("customer_id")
            .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .eventName("event_name")
            .meterId("meter_id")
            .pageNumber(0)
            .pageSize(0)
            .start(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            UsageEventListParams.builder()
                .customerId("customer_id")
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventName("event_name")
                .meterId("meter_id")
                .pageNumber(0)
                .pageSize(0)
                .start(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("customer_id", "customer_id")
                    .put("end", "2019-12-27T18:11:19.117Z")
                    .put("event_name", "event_name")
                    .put("meter_id", "meter_id")
                    .put("page_number", "0")
                    .put("page_size", "0")
                    .put("start", "2019-12-27T18:11:19.117Z")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = UsageEventListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
