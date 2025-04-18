// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.refunds

import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.RefundServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [RefundServiceAsync.list] */
class RefundListPageAsync
private constructor(
    private val service: RefundServiceAsync,
    private val params: RefundListParams,
    private val response: RefundListPageResponse,
) {

    /**
     * Delegates to [RefundListPageResponse], but gracefully handles missing data.
     *
     * @see [RefundListPageResponse.items]
     */
    fun items(): List<Refund> = response._items().getNullable("items") ?: emptyList()

    fun hasNextPage(): Boolean = items().isNotEmpty()

    fun getNextPageParams(): RefundListParams? {
        if (!hasNextPage()) {
            return null
        }

        val pageNumber = params.pageNumber() ?: 1
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    suspend fun getNextPage(): RefundListPageAsync? = getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): RefundListParams = params

    /** The response that this page was parsed from. */
    fun response(): RefundListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RefundListPageAsync].
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

    /** A builder for [RefundListPageAsync]. */
    class Builder internal constructor() {

        private var service: RefundServiceAsync? = null
        private var params: RefundListParams? = null
        private var response: RefundListPageResponse? = null

        internal fun from(refundListPageAsync: RefundListPageAsync) = apply {
            service = refundListPageAsync.service
            params = refundListPageAsync.params
            response = refundListPageAsync.response
        }

        fun service(service: RefundServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: RefundListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RefundListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RefundListPageAsync].
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
        fun build(): RefundListPageAsync =
            RefundListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: RefundListPageAsync) : Flow<Refund> {

        override suspend fun collect(collector: FlowCollector<Refund>) {
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

        return /* spotless:off */ other is RefundListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "RefundListPageAsync{service=$service, params=$params, response=$response}"
}
