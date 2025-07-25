// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

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
import com.dodopayments.api.models.discounts.Discount
import com.dodopayments.api.models.discounts.DiscountCreateParams
import com.dodopayments.api.models.discounts.DiscountDeleteParams
import com.dodopayments.api.models.discounts.DiscountListPageAsync
import com.dodopayments.api.models.discounts.DiscountListPageResponse
import com.dodopayments.api.models.discounts.DiscountListParams
import com.dodopayments.api.models.discounts.DiscountRetrieveParams
import com.dodopayments.api.models.discounts.DiscountUpdateParams

class DiscountServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DiscountServiceAsync {

    private val withRawResponse: DiscountServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DiscountServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DiscountServiceAsync =
        DiscountServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: DiscountCreateParams,
        requestOptions: RequestOptions,
    ): Discount =
        // post /discounts
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: DiscountRetrieveParams,
        requestOptions: RequestOptions,
    ): Discount =
        // get /discounts/{discount_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: DiscountUpdateParams,
        requestOptions: RequestOptions,
    ): Discount =
        // patch /discounts/{discount_id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: DiscountListParams,
        requestOptions: RequestOptions,
    ): DiscountListPageAsync =
        // get /discounts
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(params: DiscountDeleteParams, requestOptions: RequestOptions) {
        // delete /discounts/{discount_id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DiscountServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DiscountServiceAsync.WithRawResponse =
            DiscountServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<Discount> =
            jsonHandler<Discount>(clientOptions.jsonMapper)

        override suspend fun create(
            params: DiscountCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Discount> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("discounts")
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

        private val retrieveHandler: Handler<Discount> =
            jsonHandler<Discount>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: DiscountRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Discount> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("discountId", params.discountId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("discounts", params._pathParam(0))
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

        private val updateHandler: Handler<Discount> =
            jsonHandler<Discount>(clientOptions.jsonMapper)

        override suspend fun update(
            params: DiscountUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Discount> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("discountId", params.discountId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("discounts", params._pathParam(0))
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

        private val listHandler: Handler<DiscountListPageResponse> =
            jsonHandler<DiscountListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: DiscountListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DiscountListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("discounts")
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
                    .let {
                        DiscountListPageAsync.builder()
                            .service(DiscountServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override suspend fun delete(
            params: DiscountDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("discountId", params.discountId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("discounts", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
