// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.BaseDeserializer
import com.dodopayments.api.core.BaseSerializer
import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.getOrThrow
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.invoices.CollectionMethod
import com.dodopayments.api.models.misc.Metadata
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
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
    private val cancelOlderPaymentLink: JsonField<Boolean>,
    private val cancelScheduledChangePlan: JsonField<Boolean>,
    private val collectViaPaymentLink: JsonField<Boolean>,
    private val credit: JsonField<Credit>,
    private val discountCode: JsonField<String>,
    private val discountCodes: JsonField<List<String>>,
    private val effectiveAt: JsonField<EffectiveAt>,
    private val invoice: JsonField<Invoice>,
    private val metadata: JsonField<Metadata>,
    private val onPaymentFailure: JsonField<OnPaymentFailure>,
    private val returnUrl: JsonField<String>,
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
        @JsonProperty("cancel_older_payment_link")
        @ExcludeMissing
        cancelOlderPaymentLink: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("cancel_scheduled_change_plan")
        @ExcludeMissing
        cancelScheduledChangePlan: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("collect_via_payment_link")
        @ExcludeMissing
        collectViaPaymentLink: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("credit") @ExcludeMissing credit: JsonField<Credit> = JsonMissing.of(),
        @JsonProperty("discount_code")
        @ExcludeMissing
        discountCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("discount_codes")
        @ExcludeMissing
        discountCodes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("effective_at")
        @ExcludeMissing
        effectiveAt: JsonField<EffectiveAt> = JsonMissing.of(),
        @JsonProperty("invoice") @ExcludeMissing invoice: JsonField<Invoice> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("on_payment_failure")
        @ExcludeMissing
        onPaymentFailure: JsonField<OnPaymentFailure> = JsonMissing.of(),
        @JsonProperty("return_url") @ExcludeMissing returnUrl: JsonField<String> = JsonMissing.of(),
    ) : this(
        productId,
        prorationBillingMode,
        quantity,
        adaptiveCurrencyFeesInclusive,
        addons,
        cancelOlderPaymentLink,
        cancelScheduledChangePlan,
        collectViaPaymentLink,
        credit,
        discountCode,
        discountCodes,
        effectiveAt,
        invoice,
        metadata,
        onPaymentFailure,
        returnUrl,
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
     * Cancel the payment link of a pending plan change, so that this change can replace it.
     *
     * The link is cancelled only if the customer has not started to pay. A paid or in-progress
     * payment gives a `409`. A failed cancel gives a `503`, and a retry is safe.
     *
     * The request is validated before the cancel. A later failure, for example an amount below the
     * minimum, leaves the subscription on its current plan with no open link. A retry is safe.
     *
     * The preview route shares this request body and ignores this field.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun cancelOlderPaymentLink(): Boolean? =
        cancelOlderPaymentLink.getNullable("cancel_older_payment_link")

    /**
     * Replace a scheduled plan change with this one.
     *
     * The scheduled change is cancelled by the transaction that applies this change. A change that
     * never applies leaves the schedule in place.
     *
     * `effective_at: next_billing_date` is allowed. The new schedule then replaces the old one in
     * the request transaction.
     *
     * A pending plan change still gets a `409`. This field does not affect it.
     *
     * The preview route shares this request body, so a preview that sets this field also passes the
     * scheduled-change `409`.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun cancelScheduledChangePlan(): Boolean? =
        cancelScheduledChangePlan.getNullable("cancel_scheduled_change_plan")

    /**
     * Collect the plan-change amount with a payment link. The customer then pays on a checkout
     * page.
     *
     * The business needs the `allow_plan_change_via_payment_link` capability. The request needs
     * `effective_at: immediately`. The request also needs `on_payment_failure: prevent_change`.
     *
     * The preview route shares this request body and ignores this field.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun collectViaPaymentLink(): Boolean? =
        collectViaPaymentLink.getNullable("collect_via_payment_link")

    /**
     * Where a downgrade credit goes. Only invoice-led subscriptions read it. The default is
     * `customer_balance`.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun credit(): Credit? = credit.getNullable("credit")

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
     * The invoice of a plan change billed now. Only invoice-led subscriptions read it.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun invoice(): Invoice? = invoice.getNullable("invoice")

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
     * With `effective_at: next_billing_date`, the plan change payment replaces the renewal payment.
     * If that payment fails with `prevent_change`, the plan change is cancelled. The subscription
     * then renews on the current plan, with the usual payment retries.
     *
     * If not specified, uses the business-level default setting.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun onPaymentFailure(): OnPaymentFailure? = onPaymentFailure.getNullable("on_payment_failure")

    /**
     * The URL that receives the customer after they pay the payment link. Needs
     * `collect_via_payment_link: true`. Without it, the request gets a `422`. A change that
     * collects no money issues no link and does not use the URL. The preview route validates this
     * field but does not use it.
     *
     * The redirect adds `subscription_id`, `payment_id` and `status`. The `status` value is the
     * status of the plan-change payment. It is not the status of the subscription. When that
     * payment fails, the subscription stays active on its current plan. To try again, call this
     * endpoint again to get a new link. The new plan can apply after the redirect, when the payment
     * webhook arrives.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun returnUrl(): String? = returnUrl.getNullable("return_url")

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
     * Returns the raw JSON value of [cancelOlderPaymentLink].
     *
     * Unlike [cancelOlderPaymentLink], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("cancel_older_payment_link")
    @ExcludeMissing
    fun _cancelOlderPaymentLink(): JsonField<Boolean> = cancelOlderPaymentLink

    /**
     * Returns the raw JSON value of [cancelScheduledChangePlan].
     *
     * Unlike [cancelScheduledChangePlan], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("cancel_scheduled_change_plan")
    @ExcludeMissing
    fun _cancelScheduledChangePlan(): JsonField<Boolean> = cancelScheduledChangePlan

    /**
     * Returns the raw JSON value of [collectViaPaymentLink].
     *
     * Unlike [collectViaPaymentLink], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("collect_via_payment_link")
    @ExcludeMissing
    fun _collectViaPaymentLink(): JsonField<Boolean> = collectViaPaymentLink

    /**
     * Returns the raw JSON value of [credit].
     *
     * Unlike [credit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credit") @ExcludeMissing fun _credit(): JsonField<Credit> = credit

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
     * Returns the raw JSON value of [invoice].
     *
     * Unlike [invoice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invoice") @ExcludeMissing fun _invoice(): JsonField<Invoice> = invoice

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

    /**
     * Returns the raw JSON value of [returnUrl].
     *
     * Unlike [returnUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("return_url") @ExcludeMissing fun _returnUrl(): JsonField<String> = returnUrl

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
        private var cancelOlderPaymentLink: JsonField<Boolean> = JsonMissing.of()
        private var cancelScheduledChangePlan: JsonField<Boolean> = JsonMissing.of()
        private var collectViaPaymentLink: JsonField<Boolean> = JsonMissing.of()
        private var credit: JsonField<Credit> = JsonMissing.of()
        private var discountCode: JsonField<String> = JsonMissing.of()
        private var discountCodes: JsonField<MutableList<String>>? = null
        private var effectiveAt: JsonField<EffectiveAt> = JsonMissing.of()
        private var invoice: JsonField<Invoice> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var onPaymentFailure: JsonField<OnPaymentFailure> = JsonMissing.of()
        private var returnUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(updateSubscriptionPlanReq: UpdateSubscriptionPlanReq) = apply {
            productId = updateSubscriptionPlanReq.productId
            prorationBillingMode = updateSubscriptionPlanReq.prorationBillingMode
            quantity = updateSubscriptionPlanReq.quantity
            adaptiveCurrencyFeesInclusive = updateSubscriptionPlanReq.adaptiveCurrencyFeesInclusive
            addons = updateSubscriptionPlanReq.addons.map { it.toMutableList() }
            cancelOlderPaymentLink = updateSubscriptionPlanReq.cancelOlderPaymentLink
            cancelScheduledChangePlan = updateSubscriptionPlanReq.cancelScheduledChangePlan
            collectViaPaymentLink = updateSubscriptionPlanReq.collectViaPaymentLink
            credit = updateSubscriptionPlanReq.credit
            discountCode = updateSubscriptionPlanReq.discountCode
            discountCodes = updateSubscriptionPlanReq.discountCodes.map { it.toMutableList() }
            effectiveAt = updateSubscriptionPlanReq.effectiveAt
            invoice = updateSubscriptionPlanReq.invoice
            metadata = updateSubscriptionPlanReq.metadata
            onPaymentFailure = updateSubscriptionPlanReq.onPaymentFailure
            returnUrl = updateSubscriptionPlanReq.returnUrl
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

        /**
         * Cancel the payment link of a pending plan change, so that this change can replace it.
         *
         * The link is cancelled only if the customer has not started to pay. A paid or in-progress
         * payment gives a `409`. A failed cancel gives a `503`, and a retry is safe.
         *
         * The request is validated before the cancel. A later failure, for example an amount below
         * the minimum, leaves the subscription on its current plan with no open link. A retry is
         * safe.
         *
         * The preview route shares this request body and ignores this field.
         */
        fun cancelOlderPaymentLink(cancelOlderPaymentLink: Boolean) =
            cancelOlderPaymentLink(JsonField.of(cancelOlderPaymentLink))

        /**
         * Sets [Builder.cancelOlderPaymentLink] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cancelOlderPaymentLink] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun cancelOlderPaymentLink(cancelOlderPaymentLink: JsonField<Boolean>) = apply {
            this.cancelOlderPaymentLink = cancelOlderPaymentLink
        }

        /**
         * Replace a scheduled plan change with this one.
         *
         * The scheduled change is cancelled by the transaction that applies this change. A change
         * that never applies leaves the schedule in place.
         *
         * `effective_at: next_billing_date` is allowed. The new schedule then replaces the old one
         * in the request transaction.
         *
         * A pending plan change still gets a `409`. This field does not affect it.
         *
         * The preview route shares this request body, so a preview that sets this field also passes
         * the scheduled-change `409`.
         */
        fun cancelScheduledChangePlan(cancelScheduledChangePlan: Boolean) =
            cancelScheduledChangePlan(JsonField.of(cancelScheduledChangePlan))

        /**
         * Sets [Builder.cancelScheduledChangePlan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cancelScheduledChangePlan] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun cancelScheduledChangePlan(cancelScheduledChangePlan: JsonField<Boolean>) = apply {
            this.cancelScheduledChangePlan = cancelScheduledChangePlan
        }

        /**
         * Collect the plan-change amount with a payment link. The customer then pays on a checkout
         * page.
         *
         * The business needs the `allow_plan_change_via_payment_link` capability. The request needs
         * `effective_at: immediately`. The request also needs `on_payment_failure: prevent_change`.
         *
         * The preview route shares this request body and ignores this field.
         */
        fun collectViaPaymentLink(collectViaPaymentLink: Boolean) =
            collectViaPaymentLink(JsonField.of(collectViaPaymentLink))

        /**
         * Sets [Builder.collectViaPaymentLink] to an arbitrary JSON value.
         *
         * You should usually call [Builder.collectViaPaymentLink] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun collectViaPaymentLink(collectViaPaymentLink: JsonField<Boolean>) = apply {
            this.collectViaPaymentLink = collectViaPaymentLink
        }

        /**
         * Where a downgrade credit goes. Only invoice-led subscriptions read it. The default is
         * `customer_balance`.
         */
        fun credit(credit: Credit?) = credit(JsonField.ofNullable(credit))

        /**
         * Sets [Builder.credit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.credit] with a well-typed [Credit] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun credit(credit: JsonField<Credit>) = apply { this.credit = credit }

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

        /** The invoice of a plan change billed now. Only invoice-led subscriptions read it. */
        fun invoice(invoice: Invoice?) = invoice(JsonField.ofNullable(invoice))

        /**
         * Sets [Builder.invoice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoice] with a well-typed [Invoice] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun invoice(invoice: JsonField<Invoice>) = apply { this.invoice = invoice }

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
         * With `effective_at: next_billing_date`, the plan change payment replaces the renewal
         * payment. If that payment fails with `prevent_change`, the plan change is cancelled. The
         * subscription then renews on the current plan, with the usual payment retries.
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

        /**
         * The URL that receives the customer after they pay the payment link. Needs
         * `collect_via_payment_link: true`. Without it, the request gets a `422`. A change that
         * collects no money issues no link and does not use the URL. The preview route validates
         * this field but does not use it.
         *
         * The redirect adds `subscription_id`, `payment_id` and `status`. The `status` value is the
         * status of the plan-change payment. It is not the status of the subscription. When that
         * payment fails, the subscription stays active on its current plan. To try again, call this
         * endpoint again to get a new link. The new plan can apply after the redirect, when the
         * payment webhook arrives.
         */
        fun returnUrl(returnUrl: String?) = returnUrl(JsonField.ofNullable(returnUrl))

        /**
         * Sets [Builder.returnUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.returnUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun returnUrl(returnUrl: JsonField<String>) = apply { this.returnUrl = returnUrl }

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
                cancelOlderPaymentLink,
                cancelScheduledChangePlan,
                collectViaPaymentLink,
                credit,
                discountCode,
                (discountCodes ?: JsonMissing.of()).map { it.toImmutable() },
                effectiveAt,
                invoice,
                metadata,
                onPaymentFailure,
                returnUrl,
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
        cancelOlderPaymentLink()
        cancelScheduledChangePlan()
        collectViaPaymentLink()
        credit()?.validate()
        discountCode()
        discountCodes()
        effectiveAt()?.validate()
        invoice()?.validate()
        metadata()?.validate()
        onPaymentFailure()?.validate()
        returnUrl()
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
            (if (cancelOlderPaymentLink.asKnown() == null) 0 else 1) +
            (if (cancelScheduledChangePlan.asKnown() == null) 0 else 1) +
            (if (collectViaPaymentLink.asKnown() == null) 0 else 1) +
            (credit.asKnown()?.validity() ?: 0) +
            (if (discountCode.asKnown() == null) 0 else 1) +
            (discountCodes.asKnown()?.size ?: 0) +
            (effectiveAt.asKnown()?.validity() ?: 0) +
            (invoice.asKnown()?.validity() ?: 0) +
            (metadata.asKnown()?.validity() ?: 0) +
            (onPaymentFailure.asKnown()?.validity() ?: 0) +
            (if (returnUrl.asKnown() == null) 0 else 1)

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

            val PRORATED_IMMEDIATELY_KEEP_CYCLE = of("prorated_immediately_keep_cycle")

            fun of(value: String) = ProrationBillingMode(JsonField.of(value))
        }

        /** An enum containing [ProrationBillingMode]'s known values. */
        enum class Known {
            PRORATED_IMMEDIATELY,
            FULL_IMMEDIATELY,
            DIFFERENCE_IMMEDIATELY,
            DO_NOT_BILL,
            PRORATED_IMMEDIATELY_KEEP_CYCLE,
        }

        /**
         * An enum containing [ProrationBillingMode]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [ProrationBillingMode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PRORATED_IMMEDIATELY,
            FULL_IMMEDIATELY,
            DIFFERENCE_IMMEDIATELY,
            DO_NOT_BILL,
            PRORATED_IMMEDIATELY_KEEP_CYCLE,
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
                PRORATED_IMMEDIATELY_KEEP_CYCLE -> Value.PRORATED_IMMEDIATELY_KEEP_CYCLE
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
                PRORATED_IMMEDIATELY_KEEP_CYCLE -> Known.PRORATED_IMMEDIATELY_KEEP_CYCLE
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
     * Where a downgrade credit goes. Only invoice-led subscriptions read it. The default is
     * `customer_balance`.
     */
    class Credit @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val CUSTOMER_BALANCE = of("customer_balance")

            val REFUND = of("refund")

            fun of(value: String) = Credit(JsonField.of(value))
        }

        /** An enum containing [Credit]'s known values. */
        enum class Known {
            CUSTOMER_BALANCE,
            REFUND,
        }

        /**
         * An enum containing [Credit]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Credit] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CUSTOMER_BALANCE,
            REFUND,
            /** An enum member indicating that [Credit] was instantiated with an unknown value. */
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
                CUSTOMER_BALANCE -> Value.CUSTOMER_BALANCE
                REFUND -> Value.REFUND
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
                CUSTOMER_BALANCE -> Known.CUSTOMER_BALANCE
                REFUND -> Known.REFUND
                else -> throw DodoPaymentsInvalidDataException("Unknown Credit: $value")
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
        fun validate(): Credit = apply {
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

            return other is Credit && value == other.value
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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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

    /** The invoice of a plan change billed now. Only invoice-led subscriptions read it. */
    class Invoice
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val collectionMethod: JsonField<CollectionMethod>,
        private val finalize: JsonField<Boolean>,
        private val paymentTerms: JsonField<PaymentTerms>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("collection_method")
            @ExcludeMissing
            collectionMethod: JsonField<CollectionMethod> = JsonMissing.of(),
            @JsonProperty("finalize")
            @ExcludeMissing
            finalize: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("payment_terms")
            @ExcludeMissing
            paymentTerms: JsonField<PaymentTerms> = JsonMissing.of(),
        ) : this(collectionMethod, finalize, paymentTerms, mutableMapOf())

        /**
         * The collection method of the invoice. The subscription value applies when absent.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun collectionMethod(): CollectionMethod? =
            collectionMethod.getNullable("collection_method")

        /**
         * `false` keeps the invoice as a draft for review. Default `true`.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun finalize(): Boolean? = finalize.getNullable("finalize")

        /**
         * The terms of the plan-change invoice. The subscription terms apply when absent.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun paymentTerms(): PaymentTerms? = paymentTerms.getNullable("payment_terms")

        /**
         * Returns the raw JSON value of [collectionMethod].
         *
         * Unlike [collectionMethod], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("collection_method")
        @ExcludeMissing
        fun _collectionMethod(): JsonField<CollectionMethod> = collectionMethod

        /**
         * Returns the raw JSON value of [finalize].
         *
         * Unlike [finalize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("finalize") @ExcludeMissing fun _finalize(): JsonField<Boolean> = finalize

        /**
         * Returns the raw JSON value of [paymentTerms].
         *
         * Unlike [paymentTerms], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("payment_terms")
        @ExcludeMissing
        fun _paymentTerms(): JsonField<PaymentTerms> = paymentTerms

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

            /** Returns a mutable builder for constructing an instance of [Invoice]. */
            fun builder() = Builder()
        }

        /** A builder for [Invoice]. */
        class Builder internal constructor() {

            private var collectionMethod: JsonField<CollectionMethod> = JsonMissing.of()
            private var finalize: JsonField<Boolean> = JsonMissing.of()
            private var paymentTerms: JsonField<PaymentTerms> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(invoice: Invoice) = apply {
                collectionMethod = invoice.collectionMethod
                finalize = invoice.finalize
                paymentTerms = invoice.paymentTerms
                additionalProperties = invoice.additionalProperties.toMutableMap()
            }

            /** The collection method of the invoice. The subscription value applies when absent. */
            fun collectionMethod(collectionMethod: CollectionMethod?) =
                collectionMethod(JsonField.ofNullable(collectionMethod))

            /**
             * Sets [Builder.collectionMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.collectionMethod] with a well-typed
             * [CollectionMethod] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun collectionMethod(collectionMethod: JsonField<CollectionMethod>) = apply {
                this.collectionMethod = collectionMethod
            }

            /** `false` keeps the invoice as a draft for review. Default `true`. */
            fun finalize(finalize: Boolean) = finalize(JsonField.of(finalize))

            /**
             * Sets [Builder.finalize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.finalize] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun finalize(finalize: JsonField<Boolean>) = apply { this.finalize = finalize }

            /** The terms of the plan-change invoice. The subscription terms apply when absent. */
            fun paymentTerms(paymentTerms: PaymentTerms?) =
                paymentTerms(JsonField.ofNullable(paymentTerms))

            /**
             * Sets [Builder.paymentTerms] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentTerms] with a well-typed [PaymentTerms] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun paymentTerms(paymentTerms: JsonField<PaymentTerms>) = apply {
                this.paymentTerms = paymentTerms
            }

            /** Alias for calling [paymentTerms] with `PaymentTerms.ofDueOnReceipt()`. */
            fun paymentTermsDueOnReceipt() = paymentTerms(PaymentTerms.ofDueOnReceipt())

            /** Alias for calling [paymentTerms] with `PaymentTerms.ofNet(net)`. */
            fun paymentTerms(net: PaymentTerms.Net) = paymentTerms(PaymentTerms.ofNet(net))

            /**
             * Alias for calling [paymentTerms] with the following:
             * ```kotlin
             * PaymentTerms.Net.builder()
             *     .days(days)
             *     .build()
             * ```
             */
            fun netPaymentTerms(days: Int) =
                paymentTerms(PaymentTerms.Net.builder().days(days).build())

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
             * Returns an immutable instance of [Invoice].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Invoice =
                Invoice(
                    collectionMethod,
                    finalize,
                    paymentTerms,
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
        fun validate(): Invoice = apply {
            if (validated) {
                return@apply
            }

            collectionMethod()?.validate()
            finalize()
            paymentTerms()?.validate()
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
            (collectionMethod.asKnown()?.validity() ?: 0) +
                (if (finalize.asKnown() == null) 0 else 1) +
                (paymentTerms.asKnown()?.validity() ?: 0)

        /** The terms of the plan-change invoice. The subscription terms apply when absent. */
        @JsonDeserialize(using = PaymentTerms.Deserializer::class)
        @JsonSerialize(using = PaymentTerms.Serializer::class)
        class PaymentTerms
        private constructor(
            private val dueOnReceipt: JsonValue? = null,
            private val net: Net? = null,
            private val _json: JsonValue? = null,
        ) {

            fun dueOnReceipt(): JsonValue? = dueOnReceipt

            fun net(): Net? = net

            fun isDueOnReceipt(): Boolean = dueOnReceipt != null

            fun isNet(): Boolean = net != null

            fun asDueOnReceipt(): JsonValue = dueOnReceipt.getOrThrow("dueOnReceipt")

            fun asNet(): Net = net.getOrThrow("net")

            fun _json(): JsonValue? = _json

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```kotlin
             * import com.dodopayments.api.core.JsonValue
             *
             * val result: String? = paymentTerms.accept(object : PaymentTerms.Visitor<String?> {
             *     override fun visitDueOnReceipt(dueOnReceipt: JsonValue): String? = dueOnReceipt.toString()
             *
             *     // ...
             *
             *     override fun unknown(json: JsonValue?): String? {
             *         // Or inspect the `json`.
             *         return null
             *     }
             * })
             * ```
             *
             * @throws DodoPaymentsInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    dueOnReceipt != null -> visitor.visitDueOnReceipt(dueOnReceipt)
                    net != null -> visitor.visitNet(net)
                    else -> visitor.unknown(_json)
                }

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
            fun validate(): PaymentTerms = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitDueOnReceipt(dueOnReceipt: JsonValue) {
                            dueOnReceipt.let {
                                if (it != JsonValue.from(mapOf("type" to "due_on_receipt"))) {
                                    throw DodoPaymentsInvalidDataException(
                                        "'dueOnReceipt' is invalid, received $it"
                                    )
                                }
                            }
                        }

                        override fun visitNet(net: Net) {
                            net.validate()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                accept(
                    object : Visitor<Int> {
                        override fun visitDueOnReceipt(dueOnReceipt: JsonValue) =
                            dueOnReceipt.let {
                                if (it == JsonValue.from(mapOf("type" to "due_on_receipt"))) 1
                                else 0
                            }

                        override fun visitNet(net: Net) = net.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PaymentTerms &&
                    dueOnReceipt == other.dueOnReceipt &&
                    net == other.net
            }

            override fun hashCode(): Int = Objects.hash(dueOnReceipt, net)

            override fun toString(): String =
                when {
                    dueOnReceipt != null -> "PaymentTerms{dueOnReceipt=$dueOnReceipt}"
                    net != null -> "PaymentTerms{net=$net}"
                    _json != null -> "PaymentTerms{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid PaymentTerms")
                }

            companion object {

                fun ofDueOnReceipt() =
                    PaymentTerms(dueOnReceipt = JsonValue.from(mapOf("type" to "due_on_receipt")))

                fun ofNet(net: Net) = PaymentTerms(net = net)
            }

            /**
             * An interface that defines how to map each variant of [PaymentTerms] to a value of
             * type [T].
             */
            interface Visitor<out T> {

                fun visitDueOnReceipt(dueOnReceipt: JsonValue): T

                fun visitNet(net: Net): T

                /**
                 * Maps an unknown variant of [PaymentTerms] to a value of type [T].
                 *
                 * An instance of [PaymentTerms] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws DodoPaymentsInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw DodoPaymentsInvalidDataException("Unknown PaymentTerms: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<PaymentTerms>(PaymentTerms::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): PaymentTerms {
                    val json = JsonValue.fromJsonNode(node)
                    val type = json.asObject()?.get("type")?.asString()

                    when (type) {
                        "due_on_receipt" -> {
                            return tryDeserialize(node, jacksonTypeRef<JsonValue>())
                                ?.let { PaymentTerms(dueOnReceipt = it, _json = json) }
                                ?.takeIf { it.isValid() } ?: PaymentTerms(_json = json)
                        }
                        "net" -> {
                            return tryDeserialize(node, jacksonTypeRef<Net>())?.let {
                                PaymentTerms(net = it, _json = json)
                            } ?: PaymentTerms(_json = json)
                        }
                    }

                    return PaymentTerms(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<PaymentTerms>(PaymentTerms::class) {

                override fun serialize(
                    value: PaymentTerms,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.dueOnReceipt != null -> generator.writeObject(value.dueOnReceipt)
                        value.net != null -> generator.writeObject(value.net)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid PaymentTerms")
                    }
                }
            }

            class Net
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val days: JsonField<Int>,
                private val type: JsonValue,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("days") @ExcludeMissing days: JsonField<Int> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                ) : this(days, type, mutableMapOf())

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun days(): Int = days.getRequired("days")

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("net")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                /**
                 * Returns the raw JSON value of [days].
                 *
                 * Unlike [days], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("days") @ExcludeMissing fun _days(): JsonField<Int> = days

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
                     * Returns a mutable builder for constructing an instance of [Net].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .days()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Net]. */
                class Builder internal constructor() {

                    private var days: JsonField<Int>? = null
                    private var type: JsonValue = JsonValue.from("net")
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(net: Net) = apply {
                        days = net.days
                        type = net.type
                        additionalProperties = net.additionalProperties.toMutableMap()
                    }

                    fun days(days: Int) = days(JsonField.of(days))

                    /**
                     * Sets [Builder.days] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.days] with a well-typed [Int] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun days(days: JsonField<Int>) = apply { this.days = days }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("net")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

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
                     * Returns an immutable instance of [Net].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .days()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Net =
                        Net(checkRequired("days", days), type, additionalProperties.toMutableMap())
                }

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
                fun validate(): Net = apply {
                    if (validated) {
                        return@apply
                    }

                    days()
                    _type().let {
                        if (it != JsonValue.from("net")) {
                            throw DodoPaymentsInvalidDataException(
                                "'type' is invalid, received $it"
                            )
                        }
                    }
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
                    (if (days.asKnown() == null) 0 else 1) +
                        type.let { if (it == JsonValue.from("net")) 1 else 0 }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Net &&
                        days == other.days &&
                        type == other.type &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(days, type, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Net{days=$days, type=$type, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Invoice &&
                collectionMethod == other.collectionMethod &&
                finalize == other.finalize &&
                paymentTerms == other.paymentTerms &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(collectionMethod, finalize, paymentTerms, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Invoice{collectionMethod=$collectionMethod, finalize=$finalize, paymentTerms=$paymentTerms, additionalProperties=$additionalProperties}"
    }

    /**
     * Controls behavior when the plan change payment fails.
     * - `prevent_change`: Keep subscription on current plan until payment succeeds
     * - `apply_change` (default): Apply plan change immediately regardless of payment outcome
     *
     * With `effective_at: next_billing_date`, the plan change payment replaces the renewal payment.
     * If that payment fails with `prevent_change`, the plan change is cancelled. The subscription
     * then renews on the current plan, with the usual payment retries.
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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
            cancelOlderPaymentLink == other.cancelOlderPaymentLink &&
            cancelScheduledChangePlan == other.cancelScheduledChangePlan &&
            collectViaPaymentLink == other.collectViaPaymentLink &&
            credit == other.credit &&
            discountCode == other.discountCode &&
            discountCodes == other.discountCodes &&
            effectiveAt == other.effectiveAt &&
            invoice == other.invoice &&
            metadata == other.metadata &&
            onPaymentFailure == other.onPaymentFailure &&
            returnUrl == other.returnUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            productId,
            prorationBillingMode,
            quantity,
            adaptiveCurrencyFeesInclusive,
            addons,
            cancelOlderPaymentLink,
            cancelScheduledChangePlan,
            collectViaPaymentLink,
            credit,
            discountCode,
            discountCodes,
            effectiveAt,
            invoice,
            metadata,
            onPaymentFailure,
            returnUrl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UpdateSubscriptionPlanReq{productId=$productId, prorationBillingMode=$prorationBillingMode, quantity=$quantity, adaptiveCurrencyFeesInclusive=$adaptiveCurrencyFeesInclusive, addons=$addons, cancelOlderPaymentLink=$cancelOlderPaymentLink, cancelScheduledChangePlan=$cancelScheduledChangePlan, collectViaPaymentLink=$collectViaPaymentLink, credit=$credit, discountCode=$discountCode, discountCodes=$discountCodes, effectiveAt=$effectiveAt, invoice=$invoice, metadata=$metadata, onPaymentFailure=$onPaymentFailure, returnUrl=$returnUrl, additionalProperties=$additionalProperties}"
}
