// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.handlers.emptyHandler
import com.dodopayments.api.core.handlers.errorHandler
import com.dodopayments.api.core.handlers.jsonHandler
import com.dodopayments.api.core.handlers.withErrorHandler
import com.dodopayments.api.core.http.HttpMethod
import com.dodopayments.api.core.http.HttpRequest
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponse.Handler
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.core.http.json
import com.dodopayments.api.core.http.parseable
import com.dodopayments.api.core.prepareAsync
import com.dodopayments.api.errors.DodoPaymentsError
import com.dodopayments.api.models.products.Product
import com.dodopayments.api.models.products.ProductCreateParams
import com.dodopayments.api.models.products.ProductDeleteParams
import com.dodopayments.api.models.products.ProductListPageAsync
import com.dodopayments.api.models.products.ProductListParams
import com.dodopayments.api.models.products.ProductRetrieveParams
import com.dodopayments.api.models.products.ProductUnarchiveParams
import com.dodopayments.api.models.products.ProductUpdateParams
import com.dodopayments.api.services.async.products.ImageServiceAsync
import com.dodopayments.api.services.async.products.ImageServiceAsyncImpl

class ProductServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ProductServiceAsync {

    private val withRawResponse: ProductServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val images: ImageServiceAsync by lazy { ImageServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ProductServiceAsync.WithRawResponse = withRawResponse

    override fun images(): ImageServiceAsync = images

    override suspend fun create(
        params: ProductCreateParams,
        requestOptions: RequestOptions,
    ): Product =
        // post /products
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: ProductRetrieveParams,
        requestOptions: RequestOptions,
    ): Product =
        // get /products/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(params: ProductUpdateParams, requestOptions: RequestOptions) {
        // patch /products/{id}
        withRawResponse().update(params, requestOptions)
    }

    override suspend fun list(
        params: ProductListParams,
        requestOptions: RequestOptions,
    ): ProductListPageAsync =
        // get /products
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(params: ProductDeleteParams, requestOptions: RequestOptions) {
        // delete /products/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override suspend fun unarchive(params: ProductUnarchiveParams, requestOptions: RequestOptions) {
        // post /products/{id}/unarchive
        withRawResponse().unarchive(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ProductServiceAsync.WithRawResponse {

        private val errorHandler: Handler<DodoPaymentsError> =
            errorHandler(clientOptions.jsonMapper)

        private val images: ImageServiceAsync.WithRawResponse by lazy {
            ImageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun images(): ImageServiceAsync.WithRawResponse = images

        private val createHandler: Handler<Product> =
            jsonHandler<Product>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun create(
            params: ProductCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Product> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("products")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<Product> =
            jsonHandler<Product>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: ProductRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Product> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("products", params.getPathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override suspend fun update(
            params: ProductUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("products", params.getPathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { updateHandler.handle(it) } }
        }

        private val listHandler: Handler<ProductListPageAsync.Response> =
            jsonHandler<ProductListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: ProductListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProductListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("products")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        ProductListPageAsync.of(ProductServiceAsyncImpl(clientOptions), params, it)
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override suspend fun delete(
            params: ProductDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("products", params.getPathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { deleteHandler.handle(it) } }
        }

        private val unarchiveHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override suspend fun unarchive(
            params: ProductUnarchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("products", params.getPathParam(0), "unarchive")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { unarchiveHandler.handle(it) } }
        }
    }
}
