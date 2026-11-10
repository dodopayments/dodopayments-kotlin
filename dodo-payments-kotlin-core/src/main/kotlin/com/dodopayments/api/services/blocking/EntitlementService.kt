// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.entitlements.Entitlement
import com.dodopayments.api.models.entitlements.EntitlementCreateParams
import com.dodopayments.api.models.entitlements.EntitlementDeleteParams
import com.dodopayments.api.models.entitlements.EntitlementListPage
import com.dodopayments.api.models.entitlements.EntitlementListParams
import com.dodopayments.api.models.entitlements.EntitlementRetrieveParams
import com.dodopayments.api.models.entitlements.EntitlementUpdateParams
import com.dodopayments.api.services.blocking.entitlements.FileService
import com.dodopayments.api.services.blocking.entitlements.GrantService
import com.google.errorprone.annotations.MustBeClosed

interface EntitlementService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EntitlementService

    fun files(): FileService

    fun grants(): GrantService

    /** POST /entitlements */
    fun create(
        params: EntitlementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entitlement

    /** GET /entitlements/{id} */
    fun retrieve(
        id: String,
        params: EntitlementRetrieveParams = EntitlementRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entitlement = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: EntitlementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entitlement

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): Entitlement =
        retrieve(id, EntitlementRetrieveParams.none(), requestOptions)

    /** PATCH /entitlements/{id} */
    fun update(
        id: String,
        params: EntitlementUpdateParams = EntitlementUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entitlement = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: EntitlementUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entitlement

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): Entitlement =
        update(id, EntitlementUpdateParams.none(), requestOptions)

    /** GET /entitlements */
    fun list(
        params: EntitlementListParams = EntitlementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntitlementListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): EntitlementListPage =
        list(EntitlementListParams.none(), requestOptions)

    /** DELETE /entitlements/{id} (soft-delete) */
    fun delete(
        id: String,
        params: EntitlementDeleteParams = EntitlementDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: EntitlementDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, EntitlementDeleteParams.none(), requestOptions)

    /**
     * A view of [EntitlementService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): EntitlementService.WithRawResponse

        fun files(): FileService.WithRawResponse

        fun grants(): GrantService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /entitlements`, but is otherwise the same as
         * [EntitlementService.create].
         */
        @MustBeClosed
        fun create(
            params: EntitlementCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entitlement>

        /**
         * Returns a raw HTTP response for `get /entitlements/{id}`, but is otherwise the same as
         * [EntitlementService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EntitlementRetrieveParams = EntitlementRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entitlement> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EntitlementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entitlement>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<Entitlement> =
            retrieve(id, EntitlementRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /entitlements/{id}`, but is otherwise the same as
         * [EntitlementService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: EntitlementUpdateParams = EntitlementUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entitlement> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: EntitlementUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entitlement>

        /** @see update */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponseFor<Entitlement> =
            update(id, EntitlementUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /entitlements`, but is otherwise the same as
         * [EntitlementService.list].
         */
        @MustBeClosed
        fun list(
            params: EntitlementListParams = EntitlementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntitlementListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EntitlementListPage> =
            list(EntitlementListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /entitlements/{id}`, but is otherwise the same as
         * [EntitlementService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: EntitlementDeleteParams = EntitlementDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: EntitlementDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, EntitlementDeleteParams.none(), requestOptions)
    }
}
