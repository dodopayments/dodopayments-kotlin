// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewCustomerTest {

    @Test
    fun create() {
        val newCustomer =
            NewCustomer.builder().email("email").name("name").phoneNumber("phone_number").build()

        assertThat(newCustomer.email()).isEqualTo("email")
        assertThat(newCustomer.name()).isEqualTo("name")
        assertThat(newCustomer.phoneNumber()).isEqualTo("phone_number")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newCustomer =
            NewCustomer.builder().email("email").name("name").phoneNumber("phone_number").build()

        val roundtrippedNewCustomer =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newCustomer),
                jacksonTypeRef<NewCustomer>(),
            )

        assertThat(roundtrippedNewCustomer).isEqualTo(newCustomer)
    }
}
