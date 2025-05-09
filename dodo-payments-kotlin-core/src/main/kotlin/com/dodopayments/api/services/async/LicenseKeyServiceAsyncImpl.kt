// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.handlers.errorHandler
import com.dodopayments.api.core.handlers.jsonHandler
import com.dodopayments.api.core.handlers.withErrorHandler
import com.dodopayments.api.core.http.HttpMethod
import com.dodopayments.api.core.http.HttpRequest
import com.dodopayments.api.core.http.HttpResponse.Handler
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.core.http.json
import com.dodopayments.api.core.http.parseable
import com.dodopayments.api.core.prepareAsync
import com.dodopayments.api.models.licensekeys.LicenseKey
import com.dodopayments.api.models.licensekeys.LicenseKeyListPageAsync
import com.dodopayments.api.models.licensekeys.LicenseKeyListPageResponse
import com.dodopayments.api.models.licensekeys.LicenseKeyListParams
import com.dodopayments.api.models.licensekeys.LicenseKeyRetrieveParams
import com.dodopayments.api.models.licensekeys.LicenseKeyUpdateParams

class LicenseKeyServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LicenseKeyServiceAsync {

    private val withRawResponse: LicenseKeyServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LicenseKeyServiceAsync.WithRawResponse = withRawResponse

    override suspend fun retrieve(
        params: LicenseKeyRetrieveParams,
        requestOptions: RequestOptions,
    ): LicenseKey =
        // get /license_keys/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: LicenseKeyUpdateParams,
        requestOptions: RequestOptions,
    ): LicenseKey =
        // patch /license_keys/{id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: LicenseKeyListParams,
        requestOptions: RequestOptions,
    ): LicenseKeyListPageAsync =
        // get /license_keys
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LicenseKeyServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<LicenseKey> =
            jsonHandler<LicenseKey>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: LicenseKeyRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LicenseKey> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("license_keys", params._pathParam(0))
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

        private val updateHandler: Handler<LicenseKey> =
            jsonHandler<LicenseKey>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun update(
            params: LicenseKeyUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LicenseKey> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("license_keys", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val listHandler: Handler<LicenseKeyListPageResponse> =
            jsonHandler<LicenseKeyListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: LicenseKeyListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LicenseKeyListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("license_keys")
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
                        LicenseKeyListPageAsync.builder()
                            .service(LicenseKeyServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
