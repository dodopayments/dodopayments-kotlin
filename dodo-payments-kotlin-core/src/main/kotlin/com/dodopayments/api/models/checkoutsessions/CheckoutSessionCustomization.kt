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

class CheckoutSessionCustomization
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val forceLanguage: JsonField<String>,
    private val showOnDemandTag: JsonField<Boolean>,
    private val showOrderDetails: JsonField<Boolean>,
    private val theme: JsonField<Theme>,
    private val themeConfig: JsonField<ThemeConfig>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("force_language")
        @ExcludeMissing
        forceLanguage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("show_on_demand_tag")
        @ExcludeMissing
        showOnDemandTag: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("show_order_details")
        @ExcludeMissing
        showOrderDetails: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("theme") @ExcludeMissing theme: JsonField<Theme> = JsonMissing.of(),
        @JsonProperty("theme_config")
        @ExcludeMissing
        themeConfig: JsonField<ThemeConfig> = JsonMissing.of(),
    ) : this(forceLanguage, showOnDemandTag, showOrderDetails, theme, themeConfig, mutableMapOf())

    /**
     * Force the checkout interface to render in a specific language (e.g. `en`, `es`)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun forceLanguage(): String? = forceLanguage.getNullable("force_language")

    /**
     * Show on demand tag
     *
     * Default is true
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun showOnDemandTag(): Boolean? = showOnDemandTag.getNullable("show_on_demand_tag")

    /**
     * Show order details by default
     *
     * Default is true
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun showOrderDetails(): Boolean? = showOrderDetails.getNullable("show_order_details")

    /**
     * Theme of the page (determines which mode - light/dark/system - to use)
     *
     * If not provided, uses the business-configured theme from business_themes table.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun theme(): Theme? = theme.getNullable("theme")

    /**
     * Optional custom theme configuration with colors for light and dark modes
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun themeConfig(): ThemeConfig? = themeConfig.getNullable("theme_config")

    /**
     * Returns the raw JSON value of [forceLanguage].
     *
     * Unlike [forceLanguage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("force_language")
    @ExcludeMissing
    fun _forceLanguage(): JsonField<String> = forceLanguage

    /**
     * Returns the raw JSON value of [showOnDemandTag].
     *
     * Unlike [showOnDemandTag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("show_on_demand_tag")
    @ExcludeMissing
    fun _showOnDemandTag(): JsonField<Boolean> = showOnDemandTag

    /**
     * Returns the raw JSON value of [showOrderDetails].
     *
     * Unlike [showOrderDetails], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("show_order_details")
    @ExcludeMissing
    fun _showOrderDetails(): JsonField<Boolean> = showOrderDetails

    /**
     * Returns the raw JSON value of [theme].
     *
     * Unlike [theme], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("theme") @ExcludeMissing fun _theme(): JsonField<Theme> = theme

    /**
     * Returns the raw JSON value of [themeConfig].
     *
     * Unlike [themeConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("theme_config")
    @ExcludeMissing
    fun _themeConfig(): JsonField<ThemeConfig> = themeConfig

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

        /**
         * Returns a mutable builder for constructing an instance of [CheckoutSessionCustomization].
         */
        fun builder() = Builder()
    }

    /** A builder for [CheckoutSessionCustomization]. */
    class Builder internal constructor() {

        private var forceLanguage: JsonField<String> = JsonMissing.of()
        private var showOnDemandTag: JsonField<Boolean> = JsonMissing.of()
        private var showOrderDetails: JsonField<Boolean> = JsonMissing.of()
        private var theme: JsonField<Theme> = JsonMissing.of()
        private var themeConfig: JsonField<ThemeConfig> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(checkoutSessionCustomization: CheckoutSessionCustomization) = apply {
            forceLanguage = checkoutSessionCustomization.forceLanguage
            showOnDemandTag = checkoutSessionCustomization.showOnDemandTag
            showOrderDetails = checkoutSessionCustomization.showOrderDetails
            theme = checkoutSessionCustomization.theme
            themeConfig = checkoutSessionCustomization.themeConfig
            additionalProperties = checkoutSessionCustomization.additionalProperties.toMutableMap()
        }

        /** Force the checkout interface to render in a specific language (e.g. `en`, `es`) */
        fun forceLanguage(forceLanguage: String?) =
            forceLanguage(JsonField.ofNullable(forceLanguage))

        /**
         * Sets [Builder.forceLanguage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.forceLanguage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun forceLanguage(forceLanguage: JsonField<String>) = apply {
            this.forceLanguage = forceLanguage
        }

        /**
         * Show on demand tag
         *
         * Default is true
         */
        fun showOnDemandTag(showOnDemandTag: Boolean) =
            showOnDemandTag(JsonField.of(showOnDemandTag))

        /**
         * Sets [Builder.showOnDemandTag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.showOnDemandTag] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun showOnDemandTag(showOnDemandTag: JsonField<Boolean>) = apply {
            this.showOnDemandTag = showOnDemandTag
        }

        /**
         * Show order details by default
         *
         * Default is true
         */
        fun showOrderDetails(showOrderDetails: Boolean) =
            showOrderDetails(JsonField.of(showOrderDetails))

        /**
         * Sets [Builder.showOrderDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.showOrderDetails] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun showOrderDetails(showOrderDetails: JsonField<Boolean>) = apply {
            this.showOrderDetails = showOrderDetails
        }

        /**
         * Theme of the page (determines which mode - light/dark/system - to use)
         *
         * If not provided, uses the business-configured theme from business_themes table.
         */
        fun theme(theme: Theme?) = theme(JsonField.ofNullable(theme))

        /**
         * Sets [Builder.theme] to an arbitrary JSON value.
         *
         * You should usually call [Builder.theme] with a well-typed [Theme] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun theme(theme: JsonField<Theme>) = apply { this.theme = theme }

        /** Optional custom theme configuration with colors for light and dark modes */
        fun themeConfig(themeConfig: ThemeConfig?) = themeConfig(JsonField.ofNullable(themeConfig))

        /**
         * Sets [Builder.themeConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.themeConfig] with a well-typed [ThemeConfig] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun themeConfig(themeConfig: JsonField<ThemeConfig>) = apply {
            this.themeConfig = themeConfig
        }

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
         * Returns an immutable instance of [CheckoutSessionCustomization].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CheckoutSessionCustomization =
            CheckoutSessionCustomization(
                forceLanguage,
                showOnDemandTag,
                showOrderDetails,
                theme,
                themeConfig,
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
    fun validate(): CheckoutSessionCustomization = apply {
        if (validated) {
            return@apply
        }

        forceLanguage()
        showOnDemandTag()
        showOrderDetails()
        theme()?.validate()
        themeConfig()?.validate()
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
        (if (forceLanguage.asKnown() == null) 0 else 1) +
            (if (showOnDemandTag.asKnown() == null) 0 else 1) +
            (if (showOrderDetails.asKnown() == null) 0 else 1) +
            (theme.asKnown()?.validity() ?: 0) +
            (themeConfig.asKnown()?.validity() ?: 0)

    /**
     * Theme of the page (determines which mode - light/dark/system - to use)
     *
     * If not provided, uses the business-configured theme from business_themes table.
     */
    class Theme @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val DARK = of("dark")

            val LIGHT = of("light")

            val SYSTEM = of("system")

            fun of(value: String) = Theme(JsonField.of(value))
        }

        /** An enum containing [Theme]'s known values. */
        enum class Known {
            DARK,
            LIGHT,
            SYSTEM,
        }

        /**
         * An enum containing [Theme]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Theme] can contain an unknown value in a couple of cases:
         *
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         *
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DARK,
            LIGHT,
            SYSTEM,
            /** An enum member indicating that [Theme] was instantiated with an unknown value. */
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
                DARK -> Value.DARK
                LIGHT -> Value.LIGHT
                SYSTEM -> Value.SYSTEM
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
                DARK -> Known.DARK
                LIGHT -> Known.LIGHT
                SYSTEM -> Known.SYSTEM
                else -> throw DodoPaymentsInvalidDataException("Unknown Theme: $value")
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
        fun validate(): Theme = apply {
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

            return other is Theme && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CheckoutSessionCustomization &&
            forceLanguage == other.forceLanguage &&
            showOnDemandTag == other.showOnDemandTag &&
            showOrderDetails == other.showOrderDetails &&
            theme == other.theme &&
            themeConfig == other.themeConfig &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            forceLanguage,
            showOnDemandTag,
            showOrderDetails,
            theme,
            themeConfig,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CheckoutSessionCustomization{forceLanguage=$forceLanguage, showOnDemandTag=$showOnDemandTag, showOrderDetails=$showOrderDetails, theme=$theme, themeConfig=$themeConfig, additionalProperties=$additionalProperties}"
}
