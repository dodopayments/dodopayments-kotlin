package com.dodopayments.api.errors

import com.dodopayments.api.core.http.Headers

abstract class DodoPaymentsServiceException(
    private val statusCode: Int,
    private val headers: Headers,
    private val body: String,
    private val error: DodoPaymentsError,
    message: String = "$statusCode: $error",
    cause: Throwable? = null,
) : DodoPaymentsException(message, cause) {

    fun statusCode(): Int = statusCode

    fun headers(): Headers = headers

    fun body(): String = body

    fun error(): DodoPaymentsError = error
}
