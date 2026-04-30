// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements

import com.dodopayments.api.core.AutoPager
import com.dodopayments.api.core.Page
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.blocking.EntitlementService
import java.util.Objects

/** @see EntitlementService.list */
class EntitlementListPage
private constructor(
    private val service: EntitlementService,
    private val params: EntitlementListParams,
    private val response: EntitlementListPageResponse,
) : Page<EntitlementListResponse> {

    /**
     * Delegates to [EntitlementListPageResponse], but gracefully handles missing data.
     *
     * @see EntitlementListPageResponse.items
     */
    override fun items(): List<EntitlementListResponse> =
        response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EntitlementListParams {
        val pageNumber = params.pageNumber() ?: 1
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): EntitlementListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EntitlementListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EntitlementListParams = params

    /** The response that this page was parsed from. */
    fun response(): EntitlementListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EntitlementListPage].
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

    /** A builder for [EntitlementListPage]. */
    class Builder internal constructor() {

        private var service: EntitlementService? = null
        private var params: EntitlementListParams? = null
        private var response: EntitlementListPageResponse? = null

        internal fun from(entitlementListPage: EntitlementListPage) = apply {
            service = entitlementListPage.service
            params = entitlementListPage.params
            response = entitlementListPage.response
        }

        fun service(service: EntitlementService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EntitlementListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EntitlementListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EntitlementListPage].
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
        fun build(): EntitlementListPage =
            EntitlementListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EntitlementListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "EntitlementListPage{service=$service, params=$params, response=$response}"
}
