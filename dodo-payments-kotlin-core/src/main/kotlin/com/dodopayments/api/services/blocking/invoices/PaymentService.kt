// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.invoices

import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.models.invoices.payments.PaymentRetrieveParams
import com.google.errorprone.annotations.MustBeClosed

interface PaymentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun retrieve(
        params: PaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [PaymentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /invoices/payments/{payment_id}`, but is otherwise
         * the same as [PaymentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: PaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
