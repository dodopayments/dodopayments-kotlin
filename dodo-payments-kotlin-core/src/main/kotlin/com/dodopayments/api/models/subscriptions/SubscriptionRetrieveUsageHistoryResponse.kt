// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.misc.Currency
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class SubscriptionRetrieveUsageHistoryResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val endDate: JsonField<OffsetDateTime>,
    private val meters: JsonField<List<Meter>>,
    private val startDate: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("end_date")
        @ExcludeMissing
        endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("meters") @ExcludeMissing meters: JsonField<List<Meter>> = JsonMissing.of(),
        @JsonProperty("start_date")
        @ExcludeMissing
        startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(endDate, meters, startDate, mutableMapOf())

    /**
     * End date of the billing period
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endDate(): OffsetDateTime = endDate.getRequired("end_date")

    /**
     * List of meters and their usage for this billing period
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun meters(): List<Meter> = meters.getRequired("meters")

    /**
     * Start date of the billing period
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

    /**
     * Returns the raw JSON value of [endDate].
     *
     * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

    /**
     * Returns the raw JSON value of [meters].
     *
     * Unlike [meters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meters") @ExcludeMissing fun _meters(): JsonField<List<Meter>> = meters

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_date")
    @ExcludeMissing
    fun _startDate(): JsonField<OffsetDateTime> = startDate

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
         * [SubscriptionRetrieveUsageHistoryResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .endDate()
         * .meters()
         * .startDate()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SubscriptionRetrieveUsageHistoryResponse]. */
    class Builder internal constructor() {

        private var endDate: JsonField<OffsetDateTime>? = null
        private var meters: JsonField<MutableList<Meter>>? = null
        private var startDate: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            subscriptionRetrieveUsageHistoryResponse: SubscriptionRetrieveUsageHistoryResponse
        ) = apply {
            endDate = subscriptionRetrieveUsageHistoryResponse.endDate
            meters = subscriptionRetrieveUsageHistoryResponse.meters.map { it.toMutableList() }
            startDate = subscriptionRetrieveUsageHistoryResponse.startDate
            additionalProperties =
                subscriptionRetrieveUsageHistoryResponse.additionalProperties.toMutableMap()
        }

        /** End date of the billing period */
        fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

        /**
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

        /** List of meters and their usage for this billing period */
        fun meters(meters: List<Meter>) = meters(JsonField.of(meters))

        /**
         * Sets [Builder.meters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meters] with a well-typed `List<Meter>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun meters(meters: JsonField<List<Meter>>) = apply {
            this.meters = meters.map { it.toMutableList() }
        }

        /**
         * Adds a single [Meter] to [meters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMeter(meter: Meter) = apply {
            meters =
                (meters ?: JsonField.of(mutableListOf())).also {
                    checkKnown("meters", it).add(meter)
                }
        }

        /** Start date of the billing period */
        fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { this.startDate = startDate }

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
         * Returns an immutable instance of [SubscriptionRetrieveUsageHistoryResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .endDate()
         * .meters()
         * .startDate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubscriptionRetrieveUsageHistoryResponse =
            SubscriptionRetrieveUsageHistoryResponse(
                checkRequired("endDate", endDate),
                checkRequired("meters", meters).map { it.toImmutable() },
                checkRequired("startDate", startDate),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SubscriptionRetrieveUsageHistoryResponse = apply {
        if (validated) {
            return@apply
        }

        endDate()
        meters().forEach { it.validate() }
        startDate()
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
        (if (endDate.asKnown() == null) 0 else 1) +
            (meters.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (startDate.asKnown() == null) 0 else 1)

    class Meter
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val chargeableUnits: JsonField<String>,
        private val consumedUnits: JsonField<String>,
        private val currency: JsonField<Currency>,
        private val freeThreshold: JsonField<Long>,
        private val name: JsonField<String>,
        private val pricePerUnit: JsonField<String>,
        private val totalPrice: JsonField<Int>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("chargeable_units")
            @ExcludeMissing
            chargeableUnits: JsonField<String> = JsonMissing.of(),
            @JsonProperty("consumed_units")
            @ExcludeMissing
            consumedUnits: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("free_threshold")
            @ExcludeMissing
            freeThreshold: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("price_per_unit")
            @ExcludeMissing
            pricePerUnit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("total_price")
            @ExcludeMissing
            totalPrice: JsonField<Int> = JsonMissing.of(),
        ) : this(
            id,
            chargeableUnits,
            consumedUnits,
            currency,
            freeThreshold,
            name,
            pricePerUnit,
            totalPrice,
            mutableMapOf(),
        )

        /**
         * Meter identifier
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Chargeable units (after free threshold) as string for precision
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun chargeableUnits(): String = chargeableUnits.getRequired("chargeable_units")

        /**
         * Total units consumed as string for precision
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun consumedUnits(): String = consumedUnits.getRequired("consumed_units")

        /**
         * Currency for the price per unit
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): Currency = currency.getRequired("currency")

        /**
         * Free threshold units for this meter
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun freeThreshold(): Long = freeThreshold.getRequired("free_threshold")

        /**
         * Meter name
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Price per unit in string format for precision
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pricePerUnit(): String = pricePerUnit.getRequired("price_per_unit")

        /**
         * Total price charged for this meter in smallest currency unit (cents)
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalPrice(): Int = totalPrice.getRequired("total_price")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [chargeableUnits].
         *
         * Unlike [chargeableUnits], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("chargeable_units")
        @ExcludeMissing
        fun _chargeableUnits(): JsonField<String> = chargeableUnits

        /**
         * Returns the raw JSON value of [consumedUnits].
         *
         * Unlike [consumedUnits], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("consumed_units")
        @ExcludeMissing
        fun _consumedUnits(): JsonField<String> = consumedUnits

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

        /**
         * Returns the raw JSON value of [freeThreshold].
         *
         * Unlike [freeThreshold], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("free_threshold")
        @ExcludeMissing
        fun _freeThreshold(): JsonField<Long> = freeThreshold

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [pricePerUnit].
         *
         * Unlike [pricePerUnit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("price_per_unit")
        @ExcludeMissing
        fun _pricePerUnit(): JsonField<String> = pricePerUnit

        /**
         * Returns the raw JSON value of [totalPrice].
         *
         * Unlike [totalPrice], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total_price") @ExcludeMissing fun _totalPrice(): JsonField<Int> = totalPrice

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
             * .consumedUnits()
             * .currency()
             * .freeThreshold()
             * .name()
             * .pricePerUnit()
             * .totalPrice()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Meter]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var chargeableUnits: JsonField<String>? = null
            private var consumedUnits: JsonField<String>? = null
            private var currency: JsonField<Currency>? = null
            private var freeThreshold: JsonField<Long>? = null
            private var name: JsonField<String>? = null
            private var pricePerUnit: JsonField<String>? = null
            private var totalPrice: JsonField<Int>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(meter: Meter) = apply {
                id = meter.id
                chargeableUnits = meter.chargeableUnits
                consumedUnits = meter.consumedUnits
                currency = meter.currency
                freeThreshold = meter.freeThreshold
                name = meter.name
                pricePerUnit = meter.pricePerUnit
                totalPrice = meter.totalPrice
                additionalProperties = meter.additionalProperties.toMutableMap()
            }

            /** Meter identifier */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Chargeable units (after free threshold) as string for precision */
            fun chargeableUnits(chargeableUnits: String) =
                chargeableUnits(JsonField.of(chargeableUnits))

            /**
             * Sets [Builder.chargeableUnits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chargeableUnits] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun chargeableUnits(chargeableUnits: JsonField<String>) = apply {
                this.chargeableUnits = chargeableUnits
            }

            /** Total units consumed as string for precision */
            fun consumedUnits(consumedUnits: String) = consumedUnits(JsonField.of(consumedUnits))

            /**
             * Sets [Builder.consumedUnits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.consumedUnits] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun consumedUnits(consumedUnits: JsonField<String>) = apply {
                this.consumedUnits = consumedUnits
            }

            /** Currency for the price per unit */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /** Free threshold units for this meter */
            fun freeThreshold(freeThreshold: Long) = freeThreshold(JsonField.of(freeThreshold))

            /**
             * Sets [Builder.freeThreshold] to an arbitrary JSON value.
             *
             * You should usually call [Builder.freeThreshold] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun freeThreshold(freeThreshold: JsonField<Long>) = apply {
                this.freeThreshold = freeThreshold
            }

            /** Meter name */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Price per unit in string format for precision */
            fun pricePerUnit(pricePerUnit: String) = pricePerUnit(JsonField.of(pricePerUnit))

            /**
             * Sets [Builder.pricePerUnit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pricePerUnit] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pricePerUnit(pricePerUnit: JsonField<String>) = apply {
                this.pricePerUnit = pricePerUnit
            }

            /** Total price charged for this meter in smallest currency unit (cents) */
            fun totalPrice(totalPrice: Int) = totalPrice(JsonField.of(totalPrice))

            /**
             * Sets [Builder.totalPrice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalPrice] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalPrice(totalPrice: JsonField<Int>) = apply { this.totalPrice = totalPrice }

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
             * Returns an immutable instance of [Meter].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .chargeableUnits()
             * .consumedUnits()
             * .currency()
             * .freeThreshold()
             * .name()
             * .pricePerUnit()
             * .totalPrice()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Meter =
                Meter(
                    checkRequired("id", id),
                    checkRequired("chargeableUnits", chargeableUnits),
                    checkRequired("consumedUnits", consumedUnits),
                    checkRequired("currency", currency),
                    checkRequired("freeThreshold", freeThreshold),
                    checkRequired("name", name),
                    checkRequired("pricePerUnit", pricePerUnit),
                    checkRequired("totalPrice", totalPrice),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Meter = apply {
            if (validated) {
                return@apply
            }

            id()
            chargeableUnits()
            consumedUnits()
            currency().validate()
            freeThreshold()
            name()
            pricePerUnit()
            totalPrice()
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
                (if (consumedUnits.asKnown() == null) 0 else 1) +
                (currency.asKnown()?.validity() ?: 0) +
                (if (freeThreshold.asKnown() == null) 0 else 1) +
                (if (name.asKnown() == null) 0 else 1) +
                (if (pricePerUnit.asKnown() == null) 0 else 1) +
                (if (totalPrice.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Meter &&
                id == other.id &&
                chargeableUnits == other.chargeableUnits &&
                consumedUnits == other.consumedUnits &&
                currency == other.currency &&
                freeThreshold == other.freeThreshold &&
                name == other.name &&
                pricePerUnit == other.pricePerUnit &&
                totalPrice == other.totalPrice &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                chargeableUnits,
                consumedUnits,
                currency,
                freeThreshold,
                name,
                pricePerUnit,
                totalPrice,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Meter{id=$id, chargeableUnits=$chargeableUnits, consumedUnits=$consumedUnits, currency=$currency, freeThreshold=$freeThreshold, name=$name, pricePerUnit=$pricePerUnit, totalPrice=$totalPrice, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionRetrieveUsageHistoryResponse &&
            endDate == other.endDate &&
            meters == other.meters &&
            startDate == other.startDate &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(endDate, meters, startDate, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubscriptionRetrieveUsageHistoryResponse{endDate=$endDate, meters=$meters, startDate=$startDate, additionalProperties=$additionalProperties}"
}
