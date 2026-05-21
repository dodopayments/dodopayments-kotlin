// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.productcollections.groups

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupCreateParamsTest {

    @Test
    fun create() {
        GroupCreateParams.builder()
            .id("id")
            .productCollectionGroupDetails(
                ProductCollectionGroupDetails.builder()
                    .addProduct(GroupProduct.builder().productId("product_id").status(true).build())
                    .groupName("group_name")
                    .status(true)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            GroupCreateParams.builder()
                .id("id")
                .productCollectionGroupDetails(
                    ProductCollectionGroupDetails.builder()
                        .addProduct(GroupProduct.builder().productId("product_id").build())
                        .build()
                )
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
                .productCollectionGroupDetails(
                    ProductCollectionGroupDetails.builder()
                        .addProduct(
                            GroupProduct.builder().productId("product_id").status(true).build()
                        )
                        .groupName("group_name")
                        .status(true)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ProductCollectionGroupDetails.builder()
                    .addProduct(GroupProduct.builder().productId("product_id").status(true).build())
                    .groupName("group_name")
                    .status(true)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            GroupCreateParams.builder()
                .id("id")
                .productCollectionGroupDetails(
                    ProductCollectionGroupDetails.builder()
                        .addProduct(GroupProduct.builder().productId("product_id").build())
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ProductCollectionGroupDetails.builder()
                    .addProduct(GroupProduct.builder().productId("product_id").build())
                    .build()
            )
    }
}
