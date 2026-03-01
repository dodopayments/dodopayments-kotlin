// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.meters

import com.dodopayments.api.core.BaseDeserializer
import com.dodopayments.api.core.BaseSerializer
import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.allMaxBy
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.getOrThrow
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
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

/**
 * A filter structure that combines multiple conditions with logical conjunctions (AND/OR).
 *
 * Supports up to 3 levels of nesting to create complex filter expressions. Each filter has a
 * conjunction (and/or) and clauses that can be either direct conditions or nested filters.
 */
class MeterFilter
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val clauses: JsonField<Clauses>,
    private val conjunction: JsonField<Conjunction>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("clauses") @ExcludeMissing clauses: JsonField<Clauses> = JsonMissing.of(),
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
    fun clauses(): Clauses = clauses.getRequired("clauses")

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
    @JsonProperty("clauses") @ExcludeMissing fun _clauses(): JsonField<Clauses> = clauses

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

        private var clauses: JsonField<Clauses>? = null
        private var conjunction: JsonField<Conjunction>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(meterFilter: MeterFilter) = apply {
            clauses = meterFilter.clauses
            conjunction = meterFilter.conjunction
            additionalProperties = meterFilter.additionalProperties.toMutableMap()
        }

        /** Filter clauses - can be direct conditions or nested filters (up to 3 levels deep) */
        fun clauses(clauses: Clauses) = clauses(JsonField.of(clauses))

        /**
         * Sets [Builder.clauses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clauses] with a well-typed [Clauses] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun clauses(clauses: JsonField<Clauses>) = apply { this.clauses = clauses }

        /**
         * Alias for calling [clauses] with
         * `Clauses.ofDirectFilterConditions(directFilterConditions)`.
         */
        fun clausesOfDirectFilterConditions(
            directFilterConditions: List<Clauses.MeterFilterCondition>
        ) = clauses(Clauses.ofDirectFilterConditions(directFilterConditions))

        /** Alias for calling [clauses] with `Clauses.ofNestedMeterFilters(nestedMeterFilters)`. */
        fun clausesOfNestedMeterFilters(nestedMeterFilters: List<Clauses.InnerMeterFilter>) =
            clauses(Clauses.ofNestedMeterFilters(nestedMeterFilters))

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

    /** Filter clauses - can be direct conditions or nested filters (up to 3 levels deep) */
    @JsonDeserialize(using = Clauses.Deserializer::class)
    @JsonSerialize(using = Clauses.Serializer::class)
    class Clauses
    private constructor(
        private val directFilterConditions: List<MeterFilterCondition>? = null,
        private val nestedMeterFilters: List<InnerMeterFilter>? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Direct filter conditions - array of condition objects with key, operator, and value */
        fun directFilterConditions(): List<MeterFilterCondition>? = directFilterConditions

        /** Nested filters - supports up to 3 levels deep */
        fun nestedMeterFilters(): List<InnerMeterFilter>? = nestedMeterFilters

        fun isDirectFilterConditions(): Boolean = directFilterConditions != null

        fun isNestedMeterFilters(): Boolean = nestedMeterFilters != null

        /** Direct filter conditions - array of condition objects with key, operator, and value */
        fun asDirectFilterConditions(): List<MeterFilterCondition> =
            directFilterConditions.getOrThrow("directFilterConditions")

        /** Nested filters - supports up to 3 levels deep */
        fun asNestedMeterFilters(): List<InnerMeterFilter> =
            nestedMeterFilters.getOrThrow("nestedMeterFilters")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                directFilterConditions != null ->
                    visitor.visitDirectFilterConditions(directFilterConditions)
                nestedMeterFilters != null -> visitor.visitNestedMeterFilters(nestedMeterFilters)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Clauses = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitDirectFilterConditions(
                        directFilterConditions: List<MeterFilterCondition>
                    ) {
                        directFilterConditions.forEach { it.validate() }
                    }

                    override fun visitNestedMeterFilters(
                        nestedMeterFilters: List<InnerMeterFilter>
                    ) {
                        nestedMeterFilters.forEach { it.validate() }
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
                    override fun visitDirectFilterConditions(
                        directFilterConditions: List<MeterFilterCondition>
                    ) = directFilterConditions.sumOf { it.validity().toInt() }

                    override fun visitNestedMeterFilters(
                        nestedMeterFilters: List<InnerMeterFilter>
                    ) = nestedMeterFilters.sumOf { it.validity().toInt() }

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Clauses &&
                directFilterConditions == other.directFilterConditions &&
                nestedMeterFilters == other.nestedMeterFilters
        }

        override fun hashCode(): Int = Objects.hash(directFilterConditions, nestedMeterFilters)

        override fun toString(): String =
            when {
                directFilterConditions != null ->
                    "Clauses{directFilterConditions=$directFilterConditions}"
                nestedMeterFilters != null -> "Clauses{nestedMeterFilters=$nestedMeterFilters}"
                _json != null -> "Clauses{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Clauses")
            }

        companion object {

            /**
             * Direct filter conditions - array of condition objects with key, operator, and value
             */
            fun ofDirectFilterConditions(directFilterConditions: List<MeterFilterCondition>) =
                Clauses(directFilterConditions = directFilterConditions.toImmutable())

            /** Nested filters - supports up to 3 levels deep */
            fun ofNestedMeterFilters(nestedMeterFilters: List<InnerMeterFilter>) =
                Clauses(nestedMeterFilters = nestedMeterFilters.toImmutable())
        }

        /**
         * An interface that defines how to map each variant of [Clauses] to a value of type [T].
         */
        interface Visitor<out T> {

            /**
             * Direct filter conditions - array of condition objects with key, operator, and value
             */
            fun visitDirectFilterConditions(directFilterConditions: List<MeterFilterCondition>): T

            /** Nested filters - supports up to 3 levels deep */
            fun visitNestedMeterFilters(nestedMeterFilters: List<InnerMeterFilter>): T

            /**
             * Maps an unknown variant of [Clauses] to a value of type [T].
             *
             * An instance of [Clauses] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws DodoPaymentsInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw DodoPaymentsInvalidDataException("Unknown Clauses: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Clauses>(Clauses::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Clauses {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<List<MeterFilterCondition>>())
                                ?.let { Clauses(directFilterConditions = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<List<InnerMeterFilter>>())?.let {
                                Clauses(nestedMeterFilters = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Clauses(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Clauses>(Clauses::class) {

            override fun serialize(
                value: Clauses,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.directFilterConditions != null ->
                        generator.writeObject(value.directFilterConditions)
                    value.nestedMeterFilters != null ->
                        generator.writeObject(value.nestedMeterFilters)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Clauses")
                }
            }
        }

        /** Filter condition with key, operator, and value */
        class MeterFilterCondition
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val key: JsonField<String>,
            private val operator: JsonField<FilterOperator>,
            private val value: JsonField<Value>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
                @JsonProperty("operator")
                @ExcludeMissing
                operator: JsonField<FilterOperator> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<Value> = JsonMissing.of(),
            ) : this(key, operator, value, mutableMapOf())

            /**
             * Filter key to apply
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun key(): String = key.getRequired("key")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun operator(): FilterOperator = operator.getRequired("operator")

            /**
             * Filter value - can be string, number, or boolean
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun value(): Value = value.getRequired("value")

            /**
             * Returns the raw JSON value of [key].
             *
             * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

            /**
             * Returns the raw JSON value of [operator].
             *
             * Unlike [operator], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("operator")
            @ExcludeMissing
            fun _operator(): JsonField<FilterOperator> = operator

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Value> = value

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
                 * Returns a mutable builder for constructing an instance of [MeterFilterCondition].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .key()
                 * .operator()
                 * .value()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [MeterFilterCondition]. */
            class Builder internal constructor() {

                private var key: JsonField<String>? = null
                private var operator: JsonField<FilterOperator>? = null
                private var value: JsonField<Value>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(meterFilterCondition: MeterFilterCondition) = apply {
                    key = meterFilterCondition.key
                    operator = meterFilterCondition.operator
                    value = meterFilterCondition.value
                    additionalProperties = meterFilterCondition.additionalProperties.toMutableMap()
                }

                /** Filter key to apply */
                fun key(key: String) = key(JsonField.of(key))

                /**
                 * Sets [Builder.key] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.key] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun key(key: JsonField<String>) = apply { this.key = key }

                fun operator(operator: FilterOperator) = operator(JsonField.of(operator))

                /**
                 * Sets [Builder.operator] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.operator] with a well-typed [FilterOperator]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun operator(operator: JsonField<FilterOperator>) = apply {
                    this.operator = operator
                }

                /** Filter value - can be string, number, or boolean */
                fun value(value: Value) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [Value] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<Value>) = apply { this.value = value }

                /** Alias for calling [value] with `Value.ofString(string)`. */
                fun value(string: String) = value(Value.ofString(string))

                /** Alias for calling [value] with `Value.ofDouble(double)`. */
                fun value(double: Double) = value(Value.ofDouble(double))

                /** Alias for calling [value] with `Value.ofBoolean(boolean)`. */
                fun value(boolean: Boolean) = value(Value.ofBoolean(boolean))

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
                 * Returns an immutable instance of [MeterFilterCondition].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .key()
                 * .operator()
                 * .value()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): MeterFilterCondition =
                    MeterFilterCondition(
                        checkRequired("key", key),
                        checkRequired("operator", operator),
                        checkRequired("value", value),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): MeterFilterCondition = apply {
                if (validated) {
                    return@apply
                }

                key()
                operator().validate()
                value().validate()
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
                (if (key.asKnown() == null) 0 else 1) +
                    (operator.asKnown()?.validity() ?: 0) +
                    (value.asKnown()?.validity() ?: 0)

            /** Filter value - can be string, number, or boolean */
            @JsonDeserialize(using = Value.Deserializer::class)
            @JsonSerialize(using = Value.Serializer::class)
            class Value
            private constructor(
                private val string: String? = null,
                private val double: Double? = null,
                private val boolean: Boolean? = null,
                private val _json: JsonValue? = null,
            ) {

                fun string(): String? = string

                fun double(): Double? = double

                fun boolean(): Boolean? = boolean

                fun isString(): Boolean = string != null

                fun isDouble(): Boolean = double != null

                fun isBoolean(): Boolean = boolean != null

                fun asString(): String = string.getOrThrow("string")

                fun asDouble(): Double = double.getOrThrow("double")

                fun asBoolean(): Boolean = boolean.getOrThrow("boolean")

                fun _json(): JsonValue? = _json

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        string != null -> visitor.visitString(string)
                        double != null -> visitor.visitDouble(double)
                        boolean != null -> visitor.visitBoolean(boolean)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): Value = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitString(string: String) {}

                            override fun visitDouble(double: Double) {}

                            override fun visitBoolean(boolean: Boolean) {}
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
                            override fun visitString(string: String) = 1

                            override fun visitDouble(double: Double) = 1

                            override fun visitBoolean(boolean: Boolean) = 1

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Value &&
                        string == other.string &&
                        double == other.double &&
                        boolean == other.boolean
                }

                override fun hashCode(): Int = Objects.hash(string, double, boolean)

                override fun toString(): String =
                    when {
                        string != null -> "Value{string=$string}"
                        double != null -> "Value{double=$double}"
                        boolean != null -> "Value{boolean=$boolean}"
                        _json != null -> "Value{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Value")
                    }

                companion object {

                    fun ofString(string: String) = Value(string = string)

                    fun ofDouble(double: Double) = Value(double = double)

                    fun ofBoolean(boolean: Boolean) = Value(boolean = boolean)
                }

                /**
                 * An interface that defines how to map each variant of [Value] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitDouble(double: Double): T

                    fun visitBoolean(boolean: Boolean): T

                    /**
                     * Maps an unknown variant of [Value] to a value of type [T].
                     *
                     * An instance of [Value] can contain an unknown variant if it was deserialized
                     * from data that doesn't match any known variant. For example, if the SDK is on
                     * an older version than the API, then the API may respond with new variants
                     * that the SDK is unaware of.
                     *
                     * @throws DodoPaymentsInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw DodoPaymentsInvalidDataException("Unknown Value: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Value>(Value::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Value {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        Value(string = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                        Value(double = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                                        Value(boolean = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // object).
                            0 -> Value(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Value>(Value::class) {

                    override fun serialize(
                        value: Value,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.string != null -> generator.writeObject(value.string)
                            value.double != null -> generator.writeObject(value.double)
                            value.boolean != null -> generator.writeObject(value.boolean)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Value")
                        }
                    }
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is MeterFilterCondition &&
                    key == other.key &&
                    operator == other.operator &&
                    value == other.value &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(key, operator, value, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MeterFilterCondition{key=$key, operator=$operator, value=$value, additionalProperties=$additionalProperties}"
        }

        /** Level 1 nested filter - can contain Level 2 filters */
        class InnerMeterFilter
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val clauses: JsonField<InnerClauses>,
            private val conjunction: JsonField<Conjunction>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("clauses")
                @ExcludeMissing
                clauses: JsonField<InnerClauses> = JsonMissing.of(),
                @JsonProperty("conjunction")
                @ExcludeMissing
                conjunction: JsonField<Conjunction> = JsonMissing.of(),
            ) : this(clauses, conjunction, mutableMapOf())

            /**
             * Level 1: Can be conditions or nested filters (2 more levels allowed)
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun clauses(): InnerClauses = clauses.getRequired("clauses")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun conjunction(): Conjunction = conjunction.getRequired("conjunction")

            /**
             * Returns the raw JSON value of [clauses].
             *
             * Unlike [clauses], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("clauses")
            @ExcludeMissing
            fun _clauses(): JsonField<InnerClauses> = clauses

            /**
             * Returns the raw JSON value of [conjunction].
             *
             * Unlike [conjunction], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                 * Returns a mutable builder for constructing an instance of [InnerMeterFilter].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .clauses()
                 * .conjunction()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [InnerMeterFilter]. */
            class Builder internal constructor() {

                private var clauses: JsonField<InnerClauses>? = null
                private var conjunction: JsonField<Conjunction>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(innerMeterFilter: InnerMeterFilter) = apply {
                    clauses = innerMeterFilter.clauses
                    conjunction = innerMeterFilter.conjunction
                    additionalProperties = innerMeterFilter.additionalProperties.toMutableMap()
                }

                /** Level 1: Can be conditions or nested filters (2 more levels allowed) */
                fun clauses(clauses: InnerClauses) = clauses(JsonField.of(clauses))

                /**
                 * Sets [Builder.clauses] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.clauses] with a well-typed [InnerClauses] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun clauses(clauses: JsonField<InnerClauses>) = apply { this.clauses = clauses }

                /**
                 * Alias for calling [clauses] with
                 * `InnerClauses.ofLevel1FilterConditions(level1FilterConditions)`.
                 */
                fun clausesOfLevel1FilterConditions(
                    level1FilterConditions: List<InnerClauses.MeterFilterCondition>
                ) = clauses(InnerClauses.ofLevel1FilterConditions(level1FilterConditions))

                /**
                 * Alias for calling [clauses] with
                 * `InnerClauses.ofLevel1NestedFilters(level1NestedFilters)`.
                 */
                fun clausesOfLevel1NestedFilters(
                    level1NestedFilters: List<InnerClauses.InnerInnerMeterFilter>
                ) = clauses(InnerClauses.ofLevel1NestedFilters(level1NestedFilters))

                fun conjunction(conjunction: Conjunction) = conjunction(JsonField.of(conjunction))

                /**
                 * Sets [Builder.conjunction] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.conjunction] with a well-typed [Conjunction]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * Returns an immutable instance of [InnerMeterFilter].
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
                fun build(): InnerMeterFilter =
                    InnerMeterFilter(
                        checkRequired("clauses", clauses),
                        checkRequired("conjunction", conjunction),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): InnerMeterFilter = apply {
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (clauses.asKnown()?.validity() ?: 0) + (conjunction.asKnown()?.validity() ?: 0)

            /** Level 1: Can be conditions or nested filters (2 more levels allowed) */
            @JsonDeserialize(using = InnerClauses.Deserializer::class)
            @JsonSerialize(using = InnerClauses.Serializer::class)
            class InnerClauses
            private constructor(
                private val level1FilterConditions: List<MeterFilterCondition>? = null,
                private val level1NestedFilters: List<InnerInnerMeterFilter>? = null,
                private val _json: JsonValue? = null,
            ) {

                /** Array of filter conditions */
                fun level1FilterConditions(): List<MeterFilterCondition>? = level1FilterConditions

                /** Array of level 2 nested filters */
                fun level1NestedFilters(): List<InnerInnerMeterFilter>? = level1NestedFilters

                fun isLevel1FilterConditions(): Boolean = level1FilterConditions != null

                fun isLevel1NestedFilters(): Boolean = level1NestedFilters != null

                /** Array of filter conditions */
                fun asLevel1FilterConditions(): List<MeterFilterCondition> =
                    level1FilterConditions.getOrThrow("level1FilterConditions")

                /** Array of level 2 nested filters */
                fun asLevel1NestedFilters(): List<InnerInnerMeterFilter> =
                    level1NestedFilters.getOrThrow("level1NestedFilters")

                fun _json(): JsonValue? = _json

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        level1FilterConditions != null ->
                            visitor.visitLevel1FilterConditions(level1FilterConditions)
                        level1NestedFilters != null ->
                            visitor.visitLevel1NestedFilters(level1NestedFilters)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): InnerClauses = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitLevel1FilterConditions(
                                level1FilterConditions: List<MeterFilterCondition>
                            ) {
                                level1FilterConditions.forEach { it.validate() }
                            }

                            override fun visitLevel1NestedFilters(
                                level1NestedFilters: List<InnerInnerMeterFilter>
                            ) {
                                level1NestedFilters.forEach { it.validate() }
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
                            override fun visitLevel1FilterConditions(
                                level1FilterConditions: List<MeterFilterCondition>
                            ) = level1FilterConditions.sumOf { it.validity().toInt() }

                            override fun visitLevel1NestedFilters(
                                level1NestedFilters: List<InnerInnerMeterFilter>
                            ) = level1NestedFilters.sumOf { it.validity().toInt() }

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is InnerClauses &&
                        level1FilterConditions == other.level1FilterConditions &&
                        level1NestedFilters == other.level1NestedFilters
                }

                override fun hashCode(): Int =
                    Objects.hash(level1FilterConditions, level1NestedFilters)

                override fun toString(): String =
                    when {
                        level1FilterConditions != null ->
                            "InnerClauses{level1FilterConditions=$level1FilterConditions}"
                        level1NestedFilters != null ->
                            "InnerClauses{level1NestedFilters=$level1NestedFilters}"
                        _json != null -> "InnerClauses{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid InnerClauses")
                    }

                companion object {

                    /** Array of filter conditions */
                    fun ofLevel1FilterConditions(
                        level1FilterConditions: List<MeterFilterCondition>
                    ) = InnerClauses(level1FilterConditions = level1FilterConditions.toImmutable())

                    /** Array of level 2 nested filters */
                    fun ofLevel1NestedFilters(level1NestedFilters: List<InnerInnerMeterFilter>) =
                        InnerClauses(level1NestedFilters = level1NestedFilters.toImmutable())
                }

                /**
                 * An interface that defines how to map each variant of [InnerClauses] to a value of
                 * type [T].
                 */
                interface Visitor<out T> {

                    /** Array of filter conditions */
                    fun visitLevel1FilterConditions(
                        level1FilterConditions: List<MeterFilterCondition>
                    ): T

                    /** Array of level 2 nested filters */
                    fun visitLevel1NestedFilters(
                        level1NestedFilters: List<InnerInnerMeterFilter>
                    ): T

                    /**
                     * Maps an unknown variant of [InnerClauses] to a value of type [T].
                     *
                     * An instance of [InnerClauses] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws DodoPaymentsInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw DodoPaymentsInvalidDataException("Unknown InnerClauses: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<InnerClauses>(InnerClauses::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): InnerClauses {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<List<MeterFilterCondition>>(),
                                        )
                                        ?.let {
                                            InnerClauses(level1FilterConditions = it, _json = json)
                                        },
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<List<InnerInnerMeterFilter>>(),
                                        )
                                        ?.let {
                                            InnerClauses(level1NestedFilters = it, _json = json)
                                        },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> InnerClauses(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<InnerClauses>(InnerClauses::class) {

                    override fun serialize(
                        value: InnerClauses,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.level1FilterConditions != null ->
                                generator.writeObject(value.level1FilterConditions)
                            value.level1NestedFilters != null ->
                                generator.writeObject(value.level1NestedFilters)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid InnerClauses")
                        }
                    }
                }

                /** Filter condition with key, operator, and value */
                class MeterFilterCondition
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val key: JsonField<String>,
                    private val operator: JsonField<FilterOperator>,
                    private val value: JsonField<Value>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("key")
                        @ExcludeMissing
                        key: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("operator")
                        @ExcludeMissing
                        operator: JsonField<FilterOperator> = JsonMissing.of(),
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<Value> = JsonMissing.of(),
                    ) : this(key, operator, value, mutableMapOf())

                    /**
                     * Filter key to apply
                     *
                     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun key(): String = key.getRequired("key")

                    /**
                     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun operator(): FilterOperator = operator.getRequired("operator")

                    /**
                     * Filter value - can be string, number, or boolean
                     *
                     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun value(): Value = value.getRequired("value")

                    /**
                     * Returns the raw JSON value of [key].
                     *
                     * Unlike [key], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

                    /**
                     * Returns the raw JSON value of [operator].
                     *
                     * Unlike [operator], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("operator")
                    @ExcludeMissing
                    fun _operator(): JsonField<FilterOperator> = operator

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Value> = value

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
                         * [MeterFilterCondition].
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .key()
                         * .operator()
                         * .value()
                         * ```
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [MeterFilterCondition]. */
                    class Builder internal constructor() {

                        private var key: JsonField<String>? = null
                        private var operator: JsonField<FilterOperator>? = null
                        private var value: JsonField<Value>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(meterFilterCondition: MeterFilterCondition) = apply {
                            key = meterFilterCondition.key
                            operator = meterFilterCondition.operator
                            value = meterFilterCondition.value
                            additionalProperties =
                                meterFilterCondition.additionalProperties.toMutableMap()
                        }

                        /** Filter key to apply */
                        fun key(key: String) = key(JsonField.of(key))

                        /**
                         * Sets [Builder.key] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.key] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun key(key: JsonField<String>) = apply { this.key = key }

                        fun operator(operator: FilterOperator) = operator(JsonField.of(operator))

                        /**
                         * Sets [Builder.operator] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.operator] with a well-typed
                         * [FilterOperator] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun operator(operator: JsonField<FilterOperator>) = apply {
                            this.operator = operator
                        }

                        /** Filter value - can be string, number, or boolean */
                        fun value(value: Value) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [Value] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<Value>) = apply { this.value = value }

                        /** Alias for calling [value] with `Value.ofString(string)`. */
                        fun value(string: String) = value(Value.ofString(string))

                        /** Alias for calling [value] with `Value.ofDouble(double)`. */
                        fun value(double: Double) = value(Value.ofDouble(double))

                        /** Alias for calling [value] with `Value.ofBoolean(boolean)`. */
                        fun value(boolean: Boolean) = value(Value.ofBoolean(boolean))

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [MeterFilterCondition].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .key()
                         * .operator()
                         * .value()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): MeterFilterCondition =
                            MeterFilterCondition(
                                checkRequired("key", key),
                                checkRequired("operator", operator),
                                checkRequired("value", value),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): MeterFilterCondition = apply {
                        if (validated) {
                            return@apply
                        }

                        key()
                        operator().validate()
                        value().validate()
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
                        (if (key.asKnown() == null) 0 else 1) +
                            (operator.asKnown()?.validity() ?: 0) +
                            (value.asKnown()?.validity() ?: 0)

                    /** Filter value - can be string, number, or boolean */
                    @JsonDeserialize(using = Value.Deserializer::class)
                    @JsonSerialize(using = Value.Serializer::class)
                    class Value
                    private constructor(
                        private val string: String? = null,
                        private val double: Double? = null,
                        private val boolean: Boolean? = null,
                        private val _json: JsonValue? = null,
                    ) {

                        fun string(): String? = string

                        fun double(): Double? = double

                        fun boolean(): Boolean? = boolean

                        fun isString(): Boolean = string != null

                        fun isDouble(): Boolean = double != null

                        fun isBoolean(): Boolean = boolean != null

                        fun asString(): String = string.getOrThrow("string")

                        fun asDouble(): Double = double.getOrThrow("double")

                        fun asBoolean(): Boolean = boolean.getOrThrow("boolean")

                        fun _json(): JsonValue? = _json

                        fun <T> accept(visitor: Visitor<T>): T =
                            when {
                                string != null -> visitor.visitString(string)
                                double != null -> visitor.visitDouble(double)
                                boolean != null -> visitor.visitBoolean(boolean)
                                else -> visitor.unknown(_json)
                            }

                        private var validated: Boolean = false

                        fun validate(): Value = apply {
                            if (validated) {
                                return@apply
                            }

                            accept(
                                object : Visitor<Unit> {
                                    override fun visitString(string: String) {}

                                    override fun visitDouble(double: Double) {}

                                    override fun visitBoolean(boolean: Boolean) {}
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            accept(
                                object : Visitor<Int> {
                                    override fun visitString(string: String) = 1

                                    override fun visitDouble(double: Double) = 1

                                    override fun visitBoolean(boolean: Boolean) = 1

                                    override fun unknown(json: JsonValue?) = 0
                                }
                            )

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Value &&
                                string == other.string &&
                                double == other.double &&
                                boolean == other.boolean
                        }

                        override fun hashCode(): Int = Objects.hash(string, double, boolean)

                        override fun toString(): String =
                            when {
                                string != null -> "Value{string=$string}"
                                double != null -> "Value{double=$double}"
                                boolean != null -> "Value{boolean=$boolean}"
                                _json != null -> "Value{_unknown=$_json}"
                                else -> throw IllegalStateException("Invalid Value")
                            }

                        companion object {

                            fun ofString(string: String) = Value(string = string)

                            fun ofDouble(double: Double) = Value(double = double)

                            fun ofBoolean(boolean: Boolean) = Value(boolean = boolean)
                        }

                        /**
                         * An interface that defines how to map each variant of [Value] to a value
                         * of type [T].
                         */
                        interface Visitor<out T> {

                            fun visitString(string: String): T

                            fun visitDouble(double: Double): T

                            fun visitBoolean(boolean: Boolean): T

                            /**
                             * Maps an unknown variant of [Value] to a value of type [T].
                             *
                             * An instance of [Value] can contain an unknown variant if it was
                             * deserialized from data that doesn't match any known variant. For
                             * example, if the SDK is on an older version than the API, then the API
                             * may respond with new variants that the SDK is unaware of.
                             *
                             * @throws DodoPaymentsInvalidDataException in the default
                             *   implementation.
                             */
                            fun unknown(json: JsonValue?): T {
                                throw DodoPaymentsInvalidDataException("Unknown Value: $json")
                            }
                        }

                        internal class Deserializer : BaseDeserializer<Value>(Value::class) {

                            override fun ObjectCodec.deserialize(node: JsonNode): Value {
                                val json = JsonValue.fromJsonNode(node)

                                val bestMatches =
                                    sequenceOf(
                                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                                Value(string = it, _json = json)
                                            },
                                            tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                                Value(double = it, _json = json)
                                            },
                                            tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                                                Value(boolean = it, _json = json)
                                            },
                                        )
                                        .filterNotNull()
                                        .allMaxBy { it.validity() }
                                        .toList()
                                return when (bestMatches.size) {
                                    // This can happen if what we're deserializing is completely
                                    // incompatible with all the possible variants (e.g.
                                    // deserializing from object).
                                    0 -> Value(_json = json)
                                    1 -> bestMatches.single()
                                    // If there's more than one match with the highest validity,
                                    // then use the first completely valid match, or simply the
                                    // first match if none are completely valid.
                                    else ->
                                        bestMatches.firstOrNull { it.isValid() }
                                            ?: bestMatches.first()
                                }
                            }
                        }

                        internal class Serializer : BaseSerializer<Value>(Value::class) {

                            override fun serialize(
                                value: Value,
                                generator: JsonGenerator,
                                provider: SerializerProvider,
                            ) {
                                when {
                                    value.string != null -> generator.writeObject(value.string)
                                    value.double != null -> generator.writeObject(value.double)
                                    value.boolean != null -> generator.writeObject(value.boolean)
                                    value._json != null -> generator.writeObject(value._json)
                                    else -> throw IllegalStateException("Invalid Value")
                                }
                            }
                        }
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is MeterFilterCondition &&
                            key == other.key &&
                            operator == other.operator &&
                            value == other.value &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(key, operator, value, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "MeterFilterCondition{key=$key, operator=$operator, value=$value, additionalProperties=$additionalProperties}"
                }

                /** Level 2 nested filter */
                class InnerInnerMeterFilter
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val clauses: JsonField<InnerInnerClauses>,
                    private val conjunction: JsonField<Conjunction>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("clauses")
                        @ExcludeMissing
                        clauses: JsonField<InnerInnerClauses> = JsonMissing.of(),
                        @JsonProperty("conjunction")
                        @ExcludeMissing
                        conjunction: JsonField<Conjunction> = JsonMissing.of(),
                    ) : this(clauses, conjunction, mutableMapOf())

                    /**
                     * Level 2: Can be conditions or nested filters (1 more level allowed)
                     *
                     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun clauses(): InnerInnerClauses = clauses.getRequired("clauses")

                    /**
                     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun conjunction(): Conjunction = conjunction.getRequired("conjunction")

                    /**
                     * Returns the raw JSON value of [clauses].
                     *
                     * Unlike [clauses], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("clauses")
                    @ExcludeMissing
                    fun _clauses(): JsonField<InnerInnerClauses> = clauses

                    /**
                     * Returns the raw JSON value of [conjunction].
                     *
                     * Unlike [conjunction], this method doesn't throw if the JSON field has an
                     * unexpected type.
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
                         * Returns a mutable builder for constructing an instance of
                         * [InnerInnerMeterFilter].
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .clauses()
                         * .conjunction()
                         * ```
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [InnerInnerMeterFilter]. */
                    class Builder internal constructor() {

                        private var clauses: JsonField<InnerInnerClauses>? = null
                        private var conjunction: JsonField<Conjunction>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(innerInnerMeterFilter: InnerInnerMeterFilter) = apply {
                            clauses = innerInnerMeterFilter.clauses
                            conjunction = innerInnerMeterFilter.conjunction
                            additionalProperties =
                                innerInnerMeterFilter.additionalProperties.toMutableMap()
                        }

                        /** Level 2: Can be conditions or nested filters (1 more level allowed) */
                        fun clauses(clauses: InnerInnerClauses) = clauses(JsonField.of(clauses))

                        /**
                         * Sets [Builder.clauses] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.clauses] with a well-typed
                         * [InnerInnerClauses] value instead. This method is primarily for setting
                         * the field to an undocumented or not yet supported value.
                         */
                        fun clauses(clauses: JsonField<InnerInnerClauses>) = apply {
                            this.clauses = clauses
                        }

                        /**
                         * Alias for calling [clauses] with
                         * `InnerInnerClauses.ofLevel2FilterConditions(level2FilterConditions)`.
                         */
                        fun clausesOfLevel2FilterConditions(
                            level2FilterConditions: List<InnerInnerClauses.MeterFilterCondition>
                        ) =
                            clauses(
                                InnerInnerClauses.ofLevel2FilterConditions(level2FilterConditions)
                            )

                        /**
                         * Alias for calling [clauses] with
                         * `InnerInnerClauses.ofLevel2NestedFilters(level2NestedFilters)`.
                         */
                        fun clausesOfLevel2NestedFilters(
                            level2NestedFilters: List<InnerInnerClauses.InnerInnerInnerMeterFilter>
                        ) = clauses(InnerInnerClauses.ofLevel2NestedFilters(level2NestedFilters))

                        fun conjunction(conjunction: Conjunction) =
                            conjunction(JsonField.of(conjunction))

                        /**
                         * Sets [Builder.conjunction] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.conjunction] with a well-typed
                         * [Conjunction] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun conjunction(conjunction: JsonField<Conjunction>) = apply {
                            this.conjunction = conjunction
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [InnerInnerMeterFilter].
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
                        fun build(): InnerInnerMeterFilter =
                            InnerInnerMeterFilter(
                                checkRequired("clauses", clauses),
                                checkRequired("conjunction", conjunction),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): InnerInnerMeterFilter = apply {
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
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    internal fun validity(): Int =
                        (clauses.asKnown()?.validity() ?: 0) +
                            (conjunction.asKnown()?.validity() ?: 0)

                    /** Level 2: Can be conditions or nested filters (1 more level allowed) */
                    @JsonDeserialize(using = InnerInnerClauses.Deserializer::class)
                    @JsonSerialize(using = InnerInnerClauses.Serializer::class)
                    class InnerInnerClauses
                    private constructor(
                        private val level2FilterConditions: List<MeterFilterCondition>? = null,
                        private val level2NestedFilters: List<InnerInnerInnerMeterFilter>? = null,
                        private val _json: JsonValue? = null,
                    ) {

                        /** Array of filter conditions */
                        fun level2FilterConditions(): List<MeterFilterCondition>? =
                            level2FilterConditions

                        /** Array of level 3 nested filters (final level) */
                        fun level2NestedFilters(): List<InnerInnerInnerMeterFilter>? =
                            level2NestedFilters

                        fun isLevel2FilterConditions(): Boolean = level2FilterConditions != null

                        fun isLevel2NestedFilters(): Boolean = level2NestedFilters != null

                        /** Array of filter conditions */
                        fun asLevel2FilterConditions(): List<MeterFilterCondition> =
                            level2FilterConditions.getOrThrow("level2FilterConditions")

                        /** Array of level 3 nested filters (final level) */
                        fun asLevel2NestedFilters(): List<InnerInnerInnerMeterFilter> =
                            level2NestedFilters.getOrThrow("level2NestedFilters")

                        fun _json(): JsonValue? = _json

                        fun <T> accept(visitor: Visitor<T>): T =
                            when {
                                level2FilterConditions != null ->
                                    visitor.visitLevel2FilterConditions(level2FilterConditions)
                                level2NestedFilters != null ->
                                    visitor.visitLevel2NestedFilters(level2NestedFilters)
                                else -> visitor.unknown(_json)
                            }

                        private var validated: Boolean = false

                        fun validate(): InnerInnerClauses = apply {
                            if (validated) {
                                return@apply
                            }

                            accept(
                                object : Visitor<Unit> {
                                    override fun visitLevel2FilterConditions(
                                        level2FilterConditions: List<MeterFilterCondition>
                                    ) {
                                        level2FilterConditions.forEach { it.validate() }
                                    }

                                    override fun visitLevel2NestedFilters(
                                        level2NestedFilters: List<InnerInnerInnerMeterFilter>
                                    ) {
                                        level2NestedFilters.forEach { it.validate() }
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            accept(
                                object : Visitor<Int> {
                                    override fun visitLevel2FilterConditions(
                                        level2FilterConditions: List<MeterFilterCondition>
                                    ) = level2FilterConditions.sumOf { it.validity().toInt() }

                                    override fun visitLevel2NestedFilters(
                                        level2NestedFilters: List<InnerInnerInnerMeterFilter>
                                    ) = level2NestedFilters.sumOf { it.validity().toInt() }

                                    override fun unknown(json: JsonValue?) = 0
                                }
                            )

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is InnerInnerClauses &&
                                level2FilterConditions == other.level2FilterConditions &&
                                level2NestedFilters == other.level2NestedFilters
                        }

                        override fun hashCode(): Int =
                            Objects.hash(level2FilterConditions, level2NestedFilters)

                        override fun toString(): String =
                            when {
                                level2FilterConditions != null ->
                                    "InnerInnerClauses{level2FilterConditions=$level2FilterConditions}"
                                level2NestedFilters != null ->
                                    "InnerInnerClauses{level2NestedFilters=$level2NestedFilters}"
                                _json != null -> "InnerInnerClauses{_unknown=$_json}"
                                else -> throw IllegalStateException("Invalid InnerInnerClauses")
                            }

                        companion object {

                            /** Array of filter conditions */
                            fun ofLevel2FilterConditions(
                                level2FilterConditions: List<MeterFilterCondition>
                            ) =
                                InnerInnerClauses(
                                    level2FilterConditions = level2FilterConditions.toImmutable()
                                )

                            /** Array of level 3 nested filters (final level) */
                            fun ofLevel2NestedFilters(
                                level2NestedFilters: List<InnerInnerInnerMeterFilter>
                            ) =
                                InnerInnerClauses(
                                    level2NestedFilters = level2NestedFilters.toImmutable()
                                )
                        }

                        /**
                         * An interface that defines how to map each variant of [InnerInnerClauses]
                         * to a value of type [T].
                         */
                        interface Visitor<out T> {

                            /** Array of filter conditions */
                            fun visitLevel2FilterConditions(
                                level2FilterConditions: List<MeterFilterCondition>
                            ): T

                            /** Array of level 3 nested filters (final level) */
                            fun visitLevel2NestedFilters(
                                level2NestedFilters: List<InnerInnerInnerMeterFilter>
                            ): T

                            /**
                             * Maps an unknown variant of [InnerInnerClauses] to a value of type
                             * [T].
                             *
                             * An instance of [InnerInnerClauses] can contain an unknown variant if
                             * it was deserialized from data that doesn't match any known variant.
                             * For example, if the SDK is on an older version than the API, then the
                             * API may respond with new variants that the SDK is unaware of.
                             *
                             * @throws DodoPaymentsInvalidDataException in the default
                             *   implementation.
                             */
                            fun unknown(json: JsonValue?): T {
                                throw DodoPaymentsInvalidDataException(
                                    "Unknown InnerInnerClauses: $json"
                                )
                            }
                        }

                        internal class Deserializer :
                            BaseDeserializer<InnerInnerClauses>(InnerInnerClauses::class) {

                            override fun ObjectCodec.deserialize(
                                node: JsonNode
                            ): InnerInnerClauses {
                                val json = JsonValue.fromJsonNode(node)

                                val bestMatches =
                                    sequenceOf(
                                            tryDeserialize(
                                                    node,
                                                    jacksonTypeRef<List<MeterFilterCondition>>(),
                                                )
                                                ?.let {
                                                    InnerInnerClauses(
                                                        level2FilterConditions = it,
                                                        _json = json,
                                                    )
                                                },
                                            tryDeserialize(
                                                    node,
                                                    jacksonTypeRef<
                                                        List<InnerInnerInnerMeterFilter>
                                                    >(),
                                                )
                                                ?.let {
                                                    InnerInnerClauses(
                                                        level2NestedFilters = it,
                                                        _json = json,
                                                    )
                                                },
                                        )
                                        .filterNotNull()
                                        .allMaxBy { it.validity() }
                                        .toList()
                                return when (bestMatches.size) {
                                    // This can happen if what we're deserializing is completely
                                    // incompatible with all the possible variants (e.g.
                                    // deserializing from boolean).
                                    0 -> InnerInnerClauses(_json = json)
                                    1 -> bestMatches.single()
                                    // If there's more than one match with the highest validity,
                                    // then use the first completely valid match, or simply the
                                    // first match if none are completely valid.
                                    else ->
                                        bestMatches.firstOrNull { it.isValid() }
                                            ?: bestMatches.first()
                                }
                            }
                        }

                        internal class Serializer :
                            BaseSerializer<InnerInnerClauses>(InnerInnerClauses::class) {

                            override fun serialize(
                                value: InnerInnerClauses,
                                generator: JsonGenerator,
                                provider: SerializerProvider,
                            ) {
                                when {
                                    value.level2FilterConditions != null ->
                                        generator.writeObject(value.level2FilterConditions)
                                    value.level2NestedFilters != null ->
                                        generator.writeObject(value.level2NestedFilters)
                                    value._json != null -> generator.writeObject(value._json)
                                    else -> throw IllegalStateException("Invalid InnerInnerClauses")
                                }
                            }
                        }

                        /** Filter condition with key, operator, and value */
                        class MeterFilterCondition
                        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                        private constructor(
                            private val key: JsonField<String>,
                            private val operator: JsonField<FilterOperator>,
                            private val value: JsonField<Value>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("key")
                                @ExcludeMissing
                                key: JsonField<String> = JsonMissing.of(),
                                @JsonProperty("operator")
                                @ExcludeMissing
                                operator: JsonField<FilterOperator> = JsonMissing.of(),
                                @JsonProperty("value")
                                @ExcludeMissing
                                value: JsonField<Value> = JsonMissing.of(),
                            ) : this(key, operator, value, mutableMapOf())

                            /**
                             * Filter key to apply
                             *
                             * @throws DodoPaymentsInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun key(): String = key.getRequired("key")

                            /**
                             * @throws DodoPaymentsInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun operator(): FilterOperator = operator.getRequired("operator")

                            /**
                             * Filter value - can be string, number, or boolean
                             *
                             * @throws DodoPaymentsInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun value(): Value = value.getRequired("value")

                            /**
                             * Returns the raw JSON value of [key].
                             *
                             * Unlike [key], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

                            /**
                             * Returns the raw JSON value of [operator].
                             *
                             * Unlike [operator], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("operator")
                            @ExcludeMissing
                            fun _operator(): JsonField<FilterOperator> = operator

                            /**
                             * Returns the raw JSON value of [value].
                             *
                             * Unlike [value], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("value")
                            @ExcludeMissing
                            fun _value(): JsonField<Value> = value

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
                                 * [MeterFilterCondition].
                                 *
                                 * The following fields are required:
                                 * ```kotlin
                                 * .key()
                                 * .operator()
                                 * .value()
                                 * ```
                                 */
                                fun builder() = Builder()
                            }

                            /** A builder for [MeterFilterCondition]. */
                            class Builder internal constructor() {

                                private var key: JsonField<String>? = null
                                private var operator: JsonField<FilterOperator>? = null
                                private var value: JsonField<Value>? = null
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(meterFilterCondition: MeterFilterCondition) =
                                    apply {
                                        key = meterFilterCondition.key
                                        operator = meterFilterCondition.operator
                                        value = meterFilterCondition.value
                                        additionalProperties =
                                            meterFilterCondition.additionalProperties.toMutableMap()
                                    }

                                /** Filter key to apply */
                                fun key(key: String) = key(JsonField.of(key))

                                /**
                                 * Sets [Builder.key] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.key] with a well-typed [String]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun key(key: JsonField<String>) = apply { this.key = key }

                                fun operator(operator: FilterOperator) =
                                    operator(JsonField.of(operator))

                                /**
                                 * Sets [Builder.operator] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.operator] with a well-typed
                                 * [FilterOperator] value instead. This method is primarily for
                                 * setting the field to an undocumented or not yet supported value.
                                 */
                                fun operator(operator: JsonField<FilterOperator>) = apply {
                                    this.operator = operator
                                }

                                /** Filter value - can be string, number, or boolean */
                                fun value(value: Value) = value(JsonField.of(value))

                                /**
                                 * Sets [Builder.value] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.value] with a well-typed [Value]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun value(value: JsonField<Value>) = apply { this.value = value }

                                /** Alias for calling [value] with `Value.ofString(string)`. */
                                fun value(string: String) = value(Value.ofString(string))

                                /** Alias for calling [value] with `Value.ofDouble(double)`. */
                                fun value(double: Double) = value(Value.ofDouble(double))

                                /** Alias for calling [value] with `Value.ofBoolean(boolean)`. */
                                fun value(boolean: Boolean) = value(Value.ofBoolean(boolean))

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [MeterFilterCondition].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 *
                                 * The following fields are required:
                                 * ```kotlin
                                 * .key()
                                 * .operator()
                                 * .value()
                                 * ```
                                 *
                                 * @throws IllegalStateException if any required field is unset.
                                 */
                                fun build(): MeterFilterCondition =
                                    MeterFilterCondition(
                                        checkRequired("key", key),
                                        checkRequired("operator", operator),
                                        checkRequired("value", value),
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            fun validate(): MeterFilterCondition = apply {
                                if (validated) {
                                    return@apply
                                }

                                key()
                                operator().validate()
                                value().validate()
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            internal fun validity(): Int =
                                (if (key.asKnown() == null) 0 else 1) +
                                    (operator.asKnown()?.validity() ?: 0) +
                                    (value.asKnown()?.validity() ?: 0)

                            /** Filter value - can be string, number, or boolean */
                            @JsonDeserialize(using = Value.Deserializer::class)
                            @JsonSerialize(using = Value.Serializer::class)
                            class Value
                            private constructor(
                                private val string: String? = null,
                                private val double: Double? = null,
                                private val boolean: Boolean? = null,
                                private val _json: JsonValue? = null,
                            ) {

                                fun string(): String? = string

                                fun double(): Double? = double

                                fun boolean(): Boolean? = boolean

                                fun isString(): Boolean = string != null

                                fun isDouble(): Boolean = double != null

                                fun isBoolean(): Boolean = boolean != null

                                fun asString(): String = string.getOrThrow("string")

                                fun asDouble(): Double = double.getOrThrow("double")

                                fun asBoolean(): Boolean = boolean.getOrThrow("boolean")

                                fun _json(): JsonValue? = _json

                                fun <T> accept(visitor: Visitor<T>): T =
                                    when {
                                        string != null -> visitor.visitString(string)
                                        double != null -> visitor.visitDouble(double)
                                        boolean != null -> visitor.visitBoolean(boolean)
                                        else -> visitor.unknown(_json)
                                    }

                                private var validated: Boolean = false

                                fun validate(): Value = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    accept(
                                        object : Visitor<Unit> {
                                            override fun visitString(string: String) {}

                                            override fun visitDouble(double: Double) {}

                                            override fun visitBoolean(boolean: Boolean) {}
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
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                internal fun validity(): Int =
                                    accept(
                                        object : Visitor<Int> {
                                            override fun visitString(string: String) = 1

                                            override fun visitDouble(double: Double) = 1

                                            override fun visitBoolean(boolean: Boolean) = 1

                                            override fun unknown(json: JsonValue?) = 0
                                        }
                                    )

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Value &&
                                        string == other.string &&
                                        double == other.double &&
                                        boolean == other.boolean
                                }

                                override fun hashCode(): Int = Objects.hash(string, double, boolean)

                                override fun toString(): String =
                                    when {
                                        string != null -> "Value{string=$string}"
                                        double != null -> "Value{double=$double}"
                                        boolean != null -> "Value{boolean=$boolean}"
                                        _json != null -> "Value{_unknown=$_json}"
                                        else -> throw IllegalStateException("Invalid Value")
                                    }

                                companion object {

                                    fun ofString(string: String) = Value(string = string)

                                    fun ofDouble(double: Double) = Value(double = double)

                                    fun ofBoolean(boolean: Boolean) = Value(boolean = boolean)
                                }

                                /**
                                 * An interface that defines how to map each variant of [Value] to a
                                 * value of type [T].
                                 */
                                interface Visitor<out T> {

                                    fun visitString(string: String): T

                                    fun visitDouble(double: Double): T

                                    fun visitBoolean(boolean: Boolean): T

                                    /**
                                     * Maps an unknown variant of [Value] to a value of type [T].
                                     *
                                     * An instance of [Value] can contain an unknown variant if it
                                     * was deserialized from data that doesn't match any known
                                     * variant. For example, if the SDK is on an older version than
                                     * the API, then the API may respond with new variants that the
                                     * SDK is unaware of.
                                     *
                                     * @throws DodoPaymentsInvalidDataException in the default
                                     *   implementation.
                                     */
                                    fun unknown(json: JsonValue?): T {
                                        throw DodoPaymentsInvalidDataException(
                                            "Unknown Value: $json"
                                        )
                                    }
                                }

                                internal class Deserializer :
                                    BaseDeserializer<Value>(Value::class) {

                                    override fun ObjectCodec.deserialize(node: JsonNode): Value {
                                        val json = JsonValue.fromJsonNode(node)

                                        val bestMatches =
                                            sequenceOf(
                                                    tryDeserialize(node, jacksonTypeRef<String>())
                                                        ?.let { Value(string = it, _json = json) },
                                                    tryDeserialize(node, jacksonTypeRef<Double>())
                                                        ?.let { Value(double = it, _json = json) },
                                                    tryDeserialize(node, jacksonTypeRef<Boolean>())
                                                        ?.let { Value(boolean = it, _json = json) },
                                                )
                                                .filterNotNull()
                                                .allMaxBy { it.validity() }
                                                .toList()
                                        return when (bestMatches.size) {
                                            // This can happen if what we're deserializing is
                                            // completely incompatible with all the possible
                                            // variants (e.g. deserializing from object).
                                            0 -> Value(_json = json)
                                            1 -> bestMatches.single()
                                            // If there's more than one match with the highest
                                            // validity, then use the first completely valid match,
                                            // or simply the first match if none are completely
                                            // valid.
                                            else ->
                                                bestMatches.firstOrNull { it.isValid() }
                                                    ?: bestMatches.first()
                                        }
                                    }
                                }

                                internal class Serializer : BaseSerializer<Value>(Value::class) {

                                    override fun serialize(
                                        value: Value,
                                        generator: JsonGenerator,
                                        provider: SerializerProvider,
                                    ) {
                                        when {
                                            value.string != null ->
                                                generator.writeObject(value.string)
                                            value.double != null ->
                                                generator.writeObject(value.double)
                                            value.boolean != null ->
                                                generator.writeObject(value.boolean)
                                            value._json != null ->
                                                generator.writeObject(value._json)
                                            else -> throw IllegalStateException("Invalid Value")
                                        }
                                    }
                                }
                            }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is MeterFilterCondition &&
                                    key == other.key &&
                                    operator == other.operator &&
                                    value == other.value &&
                                    additionalProperties == other.additionalProperties
                            }

                            private val hashCode: Int by lazy {
                                Objects.hash(key, operator, value, additionalProperties)
                            }

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "MeterFilterCondition{key=$key, operator=$operator, value=$value, additionalProperties=$additionalProperties}"
                        }

                        /** Level 3 nested filter (final nesting level) */
                        class InnerInnerInnerMeterFilter
                        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                        private constructor(
                            private val clauses: JsonField<List<Clause>>,
                            private val conjunction: JsonField<Conjunction>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("clauses")
                                @ExcludeMissing
                                clauses: JsonField<List<Clause>> = JsonMissing.of(),
                                @JsonProperty("conjunction")
                                @ExcludeMissing
                                conjunction: JsonField<Conjunction> = JsonMissing.of(),
                            ) : this(clauses, conjunction, mutableMapOf())

                            /**
                             * Level 3: Filter conditions only (max depth reached)
                             *
                             * @throws DodoPaymentsInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun clauses(): List<Clause> = clauses.getRequired("clauses")

                            /**
                             * @throws DodoPaymentsInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun conjunction(): Conjunction = conjunction.getRequired("conjunction")

                            /**
                             * Returns the raw JSON value of [clauses].
                             *
                             * Unlike [clauses], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("clauses")
                            @ExcludeMissing
                            fun _clauses(): JsonField<List<Clause>> = clauses

                            /**
                             * Returns the raw JSON value of [conjunction].
                             *
                             * Unlike [conjunction], this method doesn't throw if the JSON field has
                             * an unexpected type.
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
                                 * Returns a mutable builder for constructing an instance of
                                 * [InnerInnerInnerMeterFilter].
                                 *
                                 * The following fields are required:
                                 * ```kotlin
                                 * .clauses()
                                 * .conjunction()
                                 * ```
                                 */
                                fun builder() = Builder()
                            }

                            /** A builder for [InnerInnerInnerMeterFilter]. */
                            class Builder internal constructor() {

                                private var clauses: JsonField<MutableList<Clause>>? = null
                                private var conjunction: JsonField<Conjunction>? = null
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(
                                    innerInnerInnerMeterFilter: InnerInnerInnerMeterFilter
                                ) = apply {
                                    clauses =
                                        innerInnerInnerMeterFilter.clauses.map {
                                            it.toMutableList()
                                        }
                                    conjunction = innerInnerInnerMeterFilter.conjunction
                                    additionalProperties =
                                        innerInnerInnerMeterFilter.additionalProperties
                                            .toMutableMap()
                                }

                                /** Level 3: Filter conditions only (max depth reached) */
                                fun clauses(clauses: List<Clause>) = clauses(JsonField.of(clauses))

                                /**
                                 * Sets [Builder.clauses] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.clauses] with a well-typed
                                 * `List<Clause>` value instead. This method is primarily for
                                 * setting the field to an undocumented or not yet supported value.
                                 */
                                fun clauses(clauses: JsonField<List<Clause>>) = apply {
                                    this.clauses = clauses.map { it.toMutableList() }
                                }

                                /**
                                 * Adds a single [Clause] to [clauses].
                                 *
                                 * @throws IllegalStateException if the field was previously set to
                                 *   a non-list.
                                 */
                                fun addClause(clause: Clause) = apply {
                                    clauses =
                                        (clauses ?: JsonField.of(mutableListOf())).also {
                                            checkKnown("clauses", it).add(clause)
                                        }
                                }

                                fun conjunction(conjunction: Conjunction) =
                                    conjunction(JsonField.of(conjunction))

                                /**
                                 * Sets [Builder.conjunction] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.conjunction] with a well-typed
                                 * [Conjunction] value instead. This method is primarily for setting
                                 * the field to an undocumented or not yet supported value.
                                 */
                                fun conjunction(conjunction: JsonField<Conjunction>) = apply {
                                    this.conjunction = conjunction
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [InnerInnerInnerMeterFilter].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 *
                                 * The following fields are required:
                                 * ```kotlin
                                 * .clauses()
                                 * .conjunction()
                                 * ```
                                 *
                                 * @throws IllegalStateException if any required field is unset.
                                 */
                                fun build(): InnerInnerInnerMeterFilter =
                                    InnerInnerInnerMeterFilter(
                                        checkRequired("clauses", clauses).map { it.toImmutable() },
                                        checkRequired("conjunction", conjunction),
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            fun validate(): InnerInnerInnerMeterFilter = apply {
                                if (validated) {
                                    return@apply
                                }

                                clauses().forEach { it.validate() }
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            internal fun validity(): Int =
                                (clauses.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                                    (conjunction.asKnown()?.validity() ?: 0)

                            /** Filter condition with key, operator, and value */
                            class Clause
                            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                            private constructor(
                                private val key: JsonField<String>,
                                private val operator: JsonField<FilterOperator>,
                                private val value: JsonField<Value>,
                                private val additionalProperties: MutableMap<String, JsonValue>,
                            ) {

                                @JsonCreator
                                private constructor(
                                    @JsonProperty("key")
                                    @ExcludeMissing
                                    key: JsonField<String> = JsonMissing.of(),
                                    @JsonProperty("operator")
                                    @ExcludeMissing
                                    operator: JsonField<FilterOperator> = JsonMissing.of(),
                                    @JsonProperty("value")
                                    @ExcludeMissing
                                    value: JsonField<Value> = JsonMissing.of(),
                                ) : this(key, operator, value, mutableMapOf())

                                /**
                                 * Filter key to apply
                                 *
                                 * @throws DodoPaymentsInvalidDataException if the JSON field has an
                                 *   unexpected type or is unexpectedly missing or null (e.g. if the
                                 *   server responded with an unexpected value).
                                 */
                                fun key(): String = key.getRequired("key")

                                /**
                                 * @throws DodoPaymentsInvalidDataException if the JSON field has an
                                 *   unexpected type or is unexpectedly missing or null (e.g. if the
                                 *   server responded with an unexpected value).
                                 */
                                fun operator(): FilterOperator = operator.getRequired("operator")

                                /**
                                 * Filter value - can be string, number, or boolean
                                 *
                                 * @throws DodoPaymentsInvalidDataException if the JSON field has an
                                 *   unexpected type or is unexpectedly missing or null (e.g. if the
                                 *   server responded with an unexpected value).
                                 */
                                fun value(): Value = value.getRequired("value")

                                /**
                                 * Returns the raw JSON value of [key].
                                 *
                                 * Unlike [key], this method doesn't throw if the JSON field has an
                                 * unexpected type.
                                 */
                                @JsonProperty("key")
                                @ExcludeMissing
                                fun _key(): JsonField<String> = key

                                /**
                                 * Returns the raw JSON value of [operator].
                                 *
                                 * Unlike [operator], this method doesn't throw if the JSON field
                                 * has an unexpected type.
                                 */
                                @JsonProperty("operator")
                                @ExcludeMissing
                                fun _operator(): JsonField<FilterOperator> = operator

                                /**
                                 * Returns the raw JSON value of [value].
                                 *
                                 * Unlike [value], this method doesn't throw if the JSON field has
                                 * an unexpected type.
                                 */
                                @JsonProperty("value")
                                @ExcludeMissing
                                fun _value(): JsonField<Value> = value

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
                                     * [Clause].
                                     *
                                     * The following fields are required:
                                     * ```kotlin
                                     * .key()
                                     * .operator()
                                     * .value()
                                     * ```
                                     */
                                    fun builder() = Builder()
                                }

                                /** A builder for [Clause]. */
                                class Builder internal constructor() {

                                    private var key: JsonField<String>? = null
                                    private var operator: JsonField<FilterOperator>? = null
                                    private var value: JsonField<Value>? = null
                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
                                        mutableMapOf()

                                    internal fun from(clause: Clause) = apply {
                                        key = clause.key
                                        operator = clause.operator
                                        value = clause.value
                                        additionalProperties =
                                            clause.additionalProperties.toMutableMap()
                                    }

                                    /** Filter key to apply */
                                    fun key(key: String) = key(JsonField.of(key))

                                    /**
                                     * Sets [Builder.key] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.key] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun key(key: JsonField<String>) = apply { this.key = key }

                                    fun operator(operator: FilterOperator) =
                                        operator(JsonField.of(operator))

                                    /**
                                     * Sets [Builder.operator] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.operator] with a well-typed
                                     * [FilterOperator] value instead. This method is primarily for
                                     * setting the field to an undocumented or not yet supported
                                     * value.
                                     */
                                    fun operator(operator: JsonField<FilterOperator>) = apply {
                                        this.operator = operator
                                    }

                                    /** Filter value - can be string, number, or boolean */
                                    fun value(value: Value) = value(JsonField.of(value))

                                    /**
                                     * Sets [Builder.value] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.value] with a well-typed
                                     * [Value] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun value(value: JsonField<Value>) = apply {
                                        this.value = value
                                    }

                                    /** Alias for calling [value] with `Value.ofString(string)`. */
                                    fun value(string: String) = value(Value.ofString(string))

                                    /** Alias for calling [value] with `Value.ofDouble(double)`. */
                                    fun value(double: Double) = value(Value.ofDouble(double))

                                    /**
                                     * Alias for calling [value] with `Value.ofBoolean(boolean)`.
                                     */
                                    fun value(boolean: Boolean) = value(Value.ofBoolean(boolean))

                                    fun additionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.clear()
                                        putAllAdditionalProperties(additionalProperties)
                                    }

                                    fun putAdditionalProperty(key: String, value: JsonValue) =
                                        apply {
                                            additionalProperties.put(key, value)
                                        }

                                    fun putAllAdditionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    fun removeAdditionalProperty(key: String) = apply {
                                        additionalProperties.remove(key)
                                    }

                                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                        keys.forEach(::removeAdditionalProperty)
                                    }

                                    /**
                                     * Returns an immutable instance of [Clause].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
                                     *
                                     * The following fields are required:
                                     * ```kotlin
                                     * .key()
                                     * .operator()
                                     * .value()
                                     * ```
                                     *
                                     * @throws IllegalStateException if any required field is unset.
                                     */
                                    fun build(): Clause =
                                        Clause(
                                            checkRequired("key", key),
                                            checkRequired("operator", operator),
                                            checkRequired("value", value),
                                            additionalProperties.toMutableMap(),
                                        )
                                }

                                private var validated: Boolean = false

                                fun validate(): Clause = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    key()
                                    operator().validate()
                                    value().validate()
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
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                internal fun validity(): Int =
                                    (if (key.asKnown() == null) 0 else 1) +
                                        (operator.asKnown()?.validity() ?: 0) +
                                        (value.asKnown()?.validity() ?: 0)

                                /** Filter value - can be string, number, or boolean */
                                @JsonDeserialize(using = Value.Deserializer::class)
                                @JsonSerialize(using = Value.Serializer::class)
                                class Value
                                private constructor(
                                    private val string: String? = null,
                                    private val double: Double? = null,
                                    private val boolean: Boolean? = null,
                                    private val _json: JsonValue? = null,
                                ) {

                                    fun string(): String? = string

                                    fun double(): Double? = double

                                    fun boolean(): Boolean? = boolean

                                    fun isString(): Boolean = string != null

                                    fun isDouble(): Boolean = double != null

                                    fun isBoolean(): Boolean = boolean != null

                                    fun asString(): String = string.getOrThrow("string")

                                    fun asDouble(): Double = double.getOrThrow("double")

                                    fun asBoolean(): Boolean = boolean.getOrThrow("boolean")

                                    fun _json(): JsonValue? = _json

                                    fun <T> accept(visitor: Visitor<T>): T =
                                        when {
                                            string != null -> visitor.visitString(string)
                                            double != null -> visitor.visitDouble(double)
                                            boolean != null -> visitor.visitBoolean(boolean)
                                            else -> visitor.unknown(_json)
                                        }

                                    private var validated: Boolean = false

                                    fun validate(): Value = apply {
                                        if (validated) {
                                            return@apply
                                        }

                                        accept(
                                            object : Visitor<Unit> {
                                                override fun visitString(string: String) {}

                                                override fun visitDouble(double: Double) {}

                                                override fun visitBoolean(boolean: Boolean) {}
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
                                     * Returns a score indicating how many valid values are
                                     * contained in this object recursively.
                                     *
                                     * Used for best match union deserialization.
                                     */
                                    internal fun validity(): Int =
                                        accept(
                                            object : Visitor<Int> {
                                                override fun visitString(string: String) = 1

                                                override fun visitDouble(double: Double) = 1

                                                override fun visitBoolean(boolean: Boolean) = 1

                                                override fun unknown(json: JsonValue?) = 0
                                            }
                                        )

                                    override fun equals(other: Any?): Boolean {
                                        if (this === other) {
                                            return true
                                        }

                                        return other is Value &&
                                            string == other.string &&
                                            double == other.double &&
                                            boolean == other.boolean
                                    }

                                    override fun hashCode(): Int =
                                        Objects.hash(string, double, boolean)

                                    override fun toString(): String =
                                        when {
                                            string != null -> "Value{string=$string}"
                                            double != null -> "Value{double=$double}"
                                            boolean != null -> "Value{boolean=$boolean}"
                                            _json != null -> "Value{_unknown=$_json}"
                                            else -> throw IllegalStateException("Invalid Value")
                                        }

                                    companion object {

                                        fun ofString(string: String) = Value(string = string)

                                        fun ofDouble(double: Double) = Value(double = double)

                                        fun ofBoolean(boolean: Boolean) = Value(boolean = boolean)
                                    }

                                    /**
                                     * An interface that defines how to map each variant of [Value]
                                     * to a value of type [T].
                                     */
                                    interface Visitor<out T> {

                                        fun visitString(string: String): T

                                        fun visitDouble(double: Double): T

                                        fun visitBoolean(boolean: Boolean): T

                                        /**
                                         * Maps an unknown variant of [Value] to a value of type
                                         * [T].
                                         *
                                         * An instance of [Value] can contain an unknown variant if
                                         * it was deserialized from data that doesn't match any
                                         * known variant. For example, if the SDK is on an older
                                         * version than the API, then the API may respond with new
                                         * variants that the SDK is unaware of.
                                         *
                                         * @throws DodoPaymentsInvalidDataException in the default
                                         *   implementation.
                                         */
                                        fun unknown(json: JsonValue?): T {
                                            throw DodoPaymentsInvalidDataException(
                                                "Unknown Value: $json"
                                            )
                                        }
                                    }

                                    internal class Deserializer :
                                        BaseDeserializer<Value>(Value::class) {

                                        override fun ObjectCodec.deserialize(
                                            node: JsonNode
                                        ): Value {
                                            val json = JsonValue.fromJsonNode(node)

                                            val bestMatches =
                                                sequenceOf(
                                                        tryDeserialize(
                                                                node,
                                                                jacksonTypeRef<String>(),
                                                            )
                                                            ?.let {
                                                                Value(string = it, _json = json)
                                                            },
                                                        tryDeserialize(
                                                                node,
                                                                jacksonTypeRef<Double>(),
                                                            )
                                                            ?.let {
                                                                Value(double = it, _json = json)
                                                            },
                                                        tryDeserialize(
                                                                node,
                                                                jacksonTypeRef<Boolean>(),
                                                            )
                                                            ?.let {
                                                                Value(boolean = it, _json = json)
                                                            },
                                                    )
                                                    .filterNotNull()
                                                    .allMaxBy { it.validity() }
                                                    .toList()
                                            return when (bestMatches.size) {
                                                // This can happen if what we're deserializing is
                                                // completely incompatible with all the possible
                                                // variants (e.g. deserializing from object).
                                                0 -> Value(_json = json)
                                                1 -> bestMatches.single()
                                                // If there's more than one match with the highest
                                                // validity, then use the first completely valid
                                                // match, or simply the first match if none are
                                                // completely valid.
                                                else ->
                                                    bestMatches.firstOrNull { it.isValid() }
                                                        ?: bestMatches.first()
                                            }
                                        }
                                    }

                                    internal class Serializer :
                                        BaseSerializer<Value>(Value::class) {

                                        override fun serialize(
                                            value: Value,
                                            generator: JsonGenerator,
                                            provider: SerializerProvider,
                                        ) {
                                            when {
                                                value.string != null ->
                                                    generator.writeObject(value.string)
                                                value.double != null ->
                                                    generator.writeObject(value.double)
                                                value.boolean != null ->
                                                    generator.writeObject(value.boolean)
                                                value._json != null ->
                                                    generator.writeObject(value._json)
                                                else -> throw IllegalStateException("Invalid Value")
                                            }
                                        }
                                    }
                                }

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Clause &&
                                        key == other.key &&
                                        operator == other.operator &&
                                        value == other.value &&
                                        additionalProperties == other.additionalProperties
                                }

                                private val hashCode: Int by lazy {
                                    Objects.hash(key, operator, value, additionalProperties)
                                }

                                override fun hashCode(): Int = hashCode

                                override fun toString() =
                                    "Clause{key=$key, operator=$operator, value=$value, additionalProperties=$additionalProperties}"
                            }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is InnerInnerInnerMeterFilter &&
                                    clauses == other.clauses &&
                                    conjunction == other.conjunction &&
                                    additionalProperties == other.additionalProperties
                            }

                            private val hashCode: Int by lazy {
                                Objects.hash(clauses, conjunction, additionalProperties)
                            }

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "InnerInnerInnerMeterFilter{clauses=$clauses, conjunction=$conjunction, additionalProperties=$additionalProperties}"
                        }
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is InnerInnerMeterFilter &&
                            clauses == other.clauses &&
                            conjunction == other.conjunction &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(clauses, conjunction, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "InnerInnerMeterFilter{clauses=$clauses, conjunction=$conjunction, additionalProperties=$additionalProperties}"
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InnerMeterFilter &&
                    clauses == other.clauses &&
                    conjunction == other.conjunction &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(clauses, conjunction, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InnerMeterFilter{clauses=$clauses, conjunction=$conjunction, additionalProperties=$additionalProperties}"
        }
    }

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
