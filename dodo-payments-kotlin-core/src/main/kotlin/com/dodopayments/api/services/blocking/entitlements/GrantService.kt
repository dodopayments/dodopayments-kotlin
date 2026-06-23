// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.entitlements

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.entitlements.grants.EntitlementGrant
import com.dodopayments.api.models.entitlements.grants.GrantFulfillLicenseKeyParams
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
     * For entitlements whose license-key config uses `manual` fulfillment, grants are created in
     * the `pending` state without a key. Call this endpoint to deliver the key: the grant moves to
     * `delivered`, the customer is emailed the key, and the `license_key.created` and
     * `entitlement_grant.delivered` webhook events are sent.
     */
    fun fulfillLicenseKey(
        grantId: String,
        params: GrantFulfillLicenseKeyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntitlementGrant =
        fulfillLicenseKey(params.toBuilder().grantId(grantId).build(), requestOptions)

    /** @see fulfillLicenseKey */
    fun fulfillLicenseKey(
        params: GrantFulfillLicenseKeyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntitlementGrant

    /**
     * Revoke a single grant. Idempotent: re-revoking an already-revoked grant returns the grant in
     * its current state.
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
         * Returns a raw HTTP response for `post /grants/{grant_id}/license-key`, but is otherwise
         * the same as [GrantService.fulfillLicenseKey].
         */
        @MustBeClosed
        fun fulfillLicenseKey(
            grantId: String,
            params: GrantFulfillLicenseKeyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntitlementGrant> =
            fulfillLicenseKey(params.toBuilder().grantId(grantId).build(), requestOptions)

        /** @see fulfillLicenseKey */
        @MustBeClosed
        fun fulfillLicenseKey(
            params: GrantFulfillLicenseKeyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntitlementGrant>

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
