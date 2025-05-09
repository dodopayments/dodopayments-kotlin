// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.checkRequired
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
import com.dodopayments.api.models.discounts.Discount
import com.dodopayments.api.models.discounts.DiscountCreateParams
import com.dodopayments.api.models.discounts.DiscountDeleteParams
import com.dodopayments.api.models.discounts.DiscountListPage
import com.dodopayments.api.models.discounts.DiscountListPageResponse
import com.dodopayments.api.models.discounts.DiscountListParams
import com.dodopayments.api.models.discounts.DiscountRetrieveParams
import com.dodopayments.api.models.discounts.DiscountUpdateParams

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

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

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
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("discountId", params.discountId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("discounts", params._pathParam(0))
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
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("discountId", params.discountId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("discounts", params._pathParam(0))
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

        private val listHandler: Handler<DiscountListPageResponse> =
            jsonHandler<DiscountListPageResponse>(clientOptions.jsonMapper)
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
                    .let {
                        DiscountListPage.builder()
                            .service(DiscountServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun delete(
            params: DiscountDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("discountId", params.discountId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("discounts", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { deleteHandler.handle(it) } }
        }
    }
}
