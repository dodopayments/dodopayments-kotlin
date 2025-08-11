// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.webhookevents.WebhookEventType
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookCreateParamsTest {

    @Test
    fun create() {
        WebhookCreateParams.builder()
            .url("url")
            .description("description")
            .disabled(true)
            .addFilterType(WebhookEventType.PAYMENT_SUCCEEDED)
            .headers(
                WebhookCreateParams.Headers.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .idempotencyKey("idempotency_key")
            .metadata(
                WebhookCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .rateLimit(0)
            .build()
    }

    @Test
    fun body() {
        val params =
            WebhookCreateParams.builder()
                .url("url")
                .description("description")
                .disabled(true)
                .addFilterType(WebhookEventType.PAYMENT_SUCCEEDED)
                .headers(
                    WebhookCreateParams.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .idempotencyKey("idempotency_key")
                .metadata(
                    WebhookCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .rateLimit(0)
                .build()

        val body = params._body()

        assertThat(body.url()).isEqualTo("url")
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.disabled()).isEqualTo(true)
        assertThat(body.filterTypes()).containsExactly(WebhookEventType.PAYMENT_SUCCEEDED)
        assertThat(body.headers())
            .isEqualTo(
                WebhookCreateParams.Headers.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.idempotencyKey()).isEqualTo("idempotency_key")
        assertThat(body.metadata())
            .isEqualTo(
                WebhookCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.rateLimit()).isEqualTo(0)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = WebhookCreateParams.builder().url("url").build()

        val body = params._body()

        assertThat(body.url()).isEqualTo("url")
    }
}
