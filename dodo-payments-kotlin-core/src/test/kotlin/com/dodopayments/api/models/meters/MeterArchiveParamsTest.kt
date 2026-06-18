// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.meters

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeterArchiveParamsTest {

    @Test
    fun create() {
        MeterArchiveParams.builder().id("mtr_h5tgTWL55OyMO0L2Q9w9v").build()
    }

    @Test
    fun pathParams() {
        val params = MeterArchiveParams.builder().id("mtr_h5tgTWL55OyMO0L2Q9w9v").build()

        assertThat(params._pathParam(0)).isEqualTo("mtr_h5tgTWL55OyMO0L2Q9w9v")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
