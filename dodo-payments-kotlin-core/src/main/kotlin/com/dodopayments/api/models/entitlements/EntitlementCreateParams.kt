// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.Params
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.core.http.QueryParams
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

/** POST /entitlements */
class EntitlementCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Platform-specific configuration (validated per integration_type)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun integrationConfig(): IntegrationConfig = body.integrationConfig()

    /**
     * Which platform integration this entitlement uses
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun integrationType(): EntitlementIntegrationType = body.integrationType()

    /**
     * Display name for this entitlement
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * Optional description
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): String? = body.description()

    /**
     * Optional user-facing metadata
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun metadata(): Metadata? = body.metadata()

    /**
     * Returns the raw JSON value of [integrationConfig].
     *
     * Unlike [integrationConfig], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _integrationConfig(): JsonField<IntegrationConfig> = body._integrationConfig()

    /**
     * Returns the raw JSON value of [integrationType].
     *
     * Unlike [integrationType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _integrationType(): JsonField<EntitlementIntegrationType> = body._integrationType()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EntitlementCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .integrationConfig()
         * .integrationType()
         * .name()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [EntitlementCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(entitlementCreateParams: EntitlementCreateParams) = apply {
            body = entitlementCreateParams.body.toBuilder()
            additionalHeaders = entitlementCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = entitlementCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [integrationConfig]
         * - [integrationType]
         * - [name]
         * - [description]
         * - [metadata]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Platform-specific configuration (validated per integration_type) */
        fun integrationConfig(integrationConfig: IntegrationConfig) = apply {
            body.integrationConfig(integrationConfig)
        }

        /**
         * Sets [Builder.integrationConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.integrationConfig] with a well-typed [IntegrationConfig]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun integrationConfig(integrationConfig: JsonField<IntegrationConfig>) = apply {
            body.integrationConfig(integrationConfig)
        }

        /** Alias for calling [integrationConfig] with `IntegrationConfig.ofGitHub(github)`. */
        fun integrationConfig(github: IntegrationConfig.GitHubConfig) = apply {
            body.integrationConfig(github)
        }

        /** Alias for calling [integrationConfig] with `IntegrationConfig.ofDiscord(discord)`. */
        fun integrationConfig(discord: IntegrationConfig.DiscordConfig) = apply {
            body.integrationConfig(discord)
        }

        /** Alias for calling [integrationConfig] with `IntegrationConfig.ofTelegram(telegram)`. */
        fun integrationConfig(telegram: IntegrationConfig.TelegramConfig) = apply {
            body.integrationConfig(telegram)
        }

        /** Alias for calling [integrationConfig] with `IntegrationConfig.ofFigma(figma)`. */
        fun integrationConfig(figma: IntegrationConfig.FigmaConfig) = apply {
            body.integrationConfig(figma)
        }

        /** Alias for calling [integrationConfig] with `IntegrationConfig.ofFramer(framer)`. */
        fun integrationConfig(framer: IntegrationConfig.FramerConfig) = apply {
            body.integrationConfig(framer)
        }

        /** Alias for calling [integrationConfig] with `IntegrationConfig.ofNotion(notion)`. */
        fun integrationConfig(notion: IntegrationConfig.NotionConfig) = apply {
            body.integrationConfig(notion)
        }

        /**
         * Alias for calling [integrationConfig] with
         * `IntegrationConfig.ofDigitalFiles(digitalFiles)`.
         */
        fun integrationConfig(digitalFiles: IntegrationConfig.DigitalFilesConfig) = apply {
            body.integrationConfig(digitalFiles)
        }

        /**
         * Alias for calling [integrationConfig] with `IntegrationConfig.ofLicenseKey(licenseKey)`.
         */
        fun integrationConfig(licenseKey: IntegrationConfig.LicenseKeyConfig) = apply {
            body.integrationConfig(licenseKey)
        }

        /** Which platform integration this entitlement uses */
        fun integrationType(integrationType: EntitlementIntegrationType) = apply {
            body.integrationType(integrationType)
        }

        /**
         * Sets [Builder.integrationType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.integrationType] with a well-typed
         * [EntitlementIntegrationType] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun integrationType(integrationType: JsonField<EntitlementIntegrationType>) = apply {
            body.integrationType(integrationType)
        }

        /** Display name for this entitlement */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** Optional description */
        fun description(description: String?) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** Optional user-facing metadata */
        fun metadata(metadata: Metadata?) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

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
         * Returns an immutable instance of [EntitlementCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .integrationConfig()
         * .integrationType()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EntitlementCreateParams =
            EntitlementCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val integrationConfig: JsonField<IntegrationConfig>,
        private val integrationType: JsonField<EntitlementIntegrationType>,
        private val name: JsonField<String>,
        private val description: JsonField<String>,
        private val metadata: JsonField<Metadata>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("integration_config")
            @ExcludeMissing
            integrationConfig: JsonField<IntegrationConfig> = JsonMissing.of(),
            @JsonProperty("integration_type")
            @ExcludeMissing
            integrationType: JsonField<EntitlementIntegrationType> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
        ) : this(integrationConfig, integrationType, name, description, metadata, mutableMapOf())

        /**
         * Platform-specific configuration (validated per integration_type)
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun integrationConfig(): IntegrationConfig =
            integrationConfig.getRequired("integration_config")

        /**
         * Which platform integration this entitlement uses
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun integrationType(): EntitlementIntegrationType =
            integrationType.getRequired("integration_type")

        /**
         * Display name for this entitlement
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Optional description
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * Optional user-facing metadata
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * Returns the raw JSON value of [integrationConfig].
         *
         * Unlike [integrationConfig], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("integration_config")
        @ExcludeMissing
        fun _integrationConfig(): JsonField<IntegrationConfig> = integrationConfig

        /**
         * Returns the raw JSON value of [integrationType].
         *
         * Unlike [integrationType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("integration_type")
        @ExcludeMissing
        fun _integrationType(): JsonField<EntitlementIntegrationType> = integrationType

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
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

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
             * .integrationConfig()
             * .integrationType()
             * .name()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var integrationConfig: JsonField<IntegrationConfig>? = null
            private var integrationType: JsonField<EntitlementIntegrationType>? = null
            private var name: JsonField<String>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                integrationConfig = body.integrationConfig
                integrationType = body.integrationType
                name = body.name
                description = body.description
                metadata = body.metadata
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Platform-specific configuration (validated per integration_type) */
            fun integrationConfig(integrationConfig: IntegrationConfig) =
                integrationConfig(JsonField.of(integrationConfig))

            /**
             * Sets [Builder.integrationConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.integrationConfig] with a well-typed
             * [IntegrationConfig] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun integrationConfig(integrationConfig: JsonField<IntegrationConfig>) = apply {
                this.integrationConfig = integrationConfig
            }

            /** Alias for calling [integrationConfig] with `IntegrationConfig.ofGitHub(github)`. */
            fun integrationConfig(github: IntegrationConfig.GitHubConfig) =
                integrationConfig(IntegrationConfig.ofGitHub(github))

            /**
             * Alias for calling [integrationConfig] with `IntegrationConfig.ofDiscord(discord)`.
             */
            fun integrationConfig(discord: IntegrationConfig.DiscordConfig) =
                integrationConfig(IntegrationConfig.ofDiscord(discord))

            /**
             * Alias for calling [integrationConfig] with `IntegrationConfig.ofTelegram(telegram)`.
             */
            fun integrationConfig(telegram: IntegrationConfig.TelegramConfig) =
                integrationConfig(IntegrationConfig.ofTelegram(telegram))

            /** Alias for calling [integrationConfig] with `IntegrationConfig.ofFigma(figma)`. */
            fun integrationConfig(figma: IntegrationConfig.FigmaConfig) =
                integrationConfig(IntegrationConfig.ofFigma(figma))

            /** Alias for calling [integrationConfig] with `IntegrationConfig.ofFramer(framer)`. */
            fun integrationConfig(framer: IntegrationConfig.FramerConfig) =
                integrationConfig(IntegrationConfig.ofFramer(framer))

            /** Alias for calling [integrationConfig] with `IntegrationConfig.ofNotion(notion)`. */
            fun integrationConfig(notion: IntegrationConfig.NotionConfig) =
                integrationConfig(IntegrationConfig.ofNotion(notion))

            /**
             * Alias for calling [integrationConfig] with
             * `IntegrationConfig.ofDigitalFiles(digitalFiles)`.
             */
            fun integrationConfig(digitalFiles: IntegrationConfig.DigitalFilesConfig) =
                integrationConfig(IntegrationConfig.ofDigitalFiles(digitalFiles))

            /**
             * Alias for calling [integrationConfig] with
             * `IntegrationConfig.ofLicenseKey(licenseKey)`.
             */
            fun integrationConfig(licenseKey: IntegrationConfig.LicenseKeyConfig) =
                integrationConfig(IntegrationConfig.ofLicenseKey(licenseKey))

            /** Which platform integration this entitlement uses */
            fun integrationType(integrationType: EntitlementIntegrationType) =
                integrationType(JsonField.of(integrationType))

            /**
             * Sets [Builder.integrationType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.integrationType] with a well-typed
             * [EntitlementIntegrationType] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun integrationType(integrationType: JsonField<EntitlementIntegrationType>) = apply {
                this.integrationType = integrationType
            }

            /** Display name for this entitlement */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Optional description */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** Optional user-facing metadata */
            fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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
             * .integrationConfig()
             * .integrationType()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("integrationConfig", integrationConfig),
                    checkRequired("integrationType", integrationType),
                    checkRequired("name", name),
                    description,
                    metadata,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            integrationConfig().validate()
            integrationType().validate()
            name()
            description()
            metadata()?.validate()
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
            (integrationConfig.asKnown()?.validity() ?: 0) +
                (integrationType.asKnown()?.validity() ?: 0) +
                (if (name.asKnown() == null) 0 else 1) +
                (if (description.asKnown() == null) 0 else 1) +
                (metadata.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                integrationConfig == other.integrationConfig &&
                integrationType == other.integrationType &&
                name == other.name &&
                description == other.description &&
                metadata == other.metadata &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                integrationConfig,
                integrationType,
                name,
                description,
                metadata,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{integrationConfig=$integrationConfig, integrationType=$integrationType, name=$name, description=$description, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    /** Optional user-facing metadata */
    class Metadata
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EntitlementCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "EntitlementCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
