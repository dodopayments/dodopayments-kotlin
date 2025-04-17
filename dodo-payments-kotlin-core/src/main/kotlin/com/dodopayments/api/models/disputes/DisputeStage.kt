// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.disputes

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

class DisputeStage @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        val PRE_DISPUTE = of("pre_dispute")

        val DISPUTE = of("dispute")

        val PRE_ARBITRATION = of("pre_arbitration")

        fun of(value: String) = DisputeStage(JsonField.of(value))
    }

    /** An enum containing [DisputeStage]'s known values. */
    enum class Known {
        PRE_DISPUTE,
        DISPUTE,
        PRE_ARBITRATION,
    }

    /**
     * An enum containing [DisputeStage]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [DisputeStage] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        PRE_DISPUTE,
        DISPUTE,
        PRE_ARBITRATION,
        /** An enum member indicating that [DisputeStage] was instantiated with an unknown value. */
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
            PRE_DISPUTE -> Value.PRE_DISPUTE
            DISPUTE -> Value.DISPUTE
            PRE_ARBITRATION -> Value.PRE_ARBITRATION
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
            PRE_DISPUTE -> Known.PRE_DISPUTE
            DISPUTE -> Known.DISPUTE
            PRE_ARBITRATION -> Known.PRE_ARBITRATION
            else -> throw DodoPaymentsInvalidDataException("Unknown DisputeStage: $value")
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

        return /* spotless:off */ other is DisputeStage && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
