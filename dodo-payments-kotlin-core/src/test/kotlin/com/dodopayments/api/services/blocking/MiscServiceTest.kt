// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MiscServiceTest {

    @Test
    fun listLocales() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val miscService = client.misc()

        val localeInfos = miscService.listLocales()

        localeInfos.forEach { it.validate() }
    }

    @Test
    fun listSupportedCountries() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val miscService = client.misc()

        val countryCodes = miscService.listSupportedCountries()

        countryCodes.forEach { it.validate() }
    }
}
