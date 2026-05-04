// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

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

/** One file in a digital-product delivery payload. */
class DigitalProductDeliveryFile
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val downloadUrl: JsonField<String>,
    private val expiresIn: JsonField<Long>,
    private val fileId: JsonField<String>,
    private val filename: JsonField<String>,
    private val contentType: JsonField<String>,
    private val fileSize: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("download_url")
        @ExcludeMissing
        downloadUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expires_in") @ExcludeMissing expiresIn: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("file_id") @ExcludeMissing fileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("filename") @ExcludeMissing filename: JsonField<String> = JsonMissing.of(),
        @JsonProperty("content_type")
        @ExcludeMissing
        contentType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("file_size") @ExcludeMissing fileSize: JsonField<Long> = JsonMissing.of(),
    ) : this(downloadUrl, expiresIn, fileId, filename, contentType, fileSize, mutableMapOf())

    /**
     * Short-lived presigned URL for downloading the file.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun downloadUrl(): String = downloadUrl.getRequired("download_url")

    /**
     * Seconds until `download_url` expires.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expiresIn(): Long = expiresIn.getRequired("expires_in")

    /**
     * Identifier of the attached file.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fileId(): String = fileId.getRequired("file_id")

    /**
     * Original filename of the attached file.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filename(): String = filename.getRequired("filename")

    /**
     * Optional content-type declared at upload.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun contentType(): String? = contentType.getNullable("content_type")

    /**
     * Optional size of the file in bytes.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun fileSize(): Long? = fileSize.getNullable("file_size")

    /**
     * Returns the raw JSON value of [downloadUrl].
     *
     * Unlike [downloadUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("download_url")
    @ExcludeMissing
    fun _downloadUrl(): JsonField<String> = downloadUrl

    /**
     * Returns the raw JSON value of [expiresIn].
     *
     * Unlike [expiresIn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_in") @ExcludeMissing fun _expiresIn(): JsonField<Long> = expiresIn

    /**
     * Returns the raw JSON value of [fileId].
     *
     * Unlike [fileId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("file_id") @ExcludeMissing fun _fileId(): JsonField<String> = fileId

    /**
     * Returns the raw JSON value of [filename].
     *
     * Unlike [filename], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filename") @ExcludeMissing fun _filename(): JsonField<String> = filename

    /**
     * Returns the raw JSON value of [contentType].
     *
     * Unlike [contentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content_type")
    @ExcludeMissing
    fun _contentType(): JsonField<String> = contentType

    /**
     * Returns the raw JSON value of [fileSize].
     *
     * Unlike [fileSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("file_size") @ExcludeMissing fun _fileSize(): JsonField<Long> = fileSize

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
         * Returns a mutable builder for constructing an instance of [DigitalProductDeliveryFile].
         *
         * The following fields are required:
         * ```kotlin
         * .downloadUrl()
         * .expiresIn()
         * .fileId()
         * .filename()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [DigitalProductDeliveryFile]. */
    class Builder internal constructor() {

        private var downloadUrl: JsonField<String>? = null
        private var expiresIn: JsonField<Long>? = null
        private var fileId: JsonField<String>? = null
        private var filename: JsonField<String>? = null
        private var contentType: JsonField<String> = JsonMissing.of()
        private var fileSize: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(digitalProductDeliveryFile: DigitalProductDeliveryFile) = apply {
            downloadUrl = digitalProductDeliveryFile.downloadUrl
            expiresIn = digitalProductDeliveryFile.expiresIn
            fileId = digitalProductDeliveryFile.fileId
            filename = digitalProductDeliveryFile.filename
            contentType = digitalProductDeliveryFile.contentType
            fileSize = digitalProductDeliveryFile.fileSize
            additionalProperties = digitalProductDeliveryFile.additionalProperties.toMutableMap()
        }

        /** Short-lived presigned URL for downloading the file. */
        fun downloadUrl(downloadUrl: String) = downloadUrl(JsonField.of(downloadUrl))

        /**
         * Sets [Builder.downloadUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.downloadUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun downloadUrl(downloadUrl: JsonField<String>) = apply { this.downloadUrl = downloadUrl }

        /** Seconds until `download_url` expires. */
        fun expiresIn(expiresIn: Long) = expiresIn(JsonField.of(expiresIn))

        /**
         * Sets [Builder.expiresIn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresIn] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun expiresIn(expiresIn: JsonField<Long>) = apply { this.expiresIn = expiresIn }

        /** Identifier of the attached file. */
        fun fileId(fileId: String) = fileId(JsonField.of(fileId))

        /**
         * Sets [Builder.fileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

        /** Original filename of the attached file. */
        fun filename(filename: String) = filename(JsonField.of(filename))

        /**
         * Sets [Builder.filename] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filename] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filename(filename: JsonField<String>) = apply { this.filename = filename }

        /** Optional content-type declared at upload. */
        fun contentType(contentType: String?) = contentType(JsonField.ofNullable(contentType))

        /**
         * Sets [Builder.contentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contentType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contentType(contentType: JsonField<String>) = apply { this.contentType = contentType }

        /** Optional size of the file in bytes. */
        fun fileSize(fileSize: Long?) = fileSize(JsonField.ofNullable(fileSize))

        /**
         * Alias for [Builder.fileSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun fileSize(fileSize: Long) = fileSize(fileSize as Long?)

        /**
         * Sets [Builder.fileSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileSize] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileSize(fileSize: JsonField<Long>) = apply { this.fileSize = fileSize }

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
         * Returns an immutable instance of [DigitalProductDeliveryFile].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .downloadUrl()
         * .expiresIn()
         * .fileId()
         * .filename()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DigitalProductDeliveryFile =
            DigitalProductDeliveryFile(
                checkRequired("downloadUrl", downloadUrl),
                checkRequired("expiresIn", expiresIn),
                checkRequired("fileId", fileId),
                checkRequired("filename", filename),
                contentType,
                fileSize,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DigitalProductDeliveryFile = apply {
        if (validated) {
            return@apply
        }

        downloadUrl()
        expiresIn()
        fileId()
        filename()
        contentType()
        fileSize()
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
        (if (downloadUrl.asKnown() == null) 0 else 1) +
            (if (expiresIn.asKnown() == null) 0 else 1) +
            (if (fileId.asKnown() == null) 0 else 1) +
            (if (filename.asKnown() == null) 0 else 1) +
            (if (contentType.asKnown() == null) 0 else 1) +
            (if (fileSize.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DigitalProductDeliveryFile &&
            downloadUrl == other.downloadUrl &&
            expiresIn == other.expiresIn &&
            fileId == other.fileId &&
            filename == other.filename &&
            contentType == other.contentType &&
            fileSize == other.fileSize &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            downloadUrl,
            expiresIn,
            fileId,
            filename,
            contentType,
            fileSize,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DigitalProductDeliveryFile{downloadUrl=$downloadUrl, expiresIn=$expiresIn, fileId=$fileId, filename=$filename, contentType=$contentType, fileSize=$fileSize, additionalProperties=$additionalProperties}"
}
