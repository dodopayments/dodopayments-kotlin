// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

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
import com.dodopayments.api.core.prepare
import com.dodopayments.api.errors.DodoPaymentsError
import com.dodopayments.api.models.products.Product
import com.dodopayments.api.models.products.ProductCreateParams
import com.dodopayments.api.models.products.ProductDeleteParams
import com.dodopayments.api.models.products.ProductListPage
import com.dodopayments.api.models.products.ProductListParams
import com.dodopayments.api.models.products.ProductRetrieveParams
import com.dodopayments.api.models.products.ProductUnarchiveParams
import com.dodopayments.api.models.products.ProductUpdateParams
import com.dodopayments.api.services.blocking.products.ImageService
import com.dodopayments.api.services.blocking.products.ImageServiceImpl

class ProductServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ProductService {

    private val withRawResponse: ProductService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val images: ImageService by lazy { ImageServiceImpl(clientOptions) }

    override fun withRawResponse(): ProductService.WithRawResponse = withRawResponse

    override fun images(): ImageService = images

    override fun create(params: ProductCreateParams, requestOptions: RequestOptions): Product =
        // post /products
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: ProductRetrieveParams, requestOptions: RequestOptions): Product =
        // get /products/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: ProductUpdateParams, requestOptions: RequestOptions) {
        // patch /products/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(params: ProductListParams, requestOptions: RequestOptions): ProductListPage =
        // get /products
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: ProductDeleteParams, requestOptions: RequestOptions) {
        // delete /products/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun unarchive(params: ProductUnarchiveParams, requestOptions: RequestOptions) {
        // post /products/{id}/unarchive
        withRawResponse().unarchive(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ProductService.WithRawResponse {

        private val errorHandler: Handler<DodoPaymentsError> =
            errorHandler(clientOptions.jsonMapper)

        private val images: ImageService.WithRawResponse by lazy {
            ImageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun images(): ImageService.WithRawResponse = images

        private val createHandler: Handler<Product> =
            jsonHandler<Product>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: ProductCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Product> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("products")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun retrieve(
            params: ProductRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Product> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("products", params.getPathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun update(
            params: ProductUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("products", params.getPathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { updateHandler.handle(it) } }
        }

        private val listHandler: Handler<ProductListPage.Response> =
            jsonHandler<ProductListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: ProductListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProductListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("products")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let { ProductListPage.of(ProductServiceImpl(clientOptions), params, it) }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun delete(
            params: ProductDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("products", params.getPathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { deleteHandler.handle(it) } }
        }

        private val unarchiveHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun unarchive(
            params: ProductUnarchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("products", params.getPathParam(0), "unarchive")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { unarchiveHandler.handle(it) } }
        }
    }
}
