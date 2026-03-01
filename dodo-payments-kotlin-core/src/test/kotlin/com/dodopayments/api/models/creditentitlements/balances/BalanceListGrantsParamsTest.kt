// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.creditentitlements.balances

import com.dodopayments.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceListGrantsParamsTest {

    @Test
    fun create() {
        BalanceListGrantsParams.builder()
            .creditEntitlementId("credit_entitlement_id")
            .customerId("customer_id")
            .pageNumber(0)
            .pageSize(0)
            .status(BalanceListGrantsParams.Status.ACTIVE)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BalanceListGrantsParams.builder()
                .creditEntitlementId("credit_entitlement_id")
                .customerId("customer_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("credit_entitlement_id")
        assertThat(params._pathParam(1)).isEqualTo("customer_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            BalanceListGrantsParams.builder()
                .creditEntitlementId("credit_entitlement_id")
                .customerId("customer_id")
                .pageNumber(0)
                .pageSize(0)
                .status(BalanceListGrantsParams.Status.ACTIVE)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("page_number", "0")
                    .put("page_size", "0")
                    .put("status", "active")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            BalanceListGrantsParams.builder()
                .creditEntitlementId("credit_entitlement_id")
                .customerId("customer_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
