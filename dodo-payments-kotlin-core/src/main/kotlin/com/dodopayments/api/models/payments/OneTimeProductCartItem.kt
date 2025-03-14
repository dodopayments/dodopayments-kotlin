// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.NoAutoDetect
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.immutableEmptyMap
import com.dodopayments.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects

@NoAutoDetect
class OneTimeProductCartItem
@JsonCreator
private constructor(
    @JsonProperty("product_id")
    @ExcludeMissing
    private val productId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("quantity")
    @ExcludeMissing
    private val quantity: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("amount") @ExcludeMissing private val amount: JsonField<Long> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun productId(): String = productId.getRequired("product_id")

    fun quantity(): Long = quantity.getRequired("quantity")

    /**
     * Amount the customer pays if pay_what_you_want is enabled. If disabled then amount will be
     * ignored
     */
    fun amount(): Long? = amount.getNullable("amount")

    @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Long> = quantity

    /**
     * Amount the customer pays if pay_what_you_want is enabled. If disabled then amount will be
     * ignored
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): OneTimeProductCartItem = apply {
        if (validated) {
            return@apply
        }

        productId()
        quantity()
        amount()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OneTimeProductCartItem].
         *
         * The following fields are required:
         * ```kotlin
         * .productId()
         * .quantity()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [OneTimeProductCartItem]. */
    class Builder internal constructor() {

        private var productId: JsonField<String>? = null
        private var quantity: JsonField<Long>? = null
        private var amount: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(oneTimeProductCartItem: OneTimeProductCartItem) = apply {
            productId = oneTimeProductCartItem.productId
            quantity = oneTimeProductCartItem.quantity
            amount = oneTimeProductCartItem.amount
            additionalProperties = oneTimeProductCartItem.additionalProperties.toMutableMap()
        }

        fun productId(productId: String) = productId(JsonField.of(productId))

        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

        fun quantity(quantity: Long) = quantity(JsonField.of(quantity))

        fun quantity(quantity: JsonField<Long>) = apply { this.quantity = quantity }

        /**
         * Amount the customer pays if pay_what_you_want is enabled. If disabled then amount will be
         * ignored
         */
        fun amount(amount: Long?) = amount(JsonField.ofNullable(amount))

        /**
         * Amount the customer pays if pay_what_you_want is enabled. If disabled then amount will be
         * ignored
         */
        fun amount(amount: Long) = amount(amount as Long?)

        /**
         * Amount the customer pays if pay_what_you_want is enabled. If disabled then amount will be
         * ignored
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

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

        fun build(): OneTimeProductCartItem =
            OneTimeProductCartItem(
                checkRequired("productId", productId),
                checkRequired("quantity", quantity),
                amount,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OneTimeProductCartItem && productId == other.productId && quantity == other.quantity && amount == other.amount && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(productId, quantity, amount, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OneTimeProductCartItem{productId=$productId, quantity=$quantity, amount=$amount, additionalProperties=$additionalProperties}"
}
