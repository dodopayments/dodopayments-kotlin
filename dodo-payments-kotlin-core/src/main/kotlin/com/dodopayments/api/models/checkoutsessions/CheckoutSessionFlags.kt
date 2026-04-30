// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.checkoutsessions

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

class CheckoutSessionFlags
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val allowCurrencySelection: JsonField<Boolean>,
    private val allowCustomerEditingCity: JsonField<Boolean>,
    private val allowCustomerEditingCountry: JsonField<Boolean>,
    private val allowCustomerEditingEmail: JsonField<Boolean>,
    private val allowCustomerEditingName: JsonField<Boolean>,
    private val allowCustomerEditingState: JsonField<Boolean>,
    private val allowCustomerEditingStreet: JsonField<Boolean>,
    private val allowCustomerEditingTaxId: JsonField<Boolean>,
    private val allowCustomerEditingZipcode: JsonField<Boolean>,
    private val allowDiscountCode: JsonField<Boolean>,
    private val allowPhoneNumberCollection: JsonField<Boolean>,
    private val allowTaxId: JsonField<Boolean>,
    private val alwaysCreateNewCustomer: JsonField<Boolean>,
    private val redirectImmediately: JsonField<Boolean>,
    private val requirePhoneNumber: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("allow_currency_selection")
        @ExcludeMissing
        allowCurrencySelection: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("allow_customer_editing_city")
        @ExcludeMissing
        allowCustomerEditingCity: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("allow_customer_editing_country")
        @ExcludeMissing
        allowCustomerEditingCountry: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("allow_customer_editing_email")
        @ExcludeMissing
        allowCustomerEditingEmail: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("allow_customer_editing_name")
        @ExcludeMissing
        allowCustomerEditingName: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("allow_customer_editing_state")
        @ExcludeMissing
        allowCustomerEditingState: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("allow_customer_editing_street")
        @ExcludeMissing
        allowCustomerEditingStreet: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("allow_customer_editing_tax_id")
        @ExcludeMissing
        allowCustomerEditingTaxId: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("allow_customer_editing_zipcode")
        @ExcludeMissing
        allowCustomerEditingZipcode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("allow_discount_code")
        @ExcludeMissing
        allowDiscountCode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("allow_phone_number_collection")
        @ExcludeMissing
        allowPhoneNumberCollection: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("allow_tax_id")
        @ExcludeMissing
        allowTaxId: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("always_create_new_customer")
        @ExcludeMissing
        alwaysCreateNewCustomer: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("redirect_immediately")
        @ExcludeMissing
        redirectImmediately: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("require_phone_number")
        @ExcludeMissing
        requirePhoneNumber: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        allowCurrencySelection,
        allowCustomerEditingCity,
        allowCustomerEditingCountry,
        allowCustomerEditingEmail,
        allowCustomerEditingName,
        allowCustomerEditingState,
        allowCustomerEditingStreet,
        allowCustomerEditingTaxId,
        allowCustomerEditingZipcode,
        allowDiscountCode,
        allowPhoneNumberCollection,
        allowTaxId,
        alwaysCreateNewCustomer,
        redirectImmediately,
        requirePhoneNumber,
        mutableMapOf(),
    )

    /**
     * if customer is allowed to change currency, set it to true
     *
     * Default is true
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun allowCurrencySelection(): Boolean? =
        allowCurrencySelection.getNullable("allow_currency_selection")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun allowCustomerEditingCity(): Boolean? =
        allowCustomerEditingCity.getNullable("allow_customer_editing_city")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun allowCustomerEditingCountry(): Boolean? =
        allowCustomerEditingCountry.getNullable("allow_customer_editing_country")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun allowCustomerEditingEmail(): Boolean? =
        allowCustomerEditingEmail.getNullable("allow_customer_editing_email")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun allowCustomerEditingName(): Boolean? =
        allowCustomerEditingName.getNullable("allow_customer_editing_name")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun allowCustomerEditingState(): Boolean? =
        allowCustomerEditingState.getNullable("allow_customer_editing_state")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun allowCustomerEditingStreet(): Boolean? =
        allowCustomerEditingStreet.getNullable("allow_customer_editing_street")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun allowCustomerEditingTaxId(): Boolean? =
        allowCustomerEditingTaxId.getNullable("allow_customer_editing_tax_id")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun allowCustomerEditingZipcode(): Boolean? =
        allowCustomerEditingZipcode.getNullable("allow_customer_editing_zipcode")

    /**
     * If the customer is allowed to apply discount code, set it to true.
     *
     * Default is true
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun allowDiscountCode(): Boolean? = allowDiscountCode.getNullable("allow_discount_code")

    /**
     * If phone number is collected from customer, set it to rue
     *
     * Default is true
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun allowPhoneNumberCollection(): Boolean? =
        allowPhoneNumberCollection.getNullable("allow_phone_number_collection")

    /**
     * If the customer is allowed to add tax id, set it to true
     *
     * Default is true
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun allowTaxId(): Boolean? = allowTaxId.getNullable("allow_tax_id")

    /**
     * Set to true if a new customer object should be created. By default email is used to find an
     * existing customer to attach the session to
     *
     * Default is false
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun alwaysCreateNewCustomer(): Boolean? =
        alwaysCreateNewCustomer.getNullable("always_create_new_customer")

    /**
     * If true, redirects the customer immediately after payment completion
     *
     * Default is false
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun redirectImmediately(): Boolean? = redirectImmediately.getNullable("redirect_immediately")

    /**
     * If true, the customer must provide a phone number to complete checkout. Requires
     * `allow_phone_number_collection` to also be true.
     *
     * Default is false
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun requirePhoneNumber(): Boolean? = requirePhoneNumber.getNullable("require_phone_number")

    /**
     * Returns the raw JSON value of [allowCurrencySelection].
     *
     * Unlike [allowCurrencySelection], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("allow_currency_selection")
    @ExcludeMissing
    fun _allowCurrencySelection(): JsonField<Boolean> = allowCurrencySelection

    /**
     * Returns the raw JSON value of [allowCustomerEditingCity].
     *
     * Unlike [allowCustomerEditingCity], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("allow_customer_editing_city")
    @ExcludeMissing
    fun _allowCustomerEditingCity(): JsonField<Boolean> = allowCustomerEditingCity

    /**
     * Returns the raw JSON value of [allowCustomerEditingCountry].
     *
     * Unlike [allowCustomerEditingCountry], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("allow_customer_editing_country")
    @ExcludeMissing
    fun _allowCustomerEditingCountry(): JsonField<Boolean> = allowCustomerEditingCountry

    /**
     * Returns the raw JSON value of [allowCustomerEditingEmail].
     *
     * Unlike [allowCustomerEditingEmail], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("allow_customer_editing_email")
    @ExcludeMissing
    fun _allowCustomerEditingEmail(): JsonField<Boolean> = allowCustomerEditingEmail

    /**
     * Returns the raw JSON value of [allowCustomerEditingName].
     *
     * Unlike [allowCustomerEditingName], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("allow_customer_editing_name")
    @ExcludeMissing
    fun _allowCustomerEditingName(): JsonField<Boolean> = allowCustomerEditingName

    /**
     * Returns the raw JSON value of [allowCustomerEditingState].
     *
     * Unlike [allowCustomerEditingState], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("allow_customer_editing_state")
    @ExcludeMissing
    fun _allowCustomerEditingState(): JsonField<Boolean> = allowCustomerEditingState

    /**
     * Returns the raw JSON value of [allowCustomerEditingStreet].
     *
     * Unlike [allowCustomerEditingStreet], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("allow_customer_editing_street")
    @ExcludeMissing
    fun _allowCustomerEditingStreet(): JsonField<Boolean> = allowCustomerEditingStreet

    /**
     * Returns the raw JSON value of [allowCustomerEditingTaxId].
     *
     * Unlike [allowCustomerEditingTaxId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("allow_customer_editing_tax_id")
    @ExcludeMissing
    fun _allowCustomerEditingTaxId(): JsonField<Boolean> = allowCustomerEditingTaxId

    /**
     * Returns the raw JSON value of [allowCustomerEditingZipcode].
     *
     * Unlike [allowCustomerEditingZipcode], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("allow_customer_editing_zipcode")
    @ExcludeMissing
    fun _allowCustomerEditingZipcode(): JsonField<Boolean> = allowCustomerEditingZipcode

    /**
     * Returns the raw JSON value of [allowDiscountCode].
     *
     * Unlike [allowDiscountCode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("allow_discount_code")
    @ExcludeMissing
    fun _allowDiscountCode(): JsonField<Boolean> = allowDiscountCode

    /**
     * Returns the raw JSON value of [allowPhoneNumberCollection].
     *
     * Unlike [allowPhoneNumberCollection], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("allow_phone_number_collection")
    @ExcludeMissing
    fun _allowPhoneNumberCollection(): JsonField<Boolean> = allowPhoneNumberCollection

    /**
     * Returns the raw JSON value of [allowTaxId].
     *
     * Unlike [allowTaxId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("allow_tax_id") @ExcludeMissing fun _allowTaxId(): JsonField<Boolean> = allowTaxId

    /**
     * Returns the raw JSON value of [alwaysCreateNewCustomer].
     *
     * Unlike [alwaysCreateNewCustomer], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("always_create_new_customer")
    @ExcludeMissing
    fun _alwaysCreateNewCustomer(): JsonField<Boolean> = alwaysCreateNewCustomer

    /**
     * Returns the raw JSON value of [redirectImmediately].
     *
     * Unlike [redirectImmediately], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("redirect_immediately")
    @ExcludeMissing
    fun _redirectImmediately(): JsonField<Boolean> = redirectImmediately

    /**
     * Returns the raw JSON value of [requirePhoneNumber].
     *
     * Unlike [requirePhoneNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("require_phone_number")
    @ExcludeMissing
    fun _requirePhoneNumber(): JsonField<Boolean> = requirePhoneNumber

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

        /** Returns a mutable builder for constructing an instance of [CheckoutSessionFlags]. */
        fun builder() = Builder()
    }

    /** A builder for [CheckoutSessionFlags]. */
    class Builder internal constructor() {

        private var allowCurrencySelection: JsonField<Boolean> = JsonMissing.of()
        private var allowCustomerEditingCity: JsonField<Boolean> = JsonMissing.of()
        private var allowCustomerEditingCountry: JsonField<Boolean> = JsonMissing.of()
        private var allowCustomerEditingEmail: JsonField<Boolean> = JsonMissing.of()
        private var allowCustomerEditingName: JsonField<Boolean> = JsonMissing.of()
        private var allowCustomerEditingState: JsonField<Boolean> = JsonMissing.of()
        private var allowCustomerEditingStreet: JsonField<Boolean> = JsonMissing.of()
        private var allowCustomerEditingTaxId: JsonField<Boolean> = JsonMissing.of()
        private var allowCustomerEditingZipcode: JsonField<Boolean> = JsonMissing.of()
        private var allowDiscountCode: JsonField<Boolean> = JsonMissing.of()
        private var allowPhoneNumberCollection: JsonField<Boolean> = JsonMissing.of()
        private var allowTaxId: JsonField<Boolean> = JsonMissing.of()
        private var alwaysCreateNewCustomer: JsonField<Boolean> = JsonMissing.of()
        private var redirectImmediately: JsonField<Boolean> = JsonMissing.of()
        private var requirePhoneNumber: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(checkoutSessionFlags: CheckoutSessionFlags) = apply {
            allowCurrencySelection = checkoutSessionFlags.allowCurrencySelection
            allowCustomerEditingCity = checkoutSessionFlags.allowCustomerEditingCity
            allowCustomerEditingCountry = checkoutSessionFlags.allowCustomerEditingCountry
            allowCustomerEditingEmail = checkoutSessionFlags.allowCustomerEditingEmail
            allowCustomerEditingName = checkoutSessionFlags.allowCustomerEditingName
            allowCustomerEditingState = checkoutSessionFlags.allowCustomerEditingState
            allowCustomerEditingStreet = checkoutSessionFlags.allowCustomerEditingStreet
            allowCustomerEditingTaxId = checkoutSessionFlags.allowCustomerEditingTaxId
            allowCustomerEditingZipcode = checkoutSessionFlags.allowCustomerEditingZipcode
            allowDiscountCode = checkoutSessionFlags.allowDiscountCode
            allowPhoneNumberCollection = checkoutSessionFlags.allowPhoneNumberCollection
            allowTaxId = checkoutSessionFlags.allowTaxId
            alwaysCreateNewCustomer = checkoutSessionFlags.alwaysCreateNewCustomer
            redirectImmediately = checkoutSessionFlags.redirectImmediately
            requirePhoneNumber = checkoutSessionFlags.requirePhoneNumber
            additionalProperties = checkoutSessionFlags.additionalProperties.toMutableMap()
        }

        /**
         * if customer is allowed to change currency, set it to true
         *
         * Default is true
         */
        fun allowCurrencySelection(allowCurrencySelection: Boolean) =
            allowCurrencySelection(JsonField.of(allowCurrencySelection))

        /**
         * Sets [Builder.allowCurrencySelection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowCurrencySelection] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun allowCurrencySelection(allowCurrencySelection: JsonField<Boolean>) = apply {
            this.allowCurrencySelection = allowCurrencySelection
        }

        fun allowCustomerEditingCity(allowCustomerEditingCity: Boolean) =
            allowCustomerEditingCity(JsonField.of(allowCustomerEditingCity))

        /**
         * Sets [Builder.allowCustomerEditingCity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowCustomerEditingCity] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun allowCustomerEditingCity(allowCustomerEditingCity: JsonField<Boolean>) = apply {
            this.allowCustomerEditingCity = allowCustomerEditingCity
        }

        fun allowCustomerEditingCountry(allowCustomerEditingCountry: Boolean) =
            allowCustomerEditingCountry(JsonField.of(allowCustomerEditingCountry))

        /**
         * Sets [Builder.allowCustomerEditingCountry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowCustomerEditingCountry] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun allowCustomerEditingCountry(allowCustomerEditingCountry: JsonField<Boolean>) = apply {
            this.allowCustomerEditingCountry = allowCustomerEditingCountry
        }

        fun allowCustomerEditingEmail(allowCustomerEditingEmail: Boolean) =
            allowCustomerEditingEmail(JsonField.of(allowCustomerEditingEmail))

        /**
         * Sets [Builder.allowCustomerEditingEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowCustomerEditingEmail] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun allowCustomerEditingEmail(allowCustomerEditingEmail: JsonField<Boolean>) = apply {
            this.allowCustomerEditingEmail = allowCustomerEditingEmail
        }

        fun allowCustomerEditingName(allowCustomerEditingName: Boolean) =
            allowCustomerEditingName(JsonField.of(allowCustomerEditingName))

        /**
         * Sets [Builder.allowCustomerEditingName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowCustomerEditingName] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun allowCustomerEditingName(allowCustomerEditingName: JsonField<Boolean>) = apply {
            this.allowCustomerEditingName = allowCustomerEditingName
        }

        fun allowCustomerEditingState(allowCustomerEditingState: Boolean) =
            allowCustomerEditingState(JsonField.of(allowCustomerEditingState))

        /**
         * Sets [Builder.allowCustomerEditingState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowCustomerEditingState] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun allowCustomerEditingState(allowCustomerEditingState: JsonField<Boolean>) = apply {
            this.allowCustomerEditingState = allowCustomerEditingState
        }

        fun allowCustomerEditingStreet(allowCustomerEditingStreet: Boolean) =
            allowCustomerEditingStreet(JsonField.of(allowCustomerEditingStreet))

        /**
         * Sets [Builder.allowCustomerEditingStreet] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowCustomerEditingStreet] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun allowCustomerEditingStreet(allowCustomerEditingStreet: JsonField<Boolean>) = apply {
            this.allowCustomerEditingStreet = allowCustomerEditingStreet
        }

        fun allowCustomerEditingTaxId(allowCustomerEditingTaxId: Boolean) =
            allowCustomerEditingTaxId(JsonField.of(allowCustomerEditingTaxId))

        /**
         * Sets [Builder.allowCustomerEditingTaxId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowCustomerEditingTaxId] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun allowCustomerEditingTaxId(allowCustomerEditingTaxId: JsonField<Boolean>) = apply {
            this.allowCustomerEditingTaxId = allowCustomerEditingTaxId
        }

        fun allowCustomerEditingZipcode(allowCustomerEditingZipcode: Boolean) =
            allowCustomerEditingZipcode(JsonField.of(allowCustomerEditingZipcode))

        /**
         * Sets [Builder.allowCustomerEditingZipcode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowCustomerEditingZipcode] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun allowCustomerEditingZipcode(allowCustomerEditingZipcode: JsonField<Boolean>) = apply {
            this.allowCustomerEditingZipcode = allowCustomerEditingZipcode
        }

        /**
         * If the customer is allowed to apply discount code, set it to true.
         *
         * Default is true
         */
        fun allowDiscountCode(allowDiscountCode: Boolean) =
            allowDiscountCode(JsonField.of(allowDiscountCode))

        /**
         * Sets [Builder.allowDiscountCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowDiscountCode] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun allowDiscountCode(allowDiscountCode: JsonField<Boolean>) = apply {
            this.allowDiscountCode = allowDiscountCode
        }

        /**
         * If phone number is collected from customer, set it to rue
         *
         * Default is true
         */
        fun allowPhoneNumberCollection(allowPhoneNumberCollection: Boolean) =
            allowPhoneNumberCollection(JsonField.of(allowPhoneNumberCollection))

        /**
         * Sets [Builder.allowPhoneNumberCollection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowPhoneNumberCollection] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun allowPhoneNumberCollection(allowPhoneNumberCollection: JsonField<Boolean>) = apply {
            this.allowPhoneNumberCollection = allowPhoneNumberCollection
        }

        /**
         * If the customer is allowed to add tax id, set it to true
         *
         * Default is true
         */
        fun allowTaxId(allowTaxId: Boolean) = allowTaxId(JsonField.of(allowTaxId))

        /**
         * Sets [Builder.allowTaxId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowTaxId] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun allowTaxId(allowTaxId: JsonField<Boolean>) = apply { this.allowTaxId = allowTaxId }

        /**
         * Set to true if a new customer object should be created. By default email is used to find
         * an existing customer to attach the session to
         *
         * Default is false
         */
        fun alwaysCreateNewCustomer(alwaysCreateNewCustomer: Boolean) =
            alwaysCreateNewCustomer(JsonField.of(alwaysCreateNewCustomer))

        /**
         * Sets [Builder.alwaysCreateNewCustomer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alwaysCreateNewCustomer] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun alwaysCreateNewCustomer(alwaysCreateNewCustomer: JsonField<Boolean>) = apply {
            this.alwaysCreateNewCustomer = alwaysCreateNewCustomer
        }

        /**
         * If true, redirects the customer immediately after payment completion
         *
         * Default is false
         */
        fun redirectImmediately(redirectImmediately: Boolean) =
            redirectImmediately(JsonField.of(redirectImmediately))

        /**
         * Sets [Builder.redirectImmediately] to an arbitrary JSON value.
         *
         * You should usually call [Builder.redirectImmediately] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun redirectImmediately(redirectImmediately: JsonField<Boolean>) = apply {
            this.redirectImmediately = redirectImmediately
        }

        /**
         * If true, the customer must provide a phone number to complete checkout. Requires
         * `allow_phone_number_collection` to also be true.
         *
         * Default is false
         */
        fun requirePhoneNumber(requirePhoneNumber: Boolean) =
            requirePhoneNumber(JsonField.of(requirePhoneNumber))

        /**
         * Sets [Builder.requirePhoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requirePhoneNumber] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requirePhoneNumber(requirePhoneNumber: JsonField<Boolean>) = apply {
            this.requirePhoneNumber = requirePhoneNumber
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
         * Returns an immutable instance of [CheckoutSessionFlags].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CheckoutSessionFlags =
            CheckoutSessionFlags(
                allowCurrencySelection,
                allowCustomerEditingCity,
                allowCustomerEditingCountry,
                allowCustomerEditingEmail,
                allowCustomerEditingName,
                allowCustomerEditingState,
                allowCustomerEditingStreet,
                allowCustomerEditingTaxId,
                allowCustomerEditingZipcode,
                allowDiscountCode,
                allowPhoneNumberCollection,
                allowTaxId,
                alwaysCreateNewCustomer,
                redirectImmediately,
                requirePhoneNumber,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CheckoutSessionFlags = apply {
        if (validated) {
            return@apply
        }

        allowCurrencySelection()
        allowCustomerEditingCity()
        allowCustomerEditingCountry()
        allowCustomerEditingEmail()
        allowCustomerEditingName()
        allowCustomerEditingState()
        allowCustomerEditingStreet()
        allowCustomerEditingTaxId()
        allowCustomerEditingZipcode()
        allowDiscountCode()
        allowPhoneNumberCollection()
        allowTaxId()
        alwaysCreateNewCustomer()
        redirectImmediately()
        requirePhoneNumber()
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
        (if (allowCurrencySelection.asKnown() == null) 0 else 1) +
            (if (allowCustomerEditingCity.asKnown() == null) 0 else 1) +
            (if (allowCustomerEditingCountry.asKnown() == null) 0 else 1) +
            (if (allowCustomerEditingEmail.asKnown() == null) 0 else 1) +
            (if (allowCustomerEditingName.asKnown() == null) 0 else 1) +
            (if (allowCustomerEditingState.asKnown() == null) 0 else 1) +
            (if (allowCustomerEditingStreet.asKnown() == null) 0 else 1) +
            (if (allowCustomerEditingTaxId.asKnown() == null) 0 else 1) +
            (if (allowCustomerEditingZipcode.asKnown() == null) 0 else 1) +
            (if (allowDiscountCode.asKnown() == null) 0 else 1) +
            (if (allowPhoneNumberCollection.asKnown() == null) 0 else 1) +
            (if (allowTaxId.asKnown() == null) 0 else 1) +
            (if (alwaysCreateNewCustomer.asKnown() == null) 0 else 1) +
            (if (redirectImmediately.asKnown() == null) 0 else 1) +
            (if (requirePhoneNumber.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CheckoutSessionFlags &&
            allowCurrencySelection == other.allowCurrencySelection &&
            allowCustomerEditingCity == other.allowCustomerEditingCity &&
            allowCustomerEditingCountry == other.allowCustomerEditingCountry &&
            allowCustomerEditingEmail == other.allowCustomerEditingEmail &&
            allowCustomerEditingName == other.allowCustomerEditingName &&
            allowCustomerEditingState == other.allowCustomerEditingState &&
            allowCustomerEditingStreet == other.allowCustomerEditingStreet &&
            allowCustomerEditingTaxId == other.allowCustomerEditingTaxId &&
            allowCustomerEditingZipcode == other.allowCustomerEditingZipcode &&
            allowDiscountCode == other.allowDiscountCode &&
            allowPhoneNumberCollection == other.allowPhoneNumberCollection &&
            allowTaxId == other.allowTaxId &&
            alwaysCreateNewCustomer == other.alwaysCreateNewCustomer &&
            redirectImmediately == other.redirectImmediately &&
            requirePhoneNumber == other.requirePhoneNumber &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            allowCurrencySelection,
            allowCustomerEditingCity,
            allowCustomerEditingCountry,
            allowCustomerEditingEmail,
            allowCustomerEditingName,
            allowCustomerEditingState,
            allowCustomerEditingStreet,
            allowCustomerEditingTaxId,
            allowCustomerEditingZipcode,
            allowDiscountCode,
            allowPhoneNumberCollection,
            allowTaxId,
            alwaysCreateNewCustomer,
            redirectImmediately,
            requirePhoneNumber,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CheckoutSessionFlags{allowCurrencySelection=$allowCurrencySelection, allowCustomerEditingCity=$allowCustomerEditingCity, allowCustomerEditingCountry=$allowCustomerEditingCountry, allowCustomerEditingEmail=$allowCustomerEditingEmail, allowCustomerEditingName=$allowCustomerEditingName, allowCustomerEditingState=$allowCustomerEditingState, allowCustomerEditingStreet=$allowCustomerEditingStreet, allowCustomerEditingTaxId=$allowCustomerEditingTaxId, allowCustomerEditingZipcode=$allowCustomerEditingZipcode, allowDiscountCode=$allowDiscountCode, allowPhoneNumberCollection=$allowPhoneNumberCollection, allowTaxId=$allowTaxId, alwaysCreateNewCustomer=$alwaysCreateNewCustomer, redirectImmediately=$redirectImmediately, requirePhoneNumber=$requirePhoneNumber, additionalProperties=$additionalProperties}"
}
