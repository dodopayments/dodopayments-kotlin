// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.creditentitlements.balances

import com.dodopayments.api.core.AutoPagerAsync
import com.dodopayments.api.core.PageAsync
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.creditentitlements.BalanceServiceAsync
import java.util.Objects

/** @see BalanceServiceAsync.list */
class BalanceListPageAsync
private constructor(
    private val service: BalanceServiceAsync,
    private val params: BalanceListParams,
    private val response: BalanceListPageResponse,
) : PageAsync<CustomerCreditBalance> {

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

    override suspend fun nextPage(): BalanceListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CustomerCreditBalance> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BalanceListParams = params

    /** The response that this page was parsed from. */
    fun response(): BalanceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BalanceListPageAsync].
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

    /** A builder for [BalanceListPageAsync]. */
    class Builder internal constructor() {

        private var service: BalanceServiceAsync? = null
        private var params: BalanceListParams? = null
        private var response: BalanceListPageResponse? = null

        internal fun from(balanceListPageAsync: BalanceListPageAsync) = apply {
            service = balanceListPageAsync.service
            params = balanceListPageAsync.params
            response = balanceListPageAsync.response
        }

        fun service(service: BalanceServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BalanceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BalanceListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BalanceListPageAsync].
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
        fun build(): BalanceListPageAsync =
            BalanceListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BalanceListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "BalanceListPageAsync{service=$service, params=$params, response=$response}"
}
