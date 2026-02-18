// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.UnwrapWebhookParams
import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.errors.DodoPaymentsWebhookException
import com.dodopayments.api.models.webhookevents.WebhookEventType
import com.dodopayments.api.models.webhooks.WebhookCreateParams
import com.dodopayments.api.models.webhooks.WebhookUpdateParams
import com.standardwebhooks.Webhook
import java.time.Instant
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WebhookServiceTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val webhookService = client.webhooks()

        val webhookDetails =
            webhookService.create(
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
            )

        webhookDetails.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val webhookService = client.webhooks()

        val webhookDetails = webhookService.retrieve("webhook_id")

        webhookDetails.validate()
    }

    @Test
    fun update() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val webhookService = client.webhooks()

        val webhookDetails =
            webhookService.update(
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
            )

        webhookDetails.validate()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val webhookService = client.webhooks()

        val page = webhookService.list()

        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val webhookService = client.webhooks()

        webhookService.delete("webhook_id")
    }

    @Test
    fun retrieveSecret() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val webhookService = client.webhooks()

        val response = webhookService.retrieveSecret("webhook_id")

        response.validate()
    }

    @Test
    fun unsafeUnwrap() {
        val client = DodoPaymentsOkHttpClient.builder().bearerToken("My Bearer Token").build()
        val webhookService = client.webhooks()

        val payload =
            "{\"business_id\":\"business_id\",\"data\":{\"amount\":\"amount\",\"business_id\":\"business_id\",\"created_at\":\"2019-12-27T18:11:19.117Z\",\"currency\":\"currency\",\"dispute_id\":\"dispute_id\",\"dispute_stage\":\"pre_dispute\",\"dispute_status\":\"dispute_opened\",\"payment_id\":\"payment_id\",\"remarks\":\"remarks\"},\"timestamp\":\"2019-12-27T18:11:19.117Z\",\"type\":\"dispute.accepted\"}"
        val webhookSecret = "whsec_c2VjcmV0Cg=="
        val headers = Headers.builder().build()

        webhookService.unsafeUnwrap(payload).validate()
    }

    @Test
    fun unwrap() {
        val client = DodoPaymentsOkHttpClient.builder().bearerToken("My Bearer Token").build()
        val webhookService = client.webhooks()

        val payload =
            "{\"business_id\":\"business_id\",\"data\":{\"amount\":\"amount\",\"business_id\":\"business_id\",\"created_at\":\"2019-12-27T18:11:19.117Z\",\"currency\":\"currency\",\"dispute_id\":\"dispute_id\",\"dispute_stage\":\"pre_dispute\",\"dispute_status\":\"dispute_opened\",\"payment_id\":\"payment_id\",\"remarks\":\"remarks\"},\"timestamp\":\"2019-12-27T18:11:19.117Z\",\"type\":\"dispute.accepted\"}"
        val webhookSecret = "whsec_c2VjcmV0Cg=="
        val messageId = "1"
        val timestampSeconds = Instant.now().epochSecond
        val webhook = Webhook(webhookSecret)
        val signature = webhook.sign(messageId, timestampSeconds, payload)
        val headers =
            Headers.builder()
                .putAll(
                    mapOf(
                        "webhook-signature" to listOf(signature),
                        "webhook-id" to listOf(messageId),
                        "webhook-timestamp" to listOf(timestampSeconds.toString()),
                    )
                )
                .build()

        webhookService.unwrap(payload).validate()

        // Wrong key should throw
        assertThrows<DodoPaymentsWebhookException> {
            val wrongKey = "whsec_aaaaaaaaaa"
            webhookService.unwrap(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(headers)
                    .secret(wrongKey)
                    .build()
            )
        }

        // Bad signature should throw
        assertThrows<DodoPaymentsWebhookException> {
            val badSig = webhook.sign(messageId, timestampSeconds, "some other payload")
            val badHeaders =
                headers.toBuilder().replace("webhook-signature", listOf(badSig)).build()
            webhookService.unwrap(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(badHeaders)
                    .secret(webhookSecret)
                    .build()
            )
        }

        // Old timestamp should throw
        assertThrows<DodoPaymentsWebhookException> {
            val oldHeaders = headers.toBuilder().replace("webhook-timestamp", listOf("5")).build()
            webhookService.unwrap(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(oldHeaders)
                    .secret(webhookSecret)
                    .build()
            )
        }

        // Wrong message ID should throw
        assertThrows<DodoPaymentsWebhookException> {
            val wrongIdHeaders = headers.toBuilder().replace("webhook-id", listOf("wrong")).build()
            webhookService.unwrap(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(wrongIdHeaders)
                    .secret(webhookSecret)
                    .build()
            )
        }
    }
}
