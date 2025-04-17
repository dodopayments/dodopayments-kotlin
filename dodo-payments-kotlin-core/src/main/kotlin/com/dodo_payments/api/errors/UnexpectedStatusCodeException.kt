package com.dodo_payments.api.errors

import com.dodo_payments.api.core.http.Headers

class UnexpectedStatusCodeException(
    statusCode: Int,
    headers: Headers,
    body: String,
    error: DodoPaymentsError,
) : DodoPaymentsServiceException(statusCode, headers, body, error)
