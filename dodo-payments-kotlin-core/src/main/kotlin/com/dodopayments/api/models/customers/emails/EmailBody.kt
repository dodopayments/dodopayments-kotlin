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
import java.util.Collections
import java.util.Objects

class EmailBody
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val merchantAuthored: JsonField<Boolean>,
    private val failureCode: JsonField<EmailFailureCode>,
    private val failureReason: JsonField<String>,
    private val html: JsonField<String>,
    private val text: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("merchant_authored")
        @ExcludeMissing
        merchantAuthored: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("failure_code")
        @ExcludeMissing
        failureCode: JsonField<EmailFailureCode> = JsonMissing.of(),
        @JsonProperty("failure_reason")
        @ExcludeMissing
        failureReason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("html") @ExcludeMissing html: JsonField<String> = JsonMissing.of(),
        @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
    ) : this(merchantAuthored, failureCode, failureReason, html, text, mutableMapOf())

    /**
     * Whether the merchant wrote this content. It is true for the recovery and dunning emails,
     * which the merchant writes.
     *
     * The content is email HTML. Render it in a sandbox, whatever this value is.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun merchantAuthored(): Boolean = merchantAuthored.getRequired("merchant_authored")

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
     * The stored HTML. It is null on a text-only email.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun html(): String? = html.getNullable("html")

    /**
     * The stored plain text.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun text(): String? = text.getNullable("text")

    /**
     * Returns the raw JSON value of [merchantAuthored].
     *
     * Unlike [merchantAuthored], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("merchant_authored")
    @ExcludeMissing
    fun _merchantAuthored(): JsonField<Boolean> = merchantAuthored

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
     * Returns the raw JSON value of [html].
     *
     * Unlike [html], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("html") @ExcludeMissing fun _html(): JsonField<String> = html

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

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
         * Returns a mutable builder for constructing an instance of [EmailBody].
         *
         * The following fields are required:
         * ```kotlin
         * .merchantAuthored()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [EmailBody]. */
    class Builder internal constructor() {

        private var merchantAuthored: JsonField<Boolean>? = null
        private var failureCode: JsonField<EmailFailureCode> = JsonMissing.of()
        private var failureReason: JsonField<String> = JsonMissing.of()
        private var html: JsonField<String> = JsonMissing.of()
        private var text: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(emailBody: EmailBody) = apply {
            merchantAuthored = emailBody.merchantAuthored
            failureCode = emailBody.failureCode
            failureReason = emailBody.failureReason
            html = emailBody.html
            text = emailBody.text
            additionalProperties = emailBody.additionalProperties.toMutableMap()
        }

        /**
         * Whether the merchant wrote this content. It is true for the recovery and dunning emails,
         * which the merchant writes.
         *
         * The content is email HTML. Render it in a sandbox, whatever this value is.
         */
        fun merchantAuthored(merchantAuthored: Boolean) =
            merchantAuthored(JsonField.of(merchantAuthored))

        /**
         * Sets [Builder.merchantAuthored] to an arbitrary JSON value.
         *
         * You should usually call [Builder.merchantAuthored] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun merchantAuthored(merchantAuthored: JsonField<Boolean>) = apply {
            this.merchantAuthored = merchantAuthored
        }

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

        /** The stored HTML. It is null on a text-only email. */
        fun html(html: String?) = html(JsonField.ofNullable(html))

        /**
         * Sets [Builder.html] to an arbitrary JSON value.
         *
         * You should usually call [Builder.html] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun html(html: JsonField<String>) = apply { this.html = html }

        /** The stored plain text. */
        fun text(text: String?) = text(JsonField.ofNullable(text))

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { this.text = text }

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
         * Returns an immutable instance of [EmailBody].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .merchantAuthored()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EmailBody =
            EmailBody(
                checkRequired("merchantAuthored", merchantAuthored),
                failureCode,
                failureReason,
                html,
                text,
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
    fun validate(): EmailBody = apply {
        if (validated) {
            return@apply
        }

        merchantAuthored()
        failureCode()?.validate()
        failureReason()
        html()
        text()
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
        (if (merchantAuthored.asKnown() == null) 0 else 1) +
            (failureCode.asKnown()?.validity() ?: 0) +
            (if (failureReason.asKnown() == null) 0 else 1) +
            (if (html.asKnown() == null) 0 else 1) +
            (if (text.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailBody &&
            merchantAuthored == other.merchantAuthored &&
            failureCode == other.failureCode &&
            failureReason == other.failureReason &&
            html == other.html &&
            text == other.text &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(merchantAuthored, failureCode, failureReason, html, text, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmailBody{merchantAuthored=$merchantAuthored, failureCode=$failureCode, failureReason=$failureReason, html=$html, text=$text, additionalProperties=$additionalProperties}"
}
