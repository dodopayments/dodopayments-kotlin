// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

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
import com.dodopayments.api.models.productcollections.ProductCollectionCreateParams
import com.dodopayments.api.models.productcollections.ProductCollectionCreateResponse
import com.dodopayments.api.models.productcollections.ProductCollectionDeleteParams
import com.dodopayments.api.models.productcollections.ProductCollectionListPage
import com.dodopayments.api.models.productcollections.ProductCollectionListPageResponse
import com.dodopayments.api.models.productcollections.ProductCollectionListParams
import com.dodopayments.api.models.productcollections.ProductCollectionRetrieveParams
import com.dodopayments.api.models.productcollections.ProductCollectionRetrieveResponse
import com.dodopayments.api.models.productcollections.ProductCollectionUnarchiveParams
import com.dodopayments.api.models.productcollections.ProductCollectionUnarchiveResponse
import com.dodopayments.api.models.productcollections.ProductCollectionUpdateImagesParams
import com.dodopayments.api.models.productcollections.ProductCollectionUpdateImagesResponse
import com.dodopayments.api.models.productcollections.ProductCollectionUpdateParams
import com.dodopayments.api.services.blocking.productcollections.GroupService
import com.dodopayments.api.services.blocking.productcollections.GroupServiceImpl

class ProductCollectionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ProductCollectionService {

    private val withRawResponse: ProductCollectionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val groups: GroupService by lazy { GroupServiceImpl(clientOptions) }

    override fun withRawResponse(): ProductCollectionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ProductCollectionService =
        ProductCollectionServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun groups(): GroupService = groups

    override fun create(
        params: ProductCollectionCreateParams,
        requestOptions: RequestOptions,
    ): ProductCollectionCreateResponse =
        // post /product-collections
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ProductCollectionRetrieveParams,
        requestOptions: RequestOptions,
    ): ProductCollectionRetrieveResponse =
        // get /product-collections/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: ProductCollectionUpdateParams, requestOptions: RequestOptions) {
        // patch /product-collections/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(
        params: ProductCollectionListParams,
        requestOptions: RequestOptions,
    ): ProductCollectionListPage =
        // get /product-collections
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: ProductCollectionDeleteParams, requestOptions: RequestOptions) {
        // delete /product-collections/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun unarchive(
        params: ProductCollectionUnarchiveParams,
        requestOptions: RequestOptions,
    ): ProductCollectionUnarchiveResponse =
        // post /product-collections/{id}/unarchive
        withRawResponse().unarchive(params, requestOptions).parse()

    override fun updateImages(
        params: ProductCollectionUpdateImagesParams,
        requestOptions: RequestOptions,
    ): ProductCollectionUpdateImagesResponse =
        // put /product-collections/{id}/images
        withRawResponse().updateImages(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ProductCollectionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val groups: GroupService.WithRawResponse by lazy {
            GroupServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ProductCollectionService.WithRawResponse =
            ProductCollectionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun groups(): GroupService.WithRawResponse = groups

        private val createHandler: Handler<ProductCollectionCreateResponse> =
            jsonHandler<ProductCollectionCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ProductCollectionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProductCollectionCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("product-collections")
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

        private val retrieveHandler: Handler<ProductCollectionRetrieveResponse> =
            jsonHandler<ProductCollectionRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ProductCollectionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProductCollectionRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("product-collections", params._pathParam(0))
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

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(
            params: ProductCollectionUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("product-collections", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<ProductCollectionListPageResponse> =
            jsonHandler<ProductCollectionListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ProductCollectionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProductCollectionListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("product-collections")
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
                    .let {
                        ProductCollectionListPage.builder()
                            .service(ProductCollectionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: ProductCollectionDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("product-collections", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val unarchiveHandler: Handler<ProductCollectionUnarchiveResponse> =
            jsonHandler<ProductCollectionUnarchiveResponse>(clientOptions.jsonMapper)

        override fun unarchive(
            params: ProductCollectionUnarchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProductCollectionUnarchiveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("product-collections", params._pathParam(0), "unarchive")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { unarchiveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateImagesHandler: Handler<ProductCollectionUpdateImagesResponse> =
            jsonHandler<ProductCollectionUpdateImagesResponse>(clientOptions.jsonMapper)

        override fun updateImages(
            params: ProductCollectionUpdateImagesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProductCollectionUpdateImagesResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("product-collections", params._pathParam(0), "images")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateImagesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
