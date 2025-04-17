// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerTest {

    @Test
    fun createCustomer() {
        val customer =
            Customer.builder()
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerId("customer_id")
                .email("email")
                .name("name")
                .phoneNumber("phone_number")
                .build()
        assertThat(customer).isNotNull
        assertThat(customer.businessId()).isEqualTo("business_id")
        assertThat(customer.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customer.customerId()).isEqualTo("customer_id")
        assertThat(customer.email()).isEqualTo("email")
        assertThat(customer.name()).isEqualTo("name")
        assertThat(customer.phoneNumber()).isEqualTo("phone_number")
    }
}
