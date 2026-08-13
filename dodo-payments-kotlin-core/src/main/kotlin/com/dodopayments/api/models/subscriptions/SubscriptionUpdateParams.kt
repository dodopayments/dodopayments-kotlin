// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.Enum
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
import com.dodopayments.api.models.misc.Metadata
import com.dodopayments.api.models.payments.BillingAddress
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class SubscriptionUpdateParams
private constructor(
    private val subscriptionId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun subscriptionId(): String? = subscriptionId

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun billing(): BillingAddress? = body.billing()

    /**
     * When set, the subscription will remain active until the end of billing period
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun cancelAtNextBillingDate(): Boolean? = body.cancelAtNextBillingDate()

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun cancelReason(): CancelReason? = body.cancelReason()

    /**
     * Free-text cancellation comment (only valid when cancelling or scheduling cancellation).
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun cancellationComment(): String? = body.cancellationComment()

    /**
     * Customer-supplied churn reason (only valid when cancelling or scheduling cancellation).
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun cancellationFeedback(): CancellationFeedback? = body.cancellationFeedback()

    /**
     * Update credit entitlement cart settings
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun creditEntitlementCart(): List<CreditEntitlementCart>? = body.creditEntitlementCart()

    /**
     * Optional business / legal name associated with the tax id. When provided together with a
     * valid tax id for a B2B subscription, this name is rendered on the invoice instead of the
     * customer's personal name. Send `null` to explicitly clear the business name.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun customerBusinessName(): String? = body.customerBusinessName()

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun customerName(): String? = body.customerName()

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun disableOnDemand(): DisableOnDemand? = body.disableOnDemand()

    /**
     * Arbitrary key-value metadata. Values can be string, integer, number, or boolean.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun metadata(): Metadata? = body.metadata()

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun nextBillingDate(): OffsetDateTime? = body.nextBillingDate()

    /**
     * `Some(true)` pauses an active subscription; `Some(false)` unpauses a `Paused` (or abandoned
     * `OnHold`) subscription. Exclusive of every other field.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun pause(): Boolean? = body.pause()

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): SubscriptionStatus? = body.status()

    /**
     * New number of `subscription_period_interval` units the subscription entitlement should span.
     * Used together with `subscription_period_interval` to extend the subscription period. The
     * resulting period must not be shorter than the current one (this endpoint only extends).
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun subscriptionPeriodCount(): Int? = body.subscriptionPeriodCount()

    /**
     * New interval unit for the subscription period. When changing the period, this may be supplied
     * alongside `subscription_period_count`; if omitted the existing interval is retained.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun subscriptionPeriodInterval(): TimeInterval? = body.subscriptionPeriodInterval()

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun taxId(): String? = body.taxId()

    /**
     * Returns the raw JSON value of [billing].
     *
     * Unlike [billing], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _billing(): JsonField<BillingAddress> = body._billing()

    /**
     * Returns the raw JSON value of [cancelAtNextBillingDate].
     *
     * Unlike [cancelAtNextBillingDate], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _cancelAtNextBillingDate(): JsonField<Boolean> = body._cancelAtNextBillingDate()

    /**
     * Returns the raw JSON value of [cancelReason].
     *
     * Unlike [cancelReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _cancelReason(): JsonField<CancelReason> = body._cancelReason()

    /**
     * Returns the raw JSON value of [cancellationComment].
     *
     * Unlike [cancellationComment], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _cancellationComment(): JsonField<String> = body._cancellationComment()

    /**
     * Returns the raw JSON value of [cancellationFeedback].
     *
     * Unlike [cancellationFeedback], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _cancellationFeedback(): JsonField<CancellationFeedback> = body._cancellationFeedback()

    /**
     * Returns the raw JSON value of [creditEntitlementCart].
     *
     * Unlike [creditEntitlementCart], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _creditEntitlementCart(): JsonField<List<CreditEntitlementCart>> =
        body._creditEntitlementCart()

    /**
     * Returns the raw JSON value of [customerBusinessName].
     *
     * Unlike [customerBusinessName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _customerBusinessName(): JsonField<String> = body._customerBusinessName()

    /**
     * Returns the raw JSON value of [customerName].
     *
     * Unlike [customerName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customerName(): JsonField<String> = body._customerName()

    /**
     * Returns the raw JSON value of [disableOnDemand].
     *
     * Unlike [disableOnDemand], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _disableOnDemand(): JsonField<DisableOnDemand> = body._disableOnDemand()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [nextBillingDate].
     *
     * Unlike [nextBillingDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _nextBillingDate(): JsonField<OffsetDateTime> = body._nextBillingDate()

    /**
     * Returns the raw JSON value of [pause].
     *
     * Unlike [pause], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pause(): JsonField<Boolean> = body._pause()

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _status(): JsonField<SubscriptionStatus> = body._status()

    /**
     * Returns the raw JSON value of [subscriptionPeriodCount].
     *
     * Unlike [subscriptionPeriodCount], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _subscriptionPeriodCount(): JsonField<Int> = body._subscriptionPeriodCount()

    /**
     * Returns the raw JSON value of [subscriptionPeriodInterval].
     *
     * Unlike [subscriptionPeriodInterval], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _subscriptionPeriodInterval(): JsonField<TimeInterval> = body._subscriptionPeriodInterval()

    /**
     * Returns the raw JSON value of [taxId].
     *
     * Unlike [taxId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _taxId(): JsonField<String> = body._taxId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): SubscriptionUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [SubscriptionUpdateParams]. */
        fun builder() = Builder()
    }

    /** A builder for [SubscriptionUpdateParams]. */
    class Builder internal constructor() {

        private var subscriptionId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(subscriptionUpdateParams: SubscriptionUpdateParams) = apply {
            subscriptionId = subscriptionUpdateParams.subscriptionId
            body = subscriptionUpdateParams.body.toBuilder()
            additionalHeaders = subscriptionUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = subscriptionUpdateParams.additionalQueryParams.toBuilder()
        }

        fun subscriptionId(subscriptionId: String?) = apply { this.subscriptionId = subscriptionId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [billing]
         * - [cancelAtNextBillingDate]
         * - [cancelReason]
         * - [cancellationComment]
         * - [cancellationFeedback]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun billing(billing: BillingAddress?) = apply { body.billing(billing) }

        /**
         * Sets [Builder.billing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billing] with a well-typed [BillingAddress] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billing(billing: JsonField<BillingAddress>) = apply { body.billing(billing) }

        /** When set, the subscription will remain active until the end of billing period */
        fun cancelAtNextBillingDate(cancelAtNextBillingDate: Boolean?) = apply {
            body.cancelAtNextBillingDate(cancelAtNextBillingDate)
        }

        /**
         * Alias for [Builder.cancelAtNextBillingDate].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun cancelAtNextBillingDate(cancelAtNextBillingDate: Boolean) =
            cancelAtNextBillingDate(cancelAtNextBillingDate as Boolean?)

        /**
         * Sets [Builder.cancelAtNextBillingDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cancelAtNextBillingDate] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun cancelAtNextBillingDate(cancelAtNextBillingDate: JsonField<Boolean>) = apply {
            body.cancelAtNextBillingDate(cancelAtNextBillingDate)
        }

        fun cancelReason(cancelReason: CancelReason?) = apply { body.cancelReason(cancelReason) }

        /**
         * Sets [Builder.cancelReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cancelReason] with a well-typed [CancelReason] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cancelReason(cancelReason: JsonField<CancelReason>) = apply {
            body.cancelReason(cancelReason)
        }

        /**
         * Free-text cancellation comment (only valid when cancelling or scheduling cancellation).
         */
        fun cancellationComment(cancellationComment: String?) = apply {
            body.cancellationComment(cancellationComment)
        }

        /**
         * Sets [Builder.cancellationComment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cancellationComment] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cancellationComment(cancellationComment: JsonField<String>) = apply {
            body.cancellationComment(cancellationComment)
        }

        /**
         * Customer-supplied churn reason (only valid when cancelling or scheduling cancellation).
         */
        fun cancellationFeedback(cancellationFeedback: CancellationFeedback?) = apply {
            body.cancellationFeedback(cancellationFeedback)
        }

        /**
         * Sets [Builder.cancellationFeedback] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cancellationFeedback] with a well-typed
         * [CancellationFeedback] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun cancellationFeedback(cancellationFeedback: JsonField<CancellationFeedback>) = apply {
            body.cancellationFeedback(cancellationFeedback)
        }

        /** Update credit entitlement cart settings */
        fun creditEntitlementCart(creditEntitlementCart: List<CreditEntitlementCart>?) = apply {
            body.creditEntitlementCart(creditEntitlementCart)
        }

        /**
         * Sets [Builder.creditEntitlementCart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditEntitlementCart] with a well-typed
         * `List<CreditEntitlementCart>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun creditEntitlementCart(creditEntitlementCart: JsonField<List<CreditEntitlementCart>>) =
            apply {
                body.creditEntitlementCart(creditEntitlementCart)
            }

        /**
         * Adds a single [CreditEntitlementCart] to [Builder.creditEntitlementCart].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCreditEntitlementCart(creditEntitlementCart: CreditEntitlementCart) = apply {
            body.addCreditEntitlementCart(creditEntitlementCart)
        }

        /**
         * Optional business / legal name associated with the tax id. When provided together with a
         * valid tax id for a B2B subscription, this name is rendered on the invoice instead of the
         * customer's personal name. Send `null` to explicitly clear the business name.
         */
        fun customerBusinessName(customerBusinessName: String?) = apply {
            body.customerBusinessName(customerBusinessName)
        }

        /**
         * Sets [Builder.customerBusinessName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerBusinessName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customerBusinessName(customerBusinessName: JsonField<String>) = apply {
            body.customerBusinessName(customerBusinessName)
        }

        fun customerName(customerName: String?) = apply { body.customerName(customerName) }

        /**
         * Sets [Builder.customerName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerName(customerName: JsonField<String>) = apply {
            body.customerName(customerName)
        }

        fun disableOnDemand(disableOnDemand: DisableOnDemand?) = apply {
            body.disableOnDemand(disableOnDemand)
        }

        /**
         * Sets [Builder.disableOnDemand] to an arbitrary JSON value.
         *
         * You should usually call [Builder.disableOnDemand] with a well-typed [DisableOnDemand]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun disableOnDemand(disableOnDemand: JsonField<DisableOnDemand>) = apply {
            body.disableOnDemand(disableOnDemand)
        }

        /** Arbitrary key-value metadata. Values can be string, integer, number, or boolean. */
        fun metadata(metadata: Metadata?) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        fun nextBillingDate(nextBillingDate: OffsetDateTime?) = apply {
            body.nextBillingDate(nextBillingDate)
        }

        /**
         * Sets [Builder.nextBillingDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextBillingDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun nextBillingDate(nextBillingDate: JsonField<OffsetDateTime>) = apply {
            body.nextBillingDate(nextBillingDate)
        }

        /**
         * `Some(true)` pauses an active subscription; `Some(false)` unpauses a `Paused` (or
         * abandoned `OnHold`) subscription. Exclusive of every other field.
         */
        fun pause(pause: Boolean?) = apply { body.pause(pause) }

        /**
         * Alias for [Builder.pause].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pause(pause: Boolean) = pause(pause as Boolean?)

        /**
         * Sets [Builder.pause] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pause] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pause(pause: JsonField<Boolean>) = apply { body.pause(pause) }

        fun status(status: SubscriptionStatus?) = apply { body.status(status) }

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [SubscriptionStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<SubscriptionStatus>) = apply { body.status(status) }

        /**
         * New number of `subscription_period_interval` units the subscription entitlement should
         * span. Used together with `subscription_period_interval` to extend the subscription
         * period. The resulting period must not be shorter than the current one (this endpoint only
         * extends).
         */
        fun subscriptionPeriodCount(subscriptionPeriodCount: Int?) = apply {
            body.subscriptionPeriodCount(subscriptionPeriodCount)
        }

        /**
         * Alias for [Builder.subscriptionPeriodCount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun subscriptionPeriodCount(subscriptionPeriodCount: Int) =
            subscriptionPeriodCount(subscriptionPeriodCount as Int?)

        /**
         * Sets [Builder.subscriptionPeriodCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionPeriodCount] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscriptionPeriodCount(subscriptionPeriodCount: JsonField<Int>) = apply {
            body.subscriptionPeriodCount(subscriptionPeriodCount)
        }

        /**
         * New interval unit for the subscription period. When changing the period, this may be
         * supplied alongside `subscription_period_count`; if omitted the existing interval is
         * retained.
         */
        fun subscriptionPeriodInterval(subscriptionPeriodInterval: TimeInterval?) = apply {
            body.subscriptionPeriodInterval(subscriptionPeriodInterval)
        }

        /**
         * Sets [Builder.subscriptionPeriodInterval] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionPeriodInterval] with a well-typed
         * [TimeInterval] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun subscriptionPeriodInterval(subscriptionPeriodInterval: JsonField<TimeInterval>) =
            apply {
                body.subscriptionPeriodInterval(subscriptionPeriodInterval)
            }

        fun taxId(taxId: String?) = apply { body.taxId(taxId) }

        /**
         * Sets [Builder.taxId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun taxId(taxId: JsonField<String>) = apply { body.taxId(taxId) }

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
         * Returns an immutable instance of [SubscriptionUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SubscriptionUpdateParams =
            SubscriptionUpdateParams(
                subscriptionId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> subscriptionId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val billing: JsonField<BillingAddress>,
        private val cancelAtNextBillingDate: JsonField<Boolean>,
        private val cancelReason: JsonField<CancelReason>,
        private val cancellationComment: JsonField<String>,
        private val cancellationFeedback: JsonField<CancellationFeedback>,
        private val creditEntitlementCart: JsonField<List<CreditEntitlementCart>>,
        private val customerBusinessName: JsonField<String>,
        private val customerName: JsonField<String>,
        private val disableOnDemand: JsonField<DisableOnDemand>,
        private val metadata: JsonField<Metadata>,
        private val nextBillingDate: JsonField<OffsetDateTime>,
        private val pause: JsonField<Boolean>,
        private val status: JsonField<SubscriptionStatus>,
        private val subscriptionPeriodCount: JsonField<Int>,
        private val subscriptionPeriodInterval: JsonField<TimeInterval>,
        private val taxId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("billing")
            @ExcludeMissing
            billing: JsonField<BillingAddress> = JsonMissing.of(),
            @JsonProperty("cancel_at_next_billing_date")
            @ExcludeMissing
            cancelAtNextBillingDate: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("cancel_reason")
            @ExcludeMissing
            cancelReason: JsonField<CancelReason> = JsonMissing.of(),
            @JsonProperty("cancellation_comment")
            @ExcludeMissing
            cancellationComment: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cancellation_feedback")
            @ExcludeMissing
            cancellationFeedback: JsonField<CancellationFeedback> = JsonMissing.of(),
            @JsonProperty("credit_entitlement_cart")
            @ExcludeMissing
            creditEntitlementCart: JsonField<List<CreditEntitlementCart>> = JsonMissing.of(),
            @JsonProperty("customer_business_name")
            @ExcludeMissing
            customerBusinessName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer_name")
            @ExcludeMissing
            customerName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("disable_on_demand")
            @ExcludeMissing
            disableOnDemand: JsonField<DisableOnDemand> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("next_billing_date")
            @ExcludeMissing
            nextBillingDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("pause") @ExcludeMissing pause: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("status")
            @ExcludeMissing
            status: JsonField<SubscriptionStatus> = JsonMissing.of(),
            @JsonProperty("subscription_period_count")
            @ExcludeMissing
            subscriptionPeriodCount: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("subscription_period_interval")
            @ExcludeMissing
            subscriptionPeriodInterval: JsonField<TimeInterval> = JsonMissing.of(),
            @JsonProperty("tax_id") @ExcludeMissing taxId: JsonField<String> = JsonMissing.of(),
        ) : this(
            billing,
            cancelAtNextBillingDate,
            cancelReason,
            cancellationComment,
            cancellationFeedback,
            creditEntitlementCart,
            customerBusinessName,
            customerName,
            disableOnDemand,
            metadata,
            nextBillingDate,
            pause,
            status,
            subscriptionPeriodCount,
            subscriptionPeriodInterval,
            taxId,
            mutableMapOf(),
        )

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun billing(): BillingAddress? = billing.getNullable("billing")

        /**
         * When set, the subscription will remain active until the end of billing period
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun cancelAtNextBillingDate(): Boolean? =
            cancelAtNextBillingDate.getNullable("cancel_at_next_billing_date")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun cancelReason(): CancelReason? = cancelReason.getNullable("cancel_reason")

        /**
         * Free-text cancellation comment (only valid when cancelling or scheduling cancellation).
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun cancellationComment(): String? = cancellationComment.getNullable("cancellation_comment")

        /**
         * Customer-supplied churn reason (only valid when cancelling or scheduling cancellation).
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun cancellationFeedback(): CancellationFeedback? =
            cancellationFeedback.getNullable("cancellation_feedback")

        /**
         * Update credit entitlement cart settings
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun creditEntitlementCart(): List<CreditEntitlementCart>? =
            creditEntitlementCart.getNullable("credit_entitlement_cart")

        /**
         * Optional business / legal name associated with the tax id. When provided together with a
         * valid tax id for a B2B subscription, this name is rendered on the invoice instead of the
         * customer's personal name. Send `null` to explicitly clear the business name.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun customerBusinessName(): String? =
            customerBusinessName.getNullable("customer_business_name")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun customerName(): String? = customerName.getNullable("customer_name")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun disableOnDemand(): DisableOnDemand? = disableOnDemand.getNullable("disable_on_demand")

        /**
         * Arbitrary key-value metadata. Values can be string, integer, number, or boolean.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun nextBillingDate(): OffsetDateTime? = nextBillingDate.getNullable("next_billing_date")

        /**
         * `Some(true)` pauses an active subscription; `Some(false)` unpauses a `Paused` (or
         * abandoned `OnHold`) subscription. Exclusive of every other field.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun pause(): Boolean? = pause.getNullable("pause")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun status(): SubscriptionStatus? = status.getNullable("status")

        /**
         * New number of `subscription_period_interval` units the subscription entitlement should
         * span. Used together with `subscription_period_interval` to extend the subscription
         * period. The resulting period must not be shorter than the current one (this endpoint only
         * extends).
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun subscriptionPeriodCount(): Int? =
            subscriptionPeriodCount.getNullable("subscription_period_count")

        /**
         * New interval unit for the subscription period. When changing the period, this may be
         * supplied alongside `subscription_period_count`; if omitted the existing interval is
         * retained.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun subscriptionPeriodInterval(): TimeInterval? =
            subscriptionPeriodInterval.getNullable("subscription_period_interval")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun taxId(): String? = taxId.getNullable("tax_id")

        /**
         * Returns the raw JSON value of [billing].
         *
         * Unlike [billing], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("billing") @ExcludeMissing fun _billing(): JsonField<BillingAddress> = billing

        /**
         * Returns the raw JSON value of [cancelAtNextBillingDate].
         *
         * Unlike [cancelAtNextBillingDate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("cancel_at_next_billing_date")
        @ExcludeMissing
        fun _cancelAtNextBillingDate(): JsonField<Boolean> = cancelAtNextBillingDate

        /**
         * Returns the raw JSON value of [cancelReason].
         *
         * Unlike [cancelReason], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("cancel_reason")
        @ExcludeMissing
        fun _cancelReason(): JsonField<CancelReason> = cancelReason

        /**
         * Returns the raw JSON value of [cancellationComment].
         *
         * Unlike [cancellationComment], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("cancellation_comment")
        @ExcludeMissing
        fun _cancellationComment(): JsonField<String> = cancellationComment

        /**
         * Returns the raw JSON value of [cancellationFeedback].
         *
         * Unlike [cancellationFeedback], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("cancellation_feedback")
        @ExcludeMissing
        fun _cancellationFeedback(): JsonField<CancellationFeedback> = cancellationFeedback

        /**
         * Returns the raw JSON value of [creditEntitlementCart].
         *
         * Unlike [creditEntitlementCart], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("credit_entitlement_cart")
        @ExcludeMissing
        fun _creditEntitlementCart(): JsonField<List<CreditEntitlementCart>> = creditEntitlementCart

        /**
         * Returns the raw JSON value of [customerBusinessName].
         *
         * Unlike [customerBusinessName], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("customer_business_name")
        @ExcludeMissing
        fun _customerBusinessName(): JsonField<String> = customerBusinessName

        /**
         * Returns the raw JSON value of [customerName].
         *
         * Unlike [customerName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("customer_name")
        @ExcludeMissing
        fun _customerName(): JsonField<String> = customerName

        /**
         * Returns the raw JSON value of [disableOnDemand].
         *
         * Unlike [disableOnDemand], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("disable_on_demand")
        @ExcludeMissing
        fun _disableOnDemand(): JsonField<DisableOnDemand> = disableOnDemand

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [nextBillingDate].
         *
         * Unlike [nextBillingDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("next_billing_date")
        @ExcludeMissing
        fun _nextBillingDate(): JsonField<OffsetDateTime> = nextBillingDate

        /**
         * Returns the raw JSON value of [pause].
         *
         * Unlike [pause], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pause") @ExcludeMissing fun _pause(): JsonField<Boolean> = pause

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status")
        @ExcludeMissing
        fun _status(): JsonField<SubscriptionStatus> = status

        /**
         * Returns the raw JSON value of [subscriptionPeriodCount].
         *
         * Unlike [subscriptionPeriodCount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("subscription_period_count")
        @ExcludeMissing
        fun _subscriptionPeriodCount(): JsonField<Int> = subscriptionPeriodCount

        /**
         * Returns the raw JSON value of [subscriptionPeriodInterval].
         *
         * Unlike [subscriptionPeriodInterval], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("subscription_period_interval")
        @ExcludeMissing
        fun _subscriptionPeriodInterval(): JsonField<TimeInterval> = subscriptionPeriodInterval

        /**
         * Returns the raw JSON value of [taxId].
         *
         * Unlike [taxId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tax_id") @ExcludeMissing fun _taxId(): JsonField<String> = taxId

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

            private var billing: JsonField<BillingAddress> = JsonMissing.of()
            private var cancelAtNextBillingDate: JsonField<Boolean> = JsonMissing.of()
            private var cancelReason: JsonField<CancelReason> = JsonMissing.of()
            private var cancellationComment: JsonField<String> = JsonMissing.of()
            private var cancellationFeedback: JsonField<CancellationFeedback> = JsonMissing.of()
            private var creditEntitlementCart: JsonField<MutableList<CreditEntitlementCart>>? = null
            private var customerBusinessName: JsonField<String> = JsonMissing.of()
            private var customerName: JsonField<String> = JsonMissing.of()
            private var disableOnDemand: JsonField<DisableOnDemand> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var nextBillingDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var pause: JsonField<Boolean> = JsonMissing.of()
            private var status: JsonField<SubscriptionStatus> = JsonMissing.of()
            private var subscriptionPeriodCount: JsonField<Int> = JsonMissing.of()
            private var subscriptionPeriodInterval: JsonField<TimeInterval> = JsonMissing.of()
            private var taxId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                billing = body.billing
                cancelAtNextBillingDate = body.cancelAtNextBillingDate
                cancelReason = body.cancelReason
                cancellationComment = body.cancellationComment
                cancellationFeedback = body.cancellationFeedback
                creditEntitlementCart = body.creditEntitlementCart.map { it.toMutableList() }
                customerBusinessName = body.customerBusinessName
                customerName = body.customerName
                disableOnDemand = body.disableOnDemand
                metadata = body.metadata
                nextBillingDate = body.nextBillingDate
                pause = body.pause
                status = body.status
                subscriptionPeriodCount = body.subscriptionPeriodCount
                subscriptionPeriodInterval = body.subscriptionPeriodInterval
                taxId = body.taxId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun billing(billing: BillingAddress?) = billing(JsonField.ofNullable(billing))

            /**
             * Sets [Builder.billing] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billing] with a well-typed [BillingAddress] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billing(billing: JsonField<BillingAddress>) = apply { this.billing = billing }

            /** When set, the subscription will remain active until the end of billing period */
            fun cancelAtNextBillingDate(cancelAtNextBillingDate: Boolean?) =
                cancelAtNextBillingDate(JsonField.ofNullable(cancelAtNextBillingDate))

            /**
             * Alias for [Builder.cancelAtNextBillingDate].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun cancelAtNextBillingDate(cancelAtNextBillingDate: Boolean) =
                cancelAtNextBillingDate(cancelAtNextBillingDate as Boolean?)

            /**
             * Sets [Builder.cancelAtNextBillingDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cancelAtNextBillingDate] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun cancelAtNextBillingDate(cancelAtNextBillingDate: JsonField<Boolean>) = apply {
                this.cancelAtNextBillingDate = cancelAtNextBillingDate
            }

            fun cancelReason(cancelReason: CancelReason?) =
                cancelReason(JsonField.ofNullable(cancelReason))

            /**
             * Sets [Builder.cancelReason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cancelReason] with a well-typed [CancelReason] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cancelReason(cancelReason: JsonField<CancelReason>) = apply {
                this.cancelReason = cancelReason
            }

            /**
             * Free-text cancellation comment (only valid when cancelling or scheduling
             * cancellation).
             */
            fun cancellationComment(cancellationComment: String?) =
                cancellationComment(JsonField.ofNullable(cancellationComment))

            /**
             * Sets [Builder.cancellationComment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cancellationComment] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun cancellationComment(cancellationComment: JsonField<String>) = apply {
                this.cancellationComment = cancellationComment
            }

            /**
             * Customer-supplied churn reason (only valid when cancelling or scheduling
             * cancellation).
             */
            fun cancellationFeedback(cancellationFeedback: CancellationFeedback?) =
                cancellationFeedback(JsonField.ofNullable(cancellationFeedback))

            /**
             * Sets [Builder.cancellationFeedback] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cancellationFeedback] with a well-typed
             * [CancellationFeedback] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun cancellationFeedback(cancellationFeedback: JsonField<CancellationFeedback>) =
                apply {
                    this.cancellationFeedback = cancellationFeedback
                }

            /** Update credit entitlement cart settings */
            fun creditEntitlementCart(creditEntitlementCart: List<CreditEntitlementCart>?) =
                creditEntitlementCart(JsonField.ofNullable(creditEntitlementCart))

            /**
             * Sets [Builder.creditEntitlementCart] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditEntitlementCart] with a well-typed
             * `List<CreditEntitlementCart>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun creditEntitlementCart(
                creditEntitlementCart: JsonField<List<CreditEntitlementCart>>
            ) = apply {
                this.creditEntitlementCart = creditEntitlementCart.map { it.toMutableList() }
            }

            /**
             * Adds a single [CreditEntitlementCart] to [Builder.creditEntitlementCart].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCreditEntitlementCart(creditEntitlementCart: CreditEntitlementCart) = apply {
                this.creditEntitlementCart =
                    (this.creditEntitlementCart ?: JsonField.of(mutableListOf())).also {
                        checkKnown("creditEntitlementCart", it).add(creditEntitlementCart)
                    }
            }

            /**
             * Optional business / legal name associated with the tax id. When provided together
             * with a valid tax id for a B2B subscription, this name is rendered on the invoice
             * instead of the customer's personal name. Send `null` to explicitly clear the business
             * name.
             */
            fun customerBusinessName(customerBusinessName: String?) =
                customerBusinessName(JsonField.ofNullable(customerBusinessName))

            /**
             * Sets [Builder.customerBusinessName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerBusinessName] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun customerBusinessName(customerBusinessName: JsonField<String>) = apply {
                this.customerBusinessName = customerBusinessName
            }

            fun customerName(customerName: String?) =
                customerName(JsonField.ofNullable(customerName))

            /**
             * Sets [Builder.customerName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerName(customerName: JsonField<String>) = apply {
                this.customerName = customerName
            }

            fun disableOnDemand(disableOnDemand: DisableOnDemand?) =
                disableOnDemand(JsonField.ofNullable(disableOnDemand))

            /**
             * Sets [Builder.disableOnDemand] to an arbitrary JSON value.
             *
             * You should usually call [Builder.disableOnDemand] with a well-typed [DisableOnDemand]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun disableOnDemand(disableOnDemand: JsonField<DisableOnDemand>) = apply {
                this.disableOnDemand = disableOnDemand
            }

            /** Arbitrary key-value metadata. Values can be string, integer, number, or boolean. */
            fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun nextBillingDate(nextBillingDate: OffsetDateTime?) =
                nextBillingDate(JsonField.ofNullable(nextBillingDate))

            /**
             * Sets [Builder.nextBillingDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nextBillingDate] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun nextBillingDate(nextBillingDate: JsonField<OffsetDateTime>) = apply {
                this.nextBillingDate = nextBillingDate
            }

            /**
             * `Some(true)` pauses an active subscription; `Some(false)` unpauses a `Paused` (or
             * abandoned `OnHold`) subscription. Exclusive of every other field.
             */
            fun pause(pause: Boolean?) = pause(JsonField.ofNullable(pause))

            /**
             * Alias for [Builder.pause].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun pause(pause: Boolean) = pause(pause as Boolean?)

            /**
             * Sets [Builder.pause] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pause] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pause(pause: JsonField<Boolean>) = apply { this.pause = pause }

            fun status(status: SubscriptionStatus?) = status(JsonField.ofNullable(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [SubscriptionStatus] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<SubscriptionStatus>) = apply { this.status = status }

            /**
             * New number of `subscription_period_interval` units the subscription entitlement
             * should span. Used together with `subscription_period_interval` to extend the
             * subscription period. The resulting period must not be shorter than the current one
             * (this endpoint only extends).
             */
            fun subscriptionPeriodCount(subscriptionPeriodCount: Int?) =
                subscriptionPeriodCount(JsonField.ofNullable(subscriptionPeriodCount))

            /**
             * Alias for [Builder.subscriptionPeriodCount].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun subscriptionPeriodCount(subscriptionPeriodCount: Int) =
                subscriptionPeriodCount(subscriptionPeriodCount as Int?)

            /**
             * Sets [Builder.subscriptionPeriodCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriptionPeriodCount] with a well-typed [Int]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun subscriptionPeriodCount(subscriptionPeriodCount: JsonField<Int>) = apply {
                this.subscriptionPeriodCount = subscriptionPeriodCount
            }

            /**
             * New interval unit for the subscription period. When changing the period, this may be
             * supplied alongside `subscription_period_count`; if omitted the existing interval is
             * retained.
             */
            fun subscriptionPeriodInterval(subscriptionPeriodInterval: TimeInterval?) =
                subscriptionPeriodInterval(JsonField.ofNullable(subscriptionPeriodInterval))

            /**
             * Sets [Builder.subscriptionPeriodInterval] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriptionPeriodInterval] with a well-typed
             * [TimeInterval] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun subscriptionPeriodInterval(subscriptionPeriodInterval: JsonField<TimeInterval>) =
                apply {
                    this.subscriptionPeriodInterval = subscriptionPeriodInterval
                }

            fun taxId(taxId: String?) = taxId(JsonField.ofNullable(taxId))

            /**
             * Sets [Builder.taxId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taxId(taxId: JsonField<String>) = apply { this.taxId = taxId }

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
                    billing,
                    cancelAtNextBillingDate,
                    cancelReason,
                    cancellationComment,
                    cancellationFeedback,
                    (creditEntitlementCart ?: JsonMissing.of()).map { it.toImmutable() },
                    customerBusinessName,
                    customerName,
                    disableOnDemand,
                    metadata,
                    nextBillingDate,
                    pause,
                    status,
                    subscriptionPeriodCount,
                    subscriptionPeriodInterval,
                    taxId,
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            billing()?.validate()
            cancelAtNextBillingDate()
            cancelReason()?.validate()
            cancellationComment()
            cancellationFeedback()?.validate()
            creditEntitlementCart()?.forEach { it.validate() }
            customerBusinessName()
            customerName()
            disableOnDemand()?.validate()
            metadata()?.validate()
            nextBillingDate()
            pause()
            status()?.validate()
            subscriptionPeriodCount()
            subscriptionPeriodInterval()?.validate()
            taxId()
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
            (billing.asKnown()?.validity() ?: 0) +
                (if (cancelAtNextBillingDate.asKnown() == null) 0 else 1) +
                (cancelReason.asKnown()?.validity() ?: 0) +
                (if (cancellationComment.asKnown() == null) 0 else 1) +
                (cancellationFeedback.asKnown()?.validity() ?: 0) +
                (creditEntitlementCart.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (customerBusinessName.asKnown() == null) 0 else 1) +
                (if (customerName.asKnown() == null) 0 else 1) +
                (disableOnDemand.asKnown()?.validity() ?: 0) +
                (metadata.asKnown()?.validity() ?: 0) +
                (if (nextBillingDate.asKnown() == null) 0 else 1) +
                (if (pause.asKnown() == null) 0 else 1) +
                (status.asKnown()?.validity() ?: 0) +
                (if (subscriptionPeriodCount.asKnown() == null) 0 else 1) +
                (subscriptionPeriodInterval.asKnown()?.validity() ?: 0) +
                (if (taxId.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                billing == other.billing &&
                cancelAtNextBillingDate == other.cancelAtNextBillingDate &&
                cancelReason == other.cancelReason &&
                cancellationComment == other.cancellationComment &&
                cancellationFeedback == other.cancellationFeedback &&
                creditEntitlementCart == other.creditEntitlementCart &&
                customerBusinessName == other.customerBusinessName &&
                customerName == other.customerName &&
                disableOnDemand == other.disableOnDemand &&
                metadata == other.metadata &&
                nextBillingDate == other.nextBillingDate &&
                pause == other.pause &&
                status == other.status &&
                subscriptionPeriodCount == other.subscriptionPeriodCount &&
                subscriptionPeriodInterval == other.subscriptionPeriodInterval &&
                taxId == other.taxId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                billing,
                cancelAtNextBillingDate,
                cancelReason,
                cancellationComment,
                cancellationFeedback,
                creditEntitlementCart,
                customerBusinessName,
                customerName,
                disableOnDemand,
                metadata,
                nextBillingDate,
                pause,
                status,
                subscriptionPeriodCount,
                subscriptionPeriodInterval,
                taxId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{billing=$billing, cancelAtNextBillingDate=$cancelAtNextBillingDate, cancelReason=$cancelReason, cancellationComment=$cancellationComment, cancellationFeedback=$cancellationFeedback, creditEntitlementCart=$creditEntitlementCart, customerBusinessName=$customerBusinessName, customerName=$customerName, disableOnDemand=$disableOnDemand, metadata=$metadata, nextBillingDate=$nextBillingDate, pause=$pause, status=$status, subscriptionPeriodCount=$subscriptionPeriodCount, subscriptionPeriodInterval=$subscriptionPeriodInterval, taxId=$taxId, additionalProperties=$additionalProperties}"
    }

    class CancelReason @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val CANCELLED_BY_CUSTOMER = of("cancelled_by_customer")

            val CANCELLED_BY_MERCHANT = of("cancelled_by_merchant")

            val CANCELLED_BY_MERCHANT_SEND_DUNNING = of("cancelled_by_merchant_send_dunning")

            val DODO_TEAM = of("dodo_team")

            fun of(value: String) = CancelReason(JsonField.of(value))
        }

        /** An enum containing [CancelReason]'s known values. */
        enum class Known {
            CANCELLED_BY_CUSTOMER,
            CANCELLED_BY_MERCHANT,
            CANCELLED_BY_MERCHANT_SEND_DUNNING,
            DODO_TEAM,
        }

        /**
         * An enum containing [CancelReason]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CancelReason] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CANCELLED_BY_CUSTOMER,
            CANCELLED_BY_MERCHANT,
            CANCELLED_BY_MERCHANT_SEND_DUNNING,
            DODO_TEAM,
            /**
             * An enum member indicating that [CancelReason] was instantiated with an unknown value.
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
                CANCELLED_BY_CUSTOMER -> Value.CANCELLED_BY_CUSTOMER
                CANCELLED_BY_MERCHANT -> Value.CANCELLED_BY_MERCHANT
                CANCELLED_BY_MERCHANT_SEND_DUNNING -> Value.CANCELLED_BY_MERCHANT_SEND_DUNNING
                DODO_TEAM -> Value.DODO_TEAM
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
                CANCELLED_BY_CUSTOMER -> Known.CANCELLED_BY_CUSTOMER
                CANCELLED_BY_MERCHANT -> Known.CANCELLED_BY_MERCHANT
                CANCELLED_BY_MERCHANT_SEND_DUNNING -> Known.CANCELLED_BY_MERCHANT_SEND_DUNNING
                DODO_TEAM -> Known.DODO_TEAM
                else -> throw DodoPaymentsInvalidDataException("Unknown CancelReason: $value")
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
        fun validate(): CancelReason = apply {
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

            return other is CancelReason && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class CreditEntitlementCart
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val creditEntitlementId: JsonField<String>,
        private val creditsAmount: JsonField<String>,
        private val expiresAfterDays: JsonField<Int>,
        private val lowBalanceThresholdPercent: JsonField<Int>,
        private val maxRolloverCount: JsonField<Int>,
        private val overageEnabled: JsonField<Boolean>,
        private val overageLimit: JsonField<String>,
        private val rolloverEnabled: JsonField<Boolean>,
        private val rolloverPercentage: JsonField<Int>,
        private val rolloverTimeframeCount: JsonField<Int>,
        private val rolloverTimeframeInterval: JsonField<TimeInterval>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("credit_entitlement_id")
            @ExcludeMissing
            creditEntitlementId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("credits_amount")
            @ExcludeMissing
            creditsAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expires_after_days")
            @ExcludeMissing
            expiresAfterDays: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("low_balance_threshold_percent")
            @ExcludeMissing
            lowBalanceThresholdPercent: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("max_rollover_count")
            @ExcludeMissing
            maxRolloverCount: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("overage_enabled")
            @ExcludeMissing
            overageEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("overage_limit")
            @ExcludeMissing
            overageLimit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rollover_enabled")
            @ExcludeMissing
            rolloverEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("rollover_percentage")
            @ExcludeMissing
            rolloverPercentage: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("rollover_timeframe_count")
            @ExcludeMissing
            rolloverTimeframeCount: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("rollover_timeframe_interval")
            @ExcludeMissing
            rolloverTimeframeInterval: JsonField<TimeInterval> = JsonMissing.of(),
        ) : this(
            creditEntitlementId,
            creditsAmount,
            expiresAfterDays,
            lowBalanceThresholdPercent,
            maxRolloverCount,
            overageEnabled,
            overageLimit,
            rolloverEnabled,
            rolloverPercentage,
            rolloverTimeframeCount,
            rolloverTimeframeInterval,
            mutableMapOf(),
        )

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditEntitlementId(): String = creditEntitlementId.getRequired("credit_entitlement_id")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun creditsAmount(): String? = creditsAmount.getNullable("credits_amount")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun expiresAfterDays(): Int? = expiresAfterDays.getNullable("expires_after_days")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun lowBalanceThresholdPercent(): Int? =
            lowBalanceThresholdPercent.getNullable("low_balance_threshold_percent")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun maxRolloverCount(): Int? = maxRolloverCount.getNullable("max_rollover_count")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun overageEnabled(): Boolean? = overageEnabled.getNullable("overage_enabled")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun overageLimit(): String? = overageLimit.getNullable("overage_limit")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun rolloverEnabled(): Boolean? = rolloverEnabled.getNullable("rollover_enabled")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun rolloverPercentage(): Int? = rolloverPercentage.getNullable("rollover_percentage")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun rolloverTimeframeCount(): Int? =
            rolloverTimeframeCount.getNullable("rollover_timeframe_count")

        /**
         * Unit of a duration count (e.g. license-key validity period).
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun rolloverTimeframeInterval(): TimeInterval? =
            rolloverTimeframeInterval.getNullable("rollover_timeframe_interval")

        /**
         * Returns the raw JSON value of [creditEntitlementId].
         *
         * Unlike [creditEntitlementId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("credit_entitlement_id")
        @ExcludeMissing
        fun _creditEntitlementId(): JsonField<String> = creditEntitlementId

        /**
         * Returns the raw JSON value of [creditsAmount].
         *
         * Unlike [creditsAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("credits_amount")
        @ExcludeMissing
        fun _creditsAmount(): JsonField<String> = creditsAmount

        /**
         * Returns the raw JSON value of [expiresAfterDays].
         *
         * Unlike [expiresAfterDays], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("expires_after_days")
        @ExcludeMissing
        fun _expiresAfterDays(): JsonField<Int> = expiresAfterDays

        /**
         * Returns the raw JSON value of [lowBalanceThresholdPercent].
         *
         * Unlike [lowBalanceThresholdPercent], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("low_balance_threshold_percent")
        @ExcludeMissing
        fun _lowBalanceThresholdPercent(): JsonField<Int> = lowBalanceThresholdPercent

        /**
         * Returns the raw JSON value of [maxRolloverCount].
         *
         * Unlike [maxRolloverCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("max_rollover_count")
        @ExcludeMissing
        fun _maxRolloverCount(): JsonField<Int> = maxRolloverCount

        /**
         * Returns the raw JSON value of [overageEnabled].
         *
         * Unlike [overageEnabled], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("overage_enabled")
        @ExcludeMissing
        fun _overageEnabled(): JsonField<Boolean> = overageEnabled

        /**
         * Returns the raw JSON value of [overageLimit].
         *
         * Unlike [overageLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("overage_limit")
        @ExcludeMissing
        fun _overageLimit(): JsonField<String> = overageLimit

        /**
         * Returns the raw JSON value of [rolloverEnabled].
         *
         * Unlike [rolloverEnabled], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("rollover_enabled")
        @ExcludeMissing
        fun _rolloverEnabled(): JsonField<Boolean> = rolloverEnabled

        /**
         * Returns the raw JSON value of [rolloverPercentage].
         *
         * Unlike [rolloverPercentage], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("rollover_percentage")
        @ExcludeMissing
        fun _rolloverPercentage(): JsonField<Int> = rolloverPercentage

        /**
         * Returns the raw JSON value of [rolloverTimeframeCount].
         *
         * Unlike [rolloverTimeframeCount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("rollover_timeframe_count")
        @ExcludeMissing
        fun _rolloverTimeframeCount(): JsonField<Int> = rolloverTimeframeCount

        /**
         * Returns the raw JSON value of [rolloverTimeframeInterval].
         *
         * Unlike [rolloverTimeframeInterval], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("rollover_timeframe_interval")
        @ExcludeMissing
        fun _rolloverTimeframeInterval(): JsonField<TimeInterval> = rolloverTimeframeInterval

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
             * Returns a mutable builder for constructing an instance of [CreditEntitlementCart].
             *
             * The following fields are required:
             * ```kotlin
             * .creditEntitlementId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [CreditEntitlementCart]. */
        class Builder internal constructor() {

            private var creditEntitlementId: JsonField<String>? = null
            private var creditsAmount: JsonField<String> = JsonMissing.of()
            private var expiresAfterDays: JsonField<Int> = JsonMissing.of()
            private var lowBalanceThresholdPercent: JsonField<Int> = JsonMissing.of()
            private var maxRolloverCount: JsonField<Int> = JsonMissing.of()
            private var overageEnabled: JsonField<Boolean> = JsonMissing.of()
            private var overageLimit: JsonField<String> = JsonMissing.of()
            private var rolloverEnabled: JsonField<Boolean> = JsonMissing.of()
            private var rolloverPercentage: JsonField<Int> = JsonMissing.of()
            private var rolloverTimeframeCount: JsonField<Int> = JsonMissing.of()
            private var rolloverTimeframeInterval: JsonField<TimeInterval> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(creditEntitlementCart: CreditEntitlementCart) = apply {
                creditEntitlementId = creditEntitlementCart.creditEntitlementId
                creditsAmount = creditEntitlementCart.creditsAmount
                expiresAfterDays = creditEntitlementCart.expiresAfterDays
                lowBalanceThresholdPercent = creditEntitlementCart.lowBalanceThresholdPercent
                maxRolloverCount = creditEntitlementCart.maxRolloverCount
                overageEnabled = creditEntitlementCart.overageEnabled
                overageLimit = creditEntitlementCart.overageLimit
                rolloverEnabled = creditEntitlementCart.rolloverEnabled
                rolloverPercentage = creditEntitlementCart.rolloverPercentage
                rolloverTimeframeCount = creditEntitlementCart.rolloverTimeframeCount
                rolloverTimeframeInterval = creditEntitlementCart.rolloverTimeframeInterval
                additionalProperties = creditEntitlementCart.additionalProperties.toMutableMap()
            }

            fun creditEntitlementId(creditEntitlementId: String) =
                creditEntitlementId(JsonField.of(creditEntitlementId))

            /**
             * Sets [Builder.creditEntitlementId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditEntitlementId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun creditEntitlementId(creditEntitlementId: JsonField<String>) = apply {
                this.creditEntitlementId = creditEntitlementId
            }

            fun creditsAmount(creditsAmount: String?) =
                creditsAmount(JsonField.ofNullable(creditsAmount))

            /**
             * Sets [Builder.creditsAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditsAmount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditsAmount(creditsAmount: JsonField<String>) = apply {
                this.creditsAmount = creditsAmount
            }

            fun expiresAfterDays(expiresAfterDays: Int?) =
                expiresAfterDays(JsonField.ofNullable(expiresAfterDays))

            /**
             * Alias for [Builder.expiresAfterDays].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun expiresAfterDays(expiresAfterDays: Int) = expiresAfterDays(expiresAfterDays as Int?)

            /**
             * Sets [Builder.expiresAfterDays] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiresAfterDays] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiresAfterDays(expiresAfterDays: JsonField<Int>) = apply {
                this.expiresAfterDays = expiresAfterDays
            }

            fun lowBalanceThresholdPercent(lowBalanceThresholdPercent: Int?) =
                lowBalanceThresholdPercent(JsonField.ofNullable(lowBalanceThresholdPercent))

            /**
             * Alias for [Builder.lowBalanceThresholdPercent].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun lowBalanceThresholdPercent(lowBalanceThresholdPercent: Int) =
                lowBalanceThresholdPercent(lowBalanceThresholdPercent as Int?)

            /**
             * Sets [Builder.lowBalanceThresholdPercent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lowBalanceThresholdPercent] with a well-typed [Int]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun lowBalanceThresholdPercent(lowBalanceThresholdPercent: JsonField<Int>) = apply {
                this.lowBalanceThresholdPercent = lowBalanceThresholdPercent
            }

            fun maxRolloverCount(maxRolloverCount: Int?) =
                maxRolloverCount(JsonField.ofNullable(maxRolloverCount))

            /**
             * Alias for [Builder.maxRolloverCount].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maxRolloverCount(maxRolloverCount: Int) = maxRolloverCount(maxRolloverCount as Int?)

            /**
             * Sets [Builder.maxRolloverCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxRolloverCount] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxRolloverCount(maxRolloverCount: JsonField<Int>) = apply {
                this.maxRolloverCount = maxRolloverCount
            }

            fun overageEnabled(overageEnabled: Boolean?) =
                overageEnabled(JsonField.ofNullable(overageEnabled))

            /**
             * Alias for [Builder.overageEnabled].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun overageEnabled(overageEnabled: Boolean) = overageEnabled(overageEnabled as Boolean?)

            /**
             * Sets [Builder.overageEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.overageEnabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun overageEnabled(overageEnabled: JsonField<Boolean>) = apply {
                this.overageEnabled = overageEnabled
            }

            fun overageLimit(overageLimit: String?) =
                overageLimit(JsonField.ofNullable(overageLimit))

            /**
             * Sets [Builder.overageLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.overageLimit] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun overageLimit(overageLimit: JsonField<String>) = apply {
                this.overageLimit = overageLimit
            }

            fun rolloverEnabled(rolloverEnabled: Boolean?) =
                rolloverEnabled(JsonField.ofNullable(rolloverEnabled))

            /**
             * Alias for [Builder.rolloverEnabled].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun rolloverEnabled(rolloverEnabled: Boolean) =
                rolloverEnabled(rolloverEnabled as Boolean?)

            /**
             * Sets [Builder.rolloverEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rolloverEnabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rolloverEnabled(rolloverEnabled: JsonField<Boolean>) = apply {
                this.rolloverEnabled = rolloverEnabled
            }

            fun rolloverPercentage(rolloverPercentage: Int?) =
                rolloverPercentage(JsonField.ofNullable(rolloverPercentage))

            /**
             * Alias for [Builder.rolloverPercentage].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun rolloverPercentage(rolloverPercentage: Int) =
                rolloverPercentage(rolloverPercentage as Int?)

            /**
             * Sets [Builder.rolloverPercentage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rolloverPercentage] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rolloverPercentage(rolloverPercentage: JsonField<Int>) = apply {
                this.rolloverPercentage = rolloverPercentage
            }

            fun rolloverTimeframeCount(rolloverTimeframeCount: Int?) =
                rolloverTimeframeCount(JsonField.ofNullable(rolloverTimeframeCount))

            /**
             * Alias for [Builder.rolloverTimeframeCount].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun rolloverTimeframeCount(rolloverTimeframeCount: Int) =
                rolloverTimeframeCount(rolloverTimeframeCount as Int?)

            /**
             * Sets [Builder.rolloverTimeframeCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rolloverTimeframeCount] with a well-typed [Int]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun rolloverTimeframeCount(rolloverTimeframeCount: JsonField<Int>) = apply {
                this.rolloverTimeframeCount = rolloverTimeframeCount
            }

            /** Unit of a duration count (e.g. license-key validity period). */
            fun rolloverTimeframeInterval(rolloverTimeframeInterval: TimeInterval?) =
                rolloverTimeframeInterval(JsonField.ofNullable(rolloverTimeframeInterval))

            /**
             * Sets [Builder.rolloverTimeframeInterval] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rolloverTimeframeInterval] with a well-typed
             * [TimeInterval] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun rolloverTimeframeInterval(rolloverTimeframeInterval: JsonField<TimeInterval>) =
                apply {
                    this.rolloverTimeframeInterval = rolloverTimeframeInterval
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
             * Returns an immutable instance of [CreditEntitlementCart].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .creditEntitlementId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CreditEntitlementCart =
                CreditEntitlementCart(
                    checkRequired("creditEntitlementId", creditEntitlementId),
                    creditsAmount,
                    expiresAfterDays,
                    lowBalanceThresholdPercent,
                    maxRolloverCount,
                    overageEnabled,
                    overageLimit,
                    rolloverEnabled,
                    rolloverPercentage,
                    rolloverTimeframeCount,
                    rolloverTimeframeInterval,
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
        fun validate(): CreditEntitlementCart = apply {
            if (validated) {
                return@apply
            }

            creditEntitlementId()
            creditsAmount()
            expiresAfterDays()
            lowBalanceThresholdPercent()
            maxRolloverCount()
            overageEnabled()
            overageLimit()
            rolloverEnabled()
            rolloverPercentage()
            rolloverTimeframeCount()
            rolloverTimeframeInterval()?.validate()
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
            (if (creditEntitlementId.asKnown() == null) 0 else 1) +
                (if (creditsAmount.asKnown() == null) 0 else 1) +
                (if (expiresAfterDays.asKnown() == null) 0 else 1) +
                (if (lowBalanceThresholdPercent.asKnown() == null) 0 else 1) +
                (if (maxRolloverCount.asKnown() == null) 0 else 1) +
                (if (overageEnabled.asKnown() == null) 0 else 1) +
                (if (overageLimit.asKnown() == null) 0 else 1) +
                (if (rolloverEnabled.asKnown() == null) 0 else 1) +
                (if (rolloverPercentage.asKnown() == null) 0 else 1) +
                (if (rolloverTimeframeCount.asKnown() == null) 0 else 1) +
                (rolloverTimeframeInterval.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreditEntitlementCart &&
                creditEntitlementId == other.creditEntitlementId &&
                creditsAmount == other.creditsAmount &&
                expiresAfterDays == other.expiresAfterDays &&
                lowBalanceThresholdPercent == other.lowBalanceThresholdPercent &&
                maxRolloverCount == other.maxRolloverCount &&
                overageEnabled == other.overageEnabled &&
                overageLimit == other.overageLimit &&
                rolloverEnabled == other.rolloverEnabled &&
                rolloverPercentage == other.rolloverPercentage &&
                rolloverTimeframeCount == other.rolloverTimeframeCount &&
                rolloverTimeframeInterval == other.rolloverTimeframeInterval &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                creditEntitlementId,
                creditsAmount,
                expiresAfterDays,
                lowBalanceThresholdPercent,
                maxRolloverCount,
                overageEnabled,
                overageLimit,
                rolloverEnabled,
                rolloverPercentage,
                rolloverTimeframeCount,
                rolloverTimeframeInterval,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreditEntitlementCart{creditEntitlementId=$creditEntitlementId, creditsAmount=$creditsAmount, expiresAfterDays=$expiresAfterDays, lowBalanceThresholdPercent=$lowBalanceThresholdPercent, maxRolloverCount=$maxRolloverCount, overageEnabled=$overageEnabled, overageLimit=$overageLimit, rolloverEnabled=$rolloverEnabled, rolloverPercentage=$rolloverPercentage, rolloverTimeframeCount=$rolloverTimeframeCount, rolloverTimeframeInterval=$rolloverTimeframeInterval, additionalProperties=$additionalProperties}"
    }

    class DisableOnDemand
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val nextBillingDate: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("next_billing_date")
            @ExcludeMissing
            nextBillingDate: JsonField<OffsetDateTime> = JsonMissing.of()
        ) : this(nextBillingDate, mutableMapOf())

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun nextBillingDate(): OffsetDateTime = nextBillingDate.getRequired("next_billing_date")

        /**
         * Returns the raw JSON value of [nextBillingDate].
         *
         * Unlike [nextBillingDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("next_billing_date")
        @ExcludeMissing
        fun _nextBillingDate(): JsonField<OffsetDateTime> = nextBillingDate

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
             * Returns a mutable builder for constructing an instance of [DisableOnDemand].
             *
             * The following fields are required:
             * ```kotlin
             * .nextBillingDate()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [DisableOnDemand]. */
        class Builder internal constructor() {

            private var nextBillingDate: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(disableOnDemand: DisableOnDemand) = apply {
                nextBillingDate = disableOnDemand.nextBillingDate
                additionalProperties = disableOnDemand.additionalProperties.toMutableMap()
            }

            fun nextBillingDate(nextBillingDate: OffsetDateTime) =
                nextBillingDate(JsonField.of(nextBillingDate))

            /**
             * Sets [Builder.nextBillingDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nextBillingDate] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun nextBillingDate(nextBillingDate: JsonField<OffsetDateTime>) = apply {
                this.nextBillingDate = nextBillingDate
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
             * Returns an immutable instance of [DisableOnDemand].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .nextBillingDate()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DisableOnDemand =
                DisableOnDemand(
                    checkRequired("nextBillingDate", nextBillingDate),
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
        fun validate(): DisableOnDemand = apply {
            if (validated) {
                return@apply
            }

            nextBillingDate()
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
        internal fun validity(): Int = (if (nextBillingDate.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DisableOnDemand &&
                nextBillingDate == other.nextBillingDate &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(nextBillingDate, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DisableOnDemand{nextBillingDate=$nextBillingDate, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionUpdateParams &&
            subscriptionId == other.subscriptionId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(subscriptionId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SubscriptionUpdateParams{subscriptionId=$subscriptionId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
