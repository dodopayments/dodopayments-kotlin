// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.core

import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.core.http.HttpClient
import com.dodopayments.api.core.http.LoggingHttpClient
import com.dodopayments.api.core.http.PhantomReachableClosingHttpClient
import com.dodopayments.api.core.http.QueryParams
import com.dodopayments.api.core.http.RetryingHttpClient
import com.fasterxml.jackson.databind.json.JsonMapper
import java.time.Clock
import java.time.Duration

/** A class representing the SDK client configuration. */
class ClientOptions
private constructor(
    private val originalHttpClient: HttpClient,
    /**
     * The HTTP client to use in the SDK.
     *
     * Use the one published in `dodo-payments-kotlin-client-okhttp` or implement your own.
     *
     * This class takes ownership of the client and closes it when closed.
     */
    val httpClient: HttpClient,
    /**
     * Whether to throw an exception if any of the Jackson versions detected at runtime are
     * incompatible with the SDK's minimum supported Jackson version (2.13.4).
     *
     * Defaults to true. Use extreme caution when disabling this option. There is no guarantee that
     * the SDK will work correctly when using an incompatible Jackson version.
     */
    val checkJacksonVersionCompatibility: Boolean,
    /**
     * The Jackson JSON mapper to use for serializing and deserializing JSON.
     *
     * Defaults to [com.dodopayments.api.core.jsonMapper]. The default is usually sufficient and
     * rarely needs to be overridden.
     */
    val jsonMapper: JsonMapper,
    /**
     * The interface to use for delaying execution, like during retries.
     *
     * This is primarily useful for using fake delays in tests.
     *
     * Defaults to real execution delays.
     *
     * This class takes ownership of the sleeper and closes it when closed.
     */
    val sleeper: Sleeper,
    /**
     * The clock to use for operations that require timing, like retries.
     *
     * This is primarily useful for using a fake clock in tests.
     *
     * Defaults to [Clock.systemUTC].
     */
    val clock: Clock,
    private val baseUrl: String?,
    /** Headers to send with the request. */
    val headers: Headers,
    /** Query params to send with the request. */
    val queryParams: QueryParams,
    /**
     * Whether to call `validate` on every response before returning it.
     *
     * Setting this to `true` is _not_ forwards compatible with new types from the API for existing
     * fields.
     *
     * Defaults to false, which means the shape of the response will not be validated upfront.
     * Instead, validation will only occur for the parts of the response that are accessed.
     */
    val responseValidation: Boolean,
    /**
     * Sets the maximum time allowed for various parts of an HTTP call's lifecycle, excluding
     * retries.
     *
     * Defaults to [Timeout.default].
     */
    val timeout: Timeout,
    /**
     * The maximum number of times to retry failed requests, with a short exponential backoff
     * between requests.
     *
     * Only the following error types are retried:
     * - Connection errors (for example, due to a network connectivity problem)
     * - 408 Request Timeout
     * - 409 Conflict
     * - 429 Rate Limit
     * - 5xx Internal
     *
     * The API may also explicitly instruct the SDK to retry or not retry a request.
     *
     * Defaults to 2.
     */
    val maxRetries: Int,
    /**
     * The level at which to log request and response information.
     *
     * [fromEnv] will set the level from environment variables. See [LogLevel.fromEnv].
     *
     * Defaults to [LogLevel.fromEnv].
     */
    val logLevel: LogLevel,
    /** Bearer Token for API authentication */
    val bearerToken: String,
    val webhookKey: String?,
) {

    init {
        if (checkJacksonVersionCompatibility) {
            checkJacksonVersionCompatibility()
        }
    }

    /**
     * The base URL to use for every request.
     *
     * Defaults to the live_mode environment: `https://live.dodopayments.com`.
     *
     * The following other environments, with dedicated builder methods, are available:
     * - test_mode: `https://test.dodopayments.com`
     */
    fun baseUrl(): String = baseUrl ?: LIVE_MODE_URL

    fun toBuilder() = Builder().from(this)

    companion object {

        const val LIVE_MODE_URL = "https://live.dodopayments.com"

        const val TEST_MODE_URL = "https://test.dodopayments.com"

        /**
         * Returns a mutable builder for constructing an instance of [ClientOptions].
         *
         * The following fields are required:
         * ```kotlin
         * .httpClient()
         * .bearerToken()
         * ```
         */
        fun builder() = Builder()

        /**
         * Returns options configured using system properties and environment variables.
         *
         * @see Builder.fromEnv
         */
        fun fromEnv(): ClientOptions = builder().fromEnv().build()
    }

    /** A builder for [ClientOptions]. */
    class Builder internal constructor() {

        private var httpClient: HttpClient? = null
        private var checkJacksonVersionCompatibility: Boolean = true
        private var jsonMapper: JsonMapper = jsonMapper()
        private var sleeper: Sleeper? = null
        private var clock: Clock = Clock.systemUTC()
        private var baseUrl: String? = null
        private var headers: Headers.Builder = Headers.builder()
        private var queryParams: QueryParams.Builder = QueryParams.builder()
        private var responseValidation: Boolean = false
        private var timeout: Timeout = Timeout.default()
        private var maxRetries: Int = 2
        private var logLevel: LogLevel = LogLevel.fromEnv()
        private var bearerToken: String? = null
        private var webhookKey: String? = null

        internal fun from(clientOptions: ClientOptions) = apply {
            httpClient = clientOptions.originalHttpClient
            checkJacksonVersionCompatibility = clientOptions.checkJacksonVersionCompatibility
            jsonMapper = clientOptions.jsonMapper
            sleeper = clientOptions.sleeper
            clock = clientOptions.clock
            baseUrl = clientOptions.baseUrl
            headers = clientOptions.headers.toBuilder()
            queryParams = clientOptions.queryParams.toBuilder()
            responseValidation = clientOptions.responseValidation
            timeout = clientOptions.timeout
            maxRetries = clientOptions.maxRetries
            logLevel = clientOptions.logLevel
            bearerToken = clientOptions.bearerToken
            webhookKey = clientOptions.webhookKey
        }

        /**
         * The HTTP client to use in the SDK.
         *
         * Use the one published in `dodo-payments-kotlin-client-okhttp` or implement your own.
         *
         * This class takes ownership of the client and closes it when closed.
         */
        fun httpClient(httpClient: HttpClient) = apply {
            this.httpClient = PhantomReachableClosingHttpClient(httpClient)
        }

        /**
         * Whether to throw an exception if any of the Jackson versions detected at runtime are
         * incompatible with the SDK's minimum supported Jackson version (2.13.4).
         *
         * Defaults to true. Use extreme caution when disabling this option. There is no guarantee
         * that the SDK will work correctly when using an incompatible Jackson version.
         */
        fun checkJacksonVersionCompatibility(checkJacksonVersionCompatibility: Boolean) = apply {
            this.checkJacksonVersionCompatibility = checkJacksonVersionCompatibility
        }

        /**
         * The Jackson JSON mapper to use for serializing and deserializing JSON.
         *
         * Defaults to [com.dodopayments.api.core.jsonMapper]. The default is usually sufficient and
         * rarely needs to be overridden.
         */
        fun jsonMapper(jsonMapper: JsonMapper) = apply { this.jsonMapper = jsonMapper }

        /**
         * The interface to use for delaying execution, like during retries.
         *
         * This is primarily useful for using fake delays in tests.
         *
         * Defaults to real execution delays.
         *
         * This class takes ownership of the sleeper and closes it when closed.
         */
        fun sleeper(sleeper: Sleeper) = apply { this.sleeper = PhantomReachableSleeper(sleeper) }

        /**
         * The clock to use for operations that require timing, like retries.
         *
         * This is primarily useful for using a fake clock in tests.
         *
         * Defaults to [Clock.systemUTC].
         */
        fun clock(clock: Clock) = apply { this.clock = clock }

        /**
         * The base URL to use for every request.
         *
         * Defaults to the live_mode environment: `https://live.dodopayments.com`.
         *
         * The following other environments, with dedicated builder methods, are available:
         * - test_mode: `https://test.dodopayments.com`
         */
        fun baseUrl(baseUrl: String?) = apply { this.baseUrl = baseUrl }

        /** Sets [baseUrl] to `https://test.dodopayments.com`. */
        fun testMode() = baseUrl(TEST_MODE_URL)

        /**
         * Whether to call `validate` on every response before returning it.
         *
         * Setting this to `true` is _not_ forwards compatible with new types from the API for
         * existing fields.
         *
         * Defaults to false, which means the shape of the response will not be validated upfront.
         * Instead, validation will only occur for the parts of the response that are accessed.
         */
        fun responseValidation(responseValidation: Boolean) = apply {
            this.responseValidation = responseValidation
        }

        /**
         * Sets the maximum time allowed for various parts of an HTTP call's lifecycle, excluding
         * retries.
         *
         * Defaults to [Timeout.default].
         */
        fun timeout(timeout: Timeout) = apply { this.timeout = timeout }

        /**
         * Sets the maximum time allowed for a complete HTTP call, not including retries.
         *
         * See [Timeout.request] for more details.
         *
         * For fine-grained control, pass a [Timeout] object.
         */
        fun timeout(timeout: Duration) = timeout(Timeout.builder().request(timeout).build())

        /**
         * The maximum number of times to retry failed requests, with a short exponential backoff
         * between requests.
         *
         * Only the following error types are retried:
         * - Connection errors (for example, due to a network connectivity problem)
         * - 408 Request Timeout
         * - 409 Conflict
         * - 429 Rate Limit
         * - 5xx Internal
         *
         * The API may also explicitly instruct the SDK to retry or not retry a request.
         *
         * Defaults to 2.
         */
        fun maxRetries(maxRetries: Int) = apply { this.maxRetries = maxRetries }

        /**
         * The level at which to log request and response information.
         *
         * [fromEnv] will set the level from environment variables. See [LogLevel.fromEnv].
         *
         * Defaults to [LogLevel.fromEnv].
         */
        fun logLevel(logLevel: LogLevel) = apply { this.logLevel = logLevel }

        /** Bearer Token for API authentication */
        fun bearerToken(bearerToken: String) = apply { this.bearerToken = bearerToken }

        fun webhookKey(webhookKey: String?) = apply { this.webhookKey = webhookKey }

        fun headers(headers: Headers) = apply {
            this.headers.clear()
            putAllHeaders(headers)
        }

        fun headers(headers: Map<String, Iterable<String>>) = apply {
            this.headers.clear()
            putAllHeaders(headers)
        }

        fun putHeader(name: String, value: String) = apply { headers.put(name, value) }

        fun putHeaders(name: String, values: Iterable<String>) = apply { headers.put(name, values) }

        fun putAllHeaders(headers: Headers) = apply { this.headers.putAll(headers) }

        fun putAllHeaders(headers: Map<String, Iterable<String>>) = apply {
            this.headers.putAll(headers)
        }

        fun replaceHeaders(name: String, value: String) = apply { headers.replace(name, value) }

        fun replaceHeaders(name: String, values: Iterable<String>) = apply {
            headers.replace(name, values)
        }

        fun replaceAllHeaders(headers: Headers) = apply { this.headers.replaceAll(headers) }

        fun replaceAllHeaders(headers: Map<String, Iterable<String>>) = apply {
            this.headers.replaceAll(headers)
        }

        fun removeHeaders(name: String) = apply { headers.remove(name) }

        fun removeAllHeaders(names: Set<String>) = apply { headers.removeAll(names) }

        fun queryParams(queryParams: QueryParams) = apply {
            this.queryParams.clear()
            putAllQueryParams(queryParams)
        }

        fun queryParams(queryParams: Map<String, Iterable<String>>) = apply {
            this.queryParams.clear()
            putAllQueryParams(queryParams)
        }

        fun putQueryParam(key: String, value: String) = apply { queryParams.put(key, value) }

        fun putQueryParams(key: String, values: Iterable<String>) = apply {
            queryParams.put(key, values)
        }

        fun putAllQueryParams(queryParams: QueryParams) = apply {
            this.queryParams.putAll(queryParams)
        }

        fun putAllQueryParams(queryParams: Map<String, Iterable<String>>) = apply {
            this.queryParams.putAll(queryParams)
        }

        fun replaceQueryParams(key: String, value: String) = apply {
            queryParams.replace(key, value)
        }

        fun replaceQueryParams(key: String, values: Iterable<String>) = apply {
            queryParams.replace(key, values)
        }

        fun replaceAllQueryParams(queryParams: QueryParams) = apply {
            this.queryParams.replaceAll(queryParams)
        }

        fun replaceAllQueryParams(queryParams: Map<String, Iterable<String>>) = apply {
            this.queryParams.replaceAll(queryParams)
        }

        fun removeQueryParams(key: String) = apply { queryParams.remove(key) }

        fun removeAllQueryParams(keys: Set<String>) = apply { queryParams.removeAll(keys) }

        fun timeout(): Timeout = timeout

        /**
         * Updates configuration using system properties and environment variables.
         *
         * See this table for the available options:
         *
         * |Setter       |System property          |Environment variable       |Required|Default value                    |
         * |-------------|-------------------------|---------------------------|--------|---------------------------------|
         * |`bearerToken`|`dodopayments.apiKey`    |`DODO_PAYMENTS_API_KEY`    |true    |-                                |
         * |`webhookKey` |`dodopayments.webhookKey`|`DODO_PAYMENTS_WEBHOOK_KEY`|false   |-                                |
         * |`baseUrl`    |`dodopayments.baseUrl`   |`DODO_PAYMENTS_BASE_URL`   |true    |`"https://live.dodopayments.com"`|
         *
         * System properties take precedence over environment variables.
         */
        fun fromEnv() = apply {
            logLevel(LogLevel.fromEnv())
            (System.getProperty("dodopayments.baseUrl") ?: System.getenv("DODO_PAYMENTS_BASE_URL"))
                ?.let { baseUrl(it) }
            (System.getProperty("dodopayments.apiKey") ?: System.getenv("DODO_PAYMENTS_API_KEY"))
                ?.let { bearerToken(it) }
            (System.getProperty("dodopayments.webhookKey")
                    ?: System.getenv("DODO_PAYMENTS_WEBHOOK_KEY"))
                ?.let { webhookKey(it) }
            System.getenv("DODO_PAYMENTS_CUSTOM_HEADERS")?.let { customHeadersEnv ->
                for (line in customHeadersEnv.split("\n")) {
                    val colon = line.indexOf(':')
                    if (colon >= 0) {
                        putHeader(line.substring(0, colon).trim(), line.substring(colon + 1).trim())
                    }
                }
            }
        }

        /**
         * Returns an immutable instance of [ClientOptions].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .httpClient()
         * .bearerToken()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ClientOptions {
            val httpClient = checkRequired("httpClient", httpClient)
            val sleeper = sleeper ?: PhantomReachableSleeper(DefaultSleeper())
            val bearerToken = checkRequired("bearerToken", bearerToken)

            val headers = Headers.builder()
            val queryParams = QueryParams.builder()
            headers.put("X-Stainless-Lang", "kotlin")
            headers.put("X-Stainless-Arch", getOsArch())
            headers.put("X-Stainless-OS", getOsName())
            headers.put("X-Stainless-OS-Version", getOsVersion())
            headers.put("X-Stainless-Package-Version", getPackageVersion())
            headers.put("X-Stainless-Runtime", "JRE")
            headers.put("X-Stainless-Runtime-Version", getJavaVersion())
            headers.put("X-Stainless-Kotlin-Version", KotlinVersion.CURRENT.toString())
            // We replace after all the default headers to allow end-users to overwrite them.
            headers.replaceAll(this.headers.build())
            queryParams.replaceAll(this.queryParams.build())
            bearerToken.let {
                if (!it.isEmpty()) {
                    headers.replace("Authorization", "Bearer $it")
                }
            }

            return ClientOptions(
                httpClient,
                RetryingHttpClient.builder()
                    .httpClient(
                        LoggingHttpClient.builder()
                            .httpClient(httpClient)
                            .clock(clock)
                            .level(logLevel)
                            .build()
                    )
                    .sleeper(sleeper)
                    .clock(clock)
                    .maxRetries(maxRetries)
                    .build(),
                checkJacksonVersionCompatibility,
                jsonMapper,
                sleeper,
                clock,
                baseUrl,
                headers.build(),
                queryParams.build(),
                responseValidation,
                timeout,
                maxRetries,
                logLevel,
                bearerToken,
                webhookKey,
            )
        }
    }

    /**
     * Closes these client options, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client options are
     * long-lived and usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default client automatically
     * releases threads and connections if they remain idle, but if you are writing an application
     * that needs to aggressively release unused resources, then you may call this method.
     */
    fun close() {
        httpClient.close()
        sleeper.close()
    }
}
