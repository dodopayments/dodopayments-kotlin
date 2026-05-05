// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.checkoutsessions

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.subscriptions.OnDemandSubscription
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

class SubscriptionData
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val onDemand: JsonField<OnDemandSubscription>,
    private val trialPeriodDays: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("on_demand")
        @ExcludeMissing
        onDemand: JsonField<OnDemandSubscription> = JsonMissing.of(),
        @JsonProperty("trial_period_days")
        @ExcludeMissing
        trialPeriodDays: JsonField<Int> = JsonMissing.of(),
    ) : this(onDemand, trialPeriodDays, mutableMapOf())

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun onDemand(): OnDemandSubscription? = onDemand.getNullable("on_demand")

    /**
     * Optional trial period in days If specified, this value overrides the trial period set in the
     * product's price Must be between 0 and 10000 days
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun trialPeriodDays(): Int? = trialPeriodDays.getNullable("trial_period_days")

    /**
     * Returns the raw JSON value of [onDemand].
     *
     * Unlike [onDemand], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("on_demand")
    @ExcludeMissing
    fun _onDemand(): JsonField<OnDemandSubscription> = onDemand

    /**
     * Returns the raw JSON value of [trialPeriodDays].
     *
     * Unlike [trialPeriodDays], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trial_period_days")
    @ExcludeMissing
    fun _trialPeriodDays(): JsonField<Int> = trialPeriodDays

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

        /** Returns a mutable builder for constructing an instance of [SubscriptionData]. */
        fun builder() = Builder()
    }

    /** A builder for [SubscriptionData]. */
    class Builder internal constructor() {

        private var onDemand: JsonField<OnDemandSubscription> = JsonMissing.of()
        private var trialPeriodDays: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(subscriptionData: SubscriptionData) = apply {
            onDemand = subscriptionData.onDemand
            trialPeriodDays = subscriptionData.trialPeriodDays
            additionalProperties = subscriptionData.additionalProperties.toMutableMap()
        }

        fun onDemand(onDemand: OnDemandSubscription?) = onDemand(JsonField.ofNullable(onDemand))

        /**
         * Sets [Builder.onDemand] to an arbitrary JSON value.
         *
         * You should usually call [Builder.onDemand] with a well-typed [OnDemandSubscription] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun onDemand(onDemand: JsonField<OnDemandSubscription>) = apply { this.onDemand = onDemand }

        /**
         * Optional trial period in days If specified, this value overrides the trial period set in
         * the product's price Must be between 0 and 10000 days
         */
        fun trialPeriodDays(trialPeriodDays: Int?) =
            trialPeriodDays(JsonField.ofNullable(trialPeriodDays))

        /**
         * Alias for [Builder.trialPeriodDays].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun trialPeriodDays(trialPeriodDays: Int) = trialPeriodDays(trialPeriodDays as Int?)

        /**
         * Sets [Builder.trialPeriodDays] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trialPeriodDays] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun trialPeriodDays(trialPeriodDays: JsonField<Int>) = apply {
            this.trialPeriodDays = trialPeriodDays
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
         * Returns an immutable instance of [SubscriptionData].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SubscriptionData =
            SubscriptionData(onDemand, trialPeriodDays, additionalProperties.toMutableMap())
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
    fun validate(): SubscriptionData = apply {
        if (validated) {
            return@apply
        }

        onDemand()?.validate()
        trialPeriodDays()
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
        (onDemand.asKnown()?.validity() ?: 0) + (if (trialPeriodDays.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionData &&
            onDemand == other.onDemand &&
            trialPeriodDays == other.trialPeriodDays &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(onDemand, trialPeriodDays, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubscriptionData{onDemand=$onDemand, trialPeriodDays=$trialPeriodDays, additionalProperties=$additionalProperties}"
}
