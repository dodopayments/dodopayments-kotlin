// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.products

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

interface LocalizedPriceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LocalizedPriceService

    fun create(
        productId: String,
        params: LocalizedPriceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LocalizedPrice = create(params.toBuilder().productId(productId).build(), requestOptions)

    /** @see create */
    fun create(
        params: LocalizedPriceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LocalizedPrice

    fun retrieve(
        id: String,
        params: LocalizedPriceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LocalizedPrice = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: LocalizedPriceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LocalizedPrice

    fun update(
        id: String,
        params: LocalizedPriceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LocalizedPrice = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: LocalizedPriceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LocalizedPrice

    fun list(
        productId: String,
        params: LocalizedPriceListParams = LocalizedPriceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListLocalizedPricesResponse =
        list(params.toBuilder().productId(productId).build(), requestOptions)

    /** @see list */
    fun list(
        params: LocalizedPriceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListLocalizedPricesResponse

    /** @see list */
    fun list(productId: String, requestOptions: RequestOptions): ListLocalizedPricesResponse =
        list(productId, LocalizedPriceListParams.none(), requestOptions)

    fun archive(
        id: String,
        params: LocalizedPriceArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = archive(params.toBuilder().id(id).build(), requestOptions)

    /** @see archive */
    fun archive(
        params: LocalizedPriceArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [LocalizedPriceService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LocalizedPriceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /products/{product_id}/localized-prices`, but is
         * otherwise the same as [LocalizedPriceService.create].
         */
        @MustBeClosed
        fun create(
            productId: String,
            params: LocalizedPriceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LocalizedPrice> =
            create(params.toBuilder().productId(productId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            params: LocalizedPriceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LocalizedPrice>

        /**
         * Returns a raw HTTP response for `get /products/{product_id}/localized-prices/{id}`, but
         * is otherwise the same as [LocalizedPriceService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: LocalizedPriceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LocalizedPrice> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: LocalizedPriceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LocalizedPrice>

        /**
         * Returns a raw HTTP response for `patch /products/{product_id}/localized-prices/{id}`, but
         * is otherwise the same as [LocalizedPriceService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: LocalizedPriceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LocalizedPrice> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: LocalizedPriceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LocalizedPrice>

        /**
         * Returns a raw HTTP response for `get /products/{product_id}/localized-prices`, but is
         * otherwise the same as [LocalizedPriceService.list].
         */
        @MustBeClosed
        fun list(
            productId: String,
            params: LocalizedPriceListParams = LocalizedPriceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListLocalizedPricesResponse> =
            list(params.toBuilder().productId(productId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            params: LocalizedPriceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListLocalizedPricesResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            productId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ListLocalizedPricesResponse> =
            list(productId, LocalizedPriceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /products/{product_id}/localized-prices/{id}`,
         * but is otherwise the same as [LocalizedPriceService.archive].
         */
        @MustBeClosed
        fun archive(
            id: String,
            params: LocalizedPriceArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = archive(params.toBuilder().id(id).build(), requestOptions)

        /** @see archive */
        @MustBeClosed
        fun archive(
            params: LocalizedPriceArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
