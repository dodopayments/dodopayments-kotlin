// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.creditentitlements

import com.dodopayments.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditEntitlementRetrieveParamsTest {

    @Test
    fun create() {
        CreditEntitlementRetrieveParams.builder()
            .id("cde_ztxm5XJsKxWucRWA3rjdM")
            .locale("locale")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CreditEntitlementRetrieveParams.builder().id("cde_ztxm5XJsKxWucRWA3rjdM").build()

        assertThat(params._pathParam(0)).isEqualTo("cde_ztxm5XJsKxWucRWA3rjdM")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            CreditEntitlementRetrieveParams.builder()
                .id("cde_ztxm5XJsKxWucRWA3rjdM")
                .locale("locale")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("locale", "locale").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            CreditEntitlementRetrieveParams.builder().id("cde_ztxm5XJsKxWucRWA3rjdM").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
