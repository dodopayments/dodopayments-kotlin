// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.productcollections.groups.items

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemDeleteParamsTest {

    @Test
    fun create() {
        ItemDeleteParams.builder()
            .id("pdc_8BWv0hojwUH7iCDabr0NI")
            .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .itemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ItemDeleteParams.builder()
                .id("pdc_8BWv0hojwUH7iCDabr0NI")
                .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .itemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("pdc_8BWv0hojwUH7iCDabr0NI")
        assertThat(params._pathParam(1)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(2)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }
}
