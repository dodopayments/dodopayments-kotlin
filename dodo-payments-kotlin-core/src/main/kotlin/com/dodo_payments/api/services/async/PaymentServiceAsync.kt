// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async

import com.dodo_payments.api.core.RequestOptions
import com.dodo_payments.api.core.http.HttpResponseFor
import com.dodo_payments.api.models.payments.Payment
import com.dodo_payments.api.models.payments.PaymentCreateParams
import com.dodo_payments.api.models.payments.PaymentCreateResponse
import com.dodo_payments.api.models.payments.PaymentListPageAsync
import com.dodo_payments.api.models.payments.PaymentListParams
import com.dodo_payments.api.models.payments.PaymentRetrieveParams
import com.google.errorprone.annotations.MustBeClosed

interface PaymentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    suspend fun create(
        params: PaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentCreateResponse

    suspend fun retrieve(
        params: PaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Payment

    suspend fun list(
        params: PaymentListParams = PaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): PaymentListPageAsync =
        list(PaymentListParams.none(), requestOptions)

    /**
     * A view of [PaymentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /payments`, but is otherwise the same as
         * [PaymentServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: PaymentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentCreateResponse>

        /**
         * Returns a raw HTTP response for `get /payments/{payment_id}`, but is otherwise the same
         * as [PaymentServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: PaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Payment>

        /**
         * Returns a raw HTTP response for `get /payments`, but is otherwise the same as
         * [PaymentServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: PaymentListParams = PaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<PaymentListPageAsync> =
            list(PaymentListParams.none(), requestOptions)
    }
}
