// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerUpdateParamsTest {

    @Test
    fun create() {
        CustomerUpdateParams.builder()
            .customerId("customer_id")
            .name("name")
            .phoneNumber("phone_number")
            .build()
    }

    @Test
    fun pathParams() {
        val params = CustomerUpdateParams.builder().customerId("customer_id").build()

        assertThat(params._pathParam(0)).isEqualTo("customer_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
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

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.phoneNumber()).isEqualTo("phone_number")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CustomerUpdateParams.builder().customerId("customer_id").build()

        val body = params._body()
    }
}
