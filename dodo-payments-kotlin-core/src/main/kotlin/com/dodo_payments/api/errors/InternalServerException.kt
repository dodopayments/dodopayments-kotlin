package com.dodo_payments.api.errors

import com.dodo_payments.api.core.http.Headers

class InternalServerException(
    statusCode: Int,
    headers: Headers,
    body: String,
    error: DodoPaymentsError,
) : DodoPaymentsServiceException(statusCode, headers, body, error)
