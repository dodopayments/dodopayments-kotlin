// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionRetrieveParamsTest {

    @Test
    fun create() {
        SubscriptionRetrieveParams.builder().subscriptionId("sub_Iuaq622bbmmfOGrVTqdXv").build()
    }

    @Test
    fun pathParams() {
        val params =
            SubscriptionRetrieveParams.builder().subscriptionId("sub_Iuaq622bbmmfOGrVTqdXv").build()

        assertThat(params._pathParam(0)).isEqualTo("sub_Iuaq622bbmmfOGrVTqdXv")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
