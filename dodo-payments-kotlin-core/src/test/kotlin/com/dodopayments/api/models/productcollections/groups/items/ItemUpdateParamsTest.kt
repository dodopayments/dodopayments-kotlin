// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.productcollections.groups.items

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemUpdateParamsTest {

    @Test
    fun create() {
        ItemUpdateParams.builder()
            .id("id")
            .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .itemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .status(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ItemUpdateParams.builder()
                .id("id")
                .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .itemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(true)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(2)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ItemUpdateParams.builder()
                .id("id")
                .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .itemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(true)
                .build()

        val body = params._body()

        assertThat(body.status()).isEqualTo(true)
    }
}
