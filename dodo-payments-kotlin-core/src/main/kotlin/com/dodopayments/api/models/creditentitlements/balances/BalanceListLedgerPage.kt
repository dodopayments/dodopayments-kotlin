// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.creditentitlements.balances

import com.dodopayments.api.core.AutoPager
import com.dodopayments.api.core.Page
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.blocking.creditentitlements.BalanceService
import java.util.Objects

/** @see BalanceService.listLedger */
class BalanceListLedgerPage
private constructor(
    private val service: BalanceService,
    private val params: BalanceListLedgerParams,
    private val response: BalanceListLedgerPageResponse,
) : Page<CreditLedgerEntry> {

    /**
     * Delegates to [BalanceListLedgerPageResponse], but gracefully handles missing data.
     *
     * @see BalanceListLedgerPageResponse.items
     */
    override fun items(): List<CreditLedgerEntry> =
        response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): BalanceListLedgerParams {
        val pageNumber = params.pageNumber() ?: 1
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): BalanceListLedgerPage = service.listLedger(nextPageParams())

    fun autoPager(): AutoPager<CreditLedgerEntry> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BalanceListLedgerParams = params

    /** The response that this page was parsed from. */
    fun response(): BalanceListLedgerPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BalanceListLedgerPage].
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

    /** A builder for [BalanceListLedgerPage]. */
    class Builder internal constructor() {

        private var service: BalanceService? = null
        private var params: BalanceListLedgerParams? = null
        private var response: BalanceListLedgerPageResponse? = null

        internal fun from(balanceListLedgerPage: BalanceListLedgerPage) = apply {
            service = balanceListLedgerPage.service
            params = balanceListLedgerPage.params
            response = balanceListLedgerPage.response
        }

        fun service(service: BalanceService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BalanceListLedgerParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BalanceListLedgerPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BalanceListLedgerPage].
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
        fun build(): BalanceListLedgerPage =
            BalanceListLedgerPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BalanceListLedgerPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "BalanceListLedgerPage{service=$service, params=$params, response=$response}"
}
