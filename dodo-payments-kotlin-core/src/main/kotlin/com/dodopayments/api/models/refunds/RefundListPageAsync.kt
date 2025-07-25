// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.refunds

import com.dodopayments.api.core.AutoPagerAsync
import com.dodopayments.api.core.PageAsync
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.RefundServiceAsync
import java.util.Objects

/** @see RefundServiceAsync.list */
class RefundListPageAsync
private constructor(
    private val service: RefundServiceAsync,
    private val params: RefundListParams,
    private val response: RefundListPageResponse,
) : PageAsync<Refund> {

    /**
     * Delegates to [RefundListPageResponse], but gracefully handles missing data.
     *
     * @see RefundListPageResponse.items
     */
    override fun items(): List<Refund> = response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): RefundListParams {
        val pageNumber = params.pageNumber() ?: 1
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override suspend fun nextPage(): RefundListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Refund> = AutoPagerAsync.from(this)

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
