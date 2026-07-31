// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.checkoutsessions

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

/** Custom theme configuration with colors for light and dark modes. */
class ThemeConfig
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val dark: JsonField<ThemeModeConfig>,
    private val fontPrimaryUrl: JsonField<String>,
    private val fontSecondaryUrl: JsonField<String>,
    private val fontSize: JsonField<FontSize>,
    private val fontWeight: JsonField<FontWeight>,
    private val light: JsonField<ThemeModeConfig>,
    private val payButtonText: JsonField<String>,
    private val radius: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("dark") @ExcludeMissing dark: JsonField<ThemeModeConfig> = JsonMissing.of(),
        @JsonProperty("font_primary_url")
        @ExcludeMissing
        fontPrimaryUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("font_secondary_url")
        @ExcludeMissing
        fontSecondaryUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("font_size") @ExcludeMissing fontSize: JsonField<FontSize> = JsonMissing.of(),
        @JsonProperty("font_weight")
        @ExcludeMissing
        fontWeight: JsonField<FontWeight> = JsonMissing.of(),
        @JsonProperty("light") @ExcludeMissing light: JsonField<ThemeModeConfig> = JsonMissing.of(),
        @JsonProperty("pay_button_text")
        @ExcludeMissing
        payButtonText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("radius") @ExcludeMissing radius: JsonField<String> = JsonMissing.of(),
    ) : this(
        dark,
        fontPrimaryUrl,
        fontSecondaryUrl,
        fontSize,
        fontWeight,
        light,
        payButtonText,
        radius,
        mutableMapOf(),
    )

    /**
     * Dark mode color configuration
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dark(): ThemeModeConfig? = dark.getNullable("dark")

    /**
     * URL for the primary font. Must be a valid https:// URL.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun fontPrimaryUrl(): String? = fontPrimaryUrl.getNullable("font_primary_url")

    /**
     * URL for the secondary font. Must be a valid https:// URL.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun fontSecondaryUrl(): String? = fontSecondaryUrl.getNullable("font_secondary_url")

    /**
     * Font size for the checkout UI
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun fontSize(): FontSize? = fontSize.getNullable("font_size")

    /**
     * Font weight for the checkout UI
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun fontWeight(): FontWeight? = fontWeight.getNullable("font_weight")

    /**
     * Light mode color configuration
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun light(): ThemeModeConfig? = light.getNullable("light")

    /**
     * Custom text for the pay button (e.g., "Complete Purchase", "Subscribe Now"). Max 100
     * characters.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun payButtonText(): String? = payButtonText.getNullable("pay_button_text")

    /**
     * Border radius for UI elements. Must be a number followed by px, rem, or em (e.g., "4px",
     * "0.5rem", "1em")
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun radius(): String? = radius.getNullable("radius")

    /**
     * Returns the raw JSON value of [dark].
     *
     * Unlike [dark], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dark") @ExcludeMissing fun _dark(): JsonField<ThemeModeConfig> = dark

    /**
     * Returns the raw JSON value of [fontPrimaryUrl].
     *
     * Unlike [fontPrimaryUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("font_primary_url")
    @ExcludeMissing
    fun _fontPrimaryUrl(): JsonField<String> = fontPrimaryUrl

    /**
     * Returns the raw JSON value of [fontSecondaryUrl].
     *
     * Unlike [fontSecondaryUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("font_secondary_url")
    @ExcludeMissing
    fun _fontSecondaryUrl(): JsonField<String> = fontSecondaryUrl

    /**
     * Returns the raw JSON value of [fontSize].
     *
     * Unlike [fontSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("font_size") @ExcludeMissing fun _fontSize(): JsonField<FontSize> = fontSize

    /**
     * Returns the raw JSON value of [fontWeight].
     *
     * Unlike [fontWeight], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("font_weight")
    @ExcludeMissing
    fun _fontWeight(): JsonField<FontWeight> = fontWeight

    /**
     * Returns the raw JSON value of [light].
     *
     * Unlike [light], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("light") @ExcludeMissing fun _light(): JsonField<ThemeModeConfig> = light

    /**
     * Returns the raw JSON value of [payButtonText].
     *
     * Unlike [payButtonText], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pay_button_text")
    @ExcludeMissing
    fun _payButtonText(): JsonField<String> = payButtonText

    /**
     * Returns the raw JSON value of [radius].
     *
     * Unlike [radius], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("radius") @ExcludeMissing fun _radius(): JsonField<String> = radius

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [ThemeConfig]. */
        fun builder() = Builder()
    }

    /** A builder for [ThemeConfig]. */
    class Builder internal constructor() {

        private var dark: JsonField<ThemeModeConfig> = JsonMissing.of()
        private var fontPrimaryUrl: JsonField<String> = JsonMissing.of()
        private var fontSecondaryUrl: JsonField<String> = JsonMissing.of()
        private var fontSize: JsonField<FontSize> = JsonMissing.of()
        private var fontWeight: JsonField<FontWeight> = JsonMissing.of()
        private var light: JsonField<ThemeModeConfig> = JsonMissing.of()
        private var payButtonText: JsonField<String> = JsonMissing.of()
        private var radius: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(themeConfig: ThemeConfig) = apply {
            dark = themeConfig.dark
            fontPrimaryUrl = themeConfig.fontPrimaryUrl
            fontSecondaryUrl = themeConfig.fontSecondaryUrl
            fontSize = themeConfig.fontSize
            fontWeight = themeConfig.fontWeight
            light = themeConfig.light
            payButtonText = themeConfig.payButtonText
            radius = themeConfig.radius
            additionalProperties = themeConfig.additionalProperties.toMutableMap()
        }

        /** Dark mode color configuration */
        fun dark(dark: ThemeModeConfig?) = dark(JsonField.ofNullable(dark))

        /**
         * Sets [Builder.dark] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dark] with a well-typed [ThemeModeConfig] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dark(dark: JsonField<ThemeModeConfig>) = apply { this.dark = dark }

        /** URL for the primary font. Must be a valid https:// URL. */
        fun fontPrimaryUrl(fontPrimaryUrl: String?) =
            fontPrimaryUrl(JsonField.ofNullable(fontPrimaryUrl))

        /**
         * Sets [Builder.fontPrimaryUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fontPrimaryUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fontPrimaryUrl(fontPrimaryUrl: JsonField<String>) = apply {
            this.fontPrimaryUrl = fontPrimaryUrl
        }

        /** URL for the secondary font. Must be a valid https:// URL. */
        fun fontSecondaryUrl(fontSecondaryUrl: String?) =
            fontSecondaryUrl(JsonField.ofNullable(fontSecondaryUrl))

        /**
         * Sets [Builder.fontSecondaryUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fontSecondaryUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fontSecondaryUrl(fontSecondaryUrl: JsonField<String>) = apply {
            this.fontSecondaryUrl = fontSecondaryUrl
        }

        /** Font size for the checkout UI */
        fun fontSize(fontSize: FontSize?) = fontSize(JsonField.ofNullable(fontSize))

        /**
         * Sets [Builder.fontSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fontSize] with a well-typed [FontSize] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fontSize(fontSize: JsonField<FontSize>) = apply { this.fontSize = fontSize }

        /** Font weight for the checkout UI */
        fun fontWeight(fontWeight: FontWeight?) = fontWeight(JsonField.ofNullable(fontWeight))

        /**
         * Sets [Builder.fontWeight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fontWeight] with a well-typed [FontWeight] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fontWeight(fontWeight: JsonField<FontWeight>) = apply { this.fontWeight = fontWeight }

        /** Light mode color configuration */
        fun light(light: ThemeModeConfig?) = light(JsonField.ofNullable(light))

        /**
         * Sets [Builder.light] to an arbitrary JSON value.
         *
         * You should usually call [Builder.light] with a well-typed [ThemeModeConfig] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun light(light: JsonField<ThemeModeConfig>) = apply { this.light = light }

        /**
         * Custom text for the pay button (e.g., "Complete Purchase", "Subscribe Now"). Max 100
         * characters.
         */
        fun payButtonText(payButtonText: String?) =
            payButtonText(JsonField.ofNullable(payButtonText))

        /**
         * Sets [Builder.payButtonText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payButtonText] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun payButtonText(payButtonText: JsonField<String>) = apply {
            this.payButtonText = payButtonText
        }

        /**
         * Border radius for UI elements. Must be a number followed by px, rem, or em (e.g., "4px",
         * "0.5rem", "1em")
         */
        fun radius(radius: String?) = radius(JsonField.ofNullable(radius))

        /**
         * Sets [Builder.radius] to an arbitrary JSON value.
         *
         * You should usually call [Builder.radius] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun radius(radius: JsonField<String>) = apply { this.radius = radius }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [ThemeConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ThemeConfig =
            ThemeConfig(
                dark,
                fontPrimaryUrl,
                fontSecondaryUrl,
                fontSize,
                fontWeight,
                light,
                payButtonText,
                radius,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): ThemeConfig = apply {
        if (validated) {
            return@apply
        }

        dark()?.validate()
        fontPrimaryUrl()
        fontSecondaryUrl()
        fontSize()?.validate()
        fontWeight()?.validate()
        light()?.validate()
        payButtonText()
        radius()
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
    internal fun validity(): Int =
        (dark.asKnown()?.validity() ?: 0) +
            (if (fontPrimaryUrl.asKnown() == null) 0 else 1) +
            (if (fontSecondaryUrl.asKnown() == null) 0 else 1) +
            (fontSize.asKnown()?.validity() ?: 0) +
            (fontWeight.asKnown()?.validity() ?: 0) +
            (light.asKnown()?.validity() ?: 0) +
            (if (payButtonText.asKnown() == null) 0 else 1) +
            (if (radius.asKnown() == null) 0 else 1)

    /** Font size for the checkout UI */
    class FontSize @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val XS = of("xs")

            val SM = of("sm")

            val MD = of("md")

            val LG = of("lg")

            val XL = of("xl")

            val _2XL = of("2xl")

            fun of(value: String) = FontSize(JsonField.of(value))
        }

        /** An enum containing [FontSize]'s known values. */
        enum class Known {
            XS,
            SM,
            MD,
            LG,
            XL,
            _2XL,
        }

        /**
         * An enum containing [FontSize]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FontSize] can contain an unknown value in a couple of cases:
         *
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         *
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            XS,
            SM,
            MD,
            LG,
            XL,
            _2XL,
            /** An enum member indicating that [FontSize] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                XS -> Value.XS
                SM -> Value.SM
                MD -> Value.MD
                LG -> Value.LG
                XL -> Value.XL
                _2XL -> Value._2XL
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws DodoPaymentsInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                XS -> Known.XS
                SM -> Known.SM
                MD -> Known.MD
                LG -> Known.LG
                XL -> Known.XL
                _2XL -> Known._2XL
                else -> throw DodoPaymentsInvalidDataException("Unknown FontSize: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws DodoPaymentsInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw DodoPaymentsInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): FontSize = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FontSize && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Font weight for the checkout UI */
    class FontWeight @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val NORMAL = of("normal")

            val MEDIUM = of("medium")

            val BOLD = of("bold")

            val EXTRA_BOLD = of("extraBold")

            fun of(value: String) = FontWeight(JsonField.of(value))
        }

        /** An enum containing [FontWeight]'s known values. */
        enum class Known {
            NORMAL,
            MEDIUM,
            BOLD,
            EXTRA_BOLD,
        }

        /**
         * An enum containing [FontWeight]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FontWeight] can contain an unknown value in a couple of cases:
         *
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         *
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NORMAL,
            MEDIUM,
            BOLD,
            EXTRA_BOLD,
            /**
             * An enum member indicating that [FontWeight] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                NORMAL -> Value.NORMAL
                MEDIUM -> Value.MEDIUM
                BOLD -> Value.BOLD
                EXTRA_BOLD -> Value.EXTRA_BOLD
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws DodoPaymentsInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                NORMAL -> Known.NORMAL
                MEDIUM -> Known.MEDIUM
                BOLD -> Known.BOLD
                EXTRA_BOLD -> Known.EXTRA_BOLD
                else -> throw DodoPaymentsInvalidDataException("Unknown FontWeight: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws DodoPaymentsInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw DodoPaymentsInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): FontWeight = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FontWeight && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ThemeConfig &&
            dark == other.dark &&
            fontPrimaryUrl == other.fontPrimaryUrl &&
            fontSecondaryUrl == other.fontSecondaryUrl &&
            fontSize == other.fontSize &&
            fontWeight == other.fontWeight &&
            light == other.light &&
            payButtonText == other.payButtonText &&
            radius == other.radius &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            dark,
            fontPrimaryUrl,
            fontSecondaryUrl,
            fontSize,
            fontWeight,
            light,
            payButtonText,
            radius,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ThemeConfig{dark=$dark, fontPrimaryUrl=$fontPrimaryUrl, fontSecondaryUrl=$fontSecondaryUrl, fontSize=$fontSize, fontWeight=$fontWeight, light=$light, payButtonText=$payButtonText, radius=$radius, additionalProperties=$additionalProperties}"
}
