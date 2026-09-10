// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers.emails

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
import java.util.Collections
import java.util.Objects

/**
 * What the merchant may do with one row. The server decides; the client never derives eligibility
 * itself.
 */
class EmailPolicies
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val requiresDifferentAddress: JsonField<Boolean>,
    private val resendAllowed: JsonField<Boolean>,
    private val resendsRemaining: JsonField<Long>,
    private val retryAllowed: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("requires_different_address")
        @ExcludeMissing
        requiresDifferentAddress: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("resend_allowed")
        @ExcludeMissing
        resendAllowed: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("resends_remaining")
        @ExcludeMissing
        resendsRemaining: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("retry_allowed")
        @ExcludeMissing
        retryAllowed: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        requiresDifferentAddress,
        resendAllowed,
        resendsRemaining,
        retryAllowed,
        mutableMapOf(),
    )

    /**
     * A permanent failure was recorded, so the same address would be a no-op.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requiresDifferentAddress(): Boolean =
        requiresDifferentAddress.getRequired("requires_different_address")

    /**
     * The row was delivered and may be sent again.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun resendAllowed(): Boolean = resendAllowed.getRequired("resend_allowed")

    /**
     * How many sends are left in this email's chain.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun resendsRemaining(): Long = resendsRemaining.getRequired("resends_remaining")

    /**
     * The row failed and may be sent again.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun retryAllowed(): Boolean = retryAllowed.getRequired("retry_allowed")

    /**
     * Returns the raw JSON value of [requiresDifferentAddress].
     *
     * Unlike [requiresDifferentAddress], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("requires_different_address")
    @ExcludeMissing
    fun _requiresDifferentAddress(): JsonField<Boolean> = requiresDifferentAddress

    /**
     * Returns the raw JSON value of [resendAllowed].
     *
     * Unlike [resendAllowed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resend_allowed")
    @ExcludeMissing
    fun _resendAllowed(): JsonField<Boolean> = resendAllowed

    /**
     * Returns the raw JSON value of [resendsRemaining].
     *
     * Unlike [resendsRemaining], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("resends_remaining")
    @ExcludeMissing
    fun _resendsRemaining(): JsonField<Long> = resendsRemaining

    /**
     * Returns the raw JSON value of [retryAllowed].
     *
     * Unlike [retryAllowed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("retry_allowed")
    @ExcludeMissing
    fun _retryAllowed(): JsonField<Boolean> = retryAllowed

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
         * Returns a mutable builder for constructing an instance of [EmailPolicies].
         *
         * The following fields are required:
         * ```kotlin
         * .requiresDifferentAddress()
         * .resendAllowed()
         * .resendsRemaining()
         * .retryAllowed()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [EmailPolicies]. */
    class Builder internal constructor() {

        private var requiresDifferentAddress: JsonField<Boolean>? = null
        private var resendAllowed: JsonField<Boolean>? = null
        private var resendsRemaining: JsonField<Long>? = null
        private var retryAllowed: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(emailPolicies: EmailPolicies) = apply {
            requiresDifferentAddress = emailPolicies.requiresDifferentAddress
            resendAllowed = emailPolicies.resendAllowed
            resendsRemaining = emailPolicies.resendsRemaining
            retryAllowed = emailPolicies.retryAllowed
            additionalProperties = emailPolicies.additionalProperties.toMutableMap()
        }

        /** A permanent failure was recorded, so the same address would be a no-op. */
        fun requiresDifferentAddress(requiresDifferentAddress: Boolean) =
            requiresDifferentAddress(JsonField.of(requiresDifferentAddress))

        /**
         * Sets [Builder.requiresDifferentAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requiresDifferentAddress] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun requiresDifferentAddress(requiresDifferentAddress: JsonField<Boolean>) = apply {
            this.requiresDifferentAddress = requiresDifferentAddress
        }

        /** The row was delivered and may be sent again. */
        fun resendAllowed(resendAllowed: Boolean) = resendAllowed(JsonField.of(resendAllowed))

        /**
         * Sets [Builder.resendAllowed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resendAllowed] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun resendAllowed(resendAllowed: JsonField<Boolean>) = apply {
            this.resendAllowed = resendAllowed
        }

        /** How many sends are left in this email's chain. */
        fun resendsRemaining(resendsRemaining: Long) =
            resendsRemaining(JsonField.of(resendsRemaining))

        /**
         * Sets [Builder.resendsRemaining] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resendsRemaining] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun resendsRemaining(resendsRemaining: JsonField<Long>) = apply {
            this.resendsRemaining = resendsRemaining
        }

        /** The row failed and may be sent again. */
        fun retryAllowed(retryAllowed: Boolean) = retryAllowed(JsonField.of(retryAllowed))

        /**
         * Sets [Builder.retryAllowed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.retryAllowed] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun retryAllowed(retryAllowed: JsonField<Boolean>) = apply {
            this.retryAllowed = retryAllowed
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
         * Returns an immutable instance of [EmailPolicies].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .requiresDifferentAddress()
         * .resendAllowed()
         * .resendsRemaining()
         * .retryAllowed()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EmailPolicies =
            EmailPolicies(
                checkRequired("requiresDifferentAddress", requiresDifferentAddress),
                checkRequired("resendAllowed", resendAllowed),
                checkRequired("resendsRemaining", resendsRemaining),
                checkRequired("retryAllowed", retryAllowed),
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
    fun validate(): EmailPolicies = apply {
        if (validated) {
            return@apply
        }

        requiresDifferentAddress()
        resendAllowed()
        resendsRemaining()
        retryAllowed()
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
        (if (requiresDifferentAddress.asKnown() == null) 0 else 1) +
            (if (resendAllowed.asKnown() == null) 0 else 1) +
            (if (resendsRemaining.asKnown() == null) 0 else 1) +
            (if (retryAllowed.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailPolicies &&
            requiresDifferentAddress == other.requiresDifferentAddress &&
            resendAllowed == other.resendAllowed &&
            resendsRemaining == other.resendsRemaining &&
            retryAllowed == other.retryAllowed &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            requiresDifferentAddress,
            resendAllowed,
            resendsRemaining,
            retryAllowed,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmailPolicies{requiresDifferentAddress=$requiresDifferentAddress, resendAllowed=$resendAllowed, resendsRemaining=$resendsRemaining, retryAllowed=$retryAllowed, additionalProperties=$additionalProperties}"
}
