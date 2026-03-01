// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.creditentitlements

import com.dodopayments.api.core.Params
import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.core.http.QueryParams
import java.util.Objects

/**
 * Returns a paginated list of credit entitlements, allowing filtering of deleted entitlements. By
 * default, only non-deleted entitlements are returned.
 *
 * # Authentication
 * Requires an API key with `Viewer` role or higher.
 *
 * # Query Parameters
 * - `page_size` - Number of items per page (default: 10, max: 100)
 * - `page_number` - Zero-based page number (default: 0)
 * - `deleted` - Boolean flag to list deleted entitlements instead of active ones (default: false)
 *
 * # Responses
 * - `200 OK` - Returns a list of credit entitlements wrapped in a response object
 * - `422 Unprocessable Entity` - Invalid query parameters (e.g., page_size > 100)
 * - `500 Internal Server Error` - Database or server error
 *
 * # Business Logic
 * - Results are ordered by creation date in descending order (newest first)
 * - Only entitlements belonging to the authenticated business are returned
 * - The `deleted` parameter controls visibility of soft-deleted entitlements
 * - Pagination uses offset-based pagination (offset = page_number * page_size)
 */
class CreditEntitlementListParams
private constructor(
    private val deleted: Boolean?,
    private val pageNumber: Int?,
    private val pageSize: Int?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** List deleted credit entitlements */
    fun deleted(): Boolean? = deleted

    /** Page number default is 0 */
    fun pageNumber(): Int? = pageNumber

    /** Page size default is 10 max is 100 */
    fun pageSize(): Int? = pageSize

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): CreditEntitlementListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [CreditEntitlementListParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [CreditEntitlementListParams]. */
    class Builder internal constructor() {

        private var deleted: Boolean? = null
        private var pageNumber: Int? = null
        private var pageSize: Int? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(creditEntitlementListParams: CreditEntitlementListParams) = apply {
            deleted = creditEntitlementListParams.deleted
            pageNumber = creditEntitlementListParams.pageNumber
            pageSize = creditEntitlementListParams.pageSize
            additionalHeaders = creditEntitlementListParams.additionalHeaders.toBuilder()
            additionalQueryParams = creditEntitlementListParams.additionalQueryParams.toBuilder()
        }

        /** List deleted credit entitlements */
        fun deleted(deleted: Boolean?) = apply { this.deleted = deleted }

        /**
         * Alias for [Builder.deleted].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun deleted(deleted: Boolean) = deleted(deleted as Boolean?)

        /** Page number default is 0 */
        fun pageNumber(pageNumber: Int?) = apply { this.pageNumber = pageNumber }

        /**
         * Alias for [Builder.pageNumber].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageNumber(pageNumber: Int) = pageNumber(pageNumber as Int?)

        /** Page size default is 10 max is 100 */
        fun pageSize(pageSize: Int?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Int) = pageSize(pageSize as Int?)

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
         * Returns an immutable instance of [CreditEntitlementListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CreditEntitlementListParams =
            CreditEntitlementListParams(
                deleted,
                pageNumber,
                pageSize,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                deleted?.let { put("deleted", it.toString()) }
                pageNumber?.let { put("page_number", it.toString()) }
                pageSize?.let { put("page_size", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreditEntitlementListParams &&
            deleted == other.deleted &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(deleted, pageNumber, pageSize, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CreditEntitlementListParams{deleted=$deleted, pageNumber=$pageNumber, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
