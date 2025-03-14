// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.subscriptions

import com.dodo_payments.api.core.ExcludeMissing
import com.dodo_payments.api.core.JsonField
import com.dodo_payments.api.core.JsonMissing
import com.dodo_payments.api.core.JsonValue
import com.dodo_payments.api.core.NoAutoDetect
import com.dodo_payments.api.core.checkRequired
import com.dodo_payments.api.core.immutableEmptyMap
import com.dodo_payments.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects

@NoAutoDetect
class SubscriptionCreateResponse
@JsonCreator
private constructor(
    @JsonProperty("customer")
    @ExcludeMissing
    private val customer: JsonField<Customer> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("recurring_pre_tax_amount")
    @ExcludeMissing
    private val recurringPreTaxAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("subscription_id")
    @ExcludeMissing
    private val subscriptionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("client_secret")
    @ExcludeMissing
    private val clientSecret: JsonField<String> = JsonMissing.of(),
    @JsonProperty("discount_id")
    @ExcludeMissing
    private val discountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("payment_link")
    @ExcludeMissing
    private val paymentLink: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun customer(): Customer = customer.getRequired("customer")

    fun metadata(): Metadata = metadata.getRequired("metadata")

    /** Tax will be added to the amount and charged to the customer on each billing cycle */
    fun recurringPreTaxAmount(): Long =
        recurringPreTaxAmount.getRequired("recurring_pre_tax_amount")

    /** Unique identifier for the subscription */
    fun subscriptionId(): String = subscriptionId.getRequired("subscription_id")

    /** Client secret used to load Dodo checkout SDK NOTE : Dodo checkout SDK will be coming soon */
    fun clientSecret(): String? = clientSecret.getNullable("client_secret")

    /** The discount id if discount is applied */
    fun discountId(): String? = discountId.getNullable("discount_id")

    /** URL to checkout page */
    fun paymentLink(): String? = paymentLink.getNullable("payment_link")

    @JsonProperty("customer") @ExcludeMissing fun _customer(): JsonField<Customer> = customer

    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /** Tax will be added to the amount and charged to the customer on each billing cycle */
    @JsonProperty("recurring_pre_tax_amount")
    @ExcludeMissing
    fun _recurringPreTaxAmount(): JsonField<Long> = recurringPreTaxAmount

    /** Unique identifier for the subscription */
    @JsonProperty("subscription_id")
    @ExcludeMissing
    fun _subscriptionId(): JsonField<String> = subscriptionId

    /** Client secret used to load Dodo checkout SDK NOTE : Dodo checkout SDK will be coming soon */
    @JsonProperty("client_secret")
    @ExcludeMissing
    fun _clientSecret(): JsonField<String> = clientSecret

    /** The discount id if discount is applied */
    @JsonProperty("discount_id") @ExcludeMissing fun _discountId(): JsonField<String> = discountId

    /** URL to checkout page */
    @JsonProperty("payment_link")
    @ExcludeMissing
    fun _paymentLink(): JsonField<String> = paymentLink

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): SubscriptionCreateResponse = apply {
        if (validated) {
            return@apply
        }

        customer().validate()
        metadata().validate()
        recurringPreTaxAmount()
        subscriptionId()
        clientSecret()
        discountId()
        paymentLink()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SubscriptionCreateResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .customer()
         * .metadata()
         * .recurringPreTaxAmount()
         * .subscriptionId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SubscriptionCreateResponse]. */
    class Builder internal constructor() {

        private var customer: JsonField<Customer>? = null
        private var metadata: JsonField<Metadata>? = null
        private var recurringPreTaxAmount: JsonField<Long>? = null
        private var subscriptionId: JsonField<String>? = null
        private var clientSecret: JsonField<String> = JsonMissing.of()
        private var discountId: JsonField<String> = JsonMissing.of()
        private var paymentLink: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(subscriptionCreateResponse: SubscriptionCreateResponse) = apply {
            customer = subscriptionCreateResponse.customer
            metadata = subscriptionCreateResponse.metadata
            recurringPreTaxAmount = subscriptionCreateResponse.recurringPreTaxAmount
            subscriptionId = subscriptionCreateResponse.subscriptionId
            clientSecret = subscriptionCreateResponse.clientSecret
            discountId = subscriptionCreateResponse.discountId
            paymentLink = subscriptionCreateResponse.paymentLink
            additionalProperties = subscriptionCreateResponse.additionalProperties.toMutableMap()
        }

        fun customer(customer: Customer) = customer(JsonField.of(customer))

        fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** Tax will be added to the amount and charged to the customer on each billing cycle */
        fun recurringPreTaxAmount(recurringPreTaxAmount: Long) =
            recurringPreTaxAmount(JsonField.of(recurringPreTaxAmount))

        /** Tax will be added to the amount and charged to the customer on each billing cycle */
        fun recurringPreTaxAmount(recurringPreTaxAmount: JsonField<Long>) = apply {
            this.recurringPreTaxAmount = recurringPreTaxAmount
        }

        /** Unique identifier for the subscription */
        fun subscriptionId(subscriptionId: String) = subscriptionId(JsonField.of(subscriptionId))

        /** Unique identifier for the subscription */
        fun subscriptionId(subscriptionId: JsonField<String>) = apply {
            this.subscriptionId = subscriptionId
        }

        /**
         * Client secret used to load Dodo checkout SDK NOTE : Dodo checkout SDK will be coming soon
         */
        fun clientSecret(clientSecret: String?) = clientSecret(JsonField.ofNullable(clientSecret))

        /**
         * Client secret used to load Dodo checkout SDK NOTE : Dodo checkout SDK will be coming soon
         */
        fun clientSecret(clientSecret: JsonField<String>) = apply {
            this.clientSecret = clientSecret
        }

        /** The discount id if discount is applied */
        fun discountId(discountId: String?) = discountId(JsonField.ofNullable(discountId))

        /** The discount id if discount is applied */
        fun discountId(discountId: JsonField<String>) = apply { this.discountId = discountId }

        /** URL to checkout page */
        fun paymentLink(paymentLink: String?) = paymentLink(JsonField.ofNullable(paymentLink))

        /** URL to checkout page */
        fun paymentLink(paymentLink: JsonField<String>) = apply { this.paymentLink = paymentLink }

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

        fun build(): SubscriptionCreateResponse =
            SubscriptionCreateResponse(
                checkRequired("customer", customer),
                checkRequired("metadata", metadata),
                checkRequired("recurringPreTaxAmount", recurringPreTaxAmount),
                checkRequired("subscriptionId", subscriptionId),
                clientSecret,
                discountId,
                paymentLink,
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionCreateResponse && customer == other.customer && metadata == other.metadata && recurringPreTaxAmount == other.recurringPreTaxAmount && subscriptionId == other.subscriptionId && clientSecret == other.clientSecret && discountId == other.discountId && paymentLink == other.paymentLink && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(customer, metadata, recurringPreTaxAmount, subscriptionId, clientSecret, discountId, paymentLink, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubscriptionCreateResponse{customer=$customer, metadata=$metadata, recurringPreTaxAmount=$recurringPreTaxAmount, subscriptionId=$subscriptionId, clientSecret=$clientSecret, discountId=$discountId, paymentLink=$paymentLink, additionalProperties=$additionalProperties}"
}
