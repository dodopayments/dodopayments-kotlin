// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers.emails

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/**
 * Why an email did not reach the recipient.
 *
 * The code is stable. `send_failed` is the catch-all: it covers every failure that the other codes
 * do not name.
 */
class EmailFailureCode @JsonCreator private constructor(private val value: JsonField<String>) :
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

        val MAILBOX_NOT_FOUND = of("mailbox_not_found")

        val ADDRESS_REJECTED = of("address_rejected")

        val ADDRESS_SUPPRESSED = of("address_suppressed")

        val MAILBOX_FULL = of("mailbox_full")

        val TEMPORARY_FAILURE = of("temporary_failure")

        val MESSAGE_TOO_LARGE = of("message_too_large")

        val MARKED_AS_SPAM = of("marked_as_spam")

        val SEND_FAILED = of("send_failed")

        fun of(value: String) = EmailFailureCode(JsonField.of(value))
    }

    /** An enum containing [EmailFailureCode]'s known values. */
    enum class Known {
        MAILBOX_NOT_FOUND,
        ADDRESS_REJECTED,
        ADDRESS_SUPPRESSED,
        MAILBOX_FULL,
        TEMPORARY_FAILURE,
        MESSAGE_TOO_LARGE,
        MARKED_AS_SPAM,
        SEND_FAILED,
    }

    /**
     * An enum containing [EmailFailureCode]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [EmailFailureCode] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        MAILBOX_NOT_FOUND,
        ADDRESS_REJECTED,
        ADDRESS_SUPPRESSED,
        MAILBOX_FULL,
        TEMPORARY_FAILURE,
        MESSAGE_TOO_LARGE,
        MARKED_AS_SPAM,
        SEND_FAILED,
        /**
         * An enum member indicating that [EmailFailureCode] was instantiated with an unknown value.
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
            MAILBOX_NOT_FOUND -> Value.MAILBOX_NOT_FOUND
            ADDRESS_REJECTED -> Value.ADDRESS_REJECTED
            ADDRESS_SUPPRESSED -> Value.ADDRESS_SUPPRESSED
            MAILBOX_FULL -> Value.MAILBOX_FULL
            TEMPORARY_FAILURE -> Value.TEMPORARY_FAILURE
            MESSAGE_TOO_LARGE -> Value.MESSAGE_TOO_LARGE
            MARKED_AS_SPAM -> Value.MARKED_AS_SPAM
            SEND_FAILED -> Value.SEND_FAILED
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
            MAILBOX_NOT_FOUND -> Known.MAILBOX_NOT_FOUND
            ADDRESS_REJECTED -> Known.ADDRESS_REJECTED
            ADDRESS_SUPPRESSED -> Known.ADDRESS_SUPPRESSED
            MAILBOX_FULL -> Known.MAILBOX_FULL
            TEMPORARY_FAILURE -> Known.TEMPORARY_FAILURE
            MESSAGE_TOO_LARGE -> Known.MESSAGE_TOO_LARGE
            MARKED_AS_SPAM -> Known.MARKED_AS_SPAM
            SEND_FAILED -> Known.SEND_FAILED
            else -> throw DodoPaymentsInvalidDataException("Unknown EmailFailureCode: $value")
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
    fun validate(): EmailFailureCode = apply {
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

        return other is EmailFailureCode && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
