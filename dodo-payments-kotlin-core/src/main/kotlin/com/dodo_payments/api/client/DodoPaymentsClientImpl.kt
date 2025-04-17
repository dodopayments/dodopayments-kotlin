// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.client

import com.dodo_payments.api.core.ClientOptions
import com.dodo_payments.api.core.getPackageVersion
import com.dodo_payments.api.services.blocking.CustomerService
import com.dodo_payments.api.services.blocking.CustomerServiceImpl
import com.dodo_payments.api.services.blocking.DiscountService
import com.dodo_payments.api.services.blocking.DiscountServiceImpl
import com.dodo_payments.api.services.blocking.DisputeService
import com.dodo_payments.api.services.blocking.DisputeServiceImpl
import com.dodo_payments.api.services.blocking.InvoiceService
import com.dodo_payments.api.services.blocking.InvoiceServiceImpl
import com.dodo_payments.api.services.blocking.LicenseKeyInstanceService
import com.dodo_payments.api.services.blocking.LicenseKeyInstanceServiceImpl
import com.dodo_payments.api.services.blocking.LicenseKeyService
import com.dodo_payments.api.services.blocking.LicenseKeyServiceImpl
import com.dodo_payments.api.services.blocking.LicenseService
import com.dodo_payments.api.services.blocking.LicenseServiceImpl
import com.dodo_payments.api.services.blocking.MiscService
import com.dodo_payments.api.services.blocking.MiscServiceImpl
import com.dodo_payments.api.services.blocking.PaymentService
import com.dodo_payments.api.services.blocking.PaymentServiceImpl
import com.dodo_payments.api.services.blocking.PayoutService
import com.dodo_payments.api.services.blocking.PayoutServiceImpl
import com.dodo_payments.api.services.blocking.ProductService
import com.dodo_payments.api.services.blocking.ProductServiceImpl
import com.dodo_payments.api.services.blocking.RefundService
import com.dodo_payments.api.services.blocking.RefundServiceImpl
import com.dodo_payments.api.services.blocking.SubscriptionService
import com.dodo_payments.api.services.blocking.SubscriptionServiceImpl
import com.dodo_payments.api.services.blocking.WebhookEventService
import com.dodo_payments.api.services.blocking.WebhookEventServiceImpl

class DodoPaymentsClientImpl(private val clientOptions: ClientOptions) : DodoPaymentsClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: DodoPaymentsClientAsync by lazy {
        DodoPaymentsClientAsyncImpl(clientOptions)
    }

    private val withRawResponse: DodoPaymentsClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val payments: PaymentService by lazy { PaymentServiceImpl(clientOptionsWithUserAgent) }

    private val subscriptions: SubscriptionService by lazy {
        SubscriptionServiceImpl(clientOptionsWithUserAgent)
    }

    private val invoices: InvoiceService by lazy { InvoiceServiceImpl(clientOptionsWithUserAgent) }

    private val licenses: LicenseService by lazy { LicenseServiceImpl(clientOptionsWithUserAgent) }

    private val licenseKeys: LicenseKeyService by lazy {
        LicenseKeyServiceImpl(clientOptionsWithUserAgent)
    }

    private val licenseKeyInstances: LicenseKeyInstanceService by lazy {
        LicenseKeyInstanceServiceImpl(clientOptionsWithUserAgent)
    }

    private val customers: CustomerService by lazy {
        CustomerServiceImpl(clientOptionsWithUserAgent)
    }

    private val refunds: RefundService by lazy { RefundServiceImpl(clientOptionsWithUserAgent) }

    private val disputes: DisputeService by lazy { DisputeServiceImpl(clientOptionsWithUserAgent) }

    private val payouts: PayoutService by lazy { PayoutServiceImpl(clientOptionsWithUserAgent) }

    private val webhookEvents: WebhookEventService by lazy {
        WebhookEventServiceImpl(clientOptionsWithUserAgent)
    }

    private val products: ProductService by lazy { ProductServiceImpl(clientOptionsWithUserAgent) }

    private val misc: MiscService by lazy { MiscServiceImpl(clientOptionsWithUserAgent) }

    private val discounts: DiscountService by lazy {
        DiscountServiceImpl(clientOptionsWithUserAgent)
    }

    override fun async(): DodoPaymentsClientAsync = async

    override fun withRawResponse(): DodoPaymentsClient.WithRawResponse = withRawResponse

    override fun payments(): PaymentService = payments

    override fun subscriptions(): SubscriptionService = subscriptions

    override fun invoices(): InvoiceService = invoices

    override fun licenses(): LicenseService = licenses

    override fun licenseKeys(): LicenseKeyService = licenseKeys

    override fun licenseKeyInstances(): LicenseKeyInstanceService = licenseKeyInstances

    override fun customers(): CustomerService = customers

    override fun refunds(): RefundService = refunds

    override fun disputes(): DisputeService = disputes

    override fun payouts(): PayoutService = payouts

    override fun webhookEvents(): WebhookEventService = webhookEvents

    override fun products(): ProductService = products

    override fun misc(): MiscService = misc

    override fun discounts(): DiscountService = discounts

    override fun close() = clientOptions.httpClient.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DodoPaymentsClient.WithRawResponse {

        private val payments: PaymentService.WithRawResponse by lazy {
            PaymentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val subscriptions: SubscriptionService.WithRawResponse by lazy {
            SubscriptionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val invoices: InvoiceService.WithRawResponse by lazy {
            InvoiceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val licenses: LicenseService.WithRawResponse by lazy {
            LicenseServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val licenseKeys: LicenseKeyService.WithRawResponse by lazy {
            LicenseKeyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val licenseKeyInstances: LicenseKeyInstanceService.WithRawResponse by lazy {
            LicenseKeyInstanceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val customers: CustomerService.WithRawResponse by lazy {
            CustomerServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val refunds: RefundService.WithRawResponse by lazy {
            RefundServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val disputes: DisputeService.WithRawResponse by lazy {
            DisputeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val payouts: PayoutService.WithRawResponse by lazy {
            PayoutServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val webhookEvents: WebhookEventService.WithRawResponse by lazy {
            WebhookEventServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val products: ProductService.WithRawResponse by lazy {
            ProductServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val misc: MiscService.WithRawResponse by lazy {
            MiscServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val discounts: DiscountService.WithRawResponse by lazy {
            DiscountServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun payments(): PaymentService.WithRawResponse = payments

        override fun subscriptions(): SubscriptionService.WithRawResponse = subscriptions

        override fun invoices(): InvoiceService.WithRawResponse = invoices

        override fun licenses(): LicenseService.WithRawResponse = licenses

        override fun licenseKeys(): LicenseKeyService.WithRawResponse = licenseKeys

        override fun licenseKeyInstances(): LicenseKeyInstanceService.WithRawResponse =
            licenseKeyInstances

        override fun customers(): CustomerService.WithRawResponse = customers

        override fun refunds(): RefundService.WithRawResponse = refunds

        override fun disputes(): DisputeService.WithRawResponse = disputes

        override fun payouts(): PayoutService.WithRawResponse = payouts

        override fun webhookEvents(): WebhookEventService.WithRawResponse = webhookEvents

        override fun products(): ProductService.WithRawResponse = products

        override fun misc(): MiscService.WithRawResponse = misc

        override fun discounts(): DiscountService.WithRawResponse = discounts
    }
}
