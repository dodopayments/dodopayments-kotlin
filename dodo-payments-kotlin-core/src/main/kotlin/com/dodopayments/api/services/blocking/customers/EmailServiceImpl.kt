// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.customers

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
import com.dodopayments.api.core.http.parseable
import com.dodopayments.api.core.prepare
import com.dodopayments.api.models.customers.emails.EmailBody
import com.dodopayments.api.models.customers.emails.EmailListPage
import com.dodopayments.api.models.customers.emails.EmailListPageResponse
import com.dodopayments.api.models.customers.emails.EmailListParams
import com.dodopayments.api.models.customers.emails.EmailRetrieveBodyParams

class EmailServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EmailService {

    private val withRawResponse: EmailService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EmailService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EmailService =
        EmailServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun list(params: EmailListParams, requestOptions: RequestOptions): EmailListPage =
        // get /customers/{customer_id}/emails
        withRawResponse().list(params, requestOptions).parse()

    override fun retrieveBody(
        params: EmailRetrieveBodyParams,
        requestOptions: RequestOptions,
    ): EmailBody =
        // get /customers/{customer_id}/emails/{email_log_id}/body
        withRawResponse().retrieveBody(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EmailService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): EmailService.WithRawResponse =
            EmailServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val listHandler: Handler<EmailListPageResponse> =
            jsonHandler<EmailListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EmailListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailListPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("customerId", params.customerId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("customers", params._pathParam(0), "emails")
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
                        EmailListPage.builder()
                            .service(EmailServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val retrieveBodyHandler: Handler<EmailBody> =
            jsonHandler<EmailBody>(clientOptions.jsonMapper)

        override fun retrieveBody(
            params: EmailRetrieveBodyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailBody> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("emailLogId", params.emailLogId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "customers",
                        params._pathParam(0),
                        "emails",
                        params._pathParam(1),
                        "body",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveBodyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
