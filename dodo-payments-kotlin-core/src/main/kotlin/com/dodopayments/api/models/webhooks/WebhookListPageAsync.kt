// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

import com.dodopayments.api.core.AutoPagerAsync
import com.dodopayments.api.core.PageAsync
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.WebhookServiceAsync
import java.util.Objects

/** @see WebhookServiceAsync.list */
class WebhookListPageAsync
private constructor(
    private val service: WebhookServiceAsync,
    private val params: WebhookListParams,
    private val response: WebhookListPageResponse,
) : PageAsync<WebhookListResponse> {

    /**
     * Delegates to [WebhookListPageResponse], but gracefully handles missing data.
     *
     * @see WebhookListPageResponse.data
     */
    fun data(): List<WebhookListResponse> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [WebhookListPageResponse], but gracefully handles missing data.
     *
     * @see WebhookListPageResponse.iterator
     */
    fun iterator(): String? = response._iterator().getNullable("iterator")

    /**
     * Delegates to [WebhookListPageResponse], but gracefully handles missing data.
     *
     * @see WebhookListPageResponse.done
     */
    fun done(): Boolean? = response._done().getNullable("done")

    override fun items(): List<WebhookListResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && iterator() != null

    fun nextPageParams(): WebhookListParams {
        val nextCursor =
            iterator() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().iterator(nextCursor).build()
    }

    override suspend fun nextPage(): WebhookListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<WebhookListResponse> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): WebhookListParams = params

    /** The response that this page was parsed from. */
    fun response(): WebhookListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WebhookListPageAsync].
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

    /** A builder for [WebhookListPageAsync]. */
    class Builder internal constructor() {

        private var service: WebhookServiceAsync? = null
        private var params: WebhookListParams? = null
        private var response: WebhookListPageResponse? = null

        internal fun from(webhookListPageAsync: WebhookListPageAsync) = apply {
            service = webhookListPageAsync.service
            params = webhookListPageAsync.params
            response = webhookListPageAsync.response
        }

        fun service(service: WebhookServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: WebhookListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: WebhookListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [WebhookListPageAsync].
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
        fun build(): WebhookListPageAsync =
            WebhookListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebhookListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "WebhookListPageAsync{service=$service, params=$params, response=$response}"
}
