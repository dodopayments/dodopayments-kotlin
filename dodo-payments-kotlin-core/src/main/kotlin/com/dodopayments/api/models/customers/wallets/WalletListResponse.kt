// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers.wallets

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
import java.util.Collections
import java.util.Objects

class WalletListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val items: JsonField<List<CustomerWallet>>,
    private val totalBalanceUsd: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("items")
        @ExcludeMissing
        items: JsonField<List<CustomerWallet>> = JsonMissing.of(),
        @JsonProperty("total_balance_usd")
        @ExcludeMissing
        totalBalanceUsd: JsonField<Long> = JsonMissing.of(),
    ) : this(items, totalBalanceUsd, mutableMapOf())

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun items(): List<CustomerWallet> = items.getRequired("items")

    /**
     * Sum of all wallet balances converted to USD (in smallest unit)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalBalanceUsd(): Long = totalBalanceUsd.getRequired("total_balance_usd")

    /**
     * Returns the raw JSON value of [items].
     *
     * Unlike [items], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<List<CustomerWallet>> = items

    /**
     * Returns the raw JSON value of [totalBalanceUsd].
     *
     * Unlike [totalBalanceUsd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_balance_usd")
    @ExcludeMissing
    fun _totalBalanceUsd(): JsonField<Long> = totalBalanceUsd

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
         * Returns a mutable builder for constructing an instance of [WalletListResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .items()
         * .totalBalanceUsd()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [WalletListResponse]. */
    class Builder internal constructor() {

        private var items: JsonField<MutableList<CustomerWallet>>? = null
        private var totalBalanceUsd: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(walletListResponse: WalletListResponse) = apply {
            items = walletListResponse.items.map { it.toMutableList() }
            totalBalanceUsd = walletListResponse.totalBalanceUsd
            additionalProperties = walletListResponse.additionalProperties.toMutableMap()
        }

        fun items(items: List<CustomerWallet>) = items(JsonField.of(items))

        /**
         * Sets [Builder.items] to an arbitrary JSON value.
         *
         * You should usually call [Builder.items] with a well-typed `List<CustomerWallet>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun items(items: JsonField<List<CustomerWallet>>) = apply {
            this.items = items.map { it.toMutableList() }
        }

        /**
         * Adds a single [CustomerWallet] to [items].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addItem(item: CustomerWallet) = apply {
            items =
                (items ?: JsonField.of(mutableListOf())).also { checkKnown("items", it).add(item) }
        }

        /** Sum of all wallet balances converted to USD (in smallest unit) */
        fun totalBalanceUsd(totalBalanceUsd: Long) = totalBalanceUsd(JsonField.of(totalBalanceUsd))

        /**
         * Sets [Builder.totalBalanceUsd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalBalanceUsd] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalBalanceUsd(totalBalanceUsd: JsonField<Long>) = apply {
            this.totalBalanceUsd = totalBalanceUsd
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
         * Returns an immutable instance of [WalletListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .items()
         * .totalBalanceUsd()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WalletListResponse =
            WalletListResponse(
                checkRequired("items", items).map { it.toImmutable() },
                checkRequired("totalBalanceUsd", totalBalanceUsd),
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
    fun validate(): WalletListResponse = apply {
        if (validated) {
            return@apply
        }

        items().forEach { it.validate() }
        totalBalanceUsd()
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
        (items.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (totalBalanceUsd.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WalletListResponse &&
            items == other.items &&
            totalBalanceUsd == other.totalBalanceUsd &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(items, totalBalanceUsd, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WalletListResponse{items=$items, totalBalanceUsd=$totalBalanceUsd, additionalProperties=$additionalProperties}"
}
