// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payouts

import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.blocking.PayoutService
import java.util.Objects

/** @see [PayoutService.list] */
class PayoutListPage
private constructor(
    private val service: PayoutService,
    private val params: PayoutListParams,
    private val response: PayoutListPageResponse,
) {

    /**
     * Delegates to [PayoutListPageResponse], but gracefully handles missing data.
     *
     * @see [PayoutListPageResponse.items]
     */
    fun items(): List<PayoutListResponse> = response._items().getNullable("items") ?: emptyList()

    fun hasNextPage(): Boolean = items().isNotEmpty()

    fun getNextPageParams(): PayoutListParams? {
        if (!hasNextPage()) {
            return null
        }

        val pageNumber = params.pageNumber() ?: 1
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    fun getNextPage(): PayoutListPage? = getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): PayoutListParams = params

    /** The response that this page was parsed from. */
    fun response(): PayoutListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PayoutListPage].
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

    /** A builder for [PayoutListPage]. */
    class Builder internal constructor() {

        private var service: PayoutService? = null
        private var params: PayoutListParams? = null
        private var response: PayoutListPageResponse? = null

        internal fun from(payoutListPage: PayoutListPage) = apply {
            service = payoutListPage.service
            params = payoutListPage.params
            response = payoutListPage.response
        }

        fun service(service: PayoutService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PayoutListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PayoutListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PayoutListPage].
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
        fun build(): PayoutListPage =
            PayoutListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: PayoutListPage) : Sequence<PayoutListResponse> {

        override fun iterator(): Iterator<PayoutListResponse> = iterator {
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

        return /* spotless:off */ other is PayoutListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() = "PayoutListPage{service=$service, params=$params, response=$response}"
}
