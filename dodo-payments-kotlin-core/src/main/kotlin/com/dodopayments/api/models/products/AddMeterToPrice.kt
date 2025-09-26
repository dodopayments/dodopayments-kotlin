// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

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

class AddMeterToPrice
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val meterId: JsonField<String>,
    private val pricePerUnit: JsonField<String>,
    private val description: JsonField<String>,
    private val freeThreshold: JsonField<Long>,
    private val measurementUnit: JsonField<String>,
    private val name: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("meter_id") @ExcludeMissing meterId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("price_per_unit")
        @ExcludeMissing
        pricePerUnit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("free_threshold")
        @ExcludeMissing
        freeThreshold: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("measurement_unit")
        @ExcludeMissing
        measurementUnit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
    ) : this(
        meterId,
        pricePerUnit,
        description,
        freeThreshold,
        measurementUnit,
        name,
        mutableMapOf(),
    )

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun meterId(): String = meterId.getRequired("meter_id")

    /**
     * The price per unit in lowest denomination. Must be greater than zero. Supports up to 5 digits
     * before decimal point and 12 decimal places.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pricePerUnit(): String = pricePerUnit.getRequired("price_per_unit")

    /**
     * Meter description. Will ignored on Request, but will be shown in response
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): String? = description.getNullable("description")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun freeThreshold(): Long? = freeThreshold.getNullable("free_threshold")

    /**
     * Meter measurement unit. Will ignored on Request, but will be shown in response
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun measurementUnit(): String? = measurementUnit.getNullable("measurement_unit")

    /**
     * Meter name. Will ignored on Request, but will be shown in response
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): String? = name.getNullable("name")

    /**
     * Returns the raw JSON value of [meterId].
     *
     * Unlike [meterId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meter_id") @ExcludeMissing fun _meterId(): JsonField<String> = meterId

    /**
     * Returns the raw JSON value of [pricePerUnit].
     *
     * Unlike [pricePerUnit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("price_per_unit")
    @ExcludeMissing
    fun _pricePerUnit(): JsonField<String> = pricePerUnit

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

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
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
         * Returns a mutable builder for constructing an instance of [AddMeterToPrice].
         *
         * The following fields are required:
         * ```kotlin
         * .meterId()
         * .pricePerUnit()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AddMeterToPrice]. */
    class Builder internal constructor() {

        private var meterId: JsonField<String>? = null
        private var pricePerUnit: JsonField<String>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var freeThreshold: JsonField<Long> = JsonMissing.of()
        private var measurementUnit: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(addMeterToPrice: AddMeterToPrice) = apply {
            meterId = addMeterToPrice.meterId
            pricePerUnit = addMeterToPrice.pricePerUnit
            description = addMeterToPrice.description
            freeThreshold = addMeterToPrice.freeThreshold
            measurementUnit = addMeterToPrice.measurementUnit
            name = addMeterToPrice.name
            additionalProperties = addMeterToPrice.additionalProperties.toMutableMap()
        }

        fun meterId(meterId: String) = meterId(JsonField.of(meterId))

        /**
         * Sets [Builder.meterId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meterId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun meterId(meterId: JsonField<String>) = apply { this.meterId = meterId }

        /**
         * The price per unit in lowest denomination. Must be greater than zero. Supports up to 5
         * digits before decimal point and 12 decimal places.
         */
        fun pricePerUnit(pricePerUnit: String) = pricePerUnit(JsonField.of(pricePerUnit))

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

        /** Meter description. Will ignored on Request, but will be shown in response */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun freeThreshold(freeThreshold: Long?) = freeThreshold(JsonField.ofNullable(freeThreshold))

        /**
         * Alias for [Builder.freeThreshold].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun freeThreshold(freeThreshold: Long) = freeThreshold(freeThreshold as Long?)

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

        /** Meter measurement unit. Will ignored on Request, but will be shown in response */
        fun measurementUnit(measurementUnit: String?) =
            measurementUnit(JsonField.ofNullable(measurementUnit))

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

        /** Meter name. Will ignored on Request, but will be shown in response */
        fun name(name: String?) = name(JsonField.ofNullable(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
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

        /**
         * Returns an immutable instance of [AddMeterToPrice].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .meterId()
         * .pricePerUnit()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AddMeterToPrice =
            AddMeterToPrice(
                checkRequired("meterId", meterId),
                checkRequired("pricePerUnit", pricePerUnit),
                description,
                freeThreshold,
                measurementUnit,
                name,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AddMeterToPrice = apply {
        if (validated) {
            return@apply
        }

        meterId()
        pricePerUnit()
        description()
        freeThreshold()
        measurementUnit()
        name()
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
        (if (meterId.asKnown() == null) 0 else 1) +
            (if (pricePerUnit.asKnown() == null) 0 else 1) +
            (if (description.asKnown() == null) 0 else 1) +
            (if (freeThreshold.asKnown() == null) 0 else 1) +
            (if (measurementUnit.asKnown() == null) 0 else 1) +
            (if (name.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AddMeterToPrice &&
            meterId == other.meterId &&
            pricePerUnit == other.pricePerUnit &&
            description == other.description &&
            freeThreshold == other.freeThreshold &&
            measurementUnit == other.measurementUnit &&
            name == other.name &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            meterId,
            pricePerUnit,
            description,
            freeThreshold,
            measurementUnit,
            name,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AddMeterToPrice{meterId=$meterId, pricePerUnit=$pricePerUnit, description=$description, freeThreshold=$freeThreshold, measurementUnit=$measurementUnit, name=$name, additionalProperties=$additionalProperties}"
}
