// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.subscriptions

import com.dodo_payments.api.core.BaseDeserializer
import com.dodo_payments.api.core.BaseSerializer
import com.dodo_payments.api.core.ExcludeMissing
import com.dodo_payments.api.core.JsonField
import com.dodo_payments.api.core.JsonMissing
import com.dodo_payments.api.core.JsonValue
import com.dodo_payments.api.core.NoAutoDetect
import com.dodo_payments.api.core.Params
import com.dodo_payments.api.core.checkRequired
import com.dodo_payments.api.core.getOrThrow
import com.dodo_payments.api.core.http.Headers
import com.dodo_payments.api.core.http.QueryParams
import com.dodo_payments.api.core.immutableEmptyMap
import com.dodo_payments.api.core.toImmutable
import com.dodo_payments.api.errors.DodoPaymentsInvalidDataException
import com.dodo_payments.api.models.misc.supportedcountries.CountryCode
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
import java.util.Objects

class SubscriptionCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun billing(): Billing = body.billing()

    fun customer(): Customer = body.customer()

    /** Unique identifier of the product to subscribe to */
    fun productId(): String = body.productId()

    /** Number of units to subscribe for. Must be at least 1. */
    fun quantity(): Long = body.quantity()

    /** Discount Code to apply to the subscription */
    fun discountCode(): String? = body.discountCode()

    fun metadata(): Metadata? = body.metadata()

    /** If true, generates a payment link. Defaults to false if not specified. */
    fun paymentLink(): Boolean? = body.paymentLink()

    /** Optional URL to redirect after successful subscription creation */
    fun returnUrl(): String? = body.returnUrl()

    /**
     * Tax ID in case the payment is B2B. If tax id validation fails the payment creation will fail
     */
    fun taxId(): String? = body.taxId()

    /**
     * Optional trial period in days If specified, this value overrides the trial period set in the
     * product's price Must be between 0 and 10000 days
     */
    fun trialPeriodDays(): Long? = body.trialPeriodDays()

    fun _billing(): JsonField<Billing> = body._billing()

    fun _customer(): JsonField<Customer> = body._customer()

    /** Unique identifier of the product to subscribe to */
    fun _productId(): JsonField<String> = body._productId()

    /** Number of units to subscribe for. Must be at least 1. */
    fun _quantity(): JsonField<Long> = body._quantity()

    /** Discount Code to apply to the subscription */
    fun _discountCode(): JsonField<String> = body._discountCode()

    fun _metadata(): JsonField<Metadata> = body._metadata()

    /** If true, generates a payment link. Defaults to false if not specified. */
    fun _paymentLink(): JsonField<Boolean> = body._paymentLink()

    /** Optional URL to redirect after successful subscription creation */
    fun _returnUrl(): JsonField<String> = body._returnUrl()

    /**
     * Tax ID in case the payment is B2B. If tax id validation fails the payment creation will fail
     */
    fun _taxId(): JsonField<String> = body._taxId()

    /**
     * Optional trial period in days If specified, this value overrides the trial period set in the
     * product's price Must be between 0 and 10000 days
     */
    fun _trialPeriodDays(): JsonField<Long> = body._trialPeriodDays()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Request payload for creating a new subscription
     *
     * This struct represents the data required to create a new subscription in the system. It
     * includes details about the product, quantity, customer information, and billing details.
     */
    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("billing")
        @ExcludeMissing
        private val billing: JsonField<Billing> = JsonMissing.of(),
        @JsonProperty("customer")
        @ExcludeMissing
        private val customer: JsonField<Customer> = JsonMissing.of(),
        @JsonProperty("product_id")
        @ExcludeMissing
        private val productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quantity")
        @ExcludeMissing
        private val quantity: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("discount_code")
        @ExcludeMissing
        private val discountCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("payment_link")
        @ExcludeMissing
        private val paymentLink: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("return_url")
        @ExcludeMissing
        private val returnUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tax_id")
        @ExcludeMissing
        private val taxId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trial_period_days")
        @ExcludeMissing
        private val trialPeriodDays: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun billing(): Billing = billing.getRequired("billing")

        fun customer(): Customer = customer.getRequired("customer")

        /** Unique identifier of the product to subscribe to */
        fun productId(): String = productId.getRequired("product_id")

        /** Number of units to subscribe for. Must be at least 1. */
        fun quantity(): Long = quantity.getRequired("quantity")

        /** Discount Code to apply to the subscription */
        fun discountCode(): String? = discountCode.getNullable("discount_code")

        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /** If true, generates a payment link. Defaults to false if not specified. */
        fun paymentLink(): Boolean? = paymentLink.getNullable("payment_link")

        /** Optional URL to redirect after successful subscription creation */
        fun returnUrl(): String? = returnUrl.getNullable("return_url")

        /**
         * Tax ID in case the payment is B2B. If tax id validation fails the payment creation will
         * fail
         */
        fun taxId(): String? = taxId.getNullable("tax_id")

        /**
         * Optional trial period in days If specified, this value overrides the trial period set in
         * the product's price Must be between 0 and 10000 days
         */
        fun trialPeriodDays(): Long? = trialPeriodDays.getNullable("trial_period_days")

        @JsonProperty("billing") @ExcludeMissing fun _billing(): JsonField<Billing> = billing

        @JsonProperty("customer") @ExcludeMissing fun _customer(): JsonField<Customer> = customer

        /** Unique identifier of the product to subscribe to */
        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /** Number of units to subscribe for. Must be at least 1. */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Long> = quantity

        /** Discount Code to apply to the subscription */
        @JsonProperty("discount_code")
        @ExcludeMissing
        fun _discountCode(): JsonField<String> = discountCode

        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /** If true, generates a payment link. Defaults to false if not specified. */
        @JsonProperty("payment_link")
        @ExcludeMissing
        fun _paymentLink(): JsonField<Boolean> = paymentLink

        /** Optional URL to redirect after successful subscription creation */
        @JsonProperty("return_url") @ExcludeMissing fun _returnUrl(): JsonField<String> = returnUrl

        /**
         * Tax ID in case the payment is B2B. If tax id validation fails the payment creation will
         * fail
         */
        @JsonProperty("tax_id") @ExcludeMissing fun _taxId(): JsonField<String> = taxId

        /**
         * Optional trial period in days If specified, this value overrides the trial period set in
         * the product's price Must be between 0 and 10000 days
         */
        @JsonProperty("trial_period_days")
        @ExcludeMissing
        fun _trialPeriodDays(): JsonField<Long> = trialPeriodDays

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            billing().validate()
            customer().validate()
            productId()
            quantity()
            discountCode()
            metadata()?.validate()
            paymentLink()
            returnUrl()
            taxId()
            trialPeriodDays()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .billing()
             * .customer()
             * .productId()
             * .quantity()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var billing: JsonField<Billing>? = null
            private var customer: JsonField<Customer>? = null
            private var productId: JsonField<String>? = null
            private var quantity: JsonField<Long>? = null
            private var discountCode: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var paymentLink: JsonField<Boolean> = JsonMissing.of()
            private var returnUrl: JsonField<String> = JsonMissing.of()
            private var taxId: JsonField<String> = JsonMissing.of()
            private var trialPeriodDays: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                billing = body.billing
                customer = body.customer
                productId = body.productId
                quantity = body.quantity
                discountCode = body.discountCode
                metadata = body.metadata
                paymentLink = body.paymentLink
                returnUrl = body.returnUrl
                taxId = body.taxId
                trialPeriodDays = body.trialPeriodDays
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun billing(billing: Billing) = billing(JsonField.of(billing))

            fun billing(billing: JsonField<Billing>) = apply { this.billing = billing }

            fun customer(customer: Customer) = customer(JsonField.of(customer))

            fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

            fun customer(attachExisting: Customer.AttachExistingCustomer) =
                customer(Customer.ofAttachExisting(attachExisting))

            fun customer(createNew: Customer.CreateNewCustomer) =
                customer(Customer.ofCreateNew(createNew))

            /** Unique identifier of the product to subscribe to */
            fun productId(productId: String) = productId(JsonField.of(productId))

            /** Unique identifier of the product to subscribe to */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            /** Number of units to subscribe for. Must be at least 1. */
            fun quantity(quantity: Long) = quantity(JsonField.of(quantity))

            /** Number of units to subscribe for. Must be at least 1. */
            fun quantity(quantity: JsonField<Long>) = apply { this.quantity = quantity }

            /** Discount Code to apply to the subscription */
            fun discountCode(discountCode: String?) =
                discountCode(JsonField.ofNullable(discountCode))

            /** Discount Code to apply to the subscription */
            fun discountCode(discountCode: JsonField<String>) = apply {
                this.discountCode = discountCode
            }

            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** If true, generates a payment link. Defaults to false if not specified. */
            fun paymentLink(paymentLink: Boolean?) = paymentLink(JsonField.ofNullable(paymentLink))

            /** If true, generates a payment link. Defaults to false if not specified. */
            fun paymentLink(paymentLink: Boolean) = paymentLink(paymentLink as Boolean?)

            /** If true, generates a payment link. Defaults to false if not specified. */
            fun paymentLink(paymentLink: JsonField<Boolean>) = apply {
                this.paymentLink = paymentLink
            }

            /** Optional URL to redirect after successful subscription creation */
            fun returnUrl(returnUrl: String?) = returnUrl(JsonField.ofNullable(returnUrl))

            /** Optional URL to redirect after successful subscription creation */
            fun returnUrl(returnUrl: JsonField<String>) = apply { this.returnUrl = returnUrl }

            /**
             * Tax ID in case the payment is B2B. If tax id validation fails the payment creation
             * will fail
             */
            fun taxId(taxId: String?) = taxId(JsonField.ofNullable(taxId))

            /**
             * Tax ID in case the payment is B2B. If tax id validation fails the payment creation
             * will fail
             */
            fun taxId(taxId: JsonField<String>) = apply { this.taxId = taxId }

            /**
             * Optional trial period in days If specified, this value overrides the trial period set
             * in the product's price Must be between 0 and 10000 days
             */
            fun trialPeriodDays(trialPeriodDays: Long?) =
                trialPeriodDays(JsonField.ofNullable(trialPeriodDays))

            /**
             * Optional trial period in days If specified, this value overrides the trial period set
             * in the product's price Must be between 0 and 10000 days
             */
            fun trialPeriodDays(trialPeriodDays: Long) = trialPeriodDays(trialPeriodDays as Long?)

            /**
             * Optional trial period in days If specified, this value overrides the trial period set
             * in the product's price Must be between 0 and 10000 days
             */
            fun trialPeriodDays(trialPeriodDays: JsonField<Long>) = apply {
                this.trialPeriodDays = trialPeriodDays
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

            fun build(): Body =
                Body(
                    checkRequired("billing", billing),
                    checkRequired("customer", customer),
                    checkRequired("productId", productId),
                    checkRequired("quantity", quantity),
                    discountCode,
                    metadata,
                    paymentLink,
                    returnUrl,
                    taxId,
                    trialPeriodDays,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && billing == other.billing && customer == other.customer && productId == other.productId && quantity == other.quantity && discountCode == other.discountCode && metadata == other.metadata && paymentLink == other.paymentLink && returnUrl == other.returnUrl && taxId == other.taxId && trialPeriodDays == other.trialPeriodDays && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(billing, customer, productId, quantity, discountCode, metadata, paymentLink, returnUrl, taxId, trialPeriodDays, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{billing=$billing, customer=$customer, productId=$productId, quantity=$quantity, discountCode=$discountCode, metadata=$metadata, paymentLink=$paymentLink, returnUrl=$returnUrl, taxId=$taxId, trialPeriodDays=$trialPeriodDays, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SubscriptionCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .billing()
         * .customer()
         * .productId()
         * .quantity()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SubscriptionCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(subscriptionCreateParams: SubscriptionCreateParams) = apply {
            body = subscriptionCreateParams.body.toBuilder()
            additionalHeaders = subscriptionCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = subscriptionCreateParams.additionalQueryParams.toBuilder()
        }

        fun billing(billing: Billing) = apply { body.billing(billing) }

        fun billing(billing: JsonField<Billing>) = apply { body.billing(billing) }

        fun customer(customer: Customer) = apply { body.customer(customer) }

        fun customer(customer: JsonField<Customer>) = apply { body.customer(customer) }

        fun customer(attachExisting: Customer.AttachExistingCustomer) = apply {
            body.customer(attachExisting)
        }

        fun customer(createNew: Customer.CreateNewCustomer) = apply { body.customer(createNew) }

        /** Unique identifier of the product to subscribe to */
        fun productId(productId: String) = apply { body.productId(productId) }

        /** Unique identifier of the product to subscribe to */
        fun productId(productId: JsonField<String>) = apply { body.productId(productId) }

        /** Number of units to subscribe for. Must be at least 1. */
        fun quantity(quantity: Long) = apply { body.quantity(quantity) }

        /** Number of units to subscribe for. Must be at least 1. */
        fun quantity(quantity: JsonField<Long>) = apply { body.quantity(quantity) }

        /** Discount Code to apply to the subscription */
        fun discountCode(discountCode: String?) = apply { body.discountCode(discountCode) }

        /** Discount Code to apply to the subscription */
        fun discountCode(discountCode: JsonField<String>) = apply {
            body.discountCode(discountCode)
        }

        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /** If true, generates a payment link. Defaults to false if not specified. */
        fun paymentLink(paymentLink: Boolean?) = apply { body.paymentLink(paymentLink) }

        /** If true, generates a payment link. Defaults to false if not specified. */
        fun paymentLink(paymentLink: Boolean) = paymentLink(paymentLink as Boolean?)

        /** If true, generates a payment link. Defaults to false if not specified. */
        fun paymentLink(paymentLink: JsonField<Boolean>) = apply { body.paymentLink(paymentLink) }

        /** Optional URL to redirect after successful subscription creation */
        fun returnUrl(returnUrl: String?) = apply { body.returnUrl(returnUrl) }

        /** Optional URL to redirect after successful subscription creation */
        fun returnUrl(returnUrl: JsonField<String>) = apply { body.returnUrl(returnUrl) }

        /**
         * Tax ID in case the payment is B2B. If tax id validation fails the payment creation will
         * fail
         */
        fun taxId(taxId: String?) = apply { body.taxId(taxId) }

        /**
         * Tax ID in case the payment is B2B. If tax id validation fails the payment creation will
         * fail
         */
        fun taxId(taxId: JsonField<String>) = apply { body.taxId(taxId) }

        /**
         * Optional trial period in days If specified, this value overrides the trial period set in
         * the product's price Must be between 0 and 10000 days
         */
        fun trialPeriodDays(trialPeriodDays: Long?) = apply {
            body.trialPeriodDays(trialPeriodDays)
        }

        /**
         * Optional trial period in days If specified, this value overrides the trial period set in
         * the product's price Must be between 0 and 10000 days
         */
        fun trialPeriodDays(trialPeriodDays: Long) = trialPeriodDays(trialPeriodDays as Long?)

        /**
         * Optional trial period in days If specified, this value overrides the trial period set in
         * the product's price Must be between 0 and 10000 days
         */
        fun trialPeriodDays(trialPeriodDays: JsonField<Long>) = apply {
            body.trialPeriodDays(trialPeriodDays)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): SubscriptionCreateParams =
            SubscriptionCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class Billing
    @JsonCreator
    private constructor(
        @JsonProperty("city")
        @ExcludeMissing
        private val city: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country")
        @ExcludeMissing
        private val country: JsonField<CountryCode> = JsonMissing.of(),
        @JsonProperty("state")
        @ExcludeMissing
        private val state: JsonField<String> = JsonMissing.of(),
        @JsonProperty("street")
        @ExcludeMissing
        private val street: JsonField<String> = JsonMissing.of(),
        @JsonProperty("zipcode")
        @ExcludeMissing
        private val zipcode: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** City name */
        fun city(): String = city.getRequired("city")

        /** ISO country code alpha2 variant */
        fun country(): CountryCode = country.getRequired("country")

        /** State or province name */
        fun state(): String = state.getRequired("state")

        /** Street address including house number and unit/apartment if applicable */
        fun street(): String = street.getRequired("street")

        /** Postal code or ZIP code */
        fun zipcode(): String = zipcode.getRequired("zipcode")

        /** City name */
        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

        /** ISO country code alpha2 variant */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<CountryCode> = country

        /** State or province name */
        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

        /** Street address including house number and unit/apartment if applicable */
        @JsonProperty("street") @ExcludeMissing fun _street(): JsonField<String> = street

        /** Postal code or ZIP code */
        @JsonProperty("zipcode") @ExcludeMissing fun _zipcode(): JsonField<String> = zipcode

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Billing = apply {
            if (validated) {
                return@apply
            }

            city()
            country()
            state()
            street()
            zipcode()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Billing].
             *
             * The following fields are required:
             * ```kotlin
             * .city()
             * .country()
             * .state()
             * .street()
             * .zipcode()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Billing]. */
        class Builder internal constructor() {

            private var city: JsonField<String>? = null
            private var country: JsonField<CountryCode>? = null
            private var state: JsonField<String>? = null
            private var street: JsonField<String>? = null
            private var zipcode: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(billing: Billing) = apply {
                city = billing.city
                country = billing.country
                state = billing.state
                street = billing.street
                zipcode = billing.zipcode
                additionalProperties = billing.additionalProperties.toMutableMap()
            }

            /** City name */
            fun city(city: String) = city(JsonField.of(city))

            /** City name */
            fun city(city: JsonField<String>) = apply { this.city = city }

            /** ISO country code alpha2 variant */
            fun country(country: CountryCode) = country(JsonField.of(country))

            /** ISO country code alpha2 variant */
            fun country(country: JsonField<CountryCode>) = apply { this.country = country }

            /** State or province name */
            fun state(state: String) = state(JsonField.of(state))

            /** State or province name */
            fun state(state: JsonField<String>) = apply { this.state = state }

            /** Street address including house number and unit/apartment if applicable */
            fun street(street: String) = street(JsonField.of(street))

            /** Street address including house number and unit/apartment if applicable */
            fun street(street: JsonField<String>) = apply { this.street = street }

            /** Postal code or ZIP code */
            fun zipcode(zipcode: String) = zipcode(JsonField.of(zipcode))

            /** Postal code or ZIP code */
            fun zipcode(zipcode: JsonField<String>) = apply { this.zipcode = zipcode }

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

            fun build(): Billing =
                Billing(
                    checkRequired("city", city),
                    checkRequired("country", country),
                    checkRequired("state", state),
                    checkRequired("street", street),
                    checkRequired("zipcode", zipcode),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Billing && city == other.city && country == other.country && state == other.state && street == other.street && zipcode == other.zipcode && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(city, country, state, street, zipcode, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Billing{city=$city, country=$country, state=$state, street=$street, zipcode=$zipcode, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = Customer.Deserializer::class)
    @JsonSerialize(using = Customer.Serializer::class)
    class Customer
    private constructor(
        private val attachExisting: AttachExistingCustomer? = null,
        private val createNew: CreateNewCustomer? = null,
        private val _json: JsonValue? = null,
    ) {

        fun attachExisting(): AttachExistingCustomer? = attachExisting

        fun createNew(): CreateNewCustomer? = createNew

        fun isAttachExisting(): Boolean = attachExisting != null

        fun isCreateNew(): Boolean = createNew != null

        fun asAttachExisting(): AttachExistingCustomer = attachExisting.getOrThrow("attachExisting")

        fun asCreateNew(): CreateNewCustomer = createNew.getOrThrow("createNew")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                attachExisting != null -> visitor.visitAttachExisting(attachExisting)
                createNew != null -> visitor.visitCreateNew(createNew)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): Customer = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitAttachExisting(attachExisting: AttachExistingCustomer) {
                        attachExisting.validate()
                    }

                    override fun visitCreateNew(createNew: CreateNewCustomer) {
                        createNew.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Customer && attachExisting == other.attachExisting && createNew == other.createNew /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(attachExisting, createNew) /* spotless:on */

        override fun toString(): String =
            when {
                attachExisting != null -> "Customer{attachExisting=$attachExisting}"
                createNew != null -> "Customer{createNew=$createNew}"
                _json != null -> "Customer{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Customer")
            }

        companion object {

            fun ofAttachExisting(attachExisting: AttachExistingCustomer) =
                Customer(attachExisting = attachExisting)

            fun ofCreateNew(createNew: CreateNewCustomer) = Customer(createNew = createNew)
        }

        /**
         * An interface that defines how to map each variant of [Customer] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitAttachExisting(attachExisting: AttachExistingCustomer): T

            fun visitCreateNew(createNew: CreateNewCustomer): T

            /**
             * Maps an unknown variant of [Customer] to a value of type [T].
             *
             * An instance of [Customer] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws DodoPaymentsInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw DodoPaymentsInvalidDataException("Unknown Customer: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Customer>(Customer::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Customer {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<AttachExistingCustomer>()) { it.validate() }
                    ?.let {
                        return Customer(attachExisting = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<CreateNewCustomer>()) { it.validate() }
                    ?.let {
                        return Customer(createNew = it, _json = json)
                    }

                return Customer(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Customer>(Customer::class) {

            override fun serialize(
                value: Customer,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.attachExisting != null -> generator.writeObject(value.attachExisting)
                    value.createNew != null -> generator.writeObject(value.createNew)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Customer")
                }
            }
        }

        @NoAutoDetect
        class AttachExistingCustomer
        @JsonCreator
        private constructor(
            @JsonProperty("customer_id")
            @ExcludeMissing
            private val customerId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun customerId(): String = customerId.getRequired("customer_id")

            @JsonProperty("customer_id")
            @ExcludeMissing
            fun _customerId(): JsonField<String> = customerId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AttachExistingCustomer = apply {
                if (validated) {
                    return@apply
                }

                customerId()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [AttachExistingCustomer].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .customerId()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [AttachExistingCustomer]. */
            class Builder internal constructor() {

                private var customerId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(attachExistingCustomer: AttachExistingCustomer) = apply {
                    customerId = attachExistingCustomer.customerId
                    additionalProperties =
                        attachExistingCustomer.additionalProperties.toMutableMap()
                }

                fun customerId(customerId: String) = customerId(JsonField.of(customerId))

                fun customerId(customerId: JsonField<String>) = apply {
                    this.customerId = customerId
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

                fun build(): AttachExistingCustomer =
                    AttachExistingCustomer(
                        checkRequired("customerId", customerId),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AttachExistingCustomer && customerId == other.customerId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(customerId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AttachExistingCustomer{customerId=$customerId, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class CreateNewCustomer
        @JsonCreator
        private constructor(
            @JsonProperty("email")
            @ExcludeMissing
            private val email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("create_new_customer")
            @ExcludeMissing
            private val createNewCustomer: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            private val phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun email(): String = email.getRequired("email")

            fun name(): String = name.getRequired("name")

            /**
             * When false, the most recently created customer object with the given email is used if
             * exists. When true, a new customer object is always created False by default
             */
            fun createNewCustomer(): Boolean? = createNewCustomer.getNullable("create_new_customer")

            fun phoneNumber(): String? = phoneNumber.getNullable("phone_number")

            @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * When false, the most recently created customer object with the given email is used if
             * exists. When true, a new customer object is always created False by default
             */
            @JsonProperty("create_new_customer")
            @ExcludeMissing
            fun _createNewCustomer(): JsonField<Boolean> = createNewCustomer

            @JsonProperty("phone_number")
            @ExcludeMissing
            fun _phoneNumber(): JsonField<String> = phoneNumber

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CreateNewCustomer = apply {
                if (validated) {
                    return@apply
                }

                email()
                name()
                createNewCustomer()
                phoneNumber()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [CreateNewCustomer].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .email()
                 * .name()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [CreateNewCustomer]. */
            class Builder internal constructor() {

                private var email: JsonField<String>? = null
                private var name: JsonField<String>? = null
                private var createNewCustomer: JsonField<Boolean> = JsonMissing.of()
                private var phoneNumber: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(createNewCustomer: CreateNewCustomer) = apply {
                    email = createNewCustomer.email
                    name = createNewCustomer.name
                    this.createNewCustomer = createNewCustomer.createNewCustomer
                    phoneNumber = createNewCustomer.phoneNumber
                    additionalProperties = createNewCustomer.additionalProperties.toMutableMap()
                }

                fun email(email: String) = email(JsonField.of(email))

                fun email(email: JsonField<String>) = apply { this.email = email }

                fun name(name: String) = name(JsonField.of(name))

                fun name(name: JsonField<String>) = apply { this.name = name }

                /**
                 * When false, the most recently created customer object with the given email is
                 * used if exists. When true, a new customer object is always created False by
                 * default
                 */
                fun createNewCustomer(createNewCustomer: Boolean) =
                    createNewCustomer(JsonField.of(createNewCustomer))

                /**
                 * When false, the most recently created customer object with the given email is
                 * used if exists. When true, a new customer object is always created False by
                 * default
                 */
                fun createNewCustomer(createNewCustomer: JsonField<Boolean>) = apply {
                    this.createNewCustomer = createNewCustomer
                }

                fun phoneNumber(phoneNumber: String?) =
                    phoneNumber(JsonField.ofNullable(phoneNumber))

                fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                    this.phoneNumber = phoneNumber
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

                fun build(): CreateNewCustomer =
                    CreateNewCustomer(
                        checkRequired("email", email),
                        checkRequired("name", name),
                        createNewCustomer,
                        phoneNumber,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CreateNewCustomer && email == other.email && name == other.name && createNewCustomer == other.createNewCustomer && phoneNumber == other.phoneNumber && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(email, name, createNewCustomer, phoneNumber, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreateNewCustomer{email=$email, name=$name, createNewCustomer=$createNewCustomer, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
        }
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

        return /* spotless:off */ other is SubscriptionCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SubscriptionCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
