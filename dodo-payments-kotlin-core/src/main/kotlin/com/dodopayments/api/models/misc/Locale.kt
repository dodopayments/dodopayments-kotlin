// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.misc

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/**
 * A locale that the checkout and the customer portal can show.
 *
 * The codes are a copy of the checkout locales. `GET /locales` lists them.
 */
class Locale @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        val AR = of("ar")

        val CA = of("ca")

        val ZH = of("zh")

        val NL = of("nl")

        val EN = of("en")

        val FR = of("fr")

        val DE = of("de")

        val HE = of("he")

        val ID = of("id")

        val IT = of("it")

        val JA = of("ja")

        val KA = of("ka")

        val KO = of("ko")

        val MS = of("ms")

        val PL = of("pl")

        val PT = of("pt")

        val RO = of("ro")

        val RU = of("ru")

        val ES = of("es")

        val SV = of("sv")

        val TH = of("th")

        val TR = of("tr")

        fun of(value: String) = Locale(JsonField.of(value))
    }

    /** An enum containing [Locale]'s known values. */
    enum class Known {
        AR,
        CA,
        ZH,
        NL,
        EN,
        FR,
        DE,
        HE,
        ID,
        IT,
        JA,
        KA,
        KO,
        MS,
        PL,
        PT,
        RO,
        RU,
        ES,
        SV,
        TH,
        TR,
    }

    /**
     * An enum containing [Locale]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [Locale] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        AR,
        CA,
        ZH,
        NL,
        EN,
        FR,
        DE,
        HE,
        ID,
        IT,
        JA,
        KA,
        KO,
        MS,
        PL,
        PT,
        RO,
        RU,
        ES,
        SV,
        TH,
        TR,
        /** An enum member indicating that [Locale] was instantiated with an unknown value. */
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
            AR -> Value.AR
            CA -> Value.CA
            ZH -> Value.ZH
            NL -> Value.NL
            EN -> Value.EN
            FR -> Value.FR
            DE -> Value.DE
            HE -> Value.HE
            ID -> Value.ID
            IT -> Value.IT
            JA -> Value.JA
            KA -> Value.KA
            KO -> Value.KO
            MS -> Value.MS
            PL -> Value.PL
            PT -> Value.PT
            RO -> Value.RO
            RU -> Value.RU
            ES -> Value.ES
            SV -> Value.SV
            TH -> Value.TH
            TR -> Value.TR
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
            AR -> Known.AR
            CA -> Known.CA
            ZH -> Known.ZH
            NL -> Known.NL
            EN -> Known.EN
            FR -> Known.FR
            DE -> Known.DE
            HE -> Known.HE
            ID -> Known.ID
            IT -> Known.IT
            JA -> Known.JA
            KA -> Known.KA
            KO -> Known.KO
            MS -> Known.MS
            PL -> Known.PL
            PT -> Known.PT
            RO -> Known.RO
            RU -> Known.RU
            ES -> Known.ES
            SV -> Known.SV
            TH -> Known.TH
            TR -> Known.TR
            else -> throw DodoPaymentsInvalidDataException("Unknown Locale: $value")
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
    fun validate(): Locale = apply {
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

        return other is Locale && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
