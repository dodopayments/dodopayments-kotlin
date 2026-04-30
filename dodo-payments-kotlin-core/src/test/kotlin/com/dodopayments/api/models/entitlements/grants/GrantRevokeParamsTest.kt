// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements.grants

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GrantRevokeParamsTest {

    @Test
    fun create() {
        GrantRevokeParams.builder().id("id").grantId("grant_id").build()
    }

    @Test
    fun pathParams() {
        val params = GrantRevokeParams.builder().id("id").grantId("grant_id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("grant_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
