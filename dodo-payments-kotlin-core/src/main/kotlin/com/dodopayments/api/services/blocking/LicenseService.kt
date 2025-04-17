// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.licensekeyinstances.LicenseKeyInstance
import com.dodopayments.api.models.licenses.LicenseActivateParams
import com.dodopayments.api.models.licenses.LicenseDeactivateParams
import com.dodopayments.api.models.licenses.LicenseValidateParams
import com.dodopayments.api.models.licenses.LicenseValidateResponse
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
