// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products.images

import com.dodopayments.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ImageUpdateParamsTest {

    @Test
    fun create() {
        ImageUpdateParams.builder().id("id").forceUpdate(true).build()
    }

    @Test
    fun pathParams() {
        val params = ImageUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = ImageUpdateParams.builder().id("id").forceUpdate(true).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("force_update", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ImageUpdateParams.builder().id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
