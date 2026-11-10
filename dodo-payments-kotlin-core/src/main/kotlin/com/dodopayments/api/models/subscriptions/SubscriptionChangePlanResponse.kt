// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * Handles for a hosted checkout page that settles a plan change.
 *
 * The four fields repeat `UpdatePaymentMethodResponse` and a subset of
 * `CreateSubscriptionResponse`. A shared type would rename the generated SDK types for all three
 * routes, so each route keeps its own.
 */
class SubscriptionChangePlanResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val clientSecret: JsonField<String>,
    private val expiresOn: JsonField<OffsetDateTime>,
    private val invoiceId: JsonField<String>,
    private val paymentId: JsonField<String>,
    private val paymentLink: JsonField<String>,
    private val refundId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("client_secret")
        @ExcludeMissing
        clientSecret: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expires_on")
        @ExcludeMissing
        expiresOn: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("invoice_id") @ExcludeMissing invoiceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payment_id") @ExcludeMissing paymentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payment_link")
        @ExcludeMissing
        paymentLink: JsonField<String> = JsonMissing.of(),
        @JsonProperty("refund_id") @ExcludeMissing refundId: JsonField<String> = JsonMissing.of(),
    ) : this(clientSecret, expiresOn, invoiceId, paymentId, paymentLink, refundId, mutableMapOf())

    /**
     * Client secret for an embedded checkout.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun clientSecret(): String? = clientSecret.getNullable("client_secret")

    /**
     * When the link stops working.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun expiresOn(): OffsetDateTime? = expiresOn.getNullable("expires_on")

    /**
     * The invoice that bills the plan change. Set only for an invoice-led subscription.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun invoiceId(): String? = invoiceId.getNullable("invoice_id")

    /**
     * Id of the payment that settles the plan change.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun paymentId(): String? = paymentId.getNullable("payment_id")

    /**
     * Checkout page URL. Give this to the customer.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun paymentLink(): String? = paymentLink.getNullable("payment_link")

    /**
     * The refund of a downgrade with `credit: refund`.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun refundId(): String? = refundId.getNullable("refund_id")

    /**
     * Returns the raw JSON value of [clientSecret].
     *
     * Unlike [clientSecret], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("client_secret")
    @ExcludeMissing
    fun _clientSecret(): JsonField<String> = clientSecret

    /**
     * Returns the raw JSON value of [expiresOn].
     *
     * Unlike [expiresOn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_on")
    @ExcludeMissing
    fun _expiresOn(): JsonField<OffsetDateTime> = expiresOn

    /**
     * Returns the raw JSON value of [invoiceId].
     *
     * Unlike [invoiceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId(): JsonField<String> = invoiceId

    /**
     * Returns the raw JSON value of [paymentId].
     *
     * Unlike [paymentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_id") @ExcludeMissing fun _paymentId(): JsonField<String> = paymentId

    /**
     * Returns the raw JSON value of [paymentLink].
     *
     * Unlike [paymentLink], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_link")
    @ExcludeMissing
    fun _paymentLink(): JsonField<String> = paymentLink

    /**
     * Returns the raw JSON value of [refundId].
     *
     * Unlike [refundId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("refund_id") @ExcludeMissing fun _refundId(): JsonField<String> = refundId

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
         * [SubscriptionChangePlanResponse].
         */
        fun builder() = Builder()
    }

    /** A builder for [SubscriptionChangePlanResponse]. */
    class Builder internal constructor() {

        private var clientSecret: JsonField<String> = JsonMissing.of()
        private var expiresOn: JsonField<OffsetDateTime> = JsonMissing.of()
        private var invoiceId: JsonField<String> = JsonMissing.of()
        private var paymentId: JsonField<String> = JsonMissing.of()
        private var paymentLink: JsonField<String> = JsonMissing.of()
        private var refundId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(subscriptionChangePlanResponse: SubscriptionChangePlanResponse) = apply {
            clientSecret = subscriptionChangePlanResponse.clientSecret
            expiresOn = subscriptionChangePlanResponse.expiresOn
            invoiceId = subscriptionChangePlanResponse.invoiceId
            paymentId = subscriptionChangePlanResponse.paymentId
            paymentLink = subscriptionChangePlanResponse.paymentLink
            refundId = subscriptionChangePlanResponse.refundId
            additionalProperties =
                subscriptionChangePlanResponse.additionalProperties.toMutableMap()
        }

        /** Client secret for an embedded checkout. */
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

        /** When the link stops working. */
        fun expiresOn(expiresOn: OffsetDateTime?) = expiresOn(JsonField.ofNullable(expiresOn))

        /**
         * Sets [Builder.expiresOn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresOn] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresOn(expiresOn: JsonField<OffsetDateTime>) = apply { this.expiresOn = expiresOn }

        /** The invoice that bills the plan change. Set only for an invoice-led subscription. */
        fun invoiceId(invoiceId: String?) = invoiceId(JsonField.ofNullable(invoiceId))

        /**
         * Sets [Builder.invoiceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

        /** Id of the payment that settles the plan change. */
        fun paymentId(paymentId: String?) = paymentId(JsonField.ofNullable(paymentId))

        /**
         * Sets [Builder.paymentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun paymentId(paymentId: JsonField<String>) = apply { this.paymentId = paymentId }

        /** Checkout page URL. Give this to the customer. */
        fun paymentLink(paymentLink: String?) = paymentLink(JsonField.ofNullable(paymentLink))

        /**
         * Sets [Builder.paymentLink] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentLink] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun paymentLink(paymentLink: JsonField<String>) = apply { this.paymentLink = paymentLink }

        /** The refund of a downgrade with `credit: refund`. */
        fun refundId(refundId: String?) = refundId(JsonField.ofNullable(refundId))

        /**
         * Sets [Builder.refundId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.refundId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun refundId(refundId: JsonField<String>) = apply { this.refundId = refundId }

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
         * Returns an immutable instance of [SubscriptionChangePlanResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SubscriptionChangePlanResponse =
            SubscriptionChangePlanResponse(
                clientSecret,
                expiresOn,
                invoiceId,
                paymentId,
                paymentLink,
                refundId,
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
    fun validate(): SubscriptionChangePlanResponse = apply {
        if (validated) {
            return@apply
        }

        clientSecret()
        expiresOn()
        invoiceId()
        paymentId()
        paymentLink()
        refundId()
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
        (if (clientSecret.asKnown() == null) 0 else 1) +
            (if (expiresOn.asKnown() == null) 0 else 1) +
            (if (invoiceId.asKnown() == null) 0 else 1) +
            (if (paymentId.asKnown() == null) 0 else 1) +
            (if (paymentLink.asKnown() == null) 0 else 1) +
            (if (refundId.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionChangePlanResponse &&
            clientSecret == other.clientSecret &&
            expiresOn == other.expiresOn &&
            invoiceId == other.invoiceId &&
            paymentId == other.paymentId &&
            paymentLink == other.paymentLink &&
            refundId == other.refundId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            clientSecret,
            expiresOn,
            invoiceId,
            paymentId,
            paymentLink,
            refundId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubscriptionChangePlanResponse{clientSecret=$clientSecret, expiresOn=$expiresOn, invoiceId=$invoiceId, paymentId=$paymentId, paymentLink=$paymentLink, refundId=$refundId, additionalProperties=$additionalProperties}"
}
