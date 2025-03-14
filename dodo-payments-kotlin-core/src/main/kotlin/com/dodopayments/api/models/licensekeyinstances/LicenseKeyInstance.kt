// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.licensekeyinstances

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.NoAutoDetect
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.immutableEmptyMap
import com.dodopayments.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class LicenseKeyInstance
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("business_id")
    @ExcludeMissing
    private val businessId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("license_key_id")
    @ExcludeMissing
    private val licenseKeyId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun businessId(): String = businessId.getRequired("business_id")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun licenseKeyId(): String = licenseKeyId.getRequired("license_key_id")

    fun name(): String = name.getRequired("name")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    @JsonProperty("business_id") @ExcludeMissing fun _businessId(): JsonField<String> = businessId

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    @JsonProperty("license_key_id")
    @ExcludeMissing
    fun _licenseKeyId(): JsonField<String> = licenseKeyId

    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): LicenseKeyInstance = apply {
        if (validated) {
            return@apply
        }

        id()
        businessId()
        createdAt()
        licenseKeyId()
        name()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LicenseKeyInstance].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .businessId()
         * .createdAt()
         * .licenseKeyId()
         * .name()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [LicenseKeyInstance]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var businessId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var licenseKeyId: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(licenseKeyInstance: LicenseKeyInstance) = apply {
            id = licenseKeyInstance.id
            businessId = licenseKeyInstance.businessId
            createdAt = licenseKeyInstance.createdAt
            licenseKeyId = licenseKeyInstance.licenseKeyId
            name = licenseKeyInstance.name
            additionalProperties = licenseKeyInstance.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun businessId(businessId: String) = businessId(JsonField.of(businessId))

        fun businessId(businessId: JsonField<String>) = apply { this.businessId = businessId }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun licenseKeyId(licenseKeyId: String) = licenseKeyId(JsonField.of(licenseKeyId))

        fun licenseKeyId(licenseKeyId: JsonField<String>) = apply {
            this.licenseKeyId = licenseKeyId
        }

        fun name(name: String) = name(JsonField.of(name))

        fun name(name: JsonField<String>) = apply { this.name = name }

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

        fun build(): LicenseKeyInstance =
            LicenseKeyInstance(
                checkRequired("id", id),
                checkRequired("businessId", businessId),
                checkRequired("createdAt", createdAt),
                checkRequired("licenseKeyId", licenseKeyId),
                checkRequired("name", name),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LicenseKeyInstance && id == other.id && businessId == other.businessId && createdAt == other.createdAt && licenseKeyId == other.licenseKeyId && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, businessId, createdAt, licenseKeyId, name, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LicenseKeyInstance{id=$id, businessId=$businessId, createdAt=$createdAt, licenseKeyId=$licenseKeyId, name=$name, additionalProperties=$additionalProperties}"
}
