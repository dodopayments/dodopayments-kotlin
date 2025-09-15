// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.usageevents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageEventRetrieveParamsTest {

    @Test
    fun create() {
        UsageEventRetrieveParams.builder().eventId("event_id").build()
    }

    @Test
    fun pathParams() {
        val params = UsageEventRetrieveParams.builder().eventId("event_id").build()

        assertThat(params._pathParam(0)).isEqualTo("event_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
