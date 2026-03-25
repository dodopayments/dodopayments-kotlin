// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.productcollections.groups

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
import java.util.Collections
import java.util.Objects

class GroupUpdateParams
private constructor(
    private val id: String,
    private val groupId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String = id

    fun groupId(): String? = groupId

    /**
     * Optional group name update: Some(Some(name)) = set name, Some(None) = clear name, None = no
     * change
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun groupName(): String? = body.groupName()

    /**
     * Optional new order for products in this group (array of product_collection_group_pdts UUIDs)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun productOrder(): List<String>? = body.productOrder()

    /**
     * Optional status update
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): Boolean? = body.status()

    /**
     * Returns the raw JSON value of [groupName].
     *
     * Unlike [groupName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _groupName(): JsonField<String> = body._groupName()

    /**
     * Returns the raw JSON value of [productOrder].
     *
     * Unlike [productOrder], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _productOrder(): JsonField<List<String>> = body._productOrder()

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _status(): JsonField<Boolean> = body._status()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [GroupUpdateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [GroupUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var groupId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(groupUpdateParams: GroupUpdateParams) = apply {
            id = groupUpdateParams.id
            groupId = groupUpdateParams.groupId
            body = groupUpdateParams.body.toBuilder()
            additionalHeaders = groupUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = groupUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String) = apply { this.id = id }

        fun groupId(groupId: String?) = apply { this.groupId = groupId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [groupName]
         * - [productOrder]
         * - [status]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Optional group name update: Some(Some(name)) = set name, Some(None) = clear name, None =
         * no change
         */
        fun groupName(groupName: String?) = apply { body.groupName(groupName) }

        /**
         * Sets [Builder.groupName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun groupName(groupName: JsonField<String>) = apply { body.groupName(groupName) }

        /**
         * Optional new order for products in this group (array of product_collection_group_pdts
         * UUIDs)
         */
        fun productOrder(productOrder: List<String>?) = apply { body.productOrder(productOrder) }

        /**
         * Sets [Builder.productOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productOrder] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun productOrder(productOrder: JsonField<List<String>>) = apply {
            body.productOrder(productOrder)
        }

        /**
         * Adds a single [String] to [Builder.productOrder].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProductOrder(productOrder: String) = apply { body.addProductOrder(productOrder) }

        /** Optional status update */
        fun status(status: Boolean?) = apply { body.status(status) }

        /**
         * Alias for [Builder.status].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun status(status: Boolean) = status(status as Boolean?)

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Boolean>) = apply { body.status(status) }

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
         * Returns an immutable instance of [GroupUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): GroupUpdateParams =
            GroupUpdateParams(
                checkRequired("id", id),
                groupId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id
            1 -> groupId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val groupName: JsonField<String>,
        private val productOrder: JsonField<List<String>>,
        private val status: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("group_name")
            @ExcludeMissing
            groupName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("product_order")
            @ExcludeMissing
            productOrder: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Boolean> = JsonMissing.of(),
        ) : this(groupName, productOrder, status, mutableMapOf())

        /**
         * Optional group name update: Some(Some(name)) = set name, Some(None) = clear name, None =
         * no change
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun groupName(): String? = groupName.getNullable("group_name")

        /**
         * Optional new order for products in this group (array of product_collection_group_pdts
         * UUIDs)
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun productOrder(): List<String>? = productOrder.getNullable("product_order")

        /**
         * Optional status update
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun status(): Boolean? = status.getNullable("status")

        /**
         * Returns the raw JSON value of [groupName].
         *
         * Unlike [groupName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("group_name") @ExcludeMissing fun _groupName(): JsonField<String> = groupName

        /**
         * Returns the raw JSON value of [productOrder].
         *
         * Unlike [productOrder], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("product_order")
        @ExcludeMissing
        fun _productOrder(): JsonField<List<String>> = productOrder

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Boolean> = status

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

            private var groupName: JsonField<String> = JsonMissing.of()
            private var productOrder: JsonField<MutableList<String>>? = null
            private var status: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                groupName = body.groupName
                productOrder = body.productOrder.map { it.toMutableList() }
                status = body.status
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Optional group name update: Some(Some(name)) = set name, Some(None) = clear name,
             * None = no change
             */
            fun groupName(groupName: String?) = groupName(JsonField.ofNullable(groupName))

            /**
             * Sets [Builder.groupName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groupName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groupName(groupName: JsonField<String>) = apply { this.groupName = groupName }

            /**
             * Optional new order for products in this group (array of product_collection_group_pdts
             * UUIDs)
             */
            fun productOrder(productOrder: List<String>?) =
                productOrder(JsonField.ofNullable(productOrder))

            /**
             * Sets [Builder.productOrder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productOrder] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productOrder(productOrder: JsonField<List<String>>) = apply {
                this.productOrder = productOrder.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.productOrder].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addProductOrder(productOrder: String) = apply {
                this.productOrder =
                    (this.productOrder ?: JsonField.of(mutableListOf())).also {
                        checkKnown("productOrder", it).add(productOrder)
                    }
            }

            /** Optional status update */
            fun status(status: Boolean?) = status(JsonField.ofNullable(status))

            /**
             * Alias for [Builder.status].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun status(status: Boolean) = status(status as Boolean?)

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Boolean>) = apply { this.status = status }

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
                    groupName,
                    (productOrder ?: JsonMissing.of()).map { it.toImmutable() },
                    status,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            groupName()
            productOrder()
            status()
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
            (if (groupName.asKnown() == null) 0 else 1) +
                (productOrder.asKnown()?.size ?: 0) +
                (if (status.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                groupName == other.groupName &&
                productOrder == other.productOrder &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(groupName, productOrder, status, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{groupName=$groupName, productOrder=$productOrder, status=$status, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GroupUpdateParams &&
            id == other.id &&
            groupId == other.groupId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(id, groupId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "GroupUpdateParams{id=$id, groupId=$groupId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
