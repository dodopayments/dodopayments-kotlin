// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers

import com.dodopayments.api.core.AutoPagerAsync
import com.dodopayments.api.core.PageAsync
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.models.entitlements.grants.EntitlementGrant
import com.dodopayments.api.services.async.CustomerServiceAsync
import java.util.Objects

/** @see CustomerServiceAsync.listEntitlementGrants */
class CustomerListEntitlementGrantsPageAsync
private constructor(
    private val service: CustomerServiceAsync,
    private val params: CustomerListEntitlementGrantsParams,
    private val response: CustomerListEntitlementGrantsPageResponse,
) : PageAsync<EntitlementGrant> {

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

    override suspend fun nextPage(): CustomerListEntitlementGrantsPageAsync =
        service.listEntitlementGrants(nextPageParams())

    fun autoPager(): AutoPagerAsync<EntitlementGrant> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CustomerListEntitlementGrantsParams = params

    /** The response that this page was parsed from. */
    fun response(): CustomerListEntitlementGrantsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerListEntitlementGrantsPageAsync].
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

    /** A builder for [CustomerListEntitlementGrantsPageAsync]. */
    class Builder internal constructor() {

        private var service: CustomerServiceAsync? = null
        private var params: CustomerListEntitlementGrantsParams? = null
        private var response: CustomerListEntitlementGrantsPageResponse? = null

        internal fun from(
            customerListEntitlementGrantsPageAsync: CustomerListEntitlementGrantsPageAsync
        ) = apply {
            service = customerListEntitlementGrantsPageAsync.service
            params = customerListEntitlementGrantsPageAsync.params
            response = customerListEntitlementGrantsPageAsync.response
        }

        fun service(service: CustomerServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CustomerListEntitlementGrantsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CustomerListEntitlementGrantsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CustomerListEntitlementGrantsPageAsync].
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
        fun build(): CustomerListEntitlementGrantsPageAsync =
            CustomerListEntitlementGrantsPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerListEntitlementGrantsPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CustomerListEntitlementGrantsPageAsync{service=$service, params=$params, response=$response}"
}
