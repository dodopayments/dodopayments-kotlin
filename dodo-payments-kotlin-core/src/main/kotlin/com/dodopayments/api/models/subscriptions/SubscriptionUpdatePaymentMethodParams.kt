// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.BaseDeserializer
import com.dodopayments.api.core.BaseSerializer
import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.Params
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.getOrThrow
import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.core.http.QueryParams
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.payments.PaymentMethodTypes
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
import java.util.Collections
import java.util.Objects

class SubscriptionUpdatePaymentMethodParams
private constructor(
    private val subscriptionId: String?,
    private val paymentMethod: PaymentMethod,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun subscriptionId(): String? = subscriptionId

    fun paymentMethod(): PaymentMethod = paymentMethod

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SubscriptionUpdatePaymentMethodParams].
         *
         * The following fields are required:
         * ```kotlin
         * .paymentMethod()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SubscriptionUpdatePaymentMethodParams]. */
    class Builder internal constructor() {

        private var subscriptionId: String? = null
        private var paymentMethod: PaymentMethod? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            subscriptionUpdatePaymentMethodParams: SubscriptionUpdatePaymentMethodParams
        ) = apply {
            subscriptionId = subscriptionUpdatePaymentMethodParams.subscriptionId
            paymentMethod = subscriptionUpdatePaymentMethodParams.paymentMethod
            additionalHeaders = subscriptionUpdatePaymentMethodParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                subscriptionUpdatePaymentMethodParams.additionalQueryParams.toBuilder()
        }

        fun subscriptionId(subscriptionId: String?) = apply { this.subscriptionId = subscriptionId }

        fun paymentMethod(paymentMethod: PaymentMethod) = apply {
            this.paymentMethod = paymentMethod
        }

        /** Alias for calling [paymentMethod] with `PaymentMethod.ofNew(new)`. */
        fun paymentMethod(new: PaymentMethod.New) = paymentMethod(PaymentMethod.ofNew(new))

        /** Alias for calling [paymentMethod] with `PaymentMethod.ofExisting(existing)`. */
        fun paymentMethod(existing: PaymentMethod.Existing) =
            paymentMethod(PaymentMethod.ofExisting(existing))

        /**
         * Alias for calling [paymentMethod] with the following:
         * ```kotlin
         * PaymentMethod.Existing.builder()
         *     .paymentMethodId(paymentMethodId)
         *     .build()
         * ```
         */
        fun existingPaymentMethod(paymentMethodId: String) =
            paymentMethod(PaymentMethod.Existing.builder().paymentMethodId(paymentMethodId).build())

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
         * Returns an immutable instance of [SubscriptionUpdatePaymentMethodParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .paymentMethod()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubscriptionUpdatePaymentMethodParams =
            SubscriptionUpdatePaymentMethodParams(
                subscriptionId,
                checkRequired("paymentMethod", paymentMethod),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): PaymentMethod = paymentMethod

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> subscriptionId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(using = PaymentMethod.Deserializer::class)
    @JsonSerialize(using = PaymentMethod.Serializer::class)
    class PaymentMethod
    private constructor(
        private val new: New? = null,
        private val existing: Existing? = null,
        private val _json: JsonValue? = null,
    ) {

        fun new(): New? = new

        fun existing(): Existing? = existing

        fun isNew(): Boolean = new != null

        fun isExisting(): Boolean = existing != null

        fun asNew(): New = new.getOrThrow("new")

        fun asExisting(): Existing = existing.getOrThrow("existing")

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
         * val result: String? = paymentMethod.accept(object : PaymentMethod.Visitor<String?> {
         *     override fun visitNew(new: New): String? = new.toString()
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
                new != null -> visitor.visitNew(new)
                existing != null -> visitor.visitExisting(existing)
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
        fun validate(): PaymentMethod = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitNew(new: New) {
                        new.validate()
                    }

                    override fun visitExisting(existing: Existing) {
                        existing.validate()
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
                    override fun visitNew(new: New) = new.validity()

                    override fun visitExisting(existing: Existing) = existing.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaymentMethod && new == other.new && existing == other.existing
        }

        override fun hashCode(): Int = Objects.hash(new, existing)

        override fun toString(): String =
            when {
                new != null -> "PaymentMethod{new=$new}"
                existing != null -> "PaymentMethod{existing=$existing}"
                _json != null -> "PaymentMethod{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid PaymentMethod")
            }

        companion object {

            fun ofNew(new: New) = PaymentMethod(new = new)

            fun ofExisting(existing: Existing) = PaymentMethod(existing = existing)
        }

        /**
         * An interface that defines how to map each variant of [PaymentMethod] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitNew(new: New): T

            fun visitExisting(existing: Existing): T

            /**
             * Maps an unknown variant of [PaymentMethod] to a value of type [T].
             *
             * An instance of [PaymentMethod] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws DodoPaymentsInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw DodoPaymentsInvalidDataException("Unknown PaymentMethod: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<PaymentMethod>(PaymentMethod::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): PaymentMethod {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject()?.get("type")?.asString()

                when (type) {
                    "new" -> {
                        return tryDeserialize(node, jacksonTypeRef<New>())?.let {
                            PaymentMethod(new = it, _json = json)
                        } ?: PaymentMethod(_json = json)
                    }
                    "existing" -> {
                        return tryDeserialize(node, jacksonTypeRef<Existing>())?.let {
                            PaymentMethod(existing = it, _json = json)
                        } ?: PaymentMethod(_json = json)
                    }
                }

                return PaymentMethod(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<PaymentMethod>(PaymentMethod::class) {

            override fun serialize(
                value: PaymentMethod,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.new != null -> generator.writeObject(value.new)
                    value.existing != null -> generator.writeObject(value.existing)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid PaymentMethod")
                }
            }
        }

        class New
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val type: JsonValue,
            private val allowedPaymentMethodTypes: JsonField<List<PaymentMethodTypes>>,
            private val returnUrl: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                @JsonProperty("allowed_payment_method_types")
                @ExcludeMissing
                allowedPaymentMethodTypes: JsonField<List<PaymentMethodTypes>> = JsonMissing.of(),
                @JsonProperty("return_url")
                @ExcludeMissing
                returnUrl: JsonField<String> = JsonMissing.of(),
            ) : this(type, allowedPaymentMethodTypes, returnUrl, mutableMapOf())

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("new")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * List of payment methods allowed during checkout.
             *
             * Customers will **never** see payment methods that are **not** in this list. However,
             * adding a method here **does not guarantee** customers will see it. Availability still
             * depends on other factors (e.g., customer location, merchant settings).
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun allowedPaymentMethodTypes(): List<PaymentMethodTypes>? =
                allowedPaymentMethodTypes.getNullable("allowed_payment_method_types")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun returnUrl(): String? = returnUrl.getNullable("return_url")

            /**
             * Returns the raw JSON value of [allowedPaymentMethodTypes].
             *
             * Unlike [allowedPaymentMethodTypes], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("allowed_payment_method_types")
            @ExcludeMissing
            fun _allowedPaymentMethodTypes(): JsonField<List<PaymentMethodTypes>> =
                allowedPaymentMethodTypes

            /**
             * Returns the raw JSON value of [returnUrl].
             *
             * Unlike [returnUrl], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("return_url")
            @ExcludeMissing
            fun _returnUrl(): JsonField<String> = returnUrl

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

                /** Returns a mutable builder for constructing an instance of [New]. */
                fun builder() = Builder()
            }

            /** A builder for [New]. */
            class Builder internal constructor() {

                private var type: JsonValue = JsonValue.from("new")
                private var allowedPaymentMethodTypes: JsonField<MutableList<PaymentMethodTypes>>? =
                    null
                private var returnUrl: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(new: New) = apply {
                    type = new.type
                    allowedPaymentMethodTypes =
                        new.allowedPaymentMethodTypes.map { it.toMutableList() }
                    returnUrl = new.returnUrl
                    additionalProperties = new.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("new")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

                /**
                 * List of payment methods allowed during checkout.
                 *
                 * Customers will **never** see payment methods that are **not** in this list.
                 * However, adding a method here **does not guarantee** customers will see it.
                 * Availability still depends on other factors (e.g., customer location, merchant
                 * settings).
                 */
                fun allowedPaymentMethodTypes(
                    allowedPaymentMethodTypes: List<PaymentMethodTypes>?
                ) = allowedPaymentMethodTypes(JsonField.ofNullable(allowedPaymentMethodTypes))

                /**
                 * Sets [Builder.allowedPaymentMethodTypes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.allowedPaymentMethodTypes] with a well-typed
                 * `List<PaymentMethodTypes>` value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun allowedPaymentMethodTypes(
                    allowedPaymentMethodTypes: JsonField<List<PaymentMethodTypes>>
                ) = apply {
                    this.allowedPaymentMethodTypes = allowedPaymentMethodTypes.map {
                        it.toMutableList()
                    }
                }

                /**
                 * Adds a single [PaymentMethodTypes] to [allowedPaymentMethodTypes].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAllowedPaymentMethodType(allowedPaymentMethodType: PaymentMethodTypes) =
                    apply {
                        allowedPaymentMethodTypes =
                            (allowedPaymentMethodTypes ?: JsonField.of(mutableListOf())).also {
                                checkKnown("allowedPaymentMethodTypes", it)
                                    .add(allowedPaymentMethodType)
                            }
                    }

                fun returnUrl(returnUrl: String?) = returnUrl(JsonField.ofNullable(returnUrl))

                /**
                 * Sets [Builder.returnUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.returnUrl] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun returnUrl(returnUrl: JsonField<String>) = apply { this.returnUrl = returnUrl }

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
                 * Returns an immutable instance of [New].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): New =
                    New(
                        type,
                        (allowedPaymentMethodTypes ?: JsonMissing.of()).map { it.toImmutable() },
                        returnUrl,
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
            fun validate(): New = apply {
                if (validated) {
                    return@apply
                }

                _type().let {
                    if (it != JsonValue.from("new")) {
                        throw DodoPaymentsInvalidDataException("'type' is invalid, received $it")
                    }
                }
                allowedPaymentMethodTypes()?.forEach { it.validate() }
                returnUrl()
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
                type.let { if (it == JsonValue.from("new")) 1 else 0 } +
                    (allowedPaymentMethodTypes.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (returnUrl.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is New &&
                    type == other.type &&
                    allowedPaymentMethodTypes == other.allowedPaymentMethodTypes &&
                    returnUrl == other.returnUrl &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(type, allowedPaymentMethodTypes, returnUrl, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "New{type=$type, allowedPaymentMethodTypes=$allowedPaymentMethodTypes, returnUrl=$returnUrl, additionalProperties=$additionalProperties}"
        }

        class Existing
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val paymentMethodId: JsonField<String>,
            private val type: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("payment_method_id")
                @ExcludeMissing
                paymentMethodId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            ) : this(paymentMethodId, type, mutableMapOf())

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentMethodId(): String = paymentMethodId.getRequired("payment_method_id")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("existing")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * Returns the raw JSON value of [paymentMethodId].
             *
             * Unlike [paymentMethodId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("payment_method_id")
            @ExcludeMissing
            fun _paymentMethodId(): JsonField<String> = paymentMethodId

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
                 * Returns a mutable builder for constructing an instance of [Existing].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .paymentMethodId()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Existing]. */
            class Builder internal constructor() {

                private var paymentMethodId: JsonField<String>? = null
                private var type: JsonValue = JsonValue.from("existing")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(existing: Existing) = apply {
                    paymentMethodId = existing.paymentMethodId
                    type = existing.type
                    additionalProperties = existing.additionalProperties.toMutableMap()
                }

                fun paymentMethodId(paymentMethodId: String) =
                    paymentMethodId(JsonField.of(paymentMethodId))

                /**
                 * Sets [Builder.paymentMethodId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentMethodId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun paymentMethodId(paymentMethodId: JsonField<String>) = apply {
                    this.paymentMethodId = paymentMethodId
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("existing")
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
                 * Returns an immutable instance of [Existing].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .paymentMethodId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Existing =
                    Existing(
                        checkRequired("paymentMethodId", paymentMethodId),
                        type,
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
            fun validate(): Existing = apply {
                if (validated) {
                    return@apply
                }

                paymentMethodId()
                _type().let {
                    if (it != JsonValue.from("existing")) {
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
                (if (paymentMethodId.asKnown() == null) 0 else 1) +
                    type.let { if (it == JsonValue.from("existing")) 1 else 0 }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Existing &&
                    paymentMethodId == other.paymentMethodId &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(paymentMethodId, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Existing{paymentMethodId=$paymentMethodId, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionUpdatePaymentMethodParams &&
            subscriptionId == other.subscriptionId &&
            paymentMethod == other.paymentMethod &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(subscriptionId, paymentMethod, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SubscriptionUpdatePaymentMethodParams{subscriptionId=$subscriptionId, paymentMethod=$paymentMethod, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
