// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.addons

import com.dodopayments.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddonRetrieveParamsTest {

    @Test
    fun create() {
        AddonRetrieveParams.builder().id("adn_NX1zdqW4Hbivsqz8vI9dc").locale("locale").build()
    }

    @Test
    fun pathParams() {
        val params = AddonRetrieveParams.builder().id("adn_NX1zdqW4Hbivsqz8vI9dc").build()

        assertThat(params._pathParam(0)).isEqualTo("adn_NX1zdqW4Hbivsqz8vI9dc")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            AddonRetrieveParams.builder().id("adn_NX1zdqW4Hbivsqz8vI9dc").locale("locale").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("locale", "locale").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AddonRetrieveParams.builder().id("adn_NX1zdqW4Hbivsqz8vI9dc").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
