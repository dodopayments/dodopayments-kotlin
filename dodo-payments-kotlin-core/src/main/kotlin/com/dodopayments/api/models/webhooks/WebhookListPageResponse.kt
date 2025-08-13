// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

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

class WebhookListPageResponse
private constructor(
    private val data: JsonField<List<WebhookListResponse>>,
    private val done: JsonField<Boolean>,
    private val iterator: JsonField<String>,
    private val prevIterator: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data")
        @ExcludeMissing
        data: JsonField<List<WebhookListResponse>> = JsonMissing.of(),
        @JsonProperty("done") @ExcludeMissing done: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("iterator") @ExcludeMissing iterator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prev_iterator")
        @ExcludeMissing
        prevIterator: JsonField<String> = JsonMissing.of(),
    ) : this(data, done, iterator, prevIterator, mutableMapOf())

    /**
     * List of webhoooks
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<WebhookListResponse> = data.getRequired("data")

    /**
     * true if no more values are to be fetched.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun done(): Boolean = done.getRequired("done")

    /**
     * Cursor pointing to the next paginated object
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun iterator(): String? = iterator.getNullable("iterator")

    /**
     * Cusror pointing to the previous previous object
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun prevIterator(): String? = prevIterator.getNullable("prev_iterator")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<WebhookListResponse>> = data

    /**
     * Returns the raw JSON value of [done].
     *
     * Unlike [done], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("done") @ExcludeMissing fun _done(): JsonField<Boolean> = done

    /**
     * Returns the raw JSON value of [iterator].
     *
     * Unlike [iterator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("iterator") @ExcludeMissing fun _iterator(): JsonField<String> = iterator

    /**
     * Returns the raw JSON value of [prevIterator].
     *
     * Unlike [prevIterator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prev_iterator")
    @ExcludeMissing
    fun _prevIterator(): JsonField<String> = prevIterator

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
         * Returns a mutable builder for constructing an instance of [WebhookListPageResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .data()
         * .done()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [WebhookListPageResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<WebhookListResponse>>? = null
        private var done: JsonField<Boolean>? = null
        private var iterator: JsonField<String> = JsonMissing.of()
        private var prevIterator: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(webhookListPageResponse: WebhookListPageResponse) = apply {
            data = webhookListPageResponse.data.map { it.toMutableList() }
            done = webhookListPageResponse.done
            iterator = webhookListPageResponse.iterator
            prevIterator = webhookListPageResponse.prevIterator
            additionalProperties = webhookListPageResponse.additionalProperties.toMutableMap()
        }

        /** List of webhoooks */
        fun data(data: List<WebhookListResponse>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<WebhookListResponse>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun data(data: JsonField<List<WebhookListResponse>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [WebhookListResponse] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: WebhookListResponse) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        /** true if no more values are to be fetched. */
        fun done(done: Boolean) = done(JsonField.of(done))

        /**
         * Sets [Builder.done] to an arbitrary JSON value.
         *
         * You should usually call [Builder.done] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun done(done: JsonField<Boolean>) = apply { this.done = done }

        /** Cursor pointing to the next paginated object */
        fun iterator(iterator: String?) = iterator(JsonField.ofNullable(iterator))

        /**
         * Sets [Builder.iterator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.iterator] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun iterator(iterator: JsonField<String>) = apply { this.iterator = iterator }

        /** Cusror pointing to the previous previous object */
        fun prevIterator(prevIterator: String?) = prevIterator(JsonField.ofNullable(prevIterator))

        /**
         * Sets [Builder.prevIterator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prevIterator] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun prevIterator(prevIterator: JsonField<String>) = apply {
            this.prevIterator = prevIterator
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
         * Returns an immutable instance of [WebhookListPageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .data()
         * .done()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WebhookListPageResponse =
            WebhookListPageResponse(
                checkRequired("data", data).map { it.toImmutable() },
                checkRequired("done", done),
                iterator,
                prevIterator,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): WebhookListPageResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
        done()
        iterator()
        prevIterator()
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
        (data.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (done.asKnown() == null) 0 else 1) +
            (if (iterator.asKnown() == null) 0 else 1) +
            (if (prevIterator.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebhookListPageResponse &&
            data == other.data &&
            done == other.done &&
            iterator == other.iterator &&
            prevIterator == other.prevIterator &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(data, done, iterator, prevIterator, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WebhookListPageResponse{data=$data, done=$done, iterator=$iterator, prevIterator=$prevIterator, additionalProperties=$additionalProperties}"
}
