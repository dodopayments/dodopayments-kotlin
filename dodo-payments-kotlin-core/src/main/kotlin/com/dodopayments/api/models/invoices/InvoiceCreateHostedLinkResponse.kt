// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.invoices

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

class InvoiceCreateHostedLinkResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val expiresAt: JsonField<OffsetDateTime>,
    private val hostedUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("expires_at")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("hosted_url") @ExcludeMissing hostedUrl: JsonField<String> = JsonMissing.of(),
    ) : this(expiresAt, hostedUrl, mutableMapOf())

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expires_at")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hostedUrl(): String = hostedUrl.getRequired("hosted_url")

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_at")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [hostedUrl].
     *
     * Unlike [hostedUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hosted_url") @ExcludeMissing fun _hostedUrl(): JsonField<String> = hostedUrl

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
         * Returns a mutable builder for constructing an instance of
         * [InvoiceCreateHostedLinkResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .expiresAt()
         * .hostedUrl()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [InvoiceCreateHostedLinkResponse]. */
    class Builder internal constructor() {

        private var expiresAt: JsonField<OffsetDateTime>? = null
        private var hostedUrl: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(invoiceCreateHostedLinkResponse: InvoiceCreateHostedLinkResponse) =
            apply {
                expiresAt = invoiceCreateHostedLinkResponse.expiresAt
                hostedUrl = invoiceCreateHostedLinkResponse.hostedUrl
                additionalProperties =
                    invoiceCreateHostedLinkResponse.additionalProperties.toMutableMap()
            }

        fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        fun hostedUrl(hostedUrl: String) = hostedUrl(JsonField.of(hostedUrl))

        /**
         * Sets [Builder.hostedUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hostedUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hostedUrl(hostedUrl: JsonField<String>) = apply { this.hostedUrl = hostedUrl }

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
         * Returns an immutable instance of [InvoiceCreateHostedLinkResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .expiresAt()
         * .hostedUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InvoiceCreateHostedLinkResponse =
            InvoiceCreateHostedLinkResponse(
                checkRequired("expiresAt", expiresAt),
                checkRequired("hostedUrl", hostedUrl),
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
    fun validate(): InvoiceCreateHostedLinkResponse = apply {
        if (validated) {
            return@apply
        }

        expiresAt()
        hostedUrl()
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
        (if (expiresAt.asKnown() == null) 0 else 1) + (if (hostedUrl.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InvoiceCreateHostedLinkResponse &&
            expiresAt == other.expiresAt &&
            hostedUrl == other.hostedUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(expiresAt, hostedUrl, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InvoiceCreateHostedLinkResponse{expiresAt=$expiresAt, hostedUrl=$hostedUrl, additionalProperties=$additionalProperties}"
}
