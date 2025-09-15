// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.AutoPager
import com.dodopayments.api.core.Page
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.blocking.SubscriptionService
import java.util.Objects

/** @see SubscriptionService.retrieveUsageHistory */
class SubscriptionRetrieveUsageHistoryPage
private constructor(
    private val service: SubscriptionService,
    private val params: SubscriptionRetrieveUsageHistoryParams,
    private val response: SubscriptionRetrieveUsageHistoryPageResponse,
) : Page<SubscriptionRetrieveUsageHistoryResponse> {

    /**
     * Delegates to [SubscriptionRetrieveUsageHistoryPageResponse], but gracefully handles missing
     * data.
     *
     * @see SubscriptionRetrieveUsageHistoryPageResponse.items
     */
    override fun items(): List<SubscriptionRetrieveUsageHistoryResponse> =
        response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SubscriptionRetrieveUsageHistoryParams {
        val pageNumber = params.pageNumber() ?: 1
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): SubscriptionRetrieveUsageHistoryPage =
        service.retrieveUsageHistory(nextPageParams())

    fun autoPager(): AutoPager<SubscriptionRetrieveUsageHistoryResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SubscriptionRetrieveUsageHistoryParams = params

    /** The response that this page was parsed from. */
    fun response(): SubscriptionRetrieveUsageHistoryPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SubscriptionRetrieveUsageHistoryPage].
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

    /** A builder for [SubscriptionRetrieveUsageHistoryPage]. */
    class Builder internal constructor() {

        private var service: SubscriptionService? = null
        private var params: SubscriptionRetrieveUsageHistoryParams? = null
        private var response: SubscriptionRetrieveUsageHistoryPageResponse? = null

        internal fun from(
            subscriptionRetrieveUsageHistoryPage: SubscriptionRetrieveUsageHistoryPage
        ) = apply {
            service = subscriptionRetrieveUsageHistoryPage.service
            params = subscriptionRetrieveUsageHistoryPage.params
            response = subscriptionRetrieveUsageHistoryPage.response
        }

        fun service(service: SubscriptionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SubscriptionRetrieveUsageHistoryParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SubscriptionRetrieveUsageHistoryPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [SubscriptionRetrieveUsageHistoryPage].
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
        fun build(): SubscriptionRetrieveUsageHistoryPage =
            SubscriptionRetrieveUsageHistoryPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionRetrieveUsageHistoryPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "SubscriptionRetrieveUsageHistoryPage{service=$service, params=$params, response=$response}"
}
