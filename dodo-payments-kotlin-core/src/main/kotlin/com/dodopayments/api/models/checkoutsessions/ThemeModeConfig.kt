// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.checkoutsessions

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

/**
 * Color configuration for a single theme mode (light or dark).
 *
 * All color fields accept standard CSS color formats:
 * - Hex: `#fff`, `#ffffff`, `#ffffffff` (with or without # prefix)
 * - RGB/RGBA: `rgb(255, 255, 255)`, `rgba(255, 255, 255, 0.5)`
 * - HSL/HSLA: `hsl(120, 100%, 50%)`, `hsla(120, 100%, 50%, 0.5)`
 * - Named colors: `red`, `blue`, `transparent`, etc.
 * - Advanced: `hwb()`, `lab()`, `lch()`, `oklab()`, `oklch()`, `color()`
 */
class ThemeModeConfig
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val bgPrimary: JsonField<String>,
    private val bgSecondary: JsonField<String>,
    private val borderPrimary: JsonField<String>,
    private val borderSecondary: JsonField<String>,
    private val buttonPrimary: JsonField<String>,
    private val buttonPrimaryHover: JsonField<String>,
    private val buttonSecondary: JsonField<String>,
    private val buttonSecondaryHover: JsonField<String>,
    private val buttonTextPrimary: JsonField<String>,
    private val buttonTextSecondary: JsonField<String>,
    private val inputFocusBorder: JsonField<String>,
    private val textError: JsonField<String>,
    private val textPlaceholder: JsonField<String>,
    private val textPrimary: JsonField<String>,
    private val textSecondary: JsonField<String>,
    private val textSuccess: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("bg_primary") @ExcludeMissing bgPrimary: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bg_secondary")
        @ExcludeMissing
        bgSecondary: JsonField<String> = JsonMissing.of(),
        @JsonProperty("border_primary")
        @ExcludeMissing
        borderPrimary: JsonField<String> = JsonMissing.of(),
        @JsonProperty("border_secondary")
        @ExcludeMissing
        borderSecondary: JsonField<String> = JsonMissing.of(),
        @JsonProperty("button_primary")
        @ExcludeMissing
        buttonPrimary: JsonField<String> = JsonMissing.of(),
        @JsonProperty("button_primary_hover")
        @ExcludeMissing
        buttonPrimaryHover: JsonField<String> = JsonMissing.of(),
        @JsonProperty("button_secondary")
        @ExcludeMissing
        buttonSecondary: JsonField<String> = JsonMissing.of(),
        @JsonProperty("button_secondary_hover")
        @ExcludeMissing
        buttonSecondaryHover: JsonField<String> = JsonMissing.of(),
        @JsonProperty("button_text_primary")
        @ExcludeMissing
        buttonTextPrimary: JsonField<String> = JsonMissing.of(),
        @JsonProperty("button_text_secondary")
        @ExcludeMissing
        buttonTextSecondary: JsonField<String> = JsonMissing.of(),
        @JsonProperty("input_focus_border")
        @ExcludeMissing
        inputFocusBorder: JsonField<String> = JsonMissing.of(),
        @JsonProperty("text_error") @ExcludeMissing textError: JsonField<String> = JsonMissing.of(),
        @JsonProperty("text_placeholder")
        @ExcludeMissing
        textPlaceholder: JsonField<String> = JsonMissing.of(),
        @JsonProperty("text_primary")
        @ExcludeMissing
        textPrimary: JsonField<String> = JsonMissing.of(),
        @JsonProperty("text_secondary")
        @ExcludeMissing
        textSecondary: JsonField<String> = JsonMissing.of(),
        @JsonProperty("text_success")
        @ExcludeMissing
        textSuccess: JsonField<String> = JsonMissing.of(),
    ) : this(
        bgPrimary,
        bgSecondary,
        borderPrimary,
        borderSecondary,
        buttonPrimary,
        buttonPrimaryHover,
        buttonSecondary,
        buttonSecondaryHover,
        buttonTextPrimary,
        buttonTextSecondary,
        inputFocusBorder,
        textError,
        textPlaceholder,
        textPrimary,
        textSecondary,
        textSuccess,
        mutableMapOf(),
    )

    /**
     * Background primary color
     *
     * Examples: `"#ffffff"`, `"rgb(255, 255, 255)"`, `"white"`
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun bgPrimary(): String? = bgPrimary.getNullable("bg_primary")

    /**
     * Background secondary color
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun bgSecondary(): String? = bgSecondary.getNullable("bg_secondary")

    /**
     * Border primary color
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun borderPrimary(): String? = borderPrimary.getNullable("border_primary")

    /**
     * Border secondary color
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun borderSecondary(): String? = borderSecondary.getNullable("border_secondary")

    /**
     * Primary button background color
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun buttonPrimary(): String? = buttonPrimary.getNullable("button_primary")

    /**
     * Primary button hover color
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun buttonPrimaryHover(): String? = buttonPrimaryHover.getNullable("button_primary_hover")

    /**
     * Secondary button background color
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun buttonSecondary(): String? = buttonSecondary.getNullable("button_secondary")

    /**
     * Secondary button hover color
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun buttonSecondaryHover(): String? = buttonSecondaryHover.getNullable("button_secondary_hover")

    /**
     * Primary button text color
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun buttonTextPrimary(): String? = buttonTextPrimary.getNullable("button_text_primary")

    /**
     * Secondary button text color
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun buttonTextSecondary(): String? = buttonTextSecondary.getNullable("button_text_secondary")

    /**
     * Input focus border color
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun inputFocusBorder(): String? = inputFocusBorder.getNullable("input_focus_border")

    /**
     * Text error color
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun textError(): String? = textError.getNullable("text_error")

    /**
     * Text placeholder color
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun textPlaceholder(): String? = textPlaceholder.getNullable("text_placeholder")

    /**
     * Text primary color
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun textPrimary(): String? = textPrimary.getNullable("text_primary")

    /**
     * Text secondary color
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun textSecondary(): String? = textSecondary.getNullable("text_secondary")

    /**
     * Text success color
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun textSuccess(): String? = textSuccess.getNullable("text_success")

    /**
     * Returns the raw JSON value of [bgPrimary].
     *
     * Unlike [bgPrimary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bg_primary") @ExcludeMissing fun _bgPrimary(): JsonField<String> = bgPrimary

    /**
     * Returns the raw JSON value of [bgSecondary].
     *
     * Unlike [bgSecondary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bg_secondary")
    @ExcludeMissing
    fun _bgSecondary(): JsonField<String> = bgSecondary

    /**
     * Returns the raw JSON value of [borderPrimary].
     *
     * Unlike [borderPrimary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("border_primary")
    @ExcludeMissing
    fun _borderPrimary(): JsonField<String> = borderPrimary

    /**
     * Returns the raw JSON value of [borderSecondary].
     *
     * Unlike [borderSecondary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("border_secondary")
    @ExcludeMissing
    fun _borderSecondary(): JsonField<String> = borderSecondary

    /**
     * Returns the raw JSON value of [buttonPrimary].
     *
     * Unlike [buttonPrimary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("button_primary")
    @ExcludeMissing
    fun _buttonPrimary(): JsonField<String> = buttonPrimary

    /**
     * Returns the raw JSON value of [buttonPrimaryHover].
     *
     * Unlike [buttonPrimaryHover], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("button_primary_hover")
    @ExcludeMissing
    fun _buttonPrimaryHover(): JsonField<String> = buttonPrimaryHover

    /**
     * Returns the raw JSON value of [buttonSecondary].
     *
     * Unlike [buttonSecondary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("button_secondary")
    @ExcludeMissing
    fun _buttonSecondary(): JsonField<String> = buttonSecondary

    /**
     * Returns the raw JSON value of [buttonSecondaryHover].
     *
     * Unlike [buttonSecondaryHover], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("button_secondary_hover")
    @ExcludeMissing
    fun _buttonSecondaryHover(): JsonField<String> = buttonSecondaryHover

    /**
     * Returns the raw JSON value of [buttonTextPrimary].
     *
     * Unlike [buttonTextPrimary], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("button_text_primary")
    @ExcludeMissing
    fun _buttonTextPrimary(): JsonField<String> = buttonTextPrimary

    /**
     * Returns the raw JSON value of [buttonTextSecondary].
     *
     * Unlike [buttonTextSecondary], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("button_text_secondary")
    @ExcludeMissing
    fun _buttonTextSecondary(): JsonField<String> = buttonTextSecondary

    /**
     * Returns the raw JSON value of [inputFocusBorder].
     *
     * Unlike [inputFocusBorder], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("input_focus_border")
    @ExcludeMissing
    fun _inputFocusBorder(): JsonField<String> = inputFocusBorder

    /**
     * Returns the raw JSON value of [textError].
     *
     * Unlike [textError], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text_error") @ExcludeMissing fun _textError(): JsonField<String> = textError

    /**
     * Returns the raw JSON value of [textPlaceholder].
     *
     * Unlike [textPlaceholder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text_placeholder")
    @ExcludeMissing
    fun _textPlaceholder(): JsonField<String> = textPlaceholder

    /**
     * Returns the raw JSON value of [textPrimary].
     *
     * Unlike [textPrimary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text_primary")
    @ExcludeMissing
    fun _textPrimary(): JsonField<String> = textPrimary

    /**
     * Returns the raw JSON value of [textSecondary].
     *
     * Unlike [textSecondary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text_secondary")
    @ExcludeMissing
    fun _textSecondary(): JsonField<String> = textSecondary

    /**
     * Returns the raw JSON value of [textSuccess].
     *
     * Unlike [textSuccess], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text_success")
    @ExcludeMissing
    fun _textSuccess(): JsonField<String> = textSuccess

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

        /** Returns a mutable builder for constructing an instance of [ThemeModeConfig]. */
        fun builder() = Builder()
    }

    /** A builder for [ThemeModeConfig]. */
    class Builder internal constructor() {

        private var bgPrimary: JsonField<String> = JsonMissing.of()
        private var bgSecondary: JsonField<String> = JsonMissing.of()
        private var borderPrimary: JsonField<String> = JsonMissing.of()
        private var borderSecondary: JsonField<String> = JsonMissing.of()
        private var buttonPrimary: JsonField<String> = JsonMissing.of()
        private var buttonPrimaryHover: JsonField<String> = JsonMissing.of()
        private var buttonSecondary: JsonField<String> = JsonMissing.of()
        private var buttonSecondaryHover: JsonField<String> = JsonMissing.of()
        private var buttonTextPrimary: JsonField<String> = JsonMissing.of()
        private var buttonTextSecondary: JsonField<String> = JsonMissing.of()
        private var inputFocusBorder: JsonField<String> = JsonMissing.of()
        private var textError: JsonField<String> = JsonMissing.of()
        private var textPlaceholder: JsonField<String> = JsonMissing.of()
        private var textPrimary: JsonField<String> = JsonMissing.of()
        private var textSecondary: JsonField<String> = JsonMissing.of()
        private var textSuccess: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(themeModeConfig: ThemeModeConfig) = apply {
            bgPrimary = themeModeConfig.bgPrimary
            bgSecondary = themeModeConfig.bgSecondary
            borderPrimary = themeModeConfig.borderPrimary
            borderSecondary = themeModeConfig.borderSecondary
            buttonPrimary = themeModeConfig.buttonPrimary
            buttonPrimaryHover = themeModeConfig.buttonPrimaryHover
            buttonSecondary = themeModeConfig.buttonSecondary
            buttonSecondaryHover = themeModeConfig.buttonSecondaryHover
            buttonTextPrimary = themeModeConfig.buttonTextPrimary
            buttonTextSecondary = themeModeConfig.buttonTextSecondary
            inputFocusBorder = themeModeConfig.inputFocusBorder
            textError = themeModeConfig.textError
            textPlaceholder = themeModeConfig.textPlaceholder
            textPrimary = themeModeConfig.textPrimary
            textSecondary = themeModeConfig.textSecondary
            textSuccess = themeModeConfig.textSuccess
            additionalProperties = themeModeConfig.additionalProperties.toMutableMap()
        }

        /**
         * Background primary color
         *
         * Examples: `"#ffffff"`, `"rgb(255, 255, 255)"`, `"white"`
         */
        fun bgPrimary(bgPrimary: String?) = bgPrimary(JsonField.ofNullable(bgPrimary))

        /**
         * Sets [Builder.bgPrimary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bgPrimary] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun bgPrimary(bgPrimary: JsonField<String>) = apply { this.bgPrimary = bgPrimary }

        /** Background secondary color */
        fun bgSecondary(bgSecondary: String?) = bgSecondary(JsonField.ofNullable(bgSecondary))

        /**
         * Sets [Builder.bgSecondary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bgSecondary] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun bgSecondary(bgSecondary: JsonField<String>) = apply { this.bgSecondary = bgSecondary }

        /** Border primary color */
        fun borderPrimary(borderPrimary: String?) =
            borderPrimary(JsonField.ofNullable(borderPrimary))

        /**
         * Sets [Builder.borderPrimary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.borderPrimary] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun borderPrimary(borderPrimary: JsonField<String>) = apply {
            this.borderPrimary = borderPrimary
        }

        /** Border secondary color */
        fun borderSecondary(borderSecondary: String?) =
            borderSecondary(JsonField.ofNullable(borderSecondary))

        /**
         * Sets [Builder.borderSecondary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.borderSecondary] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun borderSecondary(borderSecondary: JsonField<String>) = apply {
            this.borderSecondary = borderSecondary
        }

        /** Primary button background color */
        fun buttonPrimary(buttonPrimary: String?) =
            buttonPrimary(JsonField.ofNullable(buttonPrimary))

        /**
         * Sets [Builder.buttonPrimary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.buttonPrimary] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun buttonPrimary(buttonPrimary: JsonField<String>) = apply {
            this.buttonPrimary = buttonPrimary
        }

        /** Primary button hover color */
        fun buttonPrimaryHover(buttonPrimaryHover: String?) =
            buttonPrimaryHover(JsonField.ofNullable(buttonPrimaryHover))

        /**
         * Sets [Builder.buttonPrimaryHover] to an arbitrary JSON value.
         *
         * You should usually call [Builder.buttonPrimaryHover] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun buttonPrimaryHover(buttonPrimaryHover: JsonField<String>) = apply {
            this.buttonPrimaryHover = buttonPrimaryHover
        }

        /** Secondary button background color */
        fun buttonSecondary(buttonSecondary: String?) =
            buttonSecondary(JsonField.ofNullable(buttonSecondary))

        /**
         * Sets [Builder.buttonSecondary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.buttonSecondary] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun buttonSecondary(buttonSecondary: JsonField<String>) = apply {
            this.buttonSecondary = buttonSecondary
        }

        /** Secondary button hover color */
        fun buttonSecondaryHover(buttonSecondaryHover: String?) =
            buttonSecondaryHover(JsonField.ofNullable(buttonSecondaryHover))

        /**
         * Sets [Builder.buttonSecondaryHover] to an arbitrary JSON value.
         *
         * You should usually call [Builder.buttonSecondaryHover] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun buttonSecondaryHover(buttonSecondaryHover: JsonField<String>) = apply {
            this.buttonSecondaryHover = buttonSecondaryHover
        }

        /** Primary button text color */
        fun buttonTextPrimary(buttonTextPrimary: String?) =
            buttonTextPrimary(JsonField.ofNullable(buttonTextPrimary))

        /**
         * Sets [Builder.buttonTextPrimary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.buttonTextPrimary] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun buttonTextPrimary(buttonTextPrimary: JsonField<String>) = apply {
            this.buttonTextPrimary = buttonTextPrimary
        }

        /** Secondary button text color */
        fun buttonTextSecondary(buttonTextSecondary: String?) =
            buttonTextSecondary(JsonField.ofNullable(buttonTextSecondary))

        /**
         * Sets [Builder.buttonTextSecondary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.buttonTextSecondary] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun buttonTextSecondary(buttonTextSecondary: JsonField<String>) = apply {
            this.buttonTextSecondary = buttonTextSecondary
        }

        /** Input focus border color */
        fun inputFocusBorder(inputFocusBorder: String?) =
            inputFocusBorder(JsonField.ofNullable(inputFocusBorder))

        /**
         * Sets [Builder.inputFocusBorder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputFocusBorder] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun inputFocusBorder(inputFocusBorder: JsonField<String>) = apply {
            this.inputFocusBorder = inputFocusBorder
        }

        /** Text error color */
        fun textError(textError: String?) = textError(JsonField.ofNullable(textError))

        /**
         * Sets [Builder.textError] to an arbitrary JSON value.
         *
         * You should usually call [Builder.textError] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun textError(textError: JsonField<String>) = apply { this.textError = textError }

        /** Text placeholder color */
        fun textPlaceholder(textPlaceholder: String?) =
            textPlaceholder(JsonField.ofNullable(textPlaceholder))

        /**
         * Sets [Builder.textPlaceholder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.textPlaceholder] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun textPlaceholder(textPlaceholder: JsonField<String>) = apply {
            this.textPlaceholder = textPlaceholder
        }

        /** Text primary color */
        fun textPrimary(textPrimary: String?) = textPrimary(JsonField.ofNullable(textPrimary))

        /**
         * Sets [Builder.textPrimary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.textPrimary] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun textPrimary(textPrimary: JsonField<String>) = apply { this.textPrimary = textPrimary }

        /** Text secondary color */
        fun textSecondary(textSecondary: String?) =
            textSecondary(JsonField.ofNullable(textSecondary))

        /**
         * Sets [Builder.textSecondary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.textSecondary] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun textSecondary(textSecondary: JsonField<String>) = apply {
            this.textSecondary = textSecondary
        }

        /** Text success color */
        fun textSuccess(textSuccess: String?) = textSuccess(JsonField.ofNullable(textSuccess))

        /**
         * Sets [Builder.textSuccess] to an arbitrary JSON value.
         *
         * You should usually call [Builder.textSuccess] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun textSuccess(textSuccess: JsonField<String>) = apply { this.textSuccess = textSuccess }

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
         * Returns an immutable instance of [ThemeModeConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ThemeModeConfig =
            ThemeModeConfig(
                bgPrimary,
                bgSecondary,
                borderPrimary,
                borderSecondary,
                buttonPrimary,
                buttonPrimaryHover,
                buttonSecondary,
                buttonSecondaryHover,
                buttonTextPrimary,
                buttonTextSecondary,
                inputFocusBorder,
                textError,
                textPlaceholder,
                textPrimary,
                textSecondary,
                textSuccess,
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
    fun validate(): ThemeModeConfig = apply {
        if (validated) {
            return@apply
        }

        bgPrimary()
        bgSecondary()
        borderPrimary()
        borderSecondary()
        buttonPrimary()
        buttonPrimaryHover()
        buttonSecondary()
        buttonSecondaryHover()
        buttonTextPrimary()
        buttonTextSecondary()
        inputFocusBorder()
        textError()
        textPlaceholder()
        textPrimary()
        textSecondary()
        textSuccess()
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
        (if (bgPrimary.asKnown() == null) 0 else 1) +
            (if (bgSecondary.asKnown() == null) 0 else 1) +
            (if (borderPrimary.asKnown() == null) 0 else 1) +
            (if (borderSecondary.asKnown() == null) 0 else 1) +
            (if (buttonPrimary.asKnown() == null) 0 else 1) +
            (if (buttonPrimaryHover.asKnown() == null) 0 else 1) +
            (if (buttonSecondary.asKnown() == null) 0 else 1) +
            (if (buttonSecondaryHover.asKnown() == null) 0 else 1) +
            (if (buttonTextPrimary.asKnown() == null) 0 else 1) +
            (if (buttonTextSecondary.asKnown() == null) 0 else 1) +
            (if (inputFocusBorder.asKnown() == null) 0 else 1) +
            (if (textError.asKnown() == null) 0 else 1) +
            (if (textPlaceholder.asKnown() == null) 0 else 1) +
            (if (textPrimary.asKnown() == null) 0 else 1) +
            (if (textSecondary.asKnown() == null) 0 else 1) +
            (if (textSuccess.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ThemeModeConfig &&
            bgPrimary == other.bgPrimary &&
            bgSecondary == other.bgSecondary &&
            borderPrimary == other.borderPrimary &&
            borderSecondary == other.borderSecondary &&
            buttonPrimary == other.buttonPrimary &&
            buttonPrimaryHover == other.buttonPrimaryHover &&
            buttonSecondary == other.buttonSecondary &&
            buttonSecondaryHover == other.buttonSecondaryHover &&
            buttonTextPrimary == other.buttonTextPrimary &&
            buttonTextSecondary == other.buttonTextSecondary &&
            inputFocusBorder == other.inputFocusBorder &&
            textError == other.textError &&
            textPlaceholder == other.textPlaceholder &&
            textPrimary == other.textPrimary &&
            textSecondary == other.textSecondary &&
            textSuccess == other.textSuccess &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            bgPrimary,
            bgSecondary,
            borderPrimary,
            borderSecondary,
            buttonPrimary,
            buttonPrimaryHover,
            buttonSecondary,
            buttonSecondaryHover,
            buttonTextPrimary,
            buttonTextSecondary,
            inputFocusBorder,
            textError,
            textPlaceholder,
            textPrimary,
            textSecondary,
            textSuccess,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ThemeModeConfig{bgPrimary=$bgPrimary, bgSecondary=$bgSecondary, borderPrimary=$borderPrimary, borderSecondary=$borderSecondary, buttonPrimary=$buttonPrimary, buttonPrimaryHover=$buttonPrimaryHover, buttonSecondary=$buttonSecondary, buttonSecondaryHover=$buttonSecondaryHover, buttonTextPrimary=$buttonTextPrimary, buttonTextSecondary=$buttonTextSecondary, inputFocusBorder=$inputFocusBorder, textError=$textError, textPlaceholder=$textPlaceholder, textPrimary=$textPrimary, textSecondary=$textSecondary, textSuccess=$textSuccess, additionalProperties=$additionalProperties}"
}
