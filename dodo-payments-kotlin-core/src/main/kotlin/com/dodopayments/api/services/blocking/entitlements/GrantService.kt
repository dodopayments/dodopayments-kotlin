// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.entitlements

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.entitlements.grants.EntitlementGrant
import com.dodopayments.api.models.entitlements.grants.GrantListPage
import com.dodopayments.api.models.entitlements.grants.GrantListParams
import com.dodopayments.api.models.entitlements.grants.GrantRevokeParams
import com.google.errorprone.annotations.MustBeClosed

interface GrantService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): GrantService

    /** GET /entitlements/{id}/grants (public API) */
    fun list(
        id: String,
        params: GrantListParams = GrantListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GrantListPage = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        params: GrantListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GrantListPage

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): GrantListPage =
        list(id, GrantListParams.none(), requestOptions)

    /**
     * Revokes a single entitlement grant for the caller's business. For LicenseKey integrations,
     * also disables the backing license key. Idempotent: re-revoking an already-revoked grant
     * returns 200 with current state. The revocation reason is always set to "manual" for
     * API-initiated revocations.
     */
    fun revoke(
        grantId: String,
        params: GrantRevokeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntitlementGrant = revoke(params.toBuilder().grantId(grantId).build(), requestOptions)

    /** @see revoke */
    fun revoke(
        params: GrantRevokeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntitlementGrant

    /** A view of [GrantService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): GrantService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /entitlements/{id}/grants`, but is otherwise the
         * same as [GrantService.list].
         */
        @MustBeClosed
        fun list(
            id: String,
            params: GrantListParams = GrantListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GrantListPage> = list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            params: GrantListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GrantListPage>

        /** @see list */
        @MustBeClosed
        fun list(id: String, requestOptions: RequestOptions): HttpResponseFor<GrantListPage> =
            list(id, GrantListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /entitlements/{id}/grants/{grant_id}`, but is
         * otherwise the same as [GrantService.revoke].
         */
        @MustBeClosed
        fun revoke(
            grantId: String,
            params: GrantRevokeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntitlementGrant> =
            revoke(params.toBuilder().grantId(grantId).build(), requestOptions)

        /** @see revoke */
        @MustBeClosed
        fun revoke(
            params: GrantRevokeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntitlementGrant>
    }
}
