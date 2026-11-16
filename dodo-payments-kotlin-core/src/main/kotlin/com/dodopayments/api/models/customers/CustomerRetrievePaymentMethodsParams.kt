// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers

import com.dodopayments.api.core.Params
import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.core.http.QueryParams
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import java.util.Objects

class CustomerRetrievePaymentMethodsParams
private constructor(
    private val customerId: String?,
    private val billingCountry: CountryCode?,
    private val currency: Currency?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun customerId(): String? = customerId

    /** ISO country code alpha2 variant */
    fun billingCountry(): CountryCode? = billingCountry

    fun currency(): Currency? = currency

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): CustomerRetrievePaymentMethodsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerRetrievePaymentMethodsParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [CustomerRetrievePaymentMethodsParams]. */
    class Builder internal constructor() {

        private var customerId: String? = null
        private var billingCountry: CountryCode? = null
        private var currency: Currency? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            customerRetrievePaymentMethodsParams: CustomerRetrievePaymentMethodsParams
        ) = apply {
            customerId = customerRetrievePaymentMethodsParams.customerId
            billingCountry = customerRetrievePaymentMethodsParams.billingCountry
            currency = customerRetrievePaymentMethodsParams.currency
            additionalHeaders = customerRetrievePaymentMethodsParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                customerRetrievePaymentMethodsParams.additionalQueryParams.toBuilder()
        }

        fun customerId(customerId: String?) = apply { this.customerId = customerId }

        /** ISO country code alpha2 variant */
        fun billingCountry(billingCountry: CountryCode?) = apply {
            this.billingCountry = billingCountry
        }

        fun currency(currency: Currency?) = apply { this.currency = currency }

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
         * Returns an immutable instance of [CustomerRetrievePaymentMethodsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CustomerRetrievePaymentMethodsParams =
            CustomerRetrievePaymentMethodsParams(
                customerId,
                billingCountry,
                currency,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> customerId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                billingCountry?.let { put("billing_country", it.toString()) }
                currency?.let { put("currency", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerRetrievePaymentMethodsParams &&
            customerId == other.customerId &&
            billingCountry == other.billingCountry &&
            currency == other.currency &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(customerId, billingCountry, currency, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CustomerRetrievePaymentMethodsParams{customerId=$customerId, billingCountry=$billingCountry, currency=$currency, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
