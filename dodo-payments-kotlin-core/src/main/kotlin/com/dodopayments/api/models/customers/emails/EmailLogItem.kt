// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers.emails

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

class EmailLogItem
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val category: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val emailLogId: JsonField<String>,
    private val emailType: JsonField<String>,
    private val hasPreview: JsonField<Boolean>,
    private val policies: JsonField<EmailPolicies>,
    private val status: JsonField<EmailLogStatus>,
    private val failureCode: JsonField<EmailFailureCode>,
    private val failureReason: JsonField<String>,
    private val from: JsonField<String>,
    private val intendedRecipient: JsonField<String>,
    private val recipient: JsonField<String>,
    private val subject: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("category") @ExcludeMissing category: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("email_log_id")
        @ExcludeMissing
        emailLogId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email_type") @ExcludeMissing emailType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("has_preview")
        @ExcludeMissing
        hasPreview: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("policies")
        @ExcludeMissing
        policies: JsonField<EmailPolicies> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<EmailLogStatus> = JsonMissing.of(),
        @JsonProperty("failure_code")
        @ExcludeMissing
        failureCode: JsonField<EmailFailureCode> = JsonMissing.of(),
        @JsonProperty("failure_reason")
        @ExcludeMissing
        failureReason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("from") @ExcludeMissing from: JsonField<String> = JsonMissing.of(),
        @JsonProperty("intended_recipient")
        @ExcludeMissing
        intendedRecipient: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recipient") @ExcludeMissing recipient: JsonField<String> = JsonMissing.of(),
        @JsonProperty("subject") @ExcludeMissing subject: JsonField<String> = JsonMissing.of(),
    ) : this(
        category,
        createdAt,
        emailLogId,
        emailType,
        hasPreview,
        policies,
        status,
        failureCode,
        failureReason,
        from,
        intendedRecipient,
        recipient,
        subject,
        mutableMapOf(),
    )

    /**
     * The group this email belongs to: payments, refunds, subscriptions, dunning_recovery,
     * entitlements or auth.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun category(): String = category.getRequired("category")

    /**
     * When this email was sent.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * Identifies this email. Use it to read the body or to send it again.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun emailLogId(): String = emailLogId.getRequired("email_log_id")

    /**
     * What kind of email this is, for example `payment_successful`.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun emailType(): String = emailType.getRequired("email_type")

    /**
     * Whether this email has content to show. The content endpoint can still refuse, because the
     * content is removed after 180 days.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hasPreview(): Boolean = hasPreview.getRequired("has_preview")

    /**
     * What you may do with this email.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun policies(): EmailPolicies = policies.getRequired("policies")

    /**
     * Where the email got to: sent, delivered, failed, complained or blocked.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): EmailLogStatus = status.getRequired("status")

    /**
     * Why the email did not arrive. It is null unless the email failed.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun failureCode(): EmailFailureCode? = failureCode.getNullable("failure_code")

    /**
     * A sentence that explains `failure_code`. It is null unless the email failed.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun failureReason(): String? = failureReason.getNullable("failure_reason")

    /**
     * The address the email was sent from.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun from(): String? = from.getNullable("from")

    /**
     * What the merchant typed, when test mode redirected the send to the business owner.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun intendedRecipient(): String? = intendedRecipient.getNullable("intended_recipient")

    /**
     * The address the email reached.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun recipient(): String? = recipient.getNullable("recipient")

    /**
     * The subject line as it was sent. Empty until the provider replicates.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun subject(): String? = subject.getNullable("subject")

    /**
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<String> = category

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [emailLogId].
     *
     * Unlike [emailLogId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email_log_id") @ExcludeMissing fun _emailLogId(): JsonField<String> = emailLogId

    /**
     * Returns the raw JSON value of [emailType].
     *
     * Unlike [emailType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email_type") @ExcludeMissing fun _emailType(): JsonField<String> = emailType

    /**
     * Returns the raw JSON value of [hasPreview].
     *
     * Unlike [hasPreview], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("has_preview") @ExcludeMissing fun _hasPreview(): JsonField<Boolean> = hasPreview

    /**
     * Returns the raw JSON value of [policies].
     *
     * Unlike [policies], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("policies") @ExcludeMissing fun _policies(): JsonField<EmailPolicies> = policies

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<EmailLogStatus> = status

    /**
     * Returns the raw JSON value of [failureCode].
     *
     * Unlike [failureCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("failure_code")
    @ExcludeMissing
    fun _failureCode(): JsonField<EmailFailureCode> = failureCode

    /**
     * Returns the raw JSON value of [failureReason].
     *
     * Unlike [failureReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("failure_reason")
    @ExcludeMissing
    fun _failureReason(): JsonField<String> = failureReason

    /**
     * Returns the raw JSON value of [from].
     *
     * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<String> = from

    /**
     * Returns the raw JSON value of [intendedRecipient].
     *
     * Unlike [intendedRecipient], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("intended_recipient")
    @ExcludeMissing
    fun _intendedRecipient(): JsonField<String> = intendedRecipient

    /**
     * Returns the raw JSON value of [recipient].
     *
     * Unlike [recipient], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("recipient") @ExcludeMissing fun _recipient(): JsonField<String> = recipient

    /**
     * Returns the raw JSON value of [subject].
     *
     * Unlike [subject], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subject") @ExcludeMissing fun _subject(): JsonField<String> = subject

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
         * Returns a mutable builder for constructing an instance of [EmailLogItem].
         *
         * The following fields are required:
         * ```kotlin
         * .category()
         * .createdAt()
         * .emailLogId()
         * .emailType()
         * .hasPreview()
         * .policies()
         * .status()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [EmailLogItem]. */
    class Builder internal constructor() {

        private var category: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var emailLogId: JsonField<String>? = null
        private var emailType: JsonField<String>? = null
        private var hasPreview: JsonField<Boolean>? = null
        private var policies: JsonField<EmailPolicies>? = null
        private var status: JsonField<EmailLogStatus>? = null
        private var failureCode: JsonField<EmailFailureCode> = JsonMissing.of()
        private var failureReason: JsonField<String> = JsonMissing.of()
        private var from: JsonField<String> = JsonMissing.of()
        private var intendedRecipient: JsonField<String> = JsonMissing.of()
        private var recipient: JsonField<String> = JsonMissing.of()
        private var subject: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(emailLogItem: EmailLogItem) = apply {
            category = emailLogItem.category
            createdAt = emailLogItem.createdAt
            emailLogId = emailLogItem.emailLogId
            emailType = emailLogItem.emailType
            hasPreview = emailLogItem.hasPreview
            policies = emailLogItem.policies
            status = emailLogItem.status
            failureCode = emailLogItem.failureCode
            failureReason = emailLogItem.failureReason
            from = emailLogItem.from
            intendedRecipient = emailLogItem.intendedRecipient
            recipient = emailLogItem.recipient
            subject = emailLogItem.subject
            additionalProperties = emailLogItem.additionalProperties.toMutableMap()
        }

        /**
         * The group this email belongs to: payments, refunds, subscriptions, dunning_recovery,
         * entitlements or auth.
         */
        fun category(category: String) = category(JsonField.of(category))

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun category(category: JsonField<String>) = apply { this.category = category }

        /** When this email was sent. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Identifies this email. Use it to read the body or to send it again. */
        fun emailLogId(emailLogId: String) = emailLogId(JsonField.of(emailLogId))

        /**
         * Sets [Builder.emailLogId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emailLogId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun emailLogId(emailLogId: JsonField<String>) = apply { this.emailLogId = emailLogId }

        /** What kind of email this is, for example `payment_successful`. */
        fun emailType(emailType: String) = emailType(JsonField.of(emailType))

        /**
         * Sets [Builder.emailType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emailType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun emailType(emailType: JsonField<String>) = apply { this.emailType = emailType }

        /**
         * Whether this email has content to show. The content endpoint can still refuse, because
         * the content is removed after 180 days.
         */
        fun hasPreview(hasPreview: Boolean) = hasPreview(JsonField.of(hasPreview))

        /**
         * Sets [Builder.hasPreview] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasPreview] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hasPreview(hasPreview: JsonField<Boolean>) = apply { this.hasPreview = hasPreview }

        /** What you may do with this email. */
        fun policies(policies: EmailPolicies) = policies(JsonField.of(policies))

        /**
         * Sets [Builder.policies] to an arbitrary JSON value.
         *
         * You should usually call [Builder.policies] with a well-typed [EmailPolicies] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun policies(policies: JsonField<EmailPolicies>) = apply { this.policies = policies }

        /** Where the email got to: sent, delivered, failed, complained or blocked. */
        fun status(status: EmailLogStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [EmailLogStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<EmailLogStatus>) = apply { this.status = status }

        /** Why the email did not arrive. It is null unless the email failed. */
        fun failureCode(failureCode: EmailFailureCode?) =
            failureCode(JsonField.ofNullable(failureCode))

        /**
         * Sets [Builder.failureCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.failureCode] with a well-typed [EmailFailureCode] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun failureCode(failureCode: JsonField<EmailFailureCode>) = apply {
            this.failureCode = failureCode
        }

        /** A sentence that explains `failure_code`. It is null unless the email failed. */
        fun failureReason(failureReason: String?) =
            failureReason(JsonField.ofNullable(failureReason))

        /**
         * Sets [Builder.failureReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.failureReason] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun failureReason(failureReason: JsonField<String>) = apply {
            this.failureReason = failureReason
        }

        /** The address the email was sent from. */
        fun from(from: String?) = from(JsonField.ofNullable(from))

        /**
         * Sets [Builder.from] to an arbitrary JSON value.
         *
         * You should usually call [Builder.from] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun from(from: JsonField<String>) = apply { this.from = from }

        /** What the merchant typed, when test mode redirected the send to the business owner. */
        fun intendedRecipient(intendedRecipient: String?) =
            intendedRecipient(JsonField.ofNullable(intendedRecipient))

        /**
         * Sets [Builder.intendedRecipient] to an arbitrary JSON value.
         *
         * You should usually call [Builder.intendedRecipient] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun intendedRecipient(intendedRecipient: JsonField<String>) = apply {
            this.intendedRecipient = intendedRecipient
        }

        /** The address the email reached. */
        fun recipient(recipient: String?) = recipient(JsonField.ofNullable(recipient))

        /**
         * Sets [Builder.recipient] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipient] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recipient(recipient: JsonField<String>) = apply { this.recipient = recipient }

        /** The subject line as it was sent. Empty until the provider replicates. */
        fun subject(subject: String?) = subject(JsonField.ofNullable(subject))

        /**
         * Sets [Builder.subject] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subject] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun subject(subject: JsonField<String>) = apply { this.subject = subject }

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
         * Returns an immutable instance of [EmailLogItem].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .category()
         * .createdAt()
         * .emailLogId()
         * .emailType()
         * .hasPreview()
         * .policies()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EmailLogItem =
            EmailLogItem(
                checkRequired("category", category),
                checkRequired("createdAt", createdAt),
                checkRequired("emailLogId", emailLogId),
                checkRequired("emailType", emailType),
                checkRequired("hasPreview", hasPreview),
                checkRequired("policies", policies),
                checkRequired("status", status),
                failureCode,
                failureReason,
                from,
                intendedRecipient,
                recipient,
                subject,
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
    fun validate(): EmailLogItem = apply {
        if (validated) {
            return@apply
        }

        category()
        createdAt()
        emailLogId()
        emailType()
        hasPreview()
        policies().validate()
        status().validate()
        failureCode()?.validate()
        failureReason()
        from()
        intendedRecipient()
        recipient()
        subject()
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
        (if (category.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (emailLogId.asKnown() == null) 0 else 1) +
            (if (emailType.asKnown() == null) 0 else 1) +
            (if (hasPreview.asKnown() == null) 0 else 1) +
            (policies.asKnown()?.validity() ?: 0) +
            (status.asKnown()?.validity() ?: 0) +
            (failureCode.asKnown()?.validity() ?: 0) +
            (if (failureReason.asKnown() == null) 0 else 1) +
            (if (from.asKnown() == null) 0 else 1) +
            (if (intendedRecipient.asKnown() == null) 0 else 1) +
            (if (recipient.asKnown() == null) 0 else 1) +
            (if (subject.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailLogItem &&
            category == other.category &&
            createdAt == other.createdAt &&
            emailLogId == other.emailLogId &&
            emailType == other.emailType &&
            hasPreview == other.hasPreview &&
            policies == other.policies &&
            status == other.status &&
            failureCode == other.failureCode &&
            failureReason == other.failureReason &&
            from == other.from &&
            intendedRecipient == other.intendedRecipient &&
            recipient == other.recipient &&
            subject == other.subject &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            category,
            createdAt,
            emailLogId,
            emailType,
            hasPreview,
            policies,
            status,
            failureCode,
            failureReason,
            from,
            intendedRecipient,
            recipient,
            subject,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmailLogItem{category=$category, createdAt=$createdAt, emailLogId=$emailLogId, emailType=$emailType, hasPreview=$hasPreview, policies=$policies, status=$status, failureCode=$failureCode, failureReason=$failureReason, from=$from, intendedRecipient=$intendedRecipient, recipient=$recipient, subject=$subject, additionalProperties=$additionalProperties}"
}
