// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.services.blocking.invoices.PaymentService
import com.dodopayments.api.services.blocking.invoices.PaymentServiceImpl

class InvoiceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InvoiceService {

    private val withRawResponse: InvoiceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val payments: PaymentService by lazy { PaymentServiceImpl(clientOptions) }

    override fun withRawResponse(): InvoiceService.WithRawResponse = withRawResponse

    override fun payments(): PaymentService = payments

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InvoiceService.WithRawResponse {

        private val payments: PaymentService.WithRawResponse by lazy {
            PaymentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun payments(): PaymentService.WithRawResponse = payments
    }
}
