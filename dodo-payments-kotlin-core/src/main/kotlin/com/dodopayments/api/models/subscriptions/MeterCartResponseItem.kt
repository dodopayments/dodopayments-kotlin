// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.misc.Currency
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

/** Response struct representing usage-based meter cart details for a subscription */
class MeterCartResponseItem
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val currency: JsonField<Currency>,
    private val freeThreshold: JsonField<Long>,
    private val measurementUnit: JsonField<String>,
    private val meterId: JsonField<String>,
    private val name: JsonField<String>,
    private val description: JsonField<String>,
    private val pricePerUnit: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("free_threshold")
        @ExcludeMissing
        freeThreshold: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("measurement_unit")
        @ExcludeMissing
        measurementUnit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("meter_id") @ExcludeMissing meterId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("price_per_unit")
        @ExcludeMissing
        pricePerUnit: JsonField<String> = JsonMissing.of(),
    ) : this(
        currency,
        freeThreshold,
        measurementUnit,
        meterId,
        name,
        description,
        pricePerUnit,
        mutableMapOf(),
    )

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun freeThreshold(): Long = freeThreshold.getRequired("free_threshold")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun measurementUnit(): String = measurementUnit.getRequired("measurement_unit")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun meterId(): String = meterId.getRequired("meter_id")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): String? = description.getNullable("description")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun pricePerUnit(): String? = pricePerUnit.getNullable("price_per_unit")

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /**
     * Returns the raw JSON value of [freeThreshold].
     *
     * Unlike [freeThreshold], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("free_threshold")
    @ExcludeMissing
    fun _freeThreshold(): JsonField<Long> = freeThreshold

    /**
     * Returns the raw JSON value of [measurementUnit].
     *
     * Unlike [measurementUnit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("measurement_unit")
    @ExcludeMissing
    fun _measurementUnit(): JsonField<String> = measurementUnit

    /**
     * Returns the raw JSON value of [meterId].
     *
     * Unlike [meterId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meter_id") @ExcludeMissing fun _meterId(): JsonField<String> = meterId

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [pricePerUnit].
     *
     * Unlike [pricePerUnit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("price_per_unit")
    @ExcludeMissing
    fun _pricePerUnit(): JsonField<String> = pricePerUnit

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
         * Returns a mutable builder for constructing an instance of [MeterCartResponseItem].
         *
         * The following fields are required:
         * ```kotlin
         * .currency()
         * .freeThreshold()
         * .measurementUnit()
         * .meterId()
         * .name()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [MeterCartResponseItem]. */
    class Builder internal constructor() {

        private var currency: JsonField<Currency>? = null
        private var freeThreshold: JsonField<Long>? = null
        private var measurementUnit: JsonField<String>? = null
        private var meterId: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var pricePerUnit: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(meterCartResponseItem: MeterCartResponseItem) = apply {
            currency = meterCartResponseItem.currency
            freeThreshold = meterCartResponseItem.freeThreshold
            measurementUnit = meterCartResponseItem.measurementUnit
            meterId = meterCartResponseItem.meterId
            name = meterCartResponseItem.name
            description = meterCartResponseItem.description
            pricePerUnit = meterCartResponseItem.pricePerUnit
            additionalProperties = meterCartResponseItem.additionalProperties.toMutableMap()
        }

        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        fun freeThreshold(freeThreshold: Long) = freeThreshold(JsonField.of(freeThreshold))

        /**
         * Sets [Builder.freeThreshold] to an arbitrary JSON value.
         *
         * You should usually call [Builder.freeThreshold] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun freeThreshold(freeThreshold: JsonField<Long>) = apply {
            this.freeThreshold = freeThreshold
        }

        fun measurementUnit(measurementUnit: String) =
            measurementUnit(JsonField.of(measurementUnit))

        /**
         * Sets [Builder.measurementUnit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.measurementUnit] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun measurementUnit(measurementUnit: JsonField<String>) = apply {
            this.measurementUnit = measurementUnit
        }

        fun meterId(meterId: String) = meterId(JsonField.of(meterId))

        /**
         * Sets [Builder.meterId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meterId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun meterId(meterId: JsonField<String>) = apply { this.meterId = meterId }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun description(description: String?) = description(JsonField.ofNullable(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun pricePerUnit(pricePerUnit: String?) = pricePerUnit(JsonField.ofNullable(pricePerUnit))

        /**
         * Sets [Builder.pricePerUnit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pricePerUnit] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pricePerUnit(pricePerUnit: JsonField<String>) = apply {
            this.pricePerUnit = pricePerUnit
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
         * Returns an immutable instance of [MeterCartResponseItem].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .currency()
         * .freeThreshold()
         * .measurementUnit()
         * .meterId()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MeterCartResponseItem =
            MeterCartResponseItem(
                checkRequired("currency", currency),
                checkRequired("freeThreshold", freeThreshold),
                checkRequired("measurementUnit", measurementUnit),
                checkRequired("meterId", meterId),
                checkRequired("name", name),
                description,
                pricePerUnit,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MeterCartResponseItem = apply {
        if (validated) {
            return@apply
        }

        currency().validate()
        freeThreshold()
        measurementUnit()
        meterId()
        name()
        description()
        pricePerUnit()
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
        (currency.asKnown()?.validity() ?: 0) +
            (if (freeThreshold.asKnown() == null) 0 else 1) +
            (if (measurementUnit.asKnown() == null) 0 else 1) +
            (if (meterId.asKnown() == null) 0 else 1) +
            (if (name.asKnown() == null) 0 else 1) +
            (if (description.asKnown() == null) 0 else 1) +
            (if (pricePerUnit.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MeterCartResponseItem &&
            currency == other.currency &&
            freeThreshold == other.freeThreshold &&
            measurementUnit == other.measurementUnit &&
            meterId == other.meterId &&
            name == other.name &&
            description == other.description &&
            pricePerUnit == other.pricePerUnit &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            currency,
            freeThreshold,
            measurementUnit,
            meterId,
            name,
            description,
            pricePerUnit,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MeterCartResponseItem{currency=$currency, freeThreshold=$freeThreshold, measurementUnit=$measurementUnit, meterId=$meterId, name=$name, description=$description, pricePerUnit=$pricePerUnit, additionalProperties=$additionalProperties}"
}
