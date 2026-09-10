// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers.emails

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/**
 * The delivery status of one email.
 *
 * `sent` also covers an email that is still on its way. A status only becomes `delivered`, `failed`
 * or `complained` when the mail server answers.
 */
class EmailLogStatus @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        val SENT = of("sent")

        val DELIVERED = of("delivered")

        val FAILED = of("failed")

        val COMPLAINED = of("complained")

        val BLOCKED = of("blocked")

        fun of(value: String) = EmailLogStatus(JsonField.of(value))
    }

    /** An enum containing [EmailLogStatus]'s known values. */
    enum class Known {
        SENT,
        DELIVERED,
        FAILED,
        COMPLAINED,
        BLOCKED,
    }

    /**
     * An enum containing [EmailLogStatus]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [EmailLogStatus] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        SENT,
        DELIVERED,
        FAILED,
        COMPLAINED,
        BLOCKED,
        /**
         * An enum member indicating that [EmailLogStatus] was instantiated with an unknown value.
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
            SENT -> Value.SENT
            DELIVERED -> Value.DELIVERED
            FAILED -> Value.FAILED
            COMPLAINED -> Value.COMPLAINED
            BLOCKED -> Value.BLOCKED
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
            SENT -> Known.SENT
            DELIVERED -> Known.DELIVERED
            FAILED -> Known.FAILED
            COMPLAINED -> Known.COMPLAINED
            BLOCKED -> Known.BLOCKED
            else -> throw DodoPaymentsInvalidDataException("Unknown EmailLogStatus: $value")
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

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): EmailLogStatus = apply {
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

        return other is EmailLogStatus && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
