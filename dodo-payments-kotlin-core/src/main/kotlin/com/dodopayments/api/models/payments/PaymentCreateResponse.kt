// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.NoAutoDetect
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.immutableEmptyMap
import com.dodopayments.api.core.toImmutable
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
    private val customer: JsonField<CustomerLimitedDetails> = JsonMissing.of(),
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
    private val productCart: JsonField<List<OneTimeProductCartItem>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Client secret used to load Dodo checkout SDK NOTE : Dodo checkout SDK will be coming soon */
    fun clientSecret(): String = clientSecret.getRequired("client_secret")

    fun customer(): CustomerLimitedDetails = customer.getRequired("customer")

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
    fun productCart(): List<OneTimeProductCartItem>? = productCart.getNullable("product_cart")

    /** Client secret used to load Dodo checkout SDK NOTE : Dodo checkout SDK will be coming soon */
    @JsonProperty("client_secret")
    @ExcludeMissing
    fun _clientSecret(): JsonField<String> = clientSecret

    @JsonProperty("customer")
    @ExcludeMissing
    fun _customer(): JsonField<CustomerLimitedDetails> = customer

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
    fun _productCart(): JsonField<List<OneTimeProductCartItem>> = productCart

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
        private var customer: JsonField<CustomerLimitedDetails>? = null
        private var metadata: JsonField<Metadata>? = null
        private var paymentId: JsonField<String>? = null
        private var totalAmount: JsonField<Long>? = null
        private var discountId: JsonField<String> = JsonMissing.of()
        private var paymentLink: JsonField<String> = JsonMissing.of()
        private var productCart: JsonField<MutableList<OneTimeProductCartItem>>? = null
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

        fun customer(customer: CustomerLimitedDetails) = customer(JsonField.of(customer))

        fun customer(customer: JsonField<CustomerLimitedDetails>) = apply {
            this.customer = customer
        }

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
        fun productCart(productCart: List<OneTimeProductCartItem>?) =
            productCart(JsonField.ofNullable(productCart))

        /** Optional list of products included in the payment */
        fun productCart(productCart: JsonField<List<OneTimeProductCartItem>>) = apply {
            this.productCart = productCart.map { it.toMutableList() }
        }

        /** Optional list of products included in the payment */
        fun addProductCart(productCart: OneTimeProductCartItem) = apply {
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
