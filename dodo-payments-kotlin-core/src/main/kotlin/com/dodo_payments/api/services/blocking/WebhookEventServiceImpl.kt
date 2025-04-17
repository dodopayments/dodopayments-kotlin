// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.blocking

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
import com.dodo_payments.api.core.prepare
import com.dodo_payments.api.errors.DodoPaymentsError
import com.dodo_payments.api.models.webhookevents.WebhookEvent
import com.dodo_payments.api.models.webhookevents.WebhookEventListPage
import com.dodo_payments.api.models.webhookevents.WebhookEventListParams
import com.dodo_payments.api.models.webhookevents.WebhookEventRetrieveParams

class WebhookEventServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WebhookEventService {

    private val withRawResponse: WebhookEventService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WebhookEventService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: WebhookEventRetrieveParams,
        requestOptions: RequestOptions,
    ): WebhookEvent =
        // get /webhook_events/{webhook_event_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: WebhookEventListParams,
        requestOptions: RequestOptions,
    ): WebhookEventListPage =
        // get /webhook_events
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WebhookEventService.WithRawResponse {

        private val errorHandler: Handler<DodoPaymentsError> =
            errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<WebhookEvent> =
            jsonHandler<WebhookEvent>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: WebhookEventRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookEvent> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("webhook_events", params.getPathParam(0))
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

        private val listHandler: Handler<WebhookEventListPage.Response> =
            jsonHandler<WebhookEventListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: WebhookEventListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookEventListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("webhook_events")
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
                        WebhookEventListPage.of(WebhookEventServiceImpl(clientOptions), params, it)
                    }
            }
        }
    }
}
