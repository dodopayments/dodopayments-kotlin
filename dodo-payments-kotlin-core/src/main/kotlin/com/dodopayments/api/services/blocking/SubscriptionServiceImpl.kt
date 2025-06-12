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
import com.dodopayments.api.models.subscriptions.Subscription
import com.dodopayments.api.models.subscriptions.SubscriptionChangePlanParams
import com.dodopayments.api.models.subscriptions.SubscriptionChargeParams
import com.dodopayments.api.models.subscriptions.SubscriptionChargeResponse
import com.dodopayments.api.models.subscriptions.SubscriptionCreateParams
import com.dodopayments.api.models.subscriptions.SubscriptionCreateResponse
import com.dodopayments.api.models.subscriptions.SubscriptionListPage
import com.dodopayments.api.models.subscriptions.SubscriptionListPageResponse
import com.dodopayments.api.models.subscriptions.SubscriptionListParams
import com.dodopayments.api.models.subscriptions.SubscriptionRetrieveParams
import com.dodopayments.api.models.subscriptions.SubscriptionUpdateParams

class SubscriptionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SubscriptionService {

    private val withRawResponse: SubscriptionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SubscriptionService.WithRawResponse = withRawResponse

    override fun create(
        params: SubscriptionCreateParams,
        requestOptions: RequestOptions,
    ): SubscriptionCreateResponse =
        // post /subscriptions
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: SubscriptionRetrieveParams,
        requestOptions: RequestOptions,
    ): Subscription =
        // get /subscriptions/{subscription_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: SubscriptionUpdateParams,
        requestOptions: RequestOptions,
    ): Subscription =
        // patch /subscriptions/{subscription_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: SubscriptionListParams,
        requestOptions: RequestOptions,
    ): SubscriptionListPage =
        // get /subscriptions
        withRawResponse().list(params, requestOptions).parse()

    override fun changePlan(params: SubscriptionChangePlanParams, requestOptions: RequestOptions) {
        // post /subscriptions/{subscription_id}/change-plan
        withRawResponse().changePlan(params, requestOptions)
    }

    override fun charge(
        params: SubscriptionChargeParams,
        requestOptions: RequestOptions,
    ): SubscriptionChargeResponse =
        // post /subscriptions/{subscription_id}/charge
        withRawResponse().charge(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SubscriptionService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<SubscriptionCreateResponse> =
            jsonHandler<SubscriptionCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: SubscriptionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("subscriptions")
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

        private val retrieveHandler: Handler<Subscription> =
            jsonHandler<Subscription>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: SubscriptionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Subscription> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriptionId", params.subscriptionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("subscriptions", params._pathParam(0))
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

        private val updateHandler: Handler<Subscription> =
            jsonHandler<Subscription>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: SubscriptionUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Subscription> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriptionId", params.subscriptionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("subscriptions", params._pathParam(0))
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

        private val listHandler: Handler<SubscriptionListPageResponse> =
            jsonHandler<SubscriptionListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: SubscriptionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("subscriptions")
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
                        SubscriptionListPage.builder()
                            .service(SubscriptionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val changePlanHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override fun changePlan(
            params: SubscriptionChangePlanParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriptionId", params.subscriptionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("subscriptions", params._pathParam(0), "change-plan")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { changePlanHandler.handle(it) } }
        }

        private val chargeHandler: Handler<SubscriptionChargeResponse> =
            jsonHandler<SubscriptionChargeResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun charge(
            params: SubscriptionChargeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionChargeResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriptionId", params.subscriptionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("subscriptions", params._pathParam(0), "charge")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { chargeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
