// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.customers

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.models.customers.emails.EmailRetrieveBodyParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EmailServiceTest {

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val emailService = client.customers().emails()

        val page = emailService.list("customer_id")

        page.response().validate()
    }

    @Test
    fun retrieveBody() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val emailService = client.customers().emails()

        val emailBody =
            emailService.retrieveBody(
                EmailRetrieveBodyParams.builder()
                    .customerId("customer_id")
                    .emailLogId("email_log_id")
                    .build()
            )

        emailBody.validate()
    }
}
