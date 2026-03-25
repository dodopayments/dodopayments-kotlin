// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.productcollections

import com.dodopayments.api.core.AutoPager
import com.dodopayments.api.core.Page
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.blocking.ProductCollectionService
import java.util.Objects

/** @see ProductCollectionService.list */
class ProductCollectionListPage
private constructor(
    private val service: ProductCollectionService,
    private val params: ProductCollectionListParams,
    private val response: ProductCollectionListPageResponse,
) : Page<ProductCollectionListResponse> {

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

    override fun nextPage(): ProductCollectionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ProductCollectionListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ProductCollectionListParams = params

    /** The response that this page was parsed from. */
    fun response(): ProductCollectionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProductCollectionListPage].
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

    /** A builder for [ProductCollectionListPage]. */
    class Builder internal constructor() {

        private var service: ProductCollectionService? = null
        private var params: ProductCollectionListParams? = null
        private var response: ProductCollectionListPageResponse? = null

        internal fun from(productCollectionListPage: ProductCollectionListPage) = apply {
            service = productCollectionListPage.service
            params = productCollectionListPage.params
            response = productCollectionListPage.response
        }

        fun service(service: ProductCollectionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ProductCollectionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ProductCollectionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ProductCollectionListPage].
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
        fun build(): ProductCollectionListPage =
            ProductCollectionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProductCollectionListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ProductCollectionListPage{service=$service, params=$params, response=$response}"
}
