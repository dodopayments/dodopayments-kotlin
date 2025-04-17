// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.webhookevents

import com.dodo_payments.api.core.ExcludeMissing
import com.dodo_payments.api.core.JsonField
import com.dodo_payments.api.core.JsonMissing
import com.dodo_payments.api.core.JsonValue
import com.dodo_payments.api.core.NoAutoDetect
import com.dodo_payments.api.core.checkRequired
import com.dodo_payments.api.core.immutableEmptyMap
import com.dodo_payments.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class WebhookEvent
@JsonCreator
private constructor(
    @JsonProperty("business_id")
    @ExcludeMissing
    private val businessId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("event_id")
    @ExcludeMissing
    private val eventId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("event_type")
    @ExcludeMissing
    private val eventType: JsonField<String> = JsonMissing.of(),
    @JsonProperty("object_id")
    @ExcludeMissing
    private val objectId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("latest_attempted_at")
    @ExcludeMissing
    private val latestAttemptedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("request")
    @ExcludeMissing
    private val request: JsonField<String> = JsonMissing.of(),
    @JsonProperty("response")
    @ExcludeMissing
    private val response: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun businessId(): String = businessId.getRequired("business_id")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun eventId(): String = eventId.getRequired("event_id")

    fun eventType(): String = eventType.getRequired("event_type")

    fun objectId(): String = objectId.getRequired("object_id")

    fun latestAttemptedAt(): OffsetDateTime? = latestAttemptedAt.getNullable("latest_attempted_at")

    fun request(): String? = request.getNullable("request")

    fun response(): String? = response.getNullable("response")

    @JsonProperty("business_id") @ExcludeMissing fun _businessId(): JsonField<String> = businessId

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    @JsonProperty("event_id") @ExcludeMissing fun _eventId(): JsonField<String> = eventId

    @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonField<String> = eventType

    @JsonProperty("object_id") @ExcludeMissing fun _objectId(): JsonField<String> = objectId

    @JsonProperty("latest_attempted_at")
    @ExcludeMissing
    fun _latestAttemptedAt(): JsonField<OffsetDateTime> = latestAttemptedAt

    @JsonProperty("request") @ExcludeMissing fun _request(): JsonField<String> = request

    @JsonProperty("response") @ExcludeMissing fun _response(): JsonField<String> = response

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): WebhookEvent = apply {
        if (validated) {
            return@apply
        }

        businessId()
        createdAt()
        eventId()
        eventType()
        objectId()
        latestAttemptedAt()
        request()
        response()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WebhookEvent].
         *
         * The following fields are required:
         * ```kotlin
         * .businessId()
         * .createdAt()
         * .eventId()
         * .eventType()
         * .objectId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [WebhookEvent]. */
    class Builder internal constructor() {

        private var businessId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var eventId: JsonField<String>? = null
        private var eventType: JsonField<String>? = null
        private var objectId: JsonField<String>? = null
        private var latestAttemptedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var request: JsonField<String> = JsonMissing.of()
        private var response: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(webhookEvent: WebhookEvent) = apply {
            businessId = webhookEvent.businessId
            createdAt = webhookEvent.createdAt
            eventId = webhookEvent.eventId
            eventType = webhookEvent.eventType
            objectId = webhookEvent.objectId
            latestAttemptedAt = webhookEvent.latestAttemptedAt
            request = webhookEvent.request
            response = webhookEvent.response
            additionalProperties = webhookEvent.additionalProperties.toMutableMap()
        }

        fun businessId(businessId: String) = businessId(JsonField.of(businessId))

        fun businessId(businessId: JsonField<String>) = apply { this.businessId = businessId }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun eventId(eventId: String) = eventId(JsonField.of(eventId))

        fun eventId(eventId: JsonField<String>) = apply { this.eventId = eventId }

        fun eventType(eventType: String) = eventType(JsonField.of(eventType))

        fun eventType(eventType: JsonField<String>) = apply { this.eventType = eventType }

        fun objectId(objectId: String) = objectId(JsonField.of(objectId))

        fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

        fun latestAttemptedAt(latestAttemptedAt: OffsetDateTime?) =
            latestAttemptedAt(JsonField.ofNullable(latestAttemptedAt))

        fun latestAttemptedAt(latestAttemptedAt: JsonField<OffsetDateTime>) = apply {
            this.latestAttemptedAt = latestAttemptedAt
        }

        fun request(request: String?) = request(JsonField.ofNullable(request))

        fun request(request: JsonField<String>) = apply { this.request = request }

        fun response(response: String?) = response(JsonField.ofNullable(response))

        fun response(response: JsonField<String>) = apply { this.response = response }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        fun build(): WebhookEvent =
            WebhookEvent(
                checkRequired("businessId", businessId),
                checkRequired("createdAt", createdAt),
                checkRequired("eventId", eventId),
                checkRequired("eventType", eventType),
                checkRequired("objectId", objectId),
                latestAttemptedAt,
                request,
                response,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is WebhookEvent && businessId == other.businessId && createdAt == other.createdAt && eventId == other.eventId && eventType == other.eventType && objectId == other.objectId && latestAttemptedAt == other.latestAttemptedAt && request == other.request && response == other.response && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(businessId, createdAt, eventId, eventType, objectId, latestAttemptedAt, request, response, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WebhookEvent{businessId=$businessId, createdAt=$createdAt, eventId=$eventId, eventType=$eventType, objectId=$objectId, latestAttemptedAt=$latestAttemptedAt, request=$request, response=$response, additionalProperties=$additionalProperties}"
}
