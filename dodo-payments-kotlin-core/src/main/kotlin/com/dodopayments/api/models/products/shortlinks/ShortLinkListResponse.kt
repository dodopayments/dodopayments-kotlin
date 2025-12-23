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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class ShortLinkListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val createdAt: JsonField<OffsetDateTime>,
    private val fullUrl: JsonField<String>,
    private val productId: JsonField<String>,
    private val shortUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("full_url") @ExcludeMissing fullUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("product_id") @ExcludeMissing productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("short_url") @ExcludeMissing shortUrl: JsonField<String> = JsonMissing.of(),
    ) : this(createdAt, fullUrl, productId, shortUrl, mutableMapOf())

    /**
     * When the short url was created
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * Full URL the short url redirects to
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fullUrl(): String = fullUrl.getRequired("full_url")

    /**
     * Product ID associated with the short link
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun productId(): String = productId.getRequired("product_id")

    /**
     * Short URL
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun shortUrl(): String = shortUrl.getRequired("short_url")

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [fullUrl].
     *
     * Unlike [fullUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("full_url") @ExcludeMissing fun _fullUrl(): JsonField<String> = fullUrl

    /**
     * Returns the raw JSON value of [productId].
     *
     * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

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
         * Returns a mutable builder for constructing an instance of [ShortLinkListResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .createdAt()
         * .fullUrl()
         * .productId()
         * .shortUrl()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ShortLinkListResponse]. */
    class Builder internal constructor() {

        private var createdAt: JsonField<OffsetDateTime>? = null
        private var fullUrl: JsonField<String>? = null
        private var productId: JsonField<String>? = null
        private var shortUrl: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(shortLinkListResponse: ShortLinkListResponse) = apply {
            createdAt = shortLinkListResponse.createdAt
            fullUrl = shortLinkListResponse.fullUrl
            productId = shortLinkListResponse.productId
            shortUrl = shortLinkListResponse.shortUrl
            additionalProperties = shortLinkListResponse.additionalProperties.toMutableMap()
        }

        /** When the short url was created */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Full URL the short url redirects to */
        fun fullUrl(fullUrl: String) = fullUrl(JsonField.of(fullUrl))

        /**
         * Sets [Builder.fullUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fullUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fullUrl(fullUrl: JsonField<String>) = apply { this.fullUrl = fullUrl }

        /** Product ID associated with the short link */
        fun productId(productId: String) = productId(JsonField.of(productId))

        /**
         * Sets [Builder.productId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

        /** Short URL */
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
         * Returns an immutable instance of [ShortLinkListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .createdAt()
         * .fullUrl()
         * .productId()
         * .shortUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ShortLinkListResponse =
            ShortLinkListResponse(
                checkRequired("createdAt", createdAt),
                checkRequired("fullUrl", fullUrl),
                checkRequired("productId", productId),
                checkRequired("shortUrl", shortUrl),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ShortLinkListResponse = apply {
        if (validated) {
            return@apply
        }

        createdAt()
        fullUrl()
        productId()
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
        (if (createdAt.asKnown() == null) 0 else 1) +
            (if (fullUrl.asKnown() == null) 0 else 1) +
            (if (productId.asKnown() == null) 0 else 1) +
            (if (shortUrl.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ShortLinkListResponse &&
            createdAt == other.createdAt &&
            fullUrl == other.fullUrl &&
            productId == other.productId &&
            shortUrl == other.shortUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(createdAt, fullUrl, productId, shortUrl, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ShortLinkListResponse{createdAt=$createdAt, fullUrl=$fullUrl, productId=$productId, shortUrl=$shortUrl, additionalProperties=$additionalProperties}"
}
