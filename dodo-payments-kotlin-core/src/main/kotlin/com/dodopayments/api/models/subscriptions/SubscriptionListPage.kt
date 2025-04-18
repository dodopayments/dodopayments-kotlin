// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.blocking.SubscriptionService
import java.util.Objects

/** @see [SubscriptionService.list] */
class SubscriptionListPage
private constructor(
    private val service: SubscriptionService,
    private val params: SubscriptionListParams,
    private val response: SubscriptionListPageResponse,
) {

    /**
     * Delegates to [SubscriptionListPageResponse], but gracefully handles missing data.
     *
     * @see [SubscriptionListPageResponse.items]
     */
    fun items(): List<Subscription> = response._items().getNullable("items") ?: emptyList()

    fun hasNextPage(): Boolean = items().isNotEmpty()

    fun getNextPageParams(): SubscriptionListParams? {
        if (!hasNextPage()) {
            return null
        }

        val pageNumber = params.pageNumber() ?: 1
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    fun getNextPage(): SubscriptionListPage? = getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): SubscriptionListParams = params

    /** The response that this page was parsed from. */
    fun response(): SubscriptionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SubscriptionListPage].
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

    /** A builder for [SubscriptionListPage]. */
    class Builder internal constructor() {

        private var service: SubscriptionService? = null
        private var params: SubscriptionListParams? = null
        private var response: SubscriptionListPageResponse? = null

        internal fun from(subscriptionListPage: SubscriptionListPage) = apply {
            service = subscriptionListPage.service
            params = subscriptionListPage.params
            response = subscriptionListPage.response
        }

        fun service(service: SubscriptionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SubscriptionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SubscriptionListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [SubscriptionListPage].
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
        fun build(): SubscriptionListPage =
            SubscriptionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: SubscriptionListPage) : Sequence<Subscription> {

        override fun iterator(): Iterator<Subscription> = iterator {
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

        return /* spotless:off */ other is SubscriptionListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "SubscriptionListPage{service=$service, params=$params, response=$response}"
}
