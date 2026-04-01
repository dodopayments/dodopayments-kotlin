// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payouts.breakup.details

import com.dodopayments.api.core.AutoPager
import com.dodopayments.api.core.Page
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.blocking.payouts.breakup.DetailService
import java.util.Objects

/** @see DetailService.list */
class DetailListPage
private constructor(
    private val service: DetailService,
    private val params: DetailListParams,
    private val response: DetailListPageResponse,
) : Page<DetailListResponse> {

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

    override fun nextPage(): DetailListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<DetailListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DetailListParams = params

    /** The response that this page was parsed from. */
    fun response(): DetailListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DetailListPage].
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

    /** A builder for [DetailListPage]. */
    class Builder internal constructor() {

        private var service: DetailService? = null
        private var params: DetailListParams? = null
        private var response: DetailListPageResponse? = null

        internal fun from(detailListPage: DetailListPage) = apply {
            service = detailListPage.service
            params = detailListPage.params
            response = detailListPage.response
        }

        fun service(service: DetailService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DetailListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DetailListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DetailListPage].
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
        fun build(): DetailListPage =
            DetailListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DetailListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "DetailListPage{service=$service, params=$params, response=$response}"
}
