// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.customers

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.customers.emails.EmailRetrieveBodyParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EmailServiceAsyncTest {

    @Test
    suspend fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val emailServiceAsync = client.customers().emails()

        val page = emailServiceAsync.list("customer_id")

        page.response().validate()
    }

    @Test
    suspend fun retrieveBody() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val emailServiceAsync = client.customers().emails()

        val emailBody =
            emailServiceAsync.retrieveBody(
                EmailRetrieveBodyParams.builder()
                    .customerId("customer_id")
                    .emailLogId("email_log_id")
                    .build()
            )

        emailBody.validate()
    }
}
