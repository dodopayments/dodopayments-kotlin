// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.productcollections

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductCollectionCreateParamsTest {

    @Test
    fun create() {
        ProductCollectionCreateParams.builder()
            .addGroup(
                ProductCollectionCreateParams.Group.builder()
                    .addProduct(
                        ProductCollectionCreateParams.Group.Product.builder()
                            .productId("product_id")
                            .status(true)
                            .build()
                    )
                    .groupName("group_name")
                    .status(true)
                    .build()
            )
            .name("name")
            .brandId("brand_id")
            .description("description")
            .build()
    }

    @Test
    fun body() {
        val params =
            ProductCollectionCreateParams.builder()
                .addGroup(
                    ProductCollectionCreateParams.Group.builder()
                        .addProduct(
                            ProductCollectionCreateParams.Group.Product.builder()
                                .productId("product_id")
                                .status(true)
                                .build()
                        )
                        .groupName("group_name")
                        .status(true)
                        .build()
                )
                .name("name")
                .brandId("brand_id")
                .description("description")
                .build()

        val body = params._body()

        assertThat(body.groups())
            .containsExactly(
                ProductCollectionCreateParams.Group.builder()
                    .addProduct(
                        ProductCollectionCreateParams.Group.Product.builder()
                            .productId("product_id")
                            .status(true)
                            .build()
                    )
                    .groupName("group_name")
                    .status(true)
                    .build()
            )
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.brandId()).isEqualTo("brand_id")
        assertThat(body.description()).isEqualTo("description")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ProductCollectionCreateParams.builder()
                .addGroup(
                    ProductCollectionCreateParams.Group.builder()
                        .addProduct(
                            ProductCollectionCreateParams.Group.Product.builder()
                                .productId("product_id")
                                .build()
                        )
                        .build()
                )
                .name("name")
                .build()

        val body = params._body()

        assertThat(body.groups())
            .containsExactly(
                ProductCollectionCreateParams.Group.builder()
                    .addProduct(
                        ProductCollectionCreateParams.Group.Product.builder()
                            .productId("product_id")
                            .build()
                    )
                    .build()
            )
        assertThat(body.name()).isEqualTo("name")
    }
}
