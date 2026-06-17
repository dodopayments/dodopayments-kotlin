// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookRetrieveSecretParamsTest {

    @Test
    fun create() {
        WebhookRetrieveSecretParams.builder().webhookId("whk_YdWqVEGKmSYKbsIyDxEab").build()
    }

    @Test
    fun pathParams() {
        val params =
            WebhookRetrieveSecretParams.builder().webhookId("whk_YdWqVEGKmSYKbsIyDxEab").build()

        assertThat(params._pathParam(0)).isEqualTo("whk_YdWqVEGKmSYKbsIyDxEab")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
