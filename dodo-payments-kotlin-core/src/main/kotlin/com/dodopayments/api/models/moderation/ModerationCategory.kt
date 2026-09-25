// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.moderation

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/** A moderation category. */
class ModerationCategory @JsonCreator private constructor(private val value: JsonField<String>) :
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

        val VIOLENT_CRIMES = of("violent_crimes")

        val SEX_RELATED_CRIMES = of("sex_related_crimes")

        val CHILD_SEXUAL_EXPLOITATION = of("child_sexual_exploitation")

        val SUICIDE_AND_SELF_HARM = of("suicide_and_self_harm")

        val INDISCRIMINATE_WEAPONS = of("indiscriminate_weapons")

        val INTELLECTUAL_PROPERTY = of("intellectual_property")

        val DEFAMATION = of("defamation")

        val NON_VIOLENT_CRIMES = of("non_violent_crimes")

        val HATE = of("hate")

        val PRIVACY = of("privacy")

        val SPECIALIZED_ADVICE = of("specialized_advice")

        val SEXUAL_CONTENT = of("sexual_content")

        val NON_CONSENSUAL_INTIMATE_IMAGERY = of("non_consensual_intimate_imagery")

        val MINOR_CODED_LANGUAGE = of("minor_coded_language")

        val REAL_PERSON_LIKENESS = of("real_person_likeness")

        val LIVING_ARTIST_STYLE = of("living_artist_style")

        val PROMPT_INJECTION = of("prompt_injection")

        fun of(value: String) = ModerationCategory(JsonField.of(value))
    }

    /** An enum containing [ModerationCategory]'s known values. */
    enum class Known {
        VIOLENT_CRIMES,
        SEX_RELATED_CRIMES,
        CHILD_SEXUAL_EXPLOITATION,
        SUICIDE_AND_SELF_HARM,
        INDISCRIMINATE_WEAPONS,
        INTELLECTUAL_PROPERTY,
        DEFAMATION,
        NON_VIOLENT_CRIMES,
        HATE,
        PRIVACY,
        SPECIALIZED_ADVICE,
        SEXUAL_CONTENT,
        NON_CONSENSUAL_INTIMATE_IMAGERY,
        MINOR_CODED_LANGUAGE,
        REAL_PERSON_LIKENESS,
        LIVING_ARTIST_STYLE,
        PROMPT_INJECTION,
    }

    /**
     * An enum containing [ModerationCategory]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [ModerationCategory] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        VIOLENT_CRIMES,
        SEX_RELATED_CRIMES,
        CHILD_SEXUAL_EXPLOITATION,
        SUICIDE_AND_SELF_HARM,
        INDISCRIMINATE_WEAPONS,
        INTELLECTUAL_PROPERTY,
        DEFAMATION,
        NON_VIOLENT_CRIMES,
        HATE,
        PRIVACY,
        SPECIALIZED_ADVICE,
        SEXUAL_CONTENT,
        NON_CONSENSUAL_INTIMATE_IMAGERY,
        MINOR_CODED_LANGUAGE,
        REAL_PERSON_LIKENESS,
        LIVING_ARTIST_STYLE,
        PROMPT_INJECTION,
        /**
         * An enum member indicating that [ModerationCategory] was instantiated with an unknown
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
            VIOLENT_CRIMES -> Value.VIOLENT_CRIMES
            SEX_RELATED_CRIMES -> Value.SEX_RELATED_CRIMES
            CHILD_SEXUAL_EXPLOITATION -> Value.CHILD_SEXUAL_EXPLOITATION
            SUICIDE_AND_SELF_HARM -> Value.SUICIDE_AND_SELF_HARM
            INDISCRIMINATE_WEAPONS -> Value.INDISCRIMINATE_WEAPONS
            INTELLECTUAL_PROPERTY -> Value.INTELLECTUAL_PROPERTY
            DEFAMATION -> Value.DEFAMATION
            NON_VIOLENT_CRIMES -> Value.NON_VIOLENT_CRIMES
            HATE -> Value.HATE
            PRIVACY -> Value.PRIVACY
            SPECIALIZED_ADVICE -> Value.SPECIALIZED_ADVICE
            SEXUAL_CONTENT -> Value.SEXUAL_CONTENT
            NON_CONSENSUAL_INTIMATE_IMAGERY -> Value.NON_CONSENSUAL_INTIMATE_IMAGERY
            MINOR_CODED_LANGUAGE -> Value.MINOR_CODED_LANGUAGE
            REAL_PERSON_LIKENESS -> Value.REAL_PERSON_LIKENESS
            LIVING_ARTIST_STYLE -> Value.LIVING_ARTIST_STYLE
            PROMPT_INJECTION -> Value.PROMPT_INJECTION
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
            VIOLENT_CRIMES -> Known.VIOLENT_CRIMES
            SEX_RELATED_CRIMES -> Known.SEX_RELATED_CRIMES
            CHILD_SEXUAL_EXPLOITATION -> Known.CHILD_SEXUAL_EXPLOITATION
            SUICIDE_AND_SELF_HARM -> Known.SUICIDE_AND_SELF_HARM
            INDISCRIMINATE_WEAPONS -> Known.INDISCRIMINATE_WEAPONS
            INTELLECTUAL_PROPERTY -> Known.INTELLECTUAL_PROPERTY
            DEFAMATION -> Known.DEFAMATION
            NON_VIOLENT_CRIMES -> Known.NON_VIOLENT_CRIMES
            HATE -> Known.HATE
            PRIVACY -> Known.PRIVACY
            SPECIALIZED_ADVICE -> Known.SPECIALIZED_ADVICE
            SEXUAL_CONTENT -> Known.SEXUAL_CONTENT
            NON_CONSENSUAL_INTIMATE_IMAGERY -> Known.NON_CONSENSUAL_INTIMATE_IMAGERY
            MINOR_CODED_LANGUAGE -> Known.MINOR_CODED_LANGUAGE
            REAL_PERSON_LIKENESS -> Known.REAL_PERSON_LIKENESS
            LIVING_ARTIST_STYLE -> Known.LIVING_ARTIST_STYLE
            PROMPT_INJECTION -> Known.PROMPT_INJECTION
            else -> throw DodoPaymentsInvalidDataException("Unknown ModerationCategory: $value")
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
    fun validate(): ModerationCategory = apply {
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

        return other is ModerationCategory && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
