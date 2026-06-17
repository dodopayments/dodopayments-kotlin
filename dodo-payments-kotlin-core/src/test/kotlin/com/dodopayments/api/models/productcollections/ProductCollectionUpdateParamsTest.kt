// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.productcollections

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductCollectionUpdateParamsTest {

    @Test
    fun create() {
        ProductCollectionUpdateParams.builder()
            .id("pdc_8BWv0hojwUH7iCDabr0NI")
            .brandId("brand_id")
            .description("description")
            .effectiveAtOnDowngrade(
                ProductCollectionUpdateParams.EffectiveAtOnDowngrade.IMMEDIATELY
            )
            .effectiveAtOnUpgrade(ProductCollectionUpdateParams.EffectiveAtOnUpgrade.IMMEDIATELY)
            .addGroupOrder("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .imageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .name("name")
            .onPaymentFailure(ProductCollectionUpdateParams.OnPaymentFailure.PREVENT_CHANGE)
            .prorationBillingModeOnDowngrade(
                ProductCollectionUpdateParams.ProrationBillingModeOnDowngrade.PRORATED_IMMEDIATELY
            )
            .prorationBillingModeOnUpgrade(
                ProductCollectionUpdateParams.ProrationBillingModeOnUpgrade.PRORATED_IMMEDIATELY
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = ProductCollectionUpdateParams.builder().id("pdc_8BWv0hojwUH7iCDabr0NI").build()

        assertThat(params._pathParam(0)).isEqualTo("pdc_8BWv0hojwUH7iCDabr0NI")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ProductCollectionUpdateParams.builder()
                .id("pdc_8BWv0hojwUH7iCDabr0NI")
                .brandId("brand_id")
                .description("description")
                .effectiveAtOnDowngrade(
                    ProductCollectionUpdateParams.EffectiveAtOnDowngrade.IMMEDIATELY
                )
                .effectiveAtOnUpgrade(
                    ProductCollectionUpdateParams.EffectiveAtOnUpgrade.IMMEDIATELY
                )
                .addGroupOrder("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .imageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .onPaymentFailure(ProductCollectionUpdateParams.OnPaymentFailure.PREVENT_CHANGE)
                .prorationBillingModeOnDowngrade(
                    ProductCollectionUpdateParams.ProrationBillingModeOnDowngrade
                        .PRORATED_IMMEDIATELY
                )
                .prorationBillingModeOnUpgrade(
                    ProductCollectionUpdateParams.ProrationBillingModeOnUpgrade.PRORATED_IMMEDIATELY
                )
                .build()

        val body = params._body()

        assertThat(body.brandId()).isEqualTo("brand_id")
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.effectiveAtOnDowngrade())
            .isEqualTo(ProductCollectionUpdateParams.EffectiveAtOnDowngrade.IMMEDIATELY)
        assertThat(body.effectiveAtOnUpgrade())
            .isEqualTo(ProductCollectionUpdateParams.EffectiveAtOnUpgrade.IMMEDIATELY)
        assertThat(body.groupOrder()).containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.imageId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.onPaymentFailure())
            .isEqualTo(ProductCollectionUpdateParams.OnPaymentFailure.PREVENT_CHANGE)
        assertThat(body.prorationBillingModeOnDowngrade())
            .isEqualTo(
                ProductCollectionUpdateParams.ProrationBillingModeOnDowngrade.PRORATED_IMMEDIATELY
            )
        assertThat(body.prorationBillingModeOnUpgrade())
            .isEqualTo(
                ProductCollectionUpdateParams.ProrationBillingModeOnUpgrade.PRORATED_IMMEDIATELY
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ProductCollectionUpdateParams.builder().id("pdc_8BWv0hojwUH7iCDabr0NI").build()

        val body = params._body()
    }
}
