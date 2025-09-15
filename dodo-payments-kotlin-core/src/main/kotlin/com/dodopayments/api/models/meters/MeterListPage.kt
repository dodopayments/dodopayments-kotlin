// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.meters

import com.dodopayments.api.core.AutoPager
import com.dodopayments.api.core.Page
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.blocking.MeterService
import java.util.Objects

/** @see MeterService.list */
class MeterListPage
private constructor(
    private val service: MeterService,
    private val params: MeterListParams,
    private val response: MeterListPageResponse,
) : Page<Meter> {

    /**
     * Delegates to [MeterListPageResponse], but gracefully handles missing data.
     *
     * @see MeterListPageResponse.items
     */
    override fun items(): List<Meter> = response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): MeterListParams {
        val pageNumber = params.pageNumber() ?: 1
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): MeterListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Meter> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MeterListParams = params

    /** The response that this page was parsed from. */
    fun response(): MeterListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MeterListPage].
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

    /** A builder for [MeterListPage]. */
    class Builder internal constructor() {

        private var service: MeterService? = null
        private var params: MeterListParams? = null
        private var response: MeterListPageResponse? = null

        internal fun from(meterListPage: MeterListPage) = apply {
            service = meterListPage.service
            params = meterListPage.params
            response = meterListPage.response
        }

        fun service(service: MeterService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MeterListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MeterListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [MeterListPage].
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
        fun build(): MeterListPage =
            MeterListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MeterListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "MeterListPage{service=$service, params=$params, response=$response}"
}
