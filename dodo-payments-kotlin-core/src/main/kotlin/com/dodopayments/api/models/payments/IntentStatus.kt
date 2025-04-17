// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

class IntentStatus @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        val SUCCEEDED = of("succeeded")

        val FAILED = of("failed")

        val CANCELLED = of("cancelled")

        val PROCESSING = of("processing")

        val REQUIRES_CUSTOMER_ACTION = of("requires_customer_action")

        val REQUIRES_MERCHANT_ACTION = of("requires_merchant_action")

        val REQUIRES_PAYMENT_METHOD = of("requires_payment_method")

        val REQUIRES_CONFIRMATION = of("requires_confirmation")

        val REQUIRES_CAPTURE = of("requires_capture")

        val PARTIALLY_CAPTURED = of("partially_captured")

        val PARTIALLY_CAPTURED_AND_CAPTURABLE = of("partially_captured_and_capturable")

        fun of(value: String) = IntentStatus(JsonField.of(value))
    }

    /** An enum containing [IntentStatus]'s known values. */
    enum class Known {
        SUCCEEDED,
        FAILED,
        CANCELLED,
        PROCESSING,
        REQUIRES_CUSTOMER_ACTION,
        REQUIRES_MERCHANT_ACTION,
        REQUIRES_PAYMENT_METHOD,
        REQUIRES_CONFIRMATION,
        REQUIRES_CAPTURE,
        PARTIALLY_CAPTURED,
        PARTIALLY_CAPTURED_AND_CAPTURABLE,
    }

    /**
     * An enum containing [IntentStatus]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [IntentStatus] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        SUCCEEDED,
        FAILED,
        CANCELLED,
        PROCESSING,
        REQUIRES_CUSTOMER_ACTION,
        REQUIRES_MERCHANT_ACTION,
        REQUIRES_PAYMENT_METHOD,
        REQUIRES_CONFIRMATION,
        REQUIRES_CAPTURE,
        PARTIALLY_CAPTURED,
        PARTIALLY_CAPTURED_AND_CAPTURABLE,
        /** An enum member indicating that [IntentStatus] was instantiated with an unknown value. */
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
            SUCCEEDED -> Value.SUCCEEDED
            FAILED -> Value.FAILED
            CANCELLED -> Value.CANCELLED
            PROCESSING -> Value.PROCESSING
            REQUIRES_CUSTOMER_ACTION -> Value.REQUIRES_CUSTOMER_ACTION
            REQUIRES_MERCHANT_ACTION -> Value.REQUIRES_MERCHANT_ACTION
            REQUIRES_PAYMENT_METHOD -> Value.REQUIRES_PAYMENT_METHOD
            REQUIRES_CONFIRMATION -> Value.REQUIRES_CONFIRMATION
            REQUIRES_CAPTURE -> Value.REQUIRES_CAPTURE
            PARTIALLY_CAPTURED -> Value.PARTIALLY_CAPTURED
            PARTIALLY_CAPTURED_AND_CAPTURABLE -> Value.PARTIALLY_CAPTURED_AND_CAPTURABLE
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
            SUCCEEDED -> Known.SUCCEEDED
            FAILED -> Known.FAILED
            CANCELLED -> Known.CANCELLED
            PROCESSING -> Known.PROCESSING
            REQUIRES_CUSTOMER_ACTION -> Known.REQUIRES_CUSTOMER_ACTION
            REQUIRES_MERCHANT_ACTION -> Known.REQUIRES_MERCHANT_ACTION
            REQUIRES_PAYMENT_METHOD -> Known.REQUIRES_PAYMENT_METHOD
            REQUIRES_CONFIRMATION -> Known.REQUIRES_CONFIRMATION
            REQUIRES_CAPTURE -> Known.REQUIRES_CAPTURE
            PARTIALLY_CAPTURED -> Known.PARTIALLY_CAPTURED
            PARTIALLY_CAPTURED_AND_CAPTURABLE -> Known.PARTIALLY_CAPTURED_AND_CAPTURABLE
            else -> throw DodoPaymentsInvalidDataException("Unknown IntentStatus: $value")
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

        return /* spotless:off */ other is IntentStatus && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
