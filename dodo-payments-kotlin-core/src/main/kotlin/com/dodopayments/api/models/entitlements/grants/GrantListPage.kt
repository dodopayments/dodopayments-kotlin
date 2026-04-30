// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements.grants

import com.dodopayments.api.core.AutoPager
import com.dodopayments.api.core.Page
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.blocking.entitlements.GrantService
import java.util.Objects

/** @see GrantService.list */
class GrantListPage
private constructor(
    private val service: GrantService,
    private val params: GrantListParams,
    private val response: GrantListPageResponse,
) : Page<GrantListResponse> {

    /**
     * Delegates to [GrantListPageResponse], but gracefully handles missing data.
     *
     * @see GrantListPageResponse.items
     */
    override fun items(): List<GrantListResponse> =
        response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): GrantListParams {
        val pageNumber = params.pageNumber() ?: 1
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): GrantListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<GrantListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): GrantListParams = params

    /** The response that this page was parsed from. */
    fun response(): GrantListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [GrantListPage].
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

    /** A builder for [GrantListPage]. */
    class Builder internal constructor() {

        private var service: GrantService? = null
        private var params: GrantListParams? = null
        private var response: GrantListPageResponse? = null

        internal fun from(grantListPage: GrantListPage) = apply {
            service = grantListPage.service
            params = grantListPage.params
            response = grantListPage.response
        }

        fun service(service: GrantService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: GrantListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: GrantListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [GrantListPage].
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
        fun build(): GrantListPage =
            GrantListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GrantListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "GrantListPage{service=$service, params=$params, response=$response}"
}
