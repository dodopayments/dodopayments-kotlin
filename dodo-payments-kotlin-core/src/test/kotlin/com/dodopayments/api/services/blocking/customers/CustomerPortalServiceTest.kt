// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.customers

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.models.customers.customerportal.CustomerPortalCreateParams
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

        customerPortalService.create(
            CustomerPortalCreateParams.builder().customerId("customer_id").sendEmail(true).build()
        )
    }
}
