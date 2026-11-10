// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreateNewCustomerTest {

    @Test
    fun create() {
        val createNewCustomer =
            CreateNewCustomer.builder()
                .email("email")
                .name("name")
                .createNewCustomer(true)
                .phoneNumber("phone_number")
                .build()

        assertThat(createNewCustomer.email()).isEqualTo("email")
        assertThat(createNewCustomer.name()).isEqualTo("name")
        assertThat(createNewCustomer.createNewCustomer()).isEqualTo(true)
        assertThat(createNewCustomer.phoneNumber()).isEqualTo("phone_number")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createNewCustomer =
            CreateNewCustomer.builder()
                .email("email")
                .name("name")
                .createNewCustomer(true)
                .phoneNumber("phone_number")
                .build()

        val roundtrippedCreateNewCustomer =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createNewCustomer),
                jacksonTypeRef<CreateNewCustomer>(),
            )

        assertThat(roundtrippedCreateNewCustomer).isEqualTo(createNewCustomer)
    }
}
