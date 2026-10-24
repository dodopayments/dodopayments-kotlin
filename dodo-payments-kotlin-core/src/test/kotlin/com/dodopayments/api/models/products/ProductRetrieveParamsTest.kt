// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductRetrieveParamsTest {

    @Test
    fun create() {
        ProductRetrieveParams.builder().id("pdt_R8AWMPiV8RyJElcCKvAID").locale("locale").build()
    }

    @Test
    fun pathParams() {
        val params = ProductRetrieveParams.builder().id("pdt_R8AWMPiV8RyJElcCKvAID").build()

        assertThat(params._pathParam(0)).isEqualTo("pdt_R8AWMPiV8RyJElcCKvAID")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ProductRetrieveParams.builder().id("pdt_R8AWMPiV8RyJElcCKvAID").locale("locale").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("locale", "locale").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ProductRetrieveParams.builder().id("pdt_R8AWMPiV8RyJElcCKvAID").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
