// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.blocklist.customers

import com.dodopayments.api.core.BaseDeserializer
import com.dodopayments.api.core.BaseSerializer
import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.allMaxBy
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.getOrThrow
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
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

@JsonDeserialize(using = CreateBlockedCustomerRequest.Deserializer::class)
@JsonSerialize(using = CreateBlockedCustomerRequest.Serializer::class)
class CreateBlockedCustomerRequest
private constructor(
    private val blocklistCustomersBlockByCustomerId: BlocklistCustomersBlockByCustomerId? = null,
    private val blocklistCustomersBlockByEmail: BlocklistCustomersBlockByEmail? = null,
    private val _json: JsonValue? = null,
) {

    fun blocklistCustomersBlockByCustomerId(): BlocklistCustomersBlockByCustomerId? =
        blocklistCustomersBlockByCustomerId

    fun blocklistCustomersBlockByEmail(): BlocklistCustomersBlockByEmail? =
        blocklistCustomersBlockByEmail

    fun isBlocklistCustomersBlockByCustomerId(): Boolean =
        blocklistCustomersBlockByCustomerId != null

    fun isBlocklistCustomersBlockByEmail(): Boolean = blocklistCustomersBlockByEmail != null

    fun asBlocklistCustomersBlockByCustomerId(): BlocklistCustomersBlockByCustomerId =
        blocklistCustomersBlockByCustomerId.getOrThrow("blocklistCustomersBlockByCustomerId")

    fun asBlocklistCustomersBlockByEmail(): BlocklistCustomersBlockByEmail =
        blocklistCustomersBlockByEmail.getOrThrow("blocklistCustomersBlockByEmail")

    fun _json(): JsonValue? = _json

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```kotlin
     * import com.dodopayments.api.core.JsonValue
     *
     * val result: String? = createBlockedCustomerRequest.accept(object : CreateBlockedCustomerRequest.Visitor<String?> {
     *     override fun visitBlocklistCustomersBlockByCustomerId(blocklistCustomersBlockByCustomerId: BlocklistCustomersBlockByCustomerId): String? = blocklistCustomersBlockByCustomerId.toString()
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
     * @throws DodoPaymentsInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
     *   and the current variant is unknown.
     */
    fun <T> accept(visitor: Visitor<T>): T =
        when {
            blocklistCustomersBlockByCustomerId != null ->
                visitor.visitBlocklistCustomersBlockByCustomerId(
                    blocklistCustomersBlockByCustomerId
                )
            blocklistCustomersBlockByEmail != null ->
                visitor.visitBlocklistCustomersBlockByEmail(blocklistCustomersBlockByEmail)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): CreateBlockedCustomerRequest = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitBlocklistCustomersBlockByCustomerId(
                    blocklistCustomersBlockByCustomerId: BlocklistCustomersBlockByCustomerId
                ) {
                    blocklistCustomersBlockByCustomerId.validate()
                }

                override fun visitBlocklistCustomersBlockByEmail(
                    blocklistCustomersBlockByEmail: BlocklistCustomersBlockByEmail
                ) {
                    blocklistCustomersBlockByEmail.validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitBlocklistCustomersBlockByCustomerId(
                    blocklistCustomersBlockByCustomerId: BlocklistCustomersBlockByCustomerId
                ) = blocklistCustomersBlockByCustomerId.validity()

                override fun visitBlocklistCustomersBlockByEmail(
                    blocklistCustomersBlockByEmail: BlocklistCustomersBlockByEmail
                ) = blocklistCustomersBlockByEmail.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreateBlockedCustomerRequest &&
            blocklistCustomersBlockByCustomerId == other.blocklistCustomersBlockByCustomerId &&
            blocklistCustomersBlockByEmail == other.blocklistCustomersBlockByEmail
    }

    override fun hashCode(): Int =
        Objects.hash(blocklistCustomersBlockByCustomerId, blocklistCustomersBlockByEmail)

    override fun toString(): String =
        when {
            blocklistCustomersBlockByCustomerId != null ->
                "CreateBlockedCustomerRequest{blocklistCustomersBlockByCustomerId=$blocklistCustomersBlockByCustomerId}"
            blocklistCustomersBlockByEmail != null ->
                "CreateBlockedCustomerRequest{blocklistCustomersBlockByEmail=$blocklistCustomersBlockByEmail}"
            _json != null -> "CreateBlockedCustomerRequest{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid CreateBlockedCustomerRequest")
        }

    companion object {

        fun ofBlocklistCustomersBlockByCustomerId(
            blocklistCustomersBlockByCustomerId: BlocklistCustomersBlockByCustomerId
        ) =
            CreateBlockedCustomerRequest(
                blocklistCustomersBlockByCustomerId = blocklistCustomersBlockByCustomerId
            )

        fun ofBlocklistCustomersBlockByEmail(
            blocklistCustomersBlockByEmail: BlocklistCustomersBlockByEmail
        ) =
            CreateBlockedCustomerRequest(
                blocklistCustomersBlockByEmail = blocklistCustomersBlockByEmail
            )
    }

    /**
     * An interface that defines how to map each variant of [CreateBlockedCustomerRequest] to a
     * value of type [T].
     */
    interface Visitor<out T> {

        fun visitBlocklistCustomersBlockByCustomerId(
            blocklistCustomersBlockByCustomerId: BlocklistCustomersBlockByCustomerId
        ): T

        fun visitBlocklistCustomersBlockByEmail(
            blocklistCustomersBlockByEmail: BlocklistCustomersBlockByEmail
        ): T

        /**
         * Maps an unknown variant of [CreateBlockedCustomerRequest] to a value of type [T].
         *
         * An instance of [CreateBlockedCustomerRequest] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws DodoPaymentsInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw DodoPaymentsInvalidDataException("Unknown CreateBlockedCustomerRequest: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<CreateBlockedCustomerRequest>(CreateBlockedCustomerRequest::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): CreateBlockedCustomerRequest {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<BlocklistCustomersBlockByCustomerId>())
                            ?.let {
                                CreateBlockedCustomerRequest(
                                    blocklistCustomersBlockByCustomerId = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(node, jacksonTypeRef<BlocklistCustomersBlockByEmail>())
                            ?.let {
                                CreateBlockedCustomerRequest(
                                    blocklistCustomersBlockByEmail = it,
                                    _json = json,
                                )
                            },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> CreateBlockedCustomerRequest(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<CreateBlockedCustomerRequest>(CreateBlockedCustomerRequest::class) {

        override fun serialize(
            value: CreateBlockedCustomerRequest,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.blocklistCustomersBlockByCustomerId != null ->
                    generator.writeObject(value.blocklistCustomersBlockByCustomerId)
                value.blocklistCustomersBlockByEmail != null ->
                    generator.writeObject(value.blocklistCustomersBlockByEmail)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid CreateBlockedCustomerRequest")
            }
        }
    }

    class BlocklistCustomersBlockByCustomerId
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val customerId: JsonField<String>,
        private val reason: JsonField<String>,
        private val source: JsonField<BlockedCustomerSource>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("customer_id")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
            @JsonProperty("source")
            @ExcludeMissing
            source: JsonField<BlockedCustomerSource> = JsonMissing.of(),
        ) : this(customerId, reason, source, mutableMapOf())

        fun toBlockByCustomerId(): BlockByCustomerId =
            BlockByCustomerId.builder().customerId(customerId).build()

        /**
         * Customer to block. The block still applies to that customer's email.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * Why the merchant blocked this customer. The entry page shows it.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun reason(): String? = reason.getNullable("reason")

        /**
         * Screen the merchant blocked from. Ignored for an API-key caller, whose entry always
         * records `api`. A dashboard caller that omits it records `blocklist_page`.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun source(): BlockedCustomerSource? = source.getNullable("source")

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

        /**
         * Returns the raw JSON value of [source].
         *
         * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source")
        @ExcludeMissing
        fun _source(): JsonField<BlockedCustomerSource> = source

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
             * Returns a mutable builder for constructing an instance of
             * [BlocklistCustomersBlockByCustomerId].
             *
             * The following fields are required:
             * ```kotlin
             * .customerId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [BlocklistCustomersBlockByCustomerId]. */
        class Builder internal constructor() {

            private var customerId: JsonField<String>? = null
            private var reason: JsonField<String> = JsonMissing.of()
            private var source: JsonField<BlockedCustomerSource> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                blocklistCustomersBlockByCustomerId: BlocklistCustomersBlockByCustomerId
            ) = apply {
                customerId = blocklistCustomersBlockByCustomerId.customerId
                reason = blocklistCustomersBlockByCustomerId.reason
                source = blocklistCustomersBlockByCustomerId.source
                additionalProperties =
                    blocklistCustomersBlockByCustomerId.additionalProperties.toMutableMap()
            }

            /** Customer to block. The block still applies to that customer's email. */
            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /** Why the merchant blocked this customer. The entry page shows it. */
            fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

            /**
             * Screen the merchant blocked from. Ignored for an API-key caller, whose entry always
             * records `api`. A dashboard caller that omits it records `blocklist_page`.
             */
            fun source(source: BlockedCustomerSource?) = source(JsonField.ofNullable(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [BlockedCustomerSource]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun source(source: JsonField<BlockedCustomerSource>) = apply { this.source = source }

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
             * Returns an immutable instance of [BlocklistCustomersBlockByCustomerId].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .customerId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): BlocklistCustomersBlockByCustomerId =
                BlocklistCustomersBlockByCustomerId(
                    checkRequired("customerId", customerId),
                    reason,
                    source,
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
        fun validate(): BlocklistCustomersBlockByCustomerId = apply {
            if (validated) {
                return@apply
            }

            customerId()
            reason()
            source()?.validate()
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
            (if (customerId.asKnown() == null) 0 else 1) +
                (if (reason.asKnown() == null) 0 else 1) +
                (source.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BlocklistCustomersBlockByCustomerId &&
                customerId == other.customerId &&
                reason == other.reason &&
                source == other.source &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(customerId, reason, source, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BlocklistCustomersBlockByCustomerId{customerId=$customerId, reason=$reason, source=$source, additionalProperties=$additionalProperties}"
    }

    class BlocklistCustomersBlockByEmail
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val email: JsonField<String>,
        private val reason: JsonField<String>,
        private val source: JsonField<BlockedCustomerSource>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
            @JsonProperty("source")
            @ExcludeMissing
            source: JsonField<BlockedCustomerSource> = JsonMissing.of(),
        ) : this(email, reason, source, mutableMapOf())

        fun toBlockByEmail(): BlockByEmail = BlockByEmail.builder().email(email).build()

        /**
         * Email to block. It must belong to an existing customer of this business.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun email(): String = email.getRequired("email")

        /**
         * Why the merchant blocked this customer. The entry page shows it.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun reason(): String? = reason.getNullable("reason")

        /**
         * Screen the merchant blocked from. Ignored for an API-key caller, whose entry always
         * records `api`. A dashboard caller that omits it records `blocklist_page`.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun source(): BlockedCustomerSource? = source.getNullable("source")

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

        /**
         * Returns the raw JSON value of [source].
         *
         * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source")
        @ExcludeMissing
        fun _source(): JsonField<BlockedCustomerSource> = source

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
             * Returns a mutable builder for constructing an instance of
             * [BlocklistCustomersBlockByEmail].
             *
             * The following fields are required:
             * ```kotlin
             * .email()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [BlocklistCustomersBlockByEmail]. */
        class Builder internal constructor() {

            private var email: JsonField<String>? = null
            private var reason: JsonField<String> = JsonMissing.of()
            private var source: JsonField<BlockedCustomerSource> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(blocklistCustomersBlockByEmail: BlocklistCustomersBlockByEmail) =
                apply {
                    email = blocklistCustomersBlockByEmail.email
                    reason = blocklistCustomersBlockByEmail.reason
                    source = blocklistCustomersBlockByEmail.source
                    additionalProperties =
                        blocklistCustomersBlockByEmail.additionalProperties.toMutableMap()
                }

            /** Email to block. It must belong to an existing customer of this business. */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** Why the merchant blocked this customer. The entry page shows it. */
            fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

            /**
             * Screen the merchant blocked from. Ignored for an API-key caller, whose entry always
             * records `api`. A dashboard caller that omits it records `blocklist_page`.
             */
            fun source(source: BlockedCustomerSource?) = source(JsonField.ofNullable(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [BlockedCustomerSource]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun source(source: JsonField<BlockedCustomerSource>) = apply { this.source = source }

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
             * Returns an immutable instance of [BlocklistCustomersBlockByEmail].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .email()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): BlocklistCustomersBlockByEmail =
                BlocklistCustomersBlockByEmail(
                    checkRequired("email", email),
                    reason,
                    source,
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
        fun validate(): BlocklistCustomersBlockByEmail = apply {
            if (validated) {
                return@apply
            }

            email()
            reason()
            source()?.validate()
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
            (if (email.asKnown() == null) 0 else 1) +
                (if (reason.asKnown() == null) 0 else 1) +
                (source.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BlocklistCustomersBlockByEmail &&
                email == other.email &&
                reason == other.reason &&
                source == other.source &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(email, reason, source, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BlocklistCustomersBlockByEmail{email=$email, reason=$reason, source=$source, additionalProperties=$additionalProperties}"
    }
}
