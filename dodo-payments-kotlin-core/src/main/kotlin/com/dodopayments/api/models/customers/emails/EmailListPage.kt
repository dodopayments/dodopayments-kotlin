// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers.emails

import com.dodopayments.api.core.AutoPager
import com.dodopayments.api.core.Page
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.blocking.customers.EmailService
import java.util.Objects

/** @see EmailService.list */
class EmailListPage
private constructor(
    private val service: EmailService,
    private val params: EmailListParams,
    private val response: EmailListPageResponse,
) : Page<EmailLogItem> {

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

    override fun nextPage(): EmailListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EmailLogItem> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EmailListParams = params

    /** The response that this page was parsed from. */
    fun response(): EmailListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EmailListPage].
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

    /** A builder for [EmailListPage]. */
    class Builder internal constructor() {

        private var service: EmailService? = null
        private var params: EmailListParams? = null
        private var response: EmailListPageResponse? = null

        internal fun from(emailListPage: EmailListPage) = apply {
            service = emailListPage.service
            params = emailListPage.params
            response = emailListPage.response
        }

        fun service(service: EmailService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EmailListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EmailListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EmailListPage].
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
        fun build(): EmailListPage =
            EmailListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "EmailListPage{service=$service, params=$params, response=$response}"
}
