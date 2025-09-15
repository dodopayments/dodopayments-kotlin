// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.checkRequired
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
import com.dodopayments.api.models.usageevents.Event
import com.dodopayments.api.models.usageevents.UsageEventIngestParams
import com.dodopayments.api.models.usageevents.UsageEventIngestResponse
import com.dodopayments.api.models.usageevents.UsageEventListPageAsync
import com.dodopayments.api.models.usageevents.UsageEventListPageResponse
import com.dodopayments.api.models.usageevents.UsageEventListParams
import com.dodopayments.api.models.usageevents.UsageEventRetrieveParams

class UsageEventServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UsageEventServiceAsync {

    private val withRawResponse: UsageEventServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UsageEventServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UsageEventServiceAsync =
        UsageEventServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: UsageEventRetrieveParams,
        requestOptions: RequestOptions,
    ): Event =
        // get /events/{event_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: UsageEventListParams,
        requestOptions: RequestOptions,
    ): UsageEventListPageAsync =
        // get /events
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun ingest(
        params: UsageEventIngestParams,
        requestOptions: RequestOptions,
    ): UsageEventIngestResponse =
        // post /events/ingest
        withRawResponse().ingest(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UsageEventServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): UsageEventServiceAsync.WithRawResponse =
            UsageEventServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<Event> = jsonHandler<Event>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: UsageEventRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Event> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventId", params.eventId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", params._pathParam(0))
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

        private val listHandler: Handler<UsageEventListPageResponse> =
            jsonHandler<UsageEventListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: UsageEventListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UsageEventListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events")
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
                        UsageEventListPageAsync.builder()
                            .service(UsageEventServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val ingestHandler: Handler<UsageEventIngestResponse> =
            jsonHandler<UsageEventIngestResponse>(clientOptions.jsonMapper)

        override suspend fun ingest(
            params: UsageEventIngestParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UsageEventIngestResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", "ingest")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { ingestHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
