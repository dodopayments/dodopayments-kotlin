// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.entitlements

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.models.entitlements.translations.TranslationDeleteParams
import com.dodopayments.api.models.entitlements.translations.TranslationListParams
import com.dodopayments.api.models.entitlements.translations.TranslationUpdateParams
import com.dodopayments.api.models.misc.Locale
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TranslationServiceTest {

    @Test
    fun update() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val translationService = client.entitlements().translations()

        val entitlementTranslation =
            translationService.update(
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
    fun list() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val translationService = client.entitlements().translations()

        val entitlementTranslationsListResponse =
            translationService.list(
                TranslationListParams.builder().id("id").addLocale("string").build()
            )

        entitlementTranslationsListResponse.validate()
    }

    @Test
    fun delete() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val translationService = client.entitlements().translations()

        translationService.delete(
            TranslationDeleteParams.builder().id("id").locale(Locale.AR).build()
        )
    }
}
