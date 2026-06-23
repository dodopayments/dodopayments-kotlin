// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Metadata
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
                .metadata(
                    Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .phoneNumber("phone_number")
                .build()

        assertThat(customerLimitedDetails.customerId()).isEqualTo("customer_id")
        assertThat(customerLimitedDetails.email()).isEqualTo("email")
        assertThat(customerLimitedDetails.name()).isEqualTo("name")
        assertThat(customerLimitedDetails.metadata())
            .isEqualTo(
                Metadata.builder().putAdditionalProperty("foo", JsonValue.from("string")).build()
            )
        assertThat(customerLimitedDetails.phoneNumber()).isEqualTo("phone_number")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerLimitedDetails =
            CustomerLimitedDetails.builder()
                .customerId("customer_id")
                .email("email")
                .name("name")
                .metadata(
                    Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .phoneNumber("phone_number")
                .build()

        val roundtrippedCustomerLimitedDetails =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerLimitedDetails),
                jacksonTypeRef<CustomerLimitedDetails>(),
            )

        assertThat(roundtrippedCustomerLimitedDetails).isEqualTo(customerLimitedDetails)
    }
}
