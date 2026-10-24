// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/** The result of the 3DS authentication of a card payment, as the processor reports it. */
class ThreeDSStatus @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        val AUTHENTICATED = of("authenticated")

        val ATTEMPT_ACKNOWLEDGED = of("attempt_acknowledged")

        val EXEMPTED = of("exempted")

        val FAILED = of("failed")

        val NOT_SUPPORTED = of("not_supported")

        val PROCESSING_ERROR = of("processing_error")

        fun of(value: String) = ThreeDSStatus(JsonField.of(value))
    }

    /** An enum containing [ThreeDSStatus]'s known values. */
    enum class Known {
        AUTHENTICATED,
        ATTEMPT_ACKNOWLEDGED,
        EXEMPTED,
        FAILED,
        NOT_SUPPORTED,
        PROCESSING_ERROR,
    }

    /**
     * An enum containing [ThreeDSStatus]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [ThreeDSStatus] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        AUTHENTICATED,
        ATTEMPT_ACKNOWLEDGED,
        EXEMPTED,
        FAILED,
        NOT_SUPPORTED,
        PROCESSING_ERROR,
        /**
         * An enum member indicating that [ThreeDSStatus] was instantiated with an unknown value.
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
            AUTHENTICATED -> Value.AUTHENTICATED
            ATTEMPT_ACKNOWLEDGED -> Value.ATTEMPT_ACKNOWLEDGED
            EXEMPTED -> Value.EXEMPTED
            FAILED -> Value.FAILED
            NOT_SUPPORTED -> Value.NOT_SUPPORTED
            PROCESSING_ERROR -> Value.PROCESSING_ERROR
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
            AUTHENTICATED -> Known.AUTHENTICATED
            ATTEMPT_ACKNOWLEDGED -> Known.ATTEMPT_ACKNOWLEDGED
            EXEMPTED -> Known.EXEMPTED
            FAILED -> Known.FAILED
            NOT_SUPPORTED -> Known.NOT_SUPPORTED
            PROCESSING_ERROR -> Known.PROCESSING_ERROR
            else -> throw DodoPaymentsInvalidDataException("Unknown ThreeDSStatus: $value")
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
    fun validate(): ThreeDSStatus = apply {
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

        return other is ThreeDSStatus && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
