// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.MiscListSupportedCountriesParams
import com.google.errorprone.annotations.MustBeClosed

interface MiscService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MiscService

    fun listSupportedCountries(
        params: MiscListSupportedCountriesParams = MiscListSupportedCountriesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<CountryCode>

    /** @see listSupportedCountries */
    fun listSupportedCountries(requestOptions: RequestOptions): List<CountryCode> =
        listSupportedCountries(MiscListSupportedCountriesParams.none(), requestOptions)

    /** A view of [MiscService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MiscService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /checkout/supported_countries`, but is otherwise the
         * same as [MiscService.listSupportedCountries].
         */
        @MustBeClosed
        fun listSupportedCountries(
            params: MiscListSupportedCountriesParams = MiscListSupportedCountriesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<CountryCode>>

        /** @see listSupportedCountries */
        @MustBeClosed
        fun listSupportedCountries(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<CountryCode>> =
            listSupportedCountries(MiscListSupportedCountriesParams.none(), requestOptions)
    }
}
