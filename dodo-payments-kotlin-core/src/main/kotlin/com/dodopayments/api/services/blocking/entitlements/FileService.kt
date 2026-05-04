// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.entitlements

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.entitlements.files.FileDeleteParams
import com.dodopayments.api.models.entitlements.files.FileUploadParams
import com.dodopayments.api.models.entitlements.files.FileUploadResponse
import com.google.errorprone.annotations.MustBeClosed

interface FileService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): FileService

    /** Detach a previously-attached file from a `digital_files` entitlement. */
    fun delete(
        fileId: String,
        params: FileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see delete */
    fun delete(params: FileDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Attach a file to a `digital_files` entitlement. Per-file size cap: 500 MiB. */
    fun upload(
        id: String,
        params: FileUploadParams = FileUploadParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileUploadResponse = upload(params.toBuilder().id(id).build(), requestOptions)

    /** @see upload */
    fun upload(
        params: FileUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileUploadResponse

    /** @see upload */
    fun upload(id: String, requestOptions: RequestOptions): FileUploadResponse =
        upload(id, FileUploadParams.none(), requestOptions)

    /** A view of [FileService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): FileService.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /entitlements/{id}/files/{file_id}`, but is
         * otherwise the same as [FileService.delete].
         */
        @MustBeClosed
        fun delete(
            fileId: String,
            params: FileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: FileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /entitlements/{id}/files`, but is otherwise the
         * same as [FileService.upload].
         */
        @MustBeClosed
        fun upload(
            id: String,
            params: FileUploadParams = FileUploadParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileUploadResponse> =
            upload(params.toBuilder().id(id).build(), requestOptions)

        /** @see upload */
        @MustBeClosed
        fun upload(
            params: FileUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileUploadResponse>

        /** @see upload */
        @MustBeClosed
        fun upload(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileUploadResponse> = upload(id, FileUploadParams.none(), requestOptions)
    }
}
