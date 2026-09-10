// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers.emails

import com.dodopayments.api.core.AutoPagerAsync
import com.dodopayments.api.core.PageAsync
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.customers.EmailServiceAsync
import java.util.Objects

/** @see EmailServiceAsync.list */
class EmailListPageAsync
private constructor(
    private val service: EmailServiceAsync,
    private val params: EmailListParams,
    private val response: EmailListPageResponse,
) : PageAsync<EmailLogItem> {

    /**
     * Delegates to [EmailListPageResponse], but gracefully handles missing data.
     *
     * @see EmailListPageResponse.items
     */
    override fun items(): List<EmailLogItem> = response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EmailListParams {
        val pageNumber = params.pageNumber() ?: 1
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override suspend fun nextPage(): EmailListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EmailLogItem> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EmailListParams = params

    /** The response that this page was parsed from. */
    fun response(): EmailListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EmailListPageAsync].
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

    /** A builder for [EmailListPageAsync]. */
    class Builder internal constructor() {

        private var service: EmailServiceAsync? = null
        private var params: EmailListParams? = null
        private var response: EmailListPageResponse? = null

        internal fun from(emailListPageAsync: EmailListPageAsync) = apply {
            service = emailListPageAsync.service
            params = emailListPageAsync.params
            response = emailListPageAsync.response
        }

        fun service(service: EmailServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EmailListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EmailListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EmailListPageAsync].
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
        fun build(): EmailListPageAsync =
            EmailListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "EmailListPageAsync{service=$service, params=$params, response=$response}"
}
