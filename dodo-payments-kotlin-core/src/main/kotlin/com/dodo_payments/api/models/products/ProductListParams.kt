// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.products

import com.dodo_payments.api.core.NoAutoDetect
import com.dodo_payments.api.core.Params
import com.dodo_payments.api.core.http.Headers
import com.dodo_payments.api.core.http.QueryParams
import java.util.Objects

class ProductListParams
private constructor(
    private val archived: Boolean?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val recurring: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** List archived products */
    fun archived(): Boolean? = archived

    /** Page number default is 0 */
    fun pageNumber(): Long? = pageNumber

    /** Page size default is 10 max is 100 */
    fun pageSize(): Long? = pageSize

    /**
     * Filter products by pricing type:
     * - `true`: Show only recurring pricing products (e.g. subscriptions)
     * - `false`: Show only one-time price products
     * - `null` or absent: Show both types of products
     */
    fun recurring(): Boolean? = recurring

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.archived?.let { queryParams.put("archived", listOf(it.toString())) }
        this.pageNumber?.let { queryParams.put("page_number", listOf(it.toString())) }
        this.pageSize?.let { queryParams.put("page_size", listOf(it.toString())) }
        this.recurring?.let { queryParams.put("recurring", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): ProductListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ProductListParams]. */
        fun builder() = Builder()
    }

    /** A builder for [ProductListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var archived: Boolean? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var recurring: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(productListParams: ProductListParams) = apply {
            archived = productListParams.archived
            pageNumber = productListParams.pageNumber
            pageSize = productListParams.pageSize
            recurring = productListParams.recurring
            additionalHeaders = productListParams.additionalHeaders.toBuilder()
            additionalQueryParams = productListParams.additionalQueryParams.toBuilder()
        }

        /** List archived products */
        fun archived(archived: Boolean?) = apply { this.archived = archived }

        /** List archived products */
        fun archived(archived: Boolean) = archived(archived as Boolean?)

        /** Page number default is 0 */
        fun pageNumber(pageNumber: Long?) = apply { this.pageNumber = pageNumber }

        /** Page number default is 0 */
        fun pageNumber(pageNumber: Long) = pageNumber(pageNumber as Long?)

        /** Page size default is 10 max is 100 */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /** Page size default is 10 max is 100 */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /**
         * Filter products by pricing type:
         * - `true`: Show only recurring pricing products (e.g. subscriptions)
         * - `false`: Show only one-time price products
         * - `null` or absent: Show both types of products
         */
        fun recurring(recurring: Boolean?) = apply { this.recurring = recurring }

        /**
         * Filter products by pricing type:
         * - `true`: Show only recurring pricing products (e.g. subscriptions)
         * - `false`: Show only one-time price products
         * - `null` or absent: Show both types of products
         */
        fun recurring(recurring: Boolean) = recurring(recurring as Boolean?)

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

        fun build(): ProductListParams =
            ProductListParams(
                archived,
                pageNumber,
                pageSize,
                recurring,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProductListParams && archived == other.archived && pageNumber == other.pageNumber && pageSize == other.pageSize && recurring == other.recurring && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(archived, pageNumber, pageSize, recurring, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ProductListParams{archived=$archived, pageNumber=$pageNumber, pageSize=$pageSize, recurring=$recurring, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
