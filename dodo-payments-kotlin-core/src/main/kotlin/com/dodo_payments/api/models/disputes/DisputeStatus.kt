// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.disputes

import com.dodo_payments.api.core.Enum
import com.dodo_payments.api.core.JsonField
import com.dodo_payments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

class DisputeStatus @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        val DISPUTE_OPENED = of("dispute_opened")

        val DISPUTE_EXPIRED = of("dispute_expired")

        val DISPUTE_ACCEPTED = of("dispute_accepted")

        val DISPUTE_CANCELLED = of("dispute_cancelled")

        val DISPUTE_CHALLENGED = of("dispute_challenged")

        val DISPUTE_WON = of("dispute_won")

        val DISPUTE_LOST = of("dispute_lost")

        fun of(value: String) = DisputeStatus(JsonField.of(value))
    }

    /** An enum containing [DisputeStatus]'s known values. */
    enum class Known {
        DISPUTE_OPENED,
        DISPUTE_EXPIRED,
        DISPUTE_ACCEPTED,
        DISPUTE_CANCELLED,
        DISPUTE_CHALLENGED,
        DISPUTE_WON,
        DISPUTE_LOST,
    }

    /**
     * An enum containing [DisputeStatus]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [DisputeStatus] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        DISPUTE_OPENED,
        DISPUTE_EXPIRED,
        DISPUTE_ACCEPTED,
        DISPUTE_CANCELLED,
        DISPUTE_CHALLENGED,
        DISPUTE_WON,
        DISPUTE_LOST,
        /**
         * An enum member indicating that [DisputeStatus] was instantiated with an unknown value.
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
            DISPUTE_OPENED -> Value.DISPUTE_OPENED
            DISPUTE_EXPIRED -> Value.DISPUTE_EXPIRED
            DISPUTE_ACCEPTED -> Value.DISPUTE_ACCEPTED
            DISPUTE_CANCELLED -> Value.DISPUTE_CANCELLED
            DISPUTE_CHALLENGED -> Value.DISPUTE_CHALLENGED
            DISPUTE_WON -> Value.DISPUTE_WON
            DISPUTE_LOST -> Value.DISPUTE_LOST
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
            DISPUTE_OPENED -> Known.DISPUTE_OPENED
            DISPUTE_EXPIRED -> Known.DISPUTE_EXPIRED
            DISPUTE_ACCEPTED -> Known.DISPUTE_ACCEPTED
            DISPUTE_CANCELLED -> Known.DISPUTE_CANCELLED
            DISPUTE_CHALLENGED -> Known.DISPUTE_CHALLENGED
            DISPUTE_WON -> Known.DISPUTE_WON
            DISPUTE_LOST -> Known.DISPUTE_LOST
            else -> throw DodoPaymentsInvalidDataException("Unknown DisputeStatus: $value")
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DisputeStatus && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
