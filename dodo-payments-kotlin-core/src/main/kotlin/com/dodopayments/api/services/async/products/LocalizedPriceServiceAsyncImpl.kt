// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.products

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.handlers.emptyHandler
import com.dodopayments.api.core.handlers.errorBodyHandler
import com.dodopayments.api.core.handlers.errorHandler
import com.dodopayments.api.core.handlers.jsonHandler
import com.dodopayments.api.core.http.HttpMethod
import com.dodopayments.api.core.http.HttpRequest
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponse.Handler
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.core.http.json
import com.dodopayments.api.core.http.parseable
import com.dodopayments.api.core.prepareAsync
import com.dodopayments.api.models.products.localizedprices.ListLocalizedPricesResponse
import com.dodopayments.api.models.products.localizedprices.LocalizedPrice
import com.dodopayments.api.models.products.localizedprices.LocalizedPriceArchiveParams
import com.dodopayments.api.models.products.localizedprices.LocalizedPriceCreateParams
import com.dodopayments.api.models.products.localizedprices.LocalizedPriceListParams
import com.dodopayments.api.models.products.localizedprices.LocalizedPriceRetrieveParams
import com.dodopayments.api.models.products.localizedprices.LocalizedPriceUpdateParams

class LocalizedPriceServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : LocalizedPriceServiceAsync {

    private val withRawResponse: LocalizedPriceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LocalizedPriceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): LocalizedPriceServiceAsync =
        LocalizedPriceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: LocalizedPriceCreateParams,
        requestOptions: RequestOptions,
    ): LocalizedPrice =
        // post /products/{product_id}/localized-prices
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: LocalizedPriceRetrieveParams,
        requestOptions: RequestOptions,
    ): LocalizedPrice =
        // get /products/{product_id}/localized-prices/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: LocalizedPriceUpdateParams,
        requestOptions: RequestOptions,
    ): LocalizedPrice =
        // patch /products/{product_id}/localized-prices/{id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: LocalizedPriceListParams,
        requestOptions: RequestOptions,
    ): ListLocalizedPricesResponse =
        // get /products/{product_id}/localized-prices
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun archive(
        params: LocalizedPriceArchiveParams,
        requestOptions: RequestOptions,
    ) {
        // delete /products/{product_id}/localized-prices/{id}
        withRawResponse().archive(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LocalizedPriceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LocalizedPriceServiceAsync.WithRawResponse =
            LocalizedPriceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<LocalizedPrice> =
            jsonHandler<LocalizedPrice>(clientOptions.jsonMapper)

        override suspend fun create(
            params: LocalizedPriceCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LocalizedPrice> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("productId", params.productId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("products", params._pathParam(0), "localized-prices")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<LocalizedPrice> =
            jsonHandler<LocalizedPrice>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: LocalizedPriceRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LocalizedPrice> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "products",
                        params._pathParam(0),
                        "localized-prices",
                        params._pathParam(1),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<LocalizedPrice> =
            jsonHandler<LocalizedPrice>(clientOptions.jsonMapper)

        override suspend fun update(
            params: LocalizedPriceUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LocalizedPrice> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "products",
                        params._pathParam(0),
                        "localized-prices",
                        params._pathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<ListLocalizedPricesResponse> =
            jsonHandler<ListLocalizedPricesResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: LocalizedPriceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ListLocalizedPricesResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("productId", params.productId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("products", params._pathParam(0), "localized-prices")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val archiveHandler: Handler<Void?> = emptyHandler()

        override suspend fun archive(
            params: LocalizedPriceArchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "products",
                        params._pathParam(0),
                        "localized-prices",
                        params._pathParam(1),
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { archiveHandler.handle(it) }
            }
        }
    }
}
