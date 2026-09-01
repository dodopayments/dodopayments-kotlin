// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.blocklist.customers

import com.dodopayments.api.core.BaseDeserializer
import com.dodopayments.api.core.BaseSerializer
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.allMaxBy
import com.dodopayments.api.core.getOrThrow
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Objects

/**
 * Which customer to block. Untagged, so the caller sends `customer_id` or `email` at the top level,
 * as `CustomerRequest` does on the payment routes. A body that carries both matches the first
 * variant, so `customer_id` wins.
 */
@JsonDeserialize(using = BlockIdentifier.Deserializer::class)
@JsonSerialize(using = BlockIdentifier.Serializer::class)
class BlockIdentifier
private constructor(
    private val byCustomerId: BlockByCustomerId? = null,
    private val byEmail: BlockByEmail? = null,
    private val _json: JsonValue? = null,
) {

    fun byCustomerId(): BlockByCustomerId? = byCustomerId

    fun byEmail(): BlockByEmail? = byEmail

    fun isByCustomerId(): Boolean = byCustomerId != null

    fun isByEmail(): Boolean = byEmail != null

    fun asByCustomerId(): BlockByCustomerId = byCustomerId.getOrThrow("byCustomerId")

    fun asByEmail(): BlockByEmail = byEmail.getOrThrow("byEmail")

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
     * val result: String? = blockIdentifier.accept(object : BlockIdentifier.Visitor<String?> {
     *     override fun visitByCustomerId(byCustomerId: BlockByCustomerId): String? = byCustomerId.toString()
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
            byCustomerId != null -> visitor.visitByCustomerId(byCustomerId)
            byEmail != null -> visitor.visitByEmail(byEmail)
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
    fun validate(): BlockIdentifier = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitByCustomerId(byCustomerId: BlockByCustomerId) {
                    byCustomerId.validate()
                }

                override fun visitByEmail(byEmail: BlockByEmail) {
                    byEmail.validate()
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
                override fun visitByCustomerId(byCustomerId: BlockByCustomerId) =
                    byCustomerId.validity()

                override fun visitByEmail(byEmail: BlockByEmail) = byEmail.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BlockIdentifier &&
            byCustomerId == other.byCustomerId &&
            byEmail == other.byEmail
    }

    override fun hashCode(): Int = Objects.hash(byCustomerId, byEmail)

    override fun toString(): String =
        when {
            byCustomerId != null -> "BlockIdentifier{byCustomerId=$byCustomerId}"
            byEmail != null -> "BlockIdentifier{byEmail=$byEmail}"
            _json != null -> "BlockIdentifier{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid BlockIdentifier")
        }

    companion object {

        fun ofByCustomerId(byCustomerId: BlockByCustomerId) =
            BlockIdentifier(byCustomerId = byCustomerId)

        fun ofByEmail(byEmail: BlockByEmail) = BlockIdentifier(byEmail = byEmail)
    }

    /**
     * An interface that defines how to map each variant of [BlockIdentifier] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        fun visitByCustomerId(byCustomerId: BlockByCustomerId): T

        fun visitByEmail(byEmail: BlockByEmail): T

        /**
         * Maps an unknown variant of [BlockIdentifier] to a value of type [T].
         *
         * An instance of [BlockIdentifier] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws DodoPaymentsInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw DodoPaymentsInvalidDataException("Unknown BlockIdentifier: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<BlockIdentifier>(BlockIdentifier::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): BlockIdentifier {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<BlockByCustomerId>())?.let {
                            BlockIdentifier(byCustomerId = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<BlockByEmail>())?.let {
                            BlockIdentifier(byEmail = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> BlockIdentifier(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<BlockIdentifier>(BlockIdentifier::class) {

        override fun serialize(
            value: BlockIdentifier,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.byCustomerId != null -> generator.writeObject(value.byCustomerId)
                value.byEmail != null -> generator.writeObject(value.byEmail)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid BlockIdentifier")
            }
        }
    }
}
