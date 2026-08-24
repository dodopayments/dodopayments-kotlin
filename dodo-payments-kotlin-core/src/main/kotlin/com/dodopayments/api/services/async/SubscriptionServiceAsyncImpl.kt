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
import com.dodopayments.api.models.subscriptions.Subscription
import com.dodopayments.api.models.subscriptions.SubscriptionCancelChangePlanParams
import com.dodopayments.api.models.subscriptions.SubscriptionChangePlanParams
import com.dodopayments.api.models.subscriptions.SubscriptionChangePlanResponse
import com.dodopayments.api.models.subscriptions.SubscriptionChargeParams
import com.dodopayments.api.models.subscriptions.SubscriptionChargeResponse
import com.dodopayments.api.models.subscriptions.SubscriptionCreateParams
import com.dodopayments.api.models.subscriptions.SubscriptionCreateResponse
import com.dodopayments.api.models.subscriptions.SubscriptionListPageAsync
import com.dodopayments.api.models.subscriptions.SubscriptionListPageResponse
import com.dodopayments.api.models.subscriptions.SubscriptionListParams
import com.dodopayments.api.models.subscriptions.SubscriptionPreviewChangePlanParams
import com.dodopayments.api.models.subscriptions.SubscriptionPreviewChangePlanResponse
import com.dodopayments.api.models.subscriptions.SubscriptionRetrieveCreditUsageParams
import com.dodopayments.api.models.subscriptions.SubscriptionRetrieveCreditUsageResponse
import com.dodopayments.api.models.subscriptions.SubscriptionRetrieveParams
import com.dodopayments.api.models.subscriptions.SubscriptionRetrieveUsageHistoryPageAsync
import com.dodopayments.api.models.subscriptions.SubscriptionRetrieveUsageHistoryPageResponse
import com.dodopayments.api.models.subscriptions.SubscriptionRetrieveUsageHistoryParams
import com.dodopayments.api.models.subscriptions.SubscriptionUpdateParams
import com.dodopayments.api.models.subscriptions.SubscriptionUpdatePaymentMethodParams
import com.dodopayments.api.models.subscriptions.SubscriptionUpdatePaymentMethodResponse

class SubscriptionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SubscriptionServiceAsync {

    private val withRawResponse: SubscriptionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SubscriptionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SubscriptionServiceAsync =
        SubscriptionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    @Deprecated("deprecated")
    override suspend fun create(
        params: SubscriptionCreateParams,
        requestOptions: RequestOptions,
    ): SubscriptionCreateResponse =
        // post /subscriptions
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: SubscriptionRetrieveParams,
        requestOptions: RequestOptions,
    ): Subscription =
        // get /subscriptions/{subscription_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: SubscriptionUpdateParams,
        requestOptions: RequestOptions,
    ): Subscription =
        // patch /subscriptions/{subscription_id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: SubscriptionListParams,
        requestOptions: RequestOptions,
    ): SubscriptionListPageAsync =
        // get /subscriptions
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun cancelChangePlan(
        params: SubscriptionCancelChangePlanParams,
        requestOptions: RequestOptions,
    ) {
        // delete /subscriptions/{subscription_id}/change-plan/scheduled
        withRawResponse().cancelChangePlan(params, requestOptions)
    }

    override suspend fun changePlan(
        params: SubscriptionChangePlanParams,
        requestOptions: RequestOptions,
    ): SubscriptionChangePlanResponse =
        // post /subscriptions/{subscription_id}/change-plan
        withRawResponse().changePlan(params, requestOptions).parse()

    override suspend fun charge(
        params: SubscriptionChargeParams,
        requestOptions: RequestOptions,
    ): SubscriptionChargeResponse =
        // post /subscriptions/{subscription_id}/charge
        withRawResponse().charge(params, requestOptions).parse()

    override suspend fun previewChangePlan(
        params: SubscriptionPreviewChangePlanParams,
        requestOptions: RequestOptions,
    ): SubscriptionPreviewChangePlanResponse =
        // post /subscriptions/{subscription_id}/change-plan/preview
        withRawResponse().previewChangePlan(params, requestOptions).parse()

    override suspend fun retrieveCreditUsage(
        params: SubscriptionRetrieveCreditUsageParams,
        requestOptions: RequestOptions,
    ): SubscriptionRetrieveCreditUsageResponse =
        // get /subscriptions/{subscription_id}/credit-usage
        withRawResponse().retrieveCreditUsage(params, requestOptions).parse()

    override suspend fun retrieveUsageHistory(
        params: SubscriptionRetrieveUsageHistoryParams,
        requestOptions: RequestOptions,
    ): SubscriptionRetrieveUsageHistoryPageAsync =
        // get /subscriptions/{subscription_id}/usage-history
        withRawResponse().retrieveUsageHistory(params, requestOptions).parse()

    override suspend fun updatePaymentMethod(
        params: SubscriptionUpdatePaymentMethodParams,
        requestOptions: RequestOptions,
    ): SubscriptionUpdatePaymentMethodResponse =
        // post /subscriptions/{subscription_id}/update-payment-method
        withRawResponse().updatePaymentMethod(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SubscriptionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SubscriptionServiceAsync.WithRawResponse =
            SubscriptionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<SubscriptionCreateResponse> =
            jsonHandler<SubscriptionCreateResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override suspend fun create(
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

        private val retrieveHandler: Handler<Subscription> =
            jsonHandler<Subscription>(clientOptions.jsonMapper)

        override suspend fun retrieve(
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

        private val updateHandler: Handler<Subscription> =
            jsonHandler<Subscription>(clientOptions.jsonMapper)

        override suspend fun update(
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

        private val listHandler: Handler<SubscriptionListPageResponse> =
            jsonHandler<SubscriptionListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: SubscriptionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("subscriptions")
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
                        SubscriptionListPageAsync.builder()
                            .service(SubscriptionServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val cancelChangePlanHandler: Handler<Void?> = emptyHandler()

        override suspend fun cancelChangePlan(
            params: SubscriptionCancelChangePlanParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriptionId", params.subscriptionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "subscriptions",
                        params._pathParam(0),
                        "change-plan",
                        "scheduled",
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { cancelChangePlanHandler.handle(it) }
            }
        }

        private val changePlanHandler: Handler<SubscriptionChangePlanResponse> =
            jsonHandler<SubscriptionChangePlanResponse>(clientOptions.jsonMapper)

        override suspend fun changePlan(
            params: SubscriptionChangePlanParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionChangePlanResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { changePlanHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val chargeHandler: Handler<SubscriptionChargeResponse> =
            jsonHandler<SubscriptionChargeResponse>(clientOptions.jsonMapper)

        override suspend fun charge(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { chargeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val previewChangePlanHandler: Handler<SubscriptionPreviewChangePlanResponse> =
            jsonHandler<SubscriptionPreviewChangePlanResponse>(clientOptions.jsonMapper)

        override suspend fun previewChangePlan(
            params: SubscriptionPreviewChangePlanParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionPreviewChangePlanResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriptionId", params.subscriptionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "subscriptions",
                        params._pathParam(0),
                        "change-plan",
                        "preview",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { previewChangePlanHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveCreditUsageHandler: Handler<SubscriptionRetrieveCreditUsageResponse> =
            jsonHandler<SubscriptionRetrieveCreditUsageResponse>(clientOptions.jsonMapper)

        override suspend fun retrieveCreditUsage(
            params: SubscriptionRetrieveCreditUsageParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionRetrieveCreditUsageResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriptionId", params.subscriptionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("subscriptions", params._pathParam(0), "credit-usage")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveCreditUsageHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveUsageHistoryHandler:
            Handler<SubscriptionRetrieveUsageHistoryPageResponse> =
            jsonHandler<SubscriptionRetrieveUsageHistoryPageResponse>(clientOptions.jsonMapper)

        override suspend fun retrieveUsageHistory(
            params: SubscriptionRetrieveUsageHistoryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionRetrieveUsageHistoryPageAsync> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriptionId", params.subscriptionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("subscriptions", params._pathParam(0), "usage-history")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveUsageHistoryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        SubscriptionRetrieveUsageHistoryPageAsync.builder()
                            .service(SubscriptionServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val updatePaymentMethodHandler: Handler<SubscriptionUpdatePaymentMethodResponse> =
            jsonHandler<SubscriptionUpdatePaymentMethodResponse>(clientOptions.jsonMapper)

        override suspend fun updatePaymentMethod(
            params: SubscriptionUpdatePaymentMethodParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionUpdatePaymentMethodResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriptionId", params.subscriptionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("subscriptions", params._pathParam(0), "update-payment-method")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updatePaymentMethodHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
