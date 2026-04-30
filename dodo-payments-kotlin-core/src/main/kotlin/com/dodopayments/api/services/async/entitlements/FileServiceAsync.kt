// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.entitlements

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.entitlements.files.FileDeleteParams
import com.dodopayments.api.models.entitlements.files.FileUploadParams
import com.dodopayments.api.models.entitlements.files.FileUploadResponse
import com.google.errorprone.annotations.MustBeClosed

interface FileServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): FileServiceAsync

    /**
     * Companion to `post_entitlement_file`. Deletes the file from the Entitlements Engine
     * (force=true) and atomically removes the `file_id` from the entitlement's
     * `integration_config.digital_file_ids` JSONB array. EE delete happens first; if it fails we
     * surface the error and leave local state untouched.
     */
    suspend fun delete(
        fileId: String,
        params: FileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: FileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Streams a multipart/form-data body to the Entitlements Engine (`POST
     * /api/digital-files/dodo/files/upload`) and appends the returned `file_id` to the
     * entitlement's `integration_config.digital_file_ids` using a JSONB array append. Compensates
     * EE-side on local DB write failure (best-effort delete of the just-uploaded file).
     */
    suspend fun upload(
        id: String,
        params: FileUploadParams = FileUploadParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileUploadResponse = upload(params.toBuilder().id(id).build(), requestOptions)

    /** @see upload */
    suspend fun upload(
        params: FileUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileUploadResponse

    /** @see upload */
    suspend fun upload(id: String, requestOptions: RequestOptions): FileUploadResponse =
        upload(id, FileUploadParams.none(), requestOptions)

    /** A view of [FileServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): FileServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /entitlements/{id}/files/{file_id}`, but is
         * otherwise the same as [FileServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            fileId: String,
            params: FileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: FileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /entitlements/{id}/files`, but is otherwise the
         * same as [FileServiceAsync.upload].
         */
        @MustBeClosed
        suspend fun upload(
            id: String,
            params: FileUploadParams = FileUploadParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileUploadResponse> =
            upload(params.toBuilder().id(id).build(), requestOptions)

        /** @see upload */
        @MustBeClosed
        suspend fun upload(
            params: FileUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileUploadResponse>

        /** @see upload */
        @MustBeClosed
        suspend fun upload(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileUploadResponse> = upload(id, FileUploadParams.none(), requestOptions)
    }
}
