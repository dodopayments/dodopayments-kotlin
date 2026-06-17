// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers

import com.dodopayments.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerUpdateParamsTest {

    @Test
    fun create() {
        CustomerUpdateParams.builder()
            .customerId("cus_TV52uJWWXt2yIoBBxpjaa")
            .email("email")
            .metadata(
                CustomerUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .name("name")
            .phoneNumber("phone_number")
            .build()
    }

    @Test
    fun pathParams() {
        val params = CustomerUpdateParams.builder().customerId("cus_TV52uJWWXt2yIoBBxpjaa").build()

        assertThat(params._pathParam(0)).isEqualTo("cus_TV52uJWWXt2yIoBBxpjaa")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CustomerUpdateParams.builder()
                .customerId("cus_TV52uJWWXt2yIoBBxpjaa")
                .email("email")
                .metadata(
                    CustomerUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("name")
                .phoneNumber("phone_number")
                .build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("email")
        assertThat(body.metadata())
            .isEqualTo(
                CustomerUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.phoneNumber()).isEqualTo("phone_number")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CustomerUpdateParams.builder().customerId("cus_TV52uJWWXt2yIoBBxpjaa").build()

        val body = params._body()
    }
}
