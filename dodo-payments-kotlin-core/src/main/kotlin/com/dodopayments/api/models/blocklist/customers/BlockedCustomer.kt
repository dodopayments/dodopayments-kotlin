// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.blocklist.customers

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.blocklist.customers.notes.BlockedCustomerNote
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class BlockedCustomer
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val customerEmail: JsonField<String>,
    private val customerId: JsonField<String>,
    private val customerName: JsonField<String>,
    private val identifier: JsonField<String>,
    private val source: JsonField<BlockedCustomerSource>,
    private val blockedByEmail: JsonField<String>,
    private val cancelledSubscriptionIds: JsonField<List<String>>,
    private val notes: JsonField<List<BlockedCustomerNote>>,
    private val reason: JsonField<String>,
    private val remainingSubscriptionIds: JsonField<List<String>>,
    private val subscriptionsSwept: JsonField<Boolean>,
    private val unblockedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("customer_email")
        @ExcludeMissing
        customerEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_name")
        @ExcludeMissing
        customerName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("identifier")
        @ExcludeMissing
        identifier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source")
        @ExcludeMissing
        source: JsonField<BlockedCustomerSource> = JsonMissing.of(),
        @JsonProperty("blocked_by_email")
        @ExcludeMissing
        blockedByEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cancelled_subscription_ids")
        @ExcludeMissing
        cancelledSubscriptionIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("notes")
        @ExcludeMissing
        notes: JsonField<List<BlockedCustomerNote>> = JsonMissing.of(),
        @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("remaining_subscription_ids")
        @ExcludeMissing
        remainingSubscriptionIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("subscriptions_swept")
        @ExcludeMissing
        subscriptionsSwept: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("unblocked_at")
        @ExcludeMissing
        unblockedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        customerEmail,
        customerId,
        customerName,
        identifier,
        source,
        blockedByEmail,
        cancelledSubscriptionIds,
        notes,
        reason,
        remainingSubscriptionIds,
        subscriptionsSwept,
        unblockedAt,
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
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerEmail(): String = customerEmail.getRequired("customer_email")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = customerId.getRequired("customer_id")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerName(): String = customerName.getRequired("customer_name")

    /**
     * Customer id or email that the merchant supplied.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun identifier(): String = identifier.getRequired("identifier")

    /**
     * Where a block came from. `Api` marks an API-key caller, which carries no dashboard actor. The
     * other values name the screen the merchant used.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): BlockedCustomerSource = source.getRequired("source")

    /**
     * Dashboard user who blocked the customer. `null` for an API-key caller.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun blockedByEmail(): String? = blockedByEmail.getNullable("blocked_by_email")

    /**
     * Subscriptions this block cancelled. Present on the create response only.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun cancelledSubscriptionIds(): List<String>? =
        cancelledSubscriptionIds.getNullable("cancelled_subscription_ids")

    /**
     * Activity log. Present on the detail response only.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun notes(): List<BlockedCustomerNote>? = notes.getNullable("notes")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun reason(): String? = reason.getNullable("reason")

    /**
     * Subscriptions this block left live, because the cancel failed or the inline batch filled up.
     * Repeat the create call to continue; the block itself is already in force.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun remainingSubscriptionIds(): List<String>? =
        remainingSubscriptionIds.getNullable("remaining_subscription_ids")

    /**
     * False when the block left live subscriptions behind, including the case where the sweep could
     * not list them and `remaining_subscription_ids` is therefore unknown. Repeat the create call
     * until it reads true.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun subscriptionsSwept(): Boolean? = subscriptionsSwept.getNullable("subscriptions_swept")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun unblockedAt(): OffsetDateTime? = unblockedAt.getNullable("unblocked_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [customerEmail].
     *
     * Unlike [customerEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer_email")
    @ExcludeMissing
    fun _customerEmail(): JsonField<String> = customerEmail

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer_id") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    /**
     * Returns the raw JSON value of [customerName].
     *
     * Unlike [customerName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer_name")
    @ExcludeMissing
    fun _customerName(): JsonField<String> = customerName

    /**
     * Returns the raw JSON value of [identifier].
     *
     * Unlike [identifier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("identifier") @ExcludeMissing fun _identifier(): JsonField<String> = identifier

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<BlockedCustomerSource> = source

    /**
     * Returns the raw JSON value of [blockedByEmail].
     *
     * Unlike [blockedByEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("blocked_by_email")
    @ExcludeMissing
    fun _blockedByEmail(): JsonField<String> = blockedByEmail

    /**
     * Returns the raw JSON value of [cancelledSubscriptionIds].
     *
     * Unlike [cancelledSubscriptionIds], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("cancelled_subscription_ids")
    @ExcludeMissing
    fun _cancelledSubscriptionIds(): JsonField<List<String>> = cancelledSubscriptionIds

    /**
     * Returns the raw JSON value of [notes].
     *
     * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("notes")
    @ExcludeMissing
    fun _notes(): JsonField<List<BlockedCustomerNote>> = notes

    /**
     * Returns the raw JSON value of [reason].
     *
     * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

    /**
     * Returns the raw JSON value of [remainingSubscriptionIds].
     *
     * Unlike [remainingSubscriptionIds], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("remaining_subscription_ids")
    @ExcludeMissing
    fun _remainingSubscriptionIds(): JsonField<List<String>> = remainingSubscriptionIds

    /**
     * Returns the raw JSON value of [subscriptionsSwept].
     *
     * Unlike [subscriptionsSwept], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("subscriptions_swept")
    @ExcludeMissing
    fun _subscriptionsSwept(): JsonField<Boolean> = subscriptionsSwept

    /**
     * Returns the raw JSON value of [unblockedAt].
     *
     * Unlike [unblockedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("unblocked_at")
    @ExcludeMissing
    fun _unblockedAt(): JsonField<OffsetDateTime> = unblockedAt

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
         * Returns a mutable builder for constructing an instance of [BlockedCustomer].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .customerEmail()
         * .customerId()
         * .customerName()
         * .identifier()
         * .source()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BlockedCustomer]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var customerEmail: JsonField<String>? = null
        private var customerId: JsonField<String>? = null
        private var customerName: JsonField<String>? = null
        private var identifier: JsonField<String>? = null
        private var source: JsonField<BlockedCustomerSource>? = null
        private var blockedByEmail: JsonField<String> = JsonMissing.of()
        private var cancelledSubscriptionIds: JsonField<MutableList<String>>? = null
        private var notes: JsonField<MutableList<BlockedCustomerNote>>? = null
        private var reason: JsonField<String> = JsonMissing.of()
        private var remainingSubscriptionIds: JsonField<MutableList<String>>? = null
        private var subscriptionsSwept: JsonField<Boolean> = JsonMissing.of()
        private var unblockedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(blockedCustomer: BlockedCustomer) = apply {
            id = blockedCustomer.id
            createdAt = blockedCustomer.createdAt
            customerEmail = blockedCustomer.customerEmail
            customerId = blockedCustomer.customerId
            customerName = blockedCustomer.customerName
            identifier = blockedCustomer.identifier
            source = blockedCustomer.source
            blockedByEmail = blockedCustomer.blockedByEmail
            cancelledSubscriptionIds =
                blockedCustomer.cancelledSubscriptionIds.map { it.toMutableList() }
            notes = blockedCustomer.notes.map { it.toMutableList() }
            reason = blockedCustomer.reason
            remainingSubscriptionIds =
                blockedCustomer.remainingSubscriptionIds.map { it.toMutableList() }
            subscriptionsSwept = blockedCustomer.subscriptionsSwept
            unblockedAt = blockedCustomer.unblockedAt
            additionalProperties = blockedCustomer.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun customerEmail(customerEmail: String) = customerEmail(JsonField.of(customerEmail))

        /**
         * Sets [Builder.customerEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerEmail] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerEmail(customerEmail: JsonField<String>) = apply {
            this.customerEmail = customerEmail
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

        fun customerName(customerName: String) = customerName(JsonField.of(customerName))

        /**
         * Sets [Builder.customerName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerName(customerName: JsonField<String>) = apply {
            this.customerName = customerName
        }

        /** Customer id or email that the merchant supplied. */
        fun identifier(identifier: String) = identifier(JsonField.of(identifier))

        /**
         * Sets [Builder.identifier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.identifier] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun identifier(identifier: JsonField<String>) = apply { this.identifier = identifier }

        /**
         * Where a block came from. `Api` marks an API-key caller, which carries no dashboard actor.
         * The other values name the screen the merchant used.
         */
        fun source(source: BlockedCustomerSource) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [BlockedCustomerSource] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun source(source: JsonField<BlockedCustomerSource>) = apply { this.source = source }

        /** Dashboard user who blocked the customer. `null` for an API-key caller. */
        fun blockedByEmail(blockedByEmail: String?) =
            blockedByEmail(JsonField.ofNullable(blockedByEmail))

        /**
         * Sets [Builder.blockedByEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.blockedByEmail] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun blockedByEmail(blockedByEmail: JsonField<String>) = apply {
            this.blockedByEmail = blockedByEmail
        }

        /** Subscriptions this block cancelled. Present on the create response only. */
        fun cancelledSubscriptionIds(cancelledSubscriptionIds: List<String>?) =
            cancelledSubscriptionIds(JsonField.ofNullable(cancelledSubscriptionIds))

        /**
         * Sets [Builder.cancelledSubscriptionIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cancelledSubscriptionIds] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun cancelledSubscriptionIds(cancelledSubscriptionIds: JsonField<List<String>>) = apply {
            this.cancelledSubscriptionIds = cancelledSubscriptionIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [cancelledSubscriptionIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCancelledSubscriptionId(cancelledSubscriptionId: String) = apply {
            cancelledSubscriptionIds =
                (cancelledSubscriptionIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("cancelledSubscriptionIds", it).add(cancelledSubscriptionId)
                }
        }

        /** Activity log. Present on the detail response only. */
        fun notes(notes: List<BlockedCustomerNote>?) = notes(JsonField.ofNullable(notes))

        /**
         * Sets [Builder.notes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notes] with a well-typed `List<BlockedCustomerNote>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun notes(notes: JsonField<List<BlockedCustomerNote>>) = apply {
            this.notes = notes.map { it.toMutableList() }
        }

        /**
         * Adds a single [BlockedCustomerNote] to [notes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addNote(note: BlockedCustomerNote) = apply {
            notes =
                (notes ?: JsonField.of(mutableListOf())).also { checkKnown("notes", it).add(note) }
        }

        fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

        /**
         * Sets [Builder.reason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reason] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reason(reason: JsonField<String>) = apply { this.reason = reason }

        /**
         * Subscriptions this block left live, because the cancel failed or the inline batch filled
         * up. Repeat the create call to continue; the block itself is already in force.
         */
        fun remainingSubscriptionIds(remainingSubscriptionIds: List<String>?) =
            remainingSubscriptionIds(JsonField.ofNullable(remainingSubscriptionIds))

        /**
         * Sets [Builder.remainingSubscriptionIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remainingSubscriptionIds] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun remainingSubscriptionIds(remainingSubscriptionIds: JsonField<List<String>>) = apply {
            this.remainingSubscriptionIds = remainingSubscriptionIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [remainingSubscriptionIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRemainingSubscriptionId(remainingSubscriptionId: String) = apply {
            remainingSubscriptionIds =
                (remainingSubscriptionIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("remainingSubscriptionIds", it).add(remainingSubscriptionId)
                }
        }

        /**
         * False when the block left live subscriptions behind, including the case where the sweep
         * could not list them and `remaining_subscription_ids` is therefore unknown. Repeat the
         * create call until it reads true.
         */
        fun subscriptionsSwept(subscriptionsSwept: Boolean?) =
            subscriptionsSwept(JsonField.ofNullable(subscriptionsSwept))

        /**
         * Alias for [Builder.subscriptionsSwept].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun subscriptionsSwept(subscriptionsSwept: Boolean) =
            subscriptionsSwept(subscriptionsSwept as Boolean?)

        /**
         * Sets [Builder.subscriptionsSwept] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionsSwept] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscriptionsSwept(subscriptionsSwept: JsonField<Boolean>) = apply {
            this.subscriptionsSwept = subscriptionsSwept
        }

        fun unblockedAt(unblockedAt: OffsetDateTime?) =
            unblockedAt(JsonField.ofNullable(unblockedAt))

        /**
         * Sets [Builder.unblockedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unblockedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun unblockedAt(unblockedAt: JsonField<OffsetDateTime>) = apply {
            this.unblockedAt = unblockedAt
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
         * Returns an immutable instance of [BlockedCustomer].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .customerEmail()
         * .customerId()
         * .customerName()
         * .identifier()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BlockedCustomer =
            BlockedCustomer(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("customerEmail", customerEmail),
                checkRequired("customerId", customerId),
                checkRequired("customerName", customerName),
                checkRequired("identifier", identifier),
                checkRequired("source", source),
                blockedByEmail,
                (cancelledSubscriptionIds ?: JsonMissing.of()).map { it.toImmutable() },
                (notes ?: JsonMissing.of()).map { it.toImmutable() },
                reason,
                (remainingSubscriptionIds ?: JsonMissing.of()).map { it.toImmutable() },
                subscriptionsSwept,
                unblockedAt,
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
    fun validate(): BlockedCustomer = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        customerEmail()
        customerId()
        customerName()
        identifier()
        source().validate()
        blockedByEmail()
        cancelledSubscriptionIds()
        notes()?.forEach { it.validate() }
        reason()
        remainingSubscriptionIds()
        subscriptionsSwept()
        unblockedAt()
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
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (customerEmail.asKnown() == null) 0 else 1) +
            (if (customerId.asKnown() == null) 0 else 1) +
            (if (customerName.asKnown() == null) 0 else 1) +
            (if (identifier.asKnown() == null) 0 else 1) +
            (source.asKnown()?.validity() ?: 0) +
            (if (blockedByEmail.asKnown() == null) 0 else 1) +
            (cancelledSubscriptionIds.asKnown()?.size ?: 0) +
            (notes.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (reason.asKnown() == null) 0 else 1) +
            (remainingSubscriptionIds.asKnown()?.size ?: 0) +
            (if (subscriptionsSwept.asKnown() == null) 0 else 1) +
            (if (unblockedAt.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BlockedCustomer &&
            id == other.id &&
            createdAt == other.createdAt &&
            customerEmail == other.customerEmail &&
            customerId == other.customerId &&
            customerName == other.customerName &&
            identifier == other.identifier &&
            source == other.source &&
            blockedByEmail == other.blockedByEmail &&
            cancelledSubscriptionIds == other.cancelledSubscriptionIds &&
            notes == other.notes &&
            reason == other.reason &&
            remainingSubscriptionIds == other.remainingSubscriptionIds &&
            subscriptionsSwept == other.subscriptionsSwept &&
            unblockedAt == other.unblockedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            customerEmail,
            customerId,
            customerName,
            identifier,
            source,
            blockedByEmail,
            cancelledSubscriptionIds,
            notes,
            reason,
            remainingSubscriptionIds,
            subscriptionsSwept,
            unblockedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BlockedCustomer{id=$id, createdAt=$createdAt, customerEmail=$customerEmail, customerId=$customerId, customerName=$customerName, identifier=$identifier, source=$source, blockedByEmail=$blockedByEmail, cancelledSubscriptionIds=$cancelledSubscriptionIds, notes=$notes, reason=$reason, remainingSubscriptionIds=$remainingSubscriptionIds, subscriptionsSwept=$subscriptionsSwept, unblockedAt=$unblockedAt, additionalProperties=$additionalProperties}"
}
