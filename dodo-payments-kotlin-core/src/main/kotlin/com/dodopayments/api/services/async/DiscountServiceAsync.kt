// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.discounts.Discount
import com.dodopayments.api.models.discounts.DiscountCreateParams
import com.dodopayments.api.models.discounts.DiscountDeleteParams
import com.dodopayments.api.models.discounts.DiscountListPageAsync
import com.dodopayments.api.models.discounts.DiscountListParams
import com.dodopayments.api.models.discounts.DiscountRetrieveParams
import com.dodopayments.api.models.discounts.DiscountUpdateParams
import com.google.errorprone.annotations.MustBeClosed

interface DiscountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** If `code` is omitted or empty, a random 16-char uppercase code is generated. */
    suspend fun create(
        params: DiscountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Discount

    /** GET /discounts/{discount_id} */
    suspend fun retrieve(
        params: DiscountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Discount

    /** PATCH /discounts/{discount_id} */
    suspend fun update(
        params: DiscountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Discount

    /** GET /discounts */
    suspend fun list(
        params: DiscountListParams = DiscountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DiscountListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): DiscountListPageAsync =
        list(DiscountListParams.none(), requestOptions)

    /** DELETE /discounts/{discount_id} */
    suspend fun delete(
        params: DiscountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [DiscountServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /discounts`, but is otherwise the same as
         * [DiscountServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: DiscountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Discount>

        /**
         * Returns a raw HTTP response for `get /discounts/{discount_id}`, but is otherwise the same
         * as [DiscountServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: DiscountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Discount>

        /**
         * Returns a raw HTTP response for `patch /discounts/{discount_id}`, but is otherwise the
         * same as [DiscountServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: DiscountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Discount>

        /**
         * Returns a raw HTTP response for `get /discounts`, but is otherwise the same as
         * [DiscountServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: DiscountListParams = DiscountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DiscountListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<DiscountListPageAsync> =
            list(DiscountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /discounts/{discount_id}`, but is otherwise the
         * same as [DiscountServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            params: DiscountDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
