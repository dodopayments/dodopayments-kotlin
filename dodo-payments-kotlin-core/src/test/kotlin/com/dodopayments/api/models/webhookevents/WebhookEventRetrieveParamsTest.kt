// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhookevents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WebhookEventRetrieveParamsTest {

    @Test
    fun create() {
        WebhookEventRetrieveParams.builder().webhookEventId("webhook_event_id").build()
    }

    @Test
    fun getPathParam() {
        val params = WebhookEventRetrieveParams.builder().webhookEventId("webhook_event_id").build()
        assertThat(params).isNotNull
        // path param "webhookEventId"
        assertThat(params.getPathParam(0)).isEqualTo("webhook_event_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
