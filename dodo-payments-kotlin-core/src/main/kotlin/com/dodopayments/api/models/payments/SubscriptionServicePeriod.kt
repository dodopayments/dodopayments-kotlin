// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

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

/** The service period that a payment pays for, for one subscription. */
class SubscriptionServicePeriod
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val endsAt: JsonField<OffsetDateTime>,
    private val startsAt: JsonField<OffsetDateTime>,
    private val subscriptionId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("ends_at")
        @ExcludeMissing
        endsAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("starts_at")
        @ExcludeMissing
        startsAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("subscription_id")
        @ExcludeMissing
        subscriptionId: JsonField<String> = JsonMissing.of(),
    ) : this(endsAt, startsAt, subscriptionId, mutableMapOf())

    /**
     * End of the service period.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endsAt(): OffsetDateTime = endsAt.getRequired("ends_at")

    /**
     * Start of the service period. For a renewal, this is the billing date. For a plan change that
     * applies at the next billing date, this is the time when the change applied. This time can be
     * some minutes after the billing date.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startsAt(): OffsetDateTime = startsAt.getRequired("starts_at")

    /**
     * Identifier of the subscription.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriptionId(): String = subscriptionId.getRequired("subscription_id")

    /**
     * Returns the raw JSON value of [endsAt].
     *
     * Unlike [endsAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ends_at") @ExcludeMissing fun _endsAt(): JsonField<OffsetDateTime> = endsAt

    /**
     * Returns the raw JSON value of [startsAt].
     *
     * Unlike [startsAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("starts_at") @ExcludeMissing fun _startsAt(): JsonField<OffsetDateTime> = startsAt

    /**
     * Returns the raw JSON value of [subscriptionId].
     *
     * Unlike [subscriptionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subscription_id")
    @ExcludeMissing
    fun _subscriptionId(): JsonField<String> = subscriptionId

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
         * Returns a mutable builder for constructing an instance of [SubscriptionServicePeriod].
         *
         * The following fields are required:
         * ```kotlin
         * .endsAt()
         * .startsAt()
         * .subscriptionId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SubscriptionServicePeriod]. */
    class Builder internal constructor() {

        private var endsAt: JsonField<OffsetDateTime>? = null
        private var startsAt: JsonField<OffsetDateTime>? = null
        private var subscriptionId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(subscriptionServicePeriod: SubscriptionServicePeriod) = apply {
            endsAt = subscriptionServicePeriod.endsAt
            startsAt = subscriptionServicePeriod.startsAt
            subscriptionId = subscriptionServicePeriod.subscriptionId
            additionalProperties = subscriptionServicePeriod.additionalProperties.toMutableMap()
        }

        /** End of the service period. */
        fun endsAt(endsAt: OffsetDateTime) = endsAt(JsonField.of(endsAt))

        /**
         * Sets [Builder.endsAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endsAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endsAt(endsAt: JsonField<OffsetDateTime>) = apply { this.endsAt = endsAt }

        /**
         * Start of the service period. For a renewal, this is the billing date. For a plan change
         * that applies at the next billing date, this is the time when the change applied. This
         * time can be some minutes after the billing date.
         */
        fun startsAt(startsAt: OffsetDateTime) = startsAt(JsonField.of(startsAt))

        /**
         * Sets [Builder.startsAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startsAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startsAt(startsAt: JsonField<OffsetDateTime>) = apply { this.startsAt = startsAt }

        /** Identifier of the subscription. */
        fun subscriptionId(subscriptionId: String) = subscriptionId(JsonField.of(subscriptionId))

        /**
         * Sets [Builder.subscriptionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscriptionId(subscriptionId: JsonField<String>) = apply {
            this.subscriptionId = subscriptionId
        }

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
         * Returns an immutable instance of [SubscriptionServicePeriod].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .endsAt()
         * .startsAt()
         * .subscriptionId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubscriptionServicePeriod =
            SubscriptionServicePeriod(
                checkRequired("endsAt", endsAt),
                checkRequired("startsAt", startsAt),
                checkRequired("subscriptionId", subscriptionId),
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
    fun validate(): SubscriptionServicePeriod = apply {
        if (validated) {
            return@apply
        }

        endsAt()
        startsAt()
        subscriptionId()
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
        (if (endsAt.asKnown() == null) 0 else 1) +
            (if (startsAt.asKnown() == null) 0 else 1) +
            (if (subscriptionId.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionServicePeriod &&
            endsAt == other.endsAt &&
            startsAt == other.startsAt &&
            subscriptionId == other.subscriptionId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(endsAt, startsAt, subscriptionId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubscriptionServicePeriod{endsAt=$endsAt, startsAt=$startsAt, subscriptionId=$subscriptionId, additionalProperties=$additionalProperties}"
}
