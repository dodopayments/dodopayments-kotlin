// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.blocking.customers

import com.dodo_payments.api.TestServerExtension
import com.dodo_payments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodo_payments.api.models.customers.customerportal.CustomerPortalCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CustomerPortalServiceTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerPortalService = client.customers().customerPortal()

        val customerPortalSession =
            customerPortalService.create(
                CustomerPortalCreateParams.builder()
                    .customerId("customer_id")
                    .sendEmail(true)
                    .build()
            )

        customerPortalSession.validate()
    }
}
