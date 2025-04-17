// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.invoices

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.models.invoices.payments.PaymentRetrieveParams
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
