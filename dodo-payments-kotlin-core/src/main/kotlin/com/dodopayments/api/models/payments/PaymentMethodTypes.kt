// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

class PaymentMethodTypes @JsonCreator private constructor(private val value: JsonField<String>) :
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

        val CREDIT = of("credit")

        val DEBIT = of("debit")

        val UPI_COLLECT = of("upi_collect")

        val UPI_INTENT = of("upi_intent")

        val APPLE_PAY = of("apple_pay")

        val CASHAPP = of("cashapp")

        val GOOGLE_PAY = of("google_pay")

        val MULTIBANCO = of("multibanco")

        val BANCONTACT_CARD = of("bancontact_card")

        val EPS = of("eps")

        val IDEAL = of("ideal")

        val PRZELEWY24 = of("przelewy24")

        val AFFIRM = of("affirm")

        val KLARNA = of("klarna")

        val SEPA = of("sepa")

        val ACH = of("ach")

        val AMAZON_PAY = of("amazon_pay")

        val AFTERPAY_CLEARPAY = of("afterpay_clearpay")

        fun of(value: String) = PaymentMethodTypes(JsonField.of(value))
    }

    /** An enum containing [PaymentMethodTypes]'s known values. */
    enum class Known {
        CREDIT,
        DEBIT,
        UPI_COLLECT,
        UPI_INTENT,
        APPLE_PAY,
        CASHAPP,
        GOOGLE_PAY,
        MULTIBANCO,
        BANCONTACT_CARD,
        EPS,
        IDEAL,
        PRZELEWY24,
        AFFIRM,
        KLARNA,
        SEPA,
        ACH,
        AMAZON_PAY,
        AFTERPAY_CLEARPAY,
    }

    /**
     * An enum containing [PaymentMethodTypes]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [PaymentMethodTypes] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        CREDIT,
        DEBIT,
        UPI_COLLECT,
        UPI_INTENT,
        APPLE_PAY,
        CASHAPP,
        GOOGLE_PAY,
        MULTIBANCO,
        BANCONTACT_CARD,
        EPS,
        IDEAL,
        PRZELEWY24,
        AFFIRM,
        KLARNA,
        SEPA,
        ACH,
        AMAZON_PAY,
        AFTERPAY_CLEARPAY,
        /**
         * An enum member indicating that [PaymentMethodTypes] was instantiated with an unknown
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
            CREDIT -> Value.CREDIT
            DEBIT -> Value.DEBIT
            UPI_COLLECT -> Value.UPI_COLLECT
            UPI_INTENT -> Value.UPI_INTENT
            APPLE_PAY -> Value.APPLE_PAY
            CASHAPP -> Value.CASHAPP
            GOOGLE_PAY -> Value.GOOGLE_PAY
            MULTIBANCO -> Value.MULTIBANCO
            BANCONTACT_CARD -> Value.BANCONTACT_CARD
            EPS -> Value.EPS
            IDEAL -> Value.IDEAL
            PRZELEWY24 -> Value.PRZELEWY24
            AFFIRM -> Value.AFFIRM
            KLARNA -> Value.KLARNA
            SEPA -> Value.SEPA
            ACH -> Value.ACH
            AMAZON_PAY -> Value.AMAZON_PAY
            AFTERPAY_CLEARPAY -> Value.AFTERPAY_CLEARPAY
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
            CREDIT -> Known.CREDIT
            DEBIT -> Known.DEBIT
            UPI_COLLECT -> Known.UPI_COLLECT
            UPI_INTENT -> Known.UPI_INTENT
            APPLE_PAY -> Known.APPLE_PAY
            CASHAPP -> Known.CASHAPP
            GOOGLE_PAY -> Known.GOOGLE_PAY
            MULTIBANCO -> Known.MULTIBANCO
            BANCONTACT_CARD -> Known.BANCONTACT_CARD
            EPS -> Known.EPS
            IDEAL -> Known.IDEAL
            PRZELEWY24 -> Known.PRZELEWY24
            AFFIRM -> Known.AFFIRM
            KLARNA -> Known.KLARNA
            SEPA -> Known.SEPA
            ACH -> Known.ACH
            AMAZON_PAY -> Known.AMAZON_PAY
            AFTERPAY_CLEARPAY -> Known.AFTERPAY_CLEARPAY
            else -> throw DodoPaymentsInvalidDataException("Unknown PaymentMethodTypes: $value")
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

    fun validate(): PaymentMethodTypes = apply {
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

        return /* spotless:off */ other is PaymentMethodTypes && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
