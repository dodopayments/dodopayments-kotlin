// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.blocking

import com.dodo_payments.api.services.blocking.invoices.PaymentService

interface InvoiceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun payments(): PaymentService

    /** A view of [InvoiceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun payments(): PaymentService.WithRawResponse
    }
}
