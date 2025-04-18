// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerRetrieveParamsTest {

    @Test
    fun create() {
        CustomerRetrieveParams.builder().customerId("customer_id").build()
    }

    @Test
    fun pathParams() {
        val params = CustomerRetrieveParams.builder().customerId("customer_id").build()

        assertThat(params._pathParam(0)).isEqualTo("customer_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
