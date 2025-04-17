// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.blocking

import com.dodo_payments.api.core.RequestOptions
import com.dodo_payments.api.core.http.HttpResponseFor
import com.dodo_payments.api.models.misc.CountryCode
import com.dodo_payments.api.models.misc.MiscListSupportedCountriesParams
import com.google.errorprone.annotations.MustBeClosed

interface MiscService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun listSupportedCountries(
        params: MiscListSupportedCountriesParams = MiscListSupportedCountriesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<CountryCode>

    /** @see [listSupportedCountries] */
    fun listSupportedCountries(requestOptions: RequestOptions): List<CountryCode> =
        listSupportedCountries(MiscListSupportedCountriesParams.none(), requestOptions)

    /** A view of [MiscService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /checkout/supported_countries`, but is otherwise the
         * same as [MiscService.listSupportedCountries].
         */
        @MustBeClosed
        fun listSupportedCountries(
            params: MiscListSupportedCountriesParams = MiscListSupportedCountriesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<CountryCode>>

        /** @see [listSupportedCountries] */
        @MustBeClosed
        fun listSupportedCountries(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<CountryCode>> =
            listSupportedCountries(MiscListSupportedCountriesParams.none(), requestOptions)
    }
}
