// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.products

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
import com.dodopayments.api.core.prepare
import com.dodopayments.api.models.products.localizedprices.ListLocalizedPricesResponse
import com.dodopayments.api.models.products.localizedprices.LocalizedPrice
import com.dodopayments.api.models.products.localizedprices.LocalizedPriceArchiveParams
import com.dodopayments.api.models.products.localizedprices.LocalizedPriceCreateParams
import com.dodopayments.api.models.products.localizedprices.LocalizedPriceListParams
import com.dodopayments.api.models.products.localizedprices.LocalizedPriceRetrieveParams
import com.dodopayments.api.models.products.localizedprices.LocalizedPriceUpdateParams

class LocalizedPriceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LocalizedPriceService {

    private val withRawResponse: LocalizedPriceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LocalizedPriceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LocalizedPriceService =
        LocalizedPriceServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(
        params: LocalizedPriceCreateParams,
        requestOptions: RequestOptions,
    ): LocalizedPrice =
        // post /products/{product_id}/localized-prices
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: LocalizedPriceRetrieveParams,
        requestOptions: RequestOptions,
    ): LocalizedPrice =
        // get /products/{product_id}/localized-prices/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: LocalizedPriceUpdateParams,
        requestOptions: RequestOptions,
    ): LocalizedPrice =
        // patch /products/{product_id}/localized-prices/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: LocalizedPriceListParams,
        requestOptions: RequestOptions,
    ): ListLocalizedPricesResponse =
        // get /products/{product_id}/localized-prices
        withRawResponse().list(params, requestOptions).parse()

    override fun archive(params: LocalizedPriceArchiveParams, requestOptions: RequestOptions) {
        // delete /products/{product_id}/localized-prices/{id}
        withRawResponse().archive(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LocalizedPriceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LocalizedPriceService.WithRawResponse =
            LocalizedPriceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<LocalizedPrice> =
            jsonHandler<LocalizedPrice>(clientOptions.jsonMapper)

        override fun create(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun retrieve(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun update(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun list(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun archive(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { archiveHandler.handle(it) }
            }
        }
    }
}
