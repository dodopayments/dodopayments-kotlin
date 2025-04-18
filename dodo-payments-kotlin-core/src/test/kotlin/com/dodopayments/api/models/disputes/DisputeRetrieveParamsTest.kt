// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.disputes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DisputeRetrieveParamsTest {

    @Test
    fun create() {
        DisputeRetrieveParams.builder().disputeId("dispute_id").build()
    }

    @Test
    fun pathParams() {
        val params = DisputeRetrieveParams.builder().disputeId("dispute_id").build()

        assertThat(params._pathParam(0)).isEqualTo("dispute_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
