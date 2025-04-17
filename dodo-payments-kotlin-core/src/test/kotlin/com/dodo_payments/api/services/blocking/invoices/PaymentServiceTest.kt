// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.blocking.invoices

import com.dodo_payments.api.TestServerExtension
import com.dodo_payments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodo_payments.api.models.invoices.payments.PaymentRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PaymentServiceTest {

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val paymentService = client.invoices().payments()

        paymentService.retrieve(PaymentRetrieveParams.builder().paymentId("payment_id").build())
    }
}
