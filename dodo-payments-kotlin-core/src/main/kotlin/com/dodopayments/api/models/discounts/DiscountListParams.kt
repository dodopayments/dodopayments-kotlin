// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.discounts

import com.dodopayments.api.core.Params
import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.core.http.QueryParams
import java.util.Objects

/** GET /discounts */
class DiscountListParams
private constructor(
    private val active: Boolean?,
    private val code: String?,
    private val discountType: DiscountType?,
    private val pageNumber: Int?,
    private val pageSize: Int?,
    private val productId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Filter by active status. `true` = currently redeemable (started, not expired, not
     * usage-exhausted). `false` = not currently redeemable (expired, usage-exhausted, or pending a
     * future `starts_at`).
     */
    fun active(): Boolean? = active

    /** Filter by discount code (partial match, case-insensitive) */
    fun code(): String? = code

    /** Filter by discount type */
    fun discountType(): DiscountType? = discountType

    /** Page number (default = 0). */
    fun pageNumber(): Int? = pageNumber

    /** Page size (default = 10, max = 100). */
    fun pageSize(): Int? = pageSize

    /** Filter by product restriction (only discounts that apply to this product) */
    fun productId(): String? = productId

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): DiscountListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [DiscountListParams]. */
        fun builder() = Builder()
    }

    /** A builder for [DiscountListParams]. */
    class Builder internal constructor() {

        private var active: Boolean? = null
        private var code: String? = null
        private var discountType: DiscountType? = null
        private var pageNumber: Int? = null
        private var pageSize: Int? = null
        private var productId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(discountListParams: DiscountListParams) = apply {
            active = discountListParams.active
            code = discountListParams.code
            discountType = discountListParams.discountType
            pageNumber = discountListParams.pageNumber
            pageSize = discountListParams.pageSize
            productId = discountListParams.productId
            additionalHeaders = discountListParams.additionalHeaders.toBuilder()
            additionalQueryParams = discountListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Filter by active status. `true` = currently redeemable (started, not expired, not
         * usage-exhausted). `false` = not currently redeemable (expired, usage-exhausted, or
         * pending a future `starts_at`).
         */
        fun active(active: Boolean?) = apply { this.active = active }

        /**
         * Alias for [Builder.active].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun active(active: Boolean) = active(active as Boolean?)

        /** Filter by discount code (partial match, case-insensitive) */
        fun code(code: String?) = apply { this.code = code }

        /** Filter by discount type */
        fun discountType(discountType: DiscountType?) = apply { this.discountType = discountType }

        /** Page number (default = 0). */
        fun pageNumber(pageNumber: Int?) = apply { this.pageNumber = pageNumber }

        /**
         * Alias for [Builder.pageNumber].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageNumber(pageNumber: Int) = pageNumber(pageNumber as Int?)

        /** Page size (default = 10, max = 100). */
        fun pageSize(pageSize: Int?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Int) = pageSize(pageSize as Int?)

        /** Filter by product restriction (only discounts that apply to this product) */
        fun productId(productId: String?) = apply { this.productId = productId }

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
         * Returns an immutable instance of [DiscountListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DiscountListParams =
            DiscountListParams(
                active,
                code,
                discountType,
                pageNumber,
                pageSize,
                productId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                active?.let { put("active", it.toString()) }
                code?.let { put("code", it) }
                discountType?.let { put("discount_type", it.toString()) }
                pageNumber?.let { put("page_number", it.toString()) }
                pageSize?.let { put("page_size", it.toString()) }
                productId?.let { put("product_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DiscountListParams &&
            active == other.active &&
            code == other.code &&
            discountType == other.discountType &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            productId == other.productId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            active,
            code,
            discountType,
            pageNumber,
            pageSize,
            productId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "DiscountListParams{active=$active, code=$code, discountType=$discountType, pageNumber=$pageNumber, pageSize=$pageSize, productId=$productId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
