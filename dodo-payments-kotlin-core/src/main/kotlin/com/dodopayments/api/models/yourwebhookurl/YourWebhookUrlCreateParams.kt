// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.yourwebhookurl

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.Params
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.core.http.QueryParams
import com.dodopayments.api.models.webhookevents.WebhookPayload
import java.util.Objects

class YourWebhookUrlCreateParams
private constructor(
    private val webhookId: String,
    private val webhookSignature: String,
    private val webhookTimestamp: String,
    private val webhookPayload: WebhookPayload,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun webhookId(): String = webhookId

    fun webhookSignature(): String = webhookSignature

    fun webhookTimestamp(): String = webhookTimestamp

    fun webhookPayload(): WebhookPayload = webhookPayload

    fun _additionalBodyProperties(): Map<String, JsonValue> = webhookPayload._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [YourWebhookUrlCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .webhookId()
         * .webhookSignature()
         * .webhookTimestamp()
         * .webhookPayload()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [YourWebhookUrlCreateParams]. */
    class Builder internal constructor() {

        private var webhookId: String? = null
        private var webhookSignature: String? = null
        private var webhookTimestamp: String? = null
        private var webhookPayload: WebhookPayload? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(yourWebhookUrlCreateParams: YourWebhookUrlCreateParams) = apply {
            webhookId = yourWebhookUrlCreateParams.webhookId
            webhookSignature = yourWebhookUrlCreateParams.webhookSignature
            webhookTimestamp = yourWebhookUrlCreateParams.webhookTimestamp
            webhookPayload = yourWebhookUrlCreateParams.webhookPayload
            additionalHeaders = yourWebhookUrlCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = yourWebhookUrlCreateParams.additionalQueryParams.toBuilder()
        }

        fun webhookId(webhookId: String) = apply { this.webhookId = webhookId }

        fun webhookSignature(webhookSignature: String) = apply {
            this.webhookSignature = webhookSignature
        }

        fun webhookTimestamp(webhookTimestamp: String) = apply {
            this.webhookTimestamp = webhookTimestamp
        }

        fun webhookPayload(webhookPayload: WebhookPayload) = apply {
            this.webhookPayload = webhookPayload
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [YourWebhookUrlCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .webhookId()
         * .webhookSignature()
         * .webhookTimestamp()
         * .webhookPayload()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): YourWebhookUrlCreateParams =
            YourWebhookUrlCreateParams(
                checkRequired("webhookId", webhookId),
                checkRequired("webhookSignature", webhookSignature),
                checkRequired("webhookTimestamp", webhookTimestamp),
                checkRequired("webhookPayload", webhookPayload),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): WebhookPayload = webhookPayload

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                put("webhook-id", webhookId)
                put("webhook-signature", webhookSignature)
                put("webhook-timestamp", webhookTimestamp)
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is YourWebhookUrlCreateParams &&
            webhookId == other.webhookId &&
            webhookSignature == other.webhookSignature &&
            webhookTimestamp == other.webhookTimestamp &&
            webhookPayload == other.webhookPayload &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            webhookId,
            webhookSignature,
            webhookTimestamp,
            webhookPayload,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "YourWebhookUrlCreateParams{webhookId=$webhookId, webhookSignature=$webhookSignature, webhookTimestamp=$webhookTimestamp, webhookPayload=$webhookPayload, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
