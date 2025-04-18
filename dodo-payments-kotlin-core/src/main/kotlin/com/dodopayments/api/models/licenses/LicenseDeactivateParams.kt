// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.licenses

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
import java.util.Collections
import java.util.Objects

class LicenseDeactivateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun licenseKey(): String = body.licenseKey()

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun licenseKeyInstanceId(): String = body.licenseKeyInstanceId()

    /**
     * Returns the raw JSON value of [licenseKey].
     *
     * Unlike [licenseKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _licenseKey(): JsonField<String> = body._licenseKey()

    /**
     * Returns the raw JSON value of [licenseKeyInstanceId].
     *
     * Unlike [licenseKeyInstanceId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _licenseKeyInstanceId(): JsonField<String> = body._licenseKeyInstanceId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LicenseDeactivateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .licenseKey()
         * .licenseKeyInstanceId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [LicenseDeactivateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(licenseDeactivateParams: LicenseDeactivateParams) = apply {
            body = licenseDeactivateParams.body.toBuilder()
            additionalHeaders = licenseDeactivateParams.additionalHeaders.toBuilder()
            additionalQueryParams = licenseDeactivateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [licenseKey]
         * - [licenseKeyInstanceId]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun licenseKey(licenseKey: String) = apply { body.licenseKey(licenseKey) }

        /**
         * Sets [Builder.licenseKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.licenseKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun licenseKey(licenseKey: JsonField<String>) = apply { body.licenseKey(licenseKey) }

        fun licenseKeyInstanceId(licenseKeyInstanceId: String) = apply {
            body.licenseKeyInstanceId(licenseKeyInstanceId)
        }

        /**
         * Sets [Builder.licenseKeyInstanceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.licenseKeyInstanceId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun licenseKeyInstanceId(licenseKeyInstanceId: JsonField<String>) = apply {
            body.licenseKeyInstanceId(licenseKeyInstanceId)
        }

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
         * Returns an immutable instance of [LicenseDeactivateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .licenseKey()
         * .licenseKeyInstanceId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LicenseDeactivateParams =
            LicenseDeactivateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val licenseKey: JsonField<String>,
        private val licenseKeyInstanceId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("license_key")
            @ExcludeMissing
            licenseKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("license_key_instance_id")
            @ExcludeMissing
            licenseKeyInstanceId: JsonField<String> = JsonMissing.of(),
        ) : this(licenseKey, licenseKeyInstanceId, mutableMapOf())

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun licenseKey(): String = licenseKey.getRequired("license_key")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun licenseKeyInstanceId(): String =
            licenseKeyInstanceId.getRequired("license_key_instance_id")

        /**
         * Returns the raw JSON value of [licenseKey].
         *
         * Unlike [licenseKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("license_key")
        @ExcludeMissing
        fun _licenseKey(): JsonField<String> = licenseKey

        /**
         * Returns the raw JSON value of [licenseKeyInstanceId].
         *
         * Unlike [licenseKeyInstanceId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("license_key_instance_id")
        @ExcludeMissing
        fun _licenseKeyInstanceId(): JsonField<String> = licenseKeyInstanceId

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .licenseKey()
             * .licenseKeyInstanceId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var licenseKey: JsonField<String>? = null
            private var licenseKeyInstanceId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                licenseKey = body.licenseKey
                licenseKeyInstanceId = body.licenseKeyInstanceId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun licenseKey(licenseKey: String) = licenseKey(JsonField.of(licenseKey))

            /**
             * Sets [Builder.licenseKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.licenseKey] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun licenseKey(licenseKey: JsonField<String>) = apply { this.licenseKey = licenseKey }

            fun licenseKeyInstanceId(licenseKeyInstanceId: String) =
                licenseKeyInstanceId(JsonField.of(licenseKeyInstanceId))

            /**
             * Sets [Builder.licenseKeyInstanceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.licenseKeyInstanceId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun licenseKeyInstanceId(licenseKeyInstanceId: JsonField<String>) = apply {
                this.licenseKeyInstanceId = licenseKeyInstanceId
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
             *
             * The following fields are required:
             * ```kotlin
             * .licenseKey()
             * .licenseKeyInstanceId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("licenseKey", licenseKey),
                    checkRequired("licenseKeyInstanceId", licenseKeyInstanceId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            licenseKey()
            licenseKeyInstanceId()
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
            (if (licenseKey.asKnown() == null) 0 else 1) +
                (if (licenseKeyInstanceId.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && licenseKey == other.licenseKey && licenseKeyInstanceId == other.licenseKeyInstanceId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(licenseKey, licenseKeyInstanceId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{licenseKey=$licenseKey, licenseKeyInstanceId=$licenseKeyInstanceId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LicenseDeactivateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "LicenseDeactivateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
