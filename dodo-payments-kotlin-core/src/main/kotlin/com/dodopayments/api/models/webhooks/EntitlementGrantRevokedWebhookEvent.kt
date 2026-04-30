// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.products.DigitalProductDelivery
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class EntitlementGrantRevokedWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val businessId: JsonField<String>,
    private val data: JsonField<Data>,
    private val timestamp: JsonField<OffsetDateTime>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("business_id")
        @ExcludeMissing
        businessId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
        @JsonProperty("timestamp")
        @ExcludeMissing
        timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(businessId, data, timestamp, type, mutableMapOf())

    /**
     * The business identifier
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessId(): String = businessId.getRequired("business_id")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

    /**
     * The timestamp of when the event occurred
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

    /**
     * The event type
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [businessId].
     *
     * Unlike [businessId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("business_id") @ExcludeMissing fun _businessId(): JsonField<String> = businessId

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    /**
     * Returns the raw JSON value of [timestamp].
     *
     * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timestamp")
    @ExcludeMissing
    fun _timestamp(): JsonField<OffsetDateTime> = timestamp

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
         * [EntitlementGrantRevokedWebhookEvent].
         *
         * The following fields are required:
         * ```kotlin
         * .businessId()
         * .data()
         * .timestamp()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [EntitlementGrantRevokedWebhookEvent]. */
    class Builder internal constructor() {

        private var businessId: JsonField<String>? = null
        private var data: JsonField<Data>? = null
        private var timestamp: JsonField<OffsetDateTime>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            entitlementGrantRevokedWebhookEvent: EntitlementGrantRevokedWebhookEvent
        ) = apply {
            businessId = entitlementGrantRevokedWebhookEvent.businessId
            data = entitlementGrantRevokedWebhookEvent.data
            timestamp = entitlementGrantRevokedWebhookEvent.timestamp
            type = entitlementGrantRevokedWebhookEvent.type
            additionalProperties =
                entitlementGrantRevokedWebhookEvent.additionalProperties.toMutableMap()
        }

        /** The business identifier */
        fun businessId(businessId: String) = businessId(JsonField.of(businessId))

        /**
         * Sets [Builder.businessId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun businessId(businessId: JsonField<String>) = apply { this.businessId = businessId }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        /** The timestamp of when the event occurred */
        fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

        /**
         * Sets [Builder.timestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply { this.timestamp = timestamp }

        /** The event type */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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
         * Returns an immutable instance of [EntitlementGrantRevokedWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .businessId()
         * .data()
         * .timestamp()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EntitlementGrantRevokedWebhookEvent =
            EntitlementGrantRevokedWebhookEvent(
                checkRequired("businessId", businessId),
                checkRequired("data", data),
                checkRequired("timestamp", timestamp),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EntitlementGrantRevokedWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        businessId()
        data().validate()
        timestamp()
        type().validate()
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
        (if (businessId.asKnown() == null) 0 else 1) +
            (data.asKnown()?.validity() ?: 0) +
            (if (timestamp.asKnown() == null) 0 else 1) +
            (type.asKnown()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val businessId: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val customerId: JsonField<String>,
        private val entitlementId: JsonField<String>,
        private val externalId: JsonField<String>,
        private val status: JsonField<Status>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val deliveredAt: JsonField<OffsetDateTime>,
        private val digitalProductDelivery: JsonField<DigitalProductDelivery>,
        private val errorCode: JsonField<String>,
        private val errorMessage: JsonField<String>,
        private val licenseKey: JsonField<LicenseKey>,
        private val metadata: JsonValue,
        private val oauthExpiresAt: JsonField<OffsetDateTime>,
        private val oauthUrl: JsonField<String>,
        private val paymentId: JsonField<String>,
        private val revocationReason: JsonField<String>,
        private val revokedAt: JsonField<OffsetDateTime>,
        private val subscriptionId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("business_id")
            @ExcludeMissing
            businessId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("customer_id")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("entitlement_id")
            @ExcludeMissing
            entitlementId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("external_id")
            @ExcludeMissing
            externalId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("delivered_at")
            @ExcludeMissing
            deliveredAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("digital_product_delivery")
            @ExcludeMissing
            digitalProductDelivery: JsonField<DigitalProductDelivery> = JsonMissing.of(),
            @JsonProperty("error_code")
            @ExcludeMissing
            errorCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("error_message")
            @ExcludeMissing
            errorMessage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("license_key")
            @ExcludeMissing
            licenseKey: JsonField<LicenseKey> = JsonMissing.of(),
            @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
            @JsonProperty("oauth_expires_at")
            @ExcludeMissing
            oauthExpiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("oauth_url")
            @ExcludeMissing
            oauthUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("payment_id")
            @ExcludeMissing
            paymentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("revocation_reason")
            @ExcludeMissing
            revocationReason: JsonField<String> = JsonMissing.of(),
            @JsonProperty("revoked_at")
            @ExcludeMissing
            revokedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("subscription_id")
            @ExcludeMissing
            subscriptionId: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            businessId,
            createdAt,
            customerId,
            entitlementId,
            externalId,
            status,
            updatedAt,
            deliveredAt,
            digitalProductDelivery,
            errorCode,
            errorMessage,
            licenseKey,
            metadata,
            oauthExpiresAt,
            oauthUrl,
            paymentId,
            revocationReason,
            revokedAt,
            subscriptionId,
            mutableMapOf(),
        )

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun businessId(): String = businessId.getRequired("business_id")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun entitlementId(): String = entitlementId.getRequired("entitlement_id")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun externalId(): String = externalId.getRequired("external_id")

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
         * Present only when the entitlement integration_type is `digital_files`. Populated eagerly
         * on every list and single-record endpoint.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun digitalProductDelivery(): DigitalProductDelivery? =
            digitalProductDelivery.getNullable("digital_product_delivery")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun errorCode(): String? = errorCode.getNullable("error_code")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun errorMessage(): String? = errorMessage.getNullable("error_message")

        /**
         * Present only when the entitlement integration_type is `license_key`.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun licenseKey(): LicenseKey? = licenseKey.getNullable("license_key")

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = data.metadata().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun oauthExpiresAt(): OffsetDateTime? = oauthExpiresAt.getNullable("oauth_expires_at")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun oauthUrl(): String? = oauthUrl.getNullable("oauth_url")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun paymentId(): String? = paymentId.getNullable("payment_id")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun revocationReason(): String? = revocationReason.getNullable("revocation_reason")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun revokedAt(): OffsetDateTime? = revokedAt.getNullable("revoked_at")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun subscriptionId(): String? = subscriptionId.getNullable("subscription_id")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [businessId].
         *
         * Unlike [businessId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("business_id")
        @ExcludeMissing
        fun _businessId(): JsonField<String> = businessId

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

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
         * Returns the raw JSON value of [externalId].
         *
         * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("external_id")
        @ExcludeMissing
        fun _externalId(): JsonField<String> = externalId

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
         * Returns the raw JSON value of [digitalProductDelivery].
         *
         * Unlike [digitalProductDelivery], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("digital_product_delivery")
        @ExcludeMissing
        fun _digitalProductDelivery(): JsonField<DigitalProductDelivery> = digitalProductDelivery

        /**
         * Returns the raw JSON value of [errorCode].
         *
         * Unlike [errorCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("error_code") @ExcludeMissing fun _errorCode(): JsonField<String> = errorCode

        /**
         * Returns the raw JSON value of [errorMessage].
         *
         * Unlike [errorMessage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("error_message")
        @ExcludeMissing
        fun _errorMessage(): JsonField<String> = errorMessage

        /**
         * Returns the raw JSON value of [licenseKey].
         *
         * Unlike [licenseKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("license_key")
        @ExcludeMissing
        fun _licenseKey(): JsonField<LicenseKey> = licenseKey

        /**
         * Returns the raw JSON value of [oauthExpiresAt].
         *
         * Unlike [oauthExpiresAt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("oauth_expires_at")
        @ExcludeMissing
        fun _oauthExpiresAt(): JsonField<OffsetDateTime> = oauthExpiresAt

        /**
         * Returns the raw JSON value of [oauthUrl].
         *
         * Unlike [oauthUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("oauth_url") @ExcludeMissing fun _oauthUrl(): JsonField<String> = oauthUrl

        /**
         * Returns the raw JSON value of [paymentId].
         *
         * Unlike [paymentId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payment_id") @ExcludeMissing fun _paymentId(): JsonField<String> = paymentId

        /**
         * Returns the raw JSON value of [revocationReason].
         *
         * Unlike [revocationReason], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("revocation_reason")
        @ExcludeMissing
        fun _revocationReason(): JsonField<String> = revocationReason

        /**
         * Returns the raw JSON value of [revokedAt].
         *
         * Unlike [revokedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("revoked_at")
        @ExcludeMissing
        fun _revokedAt(): JsonField<OffsetDateTime> = revokedAt

        /**
         * Returns the raw JSON value of [subscriptionId].
         *
         * Unlike [subscriptionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("subscription_id")
        @ExcludeMissing
        fun _subscriptionId(): JsonField<String> = subscriptionId

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .businessId()
             * .createdAt()
             * .customerId()
             * .entitlementId()
             * .externalId()
             * .status()
             * .updatedAt()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var businessId: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var customerId: JsonField<String>? = null
            private var entitlementId: JsonField<String>? = null
            private var externalId: JsonField<String>? = null
            private var status: JsonField<Status>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var deliveredAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var digitalProductDelivery: JsonField<DigitalProductDelivery> = JsonMissing.of()
            private var errorCode: JsonField<String> = JsonMissing.of()
            private var errorMessage: JsonField<String> = JsonMissing.of()
            private var licenseKey: JsonField<LicenseKey> = JsonMissing.of()
            private var metadata: JsonValue = JsonMissing.of()
            private var oauthExpiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var oauthUrl: JsonField<String> = JsonMissing.of()
            private var paymentId: JsonField<String> = JsonMissing.of()
            private var revocationReason: JsonField<String> = JsonMissing.of()
            private var revokedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var subscriptionId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                id = data.id
                businessId = data.businessId
                createdAt = data.createdAt
                customerId = data.customerId
                entitlementId = data.entitlementId
                externalId = data.externalId
                status = data.status
                updatedAt = data.updatedAt
                deliveredAt = data.deliveredAt
                digitalProductDelivery = data.digitalProductDelivery
                errorCode = data.errorCode
                errorMessage = data.errorMessage
                licenseKey = data.licenseKey
                metadata = data.metadata
                oauthExpiresAt = data.oauthExpiresAt
                oauthUrl = data.oauthUrl
                paymentId = data.paymentId
                revocationReason = data.revocationReason
                revokedAt = data.revokedAt
                subscriptionId = data.subscriptionId
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun businessId(businessId: String) = businessId(JsonField.of(businessId))

            /**
             * Sets [Builder.businessId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.businessId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun businessId(businessId: JsonField<String>) = apply { this.businessId = businessId }

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

            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

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

            fun externalId(externalId: String) = externalId(JsonField.of(externalId))

            /**
             * Sets [Builder.externalId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

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

            /**
             * Present only when the entitlement integration_type is `digital_files`. Populated
             * eagerly on every list and single-record endpoint.
             */
            fun digitalProductDelivery(digitalProductDelivery: DigitalProductDelivery?) =
                digitalProductDelivery(JsonField.ofNullable(digitalProductDelivery))

            /**
             * Sets [Builder.digitalProductDelivery] to an arbitrary JSON value.
             *
             * You should usually call [Builder.digitalProductDelivery] with a well-typed
             * [DigitalProductDelivery] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun digitalProductDelivery(digitalProductDelivery: JsonField<DigitalProductDelivery>) =
                apply {
                    this.digitalProductDelivery = digitalProductDelivery
                }

            fun errorCode(errorCode: String?) = errorCode(JsonField.ofNullable(errorCode))

            /**
             * Sets [Builder.errorCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.errorCode] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun errorCode(errorCode: JsonField<String>) = apply { this.errorCode = errorCode }

            fun errorMessage(errorMessage: String?) =
                errorMessage(JsonField.ofNullable(errorMessage))

            /**
             * Sets [Builder.errorMessage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.errorMessage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun errorMessage(errorMessage: JsonField<String>) = apply {
                this.errorMessage = errorMessage
            }

            /** Present only when the entitlement integration_type is `license_key`. */
            fun licenseKey(licenseKey: LicenseKey?) = licenseKey(JsonField.ofNullable(licenseKey))

            /**
             * Sets [Builder.licenseKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.licenseKey] with a well-typed [LicenseKey] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun licenseKey(licenseKey: JsonField<LicenseKey>) = apply {
                this.licenseKey = licenseKey
            }

            fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

            fun oauthExpiresAt(oauthExpiresAt: OffsetDateTime?) =
                oauthExpiresAt(JsonField.ofNullable(oauthExpiresAt))

            /**
             * Sets [Builder.oauthExpiresAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.oauthExpiresAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun oauthExpiresAt(oauthExpiresAt: JsonField<OffsetDateTime>) = apply {
                this.oauthExpiresAt = oauthExpiresAt
            }

            fun oauthUrl(oauthUrl: String?) = oauthUrl(JsonField.ofNullable(oauthUrl))

            /**
             * Sets [Builder.oauthUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.oauthUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun oauthUrl(oauthUrl: JsonField<String>) = apply { this.oauthUrl = oauthUrl }

            fun paymentId(paymentId: String?) = paymentId(JsonField.ofNullable(paymentId))

            /**
             * Sets [Builder.paymentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun paymentId(paymentId: JsonField<String>) = apply { this.paymentId = paymentId }

            fun revocationReason(revocationReason: String?) =
                revocationReason(JsonField.ofNullable(revocationReason))

            /**
             * Sets [Builder.revocationReason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.revocationReason] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun revocationReason(revocationReason: JsonField<String>) = apply {
                this.revocationReason = revocationReason
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

            fun subscriptionId(subscriptionId: String?) =
                subscriptionId(JsonField.ofNullable(subscriptionId))

            /**
             * Sets [Builder.subscriptionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriptionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subscriptionId(subscriptionId: JsonField<String>) = apply {
                this.subscriptionId = subscriptionId
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .businessId()
             * .createdAt()
             * .customerId()
             * .entitlementId()
             * .externalId()
             * .status()
             * .updatedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("businessId", businessId),
                    checkRequired("createdAt", createdAt),
                    checkRequired("customerId", customerId),
                    checkRequired("entitlementId", entitlementId),
                    checkRequired("externalId", externalId),
                    checkRequired("status", status),
                    checkRequired("updatedAt", updatedAt),
                    deliveredAt,
                    digitalProductDelivery,
                    errorCode,
                    errorMessage,
                    licenseKey,
                    metadata,
                    oauthExpiresAt,
                    oauthUrl,
                    paymentId,
                    revocationReason,
                    revokedAt,
                    subscriptionId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            businessId()
            createdAt()
            customerId()
            entitlementId()
            externalId()
            status().validate()
            updatedAt()
            deliveredAt()
            digitalProductDelivery()?.validate()
            errorCode()
            errorMessage()
            licenseKey()?.validate()
            oauthExpiresAt()
            oauthUrl()
            paymentId()
            revocationReason()
            revokedAt()
            subscriptionId()
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
            (if (id.asKnown() == null) 0 else 1) +
                (if (businessId.asKnown() == null) 0 else 1) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (if (customerId.asKnown() == null) 0 else 1) +
                (if (entitlementId.asKnown() == null) 0 else 1) +
                (if (externalId.asKnown() == null) 0 else 1) +
                (status.asKnown()?.validity() ?: 0) +
                (if (updatedAt.asKnown() == null) 0 else 1) +
                (if (deliveredAt.asKnown() == null) 0 else 1) +
                (digitalProductDelivery.asKnown()?.validity() ?: 0) +
                (if (errorCode.asKnown() == null) 0 else 1) +
                (if (errorMessage.asKnown() == null) 0 else 1) +
                (licenseKey.asKnown()?.validity() ?: 0) +
                (if (oauthExpiresAt.asKnown() == null) 0 else 1) +
                (if (oauthUrl.asKnown() == null) 0 else 1) +
                (if (paymentId.asKnown() == null) 0 else 1) +
                (if (revocationReason.asKnown() == null) 0 else 1) +
                (if (revokedAt.asKnown() == null) 0 else 1) +
                (if (subscriptionId.asKnown() == null) 0 else 1)

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

                val PENDING = of("Pending")

                val DELIVERED = of("Delivered")

                val FAILED = of("Failed")

                val REVOKED = of("Revoked")

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

        /** Present only when the entitlement integration_type is `license_key`. */
        class LicenseKey
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val activationsUsed: JsonField<Int>,
            private val key: JsonField<String>,
            private val activationsLimit: JsonField<Int>,
            private val expiresAt: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("activations_used")
                @ExcludeMissing
                activationsUsed: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
                @JsonProperty("activations_limit")
                @ExcludeMissing
                activationsLimit: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("expires_at")
                @ExcludeMissing
                expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(activationsUsed, key, activationsLimit, expiresAt, mutableMapOf())

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun activationsUsed(): Int = activationsUsed.getRequired("activations_used")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun key(): String = key.getRequired("key")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun activationsLimit(): Int? = activationsLimit.getNullable("activations_limit")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun expiresAt(): OffsetDateTime? = expiresAt.getNullable("expires_at")

            /**
             * Returns the raw JSON value of [activationsUsed].
             *
             * Unlike [activationsUsed], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("activations_used")
            @ExcludeMissing
            fun _activationsUsed(): JsonField<Int> = activationsUsed

            /**
             * Returns the raw JSON value of [key].
             *
             * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

            /**
             * Returns the raw JSON value of [activationsLimit].
             *
             * Unlike [activationsLimit], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("activations_limit")
            @ExcludeMissing
            fun _activationsLimit(): JsonField<Int> = activationsLimit

            /**
             * Returns the raw JSON value of [expiresAt].
             *
             * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("expires_at")
            @ExcludeMissing
            fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

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
                 * Returns a mutable builder for constructing an instance of [LicenseKey].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .activationsUsed()
                 * .key()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [LicenseKey]. */
            class Builder internal constructor() {

                private var activationsUsed: JsonField<Int>? = null
                private var key: JsonField<String>? = null
                private var activationsLimit: JsonField<Int> = JsonMissing.of()
                private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(licenseKey: LicenseKey) = apply {
                    activationsUsed = licenseKey.activationsUsed
                    key = licenseKey.key
                    activationsLimit = licenseKey.activationsLimit
                    expiresAt = licenseKey.expiresAt
                    additionalProperties = licenseKey.additionalProperties.toMutableMap()
                }

                fun activationsUsed(activationsUsed: Int) =
                    activationsUsed(JsonField.of(activationsUsed))

                /**
                 * Sets [Builder.activationsUsed] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.activationsUsed] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun activationsUsed(activationsUsed: JsonField<Int>) = apply {
                    this.activationsUsed = activationsUsed
                }

                fun key(key: String) = key(JsonField.of(key))

                /**
                 * Sets [Builder.key] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.key] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun key(key: JsonField<String>) = apply { this.key = key }

                fun activationsLimit(activationsLimit: Int?) =
                    activationsLimit(JsonField.ofNullable(activationsLimit))

                /**
                 * Alias for [Builder.activationsLimit].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun activationsLimit(activationsLimit: Int) =
                    activationsLimit(activationsLimit as Int?)

                /**
                 * Sets [Builder.activationsLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.activationsLimit] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun activationsLimit(activationsLimit: JsonField<Int>) = apply {
                    this.activationsLimit = activationsLimit
                }

                fun expiresAt(expiresAt: OffsetDateTime?) =
                    expiresAt(JsonField.ofNullable(expiresAt))

                /**
                 * Sets [Builder.expiresAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                    this.expiresAt = expiresAt
                }

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
                 * Returns an immutable instance of [LicenseKey].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .activationsUsed()
                 * .key()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): LicenseKey =
                    LicenseKey(
                        checkRequired("activationsUsed", activationsUsed),
                        checkRequired("key", key),
                        activationsLimit,
                        expiresAt,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): LicenseKey = apply {
                if (validated) {
                    return@apply
                }

                activationsUsed()
                key()
                activationsLimit()
                expiresAt()
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
                (if (activationsUsed.asKnown() == null) 0 else 1) +
                    (if (key.asKnown() == null) 0 else 1) +
                    (if (activationsLimit.asKnown() == null) 0 else 1) +
                    (if (expiresAt.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is LicenseKey &&
                    activationsUsed == other.activationsUsed &&
                    key == other.key &&
                    activationsLimit == other.activationsLimit &&
                    expiresAt == other.expiresAt &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    activationsUsed,
                    key,
                    activationsLimit,
                    expiresAt,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LicenseKey{activationsUsed=$activationsUsed, key=$key, activationsLimit=$activationsLimit, expiresAt=$expiresAt, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                businessId == other.businessId &&
                createdAt == other.createdAt &&
                customerId == other.customerId &&
                entitlementId == other.entitlementId &&
                externalId == other.externalId &&
                status == other.status &&
                updatedAt == other.updatedAt &&
                deliveredAt == other.deliveredAt &&
                digitalProductDelivery == other.digitalProductDelivery &&
                errorCode == other.errorCode &&
                errorMessage == other.errorMessage &&
                licenseKey == other.licenseKey &&
                metadata == other.metadata &&
                oauthExpiresAt == other.oauthExpiresAt &&
                oauthUrl == other.oauthUrl &&
                paymentId == other.paymentId &&
                revocationReason == other.revocationReason &&
                revokedAt == other.revokedAt &&
                subscriptionId == other.subscriptionId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                businessId,
                createdAt,
                customerId,
                entitlementId,
                externalId,
                status,
                updatedAt,
                deliveredAt,
                digitalProductDelivery,
                errorCode,
                errorMessage,
                licenseKey,
                metadata,
                oauthExpiresAt,
                oauthUrl,
                paymentId,
                revocationReason,
                revokedAt,
                subscriptionId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, businessId=$businessId, createdAt=$createdAt, customerId=$customerId, entitlementId=$entitlementId, externalId=$externalId, status=$status, updatedAt=$updatedAt, deliveredAt=$deliveredAt, digitalProductDelivery=$digitalProductDelivery, errorCode=$errorCode, errorMessage=$errorMessage, licenseKey=$licenseKey, metadata=$metadata, oauthExpiresAt=$oauthExpiresAt, oauthUrl=$oauthUrl, paymentId=$paymentId, revocationReason=$revocationReason, revokedAt=$revokedAt, subscriptionId=$subscriptionId, additionalProperties=$additionalProperties}"
    }

    /** The event type */
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

            val ENTITLEMENT_GRANT_REVOKED = of("entitlement_grant.revoked")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            ENTITLEMENT_GRANT_REVOKED
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
            ENTITLEMENT_GRANT_REVOKED,
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
                ENTITLEMENT_GRANT_REVOKED -> Value.ENTITLEMENT_GRANT_REVOKED
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
                ENTITLEMENT_GRANT_REVOKED -> Known.ENTITLEMENT_GRANT_REVOKED
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

        private var validated: Boolean = false

        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EntitlementGrantRevokedWebhookEvent &&
            businessId == other.businessId &&
            data == other.data &&
            timestamp == other.timestamp &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(businessId, data, timestamp, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EntitlementGrantRevokedWebhookEvent{businessId=$businessId, data=$data, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
}
