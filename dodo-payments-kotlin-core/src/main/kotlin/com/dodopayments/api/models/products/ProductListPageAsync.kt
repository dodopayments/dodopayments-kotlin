// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.AutoPagerAsync
import com.dodopayments.api.core.PageAsync
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.ProductServiceAsync
import java.util.Objects

/** @see [ProductServiceAsync.list] */
class ProductListPageAsync
private constructor(
    private val service: ProductServiceAsync,
    private val params: ProductListParams,
    private val response: ProductListPageResponse,
) : PageAsync<ProductListResponse> {

    /**
     * Delegates to [ProductListPageResponse], but gracefully handles missing data.
     *
     * @see [ProductListPageResponse.items]
     */
    override fun items(): List<ProductListResponse> =
        response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ProductListParams {
        val pageNumber = params.pageNumber() ?: 1
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override suspend fun nextPage(): ProductListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ProductListResponse> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ProductListParams = params

    /** The response that this page was parsed from. */
    fun response(): ProductListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProductListPageAsync].
         *
         * The following fields are required:
         * ```kotlin
         * .service()
         * .params()
         * .response()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ProductListPageAsync]. */
    class Builder internal constructor() {

        private var service: ProductServiceAsync? = null
        private var params: ProductListParams? = null
        private var response: ProductListPageResponse? = null

        internal fun from(productListPageAsync: ProductListPageAsync) = apply {
            service = productListPageAsync.service
            params = productListPageAsync.params
            response = productListPageAsync.response
        }

        fun service(service: ProductServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ProductListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ProductListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ProductListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ProductListPageAsync =
            ProductListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProductListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ProductListPageAsync{service=$service, params=$params, response=$response}"
}
