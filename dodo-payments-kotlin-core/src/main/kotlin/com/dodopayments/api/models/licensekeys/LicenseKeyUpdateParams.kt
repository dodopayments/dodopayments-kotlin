// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.licensekeys

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.Params
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.core.http.QueryParams
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class LicenseKeyUpdateParams
private constructor(
    private val id: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String = id

    /**
     * The updated activation limit for the license key. Use `null` to remove the limit, or omit
     * this field to leave it unchanged.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun activationsLimit(): Long? = body.activationsLimit()

    /**
     * Indicates whether the license key should be disabled. A value of `true` disables the key,
     * while `false` enables it. Omit this field to leave it unchanged.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun disabled(): Boolean? = body.disabled()

    /**
     * The updated expiration timestamp for the license key in UTC. Use `null` to remove the
     * expiration date, or omit this field to leave it unchanged.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun expiresAt(): OffsetDateTime? = body.expiresAt()

    /**
     * Returns the raw JSON value of [activationsLimit].
     *
     * Unlike [activationsLimit], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _activationsLimit(): JsonField<Long> = body._activationsLimit()

    /**
     * Returns the raw JSON value of [disabled].
     *
     * Unlike [disabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _disabled(): JsonField<Boolean> = body._disabled()

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _expiresAt(): JsonField<OffsetDateTime> = body._expiresAt()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LicenseKeyUpdateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [LicenseKeyUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(licenseKeyUpdateParams: LicenseKeyUpdateParams) = apply {
            id = licenseKeyUpdateParams.id
            body = licenseKeyUpdateParams.body.toBuilder()
            additionalHeaders = licenseKeyUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = licenseKeyUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String) = apply { this.id = id }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [activationsLimit]
         * - [disabled]
         * - [expiresAt]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The updated activation limit for the license key. Use `null` to remove the limit, or omit
         * this field to leave it unchanged.
         */
        fun activationsLimit(activationsLimit: Long?) = apply {
            body.activationsLimit(activationsLimit)
        }

        /**
         * Alias for [Builder.activationsLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun activationsLimit(activationsLimit: Long) = activationsLimit(activationsLimit as Long?)

        /**
         * Sets [Builder.activationsLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activationsLimit] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun activationsLimit(activationsLimit: JsonField<Long>) = apply {
            body.activationsLimit(activationsLimit)
        }

        /**
         * Indicates whether the license key should be disabled. A value of `true` disables the key,
         * while `false` enables it. Omit this field to leave it unchanged.
         */
        fun disabled(disabled: Boolean?) = apply { body.disabled(disabled) }

        /**
         * Alias for [Builder.disabled].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun disabled(disabled: Boolean) = disabled(disabled as Boolean?)

        /**
         * Sets [Builder.disabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.disabled] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun disabled(disabled: JsonField<Boolean>) = apply { body.disabled(disabled) }

        /**
         * The updated expiration timestamp for the license key in UTC. Use `null` to remove the
         * expiration date, or omit this field to leave it unchanged.
         */
        fun expiresAt(expiresAt: OffsetDateTime?) = apply { body.expiresAt(expiresAt) }

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { body.expiresAt(expiresAt) }

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
         * Returns an immutable instance of [LicenseKeyUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LicenseKeyUpdateParams =
            LicenseKeyUpdateParams(
                checkRequired("id", id),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val activationsLimit: JsonField<Long>,
        private val disabled: JsonField<Boolean>,
        private val expiresAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("activations_limit")
            @ExcludeMissing
            activationsLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("disabled")
            @ExcludeMissing
            disabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("expires_at")
            @ExcludeMissing
            expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(activationsLimit, disabled, expiresAt, mutableMapOf())

        /**
         * The updated activation limit for the license key. Use `null` to remove the limit, or omit
         * this field to leave it unchanged.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun activationsLimit(): Long? = activationsLimit.getNullable("activations_limit")

        /**
         * Indicates whether the license key should be disabled. A value of `true` disables the key,
         * while `false` enables it. Omit this field to leave it unchanged.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun disabled(): Boolean? = disabled.getNullable("disabled")

        /**
         * The updated expiration timestamp for the license key in UTC. Use `null` to remove the
         * expiration date, or omit this field to leave it unchanged.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun expiresAt(): OffsetDateTime? = expiresAt.getNullable("expires_at")

        /**
         * Returns the raw JSON value of [activationsLimit].
         *
         * Unlike [activationsLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("activations_limit")
        @ExcludeMissing
        fun _activationsLimit(): JsonField<Long> = activationsLimit

        /**
         * Returns the raw JSON value of [disabled].
         *
         * Unlike [disabled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("disabled") @ExcludeMissing fun _disabled(): JsonField<Boolean> = disabled

        /**
         * Returns the raw JSON value of [expiresAt].
         *
         * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("expires_at")
        @ExcludeMissing
        fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

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

            private var activationsLimit: JsonField<Long> = JsonMissing.of()
            private var disabled: JsonField<Boolean> = JsonMissing.of()
            private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                activationsLimit = body.activationsLimit
                disabled = body.disabled
                expiresAt = body.expiresAt
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The updated activation limit for the license key. Use `null` to remove the limit, or
             * omit this field to leave it unchanged.
             */
            fun activationsLimit(activationsLimit: Long?) =
                activationsLimit(JsonField.ofNullable(activationsLimit))

            /**
             * Alias for [Builder.activationsLimit].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun activationsLimit(activationsLimit: Long) =
                activationsLimit(activationsLimit as Long?)

            /**
             * Sets [Builder.activationsLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.activationsLimit] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun activationsLimit(activationsLimit: JsonField<Long>) = apply {
                this.activationsLimit = activationsLimit
            }

            /**
             * Indicates whether the license key should be disabled. A value of `true` disables the
             * key, while `false` enables it. Omit this field to leave it unchanged.
             */
            fun disabled(disabled: Boolean?) = disabled(JsonField.ofNullable(disabled))

            /**
             * Alias for [Builder.disabled].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun disabled(disabled: Boolean) = disabled(disabled as Boolean?)

            /**
             * Sets [Builder.disabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.disabled] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun disabled(disabled: JsonField<Boolean>) = apply { this.disabled = disabled }

            /**
             * The updated expiration timestamp for the license key in UTC. Use `null` to remove the
             * expiration date, or omit this field to leave it unchanged.
             */
            fun expiresAt(expiresAt: OffsetDateTime?) = expiresAt(JsonField.ofNullable(expiresAt))

            /**
             * Sets [Builder.expiresAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                this.expiresAt = expiresAt
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(activationsLimit, disabled, expiresAt, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            activationsLimit()
            disabled()
            expiresAt()
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
            (if (activationsLimit.asKnown() == null) 0 else 1) +
                (if (disabled.asKnown() == null) 0 else 1) +
                (if (expiresAt.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && activationsLimit == other.activationsLimit && disabled == other.disabled && expiresAt == other.expiresAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(activationsLimit, disabled, expiresAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{activationsLimit=$activationsLimit, disabled=$disabled, expiresAt=$expiresAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LicenseKeyUpdateParams && id == other.id && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(id, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "LicenseKeyUpdateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
