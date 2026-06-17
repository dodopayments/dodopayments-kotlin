// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.productcollections.groups

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupUpdateParamsTest {

    @Test
    fun create() {
        GroupUpdateParams.builder()
            .id("pdc_8BWv0hojwUH7iCDabr0NI")
            .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .groupName("group_name")
            .addProductOrder("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .status(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            GroupUpdateParams.builder()
                .id("pdc_8BWv0hojwUH7iCDabr0NI")
                .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("pdc_8BWv0hojwUH7iCDabr0NI")
        assertThat(params._pathParam(1)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            GroupUpdateParams.builder()
                .id("pdc_8BWv0hojwUH7iCDabr0NI")
                .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .groupName("group_name")
                .addProductOrder("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(true)
                .build()

        val body = params._body()

        assertThat(body.groupName()).isEqualTo("group_name")
        assertThat(body.productOrder()).containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.status()).isEqualTo(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            GroupUpdateParams.builder()
                .id("pdc_8BWv0hojwUH7iCDabr0NI")
                .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
