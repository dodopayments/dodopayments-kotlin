// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

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
import com.dodopayments.api.core.http.parseable
import com.dodopayments.api.core.prepare
import com.dodopayments.api.models.appinstallation.AppInstallationRetrieveSettingsParams
import com.dodopayments.api.models.appinstallation.AppInstallationRetrieveSettingsResponse

class AppInstallationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AppInstallationService {

    private val withRawResponse: AppInstallationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AppInstallationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AppInstallationService =
        AppInstallationServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieveSettings(
        params: AppInstallationRetrieveSettingsParams,
        requestOptions: RequestOptions,
    ): AppInstallationRetrieveSettingsResponse =
        // get /app-installation/settings
        withRawResponse().retrieveSettings(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AppInstallationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AppInstallationService.WithRawResponse =
            AppInstallationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveSettingsHandler: Handler<AppInstallationRetrieveSettingsResponse> =
            jsonHandler<AppInstallationRetrieveSettingsResponse>(clientOptions.jsonMapper)

        override fun retrieveSettings(
            params: AppInstallationRetrieveSettingsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AppInstallationRetrieveSettingsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("app-installation", "settings")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveSettingsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
