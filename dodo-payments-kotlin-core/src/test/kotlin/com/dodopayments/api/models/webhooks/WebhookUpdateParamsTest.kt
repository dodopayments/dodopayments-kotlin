// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.webhookevents.WebhookEventType
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookUpdateParamsTest {

    @Test
    fun create() {
        WebhookUpdateParams.builder()
            .webhookId("webhook_id")
            .description("description")
            .disabled(true)
            .addFilterType(WebhookEventType.PAYMENT_SUCCEEDED)
            .metadata(
                WebhookUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .rateLimit(0)
            .url("url")
            .build()
    }

    @Test
    fun pathParams() {
        val params = WebhookUpdateParams.builder().webhookId("webhook_id").build()

        assertThat(params._pathParam(0)).isEqualTo("webhook_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            WebhookUpdateParams.builder()
                .webhookId("webhook_id")
                .description("description")
                .disabled(true)
                .addFilterType(WebhookEventType.PAYMENT_SUCCEEDED)
                .metadata(
                    WebhookUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .rateLimit(0)
                .url("url")
                .build()

        val body = params._body()

        assertThat(body.description()).isEqualTo("description")
        assertThat(body.disabled()).isEqualTo(true)
        assertThat(body.filterTypes()).containsExactly(WebhookEventType.PAYMENT_SUCCEEDED)
        assertThat(body.metadata())
            .isEqualTo(
                WebhookUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.rateLimit()).isEqualTo(0)
        assertThat(body.url()).isEqualTo("url")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = WebhookUpdateParams.builder().webhookId("webhook_id").build()

        val body = params._body()
    }
}
