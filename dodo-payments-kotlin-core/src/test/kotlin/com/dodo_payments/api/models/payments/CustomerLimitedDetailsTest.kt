// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.payments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerLimitedDetailsTest {

    @Test
    fun createCustomerLimitedDetails() {
        val customerLimitedDetails =
            CustomerLimitedDetails.builder()
                .customerId("customer_id")
                .email("email")
                .name("name")
                .build()
        assertThat(customerLimitedDetails).isNotNull
        assertThat(customerLimitedDetails.customerId()).isEqualTo("customer_id")
        assertThat(customerLimitedDetails.email()).isEqualTo("email")
        assertThat(customerLimitedDetails.name()).isEqualTo("name")
    }
}
