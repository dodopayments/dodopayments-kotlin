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
 * Integration-specific configuration supplied when creating or updating an entitlement. The shape
 * required matches the entitlement's `integration_type`.
 *
 * Untagged enum: variants are matched in order. `FeatureFlag` must precede `LicenseKey`, whose
 * fields are all optional and would otherwise match a `feature_flag` config.
 */
@JsonDeserialize(using = IntegrationConfig.Deserializer::class)
@JsonSerialize(using = IntegrationConfig.Serializer::class)
class IntegrationConfig
private constructor(
    private val featureFlag: FeatureFlagConfig? = null,
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

    fun featureFlag(): FeatureFlagConfig? = featureFlag

    fun github(): GitHubConfig? = github

    fun discord(): DiscordConfig? = discord

    fun telegram(): TelegramConfig? = telegram

    fun figma(): FigmaConfig? = figma

    fun framer(): FramerConfig? = framer

    fun notion(): NotionConfig? = notion

    fun digitalFiles(): DigitalFilesConfig? = digitalFiles

    fun licenseKey(): LicenseKeyConfig? = licenseKey

    fun isFeatureFlag(): Boolean = featureFlag != null

    fun isGitHub(): Boolean = github != null

    fun isDiscord(): Boolean = discord != null

    fun isTelegram(): Boolean = telegram != null

    fun isFigma(): Boolean = figma != null

    fun isFramer(): Boolean = framer != null

    fun isNotion(): Boolean = notion != null

    fun isDigitalFiles(): Boolean = digitalFiles != null

    fun isLicenseKey(): Boolean = licenseKey != null

    fun asFeatureFlag(): FeatureFlagConfig = featureFlag.getOrThrow("featureFlag")

    fun asGitHub(): GitHubConfig = github.getOrThrow("github")

    fun asDiscord(): DiscordConfig = discord.getOrThrow("discord")

    fun asTelegram(): TelegramConfig = telegram.getOrThrow("telegram")

    fun asFigma(): FigmaConfig = figma.getOrThrow("figma")

    fun asFramer(): FramerConfig = framer.getOrThrow("framer")

    fun asNotion(): NotionConfig = notion.getOrThrow("notion")

    fun asDigitalFiles(): DigitalFilesConfig = digitalFiles.getOrThrow("digitalFiles")

    fun asLicenseKey(): LicenseKeyConfig = licenseKey.getOrThrow("licenseKey")

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
     * val result: String? = integrationConfig.accept(object : IntegrationConfig.Visitor<String?> {
     *     override fun visitFeatureFlag(featureFlag: FeatureFlagConfig): String? = featureFlag.toString()
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
            featureFlag != null -> visitor.visitFeatureFlag(featureFlag)
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

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): IntegrationConfig = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitFeatureFlag(featureFlag: FeatureFlagConfig) {
                    featureFlag.validate()
                }

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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitFeatureFlag(featureFlag: FeatureFlagConfig) =
                    featureFlag.validity()

                override fun visitGitHub(github: GitHubConfig) = github.validity()

                override fun visitDiscord(discord: DiscordConfig) = discord.validity()

                override fun visitTelegram(telegram: TelegramConfig) = telegram.validity()

                override fun visitFigma(figma: FigmaConfig) = figma.validity()

                override fun visitFramer(framer: FramerConfig) = framer.validity()

                override fun visitNotion(notion: NotionConfig) = notion.validity()

                override fun visitDigitalFiles(digitalFiles: DigitalFilesConfig) =
                    digitalFiles.validity()

                override fun visitLicenseKey(licenseKey: LicenseKeyConfig) = licenseKey.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IntegrationConfig &&
            featureFlag == other.featureFlag &&
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
        Objects.hash(
            featureFlag,
            github,
            discord,
            telegram,
            figma,
            framer,
            notion,
            digitalFiles,
            licenseKey,
        )

    override fun toString(): String =
        when {
            featureFlag != null -> "IntegrationConfig{featureFlag=$featureFlag}"
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

        fun ofFeatureFlag(featureFlag: FeatureFlagConfig) =
            IntegrationConfig(featureFlag = featureFlag)

        fun ofGitHub(github: GitHubConfig) = IntegrationConfig(github = github)

        fun ofDiscord(discord: DiscordConfig) = IntegrationConfig(discord = discord)

        fun ofTelegram(telegram: TelegramConfig) = IntegrationConfig(telegram = telegram)

        fun ofFigma(figma: FigmaConfig) = IntegrationConfig(figma = figma)

        fun ofFramer(framer: FramerConfig) = IntegrationConfig(framer = framer)

        fun ofNotion(notion: NotionConfig) = IntegrationConfig(notion = notion)

        fun ofDigitalFiles(digitalFiles: DigitalFilesConfig) =
            IntegrationConfig(digitalFiles = digitalFiles)

        fun ofLicenseKey(licenseKey: LicenseKeyConfig) = IntegrationConfig(licenseKey = licenseKey)
    }

    /**
     * An interface that defines how to map each variant of [IntegrationConfig] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        fun visitFeatureFlag(featureFlag: FeatureFlagConfig): T

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
         * An instance of [IntegrationConfig] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws DodoPaymentsInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw DodoPaymentsInvalidDataException("Unknown IntegrationConfig: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<IntegrationConfig>(IntegrationConfig::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): IntegrationConfig {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<FeatureFlagConfig>())?.let {
                            IntegrationConfig(featureFlag = it, _json = json)
                        },
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
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> IntegrationConfig(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
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
                value.featureFlag != null -> generator.writeObject(value.featureFlag)
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
         * Merchant-chosen identifier for the capability this entitlement unlocks. Not unique across
         * entitlements.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun featureId(): String = featureId.getRequired("feature_id")

        /**
         * Type of capability conferred.
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

            /**
             * Merchant-chosen identifier for the capability this entitlement unlocks. Not unique
             * across entitlements.
             */
            fun featureId(featureId: String) = featureId(JsonField.of(featureId))

            /**
             * Sets [Builder.featureId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.featureId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun featureId(featureId: JsonField<String>) = apply { this.featureId = featureId }

            /** Type of capability conferred. */
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
         * Files attached to this entitlement. Add files via `POST /entitlements/{id}/files` and
         * remove them via `DELETE /entitlements/{id}/files/{file_id}`.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun digitalFileIds(): List<String> = digitalFileIds.getRequired("digital_file_ids")

        /**
         * Optional external URL shown to the customer alongside the files.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun externalUrl(): String? = externalUrl.getNullable("external_url")

        /**
         * Optional human-readable delivery instructions shown to the customer alongside the files.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun instructions(): String? = instructions.getNullable("instructions")

        /**
         * Three-way patchable list of legacy file identifiers:
         * * omitted → preserve the current value
         * * `null` → clear
         * * `[...]` → replace
         *
         * On create, an omitted field, an explicit `null`, or an empty array all result in no
         * legacy files attached.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun legacyFileIds(): List<String>? = legacyFileIds.getNullable("legacy_file_ids")

        /**
         * Returns the raw JSON value of [digitalFileIds].
         *
         * Unlike [digitalFileIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("digital_file_ids")
        @ExcludeMissing
        fun _digitalFileIds(): JsonField<List<String>> = digitalFileIds

        /**
         * Returns the raw JSON value of [externalUrl].
         *
         * Unlike [externalUrl], this method doesn't throw if the JSON field has an unexpected type.
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

            /**
             * Files attached to this entitlement. Add files via `POST /entitlements/{id}/files` and
             * remove them via `DELETE /entitlements/{id}/files/{file_id}`.
             */
            fun digitalFileIds(digitalFileIds: List<String>) =
                digitalFileIds(JsonField.of(digitalFileIds))

            /**
             * Sets [Builder.digitalFileIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.digitalFileIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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

            /** Optional external URL shown to the customer alongside the files. */
            fun externalUrl(externalUrl: String?) = externalUrl(JsonField.ofNullable(externalUrl))

            /**
             * Sets [Builder.externalUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalUrl(externalUrl: JsonField<String>) = apply {
                this.externalUrl = externalUrl
            }

            /**
             * Optional human-readable delivery instructions shown to the customer alongside the
             * files.
             */
            fun instructions(instructions: String?) =
                instructions(JsonField.ofNullable(instructions))

            /**
             * Sets [Builder.instructions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.instructions] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun instructions(instructions: JsonField<String>) = apply {
                this.instructions = instructions
            }

            /**
             * Three-way patchable list of legacy file identifiers:
             * * omitted → preserve the current value
             * * `null` → clear
             * * `[...]` → replace
             *
             * On create, an omitted field, an explicit `null`, or an empty array all result in no
             * legacy files attached.
             */
            fun legacyFileIds(legacyFileIds: List<String>?) =
                legacyFileIds(JsonField.ofNullable(legacyFileIds))

            /**
             * Sets [Builder.legacyFileIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.legacyFileIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
