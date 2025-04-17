// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.licensekeys

import com.dodo_payments.api.core.ExcludeMissing
import com.dodo_payments.api.core.JsonField
import com.dodo_payments.api.core.JsonMissing
import com.dodo_payments.api.core.JsonValue
import com.dodo_payments.api.core.NoAutoDetect
import com.dodo_payments.api.core.checkRequired
import com.dodo_payments.api.core.immutableEmptyMap
import com.dodo_payments.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class LicenseKey
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("business_id")
    @ExcludeMissing
    private val businessId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("customer_id")
    @ExcludeMissing
    private val customerId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("instances_count")
    @ExcludeMissing
    private val instancesCount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("key") @ExcludeMissing private val key: JsonField<String> = JsonMissing.of(),
    @JsonProperty("payment_id")
    @ExcludeMissing
    private val paymentId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("product_id")
    @ExcludeMissing
    private val productId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<LicenseKeyStatus> = JsonMissing.of(),
    @JsonProperty("activations_limit")
    @ExcludeMissing
    private val activationsLimit: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("expires_at")
    @ExcludeMissing
    private val expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("subscription_id")
    @ExcludeMissing
    private val subscriptionId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The unique identifier of the license key. */
    fun id(): String = id.getRequired("id")

    /** The unique identifier of the business associated with the license key. */
    fun businessId(): String = businessId.getRequired("business_id")

    /** The timestamp indicating when the license key was created, in UTC. */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The unique identifier of the customer associated with the license key. */
    fun customerId(): String = customerId.getRequired("customer_id")

    /** The current number of instances activated for this license key. */
    fun instancesCount(): Long = instancesCount.getRequired("instances_count")

    /** The license key string. */
    fun key(): String = key.getRequired("key")

    /** The unique identifier of the payment associated with the license key. */
    fun paymentId(): String = paymentId.getRequired("payment_id")

    /** The unique identifier of the product associated with the license key. */
    fun productId(): String = productId.getRequired("product_id")

    fun status(): LicenseKeyStatus = status.getRequired("status")

    /** The maximum number of activations allowed for this license key. */
    fun activationsLimit(): Long? = activationsLimit.getNullable("activations_limit")

    /** The timestamp indicating when the license key expires, in UTC. */
    fun expiresAt(): OffsetDateTime? = expiresAt.getNullable("expires_at")

    /** The unique identifier of the subscription associated with the license key, if any. */
    fun subscriptionId(): String? = subscriptionId.getNullable("subscription_id")

    /** The unique identifier of the license key. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The unique identifier of the business associated with the license key. */
    @JsonProperty("business_id") @ExcludeMissing fun _businessId(): JsonField<String> = businessId

    /** The timestamp indicating when the license key was created, in UTC. */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** The unique identifier of the customer associated with the license key. */
    @JsonProperty("customer_id") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    /** The current number of instances activated for this license key. */
    @JsonProperty("instances_count")
    @ExcludeMissing
    fun _instancesCount(): JsonField<Long> = instancesCount

    /** The license key string. */
    @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

    /** The unique identifier of the payment associated with the license key. */
    @JsonProperty("payment_id") @ExcludeMissing fun _paymentId(): JsonField<String> = paymentId

    /** The unique identifier of the product associated with the license key. */
    @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<LicenseKeyStatus> = status

    /** The maximum number of activations allowed for this license key. */
    @JsonProperty("activations_limit")
    @ExcludeMissing
    fun _activationsLimit(): JsonField<Long> = activationsLimit

    /** The timestamp indicating when the license key expires, in UTC. */
    @JsonProperty("expires_at")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /** The unique identifier of the subscription associated with the license key, if any. */
    @JsonProperty("subscription_id")
    @ExcludeMissing
    fun _subscriptionId(): JsonField<String> = subscriptionId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
        status()
        activationsLimit()
        expiresAt()
        subscriptionId()
        validated = true
    }

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
        private var instancesCount: JsonField<Long>? = null
        private var key: JsonField<String>? = null
        private var paymentId: JsonField<String>? = null
        private var productId: JsonField<String>? = null
        private var status: JsonField<LicenseKeyStatus>? = null
        private var activationsLimit: JsonField<Long> = JsonMissing.of()
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

        /** The unique identifier of the license key. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The unique identifier of the business associated with the license key. */
        fun businessId(businessId: String) = businessId(JsonField.of(businessId))

        /** The unique identifier of the business associated with the license key. */
        fun businessId(businessId: JsonField<String>) = apply { this.businessId = businessId }

        /** The timestamp indicating when the license key was created, in UTC. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** The timestamp indicating when the license key was created, in UTC. */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The unique identifier of the customer associated with the license key. */
        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        /** The unique identifier of the customer associated with the license key. */
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        /** The current number of instances activated for this license key. */
        fun instancesCount(instancesCount: Long) = instancesCount(JsonField.of(instancesCount))

        /** The current number of instances activated for this license key. */
        fun instancesCount(instancesCount: JsonField<Long>) = apply {
            this.instancesCount = instancesCount
        }

        /** The license key string. */
        fun key(key: String) = key(JsonField.of(key))

        /** The license key string. */
        fun key(key: JsonField<String>) = apply { this.key = key }

        /** The unique identifier of the payment associated with the license key. */
        fun paymentId(paymentId: String) = paymentId(JsonField.of(paymentId))

        /** The unique identifier of the payment associated with the license key. */
        fun paymentId(paymentId: JsonField<String>) = apply { this.paymentId = paymentId }

        /** The unique identifier of the product associated with the license key. */
        fun productId(productId: String) = productId(JsonField.of(productId))

        /** The unique identifier of the product associated with the license key. */
        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

        fun status(status: LicenseKeyStatus) = status(JsonField.of(status))

        fun status(status: JsonField<LicenseKeyStatus>) = apply { this.status = status }

        /** The maximum number of activations allowed for this license key. */
        fun activationsLimit(activationsLimit: Long?) =
            activationsLimit(JsonField.ofNullable(activationsLimit))

        /** The maximum number of activations allowed for this license key. */
        fun activationsLimit(activationsLimit: Long) = activationsLimit(activationsLimit as Long?)

        /** The maximum number of activations allowed for this license key. */
        fun activationsLimit(activationsLimit: JsonField<Long>) = apply {
            this.activationsLimit = activationsLimit
        }

        /** The timestamp indicating when the license key expires, in UTC. */
        fun expiresAt(expiresAt: OffsetDateTime?) = expiresAt(JsonField.ofNullable(expiresAt))

        /** The timestamp indicating when the license key expires, in UTC. */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /** The unique identifier of the subscription associated with the license key, if any. */
        fun subscriptionId(subscriptionId: String?) =
            subscriptionId(JsonField.ofNullable(subscriptionId))

        /** The unique identifier of the subscription associated with the license key, if any. */
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
                additionalProperties.toImmutable(),
            )
    }

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
