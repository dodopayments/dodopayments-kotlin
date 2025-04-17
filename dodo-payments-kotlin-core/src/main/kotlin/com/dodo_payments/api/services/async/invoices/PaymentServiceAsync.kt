// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async.invoices

import com.dodo_payments.api.core.RequestOptions
import com.dodo_payments.api.core.http.HttpResponse
import com.dodo_payments.api.models.invoices.payments.PaymentRetrieveParams
import com.google.errorprone.annotations.MustBeClosed

interface PaymentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    suspend fun retrieve(
        params: PaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [PaymentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /invoices/payments/{payment_id}`, but is otherwise
         * the same as [PaymentServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: PaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
