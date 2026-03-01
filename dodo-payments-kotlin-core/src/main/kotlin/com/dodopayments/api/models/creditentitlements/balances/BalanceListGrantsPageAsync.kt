// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.creditentitlements.balances

import com.dodopayments.api.core.AutoPagerAsync
import com.dodopayments.api.core.PageAsync
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.creditentitlements.BalanceServiceAsync
import java.util.Objects

/** @see BalanceServiceAsync.listGrants */
class BalanceListGrantsPageAsync
private constructor(
    private val service: BalanceServiceAsync,
    private val params: BalanceListGrantsParams,
    private val response: BalanceListGrantsPageResponse,
) : PageAsync<BalanceListGrantsResponse> {

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

    override suspend fun nextPage(): BalanceListGrantsPageAsync =
        service.listGrants(nextPageParams())

    fun autoPager(): AutoPagerAsync<BalanceListGrantsResponse> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BalanceListGrantsParams = params

    /** The response that this page was parsed from. */
    fun response(): BalanceListGrantsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BalanceListGrantsPageAsync].
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

    /** A builder for [BalanceListGrantsPageAsync]. */
    class Builder internal constructor() {

        private var service: BalanceServiceAsync? = null
        private var params: BalanceListGrantsParams? = null
        private var response: BalanceListGrantsPageResponse? = null

        internal fun from(balanceListGrantsPageAsync: BalanceListGrantsPageAsync) = apply {
            service = balanceListGrantsPageAsync.service
            params = balanceListGrantsPageAsync.params
            response = balanceListGrantsPageAsync.response
        }

        fun service(service: BalanceServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BalanceListGrantsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BalanceListGrantsPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BalanceListGrantsPageAsync].
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
        fun build(): BalanceListGrantsPageAsync =
            BalanceListGrantsPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BalanceListGrantsPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "BalanceListGrantsPageAsync{service=$service, params=$params, response=$response}"
}
