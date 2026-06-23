// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products.localizedprices

import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocalizedPriceCreateParamsTest {

    @Test
    fun create() {
        LocalizedPriceCreateParams.builder()
            .productId("pdt_R8AWMPiV8RyJElcCKvAID")
            .amount(0)
            .currency(Currency.AED)
            .countryCode(CountryCode.AF)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LocalizedPriceCreateParams.builder()
                .productId("pdt_R8AWMPiV8RyJElcCKvAID")
                .amount(0)
                .currency(Currency.AED)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("pdt_R8AWMPiV8RyJElcCKvAID")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            LocalizedPriceCreateParams.builder()
                .productId("pdt_R8AWMPiV8RyJElcCKvAID")
                .amount(0)
                .currency(Currency.AED)
                .countryCode(CountryCode.AF)
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(0)
        assertThat(body.currency()).isEqualTo(Currency.AED)
        assertThat(body.countryCode()).isEqualTo(CountryCode.AF)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LocalizedPriceCreateParams.builder()
                .productId("pdt_R8AWMPiV8RyJElcCKvAID")
                .amount(0)
                .currency(Currency.AED)
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(0)
        assertThat(body.currency()).isEqualTo(Currency.AED)
    }
}
