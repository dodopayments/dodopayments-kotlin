// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.licensekeys

import com.dodopayments.api.core.AutoPager
import com.dodopayments.api.core.Page
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.blocking.LicenseKeyService
import java.util.Objects

/** @see LicenseKeyService.list */
class LicenseKeyListPage
private constructor(
    private val service: LicenseKeyService,
    private val params: LicenseKeyListParams,
    private val response: LicenseKeyListPageResponse,
) : Page<LicenseKey> {

    /**
     * Delegates to [LicenseKeyListPageResponse], but gracefully handles missing data.
     *
     * @see LicenseKeyListPageResponse.items
     */
    override fun items(): List<LicenseKey> = response._items().getNullable("items") ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): LicenseKeyListParams {
        val pageNumber = params.pageNumber() ?: 1
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): LicenseKeyListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<LicenseKey> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LicenseKeyListParams = params

    /** The response that this page was parsed from. */
    fun response(): LicenseKeyListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LicenseKeyListPage].
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

    /** A builder for [LicenseKeyListPage]. */
    class Builder internal constructor() {

        private var service: LicenseKeyService? = null
        private var params: LicenseKeyListParams? = null
        private var response: LicenseKeyListPageResponse? = null

        internal fun from(licenseKeyListPage: LicenseKeyListPage) = apply {
            service = licenseKeyListPage.service
            params = licenseKeyListPage.params
            response = licenseKeyListPage.response
        }

        fun service(service: LicenseKeyService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LicenseKeyListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: LicenseKeyListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [LicenseKeyListPage].
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
        fun build(): LicenseKeyListPage =
            LicenseKeyListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LicenseKeyListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "LicenseKeyListPage{service=$service, params=$params, response=$response}"
}
