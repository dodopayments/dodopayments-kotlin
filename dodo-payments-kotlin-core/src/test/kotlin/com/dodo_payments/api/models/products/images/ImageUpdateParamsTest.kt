// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.products.images

import com.dodo_payments.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ImageUpdateParamsTest {

    @Test
    fun create() {
        ImageUpdateParams.builder().id("id").forceUpdate(true).build()
    }

    @Test
    fun queryParams() {
        val params = ImageUpdateParams.builder().id("id").forceUpdate(true).build()
        val expected = QueryParams.builder()
        expected.put("force_update", "true")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ImageUpdateParams.builder().id("id").build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params = ImageUpdateParams.builder().id("id").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
