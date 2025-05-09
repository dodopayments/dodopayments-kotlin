// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.addons

import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.TaxCategory
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddonCreateParamsTest {

    @Test
    fun create() {
        AddonCreateParams.builder()
            .currency(Currency.AED)
            .name("name")
            .price(0)
            .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
            .description("description")
            .build()
    }

    @Test
    fun body() {
        val params =
            AddonCreateParams.builder()
                .currency(Currency.AED)
                .name("name")
                .price(0)
                .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                .description("description")
                .build()

        val body = params._body()

        assertThat(body.currency()).isEqualTo(Currency.AED)
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.price()).isEqualTo(0)
        assertThat(body.taxCategory()).isEqualTo(TaxCategory.DIGITAL_PRODUCTS)
        assertThat(body.description()).isEqualTo("description")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AddonCreateParams.builder()
                .currency(Currency.AED)
                .name("name")
                .price(0)
                .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                .build()

        val body = params._body()

        assertThat(body.currency()).isEqualTo(Currency.AED)
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.price()).isEqualTo(0)
        assertThat(body.taxCategory()).isEqualTo(TaxCategory.DIGITAL_PRODUCTS)
    }
}
