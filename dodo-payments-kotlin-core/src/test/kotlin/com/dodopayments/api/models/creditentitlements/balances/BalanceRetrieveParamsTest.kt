// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.creditentitlements.balances

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceRetrieveParamsTest {

    @Test
    fun create() {
        BalanceRetrieveParams.builder()
            .creditEntitlementId("credit_entitlement_id")
            .customerId("customer_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BalanceRetrieveParams.builder()
                .creditEntitlementId("credit_entitlement_id")
                .customerId("customer_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("credit_entitlement_id")
        assertThat(params._pathParam(1)).isEqualTo("customer_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
