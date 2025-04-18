// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhookevents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookEventRetrieveParamsTest {

    @Test
    fun create() {
        WebhookEventRetrieveParams.builder().webhookEventId("webhook_event_id").build()
    }

    @Test
    fun pathParams() {
        val params = WebhookEventRetrieveParams.builder().webhookEventId("webhook_event_id").build()

        assertThat(params._pathParam(0)).isEqualTo("webhook_event_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
