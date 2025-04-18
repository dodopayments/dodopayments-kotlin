// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.discounts

import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.blocking.DiscountService
import java.util.Objects

/** @see [DiscountService.list] */
class DiscountListPage
private constructor(
    private val service: DiscountService,
    private val params: DiscountListParams,
    private val response: DiscountListPageResponse,
) {

    /**
     * Delegates to [DiscountListPageResponse], but gracefully handles missing data.
     *
     * @see [DiscountListPageResponse.items]
     */
    fun items(): List<Discount> = response._items().getNullable("items") ?: emptyList()

    fun hasNextPage(): Boolean = items().isNotEmpty()

    fun getNextPageParams(): DiscountListParams? {
        if (!hasNextPage()) {
            return null
        }

        val pageNumber = params.pageNumber() ?: 1
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    fun getNextPage(): DiscountListPage? = getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): DiscountListParams = params

    /** The response that this page was parsed from. */
    fun response(): DiscountListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DiscountListPage].
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

    /** A builder for [DiscountListPage]. */
    class Builder internal constructor() {

        private var service: DiscountService? = null
        private var params: DiscountListParams? = null
        private var response: DiscountListPageResponse? = null

        internal fun from(discountListPage: DiscountListPage) = apply {
            service = discountListPage.service
            params = discountListPage.params
            response = discountListPage.response
        }

        fun service(service: DiscountService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DiscountListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DiscountListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DiscountListPage].
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
        fun build(): DiscountListPage =
            DiscountListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: DiscountListPage) : Sequence<Discount> {

        override fun iterator(): Iterator<Discount> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.items().size) {
                    yield(page.items()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DiscountListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "DiscountListPage{service=$service, params=$params, response=$response}"
}
