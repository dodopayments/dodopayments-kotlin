// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements.grants

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GrantRevokeParamsTest {

    @Test
    fun create() {
        GrantRevokeParams.builder()
            .id("ent_jt7jcvI79Xh8eehqgWdcm")
            .grantId("entg_w0ZCJZgNXuNDdMVzvja6p")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            GrantRevokeParams.builder()
                .id("ent_jt7jcvI79Xh8eehqgWdcm")
                .grantId("entg_w0ZCJZgNXuNDdMVzvja6p")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("ent_jt7jcvI79Xh8eehqgWdcm")
        assertThat(params._pathParam(1)).isEqualTo("entg_w0ZCJZgNXuNDdMVzvja6p")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
