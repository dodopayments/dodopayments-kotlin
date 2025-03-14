// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.discounts

import com.dodo_payments.api.core.Enum
import com.dodo_payments.api.core.ExcludeMissing
import com.dodo_payments.api.core.JsonField
import com.dodo_payments.api.core.JsonMissing
import com.dodo_payments.api.core.JsonValue
import com.dodo_payments.api.core.NoAutoDetect
import com.dodo_payments.api.core.Params
import com.dodo_payments.api.core.checkKnown
import com.dodo_payments.api.core.checkRequired
import com.dodo_payments.api.core.http.Headers
import com.dodo_payments.api.core.http.QueryParams
import com.dodo_payments.api.core.immutableEmptyMap
import com.dodo_payments.api.core.toImmutable
import com.dodo_payments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Objects

/** PATCH /discounts/{discount_id} */
class DiscountUpdateParams
private constructor(
    private val discountId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun discountId(): String = discountId

    /**
     * If present, update the discount amount:
     * - If `discount_type` is `percentage`, this represents **basis points** (e.g., `540` =
     *   `5.4%`).
     * - Otherwise, this represents **USD cents** (e.g., `100` = `$1.00`).
     *
     * Must be at least 1 if provided.
     */
    fun amount(): Long? = body.amount()

    /** If present, update the discount code (uppercase). */
    fun code(): String? = body.code()

    fun expiresAt(): OffsetDateTime? = body.expiresAt()

    fun name(): String? = body.name()

    /**
     * If present, replaces all restricted product IDs with this new set. To remove all
     * restrictions, send empty array
     */
    fun restrictedTo(): List<String>? = body.restrictedTo()

    fun type(): Type? = body.type()

    fun usageLimit(): Long? = body.usageLimit()

    /**
     * If present, update the discount amount:
     * - If `discount_type` is `percentage`, this represents **basis points** (e.g., `540` =
     *   `5.4%`).
     * - Otherwise, this represents **USD cents** (e.g., `100` = `$1.00`).
     *
     * Must be at least 1 if provided.
     */
    fun _amount(): JsonField<Long> = body._amount()

    /** If present, update the discount code (uppercase). */
    fun _code(): JsonField<String> = body._code()

    fun _expiresAt(): JsonField<OffsetDateTime> = body._expiresAt()

    fun _name(): JsonField<String> = body._name()

    /**
     * If present, replaces all restricted product IDs with this new set. To remove all
     * restrictions, send empty array
     */
    fun _restrictedTo(): JsonField<List<String>> = body._restrictedTo()

    fun _type(): JsonField<Type> = body._type()

    fun _usageLimit(): JsonField<Long> = body._usageLimit()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> discountId
            else -> ""
        }
    }

    /**
     * Request body for patching (updating) a discount.
     *
     * All fields are optional and only update if provided.
     */
    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
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
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("usage_limit")
        @ExcludeMissing
        private val usageLimit: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * If present, update the discount amount:
         * - If `discount_type` is `percentage`, this represents **basis points** (e.g., `540` =
         *   `5.4%`).
         * - Otherwise, this represents **USD cents** (e.g., `100` = `$1.00`).
         *
         * Must be at least 1 if provided.
         */
        fun amount(): Long? = amount.getNullable("amount")

        /** If present, update the discount code (uppercase). */
        fun code(): String? = code.getNullable("code")

        fun expiresAt(): OffsetDateTime? = expiresAt.getNullable("expires_at")

        fun name(): String? = name.getNullable("name")

        /**
         * If present, replaces all restricted product IDs with this new set. To remove all
         * restrictions, send empty array
         */
        fun restrictedTo(): List<String>? = restrictedTo.getNullable("restricted_to")

        fun type(): Type? = type.getNullable("type")

        fun usageLimit(): Long? = usageLimit.getNullable("usage_limit")

        /**
         * If present, update the discount amount:
         * - If `discount_type` is `percentage`, this represents **basis points** (e.g., `540` =
         *   `5.4%`).
         * - Otherwise, this represents **USD cents** (e.g., `100` = `$1.00`).
         *
         * Must be at least 1 if provided.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /** If present, update the discount code (uppercase). */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        @JsonProperty("expires_at")
        @ExcludeMissing
        fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * If present, replaces all restricted product IDs with this new set. To remove all
         * restrictions, send empty array
         */
        @JsonProperty("restricted_to")
        @ExcludeMissing
        fun _restrictedTo(): JsonField<List<String>> = restrictedTo

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
            code()
            expiresAt()
            name()
            restrictedTo()
            type()
            usageLimit()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var amount: JsonField<Long> = JsonMissing.of()
            private var code: JsonField<String> = JsonMissing.of()
            private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var restrictedTo: JsonField<MutableList<String>>? = null
            private var type: JsonField<Type> = JsonMissing.of()
            private var usageLimit: JsonField<Long> = JsonMissing.of()
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
            fun amount(amount: Long?) = amount(JsonField.ofNullable(amount))

            /**
             * If present, update the discount amount:
             * - If `discount_type` is `percentage`, this represents **basis points** (e.g., `540` =
             *   `5.4%`).
             * - Otherwise, this represents **USD cents** (e.g., `100` = `$1.00`).
             *
             * Must be at least 1 if provided.
             */
            fun amount(amount: Long) = amount(amount as Long?)

            /**
             * If present, update the discount amount:
             * - If `discount_type` is `percentage`, this represents **basis points** (e.g., `540` =
             *   `5.4%`).
             * - Otherwise, this represents **USD cents** (e.g., `100` = `$1.00`).
             *
             * Must be at least 1 if provided.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** If present, update the discount code (uppercase). */
            fun code(code: String?) = code(JsonField.ofNullable(code))

            /** If present, update the discount code (uppercase). */
            fun code(code: JsonField<String>) = apply { this.code = code }

            fun expiresAt(expiresAt: OffsetDateTime?) = expiresAt(JsonField.ofNullable(expiresAt))

            fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                this.expiresAt = expiresAt
            }

            fun name(name: String?) = name(JsonField.ofNullable(name))

            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * If present, replaces all restricted product IDs with this new set. To remove all
             * restrictions, send empty array
             */
            fun restrictedTo(restrictedTo: List<String>?) =
                restrictedTo(JsonField.ofNullable(restrictedTo))

            /**
             * If present, replaces all restricted product IDs with this new set. To remove all
             * restrictions, send empty array
             */
            fun restrictedTo(restrictedTo: JsonField<List<String>>) = apply {
                this.restrictedTo = restrictedTo.map { it.toMutableList() }
            }

            /**
             * If present, replaces all restricted product IDs with this new set. To remove all
             * restrictions, send empty array
             */
            fun addRestrictedTo(restrictedTo: String) = apply {
                this.restrictedTo =
                    (this.restrictedTo ?: JsonField.of(mutableListOf())).also {
                        checkKnown("restrictedTo", it).add(restrictedTo)
                    }
            }

            fun type(type: Type?) = type(JsonField.ofNullable(type))

            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun usageLimit(usageLimit: Long?) = usageLimit(JsonField.ofNullable(usageLimit))

            fun usageLimit(usageLimit: Long) = usageLimit(usageLimit as Long?)

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
                    amount,
                    code,
                    expiresAt,
                    name,
                    (restrictedTo ?: JsonMissing.of()).map { it.toImmutable() },
                    type,
                    usageLimit,
                    additionalProperties.toImmutable(),
                )
        }

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

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DiscountUpdateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .discountId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [DiscountUpdateParams]. */
    @NoAutoDetect
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

        fun discountId(discountId: String) = apply { this.discountId = discountId }

        /**
         * If present, update the discount amount:
         * - If `discount_type` is `percentage`, this represents **basis points** (e.g., `540` =
         *   `5.4%`).
         * - Otherwise, this represents **USD cents** (e.g., `100` = `$1.00`).
         *
         * Must be at least 1 if provided.
         */
        fun amount(amount: Long?) = apply { body.amount(amount) }

        /**
         * If present, update the discount amount:
         * - If `discount_type` is `percentage`, this represents **basis points** (e.g., `540` =
         *   `5.4%`).
         * - Otherwise, this represents **USD cents** (e.g., `100` = `$1.00`).
         *
         * Must be at least 1 if provided.
         */
        fun amount(amount: Long) = amount(amount as Long?)

        /**
         * If present, update the discount amount:
         * - If `discount_type` is `percentage`, this represents **basis points** (e.g., `540` =
         *   `5.4%`).
         * - Otherwise, this represents **USD cents** (e.g., `100` = `$1.00`).
         *
         * Must be at least 1 if provided.
         */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /** If present, update the discount code (uppercase). */
        fun code(code: String?) = apply { body.code(code) }

        /** If present, update the discount code (uppercase). */
        fun code(code: JsonField<String>) = apply { body.code(code) }

        fun expiresAt(expiresAt: OffsetDateTime?) = apply { body.expiresAt(expiresAt) }

        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { body.expiresAt(expiresAt) }

        fun name(name: String?) = apply { body.name(name) }

        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * If present, replaces all restricted product IDs with this new set. To remove all
         * restrictions, send empty array
         */
        fun restrictedTo(restrictedTo: List<String>?) = apply { body.restrictedTo(restrictedTo) }

        /**
         * If present, replaces all restricted product IDs with this new set. To remove all
         * restrictions, send empty array
         */
        fun restrictedTo(restrictedTo: JsonField<List<String>>) = apply {
            body.restrictedTo(restrictedTo)
        }

        /**
         * If present, replaces all restricted product IDs with this new set. To remove all
         * restrictions, send empty array
         */
        fun addRestrictedTo(restrictedTo: String) = apply { body.addRestrictedTo(restrictedTo) }

        fun type(type: Type?) = apply { body.type(type) }

        fun type(type: JsonField<Type>) = apply { body.type(type) }

        fun usageLimit(usageLimit: Long?) = apply { body.usageLimit(usageLimit) }

        fun usageLimit(usageLimit: Long) = usageLimit(usageLimit as Long?)

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

        fun build(): DiscountUpdateParams =
            DiscountUpdateParams(
                checkRequired("discountId", discountId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val PERCENTAGE = of("percentage")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            PERCENTAGE
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PERCENTAGE,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PERCENTAGE -> Value.PERCENTAGE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws DodoPaymentsInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                PERCENTAGE -> Known.PERCENTAGE
                else -> throw DodoPaymentsInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws DodoPaymentsInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw DodoPaymentsInvalidDataException("Value is not a String")

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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
