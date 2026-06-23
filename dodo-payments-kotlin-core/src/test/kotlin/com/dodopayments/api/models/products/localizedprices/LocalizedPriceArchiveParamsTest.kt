// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products.localizedprices

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocalizedPriceArchiveParamsTest {

    @Test
    fun create() {
        LocalizedPriceArchiveParams.builder()
            .productId("pdt_R8AWMPiV8RyJElcCKvAID")
            .id("lcp_3aOOT7ebrzBOV41yL2V6s")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LocalizedPriceArchiveParams.builder()
                .productId("pdt_R8AWMPiV8RyJElcCKvAID")
                .id("lcp_3aOOT7ebrzBOV41yL2V6s")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("pdt_R8AWMPiV8RyJElcCKvAID")
        assertThat(params._pathParam(1)).isEqualTo("lcp_3aOOT7ebrzBOV41yL2V6s")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
