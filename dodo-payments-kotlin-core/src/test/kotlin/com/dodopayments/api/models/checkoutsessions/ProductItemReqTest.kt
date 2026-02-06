// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.checkoutsessions

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.subscriptions.AttachAddon
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductItemReqTest {

    @Test
    fun create() {
        val productItemReq =
            ProductItemReq.builder()
                .productId("product_id")
                .quantity(0)
                .addAddon(AttachAddon.builder().addonId("addon_id").quantity(0).build())
                .amount(0)
                .build()

        assertThat(productItemReq.productId()).isEqualTo("product_id")
        assertThat(productItemReq.quantity()).isEqualTo(0)
        assertThat(productItemReq.addons())
            .containsExactly(AttachAddon.builder().addonId("addon_id").quantity(0).build())
        assertThat(productItemReq.amount()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val productItemReq =
            ProductItemReq.builder()
                .productId("product_id")
                .quantity(0)
                .addAddon(AttachAddon.builder().addonId("addon_id").quantity(0).build())
                .amount(0)
                .build()

        val roundtrippedProductItemReq =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(productItemReq),
                jacksonTypeRef<ProductItemReq>(),
            )

        assertThat(roundtrippedProductItemReq).isEqualTo(productItemReq)
    }
}
