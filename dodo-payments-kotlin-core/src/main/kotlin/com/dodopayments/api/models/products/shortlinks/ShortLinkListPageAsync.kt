// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products.shortlinks

import com.dodopayments.api.core.AutoPagerAsync
import com.dodopayments.api.core.PageAsync
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.products.ShortLinkServiceAsync
import java.util.Objects

/** @see ShortLinkServiceAsync.list */
class ShortLinkListPageAsync
private constructor(
    private val service: ShortLinkServiceAsync,
    private val params: ShortLinkListParams,
    private val response: ShortLinkListPageResponse,
) : PageAsync<ShortLinkListResponse> {

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

    override suspend fun nextPage(): ShortLinkListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ShortLinkListResponse> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ShortLinkListParams = params

    /** The response that this page was parsed from. */
    fun response(): ShortLinkListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ShortLinkListPageAsync].
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

    /** A builder for [ShortLinkListPageAsync]. */
    class Builder internal constructor() {

        private var service: ShortLinkServiceAsync? = null
        private var params: ShortLinkListParams? = null
        private var response: ShortLinkListPageResponse? = null

        internal fun from(shortLinkListPageAsync: ShortLinkListPageAsync) = apply {
            service = shortLinkListPageAsync.service
            params = shortLinkListPageAsync.params
            response = shortLinkListPageAsync.response
        }

        fun service(service: ShortLinkServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ShortLinkListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ShortLinkListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ShortLinkListPageAsync].
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
        fun build(): ShortLinkListPageAsync =
            ShortLinkListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ShortLinkListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ShortLinkListPageAsync{service=$service, params=$params, response=$response}"
}
