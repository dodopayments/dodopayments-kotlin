// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.blocking

import com.dodo_payments.api.core.RequestOptions
import com.dodo_payments.api.core.http.HttpResponse
import com.dodo_payments.api.core.http.HttpResponseFor
import com.dodo_payments.api.models.discounts.Discount
import com.dodo_payments.api.models.discounts.DiscountCreateParams
import com.dodo_payments.api.models.discounts.DiscountDeleteParams
import com.dodo_payments.api.models.discounts.DiscountListPage
import com.dodo_payments.api.models.discounts.DiscountListParams
import com.dodo_payments.api.models.discounts.DiscountRetrieveParams
import com.dodo_payments.api.models.discounts.DiscountUpdateParams
import com.google.errorprone.annotations.MustBeClosed

interface DiscountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** If `code` is omitted or empty, a random 16-char uppercase code is generated. */
    fun create(
        params: DiscountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Discount

    /** GET /discounts/{discount_id} */
    fun retrieve(
        params: DiscountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Discount

    /** PATCH /discounts/{discount_id} */
    fun update(
        params: DiscountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Discount

    /** GET /discounts */
    fun list(
        params: DiscountListParams = DiscountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DiscountListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): DiscountListPage =
        list(DiscountListParams.none(), requestOptions)

    /** DELETE /discounts/{discount_id} */
    fun delete(params: DiscountDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [DiscountService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /discounts`, but is otherwise the same as
         * [DiscountService.create].
         */
        @MustBeClosed
        fun create(
            params: DiscountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Discount>

        /**
         * Returns a raw HTTP response for `get /discounts/{discount_id}`, but is otherwise the same
         * as [DiscountService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: DiscountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Discount>

        /**
         * Returns a raw HTTP response for `patch /discounts/{discount_id}`, but is otherwise the
         * same as [DiscountService.update].
         */
        @MustBeClosed
        fun update(
            params: DiscountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Discount>

        /**
         * Returns a raw HTTP response for `get /discounts`, but is otherwise the same as
         * [DiscountService.list].
         */
        @MustBeClosed
        fun list(
            params: DiscountListParams = DiscountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DiscountListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DiscountListPage> =
            list(DiscountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /discounts/{discount_id}`, but is otherwise the
         * same as [DiscountService.delete].
         */
        @MustBeClosed
        fun delete(
            params: DiscountDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
