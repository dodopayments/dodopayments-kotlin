// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
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
import com.dodopayments.api.models.moderation.ModerationRetrieveUsageParams
import com.dodopayments.api.models.moderation.ModerationRetrieveUsageResponse
import com.dodopayments.api.models.moderation.ModerationScreenParams
import com.dodopayments.api.models.moderation.ModerationScreenResponse

class ModerationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ModerationServiceAsync {

    private val withRawResponse: ModerationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ModerationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ModerationServiceAsync =
        ModerationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieveUsage(
        params: ModerationRetrieveUsageParams,
        requestOptions: RequestOptions,
    ): ModerationRetrieveUsageResponse =
        // get /moderation/usage
        withRawResponse().retrieveUsage(params, requestOptions).parse()

    override suspend fun screen(
        params: ModerationScreenParams,
        requestOptions: RequestOptions,
    ): ModerationScreenResponse =
        // post /moderation/screen
        withRawResponse().screen(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ModerationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ModerationServiceAsync.WithRawResponse =
            ModerationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveUsageHandler: Handler<ModerationRetrieveUsageResponse> =
            jsonHandler<ModerationRetrieveUsageResponse>(clientOptions.jsonMapper)

        override suspend fun retrieveUsage(
            params: ModerationRetrieveUsageParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ModerationRetrieveUsageResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("moderation", "usage")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveUsageHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val screenHandler: Handler<ModerationScreenResponse> =
            jsonHandler<ModerationScreenResponse>(clientOptions.jsonMapper)

        override suspend fun screen(
            params: ModerationScreenParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ModerationScreenResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("moderation", "screen")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { screenHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
