// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.AutoPagerAsync
import com.dodopayments.api.core.PageAsync
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.SubscriptionServiceAsync
import java.util.Objects

/** @see SubscriptionServiceAsync.list */
class SubscriptionListPageAsync
private constructor(
    private val service: SubscriptionServiceAsync,
    private val params: SubscriptionListParams,
    private val response: SubscriptionListPageResponse,
) : PageAsync<SubscriptionListResponse> {

    /**
     * Delegates to [SubscriptionListPageResponse], but gracefully handles missing data.
     *
     * @see SubscriptionListPageResponse.items
     */
    override fun items(): List<SubscriptionListResponse> =
        response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SubscriptionListParams {
        val pageNumber = params.pageNumber() ?: 1
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override suspend fun nextPage(): SubscriptionListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SubscriptionListResponse> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SubscriptionListParams = params

    /** The response that this page was parsed from. */
    fun response(): SubscriptionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SubscriptionListPageAsync].
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

    /** A builder for [SubscriptionListPageAsync]. */
    class Builder internal constructor() {

        private var service: SubscriptionServiceAsync? = null
        private var params: SubscriptionListParams? = null
        private var response: SubscriptionListPageResponse? = null

        internal fun from(subscriptionListPageAsync: SubscriptionListPageAsync) = apply {
            service = subscriptionListPageAsync.service
            params = subscriptionListPageAsync.params
            response = subscriptionListPageAsync.response
        }

        fun service(service: SubscriptionServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SubscriptionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SubscriptionListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [SubscriptionListPageAsync].
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
        fun build(): SubscriptionListPageAsync =
            SubscriptionListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "SubscriptionListPageAsync{service=$service, params=$params, response=$response}"
}
