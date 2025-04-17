// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.discounts

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
import java.time.OffsetDateTime
import java.util.Objects

/** If `code` is omitted or empty, a random 16-char uppercase code is generated. */
class DiscountCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The discount amount.
     * - If `discount_type` is **not** `percentage`, `amount` is in **USD cents**. For example,
     *   `100` means `$1.00`. Only USD is allowed.
     * - If `discount_type` **is** `percentage`, `amount` is in **basis points**. For example, `540`
     *   means `5.4%`.
     *
     * Must be at least 1.
     */
    fun amount(): Long = body.amount()

    fun type(): DiscountType = body.type()

    /**
     * Optionally supply a code (will be uppercased).
     * - Must be at least 3 characters if provided.
     * - If omitted, a random 16-character code is generated.
     */
    fun code(): String? = body.code()

    /** When the discount expires, if ever. */
    fun expiresAt(): OffsetDateTime? = body.expiresAt()

    fun name(): String? = body.name()

    /** List of product IDs to restrict usage (if any). */
    fun restrictedTo(): List<String>? = body.restrictedTo()

    /** How many times this discount can be used (if any). Must be >= 1 if provided. */
    fun usageLimit(): Long? = body.usageLimit()

    /**
     * The discount amount.
     * - If `discount_type` is **not** `percentage`, `amount` is in **USD cents**. For example,
     *   `100` means `$1.00`. Only USD is allowed.
     * - If `discount_type` **is** `percentage`, `amount` is in **basis points**. For example, `540`
     *   means `5.4%`.
     *
     * Must be at least 1.
     */
    fun _amount(): JsonField<Long> = body._amount()

    fun _type(): JsonField<DiscountType> = body._type()

    /**
     * Optionally supply a code (will be uppercased).
     * - Must be at least 3 characters if provided.
     * - If omitted, a random 16-character code is generated.
     */
    fun _code(): JsonField<String> = body._code()

    /** When the discount expires, if ever. */
    fun _expiresAt(): JsonField<OffsetDateTime> = body._expiresAt()

    fun _name(): JsonField<String> = body._name()

    /** List of product IDs to restrict usage (if any). */
    fun _restrictedTo(): JsonField<List<String>> = body._restrictedTo()

    /** How many times this discount can be used (if any). Must be >= 1 if provided. */
    fun _usageLimit(): JsonField<Long> = body._usageLimit()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Request body for creating a discount.
     *
     * `code` is optional; if not provided, we generate a random 16-char code.
     */
    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("type")
        @ExcludeMissing
        private val type: JsonField<DiscountType> = JsonMissing.of(),
        @JsonProperty("code")
        @ExcludeMissing
        private val code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expires_at")
        @ExcludeMissing
        private val expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("restricted_to")
        @ExcludeMissing
        private val restrictedTo: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("usage_limit")
        @ExcludeMissing
        private val usageLimit: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The discount amount.
         * - If `discount_type` is **not** `percentage`, `amount` is in **USD cents**. For example,
         *   `100` means `$1.00`. Only USD is allowed.
         * - If `discount_type` **is** `percentage`, `amount` is in **basis points**. For example,
         *   `540` means `5.4%`.
         *
         * Must be at least 1.
         */
        fun amount(): Long = amount.getRequired("amount")

        fun type(): DiscountType = type.getRequired("type")

        /**
         * Optionally supply a code (will be uppercased).
         * - Must be at least 3 characters if provided.
         * - If omitted, a random 16-character code is generated.
         */
        fun code(): String? = code.getNullable("code")

        /** When the discount expires, if ever. */
        fun expiresAt(): OffsetDateTime? = expiresAt.getNullable("expires_at")

        fun name(): String? = name.getNullable("name")

        /** List of product IDs to restrict usage (if any). */
        fun restrictedTo(): List<String>? = restrictedTo.getNullable("restricted_to")

        /** How many times this discount can be used (if any). Must be >= 1 if provided. */
        fun usageLimit(): Long? = usageLimit.getNullable("usage_limit")

        /**
         * The discount amount.
         * - If `discount_type` is **not** `percentage`, `amount` is in **USD cents**. For example,
         *   `100` means `$1.00`. Only USD is allowed.
         * - If `discount_type` **is** `percentage`, `amount` is in **basis points**. For example,
         *   `540` means `5.4%`.
         *
         * Must be at least 1.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<DiscountType> = type

        /**
         * Optionally supply a code (will be uppercased).
         * - Must be at least 3 characters if provided.
         * - If omitted, a random 16-character code is generated.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /** When the discount expires, if ever. */
        @JsonProperty("expires_at")
        @ExcludeMissing
        fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** List of product IDs to restrict usage (if any). */
        @JsonProperty("restricted_to")
        @ExcludeMissing
        fun _restrictedTo(): JsonField<List<String>> = restrictedTo

        /** How many times this discount can be used (if any). Must be >= 1 if provided. */
        @JsonProperty("usage_limit") @ExcludeMissing fun _usageLimit(): JsonField<Long> = usageLimit

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            amount()
            type()
            code()
            expiresAt()
            name()
            restrictedTo()
            usageLimit()
            validated = true
        }

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

            private var amount: JsonField<Long>? = null
            private var type: JsonField<DiscountType>? = null
            private var code: JsonField<String> = JsonMissing.of()
            private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var restrictedTo: JsonField<MutableList<String>>? = null
            private var usageLimit: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                amount = body.amount
                type = body.type
                code = body.code
                expiresAt = body.expiresAt
                name = body.name
                restrictedTo = body.restrictedTo.map { it.toMutableList() }
                usageLimit = body.usageLimit
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The discount amount.
             * - If `discount_type` is **not** `percentage`, `amount` is in **USD cents**. For
             *   example, `100` means `$1.00`. Only USD is allowed.
             * - If `discount_type` **is** `percentage`, `amount` is in **basis points**. For
             *   example, `540` means `5.4%`.
             *
             * Must be at least 1.
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * The discount amount.
             * - If `discount_type` is **not** `percentage`, `amount` is in **USD cents**. For
             *   example, `100` means `$1.00`. Only USD is allowed.
             * - If `discount_type` **is** `percentage`, `amount` is in **basis points**. For
             *   example, `540` means `5.4%`.
             *
             * Must be at least 1.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            fun type(type: DiscountType) = type(JsonField.of(type))

            fun type(type: JsonField<DiscountType>) = apply { this.type = type }

            /**
             * Optionally supply a code (will be uppercased).
             * - Must be at least 3 characters if provided.
             * - If omitted, a random 16-character code is generated.
             */
            fun code(code: String?) = code(JsonField.ofNullable(code))

            /**
             * Optionally supply a code (will be uppercased).
             * - Must be at least 3 characters if provided.
             * - If omitted, a random 16-character code is generated.
             */
            fun code(code: JsonField<String>) = apply { this.code = code }

            /** When the discount expires, if ever. */
            fun expiresAt(expiresAt: OffsetDateTime?) = expiresAt(JsonField.ofNullable(expiresAt))

            /** When the discount expires, if ever. */
            fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                this.expiresAt = expiresAt
            }

            fun name(name: String?) = name(JsonField.ofNullable(name))

            fun name(name: JsonField<String>) = apply { this.name = name }

            /** List of product IDs to restrict usage (if any). */
            fun restrictedTo(restrictedTo: List<String>?) =
                restrictedTo(JsonField.ofNullable(restrictedTo))

            /** List of product IDs to restrict usage (if any). */
            fun restrictedTo(restrictedTo: JsonField<List<String>>) = apply {
                this.restrictedTo = restrictedTo.map { it.toMutableList() }
            }

            /** List of product IDs to restrict usage (if any). */
            fun addRestrictedTo(restrictedTo: String) = apply {
                this.restrictedTo =
                    (this.restrictedTo ?: JsonField.of(mutableListOf())).also {
                        checkKnown("restrictedTo", it).add(restrictedTo)
                    }
            }

            /** How many times this discount can be used (if any). Must be >= 1 if provided. */
            fun usageLimit(usageLimit: Long?) = usageLimit(JsonField.ofNullable(usageLimit))

            /** How many times this discount can be used (if any). Must be >= 1 if provided. */
            fun usageLimit(usageLimit: Long) = usageLimit(usageLimit as Long?)

            /** How many times this discount can be used (if any). Must be >= 1 if provided. */
            fun usageLimit(usageLimit: JsonField<Long>) = apply { this.usageLimit = usageLimit }

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
                    checkRequired("amount", amount),
                    checkRequired("type", type),
                    code,
                    expiresAt,
                    name,
                    (restrictedTo ?: JsonMissing.of()).map { it.toImmutable() },
                    usageLimit,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && amount == other.amount && type == other.type && code == other.code && expiresAt == other.expiresAt && name == other.name && restrictedTo == other.restrictedTo && usageLimit == other.usageLimit && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, type, code, expiresAt, name, restrictedTo, usageLimit, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{amount=$amount, type=$type, code=$code, expiresAt=$expiresAt, name=$name, restrictedTo=$restrictedTo, usageLimit=$usageLimit, additionalProperties=$additionalProperties}"
    }

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
    @NoAutoDetect
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
         * The discount amount.
         * - If `discount_type` is **not** `percentage`, `amount` is in **USD cents**. For example,
         *   `100` means `$1.00`. Only USD is allowed.
         * - If `discount_type` **is** `percentage`, `amount` is in **basis points**. For example,
         *   `540` means `5.4%`.
         *
         * Must be at least 1.
         */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /**
         * The discount amount.
         * - If `discount_type` is **not** `percentage`, `amount` is in **USD cents**. For example,
         *   `100` means `$1.00`. Only USD is allowed.
         * - If `discount_type` **is** `percentage`, `amount` is in **basis points**. For example,
         *   `540` means `5.4%`.
         *
         * Must be at least 1.
         */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        fun type(type: DiscountType) = apply { body.type(type) }

        fun type(type: JsonField<DiscountType>) = apply { body.type(type) }

        /**
         * Optionally supply a code (will be uppercased).
         * - Must be at least 3 characters if provided.
         * - If omitted, a random 16-character code is generated.
         */
        fun code(code: String?) = apply { body.code(code) }

        /**
         * Optionally supply a code (will be uppercased).
         * - Must be at least 3 characters if provided.
         * - If omitted, a random 16-character code is generated.
         */
        fun code(code: JsonField<String>) = apply { body.code(code) }

        /** When the discount expires, if ever. */
        fun expiresAt(expiresAt: OffsetDateTime?) = apply { body.expiresAt(expiresAt) }

        /** When the discount expires, if ever. */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { body.expiresAt(expiresAt) }

        fun name(name: String?) = apply { body.name(name) }

        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** List of product IDs to restrict usage (if any). */
        fun restrictedTo(restrictedTo: List<String>?) = apply { body.restrictedTo(restrictedTo) }

        /** List of product IDs to restrict usage (if any). */
        fun restrictedTo(restrictedTo: JsonField<List<String>>) = apply {
            body.restrictedTo(restrictedTo)
        }

        /** List of product IDs to restrict usage (if any). */
        fun addRestrictedTo(restrictedTo: String) = apply { body.addRestrictedTo(restrictedTo) }

        /** How many times this discount can be used (if any). Must be >= 1 if provided. */
        fun usageLimit(usageLimit: Long?) = apply { body.usageLimit(usageLimit) }

        /** How many times this discount can be used (if any). Must be >= 1 if provided. */
        fun usageLimit(usageLimit: Long) = usageLimit(usageLimit as Long?)

        /** How many times this discount can be used (if any). Must be >= 1 if provided. */
        fun usageLimit(usageLimit: JsonField<Long>) = apply { body.usageLimit(usageLimit) }

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

        fun build(): DiscountCreateParams =
            DiscountCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DiscountCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "DiscountCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
