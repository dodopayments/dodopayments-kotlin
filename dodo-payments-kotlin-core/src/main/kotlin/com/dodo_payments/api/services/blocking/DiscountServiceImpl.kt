// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.blocking

import com.dodo_payments.api.core.ClientOptions
import com.dodo_payments.api.core.RequestOptions
import com.dodo_payments.api.core.handlers.emptyHandler
import com.dodo_payments.api.core.handlers.errorHandler
import com.dodo_payments.api.core.handlers.jsonHandler
import com.dodo_payments.api.core.handlers.withErrorHandler
import com.dodo_payments.api.core.http.HttpMethod
import com.dodo_payments.api.core.http.HttpRequest
import com.dodo_payments.api.core.http.HttpResponse
import com.dodo_payments.api.core.http.HttpResponse.Handler
import com.dodo_payments.api.core.http.HttpResponseFor
import com.dodo_payments.api.core.http.json
import com.dodo_payments.api.core.http.parseable
import com.dodo_payments.api.core.prepare
import com.dodo_payments.api.errors.DodoPaymentsError
import com.dodo_payments.api.models.discounts.Discount
import com.dodo_payments.api.models.discounts.DiscountCreateParams
import com.dodo_payments.api.models.discounts.DiscountDeleteParams
import com.dodo_payments.api.models.discounts.DiscountListPage
import com.dodo_payments.api.models.discounts.DiscountListParams
import com.dodo_payments.api.models.discounts.DiscountRetrieveParams
import com.dodo_payments.api.models.discounts.DiscountUpdateParams

class DiscountServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DiscountService {

    private val withRawResponse: DiscountService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DiscountService.WithRawResponse = withRawResponse

    override fun create(params: DiscountCreateParams, requestOptions: RequestOptions): Discount =
        // post /discounts
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: DiscountRetrieveParams,
        requestOptions: RequestOptions,
    ): Discount =
        // get /discounts/{discount_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: DiscountUpdateParams, requestOptions: RequestOptions): Discount =
        // patch /discounts/{discount_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: DiscountListParams,
        requestOptions: RequestOptions,
    ): DiscountListPage =
        // get /discounts
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: DiscountDeleteParams, requestOptions: RequestOptions) {
        // delete /discounts/{discount_id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DiscountService.WithRawResponse {

        private val errorHandler: Handler<DodoPaymentsError> =
            errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<Discount> =
            jsonHandler<Discount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: DiscountCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Discount> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("discounts")
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

        private val retrieveHandler: Handler<Discount> =
            jsonHandler<Discount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: DiscountRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Discount> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("discounts", params.getPathParam(0))
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

        private val updateHandler: Handler<Discount> =
            jsonHandler<Discount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: DiscountUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Discount> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("discounts", params.getPathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<DiscountListPage.Response> =
            jsonHandler<DiscountListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: DiscountListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DiscountListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("discounts")
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
                    .let { DiscountListPage.of(DiscountServiceImpl(clientOptions), params, it) }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun delete(
            params: DiscountDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("discounts", params.getPathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { deleteHandler.handle(it) } }
        }
    }
}
