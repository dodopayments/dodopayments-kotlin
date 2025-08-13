// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.misc

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/** Represents the different categories of taxation applicable to various products and services. */
class TaxCategory @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        val DIGITAL_PRODUCTS = of("digital_products")

        val SAAS = of("saas")

        val E_BOOK = of("e_book")

        val EDTECH = of("edtech")

        fun of(value: String) = TaxCategory(JsonField.of(value))
    }

    /** An enum containing [TaxCategory]'s known values. */
    enum class Known {
        DIGITAL_PRODUCTS,
        SAAS,
        E_BOOK,
        EDTECH,
    }

    /**
     * An enum containing [TaxCategory]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [TaxCategory] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        DIGITAL_PRODUCTS,
        SAAS,
        E_BOOK,
        EDTECH,
        /** An enum member indicating that [TaxCategory] was instantiated with an unknown value. */
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
            DIGITAL_PRODUCTS -> Value.DIGITAL_PRODUCTS
            SAAS -> Value.SAAS
            E_BOOK -> Value.E_BOOK
            EDTECH -> Value.EDTECH
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
            DIGITAL_PRODUCTS -> Known.DIGITAL_PRODUCTS
            SAAS -> Known.SAAS
            E_BOOK -> Known.E_BOOK
            EDTECH -> Known.EDTECH
            else -> throw DodoPaymentsInvalidDataException("Unknown TaxCategory: $value")
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

    fun validate(): TaxCategory = apply {
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

        return other is TaxCategory && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
