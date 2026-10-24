// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.addons

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.models.addons.translations.TranslationDeleteParams
import com.dodopayments.api.models.addons.translations.TranslationListParams
import com.dodopayments.api.models.addons.translations.TranslationUpdateParams
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
        val translationService = client.addons().translations()

        val translation =
            translationService.update(
                TranslationUpdateParams.builder()
                    .id("id")
                    .locale(Locale.AR)
                    .description("description")
                    .name("name")
                    .build()
            )

        translation.validate()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val translationService = client.addons().translations()

        val translationsListResponse =
            translationService.list(
                TranslationListParams.builder().id("id").addLocale("string").build()
            )

        translationsListResponse.validate()
    }

    @Test
    fun delete() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val translationService = client.addons().translations()

        translationService.delete(
            TranslationDeleteParams.builder().id("id").locale(Locale.AR).build()
        )
    }
}
