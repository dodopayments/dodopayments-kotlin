// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.disputes

import com.dodopayments.api.core.AutoPagerAsync
import com.dodopayments.api.core.PageAsync
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.DisputeServiceAsync
import java.util.Objects

/** @see DisputeServiceAsync.list */
class DisputeListPageAsync
private constructor(
    private val service: DisputeServiceAsync,
    private val params: DisputeListParams,
    private val response: DisputeListPageResponse,
) : PageAsync<DisputeListResponse> {

    /**
     * Delegates to [DisputeListPageResponse], but gracefully handles missing data.
     *
     * @see DisputeListPageResponse.items
     */
    override fun items(): List<DisputeListResponse> =
        response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DisputeListParams {
        val pageNumber = params.pageNumber() ?: 1
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override suspend fun nextPage(): DisputeListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<DisputeListResponse> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DisputeListParams = params

    /** The response that this page was parsed from. */
    fun response(): DisputeListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DisputeListPageAsync].
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

    /** A builder for [DisputeListPageAsync]. */
    class Builder internal constructor() {

        private var service: DisputeServiceAsync? = null
        private var params: DisputeListParams? = null
        private var response: DisputeListPageResponse? = null

        internal fun from(disputeListPageAsync: DisputeListPageAsync) = apply {
            service = disputeListPageAsync.service
            params = disputeListPageAsync.params
            response = disputeListPageAsync.response
        }

        fun service(service: DisputeServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DisputeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DisputeListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DisputeListPageAsync].
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
        fun build(): DisputeListPageAsync =
            DisputeListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DisputeListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "DisputeListPageAsync{service=$service, params=$params, response=$response}"
}
