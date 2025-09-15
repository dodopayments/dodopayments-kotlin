// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers.wallets.ledgerentries

import com.dodopayments.api.core.AutoPager
import com.dodopayments.api.core.Page
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.blocking.customers.wallets.LedgerEntryService
import java.util.Objects

/** @see LedgerEntryService.list */
class LedgerEntryListPage
private constructor(
    private val service: LedgerEntryService,
    private val params: LedgerEntryListParams,
    private val response: LedgerEntryListPageResponse,
) : Page<CustomerWalletTransaction> {

    /**
     * Delegates to [LedgerEntryListPageResponse], but gracefully handles missing data.
     *
     * @see LedgerEntryListPageResponse.items
     */
    override fun items(): List<CustomerWalletTransaction> =
        response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): LedgerEntryListParams {
        val pageNumber = params.pageNumber() ?: 1
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): LedgerEntryListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CustomerWalletTransaction> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LedgerEntryListParams = params

    /** The response that this page was parsed from. */
    fun response(): LedgerEntryListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LedgerEntryListPage].
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

    /** A builder for [LedgerEntryListPage]. */
    class Builder internal constructor() {

        private var service: LedgerEntryService? = null
        private var params: LedgerEntryListParams? = null
        private var response: LedgerEntryListPageResponse? = null

        internal fun from(ledgerEntryListPage: LedgerEntryListPage) = apply {
            service = ledgerEntryListPage.service
            params = ledgerEntryListPage.params
            response = ledgerEntryListPage.response
        }

        fun service(service: LedgerEntryService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LedgerEntryListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: LedgerEntryListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [LedgerEntryListPage].
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
        fun build(): LedgerEntryListPage =
            LedgerEntryListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LedgerEntryListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "LedgerEntryListPage{service=$service, params=$params, response=$response}"
}
