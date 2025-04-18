// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCreateParamsTest {

    @Test
    fun create() {
        CustomerCreateParams.builder()
            .email("email")
            .name("name")
            .phoneNumber("phone_number")
            .build()
    }

    @Test
    fun body() {
        val params =
            CustomerCreateParams.builder()
                .email("email")
                .name("name")
                .phoneNumber("phone_number")
                .build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("email")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.phoneNumber()).isEqualTo("phone_number")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CustomerCreateParams.builder().email("email").name("name").build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("email")
        assertThat(body.name()).isEqualTo("name")
    }
}
