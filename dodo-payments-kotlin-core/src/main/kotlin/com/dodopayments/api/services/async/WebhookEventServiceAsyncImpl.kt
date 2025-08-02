// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions

class WebhookEventServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WebhookEventServiceAsync {

    private val withRawResponse: WebhookEventServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WebhookEventServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): WebhookEventServiceAsync =
        WebhookEventServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WebhookEventServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): WebhookEventServiceAsync.WithRawResponse =
            WebhookEventServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )
    }
}
