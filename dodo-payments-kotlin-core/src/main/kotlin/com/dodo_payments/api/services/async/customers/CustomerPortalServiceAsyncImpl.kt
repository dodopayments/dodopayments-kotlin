// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async.customers

import com.dodo_payments.api.core.ClientOptions
import com.dodo_payments.api.services.async.customers.customerportal.SessionServiceAsync
import com.dodo_payments.api.services.async.customers.customerportal.SessionServiceAsyncImpl

class CustomerPortalServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : CustomerPortalServiceAsync {

    private val withRawResponse: CustomerPortalServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val session: SessionServiceAsync by lazy { SessionServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): CustomerPortalServiceAsync.WithRawResponse = withRawResponse

    override fun session(): SessionServiceAsync = session

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CustomerPortalServiceAsync.WithRawResponse {

        private val session: SessionServiceAsync.WithRawResponse by lazy {
            SessionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun session(): SessionServiceAsync.WithRawResponse = session
    }
}
