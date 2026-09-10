// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers.emails

import com.dodopayments.api.core.Params
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.core.http.QueryParams
import java.util.Objects

/**
 * Returns the email exactly as it was sent, plus the reason it failed when it did. Some emails have
 * no body to show: an authentication email carries a live login token, a blocked email never
 * reached the provider, and the provider clears bodies at 180 days.
 */
class EmailRetrieveBodyParams
private constructor(
    private val customerId: String,
    private val emailLogId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun customerId(): String = customerId

    fun emailLogId(): String? = emailLogId

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EmailRetrieveBodyParams].
         *
         * The following fields are required:
         * ```kotlin
         * .customerId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [EmailRetrieveBodyParams]. */
    class Builder internal constructor() {

        private var customerId: String? = null
        private var emailLogId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(emailRetrieveBodyParams: EmailRetrieveBodyParams) = apply {
            customerId = emailRetrieveBodyParams.customerId
            emailLogId = emailRetrieveBodyParams.emailLogId
            additionalHeaders = emailRetrieveBodyParams.additionalHeaders.toBuilder()
            additionalQueryParams = emailRetrieveBodyParams.additionalQueryParams.toBuilder()
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        fun emailLogId(emailLogId: String?) = apply { this.emailLogId = emailLogId }

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
         * Returns an immutable instance of [EmailRetrieveBodyParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .customerId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EmailRetrieveBodyParams =
            EmailRetrieveBodyParams(
                checkRequired("customerId", customerId),
                emailLogId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> customerId
            1 -> emailLogId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailRetrieveBodyParams &&
            customerId == other.customerId &&
            emailLogId == other.emailLogId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(customerId, emailLogId, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "EmailRetrieveBodyParams{customerId=$customerId, emailLogId=$emailLogId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
