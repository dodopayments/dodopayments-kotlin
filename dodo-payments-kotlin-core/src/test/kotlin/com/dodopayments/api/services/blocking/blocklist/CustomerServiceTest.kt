// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.blocklist

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.models.blocklist.customers.BlockedCustomerSource
import com.dodopayments.api.models.blocklist.customers.CreateBlockedCustomerRequest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CustomerServiceTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerService = client.blocklist().customers()

        val blockedCustomer =
            customerService.create(
                CreateBlockedCustomerRequest.BlocklistCustomersBlockByCustomerId.builder()
                    .customerId("customer_id")
                    .reason("reason")
                    .source(BlockedCustomerSource.BLOCKLIST_PAGE)
                    .build()
            )

        blockedCustomer.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerService = client.blocklist().customers()

        val blockedCustomer = customerService.retrieve("entry_id")

        blockedCustomer.validate()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerService = client.blocklist().customers()

        val page = customerService.list()

        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerService = client.blocklist().customers()

        customerService.delete("entry_id")
    }
}
