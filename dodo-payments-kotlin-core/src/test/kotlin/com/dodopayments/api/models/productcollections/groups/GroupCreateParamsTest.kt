// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.productcollections.groups

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupCreateParamsTest {

    @Test
    fun create() {
        GroupCreateParams.builder()
            .id("id")
            .addProduct(
                GroupCreateParams.Product.builder().productId("product_id").status(true).build()
            )
            .groupName("group_name")
            .status(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            GroupCreateParams.builder()
                .id("id")
                .addProduct(GroupCreateParams.Product.builder().productId("product_id").build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            GroupCreateParams.builder()
                .id("id")
                .addProduct(
                    GroupCreateParams.Product.builder().productId("product_id").status(true).build()
                )
                .groupName("group_name")
                .status(true)
                .build()

        val body = params._body()

        assertThat(body.products())
            .containsExactly(
                GroupCreateParams.Product.builder().productId("product_id").status(true).build()
            )
        assertThat(body.groupName()).isEqualTo("group_name")
        assertThat(body.status()).isEqualTo(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            GroupCreateParams.builder()
                .id("id")
                .addProduct(GroupCreateParams.Product.builder().productId("product_id").build())
                .build()

        val body = params._body()

        assertThat(body.products())
            .containsExactly(GroupCreateParams.Product.builder().productId("product_id").build())
    }
}
