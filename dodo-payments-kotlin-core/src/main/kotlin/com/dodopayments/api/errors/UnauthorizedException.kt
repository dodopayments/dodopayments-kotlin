package com.dodopayments.api.errors

import com.dodopayments.api.core.http.Headers

class UnauthorizedException(headers: Headers, body: String, error: DodoPaymentsError) :
    DodoPaymentsServiceException(401, headers, body, error)
