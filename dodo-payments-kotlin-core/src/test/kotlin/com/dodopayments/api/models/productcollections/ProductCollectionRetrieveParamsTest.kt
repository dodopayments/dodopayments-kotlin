// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.productcollections

import com.dodopayments.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductCollectionRetrieveParamsTest {

    @Test
    fun create() {
        ProductCollectionRetrieveParams.builder()
            .id("pdc_8BWv0hojwUH7iCDabr0NI")
            .locale("locale")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ProductCollectionRetrieveParams.builder().id("pdc_8BWv0hojwUH7iCDabr0NI").build()

        assertThat(params._pathParam(0)).isEqualTo("pdc_8BWv0hojwUH7iCDabr0NI")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ProductCollectionRetrieveParams.builder()
                .id("pdc_8BWv0hojwUH7iCDabr0NI")
                .locale("locale")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("locale", "locale").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ProductCollectionRetrieveParams.builder().id("pdc_8BWv0hojwUH7iCDabr0NI").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
