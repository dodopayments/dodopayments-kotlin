// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.blocklist

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.blocklist.customers.BlockedCustomerSource
import com.dodopayments.api.models.blocklist.customers.CreateBlockedCustomerRequest
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
        val customerServiceAsync = client.blocklist().customers()

        val blockedCustomer =
            customerServiceAsync.create(
                CreateBlockedCustomerRequest.BlocklistCustomersBlockByCustomerId.builder()
                    .customerId("customer_id")
                    .reason("reason")
                    .source(BlockedCustomerSource.BLOCKLIST_PAGE)
                    .build()
            )

        blockedCustomer.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerServiceAsync = client.blocklist().customers()

        val blockedCustomer = customerServiceAsync.retrieve("entry_id")

        blockedCustomer.validate()
    }

    @Test
    suspend fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerServiceAsync = client.blocklist().customers()

        val page = customerServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun delete() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerServiceAsync = client.blocklist().customers()

        customerServiceAsync.delete("entry_id")
    }
}
