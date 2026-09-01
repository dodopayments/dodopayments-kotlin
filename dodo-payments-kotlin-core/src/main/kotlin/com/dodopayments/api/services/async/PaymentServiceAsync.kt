// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.payments.ManualRetry
import com.dodopayments.api.models.payments.ManualRetryState
import com.dodopayments.api.models.payments.Payment
import com.dodopayments.api.models.payments.PaymentCreateParams
import com.dodopayments.api.models.payments.PaymentCreateResponse
import com.dodopayments.api.models.payments.PaymentListPageAsync
import com.dodopayments.api.models.payments.PaymentListParams
import com.dodopayments.api.models.payments.PaymentRetrieveLineItemsParams
import com.dodopayments.api.models.payments.PaymentRetrieveLineItemsResponse
import com.dodopayments.api.models.payments.PaymentRetrieveParams
import com.dodopayments.api.models.payments.PaymentRetrieveRetryStateParams
import com.dodopayments.api.models.payments.PaymentRetryParams
import com.google.errorprone.annotations.MustBeClosed

interface PaymentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PaymentServiceAsync

    @Deprecated("deprecated")
    suspend fun create(
        params: PaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentCreateResponse

    suspend fun retrieve(
        paymentId: String,
        params: PaymentRetrieveParams = PaymentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Payment = retrieve(params.toBuilder().paymentId(paymentId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: PaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Payment

    /** @see retrieve */
    suspend fun retrieve(paymentId: String, requestOptions: RequestOptions): Payment =
        retrieve(paymentId, PaymentRetrieveParams.none(), requestOptions)

    suspend fun list(
        params: PaymentListParams = PaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): PaymentListPageAsync =
        list(PaymentListParams.none(), requestOptions)

    suspend fun retrieveLineItems(
        paymentId: String,
        params: PaymentRetrieveLineItemsParams = PaymentRetrieveLineItemsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentRetrieveLineItemsResponse =
        retrieveLineItems(params.toBuilder().paymentId(paymentId).build(), requestOptions)

    /** @see retrieveLineItems */
    suspend fun retrieveLineItems(
        params: PaymentRetrieveLineItemsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentRetrieveLineItemsResponse

    /** @see retrieveLineItems */
    suspend fun retrieveLineItems(
        paymentId: String,
        requestOptions: RequestOptions,
    ): PaymentRetrieveLineItemsResponse =
        retrieveLineItems(paymentId, PaymentRetrieveLineItemsParams.none(), requestOptions)

    suspend fun retrieveRetryState(
        paymentId: String,
        params: PaymentRetrieveRetryStateParams = PaymentRetrieveRetryStateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManualRetryState =
        retrieveRetryState(params.toBuilder().paymentId(paymentId).build(), requestOptions)

    /** @see retrieveRetryState */
    suspend fun retrieveRetryState(
        params: PaymentRetrieveRetryStateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManualRetryState

    /** @see retrieveRetryState */
    suspend fun retrieveRetryState(
        paymentId: String,
        requestOptions: RequestOptions,
    ): ManualRetryState =
        retrieveRetryState(paymentId, PaymentRetrieveRetryStateParams.none(), requestOptions)

    suspend fun retry(
        paymentId: String,
        params: PaymentRetryParams = PaymentRetryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManualRetry = retry(params.toBuilder().paymentId(paymentId).build(), requestOptions)

    /** @see retry */
    suspend fun retry(
        params: PaymentRetryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManualRetry

    /** @see retry */
    suspend fun retry(paymentId: String, requestOptions: RequestOptions): ManualRetry =
        retry(paymentId, PaymentRetryParams.none(), requestOptions)

    /**
     * A view of [PaymentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PaymentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /payments`, but is otherwise the same as
         * [PaymentServiceAsync.create].
         */
        @Deprecated("deprecated")
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
            paymentId: String,
            params: PaymentRetrieveParams = PaymentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Payment> =
            retrieve(params.toBuilder().paymentId(paymentId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: PaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Payment>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            paymentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Payment> =
            retrieve(paymentId, PaymentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /payments`, but is otherwise the same as
         * [PaymentServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: PaymentListParams = PaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<PaymentListPageAsync> =
            list(PaymentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /payments/{payment_id}/line-items`, but is otherwise
         * the same as [PaymentServiceAsync.retrieveLineItems].
         */
        @MustBeClosed
        suspend fun retrieveLineItems(
            paymentId: String,
            params: PaymentRetrieveLineItemsParams = PaymentRetrieveLineItemsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentRetrieveLineItemsResponse> =
            retrieveLineItems(params.toBuilder().paymentId(paymentId).build(), requestOptions)

        /** @see retrieveLineItems */
        @MustBeClosed
        suspend fun retrieveLineItems(
            params: PaymentRetrieveLineItemsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentRetrieveLineItemsResponse>

        /** @see retrieveLineItems */
        @MustBeClosed
        suspend fun retrieveLineItems(
            paymentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentRetrieveLineItemsResponse> =
            retrieveLineItems(paymentId, PaymentRetrieveLineItemsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /payments/{payment_id}/retry`, but is otherwise the
         * same as [PaymentServiceAsync.retrieveRetryState].
         */
        @MustBeClosed
        suspend fun retrieveRetryState(
            paymentId: String,
            params: PaymentRetrieveRetryStateParams = PaymentRetrieveRetryStateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManualRetryState> =
            retrieveRetryState(params.toBuilder().paymentId(paymentId).build(), requestOptions)

        /** @see retrieveRetryState */
        @MustBeClosed
        suspend fun retrieveRetryState(
            params: PaymentRetrieveRetryStateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManualRetryState>

        /** @see retrieveRetryState */
        @MustBeClosed
        suspend fun retrieveRetryState(
            paymentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ManualRetryState> =
            retrieveRetryState(paymentId, PaymentRetrieveRetryStateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /payments/{payment_id}/retry`, but is otherwise the
         * same as [PaymentServiceAsync.retry].
         */
        @MustBeClosed
        suspend fun retry(
            paymentId: String,
            params: PaymentRetryParams = PaymentRetryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManualRetry> =
            retry(params.toBuilder().paymentId(paymentId).build(), requestOptions)

        /** @see retry */
        @MustBeClosed
        suspend fun retry(
            params: PaymentRetryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManualRetry>

        /** @see retry */
        @MustBeClosed
        suspend fun retry(
            paymentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ManualRetry> =
            retry(paymentId, PaymentRetryParams.none(), requestOptions)
    }
}
