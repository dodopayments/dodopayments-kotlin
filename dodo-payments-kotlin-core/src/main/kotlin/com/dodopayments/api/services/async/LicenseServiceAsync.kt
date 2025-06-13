// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.licensekeyinstances.LicenseKeyInstance
import com.dodopayments.api.models.licenses.LicenseActivateParams
import com.dodopayments.api.models.licenses.LicenseDeactivateParams
import com.dodopayments.api.models.licenses.LicenseValidateParams
import com.dodopayments.api.models.licenses.LicenseValidateResponse
import com.google.errorprone.annotations.MustBeClosed

interface LicenseServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LicenseServiceAsync

    suspend fun activate(
        params: LicenseActivateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseKeyInstance

    suspend fun deactivate(
        params: LicenseDeactivateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    suspend fun validate(
        params: LicenseValidateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseValidateResponse

    /**
     * A view of [LicenseServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LicenseServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /licenses/activate`, but is otherwise the same as
         * [LicenseServiceAsync.activate].
         */
        @MustBeClosed
        suspend fun activate(
            params: LicenseActivateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseKeyInstance>

        /**
         * Returns a raw HTTP response for `post /licenses/deactivate`, but is otherwise the same as
         * [LicenseServiceAsync.deactivate].
         */
        @MustBeClosed
        suspend fun deactivate(
            params: LicenseDeactivateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /licenses/validate`, but is otherwise the same as
         * [LicenseServiceAsync.validate].
         */
        @MustBeClosed
        suspend fun validate(
            params: LicenseValidateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseValidateResponse>
    }
}
