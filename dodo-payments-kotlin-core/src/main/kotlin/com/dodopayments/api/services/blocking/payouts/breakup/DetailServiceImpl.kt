// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.payouts.breakup

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.handlers.emptyHandler
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
import com.dodopayments.api.models.payouts.breakup.details.DetailDownloadCsvParams
import com.dodopayments.api.models.payouts.breakup.details.DetailListPage
import com.dodopayments.api.models.payouts.breakup.details.DetailListPageResponse
import com.dodopayments.api.models.payouts.breakup.details.DetailListParams

class DetailServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DetailService {

    private val withRawResponse: DetailService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DetailService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DetailService =
        DetailServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun list(params: DetailListParams, requestOptions: RequestOptions): DetailListPage =
        // get /payouts/{payout_id}/breakup/details
        withRawResponse().list(params, requestOptions).parse()

    override fun downloadCsv(params: DetailDownloadCsvParams, requestOptions: RequestOptions) {
        // get /payouts/{payout_id}/breakup/details/csv
        withRawResponse().downloadCsv(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DetailService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DetailService.WithRawResponse =
            DetailServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val listHandler: Handler<DetailListPageResponse> =
            jsonHandler<DetailListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: DetailListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DetailListPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("payoutId", params.payoutId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("payouts", params._pathParam(0), "breakup", "details")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        DetailListPage.builder()
                            .service(DetailServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val downloadCsvHandler: Handler<Void?> = emptyHandler()

        override fun downloadCsv(
            params: DetailDownloadCsvParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("payoutId", params.payoutId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("payouts", params._pathParam(0), "breakup", "details", "csv")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { downloadCsvHandler.handle(it) }
            }
        }
    }
}
