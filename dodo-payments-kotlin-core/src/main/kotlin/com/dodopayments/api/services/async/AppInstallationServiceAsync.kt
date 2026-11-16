// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.appinstallation.AppInstallationRetrieveSettingsParams
import com.dodopayments.api.models.appinstallation.AppInstallationRetrieveSettingsResponse
import com.google.errorprone.annotations.MustBeClosed

interface AppInstallationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AppInstallationServiceAsync

    /**
     * The settings of the App Installation of the app token, with the secret values. The token
     * grant gives the installation. The token needs `app_settings:read`.
     */
    suspend fun retrieveSettings(
        params: AppInstallationRetrieveSettingsParams =
            AppInstallationRetrieveSettingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AppInstallationRetrieveSettingsResponse

    /** @see retrieveSettings */
    suspend fun retrieveSettings(
        requestOptions: RequestOptions
    ): AppInstallationRetrieveSettingsResponse =
        retrieveSettings(AppInstallationRetrieveSettingsParams.none(), requestOptions)

    /**
     * A view of [AppInstallationServiceAsync] that provides access to raw HTTP responses for each
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
        ): AppInstallationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /app-installation/settings`, but is otherwise the
         * same as [AppInstallationServiceAsync.retrieveSettings].
         */
        @MustBeClosed
        suspend fun retrieveSettings(
            params: AppInstallationRetrieveSettingsParams =
                AppInstallationRetrieveSettingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AppInstallationRetrieveSettingsResponse>

        /** @see retrieveSettings */
        @MustBeClosed
        suspend fun retrieveSettings(
            requestOptions: RequestOptions
        ): HttpResponseFor<AppInstallationRetrieveSettingsResponse> =
            retrieveSettings(AppInstallationRetrieveSettingsParams.none(), requestOptions)
    }
}
