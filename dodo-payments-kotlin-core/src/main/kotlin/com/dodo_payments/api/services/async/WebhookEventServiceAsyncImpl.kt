// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async

import com.dodo_payments.api.core.ClientOptions
import com.dodo_payments.api.core.RequestOptions
import com.dodo_payments.api.core.handlers.errorHandler
import com.dodo_payments.api.core.handlers.jsonHandler
import com.dodo_payments.api.core.handlers.withErrorHandler
import com.dodo_payments.api.core.http.HttpMethod
import com.dodo_payments.api.core.http.HttpRequest
import com.dodo_payments.api.core.http.HttpResponse.Handler
import com.dodo_payments.api.core.http.HttpResponseFor
import com.dodo_payments.api.core.http.parseable
import com.dodo_payments.api.core.prepareAsync
import com.dodo_payments.api.errors.DodoPaymentsError
import com.dodo_payments.api.models.webhookevents.WebhookEvent
import com.dodo_payments.api.models.webhookevents.WebhookEventListPageAsync
import com.dodo_payments.api.models.webhookevents.WebhookEventListParams
import com.dodo_payments.api.models.webhookevents.WebhookEventRetrieveParams

class WebhookEventServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WebhookEventServiceAsync {

    private val withRawResponse: WebhookEventServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WebhookEventServiceAsync.WithRawResponse = withRawResponse

    override suspend fun retrieve(
        params: WebhookEventRetrieveParams,
        requestOptions: RequestOptions,
    ): WebhookEvent =
        // get /webhook_events/{webhook_event_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: WebhookEventListParams,
        requestOptions: RequestOptions,
    ): WebhookEventListPageAsync =
        // get /webhook_events
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WebhookEventServiceAsync.WithRawResponse {

        private val errorHandler: Handler<DodoPaymentsError> =
            errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<WebhookEvent> =
            jsonHandler<WebhookEvent>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: WebhookEventRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookEvent> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("webhook_events", params.getPathParam(0))
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

        private val listHandler: Handler<WebhookEventListPageAsync.Response> =
            jsonHandler<WebhookEventListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: WebhookEventListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookEventListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("webhook_events")
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
                        WebhookEventListPageAsync.of(
                            WebhookEventServiceAsyncImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }
    }
}
