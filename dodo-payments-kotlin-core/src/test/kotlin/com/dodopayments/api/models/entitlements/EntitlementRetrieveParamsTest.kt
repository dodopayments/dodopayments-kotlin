// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements

import com.dodopayments.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementRetrieveParamsTest {

    @Test
    fun create() {
        EntitlementRetrieveParams.builder().id("ent_jt7jcvI79Xh8eehqgWdcm").locale("locale").build()
    }

    @Test
    fun pathParams() {
        val params = EntitlementRetrieveParams.builder().id("ent_jt7jcvI79Xh8eehqgWdcm").build()

        assertThat(params._pathParam(0)).isEqualTo("ent_jt7jcvI79Xh8eehqgWdcm")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            EntitlementRetrieveParams.builder()
                .id("ent_jt7jcvI79Xh8eehqgWdcm")
                .locale("locale")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("locale", "locale").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EntitlementRetrieveParams.builder().id("ent_jt7jcvI79Xh8eehqgWdcm").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
