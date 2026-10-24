// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.creditentitlements

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

interface TranslationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TranslationService

    /**
     * Creates or replaces the translation of one locale. The response is 201 for a new locale and
     * 200 for a replaced locale.
     */
    fun update(
        locale: Locale,
        params: TranslationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditEntitlementTranslation =
        update(params.toBuilder().locale(locale).build(), requestOptions)

    /** @see update */
    fun update(
        params: TranslationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditEntitlementTranslation

    /** Lists the translations, for all the locales or for the locales of the filter. */
    fun list(
        id: String,
        params: TranslationListParams = TranslationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditEntitlementTranslationsListResponse =
        list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        params: TranslationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditEntitlementTranslationsListResponse

    /** @see list */
    fun list(
        id: String,
        requestOptions: RequestOptions,
    ): CreditEntitlementTranslationsListResponse =
        list(id, TranslationListParams.none(), requestOptions)

    /** Deletes the translation of one locale. */
    fun delete(
        locale: Locale,
        params: TranslationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().locale(locale).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: TranslationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [TranslationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TranslationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /credit-entitlements/{id}/translations/{locale}`,
         * but is otherwise the same as [TranslationService.update].
         */
        @MustBeClosed
        fun update(
            locale: Locale,
            params: TranslationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditEntitlementTranslation> =
            update(params.toBuilder().locale(locale).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: TranslationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditEntitlementTranslation>

        /**
         * Returns a raw HTTP response for `get /credit-entitlements/{id}/translations`, but is
         * otherwise the same as [TranslationService.list].
         */
        @MustBeClosed
        fun list(
            id: String,
            params: TranslationListParams = TranslationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditEntitlementTranslationsListResponse> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            params: TranslationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditEntitlementTranslationsListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditEntitlementTranslationsListResponse> =
            list(id, TranslationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /credit-entitlements/{id}/translations/{locale}`,
         * but is otherwise the same as [TranslationService.delete].
         */
        @MustBeClosed
        fun delete(
            locale: Locale,
            params: TranslationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().locale(locale).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TranslationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
