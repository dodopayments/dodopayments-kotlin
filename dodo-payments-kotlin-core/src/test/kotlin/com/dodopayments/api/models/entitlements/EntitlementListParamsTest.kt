// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements

import com.dodopayments.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementListParamsTest {

    @Test
    fun create() {
        EntitlementListParams.builder()
            .integrationType(EntitlementListParams.IntegrationType.DISCORD)
            .pageNumber(0)
            .pageSize(0)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            EntitlementListParams.builder()
                .integrationType(EntitlementListParams.IntegrationType.DISCORD)
                .pageNumber(0)
                .pageSize(0)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("integration_type", "discord")
                    .put("page_number", "0")
                    .put("page_size", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EntitlementListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
