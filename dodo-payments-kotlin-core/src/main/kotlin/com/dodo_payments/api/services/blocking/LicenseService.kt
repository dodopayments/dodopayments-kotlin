// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.blocking

import com.dodo_payments.api.core.RequestOptions
import com.dodo_payments.api.core.http.HttpResponse
import com.dodo_payments.api.core.http.HttpResponseFor
import com.dodo_payments.api.models.licensekeyinstances.LicenseKeyInstance
import com.dodo_payments.api.models.licenses.LicenseActivateParams
import com.dodo_payments.api.models.licenses.LicenseDeactivateParams
import com.dodo_payments.api.models.licenses.LicenseValidateParams
import com.dodo_payments.api.models.licenses.LicenseValidateResponse
import com.google.errorprone.annotations.MustBeClosed

interface LicenseService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun activate(
        params: LicenseActivateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseKeyInstance

    fun deactivate(
        params: LicenseDeactivateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    fun validate(
        params: LicenseValidateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseValidateResponse

    /** A view of [LicenseService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /licenses/activate`, but is otherwise the same as
         * [LicenseService.activate].
         */
        @MustBeClosed
        fun activate(
            params: LicenseActivateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseKeyInstance>

        /**
         * Returns a raw HTTP response for `post /licenses/deactivate`, but is otherwise the same as
         * [LicenseService.deactivate].
         */
        @MustBeClosed
        fun deactivate(
            params: LicenseDeactivateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /licenses/validate`, but is otherwise the same as
         * [LicenseService.validate].
         */
        @MustBeClosed
        fun validate(
            params: LicenseValidateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseValidateResponse>
    }
}
