// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

class SubscriptionStatus @JsonCreator private constructor(private val value: JsonField<String>) :
    Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        val PENDING = of("pending")

        val ACTIVE = of("active")

        val ON_HOLD = of("on_hold")

        val CANCELLED = of("cancelled")

        val FAILED = of("failed")

        val EXPIRED = of("expired")

        fun of(value: String) = SubscriptionStatus(JsonField.of(value))
    }

    /** An enum containing [SubscriptionStatus]'s known values. */
    enum class Known {
        PENDING,
        ACTIVE,
        ON_HOLD,
        CANCELLED,
        FAILED,
        EXPIRED,
    }

    /**
     * An enum containing [SubscriptionStatus]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [SubscriptionStatus] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        PENDING,
        ACTIVE,
        ON_HOLD,
        CANCELLED,
        FAILED,
        EXPIRED,
        /**
         * An enum member indicating that [SubscriptionStatus] was instantiated with an unknown
         * value.
         */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            PENDING -> Value.PENDING
            ACTIVE -> Value.ACTIVE
            ON_HOLD -> Value.ON_HOLD
            CANCELLED -> Value.CANCELLED
            FAILED -> Value.FAILED
            EXPIRED -> Value.EXPIRED
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws DodoPaymentsInvalidDataException if this class instance's value is a not a known
     *   member.
     */
    fun known(): Known =
        when (this) {
            PENDING -> Known.PENDING
            ACTIVE -> Known.ACTIVE
            ON_HOLD -> Known.ON_HOLD
            CANCELLED -> Known.CANCELLED
            FAILED -> Known.FAILED
            EXPIRED -> Known.EXPIRED
            else -> throw DodoPaymentsInvalidDataException("Unknown SubscriptionStatus: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws DodoPaymentsInvalidDataException if this class instance's value does not have the
     *   expected primitive type.
     */
    fun asString(): String =
        _value().asString() ?: throw DodoPaymentsInvalidDataException("Value is not a String")

    private var validated: Boolean = false

    fun validate(): SubscriptionStatus = apply {
        if (validated) {
            return@apply
        }

        known()
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
    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionStatus && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
