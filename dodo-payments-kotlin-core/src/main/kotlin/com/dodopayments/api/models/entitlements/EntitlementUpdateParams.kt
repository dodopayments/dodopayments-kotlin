// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements

import com.dodopayments.api.core.BaseDeserializer
import com.dodopayments.api.core.BaseSerializer
import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.Params
import com.dodopayments.api.core.allMaxBy
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.getOrThrow
import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.core.http.QueryParams
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.subscriptions.TimeInterval
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

/** PATCH /entitlements/{id} */
class EntitlementUpdateParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String? = id

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): String? = body.description()

    /**
     * Platform-specific configuration for an entitlement. Each variant uses unique field names so
     * `#[serde(untagged)]` can disambiguate correctly.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun integrationConfig(): IntegrationConfig? = body.integrationConfig()

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun metadata(): Metadata? = body.metadata()

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): String? = body.name()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [integrationConfig].
     *
     * Unlike [integrationConfig], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _integrationConfig(): JsonField<IntegrationConfig> = body._integrationConfig()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): EntitlementUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [EntitlementUpdateParams]. */
        fun builder() = Builder()
    }

    /** A builder for [EntitlementUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(entitlementUpdateParams: EntitlementUpdateParams) = apply {
            id = entitlementUpdateParams.id
            body = entitlementUpdateParams.body.toBuilder()
            additionalHeaders = entitlementUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = entitlementUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [description]
         * - [integrationConfig]
         * - [metadata]
         * - [name]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun description(description: String?) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * Platform-specific configuration for an entitlement. Each variant uses unique field names
         * so `#[serde(untagged)]` can disambiguate correctly.
         */
        fun integrationConfig(integrationConfig: IntegrationConfig?) = apply {
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

        fun metadata(metadata: Metadata?) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        fun name(name: String?) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

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
         * Returns an immutable instance of [EntitlementUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EntitlementUpdateParams =
            EntitlementUpdateParams(
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val description: JsonField<String>,
        private val integrationConfig: JsonField<IntegrationConfig>,
        private val metadata: JsonField<Metadata>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("integration_config")
            @ExcludeMissing
            integrationConfig: JsonField<IntegrationConfig> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(description, integrationConfig, metadata, name, mutableMapOf())

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * Platform-specific configuration for an entitlement. Each variant uses unique field names
         * so `#[serde(untagged)]` can disambiguate correctly.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun integrationConfig(): IntegrationConfig? =
            integrationConfig.getNullable("integration_config")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun name(): String? = name.getNullable("name")

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

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
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var description: JsonField<String> = JsonMissing.of()
            private var integrationConfig: JsonField<IntegrationConfig> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                description = body.description
                integrationConfig = body.integrationConfig
                metadata = body.metadata
                name = body.name
                additionalProperties = body.additionalProperties.toMutableMap()
            }

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

            /**
             * Platform-specific configuration for an entitlement. Each variant uses unique field
             * names so `#[serde(untagged)]` can disambiguate correctly.
             */
            fun integrationConfig(integrationConfig: IntegrationConfig?) =
                integrationConfig(JsonField.ofNullable(integrationConfig))

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

            fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun name(name: String?) = name(JsonField.ofNullable(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    description,
                    integrationConfig,
                    metadata,
                    name,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            description()
            integrationConfig()?.validate()
            metadata()?.validate()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (description.asKnown() == null) 0 else 1) +
                (integrationConfig.asKnown()?.validity() ?: 0) +
                (metadata.asKnown()?.validity() ?: 0) +
                (if (name.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                description == other.description &&
                integrationConfig == other.integrationConfig &&
                metadata == other.metadata &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(description, integrationConfig, metadata, name, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{description=$description, integrationConfig=$integrationConfig, metadata=$metadata, name=$name, additionalProperties=$additionalProperties}"
    }

    /**
     * Platform-specific configuration for an entitlement. Each variant uses unique field names so
     * `#[serde(untagged)]` can disambiguate correctly.
     */
    @JsonDeserialize(using = IntegrationConfig.Deserializer::class)
    @JsonSerialize(using = IntegrationConfig.Serializer::class)
    class IntegrationConfig
    private constructor(
        private val github: GitHubConfig? = null,
        private val discord: DiscordConfig? = null,
        private val telegram: TelegramConfig? = null,
        private val figma: FigmaConfig? = null,
        private val framer: FramerConfig? = null,
        private val notion: NotionConfig? = null,
        private val digitalFiles: DigitalFilesConfig? = null,
        private val licenseKey: LicenseKeyConfig? = null,
        private val _json: JsonValue? = null,
    ) {

        fun github(): GitHubConfig? = github

        fun discord(): DiscordConfig? = discord

        fun telegram(): TelegramConfig? = telegram

        fun figma(): FigmaConfig? = figma

        fun framer(): FramerConfig? = framer

        fun notion(): NotionConfig? = notion

        fun digitalFiles(): DigitalFilesConfig? = digitalFiles

        fun licenseKey(): LicenseKeyConfig? = licenseKey

        fun isGitHub(): Boolean = github != null

        fun isDiscord(): Boolean = discord != null

        fun isTelegram(): Boolean = telegram != null

        fun isFigma(): Boolean = figma != null

        fun isFramer(): Boolean = framer != null

        fun isNotion(): Boolean = notion != null

        fun isDigitalFiles(): Boolean = digitalFiles != null

        fun isLicenseKey(): Boolean = licenseKey != null

        fun asGitHub(): GitHubConfig = github.getOrThrow("github")

        fun asDiscord(): DiscordConfig = discord.getOrThrow("discord")

        fun asTelegram(): TelegramConfig = telegram.getOrThrow("telegram")

        fun asFigma(): FigmaConfig = figma.getOrThrow("figma")

        fun asFramer(): FramerConfig = framer.getOrThrow("framer")

        fun asNotion(): NotionConfig = notion.getOrThrow("notion")

        fun asDigitalFiles(): DigitalFilesConfig = digitalFiles.getOrThrow("digitalFiles")

        fun asLicenseKey(): LicenseKeyConfig = licenseKey.getOrThrow("licenseKey")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                github != null -> visitor.visitGitHub(github)
                discord != null -> visitor.visitDiscord(discord)
                telegram != null -> visitor.visitTelegram(telegram)
                figma != null -> visitor.visitFigma(figma)
                framer != null -> visitor.visitFramer(framer)
                notion != null -> visitor.visitNotion(notion)
                digitalFiles != null -> visitor.visitDigitalFiles(digitalFiles)
                licenseKey != null -> visitor.visitLicenseKey(licenseKey)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): IntegrationConfig = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitGitHub(github: GitHubConfig) {
                        github.validate()
                    }

                    override fun visitDiscord(discord: DiscordConfig) {
                        discord.validate()
                    }

                    override fun visitTelegram(telegram: TelegramConfig) {
                        telegram.validate()
                    }

                    override fun visitFigma(figma: FigmaConfig) {
                        figma.validate()
                    }

                    override fun visitFramer(framer: FramerConfig) {
                        framer.validate()
                    }

                    override fun visitNotion(notion: NotionConfig) {
                        notion.validate()
                    }

                    override fun visitDigitalFiles(digitalFiles: DigitalFilesConfig) {
                        digitalFiles.validate()
                    }

                    override fun visitLicenseKey(licenseKey: LicenseKeyConfig) {
                        licenseKey.validate()
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
                    override fun visitGitHub(github: GitHubConfig) = github.validity()

                    override fun visitDiscord(discord: DiscordConfig) = discord.validity()

                    override fun visitTelegram(telegram: TelegramConfig) = telegram.validity()

                    override fun visitFigma(figma: FigmaConfig) = figma.validity()

                    override fun visitFramer(framer: FramerConfig) = framer.validity()

                    override fun visitNotion(notion: NotionConfig) = notion.validity()

                    override fun visitDigitalFiles(digitalFiles: DigitalFilesConfig) =
                        digitalFiles.validity()

                    override fun visitLicenseKey(licenseKey: LicenseKeyConfig) =
                        licenseKey.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is IntegrationConfig &&
                github == other.github &&
                discord == other.discord &&
                telegram == other.telegram &&
                figma == other.figma &&
                framer == other.framer &&
                notion == other.notion &&
                digitalFiles == other.digitalFiles &&
                licenseKey == other.licenseKey
        }

        override fun hashCode(): Int =
            Objects.hash(github, discord, telegram, figma, framer, notion, digitalFiles, licenseKey)

        override fun toString(): String =
            when {
                github != null -> "IntegrationConfig{github=$github}"
                discord != null -> "IntegrationConfig{discord=$discord}"
                telegram != null -> "IntegrationConfig{telegram=$telegram}"
                figma != null -> "IntegrationConfig{figma=$figma}"
                framer != null -> "IntegrationConfig{framer=$framer}"
                notion != null -> "IntegrationConfig{notion=$notion}"
                digitalFiles != null -> "IntegrationConfig{digitalFiles=$digitalFiles}"
                licenseKey != null -> "IntegrationConfig{licenseKey=$licenseKey}"
                _json != null -> "IntegrationConfig{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid IntegrationConfig")
            }

        companion object {

            fun ofGitHub(github: GitHubConfig) = IntegrationConfig(github = github)

            fun ofDiscord(discord: DiscordConfig) = IntegrationConfig(discord = discord)

            fun ofTelegram(telegram: TelegramConfig) = IntegrationConfig(telegram = telegram)

            fun ofFigma(figma: FigmaConfig) = IntegrationConfig(figma = figma)

            fun ofFramer(framer: FramerConfig) = IntegrationConfig(framer = framer)

            fun ofNotion(notion: NotionConfig) = IntegrationConfig(notion = notion)

            fun ofDigitalFiles(digitalFiles: DigitalFilesConfig) =
                IntegrationConfig(digitalFiles = digitalFiles)

            fun ofLicenseKey(licenseKey: LicenseKeyConfig) =
                IntegrationConfig(licenseKey = licenseKey)
        }

        /**
         * An interface that defines how to map each variant of [IntegrationConfig] to a value of
         * type [T].
         */
        interface Visitor<out T> {

            fun visitGitHub(github: GitHubConfig): T

            fun visitDiscord(discord: DiscordConfig): T

            fun visitTelegram(telegram: TelegramConfig): T

            fun visitFigma(figma: FigmaConfig): T

            fun visitFramer(framer: FramerConfig): T

            fun visitNotion(notion: NotionConfig): T

            fun visitDigitalFiles(digitalFiles: DigitalFilesConfig): T

            fun visitLicenseKey(licenseKey: LicenseKeyConfig): T

            /**
             * Maps an unknown variant of [IntegrationConfig] to a value of type [T].
             *
             * An instance of [IntegrationConfig] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws DodoPaymentsInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw DodoPaymentsInvalidDataException("Unknown IntegrationConfig: $json")
            }
        }

        internal class Deserializer :
            BaseDeserializer<IntegrationConfig>(IntegrationConfig::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): IntegrationConfig {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<GitHubConfig>())?.let {
                                IntegrationConfig(github = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<DiscordConfig>())?.let {
                                IntegrationConfig(discord = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<TelegramConfig>())?.let {
                                IntegrationConfig(telegram = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<FigmaConfig>())?.let {
                                IntegrationConfig(figma = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<FramerConfig>())?.let {
                                IntegrationConfig(framer = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<NotionConfig>())?.let {
                                IntegrationConfig(notion = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<DigitalFilesConfig>())?.let {
                                IntegrationConfig(digitalFiles = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<LicenseKeyConfig>())?.let {
                                IntegrationConfig(licenseKey = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> IntegrationConfig(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<IntegrationConfig>(IntegrationConfig::class) {

            override fun serialize(
                value: IntegrationConfig,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.github != null -> generator.writeObject(value.github)
                    value.discord != null -> generator.writeObject(value.discord)
                    value.telegram != null -> generator.writeObject(value.telegram)
                    value.figma != null -> generator.writeObject(value.figma)
                    value.framer != null -> generator.writeObject(value.framer)
                    value.notion != null -> generator.writeObject(value.notion)
                    value.digitalFiles != null -> generator.writeObject(value.digitalFiles)
                    value.licenseKey != null -> generator.writeObject(value.licenseKey)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid IntegrationConfig")
                }
            }
        }

        class GitHubConfig
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val permission: JsonField<String>,
            private val targetId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("permission")
                @ExcludeMissing
                permission: JsonField<String> = JsonMissing.of(),
                @JsonProperty("target_id")
                @ExcludeMissing
                targetId: JsonField<String> = JsonMissing.of(),
            ) : this(permission, targetId, mutableMapOf())

            /**
             * One of: pull, push, admin, maintain, triage
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun permission(): String = permission.getRequired("permission")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun targetId(): String = targetId.getRequired("target_id")

            /**
             * Returns the raw JSON value of [permission].
             *
             * Unlike [permission], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("permission")
            @ExcludeMissing
            fun _permission(): JsonField<String> = permission

            /**
             * Returns the raw JSON value of [targetId].
             *
             * Unlike [targetId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("target_id") @ExcludeMissing fun _targetId(): JsonField<String> = targetId

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
                 * Returns a mutable builder for constructing an instance of [GitHubConfig].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .permission()
                 * .targetId()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [GitHubConfig]. */
            class Builder internal constructor() {

                private var permission: JsonField<String>? = null
                private var targetId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(githubConfig: GitHubConfig) = apply {
                    permission = githubConfig.permission
                    targetId = githubConfig.targetId
                    additionalProperties = githubConfig.additionalProperties.toMutableMap()
                }

                /** One of: pull, push, admin, maintain, triage */
                fun permission(permission: String) = permission(JsonField.of(permission))

                /**
                 * Sets [Builder.permission] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.permission] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun permission(permission: JsonField<String>) = apply {
                    this.permission = permission
                }

                fun targetId(targetId: String) = targetId(JsonField.of(targetId))

                /**
                 * Sets [Builder.targetId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.targetId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun targetId(targetId: JsonField<String>) = apply { this.targetId = targetId }

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
                 * Returns an immutable instance of [GitHubConfig].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .permission()
                 * .targetId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): GitHubConfig =
                    GitHubConfig(
                        checkRequired("permission", permission),
                        checkRequired("targetId", targetId),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): GitHubConfig = apply {
                if (validated) {
                    return@apply
                }

                permission()
                targetId()
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
                (if (permission.asKnown() == null) 0 else 1) +
                    (if (targetId.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is GitHubConfig &&
                    permission == other.permission &&
                    targetId == other.targetId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(permission, targetId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "GitHubConfig{permission=$permission, targetId=$targetId, additionalProperties=$additionalProperties}"
        }

        class DiscordConfig
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val guildId: JsonField<String>,
            private val roleId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("guild_id")
                @ExcludeMissing
                guildId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("role_id")
                @ExcludeMissing
                roleId: JsonField<String> = JsonMissing.of(),
            ) : this(guildId, roleId, mutableMapOf())

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun guildId(): String = guildId.getRequired("guild_id")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun roleId(): String? = roleId.getNullable("role_id")

            /**
             * Returns the raw JSON value of [guildId].
             *
             * Unlike [guildId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("guild_id") @ExcludeMissing fun _guildId(): JsonField<String> = guildId

            /**
             * Returns the raw JSON value of [roleId].
             *
             * Unlike [roleId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("role_id") @ExcludeMissing fun _roleId(): JsonField<String> = roleId

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
                 * Returns a mutable builder for constructing an instance of [DiscordConfig].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .guildId()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [DiscordConfig]. */
            class Builder internal constructor() {

                private var guildId: JsonField<String>? = null
                private var roleId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(discordConfig: DiscordConfig) = apply {
                    guildId = discordConfig.guildId
                    roleId = discordConfig.roleId
                    additionalProperties = discordConfig.additionalProperties.toMutableMap()
                }

                fun guildId(guildId: String) = guildId(JsonField.of(guildId))

                /**
                 * Sets [Builder.guildId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.guildId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun guildId(guildId: JsonField<String>) = apply { this.guildId = guildId }

                fun roleId(roleId: String?) = roleId(JsonField.ofNullable(roleId))

                /**
                 * Sets [Builder.roleId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.roleId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun roleId(roleId: JsonField<String>) = apply { this.roleId = roleId }

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
                 * Returns an immutable instance of [DiscordConfig].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .guildId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): DiscordConfig =
                    DiscordConfig(
                        checkRequired("guildId", guildId),
                        roleId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): DiscordConfig = apply {
                if (validated) {
                    return@apply
                }

                guildId()
                roleId()
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
                (if (guildId.asKnown() == null) 0 else 1) + (if (roleId.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DiscordConfig &&
                    guildId == other.guildId &&
                    roleId == other.roleId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(guildId, roleId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DiscordConfig{guildId=$guildId, roleId=$roleId, additionalProperties=$additionalProperties}"
        }

        class TelegramConfig
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val chatId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("chat_id")
                @ExcludeMissing
                chatId: JsonField<String> = JsonMissing.of()
            ) : this(chatId, mutableMapOf())

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun chatId(): String = chatId.getRequired("chat_id")

            /**
             * Returns the raw JSON value of [chatId].
             *
             * Unlike [chatId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("chat_id") @ExcludeMissing fun _chatId(): JsonField<String> = chatId

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
                 * Returns a mutable builder for constructing an instance of [TelegramConfig].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .chatId()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [TelegramConfig]. */
            class Builder internal constructor() {

                private var chatId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(telegramConfig: TelegramConfig) = apply {
                    chatId = telegramConfig.chatId
                    additionalProperties = telegramConfig.additionalProperties.toMutableMap()
                }

                fun chatId(chatId: String) = chatId(JsonField.of(chatId))

                /**
                 * Sets [Builder.chatId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.chatId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun chatId(chatId: JsonField<String>) = apply { this.chatId = chatId }

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
                 * Returns an immutable instance of [TelegramConfig].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .chatId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): TelegramConfig =
                    TelegramConfig(
                        checkRequired("chatId", chatId),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): TelegramConfig = apply {
                if (validated) {
                    return@apply
                }

                chatId()
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
            internal fun validity(): Int = (if (chatId.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TelegramConfig &&
                    chatId == other.chatId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(chatId, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TelegramConfig{chatId=$chatId, additionalProperties=$additionalProperties}"
        }

        class FigmaConfig
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val figmaFileId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("figma_file_id")
                @ExcludeMissing
                figmaFileId: JsonField<String> = JsonMissing.of()
            ) : this(figmaFileId, mutableMapOf())

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun figmaFileId(): String = figmaFileId.getRequired("figma_file_id")

            /**
             * Returns the raw JSON value of [figmaFileId].
             *
             * Unlike [figmaFileId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("figma_file_id")
            @ExcludeMissing
            fun _figmaFileId(): JsonField<String> = figmaFileId

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
                 * Returns a mutable builder for constructing an instance of [FigmaConfig].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .figmaFileId()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [FigmaConfig]. */
            class Builder internal constructor() {

                private var figmaFileId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(figmaConfig: FigmaConfig) = apply {
                    figmaFileId = figmaConfig.figmaFileId
                    additionalProperties = figmaConfig.additionalProperties.toMutableMap()
                }

                fun figmaFileId(figmaFileId: String) = figmaFileId(JsonField.of(figmaFileId))

                /**
                 * Sets [Builder.figmaFileId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.figmaFileId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun figmaFileId(figmaFileId: JsonField<String>) = apply {
                    this.figmaFileId = figmaFileId
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
                 * Returns an immutable instance of [FigmaConfig].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .figmaFileId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): FigmaConfig =
                    FigmaConfig(
                        checkRequired("figmaFileId", figmaFileId),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): FigmaConfig = apply {
                if (validated) {
                    return@apply
                }

                figmaFileId()
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
            internal fun validity(): Int = (if (figmaFileId.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is FigmaConfig &&
                    figmaFileId == other.figmaFileId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(figmaFileId, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "FigmaConfig{figmaFileId=$figmaFileId, additionalProperties=$additionalProperties}"
        }

        class FramerConfig
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val framerTemplateId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("framer_template_id")
                @ExcludeMissing
                framerTemplateId: JsonField<String> = JsonMissing.of()
            ) : this(framerTemplateId, mutableMapOf())

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun framerTemplateId(): String = framerTemplateId.getRequired("framer_template_id")

            /**
             * Returns the raw JSON value of [framerTemplateId].
             *
             * Unlike [framerTemplateId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("framer_template_id")
            @ExcludeMissing
            fun _framerTemplateId(): JsonField<String> = framerTemplateId

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
                 * Returns a mutable builder for constructing an instance of [FramerConfig].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .framerTemplateId()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [FramerConfig]. */
            class Builder internal constructor() {

                private var framerTemplateId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(framerConfig: FramerConfig) = apply {
                    framerTemplateId = framerConfig.framerTemplateId
                    additionalProperties = framerConfig.additionalProperties.toMutableMap()
                }

                fun framerTemplateId(framerTemplateId: String) =
                    framerTemplateId(JsonField.of(framerTemplateId))

                /**
                 * Sets [Builder.framerTemplateId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.framerTemplateId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun framerTemplateId(framerTemplateId: JsonField<String>) = apply {
                    this.framerTemplateId = framerTemplateId
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
                 * Returns an immutable instance of [FramerConfig].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .framerTemplateId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): FramerConfig =
                    FramerConfig(
                        checkRequired("framerTemplateId", framerTemplateId),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): FramerConfig = apply {
                if (validated) {
                    return@apply
                }

                framerTemplateId()
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
            internal fun validity(): Int = (if (framerTemplateId.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is FramerConfig &&
                    framerTemplateId == other.framerTemplateId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(framerTemplateId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "FramerConfig{framerTemplateId=$framerTemplateId, additionalProperties=$additionalProperties}"
        }

        class NotionConfig
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val notionTemplateId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("notion_template_id")
                @ExcludeMissing
                notionTemplateId: JsonField<String> = JsonMissing.of()
            ) : this(notionTemplateId, mutableMapOf())

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun notionTemplateId(): String = notionTemplateId.getRequired("notion_template_id")

            /**
             * Returns the raw JSON value of [notionTemplateId].
             *
             * Unlike [notionTemplateId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("notion_template_id")
            @ExcludeMissing
            fun _notionTemplateId(): JsonField<String> = notionTemplateId

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
                 * Returns a mutable builder for constructing an instance of [NotionConfig].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .notionTemplateId()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [NotionConfig]. */
            class Builder internal constructor() {

                private var notionTemplateId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(notionConfig: NotionConfig) = apply {
                    notionTemplateId = notionConfig.notionTemplateId
                    additionalProperties = notionConfig.additionalProperties.toMutableMap()
                }

                fun notionTemplateId(notionTemplateId: String) =
                    notionTemplateId(JsonField.of(notionTemplateId))

                /**
                 * Sets [Builder.notionTemplateId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.notionTemplateId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun notionTemplateId(notionTemplateId: JsonField<String>) = apply {
                    this.notionTemplateId = notionTemplateId
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
                 * Returns an immutable instance of [NotionConfig].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .notionTemplateId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): NotionConfig =
                    NotionConfig(
                        checkRequired("notionTemplateId", notionTemplateId),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): NotionConfig = apply {
                if (validated) {
                    return@apply
                }

                notionTemplateId()
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
            internal fun validity(): Int = (if (notionTemplateId.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is NotionConfig &&
                    notionTemplateId == other.notionTemplateId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(notionTemplateId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "NotionConfig{notionTemplateId=$notionTemplateId, additionalProperties=$additionalProperties}"
        }

        class DigitalFilesConfig
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val digitalFileIds: JsonField<List<String>>,
            private val externalUrl: JsonField<String>,
            private val instructions: JsonField<String>,
            private val legacyFileIds: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("digital_file_ids")
                @ExcludeMissing
                digitalFileIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("external_url")
                @ExcludeMissing
                externalUrl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("instructions")
                @ExcludeMissing
                instructions: JsonField<String> = JsonMissing.of(),
                @JsonProperty("legacy_file_ids")
                @ExcludeMissing
                legacyFileIds: JsonField<List<String>> = JsonMissing.of(),
            ) : this(digitalFileIds, externalUrl, instructions, legacyFileIds, mutableMapOf())

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun digitalFileIds(): List<String> = digitalFileIds.getRequired("digital_file_ids")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun externalUrl(): String? = externalUrl.getNullable("external_url")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun instructions(): String? = instructions.getNullable("instructions")

            /**
             * Three-way patchable field (mirrors the credit_entitlements pattern):
             * * omitted → preserve persisted (`None`)
             * * `null` → clear (`Some(None)`)
             * * `[...]` → replace (`Some(Some(...))`)
             *
             * On Create / storage we collapse "clear" and empty-array to `None` so the persisted
             * JSONB never carries a `null` legacy_file_ids key.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun legacyFileIds(): List<String>? = legacyFileIds.getNullable("legacy_file_ids")

            /**
             * Returns the raw JSON value of [digitalFileIds].
             *
             * Unlike [digitalFileIds], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("digital_file_ids")
            @ExcludeMissing
            fun _digitalFileIds(): JsonField<List<String>> = digitalFileIds

            /**
             * Returns the raw JSON value of [externalUrl].
             *
             * Unlike [externalUrl], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("external_url")
            @ExcludeMissing
            fun _externalUrl(): JsonField<String> = externalUrl

            /**
             * Returns the raw JSON value of [instructions].
             *
             * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("instructions")
            @ExcludeMissing
            fun _instructions(): JsonField<String> = instructions

            /**
             * Returns the raw JSON value of [legacyFileIds].
             *
             * Unlike [legacyFileIds], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("legacy_file_ids")
            @ExcludeMissing
            fun _legacyFileIds(): JsonField<List<String>> = legacyFileIds

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
                 * Returns a mutable builder for constructing an instance of [DigitalFilesConfig].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .digitalFileIds()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [DigitalFilesConfig]. */
            class Builder internal constructor() {

                private var digitalFileIds: JsonField<MutableList<String>>? = null
                private var externalUrl: JsonField<String> = JsonMissing.of()
                private var instructions: JsonField<String> = JsonMissing.of()
                private var legacyFileIds: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(digitalFilesConfig: DigitalFilesConfig) = apply {
                    digitalFileIds = digitalFilesConfig.digitalFileIds.map { it.toMutableList() }
                    externalUrl = digitalFilesConfig.externalUrl
                    instructions = digitalFilesConfig.instructions
                    legacyFileIds = digitalFilesConfig.legacyFileIds.map { it.toMutableList() }
                    additionalProperties = digitalFilesConfig.additionalProperties.toMutableMap()
                }

                fun digitalFileIds(digitalFileIds: List<String>) =
                    digitalFileIds(JsonField.of(digitalFileIds))

                /**
                 * Sets [Builder.digitalFileIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.digitalFileIds] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun digitalFileIds(digitalFileIds: JsonField<List<String>>) = apply {
                    this.digitalFileIds = digitalFileIds.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [digitalFileIds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addDigitalFileId(digitalFileId: String) = apply {
                    digitalFileIds =
                        (digitalFileIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("digitalFileIds", it).add(digitalFileId)
                        }
                }

                fun externalUrl(externalUrl: String?) =
                    externalUrl(JsonField.ofNullable(externalUrl))

                /**
                 * Sets [Builder.externalUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.externalUrl] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun externalUrl(externalUrl: JsonField<String>) = apply {
                    this.externalUrl = externalUrl
                }

                fun instructions(instructions: String?) =
                    instructions(JsonField.ofNullable(instructions))

                /**
                 * Sets [Builder.instructions] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.instructions] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun instructions(instructions: JsonField<String>) = apply {
                    this.instructions = instructions
                }

                /**
                 * Three-way patchable field (mirrors the credit_entitlements pattern):
                 * * omitted → preserve persisted (`None`)
                 * * `null` → clear (`Some(None)`)
                 * * `[...]` → replace (`Some(Some(...))`)
                 *
                 * On Create / storage we collapse "clear" and empty-array to `None` so the
                 * persisted JSONB never carries a `null` legacy_file_ids key.
                 */
                fun legacyFileIds(legacyFileIds: List<String>?) =
                    legacyFileIds(JsonField.ofNullable(legacyFileIds))

                /**
                 * Sets [Builder.legacyFileIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.legacyFileIds] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun legacyFileIds(legacyFileIds: JsonField<List<String>>) = apply {
                    this.legacyFileIds = legacyFileIds.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [legacyFileIds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addLegacyFileId(legacyFileId: String) = apply {
                    legacyFileIds =
                        (legacyFileIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("legacyFileIds", it).add(legacyFileId)
                        }
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
                 * Returns an immutable instance of [DigitalFilesConfig].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .digitalFileIds()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): DigitalFilesConfig =
                    DigitalFilesConfig(
                        checkRequired("digitalFileIds", digitalFileIds).map { it.toImmutable() },
                        externalUrl,
                        instructions,
                        (legacyFileIds ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): DigitalFilesConfig = apply {
                if (validated) {
                    return@apply
                }

                digitalFileIds()
                externalUrl()
                instructions()
                legacyFileIds()
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
                (digitalFileIds.asKnown()?.size ?: 0) +
                    (if (externalUrl.asKnown() == null) 0 else 1) +
                    (if (instructions.asKnown() == null) 0 else 1) +
                    (legacyFileIds.asKnown()?.size ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DigitalFilesConfig &&
                    digitalFileIds == other.digitalFileIds &&
                    externalUrl == other.externalUrl &&
                    instructions == other.instructions &&
                    legacyFileIds == other.legacyFileIds &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    digitalFileIds,
                    externalUrl,
                    instructions,
                    legacyFileIds,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DigitalFilesConfig{digitalFileIds=$digitalFileIds, externalUrl=$externalUrl, instructions=$instructions, legacyFileIds=$legacyFileIds, additionalProperties=$additionalProperties}"
        }

        class LicenseKeyConfig
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val activationMessage: JsonField<String>,
            private val activationsLimit: JsonField<Int>,
            private val durationCount: JsonField<Int>,
            private val durationInterval: JsonField<TimeInterval>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("activation_message")
                @ExcludeMissing
                activationMessage: JsonField<String> = JsonMissing.of(),
                @JsonProperty("activations_limit")
                @ExcludeMissing
                activationsLimit: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("duration_count")
                @ExcludeMissing
                durationCount: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("duration_interval")
                @ExcludeMissing
                durationInterval: JsonField<TimeInterval> = JsonMissing.of(),
            ) : this(
                activationMessage,
                activationsLimit,
                durationCount,
                durationInterval,
                mutableMapOf(),
            )

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun activationMessage(): String? = activationMessage.getNullable("activation_message")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun activationsLimit(): Int? = activationsLimit.getNullable("activations_limit")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun durationCount(): Int? = durationCount.getNullable("duration_count")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun durationInterval(): TimeInterval? =
                durationInterval.getNullable("duration_interval")

            /**
             * Returns the raw JSON value of [activationMessage].
             *
             * Unlike [activationMessage], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("activation_message")
            @ExcludeMissing
            fun _activationMessage(): JsonField<String> = activationMessage

            /**
             * Returns the raw JSON value of [activationsLimit].
             *
             * Unlike [activationsLimit], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("activations_limit")
            @ExcludeMissing
            fun _activationsLimit(): JsonField<Int> = activationsLimit

            /**
             * Returns the raw JSON value of [durationCount].
             *
             * Unlike [durationCount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("duration_count")
            @ExcludeMissing
            fun _durationCount(): JsonField<Int> = durationCount

            /**
             * Returns the raw JSON value of [durationInterval].
             *
             * Unlike [durationInterval], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("duration_interval")
            @ExcludeMissing
            fun _durationInterval(): JsonField<TimeInterval> = durationInterval

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

                /** Returns a mutable builder for constructing an instance of [LicenseKeyConfig]. */
                fun builder() = Builder()
            }

            /** A builder for [LicenseKeyConfig]. */
            class Builder internal constructor() {

                private var activationMessage: JsonField<String> = JsonMissing.of()
                private var activationsLimit: JsonField<Int> = JsonMissing.of()
                private var durationCount: JsonField<Int> = JsonMissing.of()
                private var durationInterval: JsonField<TimeInterval> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(licenseKeyConfig: LicenseKeyConfig) = apply {
                    activationMessage = licenseKeyConfig.activationMessage
                    activationsLimit = licenseKeyConfig.activationsLimit
                    durationCount = licenseKeyConfig.durationCount
                    durationInterval = licenseKeyConfig.durationInterval
                    additionalProperties = licenseKeyConfig.additionalProperties.toMutableMap()
                }

                fun activationMessage(activationMessage: String?) =
                    activationMessage(JsonField.ofNullable(activationMessage))

                /**
                 * Sets [Builder.activationMessage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.activationMessage] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun activationMessage(activationMessage: JsonField<String>) = apply {
                    this.activationMessage = activationMessage
                }

                fun activationsLimit(activationsLimit: Int?) =
                    activationsLimit(JsonField.ofNullable(activationsLimit))

                /**
                 * Alias for [Builder.activationsLimit].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun activationsLimit(activationsLimit: Int) =
                    activationsLimit(activationsLimit as Int?)

                /**
                 * Sets [Builder.activationsLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.activationsLimit] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun activationsLimit(activationsLimit: JsonField<Int>) = apply {
                    this.activationsLimit = activationsLimit
                }

                fun durationCount(durationCount: Int?) =
                    durationCount(JsonField.ofNullable(durationCount))

                /**
                 * Alias for [Builder.durationCount].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun durationCount(durationCount: Int) = durationCount(durationCount as Int?)

                /**
                 * Sets [Builder.durationCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.durationCount] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun durationCount(durationCount: JsonField<Int>) = apply {
                    this.durationCount = durationCount
                }

                fun durationInterval(durationInterval: TimeInterval?) =
                    durationInterval(JsonField.ofNullable(durationInterval))

                /**
                 * Sets [Builder.durationInterval] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.durationInterval] with a well-typed
                 * [TimeInterval] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun durationInterval(durationInterval: JsonField<TimeInterval>) = apply {
                    this.durationInterval = durationInterval
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
                 * Returns an immutable instance of [LicenseKeyConfig].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): LicenseKeyConfig =
                    LicenseKeyConfig(
                        activationMessage,
                        activationsLimit,
                        durationCount,
                        durationInterval,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): LicenseKeyConfig = apply {
                if (validated) {
                    return@apply
                }

                activationMessage()
                activationsLimit()
                durationCount()
                durationInterval()?.validate()
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
                (if (activationMessage.asKnown() == null) 0 else 1) +
                    (if (activationsLimit.asKnown() == null) 0 else 1) +
                    (if (durationCount.asKnown() == null) 0 else 1) +
                    (durationInterval.asKnown()?.validity() ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is LicenseKeyConfig &&
                    activationMessage == other.activationMessage &&
                    activationsLimit == other.activationsLimit &&
                    durationCount == other.durationCount &&
                    durationInterval == other.durationInterval &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    activationMessage,
                    activationsLimit,
                    durationCount,
                    durationInterval,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LicenseKeyConfig{activationMessage=$activationMessage, activationsLimit=$activationsLimit, durationCount=$durationCount, durationInterval=$durationInterval, additionalProperties=$additionalProperties}"
        }
    }

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

        return other is EntitlementUpdateParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "EntitlementUpdateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
