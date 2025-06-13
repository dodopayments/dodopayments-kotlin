// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.invoices

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.models.invoices.payments.PaymentRetrieveParams
import com.google.errorprone.annotations.MustBeClosed

interface PaymentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PaymentService

    @MustBeClosed
    fun retrieve(
        paymentId: String,
        params: PaymentRetrieveParams = PaymentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = retrieve(params.toBuilder().paymentId(paymentId).build(), requestOptions)

    /** @see [retrieve] */
    @MustBeClosed
    fun retrieve(
        params: PaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see [retrieve] */
    @MustBeClosed
    fun retrieve(paymentId: String, requestOptions: RequestOptions): HttpResponse =
        retrieve(paymentId, PaymentRetrieveParams.none(), requestOptions)

    /** A view of [PaymentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PaymentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /invoices/payments/{payment_id}`, but is otherwise
         * the same as [PaymentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            paymentId: String,
            params: PaymentRetrieveParams = PaymentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = retrieve(params.toBuilder().paymentId(paymentId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(paymentId: String, requestOptions: RequestOptions): HttpResponse =
            retrieve(paymentId, PaymentRetrieveParams.none(), requestOptions)
    }
}
