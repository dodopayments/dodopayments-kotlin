package com.dodopayments.api.errors

import com.dodopayments.api.core.http.Headers

class RateLimitException(headers: Headers, body: String, error: DodoPaymentsError) :
    DodoPaymentsServiceException(429, headers, body, error)
