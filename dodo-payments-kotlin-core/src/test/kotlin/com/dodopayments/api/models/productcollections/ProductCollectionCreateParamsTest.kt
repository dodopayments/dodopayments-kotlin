// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.productcollections

import com.dodopayments.api.models.productcollections.groups.GroupProduct
import com.dodopayments.api.models.productcollections.groups.ProductCollectionGroupDetails
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductCollectionCreateParamsTest {

    @Test
    fun create() {
        ProductCollectionCreateParams.builder()
            .addGroup(
                ProductCollectionGroupDetails.builder()
                    .addProduct(GroupProduct.builder().productId("product_id").status(true).build())
                    .groupName("group_name")
                    .status(true)
                    .build()
            )
            .name("name")
            .brandId("brand_id")
            .description("description")
            .effectiveAtOnDowngrade(
                ProductCollectionCreateParams.EffectiveAtOnDowngrade.IMMEDIATELY
            )
            .effectiveAtOnUpgrade(ProductCollectionCreateParams.EffectiveAtOnUpgrade.IMMEDIATELY)
            .onPaymentFailure(ProductCollectionCreateParams.OnPaymentFailure.PREVENT_CHANGE)
            .prorationBillingModeOnDowngrade(
                ProductCollectionCreateParams.ProrationBillingModeOnDowngrade.PRORATED_IMMEDIATELY
            )
            .prorationBillingModeOnUpgrade(
                ProductCollectionCreateParams.ProrationBillingModeOnUpgrade.PRORATED_IMMEDIATELY
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ProductCollectionCreateParams.builder()
                .addGroup(
                    ProductCollectionGroupDetails.builder()
                        .addProduct(
                            GroupProduct.builder().productId("product_id").status(true).build()
                        )
                        .groupName("group_name")
                        .status(true)
                        .build()
                )
                .name("name")
                .brandId("brand_id")
                .description("description")
                .effectiveAtOnDowngrade(
                    ProductCollectionCreateParams.EffectiveAtOnDowngrade.IMMEDIATELY
                )
                .effectiveAtOnUpgrade(
                    ProductCollectionCreateParams.EffectiveAtOnUpgrade.IMMEDIATELY
                )
                .onPaymentFailure(ProductCollectionCreateParams.OnPaymentFailure.PREVENT_CHANGE)
                .prorationBillingModeOnDowngrade(
                    ProductCollectionCreateParams.ProrationBillingModeOnDowngrade
                        .PRORATED_IMMEDIATELY
                )
                .prorationBillingModeOnUpgrade(
                    ProductCollectionCreateParams.ProrationBillingModeOnUpgrade.PRORATED_IMMEDIATELY
                )
                .build()

        val body = params._body()

        assertThat(body.groups())
            .containsExactly(
                ProductCollectionGroupDetails.builder()
                    .addProduct(GroupProduct.builder().productId("product_id").status(true).build())
                    .groupName("group_name")
                    .status(true)
                    .build()
            )
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.brandId()).isEqualTo("brand_id")
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.effectiveAtOnDowngrade())
            .isEqualTo(ProductCollectionCreateParams.EffectiveAtOnDowngrade.IMMEDIATELY)
        assertThat(body.effectiveAtOnUpgrade())
            .isEqualTo(ProductCollectionCreateParams.EffectiveAtOnUpgrade.IMMEDIATELY)
        assertThat(body.onPaymentFailure())
            .isEqualTo(ProductCollectionCreateParams.OnPaymentFailure.PREVENT_CHANGE)
        assertThat(body.prorationBillingModeOnDowngrade())
            .isEqualTo(
                ProductCollectionCreateParams.ProrationBillingModeOnDowngrade.PRORATED_IMMEDIATELY
            )
        assertThat(body.prorationBillingModeOnUpgrade())
            .isEqualTo(
                ProductCollectionCreateParams.ProrationBillingModeOnUpgrade.PRORATED_IMMEDIATELY
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ProductCollectionCreateParams.builder()
                .addGroup(
                    ProductCollectionGroupDetails.builder()
                        .addProduct(GroupProduct.builder().productId("product_id").build())
                        .build()
                )
                .name("name")
                .build()

        val body = params._body()

        assertThat(body.groups())
            .containsExactly(
                ProductCollectionGroupDetails.builder()
                    .addProduct(GroupProduct.builder().productId("product_id").build())
                    .build()
            )
        assertThat(body.name()).isEqualTo("name")
    }
}
