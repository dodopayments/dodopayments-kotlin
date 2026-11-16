// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

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

class SubscriptionStartTrialResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val invoiceId: JsonField<String>,
    private val subscriptionId: JsonField<String>,
    private val trialEndsAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("invoice_id") @ExcludeMissing invoiceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("subscription_id")
        @ExcludeMissing
        subscriptionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trial_ends_at")
        @ExcludeMissing
        trialEndsAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(invoiceId, subscriptionId, trialEndsAt, mutableMapOf())

    /**
     * The paid $0 invoice of the trial.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun invoiceId(): String = invoiceId.getRequired("invoice_id")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriptionId(): String = subscriptionId.getRequired("subscription_id")

    /**
     * The first invoice after the trial bills at this time.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun trialEndsAt(): OffsetDateTime = trialEndsAt.getRequired("trial_ends_at")

    /**
     * Returns the raw JSON value of [invoiceId].
     *
     * Unlike [invoiceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId(): JsonField<String> = invoiceId

    /**
     * Returns the raw JSON value of [subscriptionId].
     *
     * Unlike [subscriptionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subscription_id")
    @ExcludeMissing
    fun _subscriptionId(): JsonField<String> = subscriptionId

    /**
     * Returns the raw JSON value of [trialEndsAt].
     *
     * Unlike [trialEndsAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trial_ends_at")
    @ExcludeMissing
    fun _trialEndsAt(): JsonField<OffsetDateTime> = trialEndsAt

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
         * Returns a mutable builder for constructing an instance of
         * [SubscriptionStartTrialResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .invoiceId()
         * .subscriptionId()
         * .trialEndsAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SubscriptionStartTrialResponse]. */
    class Builder internal constructor() {

        private var invoiceId: JsonField<String>? = null
        private var subscriptionId: JsonField<String>? = null
        private var trialEndsAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(subscriptionStartTrialResponse: SubscriptionStartTrialResponse) = apply {
            invoiceId = subscriptionStartTrialResponse.invoiceId
            subscriptionId = subscriptionStartTrialResponse.subscriptionId
            trialEndsAt = subscriptionStartTrialResponse.trialEndsAt
            additionalProperties =
                subscriptionStartTrialResponse.additionalProperties.toMutableMap()
        }

        /** The paid $0 invoice of the trial. */
        fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

        /**
         * Sets [Builder.invoiceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

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

        /** The first invoice after the trial bills at this time. */
        fun trialEndsAt(trialEndsAt: OffsetDateTime) = trialEndsAt(JsonField.of(trialEndsAt))

        /**
         * Sets [Builder.trialEndsAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trialEndsAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun trialEndsAt(trialEndsAt: JsonField<OffsetDateTime>) = apply {
            this.trialEndsAt = trialEndsAt
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
         * Returns an immutable instance of [SubscriptionStartTrialResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .invoiceId()
         * .subscriptionId()
         * .trialEndsAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubscriptionStartTrialResponse =
            SubscriptionStartTrialResponse(
                checkRequired("invoiceId", invoiceId),
                checkRequired("subscriptionId", subscriptionId),
                checkRequired("trialEndsAt", trialEndsAt),
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
    fun validate(): SubscriptionStartTrialResponse = apply {
        if (validated) {
            return@apply
        }

        invoiceId()
        subscriptionId()
        trialEndsAt()
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
        (if (invoiceId.asKnown() == null) 0 else 1) +
            (if (subscriptionId.asKnown() == null) 0 else 1) +
            (if (trialEndsAt.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionStartTrialResponse &&
            invoiceId == other.invoiceId &&
            subscriptionId == other.subscriptionId &&
            trialEndsAt == other.trialEndsAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(invoiceId, subscriptionId, trialEndsAt, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubscriptionStartTrialResponse{invoiceId=$invoiceId, subscriptionId=$subscriptionId, trialEndsAt=$trialEndsAt, additionalProperties=$additionalProperties}"
}
