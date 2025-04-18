// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payouts

import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.PayoutServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [PayoutServiceAsync.list] */
class PayoutListPageAsync
private constructor(
    private val service: PayoutServiceAsync,
    private val params: PayoutListParams,
    private val response: PayoutListPageResponse,
) {

    /**
     * Delegates to [PayoutListPageResponse], but gracefully handles missing data.
     *
     * @see [PayoutListPageResponse.items]
     */
    fun items(): List<PayoutListResponse> = response._items().getNullable("items") ?: emptyList()

    fun hasNextPage(): Boolean = items().isNotEmpty()

    fun getNextPageParams(): PayoutListParams? {
        if (!hasNextPage()) {
            return null
        }

        val pageNumber = params.pageNumber() ?: 1
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    suspend fun getNextPage(): PayoutListPageAsync? = getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): PayoutListParams = params

    /** The response that this page was parsed from. */
    fun response(): PayoutListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PayoutListPageAsync].
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

    /** A builder for [PayoutListPageAsync]. */
    class Builder internal constructor() {

        private var service: PayoutServiceAsync? = null
        private var params: PayoutListParams? = null
        private var response: PayoutListPageResponse? = null

        internal fun from(payoutListPageAsync: PayoutListPageAsync) = apply {
            service = payoutListPageAsync.service
            params = payoutListPageAsync.params
            response = payoutListPageAsync.response
        }

        fun service(service: PayoutServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PayoutListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PayoutListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PayoutListPageAsync].
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
        fun build(): PayoutListPageAsync =
            PayoutListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: PayoutListPageAsync) : Flow<PayoutListResponse> {

        override suspend fun collect(collector: FlowCollector<PayoutListResponse>) {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.items().size) {
                    collector.emit(page.items()[index++])
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

        return /* spotless:off */ other is PayoutListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "PayoutListPageAsync{service=$service, params=$params, response=$response}"
}
