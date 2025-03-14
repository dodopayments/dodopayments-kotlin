// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async

import com.dodo_payments.api.TestServerExtension
import com.dodo_payments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodo_payments.api.models.customers.CustomerCreateParams
import com.dodo_payments.api.models.customers.CustomerRetrieveParams
import com.dodo_payments.api.models.customers.CustomerUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CustomerServiceAsyncTest {

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

        val customer =
            customerServiceAsync.retrieve(
                CustomerRetrieveParams.builder().customerId("customer_id").build()
            )

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
