// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
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

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DiscountServiceAsync

    /**
     * POST /discounts If `code` is omitted or empty, a random 16-char uppercase code is generated.
     */
    suspend fun create(
        params: DiscountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Discount

    /** GET /discounts/{discount_id} */
    suspend fun retrieve(
        discountId: String,
        params: DiscountRetrieveParams = DiscountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Discount = retrieve(params.toBuilder().discountId(discountId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: DiscountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Discount

    /** @see retrieve */
    suspend fun retrieve(discountId: String, requestOptions: RequestOptions): Discount =
        retrieve(discountId, DiscountRetrieveParams.none(), requestOptions)

    /** PATCH /discounts/{discount_id} */
    suspend fun update(
        discountId: String,
        params: DiscountUpdateParams = DiscountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Discount = update(params.toBuilder().discountId(discountId).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: DiscountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Discount

    /** @see update */
    suspend fun update(discountId: String, requestOptions: RequestOptions): Discount =
        update(discountId, DiscountUpdateParams.none(), requestOptions)

    /** GET /discounts */
    suspend fun list(
        params: DiscountListParams = DiscountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DiscountListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): DiscountListPageAsync =
        list(DiscountListParams.none(), requestOptions)

    /** DELETE /discounts/{discount_id} */
    suspend fun delete(
        discountId: String,
        params: DiscountDeleteParams = DiscountDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().discountId(discountId).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: DiscountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    suspend fun delete(discountId: String, requestOptions: RequestOptions) =
        delete(discountId, DiscountDeleteParams.none(), requestOptions)

    /**
     * A view of [DiscountServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DiscountServiceAsync.WithRawResponse

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
            discountId: String,
            params: DiscountRetrieveParams = DiscountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Discount> =
            retrieve(params.toBuilder().discountId(discountId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: DiscountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Discount>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            discountId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Discount> =
            retrieve(discountId, DiscountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /discounts/{discount_id}`, but is otherwise the
         * same as [DiscountServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            discountId: String,
            params: DiscountUpdateParams = DiscountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Discount> =
            update(params.toBuilder().discountId(discountId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: DiscountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Discount>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            discountId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Discount> =
            update(discountId, DiscountUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /discounts`, but is otherwise the same as
         * [DiscountServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: DiscountListParams = DiscountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DiscountListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<DiscountListPageAsync> =
            list(DiscountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /discounts/{discount_id}`, but is otherwise the
         * same as [DiscountServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            discountId: String,
            params: DiscountDeleteParams = DiscountDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().discountId(discountId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: DiscountDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        suspend fun delete(discountId: String, requestOptions: RequestOptions): HttpResponse =
            delete(discountId, DiscountDeleteParams.none(), requestOptions)
    }
}
