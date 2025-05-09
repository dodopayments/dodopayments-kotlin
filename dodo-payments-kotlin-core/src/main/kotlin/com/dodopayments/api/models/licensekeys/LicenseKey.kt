// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.licensekeys

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class LicenseKey
private constructor(
    private val id: JsonField<String>,
    private val businessId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val customerId: JsonField<String>,
    private val instancesCount: JsonField<Int>,
    private val key: JsonField<String>,
    private val paymentId: JsonField<String>,
    private val productId: JsonField<String>,
    private val status: JsonField<LicenseKeyStatus>,
    private val activationsLimit: JsonField<Int>,
    private val expiresAt: JsonField<OffsetDateTime>,
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
        @JsonProperty("instances_count")
        @ExcludeMissing
        instancesCount: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payment_id") @ExcludeMissing paymentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("product_id") @ExcludeMissing productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<LicenseKeyStatus> = JsonMissing.of(),
        @JsonProperty("activations_limit")
        @ExcludeMissing
        activationsLimit: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("expires_at")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("subscription_id")
        @ExcludeMissing
        subscriptionId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        businessId,
        createdAt,
        customerId,
        instancesCount,
        key,
        paymentId,
        productId,
        status,
        activationsLimit,
        expiresAt,
        subscriptionId,
        mutableMapOf(),
    )

    /**
     * The unique identifier of the license key.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The unique identifier of the business associated with the license key.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessId(): String = businessId.getRequired("business_id")

    /**
     * The timestamp indicating when the license key was created, in UTC.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The unique identifier of the customer associated with the license key.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = customerId.getRequired("customer_id")

    /**
     * The current number of instances activated for this license key.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun instancesCount(): Int = instancesCount.getRequired("instances_count")

    /**
     * The license key string.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun key(): String = key.getRequired("key")

    /**
     * The unique identifier of the payment associated with the license key.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paymentId(): String = paymentId.getRequired("payment_id")

    /**
     * The unique identifier of the product associated with the license key.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun productId(): String = productId.getRequired("product_id")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): LicenseKeyStatus = status.getRequired("status")

    /**
     * The maximum number of activations allowed for this license key.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun activationsLimit(): Int? = activationsLimit.getNullable("activations_limit")

    /**
     * The timestamp indicating when the license key expires, in UTC.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun expiresAt(): OffsetDateTime? = expiresAt.getNullable("expires_at")

    /**
     * The unique identifier of the subscription associated with the license key, if any.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
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
    @JsonProperty("business_id") @ExcludeMissing fun _businessId(): JsonField<String> = businessId

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
    @JsonProperty("customer_id") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    /**
     * Returns the raw JSON value of [instancesCount].
     *
     * Unlike [instancesCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instances_count")
    @ExcludeMissing
    fun _instancesCount(): JsonField<Int> = instancesCount

    /**
     * Returns the raw JSON value of [key].
     *
     * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

    /**
     * Returns the raw JSON value of [paymentId].
     *
     * Unlike [paymentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_id") @ExcludeMissing fun _paymentId(): JsonField<String> = paymentId

    /**
     * Returns the raw JSON value of [productId].
     *
     * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<LicenseKeyStatus> = status

    /**
     * Returns the raw JSON value of [activationsLimit].
     *
     * Unlike [activationsLimit], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("activations_limit")
    @ExcludeMissing
    fun _activationsLimit(): JsonField<Int> = activationsLimit

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_at")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [subscriptionId].
     *
     * Unlike [subscriptionId], this method doesn't throw if the JSON field has an unexpected type.
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
         * Returns a mutable builder for constructing an instance of [LicenseKey].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .businessId()
         * .createdAt()
         * .customerId()
         * .instancesCount()
         * .key()
         * .paymentId()
         * .productId()
         * .status()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [LicenseKey]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var businessId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var customerId: JsonField<String>? = null
        private var instancesCount: JsonField<Int>? = null
        private var key: JsonField<String>? = null
        private var paymentId: JsonField<String>? = null
        private var productId: JsonField<String>? = null
        private var status: JsonField<LicenseKeyStatus>? = null
        private var activationsLimit: JsonField<Int> = JsonMissing.of()
        private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var subscriptionId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(licenseKey: LicenseKey) = apply {
            id = licenseKey.id
            businessId = licenseKey.businessId
            createdAt = licenseKey.createdAt
            customerId = licenseKey.customerId
            instancesCount = licenseKey.instancesCount
            key = licenseKey.key
            paymentId = licenseKey.paymentId
            productId = licenseKey.productId
            status = licenseKey.status
            activationsLimit = licenseKey.activationsLimit
            expiresAt = licenseKey.expiresAt
            subscriptionId = licenseKey.subscriptionId
            additionalProperties = licenseKey.additionalProperties.toMutableMap()
        }

        /** The unique identifier of the license key. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The unique identifier of the business associated with the license key. */
        fun businessId(businessId: String) = businessId(JsonField.of(businessId))

        /**
         * Sets [Builder.businessId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun businessId(businessId: JsonField<String>) = apply { this.businessId = businessId }

        /** The timestamp indicating when the license key was created, in UTC. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The unique identifier of the customer associated with the license key. */
        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        /** The current number of instances activated for this license key. */
        fun instancesCount(instancesCount: Int) = instancesCount(JsonField.of(instancesCount))

        /**
         * Sets [Builder.instancesCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instancesCount] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun instancesCount(instancesCount: JsonField<Int>) = apply {
            this.instancesCount = instancesCount
        }

        /** The license key string. */
        fun key(key: String) = key(JsonField.of(key))

        /**
         * Sets [Builder.key] to an arbitrary JSON value.
         *
         * You should usually call [Builder.key] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun key(key: JsonField<String>) = apply { this.key = key }

        /** The unique identifier of the payment associated with the license key. */
        fun paymentId(paymentId: String) = paymentId(JsonField.of(paymentId))

        /**
         * Sets [Builder.paymentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun paymentId(paymentId: JsonField<String>) = apply { this.paymentId = paymentId }

        /** The unique identifier of the product associated with the license key. */
        fun productId(productId: String) = productId(JsonField.of(productId))

        /**
         * Sets [Builder.productId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

        fun status(status: LicenseKeyStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [LicenseKeyStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<LicenseKeyStatus>) = apply { this.status = status }

        /** The maximum number of activations allowed for this license key. */
        fun activationsLimit(activationsLimit: Int?) =
            activationsLimit(JsonField.ofNullable(activationsLimit))

        /**
         * Alias for [Builder.activationsLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun activationsLimit(activationsLimit: Int) = activationsLimit(activationsLimit as Int?)

        /**
         * Sets [Builder.activationsLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activationsLimit] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun activationsLimit(activationsLimit: JsonField<Int>) = apply {
            this.activationsLimit = activationsLimit
        }

        /** The timestamp indicating when the license key expires, in UTC. */
        fun expiresAt(expiresAt: OffsetDateTime?) = expiresAt(JsonField.ofNullable(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /** The unique identifier of the subscription associated with the license key, if any. */
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
         * Returns an immutable instance of [LicenseKey].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .businessId()
         * .createdAt()
         * .customerId()
         * .instancesCount()
         * .key()
         * .paymentId()
         * .productId()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LicenseKey =
            LicenseKey(
                checkRequired("id", id),
                checkRequired("businessId", businessId),
                checkRequired("createdAt", createdAt),
                checkRequired("customerId", customerId),
                checkRequired("instancesCount", instancesCount),
                checkRequired("key", key),
                checkRequired("paymentId", paymentId),
                checkRequired("productId", productId),
                checkRequired("status", status),
                activationsLimit,
                expiresAt,
                subscriptionId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LicenseKey = apply {
        if (validated) {
            return@apply
        }

        id()
        businessId()
        createdAt()
        customerId()
        instancesCount()
        key()
        paymentId()
        productId()
        status().validate()
        activationsLimit()
        expiresAt()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (id.asKnown() == null) 0 else 1) +
            (if (businessId.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (customerId.asKnown() == null) 0 else 1) +
            (if (instancesCount.asKnown() == null) 0 else 1) +
            (if (key.asKnown() == null) 0 else 1) +
            (if (paymentId.asKnown() == null) 0 else 1) +
            (if (productId.asKnown() == null) 0 else 1) +
            (status.asKnown()?.validity() ?: 0) +
            (if (activationsLimit.asKnown() == null) 0 else 1) +
            (if (expiresAt.asKnown() == null) 0 else 1) +
            (if (subscriptionId.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LicenseKey && id == other.id && businessId == other.businessId && createdAt == other.createdAt && customerId == other.customerId && instancesCount == other.instancesCount && key == other.key && paymentId == other.paymentId && productId == other.productId && status == other.status && activationsLimit == other.activationsLimit && expiresAt == other.expiresAt && subscriptionId == other.subscriptionId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, businessId, createdAt, customerId, instancesCount, key, paymentId, productId, status, activationsLimit, expiresAt, subscriptionId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LicenseKey{id=$id, businessId=$businessId, createdAt=$createdAt, customerId=$customerId, instancesCount=$instancesCount, key=$key, paymentId=$paymentId, productId=$productId, status=$status, activationsLimit=$activationsLimit, expiresAt=$expiresAt, subscriptionId=$subscriptionId, additionalProperties=$additionalProperties}"
}
