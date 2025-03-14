package com.dodo_payments.api.core.http

import com.dodo_payments.api.core.RequestOptions
import com.dodo_payments.api.core.closeWhenPhantomReachable

/**
 * A delegating wrapper around an `HttpClient` that closes it once it's only phantom reachable.
 *
 * This class ensures the `HttpClient` is closed even if the user forgets to close it.
 */
internal class PhantomReachableClosingHttpClient(private val httpClient: HttpClient) : HttpClient {
    init {
        closeWhenPhantomReachable(this, httpClient)
    }

    override fun execute(request: HttpRequest, requestOptions: RequestOptions): HttpResponse =
        httpClient.execute(request, requestOptions)

    override suspend fun executeAsync(
        request: HttpRequest,
        requestOptions: RequestOptions,
    ): HttpResponse = httpClient.executeAsync(request, requestOptions)

    override fun close() = httpClient.close()
}
