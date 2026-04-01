// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payouts.breakup.details

import com.dodopayments.api.core.AutoPagerAsync
import com.dodopayments.api.core.PageAsync
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.payouts.breakup.DetailServiceAsync
import java.util.Objects

/** @see DetailServiceAsync.list */
class DetailListPageAsync
private constructor(
    private val service: DetailServiceAsync,
    private val params: DetailListParams,
    private val response: DetailListPageResponse,
) : PageAsync<DetailListResponse> {

    /**
     * Delegates to [DetailListPageResponse], but gracefully handles missing data.
     *
     * @see DetailListPageResponse.items
     */
    override fun items(): List<DetailListResponse> =
        response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DetailListParams {
        val pageNumber = params.pageNumber() ?: 1
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override suspend fun nextPage(): DetailListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<DetailListResponse> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DetailListParams = params

    /** The response that this page was parsed from. */
    fun response(): DetailListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DetailListPageAsync].
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

    /** A builder for [DetailListPageAsync]. */
    class Builder internal constructor() {

        private var service: DetailServiceAsync? = null
        private var params: DetailListParams? = null
        private var response: DetailListPageResponse? = null

        internal fun from(detailListPageAsync: DetailListPageAsync) = apply {
            service = detailListPageAsync.service
            params = detailListPageAsync.params
            response = detailListPageAsync.response
        }

        fun service(service: DetailServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DetailListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DetailListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DetailListPageAsync].
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
        fun build(): DetailListPageAsync =
            DetailListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DetailListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "DetailListPageAsync{service=$service, params=$params, response=$response}"
}
