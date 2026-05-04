// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.entitlements.EntitlementIntegrationType
import com.dodopayments.api.models.entitlements.IntegrationConfigResponse
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

/**
 * Summary of an entitlement attached to a product.
 *
 * `integration_config` uses [`IntegrationConfigResponse`] (NOT the persisted [`IntegrationConfig`])
 * so digital_files entitlements embed the resolved `digital_files` object — matching what `GET
 * /entitlements/{id}` returns. All other variants pass through unchanged via `#[serde(untagged)]`.
 */
class ProductEntitlementSummary
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val integrationConfig: JsonField<IntegrationConfigResponse>,
    private val integrationType: JsonField<EntitlementIntegrationType>,
    private val name: JsonField<String>,
    private val description: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("integration_config")
        @ExcludeMissing
        integrationConfig: JsonField<IntegrationConfigResponse> = JsonMissing.of(),
        @JsonProperty("integration_type")
        @ExcludeMissing
        integrationType: JsonField<EntitlementIntegrationType> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
    ) : this(id, integrationConfig, integrationType, name, description, mutableMapOf())

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Integration-specific configuration on an entitlement read response.
     *
     * For `digital_files` entitlements the response includes presigned download URLs for each
     * attached file; other integrations match the shape supplied at creation.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun integrationConfig(): IntegrationConfigResponse =
        integrationConfig.getRequired("integration_config")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun integrationType(): EntitlementIntegrationType =
        integrationType.getRequired("integration_type")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
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
         * Returns a mutable builder for constructing an instance of [ProductEntitlementSummary].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .integrationConfig()
         * .integrationType()
         * .name()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ProductEntitlementSummary]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var integrationConfig: JsonField<IntegrationConfigResponse>? = null
        private var integrationType: JsonField<EntitlementIntegrationType>? = null
        private var name: JsonField<String>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(productEntitlementSummary: ProductEntitlementSummary) = apply {
            id = productEntitlementSummary.id
            integrationConfig = productEntitlementSummary.integrationConfig
            integrationType = productEntitlementSummary.integrationType
            name = productEntitlementSummary.name
            description = productEntitlementSummary.description
            additionalProperties = productEntitlementSummary.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Integration-specific configuration on an entitlement read response.
         *
         * For `digital_files` entitlements the response includes presigned download URLs for each
         * attached file; other integrations match the shape supplied at creation.
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

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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
         * Returns an immutable instance of [ProductEntitlementSummary].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .integrationConfig()
         * .integrationType()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ProductEntitlementSummary =
            ProductEntitlementSummary(
                checkRequired("id", id),
                checkRequired("integrationConfig", integrationConfig),
                checkRequired("integrationType", integrationType),
                checkRequired("name", name),
                description,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ProductEntitlementSummary = apply {
        if (validated) {
            return@apply
        }

        id()
        integrationConfig().validate()
        integrationType().validate()
        name()
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
            (integrationConfig.asKnown()?.validity() ?: 0) +
            (integrationType.asKnown()?.validity() ?: 0) +
            (if (name.asKnown() == null) 0 else 1) +
            (if (description.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProductEntitlementSummary &&
            id == other.id &&
            integrationConfig == other.integrationConfig &&
            integrationType == other.integrationType &&
            name == other.name &&
            description == other.description &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            integrationConfig,
            integrationType,
            name,
            description,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProductEntitlementSummary{id=$id, integrationConfig=$integrationConfig, integrationType=$integrationType, name=$name, description=$description, additionalProperties=$additionalProperties}"
}
