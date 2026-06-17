// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payouts.breakup

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BreakupRetrieveParamsTest {

    @Test
    fun create() {
        BreakupRetrieveParams.builder().payoutId("pyt_zFTrrn4sk3x3y2vjDBW3T").build()
    }

    @Test
    fun pathParams() {
        val params = BreakupRetrieveParams.builder().payoutId("pyt_zFTrrn4sk3x3y2vjDBW3T").build()

        assertThat(params._pathParam(0)).isEqualTo("pyt_zFTrrn4sk3x3y2vjDBW3T")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
