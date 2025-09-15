// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.meters

import com.dodopayments.api.core.AutoPagerAsync
import com.dodopayments.api.core.PageAsync
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.MeterServiceAsync
import java.util.Objects

/** @see MeterServiceAsync.list */
class MeterListPageAsync
private constructor(
    private val service: MeterServiceAsync,
    private val params: MeterListParams,
    private val response: MeterListPageResponse,
) : PageAsync<Meter> {

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

    override suspend fun nextPage(): MeterListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Meter> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MeterListParams = params

    /** The response that this page was parsed from. */
    fun response(): MeterListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MeterListPageAsync].
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

    /** A builder for [MeterListPageAsync]. */
    class Builder internal constructor() {

        private var service: MeterServiceAsync? = null
        private var params: MeterListParams? = null
        private var response: MeterListPageResponse? = null

        internal fun from(meterListPageAsync: MeterListPageAsync) = apply {
            service = meterListPageAsync.service
            params = meterListPageAsync.params
            response = meterListPageAsync.response
        }

        fun service(service: MeterServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MeterListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MeterListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [MeterListPageAsync].
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
        fun build(): MeterListPageAsync =
            MeterListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MeterListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "MeterListPageAsync{service=$service, params=$params, response=$response}"
}
