// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.customers

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.customers.emails.EmailBody
import com.dodopayments.api.models.customers.emails.EmailListPage
import com.dodopayments.api.models.customers.emails.EmailListParams
import com.dodopayments.api.models.customers.emails.EmailRetrieveBodyParams
import com.google.errorprone.annotations.MustBeClosed

interface EmailService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EmailService

    /**
     * Returns every transactional email sent to this customer in the last 180 days, newest first,
     * with its delivery outcome. Delivery status comes from the email provider and is as fresh as
     * replication, typically seconds.
     */
    fun list(
        customerId: String,
        params: EmailListParams = EmailListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailListPage = list(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see list */
    fun list(
        params: EmailListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailListPage

    /** @see list */
    fun list(customerId: String, requestOptions: RequestOptions): EmailListPage =
        list(customerId, EmailListParams.none(), requestOptions)

    /**
     * Returns the email exactly as it was sent, plus the reason it failed when it did. Some emails
     * have no body to show: an authentication email carries a live login token, a blocked email
     * never reached the provider, and the provider clears bodies at 180 days.
     */
    fun retrieveBody(
        emailLogId: String,
        params: EmailRetrieveBodyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailBody = retrieveBody(params.toBuilder().emailLogId(emailLogId).build(), requestOptions)

    /** @see retrieveBody */
    fun retrieveBody(
        params: EmailRetrieveBodyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailBody

    /** A view of [EmailService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EmailService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /customers/{customer_id}/emails`, but is otherwise
         * the same as [EmailService.list].
         */
        @MustBeClosed
        fun list(
            customerId: String,
            params: EmailListParams = EmailListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailListPage> =
            list(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            params: EmailListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            customerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailListPage> = list(customerId, EmailListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /customers/{customer_id}/emails/{email_log_id}/body`, but is otherwise the same as
         * [EmailService.retrieveBody].
         */
        @MustBeClosed
        fun retrieveBody(
            emailLogId: String,
            params: EmailRetrieveBodyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailBody> =
            retrieveBody(params.toBuilder().emailLogId(emailLogId).build(), requestOptions)

        /** @see retrieveBody */
        @MustBeClosed
        fun retrieveBody(
            params: EmailRetrieveBodyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailBody>
    }
}
