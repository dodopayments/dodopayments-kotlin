package com.dodopayments.api.errors

import com.dodopayments.api.core.http.Headers

class UnexpectedStatusCodeException(
    statusCode: Int,
    headers: Headers,
    body: String,
    error: DodoPaymentsError,
) : DodoPaymentsServiceException(statusCode, headers, body, error)
