// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements

import com.dodopayments.api.core.AutoPagerAsync
import com.dodopayments.api.core.PageAsync
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.EntitlementServiceAsync
import java.util.Objects

/** @see EntitlementServiceAsync.list */
class EntitlementListPageAsync
private constructor(
    private val service: EntitlementServiceAsync,
    private val params: EntitlementListParams,
    private val response: EntitlementListPageResponse,
) : PageAsync<Entitlement> {

    /**
     * Delegates to [EntitlementListPageResponse], but gracefully handles missing data.
     *
     * @see EntitlementListPageResponse.items
     */
    override fun items(): List<Entitlement> = response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EntitlementListParams {
        val pageNumber = params.pageNumber() ?: 1
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override suspend fun nextPage(): EntitlementListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Entitlement> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EntitlementListParams = params

    /** The response that this page was parsed from. */
    fun response(): EntitlementListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EntitlementListPageAsync].
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

    /** A builder for [EntitlementListPageAsync]. */
    class Builder internal constructor() {

        private var service: EntitlementServiceAsync? = null
        private var params: EntitlementListParams? = null
        private var response: EntitlementListPageResponse? = null

        internal fun from(entitlementListPageAsync: EntitlementListPageAsync) = apply {
            service = entitlementListPageAsync.service
            params = entitlementListPageAsync.params
            response = entitlementListPageAsync.response
        }

        fun service(service: EntitlementServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EntitlementListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EntitlementListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EntitlementListPageAsync].
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
        fun build(): EntitlementListPageAsync =
            EntitlementListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EntitlementListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "EntitlementListPageAsync{service=$service, params=$params, response=$response}"
}
