// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.misc.Metadata
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

class UpdateSubscriptionPlanReq
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val productId: JsonField<String>,
    private val prorationBillingMode: JsonField<ProrationBillingMode>,
    private val quantity: JsonField<Int>,
    private val adaptiveCurrencyFeesInclusive: JsonField<Boolean>,
    private val addons: JsonField<List<AttachAddon>>,
    private val discountCode: JsonField<String>,
    private val discountCodes: JsonField<List<String>>,
    private val effectiveAt: JsonField<EffectiveAt>,
    private val metadata: JsonField<Metadata>,
    private val onPaymentFailure: JsonField<OnPaymentFailure>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("product_id") @ExcludeMissing productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("proration_billing_mode")
        @ExcludeMissing
        prorationBillingMode: JsonField<ProrationBillingMode> = JsonMissing.of(),
        @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("adaptive_currency_fees_inclusive")
        @ExcludeMissing
        adaptiveCurrencyFeesInclusive: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("addons")
        @ExcludeMissing
        addons: JsonField<List<AttachAddon>> = JsonMissing.of(),
        @JsonProperty("discount_code")
        @ExcludeMissing
        discountCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("discount_codes")
        @ExcludeMissing
        discountCodes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("effective_at")
        @ExcludeMissing
        effectiveAt: JsonField<EffectiveAt> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("on_payment_failure")
        @ExcludeMissing
        onPaymentFailure: JsonField<OnPaymentFailure> = JsonMissing.of(),
    ) : this(
        productId,
        prorationBillingMode,
        quantity,
        adaptiveCurrencyFeesInclusive,
        addons,
        discountCode,
        discountCodes,
        effectiveAt,
        metadata,
        onPaymentFailure,
        mutableMapOf(),
    )

    /**
     * Unique identifier of the product to subscribe to
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun productId(): String = productId.getRequired("product_id")

    /**
     * Proration Billing Mode
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun prorationBillingMode(): ProrationBillingMode =
        prorationBillingMode.getRequired("proration_billing_mode")

    /**
     * Number of units to subscribe for. Must be at least 1.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun quantity(): Int = quantity.getRequired("quantity")

    /**
     * Whether adaptive currency fees should be included in the price (true) or added on top
     * (false). If not specified, uses the subscription's stored setting.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun adaptiveCurrencyFeesInclusive(): Boolean? =
        adaptiveCurrencyFeesInclusive.getNullable("adaptive_currency_fees_inclusive")

    /**
     * Addons for the new plan. Note : Leaving this empty would remove any existing addons
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun addons(): List<AttachAddon>? = addons.getNullable("addons")

    /**
     * DEPRECATED: Use discount_codes instead. Cannot be used together with discount_codes.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    @Deprecated("Use `discount_id` instead.")
    fun discountCode(): String? = discountCode.getNullable("discount_code")

    /**
     * Stacked discount codes to apply to the new plan. Max 20. Cannot be used together with
     * discount_code. If provided, replaces any existing discount codes. Empty array removes all
     * discounts. If not provided (None), existing discounts with preserve_on_plan_change=true are
     * preserved.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun discountCodes(): List<String>? = discountCodes.getNullable("discount_codes")

    /**
     * When to apply the plan change.
     * - `immediately` (default): Apply the plan change right away
     * - `next_billing_date`: Schedule the change for the next billing date
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun effectiveAt(): EffectiveAt? = effectiveAt.getNullable("effective_at")

    /**
     * Metadata for the payment. If not passed, the metadata of the subscription will be taken
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun metadata(): Metadata? = metadata.getNullable("metadata")

    /**
     * Controls behavior when the plan change payment fails.
     * - `prevent_change`: Keep subscription on current plan until payment succeeds
     * - `apply_change` (default): Apply plan change immediately regardless of payment outcome
     *
     * If not specified, uses the business-level default setting.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun onPaymentFailure(): OnPaymentFailure? = onPaymentFailure.getNullable("on_payment_failure")

    /**
     * Returns the raw JSON value of [productId].
     *
     * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

    /**
     * Returns the raw JSON value of [prorationBillingMode].
     *
     * Unlike [prorationBillingMode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("proration_billing_mode")
    @ExcludeMissing
    fun _prorationBillingMode(): JsonField<ProrationBillingMode> = prorationBillingMode

    /**
     * Returns the raw JSON value of [quantity].
     *
     * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Int> = quantity

    /**
     * Returns the raw JSON value of [adaptiveCurrencyFeesInclusive].
     *
     * Unlike [adaptiveCurrencyFeesInclusive], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("adaptive_currency_fees_inclusive")
    @ExcludeMissing
    fun _adaptiveCurrencyFeesInclusive(): JsonField<Boolean> = adaptiveCurrencyFeesInclusive

    /**
     * Returns the raw JSON value of [addons].
     *
     * Unlike [addons], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("addons") @ExcludeMissing fun _addons(): JsonField<List<AttachAddon>> = addons

    /**
     * Returns the raw JSON value of [discountCode].
     *
     * Unlike [discountCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("Use `discount_id` instead.")
    @JsonProperty("discount_code")
    @ExcludeMissing
    fun _discountCode(): JsonField<String> = discountCode

    /**
     * Returns the raw JSON value of [discountCodes].
     *
     * Unlike [discountCodes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("discount_codes")
    @ExcludeMissing
    fun _discountCodes(): JsonField<List<String>> = discountCodes

    /**
     * Returns the raw JSON value of [effectiveAt].
     *
     * Unlike [effectiveAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("effective_at")
    @ExcludeMissing
    fun _effectiveAt(): JsonField<EffectiveAt> = effectiveAt

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [onPaymentFailure].
     *
     * Unlike [onPaymentFailure], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("on_payment_failure")
    @ExcludeMissing
    fun _onPaymentFailure(): JsonField<OnPaymentFailure> = onPaymentFailure

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
         * Returns a mutable builder for constructing an instance of [UpdateSubscriptionPlanReq].
         *
         * The following fields are required:
         * ```kotlin
         * .productId()
         * .prorationBillingMode()
         * .quantity()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [UpdateSubscriptionPlanReq]. */
    class Builder internal constructor() {

        private var productId: JsonField<String>? = null
        private var prorationBillingMode: JsonField<ProrationBillingMode>? = null
        private var quantity: JsonField<Int>? = null
        private var adaptiveCurrencyFeesInclusive: JsonField<Boolean> = JsonMissing.of()
        private var addons: JsonField<MutableList<AttachAddon>>? = null
        private var discountCode: JsonField<String> = JsonMissing.of()
        private var discountCodes: JsonField<MutableList<String>>? = null
        private var effectiveAt: JsonField<EffectiveAt> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var onPaymentFailure: JsonField<OnPaymentFailure> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(updateSubscriptionPlanReq: UpdateSubscriptionPlanReq) = apply {
            productId = updateSubscriptionPlanReq.productId
            prorationBillingMode = updateSubscriptionPlanReq.prorationBillingMode
            quantity = updateSubscriptionPlanReq.quantity
            adaptiveCurrencyFeesInclusive = updateSubscriptionPlanReq.adaptiveCurrencyFeesInclusive
            addons = updateSubscriptionPlanReq.addons.map { it.toMutableList() }
            discountCode = updateSubscriptionPlanReq.discountCode
            discountCodes = updateSubscriptionPlanReq.discountCodes.map { it.toMutableList() }
            effectiveAt = updateSubscriptionPlanReq.effectiveAt
            metadata = updateSubscriptionPlanReq.metadata
            onPaymentFailure = updateSubscriptionPlanReq.onPaymentFailure
            additionalProperties = updateSubscriptionPlanReq.additionalProperties.toMutableMap()
        }

        /** Unique identifier of the product to subscribe to */
        fun productId(productId: String) = productId(JsonField.of(productId))

        /**
         * Sets [Builder.productId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

        /** Proration Billing Mode */
        fun prorationBillingMode(prorationBillingMode: ProrationBillingMode) =
            prorationBillingMode(JsonField.of(prorationBillingMode))

        /**
         * Sets [Builder.prorationBillingMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prorationBillingMode] with a well-typed
         * [ProrationBillingMode] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun prorationBillingMode(prorationBillingMode: JsonField<ProrationBillingMode>) = apply {
            this.prorationBillingMode = prorationBillingMode
        }

        /** Number of units to subscribe for. Must be at least 1. */
        fun quantity(quantity: Int) = quantity(JsonField.of(quantity))

        /**
         * Sets [Builder.quantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantity] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quantity(quantity: JsonField<Int>) = apply { this.quantity = quantity }

        /**
         * Whether adaptive currency fees should be included in the price (true) or added on top
         * (false). If not specified, uses the subscription's stored setting.
         */
        fun adaptiveCurrencyFeesInclusive(adaptiveCurrencyFeesInclusive: Boolean?) =
            adaptiveCurrencyFeesInclusive(JsonField.ofNullable(adaptiveCurrencyFeesInclusive))

        /**
         * Alias for [Builder.adaptiveCurrencyFeesInclusive].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun adaptiveCurrencyFeesInclusive(adaptiveCurrencyFeesInclusive: Boolean) =
            adaptiveCurrencyFeesInclusive(adaptiveCurrencyFeesInclusive as Boolean?)

        /**
         * Sets [Builder.adaptiveCurrencyFeesInclusive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.adaptiveCurrencyFeesInclusive] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun adaptiveCurrencyFeesInclusive(adaptiveCurrencyFeesInclusive: JsonField<Boolean>) =
            apply {
                this.adaptiveCurrencyFeesInclusive = adaptiveCurrencyFeesInclusive
            }

        /** Addons for the new plan. Note : Leaving this empty would remove any existing addons */
        fun addons(addons: List<AttachAddon>?) = addons(JsonField.ofNullable(addons))

        /**
         * Sets [Builder.addons] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addons] with a well-typed `List<AttachAddon>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun addons(addons: JsonField<List<AttachAddon>>) = apply {
            this.addons = addons.map { it.toMutableList() }
        }

        /**
         * Adds a single [AttachAddon] to [addons].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAddon(addon: AttachAddon) = apply {
            addons =
                (addons ?: JsonField.of(mutableListOf())).also {
                    checkKnown("addons", it).add(addon)
                }
        }

        /** DEPRECATED: Use discount_codes instead. Cannot be used together with discount_codes. */
        @Deprecated("Use `discount_id` instead.")
        fun discountCode(discountCode: String?) = discountCode(JsonField.ofNullable(discountCode))

        /**
         * Sets [Builder.discountCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discountCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        @Deprecated("Use `discount_id` instead.")
        fun discountCode(discountCode: JsonField<String>) = apply {
            this.discountCode = discountCode
        }

        /**
         * Stacked discount codes to apply to the new plan. Max 20. Cannot be used together with
         * discount_code. If provided, replaces any existing discount codes. Empty array removes all
         * discounts. If not provided (None), existing discounts with preserve_on_plan_change=true
         * are preserved.
         */
        fun discountCodes(discountCodes: List<String>?) =
            discountCodes(JsonField.ofNullable(discountCodes))

        /**
         * Sets [Builder.discountCodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discountCodes] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun discountCodes(discountCodes: JsonField<List<String>>) = apply {
            this.discountCodes = discountCodes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [discountCodes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDiscountCode(discountCode: String) = apply {
            discountCodes =
                (discountCodes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("discountCodes", it).add(discountCode)
                }
        }

        /**
         * When to apply the plan change.
         * - `immediately` (default): Apply the plan change right away
         * - `next_billing_date`: Schedule the change for the next billing date
         */
        fun effectiveAt(effectiveAt: EffectiveAt) = effectiveAt(JsonField.of(effectiveAt))

        /**
         * Sets [Builder.effectiveAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveAt] with a well-typed [EffectiveAt] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun effectiveAt(effectiveAt: JsonField<EffectiveAt>) = apply {
            this.effectiveAt = effectiveAt
        }

        /**
         * Metadata for the payment. If not passed, the metadata of the subscription will be taken
         */
        fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /**
         * Controls behavior when the plan change payment fails.
         * - `prevent_change`: Keep subscription on current plan until payment succeeds
         * - `apply_change` (default): Apply plan change immediately regardless of payment outcome
         *
         * If not specified, uses the business-level default setting.
         */
        fun onPaymentFailure(onPaymentFailure: OnPaymentFailure?) =
            onPaymentFailure(JsonField.ofNullable(onPaymentFailure))

        /**
         * Sets [Builder.onPaymentFailure] to an arbitrary JSON value.
         *
         * You should usually call [Builder.onPaymentFailure] with a well-typed [OnPaymentFailure]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun onPaymentFailure(onPaymentFailure: JsonField<OnPaymentFailure>) = apply {
            this.onPaymentFailure = onPaymentFailure
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
         * Returns an immutable instance of [UpdateSubscriptionPlanReq].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .productId()
         * .prorationBillingMode()
         * .quantity()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UpdateSubscriptionPlanReq =
            UpdateSubscriptionPlanReq(
                checkRequired("productId", productId),
                checkRequired("prorationBillingMode", prorationBillingMode),
                checkRequired("quantity", quantity),
                adaptiveCurrencyFeesInclusive,
                (addons ?: JsonMissing.of()).map { it.toImmutable() },
                discountCode,
                (discountCodes ?: JsonMissing.of()).map { it.toImmutable() },
                effectiveAt,
                metadata,
                onPaymentFailure,
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
    fun validate(): UpdateSubscriptionPlanReq = apply {
        if (validated) {
            return@apply
        }

        productId()
        prorationBillingMode().validate()
        quantity()
        adaptiveCurrencyFeesInclusive()
        addons()?.forEach { it.validate() }
        discountCode()
        discountCodes()
        effectiveAt()?.validate()
        metadata()?.validate()
        onPaymentFailure()?.validate()
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
        (if (productId.asKnown() == null) 0 else 1) +
            (prorationBillingMode.asKnown()?.validity() ?: 0) +
            (if (quantity.asKnown() == null) 0 else 1) +
            (if (adaptiveCurrencyFeesInclusive.asKnown() == null) 0 else 1) +
            (addons.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (discountCode.asKnown() == null) 0 else 1) +
            (discountCodes.asKnown()?.size ?: 0) +
            (effectiveAt.asKnown()?.validity() ?: 0) +
            (metadata.asKnown()?.validity() ?: 0) +
            (onPaymentFailure.asKnown()?.validity() ?: 0)

    /** Proration Billing Mode */
    class ProrationBillingMode
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            val PRORATED_IMMEDIATELY = of("prorated_immediately")

            val FULL_IMMEDIATELY = of("full_immediately")

            val DIFFERENCE_IMMEDIATELY = of("difference_immediately")

            val DO_NOT_BILL = of("do_not_bill")

            fun of(value: String) = ProrationBillingMode(JsonField.of(value))
        }

        /** An enum containing [ProrationBillingMode]'s known values. */
        enum class Known {
            PRORATED_IMMEDIATELY,
            FULL_IMMEDIATELY,
            DIFFERENCE_IMMEDIATELY,
            DO_NOT_BILL,
        }

        /**
         * An enum containing [ProrationBillingMode]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [ProrationBillingMode] can contain an unknown value in a couple of cases:
         *
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         *
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PRORATED_IMMEDIATELY,
            FULL_IMMEDIATELY,
            DIFFERENCE_IMMEDIATELY,
            DO_NOT_BILL,
            /**
             * An enum member indicating that [ProrationBillingMode] was instantiated with an
             * unknown value.
             */
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
                PRORATED_IMMEDIATELY -> Value.PRORATED_IMMEDIATELY
                FULL_IMMEDIATELY -> Value.FULL_IMMEDIATELY
                DIFFERENCE_IMMEDIATELY -> Value.DIFFERENCE_IMMEDIATELY
                DO_NOT_BILL -> Value.DO_NOT_BILL
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
                PRORATED_IMMEDIATELY -> Known.PRORATED_IMMEDIATELY
                FULL_IMMEDIATELY -> Known.FULL_IMMEDIATELY
                DIFFERENCE_IMMEDIATELY -> Known.DIFFERENCE_IMMEDIATELY
                DO_NOT_BILL -> Known.DO_NOT_BILL
                else ->
                    throw DodoPaymentsInvalidDataException("Unknown ProrationBillingMode: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): ProrationBillingMode = apply {
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

            return other is ProrationBillingMode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * When to apply the plan change.
     * - `immediately` (default): Apply the plan change right away
     * - `next_billing_date`: Schedule the change for the next billing date
     */
    class EffectiveAt @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            val IMMEDIATELY = of("immediately")

            val NEXT_BILLING_DATE = of("next_billing_date")

            fun of(value: String) = EffectiveAt(JsonField.of(value))
        }

        /** An enum containing [EffectiveAt]'s known values. */
        enum class Known {
            IMMEDIATELY,
            NEXT_BILLING_DATE,
        }

        /**
         * An enum containing [EffectiveAt]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EffectiveAt] can contain an unknown value in a couple of cases:
         *
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         *
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            IMMEDIATELY,
            NEXT_BILLING_DATE,
            /**
             * An enum member indicating that [EffectiveAt] was instantiated with an unknown value.
             */
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
                IMMEDIATELY -> Value.IMMEDIATELY
                NEXT_BILLING_DATE -> Value.NEXT_BILLING_DATE
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
                IMMEDIATELY -> Known.IMMEDIATELY
                NEXT_BILLING_DATE -> Known.NEXT_BILLING_DATE
                else -> throw DodoPaymentsInvalidDataException("Unknown EffectiveAt: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): EffectiveAt = apply {
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

            return other is EffectiveAt && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Controls behavior when the plan change payment fails.
     * - `prevent_change`: Keep subscription on current plan until payment succeeds
     * - `apply_change` (default): Apply plan change immediately regardless of payment outcome
     *
     * If not specified, uses the business-level default setting.
     */
    class OnPaymentFailure @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            val PREVENT_CHANGE = of("prevent_change")

            val APPLY_CHANGE = of("apply_change")

            fun of(value: String) = OnPaymentFailure(JsonField.of(value))
        }

        /** An enum containing [OnPaymentFailure]'s known values. */
        enum class Known {
            PREVENT_CHANGE,
            APPLY_CHANGE,
        }

        /**
         * An enum containing [OnPaymentFailure]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [OnPaymentFailure] can contain an unknown value in a couple of cases:
         *
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         *
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PREVENT_CHANGE,
            APPLY_CHANGE,
            /**
             * An enum member indicating that [OnPaymentFailure] was instantiated with an unknown
             * value.
             */
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
                PREVENT_CHANGE -> Value.PREVENT_CHANGE
                APPLY_CHANGE -> Value.APPLY_CHANGE
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
                PREVENT_CHANGE -> Known.PREVENT_CHANGE
                APPLY_CHANGE -> Known.APPLY_CHANGE
                else -> throw DodoPaymentsInvalidDataException("Unknown OnPaymentFailure: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): OnPaymentFailure = apply {
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

            return other is OnPaymentFailure && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UpdateSubscriptionPlanReq &&
            productId == other.productId &&
            prorationBillingMode == other.prorationBillingMode &&
            quantity == other.quantity &&
            adaptiveCurrencyFeesInclusive == other.adaptiveCurrencyFeesInclusive &&
            addons == other.addons &&
            discountCode == other.discountCode &&
            discountCodes == other.discountCodes &&
            effectiveAt == other.effectiveAt &&
            metadata == other.metadata &&
            onPaymentFailure == other.onPaymentFailure &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            productId,
            prorationBillingMode,
            quantity,
            adaptiveCurrencyFeesInclusive,
            addons,
            discountCode,
            discountCodes,
            effectiveAt,
            metadata,
            onPaymentFailure,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UpdateSubscriptionPlanReq{productId=$productId, prorationBillingMode=$prorationBillingMode, quantity=$quantity, adaptiveCurrencyFeesInclusive=$adaptiveCurrencyFeesInclusive, addons=$addons, discountCode=$discountCode, discountCodes=$discountCodes, effectiveAt=$effectiveAt, metadata=$metadata, onPaymentFailure=$onPaymentFailure, additionalProperties=$additionalProperties}"
}
