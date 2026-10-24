// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionRetrieveParamsTest {

    @Test
    fun create() {
        SubscriptionRetrieveParams.builder()
            .subscriptionId("sub_Iuaq622bbmmfOGrVTqdXv")
            .locale("locale")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SubscriptionRetrieveParams.builder().subscriptionId("sub_Iuaq622bbmmfOGrVTqdXv").build()

        assertThat(params._pathParam(0)).isEqualTo("sub_Iuaq622bbmmfOGrVTqdXv")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            SubscriptionRetrieveParams.builder()
                .subscriptionId("sub_Iuaq622bbmmfOGrVTqdXv")
                .locale("locale")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("locale", "locale").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            SubscriptionRetrieveParams.builder().subscriptionId("sub_Iuaq622bbmmfOGrVTqdXv").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
