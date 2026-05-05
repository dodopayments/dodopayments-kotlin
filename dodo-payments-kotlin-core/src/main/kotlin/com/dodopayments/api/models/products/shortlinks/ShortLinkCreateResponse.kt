// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products.shortlinks

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

class ShortLinkCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val fullUrl: JsonField<String>,
    private val shortUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("full_url") @ExcludeMissing fullUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("short_url") @ExcludeMissing shortUrl: JsonField<String> = JsonMissing.of(),
    ) : this(fullUrl, shortUrl, mutableMapOf())

    /**
     * Full URL.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fullUrl(): String = fullUrl.getRequired("full_url")

    /**
     * Short URL.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun shortUrl(): String = shortUrl.getRequired("short_url")

    /**
     * Returns the raw JSON value of [fullUrl].
     *
     * Unlike [fullUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("full_url") @ExcludeMissing fun _fullUrl(): JsonField<String> = fullUrl

    /**
     * Returns the raw JSON value of [shortUrl].
     *
     * Unlike [shortUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("short_url") @ExcludeMissing fun _shortUrl(): JsonField<String> = shortUrl

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
         * Returns a mutable builder for constructing an instance of [ShortLinkCreateResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .fullUrl()
         * .shortUrl()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ShortLinkCreateResponse]. */
    class Builder internal constructor() {

        private var fullUrl: JsonField<String>? = null
        private var shortUrl: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(shortLinkCreateResponse: ShortLinkCreateResponse) = apply {
            fullUrl = shortLinkCreateResponse.fullUrl
            shortUrl = shortLinkCreateResponse.shortUrl
            additionalProperties = shortLinkCreateResponse.additionalProperties.toMutableMap()
        }

        /** Full URL. */
        fun fullUrl(fullUrl: String) = fullUrl(JsonField.of(fullUrl))

        /**
         * Sets [Builder.fullUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fullUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fullUrl(fullUrl: JsonField<String>) = apply { this.fullUrl = fullUrl }

        /** Short URL. */
        fun shortUrl(shortUrl: String) = shortUrl(JsonField.of(shortUrl))

        /**
         * Sets [Builder.shortUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shortUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun shortUrl(shortUrl: JsonField<String>) = apply { this.shortUrl = shortUrl }

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
         * Returns an immutable instance of [ShortLinkCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .fullUrl()
         * .shortUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ShortLinkCreateResponse =
            ShortLinkCreateResponse(
                checkRequired("fullUrl", fullUrl),
                checkRequired("shortUrl", shortUrl),
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
    fun validate(): ShortLinkCreateResponse = apply {
        if (validated) {
            return@apply
        }

        fullUrl()
        shortUrl()
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
        (if (fullUrl.asKnown() == null) 0 else 1) + (if (shortUrl.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ShortLinkCreateResponse &&
            fullUrl == other.fullUrl &&
            shortUrl == other.shortUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(fullUrl, shortUrl, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ShortLinkCreateResponse{fullUrl=$fullUrl, shortUrl=$shortUrl, additionalProperties=$additionalProperties}"
}
