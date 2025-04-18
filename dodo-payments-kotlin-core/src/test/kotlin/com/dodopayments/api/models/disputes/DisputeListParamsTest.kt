// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.disputes

import com.dodopayments.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DisputeListParamsTest {

    @Test
    fun create() {
        DisputeListParams.builder()
            .createdAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .customerId("customer_id")
            .disputeStage(DisputeStage.PRE_DISPUTE)
            .disputeStatus(DisputeStatus.DISPUTE_OPENED)
            .pageNumber(0L)
            .pageSize(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            DisputeListParams.builder()
                .createdAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerId("customer_id")
                .disputeStage(DisputeStage.PRE_DISPUTE)
                .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                .pageNumber(0L)
                .pageSize(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("created_at_gte", "2019-12-27T18:11:19.117Z")
                    .put("created_at_lte", "2019-12-27T18:11:19.117Z")
                    .put("customer_id", "customer_id")
                    .put("dispute_stage", "pre_dispute")
                    .put("dispute_status", "dispute_opened")
                    .put("page_number", "0")
                    .put("page_size", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DisputeListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
