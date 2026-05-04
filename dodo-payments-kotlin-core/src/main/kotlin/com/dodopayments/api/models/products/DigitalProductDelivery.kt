// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

/**
 * Digital-product-delivery payload, present on grants for `digital_files` entitlements. Each file
 * carries a short-lived presigned download URL.
 */
class DigitalProductDelivery
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val files: JsonField<List<DigitalProductDeliveryFile>>,
    private val externalUrl: JsonField<String>,
    private val instructions: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("files")
        @ExcludeMissing
        files: JsonField<List<DigitalProductDeliveryFile>> = JsonMissing.of(),
        @JsonProperty("external_url")
        @ExcludeMissing
        externalUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("instructions")
        @ExcludeMissing
        instructions: JsonField<String> = JsonMissing.of(),
    ) : this(files, externalUrl, instructions, mutableMapOf())

    /**
     * One entry per attached file.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun files(): List<DigitalProductDeliveryFile> = files.getRequired("files")

    /**
     * Optional external URL, passed through from the entitlement configuration.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun externalUrl(): String? = externalUrl.getNullable("external_url")

    /**
     * Optional human-readable delivery instructions, passed through from the entitlement
     * configuration.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun instructions(): String? = instructions.getNullable("instructions")

    /**
     * Returns the raw JSON value of [files].
     *
     * Unlike [files], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("files")
    @ExcludeMissing
    fun _files(): JsonField<List<DigitalProductDeliveryFile>> = files

    /**
     * Returns the raw JSON value of [externalUrl].
     *
     * Unlike [externalUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("external_url")
    @ExcludeMissing
    fun _externalUrl(): JsonField<String> = externalUrl

    /**
     * Returns the raw JSON value of [instructions].
     *
     * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instructions")
    @ExcludeMissing
    fun _instructions(): JsonField<String> = instructions

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
         * Returns a mutable builder for constructing an instance of [DigitalProductDelivery].
         *
         * The following fields are required:
         * ```kotlin
         * .files()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [DigitalProductDelivery]. */
    class Builder internal constructor() {

        private var files: JsonField<MutableList<DigitalProductDeliveryFile>>? = null
        private var externalUrl: JsonField<String> = JsonMissing.of()
        private var instructions: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(digitalProductDelivery: DigitalProductDelivery) = apply {
            files = digitalProductDelivery.files.map { it.toMutableList() }
            externalUrl = digitalProductDelivery.externalUrl
            instructions = digitalProductDelivery.instructions
            additionalProperties = digitalProductDelivery.additionalProperties.toMutableMap()
        }

        /** One entry per attached file. */
        fun files(files: List<DigitalProductDeliveryFile>) = files(JsonField.of(files))

        /**
         * Sets [Builder.files] to an arbitrary JSON value.
         *
         * You should usually call [Builder.files] with a well-typed
         * `List<DigitalProductDeliveryFile>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun files(files: JsonField<List<DigitalProductDeliveryFile>>) = apply {
            this.files = files.map { it.toMutableList() }
        }

        /**
         * Adds a single [DigitalProductDeliveryFile] to [files].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFile(file: DigitalProductDeliveryFile) = apply {
            files =
                (files ?: JsonField.of(mutableListOf())).also { checkKnown("files", it).add(file) }
        }

        /** Optional external URL, passed through from the entitlement configuration. */
        fun externalUrl(externalUrl: String?) = externalUrl(JsonField.ofNullable(externalUrl))

        /**
         * Sets [Builder.externalUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun externalUrl(externalUrl: JsonField<String>) = apply { this.externalUrl = externalUrl }

        /**
         * Optional human-readable delivery instructions, passed through from the entitlement
         * configuration.
         */
        fun instructions(instructions: String?) = instructions(JsonField.ofNullable(instructions))

        /**
         * Sets [Builder.instructions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instructions] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun instructions(instructions: JsonField<String>) = apply {
            this.instructions = instructions
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
         * Returns an immutable instance of [DigitalProductDelivery].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .files()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DigitalProductDelivery =
            DigitalProductDelivery(
                checkRequired("files", files).map { it.toImmutable() },
                externalUrl,
                instructions,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DigitalProductDelivery = apply {
        if (validated) {
            return@apply
        }

        files().forEach { it.validate() }
        externalUrl()
        instructions()
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
        (files.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (externalUrl.asKnown() == null) 0 else 1) +
            (if (instructions.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DigitalProductDelivery &&
            files == other.files &&
            externalUrl == other.externalUrl &&
            instructions == other.instructions &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(files, externalUrl, instructions, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DigitalProductDelivery{files=$files, externalUrl=$externalUrl, instructions=$instructions, additionalProperties=$additionalProperties}"
}
