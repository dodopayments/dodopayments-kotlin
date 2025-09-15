// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers.wallets

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WalletListParamsTest {

    @Test
    fun create() {
        WalletListParams.builder().customerId("customer_id").build()
    }

    @Test
    fun pathParams() {
        val params = WalletListParams.builder().customerId("customer_id").build()

        assertThat(params._pathParam(0)).isEqualTo("customer_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
