// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.subscriptions.Subscription
import com.dodopayments.api.models.subscriptions.SubscriptionCancelChangePlanParams
import com.dodopayments.api.models.subscriptions.SubscriptionChangePlanParams
import com.dodopayments.api.models.subscriptions.SubscriptionChangePlanResponse
import com.dodopayments.api.models.subscriptions.SubscriptionChargeParams
import com.dodopayments.api.models.subscriptions.SubscriptionChargeResponse
import com.dodopayments.api.models.subscriptions.SubscriptionCreateParams
import com.dodopayments.api.models.subscriptions.SubscriptionCreateResponse
import com.dodopayments.api.models.subscriptions.SubscriptionListPage
import com.dodopayments.api.models.subscriptions.SubscriptionListParams
import com.dodopayments.api.models.subscriptions.SubscriptionPreviewChangePlanParams
import com.dodopayments.api.models.subscriptions.SubscriptionPreviewChangePlanResponse
import com.dodopayments.api.models.subscriptions.SubscriptionRetrieveCreditUsageParams
import com.dodopayments.api.models.subscriptions.SubscriptionRetrieveCreditUsageResponse
import com.dodopayments.api.models.subscriptions.SubscriptionRetrieveParams
import com.dodopayments.api.models.subscriptions.SubscriptionRetrieveUsageHistoryPage
import com.dodopayments.api.models.subscriptions.SubscriptionRetrieveUsageHistoryParams
import com.dodopayments.api.models.subscriptions.SubscriptionUpdateParams
import com.dodopayments.api.models.subscriptions.SubscriptionUpdatePaymentMethodParams
import com.dodopayments.api.models.subscriptions.SubscriptionUpdatePaymentMethodResponse
import com.google.errorprone.annotations.MustBeClosed

interface SubscriptionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SubscriptionService

    @Deprecated("deprecated")
    fun create(
        params: SubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionCreateResponse

    fun retrieve(
        subscriptionId: String,
        params: SubscriptionRetrieveParams = SubscriptionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Subscription =
        retrieve(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: SubscriptionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Subscription

    /** @see retrieve */
    fun retrieve(subscriptionId: String, requestOptions: RequestOptions): Subscription =
        retrieve(subscriptionId, SubscriptionRetrieveParams.none(), requestOptions)

    fun update(
        subscriptionId: String,
        params: SubscriptionUpdateParams = SubscriptionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Subscription =
        update(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see update */
    fun update(
        params: SubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Subscription

    /** @see update */
    fun update(subscriptionId: String, requestOptions: RequestOptions): Subscription =
        update(subscriptionId, SubscriptionUpdateParams.none(), requestOptions)

    fun list(
        params: SubscriptionListParams = SubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): SubscriptionListPage =
        list(SubscriptionListParams.none(), requestOptions)

    fun cancelChangePlan(
        subscriptionId: String,
        params: SubscriptionCancelChangePlanParams = SubscriptionCancelChangePlanParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = cancelChangePlan(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see cancelChangePlan */
    fun cancelChangePlan(
        params: SubscriptionCancelChangePlanParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see cancelChangePlan */
    fun cancelChangePlan(subscriptionId: String, requestOptions: RequestOptions) =
        cancelChangePlan(subscriptionId, SubscriptionCancelChangePlanParams.none(), requestOptions)

    fun changePlan(
        subscriptionId: String,
        params: SubscriptionChangePlanParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionChangePlanResponse =
        changePlan(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see changePlan */
    fun changePlan(
        params: SubscriptionChangePlanParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionChangePlanResponse

    fun charge(
        subscriptionId: String,
        params: SubscriptionChargeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionChargeResponse =
        charge(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see charge */
    fun charge(
        params: SubscriptionChargeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionChargeResponse

    fun previewChangePlan(
        subscriptionId: String,
        params: SubscriptionPreviewChangePlanParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionPreviewChangePlanResponse =
        previewChangePlan(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see previewChangePlan */
    fun previewChangePlan(
        params: SubscriptionPreviewChangePlanParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionPreviewChangePlanResponse

    fun retrieveCreditUsage(
        subscriptionId: String,
        params: SubscriptionRetrieveCreditUsageParams =
            SubscriptionRetrieveCreditUsageParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionRetrieveCreditUsageResponse =
        retrieveCreditUsage(
            params.toBuilder().subscriptionId(subscriptionId).build(),
            requestOptions,
        )

    /** @see retrieveCreditUsage */
    fun retrieveCreditUsage(
        params: SubscriptionRetrieveCreditUsageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionRetrieveCreditUsageResponse

    /** @see retrieveCreditUsage */
    fun retrieveCreditUsage(
        subscriptionId: String,
        requestOptions: RequestOptions,
    ): SubscriptionRetrieveCreditUsageResponse =
        retrieveCreditUsage(
            subscriptionId,
            SubscriptionRetrieveCreditUsageParams.none(),
            requestOptions,
        )

    /**
     * Get detailed usage history for a subscription that includes usage-based billing (metered
     * components). This endpoint provides insights into customer usage patterns and billing
     * calculations over time.
     *
     * ## What You'll Get:
     * - **Billing periods**: Each item represents a billing cycle with start and end dates
     * - **Meter usage**: Detailed breakdown of usage for each meter configured on the subscription
     * - **Usage calculations**: Total units consumed, free threshold units, and chargeable units
     * - **Historical tracking**: Complete audit trail of usage-based charges
     *
     * ## Use Cases:
     * - **Customer support**: Investigate billing questions and usage discrepancies
     * - **Usage analytics**: Analyze customer consumption patterns over time
     * - **Billing transparency**: Provide customers with detailed usage breakdowns
     * - **Revenue optimization**: Identify usage trends to optimize pricing strategies
     *
     * ## Filtering Options:
     * - **Date range filtering**: Get usage history for specific time periods
     * - **Meter-specific filtering**: Focus on usage for a particular meter
     * - **Pagination**: Navigate through large usage histories efficiently
     *
     * ## Important Notes:
     * - Only returns data for subscriptions with usage-based (metered) components
     * - Usage history is organized by billing periods (subscription cycles)
     * - Free threshold units are calculated and displayed separately from chargeable units
     * - Historical data is preserved even if meter configurations change
     *
     * ## Example Query Patterns:
     * - Get last 3 months: `?start_date=2024-01-01T00:00:00Z&end_date=2024-03-31T23:59:59Z`
     * - Filter by meter: `?meter_id=mtr_api_requests`
     * - Paginate results: `?page_size=20&page_number=1`
     * - Recent usage: `?start_date=2024-03-01T00:00:00Z` (from March 1st to now)
     */
    fun retrieveUsageHistory(
        subscriptionId: String,
        params: SubscriptionRetrieveUsageHistoryParams =
            SubscriptionRetrieveUsageHistoryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionRetrieveUsageHistoryPage =
        retrieveUsageHistory(
            params.toBuilder().subscriptionId(subscriptionId).build(),
            requestOptions,
        )

    /** @see retrieveUsageHistory */
    fun retrieveUsageHistory(
        params: SubscriptionRetrieveUsageHistoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionRetrieveUsageHistoryPage

    /** @see retrieveUsageHistory */
    fun retrieveUsageHistory(
        subscriptionId: String,
        requestOptions: RequestOptions,
    ): SubscriptionRetrieveUsageHistoryPage =
        retrieveUsageHistory(
            subscriptionId,
            SubscriptionRetrieveUsageHistoryParams.none(),
            requestOptions,
        )

    fun updatePaymentMethod(
        subscriptionId: String,
        params: SubscriptionUpdatePaymentMethodParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionUpdatePaymentMethodResponse =
        updatePaymentMethod(
            params.toBuilder().subscriptionId(subscriptionId).build(),
            requestOptions,
        )

    /** @see updatePaymentMethod */
    fun updatePaymentMethod(
        params: SubscriptionUpdatePaymentMethodParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionUpdatePaymentMethodResponse

    /**
     * A view of [SubscriptionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SubscriptionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /subscriptions`, but is otherwise the same as
         * [SubscriptionService.create].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(
            params: SubscriptionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionCreateResponse>

        /**
         * Returns a raw HTTP response for `get /subscriptions/{subscription_id}`, but is otherwise
         * the same as [SubscriptionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            subscriptionId: String,
            params: SubscriptionRetrieveParams = SubscriptionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Subscription> =
            retrieve(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SubscriptionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Subscription>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            subscriptionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Subscription> =
            retrieve(subscriptionId, SubscriptionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /subscriptions/{subscription_id}`, but is
         * otherwise the same as [SubscriptionService.update].
         */
        @MustBeClosed
        fun update(
            subscriptionId: String,
            params: SubscriptionUpdateParams = SubscriptionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Subscription> =
            update(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: SubscriptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Subscription>

        /** @see update */
        @MustBeClosed
        fun update(
            subscriptionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Subscription> =
            update(subscriptionId, SubscriptionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /subscriptions`, but is otherwise the same as
         * [SubscriptionService.list].
         */
        @MustBeClosed
        fun list(
            params: SubscriptionListParams = SubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SubscriptionListPage> =
            list(SubscriptionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /subscriptions/{subscription_id}/change-plan/scheduled`, but is otherwise the same as
         * [SubscriptionService.cancelChangePlan].
         */
        @MustBeClosed
        fun cancelChangePlan(
            subscriptionId: String,
            params: SubscriptionCancelChangePlanParams = SubscriptionCancelChangePlanParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            cancelChangePlan(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see cancelChangePlan */
        @MustBeClosed
        fun cancelChangePlan(
            params: SubscriptionCancelChangePlanParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see cancelChangePlan */
        @MustBeClosed
        fun cancelChangePlan(subscriptionId: String, requestOptions: RequestOptions): HttpResponse =
            cancelChangePlan(
                subscriptionId,
                SubscriptionCancelChangePlanParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /subscriptions/{subscription_id}/change-plan`, but
         * is otherwise the same as [SubscriptionService.changePlan].
         */
        @MustBeClosed
        fun changePlan(
            subscriptionId: String,
            params: SubscriptionChangePlanParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionChangePlanResponse> =
            changePlan(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

        /** @see changePlan */
        @MustBeClosed
        fun changePlan(
            params: SubscriptionChangePlanParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionChangePlanResponse>

        /**
         * Returns a raw HTTP response for `post /subscriptions/{subscription_id}/charge`, but is
         * otherwise the same as [SubscriptionService.charge].
         */
        @MustBeClosed
        fun charge(
            subscriptionId: String,
            params: SubscriptionChargeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionChargeResponse> =
            charge(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

        /** @see charge */
        @MustBeClosed
        fun charge(
            params: SubscriptionChargeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionChargeResponse>

        /**
         * Returns a raw HTTP response for `post
         * /subscriptions/{subscription_id}/change-plan/preview`, but is otherwise the same as
         * [SubscriptionService.previewChangePlan].
         */
        @MustBeClosed
        fun previewChangePlan(
            subscriptionId: String,
            params: SubscriptionPreviewChangePlanParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionPreviewChangePlanResponse> =
            previewChangePlan(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see previewChangePlan */
        @MustBeClosed
        fun previewChangePlan(
            params: SubscriptionPreviewChangePlanParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionPreviewChangePlanResponse>

        /**
         * Returns a raw HTTP response for `get /subscriptions/{subscription_id}/credit-usage`, but
         * is otherwise the same as [SubscriptionService.retrieveCreditUsage].
         */
        @MustBeClosed
        fun retrieveCreditUsage(
            subscriptionId: String,
            params: SubscriptionRetrieveCreditUsageParams =
                SubscriptionRetrieveCreditUsageParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionRetrieveCreditUsageResponse> =
            retrieveCreditUsage(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see retrieveCreditUsage */
        @MustBeClosed
        fun retrieveCreditUsage(
            params: SubscriptionRetrieveCreditUsageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionRetrieveCreditUsageResponse>

        /** @see retrieveCreditUsage */
        @MustBeClosed
        fun retrieveCreditUsage(
            subscriptionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionRetrieveCreditUsageResponse> =
            retrieveCreditUsage(
                subscriptionId,
                SubscriptionRetrieveCreditUsageParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /subscriptions/{subscription_id}/usage-history`, but
         * is otherwise the same as [SubscriptionService.retrieveUsageHistory].
         */
        @MustBeClosed
        fun retrieveUsageHistory(
            subscriptionId: String,
            params: SubscriptionRetrieveUsageHistoryParams =
                SubscriptionRetrieveUsageHistoryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionRetrieveUsageHistoryPage> =
            retrieveUsageHistory(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see retrieveUsageHistory */
        @MustBeClosed
        fun retrieveUsageHistory(
            params: SubscriptionRetrieveUsageHistoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionRetrieveUsageHistoryPage>

        /** @see retrieveUsageHistory */
        @MustBeClosed
        fun retrieveUsageHistory(
            subscriptionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionRetrieveUsageHistoryPage> =
            retrieveUsageHistory(
                subscriptionId,
                SubscriptionRetrieveUsageHistoryParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /subscriptions/{subscription_id}/update-payment-method`, but is otherwise the same as
         * [SubscriptionService.updatePaymentMethod].
         */
        @MustBeClosed
        fun updatePaymentMethod(
            subscriptionId: String,
            params: SubscriptionUpdatePaymentMethodParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionUpdatePaymentMethodResponse> =
            updatePaymentMethod(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see updatePaymentMethod */
        @MustBeClosed
        fun updatePaymentMethod(
            params: SubscriptionUpdatePaymentMethodParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionUpdatePaymentMethodResponse>
    }
}
