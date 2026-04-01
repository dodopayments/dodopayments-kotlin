// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
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
internal class WebhookServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val webhookServiceAsync = client.webhooks()

        val webhookDetails =
            webhookServiceAsync.create(
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
    suspend fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val webhookServiceAsync = client.webhooks()

        val webhookDetails = webhookServiceAsync.retrieve("webhook_id")

        webhookDetails.validate()
    }

    @Test
    suspend fun update() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val webhookServiceAsync = client.webhooks()

        val webhookDetails =
            webhookServiceAsync.update(
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
    suspend fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val webhookServiceAsync = client.webhooks()

        val page = webhookServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun delete() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val webhookServiceAsync = client.webhooks()

        webhookServiceAsync.delete("webhook_id")
    }

    @Test
    suspend fun retrieveSecret() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val webhookServiceAsync = client.webhooks()

        val response = webhookServiceAsync.retrieveSecret("webhook_id")

        response.validate()
    }

    @Test
    suspend fun unsafeUnwrap() {
        val client = DodoPaymentsOkHttpClientAsync.builder().bearerToken("My Bearer Token").build()
        val webhookServiceAsync = client.webhooks()

        val payload =
            "{\"business_id\":\"business_id\",\"data\":{\"abandoned_at\":\"2019-12-27T18:11:19.117Z\",\"abandonment_reason\":\"payment_failed\",\"customer_id\":\"customer_id\",\"payment_id\":\"payment_id\",\"status\":\"abandoned\",\"recovered_payment_id\":\"recovered_payment_id\"},\"timestamp\":\"2019-12-27T18:11:19.117Z\",\"type\":\"abandoned_checkout.detected\"}"
        val webhookSecret = "whsec_c2VjcmV0Cg=="
        val headers = Headers.builder().build()

        webhookServiceAsync.unsafeUnwrap(payload).validate()
    }

    @Test
    suspend fun unwrap() {
        val client = DodoPaymentsOkHttpClientAsync.builder().bearerToken("My Bearer Token").build()
        val webhookServiceAsync = client.webhooks()

        val payload =
            "{\"business_id\":\"business_id\",\"data\":{\"abandoned_at\":\"2019-12-27T18:11:19.117Z\",\"abandonment_reason\":\"payment_failed\",\"customer_id\":\"customer_id\",\"payment_id\":\"payment_id\",\"status\":\"abandoned\",\"recovered_payment_id\":\"recovered_payment_id\"},\"timestamp\":\"2019-12-27T18:11:19.117Z\",\"type\":\"abandoned_checkout.detected\"}"
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

        // Correct key should not throw
        webhookServiceAsync.unwrap(
            UnwrapWebhookParams.builder()
                .body(payload)
                .headers(headers)
                .secret(webhookSecret)
                .build()
        )
        webhookServiceAsync
            .withOptions { it.webhookKey(webhookSecret) }
            .unwrap(UnwrapWebhookParams.builder().body(payload).headers(headers).build())

        // Secret in method takes precedence to secret on client
        val wrongKey = "whsec_aaaaaaaaaa"
        webhookServiceAsync
            .withOptions { it.webhookKey(wrongKey) }
            .unwrap(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(headers)
                    .secret(webhookSecret)
                    .build()
            )

        // Wrong key should throw
        assertThrows<DodoPaymentsWebhookException> {
            val wrongKey = "whsec_aaaaaaaaaa"
            webhookServiceAsync.unwrap(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(headers)
                    .secret(wrongKey)
                    .build()
            )
        }
        assertThrows<DodoPaymentsWebhookException> {
            val wrongKey = "whsec_aaaaaaaaaa"
            webhookServiceAsync
                .withOptions { it.webhookKey(wrongKey) }
                .unwrap(UnwrapWebhookParams.builder().body(payload).headers(headers).build())
        }

        assertThrows<DodoPaymentsWebhookException> {
            val wrongKey = "whsec_aaaaaaaaaa"
            webhookServiceAsync.unwrap(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(headers)
                    .secret(wrongKey)
                    .build()
            )
        }
        assertThrows<DodoPaymentsWebhookException> {
            val wrongKey = "whsec_aaaaaaaaaa"
            webhookServiceAsync
                .withOptions { it.webhookKey(wrongKey) }
                .unwrap(UnwrapWebhookParams.builder().body(payload).headers(headers).build())
        }

        // Bad signature should throw
        assertThrows<DodoPaymentsWebhookException> {
            val badSig = webhook.sign(messageId, timestampSeconds, "some other payload")
            val badHeaders =
                headers.toBuilder().replace("webhook-signature", listOf(badSig)).build()
            webhookServiceAsync.unwrap(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(badHeaders)
                    .secret(webhookSecret)
                    .build()
            )
        }
        assertThrows<DodoPaymentsWebhookException> {
            val badSig = webhook.sign(messageId, timestampSeconds, "some other payload")
            val badHeaders =
                headers.toBuilder().replace("webhook-signature", listOf(badSig)).build()
            webhookServiceAsync
                .withOptions { it.webhookKey(webhookSecret) }
                .unwrap(UnwrapWebhookParams.builder().body(payload).headers(badHeaders).build())
        }

        // Old timestamp should throw
        assertThrows<DodoPaymentsWebhookException> {
            val oldHeaders = headers.toBuilder().replace("webhook-timestamp", listOf("5")).build()
            webhookServiceAsync.unwrap(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(oldHeaders)
                    .secret(webhookSecret)
                    .build()
            )
        }
        assertThrows<DodoPaymentsWebhookException> {
            val oldHeaders = headers.toBuilder().replace("webhook-timestamp", listOf("5")).build()
            webhookServiceAsync
                .withOptions { it.webhookKey(webhookSecret) }
                .unwrap(UnwrapWebhookParams.builder().body(payload).headers(oldHeaders).build())
        }

        // Wrong message ID should throw
        assertThrows<DodoPaymentsWebhookException> {
            val wrongIdHeaders = headers.toBuilder().replace("webhook-id", listOf("wrong")).build()
            webhookServiceAsync.unwrap(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(wrongIdHeaders)
                    .secret(webhookSecret)
                    .build()
            )
        }
        assertThrows<DodoPaymentsWebhookException> {
            val wrongIdHeaders = headers.toBuilder().replace("webhook-id", listOf("wrong")).build()
            webhookServiceAsync
                .withOptions { it.webhookKey(webhookSecret) }
                .unwrap(UnwrapWebhookParams.builder().body(payload).headers(wrongIdHeaders).build())
        }
    }
}
