// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * Detailed view of a single entitlement: identity, integration type, integration-specific
 * configuration, and metadata.
 */
class Entitlement
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val businessId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val integrationConfig: JsonField<IntegrationConfigResponse>,
    private val integrationType: JsonField<EntitlementIntegrationType>,
    private val isActive: JsonField<Boolean>,
    private val metadata: JsonField<Metadata>,
    private val name: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val description: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("business_id")
        @ExcludeMissing
        businessId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("integration_config")
        @ExcludeMissing
        integrationConfig: JsonField<IntegrationConfigResponse> = JsonMissing.of(),
        @JsonProperty("integration_type")
        @ExcludeMissing
        integrationType: JsonField<EntitlementIntegrationType> = JsonMissing.of(),
        @JsonProperty("is_active") @ExcludeMissing isActive: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        businessId,
        createdAt,
        integrationConfig,
        integrationType,
        isActive,
        metadata,
        name,
        updatedAt,
        description,
        mutableMapOf(),
    )

    /**
     * Unique identifier of the entitlement.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Identifier of the business that owns this entitlement.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessId(): String = businessId.getRequired("business_id")

    /**
     * Timestamp when the entitlement was created.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * Integration-specific configuration. For `digital_files` entitlements this includes presigned
     * download URLs for each attached file.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun integrationConfig(): IntegrationConfigResponse =
        integrationConfig.getRequired("integration_config")

    /**
     * Platform integration this entitlement uses.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun integrationType(): EntitlementIntegrationType =
        integrationType.getRequired("integration_type")

    /**
     * Always `true` for entitlements returned by the public API; soft-deleted entitlements are not
     * returned.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isActive(): Boolean = isActive.getRequired("is_active")

    /**
     * Arbitrary key-value metadata supplied at creation or via PATCH.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * Display name supplied at creation.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Timestamp when the entitlement was last modified.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * Optional description supplied at creation.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): String? = description.getNullable("description")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [businessId].
     *
     * Unlike [businessId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("business_id") @ExcludeMissing fun _businessId(): JsonField<String> = businessId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [integrationConfig].
     *
     * Unlike [integrationConfig], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("integration_config")
    @ExcludeMissing
    fun _integrationConfig(): JsonField<IntegrationConfigResponse> = integrationConfig

    /**
     * Returns the raw JSON value of [integrationType].
     *
     * Unlike [integrationType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("integration_type")
    @ExcludeMissing
    fun _integrationType(): JsonField<EntitlementIntegrationType> = integrationType

    /**
     * Returns the raw JSON value of [isActive].
     *
     * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_active") @ExcludeMissing fun _isActive(): JsonField<Boolean> = isActive

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

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

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
         * Returns a mutable builder for constructing an instance of [Entitlement].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .businessId()
         * .createdAt()
         * .integrationConfig()
         * .integrationType()
         * .isActive()
         * .metadata()
         * .name()
         * .updatedAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Entitlement]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var businessId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var integrationConfig: JsonField<IntegrationConfigResponse>? = null
        private var integrationType: JsonField<EntitlementIntegrationType>? = null
        private var isActive: JsonField<Boolean>? = null
        private var metadata: JsonField<Metadata>? = null
        private var name: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(entitlement: Entitlement) = apply {
            id = entitlement.id
            businessId = entitlement.businessId
            createdAt = entitlement.createdAt
            integrationConfig = entitlement.integrationConfig
            integrationType = entitlement.integrationType
            isActive = entitlement.isActive
            metadata = entitlement.metadata
            name = entitlement.name
            updatedAt = entitlement.updatedAt
            description = entitlement.description
            additionalProperties = entitlement.additionalProperties.toMutableMap()
        }

        /** Unique identifier of the entitlement. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Identifier of the business that owns this entitlement. */
        fun businessId(businessId: String) = businessId(JsonField.of(businessId))

        /**
         * Sets [Builder.businessId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun businessId(businessId: JsonField<String>) = apply { this.businessId = businessId }

        /** Timestamp when the entitlement was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * Integration-specific configuration. For `digital_files` entitlements this includes
         * presigned download URLs for each attached file.
         */
        fun integrationConfig(integrationConfig: IntegrationConfigResponse) =
            integrationConfig(JsonField.of(integrationConfig))

        /**
         * Sets [Builder.integrationConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.integrationConfig] with a well-typed
         * [IntegrationConfigResponse] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun integrationConfig(integrationConfig: JsonField<IntegrationConfigResponse>) = apply {
            this.integrationConfig = integrationConfig
        }

        /**
         * Alias for calling [integrationConfig] with
         * `IntegrationConfigResponse.ofGitHubConfig(githubConfig)`.
         */
        fun integrationConfig(githubConfig: IntegrationConfigResponse.GitHubConfig) =
            integrationConfig(IntegrationConfigResponse.ofGitHubConfig(githubConfig))

        /**
         * Alias for calling [integrationConfig] with
         * `IntegrationConfigResponse.ofDiscordConfig(discordConfig)`.
         */
        fun integrationConfig(discordConfig: IntegrationConfigResponse.DiscordConfig) =
            integrationConfig(IntegrationConfigResponse.ofDiscordConfig(discordConfig))

        /**
         * Alias for calling [integrationConfig] with
         * `IntegrationConfigResponse.ofTelegramConfig(telegramConfig)`.
         */
        fun integrationConfig(telegramConfig: IntegrationConfigResponse.TelegramConfig) =
            integrationConfig(IntegrationConfigResponse.ofTelegramConfig(telegramConfig))

        /**
         * Alias for calling [integrationConfig] with
         * `IntegrationConfigResponse.ofFigmaConfig(figmaConfig)`.
         */
        fun integrationConfig(figmaConfig: IntegrationConfigResponse.FigmaConfig) =
            integrationConfig(IntegrationConfigResponse.ofFigmaConfig(figmaConfig))

        /**
         * Alias for calling [integrationConfig] with
         * `IntegrationConfigResponse.ofFramerConfig(framerConfig)`.
         */
        fun integrationConfig(framerConfig: IntegrationConfigResponse.FramerConfig) =
            integrationConfig(IntegrationConfigResponse.ofFramerConfig(framerConfig))

        /**
         * Alias for calling [integrationConfig] with
         * `IntegrationConfigResponse.ofNotionConfig(notionConfig)`.
         */
        fun integrationConfig(notionConfig: IntegrationConfigResponse.NotionConfig) =
            integrationConfig(IntegrationConfigResponse.ofNotionConfig(notionConfig))

        /**
         * Alias for calling [integrationConfig] with
         * `IntegrationConfigResponse.ofDigitalFilesConfig(digitalFilesConfig)`.
         */
        fun integrationConfig(digitalFilesConfig: IntegrationConfigResponse.DigitalFilesConfig) =
            integrationConfig(IntegrationConfigResponse.ofDigitalFilesConfig(digitalFilesConfig))

        /**
         * Alias for calling [integrationConfig] with
         * `IntegrationConfigResponse.ofLicenseKeyConfig(licenseKeyConfig)`.
         */
        fun integrationConfig(licenseKeyConfig: IntegrationConfigResponse.LicenseKeyConfig) =
            integrationConfig(IntegrationConfigResponse.ofLicenseKeyConfig(licenseKeyConfig))

        /** Platform integration this entitlement uses. */
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

        /**
         * Always `true` for entitlements returned by the public API; soft-deleted entitlements are
         * not returned.
         */
        fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

        /**
         * Sets [Builder.isActive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

        /** Arbitrary key-value metadata supplied at creation or via PATCH. */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** Display name supplied at creation. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Timestamp when the entitlement was last modified. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** Optional description supplied at creation. */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

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
         * Returns an immutable instance of [Entitlement].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .businessId()
         * .createdAt()
         * .integrationConfig()
         * .integrationType()
         * .isActive()
         * .metadata()
         * .name()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Entitlement =
            Entitlement(
                checkRequired("id", id),
                checkRequired("businessId", businessId),
                checkRequired("createdAt", createdAt),
                checkRequired("integrationConfig", integrationConfig),
                checkRequired("integrationType", integrationType),
                checkRequired("isActive", isActive),
                checkRequired("metadata", metadata),
                checkRequired("name", name),
                checkRequired("updatedAt", updatedAt),
                description,
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
    fun validate(): Entitlement = apply {
        if (validated) {
            return@apply
        }

        id()
        businessId()
        createdAt()
        integrationConfig().validate()
        integrationType().validate()
        isActive()
        metadata().validate()
        name()
        updatedAt()
        description()
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
        (if (id.asKnown() == null) 0 else 1) +
            (if (businessId.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (integrationConfig.asKnown()?.validity() ?: 0) +
            (integrationType.asKnown()?.validity() ?: 0) +
            (if (isActive.asKnown() == null) 0 else 1) +
            (metadata.asKnown()?.validity() ?: 0) +
            (if (name.asKnown() == null) 0 else 1) +
            (if (updatedAt.asKnown() == null) 0 else 1) +
            (if (description.asKnown() == null) 0 else 1)

    /** Arbitrary key-value metadata supplied at creation or via PATCH. */
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
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
        internal fun validity(): Int = additionalProperties.count { (_, value) ->
            !value.isNull() && !value.isMissing()
        }

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

        return other is Entitlement &&
            id == other.id &&
            businessId == other.businessId &&
            createdAt == other.createdAt &&
            integrationConfig == other.integrationConfig &&
            integrationType == other.integrationType &&
            isActive == other.isActive &&
            metadata == other.metadata &&
            name == other.name &&
            updatedAt == other.updatedAt &&
            description == other.description &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            businessId,
            createdAt,
            integrationConfig,
            integrationType,
            isActive,
            metadata,
            name,
            updatedAt,
            description,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Entitlement{id=$id, businessId=$businessId, createdAt=$createdAt, integrationConfig=$integrationConfig, integrationType=$integrationType, isActive=$isActive, metadata=$metadata, name=$name, updatedAt=$updatedAt, description=$description, additionalProperties=$additionalProperties}"
}
