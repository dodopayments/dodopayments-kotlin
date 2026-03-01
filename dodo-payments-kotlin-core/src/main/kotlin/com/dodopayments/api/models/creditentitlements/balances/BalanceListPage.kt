// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.creditentitlements.balances

import com.dodopayments.api.core.AutoPager
import com.dodopayments.api.core.Page
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.blocking.creditentitlements.BalanceService
import java.util.Objects

/** @see BalanceService.list */
class BalanceListPage
private constructor(
    private val service: BalanceService,
    private val params: BalanceListParams,
    private val response: BalanceListPageResponse,
) : Page<CustomerCreditBalance> {

    /**
     * Delegates to [BalanceListPageResponse], but gracefully handles missing data.
     *
     * @see BalanceListPageResponse.items
     */
    override fun items(): List<CustomerCreditBalance> =
        response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): BalanceListParams {
        val pageNumber = params.pageNumber() ?: 1
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): BalanceListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CustomerCreditBalance> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BalanceListParams = params

    /** The response that this page was parsed from. */
    fun response(): BalanceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BalanceListPage].
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

    /** A builder for [BalanceListPage]. */
    class Builder internal constructor() {

        private var service: BalanceService? = null
        private var params: BalanceListParams? = null
        private var response: BalanceListPageResponse? = null

        internal fun from(balanceListPage: BalanceListPage) = apply {
            service = balanceListPage.service
            params = balanceListPage.params
            response = balanceListPage.response
        }

        fun service(service: BalanceService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BalanceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BalanceListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BalanceListPage].
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
        fun build(): BalanceListPage =
            BalanceListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BalanceListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "BalanceListPage{service=$service, params=$params, response=$response}"
}
