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
import com.dodo_payments.api.core.http.json
import com.dodo_payments.api.core.http.parseable
import com.dodo_payments.api.core.prepare
import com.dodo_payments.api.errors.DodoPaymentsError
import com.dodo_payments.api.models.licensekeys.LicenseKey
import com.dodo_payments.api.models.licensekeys.LicenseKeyListPage
import com.dodo_payments.api.models.licensekeys.LicenseKeyListParams
import com.dodo_payments.api.models.licensekeys.LicenseKeyRetrieveParams
import com.dodo_payments.api.models.licensekeys.LicenseKeyUpdateParams

class LicenseKeyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LicenseKeyService {

    private val withRawResponse: LicenseKeyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LicenseKeyService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: LicenseKeyRetrieveParams,
        requestOptions: RequestOptions,
    ): LicenseKey =
        // get /license_keys/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: LicenseKeyUpdateParams,
        requestOptions: RequestOptions,
    ): LicenseKey =
        // patch /license_keys/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: LicenseKeyListParams,
        requestOptions: RequestOptions,
    ): LicenseKeyListPage =
        // get /license_keys
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LicenseKeyService.WithRawResponse {

        private val errorHandler: Handler<DodoPaymentsError> =
            errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<LicenseKey> =
            jsonHandler<LicenseKey>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: LicenseKeyRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LicenseKey> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("license_keys", params.getPathParam(0))
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

        private val updateHandler: Handler<LicenseKey> =
            jsonHandler<LicenseKey>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: LicenseKeyUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LicenseKey> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("license_keys", params.getPathParam(0))
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

        private val listHandler: Handler<LicenseKeyListPage.Response> =
            jsonHandler<LicenseKeyListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: LicenseKeyListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LicenseKeyListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("license_keys")
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
                    .let { LicenseKeyListPage.of(LicenseKeyServiceImpl(clientOptions), params, it) }
            }
        }
    }
}
