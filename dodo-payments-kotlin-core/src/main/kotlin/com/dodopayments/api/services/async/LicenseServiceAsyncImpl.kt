// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
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
import com.dodopayments.api.core.prepareAsync
import com.dodopayments.api.errors.DodoPaymentsError
import com.dodopayments.api.models.licensekeyinstances.LicenseKeyInstance
import com.dodopayments.api.models.licenses.LicenseActivateParams
import com.dodopayments.api.models.licenses.LicenseDeactivateParams
import com.dodopayments.api.models.licenses.LicenseValidateParams
import com.dodopayments.api.models.licenses.LicenseValidateResponse

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
