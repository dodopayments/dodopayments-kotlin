// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.meters

import com.dodopayments.api.core.BaseDeserializer
import com.dodopayments.api.core.BaseSerializer
import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.allMaxBy
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
 * Filter clauses — either a flat list of `MeterFilterCondition`s or a list of nested
 * `MeterFilter`s. Up to 3 levels of nesting are accepted; the limit is enforced at runtime.
 */
@JsonDeserialize(using = FilterType.Deserializer::class)
@JsonSerialize(using = FilterType.Serializer::class)
class FilterType
private constructor(
    private val meterFilterConditionList: List<MeterFilterCondition>? = null,
    private val nestedMeterFilterList: List<MeterFilter>? = null,
    private val _json: JsonValue? = null,
) {

    /** Array of filter conditions. */
    fun meterFilterConditionList(): List<MeterFilterCondition>? = meterFilterConditionList

    /** Array of nested filters. */
    fun nestedMeterFilterList(): List<MeterFilter>? = nestedMeterFilterList

    fun isMeterFilterConditionList(): Boolean = meterFilterConditionList != null

    fun isNestedMeterFilterList(): Boolean = nestedMeterFilterList != null

    /** Array of filter conditions. */
    fun asMeterFilterConditionList(): List<MeterFilterCondition> =
        meterFilterConditionList.getOrThrow("meterFilterConditionList")

    /** Array of nested filters. */
    fun asNestedMeterFilterList(): List<MeterFilter> =
        nestedMeterFilterList.getOrThrow("nestedMeterFilterList")

    fun _json(): JsonValue? = _json

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```kotlin
     * import com.dodopayments.api.core.JsonValue
     *
     * val result: String? = filterType.accept(object : FilterType.Visitor<String?> {
     *     override fun visitMeterFilterConditionList(meterFilterConditionList: List<MeterFilterCondition>): String? = meterFilterConditionList.toString()
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
     * @throws DodoPaymentsInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
     *   and the current variant is unknown.
     */
    fun <T> accept(visitor: Visitor<T>): T =
        when {
            meterFilterConditionList != null ->
                visitor.visitMeterFilterConditionList(meterFilterConditionList)
            nestedMeterFilterList != null ->
                visitor.visitNestedMeterFilterList(nestedMeterFilterList)
            else -> visitor.unknown(_json)
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
    fun validate(): FilterType = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitMeterFilterConditionList(
                    meterFilterConditionList: List<MeterFilterCondition>
                ) {
                    meterFilterConditionList.forEach { it.validate() }
                }

                override fun visitNestedMeterFilterList(nestedMeterFilterList: List<MeterFilter>) {
                    nestedMeterFilterList.forEach { it.validate() }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitMeterFilterConditionList(
                    meterFilterConditionList: List<MeterFilterCondition>
                ) = meterFilterConditionList.sumOf { it.validity().toInt() }

                override fun visitNestedMeterFilterList(nestedMeterFilterList: List<MeterFilter>) =
                    nestedMeterFilterList.sumOf { it.validity().toInt() }

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FilterType &&
            meterFilterConditionList == other.meterFilterConditionList &&
            nestedMeterFilterList == other.nestedMeterFilterList
    }

    override fun hashCode(): Int = Objects.hash(meterFilterConditionList, nestedMeterFilterList)

    override fun toString(): String =
        when {
            meterFilterConditionList != null ->
                "FilterType{meterFilterConditionList=$meterFilterConditionList}"
            nestedMeterFilterList != null ->
                "FilterType{nestedMeterFilterList=$nestedMeterFilterList}"
            _json != null -> "FilterType{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid FilterType")
        }

    companion object {

        /** Array of filter conditions. */
        fun ofMeterFilterConditionList(meterFilterConditionList: List<MeterFilterCondition>) =
            FilterType(meterFilterConditionList = meterFilterConditionList.toImmutable())

        /** Array of nested filters. */
        fun ofNestedMeterFilterList(nestedMeterFilterList: List<MeterFilter>) =
            FilterType(nestedMeterFilterList = nestedMeterFilterList.toImmutable())
    }

    /** An interface that defines how to map each variant of [FilterType] to a value of type [T]. */
    interface Visitor<out T> {

        /** Array of filter conditions. */
        fun visitMeterFilterConditionList(meterFilterConditionList: List<MeterFilterCondition>): T

        /** Array of nested filters. */
        fun visitNestedMeterFilterList(nestedMeterFilterList: List<MeterFilter>): T

        /**
         * Maps an unknown variant of [FilterType] to a value of type [T].
         *
         * An instance of [FilterType] can contain an unknown variant if it was deserialized from
         * data that doesn't match any known variant. For example, if the SDK is on an older version
         * than the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws DodoPaymentsInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw DodoPaymentsInvalidDataException("Unknown FilterType: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<FilterType>(FilterType::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): FilterType {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<List<MeterFilterCondition>>())?.let {
                            FilterType(meterFilterConditionList = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<List<MeterFilter>>())?.let {
                            FilterType(nestedMeterFilterList = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> FilterType(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<FilterType>(FilterType::class) {

        override fun serialize(
            value: FilterType,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.meterFilterConditionList != null ->
                    generator.writeObject(value.meterFilterConditionList)
                value.nestedMeterFilterList != null ->
                    generator.writeObject(value.nestedMeterFilterList)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid FilterType")
            }
        }
    }

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
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun key(): String = key.getRequired("key")

        /**
         * Filter operator
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun operator(): FilterOperator = operator.getRequired("operator")

        /**
         * Filter value - can be string, number, or boolean
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
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
         * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
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
             * You should usually call [Builder.key] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun key(key: JsonField<String>) = apply { this.key = key }

            /** Filter operator */
            fun operator(operator: FilterOperator) = operator(JsonField.of(operator))

            /**
             * Sets [Builder.operator] to an arbitrary JSON value.
             *
             * You should usually call [Builder.operator] with a well-typed [FilterOperator] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun operator(operator: JsonField<FilterOperator>) = apply { this.operator = operator }

            /** Filter value - can be string, number, or boolean */
            fun value(value: Value) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [Value] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
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
             * val result: String? = value.accept(object : Value.Visitor<String?> {
             *     override fun visitString(string: String): String? = string.toString()
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
                    string != null -> visitor.visitString(string)
                    double != null -> visitor.visitDouble(double)
                    boolean != null -> visitor.visitBoolean(boolean)
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
             * An interface that defines how to map each variant of [Value] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitString(string: String): T

                fun visitDouble(double: Double): T

                fun visitBoolean(boolean: Boolean): T

                /**
                 * Maps an unknown variant of [Value] to a value of type [T].
                 *
                 * An instance of [Value] can contain an unknown variant if it was deserialized from
                 * data that doesn't match any known variant. For example, if the SDK is on an older
                 * version than the API, then the API may respond with new variants that the SDK is
                 * unaware of.
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
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from object).
                        0 -> Value(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
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
}
