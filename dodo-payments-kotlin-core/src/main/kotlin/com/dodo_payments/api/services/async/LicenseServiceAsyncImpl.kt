// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async

import com.dodo_payments.api.core.ClientOptions
import com.dodo_payments.api.core.RequestOptions
import com.dodo_payments.api.core.handlers.emptyHandler
import com.dodo_payments.api.core.handlers.errorHandler
import com.dodo_payments.api.core.handlers.jsonHandler
import com.dodo_payments.api.core.handlers.withErrorHandler
import com.dodo_payments.api.core.http.HttpMethod
import com.dodo_payments.api.core.http.HttpRequest
import com.dodo_payments.api.core.http.HttpResponse
import com.dodo_payments.api.core.http.HttpResponse.Handler
import com.dodo_payments.api.core.http.HttpResponseFor
import com.dodo_payments.api.core.http.json
import com.dodo_payments.api.core.http.parseable
import com.dodo_payments.api.core.prepareAsync
import com.dodo_payments.api.errors.DodoPaymentsError
import com.dodo_payments.api.models.licensekeyinstances.LicenseKeyInstance
import com.dodo_payments.api.models.licenses.LicenseActivateParams
import com.dodo_payments.api.models.licenses.LicenseDeactivateParams
import com.dodo_payments.api.models.licenses.LicenseValidateParams
import com.dodo_payments.api.models.licenses.LicenseValidateResponse

class LicenseServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LicenseServiceAsync {

    private val withRawResponse: LicenseServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LicenseServiceAsync.WithRawResponse = withRawResponse

    override suspend fun activate(
        params: LicenseActivateParams,
        requestOptions: RequestOptions,
    ): LicenseKeyInstance =
        // post /licenses/activate
        withRawResponse().activate(params, requestOptions).parse()

    override suspend fun deactivate(
        params: LicenseDeactivateParams,
        requestOptions: RequestOptions,
    ) {
        // post /licenses/deactivate
        withRawResponse().deactivate(params, requestOptions)
    }

    override suspend fun validate(
        params: LicenseValidateParams,
        requestOptions: RequestOptions,
    ): LicenseValidateResponse =
        // post /licenses/validate
        withRawResponse().validate(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LicenseServiceAsync.WithRawResponse {

        private val errorHandler: Handler<DodoPaymentsError> =
            errorHandler(clientOptions.jsonMapper)

        private val activateHandler: Handler<LicenseKeyInstance> =
            jsonHandler<LicenseKeyInstance>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun activate(
            params: LicenseActivateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LicenseKeyInstance> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("licenses", "activate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { activateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deactivateHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override suspend fun deactivate(
            params: LicenseDeactivateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("licenses", "deactivate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { deactivateHandler.handle(it) } }
        }

        private val validateHandler: Handler<LicenseValidateResponse> =
            jsonHandler<LicenseValidateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun validate(
            params: LicenseValidateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LicenseValidateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("licenses", "validate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { validateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
