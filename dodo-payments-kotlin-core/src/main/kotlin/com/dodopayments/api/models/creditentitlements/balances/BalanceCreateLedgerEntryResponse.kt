// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.creditentitlements.balances

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** Response for creating a ledger entry */
class BalanceCreateLedgerEntryResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val amount: JsonField<String>,
    private val balanceAfter: JsonField<String>,
    private val balanceBefore: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val creditEntitlementId: JsonField<String>,
    private val customerId: JsonField<String>,
    private val entryType: JsonField<LedgerEntryType>,
    private val isCredit: JsonField<Boolean>,
    private val overageAfter: JsonField<String>,
    private val overageBefore: JsonField<String>,
    private val grantId: JsonField<String>,
    private val reason: JsonField<String>,
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
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("credit_entitlement_id")
        @ExcludeMissing
        creditEntitlementId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("entry_type")
        @ExcludeMissing
        entryType: JsonField<LedgerEntryType> = JsonMissing.of(),
        @JsonProperty("is_credit") @ExcludeMissing isCredit: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("overage_after")
        @ExcludeMissing
        overageAfter: JsonField<String> = JsonMissing.of(),
        @JsonProperty("overage_before")
        @ExcludeMissing
        overageBefore: JsonField<String> = JsonMissing.of(),
        @JsonProperty("grant_id") @ExcludeMissing grantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        amount,
        balanceAfter,
        balanceBefore,
        createdAt,
        creditEntitlementId,
        customerId,
        entryType,
        isCredit,
        overageAfter,
        overageBefore,
        grantId,
        reason,
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
    fun entryType(): LedgerEntryType = entryType.getRequired("entry_type")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isCredit(): Boolean = isCredit.getRequired("is_credit")

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
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun grantId(): String? = grantId.getNullable("grant_id")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun reason(): String? = reason.getNullable("reason")

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
     * Returns the raw JSON value of [entryType].
     *
     * Unlike [entryType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entry_type")
    @ExcludeMissing
    fun _entryType(): JsonField<LedgerEntryType> = entryType

    /**
     * Returns the raw JSON value of [isCredit].
     *
     * Unlike [isCredit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_credit") @ExcludeMissing fun _isCredit(): JsonField<Boolean> = isCredit

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
     * Returns the raw JSON value of [grantId].
     *
     * Unlike [grantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("grant_id") @ExcludeMissing fun _grantId(): JsonField<String> = grantId

    /**
     * Returns the raw JSON value of [reason].
     *
     * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

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
         * [BalanceCreateLedgerEntryResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .amount()
         * .balanceAfter()
         * .balanceBefore()
         * .createdAt()
         * .creditEntitlementId()
         * .customerId()
         * .entryType()
         * .isCredit()
         * .overageAfter()
         * .overageBefore()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BalanceCreateLedgerEntryResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var amount: JsonField<String>? = null
        private var balanceAfter: JsonField<String>? = null
        private var balanceBefore: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var creditEntitlementId: JsonField<String>? = null
        private var customerId: JsonField<String>? = null
        private var entryType: JsonField<LedgerEntryType>? = null
        private var isCredit: JsonField<Boolean>? = null
        private var overageAfter: JsonField<String>? = null
        private var overageBefore: JsonField<String>? = null
        private var grantId: JsonField<String> = JsonMissing.of()
        private var reason: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(balanceCreateLedgerEntryResponse: BalanceCreateLedgerEntryResponse) =
            apply {
                id = balanceCreateLedgerEntryResponse.id
                amount = balanceCreateLedgerEntryResponse.amount
                balanceAfter = balanceCreateLedgerEntryResponse.balanceAfter
                balanceBefore = balanceCreateLedgerEntryResponse.balanceBefore
                createdAt = balanceCreateLedgerEntryResponse.createdAt
                creditEntitlementId = balanceCreateLedgerEntryResponse.creditEntitlementId
                customerId = balanceCreateLedgerEntryResponse.customerId
                entryType = balanceCreateLedgerEntryResponse.entryType
                isCredit = balanceCreateLedgerEntryResponse.isCredit
                overageAfter = balanceCreateLedgerEntryResponse.overageAfter
                overageBefore = balanceCreateLedgerEntryResponse.overageBefore
                grantId = balanceCreateLedgerEntryResponse.grantId
                reason = balanceCreateLedgerEntryResponse.reason
                additionalProperties =
                    balanceCreateLedgerEntryResponse.additionalProperties.toMutableMap()
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

        fun entryType(entryType: LedgerEntryType) = entryType(JsonField.of(entryType))

        /**
         * Sets [Builder.entryType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entryType] with a well-typed [LedgerEntryType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun entryType(entryType: JsonField<LedgerEntryType>) = apply { this.entryType = entryType }

        fun isCredit(isCredit: Boolean) = isCredit(JsonField.of(isCredit))

        /**
         * Sets [Builder.isCredit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isCredit] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isCredit(isCredit: JsonField<Boolean>) = apply { this.isCredit = isCredit }

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

        fun grantId(grantId: String?) = grantId(JsonField.ofNullable(grantId))

        /**
         * Sets [Builder.grantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.grantId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun grantId(grantId: JsonField<String>) = apply { this.grantId = grantId }

        fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

        /**
         * Sets [Builder.reason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reason] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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
         * Returns an immutable instance of [BalanceCreateLedgerEntryResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .amount()
         * .balanceAfter()
         * .balanceBefore()
         * .createdAt()
         * .creditEntitlementId()
         * .customerId()
         * .entryType()
         * .isCredit()
         * .overageAfter()
         * .overageBefore()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BalanceCreateLedgerEntryResponse =
            BalanceCreateLedgerEntryResponse(
                checkRequired("id", id),
                checkRequired("amount", amount),
                checkRequired("balanceAfter", balanceAfter),
                checkRequired("balanceBefore", balanceBefore),
                checkRequired("createdAt", createdAt),
                checkRequired("creditEntitlementId", creditEntitlementId),
                checkRequired("customerId", customerId),
                checkRequired("entryType", entryType),
                checkRequired("isCredit", isCredit),
                checkRequired("overageAfter", overageAfter),
                checkRequired("overageBefore", overageBefore),
                grantId,
                reason,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BalanceCreateLedgerEntryResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        amount()
        balanceAfter()
        balanceBefore()
        createdAt()
        creditEntitlementId()
        customerId()
        entryType().validate()
        isCredit()
        overageAfter()
        overageBefore()
        grantId()
        reason()
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
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (creditEntitlementId.asKnown() == null) 0 else 1) +
            (if (customerId.asKnown() == null) 0 else 1) +
            (entryType.asKnown()?.validity() ?: 0) +
            (if (isCredit.asKnown() == null) 0 else 1) +
            (if (overageAfter.asKnown() == null) 0 else 1) +
            (if (overageBefore.asKnown() == null) 0 else 1) +
            (if (grantId.asKnown() == null) 0 else 1) +
            (if (reason.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BalanceCreateLedgerEntryResponse &&
            id == other.id &&
            amount == other.amount &&
            balanceAfter == other.balanceAfter &&
            balanceBefore == other.balanceBefore &&
            createdAt == other.createdAt &&
            creditEntitlementId == other.creditEntitlementId &&
            customerId == other.customerId &&
            entryType == other.entryType &&
            isCredit == other.isCredit &&
            overageAfter == other.overageAfter &&
            overageBefore == other.overageBefore &&
            grantId == other.grantId &&
            reason == other.reason &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            amount,
            balanceAfter,
            balanceBefore,
            createdAt,
            creditEntitlementId,
            customerId,
            entryType,
            isCredit,
            overageAfter,
            overageBefore,
            grantId,
            reason,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BalanceCreateLedgerEntryResponse{id=$id, amount=$amount, balanceAfter=$balanceAfter, balanceBefore=$balanceBefore, createdAt=$createdAt, creditEntitlementId=$creditEntitlementId, customerId=$customerId, entryType=$entryType, isCredit=$isCredit, overageAfter=$overageAfter, overageBefore=$overageBefore, grantId=$grantId, reason=$reason, additionalProperties=$additionalProperties}"
}
