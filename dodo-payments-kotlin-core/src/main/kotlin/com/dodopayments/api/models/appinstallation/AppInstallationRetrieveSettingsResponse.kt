// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.appinstallation

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkKnown
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

/** The settings of the App Installation of the app token, with the secret values. */
class AppInstallationRetrieveSettingsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val actionNeeded: JsonField<Boolean>,
    private val appId: JsonField<String>,
    private val installationId: JsonField<String>,
    private val invalidKeys: JsonField<List<String>>,
    private val secrets: JsonValue,
    private val values: JsonValue,
    private val liveManifestVersion: JsonField<Int>,
    private val manifestVersion: JsonField<Int>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("action_needed")
        @ExcludeMissing
        actionNeeded: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("app_id") @ExcludeMissing appId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("installation_id")
        @ExcludeMissing
        installationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("invalid_keys")
        @ExcludeMissing
        invalidKeys: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("secrets") @ExcludeMissing secrets: JsonValue = JsonMissing.of(),
        @JsonProperty("values") @ExcludeMissing values: JsonValue = JsonMissing.of(),
        @JsonProperty("live_manifest_version")
        @ExcludeMissing
        liveManifestVersion: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("manifest_version")
        @ExcludeMissing
        manifestVersion: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        actionNeeded,
        appId,
        installationId,
        invalidKeys,
        secrets,
        values,
        liveManifestVersion,
        manifestVersion,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * `true` when a required field has no value, or a stored value fails a live rule.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun actionNeeded(): Boolean = actionNeeded.getRequired("action_needed")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun appId(): String = appId.getRequired("app_id")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun installationId(): String = installationId.getRequired("installation_id")

    /**
     * The keys that need an action.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun invalidKeys(): List<String> = invalidKeys.getRequired("invalid_keys")

    /**
     * The values of the secret fields of the live manifest, by key.
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = appInstallationRetrieveSettingsResponse.secrets().convert(MyClass::class.java)
     * ```
     */
    @JsonProperty("secrets") @ExcludeMissing fun _secrets(): JsonValue = secrets

    /**
     * The values of the fields of the live manifest that are not secrets.
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = appInstallationRetrieveSettingsResponse.values().convert(MyClass::class.java)
     * ```
     */
    @JsonProperty("values") @ExcludeMissing fun _values(): JsonValue = values

    /**
     * The version of the live settings manifest. It is `null` when the app has no live manifest.
     * Then `values` and `secrets` are empty.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun liveManifestVersion(): Int? = liveManifestVersion.getNullable("live_manifest_version")

    /**
     * The manifest version of the last save. It is `null` when the installation has no settings.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun manifestVersion(): Int? = manifestVersion.getNullable("manifest_version")

    /**
     * The time of the last save.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

    /**
     * Returns the raw JSON value of [actionNeeded].
     *
     * Unlike [actionNeeded], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("action_needed")
    @ExcludeMissing
    fun _actionNeeded(): JsonField<Boolean> = actionNeeded

    /**
     * Returns the raw JSON value of [appId].
     *
     * Unlike [appId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("app_id") @ExcludeMissing fun _appId(): JsonField<String> = appId

    /**
     * Returns the raw JSON value of [installationId].
     *
     * Unlike [installationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("installation_id")
    @ExcludeMissing
    fun _installationId(): JsonField<String> = installationId

    /**
     * Returns the raw JSON value of [invalidKeys].
     *
     * Unlike [invalidKeys], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invalid_keys")
    @ExcludeMissing
    fun _invalidKeys(): JsonField<List<String>> = invalidKeys

    /**
     * Returns the raw JSON value of [liveManifestVersion].
     *
     * Unlike [liveManifestVersion], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("live_manifest_version")
    @ExcludeMissing
    fun _liveManifestVersion(): JsonField<Int> = liveManifestVersion

    /**
     * Returns the raw JSON value of [manifestVersion].
     *
     * Unlike [manifestVersion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("manifest_version")
    @ExcludeMissing
    fun _manifestVersion(): JsonField<Int> = manifestVersion

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns a mutable builder for constructing an instance of
         * [AppInstallationRetrieveSettingsResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .actionNeeded()
         * .appId()
         * .installationId()
         * .invalidKeys()
         * .secrets()
         * .values()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AppInstallationRetrieveSettingsResponse]. */
    class Builder internal constructor() {

        private var actionNeeded: JsonField<Boolean>? = null
        private var appId: JsonField<String>? = null
        private var installationId: JsonField<String>? = null
        private var invalidKeys: JsonField<MutableList<String>>? = null
        private var secrets: JsonValue? = null
        private var values: JsonValue? = null
        private var liveManifestVersion: JsonField<Int> = JsonMissing.of()
        private var manifestVersion: JsonField<Int> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            appInstallationRetrieveSettingsResponse: AppInstallationRetrieveSettingsResponse
        ) = apply {
            actionNeeded = appInstallationRetrieveSettingsResponse.actionNeeded
            appId = appInstallationRetrieveSettingsResponse.appId
            installationId = appInstallationRetrieveSettingsResponse.installationId
            invalidKeys =
                appInstallationRetrieveSettingsResponse.invalidKeys.map { it.toMutableList() }
            secrets = appInstallationRetrieveSettingsResponse.secrets
            values = appInstallationRetrieveSettingsResponse.values
            liveManifestVersion = appInstallationRetrieveSettingsResponse.liveManifestVersion
            manifestVersion = appInstallationRetrieveSettingsResponse.manifestVersion
            updatedAt = appInstallationRetrieveSettingsResponse.updatedAt
            additionalProperties =
                appInstallationRetrieveSettingsResponse.additionalProperties.toMutableMap()
        }

        /** `true` when a required field has no value, or a stored value fails a live rule. */
        fun actionNeeded(actionNeeded: Boolean) = actionNeeded(JsonField.of(actionNeeded))

        /**
         * Sets [Builder.actionNeeded] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actionNeeded] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun actionNeeded(actionNeeded: JsonField<Boolean>) = apply {
            this.actionNeeded = actionNeeded
        }

        fun appId(appId: String) = appId(JsonField.of(appId))

        /**
         * Sets [Builder.appId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun appId(appId: JsonField<String>) = apply { this.appId = appId }

        fun installationId(installationId: String) = installationId(JsonField.of(installationId))

        /**
         * Sets [Builder.installationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.installationId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun installationId(installationId: JsonField<String>) = apply {
            this.installationId = installationId
        }

        /** The keys that need an action. */
        fun invalidKeys(invalidKeys: List<String>) = invalidKeys(JsonField.of(invalidKeys))

        /**
         * Sets [Builder.invalidKeys] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invalidKeys] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun invalidKeys(invalidKeys: JsonField<List<String>>) = apply {
            this.invalidKeys = invalidKeys.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [invalidKeys].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInvalidKey(invalidKey: String) = apply {
            invalidKeys =
                (invalidKeys ?: JsonField.of(mutableListOf())).also {
                    checkKnown("invalidKeys", it).add(invalidKey)
                }
        }

        /** The values of the secret fields of the live manifest, by key. */
        fun secrets(secrets: JsonValue) = apply { this.secrets = secrets }

        /** The values of the fields of the live manifest that are not secrets. */
        fun values(values: JsonValue) = apply { this.values = values }

        /**
         * The version of the live settings manifest. It is `null` when the app has no live
         * manifest. Then `values` and `secrets` are empty.
         */
        fun liveManifestVersion(liveManifestVersion: Int?) =
            liveManifestVersion(JsonField.ofNullable(liveManifestVersion))

        /**
         * Alias for [Builder.liveManifestVersion].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun liveManifestVersion(liveManifestVersion: Int) =
            liveManifestVersion(liveManifestVersion as Int?)

        /**
         * Sets [Builder.liveManifestVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.liveManifestVersion] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun liveManifestVersion(liveManifestVersion: JsonField<Int>) = apply {
            this.liveManifestVersion = liveManifestVersion
        }

        /**
         * The manifest version of the last save. It is `null` when the installation has no
         * settings.
         */
        fun manifestVersion(manifestVersion: Int?) =
            manifestVersion(JsonField.ofNullable(manifestVersion))

        /**
         * Alias for [Builder.manifestVersion].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun manifestVersion(manifestVersion: Int) = manifestVersion(manifestVersion as Int?)

        /**
         * Sets [Builder.manifestVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.manifestVersion] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun manifestVersion(manifestVersion: JsonField<Int>) = apply {
            this.manifestVersion = manifestVersion
        }

        /** The time of the last save. */
        fun updatedAt(updatedAt: OffsetDateTime?) = updatedAt(JsonField.ofNullable(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [AppInstallationRetrieveSettingsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .actionNeeded()
         * .appId()
         * .installationId()
         * .invalidKeys()
         * .secrets()
         * .values()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AppInstallationRetrieveSettingsResponse =
            AppInstallationRetrieveSettingsResponse(
                checkRequired("actionNeeded", actionNeeded),
                checkRequired("appId", appId),
                checkRequired("installationId", installationId),
                checkRequired("invalidKeys", invalidKeys).map { it.toImmutable() },
                checkRequired("secrets", secrets),
                checkRequired("values", values),
                liveManifestVersion,
                manifestVersion,
                updatedAt,
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
    fun validate(): AppInstallationRetrieveSettingsResponse = apply {
        if (validated) {
            return@apply
        }

        actionNeeded()
        appId()
        installationId()
        invalidKeys()
        liveManifestVersion()
        manifestVersion()
        updatedAt()
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
        (if (actionNeeded.asKnown() == null) 0 else 1) +
            (if (appId.asKnown() == null) 0 else 1) +
            (if (installationId.asKnown() == null) 0 else 1) +
            (invalidKeys.asKnown()?.size ?: 0) +
            (if (liveManifestVersion.asKnown() == null) 0 else 1) +
            (if (manifestVersion.asKnown() == null) 0 else 1) +
            (if (updatedAt.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AppInstallationRetrieveSettingsResponse &&
            actionNeeded == other.actionNeeded &&
            appId == other.appId &&
            installationId == other.installationId &&
            invalidKeys == other.invalidKeys &&
            secrets == other.secrets &&
            values == other.values &&
            liveManifestVersion == other.liveManifestVersion &&
            manifestVersion == other.manifestVersion &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            actionNeeded,
            appId,
            installationId,
            invalidKeys,
            secrets,
            values,
            liveManifestVersion,
            manifestVersion,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AppInstallationRetrieveSettingsResponse{actionNeeded=$actionNeeded, appId=$appId, installationId=$installationId, invalidKeys=$invalidKeys, secrets=$secrets, values=$values, liveManifestVersion=$liveManifestVersion, manifestVersion=$manifestVersion, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
