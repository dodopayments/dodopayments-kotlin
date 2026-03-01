// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.creditentitlements

import com.dodopayments.api.core.AutoPagerAsync
import com.dodopayments.api.core.PageAsync
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.CreditEntitlementServiceAsync
import java.util.Objects

/** @see CreditEntitlementServiceAsync.list */
class CreditEntitlementListPageAsync
private constructor(
    private val service: CreditEntitlementServiceAsync,
    private val params: CreditEntitlementListParams,
    private val response: CreditEntitlementListPageResponse,
) : PageAsync<CreditEntitlement> {

    /**
     * Delegates to [CreditEntitlementListPageResponse], but gracefully handles missing data.
     *
     * @see CreditEntitlementListPageResponse.items
     */
    override fun items(): List<CreditEntitlement> =
        response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): CreditEntitlementListParams {
        val pageNumber = params.pageNumber() ?: 1
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override suspend fun nextPage(): CreditEntitlementListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CreditEntitlement> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CreditEntitlementListParams = params

    /** The response that this page was parsed from. */
    fun response(): CreditEntitlementListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CreditEntitlementListPageAsync].
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

    /** A builder for [CreditEntitlementListPageAsync]. */
    class Builder internal constructor() {

        private var service: CreditEntitlementServiceAsync? = null
        private var params: CreditEntitlementListParams? = null
        private var response: CreditEntitlementListPageResponse? = null

        internal fun from(creditEntitlementListPageAsync: CreditEntitlementListPageAsync) = apply {
            service = creditEntitlementListPageAsync.service
            params = creditEntitlementListPageAsync.params
            response = creditEntitlementListPageAsync.response
        }

        fun service(service: CreditEntitlementServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CreditEntitlementListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CreditEntitlementListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CreditEntitlementListPageAsync].
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
        fun build(): CreditEntitlementListPageAsync =
            CreditEntitlementListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreditEntitlementListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CreditEntitlementListPageAsync{service=$service, params=$params, response=$response}"
}
