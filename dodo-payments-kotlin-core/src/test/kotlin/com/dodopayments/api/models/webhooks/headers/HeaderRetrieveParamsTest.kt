// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks.headers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HeaderRetrieveParamsTest {

    @Test
    fun create() {
        HeaderRetrieveParams.builder().webhookId("webhook_id").build()
    }

    @Test
    fun pathParams() {
        val params = HeaderRetrieveParams.builder().webhookId("webhook_id").build()

        assertThat(params._pathParam(0)).isEqualTo("webhook_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
