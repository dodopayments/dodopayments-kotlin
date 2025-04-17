// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async.customers

import com.dodo_payments.api.TestServerExtension
import com.dodo_payments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodo_payments.api.models.customers.customerportal.CustomerPortalCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CustomerPortalServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerPortalServiceAsync = client.customers().customerPortal()

        val customerPortalSession =
            customerPortalServiceAsync.create(
                CustomerPortalCreateParams.builder()
                    .customerId("customer_id")
                    .sendEmail(true)
                    .build()
            )

        customerPortalSession.validate()
    }
}
