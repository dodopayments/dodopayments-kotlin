// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

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

class CreditBalanceLowWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val businessId: JsonField<String>,
    private val data: JsonField<Data>,
    private val timestamp: JsonField<OffsetDateTime>,
    private val type: JsonValue,
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
        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
    ) : this(businessId, data, timestamp, type, mutableMapOf())

    /**
     * The business identifier
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessId(): String = businessId.getRequired("business_id")

    /**
     * Webhook payload for credit.balance_low event
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

    /**
     * The timestamp of when the event occurred
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

    /**
     * The event type
     *
     * Expected to always return the following:
     * ```kotlin
     * JsonValue.from("credit.balance_low")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

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
         * Returns a mutable builder for constructing an instance of [CreditBalanceLowWebhookEvent].
         *
         * The following fields are required:
         * ```kotlin
         * .businessId()
         * .data()
         * .timestamp()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CreditBalanceLowWebhookEvent]. */
    class Builder internal constructor() {

        private var businessId: JsonField<String>? = null
        private var data: JsonField<Data>? = null
        private var timestamp: JsonField<OffsetDateTime>? = null
        private var type: JsonValue = JsonValue.from("credit.balance_low")
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(creditBalanceLowWebhookEvent: CreditBalanceLowWebhookEvent) = apply {
            businessId = creditBalanceLowWebhookEvent.businessId
            data = creditBalanceLowWebhookEvent.data
            timestamp = creditBalanceLowWebhookEvent.timestamp
            type = creditBalanceLowWebhookEvent.type
            additionalProperties = creditBalanceLowWebhookEvent.additionalProperties.toMutableMap()
        }

        /** The business identifier */
        fun businessId(businessId: String) = businessId(JsonField.of(businessId))

        /**
         * Sets [Builder.businessId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun businessId(businessId: JsonField<String>) = apply { this.businessId = businessId }

        /** Webhook payload for credit.balance_low event */
        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        /** The timestamp of when the event occurred */
        fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

        /**
         * Sets [Builder.timestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply { this.timestamp = timestamp }

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```kotlin
         * JsonValue.from("credit.balance_low")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonValue) = apply { this.type = type }

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
         * Returns an immutable instance of [CreditBalanceLowWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .businessId()
         * .data()
         * .timestamp()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CreditBalanceLowWebhookEvent =
            CreditBalanceLowWebhookEvent(
                checkRequired("businessId", businessId),
                checkRequired("data", data),
                checkRequired("timestamp", timestamp),
                type,
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
    fun validate(): CreditBalanceLowWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        businessId()
        data().validate()
        timestamp()
        _type().let {
            if (it != JsonValue.from("credit.balance_low")) {
                throw DodoPaymentsInvalidDataException("'type' is invalid, received $it")
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (businessId.asKnown() == null) 0 else 1) +
            (data.asKnown()?.validity() ?: 0) +
            (if (timestamp.asKnown() == null) 0 else 1) +
            type.let { if (it == JsonValue.from("credit.balance_low")) 1 else 0 }

    /** Webhook payload for credit.balance_low event */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val availableBalance: JsonField<String>,
        private val brandId: JsonField<String>,
        private val creditEntitlementId: JsonField<String>,
        private val creditEntitlementName: JsonField<String>,
        private val customerId: JsonField<String>,
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
            @JsonProperty("brand_id") @ExcludeMissing brandId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("credit_entitlement_id")
            @ExcludeMissing
            creditEntitlementId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("credit_entitlement_name")
            @ExcludeMissing
            creditEntitlementName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer_id")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
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
            subscriptionCreditsAmount,
            subscriptionId,
            thresholdAmount,
            thresholdPercent,
            mutableMapOf(),
        )

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun availableBalance(): String = availableBalance.getRequired("available_balance")

        /**
         * Brand id this credit entitlement belongs to
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun brandId(): String = brandId.getRequired("brand_id")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditEntitlementId(): String = creditEntitlementId.getRequired("credit_entitlement_id")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditEntitlementName(): String =
            creditEntitlementName.getRequired("credit_entitlement_name")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subscriptionCreditsAmount(): String =
            subscriptionCreditsAmount.getRequired("subscription_credits_amount")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subscriptionId(): String = subscriptionId.getRequired("subscription_id")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun thresholdAmount(): String = thresholdAmount.getRequired("threshold_amount")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun thresholdPercent(): Int = thresholdPercent.getRequired("threshold_percent")

        /**
         * Returns the raw JSON value of [availableBalance].
         *
         * Unlike [availableBalance], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Returns the raw JSON value of [subscriptionCreditsAmount].
         *
         * Unlike [subscriptionCreditsAmount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("subscription_credits_amount")
        @ExcludeMissing
        fun _subscriptionCreditsAmount(): JsonField<String> = subscriptionCreditsAmount

        /**
         * Returns the raw JSON value of [subscriptionId].
         *
         * Unlike [subscriptionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("subscription_id")
        @ExcludeMissing
        fun _subscriptionId(): JsonField<String> = subscriptionId

        /**
         * Returns the raw JSON value of [thresholdAmount].
         *
         * Unlike [thresholdAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("threshold_amount")
        @ExcludeMissing
        fun _thresholdAmount(): JsonField<String> = thresholdAmount

        /**
         * Returns the raw JSON value of [thresholdPercent].
         *
         * Unlike [thresholdPercent], this method doesn't throw if the JSON field has an unexpected
         * type.
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
             * Returns a mutable builder for constructing an instance of [Data].
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

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var availableBalance: JsonField<String>? = null
            private var brandId: JsonField<String>? = null
            private var creditEntitlementId: JsonField<String>? = null
            private var creditEntitlementName: JsonField<String>? = null
            private var customerId: JsonField<String>? = null
            private var subscriptionCreditsAmount: JsonField<String>? = null
            private var subscriptionId: JsonField<String>? = null
            private var thresholdAmount: JsonField<String>? = null
            private var thresholdPercent: JsonField<Int>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                availableBalance = data.availableBalance
                brandId = data.brandId
                creditEntitlementId = data.creditEntitlementId
                creditEntitlementName = data.creditEntitlementName
                customerId = data.customerId
                subscriptionCreditsAmount = data.subscriptionCreditsAmount
                subscriptionId = data.subscriptionId
                thresholdAmount = data.thresholdAmount
                thresholdPercent = data.thresholdPercent
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun availableBalance(availableBalance: String) =
                availableBalance(JsonField.of(availableBalance))

            /**
             * Sets [Builder.availableBalance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.availableBalance] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun availableBalance(availableBalance: JsonField<String>) = apply {
                this.availableBalance = availableBalance
            }

            /** Brand id this credit entitlement belongs to */
            fun brandId(brandId: String) = brandId(JsonField.of(brandId))

            /**
             * Sets [Builder.brandId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.brandId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

            fun creditEntitlementId(creditEntitlementId: String) =
                creditEntitlementId(JsonField.of(creditEntitlementId))

            /**
             * Sets [Builder.creditEntitlementId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditEntitlementId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun creditEntitlementId(creditEntitlementId: JsonField<String>) = apply {
                this.creditEntitlementId = creditEntitlementId
            }

            fun creditEntitlementName(creditEntitlementName: String) =
                creditEntitlementName(JsonField.of(creditEntitlementName))

            /**
             * Sets [Builder.creditEntitlementName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditEntitlementName] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun creditEntitlementName(creditEntitlementName: JsonField<String>) = apply {
                this.creditEntitlementName = creditEntitlementName
            }

            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            fun subscriptionCreditsAmount(subscriptionCreditsAmount: String) =
                subscriptionCreditsAmount(JsonField.of(subscriptionCreditsAmount))

            /**
             * Sets [Builder.subscriptionCreditsAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriptionCreditsAmount] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun subscriptionCreditsAmount(subscriptionCreditsAmount: JsonField<String>) = apply {
                this.subscriptionCreditsAmount = subscriptionCreditsAmount
            }

            fun subscriptionId(subscriptionId: String) =
                subscriptionId(JsonField.of(subscriptionId))

            /**
             * Sets [Builder.subscriptionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriptionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subscriptionId(subscriptionId: JsonField<String>) = apply {
                this.subscriptionId = subscriptionId
            }

            fun thresholdAmount(thresholdAmount: String) =
                thresholdAmount(JsonField.of(thresholdAmount))

            /**
             * Sets [Builder.thresholdAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.thresholdAmount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Data].
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
            fun build(): Data =
                Data(
                    checkRequired("availableBalance", availableBalance),
                    checkRequired("brandId", brandId),
                    checkRequired("creditEntitlementId", creditEntitlementId),
                    checkRequired("creditEntitlementName", creditEntitlementName),
                    checkRequired("customerId", customerId),
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
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            availableBalance()
            brandId()
            creditEntitlementId()
            creditEntitlementName()
            customerId()
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
                (if (subscriptionCreditsAmount.asKnown() == null) 0 else 1) +
                (if (subscriptionId.asKnown() == null) 0 else 1) +
                (if (thresholdAmount.asKnown() == null) 0 else 1) +
                (if (thresholdPercent.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                availableBalance == other.availableBalance &&
                brandId == other.brandId &&
                creditEntitlementId == other.creditEntitlementId &&
                creditEntitlementName == other.creditEntitlementName &&
                customerId == other.customerId &&
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
                subscriptionCreditsAmount,
                subscriptionId,
                thresholdAmount,
                thresholdPercent,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{availableBalance=$availableBalance, brandId=$brandId, creditEntitlementId=$creditEntitlementId, creditEntitlementName=$creditEntitlementName, customerId=$customerId, subscriptionCreditsAmount=$subscriptionCreditsAmount, subscriptionId=$subscriptionId, thresholdAmount=$thresholdAmount, thresholdPercent=$thresholdPercent, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreditBalanceLowWebhookEvent &&
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
        "CreditBalanceLowWebhookEvent{businessId=$businessId, data=$data, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
}
