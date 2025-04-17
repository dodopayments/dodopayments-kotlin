// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.disputes

import com.dodopayments.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DisputeListParamsTest {

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
        val expected = QueryParams.builder()
        expected.put("created_at_gte", "2019-12-27T18:11:19.117Z")
        expected.put("created_at_lte", "2019-12-27T18:11:19.117Z")
        expected.put("customer_id", "customer_id")
        expected.put("dispute_stage", DisputeStage.PRE_DISPUTE.toString())
        expected.put("dispute_status", DisputeStatus.DISPUTE_OPENED.toString())
        expected.put("page_number", "0")
        expected.put("page_size", "0")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DisputeListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
