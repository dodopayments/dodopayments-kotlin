// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.invoices

import com.dodopayments.api.core.BaseDeserializer
import com.dodopayments.api.core.BaseSerializer
import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.Params
import com.dodopayments.api.core.allMaxBy
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.getOrThrow
import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.core.http.QueryParams
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.Metadata
import com.dodopayments.api.models.misc.TaxCategory
import com.dodopayments.api.models.subscriptions.AttachAddon
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

/** Changes only the sent fields. `null` clears a field that can be empty. */
class InvoiceUpdateParams
private constructor(
    private val invoiceId: String?,
    private val ifMatch: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun invoiceId(): String? = invoiceId

    fun ifMatch(): String = ifMatch

    /**
     * The billing address of an invoice request.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun billingAddress(): BillingAddress? = body.billingAddress()

    /**
     * 10 addresses or fewer.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ccEmails(): List<String>? = body.ccEmails()

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun collectionMethod(): CollectionMethod? = body.collectionMethod()

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun currency(): Currency? = body.currency()

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun customerEmail(): String? = body.customerEmail()

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun customerId(): String? = body.customerId()

    /**
     * 20 codes or fewer.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun discountIds(): List<String>? = body.discountIds()

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dueAt(): OffsetDateTime? = body.dueAt()

    /**
     * The reminder override of one invoice. The business settings fill the other dunning values.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dunning(): Dunning? = body.dunning()

    /**
     * 1 to 50 items.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun items(): List<Item>? = body.items()

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun memo(): String? = body.memo()

    /**
     * Arbitrary key-value metadata. Values can be string, integer, number, or boolean.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun metadata(): Metadata? = body.metadata()

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun paymentTerms(): PaymentTerms? = body.paymentTerms()

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun reviewRequired(): Boolean? = body.reviewRequired()

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun taxId(): String? = body.taxId()

    /**
     * Returns the raw JSON value of [billingAddress].
     *
     * Unlike [billingAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _billingAddress(): JsonField<BillingAddress> = body._billingAddress()

    /**
     * Returns the raw JSON value of [ccEmails].
     *
     * Unlike [ccEmails], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _ccEmails(): JsonField<List<String>> = body._ccEmails()

    /**
     * Returns the raw JSON value of [collectionMethod].
     *
     * Unlike [collectionMethod], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _collectionMethod(): JsonField<CollectionMethod> = body._collectionMethod()

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _currency(): JsonField<Currency> = body._currency()

    /**
     * Returns the raw JSON value of [customerEmail].
     *
     * Unlike [customerEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customerEmail(): JsonField<String> = body._customerEmail()

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customerId(): JsonField<String> = body._customerId()

    /**
     * Returns the raw JSON value of [discountIds].
     *
     * Unlike [discountIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _discountIds(): JsonField<List<String>> = body._discountIds()

    /**
     * Returns the raw JSON value of [dueAt].
     *
     * Unlike [dueAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dueAt(): JsonField<OffsetDateTime> = body._dueAt()

    /**
     * Returns the raw JSON value of [dunning].
     *
     * Unlike [dunning], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dunning(): JsonField<Dunning> = body._dunning()

    /**
     * Returns the raw JSON value of [items].
     *
     * Unlike [items], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _items(): JsonField<List<Item>> = body._items()

    /**
     * Returns the raw JSON value of [memo].
     *
     * Unlike [memo], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _memo(): JsonField<String> = body._memo()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [paymentTerms].
     *
     * Unlike [paymentTerms], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _paymentTerms(): JsonField<PaymentTerms> = body._paymentTerms()

    /**
     * Returns the raw JSON value of [reviewRequired].
     *
     * Unlike [reviewRequired], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _reviewRequired(): JsonField<Boolean> = body._reviewRequired()

    /**
     * Returns the raw JSON value of [taxId].
     *
     * Unlike [taxId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _taxId(): JsonField<String> = body._taxId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InvoiceUpdateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .ifMatch()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [InvoiceUpdateParams]. */
    class Builder internal constructor() {

        private var invoiceId: String? = null
        private var ifMatch: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(invoiceUpdateParams: InvoiceUpdateParams) = apply {
            invoiceId = invoiceUpdateParams.invoiceId
            ifMatch = invoiceUpdateParams.ifMatch
            body = invoiceUpdateParams.body.toBuilder()
            additionalHeaders = invoiceUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = invoiceUpdateParams.additionalQueryParams.toBuilder()
        }

        fun invoiceId(invoiceId: String?) = apply { this.invoiceId = invoiceId }

        fun ifMatch(ifMatch: String) = apply { this.ifMatch = ifMatch }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [billingAddress]
         * - [ccEmails]
         * - [collectionMethod]
         * - [currency]
         * - [customerEmail]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The billing address of an invoice request. */
        fun billingAddress(billingAddress: BillingAddress?) = apply {
            body.billingAddress(billingAddress)
        }

        /**
         * Sets [Builder.billingAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingAddress] with a well-typed [BillingAddress] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billingAddress(billingAddress: JsonField<BillingAddress>) = apply {
            body.billingAddress(billingAddress)
        }

        /** 10 addresses or fewer. */
        fun ccEmails(ccEmails: List<String>?) = apply { body.ccEmails(ccEmails) }

        /**
         * Sets [Builder.ccEmails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ccEmails] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ccEmails(ccEmails: JsonField<List<String>>) = apply { body.ccEmails(ccEmails) }

        /**
         * Adds a single [String] to [ccEmails].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCcEmail(ccEmail: String) = apply { body.addCcEmail(ccEmail) }

        fun collectionMethod(collectionMethod: CollectionMethod?) = apply {
            body.collectionMethod(collectionMethod)
        }

        /**
         * Sets [Builder.collectionMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.collectionMethod] with a well-typed [CollectionMethod]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun collectionMethod(collectionMethod: JsonField<CollectionMethod>) = apply {
            body.collectionMethod(collectionMethod)
        }

        fun currency(currency: Currency?) = apply { body.currency(currency) }

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { body.currency(currency) }

        fun customerEmail(customerEmail: String?) = apply { body.customerEmail(customerEmail) }

        /**
         * Sets [Builder.customerEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerEmail] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerEmail(customerEmail: JsonField<String>) = apply {
            body.customerEmail(customerEmail)
        }

        fun customerId(customerId: String?) = apply { body.customerId(customerId) }

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /** 20 codes or fewer. */
        fun discountIds(discountIds: List<String>?) = apply { body.discountIds(discountIds) }

        /**
         * Sets [Builder.discountIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discountIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun discountIds(discountIds: JsonField<List<String>>) = apply {
            body.discountIds(discountIds)
        }

        /**
         * Adds a single [String] to [discountIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDiscountId(discountId: String) = apply { body.addDiscountId(discountId) }

        fun dueAt(dueAt: OffsetDateTime?) = apply { body.dueAt(dueAt) }

        /**
         * Sets [Builder.dueAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dueAt] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dueAt(dueAt: JsonField<OffsetDateTime>) = apply { body.dueAt(dueAt) }

        /**
         * The reminder override of one invoice. The business settings fill the other dunning
         * values.
         */
        fun dunning(dunning: Dunning?) = apply { body.dunning(dunning) }

        /**
         * Sets [Builder.dunning] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dunning] with a well-typed [Dunning] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dunning(dunning: JsonField<Dunning>) = apply { body.dunning(dunning) }

        /** 1 to 50 items. */
        fun items(items: List<Item>?) = apply { body.items(items) }

        /**
         * Sets [Builder.items] to an arbitrary JSON value.
         *
         * You should usually call [Builder.items] with a well-typed `List<Item>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun items(items: JsonField<List<Item>>) = apply { body.items(items) }

        /**
         * Adds a single [Item] to [items].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addItem(item: Item) = apply { body.addItem(item) }

        /** Alias for calling [addItem] with `Item.ofCustom(custom)`. */
        fun addItem(custom: Item.CustomItem) = apply { body.addItem(custom) }

        /** Alias for calling [addItem] with `Item.ofProduct(product)`. */
        fun addItem(product: Item.ProductItem) = apply { body.addItem(product) }

        fun memo(memo: String?) = apply { body.memo(memo) }

        /**
         * Sets [Builder.memo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.memo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun memo(memo: JsonField<String>) = apply { body.memo(memo) }

        /** Arbitrary key-value metadata. Values can be string, integer, number, or boolean. */
        fun metadata(metadata: Metadata?) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        fun paymentTerms(paymentTerms: PaymentTerms?) = apply { body.paymentTerms(paymentTerms) }

        /**
         * Sets [Builder.paymentTerms] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentTerms] with a well-typed [PaymentTerms] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun paymentTerms(paymentTerms: JsonField<PaymentTerms>) = apply {
            body.paymentTerms(paymentTerms)
        }

        /** Alias for calling [paymentTerms] with `PaymentTerms.ofDueOnReceipt()`. */
        fun paymentTermsDueOnReceipt() = apply { body.paymentTermsDueOnReceipt() }

        /** Alias for calling [paymentTerms] with `PaymentTerms.ofNet(net)`. */
        fun paymentTerms(net: PaymentTerms.Net) = apply { body.paymentTerms(net) }

        /**
         * Alias for calling [paymentTerms] with the following:
         * ```kotlin
         * PaymentTerms.Net.builder()
         *     .days(days)
         *     .build()
         * ```
         */
        fun netPaymentTerms(days: Int) = apply { body.netPaymentTerms(days) }

        fun reviewRequired(reviewRequired: Boolean?) = apply { body.reviewRequired(reviewRequired) }

        /**
         * Alias for [Builder.reviewRequired].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun reviewRequired(reviewRequired: Boolean) = reviewRequired(reviewRequired as Boolean?)

        /**
         * Sets [Builder.reviewRequired] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reviewRequired] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reviewRequired(reviewRequired: JsonField<Boolean>) = apply {
            body.reviewRequired(reviewRequired)
        }

        fun taxId(taxId: String?) = apply { body.taxId(taxId) }

        /**
         * Sets [Builder.taxId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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

        /**
         * Returns an immutable instance of [InvoiceUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .ifMatch()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InvoiceUpdateParams =
            InvoiceUpdateParams(
                invoiceId,
                checkRequired("ifMatch", ifMatch),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> invoiceId ?: ""
            else -> ""
        }

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                put("If-Match", ifMatch)
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** An absent field stays. On a field that can be cleared, `null` clears it. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val billingAddress: JsonField<BillingAddress>,
        private val ccEmails: JsonField<List<String>>,
        private val collectionMethod: JsonField<CollectionMethod>,
        private val currency: JsonField<Currency>,
        private val customerEmail: JsonField<String>,
        private val customerId: JsonField<String>,
        private val discountIds: JsonField<List<String>>,
        private val dueAt: JsonField<OffsetDateTime>,
        private val dunning: JsonField<Dunning>,
        private val items: JsonField<List<Item>>,
        private val memo: JsonField<String>,
        private val metadata: JsonField<Metadata>,
        private val paymentTerms: JsonField<PaymentTerms>,
        private val reviewRequired: JsonField<Boolean>,
        private val taxId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("billing_address")
            @ExcludeMissing
            billingAddress: JsonField<BillingAddress> = JsonMissing.of(),
            @JsonProperty("cc_emails")
            @ExcludeMissing
            ccEmails: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("collection_method")
            @ExcludeMissing
            collectionMethod: JsonField<CollectionMethod> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("customer_email")
            @ExcludeMissing
            customerEmail: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer_id")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("discount_ids")
            @ExcludeMissing
            discountIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("due_at")
            @ExcludeMissing
            dueAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("dunning") @ExcludeMissing dunning: JsonField<Dunning> = JsonMissing.of(),
            @JsonProperty("items") @ExcludeMissing items: JsonField<List<Item>> = JsonMissing.of(),
            @JsonProperty("memo") @ExcludeMissing memo: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("payment_terms")
            @ExcludeMissing
            paymentTerms: JsonField<PaymentTerms> = JsonMissing.of(),
            @JsonProperty("review_required")
            @ExcludeMissing
            reviewRequired: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("tax_id") @ExcludeMissing taxId: JsonField<String> = JsonMissing.of(),
        ) : this(
            billingAddress,
            ccEmails,
            collectionMethod,
            currency,
            customerEmail,
            customerId,
            discountIds,
            dueAt,
            dunning,
            items,
            memo,
            metadata,
            paymentTerms,
            reviewRequired,
            taxId,
            mutableMapOf(),
        )

        /**
         * The billing address of an invoice request.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun billingAddress(): BillingAddress? = billingAddress.getNullable("billing_address")

        /**
         * 10 addresses or fewer.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun ccEmails(): List<String>? = ccEmails.getNullable("cc_emails")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun collectionMethod(): CollectionMethod? =
            collectionMethod.getNullable("collection_method")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun currency(): Currency? = currency.getNullable("currency")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun customerEmail(): String? = customerEmail.getNullable("customer_email")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun customerId(): String? = customerId.getNullable("customer_id")

        /**
         * 20 codes or fewer.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun discountIds(): List<String>? = discountIds.getNullable("discount_ids")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun dueAt(): OffsetDateTime? = dueAt.getNullable("due_at")

        /**
         * The reminder override of one invoice. The business settings fill the other dunning
         * values.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun dunning(): Dunning? = dunning.getNullable("dunning")

        /**
         * 1 to 50 items.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun items(): List<Item>? = items.getNullable("items")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun memo(): String? = memo.getNullable("memo")

        /**
         * Arbitrary key-value metadata. Values can be string, integer, number, or boolean.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun paymentTerms(): PaymentTerms? = paymentTerms.getNullable("payment_terms")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun reviewRequired(): Boolean? = reviewRequired.getNullable("review_required")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun taxId(): String? = taxId.getNullable("tax_id")

        /**
         * Returns the raw JSON value of [billingAddress].
         *
         * Unlike [billingAddress], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billing_address")
        @ExcludeMissing
        fun _billingAddress(): JsonField<BillingAddress> = billingAddress

        /**
         * Returns the raw JSON value of [ccEmails].
         *
         * Unlike [ccEmails], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cc_emails")
        @ExcludeMissing
        fun _ccEmails(): JsonField<List<String>> = ccEmails

        /**
         * Returns the raw JSON value of [collectionMethod].
         *
         * Unlike [collectionMethod], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("collection_method")
        @ExcludeMissing
        fun _collectionMethod(): JsonField<CollectionMethod> = collectionMethod

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

        /**
         * Returns the raw JSON value of [customerEmail].
         *
         * Unlike [customerEmail], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("customer_email")
        @ExcludeMissing
        fun _customerEmail(): JsonField<String> = customerEmail

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Returns the raw JSON value of [discountIds].
         *
         * Unlike [discountIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("discount_ids")
        @ExcludeMissing
        fun _discountIds(): JsonField<List<String>> = discountIds

        /**
         * Returns the raw JSON value of [dueAt].
         *
         * Unlike [dueAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("due_at") @ExcludeMissing fun _dueAt(): JsonField<OffsetDateTime> = dueAt

        /**
         * Returns the raw JSON value of [dunning].
         *
         * Unlike [dunning], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dunning") @ExcludeMissing fun _dunning(): JsonField<Dunning> = dunning

        /**
         * Returns the raw JSON value of [items].
         *
         * Unlike [items], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<List<Item>> = items

        /**
         * Returns the raw JSON value of [memo].
         *
         * Unlike [memo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [paymentTerms].
         *
         * Unlike [paymentTerms], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("payment_terms")
        @ExcludeMissing
        fun _paymentTerms(): JsonField<PaymentTerms> = paymentTerms

        /**
         * Returns the raw JSON value of [reviewRequired].
         *
         * Unlike [reviewRequired], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("review_required")
        @ExcludeMissing
        fun _reviewRequired(): JsonField<Boolean> = reviewRequired

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var billingAddress: JsonField<BillingAddress> = JsonMissing.of()
            private var ccEmails: JsonField<MutableList<String>>? = null
            private var collectionMethod: JsonField<CollectionMethod> = JsonMissing.of()
            private var currency: JsonField<Currency> = JsonMissing.of()
            private var customerEmail: JsonField<String> = JsonMissing.of()
            private var customerId: JsonField<String> = JsonMissing.of()
            private var discountIds: JsonField<MutableList<String>>? = null
            private var dueAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var dunning: JsonField<Dunning> = JsonMissing.of()
            private var items: JsonField<MutableList<Item>>? = null
            private var memo: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var paymentTerms: JsonField<PaymentTerms> = JsonMissing.of()
            private var reviewRequired: JsonField<Boolean> = JsonMissing.of()
            private var taxId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                billingAddress = body.billingAddress
                ccEmails = body.ccEmails.map { it.toMutableList() }
                collectionMethod = body.collectionMethod
                currency = body.currency
                customerEmail = body.customerEmail
                customerId = body.customerId
                discountIds = body.discountIds.map { it.toMutableList() }
                dueAt = body.dueAt
                dunning = body.dunning
                items = body.items.map { it.toMutableList() }
                memo = body.memo
                metadata = body.metadata
                paymentTerms = body.paymentTerms
                reviewRequired = body.reviewRequired
                taxId = body.taxId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The billing address of an invoice request. */
            fun billingAddress(billingAddress: BillingAddress?) =
                billingAddress(JsonField.ofNullable(billingAddress))

            /**
             * Sets [Builder.billingAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingAddress] with a well-typed [BillingAddress]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun billingAddress(billingAddress: JsonField<BillingAddress>) = apply {
                this.billingAddress = billingAddress
            }

            /** 10 addresses or fewer. */
            fun ccEmails(ccEmails: List<String>?) = ccEmails(JsonField.ofNullable(ccEmails))

            /**
             * Sets [Builder.ccEmails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ccEmails] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ccEmails(ccEmails: JsonField<List<String>>) = apply {
                this.ccEmails = ccEmails.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [ccEmails].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCcEmail(ccEmail: String) = apply {
                ccEmails =
                    (ccEmails ?: JsonField.of(mutableListOf())).also {
                        checkKnown("ccEmails", it).add(ccEmail)
                    }
            }

            fun collectionMethod(collectionMethod: CollectionMethod?) =
                collectionMethod(JsonField.ofNullable(collectionMethod))

            /**
             * Sets [Builder.collectionMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.collectionMethod] with a well-typed
             * [CollectionMethod] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun collectionMethod(collectionMethod: JsonField<CollectionMethod>) = apply {
                this.collectionMethod = collectionMethod
            }

            fun currency(currency: Currency?) = currency(JsonField.ofNullable(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            fun customerEmail(customerEmail: String?) =
                customerEmail(JsonField.ofNullable(customerEmail))

            /**
             * Sets [Builder.customerEmail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerEmail] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerEmail(customerEmail: JsonField<String>) = apply {
                this.customerEmail = customerEmail
            }

            fun customerId(customerId: String?) = customerId(JsonField.ofNullable(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /** 20 codes or fewer. */
            fun discountIds(discountIds: List<String>?) =
                discountIds(JsonField.ofNullable(discountIds))

            /**
             * Sets [Builder.discountIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discountIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discountIds(discountIds: JsonField<List<String>>) = apply {
                this.discountIds = discountIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [discountIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDiscountId(discountId: String) = apply {
                discountIds =
                    (discountIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("discountIds", it).add(discountId)
                    }
            }

            fun dueAt(dueAt: OffsetDateTime?) = dueAt(JsonField.ofNullable(dueAt))

            /**
             * Sets [Builder.dueAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dueAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dueAt(dueAt: JsonField<OffsetDateTime>) = apply { this.dueAt = dueAt }

            /**
             * The reminder override of one invoice. The business settings fill the other dunning
             * values.
             */
            fun dunning(dunning: Dunning?) = dunning(JsonField.ofNullable(dunning))

            /**
             * Sets [Builder.dunning] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dunning] with a well-typed [Dunning] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dunning(dunning: JsonField<Dunning>) = apply { this.dunning = dunning }

            /** 1 to 50 items. */
            fun items(items: List<Item>?) = items(JsonField.ofNullable(items))

            /**
             * Sets [Builder.items] to an arbitrary JSON value.
             *
             * You should usually call [Builder.items] with a well-typed `List<Item>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
                    (items ?: JsonField.of(mutableListOf())).also {
                        checkKnown("items", it).add(item)
                    }
            }

            /** Alias for calling [addItem] with `Item.ofCustom(custom)`. */
            fun addItem(custom: Item.CustomItem) = addItem(Item.ofCustom(custom))

            /** Alias for calling [addItem] with `Item.ofProduct(product)`. */
            fun addItem(product: Item.ProductItem) = addItem(Item.ofProduct(product))

            fun memo(memo: String?) = memo(JsonField.ofNullable(memo))

            /**
             * Sets [Builder.memo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.memo] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun memo(memo: JsonField<String>) = apply { this.memo = memo }

            /** Arbitrary key-value metadata. Values can be string, integer, number, or boolean. */
            fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun paymentTerms(paymentTerms: PaymentTerms?) =
                paymentTerms(JsonField.ofNullable(paymentTerms))

            /**
             * Sets [Builder.paymentTerms] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentTerms] with a well-typed [PaymentTerms] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun paymentTerms(paymentTerms: JsonField<PaymentTerms>) = apply {
                this.paymentTerms = paymentTerms
            }

            /** Alias for calling [paymentTerms] with `PaymentTerms.ofDueOnReceipt()`. */
            fun paymentTermsDueOnReceipt() = paymentTerms(PaymentTerms.ofDueOnReceipt())

            /** Alias for calling [paymentTerms] with `PaymentTerms.ofNet(net)`. */
            fun paymentTerms(net: PaymentTerms.Net) = paymentTerms(PaymentTerms.ofNet(net))

            /**
             * Alias for calling [paymentTerms] with the following:
             * ```kotlin
             * PaymentTerms.Net.builder()
             *     .days(days)
             *     .build()
             * ```
             */
            fun netPaymentTerms(days: Int) =
                paymentTerms(PaymentTerms.Net.builder().days(days).build())

            fun reviewRequired(reviewRequired: Boolean?) =
                reviewRequired(JsonField.ofNullable(reviewRequired))

            /**
             * Alias for [Builder.reviewRequired].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun reviewRequired(reviewRequired: Boolean) = reviewRequired(reviewRequired as Boolean?)

            /**
             * Sets [Builder.reviewRequired] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reviewRequired] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reviewRequired(reviewRequired: JsonField<Boolean>) = apply {
                this.reviewRequired = reviewRequired
            }

            fun taxId(taxId: String?) = taxId(JsonField.ofNullable(taxId))

            /**
             * Sets [Builder.taxId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    billingAddress,
                    (ccEmails ?: JsonMissing.of()).map { it.toImmutable() },
                    collectionMethod,
                    currency,
                    customerEmail,
                    customerId,
                    (discountIds ?: JsonMissing.of()).map { it.toImmutable() },
                    dueAt,
                    dunning,
                    (items ?: JsonMissing.of()).map { it.toImmutable() },
                    memo,
                    metadata,
                    paymentTerms,
                    reviewRequired,
                    taxId,
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            billingAddress()?.validate()
            ccEmails()
            collectionMethod()?.validate()
            currency()?.validate()
            customerEmail()
            customerId()
            discountIds()
            dueAt()
            dunning()?.validate()
            items()?.forEach { it.validate() }
            memo()
            metadata()?.validate()
            paymentTerms()?.validate()
            reviewRequired()
            taxId()
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
            (billingAddress.asKnown()?.validity() ?: 0) +
                (ccEmails.asKnown()?.size ?: 0) +
                (collectionMethod.asKnown()?.validity() ?: 0) +
                (currency.asKnown()?.validity() ?: 0) +
                (if (customerEmail.asKnown() == null) 0 else 1) +
                (if (customerId.asKnown() == null) 0 else 1) +
                (discountIds.asKnown()?.size ?: 0) +
                (if (dueAt.asKnown() == null) 0 else 1) +
                (dunning.asKnown()?.validity() ?: 0) +
                (items.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (memo.asKnown() == null) 0 else 1) +
                (metadata.asKnown()?.validity() ?: 0) +
                (paymentTerms.asKnown()?.validity() ?: 0) +
                (if (reviewRequired.asKnown() == null) 0 else 1) +
                (if (taxId.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                billingAddress == other.billingAddress &&
                ccEmails == other.ccEmails &&
                collectionMethod == other.collectionMethod &&
                currency == other.currency &&
                customerEmail == other.customerEmail &&
                customerId == other.customerId &&
                discountIds == other.discountIds &&
                dueAt == other.dueAt &&
                dunning == other.dunning &&
                items == other.items &&
                memo == other.memo &&
                metadata == other.metadata &&
                paymentTerms == other.paymentTerms &&
                reviewRequired == other.reviewRequired &&
                taxId == other.taxId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                billingAddress,
                ccEmails,
                collectionMethod,
                currency,
                customerEmail,
                customerId,
                discountIds,
                dueAt,
                dunning,
                items,
                memo,
                metadata,
                paymentTerms,
                reviewRequired,
                taxId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{billingAddress=$billingAddress, ccEmails=$ccEmails, collectionMethod=$collectionMethod, currency=$currency, customerEmail=$customerEmail, customerId=$customerId, discountIds=$discountIds, dueAt=$dueAt, dunning=$dunning, items=$items, memo=$memo, metadata=$metadata, paymentTerms=$paymentTerms, reviewRequired=$reviewRequired, taxId=$taxId, additionalProperties=$additionalProperties}"
    }

    /** The billing address of an invoice request. */
    class BillingAddress
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val country: JsonField<CountryCode>,
        private val city: JsonField<String>,
        private val state: JsonField<String>,
        private val street: JsonField<String>,
        private val zipcode: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("country")
            @ExcludeMissing
            country: JsonField<CountryCode> = JsonMissing.of(),
            @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
            @JsonProperty("street") @ExcludeMissing street: JsonField<String> = JsonMissing.of(),
            @JsonProperty("zipcode") @ExcludeMissing zipcode: JsonField<String> = JsonMissing.of(),
        ) : this(country, city, state, street, zipcode, mutableMapOf())

        /**
         * Two-letter ISO country code (ISO 3166-1 alpha-2)
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun country(): CountryCode = country.getRequired("country")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun city(): String? = city.getNullable("city")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun state(): String? = state.getNullable("state")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun street(): String? = street.getNullable("street")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun zipcode(): String? = zipcode.getNullable("zipcode")

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<CountryCode> = country

        /**
         * Returns the raw JSON value of [city].
         *
         * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

        /**
         * Returns the raw JSON value of [state].
         *
         * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

        /**
         * Returns the raw JSON value of [street].
         *
         * Unlike [street], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("street") @ExcludeMissing fun _street(): JsonField<String> = street

        /**
         * Returns the raw JSON value of [zipcode].
         *
         * Unlike [zipcode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("zipcode") @ExcludeMissing fun _zipcode(): JsonField<String> = zipcode

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
             * Returns a mutable builder for constructing an instance of [BillingAddress].
             *
             * The following fields are required:
             * ```kotlin
             * .country()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [BillingAddress]. */
        class Builder internal constructor() {

            private var country: JsonField<CountryCode>? = null
            private var city: JsonField<String> = JsonMissing.of()
            private var state: JsonField<String> = JsonMissing.of()
            private var street: JsonField<String> = JsonMissing.of()
            private var zipcode: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(billingAddress: BillingAddress) = apply {
                country = billingAddress.country
                city = billingAddress.city
                state = billingAddress.state
                street = billingAddress.street
                zipcode = billingAddress.zipcode
                additionalProperties = billingAddress.additionalProperties.toMutableMap()
            }

            /** Two-letter ISO country code (ISO 3166-1 alpha-2) */
            fun country(country: CountryCode) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [CountryCode] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<CountryCode>) = apply { this.country = country }

            fun city(city: String?) = city(JsonField.ofNullable(city))

            /**
             * Sets [Builder.city] to an arbitrary JSON value.
             *
             * You should usually call [Builder.city] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun city(city: JsonField<String>) = apply { this.city = city }

            fun state(state: String?) = state(JsonField.ofNullable(state))

            /**
             * Sets [Builder.state] to an arbitrary JSON value.
             *
             * You should usually call [Builder.state] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun state(state: JsonField<String>) = apply { this.state = state }

            fun street(street: String?) = street(JsonField.ofNullable(street))

            /**
             * Sets [Builder.street] to an arbitrary JSON value.
             *
             * You should usually call [Builder.street] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun street(street: JsonField<String>) = apply { this.street = street }

            fun zipcode(zipcode: String?) = zipcode(JsonField.ofNullable(zipcode))

            /**
             * Sets [Builder.zipcode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.zipcode] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [BillingAddress].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .country()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): BillingAddress =
                BillingAddress(
                    checkRequired("country", country),
                    city,
                    state,
                    street,
                    zipcode,
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
        fun validate(): BillingAddress = apply {
            if (validated) {
                return@apply
            }

            country().validate()
            city()
            state()
            street()
            zipcode()
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
            (country.asKnown()?.validity() ?: 0) +
                (if (city.asKnown() == null) 0 else 1) +
                (if (state.asKnown() == null) 0 else 1) +
                (if (street.asKnown() == null) 0 else 1) +
                (if (zipcode.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BillingAddress &&
                country == other.country &&
                city == other.city &&
                state == other.state &&
                street == other.street &&
                zipcode == other.zipcode &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(country, city, state, street, zipcode, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BillingAddress{country=$country, city=$city, state=$state, street=$street, zipcode=$zipcode, additionalProperties=$additionalProperties}"
    }

    /**
     * The reminder override of one invoice. The business settings fill the other dunning values.
     */
    class Dunning
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val remindersEnabled: JsonField<Boolean>,
        private val offsetsDays: JsonField<List<Int>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("reminders_enabled")
            @ExcludeMissing
            remindersEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("offsets_days")
            @ExcludeMissing
            offsetsDays: JsonField<List<Int>> = JsonMissing.of(),
        ) : this(remindersEnabled, offsetsDays, mutableMapOf())

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun remindersEnabled(): Boolean = remindersEnabled.getRequired("reminders_enabled")

        /**
         * Days from the due date. A negative value sends the reminder before the due date.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun offsetsDays(): List<Int>? = offsetsDays.getNullable("offsets_days")

        /**
         * Returns the raw JSON value of [remindersEnabled].
         *
         * Unlike [remindersEnabled], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("reminders_enabled")
        @ExcludeMissing
        fun _remindersEnabled(): JsonField<Boolean> = remindersEnabled

        /**
         * Returns the raw JSON value of [offsetsDays].
         *
         * Unlike [offsetsDays], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("offsets_days")
        @ExcludeMissing
        fun _offsetsDays(): JsonField<List<Int>> = offsetsDays

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
             * Returns a mutable builder for constructing an instance of [Dunning].
             *
             * The following fields are required:
             * ```kotlin
             * .remindersEnabled()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Dunning]. */
        class Builder internal constructor() {

            private var remindersEnabled: JsonField<Boolean>? = null
            private var offsetsDays: JsonField<MutableList<Int>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(dunning: Dunning) = apply {
                remindersEnabled = dunning.remindersEnabled
                offsetsDays = dunning.offsetsDays.map { it.toMutableList() }
                additionalProperties = dunning.additionalProperties.toMutableMap()
            }

            fun remindersEnabled(remindersEnabled: Boolean) =
                remindersEnabled(JsonField.of(remindersEnabled))

            /**
             * Sets [Builder.remindersEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.remindersEnabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun remindersEnabled(remindersEnabled: JsonField<Boolean>) = apply {
                this.remindersEnabled = remindersEnabled
            }

            /** Days from the due date. A negative value sends the reminder before the due date. */
            fun offsetsDays(offsetsDays: List<Int>?) =
                offsetsDays(JsonField.ofNullable(offsetsDays))

            /**
             * Sets [Builder.offsetsDays] to an arbitrary JSON value.
             *
             * You should usually call [Builder.offsetsDays] with a well-typed `List<Int>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun offsetsDays(offsetsDays: JsonField<List<Int>>) = apply {
                this.offsetsDays = offsetsDays.map { it.toMutableList() }
            }

            /**
             * Adds a single [Int] to [offsetsDays].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOffsetsDay(offsetsDay: Int) = apply {
                offsetsDays =
                    (offsetsDays ?: JsonField.of(mutableListOf())).also {
                        checkKnown("offsetsDays", it).add(offsetsDay)
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
             * Returns an immutable instance of [Dunning].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .remindersEnabled()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Dunning =
                Dunning(
                    checkRequired("remindersEnabled", remindersEnabled),
                    (offsetsDays ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): Dunning = apply {
            if (validated) {
                return@apply
            }

            remindersEnabled()
            offsetsDays()
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
            (if (remindersEnabled.asKnown() == null) 0 else 1) + (offsetsDays.asKnown()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Dunning &&
                remindersEnabled == other.remindersEnabled &&
                offsetsDays == other.offsetsDays &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(remindersEnabled, offsetsDays, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Dunning{remindersEnabled=$remindersEnabled, offsetsDays=$offsetsDays, additionalProperties=$additionalProperties}"
    }

    /** A line that exists only on this invoice. */
    @JsonDeserialize(using = Item.Deserializer::class)
    @JsonSerialize(using = Item.Serializer::class)
    class Item
    private constructor(
        private val custom: CustomItem? = null,
        private val product: ProductItem? = null,
        private val _json: JsonValue? = null,
    ) {

        /** A line that exists only on this invoice. */
        fun custom(): CustomItem? = custom

        fun product(): ProductItem? = product

        fun isCustom(): Boolean = custom != null

        fun isProduct(): Boolean = product != null

        /** A line that exists only on this invoice. */
        fun asCustom(): CustomItem = custom.getOrThrow("custom")

        fun asProduct(): ProductItem = product.getOrThrow("product")

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
         * val result: String? = item.accept(object : Item.Visitor<String?> {
         *     override fun visitCustom(custom: CustomItem): String? = custom.toString()
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
                custom != null -> visitor.visitCustom(custom)
                product != null -> visitor.visitProduct(product)
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
        fun validate(): Item = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitCustom(custom: CustomItem) {
                        custom.validate()
                    }

                    override fun visitProduct(product: ProductItem) {
                        product.validate()
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
                    override fun visitCustom(custom: CustomItem) = custom.validity()

                    override fun visitProduct(product: ProductItem) = product.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Item && custom == other.custom && product == other.product
        }

        override fun hashCode(): Int = Objects.hash(custom, product)

        override fun toString(): String =
            when {
                custom != null -> "Item{custom=$custom}"
                product != null -> "Item{product=$product}"
                _json != null -> "Item{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Item")
            }

        companion object {

            /** A line that exists only on this invoice. */
            fun ofCustom(custom: CustomItem) = Item(custom = custom)

            fun ofProduct(product: ProductItem) = Item(product = product)
        }

        /** An interface that defines how to map each variant of [Item] to a value of type [T]. */
        interface Visitor<out T> {

            /** A line that exists only on this invoice. */
            fun visitCustom(custom: CustomItem): T

            fun visitProduct(product: ProductItem): T

            /**
             * Maps an unknown variant of [Item] to a value of type [T].
             *
             * An instance of [Item] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws DodoPaymentsInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw DodoPaymentsInvalidDataException("Unknown Item: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Item>(Item::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Item {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<CustomItem>())?.let {
                                Item(custom = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ProductItem>())?.let {
                                Item(product = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Item(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Item>(Item::class) {

            override fun serialize(
                value: Item,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.custom != null -> generator.writeObject(value.custom)
                    value.product != null -> generator.writeObject(value.product)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Item")
                }
            }
        }

        /** A line that exists only on this invoice. */
        class CustomItem
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val description: JsonField<String>,
            private val kind: JsonValue,
            private val taxCategory: JsonField<TaxCategory>,
            private val unitAmount: JsonField<Int>,
            private val quantity: JsonField<Int>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("kind") @ExcludeMissing kind: JsonValue = JsonMissing.of(),
                @JsonProperty("tax_category")
                @ExcludeMissing
                taxCategory: JsonField<TaxCategory> = JsonMissing.of(),
                @JsonProperty("unit_amount")
                @ExcludeMissing
                unitAmount: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                quantity: JsonField<Int> = JsonMissing.of(),
            ) : this(description, kind, taxCategory, unitAmount, quantity, mutableMapOf())

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun description(): String = description.getRequired("description")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("custom")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("kind") @ExcludeMissing fun _kind(): JsonValue = kind

            /**
             * Represents the different categories of taxation applicable to various products and
             * services.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun taxCategory(): TaxCategory = taxCategory.getRequired("tax_category")

            /**
             * The price in the smallest currency unit.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun unitAmount(): Int = unitAmount.getRequired("unit_amount")

            /**
             * The default is 1.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun quantity(): Int? = quantity.getNullable("quantity")

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
             * Returns the raw JSON value of [taxCategory].
             *
             * Unlike [taxCategory], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tax_category")
            @ExcludeMissing
            fun _taxCategory(): JsonField<TaxCategory> = taxCategory

            /**
             * Returns the raw JSON value of [unitAmount].
             *
             * Unlike [unitAmount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("unit_amount")
            @ExcludeMissing
            fun _unitAmount(): JsonField<Int> = unitAmount

            /**
             * Returns the raw JSON value of [quantity].
             *
             * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Int> = quantity

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
                 * Returns a mutable builder for constructing an instance of [CustomItem].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .description()
                 * .taxCategory()
                 * .unitAmount()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [CustomItem]. */
            class Builder internal constructor() {

                private var description: JsonField<String>? = null
                private var kind: JsonValue = JsonValue.from("custom")
                private var taxCategory: JsonField<TaxCategory>? = null
                private var unitAmount: JsonField<Int>? = null
                private var quantity: JsonField<Int> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(customItem: CustomItem) = apply {
                    description = customItem.description
                    kind = customItem.kind
                    taxCategory = customItem.taxCategory
                    unitAmount = customItem.unitAmount
                    quantity = customItem.quantity
                    additionalProperties = customItem.additionalProperties.toMutableMap()
                }

                fun description(description: String) = description(JsonField.of(description))

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

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("custom")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun kind(kind: JsonValue) = apply { this.kind = kind }

                /**
                 * Represents the different categories of taxation applicable to various products
                 * and services.
                 */
                fun taxCategory(taxCategory: TaxCategory) = taxCategory(JsonField.of(taxCategory))

                /**
                 * Sets [Builder.taxCategory] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taxCategory] with a well-typed [TaxCategory]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun taxCategory(taxCategory: JsonField<TaxCategory>) = apply {
                    this.taxCategory = taxCategory
                }

                /** The price in the smallest currency unit. */
                fun unitAmount(unitAmount: Int) = unitAmount(JsonField.of(unitAmount))

                /**
                 * Sets [Builder.unitAmount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unitAmount] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun unitAmount(unitAmount: JsonField<Int>) = apply { this.unitAmount = unitAmount }

                /** The default is 1. */
                fun quantity(quantity: Int?) = quantity(JsonField.ofNullable(quantity))

                /**
                 * Alias for [Builder.quantity].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun quantity(quantity: Int) = quantity(quantity as Int?)

                /**
                 * Sets [Builder.quantity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.quantity] with a well-typed [Int] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun quantity(quantity: JsonField<Int>) = apply { this.quantity = quantity }

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
                 * Returns an immutable instance of [CustomItem].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .description()
                 * .taxCategory()
                 * .unitAmount()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CustomItem =
                    CustomItem(
                        checkRequired("description", description),
                        kind,
                        checkRequired("taxCategory", taxCategory),
                        checkRequired("unitAmount", unitAmount),
                        quantity,
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
            fun validate(): CustomItem = apply {
                if (validated) {
                    return@apply
                }

                description()
                _kind().let {
                    if (it != JsonValue.from("custom")) {
                        throw DodoPaymentsInvalidDataException("'kind' is invalid, received $it")
                    }
                }
                taxCategory().validate()
                unitAmount()
                quantity()
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
                (if (description.asKnown() == null) 0 else 1) +
                    kind.let { if (it == JsonValue.from("custom")) 1 else 0 } +
                    (taxCategory.asKnown()?.validity() ?: 0) +
                    (if (unitAmount.asKnown() == null) 0 else 1) +
                    (if (quantity.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CustomItem &&
                    description == other.description &&
                    kind == other.kind &&
                    taxCategory == other.taxCategory &&
                    unitAmount == other.unitAmount &&
                    quantity == other.quantity &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    description,
                    kind,
                    taxCategory,
                    unitAmount,
                    quantity,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CustomItem{description=$description, kind=$kind, taxCategory=$taxCategory, unitAmount=$unitAmount, quantity=$quantity, additionalProperties=$additionalProperties}"
        }

        class ProductItem
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val productId: JsonField<String>,
            private val quantity: JsonField<Int>,
            private val addons: JsonField<List<AttachAddon>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("product_id")
                @ExcludeMissing
                productId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                quantity: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("addons")
                @ExcludeMissing
                addons: JsonField<List<AttachAddon>> = JsonMissing.of(),
            ) : this(productId, quantity, addons, mutableMapOf())

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun productId(): String = productId.getRequired("product_id")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun quantity(): Int = quantity.getRequired("quantity")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun addons(): List<AttachAddon>? = addons.getNullable("addons")

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
             * Returns the raw JSON value of [addons].
             *
             * Unlike [addons], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("addons")
            @ExcludeMissing
            fun _addons(): JsonField<List<AttachAddon>> = addons

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
                 * Returns a mutable builder for constructing an instance of [ProductItem].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .productId()
                 * .quantity()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [ProductItem]. */
            class Builder internal constructor() {

                private var productId: JsonField<String>? = null
                private var quantity: JsonField<Int>? = null
                private var addons: JsonField<MutableList<AttachAddon>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(productItem: ProductItem) = apply {
                    productId = productItem.productId
                    quantity = productItem.quantity
                    addons = productItem.addons.map { it.toMutableList() }
                    additionalProperties = productItem.additionalProperties.toMutableMap()
                }

                fun productId(productId: String) = productId(JsonField.of(productId))

                /**
                 * Sets [Builder.productId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.productId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun productId(productId: JsonField<String>) = apply { this.productId = productId }

                fun quantity(quantity: Int) = quantity(JsonField.of(quantity))

                /**
                 * Sets [Builder.quantity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.quantity] with a well-typed [Int] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun quantity(quantity: JsonField<Int>) = apply { this.quantity = quantity }

                fun addons(addons: List<AttachAddon>?) = addons(JsonField.ofNullable(addons))

                /**
                 * Sets [Builder.addons] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.addons] with a well-typed `List<AttachAddon>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * Returns an immutable instance of [ProductItem].
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
                fun build(): ProductItem =
                    ProductItem(
                        checkRequired("productId", productId),
                        checkRequired("quantity", quantity),
                        (addons ?: JsonMissing.of()).map { it.toImmutable() },
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
            fun validate(): ProductItem = apply {
                if (validated) {
                    return@apply
                }

                productId()
                quantity()
                addons()?.forEach { it.validate() }
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
                (if (productId.asKnown() == null) 0 else 1) +
                    (if (quantity.asKnown() == null) 0 else 1) +
                    (addons.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ProductItem &&
                    productId == other.productId &&
                    quantity == other.quantity &&
                    addons == other.addons &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(productId, quantity, addons, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ProductItem{productId=$productId, quantity=$quantity, addons=$addons, additionalProperties=$additionalProperties}"
        }
    }

    @JsonDeserialize(using = PaymentTerms.Deserializer::class)
    @JsonSerialize(using = PaymentTerms.Serializer::class)
    class PaymentTerms
    private constructor(
        private val dueOnReceipt: JsonValue? = null,
        private val net: Net? = null,
        private val _json: JsonValue? = null,
    ) {

        fun dueOnReceipt(): JsonValue? = dueOnReceipt

        fun net(): Net? = net

        fun isDueOnReceipt(): Boolean = dueOnReceipt != null

        fun isNet(): Boolean = net != null

        fun asDueOnReceipt(): JsonValue = dueOnReceipt.getOrThrow("dueOnReceipt")

        fun asNet(): Net = net.getOrThrow("net")

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
         * val result: String? = paymentTerms.accept(object : PaymentTerms.Visitor<String?> {
         *     override fun visitDueOnReceipt(dueOnReceipt: JsonValue): String? = dueOnReceipt.toString()
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
                dueOnReceipt != null -> visitor.visitDueOnReceipt(dueOnReceipt)
                net != null -> visitor.visitNet(net)
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
        fun validate(): PaymentTerms = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitDueOnReceipt(dueOnReceipt: JsonValue) {
                        dueOnReceipt.let {
                            if (it != JsonValue.from(mapOf("type" to "due_on_receipt"))) {
                                throw DodoPaymentsInvalidDataException(
                                    "'dueOnReceipt' is invalid, received $it"
                                )
                            }
                        }
                    }

                    override fun visitNet(net: Net) {
                        net.validate()
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
                    override fun visitDueOnReceipt(dueOnReceipt: JsonValue) =
                        dueOnReceipt.let {
                            if (it == JsonValue.from(mapOf("type" to "due_on_receipt"))) 1 else 0
                        }

                    override fun visitNet(net: Net) = net.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaymentTerms && dueOnReceipt == other.dueOnReceipt && net == other.net
        }

        override fun hashCode(): Int = Objects.hash(dueOnReceipt, net)

        override fun toString(): String =
            when {
                dueOnReceipt != null -> "PaymentTerms{dueOnReceipt=$dueOnReceipt}"
                net != null -> "PaymentTerms{net=$net}"
                _json != null -> "PaymentTerms{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid PaymentTerms")
            }

        companion object {

            fun ofDueOnReceipt() =
                PaymentTerms(dueOnReceipt = JsonValue.from(mapOf("type" to "due_on_receipt")))

            fun ofNet(net: Net) = PaymentTerms(net = net)
        }

        /**
         * An interface that defines how to map each variant of [PaymentTerms] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitDueOnReceipt(dueOnReceipt: JsonValue): T

            fun visitNet(net: Net): T

            /**
             * Maps an unknown variant of [PaymentTerms] to a value of type [T].
             *
             * An instance of [PaymentTerms] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws DodoPaymentsInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw DodoPaymentsInvalidDataException("Unknown PaymentTerms: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<PaymentTerms>(PaymentTerms::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): PaymentTerms {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject()?.get("type")?.asString()

                when (type) {
                    "due_on_receipt" -> {
                        return tryDeserialize(node, jacksonTypeRef<JsonValue>())
                            ?.let { PaymentTerms(dueOnReceipt = it, _json = json) }
                            ?.takeIf { it.isValid() } ?: PaymentTerms(_json = json)
                    }
                    "net" -> {
                        return tryDeserialize(node, jacksonTypeRef<Net>())?.let {
                            PaymentTerms(net = it, _json = json)
                        } ?: PaymentTerms(_json = json)
                    }
                }

                return PaymentTerms(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<PaymentTerms>(PaymentTerms::class) {

            override fun serialize(
                value: PaymentTerms,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.dueOnReceipt != null -> generator.writeObject(value.dueOnReceipt)
                    value.net != null -> generator.writeObject(value.net)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid PaymentTerms")
                }
            }
        }

        class Net
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val days: JsonField<Int>,
            private val type: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("days") @ExcludeMissing days: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            ) : this(days, type, mutableMapOf())

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun days(): Int = days.getRequired("days")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("net")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * Returns the raw JSON value of [days].
             *
             * Unlike [days], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("days") @ExcludeMissing fun _days(): JsonField<Int> = days

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
                 * Returns a mutable builder for constructing an instance of [Net].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .days()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Net]. */
            class Builder internal constructor() {

                private var days: JsonField<Int>? = null
                private var type: JsonValue = JsonValue.from("net")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(net: Net) = apply {
                    days = net.days
                    type = net.type
                    additionalProperties = net.additionalProperties.toMutableMap()
                }

                fun days(days: Int) = days(JsonField.of(days))

                /**
                 * Sets [Builder.days] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.days] with a well-typed [Int] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun days(days: JsonField<Int>) = apply { this.days = days }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("net")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

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
                 * Returns an immutable instance of [Net].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .days()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Net =
                    Net(checkRequired("days", days), type, additionalProperties.toMutableMap())
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
            fun validate(): Net = apply {
                if (validated) {
                    return@apply
                }

                days()
                _type().let {
                    if (it != JsonValue.from("net")) {
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (if (days.asKnown() == null) 0 else 1) +
                    type.let { if (it == JsonValue.from("net")) 1 else 0 }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Net &&
                    days == other.days &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(days, type, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Net{days=$days, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InvoiceUpdateParams &&
            invoiceId == other.invoiceId &&
            ifMatch == other.ifMatch &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(invoiceId, ifMatch, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "InvoiceUpdateParams{invoiceId=$invoiceId, ifMatch=$ifMatch, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
