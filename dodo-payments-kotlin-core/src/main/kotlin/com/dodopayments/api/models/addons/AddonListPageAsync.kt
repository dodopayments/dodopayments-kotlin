// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.addons

import com.dodopayments.api.core.AutoPagerAsync
import com.dodopayments.api.core.PageAsync
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.AddonServiceAsync
import java.util.Objects

/** @see AddonServiceAsync.list */
class AddonListPageAsync
private constructor(
    private val service: AddonServiceAsync,
    private val params: AddonListParams,
    private val response: AddonListPageResponse,
) : PageAsync<AddonResponse> {

    /**
     * Delegates to [AddonListPageResponse], but gracefully handles missing data.
     *
     * @see AddonListPageResponse.items
     */
    override fun items(): List<AddonResponse> =
        response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AddonListParams {
        val pageNumber = params.pageNumber() ?: 1
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override suspend fun nextPage(): AddonListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AddonResponse> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AddonListParams = params

    /** The response that this page was parsed from. */
    fun response(): AddonListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AddonListPageAsync].
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

    /** A builder for [AddonListPageAsync]. */
    class Builder internal constructor() {

        private var service: AddonServiceAsync? = null
        private var params: AddonListParams? = null
        private var response: AddonListPageResponse? = null

        internal fun from(addonListPageAsync: AddonListPageAsync) = apply {
            service = addonListPageAsync.service
            params = addonListPageAsync.params
            response = addonListPageAsync.response
        }

        fun service(service: AddonServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AddonListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AddonListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AddonListPageAsync].
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
        fun build(): AddonListPageAsync =
            AddonListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AddonListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "AddonListPageAsync{service=$service, params=$params, response=$response}"
}
