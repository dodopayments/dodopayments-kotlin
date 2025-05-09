// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.subscriptions.Subscription
import com.dodopayments.api.models.subscriptions.SubscriptionChangePlanParams
import com.dodopayments.api.models.subscriptions.SubscriptionChargeParams
import com.dodopayments.api.models.subscriptions.SubscriptionChargeResponse
import com.dodopayments.api.models.subscriptions.SubscriptionCreateParams
import com.dodopayments.api.models.subscriptions.SubscriptionCreateResponse
import com.dodopayments.api.models.subscriptions.SubscriptionListPage
import com.dodopayments.api.models.subscriptions.SubscriptionListParams
import com.dodopayments.api.models.subscriptions.SubscriptionRetrieveParams
import com.dodopayments.api.models.subscriptions.SubscriptionUpdateParams
import com.google.errorprone.annotations.MustBeClosed

interface SubscriptionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun create(
        params: SubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionCreateResponse

    fun retrieve(
        params: SubscriptionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Subscription

    fun update(
        params: SubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Subscription

    fun list(
        params: SubscriptionListParams = SubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): SubscriptionListPage =
        list(SubscriptionListParams.none(), requestOptions)

    fun changePlan(
        params: SubscriptionChangePlanParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    fun charge(
        params: SubscriptionChargeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionChargeResponse

    /**
     * A view of [SubscriptionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /subscriptions`, but is otherwise the same as
         * [SubscriptionService.create].
         */
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
            params: SubscriptionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Subscription>

        /**
         * Returns a raw HTTP response for `patch /subscriptions/{subscription_id}`, but is
         * otherwise the same as [SubscriptionService.update].
         */
        @MustBeClosed
        fun update(
            params: SubscriptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Subscription>

        /**
         * Returns a raw HTTP response for `get /subscriptions`, but is otherwise the same as
         * [SubscriptionService.list].
         */
        @MustBeClosed
        fun list(
            params: SubscriptionListParams = SubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SubscriptionListPage> =
            list(SubscriptionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /subscriptions/{subscription_id}/change-plan`, but
         * is otherwise the same as [SubscriptionService.changePlan].
         */
        @MustBeClosed
        fun changePlan(
            params: SubscriptionChangePlanParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /subscriptions/{subscription_id}/charge`, but is
         * otherwise the same as [SubscriptionService.charge].
         */
        @MustBeClosed
        fun charge(
            params: SubscriptionChargeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionChargeResponse>
    }
}
