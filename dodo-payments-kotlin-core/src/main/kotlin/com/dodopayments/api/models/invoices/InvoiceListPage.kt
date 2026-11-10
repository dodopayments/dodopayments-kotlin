// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.invoices

import com.dodopayments.api.core.AutoPager
import com.dodopayments.api.core.Page
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.blocking.InvoiceService
import java.util.Objects

/** @see InvoiceService.list */
class InvoiceListPage
private constructor(
    private val service: InvoiceService,
    private val params: InvoiceListParams,
    private val response: InvoiceListPageResponse,
) : Page<Invoice> {

    /**
     * Delegates to [InvoiceListPageResponse], but gracefully handles missing data.
     *
     * @see InvoiceListPageResponse.items
     */
    override fun items(): List<Invoice> = response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): InvoiceListParams {
        val pageNumber = params.pageNumber() ?: 1
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): InvoiceListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Invoice> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): InvoiceListParams = params

    /** The response that this page was parsed from. */
    fun response(): InvoiceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InvoiceListPage].
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

    /** A builder for [InvoiceListPage]. */
    class Builder internal constructor() {

        private var service: InvoiceService? = null
        private var params: InvoiceListParams? = null
        private var response: InvoiceListPageResponse? = null

        internal fun from(invoiceListPage: InvoiceListPage) = apply {
            service = invoiceListPage.service
            params = invoiceListPage.params
            response = invoiceListPage.response
        }

        fun service(service: InvoiceService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: InvoiceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: InvoiceListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [InvoiceListPage].
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
        fun build(): InvoiceListPage =
            InvoiceListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InvoiceListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "InvoiceListPage{service=$service, params=$params, response=$response}"
}
