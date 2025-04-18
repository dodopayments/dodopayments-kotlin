// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerTest {

    @Test
    fun create() {
        val customer =
            Customer.builder()
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerId("customer_id")
                .email("email")
                .name("name")
                .phoneNumber("phone_number")
                .build()

        assertThat(customer.businessId()).isEqualTo("business_id")
        assertThat(customer.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customer.customerId()).isEqualTo("customer_id")
        assertThat(customer.email()).isEqualTo("email")
        assertThat(customer.name()).isEqualTo("name")
        assertThat(customer.phoneNumber()).isEqualTo("phone_number")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customer =
            Customer.builder()
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerId("customer_id")
                .email("email")
                .name("name")
                .phoneNumber("phone_number")
                .build()

        val roundtrippedCustomer =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customer),
                jacksonTypeRef<Customer>(),
            )

        assertThat(roundtrippedCustomer).isEqualTo(customer)
    }
}
