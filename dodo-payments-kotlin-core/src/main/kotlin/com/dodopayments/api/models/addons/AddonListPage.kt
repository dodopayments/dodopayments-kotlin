// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.addons

import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.blocking.AddonService
import java.util.Objects

/** @see [AddonService.list] */
class AddonListPage
private constructor(
    private val service: AddonService,
    private val params: AddonListParams,
    private val response: AddonListPageResponse,
) {

    /**
     * Delegates to [AddonListPageResponse], but gracefully handles missing data.
     *
     * @see [AddonListPageResponse.items]
     */
    fun items(): List<AddonResponse> = response._items().getNullable("items") ?: emptyList()

    fun hasNextPage(): Boolean = items().isNotEmpty()

    fun getNextPageParams(): AddonListParams? {
        if (!hasNextPage()) {
            return null
        }

        val pageNumber = params.pageNumber() ?: 1
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    fun getNextPage(): AddonListPage? = getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): AddonListParams = params

    /** The response that this page was parsed from. */
    fun response(): AddonListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AddonListPage].
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

    /** A builder for [AddonListPage]. */
    class Builder internal constructor() {

        private var service: AddonService? = null
        private var params: AddonListParams? = null
        private var response: AddonListPageResponse? = null

        internal fun from(addonListPage: AddonListPage) = apply {
            service = addonListPage.service
            params = addonListPage.params
            response = addonListPage.response
        }

        fun service(service: AddonService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AddonListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AddonListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AddonListPage].
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
        fun build(): AddonListPage =
            AddonListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: AddonListPage) : Sequence<AddonResponse> {

        override fun iterator(): Iterator<AddonResponse> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.items().size) {
                    yield(page.items()[index++])
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

        return /* spotless:off */ other is AddonListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() = "AddonListPage{service=$service, params=$params, response=$response}"
}
