// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.checkoutsessions

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

class CheckoutSessionResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val sessionId: JsonField<String>,
    private val checkoutUrl: JsonField<String>,
    private val clientSecret: JsonField<String>,
    private val paymentId: JsonField<String>,
    private val publishableKey: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("session_id") @ExcludeMissing sessionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("checkout_url")
        @ExcludeMissing
        checkoutUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("client_secret")
        @ExcludeMissing
        clientSecret: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payment_id") @ExcludeMissing paymentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("publishable_key")
        @ExcludeMissing
        publishableKey: JsonField<String> = JsonMissing.of(),
    ) : this(sessionId, checkoutUrl, clientSecret, paymentId, publishableKey, mutableMapOf())

    /**
     * The ID of the created checkout session
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sessionId(): String = sessionId.getRequired("session_id")

    /**
     * Checkout url (None when payment_method_id is provided)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun checkoutUrl(): String? = checkoutUrl.getNullable("checkout_url")

    /**
     * Client secret used to load the Dodo Payments checkout SDK. Returned when `confirm: true` was
     * passed and a PaymentIntent was created at session-creation time. `None` otherwise.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun clientSecret(): String? = clientSecret.getNullable("client_secret")

    /**
     * Underlying payment id when `confirm: true` was passed and a PaymentIntent was created at
     * session-creation time. `None` otherwise.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun paymentId(): String? = paymentId.getNullable("payment_id")

    /**
     * Publishable key for the Dodo Payments checkout SDK. Returned when `confirm: true` was passed
     * and a PaymentIntent was created at session-creation time. `None` otherwise.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun publishableKey(): String? = publishableKey.getNullable("publishable_key")

    /**
     * Returns the raw JSON value of [sessionId].
     *
     * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("session_id") @ExcludeMissing fun _sessionId(): JsonField<String> = sessionId

    /**
     * Returns the raw JSON value of [checkoutUrl].
     *
     * Unlike [checkoutUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("checkout_url")
    @ExcludeMissing
    fun _checkoutUrl(): JsonField<String> = checkoutUrl

    /**
     * Returns the raw JSON value of [clientSecret].
     *
     * Unlike [clientSecret], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("client_secret")
    @ExcludeMissing
    fun _clientSecret(): JsonField<String> = clientSecret

    /**
     * Returns the raw JSON value of [paymentId].
     *
     * Unlike [paymentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_id") @ExcludeMissing fun _paymentId(): JsonField<String> = paymentId

    /**
     * Returns the raw JSON value of [publishableKey].
     *
     * Unlike [publishableKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("publishable_key")
    @ExcludeMissing
    fun _publishableKey(): JsonField<String> = publishableKey

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
         * Returns a mutable builder for constructing an instance of [CheckoutSessionResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .sessionId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CheckoutSessionResponse]. */
    class Builder internal constructor() {

        private var sessionId: JsonField<String>? = null
        private var checkoutUrl: JsonField<String> = JsonMissing.of()
        private var clientSecret: JsonField<String> = JsonMissing.of()
        private var paymentId: JsonField<String> = JsonMissing.of()
        private var publishableKey: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(checkoutSessionResponse: CheckoutSessionResponse) = apply {
            sessionId = checkoutSessionResponse.sessionId
            checkoutUrl = checkoutSessionResponse.checkoutUrl
            clientSecret = checkoutSessionResponse.clientSecret
            paymentId = checkoutSessionResponse.paymentId
            publishableKey = checkoutSessionResponse.publishableKey
            additionalProperties = checkoutSessionResponse.additionalProperties.toMutableMap()
        }

        /** The ID of the created checkout session */
        fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

        /**
         * Sets [Builder.sessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

        /** Checkout url (None when payment_method_id is provided) */
        fun checkoutUrl(checkoutUrl: String?) = checkoutUrl(JsonField.ofNullable(checkoutUrl))

        /**
         * Sets [Builder.checkoutUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.checkoutUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun checkoutUrl(checkoutUrl: JsonField<String>) = apply { this.checkoutUrl = checkoutUrl }

        /**
         * Client secret used to load the Dodo Payments checkout SDK. Returned when `confirm: true`
         * was passed and a PaymentIntent was created at session-creation time. `None` otherwise.
         */
        fun clientSecret(clientSecret: String?) = clientSecret(JsonField.ofNullable(clientSecret))

        /**
         * Sets [Builder.clientSecret] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientSecret] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clientSecret(clientSecret: JsonField<String>) = apply {
            this.clientSecret = clientSecret
        }

        /**
         * Underlying payment id when `confirm: true` was passed and a PaymentIntent was created at
         * session-creation time. `None` otherwise.
         */
        fun paymentId(paymentId: String?) = paymentId(JsonField.ofNullable(paymentId))

        /**
         * Sets [Builder.paymentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun paymentId(paymentId: JsonField<String>) = apply { this.paymentId = paymentId }

        /**
         * Publishable key for the Dodo Payments checkout SDK. Returned when `confirm: true` was
         * passed and a PaymentIntent was created at session-creation time. `None` otherwise.
         */
        fun publishableKey(publishableKey: String?) =
            publishableKey(JsonField.ofNullable(publishableKey))

        /**
         * Sets [Builder.publishableKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.publishableKey] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun publishableKey(publishableKey: JsonField<String>) = apply {
            this.publishableKey = publishableKey
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
         * Returns an immutable instance of [CheckoutSessionResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .sessionId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CheckoutSessionResponse =
            CheckoutSessionResponse(
                checkRequired("sessionId", sessionId),
                checkoutUrl,
                clientSecret,
                paymentId,
                publishableKey,
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
    fun validate(): CheckoutSessionResponse = apply {
        if (validated) {
            return@apply
        }

        sessionId()
        checkoutUrl()
        clientSecret()
        paymentId()
        publishableKey()
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
        (if (sessionId.asKnown() == null) 0 else 1) +
            (if (checkoutUrl.asKnown() == null) 0 else 1) +
            (if (clientSecret.asKnown() == null) 0 else 1) +
            (if (paymentId.asKnown() == null) 0 else 1) +
            (if (publishableKey.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CheckoutSessionResponse &&
            sessionId == other.sessionId &&
            checkoutUrl == other.checkoutUrl &&
            clientSecret == other.clientSecret &&
            paymentId == other.paymentId &&
            publishableKey == other.publishableKey &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            sessionId,
            checkoutUrl,
            clientSecret,
            paymentId,
            publishableKey,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CheckoutSessionResponse{sessionId=$sessionId, checkoutUrl=$checkoutUrl, clientSecret=$clientSecret, paymentId=$paymentId, publishableKey=$publishableKey, additionalProperties=$additionalProperties}"
}
