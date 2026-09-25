// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payouts.breakup.details

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

/** Paginated response containing individual payout breakup entries. */
class DetailListPageResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val items: JsonField<List<DetailListResponse>>,
    private val unattributed: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("items")
        @ExcludeMissing
        items: JsonField<List<DetailListResponse>> = JsonMissing.of(),
        @JsonProperty("unattributed")
        @ExcludeMissing
        unattributed: JsonField<Long> = JsonMissing.of(),
    ) : this(items, unattributed, mutableMapOf())

    /**
     * List of payout breakup detail entries.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun items(): List<DetailListResponse> = items.getRequired("items")

    /**
     * The payout amount less every entry, in the payout's currency and its smallest unit.
     *
     * The entries alone do not sum to the payout. This field holds the difference, so the entries
     * and this field together reconcile against the payout. It takes either sign; see
     * `PayoutBreakupV3Row` for what each sign means. The value covers the whole payout, not the
     * page.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun unattributed(): Long = unattributed.getRequired("unattributed")

    /**
     * Returns the raw JSON value of [items].
     *
     * Unlike [items], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<List<DetailListResponse>> = items

    /**
     * Returns the raw JSON value of [unattributed].
     *
     * Unlike [unattributed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("unattributed")
    @ExcludeMissing
    fun _unattributed(): JsonField<Long> = unattributed

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
         * Returns a mutable builder for constructing an instance of [DetailListPageResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .items()
         * .unattributed()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [DetailListPageResponse]. */
    class Builder internal constructor() {

        private var items: JsonField<MutableList<DetailListResponse>>? = null
        private var unattributed: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(detailListPageResponse: DetailListPageResponse) = apply {
            items = detailListPageResponse.items.map { it.toMutableList() }
            unattributed = detailListPageResponse.unattributed
            additionalProperties = detailListPageResponse.additionalProperties.toMutableMap()
        }

        /** List of payout breakup detail entries. */
        fun items(items: List<DetailListResponse>) = items(JsonField.of(items))

        /**
         * Sets [Builder.items] to an arbitrary JSON value.
         *
         * You should usually call [Builder.items] with a well-typed `List<DetailListResponse>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun items(items: JsonField<List<DetailListResponse>>) = apply {
            this.items = items.map { it.toMutableList() }
        }

        /**
         * Adds a single [DetailListResponse] to [items].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addItem(item: DetailListResponse) = apply {
            items =
                (items ?: JsonField.of(mutableListOf())).also { checkKnown("items", it).add(item) }
        }

        /**
         * The payout amount less every entry, in the payout's currency and its smallest unit.
         *
         * The entries alone do not sum to the payout. This field holds the difference, so the
         * entries and this field together reconcile against the payout. It takes either sign; see
         * `PayoutBreakupV3Row` for what each sign means. The value covers the whole payout, not the
         * page.
         */
        fun unattributed(unattributed: Long) = unattributed(JsonField.of(unattributed))

        /**
         * Sets [Builder.unattributed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unattributed] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun unattributed(unattributed: JsonField<Long>) = apply { this.unattributed = unattributed }

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
         * Returns an immutable instance of [DetailListPageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .items()
         * .unattributed()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DetailListPageResponse =
            DetailListPageResponse(
                checkRequired("items", items).map { it.toImmutable() },
                checkRequired("unattributed", unattributed),
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
    fun validate(): DetailListPageResponse = apply {
        if (validated) {
            return@apply
        }

        items().forEach { it.validate() }
        unattributed()
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
            (if (unattributed.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DetailListPageResponse &&
            items == other.items &&
            unattributed == other.unattributed &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(items, unattributed, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DetailListPageResponse{items=$items, unattributed=$unattributed, additionalProperties=$additionalProperties}"
}
