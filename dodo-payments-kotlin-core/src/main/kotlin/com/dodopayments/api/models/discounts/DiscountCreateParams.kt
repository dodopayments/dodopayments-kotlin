// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.discounts

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.Params
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.core.http.QueryParams
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** POST /discounts If `code` is omitted or empty, a random 16-char uppercase code is generated. */
class DiscountCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The discount amount.
     *
     * - If `discount_type` is **not** `percentage`, `amount` is in **USD cents**. For example,
     *   `100` means `$1.00`. Only USD is allowed.
     * - If `discount_type` **is** `percentage`, `amount` is in **basis points**. For example, `540`
     *   means `5.4%`.
     *
     * Must be at least 1.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Int = body.amount()

    /**
     * The discount type (e.g. `percentage`, `flat`, or `flat_per_unit`).
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): DiscountType = body.type()

    /**
     * Optionally supply a code (will be uppercased).
     * - Must be at least 3 characters if provided.
     * - If omitted, a random 16-character code is generated.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun code(): String? = body.code()

    /**
     * When the discount expires, if ever.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun expiresAt(): OffsetDateTime? = body.expiresAt()

    /**
     * Additional metadata for the discount
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun metadata(): Metadata? = body.metadata()

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): String? = body.name()

    /**
     * Whether this discount should be preserved when a subscription changes plans. Default: false
     * (discount is removed on plan change)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun preserveOnPlanChange(): Boolean? = body.preserveOnPlanChange()

    /**
     * List of product IDs to restrict usage (if any).
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun restrictedTo(): List<String>? = body.restrictedTo()

    /**
     * Number of subscription billing cycles this discount is valid for. If not provided, the
     * discount will be applied indefinitely to all recurring payments related to the subscription.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun subscriptionCycles(): Int? = body.subscriptionCycles()

    /**
     * How many times this discount can be used (if any). Must be >= 1 if provided.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun usageLimit(): Int? = body.usageLimit()

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amount(): JsonField<Int> = body._amount()

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _type(): JsonField<DiscountType> = body._type()

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _code(): JsonField<String> = body._code()

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _expiresAt(): JsonField<OffsetDateTime> = body._expiresAt()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [preserveOnPlanChange].
     *
     * Unlike [preserveOnPlanChange], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _preserveOnPlanChange(): JsonField<Boolean> = body._preserveOnPlanChange()

    /**
     * Returns the raw JSON value of [restrictedTo].
     *
     * Unlike [restrictedTo], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _restrictedTo(): JsonField<List<String>> = body._restrictedTo()

    /**
     * Returns the raw JSON value of [subscriptionCycles].
     *
     * Unlike [subscriptionCycles], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _subscriptionCycles(): JsonField<Int> = body._subscriptionCycles()

    /**
     * Returns the raw JSON value of [usageLimit].
     *
     * Unlike [usageLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _usageLimit(): JsonField<Int> = body._usageLimit()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DiscountCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [DiscountCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(discountCreateParams: DiscountCreateParams) = apply {
            body = discountCreateParams.body.toBuilder()
            additionalHeaders = discountCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = discountCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [amount]
         * - [type]
         * - [code]
         * - [expiresAt]
         * - [metadata]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The discount amount.
         *
         * - If `discount_type` is **not** `percentage`, `amount` is in **USD cents**. For example,
         *   `100` means `$1.00`. Only USD is allowed.
         * - If `discount_type` **is** `percentage`, `amount` is in **basis points**. For example,
         *   `540` means `5.4%`.
         *
         * Must be at least 1.
         */
        fun amount(amount: Int) = apply { body.amount(amount) }

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Int>) = apply { body.amount(amount) }

        /** The discount type (e.g. `percentage`, `flat`, or `flat_per_unit`). */
        fun type(type: DiscountType) = apply { body.type(type) }

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [DiscountType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonField<DiscountType>) = apply { body.type(type) }

        /**
         * Optionally supply a code (will be uppercased).
         * - Must be at least 3 characters if provided.
         * - If omitted, a random 16-character code is generated.
         */
        fun code(code: String?) = apply { body.code(code) }

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { body.code(code) }

        /** When the discount expires, if ever. */
        fun expiresAt(expiresAt: OffsetDateTime?) = apply { body.expiresAt(expiresAt) }

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { body.expiresAt(expiresAt) }

        /** Additional metadata for the discount */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        fun name(name: String?) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * Whether this discount should be preserved when a subscription changes plans. Default:
         * false (discount is removed on plan change)
         */
        fun preserveOnPlanChange(preserveOnPlanChange: Boolean) = apply {
            body.preserveOnPlanChange(preserveOnPlanChange)
        }

        /**
         * Sets [Builder.preserveOnPlanChange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.preserveOnPlanChange] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun preserveOnPlanChange(preserveOnPlanChange: JsonField<Boolean>) = apply {
            body.preserveOnPlanChange(preserveOnPlanChange)
        }

        /** List of product IDs to restrict usage (if any). */
        fun restrictedTo(restrictedTo: List<String>?) = apply { body.restrictedTo(restrictedTo) }

        /**
         * Sets [Builder.restrictedTo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.restrictedTo] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun restrictedTo(restrictedTo: JsonField<List<String>>) = apply {
            body.restrictedTo(restrictedTo)
        }

        /**
         * Adds a single [String] to [Builder.restrictedTo].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRestrictedTo(restrictedTo: String) = apply { body.addRestrictedTo(restrictedTo) }

        /**
         * Number of subscription billing cycles this discount is valid for. If not provided, the
         * discount will be applied indefinitely to all recurring payments related to the
         * subscription.
         */
        fun subscriptionCycles(subscriptionCycles: Int?) = apply {
            body.subscriptionCycles(subscriptionCycles)
        }

        /**
         * Alias for [Builder.subscriptionCycles].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun subscriptionCycles(subscriptionCycles: Int) =
            subscriptionCycles(subscriptionCycles as Int?)

        /**
         * Sets [Builder.subscriptionCycles] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionCycles] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscriptionCycles(subscriptionCycles: JsonField<Int>) = apply {
            body.subscriptionCycles(subscriptionCycles)
        }

        /** How many times this discount can be used (if any). Must be >= 1 if provided. */
        fun usageLimit(usageLimit: Int?) = apply { body.usageLimit(usageLimit) }

        /**
         * Alias for [Builder.usageLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun usageLimit(usageLimit: Int) = usageLimit(usageLimit as Int?)

        /**
         * Sets [Builder.usageLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usageLimit] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun usageLimit(usageLimit: JsonField<Int>) = apply { body.usageLimit(usageLimit) }

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
         * Returns an immutable instance of [DiscountCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DiscountCreateParams =
            DiscountCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Request body for creating a discount.
     *
     * `code` is optional; if not provided, we generate a random 16-char code.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amount: JsonField<Int>,
        private val type: JsonField<DiscountType>,
        private val code: JsonField<String>,
        private val expiresAt: JsonField<OffsetDateTime>,
        private val metadata: JsonField<Metadata>,
        private val name: JsonField<String>,
        private val preserveOnPlanChange: JsonField<Boolean>,
        private val restrictedTo: JsonField<List<String>>,
        private val subscriptionCycles: JsonField<Int>,
        private val usageLimit: JsonField<Int>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<DiscountType> = JsonMissing.of(),
            @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expires_at")
            @ExcludeMissing
            expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("preserve_on_plan_change")
            @ExcludeMissing
            preserveOnPlanChange: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("restricted_to")
            @ExcludeMissing
            restrictedTo: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("subscription_cycles")
            @ExcludeMissing
            subscriptionCycles: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("usage_limit")
            @ExcludeMissing
            usageLimit: JsonField<Int> = JsonMissing.of(),
        ) : this(
            amount,
            type,
            code,
            expiresAt,
            metadata,
            name,
            preserveOnPlanChange,
            restrictedTo,
            subscriptionCycles,
            usageLimit,
            mutableMapOf(),
        )

        /**
         * The discount amount.
         *
         * - If `discount_type` is **not** `percentage`, `amount` is in **USD cents**. For example,
         *   `100` means `$1.00`. Only USD is allowed.
         * - If `discount_type` **is** `percentage`, `amount` is in **basis points**. For example,
         *   `540` means `5.4%`.
         *
         * Must be at least 1.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Int = amount.getRequired("amount")

        /**
         * The discount type (e.g. `percentage`, `flat`, or `flat_per_unit`).
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): DiscountType = type.getRequired("type")

        /**
         * Optionally supply a code (will be uppercased).
         * - Must be at least 3 characters if provided.
         * - If omitted, a random 16-character code is generated.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun code(): String? = code.getNullable("code")

        /**
         * When the discount expires, if ever.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun expiresAt(): OffsetDateTime? = expiresAt.getNullable("expires_at")

        /**
         * Additional metadata for the discount
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun name(): String? = name.getNullable("name")

        /**
         * Whether this discount should be preserved when a subscription changes plans. Default:
         * false (discount is removed on plan change)
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun preserveOnPlanChange(): Boolean? =
            preserveOnPlanChange.getNullable("preserve_on_plan_change")

        /**
         * List of product IDs to restrict usage (if any).
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun restrictedTo(): List<String>? = restrictedTo.getNullable("restricted_to")

        /**
         * Number of subscription billing cycles this discount is valid for. If not provided, the
         * discount will be applied indefinitely to all recurring payments related to the
         * subscription.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun subscriptionCycles(): Int? = subscriptionCycles.getNullable("subscription_cycles")

        /**
         * How many times this discount can be used (if any). Must be >= 1 if provided.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun usageLimit(): Int? = usageLimit.getNullable("usage_limit")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Int> = amount

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<DiscountType> = type

        /**
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /**
         * Returns the raw JSON value of [expiresAt].
         *
         * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("expires_at")
        @ExcludeMissing
        fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [preserveOnPlanChange].
         *
         * Unlike [preserveOnPlanChange], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("preserve_on_plan_change")
        @ExcludeMissing
        fun _preserveOnPlanChange(): JsonField<Boolean> = preserveOnPlanChange

        /**
         * Returns the raw JSON value of [restrictedTo].
         *
         * Unlike [restrictedTo], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("restricted_to")
        @ExcludeMissing
        fun _restrictedTo(): JsonField<List<String>> = restrictedTo

        /**
         * Returns the raw JSON value of [subscriptionCycles].
         *
         * Unlike [subscriptionCycles], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("subscription_cycles")
        @ExcludeMissing
        fun _subscriptionCycles(): JsonField<Int> = subscriptionCycles

        /**
         * Returns the raw JSON value of [usageLimit].
         *
         * Unlike [usageLimit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("usage_limit") @ExcludeMissing fun _usageLimit(): JsonField<Int> = usageLimit

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .amount()
             * .type()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var amount: JsonField<Int>? = null
            private var type: JsonField<DiscountType>? = null
            private var code: JsonField<String> = JsonMissing.of()
            private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var preserveOnPlanChange: JsonField<Boolean> = JsonMissing.of()
            private var restrictedTo: JsonField<MutableList<String>>? = null
            private var subscriptionCycles: JsonField<Int> = JsonMissing.of()
            private var usageLimit: JsonField<Int> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                amount = body.amount
                type = body.type
                code = body.code
                expiresAt = body.expiresAt
                metadata = body.metadata
                name = body.name
                preserveOnPlanChange = body.preserveOnPlanChange
                restrictedTo = body.restrictedTo.map { it.toMutableList() }
                subscriptionCycles = body.subscriptionCycles
                usageLimit = body.usageLimit
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The discount amount.
             *
             * - If `discount_type` is **not** `percentage`, `amount` is in **USD cents**. For
             *   example, `100` means `$1.00`. Only USD is allowed.
             * - If `discount_type` **is** `percentage`, `amount` is in **basis points**. For
             *   example, `540` means `5.4%`.
             *
             * Must be at least 1.
             */
            fun amount(amount: Int) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Int>) = apply { this.amount = amount }

            /** The discount type (e.g. `percentage`, `flat`, or `flat_per_unit`). */
            fun type(type: DiscountType) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [DiscountType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonField<DiscountType>) = apply { this.type = type }

            /**
             * Optionally supply a code (will be uppercased).
             * - Must be at least 3 characters if provided.
             * - If omitted, a random 16-character code is generated.
             */
            fun code(code: String?) = code(JsonField.ofNullable(code))

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<String>) = apply { this.code = code }

            /** When the discount expires, if ever. */
            fun expiresAt(expiresAt: OffsetDateTime?) = expiresAt(JsonField.ofNullable(expiresAt))

            /**
             * Sets [Builder.expiresAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                this.expiresAt = expiresAt
            }

            /** Additional metadata for the discount */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun name(name: String?) = name(JsonField.ofNullable(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Whether this discount should be preserved when a subscription changes plans. Default:
             * false (discount is removed on plan change)
             */
            fun preserveOnPlanChange(preserveOnPlanChange: Boolean) =
                preserveOnPlanChange(JsonField.of(preserveOnPlanChange))

            /**
             * Sets [Builder.preserveOnPlanChange] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preserveOnPlanChange] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun preserveOnPlanChange(preserveOnPlanChange: JsonField<Boolean>) = apply {
                this.preserveOnPlanChange = preserveOnPlanChange
            }

            /** List of product IDs to restrict usage (if any). */
            fun restrictedTo(restrictedTo: List<String>?) =
                restrictedTo(JsonField.ofNullable(restrictedTo))

            /**
             * Sets [Builder.restrictedTo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.restrictedTo] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun restrictedTo(restrictedTo: JsonField<List<String>>) = apply {
                this.restrictedTo = restrictedTo.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.restrictedTo].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRestrictedTo(restrictedTo: String) = apply {
                this.restrictedTo =
                    (this.restrictedTo ?: JsonField.of(mutableListOf())).also {
                        checkKnown("restrictedTo", it).add(restrictedTo)
                    }
            }

            /**
             * Number of subscription billing cycles this discount is valid for. If not provided,
             * the discount will be applied indefinitely to all recurring payments related to the
             * subscription.
             */
            fun subscriptionCycles(subscriptionCycles: Int?) =
                subscriptionCycles(JsonField.ofNullable(subscriptionCycles))

            /**
             * Alias for [Builder.subscriptionCycles].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun subscriptionCycles(subscriptionCycles: Int) =
                subscriptionCycles(subscriptionCycles as Int?)

            /**
             * Sets [Builder.subscriptionCycles] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriptionCycles] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subscriptionCycles(subscriptionCycles: JsonField<Int>) = apply {
                this.subscriptionCycles = subscriptionCycles
            }

            /** How many times this discount can be used (if any). Must be >= 1 if provided. */
            fun usageLimit(usageLimit: Int?) = usageLimit(JsonField.ofNullable(usageLimit))

            /**
             * Alias for [Builder.usageLimit].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun usageLimit(usageLimit: Int) = usageLimit(usageLimit as Int?)

            /**
             * Sets [Builder.usageLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.usageLimit] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun usageLimit(usageLimit: JsonField<Int>) = apply { this.usageLimit = usageLimit }

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
             *
             * The following fields are required:
             * ```kotlin
             * .amount()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("amount", amount),
                    checkRequired("type", type),
                    code,
                    expiresAt,
                    metadata,
                    name,
                    preserveOnPlanChange,
                    (restrictedTo ?: JsonMissing.of()).map { it.toImmutable() },
                    subscriptionCycles,
                    usageLimit,
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

            amount()
            type().validate()
            code()
            expiresAt()
            metadata()?.validate()
            name()
            preserveOnPlanChange()
            restrictedTo()
            subscriptionCycles()
            usageLimit()
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
            (if (amount.asKnown() == null) 0 else 1) +
                (type.asKnown()?.validity() ?: 0) +
                (if (code.asKnown() == null) 0 else 1) +
                (if (expiresAt.asKnown() == null) 0 else 1) +
                (metadata.asKnown()?.validity() ?: 0) +
                (if (name.asKnown() == null) 0 else 1) +
                (if (preserveOnPlanChange.asKnown() == null) 0 else 1) +
                (restrictedTo.asKnown()?.size ?: 0) +
                (if (subscriptionCycles.asKnown() == null) 0 else 1) +
                (if (usageLimit.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                amount == other.amount &&
                type == other.type &&
                code == other.code &&
                expiresAt == other.expiresAt &&
                metadata == other.metadata &&
                name == other.name &&
                preserveOnPlanChange == other.preserveOnPlanChange &&
                restrictedTo == other.restrictedTo &&
                subscriptionCycles == other.subscriptionCycles &&
                usageLimit == other.usageLimit &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                amount,
                type,
                code,
                expiresAt,
                metadata,
                name,
                preserveOnPlanChange,
                restrictedTo,
                subscriptionCycles,
                usageLimit,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{amount=$amount, type=$type, code=$code, expiresAt=$expiresAt, metadata=$metadata, name=$name, preserveOnPlanChange=$preserveOnPlanChange, restrictedTo=$restrictedTo, subscriptionCycles=$subscriptionCycles, usageLimit=$usageLimit, additionalProperties=$additionalProperties}"
    }

    /** Additional metadata for the discount */
    class Metadata
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            /**
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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
        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
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
        internal fun validity(): Int = additionalProperties.count { (_, value) ->
            !value.isNull() && !value.isMissing()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DiscountCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DiscountCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
