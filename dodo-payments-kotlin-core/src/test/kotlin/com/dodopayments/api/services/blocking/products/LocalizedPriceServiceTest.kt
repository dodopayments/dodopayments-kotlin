// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.products

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.products.localizedprices.LocalizedPriceArchiveParams
import com.dodopayments.api.models.products.localizedprices.LocalizedPriceCreateParams
import com.dodopayments.api.models.products.localizedprices.LocalizedPriceRetrieveParams
import com.dodopayments.api.models.products.localizedprices.LocalizedPriceUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LocalizedPriceServiceTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val localizedPriceService = client.products().localizedPrices()

        val localizedPrice =
            localizedPriceService.create(
                LocalizedPriceCreateParams.builder()
                    .productId("pdt_R8AWMPiV8RyJElcCKvAID")
                    .amount(0)
                    .currency(Currency.AED)
                    .countryCode(CountryCode.AF)
                    .build()
            )

        localizedPrice.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val localizedPriceService = client.products().localizedPrices()

        val localizedPrice =
            localizedPriceService.retrieve(
                LocalizedPriceRetrieveParams.builder()
                    .productId("pdt_R8AWMPiV8RyJElcCKvAID")
                    .id("lcp_3aOOT7ebrzBOV41yL2V6s")
                    .build()
            )

        localizedPrice.validate()
    }

    @Test
    fun update() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val localizedPriceService = client.products().localizedPrices()

        val localizedPrice =
            localizedPriceService.update(
                LocalizedPriceUpdateParams.builder()
                    .productId("pdt_R8AWMPiV8RyJElcCKvAID")
                    .id("lcp_3aOOT7ebrzBOV41yL2V6s")
                    .amount(0)
                    .build()
            )

        localizedPrice.validate()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val localizedPriceService = client.products().localizedPrices()

        val listLocalizedPricesResponse = localizedPriceService.list("pdt_R8AWMPiV8RyJElcCKvAID")

        listLocalizedPricesResponse.validate()
    }

    @Test
    fun archive() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val localizedPriceService = client.products().localizedPrices()

        localizedPriceService.archive(
            LocalizedPriceArchiveParams.builder()
                .productId("pdt_R8AWMPiV8RyJElcCKvAID")
                .id("lcp_3aOOT7ebrzBOV41yL2V6s")
                .build()
        )
    }
}
