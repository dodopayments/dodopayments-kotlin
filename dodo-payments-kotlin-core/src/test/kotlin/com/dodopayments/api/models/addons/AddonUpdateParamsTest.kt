// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.addons

import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.TaxCategory
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddonUpdateParamsTest {

    @Test
    fun create() {
        AddonUpdateParams.builder()
            .id("id")
            .currency(Currency.AED)
            .description("description")
            .imageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .name("name")
            .price(0)
            .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
            .build()
    }

    @Test
    fun pathParams() {
        val params = AddonUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AddonUpdateParams.builder()
                .id("id")
                .currency(Currency.AED)
                .description("description")
                .imageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .price(0)
                .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                .build()

        val body = params._body()

        assertThat(body.currency()).isEqualTo(Currency.AED)
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.imageId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.price()).isEqualTo(0)
        assertThat(body.taxCategory()).isEqualTo(TaxCategory.DIGITAL_PRODUCTS)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AddonUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
