// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products.shortlinks

import com.dodopayments.api.core.AutoPager
import com.dodopayments.api.core.Page
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.blocking.products.ShortLinkService
import java.util.Objects

/** @see ShortLinkService.list */
class ShortLinkListPage
private constructor(
    private val service: ShortLinkService,
    private val params: ShortLinkListParams,
    private val response: ShortLinkListPageResponse,
) : Page<ShortLinkListResponse> {

    /**
     * Delegates to [ShortLinkListPageResponse], but gracefully handles missing data.
     *
     * @see ShortLinkListPageResponse.items
     */
    override fun items(): List<ShortLinkListResponse> =
        response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ShortLinkListParams {
        val pageNumber = params.pageNumber() ?: 1
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): ShortLinkListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ShortLinkListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ShortLinkListParams = params

    /** The response that this page was parsed from. */
    fun response(): ShortLinkListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ShortLinkListPage].
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

    /** A builder for [ShortLinkListPage]. */
    class Builder internal constructor() {

        private var service: ShortLinkService? = null
        private var params: ShortLinkListParams? = null
        private var response: ShortLinkListPageResponse? = null

        internal fun from(shortLinkListPage: ShortLinkListPage) = apply {
            service = shortLinkListPage.service
            params = shortLinkListPage.params
            response = shortLinkListPage.response
        }

        fun service(service: ShortLinkService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ShortLinkListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ShortLinkListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ShortLinkListPage].
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
        fun build(): ShortLinkListPage =
            ShortLinkListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ShortLinkListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ShortLinkListPage{service=$service, params=$params, response=$response}"
}
