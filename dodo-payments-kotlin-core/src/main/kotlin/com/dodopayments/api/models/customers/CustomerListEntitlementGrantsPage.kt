// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers

import com.dodopayments.api.core.AutoPager
import com.dodopayments.api.core.Page
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.models.entitlements.grants.EntitlementGrant
import com.dodopayments.api.services.blocking.CustomerService
import java.util.Objects

/** @see CustomerService.listEntitlementGrants */
class CustomerListEntitlementGrantsPage
private constructor(
    private val service: CustomerService,
    private val params: CustomerListEntitlementGrantsParams,
    private val response: CustomerListEntitlementGrantsPageResponse,
) : Page<EntitlementGrant> {

    /**
     * Delegates to [CustomerListEntitlementGrantsPageResponse], but gracefully handles missing
     * data.
     *
     * @see CustomerListEntitlementGrantsPageResponse.items
     */
    override fun items(): List<EntitlementGrant> =
        response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): CustomerListEntitlementGrantsParams {
        val pageNumber = params.pageNumber() ?: 1
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CustomerListEntitlementGrantsPage =
        service.listEntitlementGrants(nextPageParams())

    fun autoPager(): AutoPager<EntitlementGrant> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CustomerListEntitlementGrantsParams = params

    /** The response that this page was parsed from. */
    fun response(): CustomerListEntitlementGrantsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerListEntitlementGrantsPage].
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

    /** A builder for [CustomerListEntitlementGrantsPage]. */
    class Builder internal constructor() {

        private var service: CustomerService? = null
        private var params: CustomerListEntitlementGrantsParams? = null
        private var response: CustomerListEntitlementGrantsPageResponse? = null

        internal fun from(customerListEntitlementGrantsPage: CustomerListEntitlementGrantsPage) =
            apply {
                service = customerListEntitlementGrantsPage.service
                params = customerListEntitlementGrantsPage.params
                response = customerListEntitlementGrantsPage.response
            }

        fun service(service: CustomerService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CustomerListEntitlementGrantsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CustomerListEntitlementGrantsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CustomerListEntitlementGrantsPage].
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
        fun build(): CustomerListEntitlementGrantsPage =
            CustomerListEntitlementGrantsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerListEntitlementGrantsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CustomerListEntitlementGrantsPage{service=$service, params=$params, response=$response}"
}
