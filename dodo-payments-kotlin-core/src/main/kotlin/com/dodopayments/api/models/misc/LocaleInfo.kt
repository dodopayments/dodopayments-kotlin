// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.misc

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

/** A locale that the checkout and the customer portal can show. */
class LocaleInfo
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val code: JsonField<Locale>,
    private val name: JsonField<String>,
    private val nativeName: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("code") @ExcludeMissing code: JsonField<Locale> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("native_name")
        @ExcludeMissing
        nativeName: JsonField<String> = JsonMissing.of(),
    ) : this(code, name, nativeName, mutableMapOf())

    /**
     * The code to send in the `locale` parameter.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun code(): Locale = code.getRequired("code")

    /**
     * The English name of the language.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * The name of the language in that language.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun nativeName(): String = nativeName.getRequired("native_name")

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<Locale> = code

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [nativeName].
     *
     * Unlike [nativeName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("native_name") @ExcludeMissing fun _nativeName(): JsonField<String> = nativeName

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
         * Returns a mutable builder for constructing an instance of [LocaleInfo].
         *
         * The following fields are required:
         * ```kotlin
         * .code()
         * .name()
         * .nativeName()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [LocaleInfo]. */
    class Builder internal constructor() {

        private var code: JsonField<Locale>? = null
        private var name: JsonField<String>? = null
        private var nativeName: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(localeInfo: LocaleInfo) = apply {
            code = localeInfo.code
            name = localeInfo.name
            nativeName = localeInfo.nativeName
            additionalProperties = localeInfo.additionalProperties.toMutableMap()
        }

        /** The code to send in the `locale` parameter. */
        fun code(code: Locale) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [Locale] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<Locale>) = apply { this.code = code }

        /** The English name of the language. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The name of the language in that language. */
        fun nativeName(nativeName: String) = nativeName(JsonField.of(nativeName))

        /**
         * Sets [Builder.nativeName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nativeName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nativeName(nativeName: JsonField<String>) = apply { this.nativeName = nativeName }

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
         * Returns an immutable instance of [LocaleInfo].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .code()
         * .name()
         * .nativeName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LocaleInfo =
            LocaleInfo(
                checkRequired("code", code),
                checkRequired("name", name),
                checkRequired("nativeName", nativeName),
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
    fun validate(): LocaleInfo = apply {
        if (validated) {
            return@apply
        }

        code().validate()
        name()
        nativeName()
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
        (code.asKnown()?.validity() ?: 0) +
            (if (name.asKnown() == null) 0 else 1) +
            (if (nativeName.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LocaleInfo &&
            code == other.code &&
            name == other.name &&
            nativeName == other.nativeName &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(code, name, nativeName, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LocaleInfo{code=$code, name=$name, nativeName=$nativeName, additionalProperties=$additionalProperties}"
}
