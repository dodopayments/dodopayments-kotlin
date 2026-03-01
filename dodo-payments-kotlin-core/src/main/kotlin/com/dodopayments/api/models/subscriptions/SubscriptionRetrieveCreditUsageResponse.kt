// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

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

/** Credit usage status for all entitlements linked to a subscription */
class SubscriptionRetrieveCreditUsageResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val items: JsonField<List<Item>>,
    private val subscriptionId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("items") @ExcludeMissing items: JsonField<List<Item>> = JsonMissing.of(),
        @JsonProperty("subscription_id")
        @ExcludeMissing
        subscriptionId: JsonField<String> = JsonMissing.of(),
    ) : this(items, subscriptionId, mutableMapOf())

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun items(): List<Item> = items.getRequired("items")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriptionId(): String = subscriptionId.getRequired("subscription_id")

    /**
     * Returns the raw JSON value of [items].
     *
     * Unlike [items], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<List<Item>> = items

    /**
     * Returns the raw JSON value of [subscriptionId].
     *
     * Unlike [subscriptionId], this method doesn't throw if the JSON field has an unexpected type.
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
         * Returns a mutable builder for constructing an instance of
         * [SubscriptionRetrieveCreditUsageResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .items()
         * .subscriptionId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SubscriptionRetrieveCreditUsageResponse]. */
    class Builder internal constructor() {

        private var items: JsonField<MutableList<Item>>? = null
        private var subscriptionId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            subscriptionRetrieveCreditUsageResponse: SubscriptionRetrieveCreditUsageResponse
        ) = apply {
            items = subscriptionRetrieveCreditUsageResponse.items.map { it.toMutableList() }
            subscriptionId = subscriptionRetrieveCreditUsageResponse.subscriptionId
            additionalProperties =
                subscriptionRetrieveCreditUsageResponse.additionalProperties.toMutableMap()
        }

        fun items(items: List<Item>) = items(JsonField.of(items))

        /**
         * Sets [Builder.items] to an arbitrary JSON value.
         *
         * You should usually call [Builder.items] with a well-typed `List<Item>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun items(items: JsonField<List<Item>>) = apply {
            this.items = items.map { it.toMutableList() }
        }

        /**
         * Adds a single [Item] to [items].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addItem(item: Item) = apply {
            items =
                (items ?: JsonField.of(mutableListOf())).also { checkKnown("items", it).add(item) }
        }

        fun subscriptionId(subscriptionId: String) = subscriptionId(JsonField.of(subscriptionId))

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
         * Returns an immutable instance of [SubscriptionRetrieveCreditUsageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .items()
         * .subscriptionId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubscriptionRetrieveCreditUsageResponse =
            SubscriptionRetrieveCreditUsageResponse(
                checkRequired("items", items).map { it.toImmutable() },
                checkRequired("subscriptionId", subscriptionId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SubscriptionRetrieveCreditUsageResponse = apply {
        if (validated) {
            return@apply
        }

        items().forEach { it.validate() }
        subscriptionId()
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
        (items.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (subscriptionId.asKnown() == null) 0 else 1)

    /** Per-entitlement credit usage status for a subscription */
    class Item
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val balance: JsonField<String>,
        private val creditEntitlementId: JsonField<String>,
        private val creditEntitlementName: JsonField<String>,
        private val limitReached: JsonField<Boolean>,
        private val overage: JsonField<String>,
        private val overageEnabled: JsonField<Boolean>,
        private val unit: JsonField<String>,
        private val overageLimit: JsonField<String>,
        private val remainingHeadroom: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("balance") @ExcludeMissing balance: JsonField<String> = JsonMissing.of(),
            @JsonProperty("credit_entitlement_id")
            @ExcludeMissing
            creditEntitlementId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("credit_entitlement_name")
            @ExcludeMissing
            creditEntitlementName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("limit_reached")
            @ExcludeMissing
            limitReached: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("overage") @ExcludeMissing overage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("overage_enabled")
            @ExcludeMissing
            overageEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("unit") @ExcludeMissing unit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("overage_limit")
            @ExcludeMissing
            overageLimit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("remaining_headroom")
            @ExcludeMissing
            remainingHeadroom: JsonField<String> = JsonMissing.of(),
        ) : this(
            balance,
            creditEntitlementId,
            creditEntitlementName,
            limitReached,
            overage,
            overageEnabled,
            unit,
            overageLimit,
            remainingHeadroom,
            mutableMapOf(),
        )

        /**
         * Customer's current credit balance for this entitlement (customer-wide)
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun balance(): String = balance.getRequired("balance")

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
         * True if overage has reached or exceeded the limit. When true, further deductions that
         * would increase overage will fail.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun limitReached(): Boolean = limitReached.getRequired("limit_reached")

        /**
         * Current overage amount accrued (customer-wide)
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun overage(): String = overage.getRequired("overage")

        /**
         * Whether overage is enabled for this entitlement on this subscription
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun overageEnabled(): Boolean = overageEnabled.getRequired("overage_enabled")

        /**
         * Unit label for the credit entitlement (e.g. "API Calls", "Tokens")
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun unit(): String = unit.getRequired("unit")

        /**
         * Maximum allowed overage before deductions are blocked. None means unlimited overage (when
         * overage_enabled is true).
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun overageLimit(): String? = overageLimit.getNullable("overage_limit")

        /**
         * How much more overage can accumulate before being blocked. None if overage is not enabled
         * or there is no limit (unlimited). A value of 0 means the next deduction that increases
         * overage will be blocked.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun remainingHeadroom(): String? = remainingHeadroom.getNullable("remaining_headroom")

        /**
         * Returns the raw JSON value of [balance].
         *
         * Unlike [balance], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("balance") @ExcludeMissing fun _balance(): JsonField<String> = balance

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
         * Returns the raw JSON value of [limitReached].
         *
         * Unlike [limitReached], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("limit_reached")
        @ExcludeMissing
        fun _limitReached(): JsonField<Boolean> = limitReached

        /**
         * Returns the raw JSON value of [overage].
         *
         * Unlike [overage], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("overage") @ExcludeMissing fun _overage(): JsonField<String> = overage

        /**
         * Returns the raw JSON value of [overageEnabled].
         *
         * Unlike [overageEnabled], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("overage_enabled")
        @ExcludeMissing
        fun _overageEnabled(): JsonField<Boolean> = overageEnabled

        /**
         * Returns the raw JSON value of [unit].
         *
         * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

        /**
         * Returns the raw JSON value of [overageLimit].
         *
         * Unlike [overageLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("overage_limit")
        @ExcludeMissing
        fun _overageLimit(): JsonField<String> = overageLimit

        /**
         * Returns the raw JSON value of [remainingHeadroom].
         *
         * Unlike [remainingHeadroom], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("remaining_headroom")
        @ExcludeMissing
        fun _remainingHeadroom(): JsonField<String> = remainingHeadroom

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
             * Returns a mutable builder for constructing an instance of [Item].
             *
             * The following fields are required:
             * ```kotlin
             * .balance()
             * .creditEntitlementId()
             * .creditEntitlementName()
             * .limitReached()
             * .overage()
             * .overageEnabled()
             * .unit()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Item]. */
        class Builder internal constructor() {

            private var balance: JsonField<String>? = null
            private var creditEntitlementId: JsonField<String>? = null
            private var creditEntitlementName: JsonField<String>? = null
            private var limitReached: JsonField<Boolean>? = null
            private var overage: JsonField<String>? = null
            private var overageEnabled: JsonField<Boolean>? = null
            private var unit: JsonField<String>? = null
            private var overageLimit: JsonField<String> = JsonMissing.of()
            private var remainingHeadroom: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(item: Item) = apply {
                balance = item.balance
                creditEntitlementId = item.creditEntitlementId
                creditEntitlementName = item.creditEntitlementName
                limitReached = item.limitReached
                overage = item.overage
                overageEnabled = item.overageEnabled
                unit = item.unit
                overageLimit = item.overageLimit
                remainingHeadroom = item.remainingHeadroom
                additionalProperties = item.additionalProperties.toMutableMap()
            }

            /** Customer's current credit balance for this entitlement (customer-wide) */
            fun balance(balance: String) = balance(JsonField.of(balance))

            /**
             * Sets [Builder.balance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.balance] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun balance(balance: JsonField<String>) = apply { this.balance = balance }

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

            /**
             * True if overage has reached or exceeded the limit. When true, further deductions that
             * would increase overage will fail.
             */
            fun limitReached(limitReached: Boolean) = limitReached(JsonField.of(limitReached))

            /**
             * Sets [Builder.limitReached] to an arbitrary JSON value.
             *
             * You should usually call [Builder.limitReached] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun limitReached(limitReached: JsonField<Boolean>) = apply {
                this.limitReached = limitReached
            }

            /** Current overage amount accrued (customer-wide) */
            fun overage(overage: String) = overage(JsonField.of(overage))

            /**
             * Sets [Builder.overage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.overage] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun overage(overage: JsonField<String>) = apply { this.overage = overage }

            /** Whether overage is enabled for this entitlement on this subscription */
            fun overageEnabled(overageEnabled: Boolean) =
                overageEnabled(JsonField.of(overageEnabled))

            /**
             * Sets [Builder.overageEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.overageEnabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun overageEnabled(overageEnabled: JsonField<Boolean>) = apply {
                this.overageEnabled = overageEnabled
            }

            /** Unit label for the credit entitlement (e.g. "API Calls", "Tokens") */
            fun unit(unit: String) = unit(JsonField.of(unit))

            /**
             * Sets [Builder.unit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unit] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun unit(unit: JsonField<String>) = apply { this.unit = unit }

            /**
             * Maximum allowed overage before deductions are blocked. None means unlimited overage
             * (when overage_enabled is true).
             */
            fun overageLimit(overageLimit: String?) =
                overageLimit(JsonField.ofNullable(overageLimit))

            /**
             * Sets [Builder.overageLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.overageLimit] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun overageLimit(overageLimit: JsonField<String>) = apply {
                this.overageLimit = overageLimit
            }

            /**
             * How much more overage can accumulate before being blocked. None if overage is not
             * enabled or there is no limit (unlimited). A value of 0 means the next deduction that
             * increases overage will be blocked.
             */
            fun remainingHeadroom(remainingHeadroom: String?) =
                remainingHeadroom(JsonField.ofNullable(remainingHeadroom))

            /**
             * Sets [Builder.remainingHeadroom] to an arbitrary JSON value.
             *
             * You should usually call [Builder.remainingHeadroom] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun remainingHeadroom(remainingHeadroom: JsonField<String>) = apply {
                this.remainingHeadroom = remainingHeadroom
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
             * Returns an immutable instance of [Item].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .balance()
             * .creditEntitlementId()
             * .creditEntitlementName()
             * .limitReached()
             * .overage()
             * .overageEnabled()
             * .unit()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Item =
                Item(
                    checkRequired("balance", balance),
                    checkRequired("creditEntitlementId", creditEntitlementId),
                    checkRequired("creditEntitlementName", creditEntitlementName),
                    checkRequired("limitReached", limitReached),
                    checkRequired("overage", overage),
                    checkRequired("overageEnabled", overageEnabled),
                    checkRequired("unit", unit),
                    overageLimit,
                    remainingHeadroom,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Item = apply {
            if (validated) {
                return@apply
            }

            balance()
            creditEntitlementId()
            creditEntitlementName()
            limitReached()
            overage()
            overageEnabled()
            unit()
            overageLimit()
            remainingHeadroom()
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
            (if (balance.asKnown() == null) 0 else 1) +
                (if (creditEntitlementId.asKnown() == null) 0 else 1) +
                (if (creditEntitlementName.asKnown() == null) 0 else 1) +
                (if (limitReached.asKnown() == null) 0 else 1) +
                (if (overage.asKnown() == null) 0 else 1) +
                (if (overageEnabled.asKnown() == null) 0 else 1) +
                (if (unit.asKnown() == null) 0 else 1) +
                (if (overageLimit.asKnown() == null) 0 else 1) +
                (if (remainingHeadroom.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Item &&
                balance == other.balance &&
                creditEntitlementId == other.creditEntitlementId &&
                creditEntitlementName == other.creditEntitlementName &&
                limitReached == other.limitReached &&
                overage == other.overage &&
                overageEnabled == other.overageEnabled &&
                unit == other.unit &&
                overageLimit == other.overageLimit &&
                remainingHeadroom == other.remainingHeadroom &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                balance,
                creditEntitlementId,
                creditEntitlementName,
                limitReached,
                overage,
                overageEnabled,
                unit,
                overageLimit,
                remainingHeadroom,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Item{balance=$balance, creditEntitlementId=$creditEntitlementId, creditEntitlementName=$creditEntitlementName, limitReached=$limitReached, overage=$overage, overageEnabled=$overageEnabled, unit=$unit, overageLimit=$overageLimit, remainingHeadroom=$remainingHeadroom, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionRetrieveCreditUsageResponse &&
            items == other.items &&
            subscriptionId == other.subscriptionId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(items, subscriptionId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubscriptionRetrieveCreditUsageResponse{items=$items, subscriptionId=$subscriptionId, additionalProperties=$additionalProperties}"
}
