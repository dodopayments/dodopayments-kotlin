// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.licensekeys

import com.dodo_payments.api.core.ExcludeMissing
import com.dodo_payments.api.core.JsonField
import com.dodo_payments.api.core.JsonMissing
import com.dodo_payments.api.core.JsonValue
import com.dodo_payments.api.core.NoAutoDetect
import com.dodo_payments.api.core.Params
import com.dodo_payments.api.core.checkRequired
import com.dodo_payments.api.core.http.Headers
import com.dodo_payments.api.core.http.QueryParams
import com.dodo_payments.api.core.immutableEmptyMap
import com.dodo_payments.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
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
     */
    fun activationsLimit(): Long? = body.activationsLimit()

    /**
     * Indicates whether the license key should be disabled. A value of `true` disables the key,
     * while `false` enables it. Omit this field to leave it unchanged.
     */
    fun disabled(): Boolean? = body.disabled()

    /**
     * The updated expiration timestamp for the license key in UTC. Use `null` to remove the
     * expiration date, or omit this field to leave it unchanged.
     */
    fun expiresAt(): OffsetDateTime? = body.expiresAt()

    /**
     * The updated activation limit for the license key. Use `null` to remove the limit, or omit
     * this field to leave it unchanged.
     */
    fun _activationsLimit(): JsonField<Long> = body._activationsLimit()

    /**
     * Indicates whether the license key should be disabled. A value of `true` disables the key,
     * while `false` enables it. Omit this field to leave it unchanged.
     */
    fun _disabled(): JsonField<Boolean> = body._disabled()

    /**
     * The updated expiration timestamp for the license key in UTC. Use `null` to remove the
     * expiration date, or omit this field to leave it unchanged.
     */
    fun _expiresAt(): JsonField<OffsetDateTime> = body._expiresAt()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> id
            else -> ""
        }
    }

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("activations_limit")
        @ExcludeMissing
        private val activationsLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("disabled")
        @ExcludeMissing
        private val disabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("expires_at")
        @ExcludeMissing
        private val expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The updated activation limit for the license key. Use `null` to remove the limit, or omit
         * this field to leave it unchanged.
         */
        fun activationsLimit(): Long? = activationsLimit.getNullable("activations_limit")

        /**
         * Indicates whether the license key should be disabled. A value of `true` disables the key,
         * while `false` enables it. Omit this field to leave it unchanged.
         */
        fun disabled(): Boolean? = disabled.getNullable("disabled")

        /**
         * The updated expiration timestamp for the license key in UTC. Use `null` to remove the
         * expiration date, or omit this field to leave it unchanged.
         */
        fun expiresAt(): OffsetDateTime? = expiresAt.getNullable("expires_at")

        /**
         * The updated activation limit for the license key. Use `null` to remove the limit, or omit
         * this field to leave it unchanged.
         */
        @JsonProperty("activations_limit")
        @ExcludeMissing
        fun _activationsLimit(): JsonField<Long> = activationsLimit

        /**
         * Indicates whether the license key should be disabled. A value of `true` disables the key,
         * while `false` enables it. Omit this field to leave it unchanged.
         */
        @JsonProperty("disabled") @ExcludeMissing fun _disabled(): JsonField<Boolean> = disabled

        /**
         * The updated expiration timestamp for the license key in UTC. Use `null` to remove the
         * expiration date, or omit this field to leave it unchanged.
         */
        @JsonProperty("expires_at")
        @ExcludeMissing
        fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
             * The updated activation limit for the license key. Use `null` to remove the limit, or
             * omit this field to leave it unchanged.
             */
            fun activationsLimit(activationsLimit: Long) =
                activationsLimit(activationsLimit as Long?)

            /**
             * The updated activation limit for the license key. Use `null` to remove the limit, or
             * omit this field to leave it unchanged.
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
             * Indicates whether the license key should be disabled. A value of `true` disables the
             * key, while `false` enables it. Omit this field to leave it unchanged.
             */
            fun disabled(disabled: Boolean) = disabled(disabled as Boolean?)

            /**
             * Indicates whether the license key should be disabled. A value of `true` disables the
             * key, while `false` enables it. Omit this field to leave it unchanged.
             */
            fun disabled(disabled: JsonField<Boolean>) = apply { this.disabled = disabled }

            /**
             * The updated expiration timestamp for the license key in UTC. Use `null` to remove the
             * expiration date, or omit this field to leave it unchanged.
             */
            fun expiresAt(expiresAt: OffsetDateTime?) = expiresAt(JsonField.ofNullable(expiresAt))

            /**
             * The updated expiration timestamp for the license key in UTC. Use `null` to remove the
             * expiration date, or omit this field to leave it unchanged.
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

            fun build(): Body =
                Body(activationsLimit, disabled, expiresAt, additionalProperties.toImmutable())
        }

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
    @NoAutoDetect
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
         * The updated activation limit for the license key. Use `null` to remove the limit, or omit
         * this field to leave it unchanged.
         */
        fun activationsLimit(activationsLimit: Long?) = apply {
            body.activationsLimit(activationsLimit)
        }

        /**
         * The updated activation limit for the license key. Use `null` to remove the limit, or omit
         * this field to leave it unchanged.
         */
        fun activationsLimit(activationsLimit: Long) = activationsLimit(activationsLimit as Long?)

        /**
         * The updated activation limit for the license key. Use `null` to remove the limit, or omit
         * this field to leave it unchanged.
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
         * Indicates whether the license key should be disabled. A value of `true` disables the key,
         * while `false` enables it. Omit this field to leave it unchanged.
         */
        fun disabled(disabled: Boolean) = disabled(disabled as Boolean?)

        /**
         * Indicates whether the license key should be disabled. A value of `true` disables the key,
         * while `false` enables it. Omit this field to leave it unchanged.
         */
        fun disabled(disabled: JsonField<Boolean>) = apply { body.disabled(disabled) }

        /**
         * The updated expiration timestamp for the license key in UTC. Use `null` to remove the
         * expiration date, or omit this field to leave it unchanged.
         */
        fun expiresAt(expiresAt: OffsetDateTime?) = apply { body.expiresAt(expiresAt) }

        /**
         * The updated expiration timestamp for the license key in UTC. Use `null` to remove the
         * expiration date, or omit this field to leave it unchanged.
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

        fun build(): LicenseKeyUpdateParams =
            LicenseKeyUpdateParams(
                checkRequired("id", id),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
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
