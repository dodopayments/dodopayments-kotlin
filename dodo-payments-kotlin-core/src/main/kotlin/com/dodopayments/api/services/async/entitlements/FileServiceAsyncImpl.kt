// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.entitlements

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
import com.dodopayments.api.models.entitlements.files.FileDeleteParams
import com.dodopayments.api.models.entitlements.files.FileUploadParams
import com.dodopayments.api.models.entitlements.files.FileUploadResponse

class FileServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FileServiceAsync {

    private val withRawResponse: FileServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FileServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): FileServiceAsync =
        FileServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun delete(params: FileDeleteParams, requestOptions: RequestOptions) {
        // delete /entitlements/{id}/files/{file_id}
        withRawResponse().delete(params, requestOptions)
    }

    override suspend fun upload(
        params: FileUploadParams,
        requestOptions: RequestOptions,
    ): FileUploadResponse =
        // post /entitlements/{id}/files
        withRawResponse().upload(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FileServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): FileServiceAsync.WithRawResponse =
            FileServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override suspend fun delete(
            params: FileDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fileId", params.fileId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "entitlements",
                        params._pathParam(0),
                        "files",
                        params._pathParam(1),
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val uploadHandler: Handler<FileUploadResponse> =
            jsonHandler<FileUploadResponse>(clientOptions.jsonMapper)

        override suspend fun upload(
            params: FileUploadParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileUploadResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("entitlements", params._pathParam(0), "files")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { uploadHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
