// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.invoices

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class InvoiceEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val actor: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val eventId: JsonField<String>,
    private val eventType: JsonField<String>,
    private val payload: JsonValue,
    private val rowVersion: JsonField<Long>,
    private val actorEmail: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("actor") @ExcludeMissing actor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("event_id") @ExcludeMissing eventId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("event_type") @ExcludeMissing eventType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payload") @ExcludeMissing payload: JsonValue = JsonMissing.of(),
        @JsonProperty("row_version") @ExcludeMissing rowVersion: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("actor_email")
        @ExcludeMissing
        actorEmail: JsonField<String> = JsonMissing.of(),
    ) : this(actor, createdAt, eventId, eventType, payload, rowVersion, actorEmail, mutableMapOf())

    /**
     * A user ID, `api_key`, `customer` or `system`.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun actor(): String = actor.getRequired("actor")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventId(): String = eventId.getRequired("event_id")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventType(): String = eventType.getRequired("event_type")

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = invoiceEvent.payload().convert(MyClass::class.java)
     * ```
     */
    @JsonProperty("payload") @ExcludeMissing fun _payload(): JsonValue = payload

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rowVersion(): Long = rowVersion.getRequired("row_version")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun actorEmail(): String? = actorEmail.getNullable("actor_email")

    /**
     * Returns the raw JSON value of [actor].
     *
     * Unlike [actor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actor") @ExcludeMissing fun _actor(): JsonField<String> = actor

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [eventId].
     *
     * Unlike [eventId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_id") @ExcludeMissing fun _eventId(): JsonField<String> = eventId

    /**
     * Returns the raw JSON value of [eventType].
     *
     * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonField<String> = eventType

    /**
     * Returns the raw JSON value of [rowVersion].
     *
     * Unlike [rowVersion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("row_version") @ExcludeMissing fun _rowVersion(): JsonField<Long> = rowVersion

    /**
     * Returns the raw JSON value of [actorEmail].
     *
     * Unlike [actorEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actor_email") @ExcludeMissing fun _actorEmail(): JsonField<String> = actorEmail

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InvoiceEvent].
         *
         * The following fields are required:
         * ```kotlin
         * .actor()
         * .createdAt()
         * .eventId()
         * .eventType()
         * .payload()
         * .rowVersion()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [InvoiceEvent]. */
    class Builder internal constructor() {

        private var actor: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var eventId: JsonField<String>? = null
        private var eventType: JsonField<String>? = null
        private var payload: JsonValue? = null
        private var rowVersion: JsonField<Long>? = null
        private var actorEmail: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(invoiceEvent: InvoiceEvent) = apply {
            actor = invoiceEvent.actor
            createdAt = invoiceEvent.createdAt
            eventId = invoiceEvent.eventId
            eventType = invoiceEvent.eventType
            payload = invoiceEvent.payload
            rowVersion = invoiceEvent.rowVersion
            actorEmail = invoiceEvent.actorEmail
            additionalProperties = invoiceEvent.additionalProperties.toMutableMap()
        }

        /** A user ID, `api_key`, `customer` or `system`. */
        fun actor(actor: String) = actor(JsonField.of(actor))

        /**
         * Sets [Builder.actor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actor] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun actor(actor: JsonField<String>) = apply { this.actor = actor }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun eventId(eventId: String) = eventId(JsonField.of(eventId))

        /**
         * Sets [Builder.eventId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun eventId(eventId: JsonField<String>) = apply { this.eventId = eventId }

        fun eventType(eventType: String) = eventType(JsonField.of(eventType))

        /**
         * Sets [Builder.eventType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventType(eventType: JsonField<String>) = apply { this.eventType = eventType }

        fun payload(payload: JsonValue) = apply { this.payload = payload }

        fun rowVersion(rowVersion: Long) = rowVersion(JsonField.of(rowVersion))

        /**
         * Sets [Builder.rowVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rowVersion] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rowVersion(rowVersion: JsonField<Long>) = apply { this.rowVersion = rowVersion }

        fun actorEmail(actorEmail: String?) = actorEmail(JsonField.ofNullable(actorEmail))

        /**
         * Sets [Builder.actorEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actorEmail] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun actorEmail(actorEmail: JsonField<String>) = apply { this.actorEmail = actorEmail }

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

        /**
         * Returns an immutable instance of [InvoiceEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .actor()
         * .createdAt()
         * .eventId()
         * .eventType()
         * .payload()
         * .rowVersion()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InvoiceEvent =
            InvoiceEvent(
                checkRequired("actor", actor),
                checkRequired("createdAt", createdAt),
                checkRequired("eventId", eventId),
                checkRequired("eventType", eventType),
                checkRequired("payload", payload),
                checkRequired("rowVersion", rowVersion),
                actorEmail,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): InvoiceEvent = apply {
        if (validated) {
            return@apply
        }

        actor()
        createdAt()
        eventId()
        eventType()
        rowVersion()
        actorEmail()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: DodoPaymentsInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (actor.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (eventId.asKnown() == null) 0 else 1) +
            (if (eventType.asKnown() == null) 0 else 1) +
            (if (rowVersion.asKnown() == null) 0 else 1) +
            (if (actorEmail.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InvoiceEvent &&
            actor == other.actor &&
            createdAt == other.createdAt &&
            eventId == other.eventId &&
            eventType == other.eventType &&
            payload == other.payload &&
            rowVersion == other.rowVersion &&
            actorEmail == other.actorEmail &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            actor,
            createdAt,
            eventId,
            eventType,
            payload,
            rowVersion,
            actorEmail,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InvoiceEvent{actor=$actor, createdAt=$createdAt, eventId=$eventId, eventType=$eventType, payload=$payload, rowVersion=$rowVersion, actorEmail=$actorEmail, additionalProperties=$additionalProperties}"
}
