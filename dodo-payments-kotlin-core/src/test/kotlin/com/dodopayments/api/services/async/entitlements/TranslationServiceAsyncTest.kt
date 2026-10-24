// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.entitlements

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.entitlements.translations.TranslationDeleteParams
import com.dodopayments.api.models.entitlements.translations.TranslationListParams
import com.dodopayments.api.models.entitlements.translations.TranslationUpdateParams
import com.dodopayments.api.models.misc.Locale
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TranslationServiceAsyncTest {

    @Test
    suspend fun update() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val translationServiceAsync = client.entitlements().translations()

        val entitlementTranslation =
            translationServiceAsync.update(
                TranslationUpdateParams.builder()
                    .id("id")
                    .locale(Locale.AR)
                    .activationMessage("activation_message")
                    .description("description")
                    .instructions("instructions")
                    .name("name")
                    .build()
            )

        entitlementTranslation.validate()
    }

    @Test
    suspend fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val translationServiceAsync = client.entitlements().translations()

        val entitlementTranslationsListResponse =
            translationServiceAsync.list(
                TranslationListParams.builder().id("id").addLocale("string").build()
            )

        entitlementTranslationsListResponse.validate()
    }

    @Test
    suspend fun delete() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val translationServiceAsync = client.entitlements().translations()

        translationServiceAsync.delete(
            TranslationDeleteParams.builder().id("id").locale(Locale.AR).build()
        )
    }
}
