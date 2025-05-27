// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.client

import com.dodopayments.api.services.async.AddonServiceAsync
import com.dodopayments.api.services.async.BrandServiceAsync
import com.dodopayments.api.services.async.CustomerServiceAsync
import com.dodopayments.api.services.async.DiscountServiceAsync
import com.dodopayments.api.services.async.DisputeServiceAsync
import com.dodopayments.api.services.async.InvoiceServiceAsync
import com.dodopayments.api.services.async.LicenseKeyInstanceServiceAsync
import com.dodopayments.api.services.async.LicenseKeyServiceAsync
import com.dodopayments.api.services.async.LicenseServiceAsync
import com.dodopayments.api.services.async.MiscServiceAsync
import com.dodopayments.api.services.async.PaymentServiceAsync
import com.dodopayments.api.services.async.PayoutServiceAsync
import com.dodopayments.api.services.async.ProductServiceAsync
import com.dodopayments.api.services.async.RefundServiceAsync
import com.dodopayments.api.services.async.SubscriptionServiceAsync
import com.dodopayments.api.services.async.WebhookEventServiceAsync

/**
 * A client for interacting with the Dodo Payments REST API asynchronously. You can also switch to
 * synchronous execution via the [sync] method.
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
interface DodoPaymentsClientAsync {

    /**
     * Returns a version of this client that uses synchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun sync(): DodoPaymentsClient

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun payments(): PaymentServiceAsync

    fun subscriptions(): SubscriptionServiceAsync

    fun invoices(): InvoiceServiceAsync

    fun licenses(): LicenseServiceAsync

    fun licenseKeys(): LicenseKeyServiceAsync

    fun licenseKeyInstances(): LicenseKeyInstanceServiceAsync

    fun customers(): CustomerServiceAsync

    fun refunds(): RefundServiceAsync

    fun disputes(): DisputeServiceAsync

    fun payouts(): PayoutServiceAsync

    fun webhookEvents(): WebhookEventServiceAsync

    fun products(): ProductServiceAsync

    fun misc(): MiscServiceAsync

    fun discounts(): DiscountServiceAsync

    fun addons(): AddonServiceAsync

    fun brands(): BrandServiceAsync

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
     * A view of [DodoPaymentsClientAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        fun payments(): PaymentServiceAsync.WithRawResponse

        fun subscriptions(): SubscriptionServiceAsync.WithRawResponse

        fun invoices(): InvoiceServiceAsync.WithRawResponse

        fun licenses(): LicenseServiceAsync.WithRawResponse

        fun licenseKeys(): LicenseKeyServiceAsync.WithRawResponse

        fun licenseKeyInstances(): LicenseKeyInstanceServiceAsync.WithRawResponse

        fun customers(): CustomerServiceAsync.WithRawResponse

        fun refunds(): RefundServiceAsync.WithRawResponse

        fun disputes(): DisputeServiceAsync.WithRawResponse

        fun payouts(): PayoutServiceAsync.WithRawResponse

        fun webhookEvents(): WebhookEventServiceAsync.WithRawResponse

        fun products(): ProductServiceAsync.WithRawResponse

        fun misc(): MiscServiceAsync.WithRawResponse

        fun discounts(): DiscountServiceAsync.WithRawResponse

        fun addons(): AddonServiceAsync.WithRawResponse

        fun brands(): BrandServiceAsync.WithRawResponse
    }
}
