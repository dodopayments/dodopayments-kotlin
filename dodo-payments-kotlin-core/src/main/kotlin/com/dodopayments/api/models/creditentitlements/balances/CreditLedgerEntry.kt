// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.creditentitlements.balances

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.misc.Metadata
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** Response for a ledger entry */
class CreditLedgerEntry
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val amount: JsonField<String>,
    private val balanceAfter: JsonField<String>,
    private val balanceBefore: JsonField<String>,
    private val brandId: JsonField<String>,
    private val businessId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val creditEntitlementId: JsonField<String>,
    private val customerId: JsonField<String>,
    private val isCredit: JsonField<Boolean>,
    private val metadata: JsonField<Metadata>,
    private val overageAfter: JsonField<String>,
    private val overageBefore: JsonField<String>,
    private val transactionType: JsonField<TransactionType>,
    private val description: JsonField<String>,
    private val grantId: JsonField<String>,
    private val referenceId: JsonField<String>,
    private val referenceType: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("balance_after")
        @ExcludeMissing
        balanceAfter: JsonField<String> = JsonMissing.of(),
        @JsonProperty("balance_before")
        @ExcludeMissing
        balanceBefore: JsonField<String> = JsonMissing.of(),
        @JsonProperty("brand_id") @ExcludeMissing brandId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("business_id")
        @ExcludeMissing
        businessId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("credit_entitlement_id")
        @ExcludeMissing
        creditEntitlementId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_credit") @ExcludeMissing isCredit: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("overage_after")
        @ExcludeMissing
        overageAfter: JsonField<String> = JsonMissing.of(),
        @JsonProperty("overage_before")
        @ExcludeMissing
        overageBefore: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transaction_type")
        @ExcludeMissing
        transactionType: JsonField<TransactionType> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("grant_id") @ExcludeMissing grantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reference_id")
        @ExcludeMissing
        referenceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reference_type")
        @ExcludeMissing
        referenceType: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        amount,
        balanceAfter,
        balanceBefore,
        brandId,
        businessId,
        createdAt,
        creditEntitlementId,
        customerId,
        isCredit,
        metadata,
        overageAfter,
        overageBefore,
        transactionType,
        description,
        grantId,
        referenceId,
        referenceType,
        mutableMapOf(),
    )

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): String = amount.getRequired("amount")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun balanceAfter(): String = balanceAfter.getRequired("balance_after")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun balanceBefore(): String = balanceBefore.getRequired("balance_before")

    /**
     * Brand id this credit ledger entry belongs to
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun brandId(): String = brandId.getRequired("brand_id")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessId(): String = businessId.getRequired("business_id")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditEntitlementId(): String = creditEntitlementId.getRequired("credit_entitlement_id")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = customerId.getRequired("customer_id")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isCredit(): Boolean = isCredit.getRequired("is_credit")

    /**
     * Metadata associated with the credit grant's source (the subscription or payment created at
     * checkout). Empty when the grant has no resolvable source (e.g. credits granted directly via
     * the API).
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun overageAfter(): String = overageAfter.getRequired("overage_after")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun overageBefore(): String = overageBefore.getRequired("overage_before")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun transactionType(): TransactionType = transactionType.getRequired("transaction_type")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): String? = description.getNullable("description")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun grantId(): String? = grantId.getNullable("grant_id")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun referenceId(): String? = referenceId.getNullable("reference_id")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun referenceType(): String? = referenceType.getNullable("reference_type")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

    /**
     * Returns the raw JSON value of [balanceAfter].
     *
     * Unlike [balanceAfter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("balance_after")
    @ExcludeMissing
    fun _balanceAfter(): JsonField<String> = balanceAfter

    /**
     * Returns the raw JSON value of [balanceBefore].
     *
     * Unlike [balanceBefore], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("balance_before")
    @ExcludeMissing
    fun _balanceBefore(): JsonField<String> = balanceBefore

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
     * Returns the raw JSON value of [creditEntitlementId].
     *
     * Unlike [creditEntitlementId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("credit_entitlement_id")
    @ExcludeMissing
    fun _creditEntitlementId(): JsonField<String> = creditEntitlementId

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer_id") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    /**
     * Returns the raw JSON value of [isCredit].
     *
     * Unlike [isCredit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_credit") @ExcludeMissing fun _isCredit(): JsonField<Boolean> = isCredit

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [overageAfter].
     *
     * Unlike [overageAfter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("overage_after")
    @ExcludeMissing
    fun _overageAfter(): JsonField<String> = overageAfter

    /**
     * Returns the raw JSON value of [overageBefore].
     *
     * Unlike [overageBefore], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("overage_before")
    @ExcludeMissing
    fun _overageBefore(): JsonField<String> = overageBefore

    /**
     * Returns the raw JSON value of [transactionType].
     *
     * Unlike [transactionType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transaction_type")
    @ExcludeMissing
    fun _transactionType(): JsonField<TransactionType> = transactionType

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [grantId].
     *
     * Unlike [grantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("grant_id") @ExcludeMissing fun _grantId(): JsonField<String> = grantId

    /**
     * Returns the raw JSON value of [referenceId].
     *
     * Unlike [referenceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reference_id")
    @ExcludeMissing
    fun _referenceId(): JsonField<String> = referenceId

    /**
     * Returns the raw JSON value of [referenceType].
     *
     * Unlike [referenceType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reference_type")
    @ExcludeMissing
    fun _referenceType(): JsonField<String> = referenceType

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
         * Returns a mutable builder for constructing an instance of [CreditLedgerEntry].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .amount()
         * .balanceAfter()
         * .balanceBefore()
         * .brandId()
         * .businessId()
         * .createdAt()
         * .creditEntitlementId()
         * .customerId()
         * .isCredit()
         * .metadata()
         * .overageAfter()
         * .overageBefore()
         * .transactionType()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CreditLedgerEntry]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var amount: JsonField<String>? = null
        private var balanceAfter: JsonField<String>? = null
        private var balanceBefore: JsonField<String>? = null
        private var brandId: JsonField<String>? = null
        private var businessId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var creditEntitlementId: JsonField<String>? = null
        private var customerId: JsonField<String>? = null
        private var isCredit: JsonField<Boolean>? = null
        private var metadata: JsonField<Metadata>? = null
        private var overageAfter: JsonField<String>? = null
        private var overageBefore: JsonField<String>? = null
        private var transactionType: JsonField<TransactionType>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var grantId: JsonField<String> = JsonMissing.of()
        private var referenceId: JsonField<String> = JsonMissing.of()
        private var referenceType: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(creditLedgerEntry: CreditLedgerEntry) = apply {
            id = creditLedgerEntry.id
            amount = creditLedgerEntry.amount
            balanceAfter = creditLedgerEntry.balanceAfter
            balanceBefore = creditLedgerEntry.balanceBefore
            brandId = creditLedgerEntry.brandId
            businessId = creditLedgerEntry.businessId
            createdAt = creditLedgerEntry.createdAt
            creditEntitlementId = creditLedgerEntry.creditEntitlementId
            customerId = creditLedgerEntry.customerId
            isCredit = creditLedgerEntry.isCredit
            metadata = creditLedgerEntry.metadata
            overageAfter = creditLedgerEntry.overageAfter
            overageBefore = creditLedgerEntry.overageBefore
            transactionType = creditLedgerEntry.transactionType
            description = creditLedgerEntry.description
            grantId = creditLedgerEntry.grantId
            referenceId = creditLedgerEntry.referenceId
            referenceType = creditLedgerEntry.referenceType
            additionalProperties = creditLedgerEntry.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun amount(amount: String) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<String>) = apply { this.amount = amount }

        fun balanceAfter(balanceAfter: String) = balanceAfter(JsonField.of(balanceAfter))

        /**
         * Sets [Builder.balanceAfter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.balanceAfter] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun balanceAfter(balanceAfter: JsonField<String>) = apply {
            this.balanceAfter = balanceAfter
        }

        fun balanceBefore(balanceBefore: String) = balanceBefore(JsonField.of(balanceBefore))

        /**
         * Sets [Builder.balanceBefore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.balanceBefore] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun balanceBefore(balanceBefore: JsonField<String>) = apply {
            this.balanceBefore = balanceBefore
        }

        /** Brand id this credit ledger entry belongs to */
        fun brandId(brandId: String) = brandId(JsonField.of(brandId))

        /**
         * Sets [Builder.brandId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brandId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

        fun businessId(businessId: String) = businessId(JsonField.of(businessId))

        /**
         * Sets [Builder.businessId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun businessId(businessId: JsonField<String>) = apply { this.businessId = businessId }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun creditEntitlementId(creditEntitlementId: String) =
            creditEntitlementId(JsonField.of(creditEntitlementId))

        /**
         * Sets [Builder.creditEntitlementId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditEntitlementId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditEntitlementId(creditEntitlementId: JsonField<String>) = apply {
            this.creditEntitlementId = creditEntitlementId
        }

        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        fun isCredit(isCredit: Boolean) = isCredit(JsonField.of(isCredit))

        /**
         * Sets [Builder.isCredit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isCredit] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isCredit(isCredit: JsonField<Boolean>) = apply { this.isCredit = isCredit }

        /**
         * Metadata associated with the credit grant's source (the subscription or payment created
         * at checkout). Empty when the grant has no resolvable source (e.g. credits granted
         * directly via the API).
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun overageAfter(overageAfter: String) = overageAfter(JsonField.of(overageAfter))

        /**
         * Sets [Builder.overageAfter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overageAfter] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun overageAfter(overageAfter: JsonField<String>) = apply {
            this.overageAfter = overageAfter
        }

        fun overageBefore(overageBefore: String) = overageBefore(JsonField.of(overageBefore))

        /**
         * Sets [Builder.overageBefore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overageBefore] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun overageBefore(overageBefore: JsonField<String>) = apply {
            this.overageBefore = overageBefore
        }

        fun transactionType(transactionType: TransactionType) =
            transactionType(JsonField.of(transactionType))

        /**
         * Sets [Builder.transactionType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionType] with a well-typed [TransactionType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun transactionType(transactionType: JsonField<TransactionType>) = apply {
            this.transactionType = transactionType
        }

        fun description(description: String?) = description(JsonField.ofNullable(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun grantId(grantId: String?) = grantId(JsonField.ofNullable(grantId))

        /**
         * Sets [Builder.grantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.grantId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun grantId(grantId: JsonField<String>) = apply { this.grantId = grantId }

        fun referenceId(referenceId: String?) = referenceId(JsonField.ofNullable(referenceId))

        /**
         * Sets [Builder.referenceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referenceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun referenceId(referenceId: JsonField<String>) = apply { this.referenceId = referenceId }

        fun referenceType(referenceType: String?) =
            referenceType(JsonField.ofNullable(referenceType))

        /**
         * Sets [Builder.referenceType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referenceType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun referenceType(referenceType: JsonField<String>) = apply {
            this.referenceType = referenceType
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
         * Returns an immutable instance of [CreditLedgerEntry].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .amount()
         * .balanceAfter()
         * .balanceBefore()
         * .brandId()
         * .businessId()
         * .createdAt()
         * .creditEntitlementId()
         * .customerId()
         * .isCredit()
         * .metadata()
         * .overageAfter()
         * .overageBefore()
         * .transactionType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CreditLedgerEntry =
            CreditLedgerEntry(
                checkRequired("id", id),
                checkRequired("amount", amount),
                checkRequired("balanceAfter", balanceAfter),
                checkRequired("balanceBefore", balanceBefore),
                checkRequired("brandId", brandId),
                checkRequired("businessId", businessId),
                checkRequired("createdAt", createdAt),
                checkRequired("creditEntitlementId", creditEntitlementId),
                checkRequired("customerId", customerId),
                checkRequired("isCredit", isCredit),
                checkRequired("metadata", metadata),
                checkRequired("overageAfter", overageAfter),
                checkRequired("overageBefore", overageBefore),
                checkRequired("transactionType", transactionType),
                description,
                grantId,
                referenceId,
                referenceType,
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
    fun validate(): CreditLedgerEntry = apply {
        if (validated) {
            return@apply
        }

        id()
        amount()
        balanceAfter()
        balanceBefore()
        brandId()
        businessId()
        createdAt()
        creditEntitlementId()
        customerId()
        isCredit()
        metadata().validate()
        overageAfter()
        overageBefore()
        transactionType().validate()
        description()
        grantId()
        referenceId()
        referenceType()
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
            (if (amount.asKnown() == null) 0 else 1) +
            (if (balanceAfter.asKnown() == null) 0 else 1) +
            (if (balanceBefore.asKnown() == null) 0 else 1) +
            (if (brandId.asKnown() == null) 0 else 1) +
            (if (businessId.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (creditEntitlementId.asKnown() == null) 0 else 1) +
            (if (customerId.asKnown() == null) 0 else 1) +
            (if (isCredit.asKnown() == null) 0 else 1) +
            (metadata.asKnown()?.validity() ?: 0) +
            (if (overageAfter.asKnown() == null) 0 else 1) +
            (if (overageBefore.asKnown() == null) 0 else 1) +
            (transactionType.asKnown()?.validity() ?: 0) +
            (if (description.asKnown() == null) 0 else 1) +
            (if (grantId.asKnown() == null) 0 else 1) +
            (if (referenceId.asKnown() == null) 0 else 1) +
            (if (referenceType.asKnown() == null) 0 else 1)

    class TransactionType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            val CREDIT_ADDED = of("credit_added")

            val CREDIT_DEDUCTED = of("credit_deducted")

            val CREDIT_EXPIRED = of("credit_expired")

            val CREDIT_ROLLED_OVER = of("credit_rolled_over")

            val ROLLOVER_FORFEITED = of("rollover_forfeited")

            val OVERAGE_CHARGED = of("overage_charged")

            val OVERAGE_RESET = of("overage_reset")

            val AUTO_TOP_UP = of("auto_top_up")

            val MANUAL_ADJUSTMENT = of("manual_adjustment")

            val REFUND = of("refund")

            fun of(value: String) = TransactionType(JsonField.of(value))
        }

        /** An enum containing [TransactionType]'s known values. */
        enum class Known {
            CREDIT_ADDED,
            CREDIT_DEDUCTED,
            CREDIT_EXPIRED,
            CREDIT_ROLLED_OVER,
            ROLLOVER_FORFEITED,
            OVERAGE_CHARGED,
            OVERAGE_RESET,
            AUTO_TOP_UP,
            MANUAL_ADJUSTMENT,
            REFUND,
        }

        /**
         * An enum containing [TransactionType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TransactionType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CREDIT_ADDED,
            CREDIT_DEDUCTED,
            CREDIT_EXPIRED,
            CREDIT_ROLLED_OVER,
            ROLLOVER_FORFEITED,
            OVERAGE_CHARGED,
            OVERAGE_RESET,
            AUTO_TOP_UP,
            MANUAL_ADJUSTMENT,
            REFUND,
            /**
             * An enum member indicating that [TransactionType] was instantiated with an unknown
             * value.
             */
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
                CREDIT_ADDED -> Value.CREDIT_ADDED
                CREDIT_DEDUCTED -> Value.CREDIT_DEDUCTED
                CREDIT_EXPIRED -> Value.CREDIT_EXPIRED
                CREDIT_ROLLED_OVER -> Value.CREDIT_ROLLED_OVER
                ROLLOVER_FORFEITED -> Value.ROLLOVER_FORFEITED
                OVERAGE_CHARGED -> Value.OVERAGE_CHARGED
                OVERAGE_RESET -> Value.OVERAGE_RESET
                AUTO_TOP_UP -> Value.AUTO_TOP_UP
                MANUAL_ADJUSTMENT -> Value.MANUAL_ADJUSTMENT
                REFUND -> Value.REFUND
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
                CREDIT_ADDED -> Known.CREDIT_ADDED
                CREDIT_DEDUCTED -> Known.CREDIT_DEDUCTED
                CREDIT_EXPIRED -> Known.CREDIT_EXPIRED
                CREDIT_ROLLED_OVER -> Known.CREDIT_ROLLED_OVER
                ROLLOVER_FORFEITED -> Known.ROLLOVER_FORFEITED
                OVERAGE_CHARGED -> Known.OVERAGE_CHARGED
                OVERAGE_RESET -> Known.OVERAGE_RESET
                AUTO_TOP_UP -> Known.AUTO_TOP_UP
                MANUAL_ADJUSTMENT -> Known.MANUAL_ADJUSTMENT
                REFUND -> Known.REFUND
                else -> throw DodoPaymentsInvalidDataException("Unknown TransactionType: $value")
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
        fun validate(): TransactionType = apply {
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

            return other is TransactionType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreditLedgerEntry &&
            id == other.id &&
            amount == other.amount &&
            balanceAfter == other.balanceAfter &&
            balanceBefore == other.balanceBefore &&
            brandId == other.brandId &&
            businessId == other.businessId &&
            createdAt == other.createdAt &&
            creditEntitlementId == other.creditEntitlementId &&
            customerId == other.customerId &&
            isCredit == other.isCredit &&
            metadata == other.metadata &&
            overageAfter == other.overageAfter &&
            overageBefore == other.overageBefore &&
            transactionType == other.transactionType &&
            description == other.description &&
            grantId == other.grantId &&
            referenceId == other.referenceId &&
            referenceType == other.referenceType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            amount,
            balanceAfter,
            balanceBefore,
            brandId,
            businessId,
            createdAt,
            creditEntitlementId,
            customerId,
            isCredit,
            metadata,
            overageAfter,
            overageBefore,
            transactionType,
            description,
            grantId,
            referenceId,
            referenceType,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreditLedgerEntry{id=$id, amount=$amount, balanceAfter=$balanceAfter, balanceBefore=$balanceBefore, brandId=$brandId, businessId=$businessId, createdAt=$createdAt, creditEntitlementId=$creditEntitlementId, customerId=$customerId, isCredit=$isCredit, metadata=$metadata, overageAfter=$overageAfter, overageBefore=$overageBefore, transactionType=$transactionType, description=$description, grantId=$grantId, referenceId=$referenceId, referenceType=$referenceType, additionalProperties=$additionalProperties}"
}
