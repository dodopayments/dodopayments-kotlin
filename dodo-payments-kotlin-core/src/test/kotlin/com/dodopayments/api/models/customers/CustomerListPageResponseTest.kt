// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerListPageResponseTest {

    @Test
    fun create() {
        val customerListPageResponse =
            CustomerListPageResponse.builder()
                .addItem(
                    Customer.builder()
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customer_id")
                        .email("email")
                        .name("name")
                        .metadata(
                            Customer.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .phoneNumber("phone_number")
                        .build()
                )
                .build()

        assertThat(customerListPageResponse.items())
            .containsExactly(
                Customer.builder()
                    .businessId("business_id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerId("customer_id")
                    .email("email")
                    .name("name")
                    .metadata(
                        Customer.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .phoneNumber("phone_number")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerListPageResponse =
            CustomerListPageResponse.builder()
                .addItem(
                    Customer.builder()
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customer_id")
                        .email("email")
                        .name("name")
                        .metadata(
                            Customer.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .phoneNumber("phone_number")
                        .build()
                )
                .build()

        val roundtrippedCustomerListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerListPageResponse),
                jacksonTypeRef<CustomerListPageResponse>(),
            )

        assertThat(roundtrippedCustomerListPageResponse).isEqualTo(customerListPageResponse)
    }
}
