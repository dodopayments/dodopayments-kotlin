// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.brands

import com.dodopayments.api.core.Enum
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

class BrandUpdateResponse
private constructor(
    private val brandId: JsonField<String>,
    private val businessId: JsonField<String>,
    private val enabled: JsonField<Boolean>,
    private val statementDescriptor: JsonField<String>,
    private val verificationEnabled: JsonField<Boolean>,
    private val verificationStatus: JsonField<VerificationStatus>,
    private val description: JsonField<String>,
    private val image: JsonField<String>,
    private val name: JsonField<String>,
    private val reasonForHold: JsonField<String>,
    private val supportEmail: JsonField<String>,
    private val url: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("brand_id") @ExcludeMissing brandId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("business_id")
        @ExcludeMissing
        businessId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("enabled") @ExcludeMissing enabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("statement_descriptor")
        @ExcludeMissing
        statementDescriptor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("verification_enabled")
        @ExcludeMissing
        verificationEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("verification_status")
        @ExcludeMissing
        verificationStatus: JsonField<VerificationStatus> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("image") @ExcludeMissing image: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reason_for_hold")
        @ExcludeMissing
        reasonForHold: JsonField<String> = JsonMissing.of(),
        @JsonProperty("support_email")
        @ExcludeMissing
        supportEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
    ) : this(
        brandId,
        businessId,
        enabled,
        statementDescriptor,
        verificationEnabled,
        verificationStatus,
        description,
        image,
        name,
        reasonForHold,
        supportEmail,
        url,
        mutableMapOf(),
    )

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun brandId(): String = brandId.getRequired("brand_id")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessId(): String = businessId.getRequired("business_id")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun enabled(): Boolean = enabled.getRequired("enabled")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun statementDescriptor(): String = statementDescriptor.getRequired("statement_descriptor")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun verificationEnabled(): Boolean = verificationEnabled.getRequired("verification_enabled")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun verificationStatus(): VerificationStatus =
        verificationStatus.getRequired("verification_status")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): String? = description.getNullable("description")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun image(): String? = image.getNullable("image")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): String? = name.getNullable("name")

    /**
     * Incase the brand verification fails or is put on hold
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun reasonForHold(): String? = reasonForHold.getNullable("reason_for_hold")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun supportEmail(): String? = supportEmail.getNullable("support_email")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun url(): String? = url.getNullable("url")

    /**
     * Returns the raw JSON value of [brandId].
     *
     * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("brand_id") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

    /**
     * Returns the raw JSON value of [businessId].
     *
     * Unlike [businessId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("business_id") @ExcludeMissing fun _businessId(): JsonField<String> = businessId

    /**
     * Returns the raw JSON value of [enabled].
     *
     * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

    /**
     * Returns the raw JSON value of [statementDescriptor].
     *
     * Unlike [statementDescriptor], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("statement_descriptor")
    @ExcludeMissing
    fun _statementDescriptor(): JsonField<String> = statementDescriptor

    /**
     * Returns the raw JSON value of [verificationEnabled].
     *
     * Unlike [verificationEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("verification_enabled")
    @ExcludeMissing
    fun _verificationEnabled(): JsonField<Boolean> = verificationEnabled

    /**
     * Returns the raw JSON value of [verificationStatus].
     *
     * Unlike [verificationStatus], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("verification_status")
    @ExcludeMissing
    fun _verificationStatus(): JsonField<VerificationStatus> = verificationStatus

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [image].
     *
     * Unlike [image], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("image") @ExcludeMissing fun _image(): JsonField<String> = image

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [reasonForHold].
     *
     * Unlike [reasonForHold], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reason_for_hold")
    @ExcludeMissing
    fun _reasonForHold(): JsonField<String> = reasonForHold

    /**
     * Returns the raw JSON value of [supportEmail].
     *
     * Unlike [supportEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("support_email")
    @ExcludeMissing
    fun _supportEmail(): JsonField<String> = supportEmail

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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
         * Returns a mutable builder for constructing an instance of [BrandUpdateResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .brandId()
         * .businessId()
         * .enabled()
         * .statementDescriptor()
         * .verificationEnabled()
         * .verificationStatus()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BrandUpdateResponse]. */
    class Builder internal constructor() {

        private var brandId: JsonField<String>? = null
        private var businessId: JsonField<String>? = null
        private var enabled: JsonField<Boolean>? = null
        private var statementDescriptor: JsonField<String>? = null
        private var verificationEnabled: JsonField<Boolean>? = null
        private var verificationStatus: JsonField<VerificationStatus>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var image: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var reasonForHold: JsonField<String> = JsonMissing.of()
        private var supportEmail: JsonField<String> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(brandUpdateResponse: BrandUpdateResponse) = apply {
            brandId = brandUpdateResponse.brandId
            businessId = brandUpdateResponse.businessId
            enabled = brandUpdateResponse.enabled
            statementDescriptor = brandUpdateResponse.statementDescriptor
            verificationEnabled = brandUpdateResponse.verificationEnabled
            verificationStatus = brandUpdateResponse.verificationStatus
            description = brandUpdateResponse.description
            image = brandUpdateResponse.image
            name = brandUpdateResponse.name
            reasonForHold = brandUpdateResponse.reasonForHold
            supportEmail = brandUpdateResponse.supportEmail
            url = brandUpdateResponse.url
            additionalProperties = brandUpdateResponse.additionalProperties.toMutableMap()
        }

        fun brandId(brandId: String) = brandId(JsonField.of(brandId))

        /**
         * Sets [Builder.brandId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brandId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

        fun businessId(businessId: String) = businessId(JsonField.of(businessId))

        /**
         * Sets [Builder.businessId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun businessId(businessId: JsonField<String>) = apply { this.businessId = businessId }

        fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

        /**
         * Sets [Builder.enabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

        fun statementDescriptor(statementDescriptor: String) =
            statementDescriptor(JsonField.of(statementDescriptor))

        /**
         * Sets [Builder.statementDescriptor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statementDescriptor] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun statementDescriptor(statementDescriptor: JsonField<String>) = apply {
            this.statementDescriptor = statementDescriptor
        }

        fun verificationEnabled(verificationEnabled: Boolean) =
            verificationEnabled(JsonField.of(verificationEnabled))

        /**
         * Sets [Builder.verificationEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verificationEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun verificationEnabled(verificationEnabled: JsonField<Boolean>) = apply {
            this.verificationEnabled = verificationEnabled
        }

        fun verificationStatus(verificationStatus: VerificationStatus) =
            verificationStatus(JsonField.of(verificationStatus))

        /**
         * Sets [Builder.verificationStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verificationStatus] with a well-typed
         * [VerificationStatus] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun verificationStatus(verificationStatus: JsonField<VerificationStatus>) = apply {
            this.verificationStatus = verificationStatus
        }

        fun description(description: String?) = description(JsonField.ofNullable(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun image(image: String?) = image(JsonField.ofNullable(image))

        /**
         * Sets [Builder.image] to an arbitrary JSON value.
         *
         * You should usually call [Builder.image] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun image(image: JsonField<String>) = apply { this.image = image }

        fun name(name: String?) = name(JsonField.ofNullable(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Incase the brand verification fails or is put on hold */
        fun reasonForHold(reasonForHold: String?) =
            reasonForHold(JsonField.ofNullable(reasonForHold))

        /**
         * Sets [Builder.reasonForHold] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reasonForHold] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reasonForHold(reasonForHold: JsonField<String>) = apply {
            this.reasonForHold = reasonForHold
        }

        fun supportEmail(supportEmail: String?) = supportEmail(JsonField.ofNullable(supportEmail))

        /**
         * Sets [Builder.supportEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.supportEmail] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun supportEmail(supportEmail: JsonField<String>) = apply {
            this.supportEmail = supportEmail
        }

        fun url(url: String?) = url(JsonField.ofNullable(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

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
         * Returns an immutable instance of [BrandUpdateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .brandId()
         * .businessId()
         * .enabled()
         * .statementDescriptor()
         * .verificationEnabled()
         * .verificationStatus()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BrandUpdateResponse =
            BrandUpdateResponse(
                checkRequired("brandId", brandId),
                checkRequired("businessId", businessId),
                checkRequired("enabled", enabled),
                checkRequired("statementDescriptor", statementDescriptor),
                checkRequired("verificationEnabled", verificationEnabled),
                checkRequired("verificationStatus", verificationStatus),
                description,
                image,
                name,
                reasonForHold,
                supportEmail,
                url,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BrandUpdateResponse = apply {
        if (validated) {
            return@apply
        }

        brandId()
        businessId()
        enabled()
        statementDescriptor()
        verificationEnabled()
        verificationStatus().validate()
        description()
        image()
        name()
        reasonForHold()
        supportEmail()
        url()
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
        (if (brandId.asKnown() == null) 0 else 1) +
            (if (businessId.asKnown() == null) 0 else 1) +
            (if (enabled.asKnown() == null) 0 else 1) +
            (if (statementDescriptor.asKnown() == null) 0 else 1) +
            (if (verificationEnabled.asKnown() == null) 0 else 1) +
            (verificationStatus.asKnown()?.validity() ?: 0) +
            (if (description.asKnown() == null) 0 else 1) +
            (if (image.asKnown() == null) 0 else 1) +
            (if (name.asKnown() == null) 0 else 1) +
            (if (reasonForHold.asKnown() == null) 0 else 1) +
            (if (supportEmail.asKnown() == null) 0 else 1) +
            (if (url.asKnown() == null) 0 else 1)

    class VerificationStatus
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            val SUCCESS = of("Success")

            val FAIL = of("Fail")

            val REVIEW = of("Review")

            val HOLD = of("Hold")

            fun of(value: String) = VerificationStatus(JsonField.of(value))
        }

        /** An enum containing [VerificationStatus]'s known values. */
        enum class Known {
            SUCCESS,
            FAIL,
            REVIEW,
            HOLD,
        }

        /**
         * An enum containing [VerificationStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [VerificationStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SUCCESS,
            FAIL,
            REVIEW,
            HOLD,
            /**
             * An enum member indicating that [VerificationStatus] was instantiated with an unknown
             * value.
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
                SUCCESS -> Value.SUCCESS
                FAIL -> Value.FAIL
                REVIEW -> Value.REVIEW
                HOLD -> Value.HOLD
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
                SUCCESS -> Known.SUCCESS
                FAIL -> Known.FAIL
                REVIEW -> Known.REVIEW
                HOLD -> Known.HOLD
                else -> throw DodoPaymentsInvalidDataException("Unknown VerificationStatus: $value")
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

        fun validate(): VerificationStatus = apply {
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

            return /* spotless:off */ other is VerificationStatus && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BrandUpdateResponse && brandId == other.brandId && businessId == other.businessId && enabled == other.enabled && statementDescriptor == other.statementDescriptor && verificationEnabled == other.verificationEnabled && verificationStatus == other.verificationStatus && description == other.description && image == other.image && name == other.name && reasonForHold == other.reasonForHold && supportEmail == other.supportEmail && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(brandId, businessId, enabled, statementDescriptor, verificationEnabled, verificationStatus, description, image, name, reasonForHold, supportEmail, url, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BrandUpdateResponse{brandId=$brandId, businessId=$businessId, enabled=$enabled, statementDescriptor=$statementDescriptor, verificationEnabled=$verificationEnabled, verificationStatus=$verificationStatus, description=$description, image=$image, name=$name, reasonForHold=$reasonForHold, supportEmail=$supportEmail, url=$url, additionalProperties=$additionalProperties}"
}
