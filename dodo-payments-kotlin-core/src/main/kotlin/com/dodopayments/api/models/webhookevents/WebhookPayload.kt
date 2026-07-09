// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhookevents

import com.dodopayments.api.core.BaseDeserializer
import com.dodopayments.api.core.BaseSerializer
import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.getOrThrow
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.creditentitlements.balances.CreditLedgerEntry
import com.dodopayments.api.models.discounts.DiscountDetail
import com.dodopayments.api.models.disputes.Dispute
import com.dodopayments.api.models.disputes.DisputeStage
import com.dodopayments.api.models.disputes.DisputeStatus
import com.dodopayments.api.models.disputes.GetDispute
import com.dodopayments.api.models.entitlements.EntitlementIntegrationType
import com.dodopayments.api.models.entitlements.Feature
import com.dodopayments.api.models.entitlements.grants.EntitlementGrant
import com.dodopayments.api.models.entitlements.grants.LicenseKeyGrant
import com.dodopayments.api.models.licensekeys.LicenseKey
import com.dodopayments.api.models.licensekeys.LicenseKeyStatus
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.Metadata
import com.dodopayments.api.models.payments.BillingAddress
import com.dodopayments.api.models.payments.CustomFieldResponse
import com.dodopayments.api.models.payments.CustomerLimitedDetails
import com.dodopayments.api.models.payments.IntentStatus
import com.dodopayments.api.models.payments.Payment
import com.dodopayments.api.models.payments.PaymentRefundStatus
import com.dodopayments.api.models.payments.RefundListItem
import com.dodopayments.api.models.products.DigitalProductDelivery
import com.dodopayments.api.models.refunds.Refund
import com.dodopayments.api.models.refunds.RefundStatus
import com.dodopayments.api.models.subscriptions.AddonCartResponseItem
import com.dodopayments.api.models.subscriptions.CancellationFeedback
import com.dodopayments.api.models.subscriptions.CreditEntitlementCartResponse
import com.dodopayments.api.models.subscriptions.MeterCartResponseItem
import com.dodopayments.api.models.subscriptions.MeterCreditEntitlementCartResponse
import com.dodopayments.api.models.subscriptions.ScheduledPlanChange
import com.dodopayments.api.models.subscriptions.Subscription
import com.dodopayments.api.models.subscriptions.SubscriptionStatus
import com.dodopayments.api.models.subscriptions.TimeInterval
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class WebhookPayload
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val businessId: JsonField<String>,
    private val data: JsonField<Data>,
    private val timestamp: JsonField<OffsetDateTime>,
    private val type: JsonField<WebhookEventType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("business_id")
        @ExcludeMissing
        businessId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
        @JsonProperty("timestamp")
        @ExcludeMissing
        timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<WebhookEventType> = JsonMissing.of(),
    ) : this(businessId, data, timestamp, type, mutableMapOf())

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessId(): String = businessId.getRequired("business_id")

    /**
     * The latest data at the time of delivery attempt
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

    /**
     * The timestamp of when the event occurred (not necessarily the same of when it was delivered)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

    /**
     * Event types for Dodo events
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): WebhookEventType = type.getRequired("type")

    /**
     * Returns the raw JSON value of [businessId].
     *
     * Unlike [businessId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("business_id") @ExcludeMissing fun _businessId(): JsonField<String> = businessId

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    /**
     * Returns the raw JSON value of [timestamp].
     *
     * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timestamp")
    @ExcludeMissing
    fun _timestamp(): JsonField<OffsetDateTime> = timestamp

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<WebhookEventType> = type

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
         * Returns a mutable builder for constructing an instance of [WebhookPayload].
         *
         * The following fields are required:
         * ```kotlin
         * .businessId()
         * .data()
         * .timestamp()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [WebhookPayload]. */
    class Builder internal constructor() {

        private var businessId: JsonField<String>? = null
        private var data: JsonField<Data>? = null
        private var timestamp: JsonField<OffsetDateTime>? = null
        private var type: JsonField<WebhookEventType>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(webhookPayload: WebhookPayload) = apply {
            businessId = webhookPayload.businessId
            data = webhookPayload.data
            timestamp = webhookPayload.timestamp
            type = webhookPayload.type
            additionalProperties = webhookPayload.additionalProperties.toMutableMap()
        }

        fun businessId(businessId: String) = businessId(JsonField.of(businessId))

        /**
         * Sets [Builder.businessId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun businessId(businessId: JsonField<String>) = apply { this.businessId = businessId }

        /** The latest data at the time of delivery attempt */
        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        /** Alias for calling [data] with `Data.ofPayment(payment)`. */
        fun data(payment: Data.Payment) = data(Data.ofPayment(payment))

        /** Alias for calling [data] with `Data.ofSubscription(subscription)`. */
        fun data(subscription: Data.Subscription) = data(Data.ofSubscription(subscription))

        /** Alias for calling [data] with `Data.ofRefund(refund)`. */
        fun data(refund: Data.Refund) = data(Data.ofRefund(refund))

        /** Alias for calling [data] with `Data.ofDispute(dispute)`. */
        fun data(dispute: Data.Dispute) = data(Data.ofDispute(dispute))

        /** Alias for calling [data] with `Data.ofLicenseKey(licenseKey)`. */
        fun data(licenseKey: Data.LicenseKey) = data(Data.ofLicenseKey(licenseKey))

        /** Alias for calling [data] with `Data.ofCreditLedgerEntry(creditLedgerEntry)`. */
        fun data(creditLedgerEntry: Data.CreditLedgerEntry) =
            data(Data.ofCreditLedgerEntry(creditLedgerEntry))

        /** Alias for calling [data] with `Data.ofCreditBalanceLow(creditBalanceLow)`. */
        fun data(creditBalanceLow: Data.CreditBalanceLow) =
            data(Data.ofCreditBalanceLow(creditBalanceLow))

        /** Alias for calling [data] with `Data.ofAbandonedCheckout(abandonedCheckout)`. */
        fun data(abandonedCheckout: Data.AbandonedCheckout) =
            data(Data.ofAbandonedCheckout(abandonedCheckout))

        /** Alias for calling [data] with `Data.ofDunningAttempt(dunningAttempt)`. */
        fun data(dunningAttempt: Data.DunningAttempt) = data(Data.ofDunningAttempt(dunningAttempt))

        /** Alias for calling [data] with `Data.ofEntitlementGrant(entitlementGrant)`. */
        fun data(entitlementGrant: Data.EntitlementGrant) =
            data(Data.ofEntitlementGrant(entitlementGrant))

        /**
         * The timestamp of when the event occurred (not necessarily the same of when it was
         * delivered)
         */
        fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

        /**
         * Sets [Builder.timestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply { this.timestamp = timestamp }

        /** Event types for Dodo events */
        fun type(type: WebhookEventType) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [WebhookEventType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun type(type: JsonField<WebhookEventType>) = apply { this.type = type }

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
         * Returns an immutable instance of [WebhookPayload].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .businessId()
         * .data()
         * .timestamp()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WebhookPayload =
            WebhookPayload(
                checkRequired("businessId", businessId),
                checkRequired("data", data),
                checkRequired("timestamp", timestamp),
                checkRequired("type", type),
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
    fun validate(): WebhookPayload = apply {
        if (validated) {
            return@apply
        }

        businessId()
        data().validate()
        timestamp()
        type().validate()
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
        (if (businessId.asKnown() == null) 0 else 1) +
            (data.asKnown()?.validity() ?: 0) +
            (if (timestamp.asKnown() == null) 0 else 1) +
            (type.asKnown()?.validity() ?: 0)

    /** The latest data at the time of delivery attempt */
    @JsonDeserialize(using = Data.Deserializer::class)
    @JsonSerialize(using = Data.Serializer::class)
    class Data
    private constructor(
        private val payment: Payment? = null,
        private val subscription: Subscription? = null,
        private val refund: Refund? = null,
        private val dispute: Dispute? = null,
        private val licenseKey: LicenseKey? = null,
        private val creditLedgerEntry: CreditLedgerEntry? = null,
        private val creditBalanceLow: CreditBalanceLow? = null,
        private val abandonedCheckout: AbandonedCheckout? = null,
        private val dunningAttempt: DunningAttempt? = null,
        private val entitlementGrant: EntitlementGrant? = null,
        private val _json: JsonValue? = null,
    ) {

        fun payment(): Payment? = payment

        /** Response struct representing subscription details */
        fun subscription(): Subscription? = subscription

        fun refund(): Refund? = refund

        fun dispute(): Dispute? = dispute

        fun licenseKey(): LicenseKey? = licenseKey

        /** Response for a ledger entry */
        fun creditLedgerEntry(): CreditLedgerEntry? = creditLedgerEntry

        fun creditBalanceLow(): CreditBalanceLow? = creditBalanceLow

        fun abandonedCheckout(): AbandonedCheckout? = abandonedCheckout

        fun dunningAttempt(): DunningAttempt? = dunningAttempt

        /**
         * Detailed view of a single entitlement grant: who it's for, its lifecycle state, and any
         * integration-specific delivery payload.
         */
        fun entitlementGrant(): EntitlementGrant? = entitlementGrant

        fun isPayment(): Boolean = payment != null

        fun isSubscription(): Boolean = subscription != null

        fun isRefund(): Boolean = refund != null

        fun isDispute(): Boolean = dispute != null

        fun isLicenseKey(): Boolean = licenseKey != null

        fun isCreditLedgerEntry(): Boolean = creditLedgerEntry != null

        fun isCreditBalanceLow(): Boolean = creditBalanceLow != null

        fun isAbandonedCheckout(): Boolean = abandonedCheckout != null

        fun isDunningAttempt(): Boolean = dunningAttempt != null

        fun isEntitlementGrant(): Boolean = entitlementGrant != null

        fun asPayment(): Payment = payment.getOrThrow("payment")

        /** Response struct representing subscription details */
        fun asSubscription(): Subscription = subscription.getOrThrow("subscription")

        fun asRefund(): Refund = refund.getOrThrow("refund")

        fun asDispute(): Dispute = dispute.getOrThrow("dispute")

        fun asLicenseKey(): LicenseKey = licenseKey.getOrThrow("licenseKey")

        /** Response for a ledger entry */
        fun asCreditLedgerEntry(): CreditLedgerEntry =
            creditLedgerEntry.getOrThrow("creditLedgerEntry")

        fun asCreditBalanceLow(): CreditBalanceLow = creditBalanceLow.getOrThrow("creditBalanceLow")

        fun asAbandonedCheckout(): AbandonedCheckout =
            abandonedCheckout.getOrThrow("abandonedCheckout")

        fun asDunningAttempt(): DunningAttempt = dunningAttempt.getOrThrow("dunningAttempt")

        /**
         * Detailed view of a single entitlement grant: who it's for, its lifecycle state, and any
         * integration-specific delivery payload.
         */
        fun asEntitlementGrant(): EntitlementGrant = entitlementGrant.getOrThrow("entitlementGrant")

        fun _json(): JsonValue? = _json

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```kotlin
         * import com.dodopayments.api.core.JsonValue
         *
         * val result: String? = data.accept(object : Data.Visitor<String?> {
         *     override fun visitPayment(payment: Payment): String? = payment.toString()
         *
         *     // ...
         *
         *     override fun unknown(json: JsonValue?): String? {
         *         // Or inspect the `json`.
         *         return null
         *     }
         * })
         * ```
         *
         * @throws DodoPaymentsInvalidDataException if [Visitor.unknown] is not overridden in
         *   [visitor] and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                payment != null -> visitor.visitPayment(payment)
                subscription != null -> visitor.visitSubscription(subscription)
                refund != null -> visitor.visitRefund(refund)
                dispute != null -> visitor.visitDispute(dispute)
                licenseKey != null -> visitor.visitLicenseKey(licenseKey)
                creditLedgerEntry != null -> visitor.visitCreditLedgerEntry(creditLedgerEntry)
                creditBalanceLow != null -> visitor.visitCreditBalanceLow(creditBalanceLow)
                abandonedCheckout != null -> visitor.visitAbandonedCheckout(abandonedCheckout)
                dunningAttempt != null -> visitor.visitDunningAttempt(dunningAttempt)
                entitlementGrant != null -> visitor.visitEntitlementGrant(entitlementGrant)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitPayment(payment: Payment) {
                        payment.validate()
                    }

                    override fun visitSubscription(subscription: Subscription) {
                        subscription.validate()
                    }

                    override fun visitRefund(refund: Refund) {
                        refund.validate()
                    }

                    override fun visitDispute(dispute: Dispute) {
                        dispute.validate()
                    }

                    override fun visitLicenseKey(licenseKey: LicenseKey) {
                        licenseKey.validate()
                    }

                    override fun visitCreditLedgerEntry(creditLedgerEntry: CreditLedgerEntry) {
                        creditLedgerEntry.validate()
                    }

                    override fun visitCreditBalanceLow(creditBalanceLow: CreditBalanceLow) {
                        creditBalanceLow.validate()
                    }

                    override fun visitAbandonedCheckout(abandonedCheckout: AbandonedCheckout) {
                        abandonedCheckout.validate()
                    }

                    override fun visitDunningAttempt(dunningAttempt: DunningAttempt) {
                        dunningAttempt.validate()
                    }

                    override fun visitEntitlementGrant(entitlementGrant: EntitlementGrant) {
                        entitlementGrant.validate()
                    }
                }
            )
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
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitPayment(payment: Payment) = payment.validity()

                    override fun visitSubscription(subscription: Subscription) =
                        subscription.validity()

                    override fun visitRefund(refund: Refund) = refund.validity()

                    override fun visitDispute(dispute: Dispute) = dispute.validity()

                    override fun visitLicenseKey(licenseKey: LicenseKey) = licenseKey.validity()

                    override fun visitCreditLedgerEntry(creditLedgerEntry: CreditLedgerEntry) =
                        creditLedgerEntry.validity()

                    override fun visitCreditBalanceLow(creditBalanceLow: CreditBalanceLow) =
                        creditBalanceLow.validity()

                    override fun visitAbandonedCheckout(abandonedCheckout: AbandonedCheckout) =
                        abandonedCheckout.validity()

                    override fun visitDunningAttempt(dunningAttempt: DunningAttempt) =
                        dunningAttempt.validity()

                    override fun visitEntitlementGrant(entitlementGrant: EntitlementGrant) =
                        entitlementGrant.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                payment == other.payment &&
                subscription == other.subscription &&
                refund == other.refund &&
                dispute == other.dispute &&
                licenseKey == other.licenseKey &&
                creditLedgerEntry == other.creditLedgerEntry &&
                creditBalanceLow == other.creditBalanceLow &&
                abandonedCheckout == other.abandonedCheckout &&
                dunningAttempt == other.dunningAttempt &&
                entitlementGrant == other.entitlementGrant
        }

        override fun hashCode(): Int =
            Objects.hash(
                payment,
                subscription,
                refund,
                dispute,
                licenseKey,
                creditLedgerEntry,
                creditBalanceLow,
                abandonedCheckout,
                dunningAttempt,
                entitlementGrant,
            )

        override fun toString(): String =
            when {
                payment != null -> "Data{payment=$payment}"
                subscription != null -> "Data{subscription=$subscription}"
                refund != null -> "Data{refund=$refund}"
                dispute != null -> "Data{dispute=$dispute}"
                licenseKey != null -> "Data{licenseKey=$licenseKey}"
                creditLedgerEntry != null -> "Data{creditLedgerEntry=$creditLedgerEntry}"
                creditBalanceLow != null -> "Data{creditBalanceLow=$creditBalanceLow}"
                abandonedCheckout != null -> "Data{abandonedCheckout=$abandonedCheckout}"
                dunningAttempt != null -> "Data{dunningAttempt=$dunningAttempt}"
                entitlementGrant != null -> "Data{entitlementGrant=$entitlementGrant}"
                _json != null -> "Data{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Data")
            }

        companion object {

            fun ofPayment(payment: Payment) = Data(payment = payment)

            /** Response struct representing subscription details */
            fun ofSubscription(subscription: Subscription) = Data(subscription = subscription)

            fun ofRefund(refund: Refund) = Data(refund = refund)

            fun ofDispute(dispute: Dispute) = Data(dispute = dispute)

            fun ofLicenseKey(licenseKey: LicenseKey) = Data(licenseKey = licenseKey)

            /** Response for a ledger entry */
            fun ofCreditLedgerEntry(creditLedgerEntry: CreditLedgerEntry) =
                Data(creditLedgerEntry = creditLedgerEntry)

            fun ofCreditBalanceLow(creditBalanceLow: CreditBalanceLow) =
                Data(creditBalanceLow = creditBalanceLow)

            fun ofAbandonedCheckout(abandonedCheckout: AbandonedCheckout) =
                Data(abandonedCheckout = abandonedCheckout)

            fun ofDunningAttempt(dunningAttempt: DunningAttempt) =
                Data(dunningAttempt = dunningAttempt)

            /**
             * Detailed view of a single entitlement grant: who it's for, its lifecycle state, and
             * any integration-specific delivery payload.
             */
            fun ofEntitlementGrant(entitlementGrant: EntitlementGrant) =
                Data(entitlementGrant = entitlementGrant)
        }

        /** An interface that defines how to map each variant of [Data] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitPayment(payment: Payment): T

            /** Response struct representing subscription details */
            fun visitSubscription(subscription: Subscription): T

            fun visitRefund(refund: Refund): T

            fun visitDispute(dispute: Dispute): T

            fun visitLicenseKey(licenseKey: LicenseKey): T

            /** Response for a ledger entry */
            fun visitCreditLedgerEntry(creditLedgerEntry: CreditLedgerEntry): T

            fun visitCreditBalanceLow(creditBalanceLow: CreditBalanceLow): T

            fun visitAbandonedCheckout(abandonedCheckout: AbandonedCheckout): T

            fun visitDunningAttempt(dunningAttempt: DunningAttempt): T

            /**
             * Detailed view of a single entitlement grant: who it's for, its lifecycle state, and
             * any integration-specific delivery payload.
             */
            fun visitEntitlementGrant(entitlementGrant: EntitlementGrant): T

            /**
             * Maps an unknown variant of [Data] to a value of type [T].
             *
             * An instance of [Data] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws DodoPaymentsInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw DodoPaymentsInvalidDataException("Unknown Data: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Data>(Data::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Data {
                val json = JsonValue.fromJsonNode(node)
                val payloadType = json.asObject()?.get("payload_type")?.asString()

                when (payloadType) {
                    "Payment" -> {
                        return tryDeserialize(node, jacksonTypeRef<Payment>())?.let {
                            Data(payment = it, _json = json)
                        } ?: Data(_json = json)
                    }
                    "Subscription" -> {
                        return tryDeserialize(node, jacksonTypeRef<Subscription>())?.let {
                            Data(subscription = it, _json = json)
                        } ?: Data(_json = json)
                    }
                    "Refund" -> {
                        return tryDeserialize(node, jacksonTypeRef<Refund>())?.let {
                            Data(refund = it, _json = json)
                        } ?: Data(_json = json)
                    }
                    "Dispute" -> {
                        return tryDeserialize(node, jacksonTypeRef<Dispute>())?.let {
                            Data(dispute = it, _json = json)
                        } ?: Data(_json = json)
                    }
                    "LicenseKey" -> {
                        return tryDeserialize(node, jacksonTypeRef<LicenseKey>())?.let {
                            Data(licenseKey = it, _json = json)
                        } ?: Data(_json = json)
                    }
                    "CreditLedgerEntry" -> {
                        return tryDeserialize(node, jacksonTypeRef<CreditLedgerEntry>())?.let {
                            Data(creditLedgerEntry = it, _json = json)
                        } ?: Data(_json = json)
                    }
                    "CreditBalanceLow" -> {
                        return tryDeserialize(node, jacksonTypeRef<CreditBalanceLow>())?.let {
                            Data(creditBalanceLow = it, _json = json)
                        } ?: Data(_json = json)
                    }
                    "AbandonedCheckout" -> {
                        return tryDeserialize(node, jacksonTypeRef<AbandonedCheckout>())?.let {
                            Data(abandonedCheckout = it, _json = json)
                        } ?: Data(_json = json)
                    }
                    "DunningAttempt" -> {
                        return tryDeserialize(node, jacksonTypeRef<DunningAttempt>())?.let {
                            Data(dunningAttempt = it, _json = json)
                        } ?: Data(_json = json)
                    }
                    "EntitlementGrant" -> {
                        return tryDeserialize(node, jacksonTypeRef<EntitlementGrant>())?.let {
                            Data(entitlementGrant = it, _json = json)
                        } ?: Data(_json = json)
                    }
                }

                return Data(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Data>(Data::class) {

            override fun serialize(
                value: Data,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.payment != null -> generator.writeObject(value.payment)
                    value.subscription != null -> generator.writeObject(value.subscription)
                    value.refund != null -> generator.writeObject(value.refund)
                    value.dispute != null -> generator.writeObject(value.dispute)
                    value.licenseKey != null -> generator.writeObject(value.licenseKey)
                    value.creditLedgerEntry != null ->
                        generator.writeObject(value.creditLedgerEntry)
                    value.creditBalanceLow != null -> generator.writeObject(value.creditBalanceLow)
                    value.abandonedCheckout != null ->
                        generator.writeObject(value.abandonedCheckout)
                    value.dunningAttempt != null -> generator.writeObject(value.dunningAttempt)
                    value.entitlementGrant != null -> generator.writeObject(value.entitlementGrant)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Data")
                }
            }
        }

        class Payment
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val billing: JsonField<BillingAddress>,
            private val brandId: JsonField<String>,
            private val businessId: JsonField<String>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val currency: JsonField<Currency>,
            private val customer: JsonField<CustomerLimitedDetails>,
            private val digitalProductsDelivered: JsonField<Boolean>,
            private val disputes: JsonField<List<Dispute>>,
            private val isUpdatePaymentMethod: JsonField<Boolean>,
            private val metadata: JsonField<Metadata>,
            private val paymentId: JsonField<String>,
            private val paymentProvider:
                JsonField<com.dodopayments.api.models.payments.Payment.PaymentProvider>,
            private val refunds: JsonField<List<RefundListItem>>,
            private val retryAttempt: JsonField<Int>,
            private val settlementAmount: JsonField<Int>,
            private val settlementCurrency: JsonField<Currency>,
            private val totalAmount: JsonField<Int>,
            private val cardHolderName: JsonField<String>,
            private val cardIssuingCountry: JsonField<CountryCode>,
            private val cardLastFour: JsonField<String>,
            private val cardNetwork: JsonField<String>,
            private val cardType: JsonField<String>,
            private val checkoutSessionId: JsonField<String>,
            private val customFieldResponses: JsonField<List<CustomFieldResponse>>,
            private val discountId: JsonField<String>,
            private val discounts: JsonField<List<DiscountDetail>>,
            private val errorCode: JsonField<String>,
            private val errorMessage: JsonField<String>,
            private val invoiceId: JsonField<String>,
            private val invoiceUrl: JsonField<String>,
            private val paymentLink: JsonField<String>,
            private val paymentMethod: JsonField<String>,
            private val paymentMethodId: JsonField<String>,
            private val paymentMethodType: JsonField<String>,
            private val productCart:
                JsonField<List<com.dodopayments.api.models.payments.Payment.ProductCart>>,
            private val refundStatus: JsonField<PaymentRefundStatus>,
            private val settlementTax: JsonField<Int>,
            private val status: JsonField<IntentStatus>,
            private val subscriptionId: JsonField<String>,
            private val tax: JsonField<Int>,
            private val updatedAt: JsonField<OffsetDateTime>,
            private val payloadType: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("billing")
                @ExcludeMissing
                billing: JsonField<BillingAddress> = JsonMissing.of(),
                @JsonProperty("brand_id")
                @ExcludeMissing
                brandId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("business_id")
                @ExcludeMissing
                businessId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<Currency> = JsonMissing.of(),
                @JsonProperty("customer")
                @ExcludeMissing
                customer: JsonField<CustomerLimitedDetails> = JsonMissing.of(),
                @JsonProperty("digital_products_delivered")
                @ExcludeMissing
                digitalProductsDelivered: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("disputes")
                @ExcludeMissing
                disputes: JsonField<List<Dispute>> = JsonMissing.of(),
                @JsonProperty("is_update_payment_method")
                @ExcludeMissing
                isUpdatePaymentMethod: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonProperty("payment_id")
                @ExcludeMissing
                paymentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("payment_provider")
                @ExcludeMissing
                paymentProvider:
                    JsonField<com.dodopayments.api.models.payments.Payment.PaymentProvider> =
                    JsonMissing.of(),
                @JsonProperty("refunds")
                @ExcludeMissing
                refunds: JsonField<List<RefundListItem>> = JsonMissing.of(),
                @JsonProperty("retry_attempt")
                @ExcludeMissing
                retryAttempt: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("settlement_amount")
                @ExcludeMissing
                settlementAmount: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("settlement_currency")
                @ExcludeMissing
                settlementCurrency: JsonField<Currency> = JsonMissing.of(),
                @JsonProperty("total_amount")
                @ExcludeMissing
                totalAmount: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("card_holder_name")
                @ExcludeMissing
                cardHolderName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("card_issuing_country")
                @ExcludeMissing
                cardIssuingCountry: JsonField<CountryCode> = JsonMissing.of(),
                @JsonProperty("card_last_four")
                @ExcludeMissing
                cardLastFour: JsonField<String> = JsonMissing.of(),
                @JsonProperty("card_network")
                @ExcludeMissing
                cardNetwork: JsonField<String> = JsonMissing.of(),
                @JsonProperty("card_type")
                @ExcludeMissing
                cardType: JsonField<String> = JsonMissing.of(),
                @JsonProperty("checkout_session_id")
                @ExcludeMissing
                checkoutSessionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("custom_field_responses")
                @ExcludeMissing
                customFieldResponses: JsonField<List<CustomFieldResponse>> = JsonMissing.of(),
                @JsonProperty("discount_id")
                @ExcludeMissing
                discountId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("discounts")
                @ExcludeMissing
                discounts: JsonField<List<DiscountDetail>> = JsonMissing.of(),
                @JsonProperty("error_code")
                @ExcludeMissing
                errorCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("error_message")
                @ExcludeMissing
                errorMessage: JsonField<String> = JsonMissing.of(),
                @JsonProperty("invoice_id")
                @ExcludeMissing
                invoiceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("invoice_url")
                @ExcludeMissing
                invoiceUrl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("payment_link")
                @ExcludeMissing
                paymentLink: JsonField<String> = JsonMissing.of(),
                @JsonProperty("payment_method")
                @ExcludeMissing
                paymentMethod: JsonField<String> = JsonMissing.of(),
                @JsonProperty("payment_method_id")
                @ExcludeMissing
                paymentMethodId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("payment_method_type")
                @ExcludeMissing
                paymentMethodType: JsonField<String> = JsonMissing.of(),
                @JsonProperty("product_cart")
                @ExcludeMissing
                productCart:
                    JsonField<List<com.dodopayments.api.models.payments.Payment.ProductCart>> =
                    JsonMissing.of(),
                @JsonProperty("refund_status")
                @ExcludeMissing
                refundStatus: JsonField<PaymentRefundStatus> = JsonMissing.of(),
                @JsonProperty("settlement_tax")
                @ExcludeMissing
                settlementTax: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<IntentStatus> = JsonMissing.of(),
                @JsonProperty("subscription_id")
                @ExcludeMissing
                subscriptionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tax") @ExcludeMissing tax: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("updated_at")
                @ExcludeMissing
                updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("payload_type")
                @ExcludeMissing
                payloadType: JsonValue = JsonMissing.of(),
            ) : this(
                billing,
                brandId,
                businessId,
                createdAt,
                currency,
                customer,
                digitalProductsDelivered,
                disputes,
                isUpdatePaymentMethod,
                metadata,
                paymentId,
                paymentProvider,
                refunds,
                retryAttempt,
                settlementAmount,
                settlementCurrency,
                totalAmount,
                cardHolderName,
                cardIssuingCountry,
                cardLastFour,
                cardNetwork,
                cardType,
                checkoutSessionId,
                customFieldResponses,
                discountId,
                discounts,
                errorCode,
                errorMessage,
                invoiceId,
                invoiceUrl,
                paymentLink,
                paymentMethod,
                paymentMethodId,
                paymentMethodType,
                productCart,
                refundStatus,
                settlementTax,
                status,
                subscriptionId,
                tax,
                updatedAt,
                payloadType,
                mutableMapOf(),
            )

            fun toPayment(): Payment =
                Payment.builder()
                    .billing(billing)
                    .brandId(brandId)
                    .businessId(businessId)
                    .createdAt(createdAt)
                    .currency(currency)
                    .customer(customer)
                    .digitalProductsDelivered(digitalProductsDelivered)
                    .disputes(disputes)
                    .isUpdatePaymentMethod(isUpdatePaymentMethod)
                    .metadata(metadata)
                    .paymentId(paymentId)
                    .paymentProvider(paymentProvider)
                    .refunds(refunds)
                    .retryAttempt(retryAttempt)
                    .settlementAmount(settlementAmount)
                    .settlementCurrency(settlementCurrency)
                    .totalAmount(totalAmount)
                    .cardHolderName(cardHolderName)
                    .cardIssuingCountry(cardIssuingCountry)
                    .cardLastFour(cardLastFour)
                    .cardNetwork(cardNetwork)
                    .cardType(cardType)
                    .checkoutSessionId(checkoutSessionId)
                    .customFieldResponses(customFieldResponses)
                    .discountId(discountId)
                    .discounts(discounts)
                    .errorCode(errorCode)
                    .errorMessage(errorMessage)
                    .invoiceId(invoiceId)
                    .invoiceUrl(invoiceUrl)
                    .paymentLink(paymentLink)
                    .paymentMethod(paymentMethod)
                    .paymentMethodId(paymentMethodId)
                    .paymentMethodType(paymentMethodType)
                    .productCart(productCart)
                    .refundStatus(refundStatus)
                    .settlementTax(settlementTax)
                    .status(status)
                    .subscriptionId(subscriptionId)
                    .tax(tax)
                    .updatedAt(updatedAt)
                    .build()

            /**
             * Billing address details for payments
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun billing(): BillingAddress = billing.getRequired("billing")

            /**
             * brand id this payment belongs to
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun brandId(): String = brandId.getRequired("brand_id")

            /**
             * Identifier of the business associated with the payment
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun businessId(): String = businessId.getRequired("business_id")

            /**
             * Timestamp when the payment was created
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

            /**
             * Currency used for the payment
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): Currency = currency.getRequired("currency")

            /**
             * Details about the customer who made the payment
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun customer(): CustomerLimitedDetails = customer.getRequired("customer")

            /**
             * Whether the digital products purchased in this payment have been delivered.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun digitalProductsDelivered(): Boolean =
                digitalProductsDelivered.getRequired("digital_products_delivered")

            /**
             * List of disputes associated with this payment
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun disputes(): List<Dispute> = disputes.getRequired("disputes")

            /**
             * Whether this payment was created solely to update a subscription's payment method (a
             * zero-/setup-amount charge). `false` for normal charges.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun isUpdatePaymentMethod(): Boolean =
                isUpdatePaymentMethod.getRequired("is_update_payment_method")

            /**
             * Additional custom data associated with the payment
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun metadata(): Metadata = metadata.getRequired("metadata")

            /**
             * Unique identifier for the payment
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentId(): String = paymentId.getRequired("payment_id")

            /**
             * Which processor handled this payment. `stripe` / `adyen` for BYOP routes (the
             * merchant's own payment connector); `dodo` for everything Dodo processed itself.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentProvider(): com.dodopayments.api.models.payments.Payment.PaymentProvider =
                paymentProvider.getRequired("payment_provider")

            /**
             * List of refunds issued for this payment
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun refunds(): List<RefundListItem> = refunds.getRequired("refunds")

            /**
             * Retry attempt number for subscription renewal payments. `0` for the original payment,
             * `1`+ for each scheduled off-session retry after a failed renewal. Always `0` for
             * non-subscription payments.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun retryAttempt(): Int = retryAttempt.getRequired("retry_attempt")

            /**
             * The amount that will be credited to your Dodo balance after currency conversion and
             * processing. Especially relevant for adaptive pricing where the customer's payment
             * currency differs from your settlement currency.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun settlementAmount(): Int = settlementAmount.getRequired("settlement_amount")

            /**
             * The currency in which the settlement_amount will be credited to your Dodo balance.
             * This may differ from the customer's payment currency in adaptive pricing scenarios.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun settlementCurrency(): Currency =
                settlementCurrency.getRequired("settlement_currency")

            /**
             * Total amount charged to the customer including tax, in the currency's smallest unit
             * (e.g. cents for USD, yen for JPY, fils for KWD — see the currency's decimal places)
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun totalAmount(): Int = totalAmount.getRequired("total_amount")

            /**
             * Cardholder name
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun cardHolderName(): String? = cardHolderName.getNullable("card_holder_name")

            /**
             * ISO2 country code of the card
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun cardIssuingCountry(): CountryCode? =
                cardIssuingCountry.getNullable("card_issuing_country")

            /**
             * The last four digits of the card
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun cardLastFour(): String? = cardLastFour.getNullable("card_last_four")

            /**
             * Card network like VISA, MASTERCARD etc.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun cardNetwork(): String? = cardNetwork.getNullable("card_network")

            /**
             * The type of card DEBIT or CREDIT
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun cardType(): String? = cardType.getNullable("card_type")

            /**
             * If payment is made using a checkout session, this field is set to the id of the
             * session.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun checkoutSessionId(): String? = checkoutSessionId.getNullable("checkout_session_id")

            /**
             * Customer's responses to custom fields collected during checkout
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun customFieldResponses(): List<CustomFieldResponse>? =
                customFieldResponses.getNullable("custom_field_responses")

            /**
             * DEPRECATED: Use discounts instead. Returns the first discount's ID if present.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            @Deprecated("Use `discounts` instead.")
            fun discountId(): String? = discountId.getNullable("discount_id")

            /**
             * All stacked discounts applied, ordered by position
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun discounts(): List<DiscountDetail>? = discounts.getNullable("discounts")

            /**
             * An error code if the payment failed
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun errorCode(): String? = errorCode.getNullable("error_code")

            /**
             * An error message if the payment failed
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun errorMessage(): String? = errorMessage.getNullable("error_message")

            /**
             * Invoice ID for this payment. Uses India-specific invoice ID if available.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun invoiceId(): String? = invoiceId.getNullable("invoice_id")

            /**
             * URL to download the invoice PDF for this payment.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun invoiceUrl(): String? = invoiceUrl.getNullable("invoice_url")

            /**
             * Checkout URL
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun paymentLink(): String? = paymentLink.getNullable("payment_link")

            /**
             * Payment method used by customer (e.g. "card", "bank_transfer")
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun paymentMethod(): String? = paymentMethod.getNullable("payment_method")

            /**
             * Identifier of the saved payment method used for this payment, if any.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun paymentMethodId(): String? = paymentMethodId.getNullable("payment_method_id")

            /**
             * Specific type of payment method (e.g. "visa", "mastercard")
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun paymentMethodType(): String? = paymentMethodType.getNullable("payment_method_type")

            /**
             * List of products purchased in a one-time payment
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun productCart(): List<com.dodopayments.api.models.payments.Payment.ProductCart>? =
                productCart.getNullable("product_cart")

            /**
             * Summary of the refund status for this payment. None if no succeeded refunds exist.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun refundStatus(): PaymentRefundStatus? = refundStatus.getNullable("refund_status")

            /**
             * This represents the portion of settlement_amount that corresponds to taxes collected.
             * Especially relevant for adaptive pricing where the tax component must be tracked
             * separately in your Dodo balance.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun settlementTax(): Int? = settlementTax.getNullable("settlement_tax")

            /**
             * Current status of the payment intent
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun status(): IntentStatus? = status.getNullable("status")

            /**
             * Identifier of the subscription if payment is part of a subscription
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun subscriptionId(): String? = subscriptionId.getNullable("subscription_id")

            /**
             * Amount of tax collected in the currency's smallest unit (e.g. cents for USD, yen for
             * JPY, fils for KWD)
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun tax(): Int? = tax.getNullable("tax")

            /**
             * Timestamp when the payment was last updated
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("Payment")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("payload_type")
            @ExcludeMissing
            fun _payloadType(): JsonValue = payloadType

            /**
             * Returns the raw JSON value of [billing].
             *
             * Unlike [billing], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("billing")
            @ExcludeMissing
            fun _billing(): JsonField<BillingAddress> = billing

            /**
             * Returns the raw JSON value of [brandId].
             *
             * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("brand_id") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

            /**
             * Returns the raw JSON value of [businessId].
             *
             * Unlike [businessId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("business_id")
            @ExcludeMissing
            fun _businessId(): JsonField<String> = businessId

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun _currency(): JsonField<Currency> = currency

            /**
             * Returns the raw JSON value of [customer].
             *
             * Unlike [customer], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("customer")
            @ExcludeMissing
            fun _customer(): JsonField<CustomerLimitedDetails> = customer

            /**
             * Returns the raw JSON value of [digitalProductsDelivered].
             *
             * Unlike [digitalProductsDelivered], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("digital_products_delivered")
            @ExcludeMissing
            fun _digitalProductsDelivered(): JsonField<Boolean> = digitalProductsDelivered

            /**
             * Returns the raw JSON value of [disputes].
             *
             * Unlike [disputes], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("disputes")
            @ExcludeMissing
            fun _disputes(): JsonField<List<Dispute>> = disputes

            /**
             * Returns the raw JSON value of [isUpdatePaymentMethod].
             *
             * Unlike [isUpdatePaymentMethod], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("is_update_payment_method")
            @ExcludeMissing
            fun _isUpdatePaymentMethod(): JsonField<Boolean> = isUpdatePaymentMethod

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            /**
             * Returns the raw JSON value of [paymentId].
             *
             * Unlike [paymentId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("payment_id")
            @ExcludeMissing
            fun _paymentId(): JsonField<String> = paymentId

            /**
             * Returns the raw JSON value of [paymentProvider].
             *
             * Unlike [paymentProvider], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("payment_provider")
            @ExcludeMissing
            fun _paymentProvider():
                JsonField<com.dodopayments.api.models.payments.Payment.PaymentProvider> =
                paymentProvider

            /**
             * Returns the raw JSON value of [refunds].
             *
             * Unlike [refunds], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("refunds")
            @ExcludeMissing
            fun _refunds(): JsonField<List<RefundListItem>> = refunds

            /**
             * Returns the raw JSON value of [retryAttempt].
             *
             * Unlike [retryAttempt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("retry_attempt")
            @ExcludeMissing
            fun _retryAttempt(): JsonField<Int> = retryAttempt

            /**
             * Returns the raw JSON value of [settlementAmount].
             *
             * Unlike [settlementAmount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("settlement_amount")
            @ExcludeMissing
            fun _settlementAmount(): JsonField<Int> = settlementAmount

            /**
             * Returns the raw JSON value of [settlementCurrency].
             *
             * Unlike [settlementCurrency], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("settlement_currency")
            @ExcludeMissing
            fun _settlementCurrency(): JsonField<Currency> = settlementCurrency

            /**
             * Returns the raw JSON value of [totalAmount].
             *
             * Unlike [totalAmount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("total_amount")
            @ExcludeMissing
            fun _totalAmount(): JsonField<Int> = totalAmount

            /**
             * Returns the raw JSON value of [cardHolderName].
             *
             * Unlike [cardHolderName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("card_holder_name")
            @ExcludeMissing
            fun _cardHolderName(): JsonField<String> = cardHolderName

            /**
             * Returns the raw JSON value of [cardIssuingCountry].
             *
             * Unlike [cardIssuingCountry], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("card_issuing_country")
            @ExcludeMissing
            fun _cardIssuingCountry(): JsonField<CountryCode> = cardIssuingCountry

            /**
             * Returns the raw JSON value of [cardLastFour].
             *
             * Unlike [cardLastFour], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("card_last_four")
            @ExcludeMissing
            fun _cardLastFour(): JsonField<String> = cardLastFour

            /**
             * Returns the raw JSON value of [cardNetwork].
             *
             * Unlike [cardNetwork], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("card_network")
            @ExcludeMissing
            fun _cardNetwork(): JsonField<String> = cardNetwork

            /**
             * Returns the raw JSON value of [cardType].
             *
             * Unlike [cardType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("card_type") @ExcludeMissing fun _cardType(): JsonField<String> = cardType

            /**
             * Returns the raw JSON value of [checkoutSessionId].
             *
             * Unlike [checkoutSessionId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("checkout_session_id")
            @ExcludeMissing
            fun _checkoutSessionId(): JsonField<String> = checkoutSessionId

            /**
             * Returns the raw JSON value of [customFieldResponses].
             *
             * Unlike [customFieldResponses], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("custom_field_responses")
            @ExcludeMissing
            fun _customFieldResponses(): JsonField<List<CustomFieldResponse>> = customFieldResponses

            /**
             * Returns the raw JSON value of [discountId].
             *
             * Unlike [discountId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @Deprecated("Use `discounts` instead.")
            @JsonProperty("discount_id")
            @ExcludeMissing
            fun _discountId(): JsonField<String> = discountId

            /**
             * Returns the raw JSON value of [discounts].
             *
             * Unlike [discounts], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("discounts")
            @ExcludeMissing
            fun _discounts(): JsonField<List<DiscountDetail>> = discounts

            /**
             * Returns the raw JSON value of [errorCode].
             *
             * Unlike [errorCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("error_code")
            @ExcludeMissing
            fun _errorCode(): JsonField<String> = errorCode

            /**
             * Returns the raw JSON value of [errorMessage].
             *
             * Unlike [errorMessage], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("error_message")
            @ExcludeMissing
            fun _errorMessage(): JsonField<String> = errorMessage

            /**
             * Returns the raw JSON value of [invoiceId].
             *
             * Unlike [invoiceId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("invoice_id")
            @ExcludeMissing
            fun _invoiceId(): JsonField<String> = invoiceId

            /**
             * Returns the raw JSON value of [invoiceUrl].
             *
             * Unlike [invoiceUrl], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("invoice_url")
            @ExcludeMissing
            fun _invoiceUrl(): JsonField<String> = invoiceUrl

            /**
             * Returns the raw JSON value of [paymentLink].
             *
             * Unlike [paymentLink], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("payment_link")
            @ExcludeMissing
            fun _paymentLink(): JsonField<String> = paymentLink

            /**
             * Returns the raw JSON value of [paymentMethod].
             *
             * Unlike [paymentMethod], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("payment_method")
            @ExcludeMissing
            fun _paymentMethod(): JsonField<String> = paymentMethod

            /**
             * Returns the raw JSON value of [paymentMethodId].
             *
             * Unlike [paymentMethodId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("payment_method_id")
            @ExcludeMissing
            fun _paymentMethodId(): JsonField<String> = paymentMethodId

            /**
             * Returns the raw JSON value of [paymentMethodType].
             *
             * Unlike [paymentMethodType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("payment_method_type")
            @ExcludeMissing
            fun _paymentMethodType(): JsonField<String> = paymentMethodType

            /**
             * Returns the raw JSON value of [productCart].
             *
             * Unlike [productCart], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("product_cart")
            @ExcludeMissing
            fun _productCart():
                JsonField<List<com.dodopayments.api.models.payments.Payment.ProductCart>> =
                productCart

            /**
             * Returns the raw JSON value of [refundStatus].
             *
             * Unlike [refundStatus], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("refund_status")
            @ExcludeMissing
            fun _refundStatus(): JsonField<PaymentRefundStatus> = refundStatus

            /**
             * Returns the raw JSON value of [settlementTax].
             *
             * Unlike [settlementTax], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("settlement_tax")
            @ExcludeMissing
            fun _settlementTax(): JsonField<Int> = settlementTax

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<IntentStatus> = status

            /**
             * Returns the raw JSON value of [subscriptionId].
             *
             * Unlike [subscriptionId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("subscription_id")
            @ExcludeMissing
            fun _subscriptionId(): JsonField<String> = subscriptionId

            /**
             * Returns the raw JSON value of [tax].
             *
             * Unlike [tax], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tax") @ExcludeMissing fun _tax(): JsonField<Int> = tax

            /**
             * Returns the raw JSON value of [updatedAt].
             *
             * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("updated_at")
            @ExcludeMissing
            fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
                 * Returns a mutable builder for constructing an instance of [Payment].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .billing()
                 * .brandId()
                 * .businessId()
                 * .createdAt()
                 * .currency()
                 * .customer()
                 * .digitalProductsDelivered()
                 * .disputes()
                 * .isUpdatePaymentMethod()
                 * .metadata()
                 * .paymentId()
                 * .paymentProvider()
                 * .refunds()
                 * .retryAttempt()
                 * .settlementAmount()
                 * .settlementCurrency()
                 * .totalAmount()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Payment]. */
            class Builder internal constructor() {

                private var billing: JsonField<BillingAddress>? = null
                private var brandId: JsonField<String>? = null
                private var businessId: JsonField<String>? = null
                private var createdAt: JsonField<OffsetDateTime>? = null
                private var currency: JsonField<Currency>? = null
                private var customer: JsonField<CustomerLimitedDetails>? = null
                private var digitalProductsDelivered: JsonField<Boolean>? = null
                private var disputes: JsonField<MutableList<Dispute>>? = null
                private var isUpdatePaymentMethod: JsonField<Boolean>? = null
                private var metadata: JsonField<Metadata>? = null
                private var paymentId: JsonField<String>? = null
                private var paymentProvider:
                    JsonField<com.dodopayments.api.models.payments.Payment.PaymentProvider>? =
                    null
                private var refunds: JsonField<MutableList<RefundListItem>>? = null
                private var retryAttempt: JsonField<Int>? = null
                private var settlementAmount: JsonField<Int>? = null
                private var settlementCurrency: JsonField<Currency>? = null
                private var totalAmount: JsonField<Int>? = null
                private var cardHolderName: JsonField<String> = JsonMissing.of()
                private var cardIssuingCountry: JsonField<CountryCode> = JsonMissing.of()
                private var cardLastFour: JsonField<String> = JsonMissing.of()
                private var cardNetwork: JsonField<String> = JsonMissing.of()
                private var cardType: JsonField<String> = JsonMissing.of()
                private var checkoutSessionId: JsonField<String> = JsonMissing.of()
                private var customFieldResponses: JsonField<MutableList<CustomFieldResponse>>? =
                    null
                private var discountId: JsonField<String> = JsonMissing.of()
                private var discounts: JsonField<MutableList<DiscountDetail>>? = null
                private var errorCode: JsonField<String> = JsonMissing.of()
                private var errorMessage: JsonField<String> = JsonMissing.of()
                private var invoiceId: JsonField<String> = JsonMissing.of()
                private var invoiceUrl: JsonField<String> = JsonMissing.of()
                private var paymentLink: JsonField<String> = JsonMissing.of()
                private var paymentMethod: JsonField<String> = JsonMissing.of()
                private var paymentMethodId: JsonField<String> = JsonMissing.of()
                private var paymentMethodType: JsonField<String> = JsonMissing.of()
                private var productCart:
                    JsonField<
                        MutableList<com.dodopayments.api.models.payments.Payment.ProductCart>
                    >? =
                    null
                private var refundStatus: JsonField<PaymentRefundStatus> = JsonMissing.of()
                private var settlementTax: JsonField<Int> = JsonMissing.of()
                private var status: JsonField<IntentStatus> = JsonMissing.of()
                private var subscriptionId: JsonField<String> = JsonMissing.of()
                private var tax: JsonField<Int> = JsonMissing.of()
                private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var payloadType: JsonValue = JsonValue.from("Payment")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(payment: Payment) = apply {
                    billing = payment.billing
                    brandId = payment.brandId
                    businessId = payment.businessId
                    createdAt = payment.createdAt
                    currency = payment.currency
                    customer = payment.customer
                    digitalProductsDelivered = payment.digitalProductsDelivered
                    disputes = payment.disputes.map { it.toMutableList() }
                    isUpdatePaymentMethod = payment.isUpdatePaymentMethod
                    metadata = payment.metadata
                    paymentId = payment.paymentId
                    paymentProvider = payment.paymentProvider
                    refunds = payment.refunds.map { it.toMutableList() }
                    retryAttempt = payment.retryAttempt
                    settlementAmount = payment.settlementAmount
                    settlementCurrency = payment.settlementCurrency
                    totalAmount = payment.totalAmount
                    cardHolderName = payment.cardHolderName
                    cardIssuingCountry = payment.cardIssuingCountry
                    cardLastFour = payment.cardLastFour
                    cardNetwork = payment.cardNetwork
                    cardType = payment.cardType
                    checkoutSessionId = payment.checkoutSessionId
                    customFieldResponses = payment.customFieldResponses.map { it.toMutableList() }
                    discountId = payment.discountId
                    discounts = payment.discounts.map { it.toMutableList() }
                    errorCode = payment.errorCode
                    errorMessage = payment.errorMessage
                    invoiceId = payment.invoiceId
                    invoiceUrl = payment.invoiceUrl
                    paymentLink = payment.paymentLink
                    paymentMethod = payment.paymentMethod
                    paymentMethodId = payment.paymentMethodId
                    paymentMethodType = payment.paymentMethodType
                    productCart = payment.productCart.map { it.toMutableList() }
                    refundStatus = payment.refundStatus
                    settlementTax = payment.settlementTax
                    status = payment.status
                    subscriptionId = payment.subscriptionId
                    tax = payment.tax
                    updatedAt = payment.updatedAt
                    payloadType = payment.payloadType
                    additionalProperties = payment.additionalProperties.toMutableMap()
                }

                /** Billing address details for payments */
                fun billing(billing: BillingAddress) = billing(JsonField.of(billing))

                /**
                 * Sets [Builder.billing] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billing] with a well-typed [BillingAddress]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun billing(billing: JsonField<BillingAddress>) = apply { this.billing = billing }

                /** brand id this payment belongs to */
                fun brandId(brandId: String) = brandId(JsonField.of(brandId))

                /**
                 * Sets [Builder.brandId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.brandId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

                /** Identifier of the business associated with the payment */
                fun businessId(businessId: String) = businessId(JsonField.of(businessId))

                /**
                 * Sets [Builder.businessId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.businessId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun businessId(businessId: JsonField<String>) = apply {
                    this.businessId = businessId
                }

                /** Timestamp when the payment was created */
                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                /** Currency used for the payment */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [Currency] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** Details about the customer who made the payment */
                fun customer(customer: CustomerLimitedDetails) = customer(JsonField.of(customer))

                /**
                 * Sets [Builder.customer] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customer] with a well-typed
                 * [CustomerLimitedDetails] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun customer(customer: JsonField<CustomerLimitedDetails>) = apply {
                    this.customer = customer
                }

                /** Whether the digital products purchased in this payment have been delivered. */
                fun digitalProductsDelivered(digitalProductsDelivered: Boolean) =
                    digitalProductsDelivered(JsonField.of(digitalProductsDelivered))

                /**
                 * Sets [Builder.digitalProductsDelivered] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.digitalProductsDelivered] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun digitalProductsDelivered(digitalProductsDelivered: JsonField<Boolean>) = apply {
                    this.digitalProductsDelivered = digitalProductsDelivered
                }

                /** List of disputes associated with this payment */
                fun disputes(disputes: List<Dispute>) = disputes(JsonField.of(disputes))

                /**
                 * Sets [Builder.disputes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.disputes] with a well-typed `List<Dispute>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun disputes(disputes: JsonField<List<Dispute>>) = apply {
                    this.disputes = disputes.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Dispute] to [disputes].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addDispute(dispute: Dispute) = apply {
                    disputes =
                        (disputes ?: JsonField.of(mutableListOf())).also {
                            checkKnown("disputes", it).add(dispute)
                        }
                }

                /**
                 * Whether this payment was created solely to update a subscription's payment method
                 * (a zero-/setup-amount charge). `false` for normal charges.
                 */
                fun isUpdatePaymentMethod(isUpdatePaymentMethod: Boolean) =
                    isUpdatePaymentMethod(JsonField.of(isUpdatePaymentMethod))

                /**
                 * Sets [Builder.isUpdatePaymentMethod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isUpdatePaymentMethod] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun isUpdatePaymentMethod(isUpdatePaymentMethod: JsonField<Boolean>) = apply {
                    this.isUpdatePaymentMethod = isUpdatePaymentMethod
                }

                /** Additional custom data associated with the payment */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                /** Unique identifier for the payment */
                fun paymentId(paymentId: String) = paymentId(JsonField.of(paymentId))

                /**
                 * Sets [Builder.paymentId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun paymentId(paymentId: JsonField<String>) = apply { this.paymentId = paymentId }

                /**
                 * Which processor handled this payment. `stripe` / `adyen` for BYOP routes (the
                 * merchant's own payment connector); `dodo` for everything Dodo processed itself.
                 */
                fun paymentProvider(
                    paymentProvider: com.dodopayments.api.models.payments.Payment.PaymentProvider
                ) = paymentProvider(JsonField.of(paymentProvider))

                /**
                 * Sets [Builder.paymentProvider] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentProvider] with a well-typed
                 * [Payment.PaymentProvider] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun paymentProvider(
                    paymentProvider:
                        JsonField<com.dodopayments.api.models.payments.Payment.PaymentProvider>
                ) = apply { this.paymentProvider = paymentProvider }

                /** List of refunds issued for this payment */
                fun refunds(refunds: List<RefundListItem>) = refunds(JsonField.of(refunds))

                /**
                 * Sets [Builder.refunds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.refunds] with a well-typed
                 * `List<RefundListItem>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun refunds(refunds: JsonField<List<RefundListItem>>) = apply {
                    this.refunds = refunds.map { it.toMutableList() }
                }

                /**
                 * Adds a single [RefundListItem] to [refunds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRefund(refund: RefundListItem) = apply {
                    refunds =
                        (refunds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("refunds", it).add(refund)
                        }
                }

                /**
                 * Retry attempt number for subscription renewal payments. `0` for the original
                 * payment, `1`+ for each scheduled off-session retry after a failed renewal. Always
                 * `0` for non-subscription payments.
                 */
                fun retryAttempt(retryAttempt: Int) = retryAttempt(JsonField.of(retryAttempt))

                /**
                 * Sets [Builder.retryAttempt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.retryAttempt] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun retryAttempt(retryAttempt: JsonField<Int>) = apply {
                    this.retryAttempt = retryAttempt
                }

                /**
                 * The amount that will be credited to your Dodo balance after currency conversion
                 * and processing. Especially relevant for adaptive pricing where the customer's
                 * payment currency differs from your settlement currency.
                 */
                fun settlementAmount(settlementAmount: Int) =
                    settlementAmount(JsonField.of(settlementAmount))

                /**
                 * Sets [Builder.settlementAmount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.settlementAmount] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun settlementAmount(settlementAmount: JsonField<Int>) = apply {
                    this.settlementAmount = settlementAmount
                }

                /**
                 * The currency in which the settlement_amount will be credited to your Dodo
                 * balance. This may differ from the customer's payment currency in adaptive pricing
                 * scenarios.
                 */
                fun settlementCurrency(settlementCurrency: Currency) =
                    settlementCurrency(JsonField.of(settlementCurrency))

                /**
                 * Sets [Builder.settlementCurrency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.settlementCurrency] with a well-typed [Currency]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun settlementCurrency(settlementCurrency: JsonField<Currency>) = apply {
                    this.settlementCurrency = settlementCurrency
                }

                /**
                 * Total amount charged to the customer including tax, in the currency's smallest
                 * unit (e.g. cents for USD, yen for JPY, fils for KWD — see the currency's decimal
                 * places)
                 */
                fun totalAmount(totalAmount: Int) = totalAmount(JsonField.of(totalAmount))

                /**
                 * Sets [Builder.totalAmount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.totalAmount] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun totalAmount(totalAmount: JsonField<Int>) = apply {
                    this.totalAmount = totalAmount
                }

                /** Cardholder name */
                fun cardHolderName(cardHolderName: String?) =
                    cardHolderName(JsonField.ofNullable(cardHolderName))

                /**
                 * Sets [Builder.cardHolderName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cardHolderName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cardHolderName(cardHolderName: JsonField<String>) = apply {
                    this.cardHolderName = cardHolderName
                }

                /** ISO2 country code of the card */
                fun cardIssuingCountry(cardIssuingCountry: CountryCode?) =
                    cardIssuingCountry(JsonField.ofNullable(cardIssuingCountry))

                /**
                 * Sets [Builder.cardIssuingCountry] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cardIssuingCountry] with a well-typed
                 * [CountryCode] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun cardIssuingCountry(cardIssuingCountry: JsonField<CountryCode>) = apply {
                    this.cardIssuingCountry = cardIssuingCountry
                }

                /** The last four digits of the card */
                fun cardLastFour(cardLastFour: String?) =
                    cardLastFour(JsonField.ofNullable(cardLastFour))

                /**
                 * Sets [Builder.cardLastFour] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cardLastFour] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cardLastFour(cardLastFour: JsonField<String>) = apply {
                    this.cardLastFour = cardLastFour
                }

                /** Card network like VISA, MASTERCARD etc. */
                fun cardNetwork(cardNetwork: String?) =
                    cardNetwork(JsonField.ofNullable(cardNetwork))

                /**
                 * Sets [Builder.cardNetwork] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cardNetwork] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cardNetwork(cardNetwork: JsonField<String>) = apply {
                    this.cardNetwork = cardNetwork
                }

                /** The type of card DEBIT or CREDIT */
                fun cardType(cardType: String?) = cardType(JsonField.ofNullable(cardType))

                /**
                 * Sets [Builder.cardType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cardType] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cardType(cardType: JsonField<String>) = apply { this.cardType = cardType }

                /**
                 * If payment is made using a checkout session, this field is set to the id of the
                 * session.
                 */
                fun checkoutSessionId(checkoutSessionId: String?) =
                    checkoutSessionId(JsonField.ofNullable(checkoutSessionId))

                /**
                 * Sets [Builder.checkoutSessionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.checkoutSessionId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun checkoutSessionId(checkoutSessionId: JsonField<String>) = apply {
                    this.checkoutSessionId = checkoutSessionId
                }

                /** Customer's responses to custom fields collected during checkout */
                fun customFieldResponses(customFieldResponses: List<CustomFieldResponse>?) =
                    customFieldResponses(JsonField.ofNullable(customFieldResponses))

                /**
                 * Sets [Builder.customFieldResponses] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customFieldResponses] with a well-typed
                 * `List<CustomFieldResponse>` value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun customFieldResponses(
                    customFieldResponses: JsonField<List<CustomFieldResponse>>
                ) = apply {
                    this.customFieldResponses = customFieldResponses.map { it.toMutableList() }
                }

                /**
                 * Adds a single [CustomFieldResponse] to [customFieldResponses].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addCustomFieldResponse(customFieldResponse: CustomFieldResponse) = apply {
                    customFieldResponses =
                        (customFieldResponses ?: JsonField.of(mutableListOf())).also {
                            checkKnown("customFieldResponses", it).add(customFieldResponse)
                        }
                }

                /**
                 * DEPRECATED: Use discounts instead. Returns the first discount's ID if present.
                 */
                @Deprecated("Use `discounts` instead.")
                fun discountId(discountId: String?) = discountId(JsonField.ofNullable(discountId))

                /**
                 * Sets [Builder.discountId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.discountId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                @Deprecated("Use `discounts` instead.")
                fun discountId(discountId: JsonField<String>) = apply {
                    this.discountId = discountId
                }

                /** All stacked discounts applied, ordered by position */
                fun discounts(discounts: List<DiscountDetail>?) =
                    discounts(JsonField.ofNullable(discounts))

                /**
                 * Sets [Builder.discounts] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.discounts] with a well-typed
                 * `List<DiscountDetail>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun discounts(discounts: JsonField<List<DiscountDetail>>) = apply {
                    this.discounts = discounts.map { it.toMutableList() }
                }

                /**
                 * Adds a single [DiscountDetail] to [discounts].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addDiscount(discount: DiscountDetail) = apply {
                    discounts =
                        (discounts ?: JsonField.of(mutableListOf())).also {
                            checkKnown("discounts", it).add(discount)
                        }
                }

                /** An error code if the payment failed */
                fun errorCode(errorCode: String?) = errorCode(JsonField.ofNullable(errorCode))

                /**
                 * Sets [Builder.errorCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.errorCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun errorCode(errorCode: JsonField<String>) = apply { this.errorCode = errorCode }

                /** An error message if the payment failed */
                fun errorMessage(errorMessage: String?) =
                    errorMessage(JsonField.ofNullable(errorMessage))

                /**
                 * Sets [Builder.errorMessage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.errorMessage] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun errorMessage(errorMessage: JsonField<String>) = apply {
                    this.errorMessage = errorMessage
                }

                /** Invoice ID for this payment. Uses India-specific invoice ID if available. */
                fun invoiceId(invoiceId: String?) = invoiceId(JsonField.ofNullable(invoiceId))

                /**
                 * Sets [Builder.invoiceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invoiceId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

                /** URL to download the invoice PDF for this payment. */
                fun invoiceUrl(invoiceUrl: String?) = invoiceUrl(JsonField.ofNullable(invoiceUrl))

                /**
                 * Sets [Builder.invoiceUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invoiceUrl] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun invoiceUrl(invoiceUrl: JsonField<String>) = apply {
                    this.invoiceUrl = invoiceUrl
                }

                /** Checkout URL */
                fun paymentLink(paymentLink: String?) =
                    paymentLink(JsonField.ofNullable(paymentLink))

                /**
                 * Sets [Builder.paymentLink] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentLink] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun paymentLink(paymentLink: JsonField<String>) = apply {
                    this.paymentLink = paymentLink
                }

                /** Payment method used by customer (e.g. "card", "bank_transfer") */
                fun paymentMethod(paymentMethod: String?) =
                    paymentMethod(JsonField.ofNullable(paymentMethod))

                /**
                 * Sets [Builder.paymentMethod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentMethod] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun paymentMethod(paymentMethod: JsonField<String>) = apply {
                    this.paymentMethod = paymentMethod
                }

                /** Identifier of the saved payment method used for this payment, if any. */
                fun paymentMethodId(paymentMethodId: String?) =
                    paymentMethodId(JsonField.ofNullable(paymentMethodId))

                /**
                 * Sets [Builder.paymentMethodId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentMethodId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun paymentMethodId(paymentMethodId: JsonField<String>) = apply {
                    this.paymentMethodId = paymentMethodId
                }

                /** Specific type of payment method (e.g. "visa", "mastercard") */
                fun paymentMethodType(paymentMethodType: String?) =
                    paymentMethodType(JsonField.ofNullable(paymentMethodType))

                /**
                 * Sets [Builder.paymentMethodType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentMethodType] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun paymentMethodType(paymentMethodType: JsonField<String>) = apply {
                    this.paymentMethodType = paymentMethodType
                }

                /** List of products purchased in a one-time payment */
                fun productCart(
                    productCart: List<com.dodopayments.api.models.payments.Payment.ProductCart>?
                ) = productCart(JsonField.ofNullable(productCart))

                /**
                 * Sets [Builder.productCart] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.productCart] with a well-typed
                 * `List<Payment.ProductCart>` value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun productCart(
                    productCart:
                        JsonField<List<com.dodopayments.api.models.payments.Payment.ProductCart>>
                ) = apply { this.productCart = productCart.map { it.toMutableList() } }

                /**
                 * Adds a single [Payment.ProductCart] to [Builder.productCart].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addProductCart(
                    productCart: com.dodopayments.api.models.payments.Payment.ProductCart
                ) = apply {
                    this.productCart =
                        (this.productCart ?: JsonField.of(mutableListOf())).also {
                            checkKnown("productCart", it).add(productCart)
                        }
                }

                /**
                 * Summary of the refund status for this payment. None if no succeeded refunds
                 * exist.
                 */
                fun refundStatus(refundStatus: PaymentRefundStatus?) =
                    refundStatus(JsonField.ofNullable(refundStatus))

                /**
                 * Sets [Builder.refundStatus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.refundStatus] with a well-typed
                 * [PaymentRefundStatus] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun refundStatus(refundStatus: JsonField<PaymentRefundStatus>) = apply {
                    this.refundStatus = refundStatus
                }

                /**
                 * This represents the portion of settlement_amount that corresponds to taxes
                 * collected. Especially relevant for adaptive pricing where the tax component must
                 * be tracked separately in your Dodo balance.
                 */
                fun settlementTax(settlementTax: Int?) =
                    settlementTax(JsonField.ofNullable(settlementTax))

                /**
                 * Alias for [Builder.settlementTax].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun settlementTax(settlementTax: Int) = settlementTax(settlementTax as Int?)

                /**
                 * Sets [Builder.settlementTax] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.settlementTax] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun settlementTax(settlementTax: JsonField<Int>) = apply {
                    this.settlementTax = settlementTax
                }

                /** Current status of the payment intent */
                fun status(status: IntentStatus?) = status(JsonField.ofNullable(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [IntentStatus] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<IntentStatus>) = apply { this.status = status }

                /** Identifier of the subscription if payment is part of a subscription */
                fun subscriptionId(subscriptionId: String?) =
                    subscriptionId(JsonField.ofNullable(subscriptionId))

                /**
                 * Sets [Builder.subscriptionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subscriptionId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun subscriptionId(subscriptionId: JsonField<String>) = apply {
                    this.subscriptionId = subscriptionId
                }

                /**
                 * Amount of tax collected in the currency's smallest unit (e.g. cents for USD, yen
                 * for JPY, fils for KWD)
                 */
                fun tax(tax: Int?) = tax(JsonField.ofNullable(tax))

                /**
                 * Alias for [Builder.tax].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun tax(tax: Int) = tax(tax as Int?)

                /**
                 * Sets [Builder.tax] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tax] with a well-typed [Int] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun tax(tax: JsonField<Int>) = apply { this.tax = tax }

                /** Timestamp when the payment was last updated */
                fun updatedAt(updatedAt: OffsetDateTime?) =
                    updatedAt(JsonField.ofNullable(updatedAt))

                /**
                 * Sets [Builder.updatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                    this.updatedAt = updatedAt
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("Payment")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun payloadType(payloadType: JsonValue) = apply { this.payloadType = payloadType }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Payment].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .billing()
                 * .brandId()
                 * .businessId()
                 * .createdAt()
                 * .currency()
                 * .customer()
                 * .digitalProductsDelivered()
                 * .disputes()
                 * .isUpdatePaymentMethod()
                 * .metadata()
                 * .paymentId()
                 * .paymentProvider()
                 * .refunds()
                 * .retryAttempt()
                 * .settlementAmount()
                 * .settlementCurrency()
                 * .totalAmount()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Payment =
                    Payment(
                        checkRequired("billing", billing),
                        checkRequired("brandId", brandId),
                        checkRequired("businessId", businessId),
                        checkRequired("createdAt", createdAt),
                        checkRequired("currency", currency),
                        checkRequired("customer", customer),
                        checkRequired("digitalProductsDelivered", digitalProductsDelivered),
                        checkRequired("disputes", disputes).map { it.toImmutable() },
                        checkRequired("isUpdatePaymentMethod", isUpdatePaymentMethod),
                        checkRequired("metadata", metadata),
                        checkRequired("paymentId", paymentId),
                        checkRequired("paymentProvider", paymentProvider),
                        checkRequired("refunds", refunds).map { it.toImmutable() },
                        checkRequired("retryAttempt", retryAttempt),
                        checkRequired("settlementAmount", settlementAmount),
                        checkRequired("settlementCurrency", settlementCurrency),
                        checkRequired("totalAmount", totalAmount),
                        cardHolderName,
                        cardIssuingCountry,
                        cardLastFour,
                        cardNetwork,
                        cardType,
                        checkoutSessionId,
                        (customFieldResponses ?: JsonMissing.of()).map { it.toImmutable() },
                        discountId,
                        (discounts ?: JsonMissing.of()).map { it.toImmutable() },
                        errorCode,
                        errorMessage,
                        invoiceId,
                        invoiceUrl,
                        paymentLink,
                        paymentMethod,
                        paymentMethodId,
                        paymentMethodType,
                        (productCart ?: JsonMissing.of()).map { it.toImmutable() },
                        refundStatus,
                        settlementTax,
                        status,
                        subscriptionId,
                        tax,
                        updatedAt,
                        payloadType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): Payment = apply {
                if (validated) {
                    return@apply
                }

                billing().validate()
                brandId()
                businessId()
                createdAt()
                currency().validate()
                customer().validate()
                digitalProductsDelivered()
                disputes().forEach { it.validate() }
                isUpdatePaymentMethod()
                metadata().validate()
                paymentId()
                paymentProvider().validate()
                refunds().forEach { it.validate() }
                retryAttempt()
                settlementAmount()
                settlementCurrency().validate()
                totalAmount()
                cardHolderName()
                cardIssuingCountry()?.validate()
                cardLastFour()
                cardNetwork()
                cardType()
                checkoutSessionId()
                customFieldResponses()?.forEach { it.validate() }
                discountId()
                discounts()?.forEach { it.validate() }
                errorCode()
                errorMessage()
                invoiceId()
                invoiceUrl()
                paymentLink()
                paymentMethod()
                paymentMethodId()
                paymentMethodType()
                productCart()?.forEach { it.validate() }
                refundStatus()?.validate()
                settlementTax()
                status()?.validate()
                subscriptionId()
                tax()
                updatedAt()
                _payloadType().let {
                    if (it != JsonValue.from("Payment")) {
                        throw DodoPaymentsInvalidDataException(
                            "'payloadType' is invalid, received $it"
                        )
                    }
                }
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
            internal fun validity(): Int =
                (billing.asKnown()?.validity() ?: 0) +
                    (if (brandId.asKnown() == null) 0 else 1) +
                    (if (businessId.asKnown() == null) 0 else 1) +
                    (if (createdAt.asKnown() == null) 0 else 1) +
                    (currency.asKnown()?.validity() ?: 0) +
                    (customer.asKnown()?.validity() ?: 0) +
                    (if (digitalProductsDelivered.asKnown() == null) 0 else 1) +
                    (disputes.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (isUpdatePaymentMethod.asKnown() == null) 0 else 1) +
                    (metadata.asKnown()?.validity() ?: 0) +
                    (if (paymentId.asKnown() == null) 0 else 1) +
                    (paymentProvider.asKnown()?.validity() ?: 0) +
                    (refunds.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (retryAttempt.asKnown() == null) 0 else 1) +
                    (if (settlementAmount.asKnown() == null) 0 else 1) +
                    (settlementCurrency.asKnown()?.validity() ?: 0) +
                    (if (totalAmount.asKnown() == null) 0 else 1) +
                    (if (cardHolderName.asKnown() == null) 0 else 1) +
                    (cardIssuingCountry.asKnown()?.validity() ?: 0) +
                    (if (cardLastFour.asKnown() == null) 0 else 1) +
                    (if (cardNetwork.asKnown() == null) 0 else 1) +
                    (if (cardType.asKnown() == null) 0 else 1) +
                    (if (checkoutSessionId.asKnown() == null) 0 else 1) +
                    (customFieldResponses.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (discountId.asKnown() == null) 0 else 1) +
                    (discounts.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (errorCode.asKnown() == null) 0 else 1) +
                    (if (errorMessage.asKnown() == null) 0 else 1) +
                    (if (invoiceId.asKnown() == null) 0 else 1) +
                    (if (invoiceUrl.asKnown() == null) 0 else 1) +
                    (if (paymentLink.asKnown() == null) 0 else 1) +
                    (if (paymentMethod.asKnown() == null) 0 else 1) +
                    (if (paymentMethodId.asKnown() == null) 0 else 1) +
                    (if (paymentMethodType.asKnown() == null) 0 else 1) +
                    (productCart.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (refundStatus.asKnown()?.validity() ?: 0) +
                    (if (settlementTax.asKnown() == null) 0 else 1) +
                    (status.asKnown()?.validity() ?: 0) +
                    (if (subscriptionId.asKnown() == null) 0 else 1) +
                    (if (tax.asKnown() == null) 0 else 1) +
                    (if (updatedAt.asKnown() == null) 0 else 1) +
                    payloadType.let { if (it == JsonValue.from("Payment")) 1 else 0 }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Payment &&
                    billing == other.billing &&
                    brandId == other.brandId &&
                    businessId == other.businessId &&
                    createdAt == other.createdAt &&
                    currency == other.currency &&
                    customer == other.customer &&
                    digitalProductsDelivered == other.digitalProductsDelivered &&
                    disputes == other.disputes &&
                    isUpdatePaymentMethod == other.isUpdatePaymentMethod &&
                    metadata == other.metadata &&
                    paymentId == other.paymentId &&
                    paymentProvider == other.paymentProvider &&
                    refunds == other.refunds &&
                    retryAttempt == other.retryAttempt &&
                    settlementAmount == other.settlementAmount &&
                    settlementCurrency == other.settlementCurrency &&
                    totalAmount == other.totalAmount &&
                    cardHolderName == other.cardHolderName &&
                    cardIssuingCountry == other.cardIssuingCountry &&
                    cardLastFour == other.cardLastFour &&
                    cardNetwork == other.cardNetwork &&
                    cardType == other.cardType &&
                    checkoutSessionId == other.checkoutSessionId &&
                    customFieldResponses == other.customFieldResponses &&
                    discountId == other.discountId &&
                    discounts == other.discounts &&
                    errorCode == other.errorCode &&
                    errorMessage == other.errorMessage &&
                    invoiceId == other.invoiceId &&
                    invoiceUrl == other.invoiceUrl &&
                    paymentLink == other.paymentLink &&
                    paymentMethod == other.paymentMethod &&
                    paymentMethodId == other.paymentMethodId &&
                    paymentMethodType == other.paymentMethodType &&
                    productCart == other.productCart &&
                    refundStatus == other.refundStatus &&
                    settlementTax == other.settlementTax &&
                    status == other.status &&
                    subscriptionId == other.subscriptionId &&
                    tax == other.tax &&
                    updatedAt == other.updatedAt &&
                    payloadType == other.payloadType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    billing,
                    brandId,
                    businessId,
                    createdAt,
                    currency,
                    customer,
                    digitalProductsDelivered,
                    disputes,
                    isUpdatePaymentMethod,
                    metadata,
                    paymentId,
                    paymentProvider,
                    refunds,
                    retryAttempt,
                    settlementAmount,
                    settlementCurrency,
                    totalAmount,
                    cardHolderName,
                    cardIssuingCountry,
                    cardLastFour,
                    cardNetwork,
                    cardType,
                    checkoutSessionId,
                    customFieldResponses,
                    discountId,
                    discounts,
                    errorCode,
                    errorMessage,
                    invoiceId,
                    invoiceUrl,
                    paymentLink,
                    paymentMethod,
                    paymentMethodId,
                    paymentMethodType,
                    productCart,
                    refundStatus,
                    settlementTax,
                    status,
                    subscriptionId,
                    tax,
                    updatedAt,
                    payloadType,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Payment{billing=$billing, brandId=$brandId, businessId=$businessId, createdAt=$createdAt, currency=$currency, customer=$customer, digitalProductsDelivered=$digitalProductsDelivered, disputes=$disputes, isUpdatePaymentMethod=$isUpdatePaymentMethod, metadata=$metadata, paymentId=$paymentId, paymentProvider=$paymentProvider, refunds=$refunds, retryAttempt=$retryAttempt, settlementAmount=$settlementAmount, settlementCurrency=$settlementCurrency, totalAmount=$totalAmount, cardHolderName=$cardHolderName, cardIssuingCountry=$cardIssuingCountry, cardLastFour=$cardLastFour, cardNetwork=$cardNetwork, cardType=$cardType, checkoutSessionId=$checkoutSessionId, customFieldResponses=$customFieldResponses, discountId=$discountId, discounts=$discounts, errorCode=$errorCode, errorMessage=$errorMessage, invoiceId=$invoiceId, invoiceUrl=$invoiceUrl, paymentLink=$paymentLink, paymentMethod=$paymentMethod, paymentMethodId=$paymentMethodId, paymentMethodType=$paymentMethodType, productCart=$productCart, refundStatus=$refundStatus, settlementTax=$settlementTax, status=$status, subscriptionId=$subscriptionId, tax=$tax, updatedAt=$updatedAt, payloadType=$payloadType, additionalProperties=$additionalProperties}"
        }

        /** Response struct representing subscription details */
        class Subscription
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val addons: JsonField<List<AddonCartResponseItem>>,
            private val billing: JsonField<BillingAddress>,
            private val brandId: JsonField<String>,
            private val cancelAtNextBillingDate: JsonField<Boolean>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val creditEntitlementCart: JsonField<List<CreditEntitlementCartResponse>>,
            private val currency: JsonField<Currency>,
            private val customer: JsonField<CustomerLimitedDetails>,
            private val metadata: JsonField<Metadata>,
            private val meterCreditEntitlementCart:
                JsonField<List<MeterCreditEntitlementCartResponse>>,
            private val meters: JsonField<List<MeterCartResponseItem>>,
            private val nextBillingDate: JsonField<OffsetDateTime>,
            private val onDemand: JsonField<Boolean>,
            private val paymentFrequencyCount: JsonField<Int>,
            private val paymentFrequencyInterval: JsonField<TimeInterval>,
            private val previousBillingDate: JsonField<OffsetDateTime>,
            private val productId: JsonField<String>,
            private val quantity: JsonField<Int>,
            private val recurringPreTaxAmount: JsonField<Int>,
            private val status: JsonField<SubscriptionStatus>,
            private val subscriptionId: JsonField<String>,
            private val subscriptionPeriodCount: JsonField<Int>,
            private val subscriptionPeriodInterval: JsonField<TimeInterval>,
            private val taxInclusive: JsonField<Boolean>,
            private val trialPeriodDays: JsonField<Int>,
            private val cancellationComment: JsonField<String>,
            private val cancellationFeedback: JsonField<CancellationFeedback>,
            private val cancelledAt: JsonField<OffsetDateTime>,
            private val customFieldResponses: JsonField<List<CustomFieldResponse>>,
            private val customerBusinessName: JsonField<String>,
            private val discountCyclesRemaining: JsonField<Int>,
            private val discountId: JsonField<String>,
            private val discounts: JsonField<List<DiscountDetail>>,
            private val expiresAt: JsonField<OffsetDateTime>,
            private val paymentMethodId: JsonField<String>,
            private val scheduledChange: JsonField<ScheduledPlanChange>,
            private val taxId: JsonField<String>,
            private val payloadType: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("addons")
                @ExcludeMissing
                addons: JsonField<List<AddonCartResponseItem>> = JsonMissing.of(),
                @JsonProperty("billing")
                @ExcludeMissing
                billing: JsonField<BillingAddress> = JsonMissing.of(),
                @JsonProperty("brand_id")
                @ExcludeMissing
                brandId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("cancel_at_next_billing_date")
                @ExcludeMissing
                cancelAtNextBillingDate: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("credit_entitlement_cart")
                @ExcludeMissing
                creditEntitlementCart: JsonField<List<CreditEntitlementCartResponse>> =
                    JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<Currency> = JsonMissing.of(),
                @JsonProperty("customer")
                @ExcludeMissing
                customer: JsonField<CustomerLimitedDetails> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonProperty("meter_credit_entitlement_cart")
                @ExcludeMissing
                meterCreditEntitlementCart: JsonField<List<MeterCreditEntitlementCartResponse>> =
                    JsonMissing.of(),
                @JsonProperty("meters")
                @ExcludeMissing
                meters: JsonField<List<MeterCartResponseItem>> = JsonMissing.of(),
                @JsonProperty("next_billing_date")
                @ExcludeMissing
                nextBillingDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("on_demand")
                @ExcludeMissing
                onDemand: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("payment_frequency_count")
                @ExcludeMissing
                paymentFrequencyCount: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("payment_frequency_interval")
                @ExcludeMissing
                paymentFrequencyInterval: JsonField<TimeInterval> = JsonMissing.of(),
                @JsonProperty("previous_billing_date")
                @ExcludeMissing
                previousBillingDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("product_id")
                @ExcludeMissing
                productId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                quantity: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("recurring_pre_tax_amount")
                @ExcludeMissing
                recurringPreTaxAmount: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<SubscriptionStatus> = JsonMissing.of(),
                @JsonProperty("subscription_id")
                @ExcludeMissing
                subscriptionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("subscription_period_count")
                @ExcludeMissing
                subscriptionPeriodCount: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("subscription_period_interval")
                @ExcludeMissing
                subscriptionPeriodInterval: JsonField<TimeInterval> = JsonMissing.of(),
                @JsonProperty("tax_inclusive")
                @ExcludeMissing
                taxInclusive: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("trial_period_days")
                @ExcludeMissing
                trialPeriodDays: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("cancellation_comment")
                @ExcludeMissing
                cancellationComment: JsonField<String> = JsonMissing.of(),
                @JsonProperty("cancellation_feedback")
                @ExcludeMissing
                cancellationFeedback: JsonField<CancellationFeedback> = JsonMissing.of(),
                @JsonProperty("cancelled_at")
                @ExcludeMissing
                cancelledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("custom_field_responses")
                @ExcludeMissing
                customFieldResponses: JsonField<List<CustomFieldResponse>> = JsonMissing.of(),
                @JsonProperty("customer_business_name")
                @ExcludeMissing
                customerBusinessName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("discount_cycles_remaining")
                @ExcludeMissing
                discountCyclesRemaining: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("discount_id")
                @ExcludeMissing
                discountId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("discounts")
                @ExcludeMissing
                discounts: JsonField<List<DiscountDetail>> = JsonMissing.of(),
                @JsonProperty("expires_at")
                @ExcludeMissing
                expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("payment_method_id")
                @ExcludeMissing
                paymentMethodId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("scheduled_change")
                @ExcludeMissing
                scheduledChange: JsonField<ScheduledPlanChange> = JsonMissing.of(),
                @JsonProperty("tax_id") @ExcludeMissing taxId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("payload_type")
                @ExcludeMissing
                payloadType: JsonValue = JsonMissing.of(),
            ) : this(
                addons,
                billing,
                brandId,
                cancelAtNextBillingDate,
                createdAt,
                creditEntitlementCart,
                currency,
                customer,
                metadata,
                meterCreditEntitlementCart,
                meters,
                nextBillingDate,
                onDemand,
                paymentFrequencyCount,
                paymentFrequencyInterval,
                previousBillingDate,
                productId,
                quantity,
                recurringPreTaxAmount,
                status,
                subscriptionId,
                subscriptionPeriodCount,
                subscriptionPeriodInterval,
                taxInclusive,
                trialPeriodDays,
                cancellationComment,
                cancellationFeedback,
                cancelledAt,
                customFieldResponses,
                customerBusinessName,
                discountCyclesRemaining,
                discountId,
                discounts,
                expiresAt,
                paymentMethodId,
                scheduledChange,
                taxId,
                payloadType,
                mutableMapOf(),
            )

            fun toSubscription(): Subscription =
                Subscription.builder()
                    .addons(addons)
                    .billing(billing)
                    .brandId(brandId)
                    .cancelAtNextBillingDate(cancelAtNextBillingDate)
                    .createdAt(createdAt)
                    .creditEntitlementCart(creditEntitlementCart)
                    .currency(currency)
                    .customer(customer)
                    .metadata(metadata)
                    .meterCreditEntitlementCart(meterCreditEntitlementCart)
                    .meters(meters)
                    .nextBillingDate(nextBillingDate)
                    .onDemand(onDemand)
                    .paymentFrequencyCount(paymentFrequencyCount)
                    .paymentFrequencyInterval(paymentFrequencyInterval)
                    .previousBillingDate(previousBillingDate)
                    .productId(productId)
                    .quantity(quantity)
                    .recurringPreTaxAmount(recurringPreTaxAmount)
                    .status(status)
                    .subscriptionId(subscriptionId)
                    .subscriptionPeriodCount(subscriptionPeriodCount)
                    .subscriptionPeriodInterval(subscriptionPeriodInterval)
                    .taxInclusive(taxInclusive)
                    .trialPeriodDays(trialPeriodDays)
                    .cancellationComment(cancellationComment)
                    .cancellationFeedback(cancellationFeedback)
                    .cancelledAt(cancelledAt)
                    .customFieldResponses(customFieldResponses)
                    .customerBusinessName(customerBusinessName)
                    .discountCyclesRemaining(discountCyclesRemaining)
                    .discountId(discountId)
                    .discounts(discounts)
                    .expiresAt(expiresAt)
                    .paymentMethodId(paymentMethodId)
                    .scheduledChange(scheduledChange)
                    .taxId(taxId)
                    .build()

            /**
             * Addons associated with this subscription
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun addons(): List<AddonCartResponseItem> = addons.getRequired("addons")

            /**
             * Billing address details for payments
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun billing(): BillingAddress = billing.getRequired("billing")

            /**
             * Brand id this subscription belongs to
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun brandId(): String = brandId.getRequired("brand_id")

            /**
             * Indicates if the subscription will cancel at the next billing date
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun cancelAtNextBillingDate(): Boolean =
                cancelAtNextBillingDate.getRequired("cancel_at_next_billing_date")

            /**
             * Timestamp when the subscription was created
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

            /**
             * Credit entitlement cart settings for this subscription
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun creditEntitlementCart(): List<CreditEntitlementCartResponse> =
                creditEntitlementCart.getRequired("credit_entitlement_cart")

            /**
             * Currency used for the subscription payments
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): Currency = currency.getRequired("currency")

            /**
             * Customer details associated with the subscription
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun customer(): CustomerLimitedDetails = customer.getRequired("customer")

            /**
             * Additional custom data associated with the subscription
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun metadata(): Metadata = metadata.getRequired("metadata")

            /**
             * Meter credit entitlement cart settings for this subscription
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun meterCreditEntitlementCart(): List<MeterCreditEntitlementCartResponse> =
                meterCreditEntitlementCart.getRequired("meter_credit_entitlement_cart")

            /**
             * Meters associated with this subscription (for usage-based billing)
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun meters(): List<MeterCartResponseItem> = meters.getRequired("meters")

            /**
             * Timestamp of the next scheduled billing. Indicates the end of current billing period
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun nextBillingDate(): OffsetDateTime = nextBillingDate.getRequired("next_billing_date")

            /**
             * Wether the subscription is on-demand or not
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun onDemand(): Boolean = onDemand.getRequired("on_demand")

            /**
             * Number of payment frequency intervals
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentFrequencyCount(): Int =
                paymentFrequencyCount.getRequired("payment_frequency_count")

            /**
             * Time interval for payment frequency (e.g. month, year)
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentFrequencyInterval(): TimeInterval =
                paymentFrequencyInterval.getRequired("payment_frequency_interval")

            /**
             * Timestamp of the last payment. Indicates the start of current billing period
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun previousBillingDate(): OffsetDateTime =
                previousBillingDate.getRequired("previous_billing_date")

            /**
             * Identifier of the product associated with this subscription
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun productId(): String = productId.getRequired("product_id")

            /**
             * Number of units/items included in the subscription
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun quantity(): Int = quantity.getRequired("quantity")

            /**
             * Amount charged before tax for each recurring payment in the currency's smallest unit
             * (cents for USD, yen for JPY, fils for KWD)
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun recurringPreTaxAmount(): Int =
                recurringPreTaxAmount.getRequired("recurring_pre_tax_amount")

            /**
             * Current status of the subscription
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun status(): SubscriptionStatus = status.getRequired("status")

            /**
             * Unique identifier for the subscription
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun subscriptionId(): String = subscriptionId.getRequired("subscription_id")

            /**
             * Number of subscription period intervals
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun subscriptionPeriodCount(): Int =
                subscriptionPeriodCount.getRequired("subscription_period_count")

            /**
             * Time interval for the subscription period (e.g. month, year)
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun subscriptionPeriodInterval(): TimeInterval =
                subscriptionPeriodInterval.getRequired("subscription_period_interval")

            /**
             * Indicates if the recurring_pre_tax_amount is tax inclusive
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun taxInclusive(): Boolean = taxInclusive.getRequired("tax_inclusive")

            /**
             * Number of days in the trial period (0 if no trial)
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun trialPeriodDays(): Int = trialPeriodDays.getRequired("trial_period_days")

            /**
             * Free-text cancellation comment, if any
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun cancellationComment(): String? =
                cancellationComment.getNullable("cancellation_comment")

            /**
             * Customer-supplied churn reason, if any
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun cancellationFeedback(): CancellationFeedback? =
                cancellationFeedback.getNullable("cancellation_feedback")

            /**
             * Cancelled timestamp if the subscription is cancelled
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun cancelledAt(): OffsetDateTime? = cancelledAt.getNullable("cancelled_at")

            /**
             * Customer's responses to custom fields collected during checkout
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun customFieldResponses(): List<CustomFieldResponse>? =
                customFieldResponses.getNullable("custom_field_responses")

            /**
             * Business / legal name associated with the tax id (B2B). When set this is used on the
             * invoice in place of the customer's personal name.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun customerBusinessName(): String? =
                customerBusinessName.getNullable("customer_business_name")

            /**
             * DEPRECATED: Use discounts[].cycles_remaining instead.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun discountCyclesRemaining(): Int? =
                discountCyclesRemaining.getNullable("discount_cycles_remaining")

            /**
             * DEPRECATED: Use discounts instead. Returns the first discount's ID if present.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun discountId(): String? = discountId.getNullable("discount_id")

            /**
             * All stacked discounts applied, ordered by position
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun discounts(): List<DiscountDetail>? = discounts.getNullable("discounts")

            /**
             * Timestamp when the subscription will expire
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun expiresAt(): OffsetDateTime? = expiresAt.getNullable("expires_at")

            /**
             * Saved payment method id used for recurring charges
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun paymentMethodId(): String? = paymentMethodId.getNullable("payment_method_id")

            /**
             * Scheduled plan change details, if any
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun scheduledChange(): ScheduledPlanChange? =
                scheduledChange.getNullable("scheduled_change")

            /**
             * Tax identifier provided for this subscription (if applicable)
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun taxId(): String? = taxId.getNullable("tax_id")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("Subscription")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("payload_type")
            @ExcludeMissing
            fun _payloadType(): JsonValue = payloadType

            /**
             * Returns the raw JSON value of [addons].
             *
             * Unlike [addons], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("addons")
            @ExcludeMissing
            fun _addons(): JsonField<List<AddonCartResponseItem>> = addons

            /**
             * Returns the raw JSON value of [billing].
             *
             * Unlike [billing], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("billing")
            @ExcludeMissing
            fun _billing(): JsonField<BillingAddress> = billing

            /**
             * Returns the raw JSON value of [brandId].
             *
             * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("brand_id") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

            /**
             * Returns the raw JSON value of [cancelAtNextBillingDate].
             *
             * Unlike [cancelAtNextBillingDate], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("cancel_at_next_billing_date")
            @ExcludeMissing
            fun _cancelAtNextBillingDate(): JsonField<Boolean> = cancelAtNextBillingDate

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [creditEntitlementCart].
             *
             * Unlike [creditEntitlementCart], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("credit_entitlement_cart")
            @ExcludeMissing
            fun _creditEntitlementCart(): JsonField<List<CreditEntitlementCartResponse>> =
                creditEntitlementCart

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun _currency(): JsonField<Currency> = currency

            /**
             * Returns the raw JSON value of [customer].
             *
             * Unlike [customer], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("customer")
            @ExcludeMissing
            fun _customer(): JsonField<CustomerLimitedDetails> = customer

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            /**
             * Returns the raw JSON value of [meterCreditEntitlementCart].
             *
             * Unlike [meterCreditEntitlementCart], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("meter_credit_entitlement_cart")
            @ExcludeMissing
            fun _meterCreditEntitlementCart(): JsonField<List<MeterCreditEntitlementCartResponse>> =
                meterCreditEntitlementCart

            /**
             * Returns the raw JSON value of [meters].
             *
             * Unlike [meters], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("meters")
            @ExcludeMissing
            fun _meters(): JsonField<List<MeterCartResponseItem>> = meters

            /**
             * Returns the raw JSON value of [nextBillingDate].
             *
             * Unlike [nextBillingDate], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("next_billing_date")
            @ExcludeMissing
            fun _nextBillingDate(): JsonField<OffsetDateTime> = nextBillingDate

            /**
             * Returns the raw JSON value of [onDemand].
             *
             * Unlike [onDemand], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("on_demand")
            @ExcludeMissing
            fun _onDemand(): JsonField<Boolean> = onDemand

            /**
             * Returns the raw JSON value of [paymentFrequencyCount].
             *
             * Unlike [paymentFrequencyCount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("payment_frequency_count")
            @ExcludeMissing
            fun _paymentFrequencyCount(): JsonField<Int> = paymentFrequencyCount

            /**
             * Returns the raw JSON value of [paymentFrequencyInterval].
             *
             * Unlike [paymentFrequencyInterval], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("payment_frequency_interval")
            @ExcludeMissing
            fun _paymentFrequencyInterval(): JsonField<TimeInterval> = paymentFrequencyInterval

            /**
             * Returns the raw JSON value of [previousBillingDate].
             *
             * Unlike [previousBillingDate], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("previous_billing_date")
            @ExcludeMissing
            fun _previousBillingDate(): JsonField<OffsetDateTime> = previousBillingDate

            /**
             * Returns the raw JSON value of [productId].
             *
             * Unlike [productId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("product_id")
            @ExcludeMissing
            fun _productId(): JsonField<String> = productId

            /**
             * Returns the raw JSON value of [quantity].
             *
             * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Int> = quantity

            /**
             * Returns the raw JSON value of [recurringPreTaxAmount].
             *
             * Unlike [recurringPreTaxAmount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("recurring_pre_tax_amount")
            @ExcludeMissing
            fun _recurringPreTaxAmount(): JsonField<Int> = recurringPreTaxAmount

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status")
            @ExcludeMissing
            fun _status(): JsonField<SubscriptionStatus> = status

            /**
             * Returns the raw JSON value of [subscriptionId].
             *
             * Unlike [subscriptionId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("subscription_id")
            @ExcludeMissing
            fun _subscriptionId(): JsonField<String> = subscriptionId

            /**
             * Returns the raw JSON value of [subscriptionPeriodCount].
             *
             * Unlike [subscriptionPeriodCount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("subscription_period_count")
            @ExcludeMissing
            fun _subscriptionPeriodCount(): JsonField<Int> = subscriptionPeriodCount

            /**
             * Returns the raw JSON value of [subscriptionPeriodInterval].
             *
             * Unlike [subscriptionPeriodInterval], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("subscription_period_interval")
            @ExcludeMissing
            fun _subscriptionPeriodInterval(): JsonField<TimeInterval> = subscriptionPeriodInterval

            /**
             * Returns the raw JSON value of [taxInclusive].
             *
             * Unlike [taxInclusive], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tax_inclusive")
            @ExcludeMissing
            fun _taxInclusive(): JsonField<Boolean> = taxInclusive

            /**
             * Returns the raw JSON value of [trialPeriodDays].
             *
             * Unlike [trialPeriodDays], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("trial_period_days")
            @ExcludeMissing
            fun _trialPeriodDays(): JsonField<Int> = trialPeriodDays

            /**
             * Returns the raw JSON value of [cancellationComment].
             *
             * Unlike [cancellationComment], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("cancellation_comment")
            @ExcludeMissing
            fun _cancellationComment(): JsonField<String> = cancellationComment

            /**
             * Returns the raw JSON value of [cancellationFeedback].
             *
             * Unlike [cancellationFeedback], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("cancellation_feedback")
            @ExcludeMissing
            fun _cancellationFeedback(): JsonField<CancellationFeedback> = cancellationFeedback

            /**
             * Returns the raw JSON value of [cancelledAt].
             *
             * Unlike [cancelledAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("cancelled_at")
            @ExcludeMissing
            fun _cancelledAt(): JsonField<OffsetDateTime> = cancelledAt

            /**
             * Returns the raw JSON value of [customFieldResponses].
             *
             * Unlike [customFieldResponses], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("custom_field_responses")
            @ExcludeMissing
            fun _customFieldResponses(): JsonField<List<CustomFieldResponse>> = customFieldResponses

            /**
             * Returns the raw JSON value of [customerBusinessName].
             *
             * Unlike [customerBusinessName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("customer_business_name")
            @ExcludeMissing
            fun _customerBusinessName(): JsonField<String> = customerBusinessName

            /**
             * Returns the raw JSON value of [discountCyclesRemaining].
             *
             * Unlike [discountCyclesRemaining], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("discount_cycles_remaining")
            @ExcludeMissing
            fun _discountCyclesRemaining(): JsonField<Int> = discountCyclesRemaining

            /**
             * Returns the raw JSON value of [discountId].
             *
             * Unlike [discountId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("discount_id")
            @ExcludeMissing
            fun _discountId(): JsonField<String> = discountId

            /**
             * Returns the raw JSON value of [discounts].
             *
             * Unlike [discounts], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("discounts")
            @ExcludeMissing
            fun _discounts(): JsonField<List<DiscountDetail>> = discounts

            /**
             * Returns the raw JSON value of [expiresAt].
             *
             * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("expires_at")
            @ExcludeMissing
            fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

            /**
             * Returns the raw JSON value of [paymentMethodId].
             *
             * Unlike [paymentMethodId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("payment_method_id")
            @ExcludeMissing
            fun _paymentMethodId(): JsonField<String> = paymentMethodId

            /**
             * Returns the raw JSON value of [scheduledChange].
             *
             * Unlike [scheduledChange], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("scheduled_change")
            @ExcludeMissing
            fun _scheduledChange(): JsonField<ScheduledPlanChange> = scheduledChange

            /**
             * Returns the raw JSON value of [taxId].
             *
             * Unlike [taxId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tax_id") @ExcludeMissing fun _taxId(): JsonField<String> = taxId

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
                 * Returns a mutable builder for constructing an instance of [Subscription].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .addons()
                 * .billing()
                 * .brandId()
                 * .cancelAtNextBillingDate()
                 * .createdAt()
                 * .creditEntitlementCart()
                 * .currency()
                 * .customer()
                 * .metadata()
                 * .meterCreditEntitlementCart()
                 * .meters()
                 * .nextBillingDate()
                 * .onDemand()
                 * .paymentFrequencyCount()
                 * .paymentFrequencyInterval()
                 * .previousBillingDate()
                 * .productId()
                 * .quantity()
                 * .recurringPreTaxAmount()
                 * .status()
                 * .subscriptionId()
                 * .subscriptionPeriodCount()
                 * .subscriptionPeriodInterval()
                 * .taxInclusive()
                 * .trialPeriodDays()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Subscription]. */
            class Builder internal constructor() {

                private var addons: JsonField<MutableList<AddonCartResponseItem>>? = null
                private var billing: JsonField<BillingAddress>? = null
                private var brandId: JsonField<String>? = null
                private var cancelAtNextBillingDate: JsonField<Boolean>? = null
                private var createdAt: JsonField<OffsetDateTime>? = null
                private var creditEntitlementCart:
                    JsonField<MutableList<CreditEntitlementCartResponse>>? =
                    null
                private var currency: JsonField<Currency>? = null
                private var customer: JsonField<CustomerLimitedDetails>? = null
                private var metadata: JsonField<Metadata>? = null
                private var meterCreditEntitlementCart:
                    JsonField<MutableList<MeterCreditEntitlementCartResponse>>? =
                    null
                private var meters: JsonField<MutableList<MeterCartResponseItem>>? = null
                private var nextBillingDate: JsonField<OffsetDateTime>? = null
                private var onDemand: JsonField<Boolean>? = null
                private var paymentFrequencyCount: JsonField<Int>? = null
                private var paymentFrequencyInterval: JsonField<TimeInterval>? = null
                private var previousBillingDate: JsonField<OffsetDateTime>? = null
                private var productId: JsonField<String>? = null
                private var quantity: JsonField<Int>? = null
                private var recurringPreTaxAmount: JsonField<Int>? = null
                private var status: JsonField<SubscriptionStatus>? = null
                private var subscriptionId: JsonField<String>? = null
                private var subscriptionPeriodCount: JsonField<Int>? = null
                private var subscriptionPeriodInterval: JsonField<TimeInterval>? = null
                private var taxInclusive: JsonField<Boolean>? = null
                private var trialPeriodDays: JsonField<Int>? = null
                private var cancellationComment: JsonField<String> = JsonMissing.of()
                private var cancellationFeedback: JsonField<CancellationFeedback> = JsonMissing.of()
                private var cancelledAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var customFieldResponses: JsonField<MutableList<CustomFieldResponse>>? =
                    null
                private var customerBusinessName: JsonField<String> = JsonMissing.of()
                private var discountCyclesRemaining: JsonField<Int> = JsonMissing.of()
                private var discountId: JsonField<String> = JsonMissing.of()
                private var discounts: JsonField<MutableList<DiscountDetail>>? = null
                private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var paymentMethodId: JsonField<String> = JsonMissing.of()
                private var scheduledChange: JsonField<ScheduledPlanChange> = JsonMissing.of()
                private var taxId: JsonField<String> = JsonMissing.of()
                private var payloadType: JsonValue = JsonValue.from("Subscription")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(subscription: Subscription) = apply {
                    addons = subscription.addons.map { it.toMutableList() }
                    billing = subscription.billing
                    brandId = subscription.brandId
                    cancelAtNextBillingDate = subscription.cancelAtNextBillingDate
                    createdAt = subscription.createdAt
                    creditEntitlementCart =
                        subscription.creditEntitlementCart.map { it.toMutableList() }
                    currency = subscription.currency
                    customer = subscription.customer
                    metadata = subscription.metadata
                    meterCreditEntitlementCart =
                        subscription.meterCreditEntitlementCart.map { it.toMutableList() }
                    meters = subscription.meters.map { it.toMutableList() }
                    nextBillingDate = subscription.nextBillingDate
                    onDemand = subscription.onDemand
                    paymentFrequencyCount = subscription.paymentFrequencyCount
                    paymentFrequencyInterval = subscription.paymentFrequencyInterval
                    previousBillingDate = subscription.previousBillingDate
                    productId = subscription.productId
                    quantity = subscription.quantity
                    recurringPreTaxAmount = subscription.recurringPreTaxAmount
                    status = subscription.status
                    subscriptionId = subscription.subscriptionId
                    subscriptionPeriodCount = subscription.subscriptionPeriodCount
                    subscriptionPeriodInterval = subscription.subscriptionPeriodInterval
                    taxInclusive = subscription.taxInclusive
                    trialPeriodDays = subscription.trialPeriodDays
                    cancellationComment = subscription.cancellationComment
                    cancellationFeedback = subscription.cancellationFeedback
                    cancelledAt = subscription.cancelledAt
                    customFieldResponses =
                        subscription.customFieldResponses.map { it.toMutableList() }
                    customerBusinessName = subscription.customerBusinessName
                    discountCyclesRemaining = subscription.discountCyclesRemaining
                    discountId = subscription.discountId
                    discounts = subscription.discounts.map { it.toMutableList() }
                    expiresAt = subscription.expiresAt
                    paymentMethodId = subscription.paymentMethodId
                    scheduledChange = subscription.scheduledChange
                    taxId = subscription.taxId
                    payloadType = subscription.payloadType
                    additionalProperties = subscription.additionalProperties.toMutableMap()
                }

                /** Addons associated with this subscription */
                fun addons(addons: List<AddonCartResponseItem>) = addons(JsonField.of(addons))

                /**
                 * Sets [Builder.addons] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.addons] with a well-typed
                 * `List<AddonCartResponseItem>` value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun addons(addons: JsonField<List<AddonCartResponseItem>>) = apply {
                    this.addons = addons.map { it.toMutableList() }
                }

                /**
                 * Adds a single [AddonCartResponseItem] to [addons].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAddon(addon: AddonCartResponseItem) = apply {
                    addons =
                        (addons ?: JsonField.of(mutableListOf())).also {
                            checkKnown("addons", it).add(addon)
                        }
                }

                /** Billing address details for payments */
                fun billing(billing: BillingAddress) = billing(JsonField.of(billing))

                /**
                 * Sets [Builder.billing] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billing] with a well-typed [BillingAddress]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun billing(billing: JsonField<BillingAddress>) = apply { this.billing = billing }

                /** Brand id this subscription belongs to */
                fun brandId(brandId: String) = brandId(JsonField.of(brandId))

                /**
                 * Sets [Builder.brandId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.brandId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

                /** Indicates if the subscription will cancel at the next billing date */
                fun cancelAtNextBillingDate(cancelAtNextBillingDate: Boolean) =
                    cancelAtNextBillingDate(JsonField.of(cancelAtNextBillingDate))

                /**
                 * Sets [Builder.cancelAtNextBillingDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cancelAtNextBillingDate] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun cancelAtNextBillingDate(cancelAtNextBillingDate: JsonField<Boolean>) = apply {
                    this.cancelAtNextBillingDate = cancelAtNextBillingDate
                }

                /** Timestamp when the subscription was created */
                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                /** Credit entitlement cart settings for this subscription */
                fun creditEntitlementCart(
                    creditEntitlementCart: List<CreditEntitlementCartResponse>
                ) = creditEntitlementCart(JsonField.of(creditEntitlementCart))

                /**
                 * Sets [Builder.creditEntitlementCart] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.creditEntitlementCart] with a well-typed
                 * `List<CreditEntitlementCartResponse>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun creditEntitlementCart(
                    creditEntitlementCart: JsonField<List<CreditEntitlementCartResponse>>
                ) = apply {
                    this.creditEntitlementCart = creditEntitlementCart.map { it.toMutableList() }
                }

                /**
                 * Adds a single [CreditEntitlementCartResponse] to [Builder.creditEntitlementCart].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addCreditEntitlementCart(creditEntitlementCart: CreditEntitlementCartResponse) =
                    apply {
                        this.creditEntitlementCart =
                            (this.creditEntitlementCart ?: JsonField.of(mutableListOf())).also {
                                checkKnown("creditEntitlementCart", it).add(creditEntitlementCart)
                            }
                    }

                /** Currency used for the subscription payments */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [Currency] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** Customer details associated with the subscription */
                fun customer(customer: CustomerLimitedDetails) = customer(JsonField.of(customer))

                /**
                 * Sets [Builder.customer] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customer] with a well-typed
                 * [CustomerLimitedDetails] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun customer(customer: JsonField<CustomerLimitedDetails>) = apply {
                    this.customer = customer
                }

                /** Additional custom data associated with the subscription */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                /** Meter credit entitlement cart settings for this subscription */
                fun meterCreditEntitlementCart(
                    meterCreditEntitlementCart: List<MeterCreditEntitlementCartResponse>
                ) = meterCreditEntitlementCart(JsonField.of(meterCreditEntitlementCart))

                /**
                 * Sets [Builder.meterCreditEntitlementCart] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.meterCreditEntitlementCart] with a well-typed
                 * `List<MeterCreditEntitlementCartResponse>` value instead. This method is
                 * primarily for setting the field to an undocumented or not yet supported value.
                 */
                fun meterCreditEntitlementCart(
                    meterCreditEntitlementCart: JsonField<List<MeterCreditEntitlementCartResponse>>
                ) = apply {
                    this.meterCreditEntitlementCart =
                        meterCreditEntitlementCart.map { it.toMutableList() }
                }

                /**
                 * Adds a single [MeterCreditEntitlementCartResponse] to
                 * [Builder.meterCreditEntitlementCart].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addMeterCreditEntitlementCart(
                    meterCreditEntitlementCart: MeterCreditEntitlementCartResponse
                ) = apply {
                    this.meterCreditEntitlementCart =
                        (this.meterCreditEntitlementCart ?: JsonField.of(mutableListOf())).also {
                            checkKnown("meterCreditEntitlementCart", it)
                                .add(meterCreditEntitlementCart)
                        }
                }

                /** Meters associated with this subscription (for usage-based billing) */
                fun meters(meters: List<MeterCartResponseItem>) = meters(JsonField.of(meters))

                /**
                 * Sets [Builder.meters] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.meters] with a well-typed
                 * `List<MeterCartResponseItem>` value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun meters(meters: JsonField<List<MeterCartResponseItem>>) = apply {
                    this.meters = meters.map { it.toMutableList() }
                }

                /**
                 * Adds a single [MeterCartResponseItem] to [meters].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addMeter(meter: MeterCartResponseItem) = apply {
                    meters =
                        (meters ?: JsonField.of(mutableListOf())).also {
                            checkKnown("meters", it).add(meter)
                        }
                }

                /**
                 * Timestamp of the next scheduled billing. Indicates the end of current billing
                 * period
                 */
                fun nextBillingDate(nextBillingDate: OffsetDateTime) =
                    nextBillingDate(JsonField.of(nextBillingDate))

                /**
                 * Sets [Builder.nextBillingDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.nextBillingDate] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun nextBillingDate(nextBillingDate: JsonField<OffsetDateTime>) = apply {
                    this.nextBillingDate = nextBillingDate
                }

                /** Wether the subscription is on-demand or not */
                fun onDemand(onDemand: Boolean) = onDemand(JsonField.of(onDemand))

                /**
                 * Sets [Builder.onDemand] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.onDemand] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun onDemand(onDemand: JsonField<Boolean>) = apply { this.onDemand = onDemand }

                /** Number of payment frequency intervals */
                fun paymentFrequencyCount(paymentFrequencyCount: Int) =
                    paymentFrequencyCount(JsonField.of(paymentFrequencyCount))

                /**
                 * Sets [Builder.paymentFrequencyCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentFrequencyCount] with a well-typed [Int]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun paymentFrequencyCount(paymentFrequencyCount: JsonField<Int>) = apply {
                    this.paymentFrequencyCount = paymentFrequencyCount
                }

                /** Time interval for payment frequency (e.g. month, year) */
                fun paymentFrequencyInterval(paymentFrequencyInterval: TimeInterval) =
                    paymentFrequencyInterval(JsonField.of(paymentFrequencyInterval))

                /**
                 * Sets [Builder.paymentFrequencyInterval] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentFrequencyInterval] with a well-typed
                 * [TimeInterval] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun paymentFrequencyInterval(paymentFrequencyInterval: JsonField<TimeInterval>) =
                    apply {
                        this.paymentFrequencyInterval = paymentFrequencyInterval
                    }

                /** Timestamp of the last payment. Indicates the start of current billing period */
                fun previousBillingDate(previousBillingDate: OffsetDateTime) =
                    previousBillingDate(JsonField.of(previousBillingDate))

                /**
                 * Sets [Builder.previousBillingDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.previousBillingDate] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun previousBillingDate(previousBillingDate: JsonField<OffsetDateTime>) = apply {
                    this.previousBillingDate = previousBillingDate
                }

                /** Identifier of the product associated with this subscription */
                fun productId(productId: String) = productId(JsonField.of(productId))

                /**
                 * Sets [Builder.productId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.productId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun productId(productId: JsonField<String>) = apply { this.productId = productId }

                /** Number of units/items included in the subscription */
                fun quantity(quantity: Int) = quantity(JsonField.of(quantity))

                /**
                 * Sets [Builder.quantity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.quantity] with a well-typed [Int] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun quantity(quantity: JsonField<Int>) = apply { this.quantity = quantity }

                /**
                 * Amount charged before tax for each recurring payment in the currency's smallest
                 * unit (cents for USD, yen for JPY, fils for KWD)
                 */
                fun recurringPreTaxAmount(recurringPreTaxAmount: Int) =
                    recurringPreTaxAmount(JsonField.of(recurringPreTaxAmount))

                /**
                 * Sets [Builder.recurringPreTaxAmount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recurringPreTaxAmount] with a well-typed [Int]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun recurringPreTaxAmount(recurringPreTaxAmount: JsonField<Int>) = apply {
                    this.recurringPreTaxAmount = recurringPreTaxAmount
                }

                /** Current status of the subscription */
                fun status(status: SubscriptionStatus) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [SubscriptionStatus]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun status(status: JsonField<SubscriptionStatus>) = apply { this.status = status }

                /** Unique identifier for the subscription */
                fun subscriptionId(subscriptionId: String) =
                    subscriptionId(JsonField.of(subscriptionId))

                /**
                 * Sets [Builder.subscriptionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subscriptionId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun subscriptionId(subscriptionId: JsonField<String>) = apply {
                    this.subscriptionId = subscriptionId
                }

                /** Number of subscription period intervals */
                fun subscriptionPeriodCount(subscriptionPeriodCount: Int) =
                    subscriptionPeriodCount(JsonField.of(subscriptionPeriodCount))

                /**
                 * Sets [Builder.subscriptionPeriodCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subscriptionPeriodCount] with a well-typed [Int]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun subscriptionPeriodCount(subscriptionPeriodCount: JsonField<Int>) = apply {
                    this.subscriptionPeriodCount = subscriptionPeriodCount
                }

                /** Time interval for the subscription period (e.g. month, year) */
                fun subscriptionPeriodInterval(subscriptionPeriodInterval: TimeInterval) =
                    subscriptionPeriodInterval(JsonField.of(subscriptionPeriodInterval))

                /**
                 * Sets [Builder.subscriptionPeriodInterval] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subscriptionPeriodInterval] with a well-typed
                 * [TimeInterval] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun subscriptionPeriodInterval(
                    subscriptionPeriodInterval: JsonField<TimeInterval>
                ) = apply { this.subscriptionPeriodInterval = subscriptionPeriodInterval }

                /** Indicates if the recurring_pre_tax_amount is tax inclusive */
                fun taxInclusive(taxInclusive: Boolean) = taxInclusive(JsonField.of(taxInclusive))

                /**
                 * Sets [Builder.taxInclusive] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taxInclusive] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun taxInclusive(taxInclusive: JsonField<Boolean>) = apply {
                    this.taxInclusive = taxInclusive
                }

                /** Number of days in the trial period (0 if no trial) */
                fun trialPeriodDays(trialPeriodDays: Int) =
                    trialPeriodDays(JsonField.of(trialPeriodDays))

                /**
                 * Sets [Builder.trialPeriodDays] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.trialPeriodDays] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun trialPeriodDays(trialPeriodDays: JsonField<Int>) = apply {
                    this.trialPeriodDays = trialPeriodDays
                }

                /** Free-text cancellation comment, if any */
                fun cancellationComment(cancellationComment: String?) =
                    cancellationComment(JsonField.ofNullable(cancellationComment))

                /**
                 * Sets [Builder.cancellationComment] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cancellationComment] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun cancellationComment(cancellationComment: JsonField<String>) = apply {
                    this.cancellationComment = cancellationComment
                }

                /** Customer-supplied churn reason, if any */
                fun cancellationFeedback(cancellationFeedback: CancellationFeedback?) =
                    cancellationFeedback(JsonField.ofNullable(cancellationFeedback))

                /**
                 * Sets [Builder.cancellationFeedback] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cancellationFeedback] with a well-typed
                 * [CancellationFeedback] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun cancellationFeedback(cancellationFeedback: JsonField<CancellationFeedback>) =
                    apply {
                        this.cancellationFeedback = cancellationFeedback
                    }

                /** Cancelled timestamp if the subscription is cancelled */
                fun cancelledAt(cancelledAt: OffsetDateTime?) =
                    cancelledAt(JsonField.ofNullable(cancelledAt))

                /**
                 * Sets [Builder.cancelledAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cancelledAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun cancelledAt(cancelledAt: JsonField<OffsetDateTime>) = apply {
                    this.cancelledAt = cancelledAt
                }

                /** Customer's responses to custom fields collected during checkout */
                fun customFieldResponses(customFieldResponses: List<CustomFieldResponse>?) =
                    customFieldResponses(JsonField.ofNullable(customFieldResponses))

                /**
                 * Sets [Builder.customFieldResponses] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customFieldResponses] with a well-typed
                 * `List<CustomFieldResponse>` value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun customFieldResponses(
                    customFieldResponses: JsonField<List<CustomFieldResponse>>
                ) = apply {
                    this.customFieldResponses = customFieldResponses.map { it.toMutableList() }
                }

                /**
                 * Adds a single [CustomFieldResponse] to [customFieldResponses].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addCustomFieldResponse(customFieldResponse: CustomFieldResponse) = apply {
                    customFieldResponses =
                        (customFieldResponses ?: JsonField.of(mutableListOf())).also {
                            checkKnown("customFieldResponses", it).add(customFieldResponse)
                        }
                }

                /**
                 * Business / legal name associated with the tax id (B2B). When set this is used on
                 * the invoice in place of the customer's personal name.
                 */
                fun customerBusinessName(customerBusinessName: String?) =
                    customerBusinessName(JsonField.ofNullable(customerBusinessName))

                /**
                 * Sets [Builder.customerBusinessName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customerBusinessName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun customerBusinessName(customerBusinessName: JsonField<String>) = apply {
                    this.customerBusinessName = customerBusinessName
                }

                /** DEPRECATED: Use discounts[].cycles_remaining instead. */
                fun discountCyclesRemaining(discountCyclesRemaining: Int?) =
                    discountCyclesRemaining(JsonField.ofNullable(discountCyclesRemaining))

                /**
                 * Alias for [Builder.discountCyclesRemaining].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun discountCyclesRemaining(discountCyclesRemaining: Int) =
                    discountCyclesRemaining(discountCyclesRemaining as Int?)

                /**
                 * Sets [Builder.discountCyclesRemaining] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.discountCyclesRemaining] with a well-typed [Int]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun discountCyclesRemaining(discountCyclesRemaining: JsonField<Int>) = apply {
                    this.discountCyclesRemaining = discountCyclesRemaining
                }

                /**
                 * DEPRECATED: Use discounts instead. Returns the first discount's ID if present.
                 */
                fun discountId(discountId: String?) = discountId(JsonField.ofNullable(discountId))

                /**
                 * Sets [Builder.discountId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.discountId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun discountId(discountId: JsonField<String>) = apply {
                    this.discountId = discountId
                }

                /** All stacked discounts applied, ordered by position */
                fun discounts(discounts: List<DiscountDetail>?) =
                    discounts(JsonField.ofNullable(discounts))

                /**
                 * Sets [Builder.discounts] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.discounts] with a well-typed
                 * `List<DiscountDetail>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun discounts(discounts: JsonField<List<DiscountDetail>>) = apply {
                    this.discounts = discounts.map { it.toMutableList() }
                }

                /**
                 * Adds a single [DiscountDetail] to [discounts].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addDiscount(discount: DiscountDetail) = apply {
                    discounts =
                        (discounts ?: JsonField.of(mutableListOf())).also {
                            checkKnown("discounts", it).add(discount)
                        }
                }

                /** Timestamp when the subscription will expire */
                fun expiresAt(expiresAt: OffsetDateTime?) =
                    expiresAt(JsonField.ofNullable(expiresAt))

                /**
                 * Sets [Builder.expiresAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                    this.expiresAt = expiresAt
                }

                /** Saved payment method id used for recurring charges */
                fun paymentMethodId(paymentMethodId: String?) =
                    paymentMethodId(JsonField.ofNullable(paymentMethodId))

                /**
                 * Sets [Builder.paymentMethodId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentMethodId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun paymentMethodId(paymentMethodId: JsonField<String>) = apply {
                    this.paymentMethodId = paymentMethodId
                }

                /** Scheduled plan change details, if any */
                fun scheduledChange(scheduledChange: ScheduledPlanChange?) =
                    scheduledChange(JsonField.ofNullable(scheduledChange))

                /**
                 * Sets [Builder.scheduledChange] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.scheduledChange] with a well-typed
                 * [ScheduledPlanChange] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun scheduledChange(scheduledChange: JsonField<ScheduledPlanChange>) = apply {
                    this.scheduledChange = scheduledChange
                }

                /** Tax identifier provided for this subscription (if applicable) */
                fun taxId(taxId: String?) = taxId(JsonField.ofNullable(taxId))

                /**
                 * Sets [Builder.taxId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taxId] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun taxId(taxId: JsonField<String>) = apply { this.taxId = taxId }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("Subscription")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun payloadType(payloadType: JsonValue) = apply { this.payloadType = payloadType }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Subscription].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .addons()
                 * .billing()
                 * .brandId()
                 * .cancelAtNextBillingDate()
                 * .createdAt()
                 * .creditEntitlementCart()
                 * .currency()
                 * .customer()
                 * .metadata()
                 * .meterCreditEntitlementCart()
                 * .meters()
                 * .nextBillingDate()
                 * .onDemand()
                 * .paymentFrequencyCount()
                 * .paymentFrequencyInterval()
                 * .previousBillingDate()
                 * .productId()
                 * .quantity()
                 * .recurringPreTaxAmount()
                 * .status()
                 * .subscriptionId()
                 * .subscriptionPeriodCount()
                 * .subscriptionPeriodInterval()
                 * .taxInclusive()
                 * .trialPeriodDays()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Subscription =
                    Subscription(
                        checkRequired("addons", addons).map { it.toImmutable() },
                        checkRequired("billing", billing),
                        checkRequired("brandId", brandId),
                        checkRequired("cancelAtNextBillingDate", cancelAtNextBillingDate),
                        checkRequired("createdAt", createdAt),
                        checkRequired("creditEntitlementCart", creditEntitlementCart).map {
                            it.toImmutable()
                        },
                        checkRequired("currency", currency),
                        checkRequired("customer", customer),
                        checkRequired("metadata", metadata),
                        checkRequired("meterCreditEntitlementCart", meterCreditEntitlementCart)
                            .map { it.toImmutable() },
                        checkRequired("meters", meters).map { it.toImmutable() },
                        checkRequired("nextBillingDate", nextBillingDate),
                        checkRequired("onDemand", onDemand),
                        checkRequired("paymentFrequencyCount", paymentFrequencyCount),
                        checkRequired("paymentFrequencyInterval", paymentFrequencyInterval),
                        checkRequired("previousBillingDate", previousBillingDate),
                        checkRequired("productId", productId),
                        checkRequired("quantity", quantity),
                        checkRequired("recurringPreTaxAmount", recurringPreTaxAmount),
                        checkRequired("status", status),
                        checkRequired("subscriptionId", subscriptionId),
                        checkRequired("subscriptionPeriodCount", subscriptionPeriodCount),
                        checkRequired("subscriptionPeriodInterval", subscriptionPeriodInterval),
                        checkRequired("taxInclusive", taxInclusive),
                        checkRequired("trialPeriodDays", trialPeriodDays),
                        cancellationComment,
                        cancellationFeedback,
                        cancelledAt,
                        (customFieldResponses ?: JsonMissing.of()).map { it.toImmutable() },
                        customerBusinessName,
                        discountCyclesRemaining,
                        discountId,
                        (discounts ?: JsonMissing.of()).map { it.toImmutable() },
                        expiresAt,
                        paymentMethodId,
                        scheduledChange,
                        taxId,
                        payloadType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): Subscription = apply {
                if (validated) {
                    return@apply
                }

                addons().forEach { it.validate() }
                billing().validate()
                brandId()
                cancelAtNextBillingDate()
                createdAt()
                creditEntitlementCart().forEach { it.validate() }
                currency().validate()
                customer().validate()
                metadata().validate()
                meterCreditEntitlementCart().forEach { it.validate() }
                meters().forEach { it.validate() }
                nextBillingDate()
                onDemand()
                paymentFrequencyCount()
                paymentFrequencyInterval().validate()
                previousBillingDate()
                productId()
                quantity()
                recurringPreTaxAmount()
                status().validate()
                subscriptionId()
                subscriptionPeriodCount()
                subscriptionPeriodInterval().validate()
                taxInclusive()
                trialPeriodDays()
                cancellationComment()
                cancellationFeedback()?.validate()
                cancelledAt()
                customFieldResponses()?.forEach { it.validate() }
                customerBusinessName()
                discountCyclesRemaining()
                discountId()
                discounts()?.forEach { it.validate() }
                expiresAt()
                paymentMethodId()
                scheduledChange()?.validate()
                taxId()
                _payloadType().let {
                    if (it != JsonValue.from("Subscription")) {
                        throw DodoPaymentsInvalidDataException(
                            "'payloadType' is invalid, received $it"
                        )
                    }
                }
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
            internal fun validity(): Int =
                (addons.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (billing.asKnown()?.validity() ?: 0) +
                    (if (brandId.asKnown() == null) 0 else 1) +
                    (if (cancelAtNextBillingDate.asKnown() == null) 0 else 1) +
                    (if (createdAt.asKnown() == null) 0 else 1) +
                    (creditEntitlementCart.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (currency.asKnown()?.validity() ?: 0) +
                    (customer.asKnown()?.validity() ?: 0) +
                    (metadata.asKnown()?.validity() ?: 0) +
                    (meterCreditEntitlementCart.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (meters.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (nextBillingDate.asKnown() == null) 0 else 1) +
                    (if (onDemand.asKnown() == null) 0 else 1) +
                    (if (paymentFrequencyCount.asKnown() == null) 0 else 1) +
                    (paymentFrequencyInterval.asKnown()?.validity() ?: 0) +
                    (if (previousBillingDate.asKnown() == null) 0 else 1) +
                    (if (productId.asKnown() == null) 0 else 1) +
                    (if (quantity.asKnown() == null) 0 else 1) +
                    (if (recurringPreTaxAmount.asKnown() == null) 0 else 1) +
                    (status.asKnown()?.validity() ?: 0) +
                    (if (subscriptionId.asKnown() == null) 0 else 1) +
                    (if (subscriptionPeriodCount.asKnown() == null) 0 else 1) +
                    (subscriptionPeriodInterval.asKnown()?.validity() ?: 0) +
                    (if (taxInclusive.asKnown() == null) 0 else 1) +
                    (if (trialPeriodDays.asKnown() == null) 0 else 1) +
                    (if (cancellationComment.asKnown() == null) 0 else 1) +
                    (cancellationFeedback.asKnown()?.validity() ?: 0) +
                    (if (cancelledAt.asKnown() == null) 0 else 1) +
                    (customFieldResponses.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (customerBusinessName.asKnown() == null) 0 else 1) +
                    (if (discountCyclesRemaining.asKnown() == null) 0 else 1) +
                    (if (discountId.asKnown() == null) 0 else 1) +
                    (discounts.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (expiresAt.asKnown() == null) 0 else 1) +
                    (if (paymentMethodId.asKnown() == null) 0 else 1) +
                    (scheduledChange.asKnown()?.validity() ?: 0) +
                    (if (taxId.asKnown() == null) 0 else 1) +
                    payloadType.let { if (it == JsonValue.from("Subscription")) 1 else 0 }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Subscription &&
                    addons == other.addons &&
                    billing == other.billing &&
                    brandId == other.brandId &&
                    cancelAtNextBillingDate == other.cancelAtNextBillingDate &&
                    createdAt == other.createdAt &&
                    creditEntitlementCart == other.creditEntitlementCart &&
                    currency == other.currency &&
                    customer == other.customer &&
                    metadata == other.metadata &&
                    meterCreditEntitlementCart == other.meterCreditEntitlementCart &&
                    meters == other.meters &&
                    nextBillingDate == other.nextBillingDate &&
                    onDemand == other.onDemand &&
                    paymentFrequencyCount == other.paymentFrequencyCount &&
                    paymentFrequencyInterval == other.paymentFrequencyInterval &&
                    previousBillingDate == other.previousBillingDate &&
                    productId == other.productId &&
                    quantity == other.quantity &&
                    recurringPreTaxAmount == other.recurringPreTaxAmount &&
                    status == other.status &&
                    subscriptionId == other.subscriptionId &&
                    subscriptionPeriodCount == other.subscriptionPeriodCount &&
                    subscriptionPeriodInterval == other.subscriptionPeriodInterval &&
                    taxInclusive == other.taxInclusive &&
                    trialPeriodDays == other.trialPeriodDays &&
                    cancellationComment == other.cancellationComment &&
                    cancellationFeedback == other.cancellationFeedback &&
                    cancelledAt == other.cancelledAt &&
                    customFieldResponses == other.customFieldResponses &&
                    customerBusinessName == other.customerBusinessName &&
                    discountCyclesRemaining == other.discountCyclesRemaining &&
                    discountId == other.discountId &&
                    discounts == other.discounts &&
                    expiresAt == other.expiresAt &&
                    paymentMethodId == other.paymentMethodId &&
                    scheduledChange == other.scheduledChange &&
                    taxId == other.taxId &&
                    payloadType == other.payloadType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    addons,
                    billing,
                    brandId,
                    cancelAtNextBillingDate,
                    createdAt,
                    creditEntitlementCart,
                    currency,
                    customer,
                    metadata,
                    meterCreditEntitlementCart,
                    meters,
                    nextBillingDate,
                    onDemand,
                    paymentFrequencyCount,
                    paymentFrequencyInterval,
                    previousBillingDate,
                    productId,
                    quantity,
                    recurringPreTaxAmount,
                    status,
                    subscriptionId,
                    subscriptionPeriodCount,
                    subscriptionPeriodInterval,
                    taxInclusive,
                    trialPeriodDays,
                    cancellationComment,
                    cancellationFeedback,
                    cancelledAt,
                    customFieldResponses,
                    customerBusinessName,
                    discountCyclesRemaining,
                    discountId,
                    discounts,
                    expiresAt,
                    paymentMethodId,
                    scheduledChange,
                    taxId,
                    payloadType,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Subscription{addons=$addons, billing=$billing, brandId=$brandId, cancelAtNextBillingDate=$cancelAtNextBillingDate, createdAt=$createdAt, creditEntitlementCart=$creditEntitlementCart, currency=$currency, customer=$customer, metadata=$metadata, meterCreditEntitlementCart=$meterCreditEntitlementCart, meters=$meters, nextBillingDate=$nextBillingDate, onDemand=$onDemand, paymentFrequencyCount=$paymentFrequencyCount, paymentFrequencyInterval=$paymentFrequencyInterval, previousBillingDate=$previousBillingDate, productId=$productId, quantity=$quantity, recurringPreTaxAmount=$recurringPreTaxAmount, status=$status, subscriptionId=$subscriptionId, subscriptionPeriodCount=$subscriptionPeriodCount, subscriptionPeriodInterval=$subscriptionPeriodInterval, taxInclusive=$taxInclusive, trialPeriodDays=$trialPeriodDays, cancellationComment=$cancellationComment, cancellationFeedback=$cancellationFeedback, cancelledAt=$cancelledAt, customFieldResponses=$customFieldResponses, customerBusinessName=$customerBusinessName, discountCyclesRemaining=$discountCyclesRemaining, discountId=$discountId, discounts=$discounts, expiresAt=$expiresAt, paymentMethodId=$paymentMethodId, scheduledChange=$scheduledChange, taxId=$taxId, payloadType=$payloadType, additionalProperties=$additionalProperties}"
        }

        class Refund
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val brandId: JsonField<String>,
            private val businessId: JsonField<String>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val customer: JsonField<CustomerLimitedDetails>,
            private val isPartial: JsonField<Boolean>,
            private val metadata: JsonField<Metadata>,
            private val paymentId: JsonField<String>,
            private val refundId: JsonField<String>,
            private val status: JsonField<RefundStatus>,
            private val amount: JsonField<Int>,
            private val currency: JsonField<Currency>,
            private val reason: JsonField<String>,
            private val payloadType: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("brand_id")
                @ExcludeMissing
                brandId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("business_id")
                @ExcludeMissing
                businessId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("customer")
                @ExcludeMissing
                customer: JsonField<CustomerLimitedDetails> = JsonMissing.of(),
                @JsonProperty("is_partial")
                @ExcludeMissing
                isPartial: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonProperty("payment_id")
                @ExcludeMissing
                paymentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("refund_id")
                @ExcludeMissing
                refundId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<RefundStatus> = JsonMissing.of(),
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<Currency> = JsonMissing.of(),
                @JsonProperty("reason")
                @ExcludeMissing
                reason: JsonField<String> = JsonMissing.of(),
                @JsonProperty("payload_type")
                @ExcludeMissing
                payloadType: JsonValue = JsonMissing.of(),
            ) : this(
                brandId,
                businessId,
                createdAt,
                customer,
                isPartial,
                metadata,
                paymentId,
                refundId,
                status,
                amount,
                currency,
                reason,
                payloadType,
                mutableMapOf(),
            )

            fun toRefund(): Refund =
                Refund.builder()
                    .brandId(brandId)
                    .businessId(businessId)
                    .createdAt(createdAt)
                    .customer(customer)
                    .isPartial(isPartial)
                    .metadata(metadata)
                    .paymentId(paymentId)
                    .refundId(refundId)
                    .status(status)
                    .amount(amount)
                    .currency(currency)
                    .reason(reason)
                    .build()

            /**
             * Brand id this refund belongs to
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun brandId(): String = brandId.getRequired("brand_id")

            /**
             * The unique identifier of the business issuing the refund.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun businessId(): String = businessId.getRequired("business_id")

            /**
             * The timestamp of when the refund was created in UTC.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

            /**
             * Details about the customer for this refund (from the associated payment)
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun customer(): CustomerLimitedDetails = customer.getRequired("customer")

            /**
             * If true the refund is a partial refund
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun isPartial(): Boolean = isPartial.getRequired("is_partial")

            /**
             * Additional metadata stored with the refund.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun metadata(): Metadata = metadata.getRequired("metadata")

            /**
             * The unique identifier of the payment associated with the refund.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentId(): String = paymentId.getRequired("payment_id")

            /**
             * The unique identifier of the refund.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun refundId(): String = refundId.getRequired("refund_id")

            /**
             * The current status of the refund.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun status(): RefundStatus = status.getRequired("status")

            /**
             * The refunded amount.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun amount(): Int? = amount.getNullable("amount")

            /**
             * The currency of the refund, represented as an ISO 4217 currency code.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun currency(): Currency? = currency.getNullable("currency")

            /**
             * The reason provided for the refund, if any. Optional.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun reason(): String? = reason.getNullable("reason")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("Refund")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("payload_type")
            @ExcludeMissing
            fun _payloadType(): JsonValue = payloadType

            /**
             * Returns the raw JSON value of [brandId].
             *
             * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("brand_id") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

            /**
             * Returns the raw JSON value of [businessId].
             *
             * Unlike [businessId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("business_id")
            @ExcludeMissing
            fun _businessId(): JsonField<String> = businessId

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [customer].
             *
             * Unlike [customer], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("customer")
            @ExcludeMissing
            fun _customer(): JsonField<CustomerLimitedDetails> = customer

            /**
             * Returns the raw JSON value of [isPartial].
             *
             * Unlike [isPartial], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("is_partial")
            @ExcludeMissing
            fun _isPartial(): JsonField<Boolean> = isPartial

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            /**
             * Returns the raw JSON value of [paymentId].
             *
             * Unlike [paymentId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("payment_id")
            @ExcludeMissing
            fun _paymentId(): JsonField<String> = paymentId

            /**
             * Returns the raw JSON value of [refundId].
             *
             * Unlike [refundId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("refund_id") @ExcludeMissing fun _refundId(): JsonField<String> = refundId

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<RefundStatus> = status

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Int> = amount

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun _currency(): JsonField<Currency> = currency

            /**
             * Returns the raw JSON value of [reason].
             *
             * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

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
                 * Returns a mutable builder for constructing an instance of [Refund].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .brandId()
                 * .businessId()
                 * .createdAt()
                 * .customer()
                 * .isPartial()
                 * .metadata()
                 * .paymentId()
                 * .refundId()
                 * .status()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Refund]. */
            class Builder internal constructor() {

                private var brandId: JsonField<String>? = null
                private var businessId: JsonField<String>? = null
                private var createdAt: JsonField<OffsetDateTime>? = null
                private var customer: JsonField<CustomerLimitedDetails>? = null
                private var isPartial: JsonField<Boolean>? = null
                private var metadata: JsonField<Metadata>? = null
                private var paymentId: JsonField<String>? = null
                private var refundId: JsonField<String>? = null
                private var status: JsonField<RefundStatus>? = null
                private var amount: JsonField<Int> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var reason: JsonField<String> = JsonMissing.of()
                private var payloadType: JsonValue = JsonValue.from("Refund")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(refund: Refund) = apply {
                    brandId = refund.brandId
                    businessId = refund.businessId
                    createdAt = refund.createdAt
                    customer = refund.customer
                    isPartial = refund.isPartial
                    metadata = refund.metadata
                    paymentId = refund.paymentId
                    refundId = refund.refundId
                    status = refund.status
                    amount = refund.amount
                    currency = refund.currency
                    reason = refund.reason
                    payloadType = refund.payloadType
                    additionalProperties = refund.additionalProperties.toMutableMap()
                }

                /** Brand id this refund belongs to */
                fun brandId(brandId: String) = brandId(JsonField.of(brandId))

                /**
                 * Sets [Builder.brandId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.brandId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

                /** The unique identifier of the business issuing the refund. */
                fun businessId(businessId: String) = businessId(JsonField.of(businessId))

                /**
                 * Sets [Builder.businessId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.businessId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun businessId(businessId: JsonField<String>) = apply {
                    this.businessId = businessId
                }

                /** The timestamp of when the refund was created in UTC. */
                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                /** Details about the customer for this refund (from the associated payment) */
                fun customer(customer: CustomerLimitedDetails) = customer(JsonField.of(customer))

                /**
                 * Sets [Builder.customer] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customer] with a well-typed
                 * [CustomerLimitedDetails] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun customer(customer: JsonField<CustomerLimitedDetails>) = apply {
                    this.customer = customer
                }

                /** If true the refund is a partial refund */
                fun isPartial(isPartial: Boolean) = isPartial(JsonField.of(isPartial))

                /**
                 * Sets [Builder.isPartial] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isPartial] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun isPartial(isPartial: JsonField<Boolean>) = apply { this.isPartial = isPartial }

                /** Additional metadata stored with the refund. */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                /** The unique identifier of the payment associated with the refund. */
                fun paymentId(paymentId: String) = paymentId(JsonField.of(paymentId))

                /**
                 * Sets [Builder.paymentId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun paymentId(paymentId: JsonField<String>) = apply { this.paymentId = paymentId }

                /** The unique identifier of the refund. */
                fun refundId(refundId: String) = refundId(JsonField.of(refundId))

                /**
                 * Sets [Builder.refundId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.refundId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun refundId(refundId: JsonField<String>) = apply { this.refundId = refundId }

                /** The current status of the refund. */
                fun status(status: RefundStatus) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [RefundStatus] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<RefundStatus>) = apply { this.status = status }

                /** The refunded amount. */
                fun amount(amount: Int?) = amount(JsonField.ofNullable(amount))

                /**
                 * Alias for [Builder.amount].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun amount(amount: Int) = amount(amount as Int?)

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Int] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Int>) = apply { this.amount = amount }

                /** The currency of the refund, represented as an ISO 4217 currency code. */
                fun currency(currency: Currency?) = currency(JsonField.ofNullable(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [Currency] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The reason provided for the refund, if any. Optional. */
                fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

                /**
                 * Sets [Builder.reason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reason] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("Refund")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun payloadType(payloadType: JsonValue) = apply { this.payloadType = payloadType }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Refund].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .brandId()
                 * .businessId()
                 * .createdAt()
                 * .customer()
                 * .isPartial()
                 * .metadata()
                 * .paymentId()
                 * .refundId()
                 * .status()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Refund =
                    Refund(
                        checkRequired("brandId", brandId),
                        checkRequired("businessId", businessId),
                        checkRequired("createdAt", createdAt),
                        checkRequired("customer", customer),
                        checkRequired("isPartial", isPartial),
                        checkRequired("metadata", metadata),
                        checkRequired("paymentId", paymentId),
                        checkRequired("refundId", refundId),
                        checkRequired("status", status),
                        amount,
                        currency,
                        reason,
                        payloadType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): Refund = apply {
                if (validated) {
                    return@apply
                }

                brandId()
                businessId()
                createdAt()
                customer().validate()
                isPartial()
                metadata().validate()
                paymentId()
                refundId()
                status().validate()
                amount()
                currency()?.validate()
                reason()
                _payloadType().let {
                    if (it != JsonValue.from("Refund")) {
                        throw DodoPaymentsInvalidDataException(
                            "'payloadType' is invalid, received $it"
                        )
                    }
                }
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
            internal fun validity(): Int =
                (if (brandId.asKnown() == null) 0 else 1) +
                    (if (businessId.asKnown() == null) 0 else 1) +
                    (if (createdAt.asKnown() == null) 0 else 1) +
                    (customer.asKnown()?.validity() ?: 0) +
                    (if (isPartial.asKnown() == null) 0 else 1) +
                    (metadata.asKnown()?.validity() ?: 0) +
                    (if (paymentId.asKnown() == null) 0 else 1) +
                    (if (refundId.asKnown() == null) 0 else 1) +
                    (status.asKnown()?.validity() ?: 0) +
                    (if (amount.asKnown() == null) 0 else 1) +
                    (currency.asKnown()?.validity() ?: 0) +
                    (if (reason.asKnown() == null) 0 else 1) +
                    payloadType.let { if (it == JsonValue.from("Refund")) 1 else 0 }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Refund &&
                    brandId == other.brandId &&
                    businessId == other.businessId &&
                    createdAt == other.createdAt &&
                    customer == other.customer &&
                    isPartial == other.isPartial &&
                    metadata == other.metadata &&
                    paymentId == other.paymentId &&
                    refundId == other.refundId &&
                    status == other.status &&
                    amount == other.amount &&
                    currency == other.currency &&
                    reason == other.reason &&
                    payloadType == other.payloadType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    brandId,
                    businessId,
                    createdAt,
                    customer,
                    isPartial,
                    metadata,
                    paymentId,
                    refundId,
                    status,
                    amount,
                    currency,
                    reason,
                    payloadType,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Refund{brandId=$brandId, businessId=$businessId, createdAt=$createdAt, customer=$customer, isPartial=$isPartial, metadata=$metadata, paymentId=$paymentId, refundId=$refundId, status=$status, amount=$amount, currency=$currency, reason=$reason, payloadType=$payloadType, additionalProperties=$additionalProperties}"
        }

        class Dispute
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<String>,
            private val brandId: JsonField<String>,
            private val businessId: JsonField<String>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val currency: JsonField<String>,
            private val customer: JsonField<CustomerLimitedDetails>,
            private val disputeId: JsonField<String>,
            private val disputeStage: JsonField<DisputeStage>,
            private val disputeStatus: JsonField<DisputeStatus>,
            private val paymentId: JsonField<String>,
            private val paymentProvider: JsonField<GetDispute.PaymentProvider>,
            private val isResolvedByRdr: JsonField<Boolean>,
            private val reason: JsonField<String>,
            private val remarks: JsonField<String>,
            private val payloadType: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("brand_id")
                @ExcludeMissing
                brandId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("business_id")
                @ExcludeMissing
                businessId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("customer")
                @ExcludeMissing
                customer: JsonField<CustomerLimitedDetails> = JsonMissing.of(),
                @JsonProperty("dispute_id")
                @ExcludeMissing
                disputeId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("dispute_stage")
                @ExcludeMissing
                disputeStage: JsonField<DisputeStage> = JsonMissing.of(),
                @JsonProperty("dispute_status")
                @ExcludeMissing
                disputeStatus: JsonField<DisputeStatus> = JsonMissing.of(),
                @JsonProperty("payment_id")
                @ExcludeMissing
                paymentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("payment_provider")
                @ExcludeMissing
                paymentProvider: JsonField<GetDispute.PaymentProvider> = JsonMissing.of(),
                @JsonProperty("is_resolved_by_rdr")
                @ExcludeMissing
                isResolvedByRdr: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("reason")
                @ExcludeMissing
                reason: JsonField<String> = JsonMissing.of(),
                @JsonProperty("remarks")
                @ExcludeMissing
                remarks: JsonField<String> = JsonMissing.of(),
                @JsonProperty("payload_type")
                @ExcludeMissing
                payloadType: JsonValue = JsonMissing.of(),
            ) : this(
                amount,
                brandId,
                businessId,
                createdAt,
                currency,
                customer,
                disputeId,
                disputeStage,
                disputeStatus,
                paymentId,
                paymentProvider,
                isResolvedByRdr,
                reason,
                remarks,
                payloadType,
                mutableMapOf(),
            )

            fun toGetDispute(): GetDispute =
                GetDispute.builder()
                    .amount(amount)
                    .brandId(brandId)
                    .businessId(businessId)
                    .createdAt(createdAt)
                    .currency(currency)
                    .customer(customer)
                    .disputeId(disputeId)
                    .disputeStage(disputeStage)
                    .disputeStatus(disputeStatus)
                    .paymentId(paymentId)
                    .paymentProvider(paymentProvider)
                    .isResolvedByRdr(isResolvedByRdr)
                    .reason(reason)
                    .remarks(remarks)
                    .build()

            /**
             * The amount involved in the dispute, represented as a string to accommodate precision.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): String = amount.getRequired("amount")

            /**
             * Brand id this dispute belongs to
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun brandId(): String = brandId.getRequired("brand_id")

            /**
             * The unique identifier of the business involved in the dispute.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun businessId(): String = businessId.getRequired("business_id")

            /**
             * The timestamp of when the dispute was created, in UTC.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

            /**
             * The currency of the disputed amount, represented as an ISO 4217 currency code.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): String = currency.getRequired("currency")

            /**
             * The customer who filed the dispute
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun customer(): CustomerLimitedDetails = customer.getRequired("customer")

            /**
             * The unique identifier of the dispute.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun disputeId(): String = disputeId.getRequired("dispute_id")

            /**
             * The current stage of the dispute process.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun disputeStage(): DisputeStage = disputeStage.getRequired("dispute_stage")

            /**
             * The current status of the dispute.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun disputeStatus(): DisputeStatus = disputeStatus.getRequired("dispute_status")

            /**
             * The unique identifier of the payment associated with the dispute.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentId(): String = paymentId.getRequired("payment_id")

            /**
             * Which processor handled the underlying payment. `stripe` / `adyen` for BYOP routes
             * (the merchant's own payment connector); `dodo` for everything Dodo processed itself.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentProvider(): GetDispute.PaymentProvider =
                paymentProvider.getRequired("payment_provider")

            /**
             * Whether the dispute was resolved by Rapid Dispute Resolution
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun isResolvedByRdr(): Boolean? = isResolvedByRdr.getNullable("is_resolved_by_rdr")

            /**
             * Reason for the dispute
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun reason(): String? = reason.getNullable("reason")

            /**
             * Remarks
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun remarks(): String? = remarks.getNullable("remarks")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("Dispute")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("payload_type")
            @ExcludeMissing
            fun _payloadType(): JsonValue = payloadType

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

            /**
             * Returns the raw JSON value of [brandId].
             *
             * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("brand_id") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

            /**
             * Returns the raw JSON value of [businessId].
             *
             * Unlike [businessId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("business_id")
            @ExcludeMissing
            fun _businessId(): JsonField<String> = businessId

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /**
             * Returns the raw JSON value of [customer].
             *
             * Unlike [customer], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("customer")
            @ExcludeMissing
            fun _customer(): JsonField<CustomerLimitedDetails> = customer

            /**
             * Returns the raw JSON value of [disputeId].
             *
             * Unlike [disputeId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("dispute_id")
            @ExcludeMissing
            fun _disputeId(): JsonField<String> = disputeId

            /**
             * Returns the raw JSON value of [disputeStage].
             *
             * Unlike [disputeStage], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("dispute_stage")
            @ExcludeMissing
            fun _disputeStage(): JsonField<DisputeStage> = disputeStage

            /**
             * Returns the raw JSON value of [disputeStatus].
             *
             * Unlike [disputeStatus], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("dispute_status")
            @ExcludeMissing
            fun _disputeStatus(): JsonField<DisputeStatus> = disputeStatus

            /**
             * Returns the raw JSON value of [paymentId].
             *
             * Unlike [paymentId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("payment_id")
            @ExcludeMissing
            fun _paymentId(): JsonField<String> = paymentId

            /**
             * Returns the raw JSON value of [paymentProvider].
             *
             * Unlike [paymentProvider], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("payment_provider")
            @ExcludeMissing
            fun _paymentProvider(): JsonField<GetDispute.PaymentProvider> = paymentProvider

            /**
             * Returns the raw JSON value of [isResolvedByRdr].
             *
             * Unlike [isResolvedByRdr], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("is_resolved_by_rdr")
            @ExcludeMissing
            fun _isResolvedByRdr(): JsonField<Boolean> = isResolvedByRdr

            /**
             * Returns the raw JSON value of [reason].
             *
             * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

            /**
             * Returns the raw JSON value of [remarks].
             *
             * Unlike [remarks], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("remarks") @ExcludeMissing fun _remarks(): JsonField<String> = remarks

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
                 * Returns a mutable builder for constructing an instance of [Dispute].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .amount()
                 * .brandId()
                 * .businessId()
                 * .createdAt()
                 * .currency()
                 * .customer()
                 * .disputeId()
                 * .disputeStage()
                 * .disputeStatus()
                 * .paymentId()
                 * .paymentProvider()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Dispute]. */
            class Builder internal constructor() {

                private var amount: JsonField<String>? = null
                private var brandId: JsonField<String>? = null
                private var businessId: JsonField<String>? = null
                private var createdAt: JsonField<OffsetDateTime>? = null
                private var currency: JsonField<String>? = null
                private var customer: JsonField<CustomerLimitedDetails>? = null
                private var disputeId: JsonField<String>? = null
                private var disputeStage: JsonField<DisputeStage>? = null
                private var disputeStatus: JsonField<DisputeStatus>? = null
                private var paymentId: JsonField<String>? = null
                private var paymentProvider: JsonField<GetDispute.PaymentProvider>? = null
                private var isResolvedByRdr: JsonField<Boolean> = JsonMissing.of()
                private var reason: JsonField<String> = JsonMissing.of()
                private var remarks: JsonField<String> = JsonMissing.of()
                private var payloadType: JsonValue = JsonValue.from("Dispute")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(dispute: Dispute) = apply {
                    amount = dispute.amount
                    brandId = dispute.brandId
                    businessId = dispute.businessId
                    createdAt = dispute.createdAt
                    currency = dispute.currency
                    customer = dispute.customer
                    disputeId = dispute.disputeId
                    disputeStage = dispute.disputeStage
                    disputeStatus = dispute.disputeStatus
                    paymentId = dispute.paymentId
                    paymentProvider = dispute.paymentProvider
                    isResolvedByRdr = dispute.isResolvedByRdr
                    reason = dispute.reason
                    remarks = dispute.remarks
                    payloadType = dispute.payloadType
                    additionalProperties = dispute.additionalProperties.toMutableMap()
                }

                /**
                 * The amount involved in the dispute, represented as a string to accommodate
                 * precision.
                 */
                fun amount(amount: String) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                /** Brand id this dispute belongs to */
                fun brandId(brandId: String) = brandId(JsonField.of(brandId))

                /**
                 * Sets [Builder.brandId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.brandId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

                /** The unique identifier of the business involved in the dispute. */
                fun businessId(businessId: String) = businessId(JsonField.of(businessId))

                /**
                 * Sets [Builder.businessId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.businessId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun businessId(businessId: JsonField<String>) = apply {
                    this.businessId = businessId
                }

                /** The timestamp of when the dispute was created, in UTC. */
                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                /**
                 * The currency of the disputed amount, represented as an ISO 4217 currency code.
                 */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The customer who filed the dispute */
                fun customer(customer: CustomerLimitedDetails) = customer(JsonField.of(customer))

                /**
                 * Sets [Builder.customer] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customer] with a well-typed
                 * [CustomerLimitedDetails] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun customer(customer: JsonField<CustomerLimitedDetails>) = apply {
                    this.customer = customer
                }

                /** The unique identifier of the dispute. */
                fun disputeId(disputeId: String) = disputeId(JsonField.of(disputeId))

                /**
                 * Sets [Builder.disputeId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.disputeId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun disputeId(disputeId: JsonField<String>) = apply { this.disputeId = disputeId }

                /** The current stage of the dispute process. */
                fun disputeStage(disputeStage: DisputeStage) =
                    disputeStage(JsonField.of(disputeStage))

                /**
                 * Sets [Builder.disputeStage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.disputeStage] with a well-typed [DisputeStage]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun disputeStage(disputeStage: JsonField<DisputeStage>) = apply {
                    this.disputeStage = disputeStage
                }

                /** The current status of the dispute. */
                fun disputeStatus(disputeStatus: DisputeStatus) =
                    disputeStatus(JsonField.of(disputeStatus))

                /**
                 * Sets [Builder.disputeStatus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.disputeStatus] with a well-typed [DisputeStatus]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun disputeStatus(disputeStatus: JsonField<DisputeStatus>) = apply {
                    this.disputeStatus = disputeStatus
                }

                /** The unique identifier of the payment associated with the dispute. */
                fun paymentId(paymentId: String) = paymentId(JsonField.of(paymentId))

                /**
                 * Sets [Builder.paymentId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun paymentId(paymentId: JsonField<String>) = apply { this.paymentId = paymentId }

                /**
                 * Which processor handled the underlying payment. `stripe` / `adyen` for BYOP
                 * routes (the merchant's own payment connector); `dodo` for everything Dodo
                 * processed itself.
                 */
                fun paymentProvider(paymentProvider: GetDispute.PaymentProvider) =
                    paymentProvider(JsonField.of(paymentProvider))

                /**
                 * Sets [Builder.paymentProvider] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentProvider] with a well-typed
                 * [GetDispute.PaymentProvider] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun paymentProvider(paymentProvider: JsonField<GetDispute.PaymentProvider>) =
                    apply {
                        this.paymentProvider = paymentProvider
                    }

                /** Whether the dispute was resolved by Rapid Dispute Resolution */
                fun isResolvedByRdr(isResolvedByRdr: Boolean?) =
                    isResolvedByRdr(JsonField.ofNullable(isResolvedByRdr))

                /**
                 * Alias for [Builder.isResolvedByRdr].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun isResolvedByRdr(isResolvedByRdr: Boolean) =
                    isResolvedByRdr(isResolvedByRdr as Boolean?)

                /**
                 * Sets [Builder.isResolvedByRdr] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isResolvedByRdr] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun isResolvedByRdr(isResolvedByRdr: JsonField<Boolean>) = apply {
                    this.isResolvedByRdr = isResolvedByRdr
                }

                /** Reason for the dispute */
                fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

                /**
                 * Sets [Builder.reason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reason] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                /** Remarks */
                fun remarks(remarks: String?) = remarks(JsonField.ofNullable(remarks))

                /**
                 * Sets [Builder.remarks] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.remarks] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun remarks(remarks: JsonField<String>) = apply { this.remarks = remarks }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("Dispute")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun payloadType(payloadType: JsonValue) = apply { this.payloadType = payloadType }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Dispute].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .amount()
                 * .brandId()
                 * .businessId()
                 * .createdAt()
                 * .currency()
                 * .customer()
                 * .disputeId()
                 * .disputeStage()
                 * .disputeStatus()
                 * .paymentId()
                 * .paymentProvider()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Dispute =
                    Dispute(
                        checkRequired("amount", amount),
                        checkRequired("brandId", brandId),
                        checkRequired("businessId", businessId),
                        checkRequired("createdAt", createdAt),
                        checkRequired("currency", currency),
                        checkRequired("customer", customer),
                        checkRequired("disputeId", disputeId),
                        checkRequired("disputeStage", disputeStage),
                        checkRequired("disputeStatus", disputeStatus),
                        checkRequired("paymentId", paymentId),
                        checkRequired("paymentProvider", paymentProvider),
                        isResolvedByRdr,
                        reason,
                        remarks,
                        payloadType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): Dispute = apply {
                if (validated) {
                    return@apply
                }

                amount()
                brandId()
                businessId()
                createdAt()
                currency()
                customer().validate()
                disputeId()
                disputeStage().validate()
                disputeStatus().validate()
                paymentId()
                paymentProvider().validate()
                isResolvedByRdr()
                reason()
                remarks()
                _payloadType().let {
                    if (it != JsonValue.from("Dispute")) {
                        throw DodoPaymentsInvalidDataException(
                            "'payloadType' is invalid, received $it"
                        )
                    }
                }
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
            internal fun validity(): Int =
                (if (amount.asKnown() == null) 0 else 1) +
                    (if (brandId.asKnown() == null) 0 else 1) +
                    (if (businessId.asKnown() == null) 0 else 1) +
                    (if (createdAt.asKnown() == null) 0 else 1) +
                    (if (currency.asKnown() == null) 0 else 1) +
                    (customer.asKnown()?.validity() ?: 0) +
                    (if (disputeId.asKnown() == null) 0 else 1) +
                    (disputeStage.asKnown()?.validity() ?: 0) +
                    (disputeStatus.asKnown()?.validity() ?: 0) +
                    (if (paymentId.asKnown() == null) 0 else 1) +
                    (paymentProvider.asKnown()?.validity() ?: 0) +
                    (if (isResolvedByRdr.asKnown() == null) 0 else 1) +
                    (if (reason.asKnown() == null) 0 else 1) +
                    (if (remarks.asKnown() == null) 0 else 1) +
                    payloadType.let { if (it == JsonValue.from("Dispute")) 1 else 0 }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Dispute &&
                    amount == other.amount &&
                    brandId == other.brandId &&
                    businessId == other.businessId &&
                    createdAt == other.createdAt &&
                    currency == other.currency &&
                    customer == other.customer &&
                    disputeId == other.disputeId &&
                    disputeStage == other.disputeStage &&
                    disputeStatus == other.disputeStatus &&
                    paymentId == other.paymentId &&
                    paymentProvider == other.paymentProvider &&
                    isResolvedByRdr == other.isResolvedByRdr &&
                    reason == other.reason &&
                    remarks == other.remarks &&
                    payloadType == other.payloadType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    amount,
                    brandId,
                    businessId,
                    createdAt,
                    currency,
                    customer,
                    disputeId,
                    disputeStage,
                    disputeStatus,
                    paymentId,
                    paymentProvider,
                    isResolvedByRdr,
                    reason,
                    remarks,
                    payloadType,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Dispute{amount=$amount, brandId=$brandId, businessId=$businessId, createdAt=$createdAt, currency=$currency, customer=$customer, disputeId=$disputeId, disputeStage=$disputeStage, disputeStatus=$disputeStatus, paymentId=$paymentId, paymentProvider=$paymentProvider, isResolvedByRdr=$isResolvedByRdr, reason=$reason, remarks=$remarks, payloadType=$payloadType, additionalProperties=$additionalProperties}"
        }

        class LicenseKey
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val brandId: JsonField<String>,
            private val businessId: JsonField<String>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val customerId: JsonField<String>,
            private val instancesCount: JsonField<Int>,
            private val key: JsonField<String>,
            private val productId: JsonField<String>,
            private val source:
                JsonField<com.dodopayments.api.models.licensekeys.LicenseKey.Source>,
            private val status: JsonField<LicenseKeyStatus>,
            private val activationsLimit: JsonField<Int>,
            private val expiresAt: JsonField<OffsetDateTime>,
            private val paymentId: JsonField<String>,
            private val subscriptionId: JsonField<String>,
            private val payloadType: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("brand_id")
                @ExcludeMissing
                brandId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("business_id")
                @ExcludeMissing
                businessId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("customer_id")
                @ExcludeMissing
                customerId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("instances_count")
                @ExcludeMissing
                instancesCount: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
                @JsonProperty("product_id")
                @ExcludeMissing
                productId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("source")
                @ExcludeMissing
                source: JsonField<com.dodopayments.api.models.licensekeys.LicenseKey.Source> =
                    JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<LicenseKeyStatus> = JsonMissing.of(),
                @JsonProperty("activations_limit")
                @ExcludeMissing
                activationsLimit: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("expires_at")
                @ExcludeMissing
                expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("payment_id")
                @ExcludeMissing
                paymentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("subscription_id")
                @ExcludeMissing
                subscriptionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("payload_type")
                @ExcludeMissing
                payloadType: JsonValue = JsonMissing.of(),
            ) : this(
                id,
                brandId,
                businessId,
                createdAt,
                customerId,
                instancesCount,
                key,
                productId,
                source,
                status,
                activationsLimit,
                expiresAt,
                paymentId,
                subscriptionId,
                payloadType,
                mutableMapOf(),
            )

            fun toLicenseKey(): LicenseKey =
                LicenseKey.builder()
                    .id(id)
                    .brandId(brandId)
                    .businessId(businessId)
                    .createdAt(createdAt)
                    .customerId(customerId)
                    .instancesCount(instancesCount)
                    .key(key)
                    .productId(productId)
                    .source(source)
                    .status(status)
                    .activationsLimit(activationsLimit)
                    .expiresAt(expiresAt)
                    .paymentId(paymentId)
                    .subscriptionId(subscriptionId)
                    .build()

            /**
             * The unique identifier of the license key.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Brand id this license key belongs to
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun brandId(): String = brandId.getRequired("brand_id")

            /**
             * The unique identifier of the business associated with the license key.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun businessId(): String = businessId.getRequired("business_id")

            /**
             * The timestamp indicating when the license key was created, in UTC.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

            /**
             * The unique identifier of the customer associated with the license key.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun customerId(): String = customerId.getRequired("customer_id")

            /**
             * The current number of instances activated for this license key.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun instancesCount(): Int = instancesCount.getRequired("instances_count")

            /**
             * The license key string.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun key(): String = key.getRequired("key")

            /**
             * The unique identifier of the product associated with the license key.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun productId(): String = productId.getRequired("product_id")

            /**
             * The source of the license key - 'auto' for keys generated by payment/subscription
             * flows, 'import' for merchant-imported keys.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun source(): com.dodopayments.api.models.licensekeys.LicenseKey.Source =
                source.getRequired("source")

            /**
             * The current status of the license key (e.g., active, inactive, expired).
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun status(): LicenseKeyStatus = status.getRequired("status")

            /**
             * The maximum number of activations allowed for this license key.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun activationsLimit(): Int? = activationsLimit.getNullable("activations_limit")

            /**
             * The timestamp indicating when the license key expires, in UTC.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun expiresAt(): OffsetDateTime? = expiresAt.getNullable("expires_at")

            /**
             * The unique identifier of the payment associated with the license key, if any.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun paymentId(): String? = paymentId.getNullable("payment_id")

            /**
             * The unique identifier of the subscription associated with the license key, if any.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun subscriptionId(): String? = subscriptionId.getNullable("subscription_id")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("LicenseKey")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("payload_type")
            @ExcludeMissing
            fun _payloadType(): JsonValue = payloadType

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [brandId].
             *
             * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("brand_id") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

            /**
             * Returns the raw JSON value of [businessId].
             *
             * Unlike [businessId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("business_id")
            @ExcludeMissing
            fun _businessId(): JsonField<String> = businessId

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [customerId].
             *
             * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("customer_id")
            @ExcludeMissing
            fun _customerId(): JsonField<String> = customerId

            /**
             * Returns the raw JSON value of [instancesCount].
             *
             * Unlike [instancesCount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("instances_count")
            @ExcludeMissing
            fun _instancesCount(): JsonField<Int> = instancesCount

            /**
             * Returns the raw JSON value of [key].
             *
             * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

            /**
             * Returns the raw JSON value of [productId].
             *
             * Unlike [productId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("product_id")
            @ExcludeMissing
            fun _productId(): JsonField<String> = productId

            /**
             * Returns the raw JSON value of [source].
             *
             * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("source")
            @ExcludeMissing
            fun _source(): JsonField<com.dodopayments.api.models.licensekeys.LicenseKey.Source> =
                source

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status")
            @ExcludeMissing
            fun _status(): JsonField<LicenseKeyStatus> = status

            /**
             * Returns the raw JSON value of [activationsLimit].
             *
             * Unlike [activationsLimit], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("activations_limit")
            @ExcludeMissing
            fun _activationsLimit(): JsonField<Int> = activationsLimit

            /**
             * Returns the raw JSON value of [expiresAt].
             *
             * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("expires_at")
            @ExcludeMissing
            fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

            /**
             * Returns the raw JSON value of [paymentId].
             *
             * Unlike [paymentId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("payment_id")
            @ExcludeMissing
            fun _paymentId(): JsonField<String> = paymentId

            /**
             * Returns the raw JSON value of [subscriptionId].
             *
             * Unlike [subscriptionId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("subscription_id")
            @ExcludeMissing
            fun _subscriptionId(): JsonField<String> = subscriptionId

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
                 * Returns a mutable builder for constructing an instance of [LicenseKey].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .brandId()
                 * .businessId()
                 * .createdAt()
                 * .customerId()
                 * .instancesCount()
                 * .key()
                 * .productId()
                 * .source()
                 * .status()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [LicenseKey]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var brandId: JsonField<String>? = null
                private var businessId: JsonField<String>? = null
                private var createdAt: JsonField<OffsetDateTime>? = null
                private var customerId: JsonField<String>? = null
                private var instancesCount: JsonField<Int>? = null
                private var key: JsonField<String>? = null
                private var productId: JsonField<String>? = null
                private var source:
                    JsonField<com.dodopayments.api.models.licensekeys.LicenseKey.Source>? =
                    null
                private var status: JsonField<LicenseKeyStatus>? = null
                private var activationsLimit: JsonField<Int> = JsonMissing.of()
                private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var paymentId: JsonField<String> = JsonMissing.of()
                private var subscriptionId: JsonField<String> = JsonMissing.of()
                private var payloadType: JsonValue = JsonValue.from("LicenseKey")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(licenseKey: LicenseKey) = apply {
                    id = licenseKey.id
                    brandId = licenseKey.brandId
                    businessId = licenseKey.businessId
                    createdAt = licenseKey.createdAt
                    customerId = licenseKey.customerId
                    instancesCount = licenseKey.instancesCount
                    key = licenseKey.key
                    productId = licenseKey.productId
                    source = licenseKey.source
                    status = licenseKey.status
                    activationsLimit = licenseKey.activationsLimit
                    expiresAt = licenseKey.expiresAt
                    paymentId = licenseKey.paymentId
                    subscriptionId = licenseKey.subscriptionId
                    payloadType = licenseKey.payloadType
                    additionalProperties = licenseKey.additionalProperties.toMutableMap()
                }

                /** The unique identifier of the license key. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** Brand id this license key belongs to */
                fun brandId(brandId: String) = brandId(JsonField.of(brandId))

                /**
                 * Sets [Builder.brandId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.brandId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

                /** The unique identifier of the business associated with the license key. */
                fun businessId(businessId: String) = businessId(JsonField.of(businessId))

                /**
                 * Sets [Builder.businessId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.businessId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun businessId(businessId: JsonField<String>) = apply {
                    this.businessId = businessId
                }

                /** The timestamp indicating when the license key was created, in UTC. */
                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                /** The unique identifier of the customer associated with the license key. */
                fun customerId(customerId: String) = customerId(JsonField.of(customerId))

                /**
                 * Sets [Builder.customerId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customerId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun customerId(customerId: JsonField<String>) = apply {
                    this.customerId = customerId
                }

                /** The current number of instances activated for this license key. */
                fun instancesCount(instancesCount: Int) =
                    instancesCount(JsonField.of(instancesCount))

                /**
                 * Sets [Builder.instancesCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.instancesCount] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun instancesCount(instancesCount: JsonField<Int>) = apply {
                    this.instancesCount = instancesCount
                }

                /** The license key string. */
                fun key(key: String) = key(JsonField.of(key))

                /**
                 * Sets [Builder.key] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.key] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun key(key: JsonField<String>) = apply { this.key = key }

                /** The unique identifier of the product associated with the license key. */
                fun productId(productId: String) = productId(JsonField.of(productId))

                /**
                 * Sets [Builder.productId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.productId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun productId(productId: JsonField<String>) = apply { this.productId = productId }

                /**
                 * The source of the license key - 'auto' for keys generated by payment/subscription
                 * flows, 'import' for merchant-imported keys.
                 */
                fun source(source: com.dodopayments.api.models.licensekeys.LicenseKey.Source) =
                    source(JsonField.of(source))

                /**
                 * Sets [Builder.source] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.source] with a well-typed [LicenseKey.Source]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun source(
                    source: JsonField<com.dodopayments.api.models.licensekeys.LicenseKey.Source>
                ) = apply { this.source = source }

                /** The current status of the license key (e.g., active, inactive, expired). */
                fun status(status: LicenseKeyStatus) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [LicenseKeyStatus]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun status(status: JsonField<LicenseKeyStatus>) = apply { this.status = status }

                /** The maximum number of activations allowed for this license key. */
                fun activationsLimit(activationsLimit: Int?) =
                    activationsLimit(JsonField.ofNullable(activationsLimit))

                /**
                 * Alias for [Builder.activationsLimit].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun activationsLimit(activationsLimit: Int) =
                    activationsLimit(activationsLimit as Int?)

                /**
                 * Sets [Builder.activationsLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.activationsLimit] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun activationsLimit(activationsLimit: JsonField<Int>) = apply {
                    this.activationsLimit = activationsLimit
                }

                /** The timestamp indicating when the license key expires, in UTC. */
                fun expiresAt(expiresAt: OffsetDateTime?) =
                    expiresAt(JsonField.ofNullable(expiresAt))

                /**
                 * Sets [Builder.expiresAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                    this.expiresAt = expiresAt
                }

                /** The unique identifier of the payment associated with the license key, if any. */
                fun paymentId(paymentId: String?) = paymentId(JsonField.ofNullable(paymentId))

                /**
                 * Sets [Builder.paymentId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun paymentId(paymentId: JsonField<String>) = apply { this.paymentId = paymentId }

                /**
                 * The unique identifier of the subscription associated with the license key, if
                 * any.
                 */
                fun subscriptionId(subscriptionId: String?) =
                    subscriptionId(JsonField.ofNullable(subscriptionId))

                /**
                 * Sets [Builder.subscriptionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subscriptionId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun subscriptionId(subscriptionId: JsonField<String>) = apply {
                    this.subscriptionId = subscriptionId
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("LicenseKey")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun payloadType(payloadType: JsonValue) = apply { this.payloadType = payloadType }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [LicenseKey].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .brandId()
                 * .businessId()
                 * .createdAt()
                 * .customerId()
                 * .instancesCount()
                 * .key()
                 * .productId()
                 * .source()
                 * .status()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): LicenseKey =
                    LicenseKey(
                        checkRequired("id", id),
                        checkRequired("brandId", brandId),
                        checkRequired("businessId", businessId),
                        checkRequired("createdAt", createdAt),
                        checkRequired("customerId", customerId),
                        checkRequired("instancesCount", instancesCount),
                        checkRequired("key", key),
                        checkRequired("productId", productId),
                        checkRequired("source", source),
                        checkRequired("status", status),
                        activationsLimit,
                        expiresAt,
                        paymentId,
                        subscriptionId,
                        payloadType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): LicenseKey = apply {
                if (validated) {
                    return@apply
                }

                id()
                brandId()
                businessId()
                createdAt()
                customerId()
                instancesCount()
                key()
                productId()
                source().validate()
                status().validate()
                activationsLimit()
                expiresAt()
                paymentId()
                subscriptionId()
                _payloadType().let {
                    if (it != JsonValue.from("LicenseKey")) {
                        throw DodoPaymentsInvalidDataException(
                            "'payloadType' is invalid, received $it"
                        )
                    }
                }
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
            internal fun validity(): Int =
                (if (id.asKnown() == null) 0 else 1) +
                    (if (brandId.asKnown() == null) 0 else 1) +
                    (if (businessId.asKnown() == null) 0 else 1) +
                    (if (createdAt.asKnown() == null) 0 else 1) +
                    (if (customerId.asKnown() == null) 0 else 1) +
                    (if (instancesCount.asKnown() == null) 0 else 1) +
                    (if (key.asKnown() == null) 0 else 1) +
                    (if (productId.asKnown() == null) 0 else 1) +
                    (source.asKnown()?.validity() ?: 0) +
                    (status.asKnown()?.validity() ?: 0) +
                    (if (activationsLimit.asKnown() == null) 0 else 1) +
                    (if (expiresAt.asKnown() == null) 0 else 1) +
                    (if (paymentId.asKnown() == null) 0 else 1) +
                    (if (subscriptionId.asKnown() == null) 0 else 1) +
                    payloadType.let { if (it == JsonValue.from("LicenseKey")) 1 else 0 }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is LicenseKey &&
                    id == other.id &&
                    brandId == other.brandId &&
                    businessId == other.businessId &&
                    createdAt == other.createdAt &&
                    customerId == other.customerId &&
                    instancesCount == other.instancesCount &&
                    key == other.key &&
                    productId == other.productId &&
                    source == other.source &&
                    status == other.status &&
                    activationsLimit == other.activationsLimit &&
                    expiresAt == other.expiresAt &&
                    paymentId == other.paymentId &&
                    subscriptionId == other.subscriptionId &&
                    payloadType == other.payloadType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    brandId,
                    businessId,
                    createdAt,
                    customerId,
                    instancesCount,
                    key,
                    productId,
                    source,
                    status,
                    activationsLimit,
                    expiresAt,
                    paymentId,
                    subscriptionId,
                    payloadType,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LicenseKey{id=$id, brandId=$brandId, businessId=$businessId, createdAt=$createdAt, customerId=$customerId, instancesCount=$instancesCount, key=$key, productId=$productId, source=$source, status=$status, activationsLimit=$activationsLimit, expiresAt=$expiresAt, paymentId=$paymentId, subscriptionId=$subscriptionId, payloadType=$payloadType, additionalProperties=$additionalProperties}"
        }

        /** Response for a ledger entry */
        class CreditLedgerEntry
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val amount: JsonField<String>,
            private val balanceAfter: JsonField<String>,
            private val balanceBefore: JsonField<String>,
            private val brandId: JsonField<String>,
            private val businessId: JsonField<String>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val creditEntitlementId: JsonField<String>,
            private val customerId: JsonField<String>,
            private val isCredit: JsonField<Boolean>,
            private val metadata: JsonField<Metadata>,
            private val overageAfter: JsonField<String>,
            private val overageBefore: JsonField<String>,
            private val transactionType:
                JsonField<
                    com.dodopayments.api.models.creditentitlements.balances.CreditLedgerEntry.TransactionType
                >,
            private val description: JsonField<String>,
            private val grantId: JsonField<String>,
            private val referenceId: JsonField<String>,
            private val referenceType: JsonField<String>,
            private val payloadType: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("balance_after")
                @ExcludeMissing
                balanceAfter: JsonField<String> = JsonMissing.of(),
                @JsonProperty("balance_before")
                @ExcludeMissing
                balanceBefore: JsonField<String> = JsonMissing.of(),
                @JsonProperty("brand_id")
                @ExcludeMissing
                brandId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("business_id")
                @ExcludeMissing
                businessId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("credit_entitlement_id")
                @ExcludeMissing
                creditEntitlementId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("customer_id")
                @ExcludeMissing
                customerId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("is_credit")
                @ExcludeMissing
                isCredit: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonProperty("overage_after")
                @ExcludeMissing
                overageAfter: JsonField<String> = JsonMissing.of(),
                @JsonProperty("overage_before")
                @ExcludeMissing
                overageBefore: JsonField<String> = JsonMissing.of(),
                @JsonProperty("transaction_type")
                @ExcludeMissing
                transactionType:
                    JsonField<
                        com.dodopayments.api.models.creditentitlements.balances.CreditLedgerEntry.TransactionType
                    > =
                    JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("grant_id")
                @ExcludeMissing
                grantId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reference_id")
                @ExcludeMissing
                referenceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reference_type")
                @ExcludeMissing
                referenceType: JsonField<String> = JsonMissing.of(),
                @JsonProperty("payload_type")
                @ExcludeMissing
                payloadType: JsonValue = JsonMissing.of(),
            ) : this(
                id,
                amount,
                balanceAfter,
                balanceBefore,
                brandId,
                businessId,
                createdAt,
                creditEntitlementId,
                customerId,
                isCredit,
                metadata,
                overageAfter,
                overageBefore,
                transactionType,
                description,
                grantId,
                referenceId,
                referenceType,
                payloadType,
                mutableMapOf(),
            )

            fun toCreditLedgerEntry(): CreditLedgerEntry =
                CreditLedgerEntry.builder()
                    .id(id)
                    .amount(amount)
                    .balanceAfter(balanceAfter)
                    .balanceBefore(balanceBefore)
                    .brandId(brandId)
                    .businessId(businessId)
                    .createdAt(createdAt)
                    .creditEntitlementId(creditEntitlementId)
                    .customerId(customerId)
                    .isCredit(isCredit)
                    .metadata(metadata)
                    .overageAfter(overageAfter)
                    .overageBefore(overageBefore)
                    .transactionType(transactionType)
                    .description(description)
                    .grantId(grantId)
                    .referenceId(referenceId)
                    .referenceType(referenceType)
                    .build()

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): String = amount.getRequired("amount")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun balanceAfter(): String = balanceAfter.getRequired("balance_after")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun balanceBefore(): String = balanceBefore.getRequired("balance_before")

            /**
             * Brand id this credit ledger entry belongs to
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun brandId(): String = brandId.getRequired("brand_id")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun businessId(): String = businessId.getRequired("business_id")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun creditEntitlementId(): String =
                creditEntitlementId.getRequired("credit_entitlement_id")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun customerId(): String = customerId.getRequired("customer_id")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun isCredit(): Boolean = isCredit.getRequired("is_credit")

            /**
             * Metadata associated with the credit grant's source (the subscription or payment
             * created at checkout). Empty when the grant has no resolvable source (e.g. credits
             * granted directly via the API).
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun metadata(): Metadata = metadata.getRequired("metadata")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun overageAfter(): String = overageAfter.getRequired("overage_after")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun overageBefore(): String = overageBefore.getRequired("overage_before")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun transactionType():
                com.dodopayments.api.models.creditentitlements.balances.CreditLedgerEntry.TransactionType =
                transactionType.getRequired("transaction_type")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun description(): String? = description.getNullable("description")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun grantId(): String? = grantId.getNullable("grant_id")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun referenceId(): String? = referenceId.getNullable("reference_id")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun referenceType(): String? = referenceType.getNullable("reference_type")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("CreditLedgerEntry")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("payload_type")
            @ExcludeMissing
            fun _payloadType(): JsonValue = payloadType

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

            /**
             * Returns the raw JSON value of [balanceAfter].
             *
             * Unlike [balanceAfter], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("balance_after")
            @ExcludeMissing
            fun _balanceAfter(): JsonField<String> = balanceAfter

            /**
             * Returns the raw JSON value of [balanceBefore].
             *
             * Unlike [balanceBefore], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("balance_before")
            @ExcludeMissing
            fun _balanceBefore(): JsonField<String> = balanceBefore

            /**
             * Returns the raw JSON value of [brandId].
             *
             * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("brand_id") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

            /**
             * Returns the raw JSON value of [businessId].
             *
             * Unlike [businessId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("business_id")
            @ExcludeMissing
            fun _businessId(): JsonField<String> = businessId

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [creditEntitlementId].
             *
             * Unlike [creditEntitlementId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("credit_entitlement_id")
            @ExcludeMissing
            fun _creditEntitlementId(): JsonField<String> = creditEntitlementId

            /**
             * Returns the raw JSON value of [customerId].
             *
             * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("customer_id")
            @ExcludeMissing
            fun _customerId(): JsonField<String> = customerId

            /**
             * Returns the raw JSON value of [isCredit].
             *
             * Unlike [isCredit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("is_credit")
            @ExcludeMissing
            fun _isCredit(): JsonField<Boolean> = isCredit

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            /**
             * Returns the raw JSON value of [overageAfter].
             *
             * Unlike [overageAfter], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("overage_after")
            @ExcludeMissing
            fun _overageAfter(): JsonField<String> = overageAfter

            /**
             * Returns the raw JSON value of [overageBefore].
             *
             * Unlike [overageBefore], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("overage_before")
            @ExcludeMissing
            fun _overageBefore(): JsonField<String> = overageBefore

            /**
             * Returns the raw JSON value of [transactionType].
             *
             * Unlike [transactionType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("transaction_type")
            @ExcludeMissing
            fun _transactionType():
                JsonField<
                    com.dodopayments.api.models.creditentitlements.balances.CreditLedgerEntry.TransactionType
                > = transactionType

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [grantId].
             *
             * Unlike [grantId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("grant_id") @ExcludeMissing fun _grantId(): JsonField<String> = grantId

            /**
             * Returns the raw JSON value of [referenceId].
             *
             * Unlike [referenceId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reference_id")
            @ExcludeMissing
            fun _referenceId(): JsonField<String> = referenceId

            /**
             * Returns the raw JSON value of [referenceType].
             *
             * Unlike [referenceType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reference_type")
            @ExcludeMissing
            fun _referenceType(): JsonField<String> = referenceType

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
                 * Returns a mutable builder for constructing an instance of [CreditLedgerEntry].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .amount()
                 * .balanceAfter()
                 * .balanceBefore()
                 * .brandId()
                 * .businessId()
                 * .createdAt()
                 * .creditEntitlementId()
                 * .customerId()
                 * .isCredit()
                 * .metadata()
                 * .overageAfter()
                 * .overageBefore()
                 * .transactionType()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [CreditLedgerEntry]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var amount: JsonField<String>? = null
                private var balanceAfter: JsonField<String>? = null
                private var balanceBefore: JsonField<String>? = null
                private var brandId: JsonField<String>? = null
                private var businessId: JsonField<String>? = null
                private var createdAt: JsonField<OffsetDateTime>? = null
                private var creditEntitlementId: JsonField<String>? = null
                private var customerId: JsonField<String>? = null
                private var isCredit: JsonField<Boolean>? = null
                private var metadata: JsonField<Metadata>? = null
                private var overageAfter: JsonField<String>? = null
                private var overageBefore: JsonField<String>? = null
                private var transactionType:
                    JsonField<
                        com.dodopayments.api.models.creditentitlements.balances.CreditLedgerEntry.TransactionType
                    >? =
                    null
                private var description: JsonField<String> = JsonMissing.of()
                private var grantId: JsonField<String> = JsonMissing.of()
                private var referenceId: JsonField<String> = JsonMissing.of()
                private var referenceType: JsonField<String> = JsonMissing.of()
                private var payloadType: JsonValue = JsonValue.from("CreditLedgerEntry")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditLedgerEntry: CreditLedgerEntry) = apply {
                    id = creditLedgerEntry.id
                    amount = creditLedgerEntry.amount
                    balanceAfter = creditLedgerEntry.balanceAfter
                    balanceBefore = creditLedgerEntry.balanceBefore
                    brandId = creditLedgerEntry.brandId
                    businessId = creditLedgerEntry.businessId
                    createdAt = creditLedgerEntry.createdAt
                    creditEntitlementId = creditLedgerEntry.creditEntitlementId
                    customerId = creditLedgerEntry.customerId
                    isCredit = creditLedgerEntry.isCredit
                    metadata = creditLedgerEntry.metadata
                    overageAfter = creditLedgerEntry.overageAfter
                    overageBefore = creditLedgerEntry.overageBefore
                    transactionType = creditLedgerEntry.transactionType
                    description = creditLedgerEntry.description
                    grantId = creditLedgerEntry.grantId
                    referenceId = creditLedgerEntry.referenceId
                    referenceType = creditLedgerEntry.referenceType
                    payloadType = creditLedgerEntry.payloadType
                    additionalProperties = creditLedgerEntry.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun amount(amount: String) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                fun balanceAfter(balanceAfter: String) = balanceAfter(JsonField.of(balanceAfter))

                /**
                 * Sets [Builder.balanceAfter] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.balanceAfter] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun balanceAfter(balanceAfter: JsonField<String>) = apply {
                    this.balanceAfter = balanceAfter
                }

                fun balanceBefore(balanceBefore: String) =
                    balanceBefore(JsonField.of(balanceBefore))

                /**
                 * Sets [Builder.balanceBefore] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.balanceBefore] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun balanceBefore(balanceBefore: JsonField<String>) = apply {
                    this.balanceBefore = balanceBefore
                }

                /** Brand id this credit ledger entry belongs to */
                fun brandId(brandId: String) = brandId(JsonField.of(brandId))

                /**
                 * Sets [Builder.brandId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.brandId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

                fun businessId(businessId: String) = businessId(JsonField.of(businessId))

                /**
                 * Sets [Builder.businessId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.businessId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun businessId(businessId: JsonField<String>) = apply {
                    this.businessId = businessId
                }

                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                fun creditEntitlementId(creditEntitlementId: String) =
                    creditEntitlementId(JsonField.of(creditEntitlementId))

                /**
                 * Sets [Builder.creditEntitlementId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.creditEntitlementId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun creditEntitlementId(creditEntitlementId: JsonField<String>) = apply {
                    this.creditEntitlementId = creditEntitlementId
                }

                fun customerId(customerId: String) = customerId(JsonField.of(customerId))

                /**
                 * Sets [Builder.customerId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customerId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun customerId(customerId: JsonField<String>) = apply {
                    this.customerId = customerId
                }

                fun isCredit(isCredit: Boolean) = isCredit(JsonField.of(isCredit))

                /**
                 * Sets [Builder.isCredit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isCredit] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun isCredit(isCredit: JsonField<Boolean>) = apply { this.isCredit = isCredit }

                /**
                 * Metadata associated with the credit grant's source (the subscription or payment
                 * created at checkout). Empty when the grant has no resolvable source (e.g. credits
                 * granted directly via the API).
                 */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                fun overageAfter(overageAfter: String) = overageAfter(JsonField.of(overageAfter))

                /**
                 * Sets [Builder.overageAfter] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.overageAfter] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun overageAfter(overageAfter: JsonField<String>) = apply {
                    this.overageAfter = overageAfter
                }

                fun overageBefore(overageBefore: String) =
                    overageBefore(JsonField.of(overageBefore))

                /**
                 * Sets [Builder.overageBefore] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.overageBefore] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun overageBefore(overageBefore: JsonField<String>) = apply {
                    this.overageBefore = overageBefore
                }

                fun transactionType(
                    transactionType:
                        com.dodopayments.api.models.creditentitlements.balances.CreditLedgerEntry.TransactionType
                ) = transactionType(JsonField.of(transactionType))

                /**
                 * Sets [Builder.transactionType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.transactionType] with a well-typed
                 * [CreditLedgerEntry.TransactionType] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun transactionType(
                    transactionType:
                        JsonField<
                            com.dodopayments.api.models.creditentitlements.balances.CreditLedgerEntry.TransactionType
                        >
                ) = apply { this.transactionType = transactionType }

                fun description(description: String?) =
                    description(JsonField.ofNullable(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                fun grantId(grantId: String?) = grantId(JsonField.ofNullable(grantId))

                /**
                 * Sets [Builder.grantId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.grantId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun grantId(grantId: JsonField<String>) = apply { this.grantId = grantId }

                fun referenceId(referenceId: String?) =
                    referenceId(JsonField.ofNullable(referenceId))

                /**
                 * Sets [Builder.referenceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.referenceId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun referenceId(referenceId: JsonField<String>) = apply {
                    this.referenceId = referenceId
                }

                fun referenceType(referenceType: String?) =
                    referenceType(JsonField.ofNullable(referenceType))

                /**
                 * Sets [Builder.referenceType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.referenceType] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun referenceType(referenceType: JsonField<String>) = apply {
                    this.referenceType = referenceType
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("CreditLedgerEntry")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun payloadType(payloadType: JsonValue) = apply { this.payloadType = payloadType }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [CreditLedgerEntry].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .amount()
                 * .balanceAfter()
                 * .balanceBefore()
                 * .brandId()
                 * .businessId()
                 * .createdAt()
                 * .creditEntitlementId()
                 * .customerId()
                 * .isCredit()
                 * .metadata()
                 * .overageAfter()
                 * .overageBefore()
                 * .transactionType()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CreditLedgerEntry =
                    CreditLedgerEntry(
                        checkRequired("id", id),
                        checkRequired("amount", amount),
                        checkRequired("balanceAfter", balanceAfter),
                        checkRequired("balanceBefore", balanceBefore),
                        checkRequired("brandId", brandId),
                        checkRequired("businessId", businessId),
                        checkRequired("createdAt", createdAt),
                        checkRequired("creditEntitlementId", creditEntitlementId),
                        checkRequired("customerId", customerId),
                        checkRequired("isCredit", isCredit),
                        checkRequired("metadata", metadata),
                        checkRequired("overageAfter", overageAfter),
                        checkRequired("overageBefore", overageBefore),
                        checkRequired("transactionType", transactionType),
                        description,
                        grantId,
                        referenceId,
                        referenceType,
                        payloadType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): CreditLedgerEntry = apply {
                if (validated) {
                    return@apply
                }

                id()
                amount()
                balanceAfter()
                balanceBefore()
                brandId()
                businessId()
                createdAt()
                creditEntitlementId()
                customerId()
                isCredit()
                metadata().validate()
                overageAfter()
                overageBefore()
                transactionType().validate()
                description()
                grantId()
                referenceId()
                referenceType()
                _payloadType().let {
                    if (it != JsonValue.from("CreditLedgerEntry")) {
                        throw DodoPaymentsInvalidDataException(
                            "'payloadType' is invalid, received $it"
                        )
                    }
                }
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
            internal fun validity(): Int =
                (if (id.asKnown() == null) 0 else 1) +
                    (if (amount.asKnown() == null) 0 else 1) +
                    (if (balanceAfter.asKnown() == null) 0 else 1) +
                    (if (balanceBefore.asKnown() == null) 0 else 1) +
                    (if (brandId.asKnown() == null) 0 else 1) +
                    (if (businessId.asKnown() == null) 0 else 1) +
                    (if (createdAt.asKnown() == null) 0 else 1) +
                    (if (creditEntitlementId.asKnown() == null) 0 else 1) +
                    (if (customerId.asKnown() == null) 0 else 1) +
                    (if (isCredit.asKnown() == null) 0 else 1) +
                    (metadata.asKnown()?.validity() ?: 0) +
                    (if (overageAfter.asKnown() == null) 0 else 1) +
                    (if (overageBefore.asKnown() == null) 0 else 1) +
                    (transactionType.asKnown()?.validity() ?: 0) +
                    (if (description.asKnown() == null) 0 else 1) +
                    (if (grantId.asKnown() == null) 0 else 1) +
                    (if (referenceId.asKnown() == null) 0 else 1) +
                    (if (referenceType.asKnown() == null) 0 else 1) +
                    payloadType.let { if (it == JsonValue.from("CreditLedgerEntry")) 1 else 0 }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreditLedgerEntry &&
                    id == other.id &&
                    amount == other.amount &&
                    balanceAfter == other.balanceAfter &&
                    balanceBefore == other.balanceBefore &&
                    brandId == other.brandId &&
                    businessId == other.businessId &&
                    createdAt == other.createdAt &&
                    creditEntitlementId == other.creditEntitlementId &&
                    customerId == other.customerId &&
                    isCredit == other.isCredit &&
                    metadata == other.metadata &&
                    overageAfter == other.overageAfter &&
                    overageBefore == other.overageBefore &&
                    transactionType == other.transactionType &&
                    description == other.description &&
                    grantId == other.grantId &&
                    referenceId == other.referenceId &&
                    referenceType == other.referenceType &&
                    payloadType == other.payloadType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    amount,
                    balanceAfter,
                    balanceBefore,
                    brandId,
                    businessId,
                    createdAt,
                    creditEntitlementId,
                    customerId,
                    isCredit,
                    metadata,
                    overageAfter,
                    overageBefore,
                    transactionType,
                    description,
                    grantId,
                    referenceId,
                    referenceType,
                    payloadType,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreditLedgerEntry{id=$id, amount=$amount, balanceAfter=$balanceAfter, balanceBefore=$balanceBefore, brandId=$brandId, businessId=$businessId, createdAt=$createdAt, creditEntitlementId=$creditEntitlementId, customerId=$customerId, isCredit=$isCredit, metadata=$metadata, overageAfter=$overageAfter, overageBefore=$overageBefore, transactionType=$transactionType, description=$description, grantId=$grantId, referenceId=$referenceId, referenceType=$referenceType, payloadType=$payloadType, additionalProperties=$additionalProperties}"
        }

        class CreditBalanceLow
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val availableBalance: JsonField<String>,
            private val brandId: JsonField<String>,
            private val creditEntitlementId: JsonField<String>,
            private val creditEntitlementName: JsonField<String>,
            private val customerId: JsonField<String>,
            private val payloadType: JsonValue,
            private val subscriptionCreditsAmount: JsonField<String>,
            private val subscriptionId: JsonField<String>,
            private val thresholdAmount: JsonField<String>,
            private val thresholdPercent: JsonField<Int>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("available_balance")
                @ExcludeMissing
                availableBalance: JsonField<String> = JsonMissing.of(),
                @JsonProperty("brand_id")
                @ExcludeMissing
                brandId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("credit_entitlement_id")
                @ExcludeMissing
                creditEntitlementId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("credit_entitlement_name")
                @ExcludeMissing
                creditEntitlementName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("customer_id")
                @ExcludeMissing
                customerId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("payload_type")
                @ExcludeMissing
                payloadType: JsonValue = JsonMissing.of(),
                @JsonProperty("subscription_credits_amount")
                @ExcludeMissing
                subscriptionCreditsAmount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("subscription_id")
                @ExcludeMissing
                subscriptionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("threshold_amount")
                @ExcludeMissing
                thresholdAmount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("threshold_percent")
                @ExcludeMissing
                thresholdPercent: JsonField<Int> = JsonMissing.of(),
            ) : this(
                availableBalance,
                brandId,
                creditEntitlementId,
                creditEntitlementName,
                customerId,
                payloadType,
                subscriptionCreditsAmount,
                subscriptionId,
                thresholdAmount,
                thresholdPercent,
                mutableMapOf(),
            )

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun availableBalance(): String = availableBalance.getRequired("available_balance")

            /**
             * Brand id this credit entitlement belongs to
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun brandId(): String = brandId.getRequired("brand_id")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun creditEntitlementId(): String =
                creditEntitlementId.getRequired("credit_entitlement_id")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun creditEntitlementName(): String =
                creditEntitlementName.getRequired("credit_entitlement_name")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun customerId(): String = customerId.getRequired("customer_id")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("CreditBalanceLow")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("payload_type")
            @ExcludeMissing
            fun _payloadType(): JsonValue = payloadType

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun subscriptionCreditsAmount(): String =
                subscriptionCreditsAmount.getRequired("subscription_credits_amount")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun subscriptionId(): String = subscriptionId.getRequired("subscription_id")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun thresholdAmount(): String = thresholdAmount.getRequired("threshold_amount")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun thresholdPercent(): Int = thresholdPercent.getRequired("threshold_percent")

            /**
             * Returns the raw JSON value of [availableBalance].
             *
             * Unlike [availableBalance], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("available_balance")
            @ExcludeMissing
            fun _availableBalance(): JsonField<String> = availableBalance

            /**
             * Returns the raw JSON value of [brandId].
             *
             * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("brand_id") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

            /**
             * Returns the raw JSON value of [creditEntitlementId].
             *
             * Unlike [creditEntitlementId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("credit_entitlement_id")
            @ExcludeMissing
            fun _creditEntitlementId(): JsonField<String> = creditEntitlementId

            /**
             * Returns the raw JSON value of [creditEntitlementName].
             *
             * Unlike [creditEntitlementName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("credit_entitlement_name")
            @ExcludeMissing
            fun _creditEntitlementName(): JsonField<String> = creditEntitlementName

            /**
             * Returns the raw JSON value of [customerId].
             *
             * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("customer_id")
            @ExcludeMissing
            fun _customerId(): JsonField<String> = customerId

            /**
             * Returns the raw JSON value of [subscriptionCreditsAmount].
             *
             * Unlike [subscriptionCreditsAmount], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("subscription_credits_amount")
            @ExcludeMissing
            fun _subscriptionCreditsAmount(): JsonField<String> = subscriptionCreditsAmount

            /**
             * Returns the raw JSON value of [subscriptionId].
             *
             * Unlike [subscriptionId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("subscription_id")
            @ExcludeMissing
            fun _subscriptionId(): JsonField<String> = subscriptionId

            /**
             * Returns the raw JSON value of [thresholdAmount].
             *
             * Unlike [thresholdAmount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("threshold_amount")
            @ExcludeMissing
            fun _thresholdAmount(): JsonField<String> = thresholdAmount

            /**
             * Returns the raw JSON value of [thresholdPercent].
             *
             * Unlike [thresholdPercent], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("threshold_percent")
            @ExcludeMissing
            fun _thresholdPercent(): JsonField<Int> = thresholdPercent

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
                 * Returns a mutable builder for constructing an instance of [CreditBalanceLow].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .availableBalance()
                 * .brandId()
                 * .creditEntitlementId()
                 * .creditEntitlementName()
                 * .customerId()
                 * .subscriptionCreditsAmount()
                 * .subscriptionId()
                 * .thresholdAmount()
                 * .thresholdPercent()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [CreditBalanceLow]. */
            class Builder internal constructor() {

                private var availableBalance: JsonField<String>? = null
                private var brandId: JsonField<String>? = null
                private var creditEntitlementId: JsonField<String>? = null
                private var creditEntitlementName: JsonField<String>? = null
                private var customerId: JsonField<String>? = null
                private var payloadType: JsonValue = JsonValue.from("CreditBalanceLow")
                private var subscriptionCreditsAmount: JsonField<String>? = null
                private var subscriptionId: JsonField<String>? = null
                private var thresholdAmount: JsonField<String>? = null
                private var thresholdPercent: JsonField<Int>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditBalanceLow: CreditBalanceLow) = apply {
                    availableBalance = creditBalanceLow.availableBalance
                    brandId = creditBalanceLow.brandId
                    creditEntitlementId = creditBalanceLow.creditEntitlementId
                    creditEntitlementName = creditBalanceLow.creditEntitlementName
                    customerId = creditBalanceLow.customerId
                    payloadType = creditBalanceLow.payloadType
                    subscriptionCreditsAmount = creditBalanceLow.subscriptionCreditsAmount
                    subscriptionId = creditBalanceLow.subscriptionId
                    thresholdAmount = creditBalanceLow.thresholdAmount
                    thresholdPercent = creditBalanceLow.thresholdPercent
                    additionalProperties = creditBalanceLow.additionalProperties.toMutableMap()
                }

                fun availableBalance(availableBalance: String) =
                    availableBalance(JsonField.of(availableBalance))

                /**
                 * Sets [Builder.availableBalance] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.availableBalance] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun availableBalance(availableBalance: JsonField<String>) = apply {
                    this.availableBalance = availableBalance
                }

                /** Brand id this credit entitlement belongs to */
                fun brandId(brandId: String) = brandId(JsonField.of(brandId))

                /**
                 * Sets [Builder.brandId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.brandId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

                fun creditEntitlementId(creditEntitlementId: String) =
                    creditEntitlementId(JsonField.of(creditEntitlementId))

                /**
                 * Sets [Builder.creditEntitlementId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.creditEntitlementId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun creditEntitlementId(creditEntitlementId: JsonField<String>) = apply {
                    this.creditEntitlementId = creditEntitlementId
                }

                fun creditEntitlementName(creditEntitlementName: String) =
                    creditEntitlementName(JsonField.of(creditEntitlementName))

                /**
                 * Sets [Builder.creditEntitlementName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.creditEntitlementName] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun creditEntitlementName(creditEntitlementName: JsonField<String>) = apply {
                    this.creditEntitlementName = creditEntitlementName
                }

                fun customerId(customerId: String) = customerId(JsonField.of(customerId))

                /**
                 * Sets [Builder.customerId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customerId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun customerId(customerId: JsonField<String>) = apply {
                    this.customerId = customerId
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("CreditBalanceLow")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun payloadType(payloadType: JsonValue) = apply { this.payloadType = payloadType }

                fun subscriptionCreditsAmount(subscriptionCreditsAmount: String) =
                    subscriptionCreditsAmount(JsonField.of(subscriptionCreditsAmount))

                /**
                 * Sets [Builder.subscriptionCreditsAmount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subscriptionCreditsAmount] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun subscriptionCreditsAmount(subscriptionCreditsAmount: JsonField<String>) =
                    apply {
                        this.subscriptionCreditsAmount = subscriptionCreditsAmount
                    }

                fun subscriptionId(subscriptionId: String) =
                    subscriptionId(JsonField.of(subscriptionId))

                /**
                 * Sets [Builder.subscriptionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subscriptionId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun subscriptionId(subscriptionId: JsonField<String>) = apply {
                    this.subscriptionId = subscriptionId
                }

                fun thresholdAmount(thresholdAmount: String) =
                    thresholdAmount(JsonField.of(thresholdAmount))

                /**
                 * Sets [Builder.thresholdAmount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.thresholdAmount] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun thresholdAmount(thresholdAmount: JsonField<String>) = apply {
                    this.thresholdAmount = thresholdAmount
                }

                fun thresholdPercent(thresholdPercent: Int) =
                    thresholdPercent(JsonField.of(thresholdPercent))

                /**
                 * Sets [Builder.thresholdPercent] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.thresholdPercent] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun thresholdPercent(thresholdPercent: JsonField<Int>) = apply {
                    this.thresholdPercent = thresholdPercent
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [CreditBalanceLow].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .availableBalance()
                 * .brandId()
                 * .creditEntitlementId()
                 * .creditEntitlementName()
                 * .customerId()
                 * .subscriptionCreditsAmount()
                 * .subscriptionId()
                 * .thresholdAmount()
                 * .thresholdPercent()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CreditBalanceLow =
                    CreditBalanceLow(
                        checkRequired("availableBalance", availableBalance),
                        checkRequired("brandId", brandId),
                        checkRequired("creditEntitlementId", creditEntitlementId),
                        checkRequired("creditEntitlementName", creditEntitlementName),
                        checkRequired("customerId", customerId),
                        payloadType,
                        checkRequired("subscriptionCreditsAmount", subscriptionCreditsAmount),
                        checkRequired("subscriptionId", subscriptionId),
                        checkRequired("thresholdAmount", thresholdAmount),
                        checkRequired("thresholdPercent", thresholdPercent),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): CreditBalanceLow = apply {
                if (validated) {
                    return@apply
                }

                availableBalance()
                brandId()
                creditEntitlementId()
                creditEntitlementName()
                customerId()
                _payloadType().let {
                    if (it != JsonValue.from("CreditBalanceLow")) {
                        throw DodoPaymentsInvalidDataException(
                            "'payloadType' is invalid, received $it"
                        )
                    }
                }
                subscriptionCreditsAmount()
                subscriptionId()
                thresholdAmount()
                thresholdPercent()
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
            internal fun validity(): Int =
                (if (availableBalance.asKnown() == null) 0 else 1) +
                    (if (brandId.asKnown() == null) 0 else 1) +
                    (if (creditEntitlementId.asKnown() == null) 0 else 1) +
                    (if (creditEntitlementName.asKnown() == null) 0 else 1) +
                    (if (customerId.asKnown() == null) 0 else 1) +
                    payloadType.let { if (it == JsonValue.from("CreditBalanceLow")) 1 else 0 } +
                    (if (subscriptionCreditsAmount.asKnown() == null) 0 else 1) +
                    (if (subscriptionId.asKnown() == null) 0 else 1) +
                    (if (thresholdAmount.asKnown() == null) 0 else 1) +
                    (if (thresholdPercent.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreditBalanceLow &&
                    availableBalance == other.availableBalance &&
                    brandId == other.brandId &&
                    creditEntitlementId == other.creditEntitlementId &&
                    creditEntitlementName == other.creditEntitlementName &&
                    customerId == other.customerId &&
                    payloadType == other.payloadType &&
                    subscriptionCreditsAmount == other.subscriptionCreditsAmount &&
                    subscriptionId == other.subscriptionId &&
                    thresholdAmount == other.thresholdAmount &&
                    thresholdPercent == other.thresholdPercent &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    availableBalance,
                    brandId,
                    creditEntitlementId,
                    creditEntitlementName,
                    customerId,
                    payloadType,
                    subscriptionCreditsAmount,
                    subscriptionId,
                    thresholdAmount,
                    thresholdPercent,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreditBalanceLow{availableBalance=$availableBalance, brandId=$brandId, creditEntitlementId=$creditEntitlementId, creditEntitlementName=$creditEntitlementName, customerId=$customerId, payloadType=$payloadType, subscriptionCreditsAmount=$subscriptionCreditsAmount, subscriptionId=$subscriptionId, thresholdAmount=$thresholdAmount, thresholdPercent=$thresholdPercent, additionalProperties=$additionalProperties}"
        }

        class AbandonedCheckout
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val abandonedAt: JsonField<OffsetDateTime>,
            private val abandonmentReason: JsonField<AbandonmentReason>,
            private val brandId: JsonField<String>,
            private val customerId: JsonField<String>,
            private val payloadType: JsonValue,
            private val paymentId: JsonField<String>,
            private val status: JsonField<Status>,
            private val recoveredPaymentId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("abandoned_at")
                @ExcludeMissing
                abandonedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("abandonment_reason")
                @ExcludeMissing
                abandonmentReason: JsonField<AbandonmentReason> = JsonMissing.of(),
                @JsonProperty("brand_id")
                @ExcludeMissing
                brandId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("customer_id")
                @ExcludeMissing
                customerId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("payload_type")
                @ExcludeMissing
                payloadType: JsonValue = JsonMissing.of(),
                @JsonProperty("payment_id")
                @ExcludeMissing
                paymentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<Status> = JsonMissing.of(),
                @JsonProperty("recovered_payment_id")
                @ExcludeMissing
                recoveredPaymentId: JsonField<String> = JsonMissing.of(),
            ) : this(
                abandonedAt,
                abandonmentReason,
                brandId,
                customerId,
                payloadType,
                paymentId,
                status,
                recoveredPaymentId,
                mutableMapOf(),
            )

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun abandonedAt(): OffsetDateTime = abandonedAt.getRequired("abandoned_at")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun abandonmentReason(): AbandonmentReason =
                abandonmentReason.getRequired("abandonment_reason")

            /**
             * Brand id this abandoned checkout belongs to
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun brandId(): String = brandId.getRequired("brand_id")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun customerId(): String = customerId.getRequired("customer_id")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("AbandonedCheckout")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("payload_type")
            @ExcludeMissing
            fun _payloadType(): JsonValue = payloadType

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentId(): String = paymentId.getRequired("payment_id")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun status(): Status = status.getRequired("status")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun recoveredPaymentId(): String? =
                recoveredPaymentId.getNullable("recovered_payment_id")

            /**
             * Returns the raw JSON value of [abandonedAt].
             *
             * Unlike [abandonedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("abandoned_at")
            @ExcludeMissing
            fun _abandonedAt(): JsonField<OffsetDateTime> = abandonedAt

            /**
             * Returns the raw JSON value of [abandonmentReason].
             *
             * Unlike [abandonmentReason], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("abandonment_reason")
            @ExcludeMissing
            fun _abandonmentReason(): JsonField<AbandonmentReason> = abandonmentReason

            /**
             * Returns the raw JSON value of [brandId].
             *
             * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("brand_id") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

            /**
             * Returns the raw JSON value of [customerId].
             *
             * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("customer_id")
            @ExcludeMissing
            fun _customerId(): JsonField<String> = customerId

            /**
             * Returns the raw JSON value of [paymentId].
             *
             * Unlike [paymentId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("payment_id")
            @ExcludeMissing
            fun _paymentId(): JsonField<String> = paymentId

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

            /**
             * Returns the raw JSON value of [recoveredPaymentId].
             *
             * Unlike [recoveredPaymentId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("recovered_payment_id")
            @ExcludeMissing
            fun _recoveredPaymentId(): JsonField<String> = recoveredPaymentId

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
                 * Returns a mutable builder for constructing an instance of [AbandonedCheckout].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .abandonedAt()
                 * .abandonmentReason()
                 * .brandId()
                 * .customerId()
                 * .paymentId()
                 * .status()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [AbandonedCheckout]. */
            class Builder internal constructor() {

                private var abandonedAt: JsonField<OffsetDateTime>? = null
                private var abandonmentReason: JsonField<AbandonmentReason>? = null
                private var brandId: JsonField<String>? = null
                private var customerId: JsonField<String>? = null
                private var payloadType: JsonValue = JsonValue.from("AbandonedCheckout")
                private var paymentId: JsonField<String>? = null
                private var status: JsonField<Status>? = null
                private var recoveredPaymentId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(abandonedCheckout: AbandonedCheckout) = apply {
                    abandonedAt = abandonedCheckout.abandonedAt
                    abandonmentReason = abandonedCheckout.abandonmentReason
                    brandId = abandonedCheckout.brandId
                    customerId = abandonedCheckout.customerId
                    payloadType = abandonedCheckout.payloadType
                    paymentId = abandonedCheckout.paymentId
                    status = abandonedCheckout.status
                    recoveredPaymentId = abandonedCheckout.recoveredPaymentId
                    additionalProperties = abandonedCheckout.additionalProperties.toMutableMap()
                }

                fun abandonedAt(abandonedAt: OffsetDateTime) =
                    abandonedAt(JsonField.of(abandonedAt))

                /**
                 * Sets [Builder.abandonedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.abandonedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun abandonedAt(abandonedAt: JsonField<OffsetDateTime>) = apply {
                    this.abandonedAt = abandonedAt
                }

                fun abandonmentReason(abandonmentReason: AbandonmentReason) =
                    abandonmentReason(JsonField.of(abandonmentReason))

                /**
                 * Sets [Builder.abandonmentReason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.abandonmentReason] with a well-typed
                 * [AbandonmentReason] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun abandonmentReason(abandonmentReason: JsonField<AbandonmentReason>) = apply {
                    this.abandonmentReason = abandonmentReason
                }

                /** Brand id this abandoned checkout belongs to */
                fun brandId(brandId: String) = brandId(JsonField.of(brandId))

                /**
                 * Sets [Builder.brandId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.brandId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

                fun customerId(customerId: String) = customerId(JsonField.of(customerId))

                /**
                 * Sets [Builder.customerId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customerId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun customerId(customerId: JsonField<String>) = apply {
                    this.customerId = customerId
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("AbandonedCheckout")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun payloadType(payloadType: JsonValue) = apply { this.payloadType = payloadType }

                fun paymentId(paymentId: String) = paymentId(JsonField.of(paymentId))

                /**
                 * Sets [Builder.paymentId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun paymentId(paymentId: JsonField<String>) = apply { this.paymentId = paymentId }

                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

                fun recoveredPaymentId(recoveredPaymentId: String?) =
                    recoveredPaymentId(JsonField.ofNullable(recoveredPaymentId))

                /**
                 * Sets [Builder.recoveredPaymentId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recoveredPaymentId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun recoveredPaymentId(recoveredPaymentId: JsonField<String>) = apply {
                    this.recoveredPaymentId = recoveredPaymentId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [AbandonedCheckout].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .abandonedAt()
                 * .abandonmentReason()
                 * .brandId()
                 * .customerId()
                 * .paymentId()
                 * .status()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): AbandonedCheckout =
                    AbandonedCheckout(
                        checkRequired("abandonedAt", abandonedAt),
                        checkRequired("abandonmentReason", abandonmentReason),
                        checkRequired("brandId", brandId),
                        checkRequired("customerId", customerId),
                        payloadType,
                        checkRequired("paymentId", paymentId),
                        checkRequired("status", status),
                        recoveredPaymentId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): AbandonedCheckout = apply {
                if (validated) {
                    return@apply
                }

                abandonedAt()
                abandonmentReason().validate()
                brandId()
                customerId()
                _payloadType().let {
                    if (it != JsonValue.from("AbandonedCheckout")) {
                        throw DodoPaymentsInvalidDataException(
                            "'payloadType' is invalid, received $it"
                        )
                    }
                }
                paymentId()
                status().validate()
                recoveredPaymentId()
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
            internal fun validity(): Int =
                (if (abandonedAt.asKnown() == null) 0 else 1) +
                    (abandonmentReason.asKnown()?.validity() ?: 0) +
                    (if (brandId.asKnown() == null) 0 else 1) +
                    (if (customerId.asKnown() == null) 0 else 1) +
                    payloadType.let { if (it == JsonValue.from("AbandonedCheckout")) 1 else 0 } +
                    (if (paymentId.asKnown() == null) 0 else 1) +
                    (status.asKnown()?.validity() ?: 0) +
                    (if (recoveredPaymentId.asKnown() == null) 0 else 1)

            class AbandonmentReason
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val PAYMENT_FAILED = of("payment_failed")

                    val CHECKOUT_INCOMPLETE = of("checkout_incomplete")

                    fun of(value: String) = AbandonmentReason(JsonField.of(value))
                }

                /** An enum containing [AbandonmentReason]'s known values. */
                enum class Known {
                    PAYMENT_FAILED,
                    CHECKOUT_INCOMPLETE,
                }

                /**
                 * An enum containing [AbandonmentReason]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [AbandonmentReason] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PAYMENT_FAILED,
                    CHECKOUT_INCOMPLETE,
                    /**
                     * An enum member indicating that [AbandonmentReason] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        PAYMENT_FAILED -> Value.PAYMENT_FAILED
                        CHECKOUT_INCOMPLETE -> Value.CHECKOUT_INCOMPLETE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws DodoPaymentsInvalidDataException if this class instance's value is a not
                 *   a known member.
                 */
                fun known(): Known =
                    when (this) {
                        PAYMENT_FAILED -> Known.PAYMENT_FAILED
                        CHECKOUT_INCOMPLETE -> Known.CHECKOUT_INCOMPLETE
                        else ->
                            throw DodoPaymentsInvalidDataException(
                                "Unknown AbandonmentReason: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws DodoPaymentsInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw DodoPaymentsInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): AbandonmentReason = apply {
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

                    return other is AbandonmentReason && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Status @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val ABANDONED = of("abandoned")

                    val RECOVERING = of("recovering")

                    val RECOVERED = of("recovered")

                    val EXHAUSTED = of("exhausted")

                    val OPTED_OUT = of("opted_out")

                    fun of(value: String) = Status(JsonField.of(value))
                }

                /** An enum containing [Status]'s known values. */
                enum class Known {
                    ABANDONED,
                    RECOVERING,
                    RECOVERED,
                    EXHAUSTED,
                    OPTED_OUT,
                }

                /**
                 * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Status] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ABANDONED,
                    RECOVERING,
                    RECOVERED,
                    EXHAUSTED,
                    OPTED_OUT,
                    /**
                     * An enum member indicating that [Status] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ABANDONED -> Value.ABANDONED
                        RECOVERING -> Value.RECOVERING
                        RECOVERED -> Value.RECOVERED
                        EXHAUSTED -> Value.EXHAUSTED
                        OPTED_OUT -> Value.OPTED_OUT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws DodoPaymentsInvalidDataException if this class instance's value is a not
                 *   a known member.
                 */
                fun known(): Known =
                    when (this) {
                        ABANDONED -> Known.ABANDONED
                        RECOVERING -> Known.RECOVERING
                        RECOVERED -> Known.RECOVERED
                        EXHAUSTED -> Known.EXHAUSTED
                        OPTED_OUT -> Known.OPTED_OUT
                        else -> throw DodoPaymentsInvalidDataException("Unknown Status: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws DodoPaymentsInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw DodoPaymentsInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Status = apply {
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

                    return other is Status && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AbandonedCheckout &&
                    abandonedAt == other.abandonedAt &&
                    abandonmentReason == other.abandonmentReason &&
                    brandId == other.brandId &&
                    customerId == other.customerId &&
                    payloadType == other.payloadType &&
                    paymentId == other.paymentId &&
                    status == other.status &&
                    recoveredPaymentId == other.recoveredPaymentId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    abandonedAt,
                    abandonmentReason,
                    brandId,
                    customerId,
                    payloadType,
                    paymentId,
                    status,
                    recoveredPaymentId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AbandonedCheckout{abandonedAt=$abandonedAt, abandonmentReason=$abandonmentReason, brandId=$brandId, customerId=$customerId, payloadType=$payloadType, paymentId=$paymentId, status=$status, recoveredPaymentId=$recoveredPaymentId, additionalProperties=$additionalProperties}"
        }

        class DunningAttempt
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val brandId: JsonField<String>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val customerId: JsonField<String>,
            private val payloadType: JsonValue,
            private val status: JsonField<Status>,
            private val subscriptionId: JsonField<String>,
            private val triggerState: JsonField<TriggerState>,
            private val paymentId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("brand_id")
                @ExcludeMissing
                brandId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("customer_id")
                @ExcludeMissing
                customerId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("payload_type")
                @ExcludeMissing
                payloadType: JsonValue = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<Status> = JsonMissing.of(),
                @JsonProperty("subscription_id")
                @ExcludeMissing
                subscriptionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("trigger_state")
                @ExcludeMissing
                triggerState: JsonField<TriggerState> = JsonMissing.of(),
                @JsonProperty("payment_id")
                @ExcludeMissing
                paymentId: JsonField<String> = JsonMissing.of(),
            ) : this(
                brandId,
                createdAt,
                customerId,
                payloadType,
                status,
                subscriptionId,
                triggerState,
                paymentId,
                mutableMapOf(),
            )

            /**
             * Brand id this dunning attempt belongs to
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun brandId(): String = brandId.getRequired("brand_id")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun customerId(): String = customerId.getRequired("customer_id")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("DunningAttempt")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("payload_type")
            @ExcludeMissing
            fun _payloadType(): JsonValue = payloadType

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun status(): Status = status.getRequired("status")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun subscriptionId(): String = subscriptionId.getRequired("subscription_id")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun triggerState(): TriggerState = triggerState.getRequired("trigger_state")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun paymentId(): String? = paymentId.getNullable("payment_id")

            /**
             * Returns the raw JSON value of [brandId].
             *
             * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("brand_id") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [customerId].
             *
             * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("customer_id")
            @ExcludeMissing
            fun _customerId(): JsonField<String> = customerId

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

            /**
             * Returns the raw JSON value of [subscriptionId].
             *
             * Unlike [subscriptionId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("subscription_id")
            @ExcludeMissing
            fun _subscriptionId(): JsonField<String> = subscriptionId

            /**
             * Returns the raw JSON value of [triggerState].
             *
             * Unlike [triggerState], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("trigger_state")
            @ExcludeMissing
            fun _triggerState(): JsonField<TriggerState> = triggerState

            /**
             * Returns the raw JSON value of [paymentId].
             *
             * Unlike [paymentId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("payment_id")
            @ExcludeMissing
            fun _paymentId(): JsonField<String> = paymentId

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
                 * Returns a mutable builder for constructing an instance of [DunningAttempt].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .brandId()
                 * .createdAt()
                 * .customerId()
                 * .status()
                 * .subscriptionId()
                 * .triggerState()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [DunningAttempt]. */
            class Builder internal constructor() {

                private var brandId: JsonField<String>? = null
                private var createdAt: JsonField<OffsetDateTime>? = null
                private var customerId: JsonField<String>? = null
                private var payloadType: JsonValue = JsonValue.from("DunningAttempt")
                private var status: JsonField<Status>? = null
                private var subscriptionId: JsonField<String>? = null
                private var triggerState: JsonField<TriggerState>? = null
                private var paymentId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(dunningAttempt: DunningAttempt) = apply {
                    brandId = dunningAttempt.brandId
                    createdAt = dunningAttempt.createdAt
                    customerId = dunningAttempt.customerId
                    payloadType = dunningAttempt.payloadType
                    status = dunningAttempt.status
                    subscriptionId = dunningAttempt.subscriptionId
                    triggerState = dunningAttempt.triggerState
                    paymentId = dunningAttempt.paymentId
                    additionalProperties = dunningAttempt.additionalProperties.toMutableMap()
                }

                /** Brand id this dunning attempt belongs to */
                fun brandId(brandId: String) = brandId(JsonField.of(brandId))

                /**
                 * Sets [Builder.brandId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.brandId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                fun customerId(customerId: String) = customerId(JsonField.of(customerId))

                /**
                 * Sets [Builder.customerId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customerId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun customerId(customerId: JsonField<String>) = apply {
                    this.customerId = customerId
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("DunningAttempt")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun payloadType(payloadType: JsonValue) = apply { this.payloadType = payloadType }

                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

                fun subscriptionId(subscriptionId: String) =
                    subscriptionId(JsonField.of(subscriptionId))

                /**
                 * Sets [Builder.subscriptionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subscriptionId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun subscriptionId(subscriptionId: JsonField<String>) = apply {
                    this.subscriptionId = subscriptionId
                }

                fun triggerState(triggerState: TriggerState) =
                    triggerState(JsonField.of(triggerState))

                /**
                 * Sets [Builder.triggerState] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.triggerState] with a well-typed [TriggerState]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun triggerState(triggerState: JsonField<TriggerState>) = apply {
                    this.triggerState = triggerState
                }

                fun paymentId(paymentId: String?) = paymentId(JsonField.ofNullable(paymentId))

                /**
                 * Sets [Builder.paymentId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun paymentId(paymentId: JsonField<String>) = apply { this.paymentId = paymentId }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [DunningAttempt].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .brandId()
                 * .createdAt()
                 * .customerId()
                 * .status()
                 * .subscriptionId()
                 * .triggerState()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): DunningAttempt =
                    DunningAttempt(
                        checkRequired("brandId", brandId),
                        checkRequired("createdAt", createdAt),
                        checkRequired("customerId", customerId),
                        payloadType,
                        checkRequired("status", status),
                        checkRequired("subscriptionId", subscriptionId),
                        checkRequired("triggerState", triggerState),
                        paymentId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): DunningAttempt = apply {
                if (validated) {
                    return@apply
                }

                brandId()
                createdAt()
                customerId()
                _payloadType().let {
                    if (it != JsonValue.from("DunningAttempt")) {
                        throw DodoPaymentsInvalidDataException(
                            "'payloadType' is invalid, received $it"
                        )
                    }
                }
                status().validate()
                subscriptionId()
                triggerState().validate()
                paymentId()
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
            internal fun validity(): Int =
                (if (brandId.asKnown() == null) 0 else 1) +
                    (if (createdAt.asKnown() == null) 0 else 1) +
                    (if (customerId.asKnown() == null) 0 else 1) +
                    payloadType.let { if (it == JsonValue.from("DunningAttempt")) 1 else 0 } +
                    (status.asKnown()?.validity() ?: 0) +
                    (if (subscriptionId.asKnown() == null) 0 else 1) +
                    (triggerState.asKnown()?.validity() ?: 0) +
                    (if (paymentId.asKnown() == null) 0 else 1)

            class Status @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val RECOVERING = of("recovering")

                    val RECOVERED = of("recovered")

                    val EXHAUSTED = of("exhausted")

                    fun of(value: String) = Status(JsonField.of(value))
                }

                /** An enum containing [Status]'s known values. */
                enum class Known {
                    RECOVERING,
                    RECOVERED,
                    EXHAUSTED,
                }

                /**
                 * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Status] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    RECOVERING,
                    RECOVERED,
                    EXHAUSTED,
                    /**
                     * An enum member indicating that [Status] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        RECOVERING -> Value.RECOVERING
                        RECOVERED -> Value.RECOVERED
                        EXHAUSTED -> Value.EXHAUSTED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws DodoPaymentsInvalidDataException if this class instance's value is a not
                 *   a known member.
                 */
                fun known(): Known =
                    when (this) {
                        RECOVERING -> Known.RECOVERING
                        RECOVERED -> Known.RECOVERED
                        EXHAUSTED -> Known.EXHAUSTED
                        else -> throw DodoPaymentsInvalidDataException("Unknown Status: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws DodoPaymentsInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw DodoPaymentsInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Status = apply {
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

                    return other is Status && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class TriggerState
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val ON_HOLD = of("on_hold")

                    val CANCELLED = of("cancelled")

                    fun of(value: String) = TriggerState(JsonField.of(value))
                }

                /** An enum containing [TriggerState]'s known values. */
                enum class Known {
                    ON_HOLD,
                    CANCELLED,
                }

                /**
                 * An enum containing [TriggerState]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [TriggerState] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ON_HOLD,
                    CANCELLED,
                    /**
                     * An enum member indicating that [TriggerState] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ON_HOLD -> Value.ON_HOLD
                        CANCELLED -> Value.CANCELLED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws DodoPaymentsInvalidDataException if this class instance's value is a not
                 *   a known member.
                 */
                fun known(): Known =
                    when (this) {
                        ON_HOLD -> Known.ON_HOLD
                        CANCELLED -> Known.CANCELLED
                        else ->
                            throw DodoPaymentsInvalidDataException("Unknown TriggerState: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws DodoPaymentsInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw DodoPaymentsInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): TriggerState = apply {
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

                    return other is TriggerState && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DunningAttempt &&
                    brandId == other.brandId &&
                    createdAt == other.createdAt &&
                    customerId == other.customerId &&
                    payloadType == other.payloadType &&
                    status == other.status &&
                    subscriptionId == other.subscriptionId &&
                    triggerState == other.triggerState &&
                    paymentId == other.paymentId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    brandId,
                    createdAt,
                    customerId,
                    payloadType,
                    status,
                    subscriptionId,
                    triggerState,
                    paymentId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DunningAttempt{brandId=$brandId, createdAt=$createdAt, customerId=$customerId, payloadType=$payloadType, status=$status, subscriptionId=$subscriptionId, triggerState=$triggerState, paymentId=$paymentId, additionalProperties=$additionalProperties}"
        }

        /**
         * Detailed view of a single entitlement grant: who it's for, its lifecycle state, and any
         * integration-specific delivery payload.
         */
        class EntitlementGrant
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val brandId: JsonField<String>,
            private val businessId: JsonField<String>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val customerId: JsonField<String>,
            private val entitlementId: JsonField<String>,
            private val integrationType: JsonField<EntitlementIntegrationType>,
            private val metadata: JsonField<Metadata>,
            private val status:
                JsonField<com.dodopayments.api.models.entitlements.grants.EntitlementGrant.Status>,
            private val updatedAt: JsonField<OffsetDateTime>,
            private val deliveredAt: JsonField<OffsetDateTime>,
            private val digitalProductDelivery: JsonField<DigitalProductDelivery>,
            private val errorCode: JsonField<String>,
            private val errorMessage: JsonField<String>,
            private val feature: JsonField<Feature>,
            private val licenseKey: JsonField<LicenseKeyGrant>,
            private val oauthExpiresAt: JsonField<OffsetDateTime>,
            private val oauthUrl: JsonField<String>,
            private val paymentId: JsonField<String>,
            private val revocationReason: JsonField<String>,
            private val revokedAt: JsonField<OffsetDateTime>,
            private val subscriptionId: JsonField<String>,
            private val payloadType: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("brand_id")
                @ExcludeMissing
                brandId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("business_id")
                @ExcludeMissing
                businessId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("customer_id")
                @ExcludeMissing
                customerId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("entitlement_id")
                @ExcludeMissing
                entitlementId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("integration_type")
                @ExcludeMissing
                integrationType: JsonField<EntitlementIntegrationType> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status:
                    JsonField<
                        com.dodopayments.api.models.entitlements.grants.EntitlementGrant.Status
                    > =
                    JsonMissing.of(),
                @JsonProperty("updated_at")
                @ExcludeMissing
                updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("delivered_at")
                @ExcludeMissing
                deliveredAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("digital_product_delivery")
                @ExcludeMissing
                digitalProductDelivery: JsonField<DigitalProductDelivery> = JsonMissing.of(),
                @JsonProperty("error_code")
                @ExcludeMissing
                errorCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("error_message")
                @ExcludeMissing
                errorMessage: JsonField<String> = JsonMissing.of(),
                @JsonProperty("feature")
                @ExcludeMissing
                feature: JsonField<Feature> = JsonMissing.of(),
                @JsonProperty("license_key")
                @ExcludeMissing
                licenseKey: JsonField<LicenseKeyGrant> = JsonMissing.of(),
                @JsonProperty("oauth_expires_at")
                @ExcludeMissing
                oauthExpiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("oauth_url")
                @ExcludeMissing
                oauthUrl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("payment_id")
                @ExcludeMissing
                paymentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("revocation_reason")
                @ExcludeMissing
                revocationReason: JsonField<String> = JsonMissing.of(),
                @JsonProperty("revoked_at")
                @ExcludeMissing
                revokedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("subscription_id")
                @ExcludeMissing
                subscriptionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("payload_type")
                @ExcludeMissing
                payloadType: JsonValue = JsonMissing.of(),
            ) : this(
                id,
                brandId,
                businessId,
                createdAt,
                customerId,
                entitlementId,
                integrationType,
                metadata,
                status,
                updatedAt,
                deliveredAt,
                digitalProductDelivery,
                errorCode,
                errorMessage,
                feature,
                licenseKey,
                oauthExpiresAt,
                oauthUrl,
                paymentId,
                revocationReason,
                revokedAt,
                subscriptionId,
                payloadType,
                mutableMapOf(),
            )

            fun toEntitlementGrant(): EntitlementGrant =
                EntitlementGrant.builder()
                    .id(id)
                    .brandId(brandId)
                    .businessId(businessId)
                    .createdAt(createdAt)
                    .customerId(customerId)
                    .entitlementId(entitlementId)
                    .integrationType(integrationType)
                    .metadata(metadata)
                    .status(status)
                    .updatedAt(updatedAt)
                    .deliveredAt(deliveredAt)
                    .digitalProductDelivery(digitalProductDelivery)
                    .errorCode(errorCode)
                    .errorMessage(errorMessage)
                    .feature(feature)
                    .licenseKey(licenseKey)
                    .oauthExpiresAt(oauthExpiresAt)
                    .oauthUrl(oauthUrl)
                    .paymentId(paymentId)
                    .revocationReason(revocationReason)
                    .revokedAt(revokedAt)
                    .subscriptionId(subscriptionId)
                    .build()

            /**
             * Unique identifier of the grant.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Brand id this grant belongs to.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun brandId(): String = brandId.getRequired("brand_id")

            /**
             * Identifier of the business that owns the grant.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun businessId(): String = businessId.getRequired("business_id")

            /**
             * Timestamp when the grant was created.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

            /**
             * Identifier of the customer the grant was issued to.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun customerId(): String = customerId.getRequired("customer_id")

            /**
             * Identifier of the entitlement this grant was issued from.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun entitlementId(): String = entitlementId.getRequired("entitlement_id")

            /**
             * The integration type of the grant's entitlement (e.g. `license_key`).
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun integrationType(): EntitlementIntegrationType =
                integrationType.getRequired("integration_type")

            /**
             * Arbitrary key-value metadata recorded on the grant.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun metadata(): Metadata = metadata.getRequired("metadata")

            /**
             * Lifecycle status of the grant.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun status(): com.dodopayments.api.models.entitlements.grants.EntitlementGrant.Status =
                status.getRequired("status")

            /**
             * Timestamp when the grant was last modified.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

            /**
             * Timestamp when the grant transitioned to `delivered`, when applicable.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun deliveredAt(): OffsetDateTime? = deliveredAt.getNullable("delivered_at")

            /**
             * Digital-product-delivery payload, present when the entitlement integration is
             * `digital_files`.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun digitalProductDelivery(): DigitalProductDelivery? =
                digitalProductDelivery.getNullable("digital_product_delivery")

            /**
             * Machine-readable code reported when delivery failed, when applicable.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun errorCode(): String? = errorCode.getNullable("error_code")

            /**
             * Human-readable message reported when delivery failed, when applicable.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun errorMessage(): String? = errorMessage.getNullable("error_message")

            /**
             * Typed feature payload, present only when the entitlement integration is
             * `feature_flag`; `null` for every other integration type.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun feature(): Feature? = feature.getNullable("feature")

            /**
             * License-key delivery payload, present when the entitlement integration is
             * `license_key`.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun licenseKey(): LicenseKeyGrant? = licenseKey.getNullable("license_key")

            /**
             * Timestamp when `oauth_url` stops being valid, when applicable.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun oauthExpiresAt(): OffsetDateTime? = oauthExpiresAt.getNullable("oauth_expires_at")

            /**
             * Customer-facing OAuth URL for OAuth-style integrations. Populated during the
             * customer-portal accept flow; `null` until the customer completes that step, and on
             * grants for non-OAuth integrations.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun oauthUrl(): String? = oauthUrl.getNullable("oauth_url")

            /**
             * Identifier of the payment that triggered this grant, when applicable.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun paymentId(): String? = paymentId.getNullable("payment_id")

            /**
             * Reason recorded when the grant was revoked, when applicable.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun revocationReason(): String? = revocationReason.getNullable("revocation_reason")

            /**
             * Timestamp when the grant transitioned to `revoked`, when applicable.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun revokedAt(): OffsetDateTime? = revokedAt.getNullable("revoked_at")

            /**
             * Identifier of the subscription that triggered this grant, when applicable.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun subscriptionId(): String? = subscriptionId.getNullable("subscription_id")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("EntitlementGrant")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("payload_type")
            @ExcludeMissing
            fun _payloadType(): JsonValue = payloadType

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [brandId].
             *
             * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("brand_id") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

            /**
             * Returns the raw JSON value of [businessId].
             *
             * Unlike [businessId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("business_id")
            @ExcludeMissing
            fun _businessId(): JsonField<String> = businessId

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [customerId].
             *
             * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("customer_id")
            @ExcludeMissing
            fun _customerId(): JsonField<String> = customerId

            /**
             * Returns the raw JSON value of [entitlementId].
             *
             * Unlike [entitlementId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("entitlement_id")
            @ExcludeMissing
            fun _entitlementId(): JsonField<String> = entitlementId

            /**
             * Returns the raw JSON value of [integrationType].
             *
             * Unlike [integrationType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("integration_type")
            @ExcludeMissing
            fun _integrationType(): JsonField<EntitlementIntegrationType> = integrationType

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status")
            @ExcludeMissing
            fun _status():
                JsonField<com.dodopayments.api.models.entitlements.grants.EntitlementGrant.Status> =
                status

            /**
             * Returns the raw JSON value of [updatedAt].
             *
             * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("updated_at")
            @ExcludeMissing
            fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

            /**
             * Returns the raw JSON value of [deliveredAt].
             *
             * Unlike [deliveredAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("delivered_at")
            @ExcludeMissing
            fun _deliveredAt(): JsonField<OffsetDateTime> = deliveredAt

            /**
             * Returns the raw JSON value of [digitalProductDelivery].
             *
             * Unlike [digitalProductDelivery], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("digital_product_delivery")
            @ExcludeMissing
            fun _digitalProductDelivery(): JsonField<DigitalProductDelivery> =
                digitalProductDelivery

            /**
             * Returns the raw JSON value of [errorCode].
             *
             * Unlike [errorCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("error_code")
            @ExcludeMissing
            fun _errorCode(): JsonField<String> = errorCode

            /**
             * Returns the raw JSON value of [errorMessage].
             *
             * Unlike [errorMessage], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("error_message")
            @ExcludeMissing
            fun _errorMessage(): JsonField<String> = errorMessage

            /**
             * Returns the raw JSON value of [feature].
             *
             * Unlike [feature], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("feature") @ExcludeMissing fun _feature(): JsonField<Feature> = feature

            /**
             * Returns the raw JSON value of [licenseKey].
             *
             * Unlike [licenseKey], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("license_key")
            @ExcludeMissing
            fun _licenseKey(): JsonField<LicenseKeyGrant> = licenseKey

            /**
             * Returns the raw JSON value of [oauthExpiresAt].
             *
             * Unlike [oauthExpiresAt], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("oauth_expires_at")
            @ExcludeMissing
            fun _oauthExpiresAt(): JsonField<OffsetDateTime> = oauthExpiresAt

            /**
             * Returns the raw JSON value of [oauthUrl].
             *
             * Unlike [oauthUrl], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("oauth_url") @ExcludeMissing fun _oauthUrl(): JsonField<String> = oauthUrl

            /**
             * Returns the raw JSON value of [paymentId].
             *
             * Unlike [paymentId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("payment_id")
            @ExcludeMissing
            fun _paymentId(): JsonField<String> = paymentId

            /**
             * Returns the raw JSON value of [revocationReason].
             *
             * Unlike [revocationReason], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("revocation_reason")
            @ExcludeMissing
            fun _revocationReason(): JsonField<String> = revocationReason

            /**
             * Returns the raw JSON value of [revokedAt].
             *
             * Unlike [revokedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("revoked_at")
            @ExcludeMissing
            fun _revokedAt(): JsonField<OffsetDateTime> = revokedAt

            /**
             * Returns the raw JSON value of [subscriptionId].
             *
             * Unlike [subscriptionId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("subscription_id")
            @ExcludeMissing
            fun _subscriptionId(): JsonField<String> = subscriptionId

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
                 * Returns a mutable builder for constructing an instance of [EntitlementGrant].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .brandId()
                 * .businessId()
                 * .createdAt()
                 * .customerId()
                 * .entitlementId()
                 * .integrationType()
                 * .metadata()
                 * .status()
                 * .updatedAt()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [EntitlementGrant]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var brandId: JsonField<String>? = null
                private var businessId: JsonField<String>? = null
                private var createdAt: JsonField<OffsetDateTime>? = null
                private var customerId: JsonField<String>? = null
                private var entitlementId: JsonField<String>? = null
                private var integrationType: JsonField<EntitlementIntegrationType>? = null
                private var metadata: JsonField<Metadata>? = null
                private var status:
                    JsonField<
                        com.dodopayments.api.models.entitlements.grants.EntitlementGrant.Status
                    >? =
                    null
                private var updatedAt: JsonField<OffsetDateTime>? = null
                private var deliveredAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var digitalProductDelivery: JsonField<DigitalProductDelivery> =
                    JsonMissing.of()
                private var errorCode: JsonField<String> = JsonMissing.of()
                private var errorMessage: JsonField<String> = JsonMissing.of()
                private var feature: JsonField<Feature> = JsonMissing.of()
                private var licenseKey: JsonField<LicenseKeyGrant> = JsonMissing.of()
                private var oauthExpiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var oauthUrl: JsonField<String> = JsonMissing.of()
                private var paymentId: JsonField<String> = JsonMissing.of()
                private var revocationReason: JsonField<String> = JsonMissing.of()
                private var revokedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var subscriptionId: JsonField<String> = JsonMissing.of()
                private var payloadType: JsonValue = JsonValue.from("EntitlementGrant")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(entitlementGrant: EntitlementGrant) = apply {
                    id = entitlementGrant.id
                    brandId = entitlementGrant.brandId
                    businessId = entitlementGrant.businessId
                    createdAt = entitlementGrant.createdAt
                    customerId = entitlementGrant.customerId
                    entitlementId = entitlementGrant.entitlementId
                    integrationType = entitlementGrant.integrationType
                    metadata = entitlementGrant.metadata
                    status = entitlementGrant.status
                    updatedAt = entitlementGrant.updatedAt
                    deliveredAt = entitlementGrant.deliveredAt
                    digitalProductDelivery = entitlementGrant.digitalProductDelivery
                    errorCode = entitlementGrant.errorCode
                    errorMessage = entitlementGrant.errorMessage
                    feature = entitlementGrant.feature
                    licenseKey = entitlementGrant.licenseKey
                    oauthExpiresAt = entitlementGrant.oauthExpiresAt
                    oauthUrl = entitlementGrant.oauthUrl
                    paymentId = entitlementGrant.paymentId
                    revocationReason = entitlementGrant.revocationReason
                    revokedAt = entitlementGrant.revokedAt
                    subscriptionId = entitlementGrant.subscriptionId
                    payloadType = entitlementGrant.payloadType
                    additionalProperties = entitlementGrant.additionalProperties.toMutableMap()
                }

                /** Unique identifier of the grant. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** Brand id this grant belongs to. */
                fun brandId(brandId: String) = brandId(JsonField.of(brandId))

                /**
                 * Sets [Builder.brandId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.brandId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

                /** Identifier of the business that owns the grant. */
                fun businessId(businessId: String) = businessId(JsonField.of(businessId))

                /**
                 * Sets [Builder.businessId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.businessId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun businessId(businessId: JsonField<String>) = apply {
                    this.businessId = businessId
                }

                /** Timestamp when the grant was created. */
                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                /** Identifier of the customer the grant was issued to. */
                fun customerId(customerId: String) = customerId(JsonField.of(customerId))

                /**
                 * Sets [Builder.customerId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customerId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun customerId(customerId: JsonField<String>) = apply {
                    this.customerId = customerId
                }

                /** Identifier of the entitlement this grant was issued from. */
                fun entitlementId(entitlementId: String) =
                    entitlementId(JsonField.of(entitlementId))

                /**
                 * Sets [Builder.entitlementId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.entitlementId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun entitlementId(entitlementId: JsonField<String>) = apply {
                    this.entitlementId = entitlementId
                }

                /** The integration type of the grant's entitlement (e.g. `license_key`). */
                fun integrationType(integrationType: EntitlementIntegrationType) =
                    integrationType(JsonField.of(integrationType))

                /**
                 * Sets [Builder.integrationType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.integrationType] with a well-typed
                 * [EntitlementIntegrationType] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun integrationType(integrationType: JsonField<EntitlementIntegrationType>) =
                    apply {
                        this.integrationType = integrationType
                    }

                /** Arbitrary key-value metadata recorded on the grant. */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                /** Lifecycle status of the grant. */
                fun status(
                    status: com.dodopayments.api.models.entitlements.grants.EntitlementGrant.Status
                ) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed
                 * [EntitlementGrant.Status] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun status(
                    status:
                        JsonField<
                            com.dodopayments.api.models.entitlements.grants.EntitlementGrant.Status
                        >
                ) = apply { this.status = status }

                /** Timestamp when the grant was last modified. */
                fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

                /**
                 * Sets [Builder.updatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                    this.updatedAt = updatedAt
                }

                /** Timestamp when the grant transitioned to `delivered`, when applicable. */
                fun deliveredAt(deliveredAt: OffsetDateTime?) =
                    deliveredAt(JsonField.ofNullable(deliveredAt))

                /**
                 * Sets [Builder.deliveredAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.deliveredAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun deliveredAt(deliveredAt: JsonField<OffsetDateTime>) = apply {
                    this.deliveredAt = deliveredAt
                }

                /**
                 * Digital-product-delivery payload, present when the entitlement integration is
                 * `digital_files`.
                 */
                fun digitalProductDelivery(digitalProductDelivery: DigitalProductDelivery?) =
                    digitalProductDelivery(JsonField.ofNullable(digitalProductDelivery))

                /**
                 * Sets [Builder.digitalProductDelivery] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.digitalProductDelivery] with a well-typed
                 * [DigitalProductDelivery] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun digitalProductDelivery(
                    digitalProductDelivery: JsonField<DigitalProductDelivery>
                ) = apply { this.digitalProductDelivery = digitalProductDelivery }

                /** Machine-readable code reported when delivery failed, when applicable. */
                fun errorCode(errorCode: String?) = errorCode(JsonField.ofNullable(errorCode))

                /**
                 * Sets [Builder.errorCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.errorCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun errorCode(errorCode: JsonField<String>) = apply { this.errorCode = errorCode }

                /** Human-readable message reported when delivery failed, when applicable. */
                fun errorMessage(errorMessage: String?) =
                    errorMessage(JsonField.ofNullable(errorMessage))

                /**
                 * Sets [Builder.errorMessage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.errorMessage] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun errorMessage(errorMessage: JsonField<String>) = apply {
                    this.errorMessage = errorMessage
                }

                /**
                 * Typed feature payload, present only when the entitlement integration is
                 * `feature_flag`; `null` for every other integration type.
                 */
                fun feature(feature: Feature?) = feature(JsonField.ofNullable(feature))

                /**
                 * Sets [Builder.feature] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.feature] with a well-typed [Feature] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun feature(feature: JsonField<Feature>) = apply { this.feature = feature }

                /**
                 * License-key delivery payload, present when the entitlement integration is
                 * `license_key`.
                 */
                fun licenseKey(licenseKey: LicenseKeyGrant?) =
                    licenseKey(JsonField.ofNullable(licenseKey))

                /**
                 * Sets [Builder.licenseKey] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.licenseKey] with a well-typed [LicenseKeyGrant]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun licenseKey(licenseKey: JsonField<LicenseKeyGrant>) = apply {
                    this.licenseKey = licenseKey
                }

                /** Timestamp when `oauth_url` stops being valid, when applicable. */
                fun oauthExpiresAt(oauthExpiresAt: OffsetDateTime?) =
                    oauthExpiresAt(JsonField.ofNullable(oauthExpiresAt))

                /**
                 * Sets [Builder.oauthExpiresAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.oauthExpiresAt] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun oauthExpiresAt(oauthExpiresAt: JsonField<OffsetDateTime>) = apply {
                    this.oauthExpiresAt = oauthExpiresAt
                }

                /**
                 * Customer-facing OAuth URL for OAuth-style integrations. Populated during the
                 * customer-portal accept flow; `null` until the customer completes that step, and
                 * on grants for non-OAuth integrations.
                 */
                fun oauthUrl(oauthUrl: String?) = oauthUrl(JsonField.ofNullable(oauthUrl))

                /**
                 * Sets [Builder.oauthUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.oauthUrl] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun oauthUrl(oauthUrl: JsonField<String>) = apply { this.oauthUrl = oauthUrl }

                /** Identifier of the payment that triggered this grant, when applicable. */
                fun paymentId(paymentId: String?) = paymentId(JsonField.ofNullable(paymentId))

                /**
                 * Sets [Builder.paymentId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun paymentId(paymentId: JsonField<String>) = apply { this.paymentId = paymentId }

                /** Reason recorded when the grant was revoked, when applicable. */
                fun revocationReason(revocationReason: String?) =
                    revocationReason(JsonField.ofNullable(revocationReason))

                /**
                 * Sets [Builder.revocationReason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.revocationReason] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun revocationReason(revocationReason: JsonField<String>) = apply {
                    this.revocationReason = revocationReason
                }

                /** Timestamp when the grant transitioned to `revoked`, when applicable. */
                fun revokedAt(revokedAt: OffsetDateTime?) =
                    revokedAt(JsonField.ofNullable(revokedAt))

                /**
                 * Sets [Builder.revokedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.revokedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun revokedAt(revokedAt: JsonField<OffsetDateTime>) = apply {
                    this.revokedAt = revokedAt
                }

                /** Identifier of the subscription that triggered this grant, when applicable. */
                fun subscriptionId(subscriptionId: String?) =
                    subscriptionId(JsonField.ofNullable(subscriptionId))

                /**
                 * Sets [Builder.subscriptionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subscriptionId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun subscriptionId(subscriptionId: JsonField<String>) = apply {
                    this.subscriptionId = subscriptionId
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("EntitlementGrant")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun payloadType(payloadType: JsonValue) = apply { this.payloadType = payloadType }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [EntitlementGrant].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .brandId()
                 * .businessId()
                 * .createdAt()
                 * .customerId()
                 * .entitlementId()
                 * .integrationType()
                 * .metadata()
                 * .status()
                 * .updatedAt()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): EntitlementGrant =
                    EntitlementGrant(
                        checkRequired("id", id),
                        checkRequired("brandId", brandId),
                        checkRequired("businessId", businessId),
                        checkRequired("createdAt", createdAt),
                        checkRequired("customerId", customerId),
                        checkRequired("entitlementId", entitlementId),
                        checkRequired("integrationType", integrationType),
                        checkRequired("metadata", metadata),
                        checkRequired("status", status),
                        checkRequired("updatedAt", updatedAt),
                        deliveredAt,
                        digitalProductDelivery,
                        errorCode,
                        errorMessage,
                        feature,
                        licenseKey,
                        oauthExpiresAt,
                        oauthUrl,
                        paymentId,
                        revocationReason,
                        revokedAt,
                        subscriptionId,
                        payloadType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): EntitlementGrant = apply {
                if (validated) {
                    return@apply
                }

                id()
                brandId()
                businessId()
                createdAt()
                customerId()
                entitlementId()
                integrationType().validate()
                metadata().validate()
                status().validate()
                updatedAt()
                deliveredAt()
                digitalProductDelivery()?.validate()
                errorCode()
                errorMessage()
                feature()?.validate()
                licenseKey()?.validate()
                oauthExpiresAt()
                oauthUrl()
                paymentId()
                revocationReason()
                revokedAt()
                subscriptionId()
                _payloadType().let {
                    if (it != JsonValue.from("EntitlementGrant")) {
                        throw DodoPaymentsInvalidDataException(
                            "'payloadType' is invalid, received $it"
                        )
                    }
                }
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
            internal fun validity(): Int =
                (if (id.asKnown() == null) 0 else 1) +
                    (if (brandId.asKnown() == null) 0 else 1) +
                    (if (businessId.asKnown() == null) 0 else 1) +
                    (if (createdAt.asKnown() == null) 0 else 1) +
                    (if (customerId.asKnown() == null) 0 else 1) +
                    (if (entitlementId.asKnown() == null) 0 else 1) +
                    (integrationType.asKnown()?.validity() ?: 0) +
                    (metadata.asKnown()?.validity() ?: 0) +
                    (status.asKnown()?.validity() ?: 0) +
                    (if (updatedAt.asKnown() == null) 0 else 1) +
                    (if (deliveredAt.asKnown() == null) 0 else 1) +
                    (digitalProductDelivery.asKnown()?.validity() ?: 0) +
                    (if (errorCode.asKnown() == null) 0 else 1) +
                    (if (errorMessage.asKnown() == null) 0 else 1) +
                    (feature.asKnown()?.validity() ?: 0) +
                    (licenseKey.asKnown()?.validity() ?: 0) +
                    (if (oauthExpiresAt.asKnown() == null) 0 else 1) +
                    (if (oauthUrl.asKnown() == null) 0 else 1) +
                    (if (paymentId.asKnown() == null) 0 else 1) +
                    (if (revocationReason.asKnown() == null) 0 else 1) +
                    (if (revokedAt.asKnown() == null) 0 else 1) +
                    (if (subscriptionId.asKnown() == null) 0 else 1) +
                    payloadType.let { if (it == JsonValue.from("EntitlementGrant")) 1 else 0 }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EntitlementGrant &&
                    id == other.id &&
                    brandId == other.brandId &&
                    businessId == other.businessId &&
                    createdAt == other.createdAt &&
                    customerId == other.customerId &&
                    entitlementId == other.entitlementId &&
                    integrationType == other.integrationType &&
                    metadata == other.metadata &&
                    status == other.status &&
                    updatedAt == other.updatedAt &&
                    deliveredAt == other.deliveredAt &&
                    digitalProductDelivery == other.digitalProductDelivery &&
                    errorCode == other.errorCode &&
                    errorMessage == other.errorMessage &&
                    feature == other.feature &&
                    licenseKey == other.licenseKey &&
                    oauthExpiresAt == other.oauthExpiresAt &&
                    oauthUrl == other.oauthUrl &&
                    paymentId == other.paymentId &&
                    revocationReason == other.revocationReason &&
                    revokedAt == other.revokedAt &&
                    subscriptionId == other.subscriptionId &&
                    payloadType == other.payloadType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    brandId,
                    businessId,
                    createdAt,
                    customerId,
                    entitlementId,
                    integrationType,
                    metadata,
                    status,
                    updatedAt,
                    deliveredAt,
                    digitalProductDelivery,
                    errorCode,
                    errorMessage,
                    feature,
                    licenseKey,
                    oauthExpiresAt,
                    oauthUrl,
                    paymentId,
                    revocationReason,
                    revokedAt,
                    subscriptionId,
                    payloadType,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "EntitlementGrant{id=$id, brandId=$brandId, businessId=$businessId, createdAt=$createdAt, customerId=$customerId, entitlementId=$entitlementId, integrationType=$integrationType, metadata=$metadata, status=$status, updatedAt=$updatedAt, deliveredAt=$deliveredAt, digitalProductDelivery=$digitalProductDelivery, errorCode=$errorCode, errorMessage=$errorMessage, feature=$feature, licenseKey=$licenseKey, oauthExpiresAt=$oauthExpiresAt, oauthUrl=$oauthUrl, paymentId=$paymentId, revocationReason=$revocationReason, revokedAt=$revokedAt, subscriptionId=$subscriptionId, payloadType=$payloadType, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebhookPayload &&
            businessId == other.businessId &&
            data == other.data &&
            timestamp == other.timestamp &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(businessId, data, timestamp, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WebhookPayload{businessId=$businessId, data=$data, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
}
