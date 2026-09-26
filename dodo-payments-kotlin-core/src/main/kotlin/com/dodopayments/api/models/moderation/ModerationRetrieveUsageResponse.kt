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
import java.time.LocalDate
import java.util.Collections
import java.util.Objects

/** Your moderation usage. */
class ModerationRetrieveUsageResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val daily: JsonField<List<Daily>>,
    private val screensToNextBlock: JsonField<Long>,
    private val unbilledScreens: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("daily") @ExcludeMissing daily: JsonField<List<Daily>> = JsonMissing.of(),
        @JsonProperty("screens_to_next_block")
        @ExcludeMissing
        screensToNextBlock: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("unbilled_screens")
        @ExcludeMissing
        unbilledScreens: JsonField<Long> = JsonMissing.of(),
    ) : this(daily, screensToNextBlock, unbilledScreens, mutableMapOf())

    /**
     * Your billable screens per UTC day for the last 30 days, charged or not. A day with no screens
     * is not in the list.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun daily(): List<Daily> = daily.getRequired("daily")

    /**
     * Billable screens still needed to fill the next block of 1000. A full block is charged within
     * one hour, so this value is 1000 when your unbilled screens fill whole blocks.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun screensToNextBlock(): Long = screensToNextBlock.getRequired("screens_to_next_block")

    /**
     * Billable screens that Dodo Payments has not charged for yet.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun unbilledScreens(): Long = unbilledScreens.getRequired("unbilled_screens")

    /**
     * Returns the raw JSON value of [daily].
     *
     * Unlike [daily], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("daily") @ExcludeMissing fun _daily(): JsonField<List<Daily>> = daily

    /**
     * Returns the raw JSON value of [screensToNextBlock].
     *
     * Unlike [screensToNextBlock], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("screens_to_next_block")
    @ExcludeMissing
    fun _screensToNextBlock(): JsonField<Long> = screensToNextBlock

    /**
     * Returns the raw JSON value of [unbilledScreens].
     *
     * Unlike [unbilledScreens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("unbilled_screens")
    @ExcludeMissing
    fun _unbilledScreens(): JsonField<Long> = unbilledScreens

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
         * [ModerationRetrieveUsageResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .daily()
         * .screensToNextBlock()
         * .unbilledScreens()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ModerationRetrieveUsageResponse]. */
    class Builder internal constructor() {

        private var daily: JsonField<MutableList<Daily>>? = null
        private var screensToNextBlock: JsonField<Long>? = null
        private var unbilledScreens: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(moderationRetrieveUsageResponse: ModerationRetrieveUsageResponse) =
            apply {
                daily = moderationRetrieveUsageResponse.daily.map { it.toMutableList() }
                screensToNextBlock = moderationRetrieveUsageResponse.screensToNextBlock
                unbilledScreens = moderationRetrieveUsageResponse.unbilledScreens
                additionalProperties =
                    moderationRetrieveUsageResponse.additionalProperties.toMutableMap()
            }

        /**
         * Your billable screens per UTC day for the last 30 days, charged or not. A day with no
         * screens is not in the list.
         */
        fun daily(daily: List<Daily>) = daily(JsonField.of(daily))

        /**
         * Sets [Builder.daily] to an arbitrary JSON value.
         *
         * You should usually call [Builder.daily] with a well-typed `List<Daily>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun daily(daily: JsonField<List<Daily>>) = apply {
            this.daily = daily.map { it.toMutableList() }
        }

        /**
         * Adds a single [Daily] to [Builder.daily].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDaily(daily: Daily) = apply {
            this.daily =
                (this.daily ?: JsonField.of(mutableListOf())).also {
                    checkKnown("daily", it).add(daily)
                }
        }

        /**
         * Billable screens still needed to fill the next block of 1000. A full block is charged
         * within one hour, so this value is 1000 when your unbilled screens fill whole blocks.
         */
        fun screensToNextBlock(screensToNextBlock: Long) =
            screensToNextBlock(JsonField.of(screensToNextBlock))

        /**
         * Sets [Builder.screensToNextBlock] to an arbitrary JSON value.
         *
         * You should usually call [Builder.screensToNextBlock] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun screensToNextBlock(screensToNextBlock: JsonField<Long>) = apply {
            this.screensToNextBlock = screensToNextBlock
        }

        /** Billable screens that Dodo Payments has not charged for yet. */
        fun unbilledScreens(unbilledScreens: Long) = unbilledScreens(JsonField.of(unbilledScreens))

        /**
         * Sets [Builder.unbilledScreens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unbilledScreens] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun unbilledScreens(unbilledScreens: JsonField<Long>) = apply {
            this.unbilledScreens = unbilledScreens
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
         * Returns an immutable instance of [ModerationRetrieveUsageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .daily()
         * .screensToNextBlock()
         * .unbilledScreens()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ModerationRetrieveUsageResponse =
            ModerationRetrieveUsageResponse(
                checkRequired("daily", daily).map { it.toImmutable() },
                checkRequired("screensToNextBlock", screensToNextBlock),
                checkRequired("unbilledScreens", unbilledScreens),
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
    fun validate(): ModerationRetrieveUsageResponse = apply {
        if (validated) {
            return@apply
        }

        daily().forEach { it.validate() }
        screensToNextBlock()
        unbilledScreens()
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
        (daily.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (screensToNextBlock.asKnown() == null) 0 else 1) +
            (if (unbilledScreens.asKnown() == null) 0 else 1)

    class Daily
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val date: JsonField<LocalDate>,
        private val screens: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("date") @ExcludeMissing date: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("screens") @ExcludeMissing screens: JsonField<Long> = JsonMissing.of(),
        ) : this(date, screens, mutableMapOf())

        /**
         * The UTC day.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun date(): LocalDate = date.getRequired("date")

        /**
         * Billable screens on that day.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun screens(): Long = screens.getRequired("screens")

        /**
         * Returns the raw JSON value of [date].
         *
         * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<LocalDate> = date

        /**
         * Returns the raw JSON value of [screens].
         *
         * Unlike [screens], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("screens") @ExcludeMissing fun _screens(): JsonField<Long> = screens

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
             * Returns a mutable builder for constructing an instance of [Daily].
             *
             * The following fields are required:
             * ```kotlin
             * .date()
             * .screens()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Daily]. */
        class Builder internal constructor() {

            private var date: JsonField<LocalDate>? = null
            private var screens: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(daily: Daily) = apply {
                date = daily.date
                screens = daily.screens
                additionalProperties = daily.additionalProperties.toMutableMap()
            }

            /** The UTC day. */
            fun date(date: LocalDate) = date(JsonField.of(date))

            /**
             * Sets [Builder.date] to an arbitrary JSON value.
             *
             * You should usually call [Builder.date] with a well-typed [LocalDate] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun date(date: JsonField<LocalDate>) = apply { this.date = date }

            /** Billable screens on that day. */
            fun screens(screens: Long) = screens(JsonField.of(screens))

            /**
             * Sets [Builder.screens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.screens] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun screens(screens: JsonField<Long>) = apply { this.screens = screens }

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
             * Returns an immutable instance of [Daily].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .date()
             * .screens()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Daily =
                Daily(
                    checkRequired("date", date),
                    checkRequired("screens", screens),
                    additionalProperties.toMutableMap(),
                )
        }

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
        fun validate(): Daily = apply {
            if (validated) {
                return@apply
            }

            date()
            screens()
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
        internal fun validity(): Int =
            (if (date.asKnown() == null) 0 else 1) + (if (screens.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Daily &&
                date == other.date &&
                screens == other.screens &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(date, screens, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Daily{date=$date, screens=$screens, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ModerationRetrieveUsageResponse &&
            daily == other.daily &&
            screensToNextBlock == other.screensToNextBlock &&
            unbilledScreens == other.unbilledScreens &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(daily, screensToNextBlock, unbilledScreens, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ModerationRetrieveUsageResponse{daily=$daily, screensToNextBlock=$screensToNextBlock, unbilledScreens=$unbilledScreens, additionalProperties=$additionalProperties}"
}
