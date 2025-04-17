package com.dodo_payments.api.errors

import com.dodo_payments.api.core.http.Headers

class RateLimitException(headers: Headers, body: String, error: DodoPaymentsError) :
    DodoPaymentsServiceException(429, headers, body, error)
