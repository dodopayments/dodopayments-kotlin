// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.customers

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.customers.customerportal.CustomerPortalCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CustomerPortalServiceAsyncTest {

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
                    .customerId("cus_TV52uJWWXt2yIoBBxpjaa")
                    .returnUrl("return_url")
                    .sendEmail(true)
                    .build()
            )

        customerPortalSession.validate()
    }
}
