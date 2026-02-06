// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.balances

import com.dodopayments.api.core.AutoPager
import com.dodopayments.api.core.Page
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.blocking.BalanceService
import java.util.Objects

/** @see BalanceService.retrieveLedger */
class BalanceRetrieveLedgerPage
private constructor(
    private val service: BalanceService,
    private val params: BalanceRetrieveLedgerParams,
    private val response: BalanceRetrieveLedgerPageResponse,
) : Page<BalanceLedgerEntry> {

    /**
     * Delegates to [BalanceRetrieveLedgerPageResponse], but gracefully handles missing data.
     *
     * @see BalanceRetrieveLedgerPageResponse.items
     */
    override fun items(): List<BalanceLedgerEntry> =
        response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): BalanceRetrieveLedgerParams {
        val pageNumber = params.pageNumber() ?: 1
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): BalanceRetrieveLedgerPage = service.retrieveLedger(nextPageParams())

    fun autoPager(): AutoPager<BalanceLedgerEntry> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BalanceRetrieveLedgerParams = params

    /** The response that this page was parsed from. */
    fun response(): BalanceRetrieveLedgerPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BalanceRetrieveLedgerPage].
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

    /** A builder for [BalanceRetrieveLedgerPage]. */
    class Builder internal constructor() {

        private var service: BalanceService? = null
        private var params: BalanceRetrieveLedgerParams? = null
        private var response: BalanceRetrieveLedgerPageResponse? = null

        internal fun from(balanceRetrieveLedgerPage: BalanceRetrieveLedgerPage) = apply {
            service = balanceRetrieveLedgerPage.service
            params = balanceRetrieveLedgerPage.params
            response = balanceRetrieveLedgerPage.response
        }

        fun service(service: BalanceService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BalanceRetrieveLedgerParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BalanceRetrieveLedgerPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [BalanceRetrieveLedgerPage].
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
        fun build(): BalanceRetrieveLedgerPage =
            BalanceRetrieveLedgerPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BalanceRetrieveLedgerPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "BalanceRetrieveLedgerPage{service=$service, params=$params, response=$response}"
}
