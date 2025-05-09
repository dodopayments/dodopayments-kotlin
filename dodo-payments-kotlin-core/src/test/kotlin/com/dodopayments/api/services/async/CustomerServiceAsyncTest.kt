// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.customers.CustomerCreateParams
import com.dodopayments.api.models.customers.CustomerUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CustomerServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerServiceAsync = client.customers()

        val customer =
            customerServiceAsync.create(
                CustomerCreateParams.builder()
                    .email("email")
                    .name("name")
                    .phoneNumber("phone_number")
                    .build()
            )

        customer.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerServiceAsync = client.customers()

        val customer = customerServiceAsync.retrieve("customer_id")

        customer.validate()
    }

    @Test
    suspend fun update() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerServiceAsync = client.customers()

        val customer =
            customerServiceAsync.update(
                CustomerUpdateParams.builder()
                    .customerId("customer_id")
                    .name("name")
                    .phoneNumber("phone_number")
                    .build()
            )

        customer.validate()
    }

    @Test
    suspend fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerServiceAsync = client.customers()

        val page = customerServiceAsync.list()

        page.response().validate()
    }
}
