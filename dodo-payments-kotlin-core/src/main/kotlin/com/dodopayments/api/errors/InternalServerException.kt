package com.dodopayments.api.errors

import com.dodopayments.api.core.http.Headers

class InternalServerException(
    statusCode: Int,
    headers: Headers,
    body: String,
    error: DodoPaymentsError,
) : DodoPaymentsServiceException(statusCode, headers, body, error)
