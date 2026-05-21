// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.productcollections.groups.items

import com.dodopayments.api.models.productcollections.groups.GroupProduct
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemCreateParamsTest {

    @Test
    fun create() {
        ItemCreateParams.builder()
            .id("id")
            .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addProduct(GroupProduct.builder().productId("product_id").status(true).build())
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ItemCreateParams.builder()
                .id("id")
                .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addProduct(GroupProduct.builder().productId("product_id").build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ItemCreateParams.builder()
                .id("id")
                .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addProduct(GroupProduct.builder().productId("product_id").status(true).build())
                .build()

        val body = params._body()

        assertThat(body.products())
            .containsExactly(GroupProduct.builder().productId("product_id").status(true).build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ItemCreateParams.builder()
                .id("id")
                .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addProduct(GroupProduct.builder().productId("product_id").build())
                .build()

        val body = params._body()

        assertThat(body.products())
            .containsExactly(GroupProduct.builder().productId("product_id").build())
    }
}
