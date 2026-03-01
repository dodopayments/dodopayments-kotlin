// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.creditentitlements

import com.dodopayments.api.core.AutoPager
import com.dodopayments.api.core.Page
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.blocking.CreditEntitlementService
import java.util.Objects

/** @see CreditEntitlementService.list */
class CreditEntitlementListPage
private constructor(
    private val service: CreditEntitlementService,
    private val params: CreditEntitlementListParams,
    private val response: CreditEntitlementListPageResponse,
) : Page<CreditEntitlement> {

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

    override fun nextPage(): CreditEntitlementListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CreditEntitlement> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CreditEntitlementListParams = params

    /** The response that this page was parsed from. */
    fun response(): CreditEntitlementListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CreditEntitlementListPage].
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

    /** A builder for [CreditEntitlementListPage]. */
    class Builder internal constructor() {

        private var service: CreditEntitlementService? = null
        private var params: CreditEntitlementListParams? = null
        private var response: CreditEntitlementListPageResponse? = null

        internal fun from(creditEntitlementListPage: CreditEntitlementListPage) = apply {
            service = creditEntitlementListPage.service
            params = creditEntitlementListPage.params
            response = creditEntitlementListPage.response
        }

        fun service(service: CreditEntitlementService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CreditEntitlementListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CreditEntitlementListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CreditEntitlementListPage].
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
        fun build(): CreditEntitlementListPage =
            CreditEntitlementListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreditEntitlementListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CreditEntitlementListPage{service=$service, params=$params, response=$response}"
}
