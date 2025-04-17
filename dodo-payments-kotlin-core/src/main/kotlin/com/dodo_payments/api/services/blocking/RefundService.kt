// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.blocking

import com.dodo_payments.api.core.RequestOptions
import com.dodo_payments.api.core.http.HttpResponseFor
import com.dodo_payments.api.models.refunds.Refund
import com.dodo_payments.api.models.refunds.RefundCreateParams
import com.dodo_payments.api.models.refunds.RefundListPage
import com.dodo_payments.api.models.refunds.RefundListParams
import com.dodo_payments.api.models.refunds.RefundRetrieveParams
import com.google.errorprone.annotations.MustBeClosed

interface RefundService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun create(
        params: RefundCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Refund

    fun retrieve(
        params: RefundRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Refund

    fun list(
        params: RefundListParams = RefundListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RefundListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): RefundListPage =
        list(RefundListParams.none(), requestOptions)

    /** A view of [RefundService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /refunds`, but is otherwise the same as
         * [RefundService.create].
         */
        @MustBeClosed
        fun create(
            params: RefundCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Refund>

        /**
         * Returns a raw HTTP response for `get /refunds/{refund_id}`, but is otherwise the same as
         * [RefundService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: RefundRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Refund>

        /**
         * Returns a raw HTTP response for `get /refunds`, but is otherwise the same as
         * [RefundService.list].
         */
        @MustBeClosed
        fun list(
            params: RefundListParams = RefundListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RefundListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<RefundListPage> =
            list(RefundListParams.none(), requestOptions)
    }
}
