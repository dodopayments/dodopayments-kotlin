// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.customers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerRetrieveParamsTest {

    @Test
    fun create() {
        CustomerRetrieveParams.builder().customerId("customer_id").build()
    }

    @Test
    fun getPathParam() {
        val params = CustomerRetrieveParams.builder().customerId("customer_id").build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("customer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
