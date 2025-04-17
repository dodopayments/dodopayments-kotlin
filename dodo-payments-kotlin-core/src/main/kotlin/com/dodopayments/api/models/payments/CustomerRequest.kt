// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.BaseDeserializer
import com.dodopayments.api.core.BaseSerializer
import com.dodopayments.api.core.JsonValue
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
    private val createNewCustomer: CreateNewCustomer? = null,
    private val _json: JsonValue? = null,
) {

    fun attachExistingCustomer(): AttachExistingCustomer? = attachExistingCustomer

    fun createNewCustomer(): CreateNewCustomer? = createNewCustomer

    fun isAttachExistingCustomer(): Boolean = attachExistingCustomer != null

    fun isCreateNewCustomer(): Boolean = createNewCustomer != null

    fun asAttachExistingCustomer(): AttachExistingCustomer =
        attachExistingCustomer.getOrThrow("attachExistingCustomer")

    fun asCreateNewCustomer(): CreateNewCustomer = createNewCustomer.getOrThrow("createNewCustomer")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            attachExistingCustomer != null ->
                visitor.visitAttachExistingCustomer(attachExistingCustomer)
            createNewCustomer != null -> visitor.visitCreateNewCustomer(createNewCustomer)
            else -> visitor.unknown(_json)
        }
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

                override fun visitCreateNewCustomer(createNewCustomer: CreateNewCustomer) {
                    createNewCustomer.validate()
                }
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerRequest && attachExistingCustomer == other.attachExistingCustomer && createNewCustomer == other.createNewCustomer /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(attachExistingCustomer, createNewCustomer) /* spotless:on */

    override fun toString(): String =
        when {
            attachExistingCustomer != null ->
                "CustomerRequest{attachExistingCustomer=$attachExistingCustomer}"
            createNewCustomer != null -> "CustomerRequest{createNewCustomer=$createNewCustomer}"
            _json != null -> "CustomerRequest{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid CustomerRequest")
        }

    companion object {

        fun ofAttachExistingCustomer(attachExistingCustomer: AttachExistingCustomer) =
            CustomerRequest(attachExistingCustomer = attachExistingCustomer)

        fun ofCreateNewCustomer(createNewCustomer: CreateNewCustomer) =
            CustomerRequest(createNewCustomer = createNewCustomer)
    }

    /**
     * An interface that defines how to map each variant of [CustomerRequest] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        fun visitAttachExistingCustomer(attachExistingCustomer: AttachExistingCustomer): T

        fun visitCreateNewCustomer(createNewCustomer: CreateNewCustomer): T

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

            tryDeserialize(node, jacksonTypeRef<AttachExistingCustomer>()) { it.validate() }
                ?.let {
                    return CustomerRequest(attachExistingCustomer = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<CreateNewCustomer>()) { it.validate() }
                ?.let {
                    return CustomerRequest(createNewCustomer = it, _json = json)
                }

            return CustomerRequest(_json = json)
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
                value.createNewCustomer != null -> generator.writeObject(value.createNewCustomer)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid CustomerRequest")
            }
        }
    }
}
