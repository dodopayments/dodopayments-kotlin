// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.subscriptions.Subscription
import com.dodopayments.api.models.subscriptions.SubscriptionChangePlanParams
import com.dodopayments.api.models.subscriptions.SubscriptionChargeParams
import com.dodopayments.api.models.subscriptions.SubscriptionChargeResponse
import com.dodopayments.api.models.subscriptions.SubscriptionCreateParams
import com.dodopayments.api.models.subscriptions.SubscriptionCreateResponse
import com.dodopayments.api.models.subscriptions.SubscriptionListPageAsync
import com.dodopayments.api.models.subscriptions.SubscriptionListParams
import com.dodopayments.api.models.subscriptions.SubscriptionRetrieveParams
import com.dodopayments.api.models.subscriptions.SubscriptionUpdateParams
import com.google.errorprone.annotations.MustBeClosed

interface SubscriptionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    suspend fun create(
        params: SubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionCreateResponse

    suspend fun retrieve(
        params: SubscriptionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Subscription

    suspend fun update(
        params: SubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Subscription

    suspend fun list(
        params: SubscriptionListParams = SubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): SubscriptionListPageAsync =
        list(SubscriptionListParams.none(), requestOptions)

    suspend fun changePlan(
        params: SubscriptionChangePlanParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    suspend fun charge(
        params: SubscriptionChargeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionChargeResponse

    /**
     * A view of [SubscriptionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /subscriptions`, but is otherwise the same as
         * [SubscriptionServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: SubscriptionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionCreateResponse>

        /**
         * Returns a raw HTTP response for `get /subscriptions/{subscription_id}`, but is otherwise
         * the same as [SubscriptionServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: SubscriptionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Subscription>

        /**
         * Returns a raw HTTP response for `patch /subscriptions/{subscription_id}`, but is
         * otherwise the same as [SubscriptionServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: SubscriptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Subscription>

        /**
         * Returns a raw HTTP response for `get /subscriptions`, but is otherwise the same as
         * [SubscriptionServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: SubscriptionListParams = SubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<SubscriptionListPageAsync> =
            list(SubscriptionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /subscriptions/{subscription_id}/change-plan`, but
         * is otherwise the same as [SubscriptionServiceAsync.changePlan].
         */
        @MustBeClosed
        suspend fun changePlan(
            params: SubscriptionChangePlanParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /subscriptions/{subscription_id}/charge`, but is
         * otherwise the same as [SubscriptionServiceAsync.charge].
         */
        @MustBeClosed
        suspend fun charge(
            params: SubscriptionChargeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionChargeResponse>
    }
}
