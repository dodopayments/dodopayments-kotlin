// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products.localizedprices

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocalizedPriceUpdateParamsTest {

    @Test
    fun create() {
        LocalizedPriceUpdateParams.builder()
            .productId("pdt_R8AWMPiV8RyJElcCKvAID")
            .id("lcp_3aOOT7ebrzBOV41yL2V6s")
            .amount(0)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LocalizedPriceUpdateParams.builder()
                .productId("pdt_R8AWMPiV8RyJElcCKvAID")
                .id("lcp_3aOOT7ebrzBOV41yL2V6s")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("pdt_R8AWMPiV8RyJElcCKvAID")
        assertThat(params._pathParam(1)).isEqualTo("lcp_3aOOT7ebrzBOV41yL2V6s")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            LocalizedPriceUpdateParams.builder()
                .productId("pdt_R8AWMPiV8RyJElcCKvAID")
                .id("lcp_3aOOT7ebrzBOV41yL2V6s")
                .amount(0)
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(0)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LocalizedPriceUpdateParams.builder()
                .productId("pdt_R8AWMPiV8RyJElcCKvAID")
                .id("lcp_3aOOT7ebrzBOV41yL2V6s")
                .build()

        val body = params._body()
    }
}
