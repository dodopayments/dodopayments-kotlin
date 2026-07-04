// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements

import com.dodopayments.api.core.BaseDeserializer
import com.dodopayments.api.core.BaseSerializer
import com.dodopayments.api.core.Enum
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

/**
 * Integration-specific configuration on an entitlement read response.
 *
 * For `digital_files` entitlements the response includes presigned download URLs for each attached
 * file; other integrations match the shape supplied at creation.
 */
@JsonDeserialize(using = IntegrationConfigResponse.Deserializer::class)
@JsonSerialize(using = IntegrationConfigResponse.Serializer::class)
class IntegrationConfigResponse
private constructor(
    private val featureFlagConfig: FeatureFlagConfig? = null,
    private val githubConfig: GitHubConfig? = null,
    private val discordConfig: DiscordConfig? = null,
    private val telegramConfig: TelegramConfig? = null,
    private val figmaConfig: FigmaConfig? = null,
    private val framerConfig: FramerConfig? = null,
    private val notionConfig: NotionConfig? = null,
    private val digitalFilesConfig: DigitalFilesConfig? = null,
    private val licenseKeyConfig: LicenseKeyConfig? = null,
    private val _json: JsonValue? = null,
) {

    fun featureFlagConfig(): FeatureFlagConfig? = featureFlagConfig

    fun githubConfig(): GitHubConfig? = githubConfig

    fun discordConfig(): DiscordConfig? = discordConfig

    fun telegramConfig(): TelegramConfig? = telegramConfig

    fun figmaConfig(): FigmaConfig? = figmaConfig

    fun framerConfig(): FramerConfig? = framerConfig

    fun notionConfig(): NotionConfig? = notionConfig

    fun digitalFilesConfig(): DigitalFilesConfig? = digitalFilesConfig

    fun licenseKeyConfig(): LicenseKeyConfig? = licenseKeyConfig

    fun isFeatureFlagConfig(): Boolean = featureFlagConfig != null

    fun isGitHubConfig(): Boolean = githubConfig != null

    fun isDiscordConfig(): Boolean = discordConfig != null

    fun isTelegramConfig(): Boolean = telegramConfig != null

    fun isFigmaConfig(): Boolean = figmaConfig != null

    fun isFramerConfig(): Boolean = framerConfig != null

    fun isNotionConfig(): Boolean = notionConfig != null

    fun isDigitalFilesConfig(): Boolean = digitalFilesConfig != null

    fun isLicenseKeyConfig(): Boolean = licenseKeyConfig != null

    fun asFeatureFlagConfig(): FeatureFlagConfig = featureFlagConfig.getOrThrow("featureFlagConfig")

    fun asGitHubConfig(): GitHubConfig = githubConfig.getOrThrow("githubConfig")

    fun asDiscordConfig(): DiscordConfig = discordConfig.getOrThrow("discordConfig")

    fun asTelegramConfig(): TelegramConfig = telegramConfig.getOrThrow("telegramConfig")

    fun asFigmaConfig(): FigmaConfig = figmaConfig.getOrThrow("figmaConfig")

    fun asFramerConfig(): FramerConfig = framerConfig.getOrThrow("framerConfig")

    fun asNotionConfig(): NotionConfig = notionConfig.getOrThrow("notionConfig")

    fun asDigitalFilesConfig(): DigitalFilesConfig =
        digitalFilesConfig.getOrThrow("digitalFilesConfig")

    fun asLicenseKeyConfig(): LicenseKeyConfig = licenseKeyConfig.getOrThrow("licenseKeyConfig")

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
     * val result: String? = integrationConfigResponse.accept(object : IntegrationConfigResponse.Visitor<String?> {
     *     override fun visitFeatureFlagConfig(featureFlagConfig: FeatureFlagConfig): String? = featureFlagConfig.toString()
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
            featureFlagConfig != null -> visitor.visitFeatureFlagConfig(featureFlagConfig)
            githubConfig != null -> visitor.visitGitHubConfig(githubConfig)
            discordConfig != null -> visitor.visitDiscordConfig(discordConfig)
            telegramConfig != null -> visitor.visitTelegramConfig(telegramConfig)
            figmaConfig != null -> visitor.visitFigmaConfig(figmaConfig)
            framerConfig != null -> visitor.visitFramerConfig(framerConfig)
            notionConfig != null -> visitor.visitNotionConfig(notionConfig)
            digitalFilesConfig != null -> visitor.visitDigitalFilesConfig(digitalFilesConfig)
            licenseKeyConfig != null -> visitor.visitLicenseKeyConfig(licenseKeyConfig)
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
    fun validate(): IntegrationConfigResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitFeatureFlagConfig(featureFlagConfig: FeatureFlagConfig) {
                    featureFlagConfig.validate()
                }

                override fun visitGitHubConfig(githubConfig: GitHubConfig) {
                    githubConfig.validate()
                }

                override fun visitDiscordConfig(discordConfig: DiscordConfig) {
                    discordConfig.validate()
                }

                override fun visitTelegramConfig(telegramConfig: TelegramConfig) {
                    telegramConfig.validate()
                }

                override fun visitFigmaConfig(figmaConfig: FigmaConfig) {
                    figmaConfig.validate()
                }

                override fun visitFramerConfig(framerConfig: FramerConfig) {
                    framerConfig.validate()
                }

                override fun visitNotionConfig(notionConfig: NotionConfig) {
                    notionConfig.validate()
                }

                override fun visitDigitalFilesConfig(digitalFilesConfig: DigitalFilesConfig) {
                    digitalFilesConfig.validate()
                }

                override fun visitLicenseKeyConfig(licenseKeyConfig: LicenseKeyConfig) {
                    licenseKeyConfig.validate()
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
                override fun visitFeatureFlagConfig(featureFlagConfig: FeatureFlagConfig) =
                    featureFlagConfig.validity()

                override fun visitGitHubConfig(githubConfig: GitHubConfig) = githubConfig.validity()

                override fun visitDiscordConfig(discordConfig: DiscordConfig) =
                    discordConfig.validity()

                override fun visitTelegramConfig(telegramConfig: TelegramConfig) =
                    telegramConfig.validity()

                override fun visitFigmaConfig(figmaConfig: FigmaConfig) = figmaConfig.validity()

                override fun visitFramerConfig(framerConfig: FramerConfig) = framerConfig.validity()

                override fun visitNotionConfig(notionConfig: NotionConfig) = notionConfig.validity()

                override fun visitDigitalFilesConfig(digitalFilesConfig: DigitalFilesConfig) =
                    digitalFilesConfig.validity()

                override fun visitLicenseKeyConfig(licenseKeyConfig: LicenseKeyConfig) =
                    licenseKeyConfig.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IntegrationConfigResponse &&
            featureFlagConfig == other.featureFlagConfig &&
            githubConfig == other.githubConfig &&
            discordConfig == other.discordConfig &&
            telegramConfig == other.telegramConfig &&
            figmaConfig == other.figmaConfig &&
            framerConfig == other.framerConfig &&
            notionConfig == other.notionConfig &&
            digitalFilesConfig == other.digitalFilesConfig &&
            licenseKeyConfig == other.licenseKeyConfig
    }

    override fun hashCode(): Int =
        Objects.hash(
            featureFlagConfig,
            githubConfig,
            discordConfig,
            telegramConfig,
            figmaConfig,
            framerConfig,
            notionConfig,
            digitalFilesConfig,
            licenseKeyConfig,
        )

    override fun toString(): String =
        when {
            featureFlagConfig != null ->
                "IntegrationConfigResponse{featureFlagConfig=$featureFlagConfig}"
            githubConfig != null -> "IntegrationConfigResponse{githubConfig=$githubConfig}"
            discordConfig != null -> "IntegrationConfigResponse{discordConfig=$discordConfig}"
            telegramConfig != null -> "IntegrationConfigResponse{telegramConfig=$telegramConfig}"
            figmaConfig != null -> "IntegrationConfigResponse{figmaConfig=$figmaConfig}"
            framerConfig != null -> "IntegrationConfigResponse{framerConfig=$framerConfig}"
            notionConfig != null -> "IntegrationConfigResponse{notionConfig=$notionConfig}"
            digitalFilesConfig != null ->
                "IntegrationConfigResponse{digitalFilesConfig=$digitalFilesConfig}"
            licenseKeyConfig != null ->
                "IntegrationConfigResponse{licenseKeyConfig=$licenseKeyConfig}"
            _json != null -> "IntegrationConfigResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid IntegrationConfigResponse")
        }

    companion object {

        fun ofFeatureFlagConfig(featureFlagConfig: FeatureFlagConfig) =
            IntegrationConfigResponse(featureFlagConfig = featureFlagConfig)

        fun ofGitHubConfig(githubConfig: GitHubConfig) =
            IntegrationConfigResponse(githubConfig = githubConfig)

        fun ofDiscordConfig(discordConfig: DiscordConfig) =
            IntegrationConfigResponse(discordConfig = discordConfig)

        fun ofTelegramConfig(telegramConfig: TelegramConfig) =
            IntegrationConfigResponse(telegramConfig = telegramConfig)

        fun ofFigmaConfig(figmaConfig: FigmaConfig) =
            IntegrationConfigResponse(figmaConfig = figmaConfig)

        fun ofFramerConfig(framerConfig: FramerConfig) =
            IntegrationConfigResponse(framerConfig = framerConfig)

        fun ofNotionConfig(notionConfig: NotionConfig) =
            IntegrationConfigResponse(notionConfig = notionConfig)

        fun ofDigitalFilesConfig(digitalFilesConfig: DigitalFilesConfig) =
            IntegrationConfigResponse(digitalFilesConfig = digitalFilesConfig)

        fun ofLicenseKeyConfig(licenseKeyConfig: LicenseKeyConfig) =
            IntegrationConfigResponse(licenseKeyConfig = licenseKeyConfig)
    }

    /**
     * An interface that defines how to map each variant of [IntegrationConfigResponse] to a value
     * of type [T].
     */
    interface Visitor<out T> {

        fun visitFeatureFlagConfig(featureFlagConfig: FeatureFlagConfig): T

        fun visitGitHubConfig(githubConfig: GitHubConfig): T

        fun visitDiscordConfig(discordConfig: DiscordConfig): T

        fun visitTelegramConfig(telegramConfig: TelegramConfig): T

        fun visitFigmaConfig(figmaConfig: FigmaConfig): T

        fun visitFramerConfig(framerConfig: FramerConfig): T

        fun visitNotionConfig(notionConfig: NotionConfig): T

        fun visitDigitalFilesConfig(digitalFilesConfig: DigitalFilesConfig): T

        fun visitLicenseKeyConfig(licenseKeyConfig: LicenseKeyConfig): T

        /**
         * Maps an unknown variant of [IntegrationConfigResponse] to a value of type [T].
         *
         * An instance of [IntegrationConfigResponse] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws DodoPaymentsInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw DodoPaymentsInvalidDataException("Unknown IntegrationConfigResponse: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<IntegrationConfigResponse>(IntegrationConfigResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): IntegrationConfigResponse {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<FeatureFlagConfig>())?.let {
                            IntegrationConfigResponse(featureFlagConfig = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<GitHubConfig>())?.let {
                            IntegrationConfigResponse(githubConfig = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<DiscordConfig>())?.let {
                            IntegrationConfigResponse(discordConfig = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<TelegramConfig>())?.let {
                            IntegrationConfigResponse(telegramConfig = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<FigmaConfig>())?.let {
                            IntegrationConfigResponse(figmaConfig = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<FramerConfig>())?.let {
                            IntegrationConfigResponse(framerConfig = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<NotionConfig>())?.let {
                            IntegrationConfigResponse(notionConfig = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<DigitalFilesConfig>())?.let {
                            IntegrationConfigResponse(digitalFilesConfig = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<LicenseKeyConfig>())?.let {
                            IntegrationConfigResponse(licenseKeyConfig = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> IntegrationConfigResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<IntegrationConfigResponse>(IntegrationConfigResponse::class) {

        override fun serialize(
            value: IntegrationConfigResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.featureFlagConfig != null -> generator.writeObject(value.featureFlagConfig)
                value.githubConfig != null -> generator.writeObject(value.githubConfig)
                value.discordConfig != null -> generator.writeObject(value.discordConfig)
                value.telegramConfig != null -> generator.writeObject(value.telegramConfig)
                value.figmaConfig != null -> generator.writeObject(value.figmaConfig)
                value.framerConfig != null -> generator.writeObject(value.framerConfig)
                value.notionConfig != null -> generator.writeObject(value.notionConfig)
                value.digitalFilesConfig != null -> generator.writeObject(value.digitalFilesConfig)
                value.licenseKeyConfig != null -> generator.writeObject(value.licenseKeyConfig)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid IntegrationConfigResponse")
            }
        }
    }

    class FeatureFlagConfig
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val featureId: JsonField<String>,
        private val featureType: JsonField<FeatureType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("feature_id")
            @ExcludeMissing
            featureId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("feature_type")
            @ExcludeMissing
            featureType: JsonField<FeatureType> = JsonMissing.of(),
        ) : this(featureId, featureType, mutableMapOf())

        /**
         * Merchant-chosen identifier for the capability this entitlement unlocks.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun featureId(): String = featureId.getRequired("feature_id")

        /**
         * Type of capability conferred. Only `boolean` is supported today.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun featureType(): FeatureType = featureType.getRequired("feature_type")

        /**
         * Returns the raw JSON value of [featureId].
         *
         * Unlike [featureId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("feature_id") @ExcludeMissing fun _featureId(): JsonField<String> = featureId

        /**
         * Returns the raw JSON value of [featureType].
         *
         * Unlike [featureType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("feature_type")
        @ExcludeMissing
        fun _featureType(): JsonField<FeatureType> = featureType

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
             * Returns a mutable builder for constructing an instance of [FeatureFlagConfig].
             *
             * The following fields are required:
             * ```kotlin
             * .featureId()
             * .featureType()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [FeatureFlagConfig]. */
        class Builder internal constructor() {

            private var featureId: JsonField<String>? = null
            private var featureType: JsonField<FeatureType>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(featureFlagConfig: FeatureFlagConfig) = apply {
                featureId = featureFlagConfig.featureId
                featureType = featureFlagConfig.featureType
                additionalProperties = featureFlagConfig.additionalProperties.toMutableMap()
            }

            /** Merchant-chosen identifier for the capability this entitlement unlocks. */
            fun featureId(featureId: String) = featureId(JsonField.of(featureId))

            /**
             * Sets [Builder.featureId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.featureId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun featureId(featureId: JsonField<String>) = apply { this.featureId = featureId }

            /** Type of capability conferred. Only `boolean` is supported today. */
            fun featureType(featureType: FeatureType) = featureType(JsonField.of(featureType))

            /**
             * Sets [Builder.featureType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.featureType] with a well-typed [FeatureType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun featureType(featureType: JsonField<FeatureType>) = apply {
                this.featureType = featureType
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
             * Returns an immutable instance of [FeatureFlagConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .featureId()
             * .featureType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): FeatureFlagConfig =
                FeatureFlagConfig(
                    checkRequired("featureId", featureId),
                    checkRequired("featureType", featureType),
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
        fun validate(): FeatureFlagConfig = apply {
            if (validated) {
                return@apply
            }

            featureId()
            featureType().validate()
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
            (if (featureId.asKnown() == null) 0 else 1) + (featureType.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FeatureFlagConfig &&
                featureId == other.featureId &&
                featureType == other.featureType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(featureId, featureType, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FeatureFlagConfig{featureId=$featureId, featureType=$featureType, additionalProperties=$additionalProperties}"
    }

    class GitHubConfig
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val permission: JsonField<GitHubPermission>,
        private val targetId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("permission")
            @ExcludeMissing
            permission: JsonField<GitHubPermission> = JsonMissing.of(),
            @JsonProperty("target_id")
            @ExcludeMissing
            targetId: JsonField<String> = JsonMissing.of(),
        ) : this(permission, targetId, mutableMapOf())

        /**
         * Permission to grant on the repository.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun permission(): GitHubPermission = permission.getRequired("permission")

        /**
         * Repository or organisation slug to grant access to.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun targetId(): String = targetId.getRequired("target_id")

        /**
         * Returns the raw JSON value of [permission].
         *
         * Unlike [permission], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("permission")
        @ExcludeMissing
        fun _permission(): JsonField<GitHubPermission> = permission

        /**
         * Returns the raw JSON value of [targetId].
         *
         * Unlike [targetId], this method doesn't throw if the JSON field has an unexpected type.
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

            private var permission: JsonField<GitHubPermission>? = null
            private var targetId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(githubConfig: GitHubConfig) = apply {
                permission = githubConfig.permission
                targetId = githubConfig.targetId
                additionalProperties = githubConfig.additionalProperties.toMutableMap()
            }

            /** Permission to grant on the repository. */
            fun permission(permission: GitHubPermission) = permission(JsonField.of(permission))

            /**
             * Sets [Builder.permission] to an arbitrary JSON value.
             *
             * You should usually call [Builder.permission] with a well-typed [GitHubPermission]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun permission(permission: JsonField<GitHubPermission>) = apply {
                this.permission = permission
            }

            /** Repository or organisation slug to grant access to. */
            fun targetId(targetId: String) = targetId(JsonField.of(targetId))

            /**
             * Sets [Builder.targetId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targetId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun targetId(targetId: JsonField<String>) = apply { this.targetId = targetId }

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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): GitHubConfig = apply {
            if (validated) {
                return@apply
            }

            permission().validate()
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
            (permission.asKnown()?.validity() ?: 0) + (if (targetId.asKnown() == null) 0 else 1)

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
            @JsonProperty("guild_id") @ExcludeMissing guildId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("role_id") @ExcludeMissing roleId: JsonField<String> = JsonMissing.of(),
        ) : this(guildId, roleId, mutableMapOf())

        /**
         * Discord guild (server) ID.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun guildId(): String = guildId.getRequired("guild_id")

        /**
         * Optional Discord role to assign within the guild.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
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

            /** Discord guild (server) ID. */
            fun guildId(guildId: String) = guildId(JsonField.of(guildId))

            /**
             * Sets [Builder.guildId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.guildId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun guildId(guildId: JsonField<String>) = apply { this.guildId = guildId }

            /** Optional Discord role to assign within the guild. */
            fun roleId(roleId: String?) = roleId(JsonField.ofNullable(roleId))

            /**
             * Sets [Builder.roleId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.roleId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun roleId(roleId: JsonField<String>) = apply { this.roleId = roleId }

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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
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

        private val hashCode: Int by lazy { Objects.hash(guildId, roleId, additionalProperties) }

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
            @JsonProperty("chat_id") @ExcludeMissing chatId: JsonField<String> = JsonMissing.of()
        ) : this(chatId, mutableMapOf())

        /**
         * Telegram chat ID. For groups this is typically a negative integer.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
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

            /** Telegram chat ID. For groups this is typically a negative integer. */
            fun chatId(chatId: String) = chatId(JsonField.of(chatId))

            /**
             * Sets [Builder.chatId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chatId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun chatId(chatId: JsonField<String>) = apply { this.chatId = chatId }

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
                TelegramConfig(checkRequired("chatId", chatId), additionalProperties.toMutableMap())
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
         * Figma file identifier to grant access to.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun figmaFileId(): String = figmaFileId.getRequired("figma_file_id")

        /**
         * Returns the raw JSON value of [figmaFileId].
         *
         * Unlike [figmaFileId], this method doesn't throw if the JSON field has an unexpected type.
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

            /** Figma file identifier to grant access to. */
            fun figmaFileId(figmaFileId: String) = figmaFileId(JsonField.of(figmaFileId))

            /**
             * Sets [Builder.figmaFileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.figmaFileId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
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
         * Framer template identifier to grant access to.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun framerTemplateId(): String = framerTemplateId.getRequired("framer_template_id")

        /**
         * Returns the raw JSON value of [framerTemplateId].
         *
         * Unlike [framerTemplateId], this method doesn't throw if the JSON field has an unexpected
         * type.
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

            /** Framer template identifier to grant access to. */
            fun framerTemplateId(framerTemplateId: String) =
                framerTemplateId(JsonField.of(framerTemplateId))

            /**
             * Sets [Builder.framerTemplateId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.framerTemplateId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
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

        private val hashCode: Int by lazy { Objects.hash(framerTemplateId, additionalProperties) }

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
         * Notion template identifier to grant access to.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun notionTemplateId(): String = notionTemplateId.getRequired("notion_template_id")

        /**
         * Returns the raw JSON value of [notionTemplateId].
         *
         * Unlike [notionTemplateId], this method doesn't throw if the JSON field has an unexpected
         * type.
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

            /** Notion template identifier to grant access to. */
            fun notionTemplateId(notionTemplateId: String) =
                notionTemplateId(JsonField.of(notionTemplateId))

            /**
             * Sets [Builder.notionTemplateId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notionTemplateId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
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

        private val hashCode: Int by lazy { Objects.hash(notionTemplateId, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NotionConfig{notionTemplateId=$notionTemplateId, additionalProperties=$additionalProperties}"
    }

    class DigitalFilesConfig
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val digitalFiles: JsonField<DigitalFiles>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("digital_files")
            @ExcludeMissing
            digitalFiles: JsonField<DigitalFiles> = JsonMissing.of()
        ) : this(digitalFiles, mutableMapOf())

        /**
         * Populated digital-files payload with each file's metadata and a short-lived presigned
         * download URL.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun digitalFiles(): DigitalFiles = digitalFiles.getRequired("digital_files")

        /**
         * Returns the raw JSON value of [digitalFiles].
         *
         * Unlike [digitalFiles], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("digital_files")
        @ExcludeMissing
        fun _digitalFiles(): JsonField<DigitalFiles> = digitalFiles

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
             * .digitalFiles()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [DigitalFilesConfig]. */
        class Builder internal constructor() {

            private var digitalFiles: JsonField<DigitalFiles>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(digitalFilesConfig: DigitalFilesConfig) = apply {
                digitalFiles = digitalFilesConfig.digitalFiles
                additionalProperties = digitalFilesConfig.additionalProperties.toMutableMap()
            }

            /**
             * Populated digital-files payload with each file's metadata and a short-lived presigned
             * download URL.
             */
            fun digitalFiles(digitalFiles: DigitalFiles) = digitalFiles(JsonField.of(digitalFiles))

            /**
             * Sets [Builder.digitalFiles] to an arbitrary JSON value.
             *
             * You should usually call [Builder.digitalFiles] with a well-typed [DigitalFiles] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun digitalFiles(digitalFiles: JsonField<DigitalFiles>) = apply {
                this.digitalFiles = digitalFiles
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
             * Returns an immutable instance of [DigitalFilesConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .digitalFiles()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DigitalFilesConfig =
                DigitalFilesConfig(
                    checkRequired("digitalFiles", digitalFiles),
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
        fun validate(): DigitalFilesConfig = apply {
            if (validated) {
                return@apply
            }

            digitalFiles().validate()
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
        internal fun validity(): Int = (digitalFiles.asKnown()?.validity() ?: 0)

        /**
         * Populated digital-files payload with each file's metadata and a short-lived presigned
         * download URL.
         */
        class DigitalFiles
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val files: JsonField<List<File>>,
            private val externalUrl: JsonField<String>,
            private val instructions: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("files")
                @ExcludeMissing
                files: JsonField<List<File>> = JsonMissing.of(),
                @JsonProperty("external_url")
                @ExcludeMissing
                externalUrl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("instructions")
                @ExcludeMissing
                instructions: JsonField<String> = JsonMissing.of(),
            ) : this(files, externalUrl, instructions, mutableMapOf())

            /**
             * One entry per attached file.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun files(): List<File> = files.getRequired("files")

            /**
             * Optional external URL, passed through from the entitlement configuration.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun externalUrl(): String? = externalUrl.getNullable("external_url")

            /**
             * Optional human-readable delivery instructions, passed through from the entitlement
             * configuration.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun instructions(): String? = instructions.getNullable("instructions")

            /**
             * Returns the raw JSON value of [files].
             *
             * Unlike [files], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("files") @ExcludeMissing fun _files(): JsonField<List<File>> = files

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
                 * Returns a mutable builder for constructing an instance of [DigitalFiles].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .files()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [DigitalFiles]. */
            class Builder internal constructor() {

                private var files: JsonField<MutableList<File>>? = null
                private var externalUrl: JsonField<String> = JsonMissing.of()
                private var instructions: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(digitalFiles: DigitalFiles) = apply {
                    files = digitalFiles.files.map { it.toMutableList() }
                    externalUrl = digitalFiles.externalUrl
                    instructions = digitalFiles.instructions
                    additionalProperties = digitalFiles.additionalProperties.toMutableMap()
                }

                /** One entry per attached file. */
                fun files(files: List<File>) = files(JsonField.of(files))

                /**
                 * Sets [Builder.files] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.files] with a well-typed `List<File>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun files(files: JsonField<List<File>>) = apply {
                    this.files = files.map { it.toMutableList() }
                }

                /**
                 * Adds a single [File] to [files].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addFile(file: File) = apply {
                    files =
                        (files ?: JsonField.of(mutableListOf())).also {
                            checkKnown("files", it).add(file)
                        }
                }

                /** Optional external URL, passed through from the entitlement configuration. */
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

                /**
                 * Optional human-readable delivery instructions, passed through from the
                 * entitlement configuration.
                 */
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
                 * Returns an immutable instance of [DigitalFiles].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .files()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): DigitalFiles =
                    DigitalFiles(
                        checkRequired("files", files).map { it.toImmutable() },
                        externalUrl,
                        instructions,
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): DigitalFiles = apply {
                if (validated) {
                    return@apply
                }

                files().forEach { it.validate() }
                externalUrl()
                instructions()
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
                (files.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (externalUrl.asKnown() == null) 0 else 1) +
                    (if (instructions.asKnown() == null) 0 else 1)

            /** One file in a resolved digital-files payload. */
            class File
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val downloadUrl: JsonField<String>,
                private val expiresIn: JsonField<Long>,
                private val fileId: JsonField<String>,
                private val filename: JsonField<String>,
                private val contentType: JsonField<String>,
                private val fileSize: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("download_url")
                    @ExcludeMissing
                    downloadUrl: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("expires_in")
                    @ExcludeMissing
                    expiresIn: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("file_id")
                    @ExcludeMissing
                    fileId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("filename")
                    @ExcludeMissing
                    filename: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("content_type")
                    @ExcludeMissing
                    contentType: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("file_size")
                    @ExcludeMissing
                    fileSize: JsonField<Long> = JsonMissing.of(),
                ) : this(
                    downloadUrl,
                    expiresIn,
                    fileId,
                    filename,
                    contentType,
                    fileSize,
                    mutableMapOf(),
                )

                /**
                 * Short-lived presigned URL for downloading the file.
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun downloadUrl(): String = downloadUrl.getRequired("download_url")

                /**
                 * Seconds until `download_url` expires.
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun expiresIn(): Long = expiresIn.getRequired("expires_in")

                /**
                 * Identifier of the attached file.
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun fileId(): String = fileId.getRequired("file_id")

                /**
                 * Original filename of the attached file.
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun filename(): String = filename.getRequired("filename")

                /**
                 * Optional content-type declared at upload.
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun contentType(): String? = contentType.getNullable("content_type")

                /**
                 * Optional size of the file in bytes.
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun fileSize(): Long? = fileSize.getNullable("file_size")

                /**
                 * Returns the raw JSON value of [downloadUrl].
                 *
                 * Unlike [downloadUrl], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("download_url")
                @ExcludeMissing
                fun _downloadUrl(): JsonField<String> = downloadUrl

                /**
                 * Returns the raw JSON value of [expiresIn].
                 *
                 * Unlike [expiresIn], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("expires_in")
                @ExcludeMissing
                fun _expiresIn(): JsonField<Long> = expiresIn

                /**
                 * Returns the raw JSON value of [fileId].
                 *
                 * Unlike [fileId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("file_id") @ExcludeMissing fun _fileId(): JsonField<String> = fileId

                /**
                 * Returns the raw JSON value of [filename].
                 *
                 * Unlike [filename], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("filename")
                @ExcludeMissing
                fun _filename(): JsonField<String> = filename

                /**
                 * Returns the raw JSON value of [contentType].
                 *
                 * Unlike [contentType], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("content_type")
                @ExcludeMissing
                fun _contentType(): JsonField<String> = contentType

                /**
                 * Returns the raw JSON value of [fileSize].
                 *
                 * Unlike [fileSize], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("file_size")
                @ExcludeMissing
                fun _fileSize(): JsonField<Long> = fileSize

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
                     * Returns a mutable builder for constructing an instance of [File].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .downloadUrl()
                     * .expiresIn()
                     * .fileId()
                     * .filename()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [File]. */
                class Builder internal constructor() {

                    private var downloadUrl: JsonField<String>? = null
                    private var expiresIn: JsonField<Long>? = null
                    private var fileId: JsonField<String>? = null
                    private var filename: JsonField<String>? = null
                    private var contentType: JsonField<String> = JsonMissing.of()
                    private var fileSize: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(file: File) = apply {
                        downloadUrl = file.downloadUrl
                        expiresIn = file.expiresIn
                        fileId = file.fileId
                        filename = file.filename
                        contentType = file.contentType
                        fileSize = file.fileSize
                        additionalProperties = file.additionalProperties.toMutableMap()
                    }

                    /** Short-lived presigned URL for downloading the file. */
                    fun downloadUrl(downloadUrl: String) = downloadUrl(JsonField.of(downloadUrl))

                    /**
                     * Sets [Builder.downloadUrl] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.downloadUrl] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun downloadUrl(downloadUrl: JsonField<String>) = apply {
                        this.downloadUrl = downloadUrl
                    }

                    /** Seconds until `download_url` expires. */
                    fun expiresIn(expiresIn: Long) = expiresIn(JsonField.of(expiresIn))

                    /**
                     * Sets [Builder.expiresIn] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.expiresIn] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun expiresIn(expiresIn: JsonField<Long>) = apply { this.expiresIn = expiresIn }

                    /** Identifier of the attached file. */
                    fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                    /**
                     * Sets [Builder.fileId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fileId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

                    /** Original filename of the attached file. */
                    fun filename(filename: String) = filename(JsonField.of(filename))

                    /**
                     * Sets [Builder.filename] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.filename] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun filename(filename: JsonField<String>) = apply { this.filename = filename }

                    /** Optional content-type declared at upload. */
                    fun contentType(contentType: String?) =
                        contentType(JsonField.ofNullable(contentType))

                    /**
                     * Sets [Builder.contentType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.contentType] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun contentType(contentType: JsonField<String>) = apply {
                        this.contentType = contentType
                    }

                    /** Optional size of the file in bytes. */
                    fun fileSize(fileSize: Long?) = fileSize(JsonField.ofNullable(fileSize))

                    /**
                     * Alias for [Builder.fileSize].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun fileSize(fileSize: Long) = fileSize(fileSize as Long?)

                    /**
                     * Sets [Builder.fileSize] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fileSize] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun fileSize(fileSize: JsonField<Long>) = apply { this.fileSize = fileSize }

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
                     * Returns an immutable instance of [File].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .downloadUrl()
                     * .expiresIn()
                     * .fileId()
                     * .filename()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): File =
                        File(
                            checkRequired("downloadUrl", downloadUrl),
                            checkRequired("expiresIn", expiresIn),
                            checkRequired("fileId", fileId),
                            checkRequired("filename", filename),
                            contentType,
                            fileSize,
                            additionalProperties.toMutableMap(),
                        )
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
                fun validate(): File = apply {
                    if (validated) {
                        return@apply
                    }

                    downloadUrl()
                    expiresIn()
                    fileId()
                    filename()
                    contentType()
                    fileSize()
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
                    (if (downloadUrl.asKnown() == null) 0 else 1) +
                        (if (expiresIn.asKnown() == null) 0 else 1) +
                        (if (fileId.asKnown() == null) 0 else 1) +
                        (if (filename.asKnown() == null) 0 else 1) +
                        (if (contentType.asKnown() == null) 0 else 1) +
                        (if (fileSize.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is File &&
                        downloadUrl == other.downloadUrl &&
                        expiresIn == other.expiresIn &&
                        fileId == other.fileId &&
                        filename == other.filename &&
                        contentType == other.contentType &&
                        fileSize == other.fileSize &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        downloadUrl,
                        expiresIn,
                        fileId,
                        filename,
                        contentType,
                        fileSize,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "File{downloadUrl=$downloadUrl, expiresIn=$expiresIn, fileId=$fileId, filename=$filename, contentType=$contentType, fileSize=$fileSize, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DigitalFiles &&
                    files == other.files &&
                    externalUrl == other.externalUrl &&
                    instructions == other.instructions &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(files, externalUrl, instructions, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DigitalFiles{files=$files, externalUrl=$externalUrl, instructions=$instructions, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DigitalFilesConfig &&
                digitalFiles == other.digitalFiles &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(digitalFiles, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DigitalFilesConfig{digitalFiles=$digitalFiles, additionalProperties=$additionalProperties}"
    }

    class LicenseKeyConfig
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val activationMessage: JsonField<String>,
        private val activationsLimit: JsonField<Int>,
        private val durationCount: JsonField<Int>,
        private val durationInterval: JsonField<TimeInterval>,
        private val fulfillmentMode: JsonField<FulfillmentMode>,
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
            @JsonProperty("fulfillment_mode")
            @ExcludeMissing
            fulfillmentMode: JsonField<FulfillmentMode> = JsonMissing.of(),
        ) : this(
            activationMessage,
            activationsLimit,
            durationCount,
            durationInterval,
            fulfillmentMode,
            mutableMapOf(),
        )

        /**
         * Optional message displayed when a customer activates the license key (≤ 2500 characters).
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun activationMessage(): String? = activationMessage.getNullable("activation_message")

        /**
         * Maximum activations allowed per issued license key. Omit for unlimited.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun activationsLimit(): Int? = activationsLimit.getNullable("activations_limit")

        /**
         * Validity duration of issued license keys. Provide both `duration_count` and
         * `duration_interval` together for a fixed duration; omit both for non-expiring keys.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun durationCount(): Int? = durationCount.getNullable("duration_count")

        /**
         * Unit of `duration_count`.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun durationInterval(): TimeInterval? = durationInterval.getNullable("duration_interval")

        /**
         * How license keys are fulfilled. `auto` (default) generates and delivers keys to customers
         * automatically; `manual` creates pending grants that you fulfill with the supplied key via
         * `POST /grants/{grant_id}/license-key`.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun fulfillmentMode(): FulfillmentMode? = fulfillmentMode.getNullable("fulfillment_mode")

        /**
         * Returns the raw JSON value of [activationMessage].
         *
         * Unlike [activationMessage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("activation_message")
        @ExcludeMissing
        fun _activationMessage(): JsonField<String> = activationMessage

        /**
         * Returns the raw JSON value of [activationsLimit].
         *
         * Unlike [activationsLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Unlike [durationInterval], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("duration_interval")
        @ExcludeMissing
        fun _durationInterval(): JsonField<TimeInterval> = durationInterval

        /**
         * Returns the raw JSON value of [fulfillmentMode].
         *
         * Unlike [fulfillmentMode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("fulfillment_mode")
        @ExcludeMissing
        fun _fulfillmentMode(): JsonField<FulfillmentMode> = fulfillmentMode

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
            private var fulfillmentMode: JsonField<FulfillmentMode> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(licenseKeyConfig: LicenseKeyConfig) = apply {
                activationMessage = licenseKeyConfig.activationMessage
                activationsLimit = licenseKeyConfig.activationsLimit
                durationCount = licenseKeyConfig.durationCount
                durationInterval = licenseKeyConfig.durationInterval
                fulfillmentMode = licenseKeyConfig.fulfillmentMode
                additionalProperties = licenseKeyConfig.additionalProperties.toMutableMap()
            }

            /**
             * Optional message displayed when a customer activates the license key (≤ 2500
             * characters).
             */
            fun activationMessage(activationMessage: String?) =
                activationMessage(JsonField.ofNullable(activationMessage))

            /**
             * Sets [Builder.activationMessage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.activationMessage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun activationMessage(activationMessage: JsonField<String>) = apply {
                this.activationMessage = activationMessage
            }

            /** Maximum activations allowed per issued license key. Omit for unlimited. */
            fun activationsLimit(activationsLimit: Int?) =
                activationsLimit(JsonField.ofNullable(activationsLimit))

            /**
             * Alias for [Builder.activationsLimit].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun activationsLimit(activationsLimit: Int) = activationsLimit(activationsLimit as Int?)

            /**
             * Sets [Builder.activationsLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.activationsLimit] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun activationsLimit(activationsLimit: JsonField<Int>) = apply {
                this.activationsLimit = activationsLimit
            }

            /**
             * Validity duration of issued license keys. Provide both `duration_count` and
             * `duration_interval` together for a fixed duration; omit both for non-expiring keys.
             */
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
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun durationCount(durationCount: JsonField<Int>) = apply {
                this.durationCount = durationCount
            }

            /** Unit of `duration_count`. */
            fun durationInterval(durationInterval: TimeInterval?) =
                durationInterval(JsonField.ofNullable(durationInterval))

            /**
             * Sets [Builder.durationInterval] to an arbitrary JSON value.
             *
             * You should usually call [Builder.durationInterval] with a well-typed [TimeInterval]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun durationInterval(durationInterval: JsonField<TimeInterval>) = apply {
                this.durationInterval = durationInterval
            }

            /**
             * How license keys are fulfilled. `auto` (default) generates and delivers keys to
             * customers automatically; `manual` creates pending grants that you fulfill with the
             * supplied key via `POST /grants/{grant_id}/license-key`.
             */
            fun fulfillmentMode(fulfillmentMode: FulfillmentMode?) =
                fulfillmentMode(JsonField.ofNullable(fulfillmentMode))

            /**
             * Sets [Builder.fulfillmentMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fulfillmentMode] with a well-typed [FulfillmentMode]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun fulfillmentMode(fulfillmentMode: JsonField<FulfillmentMode>) = apply {
                this.fulfillmentMode = fulfillmentMode
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
                    fulfillmentMode,
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
        fun validate(): LicenseKeyConfig = apply {
            if (validated) {
                return@apply
            }

            activationMessage()
            activationsLimit()
            durationCount()
            durationInterval()?.validate()
            fulfillmentMode()?.validate()
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
                (durationInterval.asKnown()?.validity() ?: 0) +
                (fulfillmentMode.asKnown()?.validity() ?: 0)

        /**
         * How license keys are fulfilled. `auto` (default) generates and delivers keys to customers
         * automatically; `manual` creates pending grants that you fulfill with the supplied key via
         * `POST /grants/{grant_id}/license-key`.
         */
        class FulfillmentMode
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val AUTO = of("auto")

                val MANUAL = of("manual")

                fun of(value: String) = FulfillmentMode(JsonField.of(value))
            }

            /** An enum containing [FulfillmentMode]'s known values. */
            enum class Known {
                AUTO,
                MANUAL,
            }

            /**
             * An enum containing [FulfillmentMode]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [FulfillmentMode] can contain an unknown value in a couple of cases:
             *
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             *
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AUTO,
                MANUAL,
                /**
                 * An enum member indicating that [FulfillmentMode] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    AUTO -> Value.AUTO
                    MANUAL -> Value.MANUAL
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws DodoPaymentsInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    AUTO -> Known.AUTO
                    MANUAL -> Known.MANUAL
                    else ->
                        throw DodoPaymentsInvalidDataException("Unknown FulfillmentMode: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws DodoPaymentsInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw DodoPaymentsInvalidDataException("Value is not a String")

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
            fun validate(): FulfillmentMode = apply {
                if (validated) {
                    return@apply
                }

                known()
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
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is FulfillmentMode && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LicenseKeyConfig &&
                activationMessage == other.activationMessage &&
                activationsLimit == other.activationsLimit &&
                durationCount == other.durationCount &&
                durationInterval == other.durationInterval &&
                fulfillmentMode == other.fulfillmentMode &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                activationMessage,
                activationsLimit,
                durationCount,
                durationInterval,
                fulfillmentMode,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LicenseKeyConfig{activationMessage=$activationMessage, activationsLimit=$activationsLimit, durationCount=$durationCount, durationInterval=$durationInterval, fulfillmentMode=$fulfillmentMode, additionalProperties=$additionalProperties}"
    }
}
