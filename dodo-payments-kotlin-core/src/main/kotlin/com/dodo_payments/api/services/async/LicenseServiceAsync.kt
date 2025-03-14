// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async

import com.dodo_payments.api.core.RequestOptions
import com.dodo_payments.api.core.http.HttpResponse
import com.dodo_payments.api.core.http.HttpResponseFor
import com.dodo_payments.api.models.licensekeyinstances.LicenseKeyInstance
import com.dodo_payments.api.models.licenses.LicenseActivateParams
import com.dodo_payments.api.models.licenses.LicenseDeactivateParams
import com.dodo_payments.api.models.licenses.LicenseValidateParams
import com.dodo_payments.api.models.licenses.LicenseValidateResponse
import com.google.errorprone.annotations.MustBeClosed

interface LicenseServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

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
