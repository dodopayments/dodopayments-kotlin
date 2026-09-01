// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.client

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.getPackageVersion
import com.dodopayments.api.services.blocking.AddonService
import com.dodopayments.api.services.blocking.AddonServiceImpl
import com.dodopayments.api.services.blocking.BalanceService
import com.dodopayments.api.services.blocking.BalanceServiceImpl
import com.dodopayments.api.services.blocking.BlocklistService
import com.dodopayments.api.services.blocking.BlocklistServiceImpl
import com.dodopayments.api.services.blocking.BrandService
import com.dodopayments.api.services.blocking.BrandServiceImpl
import com.dodopayments.api.services.blocking.CheckoutSessionService
import com.dodopayments.api.services.blocking.CheckoutSessionServiceImpl
import com.dodopayments.api.services.blocking.CreditEntitlementService
import com.dodopayments.api.services.blocking.CreditEntitlementServiceImpl
import com.dodopayments.api.services.blocking.CustomerService
import com.dodopayments.api.services.blocking.CustomerServiceImpl
import com.dodopayments.api.services.blocking.DiscountService
import com.dodopayments.api.services.blocking.DiscountServiceImpl
import com.dodopayments.api.services.blocking.DisputeService
import com.dodopayments.api.services.blocking.DisputeServiceImpl
import com.dodopayments.api.services.blocking.EntitlementService
import com.dodopayments.api.services.blocking.EntitlementServiceImpl
import com.dodopayments.api.services.blocking.InvoiceService
import com.dodopayments.api.services.blocking.InvoiceServiceImpl
import com.dodopayments.api.services.blocking.LicenseKeyInstanceService
import com.dodopayments.api.services.blocking.LicenseKeyInstanceServiceImpl
import com.dodopayments.api.services.blocking.LicenseKeyService
import com.dodopayments.api.services.blocking.LicenseKeyServiceImpl
import com.dodopayments.api.services.blocking.LicenseService
import com.dodopayments.api.services.blocking.LicenseServiceImpl
import com.dodopayments.api.services.blocking.MeterService
import com.dodopayments.api.services.blocking.MeterServiceImpl
import com.dodopayments.api.services.blocking.MiscService
import com.dodopayments.api.services.blocking.MiscServiceImpl
import com.dodopayments.api.services.blocking.PaymentService
import com.dodopayments.api.services.blocking.PaymentServiceImpl
import com.dodopayments.api.services.blocking.PayoutService
import com.dodopayments.api.services.blocking.PayoutServiceImpl
import com.dodopayments.api.services.blocking.ProductCollectionService
import com.dodopayments.api.services.blocking.ProductCollectionServiceImpl
import com.dodopayments.api.services.blocking.ProductService
import com.dodopayments.api.services.blocking.ProductServiceImpl
import com.dodopayments.api.services.blocking.RefundService
import com.dodopayments.api.services.blocking.RefundServiceImpl
import com.dodopayments.api.services.blocking.SubscriptionService
import com.dodopayments.api.services.blocking.SubscriptionServiceImpl
import com.dodopayments.api.services.blocking.UsageEventService
import com.dodopayments.api.services.blocking.UsageEventServiceImpl
import com.dodopayments.api.services.blocking.WebhookEventService
import com.dodopayments.api.services.blocking.WebhookEventServiceImpl
import com.dodopayments.api.services.blocking.WebhookService
import com.dodopayments.api.services.blocking.WebhookServiceImpl

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

    private val checkoutSessions: CheckoutSessionService by lazy {
        CheckoutSessionServiceImpl(clientOptionsWithUserAgent)
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

    private val blocklist: BlocklistService by lazy {
        BlocklistServiceImpl(clientOptionsWithUserAgent)
    }

    private val refunds: RefundService by lazy { RefundServiceImpl(clientOptionsWithUserAgent) }

    private val disputes: DisputeService by lazy { DisputeServiceImpl(clientOptionsWithUserAgent) }

    private val payouts: PayoutService by lazy { PayoutServiceImpl(clientOptionsWithUserAgent) }

    private val products: ProductService by lazy { ProductServiceImpl(clientOptionsWithUserAgent) }

    private val misc: MiscService by lazy { MiscServiceImpl(clientOptionsWithUserAgent) }

    private val discounts: DiscountService by lazy {
        DiscountServiceImpl(clientOptionsWithUserAgent)
    }

    private val addons: AddonService by lazy { AddonServiceImpl(clientOptionsWithUserAgent) }

    private val brands: BrandService by lazy { BrandServiceImpl(clientOptionsWithUserAgent) }

    private val webhooks: WebhookService by lazy { WebhookServiceImpl(clientOptionsWithUserAgent) }

    private val webhookEvents: WebhookEventService by lazy {
        WebhookEventServiceImpl(clientOptionsWithUserAgent)
    }

    private val usageEvents: UsageEventService by lazy {
        UsageEventServiceImpl(clientOptionsWithUserAgent)
    }

    private val meters: MeterService by lazy { MeterServiceImpl(clientOptionsWithUserAgent) }

    private val balances: BalanceService by lazy { BalanceServiceImpl(clientOptionsWithUserAgent) }

    private val creditEntitlements: CreditEntitlementService by lazy {
        CreditEntitlementServiceImpl(clientOptionsWithUserAgent)
    }

    private val entitlements: EntitlementService by lazy {
        EntitlementServiceImpl(clientOptionsWithUserAgent)
    }

    private val productCollections: ProductCollectionService by lazy {
        ProductCollectionServiceImpl(clientOptionsWithUserAgent)
    }

    override fun async(): DodoPaymentsClientAsync = async

    override fun withRawResponse(): DodoPaymentsClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DodoPaymentsClient =
        DodoPaymentsClientImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun checkoutSessions(): CheckoutSessionService = checkoutSessions

    override fun payments(): PaymentService = payments

    override fun subscriptions(): SubscriptionService = subscriptions

    override fun invoices(): InvoiceService = invoices

    override fun licenses(): LicenseService = licenses

    override fun licenseKeys(): LicenseKeyService = licenseKeys

    override fun licenseKeyInstances(): LicenseKeyInstanceService = licenseKeyInstances

    override fun customers(): CustomerService = customers

    override fun blocklist(): BlocklistService = blocklist

    override fun refunds(): RefundService = refunds

    override fun disputes(): DisputeService = disputes

    override fun payouts(): PayoutService = payouts

    override fun products(): ProductService = products

    override fun misc(): MiscService = misc

    override fun discounts(): DiscountService = discounts

    override fun addons(): AddonService = addons

    override fun brands(): BrandService = brands

    override fun webhooks(): WebhookService = webhooks

    override fun webhookEvents(): WebhookEventService = webhookEvents

    override fun usageEvents(): UsageEventService = usageEvents

    override fun meters(): MeterService = meters

    override fun balances(): BalanceService = balances

    override fun creditEntitlements(): CreditEntitlementService = creditEntitlements

    override fun entitlements(): EntitlementService = entitlements

    override fun productCollections(): ProductCollectionService = productCollections

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DodoPaymentsClient.WithRawResponse {

        private val checkoutSessions: CheckoutSessionService.WithRawResponse by lazy {
            CheckoutSessionServiceImpl.WithRawResponseImpl(clientOptions)
        }

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

        private val blocklist: BlocklistService.WithRawResponse by lazy {
            BlocklistServiceImpl.WithRawResponseImpl(clientOptions)
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

        private val products: ProductService.WithRawResponse by lazy {
            ProductServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val misc: MiscService.WithRawResponse by lazy {
            MiscServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val discounts: DiscountService.WithRawResponse by lazy {
            DiscountServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val addons: AddonService.WithRawResponse by lazy {
            AddonServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val brands: BrandService.WithRawResponse by lazy {
            BrandServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val webhooks: WebhookService.WithRawResponse by lazy {
            WebhookServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val webhookEvents: WebhookEventService.WithRawResponse by lazy {
            WebhookEventServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val usageEvents: UsageEventService.WithRawResponse by lazy {
            UsageEventServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val meters: MeterService.WithRawResponse by lazy {
            MeterServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val balances: BalanceService.WithRawResponse by lazy {
            BalanceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val creditEntitlements: CreditEntitlementService.WithRawResponse by lazy {
            CreditEntitlementServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val entitlements: EntitlementService.WithRawResponse by lazy {
            EntitlementServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val productCollections: ProductCollectionService.WithRawResponse by lazy {
            ProductCollectionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DodoPaymentsClient.WithRawResponse =
            DodoPaymentsClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun checkoutSessions(): CheckoutSessionService.WithRawResponse = checkoutSessions

        override fun payments(): PaymentService.WithRawResponse = payments

        override fun subscriptions(): SubscriptionService.WithRawResponse = subscriptions

        override fun invoices(): InvoiceService.WithRawResponse = invoices

        override fun licenses(): LicenseService.WithRawResponse = licenses

        override fun licenseKeys(): LicenseKeyService.WithRawResponse = licenseKeys

        override fun licenseKeyInstances(): LicenseKeyInstanceService.WithRawResponse =
            licenseKeyInstances

        override fun customers(): CustomerService.WithRawResponse = customers

        override fun blocklist(): BlocklistService.WithRawResponse = blocklist

        override fun refunds(): RefundService.WithRawResponse = refunds

        override fun disputes(): DisputeService.WithRawResponse = disputes

        override fun payouts(): PayoutService.WithRawResponse = payouts

        override fun products(): ProductService.WithRawResponse = products

        override fun misc(): MiscService.WithRawResponse = misc

        override fun discounts(): DiscountService.WithRawResponse = discounts

        override fun addons(): AddonService.WithRawResponse = addons

        override fun brands(): BrandService.WithRawResponse = brands

        override fun webhooks(): WebhookService.WithRawResponse = webhooks

        override fun webhookEvents(): WebhookEventService.WithRawResponse = webhookEvents

        override fun usageEvents(): UsageEventService.WithRawResponse = usageEvents

        override fun meters(): MeterService.WithRawResponse = meters

        override fun balances(): BalanceService.WithRawResponse = balances

        override fun creditEntitlements(): CreditEntitlementService.WithRawResponse =
            creditEntitlements

        override fun entitlements(): EntitlementService.WithRawResponse = entitlements

        override fun productCollections(): ProductCollectionService.WithRawResponse =
            productCollections
    }
}
