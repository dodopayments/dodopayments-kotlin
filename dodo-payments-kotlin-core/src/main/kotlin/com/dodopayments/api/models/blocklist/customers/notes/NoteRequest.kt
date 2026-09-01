// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.blocklist.customers.notes

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
import java.util.Collections
import java.util.Objects

class NoteRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val note: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("note") @ExcludeMissing note: JsonField<String> = JsonMissing.of()
    ) : this(note, mutableMapOf())

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun note(): String = note.getRequired("note")

    /**
     * Returns the raw JSON value of [note].
     *
     * Unlike [note], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("note") @ExcludeMissing fun _note(): JsonField<String> = note

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
         * Returns a mutable builder for constructing an instance of [NoteRequest].
         *
         * The following fields are required:
         * ```kotlin
         * .note()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [NoteRequest]. */
    class Builder internal constructor() {

        private var note: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(noteRequest: NoteRequest) = apply {
            note = noteRequest.note
            additionalProperties = noteRequest.additionalProperties.toMutableMap()
        }

        fun note(note: String) = note(JsonField.of(note))

        /**
         * Sets [Builder.note] to an arbitrary JSON value.
         *
         * You should usually call [Builder.note] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun note(note: JsonField<String>) = apply { this.note = note }

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
         * Returns an immutable instance of [NoteRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .note()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NoteRequest =
            NoteRequest(checkRequired("note", note), additionalProperties.toMutableMap())
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
    fun validate(): NoteRequest = apply {
        if (validated) {
            return@apply
        }

        note()
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
    internal fun validity(): Int = (if (note.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NoteRequest &&
            note == other.note &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(note, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() = "NoteRequest{note=$note, additionalProperties=$additionalProperties}"
}
