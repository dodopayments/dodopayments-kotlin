// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.moderation

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

/** The verdict of one screen. */
class ModerationScreenResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val categories: JsonField<ModerationCategoryScores>,
    private val compoundTriggered: JsonField<Boolean>,
    private val decision: JsonField<ModerationDecision>,
    private val latencyMs: JsonField<Long>,
    private val normalizedApplied: JsonField<Boolean>,
    private val notes: JsonField<List<String>>,
    private val passes: JsonField<Long>,
    private val provenance: JsonField<ModerationCategoryProvenance>,
    private val requestId: JsonField<String>,
    private val triggered: JsonField<List<ModerationCategory>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("categories")
        @ExcludeMissing
        categories: JsonField<ModerationCategoryScores> = JsonMissing.of(),
        @JsonProperty("compound_triggered")
        @ExcludeMissing
        compoundTriggered: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("decision")
        @ExcludeMissing
        decision: JsonField<ModerationDecision> = JsonMissing.of(),
        @JsonProperty("latency_ms") @ExcludeMissing latencyMs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("normalized_applied")
        @ExcludeMissing
        normalizedApplied: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("notes") @ExcludeMissing notes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("passes") @ExcludeMissing passes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("provenance")
        @ExcludeMissing
        provenance: JsonField<ModerationCategoryProvenance> = JsonMissing.of(),
        @JsonProperty("request_id") @ExcludeMissing requestId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("triggered")
        @ExcludeMissing
        triggered: JsonField<List<ModerationCategory>> = JsonMissing.of(),
    ) : this(
        categories,
        compoundTriggered,
        decision,
        latencyMs,
        normalizedApplied,
        notes,
        passes,
        provenance,
        requestId,
        triggered,
        mutableMapOf(),
    )

    /**
     * The probability, from 0 to 1, that the screen falls in each category.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun categories(): ModerationCategoryScores = categories.getRequired("categories")

    /**
     * True when real-person likeness and sexual content together crossed their combined threshold,
     * the pattern of a sexual deepfake.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun compoundTriggered(): Boolean = compoundTriggered.getRequired("compound_triggered")

    /**
     * The verdict. `allow` means the content passed. `deny` means block the content. `flag` means
     * apply your own judgement. It is not a soft deny.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun decision(): ModerationDecision = decision.getRequired("decision")

    /**
     * The time the screen took, in milliseconds.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun latencyMs(): Long = latencyMs.getRequired("latency_ms")

    /**
     * True when the text was also screened in a normalized form, with obfuscation such as invisible
     * or look-alike characters removed.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun normalizedApplied(): Boolean = normalizedApplied.getRequired("normalized_applied")

    /**
     * Human-readable reasons for the decision. The wording can change, so do not parse it.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun notes(): List<String> = notes.getRequired("notes")

    /**
     * The number of yes/no questions the model answered for this screen.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun passes(): Long = passes.getRequired("passes")

    /**
     * How each score in `categories` was measured.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun provenance(): ModerationCategoryProvenance = provenance.getRequired("provenance")

    /**
     * The `request_id` you sent, or null.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun requestId(): String? = requestId.getNullable("request_id")

    /**
     * The categories whose score crossed the threshold of the category. It can be empty on a `flag`
     * from the general check. `notes` then gives the reason.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun triggered(): List<ModerationCategory> = triggered.getRequired("triggered")

    /**
     * Returns the raw JSON value of [categories].
     *
     * Unlike [categories], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("categories")
    @ExcludeMissing
    fun _categories(): JsonField<ModerationCategoryScores> = categories

    /**
     * Returns the raw JSON value of [compoundTriggered].
     *
     * Unlike [compoundTriggered], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("compound_triggered")
    @ExcludeMissing
    fun _compoundTriggered(): JsonField<Boolean> = compoundTriggered

    /**
     * Returns the raw JSON value of [decision].
     *
     * Unlike [decision], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("decision")
    @ExcludeMissing
    fun _decision(): JsonField<ModerationDecision> = decision

    /**
     * Returns the raw JSON value of [latencyMs].
     *
     * Unlike [latencyMs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("latency_ms") @ExcludeMissing fun _latencyMs(): JsonField<Long> = latencyMs

    /**
     * Returns the raw JSON value of [normalizedApplied].
     *
     * Unlike [normalizedApplied], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("normalized_applied")
    @ExcludeMissing
    fun _normalizedApplied(): JsonField<Boolean> = normalizedApplied

    /**
     * Returns the raw JSON value of [notes].
     *
     * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<List<String>> = notes

    /**
     * Returns the raw JSON value of [passes].
     *
     * Unlike [passes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("passes") @ExcludeMissing fun _passes(): JsonField<Long> = passes

    /**
     * Returns the raw JSON value of [provenance].
     *
     * Unlike [provenance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("provenance")
    @ExcludeMissing
    fun _provenance(): JsonField<ModerationCategoryProvenance> = provenance

    /**
     * Returns the raw JSON value of [requestId].
     *
     * Unlike [requestId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("request_id") @ExcludeMissing fun _requestId(): JsonField<String> = requestId

    /**
     * Returns the raw JSON value of [triggered].
     *
     * Unlike [triggered], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("triggered")
    @ExcludeMissing
    fun _triggered(): JsonField<List<ModerationCategory>> = triggered

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
         * Returns a mutable builder for constructing an instance of [ModerationScreenResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .categories()
         * .compoundTriggered()
         * .decision()
         * .latencyMs()
         * .normalizedApplied()
         * .notes()
         * .passes()
         * .provenance()
         * .requestId()
         * .triggered()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ModerationScreenResponse]. */
    class Builder internal constructor() {

        private var categories: JsonField<ModerationCategoryScores>? = null
        private var compoundTriggered: JsonField<Boolean>? = null
        private var decision: JsonField<ModerationDecision>? = null
        private var latencyMs: JsonField<Long>? = null
        private var normalizedApplied: JsonField<Boolean>? = null
        private var notes: JsonField<MutableList<String>>? = null
        private var passes: JsonField<Long>? = null
        private var provenance: JsonField<ModerationCategoryProvenance>? = null
        private var requestId: JsonField<String>? = null
        private var triggered: JsonField<MutableList<ModerationCategory>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(moderationScreenResponse: ModerationScreenResponse) = apply {
            categories = moderationScreenResponse.categories
            compoundTriggered = moderationScreenResponse.compoundTriggered
            decision = moderationScreenResponse.decision
            latencyMs = moderationScreenResponse.latencyMs
            normalizedApplied = moderationScreenResponse.normalizedApplied
            notes = moderationScreenResponse.notes.map { it.toMutableList() }
            passes = moderationScreenResponse.passes
            provenance = moderationScreenResponse.provenance
            requestId = moderationScreenResponse.requestId
            triggered = moderationScreenResponse.triggered.map { it.toMutableList() }
            additionalProperties = moderationScreenResponse.additionalProperties.toMutableMap()
        }

        /** The probability, from 0 to 1, that the screen falls in each category. */
        fun categories(categories: ModerationCategoryScores) = categories(JsonField.of(categories))

        /**
         * Sets [Builder.categories] to an arbitrary JSON value.
         *
         * You should usually call [Builder.categories] with a well-typed [ModerationCategoryScores]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun categories(categories: JsonField<ModerationCategoryScores>) = apply {
            this.categories = categories
        }

        /**
         * True when real-person likeness and sexual content together crossed their combined
         * threshold, the pattern of a sexual deepfake.
         */
        fun compoundTriggered(compoundTriggered: Boolean) =
            compoundTriggered(JsonField.of(compoundTriggered))

        /**
         * Sets [Builder.compoundTriggered] to an arbitrary JSON value.
         *
         * You should usually call [Builder.compoundTriggered] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun compoundTriggered(compoundTriggered: JsonField<Boolean>) = apply {
            this.compoundTriggered = compoundTriggered
        }

        /**
         * The verdict. `allow` means the content passed. `deny` means block the content. `flag`
         * means apply your own judgement. It is not a soft deny.
         */
        fun decision(decision: ModerationDecision) = decision(JsonField.of(decision))

        /**
         * Sets [Builder.decision] to an arbitrary JSON value.
         *
         * You should usually call [Builder.decision] with a well-typed [ModerationDecision] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun decision(decision: JsonField<ModerationDecision>) = apply { this.decision = decision }

        /** The time the screen took, in milliseconds. */
        fun latencyMs(latencyMs: Long) = latencyMs(JsonField.of(latencyMs))

        /**
         * Sets [Builder.latencyMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.latencyMs] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun latencyMs(latencyMs: JsonField<Long>) = apply { this.latencyMs = latencyMs }

        /**
         * True when the text was also screened in a normalized form, with obfuscation such as
         * invisible or look-alike characters removed.
         */
        fun normalizedApplied(normalizedApplied: Boolean) =
            normalizedApplied(JsonField.of(normalizedApplied))

        /**
         * Sets [Builder.normalizedApplied] to an arbitrary JSON value.
         *
         * You should usually call [Builder.normalizedApplied] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun normalizedApplied(normalizedApplied: JsonField<Boolean>) = apply {
            this.normalizedApplied = normalizedApplied
        }

        /** Human-readable reasons for the decision. The wording can change, so do not parse it. */
        fun notes(notes: List<String>) = notes(JsonField.of(notes))

        /**
         * Sets [Builder.notes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notes] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun notes(notes: JsonField<List<String>>) = apply {
            this.notes = notes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [notes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addNote(note: String) = apply {
            notes =
                (notes ?: JsonField.of(mutableListOf())).also { checkKnown("notes", it).add(note) }
        }

        /** The number of yes/no questions the model answered for this screen. */
        fun passes(passes: Long) = passes(JsonField.of(passes))

        /**
         * Sets [Builder.passes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.passes] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun passes(passes: JsonField<Long>) = apply { this.passes = passes }

        /** How each score in `categories` was measured. */
        fun provenance(provenance: ModerationCategoryProvenance) =
            provenance(JsonField.of(provenance))

        /**
         * Sets [Builder.provenance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.provenance] with a well-typed
         * [ModerationCategoryProvenance] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun provenance(provenance: JsonField<ModerationCategoryProvenance>) = apply {
            this.provenance = provenance
        }

        /** The `request_id` you sent, or null. */
        fun requestId(requestId: String?) = requestId(JsonField.ofNullable(requestId))

        /**
         * Sets [Builder.requestId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun requestId(requestId: JsonField<String>) = apply { this.requestId = requestId }

        /**
         * The categories whose score crossed the threshold of the category. It can be empty on a
         * `flag` from the general check. `notes` then gives the reason.
         */
        fun triggered(triggered: List<ModerationCategory>) = triggered(JsonField.of(triggered))

        /**
         * Sets [Builder.triggered] to an arbitrary JSON value.
         *
         * You should usually call [Builder.triggered] with a well-typed `List<ModerationCategory>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun triggered(triggered: JsonField<List<ModerationCategory>>) = apply {
            this.triggered = triggered.map { it.toMutableList() }
        }

        /**
         * Adds a single [ModerationCategory] to [Builder.triggered].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTriggered(triggered: ModerationCategory) = apply {
            this.triggered =
                (this.triggered ?: JsonField.of(mutableListOf())).also {
                    checkKnown("triggered", it).add(triggered)
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
         * Returns an immutable instance of [ModerationScreenResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .categories()
         * .compoundTriggered()
         * .decision()
         * .latencyMs()
         * .normalizedApplied()
         * .notes()
         * .passes()
         * .provenance()
         * .requestId()
         * .triggered()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ModerationScreenResponse =
            ModerationScreenResponse(
                checkRequired("categories", categories),
                checkRequired("compoundTriggered", compoundTriggered),
                checkRequired("decision", decision),
                checkRequired("latencyMs", latencyMs),
                checkRequired("normalizedApplied", normalizedApplied),
                checkRequired("notes", notes).map { it.toImmutable() },
                checkRequired("passes", passes),
                checkRequired("provenance", provenance),
                checkRequired("requestId", requestId),
                checkRequired("triggered", triggered).map { it.toImmutable() },
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
    fun validate(): ModerationScreenResponse = apply {
        if (validated) {
            return@apply
        }

        categories().validate()
        compoundTriggered()
        decision().validate()
        latencyMs()
        normalizedApplied()
        notes()
        passes()
        provenance().validate()
        requestId()
        triggered().forEach { it.validate() }
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
        (categories.asKnown()?.validity() ?: 0) +
            (if (compoundTriggered.asKnown() == null) 0 else 1) +
            (decision.asKnown()?.validity() ?: 0) +
            (if (latencyMs.asKnown() == null) 0 else 1) +
            (if (normalizedApplied.asKnown() == null) 0 else 1) +
            (notes.asKnown()?.size ?: 0) +
            (if (passes.asKnown() == null) 0 else 1) +
            (provenance.asKnown()?.validity() ?: 0) +
            (if (requestId.asKnown() == null) 0 else 1) +
            (triggered.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ModerationScreenResponse &&
            categories == other.categories &&
            compoundTriggered == other.compoundTriggered &&
            decision == other.decision &&
            latencyMs == other.latencyMs &&
            normalizedApplied == other.normalizedApplied &&
            notes == other.notes &&
            passes == other.passes &&
            provenance == other.provenance &&
            requestId == other.requestId &&
            triggered == other.triggered &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            categories,
            compoundTriggered,
            decision,
            latencyMs,
            normalizedApplied,
            notes,
            passes,
            provenance,
            requestId,
            triggered,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ModerationScreenResponse{categories=$categories, compoundTriggered=$compoundTriggered, decision=$decision, latencyMs=$latencyMs, normalizedApplied=$normalizedApplied, notes=$notes, passes=$passes, provenance=$provenance, requestId=$requestId, triggered=$triggered, additionalProperties=$additionalProperties}"
}
