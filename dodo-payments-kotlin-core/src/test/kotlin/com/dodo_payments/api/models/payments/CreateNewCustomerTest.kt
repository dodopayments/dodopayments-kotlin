// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.payments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreateNewCustomerTest {

    @Test
    fun createCreateNewCustomer() {
        val createNewCustomer =
            CreateNewCustomer.builder()
                .email("email")
                .name("name")
                .createNewCustomer(true)
                .phoneNumber("phone_number")
                .build()
        assertThat(createNewCustomer).isNotNull
        assertThat(createNewCustomer.email()).isEqualTo("email")
        assertThat(createNewCustomer.name()).isEqualTo("name")
        assertThat(createNewCustomer.createNewCustomer()).isEqualTo(true)
        assertThat(createNewCustomer.phoneNumber()).isEqualTo("phone_number")
    }
}
