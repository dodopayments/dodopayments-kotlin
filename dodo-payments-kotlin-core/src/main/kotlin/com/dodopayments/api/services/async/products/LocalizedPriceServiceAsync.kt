// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.products

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.products.localizedprices.ListLocalizedPricesResponse
import com.dodopayments.api.models.products.localizedprices.LocalizedPrice
import com.dodopayments.api.models.products.localizedprices.LocalizedPriceArchiveParams
import com.dodopayments.api.models.products.localizedprices.LocalizedPriceCreateParams
import com.dodopayments.api.models.products.localizedprices.LocalizedPriceListParams
import com.dodopayments.api.models.products.localizedprices.LocalizedPriceRetrieveParams
import com.dodopayments.api.models.products.localizedprices.LocalizedPriceUpdateParams
import com.google.errorprone.annotations.MustBeClosed

interface LocalizedPriceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LocalizedPriceServiceAsync

    suspend fun create(
        productId: String,
        params: LocalizedPriceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LocalizedPrice = create(params.toBuilder().productId(productId).build(), requestOptions)

    /** @see create */
    suspend fun create(
        params: LocalizedPriceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LocalizedPrice

    suspend fun retrieve(
        id: String,
        params: LocalizedPriceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LocalizedPrice = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: LocalizedPriceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LocalizedPrice

    suspend fun update(
        id: String,
        params: LocalizedPriceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LocalizedPrice = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: LocalizedPriceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LocalizedPrice

    suspend fun list(
        productId: String,
        params: LocalizedPriceListParams = LocalizedPriceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListLocalizedPricesResponse =
        list(params.toBuilder().productId(productId).build(), requestOptions)

    /** @see list */
    suspend fun list(
        params: LocalizedPriceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListLocalizedPricesResponse

    /** @see list */
    suspend fun list(
        productId: String,
        requestOptions: RequestOptions,
    ): ListLocalizedPricesResponse =
        list(productId, LocalizedPriceListParams.none(), requestOptions)

    suspend fun archive(
        id: String,
        params: LocalizedPriceArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = archive(params.toBuilder().id(id).build(), requestOptions)

    /** @see archive */
    suspend fun archive(
        params: LocalizedPriceArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [LocalizedPriceServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LocalizedPriceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /products/{product_id}/localized-prices`, but is
         * otherwise the same as [LocalizedPriceServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            productId: String,
            params: LocalizedPriceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LocalizedPrice> =
            create(params.toBuilder().productId(productId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        suspend fun create(
            params: LocalizedPriceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LocalizedPrice>

        /**
         * Returns a raw HTTP response for `get /products/{product_id}/localized-prices/{id}`, but
         * is otherwise the same as [LocalizedPriceServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: LocalizedPriceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LocalizedPrice> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: LocalizedPriceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LocalizedPrice>

        /**
         * Returns a raw HTTP response for `patch /products/{product_id}/localized-prices/{id}`, but
         * is otherwise the same as [LocalizedPriceServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: LocalizedPriceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LocalizedPrice> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: LocalizedPriceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LocalizedPrice>

        /**
         * Returns a raw HTTP response for `get /products/{product_id}/localized-prices`, but is
         * otherwise the same as [LocalizedPriceServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            productId: String,
            params: LocalizedPriceListParams = LocalizedPriceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListLocalizedPricesResponse> =
            list(params.toBuilder().productId(productId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        suspend fun list(
            params: LocalizedPriceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListLocalizedPricesResponse>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            productId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ListLocalizedPricesResponse> =
            list(productId, LocalizedPriceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /products/{product_id}/localized-prices/{id}`,
         * but is otherwise the same as [LocalizedPriceServiceAsync.archive].
         */
        @MustBeClosed
        suspend fun archive(
            id: String,
            params: LocalizedPriceArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = archive(params.toBuilder().id(id).build(), requestOptions)

        /** @see archive */
        @MustBeClosed
        suspend fun archive(
            params: LocalizedPriceArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
