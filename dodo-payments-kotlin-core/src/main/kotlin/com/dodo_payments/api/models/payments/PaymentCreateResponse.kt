// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.payments

import com.dodo_payments.api.core.ExcludeMissing
import com.dodo_payments.api.core.JsonField
import com.dodo_payments.api.core.JsonMissing
import com.dodo_payments.api.core.JsonValue
import com.dodo_payments.api.core.NoAutoDetect
import com.dodo_payments.api.core.checkKnown
import com.dodo_payments.api.core.checkRequired
import com.dodo_payments.api.core.immutableEmptyMap
import com.dodo_payments.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects

@NoAutoDetect
class PaymentCreateResponse
@JsonCreator
private constructor(
    @JsonProperty("client_secret")
    @ExcludeMissing
    private val clientSecret: JsonField<String> = JsonMissing.of(),
    @JsonProperty("customer")
    @ExcludeMissing
    private val customer: JsonField<Customer> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("payment_id")
    @ExcludeMissing
    private val paymentId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("total_amount")
    @ExcludeMissing
    private val totalAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("discount_id")
    @ExcludeMissing
    private val discountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("payment_link")
    @ExcludeMissing
    private val paymentLink: JsonField<String> = JsonMissing.of(),
    @JsonProperty("product_cart")
    @ExcludeMissing
    private val productCart: JsonField<List<ProductCart>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Client secret used to load Dodo checkout SDK NOTE : Dodo checkout SDK will be coming soon */
    fun clientSecret(): String = clientSecret.getRequired("client_secret")

    fun customer(): Customer = customer.getRequired("customer")

    fun metadata(): Metadata = metadata.getRequired("metadata")

    /** Unique identifier for the payment */
    fun paymentId(): String = paymentId.getRequired("payment_id")

    /** Total amount of the payment in smallest currency unit (e.g. cents) */
    fun totalAmount(): Long = totalAmount.getRequired("total_amount")

    /** The discount id if discount is applied */
    fun discountId(): String? = discountId.getNullable("discount_id")

    /** Optional URL to a hosted payment page */
    fun paymentLink(): String? = paymentLink.getNullable("payment_link")

    /** Optional list of products included in the payment */
    fun productCart(): List<ProductCart>? = productCart.getNullable("product_cart")

    /** Client secret used to load Dodo checkout SDK NOTE : Dodo checkout SDK will be coming soon */
    @JsonProperty("client_secret")
    @ExcludeMissing
    fun _clientSecret(): JsonField<String> = clientSecret

    @JsonProperty("customer") @ExcludeMissing fun _customer(): JsonField<Customer> = customer

    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /** Unique identifier for the payment */
    @JsonProperty("payment_id") @ExcludeMissing fun _paymentId(): JsonField<String> = paymentId

    /** Total amount of the payment in smallest currency unit (e.g. cents) */
    @JsonProperty("total_amount") @ExcludeMissing fun _totalAmount(): JsonField<Long> = totalAmount

    /** The discount id if discount is applied */
    @JsonProperty("discount_id") @ExcludeMissing fun _discountId(): JsonField<String> = discountId

    /** Optional URL to a hosted payment page */
    @JsonProperty("payment_link")
    @ExcludeMissing
    fun _paymentLink(): JsonField<String> = paymentLink

    /** Optional list of products included in the payment */
    @JsonProperty("product_cart")
    @ExcludeMissing
    fun _productCart(): JsonField<List<ProductCart>> = productCart

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PaymentCreateResponse = apply {
        if (validated) {
            return@apply
        }

        clientSecret()
        customer().validate()
        metadata().validate()
        paymentId()
        totalAmount()
        discountId()
        paymentLink()
        productCart()?.forEach { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PaymentCreateResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .clientSecret()
         * .customer()
         * .metadata()
         * .paymentId()
         * .totalAmount()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PaymentCreateResponse]. */
    class Builder internal constructor() {

        private var clientSecret: JsonField<String>? = null
        private var customer: JsonField<Customer>? = null
        private var metadata: JsonField<Metadata>? = null
        private var paymentId: JsonField<String>? = null
        private var totalAmount: JsonField<Long>? = null
        private var discountId: JsonField<String> = JsonMissing.of()
        private var paymentLink: JsonField<String> = JsonMissing.of()
        private var productCart: JsonField<MutableList<ProductCart>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(paymentCreateResponse: PaymentCreateResponse) = apply {
            clientSecret = paymentCreateResponse.clientSecret
            customer = paymentCreateResponse.customer
            metadata = paymentCreateResponse.metadata
            paymentId = paymentCreateResponse.paymentId
            totalAmount = paymentCreateResponse.totalAmount
            discountId = paymentCreateResponse.discountId
            paymentLink = paymentCreateResponse.paymentLink
            productCart = paymentCreateResponse.productCart.map { it.toMutableList() }
            additionalProperties = paymentCreateResponse.additionalProperties.toMutableMap()
        }

        /**
         * Client secret used to load Dodo checkout SDK NOTE : Dodo checkout SDK will be coming soon
         */
        fun clientSecret(clientSecret: String) = clientSecret(JsonField.of(clientSecret))

        /**
         * Client secret used to load Dodo checkout SDK NOTE : Dodo checkout SDK will be coming soon
         */
        fun clientSecret(clientSecret: JsonField<String>) = apply {
            this.clientSecret = clientSecret
        }

        fun customer(customer: Customer) = customer(JsonField.of(customer))

        fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** Unique identifier for the payment */
        fun paymentId(paymentId: String) = paymentId(JsonField.of(paymentId))

        /** Unique identifier for the payment */
        fun paymentId(paymentId: JsonField<String>) = apply { this.paymentId = paymentId }

        /** Total amount of the payment in smallest currency unit (e.g. cents) */
        fun totalAmount(totalAmount: Long) = totalAmount(JsonField.of(totalAmount))

        /** Total amount of the payment in smallest currency unit (e.g. cents) */
        fun totalAmount(totalAmount: JsonField<Long>) = apply { this.totalAmount = totalAmount }

        /** The discount id if discount is applied */
        fun discountId(discountId: String?) = discountId(JsonField.ofNullable(discountId))

        /** The discount id if discount is applied */
        fun discountId(discountId: JsonField<String>) = apply { this.discountId = discountId }

        /** Optional URL to a hosted payment page */
        fun paymentLink(paymentLink: String?) = paymentLink(JsonField.ofNullable(paymentLink))

        /** Optional URL to a hosted payment page */
        fun paymentLink(paymentLink: JsonField<String>) = apply { this.paymentLink = paymentLink }

        /** Optional list of products included in the payment */
        fun productCart(productCart: List<ProductCart>?) =
            productCart(JsonField.ofNullable(productCart))

        /** Optional list of products included in the payment */
        fun productCart(productCart: JsonField<List<ProductCart>>) = apply {
            this.productCart = productCart.map { it.toMutableList() }
        }

        /** Optional list of products included in the payment */
        fun addProductCart(productCart: ProductCart) = apply {
            this.productCart =
                (this.productCart ?: JsonField.of(mutableListOf())).also {
                    checkKnown("productCart", it).add(productCart)
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

        fun build(): PaymentCreateResponse =
            PaymentCreateResponse(
                checkRequired("clientSecret", clientSecret),
                checkRequired("customer", customer),
                checkRequired("metadata", metadata),
                checkRequired("paymentId", paymentId),
                checkRequired("totalAmount", totalAmount),
                discountId,
                paymentLink,
                (productCart ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Customer
    @JsonCreator
    private constructor(
        @JsonProperty("customer_id")
        @ExcludeMissing
        private val customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email")
        @ExcludeMissing
        private val email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Unique identifier for the customer */
        fun customerId(): String = customerId.getRequired("customer_id")

        /** Email address of the customer */
        fun email(): String = email.getRequired("email")

        /** Full name of the customer */
        fun name(): String = name.getRequired("name")

        /** Unique identifier for the customer */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /** Email address of the customer */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /** Full name of the customer */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Customer = apply {
            if (validated) {
                return@apply
            }

            customerId()
            email()
            name()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Customer].
             *
             * The following fields are required:
             * ```kotlin
             * .customerId()
             * .email()
             * .name()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Customer]. */
        class Builder internal constructor() {

            private var customerId: JsonField<String>? = null
            private var email: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(customer: Customer) = apply {
                customerId = customer.customerId
                email = customer.email
                name = customer.name
                additionalProperties = customer.additionalProperties.toMutableMap()
            }

            /** Unique identifier for the customer */
            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /** Unique identifier for the customer */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /** Email address of the customer */
            fun email(email: String) = email(JsonField.of(email))

            /** Email address of the customer */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** Full name of the customer */
            fun name(name: String) = name(JsonField.of(name))

            /** Full name of the customer */
            fun name(name: JsonField<String>) = apply { this.name = name }

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

            fun build(): Customer =
                Customer(
                    checkRequired("customerId", customerId),
                    checkRequired("email", email),
                    checkRequired("name", name),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Customer && customerId == other.customerId && email == other.email && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(customerId, email, name, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Customer{customerId=$customerId, email=$email, name=$name, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class ProductCart
    @JsonCreator
    private constructor(
        @JsonProperty("product_id")
        @ExcludeMissing
        private val productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quantity")
        @ExcludeMissing
        private val quantity: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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

        fun validate(): ProductCart = apply {
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
             * Returns a mutable builder for constructing an instance of [ProductCart].
             *
             * The following fields are required:
             * ```kotlin
             * .productId()
             * .quantity()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ProductCart]. */
        class Builder internal constructor() {

            private var productId: JsonField<String>? = null
            private var quantity: JsonField<Long>? = null
            private var amount: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(productCart: ProductCart) = apply {
                productId = productCart.productId
                quantity = productCart.quantity
                amount = productCart.amount
                additionalProperties = productCart.additionalProperties.toMutableMap()
            }

            fun productId(productId: String) = productId(JsonField.of(productId))

            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            fun quantity(quantity: Long) = quantity(JsonField.of(quantity))

            fun quantity(quantity: JsonField<Long>) = apply { this.quantity = quantity }

            /**
             * Amount the customer pays if pay_what_you_want is enabled. If disabled then amount
             * will be ignored
             */
            fun amount(amount: Long?) = amount(JsonField.ofNullable(amount))

            /**
             * Amount the customer pays if pay_what_you_want is enabled. If disabled then amount
             * will be ignored
             */
            fun amount(amount: Long) = amount(amount as Long?)

            /**
             * Amount the customer pays if pay_what_you_want is enabled. If disabled then amount
             * will be ignored
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

            fun build(): ProductCart =
                ProductCart(
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

            return /* spotless:off */ other is ProductCart && productId == other.productId && quantity == other.quantity && amount == other.amount && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(productId, quantity, amount, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ProductCart{productId=$productId, quantity=$quantity, amount=$amount, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentCreateResponse && clientSecret == other.clientSecret && customer == other.customer && metadata == other.metadata && paymentId == other.paymentId && totalAmount == other.totalAmount && discountId == other.discountId && paymentLink == other.paymentLink && productCart == other.productCart && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(clientSecret, customer, metadata, paymentId, totalAmount, discountId, paymentLink, productCart, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaymentCreateResponse{clientSecret=$clientSecret, customer=$customer, metadata=$metadata, paymentId=$paymentId, totalAmount=$totalAmount, discountId=$discountId, paymentLink=$paymentLink, productCart=$productCart, additionalProperties=$additionalProperties}"
}
