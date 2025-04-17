// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.client

import com.dodo_payments.api.services.blocking.CustomerService
import com.dodo_payments.api.services.blocking.DiscountService
import com.dodo_payments.api.services.blocking.DisputeService
import com.dodo_payments.api.services.blocking.InvoiceService
import com.dodo_payments.api.services.blocking.LicenseKeyInstanceService
import com.dodo_payments.api.services.blocking.LicenseKeyService
import com.dodo_payments.api.services.blocking.LicenseService
import com.dodo_payments.api.services.blocking.MiscService
import com.dodo_payments.api.services.blocking.PaymentService
import com.dodo_payments.api.services.blocking.PayoutService
import com.dodo_payments.api.services.blocking.ProductService
import com.dodo_payments.api.services.blocking.RefundService
import com.dodo_payments.api.services.blocking.SubscriptionService
import com.dodo_payments.api.services.blocking.WebhookEventService

/**
 * A client for interacting with the Dodo Payments REST API synchronously. You can also switch to
 * asynchronous execution via the [async] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface DodoPaymentsClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): DodoPaymentsClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun payments(): PaymentService

    fun subscriptions(): SubscriptionService

    fun invoices(): InvoiceService

    fun licenses(): LicenseService

    fun licenseKeys(): LicenseKeyService

    fun licenseKeyInstances(): LicenseKeyInstanceService

    fun customers(): CustomerService

    fun refunds(): RefundService

    fun disputes(): DisputeService

    fun payouts(): PayoutService

    fun webhookEvents(): WebhookEventService

    fun products(): ProductService

    fun misc(): MiscService

    fun discounts(): DiscountService

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()

    /**
     * A view of [DodoPaymentsClient] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun payments(): PaymentService.WithRawResponse

        fun subscriptions(): SubscriptionService.WithRawResponse

        fun invoices(): InvoiceService.WithRawResponse

        fun licenses(): LicenseService.WithRawResponse

        fun licenseKeys(): LicenseKeyService.WithRawResponse

        fun licenseKeyInstances(): LicenseKeyInstanceService.WithRawResponse

        fun customers(): CustomerService.WithRawResponse

        fun refunds(): RefundService.WithRawResponse

        fun disputes(): DisputeService.WithRawResponse

        fun payouts(): PayoutService.WithRawResponse

        fun webhookEvents(): WebhookEventService.WithRawResponse

        fun products(): ProductService.WithRawResponse

        fun misc(): MiscService.WithRawResponse

        fun discounts(): DiscountService.WithRawResponse
    }
}
