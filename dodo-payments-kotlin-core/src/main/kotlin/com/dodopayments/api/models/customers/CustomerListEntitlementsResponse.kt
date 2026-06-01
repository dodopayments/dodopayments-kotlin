// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.entitlements.EntitlementIntegrationType
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class CustomerListEntitlementsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val items: JsonField<List<Item>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("items") @ExcludeMissing items: JsonField<List<Item>> = JsonMissing.of()
    ) : this(items, mutableMapOf())

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun items(): List<Item> = items.getRequired("items")

    /**
     * Returns the raw JSON value of [items].
     *
     * Unlike [items], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<List<Item>> = items

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
         * [CustomerListEntitlementsResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .items()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CustomerListEntitlementsResponse]. */
    class Builder internal constructor() {

        private var items: JsonField<MutableList<Item>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(customerListEntitlementsResponse: CustomerListEntitlementsResponse) =
            apply {
                items = customerListEntitlementsResponse.items.map { it.toMutableList() }
                additionalProperties =
                    customerListEntitlementsResponse.additionalProperties.toMutableMap()
            }

        fun items(items: List<Item>) = items(JsonField.of(items))

        /**
         * Sets [Builder.items] to an arbitrary JSON value.
         *
         * You should usually call [Builder.items] with a well-typed `List<Item>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun items(items: JsonField<List<Item>>) = apply {
            this.items = items.map { it.toMutableList() }
        }

        /**
         * Adds a single [Item] to [items].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addItem(item: Item) = apply {
            items =
                (items ?: JsonField.of(mutableListOf())).also { checkKnown("items", it).add(item) }
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
         * Returns an immutable instance of [CustomerListEntitlementsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomerListEntitlementsResponse =
            CustomerListEntitlementsResponse(
                checkRequired("items", items).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
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
    fun validate(): CustomerListEntitlementsResponse = apply {
        if (validated) {
            return@apply
        }

        items().forEach { it.validate() }
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
    internal fun validity(): Int = (items.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    class Item
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val createdAt: JsonField<OffsetDateTime>,
        private val entitlementId: JsonField<String>,
        private val entitlementName: JsonField<String>,
        private val grantId: JsonField<String>,
        private val integrationType: JsonField<EntitlementIntegrationType>,
        private val status: JsonField<Status>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val deliveredAt: JsonField<OffsetDateTime>,
        private val entitlementDescription: JsonField<String>,
        private val revokedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("entitlement_id")
            @ExcludeMissing
            entitlementId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("entitlement_name")
            @ExcludeMissing
            entitlementName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("grant_id") @ExcludeMissing grantId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("integration_type")
            @ExcludeMissing
            integrationType: JsonField<EntitlementIntegrationType> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("delivered_at")
            @ExcludeMissing
            deliveredAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("entitlement_description")
            @ExcludeMissing
            entitlementDescription: JsonField<String> = JsonMissing.of(),
            @JsonProperty("revoked_at")
            @ExcludeMissing
            revokedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            createdAt,
            entitlementId,
            entitlementName,
            grantId,
            integrationType,
            status,
            updatedAt,
            deliveredAt,
            entitlementDescription,
            revokedAt,
            mutableMapOf(),
        )

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * The entitlement this grant belongs to.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun entitlementId(): String = entitlementId.getRequired("entitlement_id")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun entitlementName(): String = entitlementName.getRequired("entitlement_name")

        /**
         * Grant id (the per-customer row in `entitlement_grants`).
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun grantId(): String = grantId.getRequired("grant_id")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun integrationType(): EntitlementIntegrationType =
            integrationType.getRequired("integration_type")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun deliveredAt(): OffsetDateTime? = deliveredAt.getNullable("delivered_at")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun entitlementDescription(): String? =
            entitlementDescription.getNullable("entitlement_description")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun revokedAt(): OffsetDateTime? = revokedAt.getNullable("revoked_at")

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [entitlementId].
         *
         * Unlike [entitlementId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("entitlement_id")
        @ExcludeMissing
        fun _entitlementId(): JsonField<String> = entitlementId

        /**
         * Returns the raw JSON value of [entitlementName].
         *
         * Unlike [entitlementName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("entitlement_name")
        @ExcludeMissing
        fun _entitlementName(): JsonField<String> = entitlementName

        /**
         * Returns the raw JSON value of [grantId].
         *
         * Unlike [grantId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("grant_id") @ExcludeMissing fun _grantId(): JsonField<String> = grantId

        /**
         * Returns the raw JSON value of [integrationType].
         *
         * Unlike [integrationType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("integration_type")
        @ExcludeMissing
        fun _integrationType(): JsonField<EntitlementIntegrationType> = integrationType

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        /**
         * Returns the raw JSON value of [deliveredAt].
         *
         * Unlike [deliveredAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("delivered_at")
        @ExcludeMissing
        fun _deliveredAt(): JsonField<OffsetDateTime> = deliveredAt

        /**
         * Returns the raw JSON value of [entitlementDescription].
         *
         * Unlike [entitlementDescription], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("entitlement_description")
        @ExcludeMissing
        fun _entitlementDescription(): JsonField<String> = entitlementDescription

        /**
         * Returns the raw JSON value of [revokedAt].
         *
         * Unlike [revokedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("revoked_at")
        @ExcludeMissing
        fun _revokedAt(): JsonField<OffsetDateTime> = revokedAt

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
             * Returns a mutable builder for constructing an instance of [Item].
             *
             * The following fields are required:
             * ```kotlin
             * .createdAt()
             * .entitlementId()
             * .entitlementName()
             * .grantId()
             * .integrationType()
             * .status()
             * .updatedAt()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Item]. */
        class Builder internal constructor() {

            private var createdAt: JsonField<OffsetDateTime>? = null
            private var entitlementId: JsonField<String>? = null
            private var entitlementName: JsonField<String>? = null
            private var grantId: JsonField<String>? = null
            private var integrationType: JsonField<EntitlementIntegrationType>? = null
            private var status: JsonField<Status>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var deliveredAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var entitlementDescription: JsonField<String> = JsonMissing.of()
            private var revokedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(item: Item) = apply {
                createdAt = item.createdAt
                entitlementId = item.entitlementId
                entitlementName = item.entitlementName
                grantId = item.grantId
                integrationType = item.integrationType
                status = item.status
                updatedAt = item.updatedAt
                deliveredAt = item.deliveredAt
                entitlementDescription = item.entitlementDescription
                revokedAt = item.revokedAt
                additionalProperties = item.additionalProperties.toMutableMap()
            }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** The entitlement this grant belongs to. */
            fun entitlementId(entitlementId: String) = entitlementId(JsonField.of(entitlementId))

            /**
             * Sets [Builder.entitlementId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entitlementId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entitlementId(entitlementId: JsonField<String>) = apply {
                this.entitlementId = entitlementId
            }

            fun entitlementName(entitlementName: String) =
                entitlementName(JsonField.of(entitlementName))

            /**
             * Sets [Builder.entitlementName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entitlementName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entitlementName(entitlementName: JsonField<String>) = apply {
                this.entitlementName = entitlementName
            }

            /** Grant id (the per-customer row in `entitlement_grants`). */
            fun grantId(grantId: String) = grantId(JsonField.of(grantId))

            /**
             * Sets [Builder.grantId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.grantId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun grantId(grantId: JsonField<String>) = apply { this.grantId = grantId }

            fun integrationType(integrationType: EntitlementIntegrationType) =
                integrationType(JsonField.of(integrationType))

            /**
             * Sets [Builder.integrationType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.integrationType] with a well-typed
             * [EntitlementIntegrationType] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun integrationType(integrationType: JsonField<EntitlementIntegrationType>) = apply {
                this.integrationType = integrationType
            }

            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            fun deliveredAt(deliveredAt: OffsetDateTime?) =
                deliveredAt(JsonField.ofNullable(deliveredAt))

            /**
             * Sets [Builder.deliveredAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deliveredAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun deliveredAt(deliveredAt: JsonField<OffsetDateTime>) = apply {
                this.deliveredAt = deliveredAt
            }

            fun entitlementDescription(entitlementDescription: String?) =
                entitlementDescription(JsonField.ofNullable(entitlementDescription))

            /**
             * Sets [Builder.entitlementDescription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entitlementDescription] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun entitlementDescription(entitlementDescription: JsonField<String>) = apply {
                this.entitlementDescription = entitlementDescription
            }

            fun revokedAt(revokedAt: OffsetDateTime?) = revokedAt(JsonField.ofNullable(revokedAt))

            /**
             * Sets [Builder.revokedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.revokedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun revokedAt(revokedAt: JsonField<OffsetDateTime>) = apply {
                this.revokedAt = revokedAt
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
             * Returns an immutable instance of [Item].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .createdAt()
             * .entitlementId()
             * .entitlementName()
             * .grantId()
             * .integrationType()
             * .status()
             * .updatedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Item =
                Item(
                    checkRequired("createdAt", createdAt),
                    checkRequired("entitlementId", entitlementId),
                    checkRequired("entitlementName", entitlementName),
                    checkRequired("grantId", grantId),
                    checkRequired("integrationType", integrationType),
                    checkRequired("status", status),
                    checkRequired("updatedAt", updatedAt),
                    deliveredAt,
                    entitlementDescription,
                    revokedAt,
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
        fun validate(): Item = apply {
            if (validated) {
                return@apply
            }

            createdAt()
            entitlementId()
            entitlementName()
            grantId()
            integrationType().validate()
            status().validate()
            updatedAt()
            deliveredAt()
            entitlementDescription()
            revokedAt()
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
            (if (createdAt.asKnown() == null) 0 else 1) +
                (if (entitlementId.asKnown() == null) 0 else 1) +
                (if (entitlementName.asKnown() == null) 0 else 1) +
                (if (grantId.asKnown() == null) 0 else 1) +
                (integrationType.asKnown()?.validity() ?: 0) +
                (status.asKnown()?.validity() ?: 0) +
                (if (updatedAt.asKnown() == null) 0 else 1) +
                (if (deliveredAt.asKnown() == null) 0 else 1) +
                (if (entitlementDescription.asKnown() == null) 0 else 1) +
                (if (revokedAt.asKnown() == null) 0 else 1)

        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val PENDING = of("pending")

                val DELIVERED = of("delivered")

                val FAILED = of("failed")

                val REVOKED = of("revoked")

                fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                PENDING,
                DELIVERED,
                FAILED,
                REVOKED,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PENDING,
                DELIVERED,
                FAILED,
                REVOKED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    PENDING -> Value.PENDING
                    DELIVERED -> Value.DELIVERED
                    FAILED -> Value.FAILED
                    REVOKED -> Value.REVOKED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws DodoPaymentsInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    PENDING -> Known.PENDING
                    DELIVERED -> Known.DELIVERED
                    FAILED -> Known.FAILED
                    REVOKED -> Known.REVOKED
                    else -> throw DodoPaymentsInvalidDataException("Unknown Status: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws DodoPaymentsInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw DodoPaymentsInvalidDataException("Value is not a String")

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
            fun validate(): Status = apply {
                if (validated) {
                    return@apply
                }

                known()
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
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Status && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Item &&
                createdAt == other.createdAt &&
                entitlementId == other.entitlementId &&
                entitlementName == other.entitlementName &&
                grantId == other.grantId &&
                integrationType == other.integrationType &&
                status == other.status &&
                updatedAt == other.updatedAt &&
                deliveredAt == other.deliveredAt &&
                entitlementDescription == other.entitlementDescription &&
                revokedAt == other.revokedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                createdAt,
                entitlementId,
                entitlementName,
                grantId,
                integrationType,
                status,
                updatedAt,
                deliveredAt,
                entitlementDescription,
                revokedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Item{createdAt=$createdAt, entitlementId=$entitlementId, entitlementName=$entitlementName, grantId=$grantId, integrationType=$integrationType, status=$status, updatedAt=$updatedAt, deliveredAt=$deliveredAt, entitlementDescription=$entitlementDescription, revokedAt=$revokedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerListEntitlementsResponse &&
            items == other.items &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(items, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerListEntitlementsResponse{items=$items, additionalProperties=$additionalProperties}"
}
