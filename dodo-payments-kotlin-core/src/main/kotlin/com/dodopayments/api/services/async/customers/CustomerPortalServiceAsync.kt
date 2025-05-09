// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.customers

import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.customers.CustomerPortalSession
import com.dodopayments.api.models.customers.customerportal.CustomerPortalCreateParams
import com.google.errorprone.annotations.MustBeClosed

interface CustomerPortalServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    suspend fun create(
        customerId: String,
        params: CustomerPortalCreateParams = CustomerPortalCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerPortalSession =
        create(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see [create] */
    suspend fun create(
        params: CustomerPortalCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerPortalSession

    /** @see [create] */
    suspend fun create(customerId: String, requestOptions: RequestOptions): CustomerPortalSession =
        create(customerId, CustomerPortalCreateParams.none(), requestOptions)

    /**
     * A view of [CustomerPortalServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /customers/{customer_id}/customer-portal/session`,
         * but is otherwise the same as [CustomerPortalServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            customerId: String,
            params: CustomerPortalCreateParams = CustomerPortalCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerPortalSession> =
            create(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see [create] */
        @MustBeClosed
        suspend fun create(
            params: CustomerPortalCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerPortalSession>

        /** @see [create] */
        @MustBeClosed
        suspend fun create(
            customerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerPortalSession> =
            create(customerId, CustomerPortalCreateParams.none(), requestOptions)
    }
}
