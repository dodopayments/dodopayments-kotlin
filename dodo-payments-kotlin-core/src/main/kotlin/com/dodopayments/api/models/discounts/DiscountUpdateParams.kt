// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.discounts

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.Params
import com.dodopayments.api.core.checkKnown
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

/** PATCH /discounts/{discount_id} */
class DiscountUpdateParams
private constructor(
    private val discountId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun discountId(): String? = discountId

    /**
     * If present, update the discount amount:
     * - If `discount_type` is `percentage`, this represents **basis points** (e.g., `540` =
     *   `5.4%`).
     * - Otherwise, this represents **USD cents** (e.g., `100` = `$1.00`).
     *
     * Must be at least 1 if provided.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun amount(): Int? = body.amount()

    /**
     * If present, update the discount code (uppercase).
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun code(): String? = body.code()

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun expiresAt(): OffsetDateTime? = body.expiresAt()

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): String? = body.name()

    /**
     * If present, replaces all restricted product IDs with this new set. To remove all
     * restrictions, send empty array
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun restrictedTo(): List<String>? = body.restrictedTo()

    /**
     * If present, update the discount type.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun type(): DiscountType? = body.type()

    /**
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
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [restrictedTo].
     *
     * Unlike [restrictedTo], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _restrictedTo(): JsonField<List<String>> = body._restrictedTo()

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _type(): JsonField<DiscountType> = body._type()

    /**
     * Returns the raw JSON value of [usageLimit].
     *
     * Unlike [usageLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _usageLimit(): JsonField<Int> = body._usageLimit()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): DiscountUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [DiscountUpdateParams]. */
        fun builder() = Builder()
    }

    /** A builder for [DiscountUpdateParams]. */
    class Builder internal constructor() {

        private var discountId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(discountUpdateParams: DiscountUpdateParams) = apply {
            discountId = discountUpdateParams.discountId
            body = discountUpdateParams.body.toBuilder()
            additionalHeaders = discountUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = discountUpdateParams.additionalQueryParams.toBuilder()
        }

        fun discountId(discountId: String?) = apply { this.discountId = discountId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [amount]
         * - [code]
         * - [expiresAt]
         * - [name]
         * - [restrictedTo]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * If present, update the discount amount:
         * - If `discount_type` is `percentage`, this represents **basis points** (e.g., `540` =
         *   `5.4%`).
         * - Otherwise, this represents **USD cents** (e.g., `100` = `$1.00`).
         *
         * Must be at least 1 if provided.
         */
        fun amount(amount: Int?) = apply { body.amount(amount) }

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
        fun amount(amount: JsonField<Int>) = apply { body.amount(amount) }

        /** If present, update the discount code (uppercase). */
        fun code(code: String?) = apply { body.code(code) }

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { body.code(code) }

        fun expiresAt(expiresAt: OffsetDateTime?) = apply { body.expiresAt(expiresAt) }

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { body.expiresAt(expiresAt) }

        fun name(name: String?) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * If present, replaces all restricted product IDs with this new set. To remove all
         * restrictions, send empty array
         */
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

        /** If present, update the discount type. */
        fun type(type: DiscountType?) = apply { body.type(type) }

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [DiscountType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonField<DiscountType>) = apply { body.type(type) }

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
         * Returns an immutable instance of [DiscountUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DiscountUpdateParams =
            DiscountUpdateParams(
                discountId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> discountId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Request body for patching (updating) a discount.
     *
     * All fields are optional and only update if provided.
     */
    class Body
    private constructor(
        private val amount: JsonField<Int>,
        private val code: JsonField<String>,
        private val expiresAt: JsonField<OffsetDateTime>,
        private val name: JsonField<String>,
        private val restrictedTo: JsonField<List<String>>,
        private val type: JsonField<DiscountType>,
        private val usageLimit: JsonField<Int>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expires_at")
            @ExcludeMissing
            expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("restricted_to")
            @ExcludeMissing
            restrictedTo: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<DiscountType> = JsonMissing.of(),
            @JsonProperty("usage_limit")
            @ExcludeMissing
            usageLimit: JsonField<Int> = JsonMissing.of(),
        ) : this(amount, code, expiresAt, name, restrictedTo, type, usageLimit, mutableMapOf())

        /**
         * If present, update the discount amount:
         * - If `discount_type` is `percentage`, this represents **basis points** (e.g., `540` =
         *   `5.4%`).
         * - Otherwise, this represents **USD cents** (e.g., `100` = `$1.00`).
         *
         * Must be at least 1 if provided.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun amount(): Int? = amount.getNullable("amount")

        /**
         * If present, update the discount code (uppercase).
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun code(): String? = code.getNullable("code")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun expiresAt(): OffsetDateTime? = expiresAt.getNullable("expires_at")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun name(): String? = name.getNullable("name")

        /**
         * If present, replaces all restricted product IDs with this new set. To remove all
         * restrictions, send empty array
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun restrictedTo(): List<String>? = restrictedTo.getNullable("restricted_to")

        /**
         * If present, update the discount type.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun type(): DiscountType? = type.getNullable("type")

        /**
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
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<DiscountType> = type

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var amount: JsonField<Int> = JsonMissing.of()
            private var code: JsonField<String> = JsonMissing.of()
            private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var restrictedTo: JsonField<MutableList<String>>? = null
            private var type: JsonField<DiscountType> = JsonMissing.of()
            private var usageLimit: JsonField<Int> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                amount = body.amount
                code = body.code
                expiresAt = body.expiresAt
                name = body.name
                restrictedTo = body.restrictedTo.map { it.toMutableList() }
                type = body.type
                usageLimit = body.usageLimit
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * If present, update the discount amount:
             * - If `discount_type` is `percentage`, this represents **basis points** (e.g., `540` =
             *   `5.4%`).
             * - Otherwise, this represents **USD cents** (e.g., `100` = `$1.00`).
             *
             * Must be at least 1 if provided.
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
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Int>) = apply { this.amount = amount }

            /** If present, update the discount code (uppercase). */
            fun code(code: String?) = code(JsonField.ofNullable(code))

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<String>) = apply { this.code = code }

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
             * If present, replaces all restricted product IDs with this new set. To remove all
             * restrictions, send empty array
             */
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

            /** If present, update the discount type. */
            fun type(type: DiscountType?) = type(JsonField.ofNullable(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [DiscountType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonField<DiscountType>) = apply { this.type = type }

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
             */
            fun build(): Body =
                Body(
                    amount,
                    code,
                    expiresAt,
                    name,
                    (restrictedTo ?: JsonMissing.of()).map { it.toImmutable() },
                    type,
                    usageLimit,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            amount()
            code()
            expiresAt()
            name()
            restrictedTo()
            type()?.validate()
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
                (if (code.asKnown() == null) 0 else 1) +
                (if (expiresAt.asKnown() == null) 0 else 1) +
                (if (name.asKnown() == null) 0 else 1) +
                (restrictedTo.asKnown()?.size ?: 0) +
                (type.asKnown()?.validity() ?: 0) +
                (if (usageLimit.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && amount == other.amount && code == other.code && expiresAt == other.expiresAt && name == other.name && restrictedTo == other.restrictedTo && type == other.type && usageLimit == other.usageLimit && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, code, expiresAt, name, restrictedTo, type, usageLimit, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{amount=$amount, code=$code, expiresAt=$expiresAt, name=$name, restrictedTo=$restrictedTo, type=$type, usageLimit=$usageLimit, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DiscountUpdateParams && discountId == other.discountId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(discountId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "DiscountUpdateParams{discountId=$discountId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
