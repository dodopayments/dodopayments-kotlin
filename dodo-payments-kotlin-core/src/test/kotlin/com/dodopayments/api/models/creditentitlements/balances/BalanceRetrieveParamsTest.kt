// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.creditentitlements.balances

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceRetrieveParamsTest {

    @Test
    fun create() {
        BalanceRetrieveParams.builder()
            .creditEntitlementId("cde_ztxm5XJsKxWucRWA3rjdM")
            .customerId("cus_TV52uJWWXt2yIoBBxpjaa")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BalanceRetrieveParams.builder()
                .creditEntitlementId("cde_ztxm5XJsKxWucRWA3rjdM")
                .customerId("cus_TV52uJWWXt2yIoBBxpjaa")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("cde_ztxm5XJsKxWucRWA3rjdM")
        assertThat(params._pathParam(1)).isEqualTo("cus_TV52uJWWXt2yIoBBxpjaa")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
