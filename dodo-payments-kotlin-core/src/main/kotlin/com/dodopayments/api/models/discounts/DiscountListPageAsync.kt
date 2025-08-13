// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.discounts

import com.dodopayments.api.core.AutoPagerAsync
import com.dodopayments.api.core.PageAsync
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.DiscountServiceAsync
import java.util.Objects

/** @see DiscountServiceAsync.list */
class DiscountListPageAsync
private constructor(
    private val service: DiscountServiceAsync,
    private val params: DiscountListParams,
    private val response: DiscountListPageResponse,
) : PageAsync<Discount> {

    /**
     * Delegates to [DiscountListPageResponse], but gracefully handles missing data.
     *
     * @see DiscountListPageResponse.items
     */
    override fun items(): List<Discount> = response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DiscountListParams {
        val pageNumber = params.pageNumber() ?: 1
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override suspend fun nextPage(): DiscountListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Discount> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DiscountListParams = params

    /** The response that this page was parsed from. */
    fun response(): DiscountListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DiscountListPageAsync].
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

    /** A builder for [DiscountListPageAsync]. */
    class Builder internal constructor() {

        private var service: DiscountServiceAsync? = null
        private var params: DiscountListParams? = null
        private var response: DiscountListPageResponse? = null

        internal fun from(discountListPageAsync: DiscountListPageAsync) = apply {
            service = discountListPageAsync.service
            params = discountListPageAsync.params
            response = discountListPageAsync.response
        }

        fun service(service: DiscountServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DiscountListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DiscountListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DiscountListPageAsync].
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
        fun build(): DiscountListPageAsync =
            DiscountListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DiscountListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "DiscountListPageAsync{service=$service, params=$params, response=$response}"
}
