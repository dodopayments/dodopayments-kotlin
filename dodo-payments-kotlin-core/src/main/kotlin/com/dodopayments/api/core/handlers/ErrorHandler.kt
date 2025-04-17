@file:JvmName("ErrorHandler")

package com.dodopayments.api.core.handlers

import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponse.Handler
import com.dodopayments.api.errors.BadRequestException
import com.dodopayments.api.errors.DodoPaymentsError
import com.dodopayments.api.errors.InternalServerException
import com.dodopayments.api.errors.NotFoundException
import com.dodopayments.api.errors.PermissionDeniedException
import com.dodopayments.api.errors.RateLimitException
import com.dodopayments.api.errors.UnauthorizedException
import com.dodopayments.api.errors.UnexpectedStatusCodeException
import com.dodopayments.api.errors.UnprocessableEntityException
import com.fasterxml.jackson.databind.json.JsonMapper
import java.io.ByteArrayInputStream
import java.io.InputStream

internal fun errorHandler(jsonMapper: JsonMapper): Handler<DodoPaymentsError> {
    val handler = jsonHandler<DodoPaymentsError>(jsonMapper)

    return object : Handler<DodoPaymentsError> {
        override fun handle(response: HttpResponse): DodoPaymentsError =
            try {
                handler.handle(response)
            } catch (e: Exception) {
                DodoPaymentsError.builder().build()
            }
    }
}

internal fun <T> Handler<T>.withErrorHandler(errorHandler: Handler<DodoPaymentsError>): Handler<T> =
    object : Handler<T> {
        override fun handle(response: HttpResponse): T {
            when (val statusCode = response.statusCode()) {
                in 200..299 -> {
                    return this@withErrorHandler.handle(response)
                }
                400 -> {
                    val buffered = response.buffered()
                    throw BadRequestException(
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                401 -> {
                    val buffered = response.buffered()
                    throw UnauthorizedException(
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                403 -> {
                    val buffered = response.buffered()
                    throw PermissionDeniedException(
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                404 -> {
                    val buffered = response.buffered()
                    throw NotFoundException(
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                422 -> {
                    val buffered = response.buffered()
                    throw UnprocessableEntityException(
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                429 -> {
                    val buffered = response.buffered()
                    throw RateLimitException(
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                in 500..599 -> {
                    val buffered = response.buffered()
                    throw InternalServerException(
                        statusCode,
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                else -> {
                    val buffered = response.buffered()
                    throw UnexpectedStatusCodeException(
                        statusCode,
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
            }
        }
    }

private fun HttpResponse.buffered(): HttpResponse {
    val body = body().readBytes()

    return object : HttpResponse {
        override fun statusCode(): Int = this@buffered.statusCode()

        override fun headers(): Headers = this@buffered.headers()

        override fun body(): InputStream = ByteArrayInputStream(body)

        override fun close() = this@buffered.close()
    }
}
