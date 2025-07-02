// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.discounts.Discount
import com.dodopayments.api.models.discounts.DiscountCreateParams
import com.dodopayments.api.models.discounts.DiscountDeleteParams
import com.dodopayments.api.models.discounts.DiscountListPage
import com.dodopayments.api.models.discounts.DiscountListParams
import com.dodopayments.api.models.discounts.DiscountRetrieveParams
import com.dodopayments.api.models.discounts.DiscountUpdateParams
import com.google.errorprone.annotations.MustBeClosed

interface DiscountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DiscountService

    /**
     * POST /discounts If `code` is omitted or empty, a random 16-char uppercase code is generated.
     */
    fun create(
        params: DiscountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Discount

    /** GET /discounts/{discount_id} */
    fun retrieve(
        discountId: String,
        params: DiscountRetrieveParams = DiscountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Discount = retrieve(params.toBuilder().discountId(discountId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: DiscountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Discount

    /** @see [retrieve] */
    fun retrieve(discountId: String, requestOptions: RequestOptions): Discount =
        retrieve(discountId, DiscountRetrieveParams.none(), requestOptions)

    /** PATCH /discounts/{discount_id} */
    fun update(
        discountId: String,
        params: DiscountUpdateParams = DiscountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Discount = update(params.toBuilder().discountId(discountId).build(), requestOptions)

    /** @see [update] */
    fun update(
        params: DiscountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Discount

    /** @see [update] */
    fun update(discountId: String, requestOptions: RequestOptions): Discount =
        update(discountId, DiscountUpdateParams.none(), requestOptions)

    /** GET /discounts */
    fun list(
        params: DiscountListParams = DiscountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DiscountListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): DiscountListPage =
        list(DiscountListParams.none(), requestOptions)

    /** DELETE /discounts/{discount_id} */
    fun delete(
        discountId: String,
        params: DiscountDeleteParams = DiscountDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().discountId(discountId).build(), requestOptions)

    /** @see [delete] */
    fun delete(params: DiscountDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see [delete] */
    fun delete(discountId: String, requestOptions: RequestOptions) =
        delete(discountId, DiscountDeleteParams.none(), requestOptions)

    /** A view of [DiscountService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DiscountService.WithRawResponse

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
            discountId: String,
            params: DiscountRetrieveParams = DiscountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Discount> =
            retrieve(params.toBuilder().discountId(discountId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: DiscountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Discount>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            discountId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Discount> =
            retrieve(discountId, DiscountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /discounts/{discount_id}`, but is otherwise the
         * same as [DiscountService.update].
         */
        @MustBeClosed
        fun update(
            discountId: String,
            params: DiscountUpdateParams = DiscountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Discount> =
            update(params.toBuilder().discountId(discountId).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: DiscountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Discount>

        /** @see [update] */
        @MustBeClosed
        fun update(discountId: String, requestOptions: RequestOptions): HttpResponseFor<Discount> =
            update(discountId, DiscountUpdateParams.none(), requestOptions)

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
            discountId: String,
            params: DiscountDeleteParams = DiscountDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().discountId(discountId).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: DiscountDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [delete] */
        @MustBeClosed
        fun delete(discountId: String, requestOptions: RequestOptions): HttpResponse =
            delete(discountId, DiscountDeleteParams.none(), requestOptions)
    }
}
