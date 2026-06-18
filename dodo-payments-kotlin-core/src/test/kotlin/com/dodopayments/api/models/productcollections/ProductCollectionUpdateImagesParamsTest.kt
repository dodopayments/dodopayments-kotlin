// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.productcollections

import com.dodopayments.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductCollectionUpdateImagesParamsTest {

    @Test
    fun create() {
        ProductCollectionUpdateImagesParams.builder()
            .id("pdc_8BWv0hojwUH7iCDabr0NI")
            .forceUpdate(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ProductCollectionUpdateImagesParams.builder().id("pdc_8BWv0hojwUH7iCDabr0NI").build()

        assertThat(params._pathParam(0)).isEqualTo("pdc_8BWv0hojwUH7iCDabr0NI")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ProductCollectionUpdateImagesParams.builder()
                .id("pdc_8BWv0hojwUH7iCDabr0NI")
                .forceUpdate(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("force_update", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ProductCollectionUpdateImagesParams.builder().id("pdc_8BWv0hojwUH7iCDabr0NI").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
