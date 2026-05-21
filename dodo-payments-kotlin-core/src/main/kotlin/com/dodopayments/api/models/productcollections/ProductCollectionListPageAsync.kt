// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.productcollections

import com.dodopayments.api.core.AutoPagerAsync
import com.dodopayments.api.core.PageAsync
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.ProductCollectionServiceAsync
import java.util.Objects

/** @see ProductCollectionServiceAsync.list */
class ProductCollectionListPageAsync
private constructor(
    private val service: ProductCollectionServiceAsync,
    private val params: ProductCollectionListParams,
    private val response: ProductCollectionListPageResponse,
) : PageAsync<ProductCollectionListResponse> {

    /**
     * Delegates to [ProductCollectionListPageResponse], but gracefully handles missing data.
     *
     * @see ProductCollectionListPageResponse.items
     */
    override fun items(): List<ProductCollectionListResponse> =
        response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ProductCollectionListParams {
        val pageNumber = params.pageNumber() ?: 1
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override suspend fun nextPage(): ProductCollectionListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ProductCollectionListResponse> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ProductCollectionListParams = params

    /** The response that this page was parsed from. */
    fun response(): ProductCollectionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ProductCollectionListPageAsync].
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

    /** A builder for [ProductCollectionListPageAsync]. */
    class Builder internal constructor() {

        private var service: ProductCollectionServiceAsync? = null
        private var params: ProductCollectionListParams? = null
        private var response: ProductCollectionListPageResponse? = null

        internal fun from(productCollectionListPageAsync: ProductCollectionListPageAsync) = apply {
            service = productCollectionListPageAsync.service
            params = productCollectionListPageAsync.params
            response = productCollectionListPageAsync.response
        }

        fun service(service: ProductCollectionServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ProductCollectionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ProductCollectionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ProductCollectionListPageAsync].
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
        fun build(): ProductCollectionListPageAsync =
            ProductCollectionListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProductCollectionListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ProductCollectionListPageAsync{service=$service, params=$params, response=$response}"
}
