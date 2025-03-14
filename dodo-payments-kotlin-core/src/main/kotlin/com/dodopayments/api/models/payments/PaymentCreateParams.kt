// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.NoAutoDetect
import com.dodopayments.api.core.Params
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.core.http.QueryParams
import com.dodopayments.api.core.immutableEmptyMap
import com.dodopayments.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects

class PaymentCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun billing(): BillingAddress = body.billing()

    fun customer(): CustomerRequest = body.customer()

    /** List of products in the cart. Must contain at least 1 and at most 100 items. */
    fun productCart(): List<OneTimeProductCartItem> = body.productCart()

    /** Discount Code to apply to the transaction */
    fun discountCode(): String? = body.discountCode()

    fun metadata(): Metadata? = body.metadata()

    /** Whether to generate a payment link. Defaults to false if not specified. */
    fun paymentLink(): Boolean? = body.paymentLink()

    /** Optional URL to redirect the customer after payment. Must be a valid URL if provided. */
    fun returnUrl(): String? = body.returnUrl()

    /**
     * Tax ID in case the payment is B2B. If tax id validation fails the payment creation will fail
     */
    fun taxId(): String? = body.taxId()

    fun _billing(): JsonField<BillingAddress> = body._billing()

    fun _customer(): JsonField<CustomerRequest> = body._customer()

    /** List of products in the cart. Must contain at least 1 and at most 100 items. */
    fun _productCart(): JsonField<List<OneTimeProductCartItem>> = body._productCart()

    /** Discount Code to apply to the transaction */
    fun _discountCode(): JsonField<String> = body._discountCode()

    fun _metadata(): JsonField<Metadata> = body._metadata()

    /** Whether to generate a payment link. Defaults to false if not specified. */
    fun _paymentLink(): JsonField<Boolean> = body._paymentLink()

    /** Optional URL to redirect the customer after payment. Must be a valid URL if provided. */
    fun _returnUrl(): JsonField<String> = body._returnUrl()

    /**
     * Tax ID in case the payment is B2B. If tax id validation fails the payment creation will fail
     */
    fun _taxId(): JsonField<String> = body._taxId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("billing")
        @ExcludeMissing
        private val billing: JsonField<BillingAddress> = JsonMissing.of(),
        @JsonProperty("customer")
        @ExcludeMissing
        private val customer: JsonField<CustomerRequest> = JsonMissing.of(),
        @JsonProperty("product_cart")
        @ExcludeMissing
        private val productCart: JsonField<List<OneTimeProductCartItem>> = JsonMissing.of(),
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
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun billing(): BillingAddress = billing.getRequired("billing")

        fun customer(): CustomerRequest = customer.getRequired("customer")

        /** List of products in the cart. Must contain at least 1 and at most 100 items. */
        fun productCart(): List<OneTimeProductCartItem> = productCart.getRequired("product_cart")

        /** Discount Code to apply to the transaction */
        fun discountCode(): String? = discountCode.getNullable("discount_code")

        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /** Whether to generate a payment link. Defaults to false if not specified. */
        fun paymentLink(): Boolean? = paymentLink.getNullable("payment_link")

        /** Optional URL to redirect the customer after payment. Must be a valid URL if provided. */
        fun returnUrl(): String? = returnUrl.getNullable("return_url")

        /**
         * Tax ID in case the payment is B2B. If tax id validation fails the payment creation will
         * fail
         */
        fun taxId(): String? = taxId.getNullable("tax_id")

        @JsonProperty("billing") @ExcludeMissing fun _billing(): JsonField<BillingAddress> = billing

        @JsonProperty("customer")
        @ExcludeMissing
        fun _customer(): JsonField<CustomerRequest> = customer

        /** List of products in the cart. Must contain at least 1 and at most 100 items. */
        @JsonProperty("product_cart")
        @ExcludeMissing
        fun _productCart(): JsonField<List<OneTimeProductCartItem>> = productCart

        /** Discount Code to apply to the transaction */
        @JsonProperty("discount_code")
        @ExcludeMissing
        fun _discountCode(): JsonField<String> = discountCode

        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /** Whether to generate a payment link. Defaults to false if not specified. */
        @JsonProperty("payment_link")
        @ExcludeMissing
        fun _paymentLink(): JsonField<Boolean> = paymentLink

        /** Optional URL to redirect the customer after payment. Must be a valid URL if provided. */
        @JsonProperty("return_url") @ExcludeMissing fun _returnUrl(): JsonField<String> = returnUrl

        /**
         * Tax ID in case the payment is B2B. If tax id validation fails the payment creation will
         * fail
         */
        @JsonProperty("tax_id") @ExcludeMissing fun _taxId(): JsonField<String> = taxId

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
            productCart().forEach { it.validate() }
            discountCode()
            metadata()?.validate()
            paymentLink()
            returnUrl()
            taxId()
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
             * .productCart()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var billing: JsonField<BillingAddress>? = null
            private var customer: JsonField<CustomerRequest>? = null
            private var productCart: JsonField<MutableList<OneTimeProductCartItem>>? = null
            private var discountCode: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var paymentLink: JsonField<Boolean> = JsonMissing.of()
            private var returnUrl: JsonField<String> = JsonMissing.of()
            private var taxId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                billing = body.billing
                customer = body.customer
                productCart = body.productCart.map { it.toMutableList() }
                discountCode = body.discountCode
                metadata = body.metadata
                paymentLink = body.paymentLink
                returnUrl = body.returnUrl
                taxId = body.taxId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun billing(billing: BillingAddress) = billing(JsonField.of(billing))

            fun billing(billing: JsonField<BillingAddress>) = apply { this.billing = billing }

            fun customer(customer: CustomerRequest) = customer(JsonField.of(customer))

            fun customer(customer: JsonField<CustomerRequest>) = apply { this.customer = customer }

            fun customer(attachExistingCustomer: AttachExistingCustomer) =
                customer(CustomerRequest.ofAttachExistingCustomer(attachExistingCustomer))

            fun customer(createNewCustomer: CreateNewCustomer) =
                customer(CustomerRequest.ofCreateNewCustomer(createNewCustomer))

            /** List of products in the cart. Must contain at least 1 and at most 100 items. */
            fun productCart(productCart: List<OneTimeProductCartItem>) =
                productCart(JsonField.of(productCart))

            /** List of products in the cart. Must contain at least 1 and at most 100 items. */
            fun productCart(productCart: JsonField<List<OneTimeProductCartItem>>) = apply {
                this.productCart = productCart.map { it.toMutableList() }
            }

            /** List of products in the cart. Must contain at least 1 and at most 100 items. */
            fun addProductCart(productCart: OneTimeProductCartItem) = apply {
                this.productCart =
                    (this.productCart ?: JsonField.of(mutableListOf())).also {
                        checkKnown("productCart", it).add(productCart)
                    }
            }

            /** Discount Code to apply to the transaction */
            fun discountCode(discountCode: String?) =
                discountCode(JsonField.ofNullable(discountCode))

            /** Discount Code to apply to the transaction */
            fun discountCode(discountCode: JsonField<String>) = apply {
                this.discountCode = discountCode
            }

            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** Whether to generate a payment link. Defaults to false if not specified. */
            fun paymentLink(paymentLink: Boolean?) = paymentLink(JsonField.ofNullable(paymentLink))

            /** Whether to generate a payment link. Defaults to false if not specified. */
            fun paymentLink(paymentLink: Boolean) = paymentLink(paymentLink as Boolean?)

            /** Whether to generate a payment link. Defaults to false if not specified. */
            fun paymentLink(paymentLink: JsonField<Boolean>) = apply {
                this.paymentLink = paymentLink
            }

            /**
             * Optional URL to redirect the customer after payment. Must be a valid URL if provided.
             */
            fun returnUrl(returnUrl: String?) = returnUrl(JsonField.ofNullable(returnUrl))

            /**
             * Optional URL to redirect the customer after payment. Must be a valid URL if provided.
             */
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
                    checkRequired("productCart", productCart).map { it.toImmutable() },
                    discountCode,
                    metadata,
                    paymentLink,
                    returnUrl,
                    taxId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && billing == other.billing && customer == other.customer && productCart == other.productCart && discountCode == other.discountCode && metadata == other.metadata && paymentLink == other.paymentLink && returnUrl == other.returnUrl && taxId == other.taxId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(billing, customer, productCart, discountCode, metadata, paymentLink, returnUrl, taxId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{billing=$billing, customer=$customer, productCart=$productCart, discountCode=$discountCode, metadata=$metadata, paymentLink=$paymentLink, returnUrl=$returnUrl, taxId=$taxId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PaymentCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .billing()
         * .customer()
         * .productCart()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PaymentCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(paymentCreateParams: PaymentCreateParams) = apply {
            body = paymentCreateParams.body.toBuilder()
            additionalHeaders = paymentCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = paymentCreateParams.additionalQueryParams.toBuilder()
        }

        fun billing(billing: BillingAddress) = apply { body.billing(billing) }

        fun billing(billing: JsonField<BillingAddress>) = apply { body.billing(billing) }

        fun customer(customer: CustomerRequest) = apply { body.customer(customer) }

        fun customer(customer: JsonField<CustomerRequest>) = apply { body.customer(customer) }

        fun customer(attachExistingCustomer: AttachExistingCustomer) = apply {
            body.customer(attachExistingCustomer)
        }

        fun customer(createNewCustomer: CreateNewCustomer) = apply {
            body.customer(createNewCustomer)
        }

        /** List of products in the cart. Must contain at least 1 and at most 100 items. */
        fun productCart(productCart: List<OneTimeProductCartItem>) = apply {
            body.productCart(productCart)
        }

        /** List of products in the cart. Must contain at least 1 and at most 100 items. */
        fun productCart(productCart: JsonField<List<OneTimeProductCartItem>>) = apply {
            body.productCart(productCart)
        }

        /** List of products in the cart. Must contain at least 1 and at most 100 items. */
        fun addProductCart(productCart: OneTimeProductCartItem) = apply {
            body.addProductCart(productCart)
        }

        /** Discount Code to apply to the transaction */
        fun discountCode(discountCode: String?) = apply { body.discountCode(discountCode) }

        /** Discount Code to apply to the transaction */
        fun discountCode(discountCode: JsonField<String>) = apply {
            body.discountCode(discountCode)
        }

        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /** Whether to generate a payment link. Defaults to false if not specified. */
        fun paymentLink(paymentLink: Boolean?) = apply { body.paymentLink(paymentLink) }

        /** Whether to generate a payment link. Defaults to false if not specified. */
        fun paymentLink(paymentLink: Boolean) = paymentLink(paymentLink as Boolean?)

        /** Whether to generate a payment link. Defaults to false if not specified. */
        fun paymentLink(paymentLink: JsonField<Boolean>) = apply { body.paymentLink(paymentLink) }

        /** Optional URL to redirect the customer after payment. Must be a valid URL if provided. */
        fun returnUrl(returnUrl: String?) = apply { body.returnUrl(returnUrl) }

        /** Optional URL to redirect the customer after payment. Must be a valid URL if provided. */
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

        fun build(): PaymentCreateParams =
            PaymentCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
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

        return /* spotless:off */ other is PaymentCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PaymentCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
