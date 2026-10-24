// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.addons

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddonDeleteParamsTest {

    @Test
    fun create() {
        AddonDeleteParams.builder().id("adn_NX1zdqW4Hbivsqz8vI9dc").build()
    }

    @Test
    fun pathParams() {
        val params = AddonDeleteParams.builder().id("adn_NX1zdqW4Hbivsqz8vI9dc").build()

        assertThat(params._pathParam(0)).isEqualTo("adn_NX1zdqW4Hbivsqz8vI9dc")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
