// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.addons

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddonUpdateImagesParamsTest {

    @Test
    fun create() {
        AddonUpdateImagesParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = AddonUpdateImagesParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
