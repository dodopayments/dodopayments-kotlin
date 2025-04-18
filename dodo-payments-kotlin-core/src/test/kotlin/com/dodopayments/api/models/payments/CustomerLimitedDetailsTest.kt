// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerLimitedDetailsTest {

    @Test
    fun create() {
        val customerLimitedDetails =
            CustomerLimitedDetails.builder()
                .customerId("customer_id")
                .email("email")
                .name("name")
                .build()

        assertThat(customerLimitedDetails.customerId()).isEqualTo("customer_id")
        assertThat(customerLimitedDetails.email()).isEqualTo("email")
        assertThat(customerLimitedDetails.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerLimitedDetails =
            CustomerLimitedDetails.builder()
                .customerId("customer_id")
                .email("email")
                .name("name")
                .build()

        val roundtrippedCustomerLimitedDetails =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerLimitedDetails),
                jacksonTypeRef<CustomerLimitedDetails>(),
            )

        assertThat(roundtrippedCustomerLimitedDetails).isEqualTo(customerLimitedDetails)
    }
}
