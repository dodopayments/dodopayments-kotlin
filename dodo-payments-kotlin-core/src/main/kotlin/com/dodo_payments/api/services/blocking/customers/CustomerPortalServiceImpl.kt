// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.blocking.customers

import com.dodo_payments.api.core.ClientOptions
import com.dodo_payments.api.services.blocking.customers.customerportal.SessionService
import com.dodo_payments.api.services.blocking.customers.customerportal.SessionServiceImpl

class CustomerPortalServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CustomerPortalService {

    private val withRawResponse: CustomerPortalService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val session: SessionService by lazy { SessionServiceImpl(clientOptions) }

    override fun withRawResponse(): CustomerPortalService.WithRawResponse = withRawResponse

    override fun session(): SessionService = session

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CustomerPortalService.WithRawResponse {

        private val session: SessionService.WithRawResponse by lazy {
            SessionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun session(): SessionService.WithRawResponse = session
    }
}
