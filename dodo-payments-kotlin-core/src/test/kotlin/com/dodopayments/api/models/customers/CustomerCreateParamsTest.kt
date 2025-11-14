// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers

import com.dodopayments.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCreateParamsTest {

    @Test
    fun create() {
        CustomerCreateParams.builder()
            .email("email")
            .name("name")
            .metadata(
                CustomerCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .phoneNumber("phone_number")
            .build()
    }

    @Test
    fun body() {
        val params =
            CustomerCreateParams.builder()
                .email("email")
                .name("name")
                .metadata(
                    CustomerCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .phoneNumber("phone_number")
                .build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("email")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.metadata())
            .isEqualTo(
                CustomerCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
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
