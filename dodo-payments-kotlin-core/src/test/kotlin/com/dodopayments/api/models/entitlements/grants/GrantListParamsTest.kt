// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements.grants

import com.dodopayments.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GrantListParamsTest {

    @Test
    fun create() {
        GrantListParams.builder()
            .id("id")
            .customerId("customer_id")
            .integrationType(GrantListParams.IntegrationType.DISCORD)
            .pageNumber(0)
            .pageSize(0)
            .status(GrantListParams.Status.PENDING)
            .build()
    }

    @Test
    fun pathParams() {
        val params = GrantListParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            GrantListParams.builder()
                .id("id")
                .customerId("customer_id")
                .integrationType(GrantListParams.IntegrationType.DISCORD)
                .pageNumber(0)
                .pageSize(0)
                .status(GrantListParams.Status.PENDING)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("customer_id", "customer_id")
                    .put("integration_type", "discord")
                    .put("page_number", "0")
                    .put("page_size", "0")
                    .put("status", "Pending")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = GrantListParams.builder().id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
