// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.blocklist.customers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerDeleteParamsTest {

    @Test
    fun create() {
        CustomerDeleteParams.builder().entryId("entry_id").build()
    }

    @Test
    fun pathParams() {
        val params = CustomerDeleteParams.builder().entryId("entry_id").build()

        assertThat(params._pathParam(0)).isEqualTo("entry_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
