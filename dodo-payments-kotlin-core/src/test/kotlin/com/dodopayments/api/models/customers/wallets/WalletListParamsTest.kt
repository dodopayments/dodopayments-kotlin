// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers.wallets

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WalletListParamsTest {

    @Test
    fun create() {
        WalletListParams.builder().customerId("cus_TV52uJWWXt2yIoBBxpjaa").build()
    }

    @Test
    fun pathParams() {
        val params = WalletListParams.builder().customerId("cus_TV52uJWWXt2yIoBBxpjaa").build()

        assertThat(params._pathParam(0)).isEqualTo("cus_TV52uJWWXt2yIoBBxpjaa")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
