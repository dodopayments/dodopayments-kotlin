// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async.misc

import com.dodo_payments.api.TestServerExtension
import com.dodo_payments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class SupportedCountryServiceAsyncTest {

    @Test
    suspend fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val supportedCountryServiceAsync = client.misc().supportedCountries()

        supportedCountryServiceAsync.list()
    }
}
