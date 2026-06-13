// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.BaseDeserializer
import com.dodopayments.api.core.BaseSerializer
import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.getOrThrow
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.TaxCategory
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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class SubscriptionPreviewChangePlanResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val immediateCharge: JsonField<ImmediateCharge>,
    private val newPlan: JsonField<Subscription>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("immediate_charge")
        @ExcludeMissing
        immediateCharge: JsonField<ImmediateCharge> = JsonMissing.of(),
        @JsonProperty("new_plan")
        @ExcludeMissing
        newPlan: JsonField<Subscription> = JsonMissing.of(),
    ) : this(immediateCharge, newPlan, mutableMapOf())

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun immediateCharge(): ImmediateCharge = immediateCharge.getRequired("immediate_charge")

    /**
     * Response struct representing subscription details
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun newPlan(): Subscription = newPlan.getRequired("new_plan")

    /**
     * Returns the raw JSON value of [immediateCharge].
     *
     * Unlike [immediateCharge], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("immediate_charge")
    @ExcludeMissing
    fun _immediateCharge(): JsonField<ImmediateCharge> = immediateCharge

    /**
     * Returns the raw JSON value of [newPlan].
     *
     * Unlike [newPlan], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("new_plan") @ExcludeMissing fun _newPlan(): JsonField<Subscription> = newPlan

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
         * [SubscriptionPreviewChangePlanResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .immediateCharge()
         * .newPlan()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SubscriptionPreviewChangePlanResponse]. */
    class Builder internal constructor() {

        private var immediateCharge: JsonField<ImmediateCharge>? = null
        private var newPlan: JsonField<Subscription>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            subscriptionPreviewChangePlanResponse: SubscriptionPreviewChangePlanResponse
        ) = apply {
            immediateCharge = subscriptionPreviewChangePlanResponse.immediateCharge
            newPlan = subscriptionPreviewChangePlanResponse.newPlan
            additionalProperties =
                subscriptionPreviewChangePlanResponse.additionalProperties.toMutableMap()
        }

        fun immediateCharge(immediateCharge: ImmediateCharge) =
            immediateCharge(JsonField.of(immediateCharge))

        /**
         * Sets [Builder.immediateCharge] to an arbitrary JSON value.
         *
         * You should usually call [Builder.immediateCharge] with a well-typed [ImmediateCharge]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun immediateCharge(immediateCharge: JsonField<ImmediateCharge>) = apply {
            this.immediateCharge = immediateCharge
        }

        /** Response struct representing subscription details */
        fun newPlan(newPlan: Subscription) = newPlan(JsonField.of(newPlan))

        /**
         * Sets [Builder.newPlan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.newPlan] with a well-typed [Subscription] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun newPlan(newPlan: JsonField<Subscription>) = apply { this.newPlan = newPlan }

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
         * Returns an immutable instance of [SubscriptionPreviewChangePlanResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .immediateCharge()
         * .newPlan()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubscriptionPreviewChangePlanResponse =
            SubscriptionPreviewChangePlanResponse(
                checkRequired("immediateCharge", immediateCharge),
                checkRequired("newPlan", newPlan),
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
    fun validate(): SubscriptionPreviewChangePlanResponse = apply {
        if (validated) {
            return@apply
        }

        immediateCharge().validate()
        newPlan().validate()
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
        (immediateCharge.asKnown()?.validity() ?: 0) + (newPlan.asKnown()?.validity() ?: 0)

    class ImmediateCharge
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val effectiveAt: JsonField<OffsetDateTime>,
        private val lineItems: JsonField<List<LineItem>>,
        private val summary: JsonField<Summary>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("effective_at")
            @ExcludeMissing
            effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("line_items")
            @ExcludeMissing
            lineItems: JsonField<List<LineItem>> = JsonMissing.of(),
            @JsonProperty("summary") @ExcludeMissing summary: JsonField<Summary> = JsonMissing.of(),
        ) : this(effectiveAt, lineItems, summary, mutableMapOf())

        /**
         * When the plan change will be effective
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun effectiveAt(): OffsetDateTime = effectiveAt.getRequired("effective_at")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun lineItems(): List<LineItem> = lineItems.getRequired("line_items")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun summary(): Summary = summary.getRequired("summary")

        /**
         * Returns the raw JSON value of [effectiveAt].
         *
         * Unlike [effectiveAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("effective_at")
        @ExcludeMissing
        fun _effectiveAt(): JsonField<OffsetDateTime> = effectiveAt

        /**
         * Returns the raw JSON value of [lineItems].
         *
         * Unlike [lineItems], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line_items")
        @ExcludeMissing
        fun _lineItems(): JsonField<List<LineItem>> = lineItems

        /**
         * Returns the raw JSON value of [summary].
         *
         * Unlike [summary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("summary") @ExcludeMissing fun _summary(): JsonField<Summary> = summary

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
             * Returns a mutable builder for constructing an instance of [ImmediateCharge].
             *
             * The following fields are required:
             * ```kotlin
             * .effectiveAt()
             * .lineItems()
             * .summary()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ImmediateCharge]. */
        class Builder internal constructor() {

            private var effectiveAt: JsonField<OffsetDateTime>? = null
            private var lineItems: JsonField<MutableList<LineItem>>? = null
            private var summary: JsonField<Summary>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(immediateCharge: ImmediateCharge) = apply {
                effectiveAt = immediateCharge.effectiveAt
                lineItems = immediateCharge.lineItems.map { it.toMutableList() }
                summary = immediateCharge.summary
                additionalProperties = immediateCharge.additionalProperties.toMutableMap()
            }

            /** When the plan change will be effective */
            fun effectiveAt(effectiveAt: OffsetDateTime) = effectiveAt(JsonField.of(effectiveAt))

            /**
             * Sets [Builder.effectiveAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.effectiveAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
                this.effectiveAt = effectiveAt
            }

            fun lineItems(lineItems: List<LineItem>) = lineItems(JsonField.of(lineItems))

            /**
             * Sets [Builder.lineItems] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lineItems] with a well-typed `List<LineItem>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lineItems(lineItems: JsonField<List<LineItem>>) = apply {
                this.lineItems = lineItems.map { it.toMutableList() }
            }

            /**
             * Adds a single [LineItem] to [lineItems].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLineItem(lineItem: LineItem) = apply {
                lineItems =
                    (lineItems ?: JsonField.of(mutableListOf())).also {
                        checkKnown("lineItems", it).add(lineItem)
                    }
            }

            /** Alias for calling [addLineItem] with `LineItem.ofSubscription(subscription)`. */
            fun addLineItem(subscription: LineItem.Subscription) =
                addLineItem(LineItem.ofSubscription(subscription))

            /** Alias for calling [addLineItem] with `LineItem.ofAddon(addon)`. */
            fun addLineItem(addon: LineItem.Addon) = addLineItem(LineItem.ofAddon(addon))

            /** Alias for calling [addLineItem] with `LineItem.ofMeter(meter)`. */
            fun addLineItem(meter: LineItem.Meter) = addLineItem(LineItem.ofMeter(meter))

            fun summary(summary: Summary) = summary(JsonField.of(summary))

            /**
             * Sets [Builder.summary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.summary] with a well-typed [Summary] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun summary(summary: JsonField<Summary>) = apply { this.summary = summary }

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
             * Returns an immutable instance of [ImmediateCharge].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .effectiveAt()
             * .lineItems()
             * .summary()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ImmediateCharge =
                ImmediateCharge(
                    checkRequired("effectiveAt", effectiveAt),
                    checkRequired("lineItems", lineItems).map { it.toImmutable() },
                    checkRequired("summary", summary),
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
        fun validate(): ImmediateCharge = apply {
            if (validated) {
                return@apply
            }

            effectiveAt()
            lineItems().forEach { it.validate() }
            summary().validate()
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
            (if (effectiveAt.asKnown() == null) 0 else 1) +
                (lineItems.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (summary.asKnown()?.validity() ?: 0)

        @JsonDeserialize(using = LineItem.Deserializer::class)
        @JsonSerialize(using = LineItem.Serializer::class)
        class LineItem
        private constructor(
            private val subscription: Subscription? = null,
            private val addon: Addon? = null,
            private val meter: Meter? = null,
            private val _json: JsonValue? = null,
        ) {

            fun subscription(): Subscription? = subscription

            fun addon(): Addon? = addon

            fun meter(): Meter? = meter

            fun isSubscription(): Boolean = subscription != null

            fun isAddon(): Boolean = addon != null

            fun isMeter(): Boolean = meter != null

            fun asSubscription(): Subscription = subscription.getOrThrow("subscription")

            fun asAddon(): Addon = addon.getOrThrow("addon")

            fun asMeter(): Meter = meter.getOrThrow("meter")

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
             * val result: String? = lineItem.accept(object : LineItem.Visitor<String?> {
             *     override fun visitSubscription(subscription: Subscription): String? = subscription.toString()
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
                    subscription != null -> visitor.visitSubscription(subscription)
                    addon != null -> visitor.visitAddon(addon)
                    meter != null -> visitor.visitMeter(meter)
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
            fun validate(): LineItem = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitSubscription(subscription: Subscription) {
                            subscription.validate()
                        }

                        override fun visitAddon(addon: Addon) {
                            addon.validate()
                        }

                        override fun visitMeter(meter: Meter) {
                            meter.validate()
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
                        override fun visitSubscription(subscription: Subscription) =
                            subscription.validity()

                        override fun visitAddon(addon: Addon) = addon.validity()

                        override fun visitMeter(meter: Meter) = meter.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is LineItem &&
                    subscription == other.subscription &&
                    addon == other.addon &&
                    meter == other.meter
            }

            override fun hashCode(): Int = Objects.hash(subscription, addon, meter)

            override fun toString(): String =
                when {
                    subscription != null -> "LineItem{subscription=$subscription}"
                    addon != null -> "LineItem{addon=$addon}"
                    meter != null -> "LineItem{meter=$meter}"
                    _json != null -> "LineItem{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid LineItem")
                }

            companion object {

                fun ofSubscription(subscription: Subscription) =
                    LineItem(subscription = subscription)

                fun ofAddon(addon: Addon) = LineItem(addon = addon)

                fun ofMeter(meter: Meter) = LineItem(meter = meter)
            }

            /**
             * An interface that defines how to map each variant of [LineItem] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitSubscription(subscription: Subscription): T

                fun visitAddon(addon: Addon): T

                fun visitMeter(meter: Meter): T

                /**
                 * Maps an unknown variant of [LineItem] to a value of type [T].
                 *
                 * An instance of [LineItem] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws DodoPaymentsInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw DodoPaymentsInvalidDataException("Unknown LineItem: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<LineItem>(LineItem::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): LineItem {
                    val json = JsonValue.fromJsonNode(node)
                    val type = json.asObject()?.get("type")?.asString()

                    when (type) {
                        "subscription" -> {
                            return tryDeserialize(node, jacksonTypeRef<Subscription>())?.let {
                                LineItem(subscription = it, _json = json)
                            } ?: LineItem(_json = json)
                        }
                        "addon" -> {
                            return tryDeserialize(node, jacksonTypeRef<Addon>())?.let {
                                LineItem(addon = it, _json = json)
                            } ?: LineItem(_json = json)
                        }
                        "meter" -> {
                            return tryDeserialize(node, jacksonTypeRef<Meter>())?.let {
                                LineItem(meter = it, _json = json)
                            } ?: LineItem(_json = json)
                        }
                    }

                    return LineItem(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<LineItem>(LineItem::class) {

                override fun serialize(
                    value: LineItem,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.subscription != null -> generator.writeObject(value.subscription)
                        value.addon != null -> generator.writeObject(value.addon)
                        value.meter != null -> generator.writeObject(value.meter)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid LineItem")
                    }
                }
            }

            class Subscription
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val currency: JsonField<Currency>,
                private val productId: JsonField<String>,
                private val prorationFactor: JsonField<Double>,
                private val quantity: JsonField<Int>,
                private val taxInclusive: JsonField<Boolean>,
                private val type: JsonValue,
                private val unitPrice: JsonField<Int>,
                private val description: JsonField<String>,
                private val name: JsonField<String>,
                private val tax: JsonField<Int>,
                private val taxRate: JsonField<Float>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<Currency> = JsonMissing.of(),
                    @JsonProperty("product_id")
                    @ExcludeMissing
                    productId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("proration_factor")
                    @ExcludeMissing
                    prorationFactor: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("quantity")
                    @ExcludeMissing
                    quantity: JsonField<Int> = JsonMissing.of(),
                    @JsonProperty("tax_inclusive")
                    @ExcludeMissing
                    taxInclusive: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                    @JsonProperty("unit_price")
                    @ExcludeMissing
                    unitPrice: JsonField<Int> = JsonMissing.of(),
                    @JsonProperty("description")
                    @ExcludeMissing
                    description: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("tax") @ExcludeMissing tax: JsonField<Int> = JsonMissing.of(),
                    @JsonProperty("tax_rate")
                    @ExcludeMissing
                    taxRate: JsonField<Float> = JsonMissing.of(),
                ) : this(
                    id,
                    currency,
                    productId,
                    prorationFactor,
                    quantity,
                    taxInclusive,
                    type,
                    unitPrice,
                    description,
                    name,
                    tax,
                    taxRate,
                    mutableMapOf(),
                )

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun currency(): Currency = currency.getRequired("currency")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun productId(): String = productId.getRequired("product_id")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun prorationFactor(): Double = prorationFactor.getRequired("proration_factor")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun quantity(): Int = quantity.getRequired("quantity")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun taxInclusive(): Boolean = taxInclusive.getRequired("tax_inclusive")

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("subscription")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun unitPrice(): Int = unitPrice.getRequired("unit_price")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun description(): String? = description.getNullable("description")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun name(): String? = name.getNullable("name")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun tax(): Int? = tax.getNullable("tax")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun taxRate(): Float? = taxRate.getNullable("tax_rate")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<Currency> = currency

                /**
                 * Returns the raw JSON value of [productId].
                 *
                 * Unlike [productId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("product_id")
                @ExcludeMissing
                fun _productId(): JsonField<String> = productId

                /**
                 * Returns the raw JSON value of [prorationFactor].
                 *
                 * Unlike [prorationFactor], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("proration_factor")
                @ExcludeMissing
                fun _prorationFactor(): JsonField<Double> = prorationFactor

                /**
                 * Returns the raw JSON value of [quantity].
                 *
                 * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Int> = quantity

                /**
                 * Returns the raw JSON value of [taxInclusive].
                 *
                 * Unlike [taxInclusive], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("tax_inclusive")
                @ExcludeMissing
                fun _taxInclusive(): JsonField<Boolean> = taxInclusive

                /**
                 * Returns the raw JSON value of [unitPrice].
                 *
                 * Unlike [unitPrice], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("unit_price")
                @ExcludeMissing
                fun _unitPrice(): JsonField<Int> = unitPrice

                /**
                 * Returns the raw JSON value of [description].
                 *
                 * Unlike [description], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("description")
                @ExcludeMissing
                fun _description(): JsonField<String> = description

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [tax].
                 *
                 * Unlike [tax], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("tax") @ExcludeMissing fun _tax(): JsonField<Int> = tax

                /**
                 * Returns the raw JSON value of [taxRate].
                 *
                 * Unlike [taxRate], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("tax_rate") @ExcludeMissing fun _taxRate(): JsonField<Float> = taxRate

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
                     * Returns a mutable builder for constructing an instance of [Subscription].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .currency()
                     * .productId()
                     * .prorationFactor()
                     * .quantity()
                     * .taxInclusive()
                     * .unitPrice()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Subscription]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var currency: JsonField<Currency>? = null
                    private var productId: JsonField<String>? = null
                    private var prorationFactor: JsonField<Double>? = null
                    private var quantity: JsonField<Int>? = null
                    private var taxInclusive: JsonField<Boolean>? = null
                    private var type: JsonValue = JsonValue.from("subscription")
                    private var unitPrice: JsonField<Int>? = null
                    private var description: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var tax: JsonField<Int> = JsonMissing.of()
                    private var taxRate: JsonField<Float> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(subscription: Subscription) = apply {
                        id = subscription.id
                        currency = subscription.currency
                        productId = subscription.productId
                        prorationFactor = subscription.prorationFactor
                        quantity = subscription.quantity
                        taxInclusive = subscription.taxInclusive
                        type = subscription.type
                        unitPrice = subscription.unitPrice
                        description = subscription.description
                        name = subscription.name
                        tax = subscription.tax
                        taxRate = subscription.taxRate
                        additionalProperties = subscription.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [Currency] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                    fun productId(productId: String) = productId(JsonField.of(productId))

                    /**
                     * Sets [Builder.productId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.productId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun productId(productId: JsonField<String>) = apply {
                        this.productId = productId
                    }

                    fun prorationFactor(prorationFactor: Double) =
                        prorationFactor(JsonField.of(prorationFactor))

                    /**
                     * Sets [Builder.prorationFactor] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.prorationFactor] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun prorationFactor(prorationFactor: JsonField<Double>) = apply {
                        this.prorationFactor = prorationFactor
                    }

                    fun quantity(quantity: Int) = quantity(JsonField.of(quantity))

                    /**
                     * Sets [Builder.quantity] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.quantity] with a well-typed [Int] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun quantity(quantity: JsonField<Int>) = apply { this.quantity = quantity }

                    fun taxInclusive(taxInclusive: Boolean) =
                        taxInclusive(JsonField.of(taxInclusive))

                    /**
                     * Sets [Builder.taxInclusive] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.taxInclusive] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun taxInclusive(taxInclusive: JsonField<Boolean>) = apply {
                        this.taxInclusive = taxInclusive
                    }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("subscription")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

                    fun unitPrice(unitPrice: Int) = unitPrice(JsonField.of(unitPrice))

                    /**
                     * Sets [Builder.unitPrice] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.unitPrice] with a well-typed [Int] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun unitPrice(unitPrice: JsonField<Int>) = apply { this.unitPrice = unitPrice }

                    fun description(description: String?) =
                        description(JsonField.ofNullable(description))

                    /**
                     * Sets [Builder.description] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.description] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    fun name(name: String?) = name(JsonField.ofNullable(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun tax(tax: Int?) = tax(JsonField.ofNullable(tax))

                    /**
                     * Alias for [Builder.tax].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun tax(tax: Int) = tax(tax as Int?)

                    /**
                     * Sets [Builder.tax] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tax] with a well-typed [Int] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun tax(tax: JsonField<Int>) = apply { this.tax = tax }

                    fun taxRate(taxRate: Float?) = taxRate(JsonField.ofNullable(taxRate))

                    /**
                     * Alias for [Builder.taxRate].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun taxRate(taxRate: Float) = taxRate(taxRate as Float?)

                    /**
                     * Sets [Builder.taxRate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.taxRate] with a well-typed [Float] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun taxRate(taxRate: JsonField<Float>) = apply { this.taxRate = taxRate }

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
                     * Returns an immutable instance of [Subscription].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .currency()
                     * .productId()
                     * .prorationFactor()
                     * .quantity()
                     * .taxInclusive()
                     * .unitPrice()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Subscription =
                        Subscription(
                            checkRequired("id", id),
                            checkRequired("currency", currency),
                            checkRequired("productId", productId),
                            checkRequired("prorationFactor", prorationFactor),
                            checkRequired("quantity", quantity),
                            checkRequired("taxInclusive", taxInclusive),
                            type,
                            checkRequired("unitPrice", unitPrice),
                            description,
                            name,
                            tax,
                            taxRate,
                            additionalProperties.toMutableMap(),
                        )
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
                fun validate(): Subscription = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    currency().validate()
                    productId()
                    prorationFactor()
                    quantity()
                    taxInclusive()
                    _type().let {
                        if (it != JsonValue.from("subscription")) {
                            throw DodoPaymentsInvalidDataException(
                                "'type' is invalid, received $it"
                            )
                        }
                    }
                    unitPrice()
                    description()
                    name()
                    tax()
                    taxRate()
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
                        (currency.asKnown()?.validity() ?: 0) +
                        (if (productId.asKnown() == null) 0 else 1) +
                        (if (prorationFactor.asKnown() == null) 0 else 1) +
                        (if (quantity.asKnown() == null) 0 else 1) +
                        (if (taxInclusive.asKnown() == null) 0 else 1) +
                        type.let { if (it == JsonValue.from("subscription")) 1 else 0 } +
                        (if (unitPrice.asKnown() == null) 0 else 1) +
                        (if (description.asKnown() == null) 0 else 1) +
                        (if (name.asKnown() == null) 0 else 1) +
                        (if (tax.asKnown() == null) 0 else 1) +
                        (if (taxRate.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Subscription &&
                        id == other.id &&
                        currency == other.currency &&
                        productId == other.productId &&
                        prorationFactor == other.prorationFactor &&
                        quantity == other.quantity &&
                        taxInclusive == other.taxInclusive &&
                        type == other.type &&
                        unitPrice == other.unitPrice &&
                        description == other.description &&
                        name == other.name &&
                        tax == other.tax &&
                        taxRate == other.taxRate &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        id,
                        currency,
                        productId,
                        prorationFactor,
                        quantity,
                        taxInclusive,
                        type,
                        unitPrice,
                        description,
                        name,
                        tax,
                        taxRate,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Subscription{id=$id, currency=$currency, productId=$productId, prorationFactor=$prorationFactor, quantity=$quantity, taxInclusive=$taxInclusive, type=$type, unitPrice=$unitPrice, description=$description, name=$name, tax=$tax, taxRate=$taxRate, additionalProperties=$additionalProperties}"
            }

            class Addon
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val currency: JsonField<Currency>,
                private val name: JsonField<String>,
                private val prorationFactor: JsonField<Double>,
                private val quantity: JsonField<Int>,
                private val taxCategory: JsonField<TaxCategory>,
                private val taxInclusive: JsonField<Boolean>,
                private val taxRate: JsonField<Float>,
                private val type: JsonValue,
                private val unitPrice: JsonField<Int>,
                private val description: JsonField<String>,
                private val tax: JsonField<Int>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<Currency> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("proration_factor")
                    @ExcludeMissing
                    prorationFactor: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("quantity")
                    @ExcludeMissing
                    quantity: JsonField<Int> = JsonMissing.of(),
                    @JsonProperty("tax_category")
                    @ExcludeMissing
                    taxCategory: JsonField<TaxCategory> = JsonMissing.of(),
                    @JsonProperty("tax_inclusive")
                    @ExcludeMissing
                    taxInclusive: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("tax_rate")
                    @ExcludeMissing
                    taxRate: JsonField<Float> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                    @JsonProperty("unit_price")
                    @ExcludeMissing
                    unitPrice: JsonField<Int> = JsonMissing.of(),
                    @JsonProperty("description")
                    @ExcludeMissing
                    description: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("tax") @ExcludeMissing tax: JsonField<Int> = JsonMissing.of(),
                ) : this(
                    id,
                    currency,
                    name,
                    prorationFactor,
                    quantity,
                    taxCategory,
                    taxInclusive,
                    taxRate,
                    type,
                    unitPrice,
                    description,
                    tax,
                    mutableMapOf(),
                )

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun currency(): Currency = currency.getRequired("currency")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun prorationFactor(): Double = prorationFactor.getRequired("proration_factor")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun quantity(): Int = quantity.getRequired("quantity")

                /**
                 * Represents the different categories of taxation applicable to various products
                 * and services.
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun taxCategory(): TaxCategory = taxCategory.getRequired("tax_category")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun taxInclusive(): Boolean = taxInclusive.getRequired("tax_inclusive")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun taxRate(): Float = taxRate.getRequired("tax_rate")

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("addon")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun unitPrice(): Int = unitPrice.getRequired("unit_price")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun description(): String? = description.getNullable("description")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun tax(): Int? = tax.getNullable("tax")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<Currency> = currency

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [prorationFactor].
                 *
                 * Unlike [prorationFactor], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("proration_factor")
                @ExcludeMissing
                fun _prorationFactor(): JsonField<Double> = prorationFactor

                /**
                 * Returns the raw JSON value of [quantity].
                 *
                 * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Int> = quantity

                /**
                 * Returns the raw JSON value of [taxCategory].
                 *
                 * Unlike [taxCategory], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("tax_category")
                @ExcludeMissing
                fun _taxCategory(): JsonField<TaxCategory> = taxCategory

                /**
                 * Returns the raw JSON value of [taxInclusive].
                 *
                 * Unlike [taxInclusive], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("tax_inclusive")
                @ExcludeMissing
                fun _taxInclusive(): JsonField<Boolean> = taxInclusive

                /**
                 * Returns the raw JSON value of [taxRate].
                 *
                 * Unlike [taxRate], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("tax_rate") @ExcludeMissing fun _taxRate(): JsonField<Float> = taxRate

                /**
                 * Returns the raw JSON value of [unitPrice].
                 *
                 * Unlike [unitPrice], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("unit_price")
                @ExcludeMissing
                fun _unitPrice(): JsonField<Int> = unitPrice

                /**
                 * Returns the raw JSON value of [description].
                 *
                 * Unlike [description], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("description")
                @ExcludeMissing
                fun _description(): JsonField<String> = description

                /**
                 * Returns the raw JSON value of [tax].
                 *
                 * Unlike [tax], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("tax") @ExcludeMissing fun _tax(): JsonField<Int> = tax

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
                     * Returns a mutable builder for constructing an instance of [Addon].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .currency()
                     * .name()
                     * .prorationFactor()
                     * .quantity()
                     * .taxCategory()
                     * .taxInclusive()
                     * .taxRate()
                     * .unitPrice()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Addon]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var currency: JsonField<Currency>? = null
                    private var name: JsonField<String>? = null
                    private var prorationFactor: JsonField<Double>? = null
                    private var quantity: JsonField<Int>? = null
                    private var taxCategory: JsonField<TaxCategory>? = null
                    private var taxInclusive: JsonField<Boolean>? = null
                    private var taxRate: JsonField<Float>? = null
                    private var type: JsonValue = JsonValue.from("addon")
                    private var unitPrice: JsonField<Int>? = null
                    private var description: JsonField<String> = JsonMissing.of()
                    private var tax: JsonField<Int> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(addon: Addon) = apply {
                        id = addon.id
                        currency = addon.currency
                        name = addon.name
                        prorationFactor = addon.prorationFactor
                        quantity = addon.quantity
                        taxCategory = addon.taxCategory
                        taxInclusive = addon.taxInclusive
                        taxRate = addon.taxRate
                        type = addon.type
                        unitPrice = addon.unitPrice
                        description = addon.description
                        tax = addon.tax
                        additionalProperties = addon.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [Currency] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun prorationFactor(prorationFactor: Double) =
                        prorationFactor(JsonField.of(prorationFactor))

                    /**
                     * Sets [Builder.prorationFactor] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.prorationFactor] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun prorationFactor(prorationFactor: JsonField<Double>) = apply {
                        this.prorationFactor = prorationFactor
                    }

                    fun quantity(quantity: Int) = quantity(JsonField.of(quantity))

                    /**
                     * Sets [Builder.quantity] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.quantity] with a well-typed [Int] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun quantity(quantity: JsonField<Int>) = apply { this.quantity = quantity }

                    /**
                     * Represents the different categories of taxation applicable to various
                     * products and services.
                     */
                    fun taxCategory(taxCategory: TaxCategory) =
                        taxCategory(JsonField.of(taxCategory))

                    /**
                     * Sets [Builder.taxCategory] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.taxCategory] with a well-typed [TaxCategory]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun taxCategory(taxCategory: JsonField<TaxCategory>) = apply {
                        this.taxCategory = taxCategory
                    }

                    fun taxInclusive(taxInclusive: Boolean) =
                        taxInclusive(JsonField.of(taxInclusive))

                    /**
                     * Sets [Builder.taxInclusive] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.taxInclusive] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun taxInclusive(taxInclusive: JsonField<Boolean>) = apply {
                        this.taxInclusive = taxInclusive
                    }

                    fun taxRate(taxRate: Float) = taxRate(JsonField.of(taxRate))

                    /**
                     * Sets [Builder.taxRate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.taxRate] with a well-typed [Float] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun taxRate(taxRate: JsonField<Float>) = apply { this.taxRate = taxRate }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("addon")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

                    fun unitPrice(unitPrice: Int) = unitPrice(JsonField.of(unitPrice))

                    /**
                     * Sets [Builder.unitPrice] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.unitPrice] with a well-typed [Int] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun unitPrice(unitPrice: JsonField<Int>) = apply { this.unitPrice = unitPrice }

                    fun description(description: String?) =
                        description(JsonField.ofNullable(description))

                    /**
                     * Sets [Builder.description] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.description] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    fun tax(tax: Int?) = tax(JsonField.ofNullable(tax))

                    /**
                     * Alias for [Builder.tax].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun tax(tax: Int) = tax(tax as Int?)

                    /**
                     * Sets [Builder.tax] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tax] with a well-typed [Int] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun tax(tax: JsonField<Int>) = apply { this.tax = tax }

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
                     * Returns an immutable instance of [Addon].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .currency()
                     * .name()
                     * .prorationFactor()
                     * .quantity()
                     * .taxCategory()
                     * .taxInclusive()
                     * .taxRate()
                     * .unitPrice()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Addon =
                        Addon(
                            checkRequired("id", id),
                            checkRequired("currency", currency),
                            checkRequired("name", name),
                            checkRequired("prorationFactor", prorationFactor),
                            checkRequired("quantity", quantity),
                            checkRequired("taxCategory", taxCategory),
                            checkRequired("taxInclusive", taxInclusive),
                            checkRequired("taxRate", taxRate),
                            type,
                            checkRequired("unitPrice", unitPrice),
                            description,
                            tax,
                            additionalProperties.toMutableMap(),
                        )
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
                fun validate(): Addon = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    currency().validate()
                    name()
                    prorationFactor()
                    quantity()
                    taxCategory().validate()
                    taxInclusive()
                    taxRate()
                    _type().let {
                        if (it != JsonValue.from("addon")) {
                            throw DodoPaymentsInvalidDataException(
                                "'type' is invalid, received $it"
                            )
                        }
                    }
                    unitPrice()
                    description()
                    tax()
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
                        (currency.asKnown()?.validity() ?: 0) +
                        (if (name.asKnown() == null) 0 else 1) +
                        (if (prorationFactor.asKnown() == null) 0 else 1) +
                        (if (quantity.asKnown() == null) 0 else 1) +
                        (taxCategory.asKnown()?.validity() ?: 0) +
                        (if (taxInclusive.asKnown() == null) 0 else 1) +
                        (if (taxRate.asKnown() == null) 0 else 1) +
                        type.let { if (it == JsonValue.from("addon")) 1 else 0 } +
                        (if (unitPrice.asKnown() == null) 0 else 1) +
                        (if (description.asKnown() == null) 0 else 1) +
                        (if (tax.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Addon &&
                        id == other.id &&
                        currency == other.currency &&
                        name == other.name &&
                        prorationFactor == other.prorationFactor &&
                        quantity == other.quantity &&
                        taxCategory == other.taxCategory &&
                        taxInclusive == other.taxInclusive &&
                        taxRate == other.taxRate &&
                        type == other.type &&
                        unitPrice == other.unitPrice &&
                        description == other.description &&
                        tax == other.tax &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        id,
                        currency,
                        name,
                        prorationFactor,
                        quantity,
                        taxCategory,
                        taxInclusive,
                        taxRate,
                        type,
                        unitPrice,
                        description,
                        tax,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Addon{id=$id, currency=$currency, name=$name, prorationFactor=$prorationFactor, quantity=$quantity, taxCategory=$taxCategory, taxInclusive=$taxInclusive, taxRate=$taxRate, type=$type, unitPrice=$unitPrice, description=$description, tax=$tax, additionalProperties=$additionalProperties}"
            }

            class Meter
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val chargeableUnits: JsonField<String>,
                private val currency: JsonField<Currency>,
                private val freeThreshold: JsonField<Long>,
                private val name: JsonField<String>,
                private val pricePerUnit: JsonField<String>,
                private val subtotal: JsonField<Int>,
                private val taxInclusive: JsonField<Boolean>,
                private val taxRate: JsonField<Float>,
                private val type: JsonValue,
                private val unitsConsumed: JsonField<String>,
                private val description: JsonField<String>,
                private val tax: JsonField<Int>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("chargeable_units")
                    @ExcludeMissing
                    chargeableUnits: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<Currency> = JsonMissing.of(),
                    @JsonProperty("free_threshold")
                    @ExcludeMissing
                    freeThreshold: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("price_per_unit")
                    @ExcludeMissing
                    pricePerUnit: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("subtotal")
                    @ExcludeMissing
                    subtotal: JsonField<Int> = JsonMissing.of(),
                    @JsonProperty("tax_inclusive")
                    @ExcludeMissing
                    taxInclusive: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("tax_rate")
                    @ExcludeMissing
                    taxRate: JsonField<Float> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                    @JsonProperty("units_consumed")
                    @ExcludeMissing
                    unitsConsumed: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("description")
                    @ExcludeMissing
                    description: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("tax") @ExcludeMissing tax: JsonField<Int> = JsonMissing.of(),
                ) : this(
                    id,
                    chargeableUnits,
                    currency,
                    freeThreshold,
                    name,
                    pricePerUnit,
                    subtotal,
                    taxInclusive,
                    taxRate,
                    type,
                    unitsConsumed,
                    description,
                    tax,
                    mutableMapOf(),
                )

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun chargeableUnits(): String = chargeableUnits.getRequired("chargeable_units")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun currency(): Currency = currency.getRequired("currency")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun freeThreshold(): Long = freeThreshold.getRequired("free_threshold")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun pricePerUnit(): String = pricePerUnit.getRequired("price_per_unit")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun subtotal(): Int = subtotal.getRequired("subtotal")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun taxInclusive(): Boolean = taxInclusive.getRequired("tax_inclusive")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun taxRate(): Float = taxRate.getRequired("tax_rate")

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("meter")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun unitsConsumed(): String = unitsConsumed.getRequired("units_consumed")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun description(): String? = description.getNullable("description")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun tax(): Int? = tax.getNullable("tax")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [chargeableUnits].
                 *
                 * Unlike [chargeableUnits], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("chargeable_units")
                @ExcludeMissing
                fun _chargeableUnits(): JsonField<String> = chargeableUnits

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<Currency> = currency

                /**
                 * Returns the raw JSON value of [freeThreshold].
                 *
                 * Unlike [freeThreshold], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("free_threshold")
                @ExcludeMissing
                fun _freeThreshold(): JsonField<Long> = freeThreshold

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [pricePerUnit].
                 *
                 * Unlike [pricePerUnit], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("price_per_unit")
                @ExcludeMissing
                fun _pricePerUnit(): JsonField<String> = pricePerUnit

                /**
                 * Returns the raw JSON value of [subtotal].
                 *
                 * Unlike [subtotal], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("subtotal") @ExcludeMissing fun _subtotal(): JsonField<Int> = subtotal

                /**
                 * Returns the raw JSON value of [taxInclusive].
                 *
                 * Unlike [taxInclusive], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("tax_inclusive")
                @ExcludeMissing
                fun _taxInclusive(): JsonField<Boolean> = taxInclusive

                /**
                 * Returns the raw JSON value of [taxRate].
                 *
                 * Unlike [taxRate], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("tax_rate") @ExcludeMissing fun _taxRate(): JsonField<Float> = taxRate

                /**
                 * Returns the raw JSON value of [unitsConsumed].
                 *
                 * Unlike [unitsConsumed], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("units_consumed")
                @ExcludeMissing
                fun _unitsConsumed(): JsonField<String> = unitsConsumed

                /**
                 * Returns the raw JSON value of [description].
                 *
                 * Unlike [description], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("description")
                @ExcludeMissing
                fun _description(): JsonField<String> = description

                /**
                 * Returns the raw JSON value of [tax].
                 *
                 * Unlike [tax], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("tax") @ExcludeMissing fun _tax(): JsonField<Int> = tax

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
                     * Returns a mutable builder for constructing an instance of [Meter].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .chargeableUnits()
                     * .currency()
                     * .freeThreshold()
                     * .name()
                     * .pricePerUnit()
                     * .subtotal()
                     * .taxInclusive()
                     * .taxRate()
                     * .unitsConsumed()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Meter]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var chargeableUnits: JsonField<String>? = null
                    private var currency: JsonField<Currency>? = null
                    private var freeThreshold: JsonField<Long>? = null
                    private var name: JsonField<String>? = null
                    private var pricePerUnit: JsonField<String>? = null
                    private var subtotal: JsonField<Int>? = null
                    private var taxInclusive: JsonField<Boolean>? = null
                    private var taxRate: JsonField<Float>? = null
                    private var type: JsonValue = JsonValue.from("meter")
                    private var unitsConsumed: JsonField<String>? = null
                    private var description: JsonField<String> = JsonMissing.of()
                    private var tax: JsonField<Int> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(meter: Meter) = apply {
                        id = meter.id
                        chargeableUnits = meter.chargeableUnits
                        currency = meter.currency
                        freeThreshold = meter.freeThreshold
                        name = meter.name
                        pricePerUnit = meter.pricePerUnit
                        subtotal = meter.subtotal
                        taxInclusive = meter.taxInclusive
                        taxRate = meter.taxRate
                        type = meter.type
                        unitsConsumed = meter.unitsConsumed
                        description = meter.description
                        tax = meter.tax
                        additionalProperties = meter.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun chargeableUnits(chargeableUnits: String) =
                        chargeableUnits(JsonField.of(chargeableUnits))

                    /**
                     * Sets [Builder.chargeableUnits] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.chargeableUnits] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun chargeableUnits(chargeableUnits: JsonField<String>) = apply {
                        this.chargeableUnits = chargeableUnits
                    }

                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [Currency] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                    fun freeThreshold(freeThreshold: Long) =
                        freeThreshold(JsonField.of(freeThreshold))

                    /**
                     * Sets [Builder.freeThreshold] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.freeThreshold] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun freeThreshold(freeThreshold: JsonField<Long>) = apply {
                        this.freeThreshold = freeThreshold
                    }

                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun pricePerUnit(pricePerUnit: String) =
                        pricePerUnit(JsonField.of(pricePerUnit))

                    /**
                     * Sets [Builder.pricePerUnit] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.pricePerUnit] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun pricePerUnit(pricePerUnit: JsonField<String>) = apply {
                        this.pricePerUnit = pricePerUnit
                    }

                    fun subtotal(subtotal: Int) = subtotal(JsonField.of(subtotal))

                    /**
                     * Sets [Builder.subtotal] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.subtotal] with a well-typed [Int] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun subtotal(subtotal: JsonField<Int>) = apply { this.subtotal = subtotal }

                    fun taxInclusive(taxInclusive: Boolean) =
                        taxInclusive(JsonField.of(taxInclusive))

                    /**
                     * Sets [Builder.taxInclusive] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.taxInclusive] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun taxInclusive(taxInclusive: JsonField<Boolean>) = apply {
                        this.taxInclusive = taxInclusive
                    }

                    fun taxRate(taxRate: Float) = taxRate(JsonField.of(taxRate))

                    /**
                     * Sets [Builder.taxRate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.taxRate] with a well-typed [Float] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun taxRate(taxRate: JsonField<Float>) = apply { this.taxRate = taxRate }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("meter")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

                    fun unitsConsumed(unitsConsumed: String) =
                        unitsConsumed(JsonField.of(unitsConsumed))

                    /**
                     * Sets [Builder.unitsConsumed] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.unitsConsumed] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun unitsConsumed(unitsConsumed: JsonField<String>) = apply {
                        this.unitsConsumed = unitsConsumed
                    }

                    fun description(description: String?) =
                        description(JsonField.ofNullable(description))

                    /**
                     * Sets [Builder.description] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.description] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    fun tax(tax: Int?) = tax(JsonField.ofNullable(tax))

                    /**
                     * Alias for [Builder.tax].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun tax(tax: Int) = tax(tax as Int?)

                    /**
                     * Sets [Builder.tax] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tax] with a well-typed [Int] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun tax(tax: JsonField<Int>) = apply { this.tax = tax }

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
                     * Returns an immutable instance of [Meter].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .chargeableUnits()
                     * .currency()
                     * .freeThreshold()
                     * .name()
                     * .pricePerUnit()
                     * .subtotal()
                     * .taxInclusive()
                     * .taxRate()
                     * .unitsConsumed()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Meter =
                        Meter(
                            checkRequired("id", id),
                            checkRequired("chargeableUnits", chargeableUnits),
                            checkRequired("currency", currency),
                            checkRequired("freeThreshold", freeThreshold),
                            checkRequired("name", name),
                            checkRequired("pricePerUnit", pricePerUnit),
                            checkRequired("subtotal", subtotal),
                            checkRequired("taxInclusive", taxInclusive),
                            checkRequired("taxRate", taxRate),
                            type,
                            checkRequired("unitsConsumed", unitsConsumed),
                            description,
                            tax,
                            additionalProperties.toMutableMap(),
                        )
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
                fun validate(): Meter = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    chargeableUnits()
                    currency().validate()
                    freeThreshold()
                    name()
                    pricePerUnit()
                    subtotal()
                    taxInclusive()
                    taxRate()
                    _type().let {
                        if (it != JsonValue.from("meter")) {
                            throw DodoPaymentsInvalidDataException(
                                "'type' is invalid, received $it"
                            )
                        }
                    }
                    unitsConsumed()
                    description()
                    tax()
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
                        (if (chargeableUnits.asKnown() == null) 0 else 1) +
                        (currency.asKnown()?.validity() ?: 0) +
                        (if (freeThreshold.asKnown() == null) 0 else 1) +
                        (if (name.asKnown() == null) 0 else 1) +
                        (if (pricePerUnit.asKnown() == null) 0 else 1) +
                        (if (subtotal.asKnown() == null) 0 else 1) +
                        (if (taxInclusive.asKnown() == null) 0 else 1) +
                        (if (taxRate.asKnown() == null) 0 else 1) +
                        type.let { if (it == JsonValue.from("meter")) 1 else 0 } +
                        (if (unitsConsumed.asKnown() == null) 0 else 1) +
                        (if (description.asKnown() == null) 0 else 1) +
                        (if (tax.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Meter &&
                        id == other.id &&
                        chargeableUnits == other.chargeableUnits &&
                        currency == other.currency &&
                        freeThreshold == other.freeThreshold &&
                        name == other.name &&
                        pricePerUnit == other.pricePerUnit &&
                        subtotal == other.subtotal &&
                        taxInclusive == other.taxInclusive &&
                        taxRate == other.taxRate &&
                        type == other.type &&
                        unitsConsumed == other.unitsConsumed &&
                        description == other.description &&
                        tax == other.tax &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        id,
                        chargeableUnits,
                        currency,
                        freeThreshold,
                        name,
                        pricePerUnit,
                        subtotal,
                        taxInclusive,
                        taxRate,
                        type,
                        unitsConsumed,
                        description,
                        tax,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Meter{id=$id, chargeableUnits=$chargeableUnits, currency=$currency, freeThreshold=$freeThreshold, name=$name, pricePerUnit=$pricePerUnit, subtotal=$subtotal, taxInclusive=$taxInclusive, taxRate=$taxRate, type=$type, unitsConsumed=$unitsConsumed, description=$description, tax=$tax, additionalProperties=$additionalProperties}"
            }
        }

        class Summary
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val currency: JsonField<Currency>,
            private val customerCredits: JsonField<Long>,
            private val settlementAmount: JsonField<Int>,
            private val settlementCurrency: JsonField<Currency>,
            private val totalAmount: JsonField<Int>,
            private val settlementTax: JsonField<Int>,
            private val tax: JsonField<Int>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<Currency> = JsonMissing.of(),
                @JsonProperty("customer_credits")
                @ExcludeMissing
                customerCredits: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("settlement_amount")
                @ExcludeMissing
                settlementAmount: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("settlement_currency")
                @ExcludeMissing
                settlementCurrency: JsonField<Currency> = JsonMissing.of(),
                @JsonProperty("total_amount")
                @ExcludeMissing
                totalAmount: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("settlement_tax")
                @ExcludeMissing
                settlementTax: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("tax") @ExcludeMissing tax: JsonField<Int> = JsonMissing.of(),
            ) : this(
                currency,
                customerCredits,
                settlementAmount,
                settlementCurrency,
                totalAmount,
                settlementTax,
                tax,
                mutableMapOf(),
            )

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): Currency = currency.getRequired("currency")

            /**
             * Net credit movement in the smallest currency unit (e.g. cents). **Negative** –
             * credits were deducted from the customer's balance to offset the charge (typical on
             * upgrades). **Positive** – credits were added to the customer's balance, either from a
             * downgrade proration refund or from topping-up the wallet to meet a gateway
             * minimum-charge threshold. **Zero** – no credit movement occurred.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun customerCredits(): Long = customerCredits.getRequired("customer_credits")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun settlementAmount(): Int = settlementAmount.getRequired("settlement_amount")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun settlementCurrency(): Currency =
                settlementCurrency.getRequired("settlement_currency")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun totalAmount(): Int = totalAmount.getRequired("total_amount")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun settlementTax(): Int? = settlementTax.getNullable("settlement_tax")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun tax(): Int? = tax.getNullable("tax")

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun _currency(): JsonField<Currency> = currency

            /**
             * Returns the raw JSON value of [customerCredits].
             *
             * Unlike [customerCredits], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("customer_credits")
            @ExcludeMissing
            fun _customerCredits(): JsonField<Long> = customerCredits

            /**
             * Returns the raw JSON value of [settlementAmount].
             *
             * Unlike [settlementAmount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("settlement_amount")
            @ExcludeMissing
            fun _settlementAmount(): JsonField<Int> = settlementAmount

            /**
             * Returns the raw JSON value of [settlementCurrency].
             *
             * Unlike [settlementCurrency], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("settlement_currency")
            @ExcludeMissing
            fun _settlementCurrency(): JsonField<Currency> = settlementCurrency

            /**
             * Returns the raw JSON value of [totalAmount].
             *
             * Unlike [totalAmount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("total_amount")
            @ExcludeMissing
            fun _totalAmount(): JsonField<Int> = totalAmount

            /**
             * Returns the raw JSON value of [settlementTax].
             *
             * Unlike [settlementTax], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("settlement_tax")
            @ExcludeMissing
            fun _settlementTax(): JsonField<Int> = settlementTax

            /**
             * Returns the raw JSON value of [tax].
             *
             * Unlike [tax], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tax") @ExcludeMissing fun _tax(): JsonField<Int> = tax

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
                 * Returns a mutable builder for constructing an instance of [Summary].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .currency()
                 * .customerCredits()
                 * .settlementAmount()
                 * .settlementCurrency()
                 * .totalAmount()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Summary]. */
            class Builder internal constructor() {

                private var currency: JsonField<Currency>? = null
                private var customerCredits: JsonField<Long>? = null
                private var settlementAmount: JsonField<Int>? = null
                private var settlementCurrency: JsonField<Currency>? = null
                private var totalAmount: JsonField<Int>? = null
                private var settlementTax: JsonField<Int> = JsonMissing.of()
                private var tax: JsonField<Int> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(summary: Summary) = apply {
                    currency = summary.currency
                    customerCredits = summary.customerCredits
                    settlementAmount = summary.settlementAmount
                    settlementCurrency = summary.settlementCurrency
                    totalAmount = summary.totalAmount
                    settlementTax = summary.settlementTax
                    tax = summary.tax
                    additionalProperties = summary.additionalProperties.toMutableMap()
                }

                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [Currency] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /**
                 * Net credit movement in the smallest currency unit (e.g. cents). **Negative** –
                 * credits were deducted from the customer's balance to offset the charge (typical
                 * on upgrades). **Positive** – credits were added to the customer's balance, either
                 * from a downgrade proration refund or from topping-up the wallet to meet a gateway
                 * minimum-charge threshold. **Zero** – no credit movement occurred.
                 */
                fun customerCredits(customerCredits: Long) =
                    customerCredits(JsonField.of(customerCredits))

                /**
                 * Sets [Builder.customerCredits] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customerCredits] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun customerCredits(customerCredits: JsonField<Long>) = apply {
                    this.customerCredits = customerCredits
                }

                fun settlementAmount(settlementAmount: Int) =
                    settlementAmount(JsonField.of(settlementAmount))

                /**
                 * Sets [Builder.settlementAmount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.settlementAmount] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun settlementAmount(settlementAmount: JsonField<Int>) = apply {
                    this.settlementAmount = settlementAmount
                }

                fun settlementCurrency(settlementCurrency: Currency) =
                    settlementCurrency(JsonField.of(settlementCurrency))

                /**
                 * Sets [Builder.settlementCurrency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.settlementCurrency] with a well-typed [Currency]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun settlementCurrency(settlementCurrency: JsonField<Currency>) = apply {
                    this.settlementCurrency = settlementCurrency
                }

                fun totalAmount(totalAmount: Int) = totalAmount(JsonField.of(totalAmount))

                /**
                 * Sets [Builder.totalAmount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.totalAmount] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun totalAmount(totalAmount: JsonField<Int>) = apply {
                    this.totalAmount = totalAmount
                }

                fun settlementTax(settlementTax: Int?) =
                    settlementTax(JsonField.ofNullable(settlementTax))

                /**
                 * Alias for [Builder.settlementTax].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun settlementTax(settlementTax: Int) = settlementTax(settlementTax as Int?)

                /**
                 * Sets [Builder.settlementTax] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.settlementTax] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun settlementTax(settlementTax: JsonField<Int>) = apply {
                    this.settlementTax = settlementTax
                }

                fun tax(tax: Int?) = tax(JsonField.ofNullable(tax))

                /**
                 * Alias for [Builder.tax].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun tax(tax: Int) = tax(tax as Int?)

                /**
                 * Sets [Builder.tax] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tax] with a well-typed [Int] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun tax(tax: JsonField<Int>) = apply { this.tax = tax }

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
                 * Returns an immutable instance of [Summary].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .currency()
                 * .customerCredits()
                 * .settlementAmount()
                 * .settlementCurrency()
                 * .totalAmount()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Summary =
                    Summary(
                        checkRequired("currency", currency),
                        checkRequired("customerCredits", customerCredits),
                        checkRequired("settlementAmount", settlementAmount),
                        checkRequired("settlementCurrency", settlementCurrency),
                        checkRequired("totalAmount", totalAmount),
                        settlementTax,
                        tax,
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): Summary = apply {
                if (validated) {
                    return@apply
                }

                currency().validate()
                customerCredits()
                settlementAmount()
                settlementCurrency().validate()
                totalAmount()
                settlementTax()
                tax()
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
                (currency.asKnown()?.validity() ?: 0) +
                    (if (customerCredits.asKnown() == null) 0 else 1) +
                    (if (settlementAmount.asKnown() == null) 0 else 1) +
                    (settlementCurrency.asKnown()?.validity() ?: 0) +
                    (if (totalAmount.asKnown() == null) 0 else 1) +
                    (if (settlementTax.asKnown() == null) 0 else 1) +
                    (if (tax.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Summary &&
                    currency == other.currency &&
                    customerCredits == other.customerCredits &&
                    settlementAmount == other.settlementAmount &&
                    settlementCurrency == other.settlementCurrency &&
                    totalAmount == other.totalAmount &&
                    settlementTax == other.settlementTax &&
                    tax == other.tax &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    currency,
                    customerCredits,
                    settlementAmount,
                    settlementCurrency,
                    totalAmount,
                    settlementTax,
                    tax,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Summary{currency=$currency, customerCredits=$customerCredits, settlementAmount=$settlementAmount, settlementCurrency=$settlementCurrency, totalAmount=$totalAmount, settlementTax=$settlementTax, tax=$tax, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ImmediateCharge &&
                effectiveAt == other.effectiveAt &&
                lineItems == other.lineItems &&
                summary == other.summary &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(effectiveAt, lineItems, summary, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ImmediateCharge{effectiveAt=$effectiveAt, lineItems=$lineItems, summary=$summary, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionPreviewChangePlanResponse &&
            immediateCharge == other.immediateCharge &&
            newPlan == other.newPlan &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(immediateCharge, newPlan, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubscriptionPreviewChangePlanResponse{immediateCharge=$immediateCharge, newPlan=$newPlan, additionalProperties=$additionalProperties}"
}
