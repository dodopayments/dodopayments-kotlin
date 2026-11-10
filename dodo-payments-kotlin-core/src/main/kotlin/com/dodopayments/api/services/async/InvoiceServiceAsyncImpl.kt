// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

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
import com.dodopayments.api.core.http.json
import com.dodopayments.api.core.http.parseable
import com.dodopayments.api.core.prepareAsync
import com.dodopayments.api.models.invoices.Invoice
import com.dodopayments.api.models.invoices.InvoiceAddNoteParams
import com.dodopayments.api.models.invoices.InvoiceCreateHostedLinkParams
import com.dodopayments.api.models.invoices.InvoiceCreateHostedLinkResponse
import com.dodopayments.api.models.invoices.InvoiceCreateParams
import com.dodopayments.api.models.invoices.InvoiceDeleteParams
import com.dodopayments.api.models.invoices.InvoiceDuplicateParams
import com.dodopayments.api.models.invoices.InvoiceFinalizeParams
import com.dodopayments.api.models.invoices.InvoiceListEventsParams
import com.dodopayments.api.models.invoices.InvoiceListEventsResponse
import com.dodopayments.api.models.invoices.InvoiceListPageAsync
import com.dodopayments.api.models.invoices.InvoiceListPageResponse
import com.dodopayments.api.models.invoices.InvoiceListParams
import com.dodopayments.api.models.invoices.InvoiceMarkUncollectableParams
import com.dodopayments.api.models.invoices.InvoicePreviewExistingParams
import com.dodopayments.api.models.invoices.InvoicePreviewParams
import com.dodopayments.api.models.invoices.InvoiceRetrieveParams
import com.dodopayments.api.models.invoices.InvoiceRetryParams
import com.dodopayments.api.models.invoices.InvoiceSendParams
import com.dodopayments.api.models.invoices.InvoiceUpdateDunningParams
import com.dodopayments.api.models.invoices.InvoiceUpdateParams
import com.dodopayments.api.models.invoices.InvoiceVoidParams
import com.dodopayments.api.services.async.invoices.PaymentServiceAsync
import com.dodopayments.api.services.async.invoices.PaymentServiceAsyncImpl

class InvoiceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    InvoiceServiceAsync {

    private val withRawResponse: InvoiceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val payments: PaymentServiceAsync by lazy { PaymentServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): InvoiceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InvoiceServiceAsync =
        InvoiceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun payments(): PaymentServiceAsync = payments

    override suspend fun create(
        params: InvoiceCreateParams,
        requestOptions: RequestOptions,
    ): Invoice =
        // post /billing/invoices
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: InvoiceRetrieveParams,
        requestOptions: RequestOptions,
    ): Invoice =
        // get /billing/invoices/{invoice_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: InvoiceUpdateParams,
        requestOptions: RequestOptions,
    ): Invoice =
        // patch /billing/invoices/{invoice_id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: InvoiceListParams,
        requestOptions: RequestOptions,
    ): InvoiceListPageAsync =
        // get /billing/invoices
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(params: InvoiceDeleteParams, requestOptions: RequestOptions) {
        // delete /billing/invoices/{invoice_id}
        withRawResponse().delete(params, requestOptions)
    }

    override suspend fun addNote(
        params: InvoiceAddNoteParams,
        requestOptions: RequestOptions,
    ): Invoice =
        // post /billing/invoices/{invoice_id}/notes
        withRawResponse().addNote(params, requestOptions).parse()

    override suspend fun createHostedLink(
        params: InvoiceCreateHostedLinkParams,
        requestOptions: RequestOptions,
    ): InvoiceCreateHostedLinkResponse =
        // post /billing/invoices/{invoice_id}/hosted-link
        withRawResponse().createHostedLink(params, requestOptions).parse()

    override suspend fun duplicate(
        params: InvoiceDuplicateParams,
        requestOptions: RequestOptions,
    ): Invoice =
        // post /billing/invoices/{invoice_id}/duplicate
        withRawResponse().duplicate(params, requestOptions).parse()

    override suspend fun finalize(
        params: InvoiceFinalizeParams,
        requestOptions: RequestOptions,
    ): Invoice =
        // post /billing/invoices/{invoice_id}/finalize
        withRawResponse().finalize(params, requestOptions).parse()

    override suspend fun listEvents(
        params: InvoiceListEventsParams,
        requestOptions: RequestOptions,
    ): InvoiceListEventsResponse =
        // get /billing/invoices/{invoice_id}/events
        withRawResponse().listEvents(params, requestOptions).parse()

    override suspend fun markUncollectable(
        params: InvoiceMarkUncollectableParams,
        requestOptions: RequestOptions,
    ): Invoice =
        // post /billing/invoices/{invoice_id}/mark-uncollectable
        withRawResponse().markUncollectable(params, requestOptions).parse()

    override suspend fun preview(
        params: InvoicePreviewParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // post /billing/invoices/preview
        withRawResponse().preview(params, requestOptions)

    override suspend fun previewExisting(
        params: InvoicePreviewExistingParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /billing/invoices/{invoice_id}/preview
        withRawResponse().previewExisting(params, requestOptions)

    override suspend fun retry(
        params: InvoiceRetryParams,
        requestOptions: RequestOptions,
    ): Invoice =
        // post /billing/invoices/{invoice_id}/retry
        withRawResponse().retry(params, requestOptions).parse()

    override suspend fun send(params: InvoiceSendParams, requestOptions: RequestOptions): Invoice =
        // post /billing/invoices/{invoice_id}/send
        withRawResponse().send(params, requestOptions).parse()

    override suspend fun updateDunning(
        params: InvoiceUpdateDunningParams,
        requestOptions: RequestOptions,
    ): Invoice =
        // post /billing/invoices/{invoice_id}/dunning
        withRawResponse().updateDunning(params, requestOptions).parse()

    override suspend fun void(params: InvoiceVoidParams, requestOptions: RequestOptions): Invoice =
        // post /billing/invoices/{invoice_id}/void
        withRawResponse().void(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InvoiceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val payments: PaymentServiceAsync.WithRawResponse by lazy {
            PaymentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): InvoiceServiceAsync.WithRawResponse =
            InvoiceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun payments(): PaymentServiceAsync.WithRawResponse = payments

        private val createHandler: Handler<Invoice> = jsonHandler<Invoice>(clientOptions.jsonMapper)

        override suspend fun create(
            params: InvoiceCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Invoice> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("billing", "invoices")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<Invoice> =
            jsonHandler<Invoice>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: InvoiceRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Invoice> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("invoiceId", params.invoiceId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("billing", "invoices", params._pathParam(0))
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

        private val updateHandler: Handler<Invoice> = jsonHandler<Invoice>(clientOptions.jsonMapper)

        override suspend fun update(
            params: InvoiceUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Invoice> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("invoiceId", params.invoiceId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("billing", "invoices", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<InvoiceListPageResponse> =
            jsonHandler<InvoiceListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: InvoiceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InvoiceListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("billing", "invoices")
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
                        InvoiceListPageAsync.builder()
                            .service(InvoiceServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override suspend fun delete(
            params: InvoiceDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("invoiceId", params.invoiceId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("billing", "invoices", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val addNoteHandler: Handler<Invoice> =
            jsonHandler<Invoice>(clientOptions.jsonMapper)

        override suspend fun addNote(
            params: InvoiceAddNoteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Invoice> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("invoiceId", params.invoiceId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("billing", "invoices", params._pathParam(0), "notes")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { addNoteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createHostedLinkHandler: Handler<InvoiceCreateHostedLinkResponse> =
            jsonHandler<InvoiceCreateHostedLinkResponse>(clientOptions.jsonMapper)

        override suspend fun createHostedLink(
            params: InvoiceCreateHostedLinkParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InvoiceCreateHostedLinkResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("invoiceId", params.invoiceId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("billing", "invoices", params._pathParam(0), "hosted-link")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHostedLinkHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val duplicateHandler: Handler<Invoice> =
            jsonHandler<Invoice>(clientOptions.jsonMapper)

        override suspend fun duplicate(
            params: InvoiceDuplicateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Invoice> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("invoiceId", params.invoiceId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("billing", "invoices", params._pathParam(0), "duplicate")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { duplicateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val finalizeHandler: Handler<Invoice> =
            jsonHandler<Invoice>(clientOptions.jsonMapper)

        override suspend fun finalize(
            params: InvoiceFinalizeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Invoice> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("invoiceId", params.invoiceId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("billing", "invoices", params._pathParam(0), "finalize")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { finalizeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listEventsHandler: Handler<InvoiceListEventsResponse> =
            jsonHandler<InvoiceListEventsResponse>(clientOptions.jsonMapper)

        override suspend fun listEvents(
            params: InvoiceListEventsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InvoiceListEventsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("invoiceId", params.invoiceId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("billing", "invoices", params._pathParam(0), "events")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listEventsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val markUncollectableHandler: Handler<Invoice> =
            jsonHandler<Invoice>(clientOptions.jsonMapper)

        override suspend fun markUncollectable(
            params: InvoiceMarkUncollectableParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Invoice> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("invoiceId", params.invoiceId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "billing",
                        "invoices",
                        params._pathParam(0),
                        "mark-uncollectable",
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { markUncollectableHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        override suspend fun preview(
            params: InvoicePreviewParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("billing", "invoices", "preview")
                    .putHeader("Accept", "application/pdf")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response)
        }

        override suspend fun previewExisting(
            params: InvoicePreviewExistingParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("invoiceId", params.invoiceId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("billing", "invoices", params._pathParam(0), "preview")
                    .putHeader("Accept", "application/pdf")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val retryHandler: Handler<Invoice> = jsonHandler<Invoice>(clientOptions.jsonMapper)

        override suspend fun retry(
            params: InvoiceRetryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Invoice> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("invoiceId", params.invoiceId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("billing", "invoices", params._pathParam(0), "retry")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val sendHandler: Handler<Invoice> = jsonHandler<Invoice>(clientOptions.jsonMapper)

        override suspend fun send(
            params: InvoiceSendParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Invoice> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("invoiceId", params.invoiceId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("billing", "invoices", params._pathParam(0), "send")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { sendHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateDunningHandler: Handler<Invoice> =
            jsonHandler<Invoice>(clientOptions.jsonMapper)

        override suspend fun updateDunning(
            params: InvoiceUpdateDunningParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Invoice> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("invoiceId", params.invoiceId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("billing", "invoices", params._pathParam(0), "dunning")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateDunningHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val voidHandler: Handler<Invoice> = jsonHandler<Invoice>(clientOptions.jsonMapper)

        override suspend fun void(
            params: InvoiceVoidParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Invoice> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("invoiceId", params.invoiceId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("billing", "invoices", params._pathParam(0), "void")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { voidHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
