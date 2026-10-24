// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.creditentitlements

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.creditentitlements.translations.CreditEntitlementTranslation
import com.dodopayments.api.models.creditentitlements.translations.CreditEntitlementTranslationsListResponse
import com.dodopayments.api.models.creditentitlements.translations.TranslationDeleteParams
import com.dodopayments.api.models.creditentitlements.translations.TranslationListParams
import com.dodopayments.api.models.creditentitlements.translations.TranslationUpdateParams
import com.dodopayments.api.models.misc.Locale
import com.google.errorprone.annotations.MustBeClosed

interface TranslationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TranslationServiceAsync

    /**
     * Creates or replaces the translation of one locale. The response is 201 for a new locale and
     * 200 for a replaced locale.
     */
    suspend fun update(
        locale: Locale,
        params: TranslationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditEntitlementTranslation =
        update(params.toBuilder().locale(locale).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: TranslationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditEntitlementTranslation

    /** Lists the translations, for all the locales or for the locales of the filter. */
    suspend fun list(
        id: String,
        params: TranslationListParams = TranslationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditEntitlementTranslationsListResponse =
        list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    suspend fun list(
        params: TranslationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditEntitlementTranslationsListResponse

    /** @see list */
    suspend fun list(
        id: String,
        requestOptions: RequestOptions,
    ): CreditEntitlementTranslationsListResponse =
        list(id, TranslationListParams.none(), requestOptions)

    /** Deletes the translation of one locale. */
    suspend fun delete(
        locale: Locale,
        params: TranslationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().locale(locale).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: TranslationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [TranslationServiceAsync] that provides access to raw HTTP responses for each
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
        ): TranslationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /credit-entitlements/{id}/translations/{locale}`,
         * but is otherwise the same as [TranslationServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            locale: Locale,
            params: TranslationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditEntitlementTranslation> =
            update(params.toBuilder().locale(locale).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: TranslationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditEntitlementTranslation>

        /**
         * Returns a raw HTTP response for `get /credit-entitlements/{id}/translations`, but is
         * otherwise the same as [TranslationServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            id: String,
            params: TranslationListParams = TranslationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditEntitlementTranslationsListResponse> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        suspend fun list(
            params: TranslationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditEntitlementTranslationsListResponse>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditEntitlementTranslationsListResponse> =
            list(id, TranslationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /credit-entitlements/{id}/translations/{locale}`,
         * but is otherwise the same as [TranslationServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            locale: Locale,
            params: TranslationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().locale(locale).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: TranslationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
