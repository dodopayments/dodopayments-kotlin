// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.creditentitlements.balances

import com.dodopayments.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceListParamsTest {

    @Test
    fun create() {
        BalanceListParams.builder()
            .creditEntitlementId("credit_entitlement_id")
            .customerId("customer_id")
            .pageNumber(0)
            .pageSize(0)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BalanceListParams.builder().creditEntitlementId("credit_entitlement_id").build()

        assertThat(params._pathParam(0)).isEqualTo("credit_entitlement_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            BalanceListParams.builder()
                .creditEntitlementId("credit_entitlement_id")
                .customerId("customer_id")
                .pageNumber(0)
                .pageSize(0)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("customer_id", "customer_id")
                    .put("page_number", "0")
                    .put("page_size", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            BalanceListParams.builder().creditEntitlementId("credit_entitlement_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
