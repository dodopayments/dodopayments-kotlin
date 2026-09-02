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

class ManualRetryState
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val canRetry: JsonField<Boolean>,
    private val sendsAllowed: JsonField<Long>,
    private val sendsUsed: JsonField<Long>,
    private val reason: JsonField<String>,
    private val retryAvailableAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("can_retry") @ExcludeMissing canRetry: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("sends_allowed")
        @ExcludeMissing
        sendsAllowed: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("sends_used") @ExcludeMissing sendsUsed: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("retry_available_at")
        @ExcludeMissing
        retryAvailableAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(canRetry, sendsAllowed, sendsUsed, reason, retryAvailableAt, mutableMapOf())

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun canRetry(): Boolean = canRetry.getRequired("can_retry")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sendsAllowed(): Long = sendsAllowed.getRequired("sends_allowed")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sendsUsed(): Long = sendsUsed.getRequired("sends_used")

    /**
     * The code `POST` would fail with. Null when `can_retry` is true.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun reason(): String? = reason.getNullable("reason")

    /**
     * When the next send becomes available. Null when no send is left, or when the block has
     * nothing to do with the cooldown.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun retryAvailableAt(): OffsetDateTime? = retryAvailableAt.getNullable("retry_available_at")

    /**
     * Returns the raw JSON value of [canRetry].
     *
     * Unlike [canRetry], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("can_retry") @ExcludeMissing fun _canRetry(): JsonField<Boolean> = canRetry

    /**
     * Returns the raw JSON value of [sendsAllowed].
     *
     * Unlike [sendsAllowed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sends_allowed")
    @ExcludeMissing
    fun _sendsAllowed(): JsonField<Long> = sendsAllowed

    /**
     * Returns the raw JSON value of [sendsUsed].
     *
     * Unlike [sendsUsed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sends_used") @ExcludeMissing fun _sendsUsed(): JsonField<Long> = sendsUsed

    /**
     * Returns the raw JSON value of [reason].
     *
     * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

    /**
     * Returns the raw JSON value of [retryAvailableAt].
     *
     * Unlike [retryAvailableAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("retry_available_at")
    @ExcludeMissing
    fun _retryAvailableAt(): JsonField<OffsetDateTime> = retryAvailableAt

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
         * Returns a mutable builder for constructing an instance of [ManualRetryState].
         *
         * The following fields are required:
         * ```kotlin
         * .canRetry()
         * .sendsAllowed()
         * .sendsUsed()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ManualRetryState]. */
    class Builder internal constructor() {

        private var canRetry: JsonField<Boolean>? = null
        private var sendsAllowed: JsonField<Long>? = null
        private var sendsUsed: JsonField<Long>? = null
        private var reason: JsonField<String> = JsonMissing.of()
        private var retryAvailableAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(manualRetryState: ManualRetryState) = apply {
            canRetry = manualRetryState.canRetry
            sendsAllowed = manualRetryState.sendsAllowed
            sendsUsed = manualRetryState.sendsUsed
            reason = manualRetryState.reason
            retryAvailableAt = manualRetryState.retryAvailableAt
            additionalProperties = manualRetryState.additionalProperties.toMutableMap()
        }

        fun canRetry(canRetry: Boolean) = canRetry(JsonField.of(canRetry))

        /**
         * Sets [Builder.canRetry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.canRetry] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun canRetry(canRetry: JsonField<Boolean>) = apply { this.canRetry = canRetry }

        fun sendsAllowed(sendsAllowed: Long) = sendsAllowed(JsonField.of(sendsAllowed))

        /**
         * Sets [Builder.sendsAllowed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sendsAllowed] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sendsAllowed(sendsAllowed: JsonField<Long>) = apply { this.sendsAllowed = sendsAllowed }

        fun sendsUsed(sendsUsed: Long) = sendsUsed(JsonField.of(sendsUsed))

        /**
         * Sets [Builder.sendsUsed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sendsUsed] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sendsUsed(sendsUsed: JsonField<Long>) = apply { this.sendsUsed = sendsUsed }

        /** The code `POST` would fail with. Null when `can_retry` is true. */
        fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

        /**
         * Sets [Builder.reason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reason] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reason(reason: JsonField<String>) = apply { this.reason = reason }

        /**
         * When the next send becomes available. Null when no send is left, or when the block has
         * nothing to do with the cooldown.
         */
        fun retryAvailableAt(retryAvailableAt: OffsetDateTime?) =
            retryAvailableAt(JsonField.ofNullable(retryAvailableAt))

        /**
         * Sets [Builder.retryAvailableAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.retryAvailableAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun retryAvailableAt(retryAvailableAt: JsonField<OffsetDateTime>) = apply {
            this.retryAvailableAt = retryAvailableAt
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
         * Returns an immutable instance of [ManualRetryState].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .canRetry()
         * .sendsAllowed()
         * .sendsUsed()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ManualRetryState =
            ManualRetryState(
                checkRequired("canRetry", canRetry),
                checkRequired("sendsAllowed", sendsAllowed),
                checkRequired("sendsUsed", sendsUsed),
                reason,
                retryAvailableAt,
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
    fun validate(): ManualRetryState = apply {
        if (validated) {
            return@apply
        }

        canRetry()
        sendsAllowed()
        sendsUsed()
        reason()
        retryAvailableAt()
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
        (if (canRetry.asKnown() == null) 0 else 1) +
            (if (sendsAllowed.asKnown() == null) 0 else 1) +
            (if (sendsUsed.asKnown() == null) 0 else 1) +
            (if (reason.asKnown() == null) 0 else 1) +
            (if (retryAvailableAt.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ManualRetryState &&
            canRetry == other.canRetry &&
            sendsAllowed == other.sendsAllowed &&
            sendsUsed == other.sendsUsed &&
            reason == other.reason &&
            retryAvailableAt == other.retryAvailableAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            canRetry,
            sendsAllowed,
            sendsUsed,
            reason,
            retryAvailableAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ManualRetryState{canRetry=$canRetry, sendsAllowed=$sendsAllowed, sendsUsed=$sendsUsed, reason=$reason, retryAvailableAt=$retryAvailableAt, additionalProperties=$additionalProperties}"
}
