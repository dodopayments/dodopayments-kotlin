// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.blocking.misc

import com.dodo_payments.api.core.RequestOptions
import com.dodo_payments.api.core.http.HttpResponseFor
import com.dodo_payments.api.models.misc.supportedcountries.CountryCode
import com.dodo_payments.api.models.misc.supportedcountries.SupportedCountryListParams
import com.google.errorprone.annotations.MustBeClosed

interface SupportedCountryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun list(
        params: SupportedCountryListParams = SupportedCountryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<CountryCode>

    /** @see [list] */
    fun list(requestOptions: RequestOptions): List<CountryCode> =
        list(SupportedCountryListParams.none(), requestOptions)

    /**
     * A view of [SupportedCountryService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /checkout/supported_countries`, but is otherwise the
         * same as [SupportedCountryService.list].
         */
        @MustBeClosed
        fun list(
            params: SupportedCountryListParams = SupportedCountryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<CountryCode>>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<CountryCode>> =
            list(SupportedCountryListParams.none(), requestOptions)
    }
}
