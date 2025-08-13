// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

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

@JsonDeserialize(using = CustomerRequest.Deserializer::class)
@JsonSerialize(using = CustomerRequest.Serializer::class)
class CustomerRequest
private constructor(
    private val attachExistingCustomer: AttachExistingCustomer? = null,
    private val newCustomer: NewCustomer? = null,
    private val _json: JsonValue? = null,
) {

    fun attachExistingCustomer(): AttachExistingCustomer? = attachExistingCustomer

    fun newCustomer(): NewCustomer? = newCustomer

    fun isAttachExistingCustomer(): Boolean = attachExistingCustomer != null

    fun isNewCustomer(): Boolean = newCustomer != null

    fun asAttachExistingCustomer(): AttachExistingCustomer =
        attachExistingCustomer.getOrThrow("attachExistingCustomer")

    fun asNewCustomer(): NewCustomer = newCustomer.getOrThrow("newCustomer")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            attachExistingCustomer != null ->
                visitor.visitAttachExistingCustomer(attachExistingCustomer)
            newCustomer != null -> visitor.visitNewCustomer(newCustomer)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): CustomerRequest = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitAttachExistingCustomer(
                    attachExistingCustomer: AttachExistingCustomer
                ) {
                    attachExistingCustomer.validate()
                }

                override fun visitNewCustomer(newCustomer: NewCustomer) {
                    newCustomer.validate()
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
                override fun visitAttachExistingCustomer(
                    attachExistingCustomer: AttachExistingCustomer
                ) = attachExistingCustomer.validity()

                override fun visitNewCustomer(newCustomer: NewCustomer) = newCustomer.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerRequest &&
            attachExistingCustomer == other.attachExistingCustomer &&
            newCustomer == other.newCustomer
    }

    override fun hashCode(): Int = Objects.hash(attachExistingCustomer, newCustomer)

    override fun toString(): String =
        when {
            attachExistingCustomer != null ->
                "CustomerRequest{attachExistingCustomer=$attachExistingCustomer}"
            newCustomer != null -> "CustomerRequest{newCustomer=$newCustomer}"
            _json != null -> "CustomerRequest{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid CustomerRequest")
        }

    companion object {

        fun ofAttachExistingCustomer(attachExistingCustomer: AttachExistingCustomer) =
            CustomerRequest(attachExistingCustomer = attachExistingCustomer)

        fun ofNewCustomer(newCustomer: NewCustomer) = CustomerRequest(newCustomer = newCustomer)
    }

    /**
     * An interface that defines how to map each variant of [CustomerRequest] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        fun visitAttachExistingCustomer(attachExistingCustomer: AttachExistingCustomer): T

        fun visitNewCustomer(newCustomer: NewCustomer): T

        /**
         * Maps an unknown variant of [CustomerRequest] to a value of type [T].
         *
         * An instance of [CustomerRequest] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws DodoPaymentsInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw DodoPaymentsInvalidDataException("Unknown CustomerRequest: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<CustomerRequest>(CustomerRequest::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): CustomerRequest {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<AttachExistingCustomer>())?.let {
                            CustomerRequest(attachExistingCustomer = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<NewCustomer>())?.let {
                            CustomerRequest(newCustomer = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> CustomerRequest(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<CustomerRequest>(CustomerRequest::class) {

        override fun serialize(
            value: CustomerRequest,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.attachExistingCustomer != null ->
                    generator.writeObject(value.attachExistingCustomer)
                value.newCustomer != null -> generator.writeObject(value.newCustomer)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid CustomerRequest")
            }
        }
    }
}
