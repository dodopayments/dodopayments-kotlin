// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.blocking.customers.customerportal

import com.dodo_payments.api.TestServerExtension
import com.dodo_payments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodo_payments.api.models.customers.customerportal.session.SessionCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class SessionServiceTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val sessionService = client.customers().customerPortal().session()

        sessionService.create(
            SessionCreateParams.builder().customerId("customer_id").sendEmail(true).build()
        )
    }
}
