// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerUpdateParamsTest {

    @Test
    fun create() {
        CustomerUpdateParams.builder()
            .customerId("customer_id")
            .name("name")
            .phoneNumber("phone_number")
            .build()
    }

    @Test
    fun body() {
        val params =
            CustomerUpdateParams.builder()
                .customerId("customer_id")
                .name("name")
                .phoneNumber("phone_number")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.phoneNumber()).isEqualTo("phone_number")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CustomerUpdateParams.builder().customerId("customer_id").build()

        val body = params._body()

        assertNotNull(body)
    }

    @Test
    fun getPathParam() {
        val params = CustomerUpdateParams.builder().customerId("customer_id").build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("customer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
