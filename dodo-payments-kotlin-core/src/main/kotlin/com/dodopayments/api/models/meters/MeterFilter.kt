// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.meters

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

/**
 * A filter structure that combines multiple conditions with logical conjunctions (AND/OR).
 *
 * Supports up to 3 levels of nesting to create complex filter expressions. Each filter has a
 * conjunction (and/or) and clauses that can be either direct conditions or nested filters.
 */
class MeterFilter
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val clauses: JsonField<FilterType>,
    private val conjunction: JsonField<Conjunction>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("clauses") @ExcludeMissing clauses: JsonField<FilterType> = JsonMissing.of(),
        @JsonProperty("conjunction")
        @ExcludeMissing
        conjunction: JsonField<Conjunction> = JsonMissing.of(),
    ) : this(clauses, conjunction, mutableMapOf())

    /**
     * Filter clauses - can be direct conditions or nested filters (up to 3 levels deep)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clauses(): FilterType = clauses.getRequired("clauses")

    /**
     * Logical conjunction to apply between clauses (and/or)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun conjunction(): Conjunction = conjunction.getRequired("conjunction")

    /**
     * Returns the raw JSON value of [clauses].
     *
     * Unlike [clauses], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("clauses") @ExcludeMissing fun _clauses(): JsonField<FilterType> = clauses

    /**
     * Returns the raw JSON value of [conjunction].
     *
     * Unlike [conjunction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("conjunction")
    @ExcludeMissing
    fun _conjunction(): JsonField<Conjunction> = conjunction

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
         * Returns a mutable builder for constructing an instance of [MeterFilter].
         *
         * The following fields are required:
         * ```kotlin
         * .clauses()
         * .conjunction()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [MeterFilter]. */
    class Builder internal constructor() {

        private var clauses: JsonField<FilterType>? = null
        private var conjunction: JsonField<Conjunction>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(meterFilter: MeterFilter) = apply {
            clauses = meterFilter.clauses
            conjunction = meterFilter.conjunction
            additionalProperties = meterFilter.additionalProperties.toMutableMap()
        }

        /** Filter clauses - can be direct conditions or nested filters (up to 3 levels deep) */
        fun clauses(clauses: FilterType) = clauses(JsonField.of(clauses))

        /**
         * Sets [Builder.clauses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clauses] with a well-typed [FilterType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clauses(clauses: JsonField<FilterType>) = apply { this.clauses = clauses }

        /**
         * Alias for calling [clauses] with
         * `FilterType.ofMeterFilterConditionList(meterFilterConditionList)`.
         */
        fun clausesOfMeterFilterConditionList(
            meterFilterConditionList: List<FilterType.MeterFilterCondition>
        ) = clauses(FilterType.ofMeterFilterConditionList(meterFilterConditionList))

        /**
         * Alias for calling [clauses] with
         * `FilterType.ofNestedMeterFilterList(nestedMeterFilterList)`.
         */
        fun clausesOfNestedMeterFilterList(nestedMeterFilterList: List<MeterFilter>) =
            clauses(FilterType.ofNestedMeterFilterList(nestedMeterFilterList))

        /** Logical conjunction to apply between clauses (and/or) */
        fun conjunction(conjunction: Conjunction) = conjunction(JsonField.of(conjunction))

        /**
         * Sets [Builder.conjunction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conjunction] with a well-typed [Conjunction] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun conjunction(conjunction: JsonField<Conjunction>) = apply {
            this.conjunction = conjunction
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
         * Returns an immutable instance of [MeterFilter].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .clauses()
         * .conjunction()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MeterFilter =
            MeterFilter(
                checkRequired("clauses", clauses),
                checkRequired("conjunction", conjunction),
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
    fun validate(): MeterFilter = apply {
        if (validated) {
            return@apply
        }

        clauses().validate()
        conjunction().validate()
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
        (clauses.asKnown()?.validity() ?: 0) + (conjunction.asKnown()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MeterFilter &&
            clauses == other.clauses &&
            conjunction == other.conjunction &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(clauses, conjunction, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MeterFilter{clauses=$clauses, conjunction=$conjunction, additionalProperties=$additionalProperties}"
}
