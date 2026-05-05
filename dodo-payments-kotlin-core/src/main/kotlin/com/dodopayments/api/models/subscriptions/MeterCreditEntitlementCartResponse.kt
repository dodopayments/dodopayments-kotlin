// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

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
import java.util.Collections
import java.util.Objects

/** Response struct representing meter-credit entitlement mapping cart details for a subscription */
class MeterCreditEntitlementCartResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val creditEntitlementId: JsonField<String>,
    private val meterId: JsonField<String>,
    private val meterName: JsonField<String>,
    private val meterUnitsPerCredit: JsonField<String>,
    private val productId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("credit_entitlement_id")
        @ExcludeMissing
        creditEntitlementId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("meter_id") @ExcludeMissing meterId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("meter_name") @ExcludeMissing meterName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("meter_units_per_credit")
        @ExcludeMissing
        meterUnitsPerCredit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("product_id") @ExcludeMissing productId: JsonField<String> = JsonMissing.of(),
    ) : this(
        creditEntitlementId,
        meterId,
        meterName,
        meterUnitsPerCredit,
        productId,
        mutableMapOf(),
    )

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditEntitlementId(): String = creditEntitlementId.getRequired("credit_entitlement_id")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun meterId(): String = meterId.getRequired("meter_id")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun meterName(): String = meterName.getRequired("meter_name")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun meterUnitsPerCredit(): String = meterUnitsPerCredit.getRequired("meter_units_per_credit")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun productId(): String = productId.getRequired("product_id")

    /**
     * Returns the raw JSON value of [creditEntitlementId].
     *
     * Unlike [creditEntitlementId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("credit_entitlement_id")
    @ExcludeMissing
    fun _creditEntitlementId(): JsonField<String> = creditEntitlementId

    /**
     * Returns the raw JSON value of [meterId].
     *
     * Unlike [meterId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meter_id") @ExcludeMissing fun _meterId(): JsonField<String> = meterId

    /**
     * Returns the raw JSON value of [meterName].
     *
     * Unlike [meterName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meter_name") @ExcludeMissing fun _meterName(): JsonField<String> = meterName

    /**
     * Returns the raw JSON value of [meterUnitsPerCredit].
     *
     * Unlike [meterUnitsPerCredit], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("meter_units_per_credit")
    @ExcludeMissing
    fun _meterUnitsPerCredit(): JsonField<String> = meterUnitsPerCredit

    /**
     * Returns the raw JSON value of [productId].
     *
     * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

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
         * [MeterCreditEntitlementCartResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .creditEntitlementId()
         * .meterId()
         * .meterName()
         * .meterUnitsPerCredit()
         * .productId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [MeterCreditEntitlementCartResponse]. */
    class Builder internal constructor() {

        private var creditEntitlementId: JsonField<String>? = null
        private var meterId: JsonField<String>? = null
        private var meterName: JsonField<String>? = null
        private var meterUnitsPerCredit: JsonField<String>? = null
        private var productId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(meterCreditEntitlementCartResponse: MeterCreditEntitlementCartResponse) =
            apply {
                creditEntitlementId = meterCreditEntitlementCartResponse.creditEntitlementId
                meterId = meterCreditEntitlementCartResponse.meterId
                meterName = meterCreditEntitlementCartResponse.meterName
                meterUnitsPerCredit = meterCreditEntitlementCartResponse.meterUnitsPerCredit
                productId = meterCreditEntitlementCartResponse.productId
                additionalProperties =
                    meterCreditEntitlementCartResponse.additionalProperties.toMutableMap()
            }

        fun creditEntitlementId(creditEntitlementId: String) =
            creditEntitlementId(JsonField.of(creditEntitlementId))

        /**
         * Sets [Builder.creditEntitlementId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditEntitlementId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditEntitlementId(creditEntitlementId: JsonField<String>) = apply {
            this.creditEntitlementId = creditEntitlementId
        }

        fun meterId(meterId: String) = meterId(JsonField.of(meterId))

        /**
         * Sets [Builder.meterId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meterId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun meterId(meterId: JsonField<String>) = apply { this.meterId = meterId }

        fun meterName(meterName: String) = meterName(JsonField.of(meterName))

        /**
         * Sets [Builder.meterName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meterName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun meterName(meterName: JsonField<String>) = apply { this.meterName = meterName }

        fun meterUnitsPerCredit(meterUnitsPerCredit: String) =
            meterUnitsPerCredit(JsonField.of(meterUnitsPerCredit))

        /**
         * Sets [Builder.meterUnitsPerCredit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meterUnitsPerCredit] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun meterUnitsPerCredit(meterUnitsPerCredit: JsonField<String>) = apply {
            this.meterUnitsPerCredit = meterUnitsPerCredit
        }

        fun productId(productId: String) = productId(JsonField.of(productId))

        /**
         * Sets [Builder.productId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

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
         * Returns an immutable instance of [MeterCreditEntitlementCartResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .creditEntitlementId()
         * .meterId()
         * .meterName()
         * .meterUnitsPerCredit()
         * .productId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MeterCreditEntitlementCartResponse =
            MeterCreditEntitlementCartResponse(
                checkRequired("creditEntitlementId", creditEntitlementId),
                checkRequired("meterId", meterId),
                checkRequired("meterName", meterName),
                checkRequired("meterUnitsPerCredit", meterUnitsPerCredit),
                checkRequired("productId", productId),
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
    fun validate(): MeterCreditEntitlementCartResponse = apply {
        if (validated) {
            return@apply
        }

        creditEntitlementId()
        meterId()
        meterName()
        meterUnitsPerCredit()
        productId()
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
        (if (creditEntitlementId.asKnown() == null) 0 else 1) +
            (if (meterId.asKnown() == null) 0 else 1) +
            (if (meterName.asKnown() == null) 0 else 1) +
            (if (meterUnitsPerCredit.asKnown() == null) 0 else 1) +
            (if (productId.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MeterCreditEntitlementCartResponse &&
            creditEntitlementId == other.creditEntitlementId &&
            meterId == other.meterId &&
            meterName == other.meterName &&
            meterUnitsPerCredit == other.meterUnitsPerCredit &&
            productId == other.productId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            creditEntitlementId,
            meterId,
            meterName,
            meterUnitsPerCredit,
            productId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MeterCreditEntitlementCartResponse{creditEntitlementId=$creditEntitlementId, meterId=$meterId, meterName=$meterName, meterUnitsPerCredit=$meterUnitsPerCredit, productId=$productId, additionalProperties=$additionalProperties}"
}
