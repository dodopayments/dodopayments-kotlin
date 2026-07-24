// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements.grants

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.entitlements.EntitlementIntegrationType
import com.dodopayments.api.models.entitlements.Feature
import com.dodopayments.api.models.misc.Metadata
import com.dodopayments.api.models.products.DigitalProductDelivery
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * Detailed view of a single entitlement grant: who it's for, its lifecycle state, and any
 * integration-specific delivery payload.
 */
class EntitlementGrant
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val brandId: JsonField<String>,
    private val businessId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val customerId: JsonField<String>,
    private val entitlementId: JsonField<String>,
    private val integrationType: JsonField<EntitlementIntegrationType>,
    private val metadata: JsonField<Metadata>,
    private val status: JsonField<Status>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val deliveredAt: JsonField<OffsetDateTime>,
    private val digitalProductDelivery: JsonField<DigitalProductDelivery>,
    private val errorCode: JsonField<String>,
    private val errorMessage: JsonField<String>,
    private val feature: JsonField<Feature>,
    private val licenseKey: JsonField<LicenseKeyGrant>,
    private val oauthExpiresAt: JsonField<OffsetDateTime>,
    private val oauthUrl: JsonField<String>,
    private val paymentId: JsonField<String>,
    private val revocationReason: JsonField<String>,
    private val revokedAt: JsonField<OffsetDateTime>,
    private val subscriptionId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("brand_id") @ExcludeMissing brandId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("business_id")
        @ExcludeMissing
        businessId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("entitlement_id")
        @ExcludeMissing
        entitlementId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("integration_type")
        @ExcludeMissing
        integrationType: JsonField<EntitlementIntegrationType> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("delivered_at")
        @ExcludeMissing
        deliveredAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("digital_product_delivery")
        @ExcludeMissing
        digitalProductDelivery: JsonField<DigitalProductDelivery> = JsonMissing.of(),
        @JsonProperty("error_code") @ExcludeMissing errorCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("error_message")
        @ExcludeMissing
        errorMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("feature") @ExcludeMissing feature: JsonField<Feature> = JsonMissing.of(),
        @JsonProperty("license_key")
        @ExcludeMissing
        licenseKey: JsonField<LicenseKeyGrant> = JsonMissing.of(),
        @JsonProperty("oauth_expires_at")
        @ExcludeMissing
        oauthExpiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("oauth_url") @ExcludeMissing oauthUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payment_id") @ExcludeMissing paymentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("revocation_reason")
        @ExcludeMissing
        revocationReason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("revoked_at")
        @ExcludeMissing
        revokedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("subscription_id")
        @ExcludeMissing
        subscriptionId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        brandId,
        businessId,
        createdAt,
        customerId,
        entitlementId,
        integrationType,
        metadata,
        status,
        updatedAt,
        deliveredAt,
        digitalProductDelivery,
        errorCode,
        errorMessage,
        feature,
        licenseKey,
        oauthExpiresAt,
        oauthUrl,
        paymentId,
        revocationReason,
        revokedAt,
        subscriptionId,
        mutableMapOf(),
    )

    /**
     * Unique identifier of the grant.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Brand id this grant belongs to.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun brandId(): String = brandId.getRequired("brand_id")

    /**
     * Identifier of the business that owns the grant.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessId(): String = businessId.getRequired("business_id")

    /**
     * Timestamp when the grant was created.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * Identifier of the customer the grant was issued to.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = customerId.getRequired("customer_id")

    /**
     * Identifier of the entitlement this grant was issued from.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entitlementId(): String = entitlementId.getRequired("entitlement_id")

    /**
     * The integration type of the grant's entitlement (e.g. `license_key`).
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun integrationType(): EntitlementIntegrationType =
        integrationType.getRequired("integration_type")

    /**
     * Arbitrary key-value metadata recorded on the grant.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * Lifecycle status of the grant.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * Timestamp when the grant was last modified.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * Timestamp when the grant transitioned to `delivered`, when applicable.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun deliveredAt(): OffsetDateTime? = deliveredAt.getNullable("delivered_at")

    /**
     * Digital-product-delivery payload, present when the entitlement integration is
     * `digital_files`.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun digitalProductDelivery(): DigitalProductDelivery? =
        digitalProductDelivery.getNullable("digital_product_delivery")

    /**
     * Machine-readable code reported when delivery failed, when applicable.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun errorCode(): String? = errorCode.getNullable("error_code")

    /**
     * Human-readable message reported when delivery failed, when applicable.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun errorMessage(): String? = errorMessage.getNullable("error_message")

    /**
     * Typed feature payload, present only when the entitlement integration is `feature_flag`;
     * `null` for every other integration type.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun feature(): Feature? = feature.getNullable("feature")

    /**
     * License-key delivery payload, present when the entitlement integration is `license_key`.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun licenseKey(): LicenseKeyGrant? = licenseKey.getNullable("license_key")

    /**
     * Timestamp when `oauth_url` stops being valid, when applicable.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun oauthExpiresAt(): OffsetDateTime? = oauthExpiresAt.getNullable("oauth_expires_at")

    /**
     * Customer-facing OAuth URL for OAuth-style integrations. Populated during the customer-portal
     * accept flow; `null` until the customer completes that step, and on grants for non-OAuth
     * integrations.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun oauthUrl(): String? = oauthUrl.getNullable("oauth_url")

    /**
     * Identifier of the payment that triggered this grant, when applicable.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun paymentId(): String? = paymentId.getNullable("payment_id")

    /**
     * Reason recorded when the grant was revoked, when applicable.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun revocationReason(): String? = revocationReason.getNullable("revocation_reason")

    /**
     * Timestamp when the grant transitioned to `revoked`, when applicable.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun revokedAt(): OffsetDateTime? = revokedAt.getNullable("revoked_at")

    /**
     * Identifier of the subscription that triggered this grant, when applicable.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun subscriptionId(): String? = subscriptionId.getNullable("subscription_id")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [brandId].
     *
     * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("brand_id") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

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
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer_id") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    /**
     * Returns the raw JSON value of [entitlementId].
     *
     * Unlike [entitlementId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entitlement_id")
    @ExcludeMissing
    fun _entitlementId(): JsonField<String> = entitlementId

    /**
     * Returns the raw JSON value of [integrationType].
     *
     * Unlike [integrationType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("integration_type")
    @ExcludeMissing
    fun _integrationType(): JsonField<EntitlementIntegrationType> = integrationType

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [deliveredAt].
     *
     * Unlike [deliveredAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("delivered_at")
    @ExcludeMissing
    fun _deliveredAt(): JsonField<OffsetDateTime> = deliveredAt

    /**
     * Returns the raw JSON value of [digitalProductDelivery].
     *
     * Unlike [digitalProductDelivery], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("digital_product_delivery")
    @ExcludeMissing
    fun _digitalProductDelivery(): JsonField<DigitalProductDelivery> = digitalProductDelivery

    /**
     * Returns the raw JSON value of [errorCode].
     *
     * Unlike [errorCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error_code") @ExcludeMissing fun _errorCode(): JsonField<String> = errorCode

    /**
     * Returns the raw JSON value of [errorMessage].
     *
     * Unlike [errorMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error_message")
    @ExcludeMissing
    fun _errorMessage(): JsonField<String> = errorMessage

    /**
     * Returns the raw JSON value of [feature].
     *
     * Unlike [feature], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("feature") @ExcludeMissing fun _feature(): JsonField<Feature> = feature

    /**
     * Returns the raw JSON value of [licenseKey].
     *
     * Unlike [licenseKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("license_key")
    @ExcludeMissing
    fun _licenseKey(): JsonField<LicenseKeyGrant> = licenseKey

    /**
     * Returns the raw JSON value of [oauthExpiresAt].
     *
     * Unlike [oauthExpiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("oauth_expires_at")
    @ExcludeMissing
    fun _oauthExpiresAt(): JsonField<OffsetDateTime> = oauthExpiresAt

    /**
     * Returns the raw JSON value of [oauthUrl].
     *
     * Unlike [oauthUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("oauth_url") @ExcludeMissing fun _oauthUrl(): JsonField<String> = oauthUrl

    /**
     * Returns the raw JSON value of [paymentId].
     *
     * Unlike [paymentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_id") @ExcludeMissing fun _paymentId(): JsonField<String> = paymentId

    /**
     * Returns the raw JSON value of [revocationReason].
     *
     * Unlike [revocationReason], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("revocation_reason")
    @ExcludeMissing
    fun _revocationReason(): JsonField<String> = revocationReason

    /**
     * Returns the raw JSON value of [revokedAt].
     *
     * Unlike [revokedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("revoked_at")
    @ExcludeMissing
    fun _revokedAt(): JsonField<OffsetDateTime> = revokedAt

    /**
     * Returns the raw JSON value of [subscriptionId].
     *
     * Unlike [subscriptionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subscription_id")
    @ExcludeMissing
    fun _subscriptionId(): JsonField<String> = subscriptionId

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
         * Returns a mutable builder for constructing an instance of [EntitlementGrant].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .brandId()
         * .businessId()
         * .createdAt()
         * .customerId()
         * .entitlementId()
         * .integrationType()
         * .metadata()
         * .status()
         * .updatedAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [EntitlementGrant]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var brandId: JsonField<String>? = null
        private var businessId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var customerId: JsonField<String>? = null
        private var entitlementId: JsonField<String>? = null
        private var integrationType: JsonField<EntitlementIntegrationType>? = null
        private var metadata: JsonField<Metadata>? = null
        private var status: JsonField<Status>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var deliveredAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var digitalProductDelivery: JsonField<DigitalProductDelivery> = JsonMissing.of()
        private var errorCode: JsonField<String> = JsonMissing.of()
        private var errorMessage: JsonField<String> = JsonMissing.of()
        private var feature: JsonField<Feature> = JsonMissing.of()
        private var licenseKey: JsonField<LicenseKeyGrant> = JsonMissing.of()
        private var oauthExpiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var oauthUrl: JsonField<String> = JsonMissing.of()
        private var paymentId: JsonField<String> = JsonMissing.of()
        private var revocationReason: JsonField<String> = JsonMissing.of()
        private var revokedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var subscriptionId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(entitlementGrant: EntitlementGrant) = apply {
            id = entitlementGrant.id
            brandId = entitlementGrant.brandId
            businessId = entitlementGrant.businessId
            createdAt = entitlementGrant.createdAt
            customerId = entitlementGrant.customerId
            entitlementId = entitlementGrant.entitlementId
            integrationType = entitlementGrant.integrationType
            metadata = entitlementGrant.metadata
            status = entitlementGrant.status
            updatedAt = entitlementGrant.updatedAt
            deliveredAt = entitlementGrant.deliveredAt
            digitalProductDelivery = entitlementGrant.digitalProductDelivery
            errorCode = entitlementGrant.errorCode
            errorMessage = entitlementGrant.errorMessage
            feature = entitlementGrant.feature
            licenseKey = entitlementGrant.licenseKey
            oauthExpiresAt = entitlementGrant.oauthExpiresAt
            oauthUrl = entitlementGrant.oauthUrl
            paymentId = entitlementGrant.paymentId
            revocationReason = entitlementGrant.revocationReason
            revokedAt = entitlementGrant.revokedAt
            subscriptionId = entitlementGrant.subscriptionId
            additionalProperties = entitlementGrant.additionalProperties.toMutableMap()
        }

        /** Unique identifier of the grant. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Brand id this grant belongs to. */
        fun brandId(brandId: String) = brandId(JsonField.of(brandId))

        /**
         * Sets [Builder.brandId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brandId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

        /** Identifier of the business that owns the grant. */
        fun businessId(businessId: String) = businessId(JsonField.of(businessId))

        /**
         * Sets [Builder.businessId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun businessId(businessId: JsonField<String>) = apply { this.businessId = businessId }

        /** Timestamp when the grant was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Identifier of the customer the grant was issued to. */
        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        /** Identifier of the entitlement this grant was issued from. */
        fun entitlementId(entitlementId: String) = entitlementId(JsonField.of(entitlementId))

        /**
         * Sets [Builder.entitlementId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entitlementId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun entitlementId(entitlementId: JsonField<String>) = apply {
            this.entitlementId = entitlementId
        }

        /** The integration type of the grant's entitlement (e.g. `license_key`). */
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

        /** Arbitrary key-value metadata recorded on the grant. */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** Lifecycle status of the grant. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Timestamp when the grant was last modified. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** Timestamp when the grant transitioned to `delivered`, when applicable. */
        fun deliveredAt(deliveredAt: OffsetDateTime?) =
            deliveredAt(JsonField.ofNullable(deliveredAt))

        /**
         * Sets [Builder.deliveredAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deliveredAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun deliveredAt(deliveredAt: JsonField<OffsetDateTime>) = apply {
            this.deliveredAt = deliveredAt
        }

        /**
         * Digital-product-delivery payload, present when the entitlement integration is
         * `digital_files`.
         */
        fun digitalProductDelivery(digitalProductDelivery: DigitalProductDelivery?) =
            digitalProductDelivery(JsonField.ofNullable(digitalProductDelivery))

        /**
         * Sets [Builder.digitalProductDelivery] to an arbitrary JSON value.
         *
         * You should usually call [Builder.digitalProductDelivery] with a well-typed
         * [DigitalProductDelivery] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun digitalProductDelivery(digitalProductDelivery: JsonField<DigitalProductDelivery>) =
            apply {
                this.digitalProductDelivery = digitalProductDelivery
            }

        /** Machine-readable code reported when delivery failed, when applicable. */
        fun errorCode(errorCode: String?) = errorCode(JsonField.ofNullable(errorCode))

        /**
         * Sets [Builder.errorCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errorCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errorCode(errorCode: JsonField<String>) = apply { this.errorCode = errorCode }

        /** Human-readable message reported when delivery failed, when applicable. */
        fun errorMessage(errorMessage: String?) = errorMessage(JsonField.ofNullable(errorMessage))

        /**
         * Sets [Builder.errorMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errorMessage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errorMessage(errorMessage: JsonField<String>) = apply {
            this.errorMessage = errorMessage
        }

        /**
         * Typed feature payload, present only when the entitlement integration is `feature_flag`;
         * `null` for every other integration type.
         */
        fun feature(feature: Feature?) = feature(JsonField.ofNullable(feature))

        /**
         * Sets [Builder.feature] to an arbitrary JSON value.
         *
         * You should usually call [Builder.feature] with a well-typed [Feature] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun feature(feature: JsonField<Feature>) = apply { this.feature = feature }

        /**
         * License-key delivery payload, present when the entitlement integration is `license_key`.
         */
        fun licenseKey(licenseKey: LicenseKeyGrant?) = licenseKey(JsonField.ofNullable(licenseKey))

        /**
         * Sets [Builder.licenseKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.licenseKey] with a well-typed [LicenseKeyGrant] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun licenseKey(licenseKey: JsonField<LicenseKeyGrant>) = apply {
            this.licenseKey = licenseKey
        }

        /** Timestamp when `oauth_url` stops being valid, when applicable. */
        fun oauthExpiresAt(oauthExpiresAt: OffsetDateTime?) =
            oauthExpiresAt(JsonField.ofNullable(oauthExpiresAt))

        /**
         * Sets [Builder.oauthExpiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.oauthExpiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun oauthExpiresAt(oauthExpiresAt: JsonField<OffsetDateTime>) = apply {
            this.oauthExpiresAt = oauthExpiresAt
        }

        /**
         * Customer-facing OAuth URL for OAuth-style integrations. Populated during the
         * customer-portal accept flow; `null` until the customer completes that step, and on grants
         * for non-OAuth integrations.
         */
        fun oauthUrl(oauthUrl: String?) = oauthUrl(JsonField.ofNullable(oauthUrl))

        /**
         * Sets [Builder.oauthUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.oauthUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun oauthUrl(oauthUrl: JsonField<String>) = apply { this.oauthUrl = oauthUrl }

        /** Identifier of the payment that triggered this grant, when applicable. */
        fun paymentId(paymentId: String?) = paymentId(JsonField.ofNullable(paymentId))

        /**
         * Sets [Builder.paymentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun paymentId(paymentId: JsonField<String>) = apply { this.paymentId = paymentId }

        /** Reason recorded when the grant was revoked, when applicable. */
        fun revocationReason(revocationReason: String?) =
            revocationReason(JsonField.ofNullable(revocationReason))

        /**
         * Sets [Builder.revocationReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.revocationReason] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun revocationReason(revocationReason: JsonField<String>) = apply {
            this.revocationReason = revocationReason
        }

        /** Timestamp when the grant transitioned to `revoked`, when applicable. */
        fun revokedAt(revokedAt: OffsetDateTime?) = revokedAt(JsonField.ofNullable(revokedAt))

        /**
         * Sets [Builder.revokedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.revokedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun revokedAt(revokedAt: JsonField<OffsetDateTime>) = apply { this.revokedAt = revokedAt }

        /** Identifier of the subscription that triggered this grant, when applicable. */
        fun subscriptionId(subscriptionId: String?) =
            subscriptionId(JsonField.ofNullable(subscriptionId))

        /**
         * Sets [Builder.subscriptionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscriptionId(subscriptionId: JsonField<String>) = apply {
            this.subscriptionId = subscriptionId
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
         * Returns an immutable instance of [EntitlementGrant].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .brandId()
         * .businessId()
         * .createdAt()
         * .customerId()
         * .entitlementId()
         * .integrationType()
         * .metadata()
         * .status()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EntitlementGrant =
            EntitlementGrant(
                checkRequired("id", id),
                checkRequired("brandId", brandId),
                checkRequired("businessId", businessId),
                checkRequired("createdAt", createdAt),
                checkRequired("customerId", customerId),
                checkRequired("entitlementId", entitlementId),
                checkRequired("integrationType", integrationType),
                checkRequired("metadata", metadata),
                checkRequired("status", status),
                checkRequired("updatedAt", updatedAt),
                deliveredAt,
                digitalProductDelivery,
                errorCode,
                errorMessage,
                feature,
                licenseKey,
                oauthExpiresAt,
                oauthUrl,
                paymentId,
                revocationReason,
                revokedAt,
                subscriptionId,
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
    fun validate(): EntitlementGrant = apply {
        if (validated) {
            return@apply
        }

        id()
        brandId()
        businessId()
        createdAt()
        customerId()
        entitlementId()
        integrationType().validate()
        metadata().validate()
        status().validate()
        updatedAt()
        deliveredAt()
        digitalProductDelivery()?.validate()
        errorCode()
        errorMessage()
        feature()?.validate()
        licenseKey()?.validate()
        oauthExpiresAt()
        oauthUrl()
        paymentId()
        revocationReason()
        revokedAt()
        subscriptionId()
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
            (if (brandId.asKnown() == null) 0 else 1) +
            (if (businessId.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (customerId.asKnown() == null) 0 else 1) +
            (if (entitlementId.asKnown() == null) 0 else 1) +
            (integrationType.asKnown()?.validity() ?: 0) +
            (metadata.asKnown()?.validity() ?: 0) +
            (status.asKnown()?.validity() ?: 0) +
            (if (updatedAt.asKnown() == null) 0 else 1) +
            (if (deliveredAt.asKnown() == null) 0 else 1) +
            (digitalProductDelivery.asKnown()?.validity() ?: 0) +
            (if (errorCode.asKnown() == null) 0 else 1) +
            (if (errorMessage.asKnown() == null) 0 else 1) +
            (feature.asKnown()?.validity() ?: 0) +
            (licenseKey.asKnown()?.validity() ?: 0) +
            (if (oauthExpiresAt.asKnown() == null) 0 else 1) +
            (if (oauthUrl.asKnown() == null) 0 else 1) +
            (if (paymentId.asKnown() == null) 0 else 1) +
            (if (revocationReason.asKnown() == null) 0 else 1) +
            (if (revokedAt.asKnown() == null) 0 else 1) +
            (if (subscriptionId.asKnown() == null) 0 else 1)

    /** Lifecycle status of the grant. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val PENDING = of("Pending")

            val DELIVERED = of("Delivered")

            val FAILED = of("Failed")

            val REVOKED = of("Revoked")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            DELIVERED,
            FAILED,
            REVOKED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         *
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         *
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            DELIVERED,
            FAILED,
            REVOKED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                DELIVERED -> Value.DELIVERED
                FAILED -> Value.FAILED
                REVOKED -> Value.REVOKED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws DodoPaymentsInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                DELIVERED -> Known.DELIVERED
                FAILED -> Known.FAILED
                REVOKED -> Known.REVOKED
                else -> throw DodoPaymentsInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws DodoPaymentsInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw DodoPaymentsInvalidDataException("Value is not a String")

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
        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EntitlementGrant &&
            id == other.id &&
            brandId == other.brandId &&
            businessId == other.businessId &&
            createdAt == other.createdAt &&
            customerId == other.customerId &&
            entitlementId == other.entitlementId &&
            integrationType == other.integrationType &&
            metadata == other.metadata &&
            status == other.status &&
            updatedAt == other.updatedAt &&
            deliveredAt == other.deliveredAt &&
            digitalProductDelivery == other.digitalProductDelivery &&
            errorCode == other.errorCode &&
            errorMessage == other.errorMessage &&
            feature == other.feature &&
            licenseKey == other.licenseKey &&
            oauthExpiresAt == other.oauthExpiresAt &&
            oauthUrl == other.oauthUrl &&
            paymentId == other.paymentId &&
            revocationReason == other.revocationReason &&
            revokedAt == other.revokedAt &&
            subscriptionId == other.subscriptionId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            brandId,
            businessId,
            createdAt,
            customerId,
            entitlementId,
            integrationType,
            metadata,
            status,
            updatedAt,
            deliveredAt,
            digitalProductDelivery,
            errorCode,
            errorMessage,
            feature,
            licenseKey,
            oauthExpiresAt,
            oauthUrl,
            paymentId,
            revocationReason,
            revokedAt,
            subscriptionId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EntitlementGrant{id=$id, brandId=$brandId, businessId=$businessId, createdAt=$createdAt, customerId=$customerId, entitlementId=$entitlementId, integrationType=$integrationType, metadata=$metadata, status=$status, updatedAt=$updatedAt, deliveredAt=$deliveredAt, digitalProductDelivery=$digitalProductDelivery, errorCode=$errorCode, errorMessage=$errorMessage, feature=$feature, licenseKey=$licenseKey, oauthExpiresAt=$oauthExpiresAt, oauthUrl=$oauthUrl, paymentId=$paymentId, revocationReason=$revocationReason, revokedAt=$revokedAt, subscriptionId=$subscriptionId, additionalProperties=$additionalProperties}"
}
