// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.entitlements.Entitlement
import com.dodopayments.api.models.entitlements.EntitlementCreateParams
import com.dodopayments.api.models.entitlements.EntitlementDeleteParams
import com.dodopayments.api.models.entitlements.EntitlementListPageAsync
import com.dodopayments.api.models.entitlements.EntitlementListParams
import com.dodopayments.api.models.entitlements.EntitlementRetrieveParams
import com.dodopayments.api.models.entitlements.EntitlementUpdateParams
import com.dodopayments.api.services.async.entitlements.FileServiceAsync
import com.dodopayments.api.services.async.entitlements.GrantServiceAsync
import com.google.errorprone.annotations.MustBeClosed

interface EntitlementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EntitlementServiceAsync

    fun files(): FileServiceAsync

    fun grants(): GrantServiceAsync

    /** POST /entitlements */
    suspend fun create(
        params: EntitlementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entitlement

    /** GET /entitlements/{id} */
    suspend fun retrieve(
        id: String,
        params: EntitlementRetrieveParams = EntitlementRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entitlement = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: EntitlementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entitlement

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): Entitlement =
        retrieve(id, EntitlementRetrieveParams.none(), requestOptions)

    /** PATCH /entitlements/{id} */
    suspend fun update(
        id: String,
        params: EntitlementUpdateParams = EntitlementUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entitlement = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: EntitlementUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entitlement

    /** @see update */
    suspend fun update(id: String, requestOptions: RequestOptions): Entitlement =
        update(id, EntitlementUpdateParams.none(), requestOptions)

    /** GET /entitlements */
    suspend fun list(
        params: EntitlementListParams = EntitlementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntitlementListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): EntitlementListPageAsync =
        list(EntitlementListParams.none(), requestOptions)

    /** DELETE /entitlements/{id} (soft-delete) */
    suspend fun delete(
        id: String,
        params: EntitlementDeleteParams = EntitlementDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: EntitlementDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    suspend fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, EntitlementDeleteParams.none(), requestOptions)

    /**
     * A view of [EntitlementServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): EntitlementServiceAsync.WithRawResponse

        fun files(): FileServiceAsync.WithRawResponse

        fun grants(): GrantServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /entitlements`, but is otherwise the same as
         * [EntitlementServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: EntitlementCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entitlement>

        /**
         * Returns a raw HTTP response for `get /entitlements/{id}`, but is otherwise the same as
         * [EntitlementServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: EntitlementRetrieveParams = EntitlementRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entitlement> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: EntitlementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entitlement>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Entitlement> =
            retrieve(id, EntitlementRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /entitlements/{id}`, but is otherwise the same as
         * [EntitlementServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: EntitlementUpdateParams = EntitlementUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entitlement> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: EntitlementUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entitlement>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Entitlement> = update(id, EntitlementUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /entitlements`, but is otherwise the same as
         * [EntitlementServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: EntitlementListParams = EntitlementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntitlementListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<EntitlementListPageAsync> =
            list(EntitlementListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /entitlements/{id}`, but is otherwise the same as
         * [EntitlementServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            id: String,
            params: EntitlementDeleteParams = EntitlementDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: EntitlementDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        suspend fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, EntitlementDeleteParams.none(), requestOptions)
    }
}
