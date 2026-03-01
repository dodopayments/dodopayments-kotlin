// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.creditentitlements.balances

import com.dodopayments.api.core.AutoPager
import com.dodopayments.api.core.Page
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.blocking.creditentitlements.BalanceService
import java.util.Objects

/** @see BalanceService.listGrants */
class BalanceListGrantsPage
private constructor(
    private val service: BalanceService,
    private val params: BalanceListGrantsParams,
    private val response: BalanceListGrantsPageResponse,
) : Page<BalanceListGrantsResponse> {

    /**
     * Delegates to [BalanceListGrantsPageResponse], but gracefully handles missing data.
     *
     * @see BalanceListGrantsPageResponse.items
     */
    override fun items(): List<BalanceListGrantsResponse> =
        response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): BalanceListGrantsParams {
        val pageNumber = params.pageNumber() ?: 1
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): BalanceListGrantsPage = service.listGrants(nextPageParams())

    fun autoPager(): AutoPager<BalanceListGrantsResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BalanceListGrantsParams = params

    /** The response that this page was parsed from. */
    fun response(): BalanceListGrantsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BalanceListGrantsPage].
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

    /** A builder for [BalanceListGrantsPage]. */
    class Builder internal constructor() {

        private var service: BalanceService? = null
        private var params: BalanceListGrantsParams? = null
        private var response: BalanceListGrantsPageResponse? = null

        internal fun from(balanceListGrantsPage: BalanceListGrantsPage) = apply {
            service = balanceListGrantsPage.service
            params = balanceListGrantsPage.params
            response = balanceListGrantsPage.response
        }

        fun service(service: BalanceService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BalanceListGrantsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BalanceListGrantsPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BalanceListGrantsPage].
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
        fun build(): BalanceListGrantsPage =
            BalanceListGrantsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BalanceListGrantsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "BalanceListGrantsPage{service=$service, params=$params, response=$response}"
}
