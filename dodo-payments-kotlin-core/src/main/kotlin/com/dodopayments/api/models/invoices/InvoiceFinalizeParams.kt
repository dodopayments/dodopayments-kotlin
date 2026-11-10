// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.invoices

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.Params
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.core.http.QueryParams
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

/**
 * Issues the draft. With `send: true`, the invoice email goes out after the issue. A failed send
 * keeps the invoice issued. Call `/send` again with the new `ETag`.
 */
class InvoiceFinalizeParams
private constructor(
    private val invoiceId: String?,
    private val ifMatch: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun invoiceId(): String? = invoiceId

    fun ifMatch(): String = ifMatch

    /**
     * 10 addresses or fewer.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ccEmails(): List<String>? = body.ccEmails()

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun customerEmail(): String? = body.customerEmail()

    /**
     * `true` sends the invoice email after finalise.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun send(): Boolean? = body.send()

    /**
     * Returns the raw JSON value of [ccEmails].
     *
     * Unlike [ccEmails], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _ccEmails(): JsonField<List<String>> = body._ccEmails()

    /**
     * Returns the raw JSON value of [customerEmail].
     *
     * Unlike [customerEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customerEmail(): JsonField<String> = body._customerEmail()

    /**
     * Returns the raw JSON value of [send].
     *
     * Unlike [send], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _send(): JsonField<Boolean> = body._send()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InvoiceFinalizeParams].
         *
         * The following fields are required:
         * ```kotlin
         * .ifMatch()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [InvoiceFinalizeParams]. */
    class Builder internal constructor() {

        private var invoiceId: String? = null
        private var ifMatch: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(invoiceFinalizeParams: InvoiceFinalizeParams) = apply {
            invoiceId = invoiceFinalizeParams.invoiceId
            ifMatch = invoiceFinalizeParams.ifMatch
            body = invoiceFinalizeParams.body.toBuilder()
            additionalHeaders = invoiceFinalizeParams.additionalHeaders.toBuilder()
            additionalQueryParams = invoiceFinalizeParams.additionalQueryParams.toBuilder()
        }

        fun invoiceId(invoiceId: String?) = apply { this.invoiceId = invoiceId }

        fun ifMatch(ifMatch: String) = apply { this.ifMatch = ifMatch }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [ccEmails]
         * - [customerEmail]
         * - [send]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** 10 addresses or fewer. */
        fun ccEmails(ccEmails: List<String>?) = apply { body.ccEmails(ccEmails) }

        /**
         * Sets [Builder.ccEmails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ccEmails] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ccEmails(ccEmails: JsonField<List<String>>) = apply { body.ccEmails(ccEmails) }

        /**
         * Adds a single [String] to [ccEmails].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCcEmail(ccEmail: String) = apply { body.addCcEmail(ccEmail) }

        fun customerEmail(customerEmail: String?) = apply { body.customerEmail(customerEmail) }

        /**
         * Sets [Builder.customerEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerEmail] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerEmail(customerEmail: JsonField<String>) = apply {
            body.customerEmail(customerEmail)
        }

        /** `true` sends the invoice email after finalise. */
        fun send(send: Boolean) = apply { body.send(send) }

        /**
         * Sets [Builder.send] to an arbitrary JSON value.
         *
         * You should usually call [Builder.send] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun send(send: JsonField<Boolean>) = apply { body.send(send) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [InvoiceFinalizeParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .ifMatch()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InvoiceFinalizeParams =
            InvoiceFinalizeParams(
                invoiceId,
                checkRequired("ifMatch", ifMatch),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> invoiceId ?: ""
            else -> ""
        }

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                put("If-Match", ifMatch)
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val ccEmails: JsonField<List<String>>,
        private val customerEmail: JsonField<String>,
        private val send: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("cc_emails")
            @ExcludeMissing
            ccEmails: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("customer_email")
            @ExcludeMissing
            customerEmail: JsonField<String> = JsonMissing.of(),
            @JsonProperty("send") @ExcludeMissing send: JsonField<Boolean> = JsonMissing.of(),
        ) : this(ccEmails, customerEmail, send, mutableMapOf())

        /**
         * 10 addresses or fewer.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun ccEmails(): List<String>? = ccEmails.getNullable("cc_emails")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun customerEmail(): String? = customerEmail.getNullable("customer_email")

        /**
         * `true` sends the invoice email after finalise.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun send(): Boolean? = send.getNullable("send")

        /**
         * Returns the raw JSON value of [ccEmails].
         *
         * Unlike [ccEmails], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cc_emails")
        @ExcludeMissing
        fun _ccEmails(): JsonField<List<String>> = ccEmails

        /**
         * Returns the raw JSON value of [customerEmail].
         *
         * Unlike [customerEmail], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("customer_email")
        @ExcludeMissing
        fun _customerEmail(): JsonField<String> = customerEmail

        /**
         * Returns the raw JSON value of [send].
         *
         * Unlike [send], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("send") @ExcludeMissing fun _send(): JsonField<Boolean> = send

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var ccEmails: JsonField<MutableList<String>>? = null
            private var customerEmail: JsonField<String> = JsonMissing.of()
            private var send: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                ccEmails = body.ccEmails.map { it.toMutableList() }
                customerEmail = body.customerEmail
                send = body.send
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** 10 addresses or fewer. */
            fun ccEmails(ccEmails: List<String>?) = ccEmails(JsonField.ofNullable(ccEmails))

            /**
             * Sets [Builder.ccEmails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ccEmails] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ccEmails(ccEmails: JsonField<List<String>>) = apply {
                this.ccEmails = ccEmails.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [ccEmails].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCcEmail(ccEmail: String) = apply {
                ccEmails =
                    (ccEmails ?: JsonField.of(mutableListOf())).also {
                        checkKnown("ccEmails", it).add(ccEmail)
                    }
            }

            fun customerEmail(customerEmail: String?) =
                customerEmail(JsonField.ofNullable(customerEmail))

            /**
             * Sets [Builder.customerEmail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerEmail] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerEmail(customerEmail: JsonField<String>) = apply {
                this.customerEmail = customerEmail
            }

            /** `true` sends the invoice email after finalise. */
            fun send(send: Boolean) = send(JsonField.of(send))

            /**
             * Sets [Builder.send] to an arbitrary JSON value.
             *
             * You should usually call [Builder.send] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun send(send: JsonField<Boolean>) = apply { this.send = send }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    (ccEmails ?: JsonMissing.of()).map { it.toImmutable() },
                    customerEmail,
                    send,
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            ccEmails()
            customerEmail()
            send()
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
            (ccEmails.asKnown()?.size ?: 0) +
                (if (customerEmail.asKnown() == null) 0 else 1) +
                (if (send.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                ccEmails == other.ccEmails &&
                customerEmail == other.customerEmail &&
                send == other.send &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(ccEmails, customerEmail, send, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{ccEmails=$ccEmails, customerEmail=$customerEmail, send=$send, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InvoiceFinalizeParams &&
            invoiceId == other.invoiceId &&
            ifMatch == other.ifMatch &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(invoiceId, ifMatch, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "InvoiceFinalizeParams{invoiceId=$invoiceId, ifMatch=$ifMatch, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
