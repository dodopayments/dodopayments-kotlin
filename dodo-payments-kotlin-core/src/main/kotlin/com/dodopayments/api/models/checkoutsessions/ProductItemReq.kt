// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.checkoutsessions

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.subscriptions.AttachAddon
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

class ProductItemReq
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val productId: JsonField<String>,
    private val quantity: JsonField<Int>,
    private val addons: JsonField<List<AttachAddon>>,
    private val amount: JsonField<Int>,
    private val creditEntitlements: JsonField<List<CreditEntitlement>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("product_id") @ExcludeMissing productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("addons")
        @ExcludeMissing
        addons: JsonField<List<AttachAddon>> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("credit_entitlements")
        @ExcludeMissing
        creditEntitlements: JsonField<List<CreditEntitlement>> = JsonMissing.of(),
    ) : this(productId, quantity, addons, amount, creditEntitlements, mutableMapOf())

    /**
     * unique id of the product
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun productId(): String = productId.getRequired("product_id")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun quantity(): Int = quantity.getRequired("quantity")

    /**
     * only valid if product is a subscription
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun addons(): List<AttachAddon>? = addons.getNullable("addons")

    /**
     * Amount the customer pays if pay_what_you_want is enabled. If disabled then amount will be
     * ignored Represented in the lowest denomination of the currency (e.g., cents for USD). For
     * example, to charge $1.00, pass `100`. Only applicable for one time payments
     *
     * If amount is not set for pay_what_you_want product, customer is allowed to select the amount.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun amount(): Int? = amount.getNullable("amount")

    /**
     * Per-checkout-session overrides for credit entitlements already attached to this product. Each
     * entry overrides the `credits_amount` granted by the referenced credit entitlement when this
     * checkout session is fulfilled. The credit_entitlement_id must already be attached to the
     * product.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun creditEntitlements(): List<CreditEntitlement>? =
        creditEntitlements.getNullable("credit_entitlements")

    /**
     * Returns the raw JSON value of [productId].
     *
     * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

    /**
     * Returns the raw JSON value of [quantity].
     *
     * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Int> = quantity

    /**
     * Returns the raw JSON value of [addons].
     *
     * Unlike [addons], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("addons") @ExcludeMissing fun _addons(): JsonField<List<AttachAddon>> = addons

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Int> = amount

    /**
     * Returns the raw JSON value of [creditEntitlements].
     *
     * Unlike [creditEntitlements], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("credit_entitlements")
    @ExcludeMissing
    fun _creditEntitlements(): JsonField<List<CreditEntitlement>> = creditEntitlements

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
         * Returns a mutable builder for constructing an instance of [ProductItemReq].
         *
         * The following fields are required:
         * ```kotlin
         * .productId()
         * .quantity()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ProductItemReq]. */
    class Builder internal constructor() {

        private var productId: JsonField<String>? = null
        private var quantity: JsonField<Int>? = null
        private var addons: JsonField<MutableList<AttachAddon>>? = null
        private var amount: JsonField<Int> = JsonMissing.of()
        private var creditEntitlements: JsonField<MutableList<CreditEntitlement>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(productItemReq: ProductItemReq) = apply {
            productId = productItemReq.productId
            quantity = productItemReq.quantity
            addons = productItemReq.addons.map { it.toMutableList() }
            amount = productItemReq.amount
            creditEntitlements = productItemReq.creditEntitlements.map { it.toMutableList() }
            additionalProperties = productItemReq.additionalProperties.toMutableMap()
        }

        /** unique id of the product */
        fun productId(productId: String) = productId(JsonField.of(productId))

        /**
         * Sets [Builder.productId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

        fun quantity(quantity: Int) = quantity(JsonField.of(quantity))

        /**
         * Sets [Builder.quantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantity] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quantity(quantity: JsonField<Int>) = apply { this.quantity = quantity }

        /** only valid if product is a subscription */
        fun addons(addons: List<AttachAddon>?) = addons(JsonField.ofNullable(addons))

        /**
         * Sets [Builder.addons] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addons] with a well-typed `List<AttachAddon>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun addons(addons: JsonField<List<AttachAddon>>) = apply {
            this.addons = addons.map { it.toMutableList() }
        }

        /**
         * Adds a single [AttachAddon] to [addons].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAddon(addon: AttachAddon) = apply {
            addons =
                (addons ?: JsonField.of(mutableListOf())).also {
                    checkKnown("addons", it).add(addon)
                }
        }

        /**
         * Amount the customer pays if pay_what_you_want is enabled. If disabled then amount will be
         * ignored Represented in the lowest denomination of the currency (e.g., cents for USD). For
         * example, to charge $1.00, pass `100`. Only applicable for one time payments
         *
         * If amount is not set for pay_what_you_want product, customer is allowed to select the
         * amount.
         */
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
         * You should usually call [Builder.amount] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Int>) = apply { this.amount = amount }

        /**
         * Per-checkout-session overrides for credit entitlements already attached to this product.
         * Each entry overrides the `credits_amount` granted by the referenced credit entitlement
         * when this checkout session is fulfilled. The credit_entitlement_id must already be
         * attached to the product.
         */
        fun creditEntitlements(creditEntitlements: List<CreditEntitlement>?) =
            creditEntitlements(JsonField.ofNullable(creditEntitlements))

        /**
         * Sets [Builder.creditEntitlements] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditEntitlements] with a well-typed
         * `List<CreditEntitlement>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun creditEntitlements(creditEntitlements: JsonField<List<CreditEntitlement>>) = apply {
            this.creditEntitlements = creditEntitlements.map { it.toMutableList() }
        }

        /**
         * Adds a single [CreditEntitlement] to [creditEntitlements].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCreditEntitlement(creditEntitlement: CreditEntitlement) = apply {
            creditEntitlements =
                (creditEntitlements ?: JsonField.of(mutableListOf())).also {
                    checkKnown("creditEntitlements", it).add(creditEntitlement)
                }
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
         * Returns an immutable instance of [ProductItemReq].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .productId()
         * .quantity()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ProductItemReq =
            ProductItemReq(
                checkRequired("productId", productId),
                checkRequired("quantity", quantity),
                (addons ?: JsonMissing.of()).map { it.toImmutable() },
                amount,
                (creditEntitlements ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): ProductItemReq = apply {
        if (validated) {
            return@apply
        }

        productId()
        quantity()
        addons()?.forEach { it.validate() }
        amount()
        creditEntitlements()?.forEach { it.validate() }
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
        (if (productId.asKnown() == null) 0 else 1) +
            (if (quantity.asKnown() == null) 0 else 1) +
            (addons.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (amount.asKnown() == null) 0 else 1) +
            (creditEntitlements.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    /** Per-checkout-session override for a single credit entitlement attached to a product. */
    class CreditEntitlement
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val creditEntitlementId: JsonField<String>,
        private val creditsAmount: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("credit_entitlement_id")
            @ExcludeMissing
            creditEntitlementId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("credits_amount")
            @ExcludeMissing
            creditsAmount: JsonField<String> = JsonMissing.of(),
        ) : this(creditEntitlementId, creditsAmount, mutableMapOf())

        /**
         * ID of the credit entitlement to override. Must already be attached to the product.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditEntitlementId(): String = creditEntitlementId.getRequired("credit_entitlement_id")

        /**
         * Number of credits to grant for this checkout session, overriding the product-level
         * `credits_amount` set on the credit entitlement mapping. Must be greater than zero.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditsAmount(): String = creditsAmount.getRequired("credits_amount")

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
         * Returns the raw JSON value of [creditsAmount].
         *
         * Unlike [creditsAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("credits_amount")
        @ExcludeMissing
        fun _creditsAmount(): JsonField<String> = creditsAmount

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
             * Returns a mutable builder for constructing an instance of [CreditEntitlement].
             *
             * The following fields are required:
             * ```kotlin
             * .creditEntitlementId()
             * .creditsAmount()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [CreditEntitlement]. */
        class Builder internal constructor() {

            private var creditEntitlementId: JsonField<String>? = null
            private var creditsAmount: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(creditEntitlement: CreditEntitlement) = apply {
                creditEntitlementId = creditEntitlement.creditEntitlementId
                creditsAmount = creditEntitlement.creditsAmount
                additionalProperties = creditEntitlement.additionalProperties.toMutableMap()
            }

            /**
             * ID of the credit entitlement to override. Must already be attached to the product.
             */
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

            /**
             * Number of credits to grant for this checkout session, overriding the product-level
             * `credits_amount` set on the credit entitlement mapping. Must be greater than zero.
             */
            fun creditsAmount(creditsAmount: String) = creditsAmount(JsonField.of(creditsAmount))

            /**
             * Sets [Builder.creditsAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditsAmount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditsAmount(creditsAmount: JsonField<String>) = apply {
                this.creditsAmount = creditsAmount
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
             * Returns an immutable instance of [CreditEntitlement].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .creditEntitlementId()
             * .creditsAmount()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CreditEntitlement =
                CreditEntitlement(
                    checkRequired("creditEntitlementId", creditEntitlementId),
                    checkRequired("creditsAmount", creditsAmount),
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
        fun validate(): CreditEntitlement = apply {
            if (validated) {
                return@apply
            }

            creditEntitlementId()
            creditsAmount()
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
            (if (creditEntitlementId.asKnown() == null) 0 else 1) +
                (if (creditsAmount.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreditEntitlement &&
                creditEntitlementId == other.creditEntitlementId &&
                creditsAmount == other.creditsAmount &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(creditEntitlementId, creditsAmount, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreditEntitlement{creditEntitlementId=$creditEntitlementId, creditsAmount=$creditsAmount, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProductItemReq &&
            productId == other.productId &&
            quantity == other.quantity &&
            addons == other.addons &&
            amount == other.amount &&
            creditEntitlements == other.creditEntitlements &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(productId, quantity, addons, amount, creditEntitlements, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProductItemReq{productId=$productId, quantity=$quantity, addons=$addons, amount=$amount, creditEntitlements=$creditEntitlements, additionalProperties=$additionalProperties}"
}
