// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.payments

import com.dodo_payments.api.core.ExcludeMissing
import com.dodo_payments.api.core.JsonField
import com.dodo_payments.api.core.JsonMissing
import com.dodo_payments.api.core.JsonValue
import com.dodo_payments.api.core.NoAutoDetect
import com.dodo_payments.api.core.checkRequired
import com.dodo_payments.api.core.immutableEmptyMap
import com.dodo_payments.api.core.toImmutable
import com.dodo_payments.api.models.misc.CountryCode
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects

@NoAutoDetect
class BillingAddress
@JsonCreator
private constructor(
    @JsonProperty("city") @ExcludeMissing private val city: JsonField<String> = JsonMissing.of(),
    @JsonProperty("country")
    @ExcludeMissing
    private val country: JsonField<CountryCode> = JsonMissing.of(),
    @JsonProperty("state") @ExcludeMissing private val state: JsonField<String> = JsonMissing.of(),
    @JsonProperty("street")
    @ExcludeMissing
    private val street: JsonField<String> = JsonMissing.of(),
    @JsonProperty("zipcode")
    @ExcludeMissing
    private val zipcode: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** City name */
    fun city(): String = city.getRequired("city")

    /** ISO country code alpha2 variant */
    fun country(): CountryCode = country.getRequired("country")

    /** State or province name */
    fun state(): String = state.getRequired("state")

    /** Street address including house number and unit/apartment if applicable */
    fun street(): String = street.getRequired("street")

    /** Postal code or ZIP code */
    fun zipcode(): String = zipcode.getRequired("zipcode")

    /** City name */
    @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

    /** ISO country code alpha2 variant */
    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<CountryCode> = country

    /** State or province name */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

    /** Street address including house number and unit/apartment if applicable */
    @JsonProperty("street") @ExcludeMissing fun _street(): JsonField<String> = street

    /** Postal code or ZIP code */
    @JsonProperty("zipcode") @ExcludeMissing fun _zipcode(): JsonField<String> = zipcode

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): BillingAddress = apply {
        if (validated) {
            return@apply
        }

        city()
        country()
        state()
        street()
        zipcode()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BillingAddress].
         *
         * The following fields are required:
         * ```kotlin
         * .city()
         * .country()
         * .state()
         * .street()
         * .zipcode()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BillingAddress]. */
    class Builder internal constructor() {

        private var city: JsonField<String>? = null
        private var country: JsonField<CountryCode>? = null
        private var state: JsonField<String>? = null
        private var street: JsonField<String>? = null
        private var zipcode: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(billingAddress: BillingAddress) = apply {
            city = billingAddress.city
            country = billingAddress.country
            state = billingAddress.state
            street = billingAddress.street
            zipcode = billingAddress.zipcode
            additionalProperties = billingAddress.additionalProperties.toMutableMap()
        }

        /** City name */
        fun city(city: String) = city(JsonField.of(city))

        /** City name */
        fun city(city: JsonField<String>) = apply { this.city = city }

        /** ISO country code alpha2 variant */
        fun country(country: CountryCode) = country(JsonField.of(country))

        /** ISO country code alpha2 variant */
        fun country(country: JsonField<CountryCode>) = apply { this.country = country }

        /** State or province name */
        fun state(state: String) = state(JsonField.of(state))

        /** State or province name */
        fun state(state: JsonField<String>) = apply { this.state = state }

        /** Street address including house number and unit/apartment if applicable */
        fun street(street: String) = street(JsonField.of(street))

        /** Street address including house number and unit/apartment if applicable */
        fun street(street: JsonField<String>) = apply { this.street = street }

        /** Postal code or ZIP code */
        fun zipcode(zipcode: String) = zipcode(JsonField.of(zipcode))

        /** Postal code or ZIP code */
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

        fun build(): BillingAddress =
            BillingAddress(
                checkRequired("city", city),
                checkRequired("country", country),
                checkRequired("state", state),
                checkRequired("street", street),
                checkRequired("zipcode", zipcode),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BillingAddress && city == other.city && country == other.country && state == other.state && street == other.street && zipcode == other.zipcode && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(city, country, state, street, zipcode, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BillingAddress{city=$city, country=$country, state=$state, street=$street, zipcode=$zipcode, additionalProperties=$additionalProperties}"
}
