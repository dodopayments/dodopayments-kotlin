// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.handlers.errorHandler
import com.dodopayments.api.core.handlers.jsonHandler
import com.dodopayments.api.core.handlers.withErrorHandler
import com.dodopayments.api.core.http.HttpMethod
import com.dodopayments.api.core.http.HttpRequest
import com.dodopayments.api.core.http.HttpResponse.Handler
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.core.http.parseable
import com.dodopayments.api.core.prepare
import com.dodopayments.api.errors.DodoPaymentsError
import com.dodopayments.api.models.webhookevents.WebhookEvent
import com.dodopayments.api.models.webhookevents.WebhookEventListPage
import com.dodopayments.api.models.webhookevents.WebhookEventListParams
import com.dodopayments.api.models.webhookevents.WebhookEventRetrieveParams

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
