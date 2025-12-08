// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.misc.CountryCode
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

class BillingAddress
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val country: JsonField<CountryCode>,
    private val city: JsonField<String>,
    private val state: JsonField<String>,
    private val street: JsonField<String>,
    private val zipcode: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("country") @ExcludeMissing country: JsonField<CountryCode> = JsonMissing.of(),
        @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
        @JsonProperty("street") @ExcludeMissing street: JsonField<String> = JsonMissing.of(),
        @JsonProperty("zipcode") @ExcludeMissing zipcode: JsonField<String> = JsonMissing.of(),
    ) : this(country, city, state, street, zipcode, mutableMapOf())

    /**
     * Two-letter ISO country code (ISO 3166-1 alpha-2)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun country(): CountryCode = country.getRequired("country")

    /**
     * City name
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun city(): String? = city.getNullable("city")

    /**
     * State or province name
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun state(): String? = state.getNullable("state")

    /**
     * Street address including house number and unit/apartment if applicable
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun street(): String? = street.getNullable("street")

    /**
     * Postal code or ZIP code
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun zipcode(): String? = zipcode.getNullable("zipcode")

    /**
     * Returns the raw JSON value of [country].
     *
     * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<CountryCode> = country

    /**
     * Returns the raw JSON value of [city].
     *
     * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

    /**
     * Returns the raw JSON value of [street].
     *
     * Unlike [street], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("street") @ExcludeMissing fun _street(): JsonField<String> = street

    /**
     * Returns the raw JSON value of [zipcode].
     *
     * Unlike [zipcode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("zipcode") @ExcludeMissing fun _zipcode(): JsonField<String> = zipcode

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
         * Returns a mutable builder for constructing an instance of [BillingAddress].
         *
         * The following fields are required:
         * ```kotlin
         * .country()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BillingAddress]. */
    class Builder internal constructor() {

        private var country: JsonField<CountryCode>? = null
        private var city: JsonField<String> = JsonMissing.of()
        private var state: JsonField<String> = JsonMissing.of()
        private var street: JsonField<String> = JsonMissing.of()
        private var zipcode: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(billingAddress: BillingAddress) = apply {
            country = billingAddress.country
            city = billingAddress.city
            state = billingAddress.state
            street = billingAddress.street
            zipcode = billingAddress.zipcode
            additionalProperties = billingAddress.additionalProperties.toMutableMap()
        }

        /** Two-letter ISO country code (ISO 3166-1 alpha-2) */
        fun country(country: CountryCode) = country(JsonField.of(country))

        /**
         * Sets [Builder.country] to an arbitrary JSON value.
         *
         * You should usually call [Builder.country] with a well-typed [CountryCode] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun country(country: JsonField<CountryCode>) = apply { this.country = country }

        /** City name */
        fun city(city: String?) = city(JsonField.ofNullable(city))

        /**
         * Sets [Builder.city] to an arbitrary JSON value.
         *
         * You should usually call [Builder.city] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun city(city: JsonField<String>) = apply { this.city = city }

        /** State or province name */
        fun state(state: String?) = state(JsonField.ofNullable(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<String>) = apply { this.state = state }

        /** Street address including house number and unit/apartment if applicable */
        fun street(street: String?) = street(JsonField.ofNullable(street))

        /**
         * Sets [Builder.street] to an arbitrary JSON value.
         *
         * You should usually call [Builder.street] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun street(street: JsonField<String>) = apply { this.street = street }

        /** Postal code or ZIP code */
        fun zipcode(zipcode: String?) = zipcode(JsonField.ofNullable(zipcode))

        /**
         * Sets [Builder.zipcode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.zipcode] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun zipcode(zipcode: JsonField<String>) = apply { this.zipcode = zipcode }

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
         * Returns an immutable instance of [BillingAddress].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .country()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BillingAddress =
            BillingAddress(
                checkRequired("country", country),
                city,
                state,
                street,
                zipcode,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BillingAddress = apply {
        if (validated) {
            return@apply
        }

        country().validate()
        city()
        state()
        street()
        zipcode()
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
        (country.asKnown()?.validity() ?: 0) +
            (if (city.asKnown() == null) 0 else 1) +
            (if (state.asKnown() == null) 0 else 1) +
            (if (street.asKnown() == null) 0 else 1) +
            (if (zipcode.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BillingAddress &&
            country == other.country &&
            city == other.city &&
            state == other.state &&
            street == other.street &&
            zipcode == other.zipcode &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(country, city, state, street, zipcode, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BillingAddress{country=$country, city=$city, state=$state, street=$street, zipcode=$zipcode, additionalProperties=$additionalProperties}"
}
